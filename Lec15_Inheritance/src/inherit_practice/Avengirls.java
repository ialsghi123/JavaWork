package inherit_practice;

/*
 * Jisoo,Jennie,taeyeon 키,몸무게,특징 ->같은팀
 * 
 */



public class Avengirls {

	public static void main(String[] args) {
		
		spec member1 = new Jisoo();
		spec member2 = new Jennie();
		spec member3 = new Taeyeon();
		
		member1.height();
		member2.height();
		member3.height();
		
		System.out.println();
		
		member1.weight();
		member2.weight();
		member3.weight();

	} //end main

} //end class

interface spec {
	
	public void height();
	public void weight();
	public void visual();
	public void roll();
}

interface age {}
interface song {}
interface money {}


class Jisoo implements age,song,money,spec {
	
	public void height() {
		System.out.println("163");
	}
	
	public void weight() {
		System.out.println("48");
	}
	
	public void visual() {
		System.out.println("1");
	}
	public void roll() {
		System.out.println("visual");
	}
}

class Jennie implements age,song,money,spec {
	
	public void height() {
		System.out.println("163");
	}
	
	public void weight() {
		System.out.println("48");
	}
	
	public void visual() {
		System.out.println("3");
	}
	public void roll() {
		System.out.println("rap");
	}
}

class Taeyeon implements age,song,money,spec {
	
	public void height() {
		System.out.println("160");
	}
	
	public void weight() {
		System.out.println("45");
	}
	
	public void visual() {
		System.out.println("2");
	}
	public void roll() {
		System.out.println("vocal");
	}
}





