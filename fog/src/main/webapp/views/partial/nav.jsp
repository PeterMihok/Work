
<%@page import="Domain.UserRole"%>
<%@page import="Web.DTO.SessionKeys"%>
<%@page import="Web.DTO.UserSessionDto"%>
<% UserSessionDto sessionUser = (UserSessionDto) session.getAttribute(SessionKeys.user); %>


<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="/">FOG</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="/FOG/carport/build">Build carport</a></li>
      <% if (sessionUser != null && !sessionUser.getRole().equals(UserRole.Visitor)) { %>
      <li><a href="/FOG/carport/receipts">Receipts</a></li>
       <% } %>
     <% if (sessionUser != null && sessionUser.getRole().equals(UserRole.Employee)) { %>
      <li><a href="/FOG/production/production">Production</a></li>
      <% } %>
      <li><a href="/FOG/about">About Us</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="/FOG/carport/cart"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      <li><a href="/FOG/carport/search"><span class="glyphicon glyphicon-search"></span> Search</a></li>
      <% if (sessionUser == null || sessionUser.getRole().equals(UserRole.Visitor)) { %>
      <li><a href="/FOG/signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="/FOG/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      <%} else { %>
      <li><a href="/FOG/user/profile">Edit <%= sessionUser.getFirstName() %>!</a></li>
      <li><a href="/FOG/logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
      <%}%>
    </ul>
  </div>
</nav>