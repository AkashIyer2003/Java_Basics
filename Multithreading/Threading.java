import java.util.Random;
class Even implements Runnable{
    public int a;
    public Even(int a) {
    this.a=a;
}
    public void run(){
        System.out.println("no."+a+"is even and the square is"+a*a);
    }
}
class Odd implements Runnable{
    public int b;
    public Odd(int b)
    {
        this.b=b;
    }
    public void run(){
        System.out.println("no."+b+" is odd and the cube is"+b*b*b);
    }
}
class Generate extends Thread
{
    public void run(){
        Random r= new Random();
        try{
                for(int i=0;i<5;i++){
                int x=r.nextInt();
                if(x%2==0){
                    Even e=new Even(x);
                    Thread t2=new Thread(e);
                    t2.start();
                }
                else{
                    Odd o=new Odd(x);
                    Thread t3=new Thread(o);
                    t3.start();
                }
                Thread.sleep(1000);
                }
            }
            catch(Exception ex){
                System.out.println(ex);
            }
        }
        
}
public class Threading{
    public static void main(String[] args) {
       Generate g= new Generate();
        g.start();
    }
}
