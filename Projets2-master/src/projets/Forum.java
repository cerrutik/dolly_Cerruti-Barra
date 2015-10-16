package projets;  

import comportement.*;
/**
 * 
 * @author Jérémy
 *
 */
public class Forum extends Batiments
{
	public Forum(int x , int y , Terrain map)
	{ 
		super(x,y,map);
		this.pointVie = 100;
		this.pointDefense = 100;
		this.coutOr = 200;
		this.coutNourriture = 150;
		this.generer =new GenererNourriture();
		this.rechercher = true;
		this.recruter = new RecruterVillageois();
		map.xcase[x][y]= new Case (x,y,6);
	}    
}
