package gsb.vue;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import gsb.modele.Offrir;
import gsb.modele.Visite;
import gsb.modele.dao.OffrirDao;
import gsb.modele.dao.VisiteDao;

public class JFVisiteDetails extends JFrame{

	private static final long serialVersionUID = 1L;
	
	protected Visite visite;
	protected JPanel p;
	protected JPanel pDetails;
	protected JScrollPane psListe;
	
	protected JLabel JLReference;
	protected JLabel JLDate;
	protected JLabel JLMatricule;
	protected JLabel JLCode;
	protected JLabel JLCommentaire;
	protected JLabel JLConference;
	protected JLabel JLCodeConference;
	
	protected JTextField JTReference;
	protected JTextField JTDate;
	protected JTextField JTMatricule;
	protected JTextField JTCode;
	protected JTextField JTCommentaire;
	protected JTextField JTConference;
	protected JTextField JTCodeConference;
	
	protected JTable table;
	
	public JFVisiteDetails(String reference) {
		super("Détails visite : " + reference);
		this.visite = VisiteDao.rechercher(reference);
		this.setVisible(true);
		this.setSize(500, 300);
		
		p = new JPanel();
		pDetails = new JPanel(new GridLayout(7,2));
		
		JLReference = new JLabel("Référence");
		JLDate = new JLabel("Date");
		JLMatricule = new JLabel("Matricule visiteur");
		JLCode = new JLabel("Code médecin");
		JLCommentaire = new JLabel("Commentaire");
		JLConference = new JLabel("Conférence");
		JLCodeConference = new JLabel("Code conférence");
		
		JTReference = new JTextField(visite.getReference(),20);
		JTReference.setEditable(false);
		JTDate = new JTextField(visite.getDate());
		JTDate.setEditable(false);
		JTMatricule = new JTextField(visite.getUnVisiteur().getMatricule());
		JTMatricule.setEditable(false);
		JTCode = new JTextField(visite.getUnMedecin().getCodeMed());
		JTCode.setEditable(false);
		JTCommentaire = new JTextField(visite.getCommentaire());
		JTCommentaire.setEditable(false);
		JTConference = new JTextField(visite.getConference());
		JTConference.setEditable(false);
		JTCodeConference = new JTextField(visite.getCodeConference());
		JTCodeConference.setEditable(false);
		
		pDetails.add(JLReference);
		pDetails.add(JTReference);
		pDetails.add(JLDate);
		pDetails.add(JTDate);
		pDetails.add(JLMatricule);
		pDetails.add(JTMatricule);
		pDetails.add(JLCode);
		pDetails.add(JTCode);
		pDetails.add(JLCommentaire);
		pDetails.add(JTCommentaire);
		pDetails.add(JLConference);
		pDetails.add(JTConference);
		pDetails.add(JLCodeConference);
		pDetails.add(JTCodeConference);
		
		p.add(pDetails);
		
		String[] columnNames = {"", "Dépot légal", "Quantité offerte"};
		
		String[][] data = new String[2][3];
		data[0][0] = "Médicament 1";
		data[1][0] = "Médicament 2";
		int i = 0;
		for(Offrir ligne : OffrirDao.recherche(reference)) {
			data[i][1] = ligne.getUnMedicament().getDepotLegal();
			data[i][2] = ligne.getQteOfferte()+"";
			i++;
		}
		
		table = new JTable(data, columnNames);
		
		psListe = new JScrollPane(table);
		psListe.setPreferredSize(new Dimension(400,55));
		
		p.add(psListe);
		
		Container contentPane = getContentPane();
		contentPane.add(p);
	}
	
}
