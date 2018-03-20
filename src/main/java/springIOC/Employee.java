package springIOC;

public class Employee {

    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void getEmplyeeName(){
        System.out.println("name"+name);
    }
}
