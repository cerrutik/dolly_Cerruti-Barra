package projets;

import java.util.*;

import comportement.Recruter;
/**
 * 
 * @author Benjamin, Jérémy,Gwen
 *
 */
public class Partie {

	public static void main(String[] args) {
		  Terrain terrain = new Terrain();
		  
		  Joueur joueur1 = new Joueur(1, 27 , 15, terrain); 
		  Joueur joueur2 = new Joueur(2, 1,  15, terrain);
		  int i;
		  int indiceNouvelleUnite;
		  Joueur joueurEnCours;
		  joueurEnCours = joueur1;
		  terrain.display();
		  boolean tour = true;
		  		
	System.out.println("A vous de jouer joueur :"+joueurEnCours);
	do
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir une action :");
		System.out.println("Parmis Recruter/Construire/Déplacer/fintour");
		String Action1 = sc.nextLine();
		while(joueurEnCours.getStockOr() >20 && joueurEnCours.getStockNourriture() >20)
		{		
			if(Action1.equals("Recruter"))
			{				
				System.out.println("Veuillez choisir une unité");
				System.out.println("Parmis Archer/Guerrier/Cavalier/Villageois");
				String Action2 = sc.nextLine();
				
				if ( Action2.equals("Archer"))
				{
					i=0;					
					int coordx = sc.nextInt();
					int coordy = sc.nextInt();
					boolean trouv = false;
					while(i< joueurEnCours.nConstruction && !trouv)
					{
						if( joueurEnCours.constructions[i].getCoordonnee_x() == coordx && joueurEnCours.constructions[i].getCoordonnee_y() == coordy && joueurEnCours.constructions[i] instanceof CampTirArc)
						{
							trouv = true ;
						}
						i++;
					}
					i--;
					
					if(i<joueurEnCours.nConstruction && trouv )
					{						
						Verifcase verif = new Verifcase();
						int coor[] = new int[2]; 
						coor = verif.Click(joueurEnCours.constructions[i].getCoordonnee_x(),joueurEnCours.constructions[i].getCoordonnee_y(),0);  								
						joueurEnCours.constructions[i].recruter(joueurEnCours);
						indiceNouvelleUnite =  joueurEnCours.nUnite - 1;
						joueurEnCours.unite[indiceNouvelleUnite].coordonnee_x = coor[0];
						joueurEnCours.unite[indiceNouvelleUnite].coordonnee_y = coor[1];
					}
					else
						System.out.println("Vous n'avez pas de camp de tir à l'arc opérationnel");
					terrain.display();
				}
				
				if ( Action2.equals("Guerrier"))
				{
					
					i=0;
					int coordx = sc.nextInt();
					int coordy = sc.nextInt();
					boolean trouv = false;
					while(i< joueurEnCours.nConstruction && !trouv)
					{
						if( joueurEnCours.constructions[i].getCoordonnee_x() == coordx && joueurEnCours.constructions[i].getCoordonnee_y() == coordy && joueurEnCours.constructions[i] instanceof Caserne)
						{
							trouv = true ;
						}
						i++;
					}
					i--;
					
					if(i<joueurEnCours.nConstruction && trouv)
					{
						Verifcase verif = new Verifcase();
						 int coor[] = new int[2]; 
						coor = verif.Click(joueurEnCours.constructions[i].getCoordonnee_x(),joueurEnCours.constructions[i].getCoordonnee_y(),0);  
								
						joueurEnCours.constructions[i].recruter(joueurEnCours);
						indiceNouvelleUnite =  joueurEnCours.nUnite - 1;
						joueurEnCours.unite[indiceNouvelleUnite].coordonnee_x = coor[0];
						joueurEnCours.unite[indiceNouvelleUnite].coordonnee_y = coor[1];
					}
					else
						System.out.println("Vous n'avez pas de caserne opérationnelle");
					terrain.display();
				}
				
				if ( Action2.equals("Cavalier"))
				{
					 i = 0;
					int coordx = sc.nextInt();
					int coordy = sc.nextInt();
					boolean trouv = false;
					while(i< joueurEnCours.nConstruction && !trouv)
					{
						if( joueurEnCours.constructions[i].getCoordonnee_x() == coordx && joueurEnCours.constructions[i].getCoordonnee_y() == coordy && joueurEnCours.constructions[i] instanceof Ecurie)
						{
							trouv = true ;
						}
						i++;
					}
					i--;
					
					if(i<joueurEnCours.nConstruction && trouv)
					{
						Verifcase verif = new Verifcase();
						 int coor[] = new int[2]; 
						coor = verif.Click(joueurEnCours.constructions[i].getCoordonnee_x(),joueurEnCours.constructions[i].getCoordonnee_y(),0);  
								
						joueurEnCours.constructions[i].recruter(joueurEnCours);
						indiceNouvelleUnite =  joueurEnCours.nUnite - 1;
						joueurEnCours.unite[indiceNouvelleUnite].coordonnee_x = coor[0];
						joueurEnCours.unite[indiceNouvelleUnite].coordonnee_y = coor[1];
					}
					else
						System.out.println("Vous n'avez pas d'écurie opérationnelle");
					terrain.display();
				}
				
				if ( Action2.equals("Villageois"))
				{
					i = 0;
					int coordx = sc.nextInt();
					int coordy = sc.nextInt();
					boolean trouv = false;
					while(i< joueurEnCours.nConstruction && !trouv)
					{
						if( joueurEnCours.constructions[i].getCoordonnee_x() == coordx && joueurEnCours.constructions[i].getCoordonnee_y() == coordy && joueurEnCours.constructions[i] instanceof Forum)
						{
							trouv = true ;
						}
						i++;
					}
					i--;
					
					if(i<joueurEnCours.nConstruction && trouv)
					{
						int a =0;
						int b = 0;
						Verifcase verif = new Verifcase();
						int coor[] = new int[2]; 
						coor = verif.Click(joueurEnCours.constructions[i].getCoordonnee_x(),joueurEnCours.constructions[i].getCoordonnee_y(),0);  								
						joueurEnCours.constructions[i].recruter(joueurEnCours);
						indiceNouvelleUnite =  joueurEnCours.nVillageois - 1;
						joueurEnCours.villageois[indiceNouvelleUnite].coordonnee_x = coor[0];
						joueurEnCours.villageois[indiceNouvelleUnite].coordonnee_y = coor[1];											
					}
					else
						System.out.println("Bon sang, où est votre forum ?!");
					terrain.display();
				}
			}
		
		if (Action1.equals("Construire"))
			{		
				int nVillageois = 0;
				int j =0;				
				i = 0;
				System.out.println("première coordonnée du villageois");
				int coordx = sc.nextInt();
				System.out.println("deuxième coordonnée du villageois");
				int coordy = sc.nextInt();
				boolean trouv = false;
				while(i< joueurEnCours.nVillageois && !trouv)
				{
					if( joueurEnCours.villageois[i].getCoordonnee_x() == coordx && joueurEnCours.villageois[i].getCoordonnee_y() == coordy && joueurEnCours.villageois[i] instanceof Villageois)
					{
						trouv = true ;
					}
					i++;
				}
				i--;
			    
				System.out.println("Veuillez choisir un batiment");
				sc.nextLine();
				String Action3 = sc.nextLine();
				
				if ( Action3.equals("Caserne") && trouv )
				{					
					joueurEnCours.villageois[j].construireCaserne(joueurEnCours); 
					terrain.display();					
				}
				
				if ( Action3.equals("Ecurie") && trouv)
				{					
					joueurEnCours.villageois[j].construireEcurie(joueurEnCours);
					terrain.display();
				}
				
				if ( Action3.equals("CampTirArc") && trouv)
				{					
					joueurEnCours.villageois[j].construireCampTirArc(joueurEnCours);
					terrain.display();
				}
				
				if ( Action3.equals("Mine") && trouv)
				{					
					joueurEnCours.villageois[j].construireMine(joueurEnCours);
					terrain.display();
				}
				
				if ( Action3.equals("Moulin") && trouv)
				{					
					joueurEnCours.villageois[j].construireMoulin(joueurEnCours);
					terrain.display();
				}
				
				if ( Action3.equals("Ferme") && trouv)
				{					
					joueurEnCours.villageois[j].construireFerme(joueurEnCours);
					terrain.display();
				}
			}
	}
	
		if (Action1.equals("Deplacer"))
		{		
			i =0 ;
			
			System.out.println("Veuillez entrée la première coordonnée X");
			int Action5 = sc.nextInt();			
			System.out.println("Veuillez entrée la première coordonnée Y");
			int Action6 = sc.nextInt();
			boolean trouv = false;
			boolean villageois = false;
			while(i< joueurEnCours.nUnite && !trouv)
			{
				if( joueurEnCours.unite[i].getCoordonnee_x() == Action5 && joueurEnCours.unite[i].getCoordonnee_y() == Action6  )
				{
					trouv = true ;
				}
				i++;
			}
			i--;
			if ( !trouv )
			{
				i = 0;
			}
			while(i< joueurEnCours.nVillageois && !trouv)
			{
				if( joueurEnCours.villageois[i].getCoordonnee_x() == Action5 && joueurEnCours.villageois[i].getCoordonnee_y() == Action6 )
				{
					trouv = true ;
					villageois = true;
				}
				i++;
			}
			i--;
			if ( trouv)
			{
				if ( villageois )
				{
					joueurEnCours.villageois[i].seDeplacer(Action5,Action6);
					terrain.display();
				}
				joueurEnCours.unite[i].seDeplacer(Action5,Action6);
				terrain.display();				
			}
			
		if (Action1.equals("Fintour"))
			{
				if(joueurEnCours == joueur1)
				{
					joueurEnCours = joueur2;
			        System.out.println("C'est à vous de jouer joueur 2 !");
				}
				 else
				    {
				        joueurEnCours = joueur1;
				        System.out.println("C'est à vous de jouer joueur 1 !"); 
				    }
				
		}
		}
		
		}while( joueur1.isAlive() && joueur2.isAlive());	  
}
}

	



