package factory.method.patterns.factories;

import factory.method.patterns.entity.TarjetaOro;
import factory.method.patterns.services.TarjetaCredito;

public class TarjetaOroFactory extends TarjetaFactory{

  @Override
  public TarjetaCredito crearTarjeta(String titular) {
    return new TarjetaOro(titular);
  }
}
