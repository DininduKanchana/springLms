<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Spring MVC</title>
        <link rel="stylesheet" href="<c:url value="/assets/css/foundation.css"/>" />
        <script src="<c:url value="/assets/js/vendor/modernizr.js"/>"></script>

    </head>
    <body>
        <div class="contain-to-grid sticky">
            <nav class="top-bar" data-topbar role="navigation">
                <ul class="title-area">
                    <li class="name"><h1>
                            <a href="<c:url value="/home"/>">Depan</a>
                        </h1></li>
                    <li class="toggle-topbar menu-icon"><a href="#"><span>Menu</span></a></li>
                </ul>
                <section class="top-bar-section">
                    <ul class="right">
                        <li class="has-dropdown"><a href="<c:url value="#"/>">student</a>
                            <ul class="dropdown">
                                <li><a href="<c:url value="/home/daftar"/>">Daftar student</a></li>
                                <li><a href="<c:url value="/home/insert"/>">Input student</a></li>
                            </ul>
                        </li>                          
                    </ul>
                </section>
            </nav>
        </div>
        <div class="row">
            <div class="large-12 column">
            Session id :${studentId}
                <h3>Daftar student</h3>
                <a href="<c:url value="/home/insert"/>" class="button tiny">Insert</a>
                <table style="width: 600px">
                    <thead>
                        <tr>
                        	 <th>Id</th>
                            <th>Name</th>
                            <th>email</th>
                            <th>password</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${students}" var="student">
                            <tr>
                                <td>${student.id}</td>
                                <td>${student.name}</td>
                                <td>${student.email}</td>
                                <td>${student.password}</td>
                                
                                
                                <td>
                                    <a class="alert label" href="<c:url value="/home/delete?id=${student.id}"/>">Del</a>
                                    <a class="success label" href="<c:url value="/home/edit?id=${student.id}"/>">Edit</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <script src="<c:url value="/assets/js/vendor/jquery.js"/>"></script>
        <script src="<c:url value="/assets/js/foundation.min.js"/>"></script>
        <script>
            $(document).foundation();
        </script>
    </body>
</html>