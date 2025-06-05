package formas;

public class Circulo implements FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    // Get e Set
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    // cálculo da área do círculo
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    //cálculo da circunferência do círculo
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
