import java.sql.*;


public class DBTesting {

    public static void main(String args[]){
        try{
            NotificationAdditionalVO notificationAdditionalVO;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con= DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:ORMETB","ORMETB","password");
            Statement stmt=con.createStatement();

            CallableStatement callableStatement = con.prepareCall("call PKG_GFT_COM_NOTIF.FETCH_COM_NOTIF_GFT(?,?,?,?)");
            callableStatement.setString(1,null);
            callableStatement.setString(2,null);
            callableStatement.registerOutParameter(3,Types.CLOB);
            callableStatement.registerOutParameter(4,Types.CLOB);
            callableStatement.execute();
           System.out.println(callableStatement.execute());
               if(callableStatement.getString(3) !=null && callableStatement.getString(4) != null){

                   notificationAdditionalVO = new NotificationAdditionalVO();
                   notificationAdditionalVO.setNotificationXML(callableStatement.getString(3));
                   notificationAdditionalVO.setGftXML(callableStatement.getString(4));
                   System.out.println(notificationAdditionalVO);
               }
            /*if(callableStatement.execute()){
                 notificationAdditionalVO = new NotificationAdditionalVO();
                notificationAdditionalVO.setNotificationXML(callableStatement.getString(3));
                notificationAdditionalVO.setGftXML(callableStatement.getString(4));
                System.out.println("notificationAdditionalVO");
                System.out.println(notificationAdditionalVO);
            }*/
            /*System.out.println("COMNOTIF"+callableStatement.getString(3));
            System.out.println("GFT"+callableStatement.getString(4));*/


        }catch(Exception e){ e.printStackTrace();}

    }
}
