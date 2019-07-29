package beans;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

public class SuperBb implements Serializable {
    @EJB
    EmployeeDb employeeDb;
    
    public void facesErrorMsg(String s) {
        FacesMessage msg = new FacesMessage(s);
        msg.setSeverity(FacesMessage.SEVERITY_ERROR);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    public ExternalContext getServlet() {
        return FacesContext.getCurrentInstance().getExternalContext();
    }
    public HttpServletRequest getRequest() {
        return (HttpServletRequest) getServlet().getRequest();
    }

}
