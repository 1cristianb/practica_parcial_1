package dominio;

public class MainBanco {

	public static void main(String[] args) {
		
		Banco banco=new Banco();
		Cliente leoMessi=new Cliente("leo",40729118);
		banco.agregarCliente(leoMessi);
		CuentaCorriente cuentaCorriente=new CuentaCorriente(465486,1500000.0);
		banco.agregarCuentaCorriente(leoMessi,cuentaCorriente);
		
		
		System.out.println(banco.toString());
		banco.cuentasVip();
		System.out.println(banco.imprimirCuentasVip());
		
	}

}
