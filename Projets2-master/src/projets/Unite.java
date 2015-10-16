package projets;
/**
 * Classe abstraite définissant une unité
 * @author Gwenael , Jérémy, Benjamin
 */
public abstract class Unite {


	//attributs 
/**
 * attribut point de vie 
 */
protected int pointVie;

/**
 * attribut point de déplacement
 */
protected int pointDeplacement;


/**
 * attribut point d'attaque 
 */
protected int pointAttaque;

/**
 * attribut point de défense 
 */
protected int pointDefense;

/**
 * attribut de la portée
 */
protected int portee;

/**
 * Attribut des deux axes x et y
 */

public int coordonnee_x;

public int coordonnee_y;

public Terrain map;

public int typeUnite ;

/**
 * Cout de l'unité en or et en nourriture
 * 
 */

protected int coutOr;

protected int coutNourriture;
//Getters

public int getPointVie()
{
	return pointVie;
}

public int getPointDeplacement()
{
	return pointDeplacement;
}

public int getPointAttaque()
{
	return pointAttaque;
}
   
public int getPointDefense()
{
	return pointDefense;
}

public int getPortee()
{
	return portee;
}

public int getCoordonnee_y()
{
	return coordonnee_y;
}

public int getCoordonnee_x()
{
	return coordonnee_x;
}

public int getCoutOr()
{
	return this.coutOr;
}

public int getCoutNourriture()
{
	return this.coutNourriture;
}
//Setters

public void setPointVie(int pointVie)
{
	this.pointVie = pointVie;
}

public void setCoordonnee_y(int y)
{
	if ( y < Terrain.getHauteurCarte() && y >= 0)
	{
		this.coordonnee_y = y;
	}
}

public void setCoordonnee_x(int x)
{
	if ( x < Terrain.getLongueurCarte() && x >= 0)
	{
		this.coordonnee_x = x;
	}
}
public Unite(int x, int y, Terrain map)
{
	this.coordonnee_x=x;
	this.coordonnee_y=y;
	this.map = map;
}

//Methods

/**
 * methode permettant le déplacement d'une unité
 * 
 */
public void seDeplacer(int x, int y)
{ 
	int pointDeplacement = this.getPointDeplacement();
	int current_x = this.getCoordonnee_x();
	int current_y = this.getCoordonnee_y();
	this.map.xcase[current_x][current_y].typeDeCase =0;
	while(pointDeplacement > 0)
	{
		
		if(x > current_x)
		{
			current_x++;
			x--;
		}
		else if(x< current_x)
		{
			current_x--;
			x++;
		}
		
		if(y> current_y)
		{
			current_y++;
			y--;
		}
		else if(y< current_y)
		{
			current_y--;
			y++;
		}
		pointDeplacement--;
	
	}
	this.setCoordonnee_x(current_x);
	this.setCoordonnee_y(current_y);
	this.map.xcase[current_x][current_y].typeDeCase = typeUnite;
}

/**
 * methode permettant à une unité d'attaquer 
 */
	public void attaquer(Unite unité_attaque)
	{
		if ( this.pointAttaque > unité_attaque.pointDefense )
		{
			unité_attaque.pointVie = unité_attaque.pointVie -(this.pointAttaque - unité_attaque.pointDefense);
		
		}
	}

	public boolean estEnVie()
	{
		if ( this.pointVie >0 )
		{
		return true;
		}
		return false;
	}
	
	public String toString()
	{
		String str;
		str = "Nom :" + getClass().getName();
		str += " Points de vie :" + this.pointVie;
		str += " Points de déplacement " +this.pointDeplacement;
		str += " Points d'attaque : " +this.pointAttaque;
		str += " Points de défense" +this.pointDefense;
		str += " Portée " +this.portee;
		
		return str;
		
	}
}



