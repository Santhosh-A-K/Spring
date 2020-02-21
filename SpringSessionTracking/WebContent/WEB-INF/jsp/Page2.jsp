<%@ page import="com.fss.Employee" %>
<%
session=request.getSession();
Object o=session.getAttribute("employeeObj");
if (o!=null)
{
Employee ee=(Employee)o;
out.println(ee.getEmployeeName()+" lives in "+ee.getEmployeeCity());
}%>
<hr>
<a href="Logout">Logout</a>