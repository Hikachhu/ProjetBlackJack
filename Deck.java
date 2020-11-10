import java.util.LinkedList;
import java.lang.Exception;

public class Deck{
	LinkedList<Card> cardList;
	public void Deck(int nbBox){
		cardList =new LinkedList<Card>();
		for(int i=0;i<nbBox;i++){
			for(Value val: Value.values()){
				for(Color couleur:Color.values()){
					System.out.println(val.getSymbole()+couleur.getSymbole());
				}
			}
		}
	}

	public void  draw(){

	}
}