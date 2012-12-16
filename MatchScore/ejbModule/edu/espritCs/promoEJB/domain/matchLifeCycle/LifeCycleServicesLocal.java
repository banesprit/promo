package edu.espritCs.promoEJB.domain.matchLifeCycle;

import javax.ejb.Local;

import edu.espritCs.promoEJB.entities.Match;
import edu.espritCs.promoEJB.entities.TeamA;
import edu.espritCs.promoEJB.entities.TeamE;

@Local
public interface LifeCycleServicesLocal {
	public void createMatchByTeam(Match match, TeamA teamA,TeamE teamE);

	public Boolean operationOnMatch(int idMatch, int newScore);
	

	public void createMatch(Match match);
	

	public void deleteMatchById(int idMatch);

	public void updateMatch(Match match);
}
