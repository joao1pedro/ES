package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class ViewSistema extends JFrame {

	private JPanel contentPane;
	private JTextField txtAgua;
	private JTextField txtCafe;
	private JTextField txtCerveja;
	private JTextField txtCoca;
	private JTextField txtAguaCc;
	private JTextField txtLaranja;
	private JTextField txtMaracuja;
	private JTextField txtSubT;
	
	private JTextField txtFritas;
	private JTextField txtSalada;
	private JTextField txtHamburger;
	private JTextField txtAneisdecebola;
	private JTextField txtSaladadefrango;
	private JTextField txtSanduichedeatum;
	private JTextField txtSanduichedequeijo;
	private JTextField txtSanduichedefrango;
	
	private JTextField txtBrownie;
	private JTextField txtTorrada;
	private JTextField txtPicole;
	private JTextField txtBolinho;
	private JTextField txtPanqueca;
	
	/*
	 * preco dos produtos
	 * */
	double priceAgua = 2.0;
	double priceAguaCc = 3.0;
	double priceCafe = 2.5;
	double priceCerveja= 3.5;
	double priceSucoLaranja = 2.5;
	double priceSucoMaracuja = 2.5;
	double priceCoca = 2.8;
	
	double taxa, valueTotal, subTotal, diferenca, custo, rateTaxa = 12;
	
	double itemcost[] = new double [8];
	private JTextField txtTaxa;
	private JTextField txtValue;
	private JTextField txtTroco;
	private JTextField txtInDinnheiro;
	private JTextField txtMesa;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ViewSistema() {
		setTitle("Sistema de pedidos");
		setPreferredSize(new Dimension(1024, 768));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);
		
		JMenu mnFuncionrios = new JMenu("Funcionários");
		mnFuncionrios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				GerenciaFunc frame = new GerenciaFunc();
				frame.setVisible(true);
			}
		});
		mnCadastro.add(mnFuncionrios);
		
		JMenu mnProdutos = new JMenu("Produtos");
		mnCadastro.add(mnProdutos);
		
		JMenu mnClientes = new JMenu("Clientes");
		mnCadastro.add(mnClientes);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenu mnSobre = new JMenu("Sobre");
		mnSobre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sobre frame = new Sobre();
				frame.setVisible(true);
			}
		});
		mnAjuda.add(mnSobre);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(1024, 768));
		contentPane.setPreferredSize(new Dimension(1024, 768));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(310, 84, 290, 600);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblBebidas = new JLabel("BEBIDAS");
		lblBebidas.setBounds(115, 11, 70, 15);
		panel.add(lblBebidas);
		
		JCheckBox chckbxAgua = new JCheckBox("Água");
		chckbxAgua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxAgua.isSelected()) {
					txtAgua.setEnabled(true);
					txtAgua.setText("");
				}
				else {
					txtAgua.setEnabled(false);
					txtAgua.setText("0");
				}
			}
		});
		chckbxAgua.setBounds(8, 35, 129, 23);
		panel.add(chckbxAgua);
		
		JCheckBox chckbxCaf = new JCheckBox("Café");
		chckbxCaf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxCaf.isSelected()) {
					txtCafe.setEnabled(true);
				}
				else {
					txtCafe.setEnabled(false);
				}
			}
		});
		chckbxCaf.setBounds(8, 62, 129, 23);
		panel.add(chckbxCaf);
		
		JCheckBox chckbxCerveja = new JCheckBox("Cerveja");
		chckbxCerveja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxCerveja.isSelected()) {
					txtCerveja.setEnabled(true);
					txtCerveja.setText("");
				}
				else {
					txtCerveja.setEnabled(false);
					txtCerveja.setText("0");
				}
			}
		});
		chckbxCerveja.setBounds(8, 89, 129, 23);
		panel.add(chckbxCerveja);
		
		JCheckBox chckbxCoca = new JCheckBox("Coca-Cola");
		chckbxCoca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxCoca.isSelected()) {
					txtCoca.setEnabled(true);
					txtCoca.setText("");
				}
				else {
					txtCoca.setEnabled(false);
					txtCoca.setText("0");
				}
			}
		});
		chckbxCoca.setBounds(8, 116, 129, 23);
		panel.add(chckbxCoca);
		
		JCheckBox chckbxLaranja = new JCheckBox("Laranja");
		chckbxLaranja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxLaranja.isSelected()) {
					txtLaranja.setEnabled(true);
					txtLaranja.setText("");
				}
				else {
					txtLaranja.setEnabled(false);
					txtLaranja.setText("0");
				}
			}
		});
		chckbxLaranja.setBounds(12, 219, 107, 23);
		panel.add(chckbxLaranja);
		
		JCheckBox chckbxMaracuja = new JCheckBox("Maracujá");
		chckbxMaracuja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxMaracuja.isSelected()) {
					txtMaracuja.setEnabled(true);
					txtMaracuja.setText("");
				}
				else {
					txtMaracuja.setEnabled(false);
					txtMaracuja.setText("0");
				}
			}
		});
		chckbxMaracuja.setBounds(12, 246, 107, 23);
		panel.add(chckbxMaracuja);
		
		JCheckBox chckbxAguaCc = new JCheckBox("Água de Côco");
		chckbxAguaCc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxAguaCc.isSelected()) {
					txtAguaCc.setEnabled(true);
					txtAguaCc.setText("");
				}
				else {
					txtAguaCc.setEnabled(false);
					txtAguaCc.setText("0");
				}
			}
		});
		chckbxAguaCc.setBounds(8, 143, 129, 23);
		panel.add(chckbxAguaCc);
		
		JLabel lblSucos = new JLabel("Sucos");
		lblSucos.setBounds(12, 196, 70, 15);
		panel.add(lblSucos);
		
		txtAgua = new JTextField();
		txtAgua.setEnabled(false);
		txtAgua.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		txtAgua.setBounds(143, 39, 80, 19);
		panel.add(txtAgua);
		txtAgua.setColumns(10);
		
		txtCafe = new JTextField();
		txtCafe.setEnabled(false);
		txtCafe.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		txtCafe.setColumns(10);
		txtCafe.setBounds(143, 64, 80, 19);
		panel.add(txtCafe);
		
		txtCerveja = new JTextField();
		txtCerveja.setEnabled(false);
		txtCerveja.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		txtCerveja.setColumns(10);
		txtCerveja.setBounds(143, 91, 80, 19);
		panel.add(txtCerveja);
		
		txtCoca = new JTextField();
		txtCoca.setEnabled(false);
		txtCoca.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		txtCoca.setColumns(10);
		txtCoca.setBounds(143, 118, 80, 19);
		panel.add(txtCoca);
		
		txtAguaCc = new JTextField();
		txtAguaCc.setEnabled(false);
		txtAguaCc.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		txtAguaCc.setColumns(10);
		txtAguaCc.setBounds(143, 143, 80, 19);
		panel.add(txtAguaCc);
		
		txtLaranja = new JTextField();
		txtLaranja.setEnabled(false);
		txtLaranja.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		txtLaranja.setColumns(10);
		txtLaranja.setBounds(143, 221, 80, 19);
		panel.add(txtLaranja);
		
		txtMaracuja = new JTextField();
		txtMaracuja.setEnabled(false);
		txtMaracuja.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		txtMaracuja.setColumns(10);
		txtMaracuja.setBounds(143, 248, 80, 19);
		panel.add(txtMaracuja);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(12, 0, 1328, 76);
		contentPane.add(panel_1);
		
		JLabel lbTelaInfo = new JLabel("SISTEMA RESTAURANTE");
		lbTelaInfo.setBounds(580, 28, 200, 24);
		panel_1.add(lbTelaInfo);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(12, 84, 290, 600);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblPrato = new JLabel("PRATOS PRINCIPAIS");
		lblPrato.setBounds(81, 11, 145, 14);
		panel_2.add(lblPrato);
		
		
		JCheckBox chckbxFritas = new JCheckBox("Fritas");
		chckbxFritas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFritas.isSelected()) {
					txtFritas.setEnabled(true);
					txtFritas.setText("");
				}
				else {
					txtFritas.setEnabled(false);
					txtFritas.setText("0");
				}
			}
		});
		chckbxFritas.setBounds(8, 35, 129, 23);
		panel_2.add(chckbxFritas);
		
		
		JCheckBox chckbxSalada = new JCheckBox("Salada");
		chckbxSalada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSalada.isSelected()) {
					txtSalada.setEnabled(true);
					txtSalada.setText("");
				}
				else {
					txtSalada.setEnabled(false);
					txtSalada.setText("0");
				}
			}
		});
		chckbxSalada.setBounds(8, 62, 129, 23);
		panel_2.add(chckbxSalada);
		
		
		JCheckBox chckbxHamburger = new JCheckBox("Hamburger");
		chckbxHamburger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxHamburger.isSelected()) {
					txtHamburger.setEnabled(true);
					txtHamburger.setText("");
				}
				else {
					txtHamburger.setEnabled(false);
					txtHamburger.setText("0");
				}
			}
		});
		chckbxHamburger.setBounds(8, 89, 129, 23);
		panel_2.add(chckbxHamburger);
		
		
		JCheckBox chckbxAneisdecebola = new JCheckBox("Aneisdecebola");
		chckbxAneisdecebola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxAneisdecebola.isSelected()) {
					txtAneisdecebola.setEnabled(true);
					txtAneisdecebola.setText("");
				}
				else {
					txtAneisdecebola.setEnabled(false);
					txtAneisdecebola.setText("0");
				}
			}
		});
		chckbxAneisdecebola.setBounds(8, 116, 129, 23);
		panel_2.add(chckbxAneisdecebola);
		
		
		JCheckBox chckbxSaladadefrango = new JCheckBox("Saladadefrango");
		chckbxSaladadefrango.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSaladadefrango.isSelected()) {
					txtSaladadefrango.setEnabled(true);
					txtSaladadefrango.setText("");
				}
				else {
					txtSaladadefrango.setEnabled(false);
					txtSaladadefrango.setText("0");
				}
			}
		});
		chckbxSaladadefrango.setBounds(8, 143, 129, 23);
		panel_2.add(chckbxSaladadefrango);
		
		
		JLabel lblSanduiche = new JLabel("Sanduiche");
		lblSanduiche.setBounds(12, 196, 70, 15);
		panel_2.add(lblSanduiche);
		
		
		JCheckBox chckbxSanduichedeatum = new JCheckBox("Sanduichedeatum");
		chckbxSanduichedeatum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSanduichedeatum.isSelected()) {
					txtSanduichedeatum.setEnabled(true);
					txtSanduichedeatum.setText("");
				}
				else {
					txtSanduichedeatum.setEnabled(false);
					txtSanduichedeatum.setText("0");
				}
			}
		});
		chckbxSanduichedeatum.setBounds(12, 219, 107, 23);
		panel_2.add(chckbxSanduichedeatum);
		
		JCheckBox chckbxSanduichedequeijo = new JCheckBox("Sanduichedequeijo");
		chckbxSanduichedequeijo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxSanduichedequeijo.isSelected()) {
					txtSanduichedequeijo.setEnabled(true);
				}
				else {
					txtSanduichedequeijo.setEnabled(false);
				}
			}
		});
		chckbxSanduichedequeijo.setBounds(12, 246, 107, 23);
		panel_2.add(chckbxSanduichedequeijo);
		
		JCheckBox chckbxSanduichedefrango = new JCheckBox("Sanduichedefrango");
		chckbxSanduichedefrango.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxSanduichedefrango.isSelected()) {
					txtSanduichedefrango.setEnabled(true);
					txtSanduichedefrango.setText("");
				}
				else {
					txtSanduichedefrango.setEnabled(false);
					txtSanduichedefrango.setText("0");
				}
			}
		});
		chckbxSanduichedefrango.setBounds(12, 273, 107, 23);
		panel_2.add(chckbxSanduichedefrango);
		
		
		txtFritas = new JTextField();
		txtFritas.setEnabled(false);
		txtFritas.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		txtFritas.setBounds(143, 39, 80, 19);
		panel_2.add(txtFritas);
		txtFritas.setColumns(10);
		
		txtSalada = new JTextField();
		txtSalada.setEnabled(false);
		txtSalada.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		txtSalada.setColumns(10);
		txtSalada.setBounds(143, 64, 80, 19);
		panel_2.add(txtSalada);
		
		txtHamburger = new JTextField();
		txtHamburger.setEnabled(false);
		txtHamburger.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		txtHamburger.setColumns(10);
		txtHamburger.setBounds(143, 91, 80, 19);
		panel_2.add(txtHamburger);
		
		txtAneisdecebola = new JTextField();
		txtAneisdecebola.setEnabled(false);
		txtAneisdecebola.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		txtAneisdecebola.setColumns(10);
		txtAneisdecebola.setBounds(143, 118, 80, 19);
		panel_2.add(txtAneisdecebola);
		
		txtSaladadefrango = new JTextField();
		txtSaladadefrango.setEnabled(false);
		txtSaladadefrango.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		txtSaladadefrango.setColumns(10);
		txtSaladadefrango.setBounds(143, 143, 80, 19);
		panel_2.add(txtSaladadefrango);
		
		txtSanduichedeatum = new JTextField();
		txtSanduichedeatum.setEnabled(false);
		txtSanduichedeatum.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		txtSanduichedeatum.setColumns(10);
		txtSanduichedeatum.setBounds(143, 221, 80, 19);
		panel_2.add(txtSanduichedeatum);
		
		txtSanduichedequeijo = new JTextField();
		txtSanduichedequeijo.setEnabled(false);
		txtSanduichedequeijo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		txtSanduichedequeijo.setColumns(10);
		txtSanduichedequeijo.setBounds(143, 248, 80, 19);
		panel_2.add(txtSanduichedequeijo);
		
		txtSanduichedefrango = new JTextField();
		txtSanduichedefrango.setEnabled(false);
		txtSanduichedefrango.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		txtSanduichedefrango.setColumns(10);
		txtSanduichedefrango.setBounds(143, 275, 80, 19);
		panel_2.add(txtSanduichedefrango);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(1050, 457, 290, 224);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblPagamento = new JLabel("PAGAMENTO");
		lblPagamento.setBounds(12, 12, 91, 15);
		panel_3.add(lblPagamento);
		
		JComboBox metodoPagamento = new JComboBox();
		metodoPagamento.setModel(new DefaultComboBoxModel(new String[] {"Dinheiro", "Débito", "Crédito"}));
		metodoPagamento.setBounds(12, 39, 91, 24);
		panel_3.add(metodoPagamento);
		
		JLabel lblSubT = new JLabel("Sub-Total");
		lblSubT.setBounds(145, 15, 77, 24);
		panel_3.add(lblSubT);
		
		txtSubT = new JTextField();
		txtSubT.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) || (iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		txtSubT.setBounds(224, 20, 56, 15);
		panel_3.add(txtSubT);
		txtSubT.setColumns(10);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(188, 187, 77, 25);
		panel_3.add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//limpa campos de texto
				txtAgua.setText(null);
				txtCafe.setText(null);
				txtCerveja.setText(null);
				txtCoca.setText(null);
				txtLaranja.setText(null);
				txtMaracuja.setText(null);
				txtSubT.setText(null);
				txtInDinnheiro.setText(null);
				txtTroco.setText(null);
				txtTaxa.setText(null);
				txtValue.setText(null);
				
				//limpa caixas de sele��o
				chckbxAgua.setSelected(false);
				chckbxCaf.setSelected(false);
				chckbxCerveja.setSelected(false);
				chckbxCoca.setSelected(false);
				chckbxAguaCc.setSelected(false);
				chckbxLaranja.setSelected(false);
				chckbxMaracuja.setSelected(false);
			}
		});
		btnLimpar.setBounds(96, 187, 82, 25);
		panel_3.add(btnLimpar);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!txtAgua.getText().isEmpty()){
					itemcost[0] = Double.parseDouble(txtAgua.getText());
				}
				if(!txtCafe.getText().isEmpty()){
					itemcost[1] = Double.parseDouble(txtCafe.getText());
				}
				if(!txtCerveja.getText().isEmpty()) {
					itemcost[2] = Double.parseDouble(txtCerveja.getText());
				}
				if(!txtCoca.getText().isEmpty()) {
					itemcost[3] = Double.parseDouble(txtCoca.getText());
				}
				if(!txtAguaCc.getText().isEmpty()) {
					itemcost[4] = Double.parseDouble(txtAguaCc.getText());
				}
				if(!txtLaranja.getText().isEmpty()) {
					itemcost[5] = Double.parseDouble(txtLaranja.getText());
				}
				if(!txtMaracuja.getText().isEmpty()) {
					itemcost[6] = Double.parseDouble(txtMaracuja.getText());
				}
				/*
				 * Para utilizar banco de dados, pode ser necessario utilizar
				 * try - catch
				 * Portanto, forma alternativa do bloco de codigo acima
				 * 
				try {
					itemcost[0] = Double.parseDouble(txtAgua.getText());
					itemcost[1] = Double.parseDouble(txtCafe.getText());
					itemcost[2] = Double.parseDouble(txtCerveja.getText());
					itemcost[3] = Double.parseDouble(txtCoca.getText());
					itemcost[4] = Double.parseDouble(txtAguaCc.getText());
					itemcost[5] = Double.parseDouble(txtLaranja.getText());
					itemcost[6] = Double.parseDouble(txtMaracuja.getText());
				}catch(NumberFormatException nfe){
					System.out.println("ERRO: " + nfe.getMessage());
				}
				*/
				
				
				String mPagamento = (String)metodoPagamento.getSelectedItem();
				
				if(mPagamento == "Dinheiro") {
					
					subTotal = itemcost[0] + itemcost[1] + itemcost[2] + itemcost[3] + itemcost[4] + itemcost[5] + itemcost[6]; 
					
					diferenca = Double.parseDouble(txtInDinnheiro.getText());
					
					if(diferenca >= subTotal) {
						String quantidade = String.format("R$%.2f",subTotal);
						txtSubT.setText(quantidade);
						
						taxa = ((subTotal * rateTaxa)/100);
						
						String vTaxa = String.format("R$%.2f", taxa);
						txtTaxa.setText(vTaxa);
						
						valueTotal = (subTotal + taxa);
						String vTotal = String.format("R$%.2f", valueTotal);
						txtValue.setText(vTotal);
						
						String vTroco = String.format("R$%.2f", (diferenca - valueTotal));
						txtTroco.setText(vTroco);
					}
					else {
						JOptionPane.showMessageDialog(null, "Lance o dinheiro suficiente", "Sistema Restaurante", JOptionPane.OK_OPTION);
					}
				}else if(mPagamento == "Débito" || mPagamento == "Crédito") {
					
					subTotal = itemcost[0] + itemcost[1] + itemcost[2] + itemcost[3] + itemcost[4] + itemcost[5] + itemcost[6]; 
					
					String quantidade = String.format("R$%.2f",subTotal);
					txtSubT.setText(quantidade);
					
					taxa = ((subTotal * rateTaxa)/100);
					
					String vTaxa = String.format("R$%.2f", taxa);
					txtTaxa.setText(vTaxa);
					
					valueTotal = (subTotal + taxa);
					String vTotal = String.format("R$%.2f", valueTotal);
					txtValue.setText(vTotal);
				}
				
				
			}
		});
		btnTotal.setBounds(12, 187, 70, 25);
		panel_3.add(btnTotal);
		
		JLabel lblTaxa = new JLabel("Taxa");
		lblTaxa.setBounds(167, 44, 44, 15);
		panel_3.add(lblTaxa);
		
		txtTaxa = new JTextField();
		txtTaxa.setColumns(10);
		txtTaxa.setBounds(224, 43, 56, 15);
		panel_3.add(txtTaxa);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(167, 70, 44, 15);
		panel_3.add(lblTotal);
		
		txtValue = new JTextField();
		txtValue.setColumns(10);
		txtValue.setBounds(224, 69, 56, 15);
		panel_3.add(txtValue);
		
		JLabel lblTroco = new JLabel("Troco");
		lblTroco.setBounds(167, 99, 44, 15);
		panel_3.add(lblTroco);
		
		txtTroco = new JTextField();
		txtTroco.setColumns(10);
		txtTroco.setBounds(224, 95, 56, 15);
		panel_3.add(txtTroco);
		
		txtInDinnheiro = new JTextField("0");
		txtInDinnheiro.setColumns(10);
		txtInDinnheiro.setBounds(37, 99, 56, 15);
		panel_3.add(txtInDinnheiro);
		
		JLabel lblEspcie = new JLabel("Espécie:");
		lblEspcie.setBounds(12, 75, 70, 15);
		panel_3.add(lblEspcie);
		
		JLabel lblR = new JLabel("R$");
		lblR.setBounds(12, 99, 22, 15);
		panel_3.add(lblR);
		
		JLabel lblMesa = new JLabel("Mesa:");
		lblMesa.setBounds(12, 134, 56, 15);
		panel_3.add(lblMesa);
		
		txtMesa = new JTextField("0");
		txtMesa.setColumns(10);
		txtMesa.setBounds(12, 150, 56, 15);
		panel_3.add(txtMesa);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(610, 84, 290, 600);
		contentPane.add(panel_4);
		
		
		JLabel lblSobremesas = new JLabel("SOBREMESAS");
		lblSobremesas.setBounds(149, 11, 10, 16);
		panel_4.add(lblSobremesas);
		
		JCheckBox chckbxBrownie = new JCheckBox("Brownie");
		chckbxBrownie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBrownie.isSelected()) {
					txtBrownie.setEnabled(true);
					txtBrownie.setText("");
				}
				else {
					txtBrownie.setEnabled(false);
					txtBrownie.setText("0");
				}
			}
		});
		chckbxBrownie.setBounds(8, 35, 129, 23);
		panel_4.add(chckbxBrownie);
		
		
		JCheckBox chckbxTorrada = new JCheckBox("Torrada");
		chckbxTorrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxTorrada.isSelected()) {
					txtTorrada.setEnabled(true);
					txtTorrada.setText("");
				}
				else {
					txtTorrada.setEnabled(false);
					txtTorrada.setText("0");
				}
			}
		});
		chckbxTorrada.setBounds(8, 62, 129, 23);
		panel_4.add(chckbxTorrada);
		
		
		JCheckBox chckbxPicole = new JCheckBox("Picole");
		chckbxPicole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPicole.isSelected()) {
					txtPicole.setEnabled(true);
					txtPicole.setText("");
				}
				else {
					txtPicole.setEnabled(false);
					txtPicole.setText("0");
				}
			}
		});
		chckbxPicole.setBounds(8, 89, 129, 23);
		panel_4.add(chckbxPicole);
		
		
		JCheckBox chckbxBolinho = new JCheckBox("Bolinho");
		chckbxBolinho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBolinho.isSelected()) {
					txtBolinho.setEnabled(true);
					txtBolinho.setText("");
				}
				else {
					txtBolinho.setEnabled(false);
					txtBolinho.setText("0");
				}
			}
		});
		chckbxBolinho.setBounds(8, 116, 129, 23);
		panel_4.add(chckbxBolinho);
		
		
		JCheckBox chckbxPanqueca = new JCheckBox("Panqueca");
		chckbxPanqueca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPanqueca.isSelected()) {
					txtPanqueca.setEnabled(true);
					txtPanqueca.setText("");
				}
				else {
					txtPanqueca.setEnabled(false);
					txtPanqueca.setText("0");
				}
			}
		});
		chckbxPanqueca.setBounds(8, 143, 129, 23);
		panel_4.add(chckbxPanqueca);
		
		txtBrownie = new JTextField();
		txtBrownie.setEnabled(false);
		txtBrownie.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		txtBrownie.setBounds(143, 39, 80, 19);
		panel_4.add(txtBrownie);
		txtBrownie.setColumns(10);
		
		txtTorrada = new JTextField();
		txtTorrada.setEnabled(false);
		txtTorrada.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		txtTorrada.setColumns(10);
		txtTorrada.setBounds(143, 64, 80, 19);
		panel_4.add(txtTorrada);
		
		txtPicole = new JTextField();
		txtPicole.setEnabled(false);
		txtPicole.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		txtPicole.setColumns(10);
		txtPicole.setBounds(143, 91, 80, 19);
		panel_4.add(txtPicole);
		
		txtBolinho = new JTextField();
		txtBolinho.setEnabled(false);
		txtBolinho.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		txtBolinho.setColumns(10);
		txtBolinho.setBounds(143, 118, 80, 19);
		panel_4.add(txtBolinho);
		
		txtPanqueca = new JTextField();
		txtPanqueca.setEnabled(false);
		txtPanqueca.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		txtPanqueca.setColumns(10);
		txtPanqueca.setBounds(143, 143, 80, 19);
		panel_4.add(txtPanqueca);
		
	}
}