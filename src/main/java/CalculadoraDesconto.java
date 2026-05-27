public class CalculadoraDesconto {

    public double calcularValorFinal(double valorCompra) {

        if (valorCompra < 0) {
            throw new IllegalArgumentException("Valor da compra não pode ser negativo.");
        }

        if (valorCompra < 100) {
            return valorCompra;
        }

        if (valorCompra < 500) {
            return valorCompra * 0.95;
        }

        return valorCompra * 0.90;
    }
}