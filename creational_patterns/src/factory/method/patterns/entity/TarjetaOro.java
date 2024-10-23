package factory.method.patterns.entity;

import factory.method.patterns.services.TarjetaCredito;

public class TarjetaOro implements TarjetaCredito {

  private String titular;
  private double limiteCredito;
  private double tasaInteres;
  private double cashback;

  public TarjetaOro(String titular) {
    this.titular = titular;
    this.limiteCredito = 5000.00;
    this.tasaInteres = 1.5;
    this.cashback = 2.0;
  }

  @Override
  public void mostrarDetalles() {
    System.out.println("Tarjeta Oro para " + titular);
    System.out.println("Límite de Crédito: $" + limiteCredito);
    System.out.println("Tasa de Interés: " + tasaInteres + "%");
    System.out.println("Cashback: " + cashback + "% en compras");
  }
}
