package com.atividade_aula;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.atividade_aula.IRPF;

public class CadastroRendimentosTest {

    private IRPF irpf; 

    @Before
    public void setup(){
        irpf = new IRPF();
    }
    
    @Test
    public void testeCadastrarSalario(){
        irpf.CadastroSalario(5000f);
        assertEquals(5000f, irpf.getTotalSalario(), 0);
    }

    @Test
    public void testeCadastrarSalario2(){
        irpf.CadastroSalario(6000f);
        assertEquals(6000f, irpf.getTotalSalario(), 0);
    }

    @Test
    public void testeCadastrarSalario3(){
        irpf.CadastroSalario(5000f);
        irpf.CadastroSalario(6000f);
        assertEquals(11000f, irpf.getTotalSalario(), 0);
    }
}
