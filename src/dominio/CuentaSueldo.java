package dominio;

public class CuentaSueldo extends Cuenta {

	public CuentaSueldo(Integer cbu, Double saldo) {
		super(cbu, saldo);
		setTipoDeCuenta(TipoDeCuenta.SUELDO);

	}

	@Override
	public Boolean extraerDinero(Double monto) {
		Boolean SePudoExtraer = false;
		if (monto <= getSaldo() && monto > 0) {
			setSaldo(getSaldo() - monto);
			SePudoExtraer = true;
		}
		return SePudoExtraer;
	}

}
