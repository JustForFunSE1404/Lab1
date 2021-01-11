/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AccountDAO;
import Model.Account;
import com.opensymphony.xwork2.ActionContext;
import java.util.Map;

/**
 *
 * @author phuch_cqzh776
 */
public class LoginAction {
    
    private String username, pass;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    
    public LoginAction() {
    }
    
    public String execute() throws Exception {
        AccountDAO accountDAO = new AccountDAO();
        if(accountDAO.getAccount(username, pass)){
            Map<String, Object> session = ActionContext.getContext().getSession();
            session.remove("USERNAME");
            session.put("USERNAME", username);
            
            return "SUCCESS";
        }
    
        
        return "FAIL";
    }
    
}
