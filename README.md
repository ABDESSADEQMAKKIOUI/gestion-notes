# gestion notes
 ce projet permet la gestion des contact crée par java
ajouterMatier(); :
La méthode ajouterMatier() permet d'associer une nouvelle matière la methode demande d'entrer le nom de la matier et ajouter
le dans la list des matier 



ajouteretudiant();:
La méthode ajouteretudiant() permet d'associer un etudiant la methode demande d'entrer le nom et le prenom  et ajouter
le dans la list des des etudiant la methode aussi appel la methode saisirnote pour entrer les notes de le nouveaux etudiant 
pour chaque matier 



saisirnote();:
La méthode saisirnote() permet d'associer des nouveax note pour un etudiant virifié par id qui entrer par l'etulisateur 
 la methode demande d'entrer le id si l'id n'existe pas la methode appele la methode ajouteretudiant() etudiant pour 
 ajouter l'etudiant que tu veut saisir les note a lui . en c'est etap la methode apelé la methode saisirnotecontrol() qui permet
de saisir les note des control pour chaque matièr aprè ca appel la methode calculerMoyenneControlNotes(nomM); pour calculer la moyene 
des note des control et pren comme note general de matier qui stoker come key de matier dons list des matier et dons l'atribu
note de l'objet de matier .




calculerMoyenneControlNotes(nomM); :la méthode calculerMoyenneControlNotes(nomM); permet de calculer la moyene 
des note des control par saisir les note de chaque control qui saisir par utilisateur et pren comme note general
 de matier mes si la moyenye general et deja existe aficher le  



listerNotes(nomE);:
cette méthode permet de aficher les matier avec ces note géneral pour un étudiant spécifique ce étudiant détérminer par 
utilisateur par ecrite l'id de l'étudiant la méthode ausi returner une message c'est pas des note saisir pour ce étudiant 



p.suprimeretu(); : permet de suprimer un étudiant spécifique ce étudiant détérminer par 
utilisateur par ecrite l'id de l'étudiant la méthode ausi returner une message c'est étudiant n'est existe pas.


p.updatetu();: permet de modifier les information un étudiant spécifique détérminer par 
utilisateur par ecrite l'id de l'étudiant la méthode ausi returner une message c'est étudiant n'est existe pas.
la méthode aussi appel la method saisirnote pour modifier les note de l'etudiant 

 

public static void main(String[] args) {
		 String path = "C:\\Users\\asus\\Desktop\\test.txt";
		 Etudiant.chargerDepuisTXT(path);
	Professeur P = new Professeur("abdessadeq" , "elmakkioui", "abdo@22") ;
	Test t = new Test();
         t.test() ;
                Etudiant.insererDansTXT(path);
	}

pour la methode : infois le programe loncer un objet professeur créer avec un id = 1 et un mo de passe ="abdo@22"
ces information nécécaire pour acceder a le program le motpasse et id vérifier par la methode test c'est il est vrée 
on passe a l'ecucution de la methode choix() qui affiche les choix ou les foctionalité de programe .

chargerDepuisTXT(path); : cette méthode premet de charger les donner a partir de fichier txt ou début de l'exécution du programe 
en a aussi la méthode insererDansTXT qui permet d'insérer les donner dans le fichier .

