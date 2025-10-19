package practicePackage;

public class CharacterFrequency {

	private int getCharFrequency(String input, char ch) {
		int frequency = 0;
		for (int i = 0; i < input.length(); i++) {
			if (ch == input.charAt(i)) {
				frequency++;
			}
		}
		return frequency;
	}

	void getAllCharFrequency(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				continue;
			}
			char ch = input.charAt(i);
			int index = input.indexOf(ch);
			if (index == i) {
				int a = getCharFrequency(input, input.charAt(i));
				System.out.println(input.charAt(i) + "->" + a);
			}
		}
	}

	void maxFrequencyChar(String input) {
		int maxFrequency = 0;
		char maxChar = ' ';
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int frequency = getCharFrequency(input, ch);
			if (frequency > maxFrequency) {
				maxFrequency = frequency;
				maxChar = ch;
			}
		}
		System.out.println(maxChar + " has the maximum frequency of " + maxFrequency);
	}

	void minFrequencyChar(String input) {
		int minFrequency = 1;
		char minChar = ' ';
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int frequency = getCharFrequency(input, ch);
			if (frequency == minFrequency) {
				minFrequency = frequency;
				minChar = ch;
			}
		}
		System.out.println(minChar + " has the minimum frequency of " + minFrequency);
	}

	public static void main(String[] args) {
		CharacterFrequency charFrequency = new CharacterFrequency();
		// charFrequency.getCharFrequency("Harry Potter",'r');
		// charFrequency.getAllCharFrequency("Harry Potter");
		charFrequency.maxFrequencyChar("Harry Potter");
		charFrequency.minFrequencyChar("HarryPotter");
	}

}
// frequency of all characters
// character with maximum frequency
