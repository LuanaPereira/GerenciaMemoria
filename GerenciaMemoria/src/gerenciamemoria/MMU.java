/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamemoria;

/**
 *
 * @author Luci
 */
public class MMU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MemoriaFisica memoriaFisica = new MemoriaFisica();
        MemoriaLogica memoriaLogica = new MemoriaLogica();
        memoriaFisica.criaProcesso();
    
        
    }
    
}
