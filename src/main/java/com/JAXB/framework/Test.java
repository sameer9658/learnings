package com.JAXB.framework;

import java.io.*;

/**

 * @author Biplab Ray

 *

 */

public class Test {

    /**

     * @param args

     */

    public static void main(String[] args) throws IOException {

        // TODO Auto-generated method stub



        Root root = new Root();

        root.setString_FirstName("Samir");

        root.setString_LastName("Ray");

        Child child = new Child();

        child.setString_Country("India");

        child.setString_PINCODE("700059");

        child.setString_State("700059");

        child.setString_StreetName("Raghnunath Pur");

        root.setChild(child);



        /**

         * Now converting Java object into XML

         * */

        String stringXMLObject = JaxBUtil.jaxbMarshalConvertJavaObjectToXMLTree(root, Root.class);



        /**

         * Output would be like below

         * <Root>

         * <string_FirstName>Biplab</string_FirstName>

         * <string_LastName>Ray</string_LastName>

         * <child>

         * <string_StreetName>Raghnunath Pur</string_StreetName>

         * <string_PINCODE>700059</string_PINCODE>

         * <string_State>West Bengal</string_State>

         * <string_Country>India</string_Country>

         * </child>

         * </Root>

         * */



        System.out.println(stringXMLObject);







        /**

         * Now Convert the XML object into Java object

         * And do the modification in the address parameters

         * And then again convert the java object into XML

         * */

     File file = new File("xmltobeparsed.xml");
        FileReader fileReader = new FileReader(file);
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line = bufferedReader.readLine())!=null){
            stringBuilder = stringBuilder.append(line);
        }


        Root rootJavaObject = (Root)JaxBUtil.jaxbUNMarshalConvertXMLTreeToJavaObject(stringBuilder.toString(), Root.class);



        Child child2 = rootJavaObject.getChild();

        child2.setString_PINCODE("700156");

        rootJavaObject.setChild(child2);

        Beer beer = rootJavaObject.getBeer();
        System.out.println("beer"+beer);



        String string_AfterModificationOfAddressPinCode = JaxBUtil.jaxbMarshalConvertJavaObjectToXMLTree(rootJavaObject, Root.class);



        /**

         * Output would be like below

         * <Root>

         * <string_FirstName>Biplab</string_FirstName>

         * <string_LastName>Ray</string_LastName>

         * <child>

         * <string_StreetName>Raghnunath Pur</string_StreetName>

         * <string_PINCODE>700156</string_PINCODE>

         * <string_State>West Bengal</string_State>

         * <string_Country>India</string_Country>

         * </child>

         * </Root>

         * */



        System.out.println(string_AfterModificationOfAddressPinCode);



    }

}
