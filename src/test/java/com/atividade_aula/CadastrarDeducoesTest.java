package com.atividade_aula;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.atividade_aula.IRPF;

public class CadastrarDeducoesTest {

    private IRPF irpf; 

    @Before
    public void setup(){
        irpf = new IRPF();
    }
    
    @Test
    public void testeCadastrarPrevidenciaOficial(){
        irpf.CadastrarPrevidenciaOficial(700f);
        assertEquals(700f, irpf.getPrevidenciaOficial(), 0);
    }

    @Test
    public void testeCadastrarPrevidenciaOficial2(){
        irpf.CadastrarPrevidenciaOficial(800f);
        assertEquals(800f, irpf.getPrevidenciaOficial(), 0);
    }

    @Test
    public void testeCadastrarPrevidenciaOficial3(){
        irpf.CadastrarPrevidenciaOficial(900f);
        assertEquals(900f, irpf.getPrevidenciaOficial(), 0);
    }
}
