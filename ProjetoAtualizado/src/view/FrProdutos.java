package view;

import Controller.ProdutoController;
import ModeloBeans.ProdutoBeans;
import ModeloDao.ProdutoDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilitarios.ConexaoBD;
import utilitarios.Validacoes;

public class FrProdutos extends javax.swing.JFrame {

    ProdutoDao dao = new ProdutoDao();
    ProdutoBeans prod = new ProdutoBeans();
    Validacoes validador = new Validacoes();
    ConexaoBD conecta = new ConexaoBD();

    public FrProdutos() throws SQLException {
        initComponents();

        preencherTabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtDescricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldValorCompra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldVlrVenda = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldEstoque = new javax.swing.JTextField();
        jTextFieldFornecedor = new javax.swing.JTextField();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldUnidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jTextFieldCodProduto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldNomeProduto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButtonAddProduto = new javax.swing.JButton();
        jButtonDelProduto = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtPesquisaProduto = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        rdbID = new javax.swing.JRadioButton();
        rdbNome = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jButton1.setText("jButton1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Produtos");
        setSize(new java.awt.Dimension(600, 0));

        txtDescricao.setName("Descrição"); // NOI18N

        jLabel1.setText("Descrição:");

        jLabel2.setText("Unidade:");

        jLabel3.setText("Fornecedor:");

        jLabel4.setText("Marca:");

        jLabel5.setText("Valor de compra:");

        jTextFieldValorCompra.setName("Valor de compra"); // NOI18N

        jLabel6.setText("Valor de venda:");

        jTextFieldVlrVenda.setName("Valor de venda"); // NOI18N

        jLabel7.setText("Estoque:");

        jTextFieldEstoque.setName("Estoque"); // NOI18N

        jTextFieldFornecedor.setName("Fornecedor"); // NOI18N

        jTextFieldMarca.setName("Marca"); // NOI18N

        jTextFieldUnidade.setName("Unidade"); // NOI18N

        jLabel10.setText("Categoria:");

        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Processadores", "Placa-mãe", "Placa de Vídeo", "HD/SSD", "Periféricos" }));

        jTextFieldCodProduto.setEnabled(false);

        jLabel8.setText("Código do Produto:");

        jLabel9.setText("Nome do Produto:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jTextFieldFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldVlrVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNomeProduto)
                        .addGap(285, 285, 285))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldVlrVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));

        jButtonAddProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/floppy-disk.png"))); // NOI18N
        jButtonAddProduto.setToolTipText("Clique para adicionar um novo produto a base de dados");
        jButtonAddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddProdutoActionPerformed(evt);
            }
        });

        jButtonDelProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash.png"))); // NOI18N
        jButtonDelProduto.setToolTipText("Clique para excluir um produto da base de dados");
        jButtonDelProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelProdutoActionPerformed(evt);
            }
        });

        jButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/house.png"))); // NOI18N
        jButtonHome.setToolTipText("Aperte para voltar a tela inicial");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButtonAddProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDelProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonHome)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonAddProduto)
                .addComponent(jButtonDelProduto))
            .addComponent(jButtonHome)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar por:"));

        txtPesquisaProduto.setName("de pesquisa"); // NOI18N

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loupe.png"))); // NOI18N
        btnPesquisar.setToolTipText("Clique para pesquisar um produto");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbID);
        rdbID.setText("ID");

        buttonGroup1.add(rdbNome);
        rdbNome.setText("Nome");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Valor", "Estoque"
            }
        ));
        jTable1.setPreferredSize(new java.awt.Dimension(300, 300));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(rdbID)
                        .addGap(18, 18, 18)
                        .addComponent(rdbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(txtPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar)
                        .addGap(16, 16, 16))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdbNome)
                            .addComponent(rdbID))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        validador.campoVazio(txtPesquisaProduto);
        if (validador.hasError()) {
            JOptionPane.showMessageDialog(rootPane, validador.getMensagensErro());
            txtPesquisaProduto.grabFocus();
        } else {

            if (rdbID.isSelected()) {

                validador.validaNum(txtPesquisaProduto);
                if (validador.hasError()) {
                    JOptionPane.showMessageDialog(rootPane, validador.getMensagensErro());
                    txtPesquisaProduto.setText("");
                    txtPesquisaProduto.grabFocus();
                } else {

                    try {
                        preencherTabelId(Integer.parseInt(txtPesquisaProduto.getText()));
                    } catch (SQLException ex) {
                        Logger.getLogger(FrProdutos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else if (rdbNome.isSelected()) {
                try {
                    preencherTabelaNome(txtPesquisaProduto.getText());
                } catch (SQLException ex) {
                    Logger.getLogger(FrProdutos.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Favor selecionar uma das opções de pesquisa.");
            }

        }

        /*try {
         prod.setPesquisa(jTextFieldPesquisaProduto.getText());
         ProdutoBeans produto = dao.pesquisa(prod);

         jTextFieldCodProduto.setText(Integer.toString(produto.getCodProduto()));
         jTextFieldDescricao.setText(produto.getDescProduto());
         jTextFieldUnidade.setText(produto.getUniPorduto());
         jTextFieldFornecedor.setText(produto.getFornecedor());
         jTextFieldMarca.setText(produto.getMarca());
         jTextFieldValorCompra.setText(Float.toString(produto.getValorCompraProduto()));
         jTextFieldVlrVenda.setText(Float.toString(produto.getValorVendaProduto()));
         jTextFieldEstoque.setText(Integer.toString(produto.getEstoque()));
         jComboBoxCategoria.setSelectedItem(produto.getCategoria());

         } catch (SQLException ex) {
         Logger.getLogger(FrClientes.class.getName()).log(Level.SEVERE, null, ex);
         }*/
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void jButtonAddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddProdutoActionPerformed

        validador.campoVazio(jTextFieldNomeProduto);
        validador.campoVazio(txtDescricao);
        validador.campoVazio(jTextFieldUnidade);
        validador.campoVazio(jTextFieldFornecedor);
        validador.campoVazio(jTextFieldMarca);
        validador.campoVazio(jTextFieldValorCompra);
        validador.campoVazio(jTextFieldVlrVenda);
        validador.campoVazio(jTextFieldEstoque);
        validador.validaDouble(jTextFieldValorCompra);
        validador.validaDouble(jTextFieldVlrVenda);
        validador.validaNum(jTextFieldEstoque);

        if (validador.hasError()) {
            JOptionPane.showMessageDialog(null, validador.getMensagensErro());

        } else {
            try {
                String nome, descr, unidade, fornecedor, marca, categoria;
                int qtd_estoque;
                float vlr_compra, vlr_venda;
                nome = jTextFieldNomeProduto.getText();
                descr = (txtDescricao.getText());
                unidade = (jTextFieldUnidade.getText());
                fornecedor = (jTextFieldFornecedor.getText());
                marca = (jTextFieldMarca.getText());
                vlr_compra = Float.parseFloat(jTextFieldValorCompra.getText());
                vlr_venda = Float.parseFloat(jTextFieldVlrVenda.getText());
                qtd_estoque = Integer.parseInt(jTextFieldEstoque.getText());
                categoria = (String) (jComboBoxCategoria.getSelectedItem());
                ProdutoController.salvar(nome, descr, unidade, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque, categoria);
                preencherTabel();
                txtDescricao.setText("");
                jTextFieldUnidade.setText("");
                jTextFieldFornecedor.setText("");
                jTextFieldMarca.setText("");
                jTextFieldValorCompra.setText("");
                jTextFieldVlrVenda.setText("");
                jTextFieldEstoque.setText("");

            } catch (SQLException ex) {
                Logger.getLogger(FrProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButtonAddProdutoActionPerformed

    private void jButtonDelProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelProdutoActionPerformed

        int rsp = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if (rsp == JOptionPane.YES_OPTION) {
            prod.setDescProduto(txtDescricao.getText());
            try {
                dao.excluir(prod);
            } catch (SQLException ex) {
                Logger.getLogger(FrProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (jTable1.getSelectedRow() != 1) {
            DefaultTableModel dtmProdutos = (DefaultTableModel) jTable1.getModel();
            dtmProdutos.removeRow(jTable1.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto pra excluir");
        }
    }//GEN-LAST:event_jButtonDelProdutoActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        try {
            // TODO add your handling code here:
            FrInicio abrirInicio = new FrInicio();
            abrirInicio.setVisible(true);
            dispose();

        } catch (SQLException ex) {
            Logger.getLogger(FrProdutos.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        String nome_produto = "" + jTable1.getValueAt(jTable1.getSelectedRow(), 1);
        try {
            conecta.conectar();
            conecta.executaSQL("select * from produtos where nome ='" + nome_produto + "'");
            conecta.rs.first();
            jTextFieldNomeProduto.setText(conecta.rs.getString("nome"));
            jTextFieldCodProduto.setText(String.valueOf(conecta.rs.getInt("id")));
            txtDescricao.setText(conecta.rs.getString("descr"));
            jTextFieldUnidade.setText(conecta.rs.getString("un"));
            jTextFieldFornecedor.setText(conecta.rs.getString("fornecedor"));
            jTextFieldMarca.setText(conecta.rs.getString("marca"));
            jTextFieldValorCompra.setText(String.valueOf(conecta.rs.getFloat("vlr_compra")));
            jTextFieldVlrVenda.setText(String.valueOf(conecta.rs.getFloat("vlr_venda")));
            jTextFieldEstoque.setText(String.valueOf(conecta.rs.getInt("qtd_estoque")));
            jComboBoxCategoria.setSelectedItem(conecta.rs.getString("categoria"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao selecionar dados" + ex);
        }
        conecta.desconectar();
    }//GEN-LAST:event_jTable1MouseClicked

    public void preencherTabel() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        ProdutoDao dao = new ProdutoDao();

        for (ProdutoBeans p : dao.listar()) {
            modelo.addRow(new Object[]{
                p.getCodProduto(),
                p.getNomeProduto(),
                p.getValorVendaProduto(),
                p.getEstoque()
            });
        }
    }

    public void limparTabela(DefaultTableModel modelo) {

        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
        }

    }

    public void preencherTabelId(int id) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        conecta.conectar();
        conecta.executaSQL("SELECT * FROM produtos WHERE id = " + id);

        if (conecta.rs.first()) {
            modelo.addRow(new Object[]{
                conecta.rs.getString("id"),
                conecta.rs.getString("nome"),
                conecta.rs.getString("vlr_venda"),
                conecta.rs.getString("qtd_estoque")
            });
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nenhum produto encontrado.");
            txtPesquisaProduto.setText("");
            txtPesquisaProduto.grabFocus();
        }

        /* modelo.setNumRows(0);
         ProdutoDao dao = new ProdutoDao();
        
         for (ProdutoBeans p : dao.listar()) {
         modelo.addRow(new Object[]{
         p.getCodProduto(),
         p.getNomeProduto(),
         p.getValorVendaProduto(),
         p.getEstoque()
         });
         } */
    }

    public void preencherTabelaNome(String nome) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        conecta.conectar();
        conecta.executaSQL("SELECT * FROM produtos WHERE nome like '%" + nome + "%'");

        while (conecta.rs.next()) {
            modelo.addRow(new Object[]{
                conecta.rs.getString("id"),
                conecta.rs.getString("nome"),
                conecta.rs.getString("vlr_venda"),
                conecta.rs.getString("qtd_estoque")
            });
        }
        /*ProdutoDao dao = new ProdutoDao();
        
         for (ProdutoBeans p : dao.listar()) {
         modelo.addRow(new Object[]{
         p.getCodProduto(),
         p.getNomeProduto(),
         p.getValorVendaProduto(),
         p.getEstoque()
         });
         }*/
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrProdutos().setVisible(true);

                } catch (SQLException ex) {
                    Logger.getLogger(FrProdutos.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddProduto;
    private javax.swing.JButton jButtonDelProduto;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldCodProduto;
    private javax.swing.JTextField jTextFieldEstoque;
    private javax.swing.JTextField jTextFieldFornecedor;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldNomeProduto;
    private javax.swing.JTextField jTextFieldUnidade;
    private javax.swing.JTextField jTextFieldValorCompra;
    private javax.swing.JTextField jTextFieldVlrVenda;
    private javax.swing.JRadioButton rdbID;
    private javax.swing.JRadioButton rdbNome;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPesquisaProduto;
    // End of variables declaration//GEN-END:variables
}
