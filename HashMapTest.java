package ocm.bridgelab.hashtableprouc2;

public class HashMapTest {

		public static void main(String[] args) {
			gitvenASentence_WhenWordAreAddToList_ShoudReturnWordFrequency();
		}
		
		public static void gitvenASentence_WhenWordAreAddToList_ShoudReturnWordFrequency () {
			String sentence = "Paranoids are not paranoid because they are paranoid but because"
					          + "they keep putting themselves deliberately into paranoid avoidable situations";
			MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
			String[] words = sentence.toLowerCase().split(" ");
			for (String word : words) {
				Integer value = myHashMap.get(word);
				if (value == null)
					value = 1;
				else
					value = value + 1;
				myHashMap.add(word, value);
			}
			int frequency = myHashMap.get("paranoid");
			System.out.println(myHashMap);
			System.out.println("Frequency of word(paranoid) is " + frequency);
			}
}
