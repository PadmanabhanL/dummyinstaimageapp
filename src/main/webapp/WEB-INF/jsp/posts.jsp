<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.app.bo.Post" %>
<%@ page import="com.app.bo.Attachment" %>

<html>
<head>
    <title>Post Attachments</title>
</head>
<body>
<%
    List<Post> posts = (List<Post>) session.getAttribute("posts");
%>

<table border="1">
    <%
        if (posts != null) {
            for (Post post : posts) {
                List<Attachment> attachments = post.getAttachments();
                if (attachments != null && !attachments.isEmpty()) {
    %>
    <tr>
        <%
            for (Attachment attachment : attachments) {
        %>
        <td>
            <img src="<%= attachment.getFileUrl() %>" alt="Image" width="100" height="100"/>
        </td>
        <%
            }
        %>
    </tr>
    <%
                }
            }
        }
    %>
</table>
</body>
</html>
