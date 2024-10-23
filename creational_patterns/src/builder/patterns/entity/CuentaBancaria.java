package builder.patterns.entity;

public class CuentaBancaria {
  private String numeroCuenta;
  private String tipoCuenta;
  private String titular;
  private double saldoInicial;
  private boolean tieneChequera;
  private boolean tieneTarjetaCredito;

  private CuentaBancaria(Builder builder) {
    this.numeroCuenta = builder.numeroCuenta;
    this.tipoCuenta = builder.tipoCuenta;
    this.titular = builder.titular;
    this.saldoInicial = builder.saldoInicial;
    this.tieneChequera = builder.tieneChequera;
    this.tieneTarjetaCredito = builder.tieneTarjetaCredito;
  }

  @Override
  public String toString() {
    return "CuentaBancaria{" +
        "numeroCuenta='" + numeroCuenta + '\'' +
        ", tipoCuenta='" + tipoCuenta + '\'' +
        ", titular='" + titular + '\'' +
        ", saldoInicial=" + saldoInicial +
        ", tieneChequera=" + tieneChequera +
        ", tieneTarjetaCredito=" + tieneTarjetaCredito +
        '}';
  }

  public static class Builder {
    private String numeroCuenta;
    private String tipoCuenta;
    private String titular;
    private double saldoInicial;
    private boolean tieneChequera;
    private boolean tieneTarjetaCredito;

    public Builder numeroCuenta(String numeroCuenta) {
      this.numeroCuenta = numeroCuenta;
      return this;
    }

    public Builder tipoCuenta(String tipoCuenta) {
      this.tipoCuenta = tipoCuenta;
      return this;
    }

    public Builder titular(String titular) {
      this.titular = titular;
      return this;
    }

    public Builder saldoInicial(double saldoInicial) {
      this.saldoInicial = saldoInicial;
      return this;
    }

    public Builder tieneChequera(boolean tieneChequera) {
      this.tieneChequera = tieneChequera;
      return this;
    }

    public Builder tieneTarjetaCredito(boolean tieneTarjetaCredito) {
      this.tieneTarjetaCredito = tieneTarjetaCredito;
      return this;
    }

    public CuentaBancaria build() {
      return new CuentaBancaria(this);
    }
  }
}