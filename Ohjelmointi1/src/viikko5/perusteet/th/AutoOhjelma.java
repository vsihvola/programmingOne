package viikko5.perusteet.th;

public class AutoOhjelma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto tesla = new Auto("Tesla");
		Auto bmw = new Auto ("BMW");
		
		tesla.aja(100);
		bmw.aja(98);
		tesla.aja(23);
		System.out.println(tesla.toString());
		System.out.println(bmw.toString());
	}

}
