<%-- 
    Document   : Product
    Created on : Jan 11, 2021, 3:58:26 PM
    Author     : phuch_cqzh776
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome, ${sessionScope.USERNAME}</h1>
        
        <h3>List Product</h3>
        
       <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Group</th>
                    <th>Phone Number</th>
                    <th>Operations</th>
                </tr>
            </thead>
            <tbody>
                <s:iterator value="listProduct" status="dto">

                    <tr>

                        <td>
                            <s:property value="%{id}"/>
                        </td>
                        <td>
                            <s:property value="%{firstName}"/>
                        </td>
                        <td>
                            <s:property value="%{lastName}"/>
                        </td>
                        <td>
                            <s:property value="%{groupName}"/>
                        </td>
                        <td>
                            <s:property value="%{phone}"/>
                        </td>
                        <td>
                            
                            <s:a href="editcontact?id=%{id}">Edit</s:a>
                            <s:a href="deletecontact?id=%{id}">Remove</s:a>
                        </td>


                    </tr>

                </s:iterator>
            </tbody>
        </table>
        
        
        
    </body>
</html>
