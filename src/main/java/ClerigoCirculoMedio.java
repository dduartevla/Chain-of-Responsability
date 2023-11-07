public class ClerigoCirculoMedio extends Clerigo{

    public ClerigoCirculoMedio(Clerigo superior){
        listaMaldicoes.add(MaldicaoCirculoInferior.getMaldicaoCirculoInferior());
        listaMaldicoes.add(MaldicaoCirculoMedio.getMaldicaoCirculoMedio());
        setClerigoSuperior(superior);
    }
    @Override
    public String getDescricaoNivel() {
        return "Clérigo Circulo Medio";
    }
}
