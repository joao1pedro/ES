package model;

public class ModelProdutos {
	private String operacao;
	private String vendedor;
	private int qtd;
	private int id;
	private int mesa;

	private double valorTotal;
	private double subTotal;
	private double taxa;
	private double diferenca;
	private double rateTaxa;
	
	private double priceCafe;
	private double priceAgua;
	private double priceCerveja;
	private double priceCoca;
	private double priceAguacc;
	private double priceSucoLaranja;
	private double priceSucoMaracuja;
	private double priceFritas;
	private double priceSalada;
	private double priceHamburger;
	private double priceAneisCebola;
	private double priceSaladaFrango;
	private double priceSanduicheAtum;
	private double priceSanduicheQueijo;
	private double priceSanduicheFrango;
	private double priceBrownie;
	private double priceTorrada;
	private double priceBolinho;
	private double pricePanqueca;
	private double pricePicole;
	private double priceTortaMorango;
	private double priceTortaChocolate;
	private double priceTortaLimao;
	private double priceTortaAbacaxi;
	private double priceTortaBanana;
	private double priceTortaMaca;
	private double priceSorvete;
	private double pricePudim;
	private double pricePave;
	private double priceUva;
	private double priceMorango;
	private double priceLimao;
	private double priceAbacaxi;
	private double priceCaju;
	private double priceManga;
	private double priceGraviola;
	private double priceArroz;
	private double priceMacarrao;
	private double priceFeijao;
	private double priceBife;
	private double priceFrango;

	private double itemcost[] = new double [100];
	
	
	public ModelProdutos() {
		
	}
	public ModelProdutos(String operacao, String vendedor,double taxa, double valorTotal, double subTotal, int qtd, int mesa)
	{//"Venda", TelaLogin.login, taxa, valorTotal, subTotal, qtd, mesa
		this.operacao = operacao;
		this.vendedor = vendedor;
		this.taxa = taxa;
		this.valorTotal = valorTotal;
		this.subTotal = subTotal;
		this.qtd = qtd;
		this.mesa = mesa;
	}
	
