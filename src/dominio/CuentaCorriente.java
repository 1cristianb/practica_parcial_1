package dominio;

public class CuentaCorriente extends Cuenta {
	private Double montoDescubierto;
	private Double deuda;

	public CuentaCorriente(Integer cbu, Double saldo) {
		super(cbu, saldo);
		this.montoDescubierto = 1000.0;
		this.deuda=0.0;
		setTipoDeCuenta(TipoDeCuenta.CORRIENTE);
	}

	@Override
	public Boolean extraerDinero(Double monto) {
		Boolean sePudoExtraer = false;
		Double saldoEnCuenta = getSaldo();
		Double maximoAExtraer = montoDescubierto + saldoEnCuenta;
		Double diferencia=0.0;

		if (monto > saldoEnCuenta && monto <= maximoAExtraer) {
			diferencia= monto - saldoEnCuenta;
			setDeuda(  (diferencia*0.05) + diferencia);
			setSaldo(0.0);
			sePudoExtraer = true;
		}
		if (monto <= saldoEnCuenta && monto > 0) {
			setSaldo(saldoEnCuenta - monto);
			sePudoExtraer = true;
		}

		return sePudoExtraer;
	}
	
	@Override
	public Boolean depositarDinero(Double monto) {
		Boolean seDeposito=false;
		if(monto>0 && monto>=this.deuda) {
			setSaldo((this.deuda-monto)*-1.0);
			setDeuda(0.0);
			seDeposito=true;
		}
		if(monto>0 && monto<this.deuda) {
			setDeuda(this.deuda-monto);
			seDeposito=true;
		}
		return seDeposito;
	}

	public Double getMontoDescubierto() {
		return montoDescubierto;
	}

	public void setMontoDescubierto(Double montoDescubierto) {
		this.montoDescubierto = montoDescubierto;
	}

	public Double getDeuda() {
		return deuda;
	}

	public void setDeuda(Double deuda) {
		this.deuda = deuda;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [saldo=" + getSaldo() + ", deuda=" + deuda + "]";
	}


}

