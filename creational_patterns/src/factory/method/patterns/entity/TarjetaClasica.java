package factory.method.patterns.entity;

import factory.method.patterns.services.TarjetaCredito;

public class TarjetaClasica implements TarjetaCredito {
  private String titular;
  private double limiteCredito;
  private double tasaInteres;
  private double cashback;

  public TarjetaClasica(String titular) {
    this.titular = titular;
    this.limiteCredito = 1000;
    this.tasaInteres = 1.8;
    this.cashback = 2.5;
  }

  @Override
  public void mostrarDetalles() {
    System.out.println("Tarjeta Clasica para " + titular);
    System.out.println("Límite de Crédito: $" + limiteCredito);
    System.out.println("Tasa de Interés: " + tasaInteres + "%");
    System.out.println("Cashback: " + cashback + "% en compras");
  }
}
