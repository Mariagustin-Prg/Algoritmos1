package Cl_27_03;
public class Par<A, B> {
    
    private A primero;
    private B segundo;

    public  Par(A prim, B segu) {

        this.primero = prim;
        this.segundo = segu;
    }

    public void setPrimero(A p1) {
        this.primero = p1;
    }

    public A getPrimero() {
        return this.primero;
    }

    public void setSegundo(B s2) {
        this.segundo = s2;
    }

    public B getSegundo() {
        return this.segundo;
    }
}
