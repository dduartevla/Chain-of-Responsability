public class MaldicaoCirculoMedio implements TipoMaldicao{

    private static MaldicaoCirculoMedio maldicaoCirculoMedio = new MaldicaoCirculoMedio();

    private MaldicaoCirculoMedio() {}

    public static MaldicaoCirculoMedio getMaldicaoCirculoMedio(){
        return maldicaoCirculoMedio;
    }
}
