import java.util.ArrayList;

public class DuplaCharacters {
	private ArrayList <Character> duplaCharacter = new ArrayList<Character>();
	
	public void addCharacter(Character character) {
		duplaCharacter.add(character);
	}
	
	public void morto(int i) {
		duplaCharacter.remove(i);
	}
	
	public Character getCharacter(int i) {
		return duplaCharacter.get(i);
	}
	
	public Character getCharUm() {
		return duplaCharacter.get(0);
	}
	
	public Character getCharDois() {
		return duplaCharacter.get(1);
	}
	
	public void setCharUm(Character charUm) {
		duplaCharacter.add(0, charUm);;
	}
	
	public void setCharDois(Character charDois) {
		duplaCharacter.add(1, charDois);;
	}
	
	public Character getChar(int i) {
		return duplaCharacter.get(i);
	}
}
