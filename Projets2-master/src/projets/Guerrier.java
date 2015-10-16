package projets;
/**
 * Classe héritant de la classe abstraite Unite
 * Unité de corps à corps classique
 * @author Gwenael
 *
 */
public class Guerrier extends Unite
{
	public Guerrier(int x , int y, Terrain map)
	{
		super(x,y,map);
		this.pointVie = 100;
		this.pointDeplacement = 5;
		this.pointAttaque = 50;
		this.pointDefense = 30;
		this.portee = 1;
		this.coutOr = 100;
		this.coutNourriture =100;
		map.xcase[x][y]= new Case (x,y,2);
		this.typeUnite = 2;
	}
	
	
    
}
