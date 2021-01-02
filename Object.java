package employee;
import java.util.*;
public class Employee { 
    private String name;
    private int YOJ;
    private String address;
       Employee(String str ,int n,String s){
         name=str;
         YOJ=n;
         address=s;
        }
       public String getname(){
       return name;
       }
       public void setname(){
           this.name=name;
       }
       public int getYOJ(){
           return YOJ;
       }
       public void setYOJ(){
           this.YOJ=YOJ;
       }
       public String getaddress(){
           return address;
       }
       public void setaddress(){
           this.address=address;
       }
    public static void main(String[] args) {
        System.out.println("NAME\t\t\tYEAR OF JOINING\t\t\tADDRESS\t\t\t");
       Employee o=new Employee("Robert",1994,"64C Wallstreet");
       System.out.println(o.getname()+"\t\t\t"+o.getYOJ()+"\t\t\t"+o.getaddress());
       Employee obj=new Employee("Sam ",2000,"68D Wallstreet");
       System.out.println(obj.getname()+"\t\t\t"+obj.getYOJ()+"\t\t\t"+obj.getaddress());
      Employee object=new Employee("John ",1999,"26B Wallstreet");
      System.out.println(object.getname()+"\t\t\t"+object.getYOJ()+"\t\t\t"+object.getaddress());
    }
}
