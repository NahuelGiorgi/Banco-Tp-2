package ar.edu.unlam.pb2.banco;

public class Cuenta {
	protected Double saldo = 0.0;

	void depositar(Double cantidad) {
		this.saldo += cantidad;
	}

	void extraer(Double cantidad) {
		if ((saldo - cantidad) < 0) {
			throw new RuntimeException("No dispone de esa cantidad de dinero.");
		} else {
			this.saldo -= cantidad;
		}
	}

	Double getSaldo() {
		return saldo;
	}
}
