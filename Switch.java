import java.util.*;
public class Switch {
    public static void main(String[] args) {
        int choice;
        System.out.println("choose one : 1.hi\t2.hey\t3.hello\t");
        Scanner sc=new Scanner(System.in);
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:System.out.println("HI");
            break;
            case 2:System.out.println("HEY");
            break;
            case 3:System.out.println("HELLO");
            break;
        }
       }
    
}
