
public class TestExiste {

	public boolean existematier(String nom) {
		for (Matier matier : Matier.matiers) {
			if (nom.equalsIgnoreCase(matier.getNom())) {
				return true ;
			}
		}
		 
		return false ;
	}
	
	
       public boolean existeetudiant(Integer id) {
    	   for (Etudiant etudiant : Etudiant.etudiants) {
   			if (id==etudiant.getId()) {
               return true ;
   			}
				
    	   }
    	   return false ;
    	   }





public boolean existeprofesseur( int id) {
	for (Professeur professeur : Professeur.professeurs) {
			if (id==professeur.getId()) {
           return true ;
			}
			
	   }
	   return false ;
	
}
 public Etudiant  chercher( int id) {
	 for (Etudiant etudiant : Etudiant.etudiants) {
			if (id==etudiant.getId()) {
              return etudiant ;
			}
				
 	   }
	 return null ; 
}
 
 public Professeur  chercherprof( int id) {
	 for (Professeur prof : Professeur.professeurs) {
			if (id==prof.getId()) {
              return prof ;
			}
				
 	   }
	 return null ; 
}
}
