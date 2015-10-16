package projets;

/**
 * 
 * @author Benjamin
 *
 */


/**
 * 
 * @author Nico
 * le terrain est un echiquier de 30x30 cases, chaque case est un carré de 5pixel sur 5
 */
public class Terrain {

	
/**
 * nom du terrain
 */
private char nom;

/**
 * type du terrain
 */
private char type;

/**
 * dimension de la carte en x 
 */
private static int Longueurcarte = 30;
private static int pixelcaselongueur= 5;
 
 /**
  * dimension de la carte en y 
  */
 private static int hauteurcarte = 30;
 private static int pixelcasehauteur= 5;
 
 /**
  * map
  */	
 
  
 public  Case xcase[][];
 
 
 
 public static int getLongueurCarte () {
	 
	 return Longueurcarte;
 }
public static int getHauteurCarte () {
	 
	 return hauteurcarte;
 }

public static void setLongueurcarte (int x)
{
	 
	 Longueurcarte = 30 ;
}
public  static void sethauteurcarte (int x) 
{
	 
	 hauteurcarte = 30;
}

public static int getpixelcaselongueur () 
{
	 
	 return pixelcaselongueur;
}

public static int getpixelcasehauteur () 
{
	 
	 return pixelcasehauteur;
}

public static void setpixelcaselongueur (int x)
{
	 
	 pixelcaselongueur = x ;
}

public static void setpixelcasehauteur (int x)
{
	 
	 pixelcasehauteur = x;
}

 //constructeur
 
 public Terrain() {
	 
		 this.xcase = new Case[30][30];

		for(int numeroDeLigne = 0; numeroDeLigne < hauteurcarte; numeroDeLigne++)
		{
			for(int numeroDeColonne = 0; numeroDeColonne < Longueurcarte; numeroDeColonne++) 
			{
				 // Création d'un terrain vert
				 this.xcase[numeroDeLigne][numeroDeColonne]= new Case (numeroDeLigne, numeroDeColonne, 0); 
			}
		}
		for(int numeroDeLigne = 0; numeroDeLigne < hauteurcarte; numeroDeLigne++)
		{ this.xcase[numeroDeLigne][0]= new Case (numeroDeLigne, 0, 1); 
			this.xcase[numeroDeLigne][0].setCase("Rocher");
			this.xcase[numeroDeLigne][getLongueurCarte()-1]= new Case (numeroDeLigne, 0, 1);
			this.xcase[numeroDeLigne][getLongueurCarte()-1].setCase("Rocher");
		}
		for(int numeroDeColonne = 0; numeroDeColonne < Longueurcarte; numeroDeColonne++)
		{   this.xcase[0][numeroDeColonne]= new Case (0, numeroDeColonne, 1);
			this.xcase[0][numeroDeColonne].setCase("Rocher");
			this.xcase[getHauteurCarte()-1][numeroDeColonne]= new Case (getpixelcasehauteur()-1, numeroDeColonne, 1);
			this.xcase[getHauteurCarte()-1][numeroDeColonne].setCase("Rocher");
		}
			
	}

/**
 * bonus terrain
 */
public void AppliquerBonus()
{
	
}

/**
 * malus de terrain	
 */
public void AppliquerMalus()
{
	
}



public void display()
{
	
	for(int x = 0; x< Longueurcarte ; x++ ){
		for ( int y =0 ; y < hauteurcarte ; y++)
		{
			
		 System.out.print(this.xcase[x][y].typeDeCase);
		 
		}
	 System.out.println("");	
	}
}
		
}
		


