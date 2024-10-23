package builder.patterns;

import builder.patterns.entity.CuentaBancaria;

public class MainBuilder {

  public static void main(String[] args) {
    CuentaBancaria cuenta = new CuentaBancaria.Builder()
        .numeroCuenta("123456789")
        .tipoCuenta("Ahorros")
        .titular("Juan Pérez")
        .saldoInicial(1000.00)
        .tieneChequera(false)
        .tieneTarjetaCredito(true)
        .build();

    System.out.println(cuenta);
  }
}