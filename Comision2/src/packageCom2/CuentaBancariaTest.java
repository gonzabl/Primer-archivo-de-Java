package packageCom2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaBancariaTest {

	CuentaBancaria cuenta; // ahora cuentaBancaria test conoce a una instancia de cuenta bancaria
	
	@BeforeEach
	void setUp() throws Exception { // aqui se crean los juegos de datos limpios. Antes de cada test se ejecuta esto.
		
		cuenta = new CuentaBancaria(100); // inicializacion de juego de datos
	}

	/*@Test
	void depositarTest() {
		cuenta.depositar3(20); // Ejecucion de prueba de datos
		assertEquals(120,cuenta.getSaldo()); // verificacion de datos
	}*/
	
	@Test // con un bug
	void depositarTest() {
		cuenta.depositar3(21); // Ejecucion de prueba de datos
		assertEquals(120,cuenta.getSaldo()); // verificacion de datos
	}
	
	@Test
	void extraerTest() {
		cuenta.extraer2(20);; // Ejecucion de prueba de datos
		assertEquals(80,cuenta.getSaldo()); // verificacion de datos
	}

}
