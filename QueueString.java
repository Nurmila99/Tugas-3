	import java.util.ArrayList;

	public class QueueString {
		ArrayList<String> Panda = new ArrayList<String>();
		int Nurmila = -1;

		public void insert(String value) {
			Nurmila++;
			Panda.add(Nurmila,value);
		}
		public String get() {
			String value = "Bukangkalengkaleng";
			if(Nurmila>-1) {
				value = Panda.get(0);
				Panda.remove(0);
				Nurmila--;
			}
			return value;
			
		}
		public void cetak() {
			System.out.println("STEP : "+Nurmila+" > KELAS: "+Panda.toString());
		}
	}


