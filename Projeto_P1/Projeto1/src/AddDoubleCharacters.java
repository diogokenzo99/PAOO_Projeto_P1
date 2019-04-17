import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AddDoubleCharacters {
	public List<DuplaCharacters> listaDuelo = new ArrayList<DuplaCharacters>();
	
	public List<DuplaCharacters> addDoubleCharacters(){
		Random r = new Random();
		int k, j;
		double i;
		for(j=0; j<10; j++) {
			DuplaCharacters duplaCharacters = new DuplaCharacters();
			
			for (k=0; k<=2; k++) {
				i = r.nextDouble()*100;
				if (i >= 0.0 && i<25.0) duplaCharacters.addCharacter(new King());
				else if (i >= 25.0 && i<50.0) duplaCharacters.addCharacter( new Knight());
				else if (i >= 50.0 && i<75.0) duplaCharacters.addCharacter(new Queen());
				else duplaCharacters.addCharacter(new Troll());
			}
			listaDuelo.add(duplaCharacters);
			System.out.println(listaDuelo.get(j).getCharUm().getClass().getSimpleName() + " VS " + listaDuelo.get(j).getCharDois().getClass().getSimpleName());
		}
		System.out.printf("\n\n\n");
	    return listaDuelo;
	}
}
