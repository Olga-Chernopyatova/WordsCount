package words2;

public class wordsCount {

	public static void main(String[] args) {
		String[] words = {"Lorem, ipsum, dolor, sit, consectetur, sed, do, eiusmod, tempor, incididunt, Lorem, labore, et, dolore, magna, aliqua, Lorem, ipsum, dolor" };
		String string = in.nextLine();
	    String[] words = string.split("\\s+");
	    HashMap<String, Integer> wordToCount = new HashMap<>();
	    for (String word : words)
	    {
	        if (!wordToCount.containsKey(word))
	        {
	            wordToCount.put(word, 0);
	        }
	        wordToCount.put(word, wordToCount.get(word) + 1);
	    }
	    for (String word : wordToCount.keySet())
	    {
	        System.out.println(word + " " + wordToCount.get(word));
	    }
	}

}
