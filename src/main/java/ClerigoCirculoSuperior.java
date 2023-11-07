public class ClerigoCirculoSuperior extends Clerigo{

    public ClerigoCirculoSuperior(Clerigo superior){
        listaMaldicoes.add(MaldicaoCirculoInferior.getMaldicaoCirculoInferior());
        listaMaldicoes.add(MaldicaoCirculoMedio.getMaldicaoCirculoMedio());
        listaMaldicoes.add(MaldicaoCirculoSuperior.getMaldicaoCirculoSuperior());
        setClerigoSuperior(superior);
    }
    @Override
    public String getDescricaoNivel() {
        return "Clérigo Circulo Superior";
    }
}
