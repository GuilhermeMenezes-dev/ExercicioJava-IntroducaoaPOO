package CotacaoDolar;

public class CurrencyConverter {
    public static final double VALOR_DOLAR = 3.10;

    public static double converter(double quantidadeDolares) {
        double valor = VALOR_DOLAR * quantidadeDolares;
        double iof = valor * 0.06;
        double total = valor + iof;
        return total;
    }
}
