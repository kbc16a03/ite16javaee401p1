package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Bb {
    
    public String regist() {
        return "regist.xhtml";
    }
    
    public String login() {
        return "login.xhtml";
    }
    
}
