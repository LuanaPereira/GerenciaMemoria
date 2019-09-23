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

   
    ArrayList<Processo> listaDeProcesso = new ArrayList();
   
    public void criaProcesso(){
        for (int i = 0; i<16; i++){
            Processo processo = new Processo();
            String nome = "Processo " + i;
            int tamanhoProcesso = 1;
            processo.setNome(nome);
            processo.setTamanhoProcesso(tamanhoProcesso); 
            listaDeProcesso.add(processo);
            tamanhoFisico--;
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
    
    public int getTamanhoFisico() {
        return tamanhoFisico;
    }

    public void setTamanhoFisico(int tamanhoFisico) {
        this.tamanhoFisico = tamanhoFisico;
    }
}
