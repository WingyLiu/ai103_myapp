package fr.afcepf.ai103.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean //de jsf2, non logique par défaut = "calculBean"
			// nom de la classe en minuscule
@RequestScoped
public class CalculBean {
	private Double x; // a saisir
	private Double res; // resultat à afficher
	
	
	// methodes
	public String calculerRacine() {
		this.res = Math.sqrt(this.x);
		return null; //rester sur la meme page pour afficher le resultat
	}
	
	
	
	//+get/set
	public Double getX() {
		return x;
	}
	public void setX(Double x) {
		this.x = x;
	}
	public Double getRes() {
		return res;
	}
	public void setRes(Double res) {
		this.res = res;
	}
	

	

	

}
