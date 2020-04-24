
package persona;

/**
 *
 * @author Francy10
 */
public class Persona {
    String cognome;
       String nome;
        Persona(String co, String no){
        cognome= co;
        nome=no;
    }
        Persona (){
            }
      void setNome(String no){
        nome=no;
    }
      void setCognome(String co){
        cognome=co;
    }
      String getNome(){
        return nome;
    }
      String getCognome(){
          return cognome;
      }
      void stampa(){
        System.out.println("nome:"+nome);
        System.out.println("cognome"+cognome);
      }

    
}
