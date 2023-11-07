import java.util.ArrayList;

public abstract class Clerigo {

    protected ArrayList listaMaldicoes = new ArrayList();
    private Clerigo clerigoSuperior;

    public Clerigo getClerigoSuperior(){
        return clerigoSuperior;
    }

    void  setClerigoSuperior (Clerigo clerigoSuperior){
        this.clerigoSuperior = clerigoSuperior;
    }

    public abstract String getDescricaoNivel();

    public String curarMaldicao(Maldicao maldicao) {
        if (listaMaldicoes.contains(maldicao.getTipoMaldicao())) {
            return getDescricaoNivel();
        }
        else {
            if (clerigoSuperior != null) {
                return clerigoSuperior.curarMaldicao(maldicao);
            }
            else
            {
                return "NÃO FOI POSSÍVEL REALIZAR A CURA";
            }
        }
    }

}
