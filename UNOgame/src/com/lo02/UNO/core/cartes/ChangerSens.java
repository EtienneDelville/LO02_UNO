package com.lo02.UNO.core.cartes;

import com.lo02.UNO.core.Joueur;
import com.lo02.UNO.core.Manche;

public class ChangerSens extends Carte{
	
	public ChangerSens (Couleur couleur) {
		this.setCouleur(couleur);
		this.setLabel(Label.CHSENS);
	}
	
	public void action (Manche manche, Joueur joueur) {
		manche.changeSens();
	}
}
