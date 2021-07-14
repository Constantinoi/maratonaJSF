package bean.estudante;

import model.Estudante;

import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

/**
 * Created by const on 12/07/2021.
 */

@Named
public class EstudanteRegistrarBean implements Serializable {

    private Estudante estudante = new Estudante();

    private String[] nomesArray = {"DevDojo", "Constantino", "Maratona"};

    private List<String> nomesList = Arrays.asList("Teste2", "Constantino", "Maratona");

    private Set<String> nomesSet = new HashSet<>(Arrays.asList("Goku", "Naruto", "Luffy", "Boruto"));

    private Map<String, String> nomeMap = new HashMap<>();

    {
        nomeMap.put("Goku", "Sayjin");
        nomeMap.put("Luffy", "Pirata");
        nomeMap.put("Naruto", "Ninja");

        for (String nome : nomesSet) {
            System.out.println(nome);
        }

        for (Map.Entry<String, String> entry : nomeMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    public void executar() {
        System.out.println("TESTE PARA TESTAR O JSF");
        System.out.println("OLHA AI FUNCIONANDO");
        System.out.println("LEGAL ISSO AQUI");

    }

    public String irParaIndex2() {
        return "index2?faces-redirect=true";
    }

    public void executar(String param) {
        System.out.println("TESTE PARA TESTAR O JSF " + param);
        System.out.println("OLHA AI FUNCIONANDO");
        System.out.println("LEGAL ISSO AQUI");
    }

    public String executarRetorno(String param) {
        return "Quem e o lindao ? " + param;
    }


    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public Map<String, String> getNomeMap() {
        return nomeMap;
    }

    public void setNomeMap(Map<String, String> nomeMap) {
        this.nomeMap = nomeMap;
    }
}
