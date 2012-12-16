package edu.espritCs.promoEJB.domain.management;

import java.util.List;

import javax.ejb.Local;

import edu.espritCs.promoEJB.entities.TeamA;
import edu.espritCs.promoEJB.entities.TeamE;

@Local
public interface ManagementServicesLocal {
	public void createTeamE(TeamE teamE);

	public void updateTeamE(TeamE teamE);

	public void deleteTeamE(TeamE teamE);

	public TeamE getTeamEbyId(int id);

	public List<TeamE> getAllTeamEbyId();
	
	public void createTeamA(TeamA teamA);

	public void updateTeamA(TeamA teamA);

	public void deleteTeamA(TeamA teamA);

	public TeamA getTeamAbyId(int id);

	public List<TeamA> getAllTeamAbyId();
}
