import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args ) {
        Scanner myobj = new Scanner(System.in);

        int class1, class2, class3, class4;
        int studentnum;
        int finalnum;

        studentnum = myobj.nextInt();
        
        for(int i=0; i<=studentnum; i++) {
            System.out.print("No of students in first class: ");
            class1 = myobj.nextInt();

            System.out.print("No of students in second class: ");
            class2 = myobj.nextInt();

            System.out.print("No of students in third class: ");
            class3 = myobj.nextInt();

            System.out.print("No of students in fourth class: ");
            class4 = myobj.nextInt();

            finalnum = (class1 + class2 + class3 + class4)/4;

            if(finalnum>75) 
                System.out.println("There are many students in school");

            else if (finalnum>50)
                System.out.println("There are large number of students in school");

            else if (finalnum>25)
                System.out.println("There are medium number of students in school");

            else
                System.out.println("There are less students in school");
            
        }
        myobj.close();
    }
}        
