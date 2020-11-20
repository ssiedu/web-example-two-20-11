<%@page isELIgnored="false" %>
<html>
<body>
	<h3>Cylinder-Details</h3>
	<hr>
	<pre>
		Radius	${info.radius}
		Height	${info.height}
		Area	${info.area}
		Volume	${info.volume}
	</pre>
	<hr>
	Code By : ${codeinfo.author} from ${codeinfo.company}<br>
	<hr>
	<a href="input">Compute-More</a>
</body>
</html>