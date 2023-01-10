package segundo_bimestre.Semana5;

public class ClaseConMetodoSinRetornoValor {
    public static void main(String[] args) {
        //creamos una variable apartir de nuestra clase
        //ClaseConMetodoSinRetornoValor llamada=new ClaseConMetodoSinRetornoValor();
        //llamada.saludar();
        saludar("Lenin",10);
    }
    public static void  saludar() {
        System.out.println("BIENVENIDO A LA CEACION DE METODOS");
        System.out.println("metodo creado en java");
    }

    public static void saludar(String nombre){
        System.out.println("BIENVENID@ "+nombre.toUpperCase()+" A LA CEACION DE METODOS");
        System.out.println("metodo creado en java");
    }
    public static void saludar(String nombre,String apellido){
        System.out.println("BIENVENID@ "+nombre.toUpperCase()+" A LA CEACION DE METODOS");
        System.out.println("metodo creado en java");
    }
    public static void saludar(String nombre,int edad){
        System.out.println("BIENVENID@ "+nombre.toUpperCase()+" A LA CEACION DE METODOS");
        System.out.println("metodo creado en java");
        System.out.println("Tu edad es: "+edad);
    }
}
