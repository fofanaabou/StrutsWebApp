package fr.afo.learn.struts.data;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.ServletRequest;

public class LoginForm extends ActionForm {
    String username;
    String password;

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

    @Override
    public void reset(ActionMapping mapping, javax.servlet.http.HttpServletRequest request) {
        super.reset(mapping, request);
        this.username = null;
        this.password = null;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, ServletRequest request) {
        return new ActionErrors();
    }
}
