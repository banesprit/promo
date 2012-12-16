package edu.espritCs.promoEJB.domain.reporting;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.espritCs.promoEJB.entities.Match;

/**
 * Session Bean implementation class ClaimReportingServices
 */
@Stateless
public class MatchReportingServices implements MatchReportingServicesRemote,
		MatchReportingServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	public MatchReportingServices() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Match> findAllMatchsByTeamId(int idTeam) {
		Query query = entityManager
				.createQuery("select c from Match c where c.teamA.idTeamA=:idTeam or c.teamE.idTeamE=:idTeam");
		query.setParameter("idteam",idTeam);

		return query.getResultList();
	}

	@Override
	public void displayMatchByTeamId(int idTeam) {
		List<Match> matchs = findAllMatchsByTeamId(idTeam);

		for (Match c : matchs) {

			System.out.println(c.getDescriptionMatch()+" The winner is the team :"+c.getScore());

		}
	}

	@Override
	public Match findMatchByRef(int idMatch) {
		return entityManager.find(Match.class, idMatch);
	}

	@Override
	public List<Match> findAllMatchs() {
		return entityManager.createQuery("select c from Match c").getResultList();
	}

}
