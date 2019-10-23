package fasttrack_task2_4;

public class Main {

	public static void main(String[] args) {
		
//---------------------------------Up---------------------------
		int line = 5;
		int i = 0;
		int j = 0;
		do {
			while (j < line) {	
				System.out.print("  ");
				j++;
			}

			do {
				System.out.print("* ");
				i++;
			}
			
			while (i <= 5 - line);
			
			i = 0;
			j = 0;
			line--;
			System.out.println();
		}
		
		while (line >= 1);
		
		//--------------------------------Down-------------------------
		line = 4;
		i = 1;
		j = 0;
		do {
			
			while (j <= 5 - line )
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
