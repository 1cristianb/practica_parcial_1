package dominio;

public class CajaDeAhorro extends Cuenta {

	private Integer contadorDeExtracciones;

	public CajaDeAhorro(Integer cbu, Double saldo) {
		super(cbu, saldo);
		setTipoDeCuenta(TipoDeCuenta.CAJA_AHORRO);
		contadorDeExtracciones = 0;
	}

	@Override
	public Boolean extraerDinero(Double monto) {
		Boolean SePudoExtraer = false;
		Double maximoMontoAExtraer = getSaldo();
		if (contadorDeExtracciones >= 5) {
			maximoMontoAExtraer = getSaldo() - 6;
		}
		if (monto <= maximoMontoAExtraer) {
			if (contadorDeExtracciones < 5) {

				setSaldo(getSaldo() - monto);

			} else {
				setSaldo(getSaldo() - monto - 6);
			}
			contadorDeExtracciones++;
			SePudoExtraer = true;
		}

		return SePudoExtraer;
	}

}
