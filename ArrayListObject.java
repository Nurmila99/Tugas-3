import java.util.ArrayList;


public class ArrayListObject {

		ArrayList<Mahasiswa> data;
		
	public ArrayListObject(){
		data = new ArrayList<Mahasiswa>();
	}
	public void IsiData(String nama, String nim, char kelas, String alamat){
		data.add(new Mahasiswa(nama,nim,kelas,alamat));
	}
	
	public static void main(String[] args) {
		ArrayList Data = new ArrayList();
		
		Data.add("Captain Nurmila");
		Data.add("D0217303");
		Data.add("A");
		Data.add("Panda");
		
		System.out.println("Biodatakuh : " +Data);
	}
		
}
