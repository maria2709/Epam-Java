package fasttrack_task2_3;

public class Main {
	public static void main(String[] args) {
		int line = 5;
		int i = 0;
		int j = 0;
		int n = 5;
		do {
			while (j < line) {	
				System.out.print("  ");
				j++;
			}

			do {
				System.out.print("* ");
				i++;
			}
			
			while (i <= n - line);
			
			i = 0;
			j = 0;
			line--;
			System.out.println();
		}
		
		while (line >= 1);
							
	}


}


