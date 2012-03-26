/**
 * 
 */
package org.eclipse.ui.examples.javaeditor;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author aasawant
 * 
 */
public class FreqCalculator {

	public final static String DELIM = "[^a-zA-Z]+";

	/**
	 * 
	 */
	public FreqCalculator() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Main method will do Frequency calculations .
	 */
	public static void main(String[] args) {
		Map<String, Integer> wordMap = new TreeMap<String, Integer>(
				String.CASE_INSENSITIVE_ORDER);
		Map<String, Integer> biGramMap = new TreeMap<String, Integer>(
				String.CASE_INSENSITIVE_ORDER);
		List<String> wordList = new ArrayList<String>();
		List<WordBigramPhrase> phraseList = new ArrayList<WordBigramPhrase>();

		Scanner aScanner = selectTextFile();
		aScanner.useDelimiter(DELIM);

		while (aScanner.hasNext()) {
			
			String strWord = aScanner.next().toLowerCase();
			wordList.add(strWord);
			
			if (wordMap.get(strWord) == null)
				wordMap.put(strWord, 1);
			else
				wordMap.put(strWord, wordMap.get(strWord) + 1);

		}

		// Most and Leat Common Words Logic
		printWordFreq(wordMap);
		

		// bigram logic
		printBiGramFreq(wordList);
		
		// End Of Bigram Loic

		// Start of Phrase Logic
        printLongestPhrase(wordList);
		

		// End of Phrase Logic.

	}

	/**
	 * This method has the word frequency  calculation logic .
	 */
	private static void printWordFreq(Map<String, Integer> wordMap)
	{
		List<WordBigramPhrase> lWordsFreq = new ArrayList<WordBigramPhrase>();
		Iterator it = wordMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry) it.next();
			lWordsFreq.add(new WordBigramPhrase(pairs.getKey().toString(),
					Integer.valueOf(pairs.getValue().toString())));

		}

		Collections.sort(lWordsFreq);

		printMessage("The 10 most common words are as follows : ");
		for (int i = lWordsFreq.size() - 1; i > lWordsFreq.size() - 1 - 10; i--) {
			WordBigramPhrase a = lWordsFreq.get(i);
			printMessage(a.getWord());
		}
		printMessage("");
		printMessage("The 10 least common words are as follows : ");
		for (int i = 0; i < 10; i++) {
			WordBigramPhrase a = lWordsFreq.get(i);
			printMessage(a.getWord());
		}
	}
	
	
	/**
	 * This method has the bigram frequency calculation logic .
	 */
	public static void printBiGramFreq(List<String> wordList)
	{
		Map<String, Integer> biGramMap = new TreeMap<String, Integer>(
				String.CASE_INSENSITIVE_ORDER);
		Set<String> noRepSet = new HashSet();
		List<String> lNoRepTemp = new ArrayList<String>();
		for (int x = 0; x < wordList.size(); x++) {
			String s = wordList.get(x);
			for (int y = x + 1; y < wordList.size(); y++) {
				String ds = wordList.get(y);
				if (s.equals(ds)) {
					String splus = wordList.get(x + 1);
					String dsplus = wordList.get(y + 1);
					if (splus.equals(dsplus)) {
						StringBuffer biGramBuf = new StringBuffer();
						biGramBuf.append(s);
						biGramBuf.append(" ");
						biGramBuf.append(splus);
						String bg = biGramBuf.toString().toLowerCase();
						if (!noRepSet.contains(bg)) {
							lNoRepTemp.add(bg);
							if (biGramMap.get(bg) == null)
								biGramMap.put(bg, 2);
							else
								biGramMap.put(bg, biGramMap.get(bg) + 1);
						}

					}
				}
			}
			noRepSet.addAll(lNoRepTemp);
		}

		List<WordBigramPhrase> lbg = new ArrayList<WordBigramPhrase>();
		Iterator itbg = biGramMap.entrySet().iterator();
		while (itbg.hasNext()) {
			Map.Entry pairs = (Map.Entry) itbg.next();
			lbg.add(new WordBigramPhrase(pairs.getKey().toString(), Integer
					.valueOf(pairs.getValue().toString())));

		}

		Collections.sort(lbg);

		if (lbg.size() > 0) {
			printMessage("");
			printMessage("The 10 most common bigrams are as follows : ");
			for (int i = lbg.size() - 1; i > lbg.size() - 1 - 10; i--) {
				WordBigramPhrase abg = lbg.get(i);
				printMessage(abg.getWord());
			}

			printMessage("");
			printMessage("The 10 least common bigrams are as follows : ");
			for (int i = 0; i < 10; i++) {
				WordBigramPhrase abg = lbg.get(i);
				printMessage(abg.getWord());
			}

		}
	}
	
	
	
	
	/**
	 * This method has the longest phrase which is repeated  calculation logic .
	 */
	private static void printLongestPhrase(List<String> wordList)
	{
		List<WordBigramPhrase> phraseList = new ArrayList<WordBigramPhrase>();

		for (int i = 0; i < wordList.size(); i++) {
			String s = wordList.get(i);
			for (int j = i + 1; j < wordList.size(); j++) {
				String ds = wordList.get(j);
				if (s.equals(ds)) {
					int count = 1;
					int k = 1;
					StringBuffer phraseBuf = new StringBuffer();
					phraseBuf.append(s);
					while (wordList.get(i + k).equals(wordList.get(j + k))) {
						phraseBuf.append(" ");
						phraseBuf.append(wordList.get(i + k));
						count++;
						k++;

					}
					WordBigramPhrase cWord = new WordBigramPhrase(
							phraseBuf.toString(), count);
					phraseList.add(cWord);
				}
			}
		}

		Collections.sort(phraseList);

		WordBigramPhrase a = phraseList.get(phraseList.size() - 1);

		printMessage("");
		printMessage("The longest phrase which is repeated is as follows : ");
		printMessage(a.getWord());

	}
	
	/**
	 * This method prints a message .
	 */
	public  static void printMessage(String s)
	{
		System.out.println(s);
	}
	
	
	/**
	 * This method selects a file .
	 */
	public static Scanner selectTextFile() {
		do {
			JFileChooser chooser = new JFileChooser();
			FileNameExtensionFilter afilter = new FileNameExtensionFilter(
					"Text files", "txt");
			chooser.setFileFilter(afilter);
			int returnVal = chooser.showOpenDialog(null);

			try {
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					return new Scanner(chooser.getSelectedFile());
				} else {
					return null;
				}
			} catch (FileNotFoundException ef) {
				JOptionPane.showMessageDialog(null, "Invalid File!", "error",
						JOptionPane.ERROR_MESSAGE);
			}

		} while (true);

	}

}
