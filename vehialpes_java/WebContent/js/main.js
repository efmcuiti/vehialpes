$(document).ready(function() {
	$("#getButton").click(function() {
		$.getJSON("http://localhost:8080/Resteasy_basix/customers/helloCustomer", function(data) {
			$("#result").append(data.name);
			$("#result").append("," + data.email);
		});
	});
});