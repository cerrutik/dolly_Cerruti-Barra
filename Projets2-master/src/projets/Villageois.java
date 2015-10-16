package projets;

import comportement.*;
/**
 * 
 * @author Gwen
 *
 */

public class Villageois extends Unite implements Construction
{
	public Villageois(int x , int y , Terrain map)
	{
		super(x,y,map);
		this.pointVie = 100;
		this.pointDeplacement = 5;
		this.pointAttaque = 10;
		this.pointDefense = 10;
		this.portee = 1;
		this.coutOr = 50;
		this.coutNourriture = 50;
		map.xcase[x][y]= new Case (x,y,5);
		this.typeUnite = 5;
	}
	
	public Ecurie construireEcurie(Joueur j)
	{
		Ecurie ecurie = new Ecurie(this.getCoordonnee_x(), this.getCoordonnee_y(), map);
		int orFinal;
		int nourritureFinal;
		
		if(ecurie.coutOr <= j.getStockOr() && ecurie.coutNourriture <= j.getStockNourriture())
		{
			orFinal = j.getStockOr() - ecurie.coutOr;
			nourritureFinal = j.getStockNourriture() - ecurie.coutNourriture;
			j.setStockOr(orFinal);
			j.setStockNourriture(nourritureFinal);
			ecurie.setCoordonnee_x(this.getCoordonnee_x());
			ecurie.setCoordonnee_y(this.getCoordonnee_y());
			j.addConstructions(ecurie);
			return ecurie;
		}
		else
		return null;
	}
	public Caserne construireCaserne(Joueur j)
	{
		Caserne caserne = new Caserne(this.getCoordonnee_x(), this.getCoordonnee_y(), map);
		int orFinal;
		int nourritureFinal;
		
		if(caserne.coutOr <= j.getStockOr() && caserne.coutNourriture <= j.getStockNourriture())
		{
			orFinal = j.getStockOr() - caserne.coutOr;
			nourritureFinal = j.getStockNourriture() - caserne.coutNourriture;
			j.setStockOr(orFinal);
			j.setStockNourriture(nourritureFinal);
			caserne.setCoordonnee_x(this.getCoordonnee_x());
			caserne.setCoordonnee_y(this.getCoordonnee_y());
			j.addConstructions(caserne);
			return caserne;
		}
		else
		return null;
	}
	public CampTirArc construireCampTirArc(Joueur j)
	{
		CampTirArc camp = new CampTirArc(this.getCoordonnee_x(), this.getCoordonnee_y(), map);
		int orFinal;
		int nourritureFinal;
		
		if(camp.coutOr <= j.getStockOr() && camp.coutNourriture <= j.getStockNourriture())
		{
			orFinal = j.getStockOr() - camp.coutOr;
			nourritureFinal = j.getStockNourriture() - camp.coutNourriture;
			j.setStockOr(orFinal);
			j.setStockNourriture(nourritureFinal);
			camp.setCoordonnee_x(this.getCoordonnee_x());
			camp.setCoordonnee_y(this.getCoordonnee_y());
			j.addConstructions(camp);
			return camp;
		}
		else
		return null;
	}
	public Mine construireMine(Joueur j)
	{
		Mine mine = new Mine(this.getCoordonnee_x(), this.getCoordonnee_y(), map);
		int orFinal;
		int nourritureFinal;
		
		if(mine.coutOr <= j.getStockOr() && mine.coutNourriture <= j.getStockNourriture())
		{
			orFinal = j.getStockOr() - mine.coutOr;
			nourritureFinal = j.getStockNourriture() - mine.coutNourriture;
			j.setStockOr(orFinal);
			j.setStockNourriture(nourritureFinal);
			mine.setCoordonnee_x(this.getCoordonnee_x());
			mine.setCoordonnee_y(this.getCoordonnee_y());
			j.addConstructions(mine);
			return mine;
		}
		else
		return null;
	}
	public Ferme construireFerme(Joueur j)
	{
		Ferme ferme = new Ferme(this.getCoordonnee_x(), this.getCoordonnee_y(), map);
		int orFinal;
		int nourritureFinal;
		
		if(ferme.coutOr <= j.getStockOr() && ferme.coutNourriture <= j.getStockNourriture())
		{
			orFinal = j.getStockOr() - ferme.coutOr;
			nourritureFinal = j.getStockNourriture() - ferme.coutNourriture;
			j.setStockOr(orFinal);
			j.setStockNourriture(nourritureFinal);
			ferme.setCoordonnee_x(this.getCoordonnee_x());
			ferme.setCoordonnee_y(this.getCoordonnee_y());
			j.addConstructions(ferme);
			return ferme;
		}
		else
		return null;
	}
	public Moulin construireMoulin(Joueur j)
	{
		Moulin moulin = new Moulin(this.getCoordonnee_x(), this.getCoordonnee_y(), map);
		int orFinal;
		int nourritureFinal;
		
		if(moulin.coutOr <= j.getStockOr() && moulin.coutNourriture <= j.getStockNourriture())
		{
			orFinal = j.getStockOr() - moulin.coutOr;
			nourritureFinal = j.getStockNourriture() - moulin.coutNourriture;
			j.setStockOr(orFinal);
			j.setStockNourriture(nourritureFinal);
			moulin.setCoordonnee_x(this.getCoordonnee_x());
			moulin.setCoordonnee_y(this.getCoordonnee_y());
			j.addConstructions(moulin);
			return moulin;
		}
		
		else
		return null;
	}
	
	
}
