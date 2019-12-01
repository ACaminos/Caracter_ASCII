import javax.swing.JOptionPane;

public class caracterAscii {
    public static void main(String[] args) {
        int Codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un codigo perteneciente a la tabla ASCII"));
        
        char caracter=(char)Codigo;
        JOptionPane.showMessageDialog(null, "El codigo que ingreso pertenece a : "+caracter);
        }
}
