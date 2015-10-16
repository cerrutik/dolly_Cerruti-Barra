package IHM;

//

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



/**
 * This class allows the creation of the checkerboard/grid which we shall find in the class Fenetre
 * @author Nico
 *
 */
 
public class ImagePanel extends JPanel implements ActionListener {
	/**
	 * this table of Jbutton represent the grid
	 */
	JButton[][] tab = new JButton[20][20];
	/**
	 * thanks this table of integer we can Identify a button when the player click on
	 */
	int[][] inte = new int[20][20];
	
	/**
	 * a JOptionpane when the player click 
	 */
	JOptionPane dep = new JOptionPane();
	public TextField text = new TextField(20);
    //private static final long serialVersionUID = 1L;
    
    
  /**
   * create a table for the types of unités and batiments.
   */
    private String[] Types = {"Vide","Archer","Guerrier","Cavalier","Villageois","Moulin","Mine","Forum","Ferme","Ecurie","Caserne","CampTirArc"};
                             //  0        1       2            3           4          5       6       7       8      9         10         11
    /**
     * The various possible actions for "unités"
     */
    private String[] action = {"Attaquer", "Déplacement","Rien"};
    /**
     * The various possible actions for buildings
     */
    private String[] batiment = {"Créer Unité","Rien"};
    /**
     * /**
     * The various possible actions for "villageois"
     */
    
    private String[] villageoi = {"Construire","Déplacement","Rien"};
    /**
     * @param args
     * @author Nico
     */

   
 
    private Image img;
	private int i,j;
     
	
	public ImagePanel(Image img){
        //this.img = img;
		/**
		 * the grid is a grid 20buttons on 20buttons.
		 */
        this.setLayout(new GridLayout(20,20));
      //  int j;
      /**
       * the integer i represent the line 
       */ 
        for (i=0; i<20; i++){
        	/**
        	 * the integer j represent the column 
        	 */
        	for(j=0;j<20;j++){
        		/**
        		 * the unités for the player1 at the start.
        		 */
        		if (i == 18 && j == 16)
        		{tab[i][j] = new JButton(new ImageIcon("cavalier.png"));
        		inte[i][j] = 3;
        		add(tab[i][j]);

        		tab[i][j].addActionListener(this);
			}
    			else if (i == 18 && j == 17)
    			{tab[i][j] = new JButton(new ImageIcon("guerrier.png"));
    			inte[i][j] = 2;
				 add(tab[i][j]);

         		tab[i][j].addActionListener(this);
			}
    			else if (i == 18 && j == 18)
    			{tab[i][j] = new JButton(new ImageIcon("archer.png"));
    			inte[i][j] = 1;
				 add(tab[i][j]);

         		tab[i][j].addActionListener(this);
			}
    			else if (i == 18 && j == 15)
    			{tab[i][j] = new JButton(new ImageIcon("villeageois.png"));
    			inte[i][j] = 4;
				 add(tab[i][j]);

         		tab[i][j].addActionListener(this);}

        		/**
        		 * the unités for the player2 at the start.
        		 */
    			else if (i == 1 && j == 1)
    			{tab[i][j] = new JButton(new ImageIcon("cavalier.png"));
    			inte[i][j] = 3;
				 add(tab[i][j]);

         		tab[i][j].addActionListener(this);
				 
			}
    			else if (i == 1 && j == 2)
    			{tab[i][j] = new JButton(new ImageIcon("guerrier.png"));
    			inte[i][j] = 2;
    			
				 add(tab[i][j]);

         		tab[i][j].addActionListener(this);
			}
    			else if (i == 1 && j == 3)
    			{tab[i][j] = new JButton(new ImageIcon("archer.png"));
    			inte[i][j] = 1;
    				add(tab[i][j]);

            		tab[i][j].addActionListener(this);
    			}
    			else if (i == 1 && j == 4)
    			{tab[i][j] = new JButton(new ImageIcon("villeageois.png"));
    			inte[i][j] = 4;
				 add(tab[i][j]);
				 tab[i][j].addActionListener(this);}

        		
        		/**
        		 * crete a button with the pics "map2.jpg" when the caseis empty.
        		 */

    			else	
    				{tab[i][j]= new JButton(new ImageIcon("map2.jpg"));
    				inte[i][j] = 0;
    				
    				
            		add(tab[i][j]);
            		tab[i][j].addActionListener(this);
    				}

        	
        }}

       
    }
    
 
/**
 * the actionperformed method for listen the differents buttons
 */
 
