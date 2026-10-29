package padroescomportamentais.strategy;

public class Orcamento {

    private float custo;

    public float getCusto() {
        return custo;
    }

    public void somarCusto(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.custo = calculadora.calcular(new OperacaoSomar());
    }

    public void subtrairCusto(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.custo = calculadora.calcular(new OperacaoSubtrair());
    }

    public void dividirCusto(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.custo = calculadora.calcular(new OperacaoDividir());
    }

    public void multiplicarCusto(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.custo = calculadora.calcular(new OperacaoMultiplicar());
    }

    public void calcularMediaCustos(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.custo = calculadora.calcular(new OperacaoMedia());
    }

}
