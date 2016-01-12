package tirage;

/**
 *
 * @author Romuald
 */
public class Tirage {

    private static Fenetre frame;
    private static Fichier IOfile;
    static int animateur;
    static int secretaire;
    static int scribe;
    static int gestionnaire;
        
    public static void main(String[] args) {
        //frame = new Fenetre();
        IOfile = new Fichier();
        IOfile.test();
    }
    
    public static String selection() {
        animateur = random();
        secretaire = random();
        scribe = random();
        gestionnaire = random();
        
        //System.out.println("Animateur => "+nom(animateur));
        
        while(secretaire == animateur) {
            secretaire = random();
        }
        //System.out.println("Secrétaire => "+nom(secretaire));
        
        while(scribe == animateur || scribe == secretaire) {
            scribe = random();
        }
        //System.out.println("Scribe => "+nom(scribe));
        
        while(gestionnaire == animateur || gestionnaire == secretaire || gestionnaire == scribe) {
            gestionnaire = random();
        }
        //System.out.println("Gestionnaire => "+nom(gestionnaire));
        return affichage(animateur, secretaire, scribe, gestionnaire);
    }
    
    public static String animateur() {
        int new_animateur = random();
        while(new_animateur == animateur || new_animateur == gestionnaire || new_animateur == secretaire || new_animateur == scribe) {
            new_animateur = random();
        }
        animateur = new_animateur;
        return "Animateur => "+nom(animateur)+"\n"+"Secrétaire => "+nom(secretaire)+"\n"+"Scribe => "+nom(scribe)+"\n"+"Gestionnaire => "+nom(gestionnaire);
    }
    
    public static String secretaire() {
        int new_secretaire = random();
        while(new_secretaire == secretaire || new_secretaire == gestionnaire || new_secretaire == animateur || new_secretaire == scribe) {
            new_secretaire = random();
        }
        secretaire = new_secretaire;
        return "Animateur => "+nom(animateur)+"\n"+"Secrétaire => "+nom(secretaire)+"\n"+"Scribe => "+nom(scribe)+"\n"+"Gestionnaire => "+nom(gestionnaire);
    }
    
    public static String scribe() {
        int new_scribe = random();
        while(new_scribe == scribe || new_scribe == gestionnaire || new_scribe == secretaire || new_scribe == animateur) {
            new_scribe = random();
        }
        scribe = new_scribe;
        return "Animateur => "+nom(animateur)+"\n"+"Secrétaire => "+nom(secretaire)+"\n"+"Scribe => "+nom(scribe)+"\n"+"Gestionnaire => "+nom(gestionnaire);
    }
    
    public static String gestionnaire() {
        int new_gestionnaire = random();
        while(new_gestionnaire == gestionnaire || new_gestionnaire == animateur || new_gestionnaire == secretaire || new_gestionnaire == scribe) {
            new_gestionnaire = random();
        }
        gestionnaire = new_gestionnaire;
        return "Animateur => "+nom(animateur)+"\n"+"Secrétaire => "+nom(secretaire)+"\n"+"Scribe => "+nom(scribe)+"\n"+"Gestionnaire => "+nom(gestionnaire);
    }
    
    public static int random() {
        int nbAleatoire = (int)(Math.random() * 12 + 1);
        return nbAleatoire;
    }
    
    public static String nom(int adr) {
        String tableauNom[] = {"Fabien", "Romain", "Floran" , "Guillaume", "Romuald", "Clément", "Alexandre" , "Eva", "Reynald", "Luc", "Quentin" , "Paul"};
        return tableauNom[adr-1];
    }
    
    public static String affichage(int anim, int secret, int scrib, int gestio) {
        return "Animateur => "+nom(anim)+"\n"+"Secrétaire => "+nom(secret)+"\n"+"Scribe => "+nom(scrib)+"\n"+"Gestionnaire => "+nom(gestio);
    }
}