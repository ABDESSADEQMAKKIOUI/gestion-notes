import java.util.ArrayList;
import java.util.Scanner;

public class Professeur {
	private static Integer id = 0 ;
	private String nom ;
	private String prenom ;
	private String motdepasse ;
	static ArrayList<Professeur> professeurs = new ArrayList<Professeur>() ;
	
	Scanner s = new Scanner(System.in);
	TestExiste t = new TestExiste();
	Matier m = new Matier();
	String path = "C:\\Users\\asus\\Desktop\\test.txt";
	
	public Professeur( String nom, String prenom, String motdepasse) {
		this.nom = nom;
		this.prenom = prenom;
		this.motdepasse = motdepasse;
		professeurs.add(this);
		id++;
	}
	public Professeur( ) {
		this.nom = null;
		this.prenom = null;
		this.motdepasse = null ;
	}
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		Professeur.id = id;
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
	

     public String getMotdepasse() {
		return motdepasse;
	}
	

     public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}
	
     public static ArrayList<Professeur> getProfesseurs() {
		return professeurs;
	}
	
     public static void setProfesseurs(ArrayList<Professeur> professeurs) {
		Professeur.professeurs = professeurs;
	}
	 
    
     public void saisirnote() {
    	 System.out.println("entrer l'id d'etudiant");
    	 Integer id = s.nextInt();
    	 TestExiste test = new TestExiste();
    	  if (test.existeetudiant(id)== true) {
			Etudiant e = test.chercher(id);
			System.out.println("entrer le nombre de matier ");
	    	 int n = s.nextInt();
			for (int i=0 ; i <= n ; i++) {
			System.out.println("entrer nom de matier");
			String nom = s.next();
			if (test.existematier(nom)== true) {
				if (Matier.calculerMoyenneControlNotes(nom)==0) {
					Matier.chercherMatierParNom(nom).saisirnotecontrol();
					 e.getMatiers().put(Matier.calculerMoyenneControlNotes(nom), Matier.chercherMatierParNom(nom));
				}
				else {
					 e.getMatiers().put(Matier.calculerMoyenneControlNotes(nom), Matier.chercherMatierParNom(nom));
				}
				
			}
			else {
				System.out.println("la matier n'exeste pas");
			}
			}
			
		}
    	  else {
    		  System.out.println("l'etudiant n'exsite pas ");
				ajouteretudiant();
				saisirnote();
			}
		}
    	 
     public void saisirnote(int id) {
    	 TestExiste test = new TestExiste();
    	  if (test.existeetudiant(id)== true) {
			Etudiant e = test.chercher(id);
			System.out.println("entrer le nombre de matier ");
	    	 int n = s.nextInt();
			for (int i=0 ; i <= n ; i++) {
			System.out.println("entrer nom de matier");
			String nom = s.next();
			if (test.existematier(nom)== true) {
				 e.getMatiers().put(Matier.calculerMoyenneControlNotes(nom), Matier.chercherMatierParNom(nom));
			}
			else {
				System.out.println("la matier n'exeste pas");
				m.ajouterMatier();
			}
			}
			
		}
    	  else {
    		  System.out.println("l'etudiant n'exsite pas ");
				ajouteretudiant();
				saisirnote();
			}
		}
     
	  public void ajouteretudiant() {
		  System.out.println("entrer le nom ");
		  String nom = s.next() ;
		  System.out.println("entrer le prenom ");
		  String prenom = s.next() ;
		   Etudiant e = new Etudiant(nom, prenom);
		   saisirnote();
		   System.out.println("l'etudiant" + e.getNom() +"est ajouter");
		   
	    	  }
	  public void suprimeretu() {
			 System.out.println("entrer l'id d'etudiant");
			 int id = s.nextInt();
			 if(t.existeetudiant(id)==true) {
				 Etudiant e = t.chercher(id);
				 Etudiant.etudiants.remove(e);
			 }
			 else {
				System.out.println("etudiant n'existe pas ");
			}
		 }
	  public void suprimeretu(int id) {
			 if(t.existeetudiant(id)==true) {
				 Etudiant e = t.chercher(id);
				 Etudiant.etudiants.remove(e);
			 }
			 else {
				System.out.println("etudiant n'existe pas ");
			}
		 }
	  public void updatetu() {
		  System.out.println("entrer l'id d'etudiant");
			 int id = s.nextInt();
			 if(t.existeetudiant(id)==true) {
				 suprimeretu(id);
				  System.out.println("entrer le nom ");
				  String nom = s.next() ;
				  System.out.println("entrer le prenom ");
				  String prenom = s.next() ;
				  Etudiant e1 = new Etudiant(nom, prenom);
				  saisirnote(e1.getId());
				  System.out.println("etudiant est bien modifier");
				 
			 }
	  }

	  }


