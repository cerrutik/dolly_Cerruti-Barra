package IHM;   
import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import projets.Partie;
import projets.Terrain;
/**
 * this class create the windows of the application.
 * @author Nico
 *
 */

public class Fenetre extends JFrame implements ActionListener
{
  private static final String G = null;
  public static ImageObserver pan;
  private JMenuBar menuBar = new JMenuBar();
  private JMenu Menu = new JMenu("Menu");
  
  /**
   * the JMenuItem for the menu, the player can start a new game, check the info and close the game.
   */
  
  private JMenuItem nouvellepartie = new JMenuItem("Nouvelle Partie");
  private JMenuItem fermer = new JMenuItem("Fermer");
  private JMenuItem aPropos = new JMenuItem("A propos");
  private JButton finDeTour = new JButton("Fin de tour");
 
  public Fenetre()
  {
	/**
	* the game's title
	*/
	this.setTitle("Cults and Kingdoms");
	
	/**
	 * the size of the windows is 800px*800px
	 */
	
    this.setSize(800, 800);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    
    /**
     * Initialization of the menu   and
     * addittion of "nouvellepartie" to "Menu"
     */
    
    this.Menu.add(nouvellepartie);
    nouvellepartie.addActionListener(this);

    /**
     * create a separator
     */
    
    this.Menu.addSeparator();
    fermer.addActionListener(new ActionListener()
   
    /**
     * when the player choose the  button "fermer",the application stop.
     */
    
      {
    	public void actionPerformed(ActionEvent arg0) 
    	{
    		System.exit(0);
    	}        
      });    
   
    /**
     * addittion of "apropos" to "Menu"
     */
    
    this.Menu.add(aPropos);
    this.aPropos.addActionListener(this);    
   
    /**
     * create a separator
     */
    
    this.Menu.addSeparator();
    
    /**
     * addittion of "fermer" to "Menu"
     */
    
    this.Menu.add(fermer);  
   
    /**
    * addittion of "menu" to the menubar
    */
    
    this.menuBar.add(Menu);
    
    /**
     * Addition of the menubar has the window
     */
    
    this.setJMenuBar(menuBar);       
    
    /**
     * map
     */
    
    affichageterrain afg = new affichageterrain();
    JPanel pan = new JPanel(new BorderLayout());  
    pan.add(afg);
    
    /**
     * create the first panel
     */
    
    pan.add(new ImagePanel(new ImageIcon("map.jpg").getImage()));
    
    /**
     * create a new panel, pan2
     */
    
     JPanel pan2 = new JPanel();
     
     /**
      * create a gridLayout 1*1 for the second panel
      */
     
     pan2.setLayout(new GridLayout(1,1));
     
     /**
      * add the button "Fin de tour" for the second panel
      */
     
     pan2.add(finDeTour);
     finDeTour.addActionListener(this);
    
     /**
     * create the JSplitPane for the two panel, pan and pan2
     */
     
    JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, pan, pan2);
    split.setResizeWeight(1);  
    
    /**
     * the JSplitpane is on the Jframe and he use all the place 
     */
    
    this.getContentPane().add(split, BorderLayout.CENTER);
    
    /**
     * the windows is visible.
     */
    
    this.setVisible(true);
  }
  @Override
  
public void actionPerformed(ActionEvent event)
{   
    Object source = event.getSource();
    
    /**
     * when the player click on the menu and on the button "apropos", he can see a messageDialog.
     */
    
    if (source == this.aPropos)
    {      
        JOptionPane.showMessageDialog(this.aPropos , "Ce jeu a été créé dans le but du Projet S2", "A propos", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
    
    /**
     * if the player the button "nouvelle partie"he start a new game.
     */
    
    else if (source == this.nouvellepartie)
    {   	
	   //lancer un nouvellepartie.
    }
    
    /**
     * if the player the button "findetour". he say his time is over..
     */
	   
    else if (source == this.finDeTour) 
    {
    	/**
    	 * the player's turn is over !
    	 */
    	
    	JOptionPane jop1 = new JOptionPane();
        jop1.showMessageDialog(null, "Vous avez terminez votre tour !", "Information", JOptionPane.INFORMATION_MESSAGE, null); 
    	
    }	   
  }
 }
  

	 
	
