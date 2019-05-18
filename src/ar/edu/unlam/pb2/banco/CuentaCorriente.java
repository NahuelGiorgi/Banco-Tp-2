package ar.edu.unlam.pb2.banco;

public class CuentaCorriente extends Cuenta {

	private Double descubierto = -150.0;

	@Override
	public void extraer(Double cantidad) {
		Double nuevoSaldo = saldo - cantidad;
		Double intereses = 0.0;

		if (nuevoSaldo >= descubierto && nuevoSaldo < 0) {
			intereses = Math.abs(nuevoSaldo * 0.05);
			nuevoSaldo -= intereses;
		}

		if (nuevoSaldo < descubierto) {
			throw new RuntimeException("No dispone de esa cantidad de dinero.");
		} else {
			this.saldo = nuevoSaldo - intereses;
		}

	}

}
