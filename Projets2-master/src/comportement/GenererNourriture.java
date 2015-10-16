package comportement;

import projets.*;

public class GenererNourriture implements GenererRessources
{
	public void generer(Joueur j)
	{
		{
			int nourriture;
			nourriture = j.getStockOr() + 20;
			j.setStockOr(nourriture);
		}
	}
}
