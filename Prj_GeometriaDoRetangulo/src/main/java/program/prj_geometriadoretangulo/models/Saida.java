package program.prj_geometriadoretangulo.models;

public class Saida {
    
    private double area;
    private double perimetro;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    public void exibirResultado(){
        System.out.println("\n===== RESULTADO DO RETÂNGULO =====");
        System.out.printf("Área: %.2f\n", area);
        System.out.printf("Perimetro: %.2f\n", perimetro);
        System.out.println("==================================");
    
    }
    
}
