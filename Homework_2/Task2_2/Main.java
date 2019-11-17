package fasttrack_task2_2;

public class Main {

	public static void main(String[] args) {
		int line = 5;
		int i = 1;
		int j = 0;
		int n = 5;
		do {
			
			while (j < n - line )
			{
				System.out.print("  ");
				j++;
			}

			
			do {
				System.out.print("* ");
				i++;
			}
			while (i <= line);
			i = 1;
			j = 0;
			line--;
			System.out.println();
		}
			while (line >= 1);
				
		
		
	}

}
