package model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Model del comentari
 * @author zyro
 *
 */
@Entity
@Table
public class Comentari implements Serializable {
	@Id
	@Column
	private int id;
	@Column
	private String nom;
	@Column
	private char tipus;
	@Column
	private String temps;
	@Column
	private String km;
	@Column
	private String link;
	@Column
	private String imatge;
	@Column
	private String opinio;
	
	public Comentari() {
		
	}

	public Comentari( String nom, char tipus, String temps, String km, String link, String imatge, String opinio) {
		
		this.nom = nom;
		this.tipus = tipus;
		this.temps = temps;
		this.km = km;
		this.link = link;
		this.imatge = imatge;
		this.opinio = opinio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public char getTipus() {
		return tipus;
	}

	public void setTipus(char tipus) {
		this.tipus = tipus;
	}

	public String getTemps() {
		return temps;
	}

	public void setTemps(String temps) {
		this.temps = temps;
	}

	public String getKm() {
		return km;
	}

	public void setKm(String km) {
		this.km = km;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getImatge() {
		return imatge;
	}

	public void setImatge(String imatge) {
		this.imatge = imatge;
	}

	public String getOpinio() {
		return opinio;
	}

	public void setOpinio(String opinio) {
		this.opinio = opinio;
	}
	
	
	
}
