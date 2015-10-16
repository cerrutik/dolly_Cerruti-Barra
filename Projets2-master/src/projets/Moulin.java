package projets;   

import comportement.*;
/**
 * 
 * @author Jérémy
 *
 */
public class Moulin extends Batiments 
{
	public Moulin(int x , int y , Terrain map)
	{
		super(x,y,map);
		this.pointVie = 100;
		this.pointDefense = 80;
		this.coutOr = 80;
		this.generer =new GenererNourriture();
		this.coutNourriture = 30;
		this.rechercher = false;
		map.xcase[x][y]= new Case (x,y,9);
	}
	
	public void creerUnite(Joueur j)
	{
		
	}
	
	
}