package comportement;

import projets.*;


public class RecruterCavalier extends Recruter
{
	public void creerUnite(Joueur j)
	{
			Cavalier cav = new Cavalier(0,0,null);
		    if (consommerRessources(j,cav) == true)
		    	{
		    	j.addUnite(cav);
		    	}

	    
	}
}
