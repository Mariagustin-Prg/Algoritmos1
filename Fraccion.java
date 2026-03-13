public class Fraccion {
    
    private int numerador;
    private int denominador;

    // Constructores
    public Fraccion(int n, int d) {
        this.numerador = n;
        this.denominador = d;
    }
    public void Fraccion(int n) {
        this.numerador = n;
        this.denominador = 1;
    }

        // Operaciones aritméticas

        // Suma
    public Fraccion suma(Fraccion f) {
        int den_final = this.denominador * f.denominador;
        int num_final = (den_final / this.denominador * this.numerador) + (den_final / f.denominador * f.numerador);
        return new Fraccion(num_final, den_final);
    } 

        // Resta
    public Fraccion resta(Fraccion f) {
        int den_final = this.denominador * f.denominador;
        int num_final = (den_final / this.denominador * this.numerador) - (den_final / f.denominador * f.numerador);
        return new Fraccion(num_final, den_final);
    } 

        // Multiplicación
    public Fraccion multiplicacion(Fraccion f) {
        int num_final = this.numerador * f.numerador;
        int den_final = this.denominador * f.denominador;
        return new Fraccion(num_final, den_final);
    }

        // División
    public Fraccion division(Fraccion f) {
        int num_final = this.numerador * f.denominador;
        int den_final = this.denominador * f.numerador;
        return new Fraccion(num_final, den_final);
        }


        //
    public String toString() {
        return "" + this.numerador + "/" + this.denominador;
    }
}

