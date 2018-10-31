
public class MainStackDouble {

	public static void main(String[] args) {
		StackDouble nurmila =new StackDouble();
		nurmila.push(6.4);
		nurmila.cetak();
		nurmila.push(6.4);
		
		nurmila.cetak();
		
		double d0=nurmila.pop();
		System.out.println(d0);
		double d1=nurmila.pop();
		System.out.println(d1);
		nurmila.cetak();
		double d2=nurmila.pop();
		System.out.println("bye");
	}

}
