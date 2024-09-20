
public class Add7To3Digit {

	public static void main(String[] args) {
		/*
		 * 1
		 * 1 0
		 * 1 0 1
		 * 1 0 1 0
		 * 1 0 1 0 1
		 * 
		 */
		
		for(int r=1;r<=5;r++) {
			boolean light=true;
			for(int c=1;c<=r;c++) {
				if(light==true) {
					System.out.print(1+" ");
					light=false;
				}
				else {
					System.out.print(0+" ");
					light=true;
				}
			}
			System.out.println();
			
		}
		
		

	}

}
