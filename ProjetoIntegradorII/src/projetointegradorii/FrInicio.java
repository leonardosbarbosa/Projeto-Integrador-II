
package projetointegradorii;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrInicio extends javax.swing.JFrame {

    public FrInicio() throws SQLException {FrProdutos produto = new FrProdutos();
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRelatorio = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnVenda = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loja de Informática");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setText("Loja de Informática");

        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Reports.png"))); // NOI18N
        btnRelatorio.setText("Relatórios de Vendas");
        btnRelatorio.setToolTipText("Históricos");
        btnRelatorio.setFocusable(false);
        btnRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRelatorio.setPreferredSize(new java.awt.Dimension(140, 120));
        btnRelatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clients.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setToolTipText("Cadastro de Clientes");
        btnClientes.setFocusable(false);
        btnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Shop.png"))); // NOI18N
        btnVenda.setText("Venda de Produtos");
        btnVenda.setToolTipText("Vendas");
        btnVenda.setFocusable(false);
        btnVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Devices.png"))); // NOI18N
        btnProdutos.setText("Produtos");
        btnProdutos.setToolTipText("Cadastro de Produtos");
        btnProdutos.setFocusable(false);
        btnProdutos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProdutos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(123, 123, 123))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
        FrCadastroCli myFrame = new FrCadastroCli();
        myFrame.setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        FrProdutos produto = null;
        try {
            produto = new FrProdutos();
        } catch (SQLException ex) {
            Logger.getLogger(FrInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        produto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRelatorioActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrInicio().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FrInicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnVenda;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
