package gsb.tests.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gsb.modele.Visite;
import gsb.modele.dao.MedecinDao;
import gsb.modele.dao.VisiteDao;
import gsb.modele.dao.VisiteurDao;
import junit.framework.TestCase;

public class VisiteDaoTest extends TestCase {
	
	Visite uneVisite = new Visite("v0055", "14/10/2021", "", MedecinDao.rechercher("m001"), VisiteurDao.rechercher("a17"), "oui", "C3490");
	
	@Before
	protected final void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public final void testCreerVisite() {
		VisiteDao.creer(uneVisite);
		assertNotNull("Visite créée !", VisiteDao.rechercher(uneVisite.getReference()));
	}
	
	
	
	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		VisiteDao.supprimer("v0055");
	}
}
