package packageCom2;

public class CuentaBancaria {
	
	// crtl + barra espaciadora fuerza la muestra de "opciones?/cuadro de metodos"

	private int saldo; // Forma rapida: click der, Source, generate Getter and Setters

	
	// Constructor, para crear una instancia de clase
	public CuentaBancaria(int saldo) {  // Forma rapida: click der, Source, generate Constructor using field...
		super(); // 
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	/*
	public void depositar(int monto) {
		this.saldo = saldo + monto;
	}
	
	public void depositar2(int monto) {
		this.setSaldo(this.getSaldo()+ monto);
	}
	*/
	
	public void depositar3(int monto) {
		int saldoActualizado; // declaracion de la variable
		saldoActualizado = this.getSaldo() + monto; // asignacion de la variable
		// los dos anteriores se pueden hacer en la misma linea
		
		this.setSaldo(saldoActualizado);
	}
	
	/*
	public void extraer (int monto) {
		this.saldo = saldo - monto;
	}
	*/
	
	public void extraer2(int monto) {
		int saldoActualizado= this.getSaldo() - monto;
		
		this.setSaldo(saldoActualizado);
		
	}
	
	
}
