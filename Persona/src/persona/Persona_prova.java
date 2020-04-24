
package persona;

/**
 *
 * @author Francy10
 */
public class Persona_prova {

   
      
    public static void main(String[] args) {
       Persona p =new Persona("Sordi","Alberto");
       System.out.println("\nPersona   \n---------");
       p.stampa();
       
       Sportivo s=new Sportivo("Rossi","Valentino","motociclismo");
       System.out.println("\nSportivo   \n-----------");
       s.stampa();
       
       Calciatore c=new Calciatore("Maradona","Diego","calcio","napoli");
       System.out.println("\nCalciatore  \n--------------");
       c.stampa();
    }

    
    
}
