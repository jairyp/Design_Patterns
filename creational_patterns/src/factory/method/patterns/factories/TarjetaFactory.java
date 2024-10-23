package factory.method.patterns.factories;

import factory.method.patterns.services.TarjetaCredito;

public abstract class TarjetaFactory {
  public abstract TarjetaCredito crearTarjeta(String titular);
}
