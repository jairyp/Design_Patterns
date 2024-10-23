package factory.method.patterns.factories;

import factory.method.patterns.entity.TarjetaClasica;
import factory.method.patterns.services.TarjetaCredito;

public class TarjetaClasicaFactory extends TarjetaFactory{

  @Override
  public TarjetaCredito crearTarjeta(String titular) {
    return new TarjetaClasica(titular);
  }
}
