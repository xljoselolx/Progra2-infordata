import pojos.*;

import javax.management.MalformedObjectNameException;
import java.util.Calendar;

public class Main {
    public static void main(String[]args){
        //producto
        Producto producto = new Producto("C001","Teclado Retroiluminado");
        System.out.println(producto);

        //Alquilable
        Alquilable alquilable = new Alquilable("A005", "Monitor 21",10.5);
        System.out.println(alquilable);

        //Tecnologico
        Empresa empresa=new Empresa("DELL","Av.Circumvalacion #123",10);
        Tecnologico tecnologico=new Tecnologico("T100","Vostro 100","USA", Calendar.getInstance().getTime(),empresa);
        System.out.println(tecnologico);

        //Monitor
        Monitor monitor=new Monitor("M111","monitor 21",12.5,"full HD");
        System.out.println(monitor);

        //Cpu
        Empresa compaq=new Empresa("COMPAQ","Av.Ecologica #123",100);
        Cpu cpu=new Cpu("K123","Compaq","China", Calendar.getInstance().getTime(),compaq,16);
        System.out.println(cpu);
    }
}
