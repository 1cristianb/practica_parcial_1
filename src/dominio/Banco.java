package dominio;

import java.util.Arrays;

public class Banco {
	private Cliente[] clientes;
	private Cuenta[] cuentas;
	private Cuenta[] vip;

	public Banco() {
		super();
		this.clientes = new Cliente[1000];
		this.cuentas = new Cuenta[1000];
		this.vip = new Cuenta[1000];
	}

	public Boolean agregarCliente(Cliente cliente) {
		Boolean seAgrego = false;
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] == null) {
				clientes[i] = cliente;
				seAgrego = true;
				break;
			}
		}
		return seAgrego;
	}

	public Boolean agregarCuenta(Cuenta cuenta) {
		Boolean seAgrego = false;
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] == null) {
				cuentas[i] = cuenta;
				seAgrego = true;
				break;
			}
		}
		return seAgrego;

	}
	
	public void cuentasVip() {
		for (int i = 0; i < cuentas.length; i++) {
			
			if(cuentas[i]!=null && cuentas[i].getSaldo()>=1000000) {
				if(vip[i]==null) {
					vip[i]=cuentas[i];
				}
			}
		}
	}

	public Boolean agregarCuentaCorriente(Cliente cliente, CuentaCorriente cuenta) {
		Boolean seAgrego = false;

		cliente.agregarCuenta(cuenta);

		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] == null) {
				cuentas[i] = cuenta;
				seAgrego = true;
				break;
			}
		}
		return seAgrego;
	}

	public Boolean agregarCuentaSueldo(Cliente cliente, CuentaSueldo cuenta) {
		Boolean seAgrego = false;
		cliente.agregarCuenta(cuenta);
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] == null) {
				cuentas[i] = cuenta;
				seAgrego = true;
				break;
			}
		}
		return seAgrego;
	}

	public Boolean agregarCajaDeAhorro(Cliente cliente, CajaDeAhorro cuenta) {
		Boolean seAgrego = false;
		cliente.agregarCuenta(cuenta);
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] == null) {
				cuentas[i] = cuenta;
				seAgrego = true;
				break;
			}
		}
		return seAgrego;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public Cuenta[] getCuentas() {
		return this.cuentas;
	}

	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}
	

	public Cuenta[] getVip() {
		return vip;
	}

	public void setVip(Cuenta[] vip) {
		this.vip = vip;
	}

	@Override
	public String toString() {
		return "Banco [clientes=" + Arrays.toString(clientes) + ", cuentas=" + Arrays.toString(cuentas) + "]";
	}
	
	public String imprimirCuentasVip() {
		return "Vip [cuenta= "+Arrays.toString(vip)+"]";
	}

}
