package fasttrack_task2_5;

public class Main {

	public static void main(String[] args) {
		int line = 5;
		int i = 0;
		int j = 0;
		int n = 5;
		do {
			while (j < line - 1) {	
				System.out.print("  ");
				j++;
			}

			do {
				System.out.print("* ");
				i++;
			}
			
			while (i < n - line + (n - j));
			
			i = 0;
			j = 0;
			line--;
			System.out.println();
		}
		
		while (line >= 1);
		
		line = 5;
		i = 0;
		j = 0;
		do {
			while (j < line - 1) {	
				System.out.print("  ");
				j++;
			}

			do {
				System.out.print("* ");
				i++;
			}
			
			while (i < n - line + (n - j));
			
			i = 0;
			j = 0;
			line--;
			System.out.println();
		}
		
		while (line >= 1);
	}

}
