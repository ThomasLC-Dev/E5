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
	
	protected JTextField JTReference;
	protected JTextField JTDate;
	protected JTextField JTMatricule;
	protected JTextField JTCode;
	protected JTextField JTCommentaire;
	
	protected JTable table;
	
	public JFVisiteDetails(String reference) {
		super("D�tails visite : " + reference);
		this.visite = VisiteDao.rechercher(reference);
		this.setVisible(true);
		this.setSize(500, 300);
		
		p = new JPanel();
		pDetails = new JPanel(new GridLayout(5,2));
		
		JLReference = new JLabel("R�f�rence");
		JLDate = new JLabel("Date");
		JLMatricule = new JLabel("Matricule visiteur");
		JLCode = new JLabel("Code m�decin");
		JLCommentaire = new JLabel("Commentaire");
		
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
		
		p.add(pDetails);
		
		String[] columnNames = {"", "D�pot l�gal", "Quantit� offerte"};
		
		String[][] data = new String[2][3];
		data[0][0] = "M�dicament 1";
		data[1][0] = "M�dicament 2";
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