    public void actionPerformed(ActionEvent arg0) {
        Object source = arg0.getSource();
             
     
          
            for (int i=0; i<20; i++){
                for(int j=0; j<20; j++){
                    if(source.equals(tab[i][j])){
                   
                        /**
                         * if the button is a "cavalier"
                         */
                        if (Types[inte[i][j]] == "Cavalier"){
                        	System.out.println("cavalier");
                     		{int t = dep.showOptionDialog(null, 
                     				"Veuillez indiquer votre action",
                     				"Action",
                     				JOptionPane.YES_NO_CANCEL_OPTION,
                     				JOptionPane.QUESTION_MESSAGE,
                     				null,
                     				action,
                     				action[2]);}}
                        /**
                         * if teh button is an "archer"
                         */
                        else if (Types[inte[i][j]] == "Archer"){
                                  System.out.println("archer");
                                  		{int t = dep.showOptionDialog(null, 
                                  					"Veuillez indiquer votre action",
                                  					"Actions",
                                  					JOptionPane.YES_NO_CANCEL_OPTION,
                                  					JOptionPane.QUESTION_MESSAGE,
                                  					null,
                                  					action,
                                  					action[2]);}}
                        /**
                         * if the button is a "guerrier"
                         */
                         else if (Types[inte[i][j]] == "Guerrier"){
                                      System.out.println("guerrier");
                                      {int t = dep.showOptionDialog(null, 
                            					"Veuillez indiquer votre action",
                            					"Actions",
                            					JOptionPane.YES_NO_CANCEL_OPTION,
                            					JOptionPane.QUESTION_MESSAGE,
                            					null,
                            					action,
                            					action[2]);}}
                        /**
                         * if the button is a villageois
                         */
                      
                         else if (Types[inte[i][j]] == "Villageois"){
                        	 System.out.println("Villageois");
                        	 			{int t = dep.showOptionDialog(null, 
                        	 					"Veuillez indiquer votre action",
                        	 					"Actions",
                        	 					JOptionPane.YES_NO_CANCEL_OPTION,
                        	 					JOptionPane.QUESTION_MESSAGE,
                        	 					null,
                        	 					villageoi,
                        	 					villageoi[2]);}}
                        
                        
                        /**
                         * if the button is a "moulin" 
                         */
                         else if (Types[inte[i][j]] == "Moulin"){
                        	 System.out.println("Moulin");
                        	 			{int t = dep.showOptionDialog(null, 
                        	 					"Veuillez indiquer votre action",
                        	 					"Actions",
                        	 					JOptionPane.YES_NO_CANCEL_OPTION,
                        	 					JOptionPane.QUESTION_MESSAGE,
                        	 					null,
                        	 					batiment,
                        	 					batiment[1]);}}
                        
                        /**
                         * if the button is a "mine"
                         */
                         else if (Types[inte[i][j]] == "Mine"){
                        	 System.out.println("Mine");
                        	 			{int t = dep.showOptionDialog(null, 
                        	 					"Veuillez indiquer votre action",
                        	 					"Actions",
                        	 					JOptionPane.YES_NO_CANCEL_OPTION,
                        	 					JOptionPane.QUESTION_MESSAGE,
                        	 					null,
                        	 					batiment,
                        	 					batiment[1]);}}
                        /** 
                         * if the button is a "ferme"
                         */
                         else if (Types[inte[i][j]] == "Ferme"){
                        	 System.out.println("Ferme");
                        	 			{int t = dep.showOptionDialog(null, 
                        	 					"Veuillez indiquer votre action",
                        	 					"Actions",
                        	 					JOptionPane.YES_NO_CANCEL_OPTION,
                        	 					JOptionPane.QUESTION_MESSAGE,
                        	 					null,
                        	 					batiment,
                        	 					batiment[1]);}}
                        
                        /**
                         * if the buttonis a "caserne" 
                         */
                         else if (Types[inte[i][j]] == "Caserne"){
                        	 System.out.println("caserne");
                        	 			{int t = dep.showOptionDialog(null, 
                        	 					"Veuillez indiquer votre action",
                        	 					"Actions",
                        	 					JOptionPane.YES_NO_CANCEL_OPTION,
                        	 					JOptionPane.QUESTION_MESSAGE,
                        	 					null,
                        	 					batiment,
                        	 					batiment[1]);}}
                        
                        /**
                         * if the button is "campTirArc"
                         */
                         else if (Types[inte[i][j]] == "CampTirArc"){
                        	 System.out.println("CampTirArc");
                        	 			{int t = dep.showOptionDialog(null, 
                        	 					"Veuillez indiquer votre action",
                        	 					"Actions",
                        	 					JOptionPane.YES_NO_CANCEL_OPTION,
                        	 					JOptionPane.QUESTION_MESSAGE,
                        	 					null,
                        	 					batiment,
                        	 					batiment[1]);}}
                        /**
                         * if the button if an empty button
                         */
                         else  
                    System.out.println("Vide");
                        
                     
}}
    }  
           
            
    }}
     