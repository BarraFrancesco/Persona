
package persona;

/**
 *
 * @author Francy10
 */
public class Calciatore extends Sportivo{
    String squadra;
    String ruolo;
    Calciatore(){
    }
    Calciatore(String co,String no,String spo,String squ){
        super(co,no,spo);
        squadra=squ;
    }
    void stampa(){
        super.stampa();
        System.out.println("squadra:"+squadra);
    }
    void stampaSquadra(){
        System.out.println("squadra:"+squadra);
    }

    
}
