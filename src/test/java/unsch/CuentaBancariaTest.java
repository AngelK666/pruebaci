package unsch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CuentaBancariaTest {
    @Test
    void retirarConSaldoSuficiente() {
        CuentaBancaria cuenta =
                new CuentaBancaria(1000);
        cuenta.retirar(200);
        System.out.println("Saldo después del retiro: " + cuenta.getSaldo());
        assertEquals(800, cuenta.getSaldo());
    }
    @Test
    void retirarConSaldoInsuficiente() {
        CuentaBancaria cuenta = new CuentaBancaria(100);
        cuenta.retirar(500);
        assertEquals(100, cuenta.getSaldo());
    }
    @Test
    void retirarMontoNegativo() {
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        cuenta.retirar(-200);
        assertEquals(1000, cuenta.getSaldo());
    }
    @Test
    void depositarMontoValido() {
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        cuenta.depositar(500);
        assertEquals(1500, cuenta.getSaldo());
    }
    @Test
    void transferirDinero() {
        CuentaBancaria origen =
                new CuentaBancaria(1000);
        CuentaBancaria destino =
                new CuentaBancaria(500);
        origen.transferir(destino, 200);
        assertEquals(800, origen.getSaldo());
        assertEquals(700, destino.getSaldo());
    }
    @Test
    void aplicarInteresValido() {
        CuentaBancaria cuenta =
                new CuentaBancaria(1000);

        cuenta.aplicarInteres(5);

        assertEquals(1050, cuenta.getSaldo());
    }




}