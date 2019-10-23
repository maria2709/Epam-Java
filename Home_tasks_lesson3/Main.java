package fasttrack_task2_1;

public class Main {

	public static void main(String[] arg__s) {
		int line = 1;
		int i = 1;
		do {
			do {	
				System.out.print("* ");
				i++;

			}
			while (i <= line);
			
			i = 1;
			System.out.println();
			line++;

		}  
		while (line <= 6);
		
		i = 1;
	//	line = 5;
		do {
			do {	
				System.out.print("* ");
				i++;

				}
			while (i <= line);
			i = 1;
			System.out.println();
			line--;

			}  
		while (line >= 1);		
		
	}
	
}
	
