
public class Main {
	public static void main(String[] args) {
		 String path = "C:\\Users\\asus\\Desktop\\test.txt";
		 Etudiant.chargerDepuisTXT(path);
	Professeur P = new Professeur("abdessadeq" , "elmakkioui", "abdo@22") ;
	Test t = new Test();
    t.test() ;
    Etudiant.insererDansTXT(path);
	}
}