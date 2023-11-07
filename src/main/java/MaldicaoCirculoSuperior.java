public class MaldicaoCirculoSuperior implements TipoMaldicao{

    private static MaldicaoCirculoSuperior maldicaoCirculoSuperior = new MaldicaoCirculoSuperior();

    private MaldicaoCirculoSuperior() {}

    public static MaldicaoCirculoSuperior getMaldicaoCirculoSuperior(){
        return maldicaoCirculoSuperior;
    }
}
