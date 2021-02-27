package pagamento;
import fatura.Fatura;
import boleto.Boleto;
import java.util.ArrayList;
import java.util.Iterator;

public class Pagamento {
	public void pagarFatura(ArrayList<Boleto> boletosFatura, Fatura fatura) {
		double valorTotal = 0.0;
		for (Iterator i = boletosFatura.iterator(); i.hasNext();) {
			Boleto b = (Boleto) i.next();
			valorTotal += b.getValorPago();
		}
			
		if(valorTotal == fatura.getvalorTotal()) {
			fatura.setstatuFatura("PAGA");			
		}else {
			fatura.setstatuFatura("NÃO PAGA");			
		}
	}
}
