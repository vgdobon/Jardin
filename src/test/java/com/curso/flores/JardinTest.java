package com.curso.flores;

import com.curso.jardines.Jardin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.fail;

public class JardinTest {

    @Test
    public void addFlor(){

        //1. Inicializacion del entorno
        Gardenia gardenia= new Gardenia(20,"Gadenia");
        Jardin jardin = new Jardin();

        //2. Ejecucion del codigo
        jardin.addFlor(gardenia);
        //3. Comprobacion del resultado

        if(jardin.getFlores().isEmpty() ||
           jardin.getFlores().size()==0 ||
           !jardin.getFlores().contains(gardenia)
            ){
            fail("No se ha añadido la gardenia correctamente");
        }
    }

    @Test
    public void removeFlor(){

        //1. Inicializacion del entorno
        Gardenia gardenia= new Gardenia(20,"Gadenia");
        Jardin jardin = new Jardin();
        jardin.addFlor(gardenia);

        //2. Ejecucion del codigo
        jardin.removeFlor(gardenia);
        //3. Comprobacion del resultado

        Assertions.assertEquals(0,jardin.getFlores().size());
        Assertions.assertEquals(false,jardin.getFlores().contains(gardenia));

        if(jardin.getFlores().contains(gardenia)){
            fail("No se ha eliminado la flor correctamente");
        }

    }
}
