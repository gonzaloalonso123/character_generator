package Generador;

import java.awt.Color;

public class Objeto extends javax.swing.JDialog {

    public Objeto(java.awt.Frame parent, boolean modal,Criatura bestia) {
        super(parent, modal);
        initComponents();
        nombre_Label.setText(bestia.getNombre());
        String iconoRuta = bestia.getIcono();
        icono_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconoRuta)));
        info_Label.setText(infoToPanel(bestia.getDet()));
        asignarColor(bestia.getNivel());
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void asignarColor(int nivel)
    {
        switch(nivel)
        {
            case 1:
               panel.setBackground(new Color(238,238,238)); break; 
            case 2:
               panel.setBackground(new Color(244,227,132)); break; 
            case 3:
            	panel.setBackground(new Color(53, 220, 240)); break;
        }
    }
    
    public String infoToPanel(String info)
    {
        String aux = "<html>";
        for(int i = 0; i < info.length(); i++)
        {
            aux+=info.charAt(i);
            if(i % 10 == 0)
            {
                aux += "</br>";
            }
            
        }
        aux+="</html>";
        return aux;
    }
                        
    private void initComponents() {

        panel = new javax.swing.JPanel();
        icono_Label = new javax.swing.JLabel();
        nombre_Label = new javax.swing.JLabel();
        info_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(239, 238, 229));

        icono_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bestia1.png"))); // NOI18N
        icono_Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nombre_Label.setBackground(new java.awt.Color(220, 213, 213));
        nombre_Label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nombre_Label.setOpaque(true);

        info_Label.setBackground(new java.awt.Color(247, 247, 248));
        info_Label.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        info_Label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        info_Label.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panel);
        panel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(info_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(nombre_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(icono_Label)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nombre_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
    }                     

                    
    private javax.swing.JLabel icono_Label;
    private javax.swing.JLabel info_Label;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel nombre_Label;                 
}
