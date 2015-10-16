package projets;   

import comportement.*;

/**
 * 
 * @author Jérémy, Gwen, benjamin
 *
 */
abstract class Batiments {	
	
// Différents attributs
	
	// Attribut de l'or du joueur
	protected long Or;

	// Attribut de la nourriture du joueur
	protected long Nourriture;
	
	// Attribut point de vie
	protected int pointVie;
	
	// Attribut point de défense
	protected int pointDefense;
	
	
	protected GenererRessources generer = null;
	
	protected Recruter recruter = null;
	
	// Attribut booléen de recherche
	protected boolean rechercher;
	
	// Attribut du cout en or
	protected int coutOr;
	
	// Cout en nourriture du bâtiment
	protected int coutNourriture;
	
	//  Coordonnée x de position du batiment
	public int coordonnee_x;

	// Coordonnée y de position du batiment
	public int coordonnee_y;

	public Terrain map;
	
	public Batiments(int x, int y, Terrain map)
	{
		this.coordonnee_x=x;
		this.coordonnee_y=y;
		
	}
	//Getters

	public int getPointVie()
	{
		return pointVie;
	}

	public int getPointDefense()
	{
		return pointDefense;
	}
	
	public boolean getRechercher()
	{
		return rechercher;
	}
	
	public int getCoordonnee_x()
	{
		return coordonnee_x;
	}

	public int getCoordonnee_y()
	{
		return coordonnee_y;
	}

	//Setters

	public void setPointVie(int pointVie)
	{
		this.pointVie = pointVie;
	}
	
	public void setPointDefense(int pointDefense)
	{
		this.pointDefense = pointDefense;
	}

	
	public void setRechercher(boolean rechercher)
	{
		this.rechercher = rechercher;
	}

	public void setCoordonnee_y(int y)
	{
		if ( y < Terrain.getHauteurCarte() && y >= 0)
		{
			this.coordonnee_y = y;
		}
	}

	public void setCoordonnee_x(int x)
	{
		if ( x < Terrain.getLongueurCarte() && x >= 0)
		{
			this.coordonnee_x = x;
		}
	}
	
public boolean estDetruit()
{
	if ( this.pointVie == 0 )
	{
		return true;
	}
	return false;
}



public void generer(Joueur j)
{
	generer.generer(j);
}

public void recruter(Joueur j)
{
	recruter.creerUnite(j);
}


}
