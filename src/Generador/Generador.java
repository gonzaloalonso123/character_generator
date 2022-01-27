
package Generador;


public class Generador extends javax.swing.JFrame {

    public Generador() {
        initComponents();
        setLocationRelativeTo(null);
    }
                        
    private void initComponents() {

        nuevaCriatura_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nuevaCriatura_Button.setText("Nueva criatura");
        nuevaCriatura_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaCriatura_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuevaCriatura_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuevaCriatura_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
        );

        pack();
    }                     

    private void nuevaCriatura_ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        new Objeto(this,false,new Criatura());
    }                                                    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Generador().setVisible(true);
            }
        });
    }
                    
    private javax.swing.JButton nuevaCriatura_Button;                 
}
