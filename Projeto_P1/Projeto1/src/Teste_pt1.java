import java.util.ArrayList;
import java.util.Random;

public class Teste_pt1 {
	public static void main(String[] args) {
		ArrayList <Character> listaPersonagens = new ArrayList<Character>();
		Random r = new Random();
		
		King king = new King();
		Queen queen = new Queen();
		Troll troll = new Troll();
		Knight knight = new Knight();
		listaPersonagens.add(king);
		listaPersonagens.add(queen);
		listaPersonagens.add(troll);
		listaPersonagens.add(knight);
		
		for (Character character : listaPersonagens) character.fight();
        
		for (Character character : listaPersonagens) {
			double i = r.nextDouble()*100;
			if (i >= 0.0 && i<25.0) character.setWeapon(new KnifeBehavior());
			else if (i >= 25.0 && i<50.0) character.setWeapon(new AxeBehavior());
			else if (i >= 50.0 && i<75.0) character.setWeapon(new SwordBehavior());
			else character.setWeapon(new BowAndArrowBehavior());
		}		
	}
}