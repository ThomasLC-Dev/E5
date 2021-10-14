package gsb.tests;

import gsb.modele.Localite;
import gsb.modele.Medecin;
import gsb.modele.utils.AffichageModele;

public class MedecinTest {
    public static void main(String[] args) {
    	Localite uneLocalite = new Localite("56270", "Ploemeur");
    	Medecin unMedecin = new Medecin("0520", "MERCORE", "G�o", "13 All�e des Potiers", uneLocalite, "0123456789", "", "G�n�raliste");
    
    	AffichageModele.afficherMedecin(unMedecin);
    }
}
