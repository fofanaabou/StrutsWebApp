<%@page language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html locale="true">
    <head>
        <title>Authentication</title>
        <html:base/>
    </head>
<body>
<html:form action="login" focus="username">
    <table border="0" align="center">
        <tr>
            <td>User Name:</td>
            <td align="left">
                <html:text property="username" size="20" maxlength="20"/>
            </td>
        </tr>
        <tr>
            <td align="right">Password:</td>
            <td align="left">
                <html:password property="password" size="20" maxlength="20" redisplay="false"/>
            </td>
        </tr>
        <tr>
            <td align="right">
                <html:submit property="submit" value="submit"/>
            </td>

            <td align="left">
                <html:reset/>
            </td>
        </tr>
    </table>
</html:form>
</body>
</html:html>
