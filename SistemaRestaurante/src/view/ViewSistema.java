package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import control.ControlGerenciaFunc;
import control.ControlProdutos;

import java.awt.Color;
import java.awt.Desktop;
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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.Timer;
import java.awt.Font;

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
	
	private JTextField txtTaxa;
	private JTextField txtValue;
	private JTextField txtTroco;
	private JTextField txtInDinnheiro;
	private JTextField txtMesa;
	
	
	private JTextArea jtxtRecibo = new JTextArea();
	
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
    
    private double itemcost[] = new double [100];
    private double valorTotal;
	private double subTotal=0;
	private double taxa;
	private double diferenca;
	private double rateTaxa;
    
	private int qtd=0;
	private int mesa = 0;
	
	private int qtdCafe= 0;
	private int qtdAgua = 0;
	private int qtdCerveja= 0;
	private int qtdCoca= 0;
	private int qtdAguacc= 0;
	private int qtdSucoLaranja= 0;
	private int qtdSucoMaracuja= 0;
	private int qtdFritas= 0;
	private int qtdSalada= 0;
	private int qtdHamburger= 0;
	private int qtdAneisCebola= 0;
	private int qtdSaladaFrango= 0;
	private int qtdSanduicheAtum= 0;
	private int qtdSanduicheQueijo= 0;
	private int qtdSanduicheFrango= 0;
	private int qtdBrownie= 0;
	private int qtdTorrada= 0;
	private int qtdBolinho= 0;
	private int qtdPanqueca= 0;
	private int qtdPicole= 0;
	private int qtdTortaMorango= 0;
	private int qtdTortaChocolate= 0;
	private int qtdTortaLimao= 0;
	private int qtdTortaAbacaxi= 0;
	private int qtdTortaBanana= 0;
	private int qtdTortaMaca= 0;
	private int qtdSorvete= 0;
	private int qtdPudim= 0;
	private int qtdPave= 0;
	private int qtdUva= 0;
	private int qtdMorango= 0;
	private int qtdLimao= 0;
	private int qtdAbacaxi= 0;
	private int qtdCaju= 0;
	private int qtdManga= 0;
	private int qtdGraviola= 0;
	private int qtdArroz= 0;
	private int qtdMacarrao= 0;
	private int qtdFeijao= 0;
	private int qtdBife= 0;
	private int qtdFrango= 0;
	
	private String mPagamento;
	
	private double auxTroco = 0;
	
	ControlProdutos ctrlP = new ControlProdutos();
	ControlGerenciaFunc ctrlF = new ControlGerenciaFunc();
	
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
		JCheckBox chckbxLimao = new JCheckBox("Limão");
		JCheckBox chckbxAbacaxi = new JCheckBox("Abacaxi");
		JCheckBox chckbxCaju = new JCheckBox("Caju");
		JCheckBox chckbxManga = new JCheckBox("Manga");
		JCheckBox chckbxGraviola = new JCheckBox("Graviola");
		JCheckBox chckbxArroz = new JCheckBox("Arroz");
		JCheckBox chckbxMacarrao = new JCheckBox("Macarrão");
		JCheckBox chckbxFeijao = new JCheckBox("Feijão");
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
				permissao = ctrlF.verificaPermissao(TelaLogin.login);

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
		
		JMenu mnVendas = new JMenu("Vendas");
		mnVendas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ControlGerenciaFunc ctrlP = new ControlGerenciaFunc();
				boolean permissao;
				permissao = ctrlP.verificaPermissao(TelaLogin.login);
				
				if(permissao == true) {
					dispose();
					GerenciaVendas frame = new GerenciaVendas();
					frame.setVisible(true);
					frame.pegaTaxa();
					frame.pegaTotal();
					frame.updateTable();
				} else {
					JOptionPane.showMessageDialog(null, "Usuário não possui nivel de permissão adequado.");
				}
			}
		});
		mnGerenciamento.add(mnVendas);
		
		JMenu mnProdutos = new JMenu("Produtos");
		mnProdutos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ControlGerenciaFunc ctrlP = new ControlGerenciaFunc();
				boolean permissao;
				permissao = ctrlP.verificaPermissao(TelaLogin.login);
				
				if(permissao == true) {
					dispose();
					GerenciaProdutos frame = new GerenciaProdutos();
					frame.setVisible(true);
					frame.updateProdutos();
				} else {
					JOptionPane.showMessageDialog(null, "Usuário não possui nivel de permissão adequado.");
				}
			}
		});
		mnGerenciamento.add(mnProdutos);
		
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
		
		JMenu mnAlterarSenha = new JMenu("Alterar senha");
		mnAlterarSenha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Identificacao frame = new Identificacao();
				frame.setVisible(true);
			}
		});
		mnAjuda.add(mnAlterarSenha);
		
		JMenuBar menuBar_1 = new JMenuBar();
		mnAjuda.add(menuBar_1);
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
		
		JLabel lbTelaInfo = new JLabel("SMART FOOD");
		lbTelaInfo.setFont(new Font("Dialog", Font.BOLD, 12));
		lbTelaInfo.setBounds(580, 28, 107, 24);
		panel_1.add(lbTelaInfo);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(12, 84, 290, 546);
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
		chckbxSalada.setBounds(8, 478, 129, 23);
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
		chckbxHamburger.setBounds(8, 281, 129, 23);
		panel_2.add(chckbxHamburger);
		
		
		JCheckBox chckbxAneisdecebola = new JCheckBox("An. Cebola");
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
		chckbxAneisdecebola.setBounds(8, 84, 119, 23);
		panel_2.add(chckbxAneisdecebola);
		
		
		JCheckBox chckbxSaladadefrango = new JCheckBox("S. Frango");
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
		chckbxSaladadefrango.setBounds(8, 505, 114, 23);
		panel_2.add(chckbxSaladadefrango);
		
		chckbxArroz.setBounds(8, 111, 129, 23);
		panel_2.add(chckbxArroz);
		
		txtArroz = new JTextField();
		txtArroz.setEnabled(false);
		txtArroz.setBounds(175, 113, 80, 19);
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
		
		chckbxMacarrao.setBounds(8, 138, 129, 23);
		panel_2.add(chckbxMacarrao);
		
		txtMacarrao = new JTextField();
		txtMacarrao.setEnabled(false);
		txtMacarrao.setBounds(175, 144, 80, 19);
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
		
		chckbxFeijao.setBounds(8, 165, 80, 23);
		panel_2.add(chckbxFeijao);
		
		txtFeijao = new JTextField();
		txtFeijao.setEnabled(false);
		txtFeijao.setBounds(175, 169, 80, 19);
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
		
		chckbxBife.setBounds(8, 227, 129, 23);
		panel_2.add(chckbxBife);
		
		txtBife = new JTextField();
		txtBife.setEnabled(false);
		txtBife.setBounds(175, 229, 80, 19);
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
		
		chckbxFrango.setBounds(8, 254, 129, 23);
		panel_2.add(chckbxFrango);
		
		txtFrango = new JTextField();
		txtFrango.setEnabled(false);
		txtFrango.setBounds(175, 256, 80, 19);
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
		lblSanduiche.setBounds(12, 359, 92, 15);
		panel_2.add(lblSanduiche);
		
		
		JCheckBox chckbxSanduichedeatum = new JCheckBox("Atum");
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
		chckbxSanduichedeatum.setBounds(8, 373, 105, 23);
		panel_2.add(chckbxSanduichedeatum);
		
		JCheckBox chckbxSanduichedequeijo = new JCheckBox("Queijo");
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
		chckbxSanduichedequeijo.setBounds(8, 400, 114, 23);
		panel_2.add(chckbxSanduichedequeijo);
		
		JCheckBox chckbxSanduichedefrango = new JCheckBox("Frango");
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
		chckbxSanduichedefrango.setBounds(8, 427, 155, 23);
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
		txtSalada.setBounds(175, 480, 80, 19);
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
		txtHamburger.setBounds(175, 283, 80, 19);
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
		txtAneisdecebola.setBounds(175, 86, 80, 19);
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
		txtSaladadefrango.setBounds(175, 507, 80, 19);
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
		txtSanduichedeatum.setBounds(175, 375, 80, 19);
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
		txtSanduichedequeijo.setBounds(175, 402, 80, 19);
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
		txtSanduichedefrango.setBounds(175, 429, 80, 19);
		panel_2.add(txtSanduichedefrango);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ViewSistema.class.getResource("/Steak-icon.png")));
		lblNewLabel.setBounds(12, 11, 72, 38);
		panel_2.add(lblNewLabel);
		
		JLabel lblSaladas = new JLabel("Saladas");
		lblSaladas.setBounds(14, 462, 70, 15);
		panel_2.add(lblSaladas);
		
		JLabel lblMistura = new JLabel("Mistura");
		lblMistura.setBounds(8, 204, 70, 15);
		panel_2.add(lblMistura);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(912, 458, 428, 220);
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
		lblSubT.setBounds(144, 55, 77, 24);
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
		txtSubT.setBounds(224, 60, 56, 15);
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
				
				qtd=0;
				qtdAgua=0;
				qtdCafe=0;
				qtdCerveja=0;
				qtdCoca=0;
				qtdAguacc=0;
				qtdSucoLaranja=0;
				qtdSucoMaracuja=0;
				qtdFritas=0;
				qtdSalada=0;
				qtdHamburger=0;
				qtdAneisCebola=0;
				qtdSaladaFrango=0;
				qtdSanduicheAtum=0;
				qtdSanduicheQueijo=0;
				qtdSanduicheFrango=0;
				qtdBrownie=0;
				qtdTorrada=0;
				qtdBolinho=0;
				qtdPanqueca=0;
				qtdPicole=0;
				qtdTortaMorango=0;
				qtdTortaChocolate=0;
				qtdTortaLimao=0;
				qtdTortaAbacaxi=0;
				qtdTortaBanana=0;
				qtdTortaMaca=0;
				qtdSorvete=0;
				qtdPudim=0;
				qtdPave=0;
				qtdUva=0;
				qtdMorango=0;
				qtdLimao=0;
				qtdAbacaxi=0;
				qtdCaju=0;
				qtdManga=0;
				qtdGraviola=0;
				qtdArroz=0;
				qtdMacarrao=0;
				qtdFeijao=0;
				qtdBife=0;
				qtdFrango=0;
				
				auxTroco = 0;
			}
		});
		btnLimpar.setBounds(96, 187, 82, 25);
		panel_3.add(btnLimpar);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				calculator(ctrlP);
				
				taxa = ((subTotal * rateTaxa)/100);
				valorTotal = (subTotal + taxa);
				
				String quantidade = String.format("R$%.2f",subTotal);
				String vTaxa = String.format("R$%.2f", taxa);
				String vTotal = String.format("R$%.2f", valorTotal);
				
				mPagamento = (String)metodoPagamento.getSelectedItem();

				if(mPagamento == "Débito" || mPagamento == "Crédito") {
					txtSubT.setText(quantidade);
					txtTaxa.setText(vTaxa);
					txtValue.setText(vTotal);
					
					inserirVenda();
				}
				else if(mPagamento == "Dinheiro") {
					
					txtSubT.setText(quantidade);
					txtTaxa.setText(vTaxa);
					txtValue.setText(vTotal);
					
					diferenca = Double.parseDouble(txtInDinnheiro.getText());
					auxTroco = (diferenca - valorTotal);
					
					if(auxTroco >= 0) {
						String vTroco = String.format("R$%.2f", auxTroco);
						txtTroco.setText(vTroco);
						inserirVenda();
					}else {
						JOptionPane.showMessageDialog(null, "Lance o dinheiro suficiente", "Sistema Restaurante", JOptionPane.OK_OPTION);
					}
					
				}
				
			}
			
			private void inserirVenda() {
				ControlProdutos ctrlP = new ControlProdutos();
				
				qtd = qtdAgua+qtdCafe+qtdCerveja+qtdCoca+
						qtdAguacc+qtdSucoLaranja+qtdSucoMaracuja+
						qtdFritas+qtdSalada+qtdHamburger+qtdAneisCebola+
						qtdSaladaFrango+qtdSanduicheAtum+qtdSanduicheFrango+
						qtdSanduicheQueijo+qtdBrownie+qtdTorrada+qtdPicole+
						qtdBolinho+qtdPanqueca+qtdTortaMorango+qtdTortaChocolate+
						qtdTortaLimao+qtdTortaAbacaxi+qtdTortaBanana+qtdTortaMaca+
						qtdSorvete+qtdPudim+qtdPave+qtdUva+qtdMorango+
						qtdAbacaxi+qtdLimao+qtdCaju+qtdManga+qtdGraviola+qtdFrango+
						qtdBife+qtdFeijao+qtdArroz+qtdMacarrao;
				
				if(!txtMesa.getText().isBlank()) 
					mesa = Integer.parseInt(txtMesa.getText());
				else
					mesa = 0;
				
				if(mesa >0 && mesa <=15) {
					boolean registra = ctrlP.registraVenda("Venda", TelaLogin.login, taxa, valorTotal, subTotal, qtd, mesa);
					
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
						int id = ctrlP.getMax();
						
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
								"Total: \t\t" + valorTotal + "\n\n" +
								"Método de pagamento: \t" + mPagamento + "\n\n" +
								"====================================" + "\n\n" +
								"Vendedor: \t\t" + TelaLogin.login + "\n\n"+
								"====================================" + "\n\n" +
								"\nData: " + fDate.format(timer.getTime()) + 
								"\n\n"+
								"\tHora: " + fTime.format(timer.getTime()) +
								"\n\n\t\tObrigado !");
						
						/*
						 * criar pdf
						 * */
						com.itextpdf.text.Document document = new com.itextpdf.text.Document();
						
						try {
							PdfWriter.getInstance(document, new FileOutputStream("documentos/pedido"+id+".pdf"));
							
							document.open();
							document.add(new Paragraph(jtxtRecibo.getText()));
							
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (DocumentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}finally{
							document.close();
						}
						
					}else {
						JOptionPane.showMessageDialog(null, "Falha ao registrar venda!");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Mesa indisponível.");
				}
			}

			private void calculator(ControlProdutos ctrlP) {
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
				
				if(!agua.isEmpty()){
					qtdAgua = Integer.parseInt(txtAgua.getText());
					NomeAgua=" Água ";
					itemcost[0] = ctrlP.getPrice("água")*qtdAgua;
				}
				if(!cafe.isEmpty()){
					qtdCafe = Integer.parseInt(txtCafe.getText());
					NomeCafe=" Café ";
					itemcost[1] =ctrlP.getPrice("café")*qtdCafe;
				}
				if(!cerveja.isEmpty()) {
					qtdCerveja = Integer.parseInt(txtCerveja.getText());
					NomeCerveja=" Cerveja ";
					itemcost[2] =ctrlP.getPrice("cerveja")*qtdCerveja ;
				}
				if(!coca.isEmpty()) {
					qtdCoca = Integer.parseInt(txtCoca.getText());
					NomeCoca=" Coca-Cola ";
					itemcost[3] =ctrlP.getPrice("coca-cola")*qtdCoca;
				}
				if(!aguacc.isEmpty()) {
					qtdAguacc = Integer.parseInt(txtAguaCc.getText());
					NomeAguacc=" Água de Coco ";
					itemcost[4] =ctrlP.getPrice("água de côco")*qtdAguacc;
				}
				if(!sucoLaranja.isEmpty()) {
					qtdSucoLaranja = Integer.parseInt(txtLaranja.getText());
					NomeSucoLaranja=" Suco de Laranja ";
					itemcost[5] =ctrlP.getPrice("suco de laranja")*qtdSucoLaranja;
				}
				if(!sucoMaracuja.isEmpty()) {
					qtdSucoMaracuja = Integer.parseInt(txtMaracuja.getText());
					NomeSucoMaracuja=" Suco de Maracujá ";
					itemcost[6] =ctrlP.getPrice("suco de maracujá")*qtdSucoMaracuja;
				}
				if(!fritas.isEmpty()) {
					qtdFritas = Integer.parseInt(txtFritas.getText());
					NomeFritas=" Fritas ";
					itemcost[7] =ctrlP.getPrice("batata frita")*qtdFritas;
				}
				if(!salada.isEmpty()) {
					qtdSalada = Integer.parseInt(txtSalada.getText());
					NomeSalada=" Salada ";
					itemcost[8] =ctrlP.getPrice("salada")*qtdSalada;
				}
				if(!hamburger.isEmpty()) {
					qtdHamburger = Integer.parseInt(txtHamburger.getText());
					NomeHamburger=" Hamburger ";
					itemcost[9] =ctrlP.getPrice("hamburger")*qtdHamburger;
				}
				if(!aneisCebola.isEmpty()) {
					qtdAneisCebola = Integer.parseInt(txtAneisdecebola.getText());
					NomeAneisCebola=" Anéis de cebola ";
					itemcost[10] =ctrlP.getPrice("anéis de cebola")*qtdAneisCebola;
				}
				if(!saladaFrango.isEmpty()) {
					qtdSaladaFrango = Integer.parseInt(txtSaladadefrango.getText());
					NomeSaladaFrango=" Salada de Frango ";
					itemcost[11] =ctrlP.getPrice("salada de frango")*qtdSaladaFrango;
				}
				if(!sanduicheAtum.isEmpty()) {
					qtdSanduicheAtum = Integer.parseInt(txtSanduichedeatum.getText());
					NomeSanduicheAtum=" Sanduiche de Atum ";
					itemcost[12] =ctrlP.getPrice("sanduiche de atum")*qtdSanduicheAtum;
				}
				if(!sanduicheQueijo.isEmpty()) {
					qtdSanduicheQueijo = Integer.parseInt(txtSanduichedequeijo.getText());
					NomeSanduicheQueijo=" Sanduiche de Queijo ";
					itemcost[13] =ctrlP.getPrice("sanduiche de queijo")*qtdSanduicheQueijo;
				}
				if(!sanduicheFrango.isEmpty()) {
					qtdSanduicheFrango = Integer.parseInt(txtSanduichedefrango.getText());
					NomeSanduicheFrango=" Sanduiche de Frango ";
					itemcost[14] =ctrlP.getPrice("sanduiche de frango")*qtdSanduicheFrango;
				}
				if(!brownie.isEmpty()) {
					qtdBrownie = Integer.parseInt(txtBrownie.getText());
					NomeBrownie=" Brownie ";
					itemcost[15] =ctrlP.getPrice("brownie")*qtdBrownie;
				}
				if(!torrada.isEmpty()) {
					qtdTorrada = Integer.parseInt(txtTorrada.getText());
					NomeTorrada=" Torrada ";
					itemcost[16] =ctrlP.getPrice("torrada")*qtdTorrada;
				}
				if(!picole.isEmpty()) {
					qtdPicole = Integer.parseInt(txtPicole.getText());
					NomePicole=" Picole ";
					itemcost[17] =ctrlP.getPrice("picole")*qtdPicole;
				}
				if(!bolinho.isEmpty()) {
					qtdBolinho = Integer.parseInt(txtBolinho.getText());
					NomeBolinho=" Bolinho ";
					itemcost[18] =ctrlP.getPrice("bolinho")*qtdBolinho;
				}
				if(!panqueca.isEmpty()) {
					qtdPanqueca = Integer.parseInt(txtPanqueca.getText());
					NomePanqueca=" Panqueca ";
					itemcost[19] =ctrlP.getPrice("panqueca")*qtdPanqueca;
				}
				if(!tortaMorango.isEmpty()) {
					qtdTortaMorango = Integer.parseInt(txtTortaMorango.getText());
					NomeTortaMorango=" Torta de Morango ";
					itemcost[20] =ctrlP.getPrice("torta de morango")*qtdTortaMorango;
				}
				if(!tortaChocolate.isEmpty()) {
					qtdTortaChocolate = Integer.parseInt(txtTortaChocolate.getText());
					NomeTortaChocolate=" Torta de Chocolate ";
					itemcost[21] =ctrlP.getPrice("torta de chocolate")*qtdTortaChocolate;
				}
				if(!tortaLimao.isEmpty()) {
					qtdTortaLimao = Integer.parseInt(txtTortaLimao.getText());
					NomeTortaLimao=" Torta de Limao ";
					itemcost[22] =ctrlP.getPrice("torta de limão")*qtdTortaLimao;
				}
				if(!tortaAbacaxi.isEmpty()) {
					qtdTortaAbacaxi = Integer.parseInt(txtTortaAbacaxi.getText());
					NomeTortaAbacaxi=" Torta de Abacaxi ";
					itemcost[23] =ctrlP.getPrice("torta de abacaxi")*qtdTortaAbacaxi;
				}
				if(!tortaBanana.isEmpty()) {
					qtdTortaBanana = Integer.parseInt(txtTortaBanana.getText());
					NomeTortaBanana=" Torta de Banana ";
					itemcost[24] =ctrlP.getPrice("torta de banana")*qtdTortaBanana;
				}
				if(!tortaMaca.isEmpty()) {
					qtdTortaMaca = Integer.parseInt(txtTortaMaca.getText());
					NomeTortaMaca=" Torta de Maca ";
					itemcost[25] =ctrlP.getPrice("torta de maça")*qtdTortaMaca;
				}
				
				if(!sorvete.isEmpty()) {
					qtdSorvete = Integer.parseInt(txtSorvete.getText());
					NomeSorvete=" Sorvete ";
					itemcost[26] =ctrlP.getPrice("sorvete")*qtdSorvete;
				}
				
				if(!pudim.isEmpty()) {
					qtdPudim = Integer.parseInt(txtPudim.getText());
					NomePudim=" Pudim ";
					itemcost[27] =ctrlP.getPrice("pudim")*qtdPudim;
				}
				
				if(!pave.isEmpty()) {
					qtdPave= Integer.parseInt(txtPave.getText());
					NomePave=" Pave "; 
					itemcost[28] =ctrlP.getPrice("pave")*qtdPave;
				}
				
				if(!uva.isEmpty()) {
					qtdUva= Integer.parseInt(txtUva.getText());
					NomeUva=" Uva "; 
					itemcost[29] =ctrlP.getPrice("suco de uva")*qtdUva;
				}
				
				if(!morango.isEmpty()) {
					qtdMorango= Integer.parseInt(txtMorango.getText());
					NomeMorango=" Morango "; 
					itemcost[30] =ctrlP.getPrice("suco de morango")*qtdMorango;
				}
				
				if(!limao.isEmpty()) {
					qtdLimao= Integer.parseInt(txtLimao.getText());
					NomeLimao=" Limão "; 
					itemcost[31] =ctrlP.getPrice("suco de limão")*qtdLimao;
				}
				
				if(!abacaxi.isEmpty()) {
					qtdAbacaxi= Integer.parseInt(txtAbacaxi.getText());
					NomeAbacaxi=" Abacaxi "; 
					itemcost[32] =ctrlP.getPrice("suco de abacaxi")*qtdAbacaxi;
				}
				
				if(!caju.isEmpty()) {
					qtdCaju= Integer.parseInt(txtCaju.getText());
					NomeCaju=" Caju "; 
					itemcost[33] =ctrlP.getPrice("suco de caju")*qtdCaju;
				}
				
				if(!manga.isEmpty()) {
					qtdManga= Integer.parseInt(txtManga.getText());
					NomeManga=" Manga "; 
					itemcost[34] =ctrlP.getPrice("suco de manga")*qtdManga;
				}
				
				if(!graviola.isEmpty()) {
					qtdGraviola= Integer.parseInt(txtGraviola.getText());
					NomeGraviola=" Graviola "; 
					itemcost[35] =ctrlP.getPrice("suco de graviola")*qtdGraviola;
				}
				
				if(!arroz.isEmpty()) {
					qtdArroz= Integer.parseInt(txtArroz.getText());
					NomeArroz=" Arroz "; 
					itemcost[36] =ctrlP.getPrice("arroz")*qtdArroz;
				}
				
				if(!macarrao.isEmpty()) {
					qtdMacarrao= Integer.parseInt(txtMacarrao.getText());
					NomeMacarrao=" Macarrão "; 
					itemcost[37] =ctrlP.getPrice("macarrão")*qtdMacarrao;
				}

				if(!feijao.isEmpty()) {
					qtdFeijao= Integer.parseInt(txtFeijao.getText());
					NomeFeijao=" Feijão "; 
					itemcost[38] =ctrlP.getPrice("feijão")*qtdFeijao;
				}
				
				if(!bife.isEmpty()) {
					qtdBife= Integer.parseInt(txtBife.getText());
					NomeBife=" Bife "; 
					itemcost[39] =ctrlP.getPrice("bife")*qtdBife;
				}
				
				if(!frango.isEmpty()) {
					qtdFrango= Integer.parseInt(txtFrango.getText());
					NomeFrango=" Frango "; 
					itemcost[40] =ctrlP.getPrice("frango")*qtdFrango;
				}
				
				rateTaxa = ctrlP.getPrice("taxa");
				
				subTotal = itemcost[0] + itemcost[1] + itemcost[2] + itemcost[3] + itemcost[4] + itemcost[5] +
						itemcost[6] + itemcost[7] + itemcost[8] + itemcost[9] + itemcost[10] + itemcost[11] + itemcost[12] +
						itemcost[13] + itemcost[14] + itemcost[15] + itemcost[16] + itemcost[17] + itemcost[18] + itemcost[19] + 
						itemcost[20] + itemcost[21] + itemcost[22] + itemcost[23] + itemcost[24] + itemcost[25] + itemcost[26] + 
						itemcost[27] + itemcost[28] + itemcost[29] + itemcost[30] + itemcost[31] + itemcost[32] + itemcost[33] + 
						itemcost[34] + itemcost[35] + itemcost[36] + itemcost[37] + itemcost[38] + itemcost[39] + itemcost[40];

				
			}
		});
		btnTotal.setBounds(12, 187, 70, 25);
		panel_3.add(btnTotal);
		
		JLabel lblTaxa = new JLabel("Taxa");
		lblTaxa.setBounds(167, 85, 44, 15);
		panel_3.add(lblTaxa);
		
		txtTaxa = new JTextField();
		txtTaxa.setColumns(10);
		txtTaxa.setBounds(224, 85, 56, 15);
		panel_3.add(txtTaxa);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(167, 107, 44, 15);
		panel_3.add(lblTotal);
		
		txtValue = new JTextField();
		txtValue.setColumns(10);
		txtValue.setBounds(224, 107, 56, 15);
		panel_3.add(txtValue);
		
		JLabel lblTroco = new JLabel("Troco");
		lblTroco.setBounds(167, 134, 44, 15);
		panel_3.add(lblTroco);
		
		txtTroco = new JTextField();
		txtTroco.setColumns(10);
		txtTroco.setBounds(224, 134, 56, 15);
		panel_3.add(txtTroco);
		
		txtInDinnheiro = new JTextField("0");
		txtInDinnheiro.setColumns(10);
		txtInDinnheiro.setBounds(71, 96, 56, 15);
		panel_3.add(txtInDinnheiro);
		
		JLabel lblEspcie = new JLabel("Espécie:");
		lblEspcie.setBounds(12, 75, 70, 15);
		panel_3.add(lblEspcie);
		
		JLabel lblR = new JLabel("R$");
		lblR.setBounds(46, 96, 22, 15);
		panel_3.add(lblR);
		
		JLabel lblMesa = new JLabel("Mesa:");
		lblMesa.setBounds(24, 134, 44, 15);
		panel_3.add(lblMesa);
		
		txtMesa = new JTextField("0");
		txtMesa.setColumns(10);
		txtMesa.setBounds(71, 134, 56, 15);
		panel_3.add(txtMesa);
		
		JButton btnImprimir = new JButton(new ImageIcon(GerenciaFunc.class.getResource("/Print-32.png")));
		btnImprimir.setBounds(318, 39, 56, 50);
		panel_3.add(btnImprimir);
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControlProdutos ctrlP = new ControlProdutos();
				int id = ctrlP.getMax();
				try {
					Desktop.getDesktop().open(new File("documentos/pedido"+id+".pdf"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "Erro " + e);
				}
			}
		});
		
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
		scrollPane.setBounds(912, 84, 428, 362);
		contentPane.add(scrollPane);
		jtxtRecibo.setEditable(false);
		
		
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