package processador;

public class ProcessadorBoletosTest {
	private Fatura fatura1;
	private Fatura fatura2;
	private ArrayList <Boleto> boletosFatura1 = new ArrayList();
	private ArrayList <Boleto> boletosFatura2 = new ArrayList();
	private Pagamento pagamento;
	
	@BeforeEach
	public void inicializa() {			
		Fatura fatura1 = new Fatura("Maria de Fatima", 5000.00,new Date());
		Fatura fatura2 = new Fatura("Joao Cleber", 700.00,new Date());
		
		Boleto boleto1 = new Boleto(0012, new Date(),200);
		Boleto boleto2 = new Boleto(8548, new Date(),100);
		Boleto boleto3 = new Boleto(66687, new Date(),1200);
		Boleto boleto4 = new Boleto(02517, new Date(),500);
		Boleto boleto5 = new Boleto(73657, new Date(),900);
		
		boletosFatura1.add(boleto2);
		boletosFatura1.add(boleto3);
		boletosFatura1.add(boleto5);		
		
		boletosFatura2.add(boleto1);
		boletosFatura2.add(boleto4);			
	}
	
	@DisplayName("Testar se fatura 1 foi paga")
	@Test
	public void testFaturaPaga1() {
		pagamento.pagarFatura(boletosFatura1,fatura1);
		assertEquals(fatura1.getstatuFatura(), "PAGA");
		pagamento.pagarFatura(boletosFatura2,fatura1);
		assertEquals(fatura1.getstatuFatura(), "PAGA");
			
	}
	
	@DisplayName("Testar se fatura 2 foi paga")
	@Test
	public void testFaturaPaga2() {		
		pagamento.pagarFatura(boletosFatura2,fatura2);
		assertEquals(fatura2.getstatuFatura(), "PAGA");
		pagamento.pagarFatura(boletosFatura1,fatura2);
		assertEquals(fatura2.getstatuFatura(), "PAGA");
			
	}
}
