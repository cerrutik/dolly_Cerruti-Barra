package projets;



/**
 * Informations sur le joueur (ressources + numero/faction)
 * @author Gwenael, Benjamin
 *
 */

public class Joueur 
{
	
	public int numeroJoueur;

	public Batiments[] constructions;
	
	public int nConstruction;

	private int or;
	
	private int nourriture;

	public Unite[] unite;
	
	public Villageois[] villageois;
	
	public int nUnite;
	
	public int nVillageois;
	
	public Terrain map;
	
	public Joueur(int num, int x , int y, Terrain map)
	{
		this.map = map;
		this.nConstruction = 0;
		this.nUnite = 0;
		this.numeroJoueur = num;
		this.constructions = new Batiments[10];
		this.villageois = new Villageois[10];
		this.unite = new Unite[10];
		this.constructions[nConstruction] = new Forum(x,y,map);
		this.constructions[nConstruction].setCoordonnee_x (x);
		this.constructions[nConstruction].setCoordonnee_y(y);
		nConstruction++;
		this.villageois[nVillageois] = new Villageois(x+1,y, map);
		nVillageois++;
		this.unite[nUnite] = new Guerrier(x,y+1,map);
		nUnite++;
		this.unite[nUnite] = new Cavalier(x+1,y+1, map);
		nUnite++;
		this.or = 300;
		this.nourriture = 300;
	}

	public String getUniteList()
	{
		String str = null;
		for (int i =0;i<nUnite;i++)
			str +=  this.unite[i];
		return str;
	}

	public void addUnite(Unite unite)
	{
		this.unite[nUnite] = unite;
		nUnite++;
	}
	
	public String getConstructionsList()
	{
		String str = null;
		for (int i =0;i<nConstruction;i++)
			str +=  this.constructions[i];
		return str;
	}

	public void addConstructions(Batiments constructions)
	{
		this.constructions[nConstruction] = constructions;
		nConstruction++;
	}

	public int getStockOr()
	{
		return or;
	}
	
	public int getStockNourriture()
	{
		return nourriture;
	}

	public void setStockOr(int or)
	{
		this.or = or;
	}

	public void setStockNourriture(int nour)
	{
		this.nourriture = nour;
	}

	public boolean isAlive()
	{
		if(this.constructions == null && this.unite == null)
			return false;
		return true;
	}
	

	
	
}	
	