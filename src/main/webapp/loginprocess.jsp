  <!DOCTYPE html>
<html>
<head><title>Login page</title></head>
<body>  
    
    <%@page import="bean.Login"%>  
    <jsp:useBean id="obj" class="bean.LoginProcess"/>  
      
    <jsp:setProperty property="*" name="obj"/>  
      
    <%  
    boolean status=LoginDao.validate(obj);  
    if(status){  
    out.println("You r successfully logged in");  
    session.setAttribute("session","TRUE");  
    }  
    else  
    {  
    out.print("Sorry, email or password error");  
    %>  
    <jsp:include page="index.jsp"></jsp:include>  
    <%  
    }  
    %>  
    </body>
</html>