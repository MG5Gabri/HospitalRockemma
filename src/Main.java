import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {
        // Configuraciones básicas del JFrame
        setTitle("Login");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Panel principal con GridLayout de 1 fila y 2 columnas
        JPanel mainPanel = new JPanel(new GridLayout(1, 2));

        // Panel para el lado izquierdo (blanco)
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.WHITE);
        rightPanel.setLayout(null); // Layout para posicionar manualmente los componentes

        // Crear los elementos del login
        JLabel userLabel = new JLabel("Usuario:");
        JLabel passwordLabel = new JLabel("Contraseña:");
        JTextField userTextField = new JTextField(15);
        JPasswordField passwordField = new JPasswordField(15);
        JButton loginButton = new JButton("Iniciar sesión");

        // Posicionamos los elementos en el leftPanel
        userLabel.setBounds(100, 200, 80, 25);
        userTextField.setBounds(180, 200, 200, 25);
        passwordLabel.setBounds(100, 240, 80, 25);
        passwordField.setBounds(180, 240, 200, 25);
        loginButton.setBounds(180, 300, 200, 30);

        // Añadimos los componentes al leftPanel
        rightPanel.add(userLabel);
        rightPanel.add(userTextField);
        rightPanel.add(passwordLabel);
        rightPanel.add(passwordField);
        rightPanel.add(loginButton);

        // Panel para el lado derecho (naranja)
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.ORANGE);

        // Añadimos ambos paneles al mainPanel
        mainPanel.add(leftPanel);
        mainPanel.add(rightPanel);

        // Añadimos el panel principal al JFrame
        add(mainPanel);
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        // Crear la ventana de login
        Main loginFrame = new Main();
        loginFrame.setVisible(true);
    }
}
