package beans;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

@Named
@RequestScoped
public class Regist {
    @NotNull
    private String username;
    private String password;
    @EJB
    EmployeeDb employeeDb;
    
    public String next() {
        create();
        return "index.xhtml";
    }
    
    public String create() {
        Employee employee = new Employee(username, password);// 新規登録
        try {
            employeeDb.create(employee);
            clear();
        } catch (Exception e) {
            
        }
        return null;
    }
    
    public void clear() {	// 変数をクリア
        username = null;
        password = null;
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
