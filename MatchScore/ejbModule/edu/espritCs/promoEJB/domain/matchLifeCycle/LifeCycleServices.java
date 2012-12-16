package edu.espritCs.promoEJB.domain.matchLifeCycle;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.espritCs.promoEJB.entities.Match;
import edu.espritCs.promoEJB.entities.TeamA;
import edu.espritCs.promoEJB.entities.TeamE;
import edu.espritCs.promoEJB.domain.matchLifeCycle.LifeCycleServicesLocal;
import edu.espritCs.promoEJB.domain.matchLifeCycle.LifeCycleServicesRemote;

/**
 * Session Bean implementation class LifeCycleServices
 */
@Stateless
public class LifeCycleServices implements LifeCycleServicesRemote,
		LifeCycleServicesLocal {

    /**
     * Default constructor. 
     */

    @PersistenceContext
	private EntityManager entityManager;

	public LifeCycleServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createMatchByTeam(Match match, TeamA teamA,TeamE teamE) {
		match.setTeamA(teamA);
		match.setTeamE(teamE);
		entityManager.persist(match);

	}

	@Override
	public Boolean operationOnMatch(int idMatch, int newScore) {
		Match match = entityManager.find(Match.class, idMatch);
		match.setScore(newScore);
		
		try {
			entityManager.merge(match);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public void createMatch(Match match) {
		entityManager.persist(match);
		
	}

	@Override
	public void deleteMatchById(int idMatch) {
		entityManager.remove(entityManager.find(Match.class, idMatch));
		
	}

	@Override
	public void updateMatch(Match match) {
		entityManager.merge(match);
		
	}

	

}
