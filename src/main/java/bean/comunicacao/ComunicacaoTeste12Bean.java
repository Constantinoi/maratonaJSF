package bean.comunicacao;


import model.Estudante;
import util.ApplicationMapUtil;


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by const on 24/08/2021.
 */
@Named
@RequestScoped
public class ComunicacaoTeste12Bean implements Serializable {
    private Estudante estudante;

    public void init() {
        estudante = (Estudante) ApplicationMapUtil.getValueFromApplicationMap("estudante");
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
