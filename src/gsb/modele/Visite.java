package gsb.modele;

public class Visite {
    protected String reference;
    protected String date;
    protected String commentaire;
    protected Medecin unMedecin;
    protected Visiteur unVisiteur;
    protected String conference;
    protected String codeConference;

    public Visite(String reference, String date, String commentaire, Medecin unMedecin, Visiteur unVisiteur, String conference, String codeConference) {
        this.reference = reference;
        this.date = date;
        this.commentaire = commentaire;
        this.unMedecin = unMedecin;
        this.unVisiteur = unVisiteur;
        this.conference = conference;
        this.codeConference = codeConference;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Medecin getUnMedecin() {
        return unMedecin;
    }

    public void setUnMedecin(Medecin unMedecin) {
        this.unMedecin = unMedecin;
    }

    public Visiteur getUnVisiteur() {
        return unVisiteur;
    }

    public void setUnVisiteur(Visiteur unVisiteur) {
        this.unVisiteur = unVisiteur;
    }
    
    public String getConference() {
    	return conference;
    }
    
    public void setConference(String conference) {
    	this.conference = conference;
    }
    
    public String getCodeConference() {
    	return codeConference;
    }
    
    public void setCodeConference(String codeConference) {
    	this.codeConference = codeConference;
    }

}
