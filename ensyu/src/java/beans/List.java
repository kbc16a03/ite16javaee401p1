package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class List {
    
    public String next() {
        return "list.xhtml";
    }
}
