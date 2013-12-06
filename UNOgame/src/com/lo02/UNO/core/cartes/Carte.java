package com.lo02.UNO.core.cartes;

public class Carte {
	
	private Couleur couleur;
	private Label label;
	
	public Carte() {}
	
	public Carte(Carte carte) {
		this.couleur = carte.couleur;
		this.label = carte.label;
	}
	
	public Carte(Label label, Couleur couleur) {
		this.setCouleur(couleur);
		this.setLabel(label);
	}
	
	public void action() {}
	
	public boolean isPosableSur(Carte carte) {
		if (carte.getCouleur() == this.couleur)
			return true;
		if (carte.getCouleur() == Couleur.NOIR)
			return true;
		if (carte.getLabel() == this.label)
			return true;
		else
			return false;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}
}
