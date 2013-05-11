package br.edu.fei.gestaopacientes.misc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginInterceptor implements Interceptor{

	private static final long serialVersionUID = -2355407694761058864L;

	static Logger logger = LogManager.getLogger(LoginInterceptor.class.getName());
	
	public String intercept(ActionInvocation invocation) throws Exception {
		logger.debug("Invocating action:"+invocation.getAction().getClass().getName());
		
	    final ActionContext context = invocation.getInvocationContext ();
	    HttpServletRequest request = (HttpServletRequest) context.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
	    HttpSession session =  request.getSession (true);
	    
	    String logoutAttempt = request.getParameter ("LOGOUT_ATTEMPT");
        if (logoutAttempt!=null && !logoutAttempt.equals("")) { 
        	session.removeAttribute("USER_LOGGED");
        }
	    
	    Object user = session.getAttribute ("USER_LOGGED");
	    if (user == null) {

	    	logger.debug("User not logged");
	    	
	    	String loginAttempt = request.getParameter ("LOGIN_ATTEMPT");
	        if (loginAttempt!=null && !loginAttempt.equals("")) { 
		    	logger.debug("Attemping to log user");

	            if (processLoginAttempt (request, session) ) {
	                return "login-success";
	            } else {
	            	
	            	request.setAttribute("loginInvalido","Usuario ou senha incorreto.");
	                return "login";
	            }
	        }
	    	
	        
	        return "login";
	    } else {
	        return invocation.invoke ();
	    }
	
	}
	
	private boolean processLoginAttempt(HttpServletRequest request,HttpSession session){
	    String password = request.getParameter ("PASSWORD");

	    if("1234".equals(password)){   
	    	request.getSession().setAttribute("USER_LOGGED", "USEROK");
	    	return true;
	    }else{
	    	return false;
	    }
	   
	}

	@Override
	public void destroy() {
		logger.debug("Destroying login interceptor");
		
	}

	@Override
	public void init() {
		logger.debug("Initializing Login Interceptor");
		
	}
}
