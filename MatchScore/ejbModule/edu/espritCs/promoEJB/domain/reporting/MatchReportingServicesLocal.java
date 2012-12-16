package edu.espritCs.promoEJB.domain.reporting;

import java.util.List;

import javax.ejb.Local;

import edu.espritCs.promoEJB.entities.Match;

@Local
public interface MatchReportingServicesLocal {

	
	
	public List<Match> findAllMatchsByTeamId(int idTeam);
	
	public void displayMatchByTeamId(int idTeam);
	
	public Match findMatchByRef(int idMatch); 
	

	public List<Match> findAllMatchs();



}
