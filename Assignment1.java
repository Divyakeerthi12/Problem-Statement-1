
import java.util.*;
public class Assignment1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String msg="\0";
        String studentname;
        Integer studentage;
        String studentbloodgroup;
        System.out.println("Enter the Student name, Student age and Student Blood group ");
        studentname=sc.nextLine();

        studentage=Integer.parseInt(sc.nextLine());
        studentbloodgroup =sc.nextLine();
        sc.close();
        if(studentage>=20)
        {
            msg= "Your group is RED";
        }
        else if(studentage>=15 && studentage<20){
            msg="Your group is BLUE";
        }
        else if(studentage>=10 && studentage<15)
        {
            msg="Your group is YELLOW";
        }
        //Final output
        System.out.println("---------------------------------");
        System.out.println("Name:"+studentname+"\n"+"Age:"+studentage+"\n"+
                "Blood Group:"+studentbloodgroup+"\n");
        System.out.println("----------------------------------");
        System.out.println(msg);
        System.out.println("-----------------------------------");




    }
}
