class greater<T>{
	static <T extends Comparable<T>>boolean great(T obj,T obj2){
		if(obj.compareTo(obj2) > 0){
			System.out.println(obj);
		}
		else{
			System.out.println(obj2);
		}
	return true;
}
}
public class gen{
	public static void main(String[] args){
		greater g1 = new greater();
		greater g2 = new greater();
		g1.great("Hello","Wassup");
		g2.great(5,6);
}
}
		
	
