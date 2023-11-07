public class MaldicaoCirculoInferior implements TipoMaldicao{

    private static MaldicaoCirculoInferior maldicaoCirculoInferior = new MaldicaoCirculoInferior();

    private MaldicaoCirculoInferior() {}

    public static MaldicaoCirculoInferior getMaldicaoCirculoInferior(){
        return maldicaoCirculoInferior;
    }
}
