<%@ page import="com.fss.Employee" %>
<%
session=request.getSession();
Object o=session.getAttribute("employeeObj");
if (o!=null)
{
	Employee ee=(Employee)o;
	out.println(ee.getEmployeeName()+" lives in "+ee.getEmployeeCity()+"<br>");
	out.println("<a href=\"Page2\"> Go to Page2</a>");
}
else
{
out.println("<font color=red>You are not logged in<hr></font>");
%>
<a href="http://localhost:8090/SpringSessionTracking">Login Please</a> <% } %>