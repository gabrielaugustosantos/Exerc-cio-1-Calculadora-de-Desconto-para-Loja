import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDescontoTest {

    CalculadoraDesconto calculadora = new CalculadoraDesconto();

    // Compra abaixo de R$ 100
    @Test
    void deveRetornarMesmoValorQuandoNaoHaDesconto() {
        double resultado = calculadora.calcularValorFinal(80.00);

        assertEquals(80.00, resultado);
    }

    // Compra com 5% de desconto
    @Test
    void deveAplicarDescontoDeCincoPorCento() {
        double resultado = calculadora.calcularValorFinal(200.00);

        assertEquals(190.00, resultado);
    }

    // Compra com 10% de desconto
    @Test
    void deveAplicarDescontoDeDezPorCento() {
        double resultado = calculadora.calcularValorFinal(1000.00);

        assertEquals(900.00, resultado);
    }

    // Valor limite R$ 100
    @Test
    void deveAplicarCincoPorCentoNoValorLimiteDeCemReais() {
        double resultado = calculadora.calcularValorFinal(100.00);

        assertEquals(95.00, resultado);
    }

    // Valor limite R$ 500
    @Test
    void deveAplicarDezPorCentoNoValorLimiteDeQuinhentosReais() {
        double resultado = calculadora.calcularValorFinal(500.00);

        assertEquals(450.00, resultado);
    }

    // Valor negativo
    @Test
    void deveLancarExcecaoQuandoValorForNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularValorFinal(-50.00);
        });
    }
}