package bean.comunicacao;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by const on 23/08/2021.
 */
@Named
@ViewScoped
public class ComunicacaoResultadoTesteBean implements Serializable {

    private String nome;
    private String sobrenome;

    public void init() {
        System.out.println("Comunicacao Resultado");

        System.out.println(nome);
        System.out.println(sobrenome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
