<%@ page import="java.util.*" %>
<%@ page import="java.io.PrintWriter" %>
<html>
<body>
<h1 align="center">Beer recommendations JSP</h1>

<%
    List styles = (List) request.getAttribute("styles");
    Iterator it = styles.iterator();
    List types = (List) request.getAttribute("types");
    Iterator it1 = types.iterator();
    String configuration = (String) request.getAttribute("config");
    String context = (String) request.getAttribute("context");
    PrintWriter out1 = response.getWriter();
    while (it.hasNext()) {
        out1.print("<br> try: " + it.next());
    }
    while (it1.hasNext()) {
        out1.print("<br> try: " + it1.next());
    }
    out1.print("<br> "+ configuration);
    out1.print("<br> "+ context);
%>
</body>
</html>