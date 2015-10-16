package comportement;

import projets.*;

public class GenererOr implements GenererRessources
{
	public void generer(Joueur j)
	{
		int or;
		or = j.getStockOr() + 20;
		j.setStockOr(or);
	}
}
