package com.curso.flores;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlorTest {
    @Test
    public void regarTest(){
        //1. Inicializacion del entorno
        Flor flor= new Gardenia(5, "Gardenia");
        //2. Ejecucion del codigo
        String resultado= flor.regar();
        //3. Comprobacion del resultado
        Assertions.assertEquals("Soy una Gardenia y me estan regando", resultado);
    }

    @Test
    public void verFlorecerTest(){
        //1. Inicializacion del entorno
        Flor flor= new Gardenia(5, "Gardenia");
        //2. Ejecucion del codigo
        String resultado= flor.florecer();
        //3. Comprobacion del resultado
        Assertions.assertEquals("Soy una Gardenia y me ven porque estoy floreciendo", resultado);
    }
}
