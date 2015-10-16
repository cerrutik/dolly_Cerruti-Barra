package comportement;

import projets.Archer;
import projets.Joueur;

public class RecruterArcher extends Recruter
{
	public void creerUnite(Joueur j)
	{
			Archer archer = null;
			archer = new Archer(0,0,null);
		    if (consommerRessources(j,archer) == true)
		    	{
		    	j.addUnite(archer);
		    	}
	    
	}
}
