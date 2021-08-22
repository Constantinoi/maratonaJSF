package bean.application;

import bean.dependent.TesteDependentBean;
import bean.session.TesteSessionBean;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Created by const on 24/07/2021.
 */
@Named
@ApplicationScoped
public class TesteApplication implements Serializable {
    private List<String> categoriaList;

    private final TesteDependentBean dependentBean;
    private final TesteSessionBean testeSessionBean;

    @Inject
    public TesteApplication(TesteDependentBean dependentBean, TesteSessionBean testeSessionBean) {
        this.dependentBean = dependentBean;
        this.testeSessionBean = testeSessionBean;
    }


    @PostConstruct
    public void init() {
        System.out.println("Entrou no PostConstruct do ApplicationScoped");
        categoriaList = Arrays.asList("RPG", "MOBA", "MMORPG");
        dependentBean.getPersonagemSelecionado().addAll(Arrays.asList("Ação","Aventura"));
        testeSessionBean.selecionarPersonagem();
    }

    public void mudarLista(){
        categoriaList = Arrays.asList("RPG", "MOBA", "MMORPG","FPS");
    }

    public List<String> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<String> categoriaList) {
        this.categoriaList = categoriaList;
    }

    public TesteDependentBean getDependentBean() {
        return dependentBean;
    }

    public TesteSessionBean getTesteSessionBean() {
        return testeSessionBean;
    }
}
