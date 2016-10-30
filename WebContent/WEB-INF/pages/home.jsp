<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Student-Home</title>
        <link rel="stylesheet" href="<c:url value="/assets/css/foundation.css"/>" />
        <script src="<c:url value="/assets/js/vendor/modernizr.js"/>"></script>
         <script src="<c:url value="/assets/js/vendor/jquery.js"/>"></script>
        <script src="<c:url value="/assets/js/foundation.min.js"/>"></script>
        <script src="<c:url value="/assets/js/jquery.countdown.min.js"/>"></script>
        
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
            <div class="large-6 column">
            <h2>Assignments</h2>
            <div>
            Up-Comming...
				<table style="width: 600px">
                    <thead>
                        <tr>
                        	 <th>Subject Code</th>
                            <th>Date & Time</th>
                            <th>Description</th>
                            <th>Time Remaining</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${assignment}" var="assignment">
                            <tr>
                                <td>${assignment.subject_id}</td>
                                <td>${assignment.time}</td>
                                <td>${assignment.discription}</td>
                                <td id="data-countdown" data-countdown="${assignment.time}"> 
                               
                               </td>
                                    
                                
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
	            </div>
	            <div>Assignment Marks</div>
	            
                
            </div>
        </div>



       
        
        <script>
            $(document).foundation();
            $('[data-countdown]').each(function() {
            	  var $this = $(this), finalDate = $(this).data('countdown');
            	  $this.countdown(finalDate, function(event) {
            	    $this.html(event.strftime('%D days %H:%M:%S'));
            	  });
            	});
           
         </script>
         
           
       
        
    </body>
</html>