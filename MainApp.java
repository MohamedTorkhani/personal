import javax.swing.SwingUtilities;

public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(CircuitUI::new); // Lance l'interface graphique
    }
}
