
package frames;

import clases.Archivo;
import clases.Persona;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author acxel
 */
public class VentanaAgenda extends javax.swing.JFrame {

    public VentanaAgenda() {
        initComponents();
        reglas();
    }
    
    private void reglas() {
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Agenda");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        barra = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        agenda = new javax.swing.JMenuItem();
        separador = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(240, 77, 94));

        lblTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 26)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 90, 94));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Agenda de Contactos");

        lblNombre.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(251, 255, 206));
        lblNombre.setText("Nombre:");

        lblTelefono.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(251, 255, 206));
        lblTelefono.setText("Télefono:");

        lblMail.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N
        lblMail.setForeground(new java.awt.Color(251, 255, 206));
        lblMail.setText("E-mail:");

        txtTelefono.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(51, 51, 51));

        txtMail.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtMail.setForeground(new java.awt.Color(51, 51, 51));

        txtNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(51, 51, 51));

        btnAgregar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setPreferredSize(new java.awt.Dimension(107, 31));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefono)
                    .addComponent(lblMail)
                    .addComponent(lblNombre))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtTelefono)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(32, 32, 32)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMail)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        menu.setForeground(new java.awt.Color(204, 0, 51));
        menu.setText("Menú");
        menu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        agenda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        agenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/agenda.png"))); // NOI18N
        agenda.setText("Mostrar contactos");
        agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendaActionPerformed(evt);
            }
        });
        menu.add(agenda);
        menu.add(separador);

        salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/exit.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menu.add(salir);

        barra.add(menu);

        setJMenuBar(barra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // Salimos del programa
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Creamos un objeto de la clase archivo y creamos el archivo
        Archivo archivo = new Archivo();
        archivo.crearArchivo();
        
        // Atributos que serviran de referencia
        String nombre, telefono, correo;
        
        // Obtenemos los datos de los TextField
        nombre = txtNombre.getText();
        telefono = txtTelefono.getText();
        correo = txtMail.getText();
        
        // Creamos una persona, la cual sera la que escribiremos en el txt
        Persona persona = new Persona(nombre, telefono, correo);
        
        // Añadimos la persona
        archivo.escribirEntxt(persona);
        
        // Dejamos los TextField en blanco
        txtNombre.setText(null);
        txtTelefono.setText(null);
        txtMail.setText(null);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void agendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendaActionPerformed
        VentanaContactos vc = new VentanaContactos(this, true);
        vc.setVisible(true);
    }//GEN-LAST:event_agendaActionPerformed
    
    /**
     *
     * @param args
     * @throws UnsupportedLookAndFeelException
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        
        // Establecemos el LookAndFeel, y manejamos las excepciones
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            System.err.println("Error -> "+ex.getMessage());
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaAgenda().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agenda;
    private javax.swing.JMenuBar barra;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenu menu;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    private javax.swing.JPopupMenu.Separator separador;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
