package beans;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Named
@RequestScoped
public class Login extends SuperBb implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    
    @EJB
    EmployeeDb employeeDb;
    
    public String login() {
        /* HttpServletRequest request = getRequest();
        try {
            request.login(username, password);
        } catch (ServletException ex) {
            facesErrorMsg("ログインできません");
            return null;
        }
        return "/input.xhtml?faces-redirect=true"; */
        
        if(username.equals("越智") && password.equals("ju78iklo")) {
            return "input.xhtml";
        } else {
            return null;
        } 
        
    }
    
    public String logout() {
        getServlet().invalidateSession();
        HttpServletRequest request = getRequest();
        try {
            request.logout();
        } catch (ServletException ex) {
            
        }
        return "/index.xhtml?faces-redirect=true";
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
