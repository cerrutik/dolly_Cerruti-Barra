package projets;   

import comportement.RecruterCavalier;

/**
 * 
 * @author Jérémy, Gwen
 * 
 */
public class Ecurie extends Batiments
{
	public Ecurie(int x , int y , Terrain map)
	{	
		super(x,y,map);
		this.pointVie = 100;
		this.pointDefense = 80;
		this.coutOr = 100;
		this.coutNourriture = 50;
		this.rechercher = true;
		this.recruter = new RecruterCavalier();
		map.xcase[x][y]= new Case (x,y,10);
	}
	
	
    
   
}