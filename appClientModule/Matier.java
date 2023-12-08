import java.util.*;

public class Matier {
	private static Integer id ; 
	private String nom ;
	private float note ;
	private float[] controlnote ;
	static ArrayList<Matier> matiers = new ArrayList<Matier>() ;
	
   Scanner s = new Scanner(System.in);
 static Scanner scanner;
 static Matier matiere;

	public Matier(String nom) {
		
		this.nom = nom;
		this.note=Matier.calculerMoyenneControlNotes(getNom());
		controlnote = new float[3] ;
		matiers.add(this);
		
	}
    
public Matier() {
		
		this.nom = null;
		
	}

	public static Integer getId() {
		return id;
	}


	public static void setId(Integer id) {
		Matier.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

	
	public static ArrayList<Matier> getMatiers() {
		return matiers;
	}


	public static void setMatiers(ArrayList<Matier> matiers) {
		Matier.matiers = matiers;
	}




	public float getNote() {
		return note ;
	}


	public void setNote(float note) {
		this.note = note;
	}
	 
	public void  saisircontrolnote() {
		for (int i = 0; i < controlnote.length; i++) {
			controlnote[i] = s.nextFloat();
		}
	}
	
	public  void ajouterMatier() {
        scanner = new Scanner(System.in);
        System.out.println("Entrer le nom de la matière :");
        String nomMatier = scanner.next();
        matiere = new Matier(nomMatier);
        System.out.println("Matière " + nomMatier + " ajoutée avec succès.");
    }
	
	  public static Matier chercherMatierParNom(String nomMatier) {
	        for (Matier mat : matiers) {
	            if (mat.getNom().equals(nomMatier)) {
	                return mat;
	            }
	        }
	        return null; 
	    }

	public static float calculerMoyenneControlNotes(String nomMatier) {
        Matier matiere = null;
        for (Matier m : matiers) {
        	
            if (m.getNom().equals(nomMatier) ) {
                matiere = m;
                break;
            }
        }

        if (matiere != null) {
            float sum = 0;
            for (float note : matiere.controlnote) {
                sum += note;
            }
            return sum / matiere.controlnote.length;
        } else {
            System.out.println("Matière " + nomMatier + " introuvable.");
            return -1; 
        }
    }
	public void saisirnotecontrol() {
		for (int i = 0; i < controlnote.length; i++) {
			System.out.println("donner la not "+i+1);
			controlnote[i] = s.nextFloat();
			while (controlnote[i]<0 ||controlnote[i]>20 ) {
				System.out.println("donner la not "+i+1);
				controlnote[i] = s.nextFloat();
			}
		}
	}
	
    }
	
	
	
	
	


