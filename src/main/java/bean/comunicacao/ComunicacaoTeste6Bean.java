package bean.comunicacao;

import model.Estudante;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by const on 24/08/2021.
 */
@Named
@ViewScoped
public class ComunicacaoTeste6Bean implements Serializable {

    private List<Estudante> estudanteList = Estudante.estudanteList();

    public String editar(int index){
        Estudante estudante = estudanteList.get(index);+
                return "";
    }

    public List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    public void setEstudanteList(List<Estudante> estudanteList) {
        this.estudanteList = estudanteList;
    }
}