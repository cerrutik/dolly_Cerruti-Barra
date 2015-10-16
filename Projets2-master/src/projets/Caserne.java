package projets;   

import comportement.*;

/**
 * 
 * @author Jérémy
 *
 */

public class Caserne extends Batiments 
{
	public Caserne(int x , int y, Terrain map)
	{
		super(x,y,map);
		this.pointVie = 100;
		this.pointDefense = 80;
		this.coutOr = 100;
		this.coutNourriture = 50;
		this.rechercher = true;
		this.recruter = new RecruterGuerrier();
		map.xcase[x][y]= new Case (x,y,12);
	}
	
	
    

}
