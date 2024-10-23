package factory.method.patterns;

import factory.method.patterns.factories.TarjetaClasicaFactory;
import factory.method.patterns.factories.TarjetaFactory;
import factory.method.patterns.factories.TarjetaOroFactory;
import factory.method.patterns.services.TarjetaCredito;

public class MainFactoryMethod {

  public static void main(String[] args) {
    TarjetaFactory factoryOro = new TarjetaOroFactory();
    TarjetaCredito tarjetaOro = factoryOro.crearTarjeta("Roberto Jair Yactayo Paucar");
    tarjetaOro.mostrarDetalles();

    System.out.println("------------------------------------------------------------------");

    TarjetaFactory factoryClasica = new TarjetaClasicaFactory();
    TarjetaCredito tarjetaClasica = factoryClasica.crearTarjeta("Jennyfer Gonzales");
    tarjetaClasica.mostrarDetalles();

  }
}