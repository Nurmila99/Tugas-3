import java.util.ArrayList;


public class StackDouble {
	ArrayList<Double> u =new ArrayList<Double>();
	public int nurmila = -1;
	
		public void push(Double value){
			nurmila++;
			u.add(nurmila,value);
		}
		
			public double pop() {
				double value=nurmila;
			if (nurmila>-1){				
				value = u.get(nurmila);
				u.remove(nurmila);
				nurmila--;
			}
			return value;
			}
			public void cetak(){
				System.out.println(u.toString());
			}
}
