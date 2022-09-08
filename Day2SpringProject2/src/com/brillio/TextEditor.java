package com.brillio;

public class TextEditor {
	public SpellChecker spellChecker;


	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setter");
		this.spellChecker = spellChecker;
	}
	
	

}
