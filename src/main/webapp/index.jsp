
<%@page import="org.example.SavingsAcc"%>
<%
SavingsAcc acc1 = new SavingsAcc(5000);
%>
<h2> The balance is <%=acc1.getbalance() %></h2>
