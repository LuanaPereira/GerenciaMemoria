/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamemoria;

import java.util.ArrayList;

/**
 *
 * @author Luci
 */
public class MemoriaLogica {
    private int tamanhoLogico;
    private boolean bitReferencia;
    private boolean bitModificacao;
    private int base;
    private int limite;
  
    public int getTamanho() {
        return tamanhoLogico;
    }

    public void setTamanho(int tamanhoLogico) {
        this.tamanhoLogico = tamanhoLogico;
    }

    public boolean isBitReferencia() {
        return bitReferencia;
    }

    public void setBitReferencia(boolean bitReferencia) {
        this.bitReferencia = bitReferencia;
    }

    public boolean isBitModificacao() {
        return bitModificacao;
    }

    public void setBitModificacao(boolean bitModificacao) {
        this.bitModificacao = bitModificacao;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    
}
