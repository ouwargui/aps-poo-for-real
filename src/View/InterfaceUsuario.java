package View;

import Paineis.MudaPainel;

public class InterfaceUsuario extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceUsuario
     */
    public InterfaceUsuario() {
        initComponents();
        
        new MudaPainel(pnlMuda, new Paineis.Inicial());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Case1 = new customButton.customButton();
        Case2 = new customButton.customButton();
        Case3 = new customButton.customButton();
        Case4 = new customButton.customButton();
        Case5 = new customButton.customButton();
        Case6 = new customButton.customButton();
        Case7 = new customButton.customButton();
        Case8 = new customButton.customButton();
        Case9 = new customButton.customButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlMuda = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Case1.setBackground(new java.awt.Color(0, 153, 153));
        Case1.setText("Cadastrar Cliente");
        Case1.setColorHover(new java.awt.Color(0, 102, 102));
        Case1.setColorNormal(new java.awt.Color(0, 153, 153));
        Case1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        Case2.setBackground(new java.awt.Color(0, 153, 153));
        Case2.setText("Cadastrar Conta");
        Case2.setColorHover(new java.awt.Color(0, 102, 102));
        Case2.setColorNormal(new java.awt.Color(0, 153, 153));
        Case2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        Case3.setBackground(new java.awt.Color(0, 153, 153));
        Case3.setText("Listar Conta");
        Case3.setColorHover(new java.awt.Color(0, 102, 102));
        Case3.setColorNormal(new java.awt.Color(0, 153, 153));
        Case3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        Case4.setBackground(new java.awt.Color(0, 153, 153));
        Case4.setText("Pesquisar Conta");
        Case4.setColorHover(new java.awt.Color(0, 102, 102));
        Case4.setColorNormal(new java.awt.Color(0, 153, 153));
        Case4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        Case5.setBackground(new java.awt.Color(0, 153, 153));
        Case5.setText("Depositar");
        Case5.setColorHover(new java.awt.Color(0, 102, 102));
        Case5.setColorNormal(new java.awt.Color(0, 153, 153));
        Case5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        Case6.setBackground(new java.awt.Color(0, 153, 153));
        Case6.setText("Debitar (Sacar)");
        Case6.setColorHover(new java.awt.Color(0, 102, 102));
        Case6.setColorNormal(new java.awt.Color(0, 153, 153));
        Case6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        Case7.setBackground(new java.awt.Color(0, 153, 153));
        Case7.setText("Transferir");
        Case7.setColorHover(new java.awt.Color(0, 102, 102));
        Case7.setColorNormal(new java.awt.Color(0, 153, 153));
        Case7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        Case8.setBackground(new java.awt.Color(0, 153, 153));
        Case8.setText("Remover (Conta)");
        Case8.setColorHover(new java.awt.Color(0, 102, 102));
        Case8.setColorNormal(new java.awt.Color(0, 153, 153));
        Case8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        Case9.setBackground(new java.awt.Color(0, 153, 153));
        Case9.setText("Sair");
        Case9.setColorHover(new java.awt.Color(0, 102, 102));
        Case9.setColorNormal(new java.awt.Color(0, 153, 153));
        Case9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Case9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Case9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Case9, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(Case8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Case7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Case6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Case5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Case4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Case3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Case2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Case1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Case1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Case2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Case3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Case4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Case5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Case6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Case7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Case8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Case9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jScrollPane2.setBorder(null);

        pnlMuda.setBackground(new java.awt.Color(255, 255, 255));
        pnlMuda.setLayout(new javax.swing.BoxLayout(pnlMuda, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane2.setViewportView(pnlMuda);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Case9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Case9ActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_Case9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private customButton.customButton Case1;
    private customButton.customButton Case2;
    private customButton.customButton Case3;
    private customButton.customButton Case4;
    private customButton.customButton Case5;
    private customButton.customButton Case6;
    private customButton.customButton Case7;
    private customButton.customButton Case8;
    private customButton.customButton Case9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlMuda;
    // End of variables declaration//GEN-END:variables
}