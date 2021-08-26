package bean.comunicacao;


import org.omnifaces.util.Faces;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.Cookie;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Map;

/**
 * Created by const on 24/08/2021.
 */
@Named
@ViewScoped
public class ComunicacaoTeste8Bean implements Serializable {

    private String key;
    private String value;

    public void init() {
        Map<String, Object> requestCookieMap = FacesContext.getCurrentInstance().getExternalContext().getRequestCookieMap();
        System.out.println(Faces.getRequestCookie("Nome"));
//        Cookie cookie = (Cookie) requestCookieMap.get("nome");
//        try {
//            String decode = URLDecoder.decode(cookie.getValue(), "UTF-8");
//            System.out.println(decode);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }

        System.out.println(requestCookieMap);

    }

    //    public void salvarCookie() {
//        Faces.addResponseCookie(key, value, 5);
//    }
    public String salvarCookie() {
        Faces.addResponseCookie(key, value, 5);
        return "comunicacao9?faces-redirect=true";
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