	public double getDiferenca() {
		return diferenca;
	}
	public void setDiferenca(double diferenca) {
		this.diferenca = diferenca;
	}
	public double getRateTaxa() {
		return rateTaxa;
	}
	public void setRateTaxa(double rateTaxa) {
		this.rateTaxa = rateTaxa;
	}
	public double[] getItemcost() {
		return itemcost;
	}
	public void setItemcost(double[] itemcost) {
		this.itemcost = itemcost;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	public int getMesa() {
		return mesa;
	}
	public void setMesa(int mesa) {
		this.mesa = mesa;
	}
	public double getPriceArroz() {
		return priceArroz;
	}
	public void setPriceArroz(double priceArroz) {
		this.priceArroz = priceArroz;
	}
	public double getPriceMacarrao() {
		return priceMacarrao;
	}
	public void setPriceMacarrao(double priceMacarrao) {
		this.priceMacarrao = priceMacarrao;
	}
	public double getPriceFeijao() {
		return priceFeijao;
	}
	public void setPriceFeijao(double priceFeijao) {
		this.priceFeijao = priceFeijao;
	}
	public double getPriceBife() {
		return priceBife;
	}
	public void setPriceBife(double priceBife) {
		this.priceBife = priceBife;
	}
	public double getPriceFrango() {
		return priceFrango;
	}
	public void setPriceFrango(double priceFrango) {
		this.priceFrango = priceFrango;
	}
	public double getPriceUva() {
		return priceUva;
	}
	public void setPriceUva(double priceUva) {
		this.priceUva = priceUva;
	}
	public double getPriceMorango() {
		return priceMorango;
	}
	public void setPriceMorango(double priceMorango) {
		this.priceMorango = priceMorango;
	}
	public double getPriceLimao() {
		return priceLimao;
	}
	public void setPriceLimao(double priceLimao) {
		this.priceLimao = priceLimao;
	}
	public double getPriceAbacaxi() {
		return priceAbacaxi;
	}
	public void setPriceAbacaxi(double priceAbacaxi) {
		this.priceAbacaxi = priceAbacaxi;
	}
	public double getPriceCaju() {
		return priceCaju;
	}
	public void setPriceCaju(double priceCaju) {
		this.priceCaju = priceCaju;
	}
	public double getPriceManga() {
		return priceManga;
	}
	public void setPriceManga(double priceManga) {
		this.priceManga = priceManga;
	}
	public double getPriceGraviola() {
		return priceGraviola;
	}
	public void setPriceGraviola(double priceGraviola) {
		this.priceGraviola = priceGraviola;
	}
	public double getPriceTortaLimao() {
		return priceTortaLimao;
	}
	public void setPriceTortaLimao(double priceTortaLimao) {
		this.priceTortaLimao = priceTortaLimao;
	}
	public double getPriceTortaAbacaxi() {
		return priceTortaAbacaxi;
	}
	public void setPriceTortaAbacaxi(double priceTortaAbacaxi) {
		this.priceTortaAbacaxi = priceTortaAbacaxi;
	}
	public double getPriceTortaBanana() {
		return priceTortaBanana;
	}
	public void setPriceTortaBanana(double priceTortaBanana) {
		this.priceTortaBanana = priceTortaBanana;
	}
	public double getPriceTortaMaca() {
		return priceTortaMaca;
	}
	public void setPriceTortaMaca(double priceTortaMaca) {
		this.priceTortaMaca = priceTortaMaca;
	}
	public double getPriceSorvete() {
		return priceSorvete;
	}
	public void setPriceSorvete(double priceSorvete) {
		this.priceSorvete = priceSorvete;
	}
	public double getPricePudim() {
		return pricePudim;
	}
	public void setPricePudim(double pricePudim) {
		this.pricePudim = pricePudim;
	}
	public double getPricePave() {
		return pricePave;
	}
	public void setPricePave(double pricePave) {
		this.pricePave = pricePave;
	}
	public double getPriceTortaChocolate() {
		return priceTortaChocolate;
	}
	public void setPriceTortaChocolate(double priceTortaChocolate) {
		this.priceTortaChocolate = priceTortaChocolate;
	}
	public double getPriceTortaMorango() {
		return priceTortaMorango;
	}
	public void setPriceTortaMorango(double priceTortaMorango) {
		this.priceTortaMorango = priceTortaMorango;
	}
	public double getPriceCafe() {
		return priceCafe;
	}
	public void setPriceCafe(double priceCafe) {
		this.priceCafe = priceCafe;
	}
	public double getPriceAgua() {
		return priceAgua;
	}
	public void setPriceAgua(double priceAgua) {
		this.priceAgua = priceAgua;
	}
	public double getPriceCerveja() {
		return priceCerveja;
	}
	public void setPriceCerveja(double priceCerveja) {
		this.priceCerveja = priceCerveja;
	}
	public double getPriceCoca() {
		return priceCoca;
	}
	public void setPriceCoca(double priceCoca) {
		this.priceCoca = priceCoca;
	}
	public double getPriceAguacc() {
		return priceAguacc;
	}
	public void setPriceAguacc(double priceAguacc) {
		this.priceAguacc = priceAguacc;
	}
	public double getPriceSucoLaranja() {
		return priceSucoLaranja;
	}
	public void setPriceSucoLaranja(double priceSucoLaranja) {
		this.priceSucoLaranja = priceSucoLaranja;
	}
	public double getPriceSucoMaracuja() {
		return priceSucoMaracuja;
	}
	public void setPriceSucoMaracuja(double priceSucoMaracuja) {
		this.priceSucoMaracuja = priceSucoMaracuja;
	}
	public double getPriceFritas() {
		return priceFritas;
	}
	public void setPriceFritas(double priceFritas) {
		this.priceFritas = priceFritas;
	}
	public double getPriceSalada() {
		return priceSalada;
	}
	public void setPriceSalada(double priceSalada) {
		this.priceSalada = priceSalada;
	}
	public double getPriceHamburger() {
		return priceHamburger;
	}
	public void setPriceHamburger(double priceHamburger) {
		this.priceHamburger = priceHamburger;
	}
	public double getPriceAneisCebola() {
		return priceAneisCebola;
	}
	public void setPriceAneisCebola(double priceAneisCebola) {
		this.priceAneisCebola = priceAneisCebola;
	}
	public double getPriceSaladaFrango() {
		return priceSaladaFrango;
	}
	public void setPriceSaladaFrango(double priceSaladaFrango) {
		this.priceSaladaFrango = priceSaladaFrango;
	}
	public double getPriceSanduicheAtum() {
		return priceSanduicheAtum;
	}
	public void setPriceSanduicheAtum(double priceSanduicheAtum) {
		this.priceSanduicheAtum = priceSanduicheAtum;
	}
	public double getPriceSanduicheQueijo() {
		return priceSanduicheQueijo;
	}
	public void setPriceSanduicheQueijo(double priceSanduicheQueijo) {
		this.priceSanduicheQueijo = priceSanduicheQueijo;
	}
	public double getPriceSanduicheFrango() {
		return priceSanduicheFrango;
	}
	public void setPriceSanduicheFrango(double priceSanduicheFrango) {
		this.priceSanduicheFrango = priceSanduicheFrango;
	}
	public double getPriceBrownie() {
		return priceBrownie;
	}
	public void setPriceBrownie(double priceBrownie) {
		this.priceBrownie = priceBrownie;
	}
	public double getPriceTorrada() {
		return priceTorrada;
	}
	public void setPriceTorrada(double priceTorrada) {
		this.priceTorrada = priceTorrada;
	}
	public double getPriceBolinho() {
		return priceBolinho;
	}
	public void setPriceBolinho(double priceBolinho) {
		this.priceBolinho = priceBolinho;
	}
	public double getPricePanqueca() {
		return pricePanqueca;
	}
	public void setPricePanqueca(double pricePanqueca) {
		this.pricePanqueca = pricePanqueca;
	}
	public double getPricePicole() {
		return pricePicole;
	}
	public void setPricePicole(double pricePicole) {
		this.pricePicole = pricePicole;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
