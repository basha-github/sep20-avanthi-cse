
public class Pattren2 {

	public static void main(String[] args) {
	
		/*
		 * 1
		 * 0 1
		 * 0 1 0
		 * 1 0 1 0
		 * 1 0 1 0 1
		 * 
		 */
		int v=1;
		for(int r=1;r<=5;r++) {
			
			for(int c=1;c<=r;c++) {
				System.out.print(v+" ");
				if(v ==1) v=0;
				else v=1;
			}
			System.out.println();
		}
	}

}
