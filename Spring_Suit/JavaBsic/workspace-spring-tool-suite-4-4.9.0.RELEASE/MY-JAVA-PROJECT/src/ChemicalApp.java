
public class ChemicalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chemical h=new Chemical(1,"h","hydro");
		System.out.println("hydrogen"+" "+h.isAlkali());
		
		Chemical z=new Chemical(30,"zn","zinc");
		System.out.println("zinc"+z.isAlkali());
		
		Chemical h2=new Chemical(1,"h","hydro");
		System.out.println("same h and h2:"+(h==h2));
        //h and h2 point to two diff objets not logically equal
		
		System.out.println("h and h2 after equals method:"+ (h.equals(h2)));
	}

}
