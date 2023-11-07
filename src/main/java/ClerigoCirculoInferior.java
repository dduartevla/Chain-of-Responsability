public class ClerigoCirculoInferior extends Clerigo{

    public ClerigoCirculoInferior(Clerigo superior){
        listaMaldicoes.add(MaldicaoCirculoInferior.getMaldicaoCirculoInferior());
        setClerigoSuperior(superior);
    }
    @Override
    public String getDescricaoNivel() {
        return "Clérigo Circulo Inferior";
    }
}
