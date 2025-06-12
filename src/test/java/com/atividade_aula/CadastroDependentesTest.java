package com.atividade_aula;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CadastroDependentesTest {
    
    private IRPF irpf; 

    @Before
    public void setup(){
        irpf = new IRPF();
    }
    
    @Test
    public void testeCadastrarUmDependente(){
        irpf.CadastrarDependente("joão");
        assertEquals(189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    public void testeCadastrarUmDependente2(){
        irpf.CadastrarDependente("João");
        irpf.CadastrarDependente("Maria");
        assertEquals(2 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    public void testeCadastrarUmDependente3(){
        irpf.CadastrarDependente("João");
        irpf.CadastrarDependente("Maria");
        irpf.CadastrarDependente("Jose");
        assertEquals(3 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }

}
