import java.util.*;
class Consumer{
    static String consumer_name;
    static String consumer_connection;
    static int prev_month;
    static int next_month;
    static int calc(){
            int month = next_month - prev_month;
            int interest;
            if(month < 100){
                interest = 1 * month;
                return interest;
            }
            else if(month > 100 && month < 200){
                interest = 100 + (month - 100) * 2;
                return interest;
            }
            else if(month > 200 && month < 500){
                interest = 100 + 250 + (month - 200) * 4;
                return interest;
            }
            else{
                interest = 100 + 250 + 1200 + (month - 500) * 6;
                return interest;
            }

    }
}
public class Akash{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Consumer cons = new Consumer();
        System.out.println("Enter name: ");
        cons.consumer_connection = scan.nextLine();
        System.out.println("Enter connection:");
        cons.consumer_name = "D";
        System.out.println("Enter next month bill: ");
        cons.next_month = scan.nextInt();
        System.out.println("Enter prev month bill: ");
        cons.prev_month = scan.nextInt();
        int hello = cons.calc();
        System.out.println(hello);
    }
}