package edu.espritCs.promoEJB.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 * Entity implementation class for Entity: User
 *
 */
	
	@Entity
	public class TeamE implements Serializable {

		
		private int idTeamE;
		private String nameTeamE;
		private String paysE;
		private static final long serialVersionUID = 1L;
		
		private List<Match> matchs;
		
		@OneToMany(mappedBy="teamE")
		public List<Match> getMatchs() {
			return matchs;
		}

		public void setMatchs(List<Match> matchs) {
			this.matchs = matchs;
		}

		public TeamE() {
			super();
		} 
		
		@Id 
		public int getIdTeamE() {
			return this.idTeamE;
		}

		public void setIdTeamE(int idTeamE) {
			this.idTeamE = idTeamE;
		}   
		public String getNameTeamE() {
			return this.nameTeamE;
		}

		public void setNameTeamE(String nameTeamE) {
			this.nameTeamE = nameTeamE;
		}

		public String getPaysE() {
			return paysE;
		}

		public void setPaysA(String paysE) {
			this.paysE = paysE;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
	   
	}

