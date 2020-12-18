import java.util.*;
public class Minutes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int minutes=sc.nextInt();
        int year=minutes/525600;
        int remainingtime=minutes%525600;
        int day=remainingtime/1440;
        System.out.print(minutes + " minutes is approximately " + year + " years " + day + " days ");
    }
    
}