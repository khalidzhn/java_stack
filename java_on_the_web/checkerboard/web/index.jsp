<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 11/6/2019
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>T</title>
    <style type="text/css">
      .container{
        width: 100px;
        height: 100px;

      }
      .square1{
        margin: 0px;
        padding: 0px;
        display: inline-block;
        width: 30px;
        height: 30px;
        background-color:black;
      }
      .square2{
        margin: 0px;
        padding: 0px;
        display: inline-block;
        width: 30px;
        height: 30px;
        background-color:red;
      }
    </style>
  </head>

  <body>
  <table>

    <%for(int i=0; i<= Integer.parseInt(request.getParameter("j"));i++){%>
    <tr>
        <%for(int j=0; j<= Integer.parseInt(request.getParameter("i"));j++){%>

      <td class="square<%=(j+i)%2 +1%>"></td>
        <%}%>
    </tr>
      <%}%>

  </table>  </body>
</html>
