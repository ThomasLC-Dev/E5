package gsb.modele.utils;

import gsb.modele.Localite;
import gsb.modele.Medecin;
import gsb.modele.Medicament;
import gsb.modele.Offrir;
import gsb.modele.Stocker;
import gsb.modele.Visite;
import gsb.modele.Visiteur;

public class AffichageModele {
	// M�thode afficher Mod�le
	public static void afficherVisiteur(Visiteur unVisiteur) {
		System.out.println("Matricule : "+unVisiteur.getMatricule());
		System.out.println("Nom : "+unVisiteur.getNom());
		System.out.println("Pr�nom : "+unVisiteur.getPrenom());
		System.out.println("Login : "+unVisiteur.getLogin());
		System.out.println("MDP : "+unVisiteur.getMdp());
		System.out.println("Adresse : "+unVisiteur.getAdresse());
		afficherLocalite(unVisiteur.getUneLocalite());
		System.out.println("T�l�phone : "+unVisiteur.getTelephone());
		System.out.println("Date entr�e : "+unVisiteur.getDateEntree());
		System.out.println("Prime : "+unVisiteur.getPrime());
		System.out.println("Code unit� : "+unVisiteur.getCodeUnite());
		System.out.println("Nom unit� : "+unVisiteur.getNomUnite());
	}
	
	// M�thode afficher Localit�
	public static void afficherLocalite(Localite uneLocalite) {
		System.out.println("Code postal : "+uneLocalite.getCodePostal());
		System.out.println("Ville : "+uneLocalite.getVille());
	}
	
	// M�thode afficher Stocker
	public static void afficherStocker(Stocker unStock) {
		System.out.println(unStock.getQteStock());
		afficherVisiteur(unStock.getUnVisiteur());
		afficherMedicament(unStock.getUnMedicament());
		
	}
	
	// M�thode afficher M�dicament
	public static void afficherMedicament(Medicament unMedicament) {
		System.out.println("D�pot l�gal : "+unMedicament.getDepotLegal());
		System.out.println("Nom commercial : "+unMedicament.getNomCommercial());
		System.out.println("Composition :"+unMedicament.getComposition());
		System.out.println("Effets : "+unMedicament.getEffets());
		System.out.println("Contre indication : "+unMedicament.getContreIndication());
		System.out.println("Prix �chantillon : "+unMedicament.getPrixEchantillon());
		System.out.println("Code famille : "+unMedicament.getCodeFamille());
		System.out.println("Libell� : "+unMedicament.getLibellefamille());
	}
	
	// M�thode afficher M�decin
	public static void afficherMedecin(Medecin unMedecin) {
		System.out.println("Code m�decin : "+unMedecin.getCodeMed());
		System.out.println("Nom : "+unMedecin.getNom());
		System.out.println("Pr�nom : "+unMedecin.getPrenom());
		System.out.println("Adresse : "+unMedecin.getAdresse());
		afficherLocalite(unMedecin.getLaLocalite());
		System.out.println("T�l�phone : "+unMedecin.getTelephone());
		System.out.println("Potentiel : "+unMedecin.getPotentiel());
		System.out.println("Sp�cialit� : "+unMedecin.getSpecialite());
	}
	
	// M�thode afficher Visite
	public static void afficherVisite(Visite uneVisite) {
		System.out.println("R�f�rence : "+uneVisite.getReference());
		System.out.println("Date : "+uneVisite.getDate());
		System.out.println("Commentaire : "+uneVisite.getCommentaire());
		afficherMedecin(uneVisite.getUnMedecin());
		afficherVisiteur(uneVisite.getUnVisiteur());
	}
	
	// M�thode afficher Offrir
	public static void afficherOffrir(Offrir uneOffre) {
		afficherMedicament(uneOffre.getUnMedicament());
		afficherVisite(uneOffre.getUneVisite());
		System.out.println("Quantit� : "+uneOffre.getQteOfferte());
	}
}
