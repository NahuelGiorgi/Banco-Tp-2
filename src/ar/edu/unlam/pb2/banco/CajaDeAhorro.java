package ar.edu.unlam.pb2.banco;

public class CajaDeAhorro extends Cuenta {

	private Integer numeroDeExtraccion = 1;

	@Override
	public void extraer(Double cantidad) {
		Double nuevoSaldo = saldo - cantidad;

		if (this.numeroDeExtraccion > 5) {
			nuevoSaldo -= 6;
		}

		if (nuevoSaldo < 0) {
			throw new RuntimeException("No dispone de esa cantidad de dinero.");
		} else {
			this.saldo = nuevoSaldo;
			this.numeroDeExtraccion++;
		}
	}

}
