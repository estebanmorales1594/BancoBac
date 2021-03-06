import javax.mail.MessagingException;

/*
Esta clase sirve para crear la estructura de matrices en arreglos,
los principales metodos de la clase son agregar, que va a recibir 
los datos del cliente, y eliminar, que va a eliminar el primer elemento
de un arreglo determinado.
En ambos metodos, se va a enviar correos al cliente notificando su situacion
*/

public class ClasePruebaMatriz {

    public int size;
    public int maxsize;
    public String[][] arreglo;
    public final int MAX_SIZE = 10;
    EnviarCorreo Envia;
    String Correo;
    public int abc;

    public ClasePruebaMatriz() {
        this.size = 0;
        this.maxsize = MAX_SIZE;
        this.arreglo = new String[100][5];
        this.Envia = new EnviarCorreo();
        this.abc = 1;

    }

    public void agregar(String cliente, String correo, String tipo, String hora,String fecha) throws MessagingException {

        if (this.size < this.maxsize) {
            this.arreglo[this.size][0] = cliente;
            this.arreglo[this.size][1] = correo;
            this.arreglo[this.size][2] = tipo;   
            this.arreglo[this.size][3] = hora;   
            this.arreglo[this.size][4] = fecha;   
            this.size++;
            Envia.Enviador(correo, "Banco", "Sr(a). " + cliente + " usted ha sido agregado a nuestro sistema"+" , su turno le toca a las " +hora+" del dia "+fecha);
        }
        
    }        
    
    
    public void agregarC(String cliente, String correo, String tipo,String hora,String fecha) throws MessagingException{
        if (this.size < this.maxsize) {
            this.arreglo[this.size][0] = cliente;
            this.arreglo[this.size][1] = correo;
            this.arreglo[this.size][2] = tipo;          
             this.arreglo[this.size][3] = hora;   
            this.arreglo[this.size][4] = fecha;   
            this.size++;
        }
    }

    public String getElemento(int indice, int indice2) {
        return arreglo[indice][indice2];
    }

    public void empty() {
        this.size = 0;
    }

    public void eliminar() throws MessagingException {
        int i = 0;

        String Correo2 = this.arreglo[0][1];
        String nombre2 = this.arreglo[0][0];

        Envia.Enviador(Correo2, "Se turno", "Sr(a)"+nombre2+", llego su turno puede pasar a la caja");
            
        while (i != this.size){
            this.arreglo[i] = this.arreglo[i+1];
            i ++;
            }
        this.size --;           
    }       
    




    /*public static void main(String[] args) throws Exception {
           
        ClasePruebaMatriz cola = new ClasePruebaMatriz();
        
        cola.agregar("jose","jose12.13@hotmail.com","corporativo");
        cola.agregar("a","jose12.13@hotmail.com","normal");
        cola.agregar("b","jose12.13@hotmail.com","normal");
        cola.agregar("c","jose12.13@hotmail.com","normal");
        cola.agregar("f","jose12.13@hotmail.com","normal");
        
        
        cola.eliminar();
        cola.eliminar();
        
        String cola1 = cola.getElemento(0,0);
        
        System.out.println(cola1);
     
    }*/
}
