import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaldicaoTest {

    ClerigoCirculoInferior clerigoCirculoInferior;
    ClerigoCirculoMedio clerigoCirculoMedio;
    ClerigoCirculoSuperior clerigoCirculoSuperior;

    @BeforeEach
    void setUp(){
        clerigoCirculoSuperior = new ClerigoCirculoSuperior(null);
        clerigoCirculoMedio = new ClerigoCirculoMedio(clerigoCirculoSuperior);
        clerigoCirculoInferior = new ClerigoCirculoInferior(clerigoCirculoMedio);
    }

    @Test
    void inferiorDeveCurarMaldicaoInferior(){
        assertEquals("Clérigo Circulo Inferior",
                clerigoCirculoInferior.curarMaldicao(
                        new Maldicao(MaldicaoCirculoInferior.getMaldicaoCirculoInferior())));
    }

    @Test
    void medioDeveCurarMaldicaoMedio(){
        assertEquals("Clérigo Circulo Medio",
                clerigoCirculoMedio.curarMaldicao(
                        new Maldicao(MaldicaoCirculoMedio.getMaldicaoCirculoMedio())));
    }

    @Test
    void medioDeveCurarMaldicaoInferior(){
        assertEquals("Clérigo Circulo Medio",
                clerigoCirculoMedio.curarMaldicao(
                        new Maldicao(MaldicaoCirculoInferior.getMaldicaoCirculoInferior())));
    }

    @Test
    void superiorDeveCurarMaldicaoSuperior(){
        assertEquals("Clérigo Circulo Superior",
                clerigoCirculoSuperior.curarMaldicao(
                        new Maldicao(MaldicaoCirculoSuperior.getMaldicaoCirculoSuperior())));
    }

    @Test
    void superiorDeveCurarMaldicaoMedio(){
        assertEquals("Clérigo Circulo Superior",
                clerigoCirculoSuperior.curarMaldicao(
                        new Maldicao(MaldicaoCirculoMedio.getMaldicaoCirculoMedio())));
    }

    @Test
    void superiorDeveCurarMaldicaoInferior(){
        assertEquals("Clérigo Circulo Superior",
                clerigoCirculoSuperior.curarMaldicao(
                        new Maldicao(MaldicaoCirculoInferior.getMaldicaoCirculoInferior())));
    }

    //Não deve curar acima do nivel

    @Test
    void inferiorNaoDeveCurarMaldicaoMedio(){
        assertNotEquals("Clérigo Circulo Inferior",
                clerigoCirculoInferior.curarMaldicao(
                        new Maldicao(MaldicaoCirculoMedio.getMaldicaoCirculoMedio())));
    }

    @Test
    void inferiorNaoDeveCurarMaldicaoSuperior(){
        assertNotEquals("Clérigo Circulo Inferior",
                clerigoCirculoInferior.curarMaldicao(
                        new Maldicao(MaldicaoCirculoSuperior.getMaldicaoCirculoSuperior())));
    }

    @Test
    void medioNaoDeveCurarMaldicaoSuperior(){
        assertNotEquals("Clérigo Circulo Medio",
                clerigoCirculoInferior.curarMaldicao(
                        new Maldicao(MaldicaoCirculoSuperior.getMaldicaoCirculoSuperior())));
    }

}