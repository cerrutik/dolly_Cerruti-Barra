  package projets;

/**
 * Classe h�ritant de la classe abstraite Unite
 * Unit� d'attaque ayant des points de d�placement plus �lev�
 * @author Gwenael
 *
 */
public class Cavalier extends Unite
{
		public Cavalier(int x , int y, Terrain map)
		{
			super(x,y,map);
			this.pointVie = 100;
			this.pointDeplacement = 10; 
			this.pointAttaque = 50;
			this.pointDefense = 40;
			this.portee = 1;
			this.coutOr = 120;
			this.coutNourriture = 150;
			map.xcase[x][y]= new Case (x,y,4);
			this.typeUnite =4;
		}
		
}
