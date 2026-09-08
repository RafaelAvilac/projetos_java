
package program.formasgeometricas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import program.formasgeometricas.models.Circulo;
import program.formasgeometricas.models.Forma;
import program.formasgeometricas.models.Retangulo;
import program.formasgeometricas.models.Triangulo;

public class FormasGeometricas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        List<Forma> lista = new ArrayList<>();
        
        Forma fo = new Forma();
        Circulo cir = new Circulo();
        Retangulo ret = new Retangulo();
        Triangulo tri = new Triangulo();
        
        fo.setNome("Forma genérica");
        
        cir.setNome("Circulo");
        cir.setRaio(3.5);
        
        ret.setNome("Retangulo");
        ret.setAltura(1.5);
        ret.setBase(1.1);
        
        tri.setNome("Triangulo");
        tri.setAltura(1.36);
        tri.setBase(1.9);
        
        lista.add(fo);
        lista.add(cir);
        lista.add(ret);
        lista.add(tri);
        
        for(Forma f : lista){
            System.out.printf("Nome: %s%nArea: %.2f%n", f.getNome() , f.calcularArea());
        }
        
    }
}
