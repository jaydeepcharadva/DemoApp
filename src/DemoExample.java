
public class DemoExample {
	
	public void printSquare() {
		/*int a = [3,4,5,6]
				implement logic for below out put
				(9,16,25,36)
				(9,16,25)
				(9,16)
				(9)*/
		
		int a[] = {3,4,5,6};
		for(int i = 0; i <= a.length ; i++) {
			System.out.println("(");
			for(int j = a.length; j < ; j++) {
				System.out.print(a[j] * a[j]+",");
			}
			System.out.println(")");
		}
	}
	

	public static void main(String[] args) {
		
		DemoExample demoExample = new DemoExample();
		demoExample.printSquare();
	}

}
