import java.util.HashSet;
import java.util.Set;

public class EjemploHashSet {
    public static void main(String[] args) {
        
        Set<String> nombres = new HashSet<>();
        
    
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Laura");
        nombres.add("Juan"); 
        
    
        System.out.println("Elementos en el conjunto: " + nombres);
        
     
        System.out.println("¿El conjunto contiene 'Pedro'? " + nombres.contains("Pedro"));
        System.out.println("¿El conjunto contiene 'Ana'? " + nombres.contains("Ana"));
        
    
        nombres.remove("María");
        System.out.println("Elementos en el conjunto después de eliminar 'María': " + nombres);
        
  
        System.out.println("Tamaño del conjunto: " + nombres.size());
        
   
        System.out.println("¿El conjunto está vacío? " + nombres.isEmpty());
    }
}
