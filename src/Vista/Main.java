package Vista;
import static javax.swing.WindowConstants.*;
public class Main 
{
    public static void main(String[] args) 
    {
        VentanaSuperInicio ventSuperInicio = new VentanaSuperInicio();
        ventSuperInicio.setLocationRelativeTo(null);
        ventSuperInicio.setResizable(false);
        ventSuperInicio.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventSuperInicio.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ventSuperInicio.setVisible(true);
    }
}
