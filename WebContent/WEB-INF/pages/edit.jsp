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
                                <li><a href="<c:url value="/home/list"/>">Daftar student</a></li>
                                <li><a href="<c:url value="/home/insert"/>">Input student</a></li>
                            </ul>
                        </li>                          
                    </ul>
                </section>
            </nav>
        </div>
        <div class="row">
            <div class="large-6 column">
                <h4>Insert student</h4>
                <form action="<c:url value="/home/update"/>" method="post">
                    <p>Id : <input type="text" name="id" value="${student.id}"/></p>
                    <p>Nama : <input type="text" name="nama" value="${student.name}"/></p>
                    <p>Harga : <input type="text" name="harga" value="${student.email}"/></p>
                    <p>Keterangan : <input type="text" name="keterangan" value="${student.password}"/></p> 
                    
                    <p><input type="submit" value="Update" class="button tiny"/></p>
                </form>
            </div>
        </div>

        <script src="<c:url value="/assets/js/vendor/jquery.js"/>"></script>
        <script src="<c:url value="/assets/js/foundation.min.js"/>"></script>
        <script>
            $(document).foundation();
        </script>
    </body>
</html>