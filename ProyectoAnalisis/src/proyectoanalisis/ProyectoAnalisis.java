
package proyectoanalisis;

public class ProyectoAnalisis {

    public static void main(String[] args) {
        
        String name [] = {"juan","pedro","tomas","mateo","diomedes"};
        
        ProyectoAnalisis.ordenamiento(name);
    }
    
    public static void busqueda(String name []){
        
        String busqueda = "Diome";
        
        int position = 0;
        int indice = 0;
        boolean encontrado = false;
        
        do {
            
            if (name[indice].equalsIgnoreCase(busqueda)) {
               encontrado = true;
               position = indice;
               indice = name.length + 1;
            }
            
            indice++;
            
        } while (indice < name.length);
        
        if (encontrado) {
            System.out.println(" El nombre es: " + name[position] + " encontrado en la posicion: " + (position + 1));
        }else{
            System.out.println("Este nombre no existe");
        }
        
    }
    
    public static void ordenamiento(String name []){
        
        String busqueda = "mateo";

        int indice = 0;
        boolean encontrado = false;
        String temporalOne, temporalTwo;
        
        do {
            
            if (name[indice].equalsIgnoreCase(busqueda)) {
                
                if (indice == 0) {
                    
                   temporalOne = name[indice]; 
                   indice = name.length;
                   
                }else if(indice == 1){
                    
                   temporalOne = name[0];
                   name[0] = name[indice];
                   name[1] = temporalOne;
                   indice = name.length;
                   
                }else{
                    
                    //Terminar
                    
                }
                
            }
            
            indice++;
            
        } while (indice < name.length);
        
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        
    }
    
}
