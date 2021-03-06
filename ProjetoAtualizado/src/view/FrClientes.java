package view;

import Controller.ClienteController;
import ModeloBeans.ClienteBeans;
import ModeloDao.ClienteDao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilitarios.ConexaoBD;
import utilitarios.Validacoes;

/**
 * Classe responsável por gerar o painel de Clientes, possibilitando pesquisas
 * dos mesmos e seus respectivos dados
 *
 * @author lohan.ypyugue
 */
public class FrClientes extends javax.swing.JFrame {

    ClienteDao dao = new ClienteDao();
    ClienteBeans c = new ClienteBeans();
    Validacoes validador = new Validacoes();
    ConexaoBD conecta = new ConexaoBD();

    public FrClientes() throws SQLException {
        initComponents();

        preencherTabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        RBNome = new javax.swing.JRadioButton();
        RBCpf = new javax.swing.JRadioButton();
        jButtonNovo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldCpf = new javax.swing.JTextField();
        jTextFieldRg = new javax.swing.JTextField();
        jComboBoxSexo = new javax.swing.JComboBox<String>();
        jTextFieldNascimento = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldCodCli = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldFixo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCelular = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7Email = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldRua = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxUf = new javax.swing.JComboBox<String>();
        jLabel12 = new javax.swing.JLabel();
        jTextField1Cidade = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldCep = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clientes");

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa de clientes"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        txtPesquisar.setName("de pesquisa"); // NOI18N

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loupe.png"))); // NOI18N
        btnPesquisar.setToolTipText("Clique para realizar uma pesquisa de clientes a base de dados através do CPF");
        btnPesquisar.setName(""); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBNome);
        RBNome.setText("Nome");
        RBNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBNomeActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBCpf);
        RBCpf.setText("CPF");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(RBNome)
                        .addGap(18, 18, 18)
                        .addComponent(RBCpf)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisar)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RBCpf)
                            .addComponent(RBNome))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-client.png"))); // NOI18N
        jButtonNovo.setText("Novo Cliente");
        jButtonNovo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados pessoais"));

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel3.setText("RG:");

        jLabel4.setText("Sexo:");

        jLabel5.setText("Nascimento:");

        jTextFieldNome.setName("Nome"); // NOI18N

        jTextFieldCpf.setName("CPF"); // NOI18N

        jTextFieldRg.setName("RG"); // NOI18N

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));

        jTextFieldNascimento.setName("Nascimento"); // NOI18N
        jTextFieldNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNascimentoActionPerformed(evt);
            }
        });

        jLabel15.setText("Cliente nº:");

        jTextFieldCodCli.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTextFieldNome.getAccessibleContext().setAccessibleName("");
        jTextFieldNome.getAccessibleContext().setAccessibleDescription("");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        jLabel6.setText("Telefone fixo:");

        jTextFieldFixo.setName("Telefone Fixo"); // NOI18N

        jLabel7.setText("Celular:");

        jTextFieldCelular.setName("Celular"); // NOI18N

        jLabel8.setText("E-mail:");

        jTextField7Email.setName("E-mail"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7Email)))
                .addContainerGap(454, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabel9.setText("Rua:");

        jTextFieldRua.setName("Rua"); // NOI18N

        jLabel10.setText("Bairro:");

        jTextFieldBairro.setName("Bairro"); // NOI18N

        jLabel11.setText("UF:");

        jComboBoxUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel12.setText("Cidade:");

        jTextField1Cidade.setName("Cidade"); // NOI18N

        jLabel13.setText("CEP:");

        jTextFieldCep.setName("CEP"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(15, 15, 15)
                        .addComponent(jComboBoxUf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 283, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBoxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField1Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));
        jPanel7.setPreferredSize(new java.awt.Dimension(564, 83));

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/floppy-disk.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Clique aqui para salvar um novo cliente");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash.png"))); // NOI18N
        jButtonExcluir.setToolTipText("Clique para excluir o cliente da base de dados");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/house.png"))); // NOI18N
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jButtonSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonHome)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonHome)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSalvar)
                        .addComponent(jButtonExcluir)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNovo))
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        validador.campoVazio(jTextFieldNome);
        validador.campoVazio(jTextFieldCpf);
        validador.campoVazio(jTextFieldNascimento);
        validador.campoVazio(jTextFieldRua);
        validador.campoVazio(jTextFieldBairro);
        validador.campoVazio(jTextFieldCep);
        validador.campoVazio(jTextField1Cidade);
        validador.validaNome(jTextFieldNome);
        validador.validaNum(jTextFieldCpf);
        validador.validaNum(jTextFieldRg);
        validador.validaNum(jTextFieldFixo);
        validador.validaNum(jTextFieldCelular);
        validador.validaNum(jTextFieldCep);

        if (validador.hasError()) {
            JOptionPane.showMessageDialog(null, validador.getMensagensErro());

        } else {

            String codCli, nome, cpf, rg, nascimento, sexo, fixo, celular, email, rua, bairro, uf, cep, cidade;

            codCli = jTextFieldCodCli.getText();
            nome = (jTextFieldNome.getText());
            cpf = (jTextFieldCpf.getText());
            rg = (jTextFieldRg.getText());
            nascimento = (jTextFieldNascimento.getText());
            sexo = ((String) jComboBoxSexo.getSelectedItem());
            fixo = (jTextFieldFixo.getText());
            celular = (jTextFieldCelular.getText());
            email = (jTextField7Email.getText());
            rua = (jTextFieldRua.getText());
            bairro = (jTextFieldBairro.getText());
            uf = ((String) jComboBoxUf.getSelectedItem());
            cep = (jTextFieldCep.getText());
            cidade = (jTextField1Cidade.getText());

            ClienteController.salvar(codCli, nome, cpf, rg, nascimento, sexo, fixo, celular, email, rua, bairro, uf, cep, cidade);

            jTextField1Cidade.setText("");
            jTextField7Email.setText("");
            jTextFieldBairro.setText("");
            jTextFieldCelular.setText("");
            jTextFieldCep.setText("");
            jTextFieldCodCli.setText("");
            jTextFieldCpf.setText("");
            jTextFieldFixo.setText("");
            jTextFieldNascimento.setText("");
            jTextFieldNome.setText("");
            jTextFieldRg.setText("");
            jTextFieldRua.setText("");
            jTextFieldNome.grabFocus();

        }
        try {
            preencherTabel();
        } catch (SQLException ex) {
            Logger.getLogger(FrClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    /**
     * Método utilizado para habilitar todos os campos de inserção
     * @param evt 
     */
    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        jTextField1Cidade.setEnabled(true);
        jTextField7Email.setEnabled(true);
        jTextFieldBairro.setEnabled(true);
        jTextFieldCelular.setEnabled(true);
        jTextFieldCep.setEnabled(true);
        jTextFieldCodCli.setEnabled(false);
        jTextFieldCpf.setEnabled(true);
        jTextFieldFixo.setEnabled(true);
        jTextFieldNascimento.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldRg.setEnabled(true);
        jTextFieldRua.setEnabled(true);
        jComboBoxSexo.setEnabled(true);

        jTextField1Cidade.setText("");
        jTextField7Email.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCelular.setText("");
        jTextFieldCep.setText("");
        jTextFieldCodCli.setText("");
        jTextFieldCpf.setText("");
        jTextFieldFixo.setText("");
        jTextFieldNascimento.setText("");
        jTextFieldNome.setText("");
        jTextFieldRg.setText("");
        jTextFieldRua.setText("");
        jTextFieldNome.grabFocus();
    }//GEN-LAST:event_jButtonNovoActionPerformed
    
    /**
     * Método utilizado para pesquisar um cliente do banco de dados
     * @param evt 
     */
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        validador.campoVazio(txtPesquisar);
        if (validador.hasError()) {
            JOptionPane.showMessageDialog(rootPane, validador.getMensagensErro());
        }

        if (RBNome.isSelected()) {
            try {
                preencherTabelNomeCliente(txtPesquisar.getText());
            } catch (SQLException ex) {
                Logger.getLogger(FrClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (RBCpf.isSelected()) {
            try {
                preencherTabelCpfCliente(txtPesquisar.getText());
            } catch (SQLException ex) {
                Logger.getLogger(FrClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar uma opção de pesquisa.");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed
    
    /**
     * Método utilizado para deletar um cliente do banco de dados
     * @param evt 
     */
    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed

        int rsp = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir o cliente?", "Excluir Cliente", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (rsp == JOptionPane.YES_OPTION) {
            c.setNome(jTextFieldNome.getText());

            try {
                dao.excluir(c);
            } catch (SQLException ex) {
                Logger.getLogger(FrProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (jTable1.getSelectedRow() != 1) {
                DefaultTableModel dtmProdutos = (DefaultTableModel) jTable1.getModel();
                dtmProdutos.removeRow(jTable1.getSelectedRow());
            } else {
                JOptionPane.showMessageDialog(null, "Selecione pra excluir");
            }

            jTextField1Cidade.setText("");
            jTextField7Email.setText("");
            jTextFieldBairro.setText("");
            jTextFieldCelular.setText("");
            jTextFieldCep.setText("");
            jTextFieldCodCli.setText("");
            jTextFieldCpf.setText("");
            jTextFieldFixo.setText("");
            jTextFieldNascimento.setText("");
            jTextFieldNome.setText("");
            jTextFieldRg.setText("");
            jTextFieldRua.setText("");
        }

    }//GEN-LAST:event_jButtonExcluirActionPerformed
    
    /**
     * Método utilizado para voltar para página inicial
     * @param evt 
     */
    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        try {
            // TODO add your handling code here:
            FrInicio abrirInicio = new FrInicio();
            abrirInicio.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(FrClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jTextFieldNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNascimentoActionPerformed

    private void RBNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBNomeActionPerformed
    
    /**
     * Método utilizado para obter os dados do cliente ao clicar no cliente desejado que se encontra na "Jtable1"
     * @param evt 
     */
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        String nome_cliente = "" + jTable1.getValueAt(jTable1.getSelectedRow(), 1);

        try {
            conecta.conectar();
            conecta.executaSQL("select * from clientes where nome ='" + nome_cliente + "'");
            conecta.rs.first();
            jTextFieldCodCli.setText(String.valueOf(conecta.rs.getInt("id")));
            jTextFieldNome.setText(conecta.rs.getString("nome"));
            jTextFieldCpf.setText(conecta.rs.getString("cpf"));
            jTextFieldRg.setText(conecta.rs.getString("rg"));
            jTextFieldNascimento.setText(conecta.rs.getString("nascimento"));
            jComboBoxSexo.setSelectedItem(conecta.rs.getString("sexo"));
            jTextFieldFixo.setText(conecta.rs.getString("fixo"));
            jTextFieldCelular.setText(conecta.rs.getString("celular"));
            jTextField7Email.setText(conecta.rs.getString("email"));

            jTextFieldRua.setText(conecta.rs.getString("rua"));
            jTextFieldBairro.setText(conecta.rs.getString("bairro"));
            jComboBoxUf.setSelectedItem(conecta.rs.getString("uf"));
            jTextField1Cidade.setText(conecta.rs.getString("cidade"));
            jTextFieldCep.setText(conecta.rs.getString("cep"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao selecionar dados.");
        }

        jTextFieldCodCli.setEnabled(false);
        jTextFieldCpf.setEnabled(false);
        jTextFieldNascimento.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldRg.setEnabled(false);
        jComboBoxSexo.setEnabled(false);

        conecta.desconectar();
    }//GEN-LAST:event_jTable1MouseClicked
    
    
    public void preencherTabel() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        ClienteDao dao = new ClienteDao();

        for (ClienteBeans c : dao.listar()) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCpf()
            });
        }
    }
    
    /**
     * Método utilizado para preencher os campos da tabela "jTable1" com os dados: ID, Nome e CPF. Pesquisando pelo nome do cliente
     * @throws SQLException - tratamento de exceção
     * @param nome - nome Cliente
     */
    public void preencherTabelNomeCliente(String nome) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        ClienteDao dao = new ClienteDao();

        for (ClienteBeans c : dao.pesquisarClienteNomeTabela(nome)) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCpf()
            });
        }
    }
    
    /**
     * Método utilizado para preencher os campos da tabela "jTable1" com os dados: ID, Nome e CPF. Pesquisando pelo CPF do cliente
     * @throws SQLException - tratamento de exceção
     */
    public void preencherTabelCpfCliente(String cpf) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        ClienteDao dao = new ClienteDao();

        for (ClienteBeans c : dao.pesquisarClienteCpfTabela(cpf)) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCpf()
            });
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RBCpf;
    private javax.swing.JRadioButton RBNome;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JComboBox<String> jComboBoxUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1Cidade;
    private javax.swing.JTextField jTextField7Email;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCelular;
    private javax.swing.JTextField jTextFieldCep;
    private javax.swing.JTextField jTextFieldCodCli;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldFixo;
    private javax.swing.JTextField jTextFieldNascimento;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldRg;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
