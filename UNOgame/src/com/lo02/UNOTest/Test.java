package com.lo02.UNOTest;

import java.util.ArrayList;

import com.lo02.UNO.core.cartes.*;
import com.lo02.UNO.core.*;

public class Test {

	public static void TestLabel () {
		for (Label l : Label.values())
			System.out.println("carte : " + l.label() + ", point : " + l.valeur());
		
	}
	
	public static void TestCouleur () {
		for (Couleur c : Couleur.values())
			System.out.println(c);
	}
	
	public static void TestPioche () {
		Pioche pioche = Pioche.getInstancePioche();
		for (Carte carte : pioche)
			System.out.println(carte.getCouleur() + " : " + carte.getLabel().label());
	}
	
	public static void TestDistribution () {
		ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
		joueurs.add(new Joueur("Ano1"));
		joueurs.add(new Joueur("Ano2"));
		joueurs.add(new Joueur("Ano3"));
		
		Manche manche = new Manche(joueurs);
		for (Joueur joueur : joueurs) {
			joueur.AfficherMain();
			System.out.print("\n");
		}
		
		
		
	}
	
	public static void main(String[] args) {
		//TestLabel();
		//TestCouleur();
		//TestPioche();
		TestDistribution();
	}

}