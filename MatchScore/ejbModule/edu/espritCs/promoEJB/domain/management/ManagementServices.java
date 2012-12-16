package edu.espritCs.promoEJB.domain.management;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.espritCs.promoEJB.domain.management.ManagementServicesLocal;
import edu.espritCs.promoEJB.domain.management.ManagementServicesRemote;
import edu.espritCs.promoEJB.entities.TeamA;
import edu.espritCs.promoEJB.entities.TeamE;

/**
 * Session Bean implementation class ManagementServices
 */
@Stateless
@LocalBean
public class ManagementServices implements ManagementServicesRemote,
ManagementServicesLocal {

@PersistenceContext
EntityManager entityManager;

/**
* Default constructor.
*/
public ManagementServices() {
// TODO Auto-generated constructor stub

}

@Override
public void createTeamE(TeamE teamE) {

entityManager.persist(teamE);
}

@Override
public void updateTeamE(TeamE teamE) {

entityManager.merge(teamE);
}

@Override
public void deleteTeamE(TeamE teamE) {

entityManager.remove(teamE);
}

@Override
public TeamE getTeamEbyId(int id) {

// entityManager.find(arg0, arg1)
return null;
}

@Override
public List<TeamE> getAllTeamEbyId() {

return null;
}

//TEAMA




@Override
public void createTeamA(TeamA teamA) {

entityManager.persist(teamA);
}

@Override
public void updateTeamA(TeamA teamA) {

entityManager.merge(teamA);
}

@Override
public void deleteTeamA(TeamA teamA) {

entityManager.remove(teamA);
}

@Override
public TeamA getTeamAbyId(int id) {

// entityManager.find(arg0, arg1)
return null;
}

@Override
public List<TeamA> getAllTeamAbyId() {

return null;
}



}
