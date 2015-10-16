package comportement;

import projets.*;
/**
 * 
 * @author Gwen
 *
 */
public interface Construction
{
	public CampTirArc construireCampTirArc(Joueur j);
	public Caserne construireCaserne(Joueur j);
	public Ecurie construireEcurie(Joueur j);
	public Ferme construireFerme(Joueur j);
	public Mine construireMine(Joueur j);
	public Moulin construireMoulin(Joueur j);
}
