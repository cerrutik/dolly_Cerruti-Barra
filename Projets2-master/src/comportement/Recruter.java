package comportement;

import projets.*;

public abstract class Recruter
{
	public abstract void creerUnite(Joueur j);
	
	protected boolean consommerRessources(Joueur j, Unite unit)
	{
		if ( j.getStockOr() >=unit.getCoutOr()  && j.getStockNourriture() >=unit.getCoutNourriture() )
		{
			j.setStockOr(j.getStockOr()-unit.getCoutOr());
			j.setStockNourriture(j.getStockNourriture()-unit.getCoutNourriture());
			System.out.println("Unité en cours d'entrainement");
			return true;
		}
		System.out.println("Pas assez de ressources");
		return false;
	}
}
