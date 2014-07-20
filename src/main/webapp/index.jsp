<html>
<script type="text/javascript" src="lib/jquery.js"></script>
<body>
	<h2>Demo Text!</h2>

	demo input:	<input id="int" type="text"><input type="button" value="submit" onclick="demoClick()">	<br>
	demo change:<input id="out" type="text">

	<script type="text/javascript">
		var demoClick = function(){
			var i = $("#int").val();
			if(i.trim()==""){
				$("#int").focus();
				alert("please input something");
				return;
			}
			$.getJSON("demo/"+i+" /", function(data){
				$("#out").val(data.context);
			});
		};
	</script>
</body>
</html>
