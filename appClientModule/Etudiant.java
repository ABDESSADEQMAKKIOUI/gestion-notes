
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Etudiant {
	private static Integer id = 0 ;
	private String nom ;
	private String prenom ;
	private TreeMap<Float, Matier> matiers = new TreeMap<Float, Matier>() ; 
	static ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>() ;
	
	
      String path = "C:\\Users\\asus\\Desktop\\test.txt";
	
	
	public Etudiant( String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.matiers = new TreeMap< Float , Matier>();
		etudiants.add(this);
		id++ ;
		
	}
	
	public Etudiant() {
		this.nom = null;
		this.prenom = null;	
	}
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		Etudiant.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public TreeMap<Float , Matier> getMatiers() {
		return matiers;
	}
	public void setMatiers(TreeMap<Float , Matier> matiers) {
		this.matiers = matiers;
	}
	public static ArrayList<Etudiant> getEtudiants() {
		return etudiants;
	}
	public static void setEtudiants(ArrayList<Etudiant> etudiants) {
		Etudiant.etudiants = etudiants;
	}
	
	
	public static float calculerMoyennematierNotes(String nom) {
	    Etudiant etudiant = null;
	    for (Etudiant e : etudiants) {
	        if (e.getNom().equals(nom)) {
	            etudiant = e;
	            break;
	        }
	    }

	    if (etudiant != null) {
	        TreeMap<Float, Matier> matiersMap = etudiant.getMatiers();

	        if (!matiersMap.isEmpty()) {
	            float sum = 0;
	            for (Map.Entry<Float, Matier> entry : matiersMap.entrySet()) {
	               
	                sum += entry.getKey();
	            }
	            return sum / matiersMap.size();
	        } else {
	            System.out.println("Aucune matière trouvée pour l'étudiant " + nom);
	            return -1; // Une valeur non valide
	        }
	    } else {
	        System.out.println("Étudiant " + nom + " introuvable.");
	        return -1; // Une valeur non valide
	    }
	}
	
	public boolean etudiantmatier( String nom) {
		Matier m = Matier.chercherMatierParNom(nom);
		if (this.matiers.containsValue(m)) {
			return true ;
		}
		return false ;
	}
	
	public void listerNotes(String nom) {
	    Etudiant etudiant = null;
	    for (Etudiant e : etudiants) {
	        if (e.getNom().equals(nom)) {
	            etudiant = e;
	            break;
	        }
	    }

	    if (etudiant != null) {
	        TreeMap<Float, Matier> matieres = etudiant.getMatiers();

	        if (!matieres.isEmpty()) {
	            for (Map.Entry<Float, Matier> entry : matieres.entrySet()) {
	                float matiereNom = entry.getKey();
	                Matier matiere = entry.getValue();

	                System.out.println("Matière: " + matiereNom + ", Note: " + matiere.getNote());
	            }
	        } else {
	            System.out.println("Aucune matière trouvée pour l'étudiant " + nom);
	        }
	    } else {
	        System.out.println("Étudiant " + nom + " introuvable.");
	    }
	}
	 public static void insererDansTXT(String path) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
	            for (Etudiant etudiant : etudiants) {
	                String nom = etudiant.getNom();
	                String prenom = etudiant.getPrenom();
	                TreeMap<Float, Matier> matieres = etudiant.getMatiers();

	                writer.write("Nom: " + nom + "\n");
	                writer.write("Prenom: " + prenom + "\n");

	                for (Map.Entry<Float, Matier> entry : matieres.entrySet()) {
	                    float note = entry.getKey();
	                    Matier matiere = entry.getValue();
	                    String matiereNom = matiere.getNom();

	                    writer.write("Matiere: " + matiereNom + ", Note: " + note + "\n");
	                }

	                writer.write("\n");
	            }

	            System.out.println("Les informations ont été ajoutées au fichier TXT avec succès.");
	        } catch (IOException e) {
	            System.out.println("Erreur lors de l'écriture dans le fichier TXT : " + e.getMessage());
	        }
	    }
	 
	 public static void chargerDepuisTXT(String path) {
	        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
	            String line;
	            Etudiant etudiant = null;

	            while ((line = reader.readLine()) != null) {
	                if (line.startsWith("Nom:")) {
	                    String nom = line.substring("Nom: ".length()).trim();
	                    String prenom = reader.readLine().substring("Prenom: ".length()).trim();
	                    etudiant = new Etudiant(nom, prenom);
	                } else if (line.startsWith("Matiere:")) {
	                    String[] parts = line.split(",");
	                    String matiereNom = parts[0].substring("Matiere: ".length()).trim();
	                    float note = Float.parseFloat(parts[1].substring(" Note: ".length()).trim());
	                    Matier matiere = Matier.chercherMatierParNom(matiereNom);
	                    etudiant.getMatiers().put(note, matiere);
	                } else if (line.isEmpty()) {
	                    etudiants.add(etudiant);
	                }
	            }

	            System.out.println("Données chargées depuis le fichier TXT avec succès.");
	        } catch (IOException e) {
	            System.out.println("Erreur lors de la lecture depuis le fichier TXT : " + e.getMessage());
	        }
	    }


	}


	
	
	
	
	
	

