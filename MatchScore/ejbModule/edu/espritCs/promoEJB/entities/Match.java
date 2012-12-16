package edu.espritCs.promoEJB.entities;





	import java.io.Serializable;
	import java.util.Date;

	import javax.persistence.CascadeType;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.ManyToOne;




	@Entity
	public class Match implements Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private int idMatch;
		private TeamA teamA;
		private String DescriptionMatch;
		private TeamE teamE;
		private Date dateMatch;
		private int score; 
		
				
		@Id
		public int getIdMatch() {
			return idMatch;
		}
		public void setIdMatch(int idMatch) {
			this.idMatch = idMatch;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		public Date getDateMatch() {
			return dateMatch;
		}
		public void setDateMatch(Date dateMatch) {
			this.dateMatch = dateMatch;
		}
				
		@ManyToOne(cascade=CascadeType.PERSIST)
		public TeamA getTeamA() {
			return teamA;
		}
		public void setTeamA(TeamA teamA) {
			this.teamA = teamA;
		}
		@ManyToOne(cascade=CascadeType.PERSIST)
		public TeamE getteamE() {
			return teamE;
		}
		public void setTeamE(TeamE teamE) {
			this.teamE = teamE;
		}
		
		public int getDescriptionMatch() {
			return idMatch;
		}
		public void setDescriptionMatch(String descriptionMatch) {
			this.DescriptionMatch = descriptionMatch;
		}
		
		
	}

	

