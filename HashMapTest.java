package com.bridgelab.hashtableprograms;

public class HashMapTest {
	
	public static void main(String[] args) {
		gitvenASentence_WhenWordAreAddToList_ShoudReturnWordFrequency();
	}
	
	public static void gitvenASentence_WhenWordAreAddToList_ShoudReturnWordFrequency () {
		
		String sentence = "To be or not to be";
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
		int frequency = myHashMap.get("to");
		System.out.println(myHashMap);
		System.out.println("Frequency of word(to) is " + frequency);
		}
}

