package comportement;

import projets.Joueur;
import projets.Terrain;
import projets.Villageois;

public class RecruterVillageois extends Recruter
{
    public void creerUnite(Joueur j)
    {
    	Villageois vil = new Villageois(0,0,null);
	    if (consommerRessources(j,vil) == true)
	    	{
	    	j.addUnite(vil);
	    	}
 
    }
}
