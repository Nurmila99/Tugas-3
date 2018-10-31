import java.util.Stack;


public class MainStackString {

public static void main(String[] args) {
StackString nurmila = new StackString();
		
	nurmila.push(" saya ");
    nurmila.push("bukan");
	nurmila.push("kaleng");
	nurmila.push("kaleng");
		
		String d0=nurmila.pop();
		System.out.println(d0);
		nurmila.cetak();
		
						
	}

}
