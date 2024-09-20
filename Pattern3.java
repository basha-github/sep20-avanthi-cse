
public class Pattern3 {

	public static void main(String[] args) {
	
		int space=20;
		for(int r=1;r<=5;r++) {
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++) {
				System.out.print(r+" ");
			}
			System.out.println();
			space =space-1;
		}
	}

}
