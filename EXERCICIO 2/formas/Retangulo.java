package formas;

public class Retangulo implements FormaGeometrica {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Get e Set
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // cálculo da área do retângulo
    @Override
    public double calcularArea() {
        return largura * altura;
    }

    // cálculo do perímetro do retângulo
    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}

