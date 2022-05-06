package gsb.tests;

import gsb.modele.Localite;
import gsb.modele.Medecin;
import gsb.modele.Medicament;
import gsb.modele.Offrir;
import gsb.modele.Visite;
import gsb.modele.Visiteur;
import gsb.modele.utils.AffichageModele;

public class OffrirTest {
    public static void main(String[] args) {
    	Medicament unMedicament = new Medicament("3YMC", "LE CORVEC", "Triamcoline", "Perte de poids", "Interdit aux hommes enceintes", 10.5f, "CTR", "Corto�de");
    	Localite uneLocalite = new Localite("56270", "Ploemeur");
    	Visiteur unVisiteur = new Visiteur("a17", "Andre", "David", "dandre", "oppg5", "3 Rue des Potiers", uneLocalite, "012345679", "14/10/2021", 0, "CD-012", "Nom Unit�");
    	Medecin unMedecin = new Medecin("0520", "MERCORE", "G�o", "13 All�e des Potiers", uneLocalite, "0123456789", "", "G�n�raliste");
    	Visite uneVisite = new Visite("V0001", "14/10/2021", "", unMedecin, unVisiteur, "non", "");
    	Offrir uneOffre = new Offrir(unMedicament, uneVisite, 250); 	
    
    	AffichageModele.afficherOffrir(uneOffre);
    }
}
