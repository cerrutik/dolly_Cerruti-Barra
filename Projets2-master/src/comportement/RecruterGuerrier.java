package comportement;

import projets.Guerrier;
import projets.Joueur;

public class RecruterGuerrier extends Recruter
{
	// La création d'un guerrier à partir de la caserne
		public void creerUnite(Joueur j)
		{
				
				Guerrier guerrier = new Guerrier(0,1,null);
			    if (consommerRessources(j,guerrier) == true)
			    	{
			    	j.addUnite(guerrier);
			    	}

		    
		}
}
