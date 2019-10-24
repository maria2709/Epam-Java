package lesson4_additional_I;

public class task_III {

	public static void main(String[] args) {
		String text = "The acronym INVEST helps to remember a widely accepted "
				+ "set of criteria or checklist to assess the quality of a "
				+ "user story";
		int n = 25;
		System.out.print(getSymbol(text, n));
		if (getSymbol(text, n) == '-')
			System.out.println(" Sorry, the number of words exceeded");
	}
	
	public static char getSymbol (String text, int n) {
		String sequence = "" + text.charAt(0);
		char symbol;
		int index = 1;
		while (index < text.length()){
			if (text.charAt(index-1) == ' ' ) {
				sequence += text.charAt(index);

			}
			index++;
		}
		
		if (n <= sequence.length()) {
			symbol = sequence.charAt(n-1);
			}
			else symbol = '-';
		return symbol;
	
	}

}
