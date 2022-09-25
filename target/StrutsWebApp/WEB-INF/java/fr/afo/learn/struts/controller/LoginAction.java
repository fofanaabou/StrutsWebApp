package fr.afo.learn.struts.controller;

import fr.afo.learn.struts.data.LoginForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {


        String result = null;
        LoginForm loginForm = (LoginForm)form;
        String username = loginForm.getUsername();
        String password = loginForm.getPassword();

        System.out.println("username:" + username);

        result = username.equals("fofana") && password.equals("fofana") ? "success": "fail";
        return mapping.findForward(result);
    }
}
