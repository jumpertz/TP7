package projetoffresstage;
import java.util.ArrayList;
/**
 *
 * @author jeremy
 */
public class MainProjet {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<OffreStage>lesOffres = new ArrayList<OffreStage>();
    public static ArrayList<Entreprise>lesEntreprises = new ArrayList<Entreprise>();
    public static void main(String[] args) {
        
        MenuPrincipal m = new MenuPrincipal();
        m.setVisible(true);
    }
    
}
