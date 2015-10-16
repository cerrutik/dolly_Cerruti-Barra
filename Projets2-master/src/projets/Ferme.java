package projets; 

import comportement.*;
/**
 * 
 * @author Jérémy
 *
 */
public class Ferme extends Batiments
{
	
	public Ferme(int x , int y , Terrain map)
	{
		super(x, y,map);
		this.pointVie = 100;
		this.pointDefense = 80;
		this.coutOr = 50;
		this.coutNourriture = 20;
		this.rechercher = false;
		this.generer = new GenererNourriture();
		map.xcase[x][y]= new Case (x,y,8);
	}
	
	public void creerUnite(Joueur j)
	{
		
	}
}