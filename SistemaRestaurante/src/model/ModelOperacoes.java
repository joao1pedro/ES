package model;

public class ModelOperacoes {
	private double taxa, valueTotal, subTotal, diferenca, rateTaxa;
	
	private double itemcost[] = new double [100];

	
	public ModelOperacoes(double taxa, double valueTotal, double subTotal, double diferenca, double rateTaxa,
			double[] itemcost)
	{
		this.taxa = taxa;
		this.valueTotal = valueTotal;
		this.subTotal = subTotal;
		this.diferenca = diferenca;
		this.rateTaxa = rateTaxa;
		this.itemcost = itemcost;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public double getValueTotal() {
		return valueTotal;
	}

	public void setValueTotal(double valueTotal) {
		this.valueTotal = valueTotal;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
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
	
	
}
