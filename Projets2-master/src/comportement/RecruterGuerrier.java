package comportement;

import projets.Guerrier;
import projets.Joueur;

public class RecruterGuerrier extends Recruter
{
	// La cr�ation d'un guerrier � partir de la caserne
		public void creerUnite(Joueur j)
		{
				
				Guerrier guerrier = new Guerrier();
			    if (consommerRessources(j,guerrier) == true)
			    	{
			    	j.addUnite(guerrier);
			    	}

		    
		}
}
