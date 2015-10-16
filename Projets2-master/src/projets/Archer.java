 package projets;

/**
 * Classe héritant de la classe abstraite unité
 * Unité tirant à distance
 * @author Gwen
 *
 */

public class Archer extends Unite
{
	public Archer(int x , int y , Terrain map)
	{
		super(x,y,map);
		this.pointVie = 100;
		this.pointDeplacement = 5;
		this.pointAttaque = 50;
		this.pointDefense = 20;
		this.portee = 3;
		this.coutOr = 75;
		this.coutNourriture = 100;
		map.xcase[x][y]= new Case (x,y,3);
		this.typeUnite = 3;
	}
	
	
   
}
