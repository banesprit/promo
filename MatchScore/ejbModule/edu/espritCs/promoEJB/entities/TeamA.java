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
	public class TeamA implements Serializable {

		
		private int idTeamA;
		private String nameTeamA;
		private String paysA;
		private static final long serialVersionUID = 1L;
		
		private List<Match> matchs;
		
		@OneToMany(mappedBy="teamA")
		public List<Match> getMatchs() {
			return matchs;
		}

		public void setMatchs(List<Match> matchs) {
			this.matchs = matchs;
		}

		public TeamA() {
			super();
		} 
		
		@Id 
		public int getIdTeamA() {
			return this.idTeamA;
		}

		public void setIdTeamA(int idTeamA) {
			this.idTeamA = idTeamA;
		}   
		public String getNameTeamA() {
			return this.nameTeamA;
		}

		public void setNameTeamA(String nameTeamA) {
			this.nameTeamA = nameTeamA;
		}

		public String getPaysA() {
			return paysA;
		}

		public void setPaysA(String paysA) {
			this.paysA = paysA;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
	   
	}

