<%
    if (request.getAttribute("is_page") == null) {
        response.sendRedirect("DataToJSP");
    }else{
        if (!request.getAttribute("is_page").equals("DataToJSP")){
            response.sendRedirect("DataToJSP");
        }
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<title><%=request.getAttribute("title") %></title>
</head>
<body>
<ul>
<h1><%=request.getAttribute("list")%></h1>
<%
 if (request.getAttribute("description")!=null) {
    out.println("<p><strong>"+request.getAttribute("description") + "</strong></p>");
 }
 else {
    out.println("<p>Нет данных</p>");
 }
%>
<hr>
<%
if (request.getAttribute("countriesData")!=null) {
    for(String country : (String[]) request.getAttribute("countriesData")){
        out.println("<li>"+country + "</li>");
    }
}
else {
    out.println("<li><strong>Нет данных!</strong></li>");
}
%>
</ul>
<hr>
</body>
</html>