import java.util.Random;

public class Teste_pt2 {

	public static void main(String[] args) {
		//ArrayList<DuplaCharacters> listaDuplas = new ArrayList<DuplaCharacters>();
        Random Chance = new Random ();
        AddDoubleCharacters addDoubleChar = new AddDoubleCharacters();
        addDoubleChar.addDoubleCharacters();
        
        int i = 0;
		while(!addDoubleChar.listaDuelo.isEmpty()) {
			int j = Chance.nextInt(2);
			if(!addDoubleChar.listaDuelo.get(i).getCharacter(j).getHit()) {
				addDoubleChar.listaDuelo.get(i).morto(j);
				if(j == 0)System.out.println(addDoubleChar.listaDuelo.get(i).getCharUm().getClass().getSimpleName() + " É o Campeão" );
				else System.out.println(addDoubleChar.listaDuelo.get(i).getCharDois().getClass().getSimpleName() + " É o Campeão" );
				addDoubleChar.listaDuelo.remove(i);
			}
			if(!addDoubleChar.listaDuelo.isEmpty()) i = (i + 1) % addDoubleChar.listaDuelo.size();
		}
	}

}