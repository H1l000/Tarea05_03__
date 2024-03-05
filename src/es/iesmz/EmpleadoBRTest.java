package es.iesmz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EmpleadoBRTest {

    @BeforeEach
    public void imprimir(){
        System.out.println("EXECUTE PROVA");
    }

    @Test
    public void testCalcularSalarioBruto1(){
        float Resultado = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, 2000, 8.0f);
        float rEsperado = 1360.0f;
        assertEquals(Resultado, rEsperado);
    }

    @Test
    public void testCalcularSalarioBruto2(){
        float Resultado = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, 123.0f, 15.0f);
        float rEsperado = 1300.0f;
        assertEquals(Resultado, rEsperado);
    }

    @Test
    public void testCalcularSalarioBruto3(){
        float Resultado = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, 123.0f, 15.0f);
        float rEsperado = 1300.0f;
        assertEquals(Resultado, rEsperado);
    }




}
