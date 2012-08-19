package guestbook;

/**
 * @author aasawant
 * 
 */
public class WordBigramPhrase implements Comparable<WordBigramPhrase> {

	String word;
	Integer count;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public WordBigramPhrase(String word, Integer count) {
		super();
		this.word = word;
		this.count = count;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WordBigramPhrase other = (WordBigramPhrase) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}

	public int compareTo(WordBigramPhrase inputWord) {

		if (this.count < inputWord.count)
			return -1;
		if (this.count > inputWord.count)
			return 1;

		return 0;

	}

}
