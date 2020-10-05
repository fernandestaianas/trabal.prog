package cadastroproduto;

import javax.swing.JOptionPane;


/**
 *
 * @author 201803210613
 */
public class CadProduto extends javax.swing.JFrame {
        private Produto pPesquisar = new Produto();
        public CadProduto() {
        initComponents();
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar3 = new javax.swing.JToolBar();
        panel2 = new java.awt.Panel();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        label13 = new java.awt.Label();
        label14 = new java.awt.Label();
        label15 = new java.awt.Label();
        btnListar1 = new java.awt.Button();
        btnRemover1 = new java.awt.Button();
        btnAlterar1 = new java.awt.Button();
        btnCadastrar1 = new java.awt.Button();
        jLabel7 = new javax.swing.JLabel();
        JcbUnidade1 = new javax.swing.JComboBox<String>();
        jLabel8 = new javax.swing.JLabel();
        txtApresentacao1 = new javax.swing.JTextField();
        txtNomeReduzido1 = new javax.swing.JTextField();
        txtDesc1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtComissao1 = new javax.swing.JTextField();
        txtCodBarras1 = new javax.swing.JTextField();
        jrbProduto1 = new javax.swing.JRadioButton();
        jrbServico1 = new javax.swing.JRadioButton();
        jrbQuantidade1 = new javax.swing.JRadioButton();
        jrbValor1 = new javax.swing.JRadioButton();
        jrbSim1 = new javax.swing.JRadioButton();
        JrbNao1 = new javax.swing.JRadioButton();
        jcbDsconto = new javax.swing.JCheckBox();
        jrbPromoSim1 = new javax.swing.JRadioButton();
        jrbPromoNao1 = new javax.swing.JRadioButton();
        label16 = new java.awt.Label();
        label17 = new java.awt.Label();
        label18 = new java.awt.Label();
        label19 = new java.awt.Label();
        label20 = new java.awt.Label();
        label21 = new java.awt.Label();
        label22 = new java.awt.Label();
        txtValorCompra = new java.awt.TextField();
        txtCustoOper = new java.awt.TextField();
        txtMargLucro = new java.awt.TextField();
        txtValorAVista = new java.awt.TextField();
        txtDesconto = new java.awt.TextField();
        label23 = new java.awt.Label();
        label24 = new java.awt.Label();
        label25 = new java.awt.Label();
        txtEstoqueMax = new java.awt.TextField();
        txtEstoqueMin = new java.awt.TextField();
        txtUltimoAumento = new java.awt.TextField();
        label1 = new java.awt.Label();
        txtValorPromo = new java.awt.TextField();
        label2 = new java.awt.Label();
        txtValidadePromo = new java.awt.TextField();
        panel1 = new java.awt.Panel();
        txtNome = new java.awt.TextField();
        jToolBar1 = new javax.swing.JToolBar();
        btnPesquisar = new java.awt.Button();
        btnSair = new java.awt.Button();
        label10 = new java.awt.Label();
        txtCod = new java.awt.TextField();
        label8 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jToolBar3.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEtchedBorder()));
        jToolBar3.setRollover(true);

        panel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        label11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label11.setForeground(new java.awt.Color(51, 102, 255));
        label11.setText("Tipo");

        label12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label12.setForeground(new java.awt.Color(51, 102, 255));
        label12.setText("Venda do Produto");

        label13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label13.setForeground(new java.awt.Color(51, 102, 255));
        label13.setText("Convênio");

        label14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label14.setForeground(new java.awt.Color(51, 102, 255));
        label14.setText("Estoque On line");

        label15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label15.setForeground(new java.awt.Color(51, 102, 255));
        label15.setText("Promoção");

        btnListar1.setLabel("Listar");
        btnListar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListar1ActionPerformed(evt);
            }
        });

        btnRemover1.setLabel("Remover");
        btnRemover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemover1ActionPerformed(evt);
            }
        });

        btnAlterar1.setLabel("Alterar");
        btnAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterar1ActionPerformed(evt);
            }
        });

        btnCadastrar1.setLabel("Cadastrar");
        btnCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrar1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Unidade:");

        JcbUnidade1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Unidade", "Cm", "Metro", "Litro" }));
        JcbUnidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcbUnidade1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Apresentação");

        jLabel9.setText("Descrição:");

        jLabel10.setText("Nome ");

        jLabel11.setText("Comissão:");

        jLabel12.setText("Código de Barras:");

        jrbProduto1.setSelected(true);
        jrbProduto1.setText("Produto");

        jrbServico1.setText("Serviço");

        jrbQuantidade1.setSelected(true);
        jrbQuantidade1.setText("Quantidade");
        jrbQuantidade1.setActionCommand("");

        jrbValor1.setText("Valor");

        jrbSim1.setText("Sim");

        JrbNao1.setSelected(true);
        JrbNao1.setText("Não");

        jcbDsconto.setText("Desconto");

        jrbPromoSim1.setSelected(true);
        jrbPromoSim1.setText("Sim");
        jrbPromoSim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPromoSim1ActionPerformed(evt);
            }
        });

        jrbPromoNao1.setText("Não");

        label16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label16.setForeground(new java.awt.Color(102, 153, 255));
        label16.setText("Posição de Estoque");

        label17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label17.setForeground(new java.awt.Color(102, 153, 255));
        label17.setText("Valores de Varejo");

        label18.setText("Valor de Compra:");

        label19.setText("Custo Oper:");

        label20.setText("Marg. Lucro:");

        label21.setText("Valor à Vista:");

        label22.setText("Desconto:");

        label23.setText("Estoque Mínimo:");

        label24.setText("Estoque Máximo:");

        label25.setText("Último Aumento:");

        label1.setText("Valor da Promoção:");

        label2.setText("Validade da Promoção:");

        txtNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jToolBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jToolBar1.setRollover(true);

        btnPesquisar.setLabel("Pesquisar");
        btnPesquisar.setMinimumSize(new java.awt.Dimension(46, 19));
        btnPesquisar.setName("Pesquisar"); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(575, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        btnPesquisar.getAccessibleContext().setAccessibleDescription("");
        btnPesquisar.getAccessibleContext().setAccessibleParent(this);

        btnSair.setLabel("Sair");
        btnSair.setName(""); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        label10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label10.setForeground(new java.awt.Color(51, 102, 255));
        label10.setText("Dados Básicos");

        txtCod.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCod.setName("codigo"); // NOI18N
        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });

        label8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label8.setForeground(new java.awt.Color(51, 102, 255));
        label8.setText("Identificação do Produto");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(JcbUnidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(127, 127, 127)
                                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(panel2Layout.createSequentialGroup()
                                                        .addComponent(label20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(19, 19, 19))
                                                    .addGroup(panel2Layout.createSequentialGroup()
                                                        .addComponent(txtMargLucro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(26, 26, 26))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                                .addComponent(txtEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)))
                                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(panel2Layout.createSequentialGroup()
                                                        .addComponent(txtValorAVista, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(26, 26, 26)
                                                        .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(panel2Layout.createSequentialGroup()
                                                            .addComponent(label21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(47, 47, 47)
                                                            .addComponent(label22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                                                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(label25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtUltimoAumento, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(32, 32, 32)
                                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtValidadePromo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtValorPromo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(126, 126, 126)
                                                .addComponent(jcbDsconto)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(txtApresentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(panel2Layout.createSequentialGroup()
                                                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(label19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(txtCustoOper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGap(28, 28, 28)))
                                                .addGap(60, 60, 60)
                                                .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jrbQuantidade1)
                                                    .addComponent(jrbValor1))
                                                .addGap(84, 84, 84)
                                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(JrbNao1)
                                                    .addComponent(jrbSim1))))
                                        .addGap(23, 23, 23)
                                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNomeReduzido1)
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addComponent(txtComissao1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(66, 66, 66)
                                                .addComponent(txtCodBarras1))
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel10)
                                                    .addGroup(panel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel11)
                                                        .addGap(96, 96, 96)
                                                        .addComponent(jLabel12))
                                                    .addGroup(panel2Layout.createSequentialGroup()
                                                        .addGap(241, 241, 241)
                                                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(panel2Layout.createSequentialGroup()
                                                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jrbPromoSim1)
                                                                    .addComponent(jrbPromoNao1))
                                                                .addGap(155, 155, 155)
                                                                .addComponent(btnRemover1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(84, 84, 84)
                                                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(btnListar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(btnAlterar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(70, 70, 70)
                                                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(btnCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(0, 0, Short.MAX_VALUE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtEstoqueMax, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(label16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                                    .addComponent(txtDesc1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtValorCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(label18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel2Layout.createSequentialGroup()
                                        .addComponent(label23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(label24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(159, 159, 159))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jrbServico1)
                            .addComponent(jrbProduto1)
                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeReduzido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JcbUnidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApresentacao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComissao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodBarras1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbProduto1)
                            .addComponent(jrbQuantidade1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbServico1)
                            .addComponent(jrbValor1)))
                    .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbSim1)
                                    .addComponent(jrbPromoSim1)
                                    .addComponent(jcbDsconto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JrbNao1)
                                    .addComponent(jrbPromoNao1)))
                            .addComponent(btnRemover1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCustoOper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMargLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorAVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorPromo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValidadePromo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstoqueMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUltimoAumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlterar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        jLabel10.getAccessibleContext().setAccessibleName("Nome ");

        jToolBar3.add(panel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 176, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void JcbUnidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcbUnidade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcbUnidade1ActionPerformed

    private void btnListar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListar1ActionPerformed
        for(int i = 0; i<Produto.listaProdutos.size();i++){
            Produto pAux =(Produto) Produto.listaProdutos.get(i);
            System.out.println("=========================================");
            System.out.println("Nome : " + pAux.getNomeReduz());
            System.out.println("Nome : " + pAux.getNomeReduz());
            System.out.println("Descrição: " + pAux.getDesc());
            System.out.println("Apresentação: " + pAux.getApresentacao());
            System.out.println("Código de barras: " + pAux.getCodBarras());
            System.out.println("Código: " + pAux.getCod());
            System.out.println("Nome: " + pAux.getNome());
            System.out.println("Último Aumento: " + pAux.getUltimoAumento());
            System.out.println("Comissão: " + pAux.getComissao());
            System.out.println("UNidade de medida: " + pAux.getUndMedida());
            System.out.println("Validade da Promoção: " + pAux.getValPromo());
            System.out.println("Margem de Lucro: " + pAux.getMargLucro());
            System.out.println("Venda do Produto: " + pAux.getVendaProduto());
            System.out.println("Valor a vista: " + pAux.getValorVista());
            System.out.println("Valor do desconto: " + pAux.getValorDesconto());
            System.out.println("Valor da compra: " + pAux.getValorCompra());
            System.out.println("Tipo de produto: " + pAux.getTipoProduto());
            System.out.println("Estoque Mínimo: " + pAux.getEstoqueMin());
            System.out.println("Estoque Máximo: " + pAux.getEstoqueMax());
            System.out.println("Estoque online: " + pAux.getEstoqOnline());
            System.out.println("=========================================");
        }
    }//GEN-LAST:event_btnListar1ActionPerformed

    private void jrbPromoSim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPromoSim1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbPromoSim1ActionPerformed

    private void btnCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar1ActionPerformed
        Produto p = new Produto();
        p.setApresentacao(txtApresentacao1.getText().trim());
        p.setApresentacao(txtCodBarras1.getText().trim());
        p.setDesc(txtDesc1.getText().trim());
        p.setConvenio(Integer.parseInt(txtDesconto.getText().trim()));
        p.setCustoOper(Double.parseDouble(txtCustoOper.getText().trim()));
        p.setComissao(Double.parseDouble(txtComissao1.getText().trim()));
        p.setEstoqueMax(Double.parseDouble(txtEstoqueMax.getText().trim()));
        p.setEstoqueMin(Double.parseDouble(txtEstoqueMin.getText().trim()));
        
        if (jrbSim1.isSelected()) 
            p.setEstoqOnline(1);
        else
            p.setEstoqOnline(0);
        
        p.setMargLucro(Double.parseDouble(txtMargLucro.getText().trim()));
        p.setNomeReduz(txtNomeReduzido1.getText().trim());
        
        if(jrbPromoSim1.isSelected())
            p.setPromocao(true);
        else
            p.setPromocao(false);
        
        if(jrbProduto1.isSelected())
            p.setTipoProduto(1);
        else
            p.setTipoProduto(0);
        
        if(jrbQuantidade1.isSelected())
            p.setVendaProduto(1);
        else
            p.setVendaProduto(0);
        
        p.InserirProdutos(p);
        System.out.println("Produto Cadastrado Com Sucesso!!!");
        
        LimparTela();
    }//GEN-LAST:event_btnCadastrar1ActionPerformed
    
    
    
    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodActionPerformed

    private void btnAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterar1ActionPerformed
        Produto pAuxiliar = new Produto();
        InsereGeral();
        pAuxiliar.RemoverProduto(this.pPesquisar.getNomeReduz());
    }//GEN-LAST:event_btnAlterar1ActionPerformed

    private void btnRemover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemover1ActionPerformed
        
        try{
          Produto pRemover = new Produto();
        pRemover.RemoverProduto(txtNomeReduzido1.getText().trim());
        JOptionPane.showMessageDialog(null, "Produto Removido com Sucesso");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
        }
    }//GEN-LAST:event_btnRemover1ActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String pNome = txtNome.getText().trim();
        this.pPesquisar = pPesquisar.PesquisarProd(pNome);
        if(pPesquisar.getDesc()==null)
        JOptionPane.showMessageDialog(null, "Produto não encontrado");
        else{
            txtApresentacao1.setText(pPesquisar.getApresentacao());
            txtCodBarras1.setText(pPesquisar.getCodBarras()+"");
            txtComissao1.setText(pPesquisar.getComissao()+"");
            txtCustoOper.setText(pPesquisar.getCustoOper()+"");
            txtDesc1.setText(pPesquisar.getDesc()+"");
            txtEstoqueMax.setText(pPesquisar.getEstoqueMax()+"");
            txtEstoqueMin.setText(pPesquisar.getEstoqueMin()+"");
            txtMargLucro.setText(pPesquisar.getMargLucro()+"");
            if(pPesquisar.getEstoqOnline()==1){
                jrbSim1.setSelected(true);
                JrbNao1.setSelected(false);
            }else{
                jrbSim1.setSelected(false);
                JrbNao1.setSelected(true);
            }
            txtNomeReduzido1.setText(pPesquisar.getNomeReduz());
            txtUltimoAumento.setText(pPesquisar.getUltimoAumento());
            txtValidadePromo.setText(pPesquisar.getValPromo());
            txtValorAVista.setText(pPesquisar.getValorVista()+"");
            txtValorCompra.setText(pPesquisar.getValorCompra()+"");
            txtValorPromo.setText(pPesquisar.getValorPromo()+"");
            if(pPesquisar.isPromocao()==true){
                jrbPromoSim1.setSelected(true);
                jrbPromoNao1.setSelected(false);
            }else{
                jrbPromoSim1.setSelected(false);
                jrbPromoNao1.setSelected(true);
            }
            if(pPesquisar.getTipoProduto()==1){
                jrbProduto1.setSelected(true);
                jrbServico1.setSelected(false);

            }else{
                jrbProduto1.setSelected(false);
                jrbServico1.setSelected(true);
            }
            if(pPesquisar.getVendaProduto()==1){
                jrbQuantidade1.setSelected(true);
                jrbValor1.setSelected(false);
            }else{
                jrbQuantidade1.setSelected(false);
                jrbValor1.setSelected(true);
            }
            txtCod.setText(pPesquisar.getCod()+"");
            txtNome.setText(pPesquisar.getNome());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed
        public void LimparTela(){
            txtApresentacao1.setText("");
            txtCod.setText("");
            txtCodBarras1.setText("");
            txtComissao1.setText("");
            txtCustoOper.setText("");
            txtDesc1.setText("");
            txtDesconto.setText("");
            txtEstoqueMax.setText("");
            txtEstoqueMin.setText("");
            txtMargLucro.setText("");
            txtNome.setText("");
            txtNomeReduzido1.setText("");
            txtUltimoAumento.setText("");
            txtValidadePromo.setText("");
            txtValorAVista.setText("");
            txtValorCompra.setText("");
            txtValorPromo.setText("");
            jrbSim1.setSelected(true);
            JrbNao1.setSelected(false);
            jrbProduto1.setSelected(true);
            jrbPromoSim1.setSelected(true);
            jrbPromoNao1.setSelected(false);
            jrbQuantidade1.setSelected(true);
            jrbValor1.setSelected(false);
            jrbServico1.setSelected(false);
            
        }
            public void InsereGeral(){
            Produto p = new Produto();
        p.setApresentacao(txtApresentacao1.getText().trim());
        p.setApresentacao(txtCodBarras1.getText().trim());
        p.setDesc(txtDesc1.getText().trim());
        p.setConvenio(Integer.parseInt(txtDesconto.getText().trim()));
        p.setCustoOper(Double.parseDouble(txtCustoOper.getText().trim()));
        p.setComissao(Double.parseDouble(txtComissao1.getText().trim()));
        p.setEstoqueMax(Double.parseDouble(txtEstoqueMax.getText().trim()));
        p.setEstoqueMin(Double.parseDouble(txtEstoqueMin.getText().trim()));
        
        if (jrbSim1.isSelected()) 
            p.setEstoqOnline(1);
        else
            p.setEstoqOnline(0);
        
        p.setMargLucro(Double.parseDouble(txtMargLucro.getText().trim()));
        p.setNomeReduz(txtNomeReduzido1.getText().trim());
        
        if(jrbPromoSim1.isSelected())
            p.setPromocao(true);
        else
            p.setPromocao(false);
        
        if(jrbProduto1.isSelected())
            p.setTipoProduto(1);
        else
            p.setTipoProduto(0);
        
        if(jrbQuantidade1.isSelected())
            p.setVendaProduto(1);
        else
            p.setVendaProduto(0);
        
        p.InserirProdutos(p);
        System.out.println("Produto Alterado Com Sucesso!!!");
        
        LimparTela();
        }
        
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
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JcbUnidade1;
    private javax.swing.JRadioButton JrbNao1;
    private java.awt.Button btnAlterar1;
    private java.awt.Button btnCadastrar1;
    private java.awt.Button btnListar1;
    private java.awt.Button btnPesquisar;
    private java.awt.Button btnRemover1;
    private java.awt.Button btnSair;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JCheckBox jcbDsconto;
    private javax.swing.JRadioButton jrbProduto1;
    private javax.swing.JRadioButton jrbPromoNao1;
    private javax.swing.JRadioButton jrbPromoSim1;
    private javax.swing.JRadioButton jrbQuantidade1;
    private javax.swing.JRadioButton jrbServico1;
    private javax.swing.JRadioButton jrbSim1;
    private javax.swing.JRadioButton jrbValor1;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label16;
    private java.awt.Label label17;
    private java.awt.Label label18;
    private java.awt.Label label19;
    private java.awt.Label label2;
    private java.awt.Label label20;
    private java.awt.Label label21;
    private java.awt.Label label22;
    private java.awt.Label label23;
    private java.awt.Label label24;
    private java.awt.Label label25;
    private java.awt.Label label8;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JTextField txtApresentacao1;
    private java.awt.TextField txtCod;
    private javax.swing.JTextField txtCodBarras1;
    private javax.swing.JTextField txtComissao1;
    private java.awt.TextField txtCustoOper;
    private javax.swing.JTextField txtDesc1;
    private java.awt.TextField txtDesconto;
    private java.awt.TextField txtEstoqueMax;
    private java.awt.TextField txtEstoqueMin;
    private java.awt.TextField txtMargLucro;
    private java.awt.TextField txtNome;
    private javax.swing.JTextField txtNomeReduzido1;
    private java.awt.TextField txtUltimoAumento;
    private java.awt.TextField txtValidadePromo;
    private java.awt.TextField txtValorAVista;
    private java.awt.TextField txtValorCompra;
    private java.awt.TextField txtValorPromo;
    // End of variables declaration//GEN-END:variables
}
