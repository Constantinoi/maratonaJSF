package bean.application;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
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

    @PostConstruct
    public void init() {
        System.out.println("Entrou no PostConstruct do ApplicationScoped");
        categoriaList = Arrays.asList("RPG", "MOBA", "MMORPG");
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
}
