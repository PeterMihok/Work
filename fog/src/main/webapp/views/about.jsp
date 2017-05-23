<%-- 
    Document   : login
    Created on : Apr 6, 2017, 11:39:25 AM
    Author     : petermihok
--%>

<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <% HashMap<String, String> errors = (HashMap<String, String>) request.getAttribute("errors"); %>

<html>
<head>
  <title>Login Page</title>
  
  <%@include file="/views/partial/header.jsp" %>

</head>

<body>

  <%@include file="/views/partial/nav.jsp" %>

  <div class="form">
      
      <div class="tab-content">
        <div id="login">   
          <h1>About Fog</h1>
          Primarly based in the north of Zealand, Johannes Fog provides expert guidance
          in the building of carports'. Come visit us within our headquarter in Lyngby 
          for ideas in design or to consult with our staff in person. You can also
          use our new web-page to design your own dream carport.</br>
          <u>Information</u></br>
          Phone: 555-55555</br>
          Email: Fog@contact.us
        </div>
        
      </div><!-- tab-content -->
      
</div> <!-- /form -->
  <!--<script src='/js/index.js'></script>-->
</html>

