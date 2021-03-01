
public class primitivevsRef {
	public static void increament(int someInt) {
		someInt++;
	}
	public static void increament(int[] someArray) {
		someArray[0]++;
	}
	public static void main(String[] args) {
		int aPrimitive=10;
		increament(aPrimitive);
		System.out.println(aPrimitive);
		System.out.println("_______");
		int[] aref=new int[25];
		aref[0]=10;
		increament(aref);
		System.out.println(aref[0]);
	}

}
