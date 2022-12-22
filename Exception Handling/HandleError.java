import java.util.Random;
class HandleError {
  public static void main(String args[]) {
    int a[] = {4};
      try {
        a[31] = 51;
	System.out.println(a);
      } catch (Exception e) {
      System.out.println("exception: " + e);
	}    
} 
}
