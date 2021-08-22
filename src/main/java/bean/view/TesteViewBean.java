package bean.view;

import bean.dependent.TesteDependentBean;
import bean.session.TesteSessionBean;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by const on 24/07/2021.
 */
@Named
@ViewScoped
public class TesteViewBean implements Serializable {

    private List<String> personagens;
    private List<String> personagemSelecionado = new ArrayList<>();
    private final TesteDependentBean dependentBean;
    private final TesteSessionBean sessionBean;

    @Inject
    public TesteViewBean(TesteDependentBean dependentBean, TesteSessionBean sessionBean) {
        this.dependentBean = dependentBean;
        this.sessionBean = sessionBean;
    }

    @PostConstruct
    public void init() {
        System.out.println("Entrou no PostConstruct do ViewScoped");
        personagens = Arrays.asList("Naruto", "Susuke", "Sakura");
    }


    public void selecionarPersonagem() {
        int index = ThreadLocalRandom.current().nextInt(3);
        String personagem = personagens.get(index);
        personagemSelecionado.add(personagem);
        dependentBean.getPersonagemSelecionado().add(personagem);
    }

    public List<String> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<String> personagens) {
        this.personagens = personagens;
    }

    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }

    public TesteDependentBean getDependentBean() {
        return dependentBean;
    }

    public TesteSessionBean getSessionBean() {
        return sessionBean;
    }
}
