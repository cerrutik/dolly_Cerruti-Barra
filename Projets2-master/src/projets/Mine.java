package projets;   

import comportement.*;
/**
 * 
 * @author Jérémy
 *
 */
public class Mine extends Batiments
{
	
	public Mine(int x , int y , Terrain map)
	{
		super(x,y,map);
		this.pointVie = 100;
		this.pointDefense = 80;
		this.generer = new GenererOr();
		this.rechercher = false;
		this.coutOr = 50;
		this.coutNourriture = 100;
		map.xcase[x][y]= new Case (x,y,7);
	}

	public void creerUnite(Joueur j)
	{
	}
}