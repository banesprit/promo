package edu.espritCs.promoEJB.domain.reporting;

import java.util.List;

import javax.ejb.Remote;

import edu.espritCs.promoEJB.entities.Match;

@Remote
public interface MatchReportingServicesRemote {

	public List<Match> findAllMatchsByTeamId(int idTeam);
	
	public void displayMatchByTeamId(int idTeam);
	
	public Match findMatchByRef(int idMatch); 
	

	public List<Match> findAllMatchs();


}
