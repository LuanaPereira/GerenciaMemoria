/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamemoria;

import java.util.ArrayList;
import gerenciamemoria.Processo;
/**
 *
 * @author Luci
 */
public class MemoriaFisica {
    private int enderecoInicio;
    private int enderecoFinal;
    private int tamanhoFisico = 16;
    Processo processo = new Processo();
    ArrayList<Processo> listaDeProcesso = new ArrayList();
    
    
   
    public int criaProcesso(){
        for (int i = 0; i<10; i++){
            String nome = "Processo " + i;
            int tamanhoProcesso = 1;
            processo.setNome(nome);
            processo.setTamanhoProcesso(tamanhoProcesso);
            System.out.println("Adicionando " + nome );
            listaDeProcesso.add(processo);
            System.out.println("Adicionado " + nome);
             System.out.println("Nome: " + listaDeProcesso.get(i).getNome() + " Tamanho: " + listaDeProcesso.get(i).getTamanhoProcesso());
            
        }
        
        
        return 1;
    }
    
    public void printa(){
        for (int i=0; i<listaDeProcesso.size(); i++){
            System.out.println("Nome: " + listaDeProcesso.get(i).getNome() + " Tamanho: " + listaDeProcesso.get(i).getTamanhoProcesso());
        }
    }
    public int getEnderecoInicio() {
        return enderecoInicio;
    }

    public void setEnderecoInicio(int enderecoInicio) {
        this.enderecoInicio = enderecoInicio;
    }

    public int getEnderecoFinal() {
        return enderecoFinal;
    }

    public void setEnderecoFinal(int enderecoFinal) {
        this.enderecoFinal = enderecoFinal;
    }
}
