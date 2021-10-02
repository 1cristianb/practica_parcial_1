package dominio;

public abstract class Cuenta {
	private Integer cbu;
	private Double saldo;
	private TipoDeCuenta tipoDeCuenta;

	public Cuenta(Integer cbu, Double saldo) {
		this.cbu = cbu;
		this.saldo = saldo;
	}

	public TipoDeCuenta getTipoDeCuenta() {
		return this.tipoDeCuenta;
	}

	public Integer getCbu() {
		return cbu;
	}

	public void setCbu(Integer cbu) {
		this.cbu = cbu;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void setTipoDeCuenta(TipoDeCuenta tipoDeCuenta) {
		this.tipoDeCuenta = tipoDeCuenta;
	}

	public abstract Boolean extraerDinero(Double monto);

	public Boolean depositarDinero(Double monto) {
		Boolean sePudoDepositar = false;
		if (monto > 0) {
			this.saldo += monto;
			sePudoDepositar = true;
		}
		return sePudoDepositar;
	}

	
	public String toString() {
		return "Cuenta [cbu=" + cbu + ", saldo=" + saldo + ", tipoDeCuenta=" + tipoDeCuenta + "]";
	}
	

}