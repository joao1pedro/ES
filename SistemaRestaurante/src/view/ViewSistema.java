package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import control.ControlGerenciaFunc;
import control.ControlProdutos;
import model.ModelProdutos;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;


import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class ViewSistema extends JFrame {

	private JPanel contentPane;
	private JTextField txtAgua;
	private JTextField txtCafe;
	private JTextField txtCerveja;
	private JTextField txtCoca;
	private JTextField txtAguaCc;
	private JTextField txtSubT;
	private JTextField txtLaranja;
	private JTextField txtMaracuja;
	private JTextField txtUva;
	private JTextField txtMorango;
	private JTextField txtLimao;
	private JTextField txtAbacaxi;
	private JTextField txtCaju;
	private JTextField txtManga;
	private JTextField txtGraviola;
	
	private JTextField txtFritas;
	private JTextField txtSalada;
	private JTextField txtHamburger;
	private JTextField txtAneisdecebola;
	private JTextField txtSaladadefrango;
	private JTextField txtArroz;
	private JTextField txtMacarrao;
	private JTextField txtFeijao;
	private JTextField txtBife;
	private JTextField txtFrango;
	private JTextField txtSanduichedeatum;
	private JTextField txtSanduichedequeijo;
	private JTextField txtSanduichedefrango;
	
	private JTextField txtBrownie;
	private JTextField txtTorrada;
	private JTextField txtPicole;
	private JTextField txtBolinho;
	private JTextField txtPanqueca;
	private JTextField txtTortaMorango;
	private JTextField txtTortaChocolate;
	private JTextField txtTortaLimao;
	private JTextField txtTortaAbacaxi;
	private JTextField txtTortaBanana;
	private JTextField txtTortaMaca;
	private JTextField txtSorvete;
	private JTextField txtPudim;
	private JTextField txtPave;
	
	private double taxa, valueTotal, subTotal, diferenca, rateTaxa;
	
	double itemcost[] = new double [100];
	private JTextField txtTaxa;
	private JTextField txtValue;
	private JTextField txtTroco;
	private JTextField txtInDinnheiro;
	private JTextField txtMesa;
	
	ControlGerenciaFunc control = new ControlGerenciaFunc();
	ModelProdutos model = new ModelProdutos();
	ControlProdutos controlP = new ControlProdutos();
	
	private JTextArea jtxtRecibo = new JTextArea();
	private int qtd = 0;
	private int mesa = 0;
	
	private String NomeAgua="";
	private String NomeCafe="";
	private String NomeCoca="";
	private String NomeCerveja="";
	private String NomeFritas="";
	private String NomeSalada="";
	private String NomeHamburger="";
	private String NomeAneisCebola="";
	private String NomeSaladaFrango="";
	private String NomeSanduicheAtum="";
	private String NomeSanduicheQueijo="";
	private String NomeSanduicheFrango="";
	private String NomeBrownie="";
	private String NomeTorrada="";
	private String NomePicole="";
	private String NomeBolinho="";
	private String NomePanqueca="";
	private String NomeTortaMorango="";
	private String NomeTortaChocolate="";
	private String NomeTortaLimao="";
	private String NomeTortaAbacaxi="";
	private String NomeTortaBanana="";
	private String NomeTortaMaca="";
	private String NomeSorvete="";
	private String NomePudim="";
	private String NomePave="";
	private String NomeUva="";
	private String NomeMorango="";
	private String NomeLimao="";
	private String NomeAbacaxi="";
	private String NomeCaju="";
	private String NomeManga="";
	private String NomeGraviola="";
	private String NomeArroz="";
	private String NomeMacarrao="";
	private String NomeFeijao="";
	private String NomeBife="";
	private String NomeFrango="";
	private String NomeSucoLaranja="";
	private String NomeSucoMaracuja="";
	private String NomeAguacc="";
	
    private JLabel lblHr = new JLabel("");

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ViewSistema() {
		JCheckBox chckbxTorrada = new JCheckBox("Torrada");
		JCheckBox chckbxPicole = new JCheckBox("Picole");
		JCheckBox chckbxBolinho = new JCheckBox("Bolinho");
		JCheckBox chckbxPanqueca = new JCheckBox("Panqueca");
		JCheckBox chckbxTortaDeMorango = new JCheckBox("Torta de Morango");
		JCheckBox chckbxTortaChocolate = new JCheckBox("Torta de Chocolate");
		JCheckBox chckbxTortaLimao = new JCheckBox("Torta de Limao");
		JCheckBox chckbxTortaAbacaxi = new JCheckBox("Torta de Abacaxi");
		JCheckBox chckbxTortaBanana = new JCheckBox("Torta de Banana");
		JCheckBox chckbxTortaMaca = new JCheckBox("Torta de Maca");
		JCheckBox chckbxSorvete = new JCheckBox("Sorvete");
		JCheckBox chckbxPudim = new JCheckBox("Pudim");
		JCheckBox chckbxPave = new JCheckBox("Pave");
		JCheckBox chckbxUva = new JCheckBox("Uva");
		JCheckBox chckbxMorango = new JCheckBox("Morango");
		JCheckBox chckbxLimao = new JCheckBox("Limao");
		JCheckBox chckbxAbacaxi = new JCheckBox("Abacaxi");
		JCheckBox chckbxCaju = new JCheckBox("Caju");
		JCheckBox chckbxManga = new JCheckBox("Manga");
		JCheckBox chckbxGraviola = new JCheckBox("Graviola");
		JCheckBox chckbxArroz = new JCheckBox("Arroz");
		JCheckBox chckbxMacarrao = new JCheckBox("Macarrao");
		JCheckBox chckbxFeijao = new JCheckBox("Feijao");
		JCheckBox chckbxBife = new JCheckBox("Bife");
		JCheckBox chckbxFrango = new JCheckBox("Frango");
		
		chckbxTortaDeMorango.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxTortaDeMorango.isSelected()) {
					txtTortaMorango.setEnabled(true);
					txtTortaMorango.setText("");
				}
				else {
					txtTortaMorango.setEnabled(false);
					txtTortaMorango.setText("0");
				}
			}
		});
		
		chckbxTortaChocolate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxTortaChocolate.isSelected()) {
					txtTortaChocolate.setEnabled(true);
					txtTortaChocolate.setText("");
				}
				else {
					txtTortaChocolate.setEnabled(false);
					txtTortaChocolate.setText("0");
				}
			}
		});
		
		chckbxTortaLimao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxTortaLimao.isSelected()) {
					txtTortaLimao.setEnabled(true);
					txtTortaLimao.setText("");
				}
				else {
					txtTortaLimao.setEnabled(false);
					txtTortaLimao.setText("0");
				}
			}
		});
		
		chckbxTortaAbacaxi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxTortaAbacaxi.isSelected()) {
					txtTortaAbacaxi.setEnabled(true);
					txtTortaAbacaxi.setText("");
				}
				else {
					txtTortaAbacaxi.setEnabled(false);
					txtTortaAbacaxi.setText("0");
				}
			}
		});
		
		chckbxTortaMaca.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxTortaMaca.isSelected()) {
					txtTortaMaca.setEnabled(true);
					txtTortaMaca.setText("");
				}
				else {
					txtTortaMaca.setEnabled(false);
					txtTortaMaca.setText("0");
				}
			}
		});
		
		chckbxTortaBanana.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxTortaBanana.isSelected()) {
					txtTortaBanana.setEnabled(true);
					txtTortaBanana.setText("");
				}
				else {
					txtTortaBanana.setEnabled(false);
					txtTortaBanana.setText("0");
				}
			}
		});
		
		chckbxSorvete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxSorvete.isSelected()) {
					txtSorvete.setEnabled(true);
					txtSorvete.setText("");
				}
				else {
					txtSorvete.setEnabled(false);
					txtSorvete.setText("0");
				}
			}
		});
		
		chckbxPudim.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxPudim.isSelected()) {
					txtPudim.setEnabled(true);
					txtPudim.setText("");
				}
				else {
					txtPudim.setEnabled(false);
					txtPudim.setText("0");
				}
			}
		});
		
		chckbxPave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxPave.isSelected()) {
					txtPave.setEnabled(true);
					txtPave.setText("");
				}
				else {
					txtPave.setEnabled(false);
					txtPave.setText("0");
				}
			}
		});
		
		chckbxUva.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxUva.isSelected()) {
					txtUva.setEnabled(true);
					txtUva.setText("");
				}
				else {
					txtUva.setEnabled(false);
					txtUva.setText("0");
				}
			}
		});
		
		chckbxMorango.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxMorango.isSelected()) {
					txtMorango.setEnabled(true);
					txtMorango.setText("");
				}
				else {
					txtMorango.setEnabled(false);
					txtMorango.setText("0");
				}
			}
		});
		
		chckbxLimao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxLimao.isSelected()) {
					txtLimao.setEnabled(true);
					txtLimao.setText("");
				}
				else {
					txtLimao.setEnabled(false);
					txtLimao.setText("0");
				}
			}
		});
		
		chckbxAbacaxi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxAbacaxi.isSelected()) {
					txtAbacaxi.setEnabled(true);
					txtAbacaxi.setText("");
				}
				else {
					txtAbacaxi.setEnabled(false);
					txtAbacaxi.setText("0");
				}
			}
		});
		
		chckbxCaju.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxCaju.isSelected()) {
					txtCaju.setEnabled(true);
					txtCaju.setText("");
				}
				else {
					txtCaju.setEnabled(false);
					txtCaju.setText("0");
				}
			}
		});
		
		chckbxManga.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxManga.isSelected()) {
					txtManga.setEnabled(true);
					txtManga.setText("");
				}
				else {
					txtManga.setEnabled(false);
					txtManga.setText("0");
				}
			}
		});
		
		chckbxGraviola.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxGraviola.isSelected()) {
					txtGraviola.setEnabled(true);
					txtGraviola.setText("");
				}
				else {
					txtGraviola.setEnabled(false);
					txtGraviola.setText("0");
				}
			}
		});
		
		chckbxArroz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxArroz.isSelected()) {
					txtArroz.setEnabled(true);
					txtArroz.setText("");
				}
				else {
					txtArroz.setEnabled(false);
					txtArroz.setText("0");
				}
			}
		});
		
		chckbxMacarrao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxMacarrao.isSelected()) {
					txtMacarrao.setEnabled(true);
					txtMacarrao.setText("");
				}
				else {
					txtMacarrao.setEnabled(false);
					txtMacarrao.setText("0");
				}
			}
		});
		
		chckbxFeijao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxFeijao.isSelected()) {
					txtFeijao.setEnabled(true);
					txtFeijao.setText("");
				}
				else {
					txtFeijao.setEnabled(false);
					txtFeijao.setText("0");
				}
			}
		});
		
		chckbxBife.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxBife.isSelected()) {
					txtBife.setEnabled(true);
					txtBife.setText("");
				}
				else {
					txtBife.setEnabled(false);
					txtBife.setText("0");
				}
			}
		});
		
		chckbxFrango.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxFrango.isSelected()) {
					txtFrango.setEnabled(true);
					txtFrango.setText("");
				}
				else {
					txtFrango.setEnabled(false);
					txtFrango.setText("0");
				}
			}
		});
		
	
		
		setTitle("Sistema de pedidos");
		setPreferredSize(new Dimension(800, 600));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnGerenciamento = new JMenu("Gerenciamento");
		menuBar.add(mnGerenciamento);
		
		JMenu mnFuncionrios = new JMenu("Funcionários");
		mnFuncionrios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				boolean permissao;
				permissao = control.verificaPermissao(TelaLogin.login);

				if(permissao == true) {
					dispose();
					GerenciaFunc frame = new GerenciaFunc();
					frame.setVisible(true);
					frame.updateTable();
				}else {
					JOptionPane.showMessageDialog(null, "Usuário não possui nivel de permissão adequado.");
				}
			}
		});
		mnGerenciamento.add(mnFuncionrios);
		
		JMenu mnProdutos = new JMenu("Produtos");
		mnProdutos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				boolean permissao;
				permissao = control.verificaPermissao(TelaLogin.login);
				
				if(permissao == true) {
					dispose();
					GerenciaProd frame = new GerenciaProd();
					frame.setVisible(true);
					frame.pegaTaxa();
					frame.pegaTotal();
					frame.updateTable();
				} else {
					JOptionPane.showMessageDialog(null, "Usuário não possui nivel de permissão adequado.");
				}
			}
		});
		mnGerenciamento.add(mnProdutos);
		
		JMenu mnClientes = new JMenu("Clientes");
		mnGerenciamento.add(mnClientes);
		
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
		panel.setBounds(310, 84, 290, 546);
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
		chckbxAgua.setBounds(8, 77, 129, 23);
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
		chckbxCaf.setBounds(8, 104, 129, 23);
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
		chckbxCerveja.setBounds(8, 131, 129, 23);
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
		chckbxCoca.setBounds(8, 158, 129, 23);
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
		chckbxLaranja.setBounds(12, 234, 107, 23);
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
		chckbxMaracuja.setBounds(12, 261, 107, 23);
		panel.add(chckbxMaracuja);
		
		chckbxUva.setBounds(12, 288, 107, 23);
		panel.add(chckbxUva);
		
		txtUva = new JTextField();
		txtUva.setEnabled(false);
		txtUva.setBounds(143, 288, 80, 19);
		txtUva.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		panel.add(txtUva);
		txtUva.setColumns(10);
		
		
		chckbxMorango.setBounds(12, 315, 107, 23);
		panel.add(chckbxMorango);
		
		txtMorango = new JTextField();
		txtMorango.setEnabled(false);
		txtMorango.setBounds(143, 315, 80, 19);
		txtMorango.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		panel.add(txtMorango);
		txtMorango.setColumns(10);
		
		chckbxLimao.setBounds(12, 342, 107, 23);
		panel.add(chckbxLimao);
		
		txtLimao = new JTextField();
		txtLimao.setEnabled(false);
		txtLimao.setBounds(143, 342, 80, 19);
		txtLimao.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		panel.add(txtLimao);
		txtLimao.setColumns(10);
		
		chckbxAbacaxi.setBounds(12, 369, 107, 23);
		panel.add(chckbxAbacaxi);
		
		txtAbacaxi = new JTextField();
		txtAbacaxi.setEnabled(false);
		txtAbacaxi.setBounds(143, 369, 80, 19);
		txtAbacaxi.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		panel.add(txtAbacaxi);
		txtAbacaxi.setColumns(10);
		
		chckbxCaju.setBounds(12, 396, 107, 23);
		panel.add(chckbxCaju);
		
		txtCaju = new JTextField();
		txtCaju.setEnabled(false);
		txtCaju.setBounds(143, 396, 80, 19);
		txtCaju.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		panel.add(txtCaju);
		txtCaju.setColumns(10);
		
		chckbxManga.setBounds(12, 423, 107, 23);
		panel.add(chckbxManga);
		
		txtManga = new JTextField();
		txtManga.setEnabled(false);
		txtManga.setBounds(143, 423, 80, 19);
		txtManga.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		panel.add(txtManga);
		txtManga.setColumns(10);
		
		chckbxGraviola.setBounds(12, 450, 107, 23);
		panel.add(chckbxGraviola);
		
		txtGraviola = new JTextField();
		txtGraviola.setEnabled(false);
		txtGraviola.setBounds(143, 450, 80, 19);
		txtGraviola.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		panel.add(txtGraviola);
		txtGraviola.setColumns(10);
		
		
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
		chckbxAguaCc.setBounds(8, 185, 129, 23);
		panel.add(chckbxAguaCc);
		
		JLabel lblSucos = new JLabel("Sucos");
		lblSucos.setBounds(12, 215, 70, 15);
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
		txtAgua.setBounds(143, 77, 80, 19);
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
		txtCafe.setBounds(143, 104, 80, 19);
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
		txtCerveja.setBounds(143, 131, 80, 19);
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
		txtCoca.setBounds(143, 158, 80, 19);
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
		txtAguaCc.setBounds(143, 185, 80, 19);
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
		txtLaranja.setBounds(143, 234, 80, 19);
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
		txtMaracuja.setBounds(143, 261, 80, 19);
		panel.add(txtMaracuja);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ViewSistema.class.getResource("/bebida.png")));
		lblNewLabel_1.setBounds(12, 11, 70, 66);
		panel.add(lblNewLabel_1);
		
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
		panel_2.setBounds(22, 84, 290, 546);
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
		chckbxFritas.setBounds(8, 57, 129, 23);
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
		chckbxSalada.setBounds(8, 84, 129, 23);
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
		chckbxHamburger.setBounds(8, 111, 129, 23);
		panel_2.add(chckbxHamburger);
		
		
		JCheckBox chckbxAneisdecebola = new JCheckBox("Anéis de cebola");
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
		chckbxAneisdecebola.setBounds(8, 138, 129, 23);
		panel_2.add(chckbxAneisdecebola);
		
		
		JCheckBox chckbxSaladadefrango = new JCheckBox("Salada de frango");
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
		chckbxSaladadefrango.setBounds(8, 165, 129, 23);
		panel_2.add(chckbxSaladadefrango);
		
		chckbxArroz.setBounds(8, 192, 129, 23);
		panel_2.add(chckbxArroz);
		
		txtArroz = new JTextField();
		txtArroz.setEnabled(false);
		txtArroz.setBounds(175, 192, 80, 19);
		txtArroz.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		panel_2.add(txtArroz);
		txtArroz.setColumns(10);
		
		chckbxMacarrao.setBounds(8, 219, 129, 23);
		panel_2.add(chckbxMacarrao);
		
		txtMacarrao = new JTextField();
		txtMacarrao.setEnabled(false);
		txtMacarrao.setBounds(175, 219, 80, 19);
		txtMacarrao.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		panel_2.add(txtMacarrao);
		txtMacarrao.setColumns(10);
		
		chckbxFeijao.setBounds(8, 246, 129, 23);
		panel_2.add(chckbxFeijao);
		
		txtFeijao = new JTextField();
		txtFeijao.setEnabled(false);
		txtFeijao.setBounds(175, 246, 80, 19);
		txtFeijao.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		panel_2.add(txtFeijao);
		txtFeijao.setColumns(10);
		
		chckbxBife.setBounds(8, 273, 129, 23);
		panel_2.add(chckbxBife);
		
		txtBife = new JTextField();
		txtBife.setEnabled(false);
		txtBife.setBounds(175, 273, 80, 19);
		txtBife.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		panel_2.add(txtBife);
		txtBife.setColumns(10);
		
		chckbxFrango.setBounds(8, 300, 129, 23);
		panel_2.add(chckbxFrango);
		
		txtFrango = new JTextField();
		txtFrango.setEnabled(false);
		txtFrango.setBounds(175, 300, 80, 19);
		txtFrango.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		panel_2.add(txtFrango);
		txtFrango.setColumns(10);
		
		
		JLabel lblSanduiche = new JLabel("Sanduiches");
		lblSanduiche.setBounds(12, 331, 92, 15);
		panel_2.add(lblSanduiche);
		
		
		JCheckBox chckbxSanduichedeatum = new JCheckBox("Sanduiche de atum");
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
		chckbxSanduichedeatum.setBounds(12, 354, 155, 23);
		panel_2.add(chckbxSanduichedeatum);
		
		JCheckBox chckbxSanduichedequeijo = new JCheckBox("Sanduiche de queijo");
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
		chckbxSanduichedequeijo.setBounds(12, 381, 155, 23);
		panel_2.add(chckbxSanduichedequeijo);
		
		JCheckBox chckbxSanduichedefrango = new JCheckBox("Sanduiche de frango");
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
		chckbxSanduichedefrango.setBounds(12, 408, 155, 23);
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
		txtFritas.setBounds(175, 57, 80, 19);
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
		txtSalada.setBounds(175, 84, 80, 19);
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
		txtHamburger.setBounds(175, 111, 80, 19);
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
		txtAneisdecebola.setBounds(175, 138, 80, 19);
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
		txtSaladadefrango.setBounds(175, 165, 80, 19);
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
		txtSanduichedeatum.setBounds(175, 356, 80, 19);
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
		txtSanduichedequeijo.setBounds(175, 383, 80, 19);
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
		txtSanduichedefrango.setBounds(175, 410, 80, 19);
		panel_2.add(txtSanduichedefrango);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ViewSistema.class.getResource("/Steak-icon.png")));
		lblNewLabel.setBounds(12, 11, 72, 38);
		panel_2.add(lblNewLabel);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(912, 460, 307, 224);
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
				dispose();
				TelaLogin frame = new TelaLogin();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(190, 187, 77, 25);
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
				txtAneisdecebola.setText(null);
				txtBolinho.setText(null);
				txtBrownie.setText(null);
				txtFritas.setText(null);
				txtHamburger.setText(null);
				txtPanqueca.setText(null);
				txtPicole.setText(null);
				txtSalada.setText(null);
				txtSaladadefrango.setText(null);
				txtSanduichedeatum.setText(null);
				txtSanduichedefrango.setText(null);
				txtSanduichedequeijo.setText(null);
				txtTorrada.setText(null);
				txtAguaCc.setText(null);
				txtTortaMorango.setText(null);
				txtTortaChocolate.setText(null);
				txtTortaLimao.setText(null);
				txtTortaAbacaxi.setText(null);
				txtTortaBanana.setText(null);
				txtTortaMaca.setText(null);
				txtSorvete.setText(null);
				txtPudim.setText(null);
				txtPave.setText(null);
				txtUva.setText(null);
				txtMorango.setText(null);
				txtLimao.setText(null);
				txtAbacaxi.setText(null);
				txtCaju.setText(null);
				txtManga.setText(null);
				txtGraviola.setText(null);
				txtArroz.setText(null);
				txtMacarrao.setText(null);
				txtFeijao.setText(null);
				txtBife.setText(null);
				txtFrango.setText(null);
				txtMesa.setText(null);
				
				//limpa caixas de seleção
				chckbxAgua.setSelected(false);
				chckbxCaf.setSelected(false);
				chckbxCerveja.setSelected(false);
				chckbxCoca.setSelected(false);
				chckbxAguaCc.setSelected(false);
				chckbxLaranja.setSelected(false);
				chckbxMaracuja.setSelected(false);
				chckbxFritas.setSelected(false);
				chckbxHamburger.setSelected(false);
				chckbxSalada.setSelected(false);
				chckbxSaladadefrango.setSelected(false);
				chckbxSanduichedeatum.setSelected(false);
				chckbxSanduichedefrango.setSelected(false);
				chckbxSanduichedequeijo.setSelected(false);
				chckbxAneisdecebola.setSelected(false);
				chckbxTorrada.setSelected(false);
				chckbxBolinho.setSelected(false);
				chckbxPicole.setSelected(false);
				chckbxPanqueca.setSelected(false);
				chckbxTortaDeMorango.setSelected(false);
				chckbxTortaChocolate.setSelected(false);
				chckbxTortaLimao.setSelected(false); 
				chckbxTortaAbacaxi.setSelected(false); 
				chckbxTortaBanana.setSelected(false);
				chckbxTortaMaca.setSelected(false);
				chckbxSorvete.setSelected(false);
				chckbxPudim.setSelected(false); 
				chckbxPave.setSelected(false);
				chckbxUva.setSelected(false);
				chckbxMorango.setSelected(false);
				chckbxLimao.setSelected(false);
				chckbxAbacaxi.setSelected(false);
				chckbxCaju.setSelected(false);
				chckbxManga.setSelected(false);
				chckbxGraviola.setSelected(false);
				chckbxArroz.setSelected(false);
				chckbxMacarrao.setSelected(false);
				chckbxFeijao.setSelected(false);
				chckbxBife.setSelected(false);
				chckbxFrango.setSelected(false);
				
				//desabilita campos de texto
				txtAgua.setEnabled(false);
				txtCafe.setEnabled(false);
				txtCerveja.setEnabled(false);
				txtCoca.setEnabled(false);
				txtLaranja.setEnabled(false);
				txtMaracuja.setEnabled(false);
				
				txtAneisdecebola.setEnabled(false);
				txtBolinho.setEnabled(false);
				txtBrownie.setEnabled(false);
				txtFritas.setEnabled(false);
				txtHamburger.setEnabled(false);
				txtPanqueca.setEnabled(false);
				txtPicole.setEnabled(false);
				txtSalada.setEnabled(false);
				txtSaladadefrango.setEnabled(false);
				txtSanduichedeatum.setEnabled(false);
				txtSanduichedefrango.setEnabled(false);
				txtSanduichedequeijo.setEnabled(false);
				txtTorrada.setEnabled(false);
				txtAguaCc.setEnabled(false);
				txtTortaMorango.setEnabled(false);
				txtTortaChocolate.setEnabled(false);
				txtTortaLimao.setEnabled(false);
				txtTortaAbacaxi.setEnabled(false);
				txtTortaBanana.setEnabled(false);
				txtTortaMaca.setEnabled(false);
				txtSorvete.setEnabled(false);
				txtPudim.setEnabled(false);
				txtPave.setEnabled(false);
				txtUva.setEnabled(false);
				txtMorango.setEnabled(false);
				txtLimao.setEnabled(false);
				txtAbacaxi.setEnabled(false);
				txtCaju.setEnabled(false);
				txtManga.setEnabled(false);
				txtGraviola.setEnabled(false);
				txtArroz.setEnabled(false);
				txtMacarrao.setEnabled(false);
				txtFeijao.setEnabled(false);
				txtBife.setEnabled(false);
				txtFrango.setEnabled(false);
				
				
				jtxtRecibo.setText(null);
				
				model.setQtd(0);
				model.setQtdAgua(0);
				model.setQtdCafe(0);
				model.setQtdCerveja(0);
				model.setQtdCoca(0);
				model.setQtdAguacc(0);
				model.setQtdSucoLaranja(0);
				model.setQtdSucoMaracuja(0);
				model.setQtdFritas(0);
				model.setQtdSalada(0);
				model.setQtdHamburger(0);
				model.setQtdAneisCebola(0);
				model.setQtdSaladaFrango(0);
				model.setQtdSanduicheAtum(0);
				model.setQtdSanduicheQueijo(0);
				model.setQtdSanduicheFrango(0);
				model.setQtdBrownie(0);
				model.setQtdTorrada(0);
				model.setQtdBolinho(0);
				model.setQtdPanqueca(0);
				model.setQtdPicole(0);
				model.setQtdTortaMorango(0);
				model.setQtdTortaChocolate(0);
				model.setQtdTortaLimao(0);
				model.setQtdTortaAbacaxi(0);
				model.setQtdTortaBanana(0);
				model.setQtdTortaMaca(0);
				model.setQtdSorvete(0);
				model.setQtdPudim(0);
				model.setQtdPave(0);
				model.setQtdUva(0);
				model.setQtdMorango(0);
				model.setQtdLimao(0);
				model.setQtdAbacaxi(0);
				model.setQtdCaju(0);
				model.setQtdManga(0);
				model.setQtdGraviola(0);
				model.setQtdArroz(0);
				model.setQtdMacarrao(0);
				model.setQtdFeijao(0);
				model.setQtdBife(0);
				model.setQtdFrango(0);
				
				//limpa preços para não dar erro no preço total
				itemcost[0] = 0;
				itemcost[1] = 0;
				itemcost[2] = 0;
				itemcost[3] = 0;
				itemcost[4] = 0;
				itemcost[5] = 0;
				itemcost[6] = 0;
				itemcost[7] = 0;
				itemcost[8] = 0;
				itemcost[9] = 0;
				itemcost[10] = 0;
				itemcost[11] = 0;
				itemcost[12] = 0;
				itemcost[13] = 0;
				itemcost[14] = 0;
				itemcost[15] = 0;
				itemcost[16] = 0;
				itemcost[17] = 0;
				itemcost[18] = 0;
				itemcost[19] = 0;
				itemcost[20] = 0;
				itemcost[21] = 0;
				itemcost[22] = 0;
				itemcost[23] = 0;
				itemcost[24] = 0;
				itemcost[25] = 0;
				itemcost[26] = 0;
				itemcost[27] = 0;
				itemcost[28] = 0;
				itemcost[29] = 0;
				itemcost[30] = 0;
				itemcost[31] = 0;
				itemcost[32] = 0;
				itemcost[33] = 0;
				itemcost[34] = 0;
				itemcost[35] = 0;
				itemcost[36] = 0;
				itemcost[37] = 0;
				itemcost[38] = 0;
				itemcost[39] = 0;
				itemcost[40] = 0;
				
				NomeAgua="";
				NomeCafe="";
				NomeCerveja="";
				NomeAguacc="";
				NomeCoca="";
				NomeSucoLaranja="";
				NomeSucoMaracuja="";
				NomeFritas="";
				NomeSalada="";
				NomeHamburger="";
				NomeAneisCebola="";
				NomeSaladaFrango="";
				NomeSanduicheAtum="";
				NomeSanduicheQueijo="";
				NomeBrownie="";
				NomeTorrada="";
				NomePicole="";
				NomeBolinho="";
				NomePanqueca="";
				NomeTortaMorango="";
				NomeTortaChocolate="";
				NomeTortaLimao="";
				NomeTortaAbacaxi="";
				NomeTortaBanana="";
				NomeTortaMaca="";
				NomeSorvete="";
				NomePudim="";
				NomePave="";
				NomeUva="";
				NomeMorango="";
				NomeLimao="";
				NomeAbacaxi="";
				NomeCaju="";
				NomeManga="";
				NomeGraviola="";
				NomeArroz="";
				NomeMacarrao="";
				NomeFeijao="";
				NomeBife="";
				NomeFrango="";
				
				model.setMesa(0);
			}
		});
		btnLimpar.setBounds(96, 187, 82, 25);
		panel_3.add(btnLimpar);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cafe = txtCafe.getText();
				String agua = txtAgua.getText();
				String cerveja = txtCerveja.getText();
				String coca = txtCoca.getText();
				String aguacc = txtAguaCc.getText();
				String sucoLaranja = txtLaranja.getText();
				String sucoMaracuja = txtMaracuja.getText();
				String fritas = txtFritas.getText();
				String salada = txtSalada.getText();
				String hamburger = txtHamburger.getText();
				String aneisCebola = txtAneisdecebola.getText();
				String saladaFrango = txtSaladadefrango.getText();
				String sanduicheAtum = txtSanduichedeatum.getText();
				String sanduicheQueijo = txtSanduichedequeijo.getText();
				String sanduicheFrango = txtSanduichedefrango.getText();
				String brownie = txtBrownie.getText();
				String torrada = txtTorrada.getText();
				String bolinho = txtBolinho.getText();
				String panqueca = txtPanqueca.getText();
				String picole = txtPicole.getText();
				String tortaMorango = txtTortaMorango.getText();
				String tortaChocolate = txtTortaChocolate.getText();
				String tortaLimao = txtTortaLimao.getText();
				String tortaAbacaxi = txtTortaAbacaxi.getText();
				String tortaBanana = txtTortaBanana.getText();
				String tortaMaca = txtTortaMaca.getText();
				String sorvete = txtSorvete.getText();
				String pudim = txtPudim.getText();
				String pave = txtPave.getText();
				String uva = txtUva.getText();
				String morango = txtMorango.getText();
				String limao = txtLimao.getText();
				String abacaxi = txtAbacaxi.getText();
				String caju = txtCaju.getText();
				String manga = txtManga.getText();
				String graviola = txtGraviola.getText();
				String arroz = txtArroz.getText();
				String macarrao = txtMacarrao.getText();
				String feijao = txtFeijao.getText();
				String bife = txtBife.getText();
				String frango = txtFrango.getText();
				
				int qtdCafe;
				int qtdAgua;
				int qtdCerveja;
				int qtdCoca;
				int qtdAguacc;
				int qtdSucoLaranja;
				int qtdSucoMaracuja;
				int qtdFritas;
				int qtdSalada;
				int qtdHamburger;
				int qtdAneisCebola;
				int qtdSaladaFrango;
				int qtdSanduicheAtum;
				int qtdSanduicheQueijo;
				int qtdSanduicheFrango;
				int qtdBrownie;
				int qtdTorrada;
				int qtdBolinho;
				int qtdPanqueca;
				int qtdPicole;
				int qtdTortaMorango;
				int qtdTortaChocolate;
				int qtdTortaLimao;
				int qtdTortaAbacaxi;
				int qtdTortaBanana;
				int qtdTortaMaca;
				int qtdSorvete;
				int qtdPudim;
				int qtdPave;
				int qtdUva;
				int qtdMorango;
				int qtdLimao;
				int qtdAbacaxi;
				int qtdCaju;
				int qtdManga;
				int qtdGraviola;
				int qtdArroz;
				int qtdMacarrao;
				int qtdFeijao;
				int qtdBife;
				int qtdFrango;
				
				rateTaxa = controlP.getPrice(model, "taxa");
				
						
				if(!agua.isEmpty()){
					qtdAgua = Integer.parseInt(txtAgua.getText());
					itemcost[0] = controlP.getPrice(model, "água") * qtdAgua;
					model.setQtdAgua(qtdAgua);
					NomeAgua=" Água ";
				}
				if(!cafe.isEmpty()){
					qtdCafe = Integer.parseInt(txtCafe.getText());
					itemcost[1] = controlP.getPrice(model, "café") * qtdCafe;
					model.setQtdCafe(qtdCafe);
					NomeCafe=" Café ";
				}
				if(!cerveja.isEmpty()) {
					qtdCerveja = Integer.parseInt(txtCerveja.getText());
					itemcost[2] = controlP.getPrice(model, "cerveja") * qtdCerveja;
					model.setQtdCerveja(qtdCerveja);
					NomeCerveja=" Cerveja ";
				}
				if(!coca.isEmpty()) {
					qtdCoca = Integer.parseInt(txtCoca.getText());
					itemcost[3] = controlP.getPrice(model, "coca-cola") * qtdCoca;
					model.setQtdCoca(qtdCoca);
					NomeCoca=" Coca-Cola ";
				}
				if(!aguacc.isEmpty()) {
					qtdAguacc = Integer.parseInt(txtAguaCc.getText());
					itemcost[4] = controlP.getPrice(model, "água de côco") * qtdAguacc;
					model.setQtdAguacc(qtdAguacc);
					NomeAguacc=" Água de Coco ";
				}
				if(!sucoLaranja.isEmpty()) {
					qtdSucoLaranja = Integer.parseInt(txtLaranja.getText());
					itemcost[5] = Double.parseDouble(txtLaranja.getText()) * qtdSucoLaranja;
					model.setQtdSucoLaranja(qtdSucoLaranja);
					NomeSucoLaranja=" Suco de Laranja ";
				}
				if(!sucoMaracuja.isEmpty()) {
					qtdSucoMaracuja = Integer.parseInt(txtMaracuja.getText());
					itemcost[6] = controlP.getPrice(model, "suco de maracujá") * qtdSucoMaracuja;
					model.setQtdSucoMaracuja(qtdSucoMaracuja);
					NomeSucoMaracuja=" Suco de Maracujá ";
				}
				if(!fritas.isEmpty()) {
					qtdFritas = Integer.parseInt(txtFritas.getText());
					itemcost[7] = controlP.getPrice(model, "batata frita") * qtdFritas;
					model.setQtdFritas(qtdFritas);
					NomeFritas=" Fritas ";
				}
				if(!salada.isEmpty()) {
					qtdSalada = Integer.parseInt(txtSalada.getText());
					itemcost[8] = controlP.getPrice(model, "salada") * qtdSalada;
					model.setQtdSalada(qtdSalada);
					NomeSalada=" Salada ";
				}
				if(!hamburger.isEmpty()) {
					qtdHamburger = Integer.parseInt(txtHamburger.getText());
					itemcost[9] = controlP.getPrice(model, "hamburger") * qtdHamburger;
					model.setQtdHamburger(qtdHamburger);
					NomeHamburger=" Hamburger ";
				}
				if(!aneisCebola.isEmpty()) {
					qtdAneisCebola = Integer.parseInt(txtAneisdecebola.getText());
					itemcost[10] = controlP.getPrice(model, "anéis de cebola") * qtdAneisCebola;
					model.setQtdAneisCebola(qtdAneisCebola);
					NomeAneisCebola=" Anéis de cebola ";
				}
				if(!saladaFrango.isEmpty()) {
					qtdSaladaFrango = Integer.parseInt(txtSaladadefrango.getText());
					itemcost[11] = controlP.getPrice(model, "salada de frango") * qtdSaladaFrango;
					model.setQtdSaladaFrango(qtdSaladaFrango);
					NomeSaladaFrango=" Salada de Frango ";
				}
				if(!sanduicheAtum.isEmpty()) {
					qtdSanduicheAtum = Integer.parseInt(txtSanduichedeatum.getText());
					itemcost[12] = controlP.getPrice(model, "sanduiche de atum") * qtdSanduicheAtum;
					model.setQtdSanduicheAtum(qtdSanduicheAtum);
					NomeSanduicheAtum=" Sanduiche de Atum ";
				}
				if(!sanduicheQueijo.isEmpty()) {
					qtdSanduicheQueijo = Integer.parseInt(txtSanduichedequeijo.getText());
					itemcost[13] = controlP.getPrice(model, "sanduiche de queijo") * qtdSanduicheQueijo;
					model.setQtdSanduicheQueijo(qtdSanduicheQueijo);
					NomeSanduicheQueijo=" Sanduiche de Queijo ";
				}
				if(!sanduicheFrango.isEmpty()) {
					qtdSanduicheFrango = Integer.parseInt(txtSanduichedefrango.getText());
					itemcost[14] = controlP.getPrice(model, "sanduiche de frango") * qtdSanduicheFrango;
					model.setQtdSanduicheFrango(qtdSanduicheFrango);
					NomeSanduicheFrango=" Sanduiche de Frango ";
				}
				if(!brownie.isEmpty()) {
					qtdBrownie = Integer.parseInt(txtBrownie.getText());
					itemcost[15] = controlP.getPrice(model, "brownie") * qtdBrownie;
					model.setQtdBrownie(qtdBrownie);
					NomeBrownie=" Brownie ";
				}
				if(!torrada.isEmpty()) {
					qtdTorrada = Integer.parseInt(txtTorrada.getText());
					itemcost[16] = controlP.getPrice(model, "torrada") * qtdTorrada;
					model.setQtdTorrada(qtdTorrada);
					NomeTorrada=" Torrada ";
				}
				if(!picole.isEmpty()) {
					qtdPicole = Integer.parseInt(txtPicole.getText());
					itemcost[17] = controlP.getPrice(model, "picole") * qtdPicole;
					model.setQtdPicole(qtdPicole);
					NomePicole=" Picole ";
				}
				if(!bolinho.isEmpty()) {
					qtdBolinho = Integer.parseInt(txtBolinho.getText());
					itemcost[18] = controlP.getPrice(model, "bolinho") * qtdBolinho;
					model.setQtdBolinho(qtdBolinho);
					NomeBolinho=" Bolinho ";
				}
				if(!panqueca.isEmpty()) {
					qtdPanqueca = Integer.parseInt(txtPanqueca.getText());
					itemcost[19] = controlP.getPrice(model, "panqueca") * qtdPanqueca;
					model.setQtdPanqueca(qtdPanqueca);
					NomePanqueca=" Panqueca ";
				}
				if(!tortaMorango.isEmpty()) {
					qtdTortaMorango = Integer.parseInt(txtTortaMorango.getText());
					itemcost[20] = controlP.getPrice(model, "torta de morango") * qtdTortaMorango;
					model.setQtdTortaMorango(qtdTortaMorango);
					NomeTortaMorango=" Torta de Morango ";
				}
				if(!tortaChocolate.isEmpty()) {
					qtdTortaChocolate = Integer.parseInt(txtTortaChocolate.getText());
					itemcost[21] = controlP.getPrice(model, "torta de chocolate") * qtdTortaChocolate;
					model.setQtdTortaChocolate(qtdTortaChocolate);
					NomeTortaChocolate=" Torta de Chocolate ";
				}
				if(!tortaLimao.isEmpty()) {
					qtdTortaLimao = Integer.parseInt(txtTortaLimao.getText());
					itemcost[22] = controlP.getPrice(model, "torta de limão") * qtdTortaLimao;
					model.setQtdTortaLimao(qtdTortaLimao);
					NomeTortaLimao=" Torta de Limao ";
				}
				if(!tortaAbacaxi.isEmpty()) {
					qtdTortaAbacaxi = Integer.parseInt(txtTortaAbacaxi.getText());
					itemcost[23] = controlP.getPrice(model, "torta de abacaxi") * qtdTortaAbacaxi;
					model.setQtdTortaAbacaxi(qtdTortaAbacaxi);
					NomeTortaAbacaxi=" Torta de Abacaxi ";
				}
				if(!tortaBanana.isEmpty()) {
					qtdTortaBanana = Integer.parseInt(txtTortaBanana.getText());
					itemcost[24] = controlP.getPrice(model, "torta de banana") * qtdTortaBanana;
					model.setQtdTortaBanana(qtdTortaBanana);
					NomeTortaBanana=" Torta de Banana ";
				}
				if(!tortaMaca.isEmpty()) {
					qtdTortaMaca = Integer.parseInt(txtTortaMaca.getText());
					itemcost[25] = controlP.getPrice(model, "torta de maça") * qtdTortaMaca;
					model.setQtdTortaMaca(qtdTortaMaca);
					NomeTortaMaca=" Torta de Maca ";
				}
				
				if(!sorvete.isEmpty()) {
					qtdSorvete = Integer.parseInt(txtSorvete.getText());
					itemcost[26] = controlP.getPrice(model, "sorvete") * qtdSorvete;
					model.setQtdSorvete(qtdSorvete);
					NomeSorvete=" Sorvete ";
				}
				
				if(!pudim.isEmpty()) {
					qtdPudim = Integer.parseInt(txtPudim.getText());
					itemcost[27] = controlP.getPrice(model, "pudim") * qtdPudim;
					model.setQtdPudim(qtdPudim);
					NomePudim=" Pudim ";
				}
				
				if(!pave.isEmpty()) {
					qtdPave= Integer.parseInt(txtPave.getText());
					itemcost[28] = controlP.getPrice(model, "pava") * qtdPave;
					model.setQtdPave(qtdPave);
					NomePave=" Pave "; 
				}
				
				if(!uva.isEmpty()) {
					qtdUva= Integer.parseInt(txtUva.getText());
					itemcost[29] = controlP.getPrice(model, "suco de uva") * qtdUva;
					model.setQtdUva(qtdUva);
					NomeUva=" Uva "; 
				}
				
				if(!morango.isEmpty()) {
					qtdMorango= Integer.parseInt(txtMorango.getText());
					itemcost[30] = controlP.getPrice(model, "suco de morango") * qtdMorango;
					model.setQtdMorango(qtdMorango);
					NomeMorango=" Morango "; 
				}
				
				if(!limao.isEmpty()) {
					qtdLimao= Integer.parseInt(txtLimao.getText());
					itemcost[31] = controlP.getPrice(model, "suco de limão") * qtdLimao;
					model.setQtdLimao(qtdLimao);
					NomeLimao=" Limão "; 
				}
				
				if(!abacaxi.isEmpty()) {
					qtdAbacaxi= Integer.parseInt(txtAbacaxi.getText());
					itemcost[32] = controlP.getPrice(model, "suco de abacaxi") * qtdAbacaxi;
					model.setQtdAbacaxi(qtdAbacaxi);
					NomeAbacaxi=" Abacaxi "; 
				}
				
				if(!caju.isEmpty()) {
					qtdCaju= Integer.parseInt(txtCaju.getText());
					itemcost[33] = controlP.getPrice(model, "suco de caju") * qtdCaju;
					model.setQtdCaju(qtdCaju);
					NomeCaju=" Caju "; 
				}
				
				if(!manga.isEmpty()) {
					qtdManga= Integer.parseInt(txtManga.getText());
					itemcost[34] = controlP.getPrice(model, "suco de manga") * qtdManga;
					model.setQtdManga(qtdManga);
					NomeManga=" Manga "; 
				}
				
				if(!graviola.isEmpty()) {
					qtdGraviola= Integer.parseInt(txtGraviola.getText());
					itemcost[35] = controlP.getPrice(model, "suco de graviola") * qtdGraviola;
					model.setQtdGraviola(qtdGraviola);
					NomeGraviola=" Graviola "; 
				}
				
				if(!arroz.isEmpty()) {
					qtdArroz= Integer.parseInt(txtArroz.getText());
					itemcost[36] = controlP.getPrice(model, "arroz") * qtdArroz;
					model.setQtdArroz(qtdArroz);
					NomeArroz=" Arroz "; 
				}
				
				if(!macarrao.isEmpty()) {
					qtdMacarrao= Integer.parseInt(txtMacarrao.getText());
					itemcost[37] = controlP.getPrice(model, "macarrão") * qtdMacarrao;
					model.setQtdMacarrao(qtdMacarrao);
					NomeMacarrao=" Macarrão "; 
				}

				if(!feijao.isEmpty()) {
					qtdFeijao= Integer.parseInt(txtFeijao.getText());
					itemcost[38] = controlP.getPrice(model, "feijão") * qtdFeijao;
					model.setQtdFeijao(qtdFeijao);
					NomeFeijao=" Feijão "; 
				}
				
				if(!bife.isEmpty()) {
					qtdBife= Integer.parseInt(txtBife.getText());
					itemcost[39] = controlP.getPrice(model, "bife") * qtdBife;
					model.setQtdBife(qtdBife);
					NomeBife=" Bife "; 
				}
				
				if(!frango.isEmpty()) {
					qtdFrango= Integer.parseInt(txtFrango.getText());
					itemcost[40] = controlP.getPrice(model, "frango") * qtdFrango;
					model.setQtdFrango(qtdFrango);
					NomeFrango=" Frango "; 
				}
				
				String mPagamento = (String)metodoPagamento.getSelectedItem();
				
				subTotal = itemcost[0] + itemcost[1] + itemcost[2] + itemcost[3] + itemcost[4] + itemcost[5] +
						itemcost[6] + itemcost[7] + itemcost[8] + itemcost[9] + itemcost[10] + itemcost[11] + itemcost[12] +
						itemcost[13] + itemcost[14] + itemcost[15] + itemcost[16] + itemcost[17] + itemcost[18] + itemcost[19] + 
						itemcost[20] + itemcost[21] + itemcost[22] + itemcost[23] + itemcost[24] + itemcost[25] + itemcost[26] + 
						itemcost[27] + itemcost[28] + itemcost[29] + itemcost[30] + itemcost[31] + itemcost[32] + itemcost[33] + 
						itemcost[34] + itemcost[35] + itemcost[36] + itemcost[37] + itemcost[38] + itemcost[39] + itemcost[40];
				
				if(mPagamento == "Dinheiro") {
					
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
					
					String quantidade = String.format("R$%.2f",subTotal);
					txtSubT.setText(quantidade);
					
					taxa = ((subTotal * rateTaxa)/100);
					
					String vTaxa = String.format("R$%.2f", taxa);
					txtTaxa.setText(vTaxa);
					
					valueTotal = (subTotal + taxa);
					String vTotal = String.format("R$%.2f", valueTotal);
					txtValue.setText(vTotal);
				}
				
				qtd = model.getQtdAgua()+model.getQtdCafe()+model.getQtdCerveja()+model.getQtdCoca()+
						model.getQtdAguacc()+model.getQtdSucoLaranja()+model.getQtdSucoMaracuja()+
						model.getQtdFritas()+model.getQtdSalada()+model.getQtdHamburger()+model.getQtdAneisCebola()+
						model.getQtdSaladaFrango()+model.getQtdSanduicheAtum()+model.getQtdSanduicheFrango()+
						model.getQtdSanduicheQueijo()+model.getQtdBrownie()+model.getQtdTorrada()+model.getQtdPicole()+
						model.getQtdBolinho()+model.getQtdPanqueca()+model.getQtdTortaMorango()+model.getQtdTortaChocolate()+
						model.getQtdTortaLimao()+model.getQtdTortaAbacaxi()+model.getQtdTortaBanana()+model.getQtdTortaMaca()+
						model.getQtdSorvete()+model.getQtdPudim()+model.getQtdPave()+model.getQtdUva()+model.getQtdMorango()+
						model.getQtdAbacaxi()+model.getQtdLimao()+model.getQtdCaju()+model.getQtdManga()+model.getQtdGraviola();
				
				model.setOperacao("Venda");
				model.setQtd(qtd);
				model.setValorTotal(valueTotal);
				model.setSubTotal(subTotal);
				model.setTaxa(taxa);
				model.setVendedor(TelaLogin.login);
				
				mesa = Integer.parseInt(txtMesa.getText());
				if(mesa >0 && mesa<=30) {
					model.setMesa(mesa);
					boolean registra = controlP.registraVenda(model);
					
					/*
					 * data e hora
					 * */
					Calendar timer = Calendar.getInstance();
					timer.getTime();
					SimpleDateFormat fTime = new SimpleDateFormat("HH:mm:ss");
					fTime.format(timer.getTime());
					SimpleDateFormat fDate = new SimpleDateFormat("dd-MMM-yyyy");
					fDate.format(timer.getTime());
					
					if(registra == true) {
						JOptionPane.showMessageDialog(null, "Venda registrada com sucesso!");
						int id = controlP.getMax(model);
						
						jtxtRecibo.append("\tSmart Food\n"+
								"\n====================================\n"+
											"Pratos principais:\t\t" + NomeFritas+NomeAneisCebola + NomeArroz+ NomeBife +NomeFeijao+
											NomeFrango+NomeHamburger+NomeMacarrao+NomeSalada+ NomeSaladaFrango+NomeSanduicheAtum+
											NomeSanduicheFrango+NomeSanduicheQueijo+
											"\n\n"+
											"Bebidas:\t\t"+ NomeAgua +  NomeCafe + NomeAguacc + NomeCerveja
											+ NomeCoca + NomeSucoLaranja+ NomeSucoMaracuja+NomeUva+
											NomeMorango + NomeLimao+NomeAbacaxi+NomeCaju+NomeManga+NomeGraviola
											+"\n\n"+
											"Sobremesa:\t\t"+ NomeTorrada + NomeBolinho+ NomeBrownie+ NomeSorvete+NomePanqueca +
											NomeTortaAbacaxi+NomeTortaBanana+NomeTortaChocolate+NomeTortaLimao+NomeTortaMaca+
											NomeTortaMorango+NomePave+NomePudim+NomePicole+
											"\n\n"+
											"Quantidade:\t\t" + qtd +"\n\n"+
											"ID:\t\t" + id +"\n\n"+
								"====================================" + "\n\n" +
								"Taxa: \t\t" + taxa + "\n\n" +
								"Sub-Total: \t\t" + subTotal + "\n\n" +
								"Total: \t\t" + valueTotal + "\n\n" +
								"Método de pagamento: \t" + mPagamento + "\n\n" +
								"====================================" + "\n\n" +
								"Vendedor: \t\t" + TelaLogin.login + "\n\n"+
								"====================================" + "\n\n" +
								"\nData: " + fDate.format(timer.getTime()) + 
								"\tHora: " + fTime.format(timer.getTime()) +
								"\n\n\t\tObrigado !");
					}else {
						JOptionPane.showMessageDialog(null, "Falha ao registrar venda!");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Mesa indisponível.");
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
		panel_4.setBounds(610, 84, 290, 546);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		
		JLabel lblSobremesas = new JLabel("SOBREMESAS");
		lblSobremesas.setBounds(87, 12, 93, 15);
		panel_4.add(lblSobremesas);
		
		JCheckBox chckbxBrownie = new JCheckBox("Brownie");
		chckbxBrownie.setBounds(11, 106, 83, 23);
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
		panel_4.add(chckbxBrownie);
		
		chckbxTorrada.setBounds(11, 79, 81, 23);
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
		panel_4.add(chckbxTorrada);
		
		chckbxPicole.setBounds(11, 160, 67, 23);
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
		panel_4.add(chckbxPicole);
		
		chckbxBolinho.setBounds(11, 133, 78, 23);
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
		panel_4.add(chckbxBolinho);
		
		chckbxPanqueca.setBounds(11, 187, 95, 23);
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
		panel_4.add(chckbxPanqueca);
		
		txtBrownie = new JTextField();
		txtBrownie.setBounds(183, 106, 80, 19);
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
		panel_4.add(txtBrownie);
		txtBrownie.setColumns(10);
		
		txtPicole = new JTextField();
		txtPicole.setBounds(183, 160, 80, 19);
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
		panel_4.add(txtPicole);
		
		txtBolinho = new JTextField();
		txtBolinho.setBounds(183, 133, 80, 19);
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
		panel_4.add(txtBolinho);
		
		txtPanqueca = new JTextField();
		txtPanqueca.setBounds(183, 187, 80, 19);
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
		panel_4.add(txtPanqueca);
		
		txtTorrada = new JTextField();
		txtTorrada.setBounds(183, 79, 80, 19);
		panel_4.add(txtTorrada);
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
		
		
		chckbxTortaDeMorango.setBounds(11, 214, 152, 23);
		panel_4.add(chckbxTortaDeMorango);
		
		txtTortaMorango = new JTextField();
		txtTortaMorango.setEnabled(false);
		txtTortaMorango.setBounds(183, 214, 80, 19);
		txtTortaMorango.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		panel_4.add(txtTortaMorango);
		txtTortaMorango.setColumns(10);

		
		chckbxTortaChocolate.setBounds(11, 241, 164, 23);
		panel_4.add(chckbxTortaChocolate);
		
		txtTortaChocolate = new JTextField();
		txtTortaChocolate.setEnabled(false);
		txtTortaChocolate.setBounds(183, 241, 80, 19);
		txtTortaChocolate.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		
		panel_4.add(txtTortaChocolate);
		txtTortaChocolate.setColumns(10);
		
		
		chckbxTortaLimao.setBounds(11, 268, 139, 23);
		panel_4.add(chckbxTortaLimao);
		
		txtTortaLimao = new JTextField();
		txtTortaLimao.setEnabled(false);
		txtTortaLimao.setBounds(183, 268, 80, 19);
		txtTortaLimao.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		panel_4.add(txtTortaLimao);
		txtTortaLimao.setColumns(10);
		
		
		chckbxTortaAbacaxi.setBounds(11, 295, 149, 23);
		panel_4.add(chckbxTortaAbacaxi);
		
		txtTortaAbacaxi = new JTextField();
		txtTortaAbacaxi.setEnabled(false);
		txtTortaAbacaxi.setBounds(183, 295, 80, 19);
		txtTortaAbacaxi.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		panel_4.add(txtTortaAbacaxi);
		txtTortaAbacaxi.setColumns(10);
		
		chckbxTortaBanana.setBounds(11, 322, 164, 23);
		panel_4.add(chckbxTortaBanana);
		
		txtTortaBanana = new JTextField();
		txtTortaBanana.setEnabled(false);
		txtTortaBanana.setBounds(183, 322, 80, 19);
		txtTortaBanana.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		panel_4.add(txtTortaBanana);
		txtTortaBanana.setColumns(10);
		
		chckbxTortaMaca.setBounds(11, 349, 139, 23);
		panel_4.add(chckbxTortaMaca);
		
		txtTortaMaca = new JTextField();
		txtTortaMaca.setEnabled(false);
		txtTortaMaca.setBounds(183, 349, 80, 19);
		txtTortaMaca.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		panel_4.add(txtTortaMaca);
		txtTortaMaca.setColumns(10);
		
		chckbxSorvete.setBounds(11, 376, 93, 23);
		panel_4.add(chckbxSorvete);
		
		txtSorvete = new JTextField();
		txtSorvete.setEnabled(false);
		txtSorvete.setBounds(183, 376, 80, 19);
		txtSorvete.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		panel_4.add(txtSorvete);
		txtSorvete.setColumns(10);
		
		chckbxPudim.setBounds(11, 403, 98, 23);
		panel_4.add(chckbxPudim);
		
		txtPudim = new JTextField();
		txtPudim.setEnabled(false);
		txtPudim.setBounds(183, 403, 80, 19);
		txtPudim.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		panel_4.add(txtPudim);
		txtPudim.setColumns(10);
		
		chckbxPave.setBounds(11, 430, 83, 23);
		panel_4.add(chckbxPave);
		
		txtPave = new JTextField();
		txtPave.setEnabled(false);
		txtPave.setBounds(183, 430, 80, 19);
		txtPave.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber = e.getKeyChar();
				if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) ||
						(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		panel_4.add(txtPave);
		txtPave.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ViewSistema.class.getResource("/cake.png")));
		label.setBounds(11, 12, 70, 71);
		panel_4.add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(912, 84, 416, 364);
		contentPane.add(scrollPane);
		
		
		scrollPane.setViewportView(jtxtRecibo);
		
		JLabel lblUsurio = new JLabel("Usuário:");
		lblUsurio.setBounds(12, 640, 70, 15);
		contentPane.add(lblUsurio);
		
		JLabel lblUser = new JLabel(TelaLogin.login);
		lblUser.setBounds(79, 642, 70, 15);
		contentPane.add(lblUser);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setBounds(408, 640, 52, 15);
		contentPane.add(lblHora);

		
		
		lblHr.setBounds(465, 642, 70, 15);
		contentPane.add(lblHr);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setBounds(172, 640, 52, 15);
		contentPane.add(lblData);
		
		Calendar timer = Calendar.getInstance();
		SimpleDateFormat fDate = new SimpleDateFormat("dd-MMM-yyyy");
		fDate.format(timer.getTime());
		JLabel lblDate = new JLabel(fDate.format(timer.getTime()));
		lblDate.setBounds(222, 642, 80, 15);
		contentPane.add(lblDate);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ViewSistema.class.getResource("/man-icon.png")));
		label_1.setBounds(22, 658, 70, 32);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(ViewSistema.class.getResource("/calendar-icon.png")));
		label_2.setBounds(204, 658, 70, 32);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(ViewSistema.class.getResource("/Apps-preferences-system-time-icon.png")));
		label_3.setBounds(408, 658, 70, 32);
		contentPane.add(label_3);
		
		Timer tm = new Timer(1000, new hora());
		tm.start();
		
	}	
	class hora implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Calendar now = Calendar.getInstance();
			lblHr.setText(String.format("%1$tH:%1$tM:%1$tS", now));
			
		}
	}
}