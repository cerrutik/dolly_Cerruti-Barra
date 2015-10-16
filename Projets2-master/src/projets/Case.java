package projets;
import javax.swing.JFrame;
/**
 * author benjamin
 * 
 * 
 */



import java.awt.color.*;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import IHM.Fenetre;
import IHM.ImagePanel;
public class Case {
	
public int typeDeCase;

// Coordonnees
public int x,y ;

public Case(int xx , int xy, int xtypeDeCase)
{
	this.x = xx;
	this.y = xy;
	this.typeDeCase = xtypeDeCase;
			
}

public void setCase(Unite typeUnite)
{
	if(typeUnite.getPointAttaque() == 30)
	{
		this.typeDeCase = 2;
	}
}

public void setCase(String sol)
{
	if(sol == "Herbe")
	{
		this.typeDeCase = 0;
	}
    if(sol.equals("Rocher"))
    {
    	this.typeDeCase = 1;
    }
    
}

public void paintComponent(Graphics g)
{
	switch (typeDeCase)
	{
		case 0:
			Color vert = new Color(0, 255, 0);
			g.setColor(vert);
			g.fillRect(this.x * Terrain.getpixelcaselongueur(), this.y * Terrain.getpixelcasehauteur (), Terrain.getpixelcaselongueur(), Terrain.getpixelcasehauteur() );
			
			break;
		case 1:
			Color brun = new Color(136, 66, 29);
			g.setColor(brun);
			g.fillRect(this.x * Terrain.getpixelcaselongueur(), this.y * Terrain.getpixelcasehauteur (), Terrain.getpixelcaselongueur(), Terrain.getpixelcasehauteur() );
			break;
		case 2:
			try {
			      Image img = ImageIO.read(new File("guerrier.png"));
			      g.drawImage(img, this.x * Terrain.getpixelcaselongueur(), this.y * Terrain.getpixelcasehauteur (), Terrain.getpixelcaselongueur(), Terrain.getpixelcasehauteur(), Fenetre.pan);
			     
			    } catch (IOException e) {
			      e.printStackTrace();
			    } 
			break;
		
		case 3:
			try{
				 Image img = ImageIO.read(new File("Archer.png"));
			      g.drawImage(img, this.x * Terrain.getpixelcaselongueur(), this.y * Terrain.getpixelcasehauteur (), Terrain.getpixelcaselongueur(), Terrain.getpixelcasehauteur(), Fenetre.pan);
			      
			    } catch (IOException e) {
			      e.printStackTrace();
			    } 
			break;
		
		case 4:
			try{
				 Image img = ImageIO.read(new File("Cavalier.png"));
			      g.drawImage(img, this.x * Terrain.getpixelcaselongueur(), this.y * Terrain.getpixelcasehauteur (), Terrain.getpixelcaselongueur(), Terrain.getpixelcasehauteur(), Fenetre.pan);
			      
			    } catch (IOException e) {
			      e.printStackTrace();
			    } 
			break;
		case 5:
			try{
				 Image img = ImageIO.read(new File("Villageois.png"));
			      g.drawImage(img, this.x * Terrain.getpixelcaselongueur(), this.y * Terrain.getpixelcasehauteur (), Terrain.getpixelcaselongueur(), Terrain.getpixelcasehauteur(), Fenetre.pan);
			      
			    } catch (IOException e) {
			      e.printStackTrace();
			    } 
			break;
		case 6:
			try{
				 Image img = ImageIO.read(new File("forum.png"));
			      g.drawImage(img, this.x * Terrain.getpixelcaselongueur(), this.y * Terrain.getpixelcasehauteur (), Terrain.getpixelcaselongueur(), Terrain.getpixelcasehauteur(), Fenetre.pan);
			      
			    } catch (IOException e) {
			      e.printStackTrace();
			    } 
			break;
		case 7:
			try{
				 Image img = ImageIO.read(new File("mine.png"));
			      g.drawImage(img, this.x * Terrain.getpixelcaselongueur(), this.y * Terrain.getpixelcasehauteur (), Terrain.getpixelcaselongueur(), Terrain.getpixelcasehauteur(), Fenetre.pan);
			      
			    } catch (IOException e) {
			      e.printStackTrace();
			    } 
			break;
		case 8:
			try{
				 Image img = ImageIO.read(new File("ferme.png"));
			      g.drawImage(img, this.x * Terrain.getpixelcaselongueur(), this.y * Terrain.getpixelcasehauteur (), Terrain.getpixelcaselongueur(), Terrain.getpixelcasehauteur(), Fenetre.pan);
			      
			    } catch (IOException e) {
			      e.printStackTrace();
			    } 
			break;
		case 9:
			try{
				 Image img = ImageIO.read(new File("moulin.png"));
			      g.drawImage(img, this.x * Terrain.getpixelcaselongueur(), this.y * Terrain.getpixelcasehauteur (), Terrain.getpixelcaselongueur(), Terrain.getpixelcasehauteur(), Fenetre.pan);
			      
			    } catch (IOException e) {
			      e.printStackTrace();
			    } 
			break;
		case 12:
			try{
				 Image img = ImageIO.read(new File("caserne.png"));
			      g.drawImage(img, this.x * Terrain.getpixelcaselongueur(), this.y * Terrain.getpixelcasehauteur (), Terrain.getpixelcaselongueur(), Terrain.getpixelcasehauteur(), Fenetre.pan);
			      
			    } catch (IOException e) {
			      e.printStackTrace();
			    } 
			break;
		case 10:
			try{
				 Image img = ImageIO.read(new File("caserne.jpg"));//ecurie
			      g.drawImage(img, this.x * Terrain.getpixelcaselongueur(), this.y * Terrain.getpixelcasehauteur (), Terrain.getpixelcaselongueur(), Terrain.getpixelcasehauteur(), Fenetre.pan);
			      
			    } catch (IOException e) {
			      e.printStackTrace();
			    } 
			break;
		case 11:
			try{
				 Image img = ImageIO.read(new File("camptirArc.png"));
			      g.drawImage(img, this.x * Terrain.getpixelcaselongueur(), this.y * Terrain.getpixelcasehauteur (), Terrain.getpixelcaselongueur(), Terrain.getpixelcasehauteur(), Fenetre.pan);
			      
			    } catch (IOException e) {
			      e.printStackTrace();
			    } 
			break;
		 default: break;
	}}
}



