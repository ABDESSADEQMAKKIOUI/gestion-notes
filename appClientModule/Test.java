
import java.util.Scanner;

public class Test {
	Scanner s = new Scanner(System.in);
	 TestExiste t = new TestExiste();
	 String path = "C:\\Users\\asus\\Desktop\\test.txt";
	 
      public void test() {
    	  System.out.println("entrer le nom votre id");
    	  int id = s.nextInt();
    	  System.out.println("entrer le nom votre mot de passe");
    	  String mot  = s.next();
    	 
    	  
    	  if (t.existeprofesseur(id) == true) {
    		  Professeur p = t.chercherprof(id); 
			if (p.getMotdepasse().equals(mot)) {
				choix();
			}
			else {
				System.out.println("motpase incorect");
			}
		}
    	  else {
			System.out.println("pas de compte avec ce nom");
		}
      }
      
      
       public void choix() {
    	   System.out.println("entrer   1 pour ajouter note a un etudiant");
    	   System.out.println("entrer   2 pour ajouter une matier");
    	   System.out.println("entrer   3 pour ajouter  un etudiant");
    	   System.out.println("entrer   4 pour calculer moyene des notes pour un etudiant");
    	   System.out.println("entrer   5 pour calculer moyene des notes pour un etudian a une seul matier");
    	   System.out.println("entrer   6 pour aficher les note d'un etudiant");
    	   System.out.println("entrer   7 pour suprmer  un etudiant");
    	   System.out.println("entrer   8 pour modifier  un etudiant");
    	   System.out.println("entrer   9 pour areter le programe");
    	   int n = s.nextInt();
    	   Professeur p = new Professeur();
    	   Matier m = new Matier();
    	   switch (n) {
		case 1: {
		    p.saisirnote();
		    System.out.println("Tu veux entrer une nouvelle note ? (y/n)");
		    String b = s.next();

		    while (b.equals("y")) {
		        p.saisirnote();
		        System.out.println("Tu veux entrer une nouvelle note ? (y/n)");
		        b = s.next();
		    }

		    choix();
		    break;
		}

		case 2: {
			m.ajouterMatier();
			System.out.println("tu veut entrer un nouveaux matier y/n");
			 String b = s.next();
			 while (b.equals("y")) {
				 m.ajouterMatier();
				 System.out.println("tu veut entrer un nouveaux matier y/n");
			        b = s.next();
			    }
							 choix() ; 
			
			 break ;
		  }
		case 3: {
			p.ajouteretudiant();
			System.out.println("tu veut entrer un nouveaux etudiant y/n");
			 String b = s.next();
			 while (b.equals("y")) {
				 p.ajouteretudiant();
				 System.out.println("tu veut entrer un nouveaux etudiant y/n");
			        b = s.next();
			    }
							 choix() ; 
			
			 break ;
		  }
		case 4: {
			System.out.println("entrer le nom d'etudiant ");
			String nom = s.next();
			System.out.println(Etudiant.calculerMoyennematierNotes(nom));
			System.out.println("tu veut afficher un nouveaux moyene y/n");
			 String b = s.next();
			 while (b.equals("y")) {
				 System.out.println("entrer le nom d'etudiant ");
					 nom = s.next();
					System.out.println(Etudiant.calculerMoyennematierNotes(nom));
				 System.out.println("tu veut afficher un nouveaux moyene y/n");
			        b = s.next();
			    }
							 choix() ; 
			
			 break ;
		  }
		case 5: {
			System.out.println("entrer le nom d'etudiat"); 
			String nomE = s.next();
			for (Etudiant etudiant : Etudiant.etudiants) {
				if (etudiant.getNom().equalsIgnoreCase(nomE)) {
					System.out.println("entrer le nom de matier");
					String nomM = s.next();
					if (t.existematier(nomM)==true && etudiant.etudiantmatier(nomM)) {
						Matier.calculerMoyenneControlNotes(nomM);
					}
					else {
						System.out.println("ferifier le nom d'etudiant et matier");
					}
				}
				else {
					System.out.println("ferifier le nom d'etudiant ");
				}
			}
			System.out.println("tu veut entrer un nouveaux etudiant y/n");
			 String b = s.next();
			 while (b.equals("y")) {
				 System.out.println("entrer le nom d'etudiat"); 
					 nomE = s.next();
					for (Etudiant etudiant : Etudiant.etudiants) {
						if (etudiant.getNom().equalsIgnoreCase(nomE)) {
							System.out.println("entrer le nom de matier");
							String nomM = s.next();
							if (t.existematier(nomM)==true && etudiant.etudiantmatier(nomM)) {
								Matier.calculerMoyenneControlNotes(nomM);
							}
							else {
								System.out.println("ferifier le nom d'etudiant et matier");
							}
						}
						else {
							System.out.println("ferifier le nom d'etudiant ");
						}
					}
					System.out.println("tu veut entrer un nouveaux etudiant y/n");
			        b = s.next();
			    }
							 choix() ; 
			
			 break ;
		  }
		case 6: {
			System.out.println("entrer le nom d'etudiat"); 
			String nomE = s.next();
		    Etudiant e = new Etudiant();
			 e.listerNotes(nomE);
				System.out.println("tu veut entrer un nouveaux etudiant y/n");
				 String b = s.next();
				 while (b.equals("y")) {
					 System.out.println("entrer le nom d'etudiat"); 
						 nomE = s.next();
					     e = new Etudiant();
						 e.listerNotes(nomE);
						 System.out.println("tu veut entrer un nouveaux etudiant y/n");
				        b = s.next();
				    }
								 choix() ; 
				
				 break ;
		  }
		case 7: {
			 p.suprimeretu();
			 System.out.println("tu veut suprimer un nouveaux etudiant y/n");
			 String b = s.next();
			 while (b.equals("y")) {
				 p.suprimeretu();
				 System.out.println("tu veut suprimer un nouveaux etudiant y/n");
			        b = s.next();
			    }
							 choix() ; 
			
			 break ;
			 
		  }
		case 8: {
			 p.updatetu();
			 System.out.println("tu veut modifier un nouveaux etudiant y/n");
			 String b = s.next();
			 while (b.equals("y")) {
				 p.updatetu();
				 System.out.println("tu veut modifier un nouveaux etudiant y/n");
			        b = s.next();
			    }
							 choix() ; 
			
			 break ;
			 
		  }
		case 9: {
			Etudiant.insererDansTXT(path);
			 System.out.println("orevoir");
			 break ;
			 
		  }

		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}
    	   
    	   
       }
}
