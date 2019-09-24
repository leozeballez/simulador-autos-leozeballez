package ar.edu.unahur.obj2.src;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AutoTest {

    @Test
    public void auto1() {
        TipoConduccion ecologico = new Ecologica();
        Registrador registro1 = new Registrador(16);
        Auto auto1 = new Auto(100, 0, ecologico, registro1);
        auto1.avanzar();
        Assert.assertEquals(auto1.getCantidadDeCombustible(), 99);
        Assert.assertEquals(auto1.getKilometraje(), 16);

        TipoConduccion deportivo = new Deportiva();
        Registrador registro2 = new Registrador(5);

        auto1.setTipoConduccion(deportivo);
        auto1.setRegistrador(registro2);

        auto1.avanzar();
        Assert.assertEquals(auto1.getCantidadDeCombustible(), 98);
        Assert.assertEquals(auto1.getKilometraje(), 21);
    }
}