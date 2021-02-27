package fatura;
import java.util.Date;

public class Fatura {
	private Date dataVencimento;
	private double valorTotal;
	private String nomeCliente;
	private String statuFatura;
	
	
	public Fatura(String nome, double valor, Date data) {		
		this.nomeCliente = nome;
		this.valorTotal = valor;
		this.dataVencimento= data; 
	}
	
	public void data(Date data) { 
	    this.setDataVencimento(data); 
	}
	
	public String getnomeCliente() {
		return nomeCliente;
	}
	
	public void setnomeCliente(String nome) {
		this.nomeCliente = nome;
	}
	
	public String getstatuFatura() {
		return statuFatura;
	}
	
	public void setstatuFatura(String statuFatura) {
		this.statuFatura = statuFatura;
	}
	
	public double getvalorTotal() {
		return valorTotal;
	}
	
	public void setvalorTotal(double valor) {
		this.valorTotal = valor;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
}
