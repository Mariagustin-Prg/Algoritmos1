public class sample{
    public static void main(String[] args) {
        Fraccion f = new Fraccion(1, 2);
        Fraccion f_1 = new Fraccion(1 ,4);
        
        Fraccion f_final = f.division(f_1);
        System.out.println(f_final);
    }
    
}
