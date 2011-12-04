$(document).ready(function() {
	// What workshop is logged in.
	sessionStorage.idWorkshop=1;

	// Hiding appointments details.
	$('.appointmentDetailDiv').hide();
	
	$('.moreLink').click(function() {
		$('.appointmentDetailDiv').toggle('slow');
		alert(sessionStorage.idWorkshop);
	});
	
	// Getting all the appointments for the actual workshop.
	$.getJSON("http://localhost:8080/vehialpes_java/vehialpes/appointments/" + sessionStorage.idWorkshop, function(data) {
		$.each(data, function(i, d) {
			alert(d.fecha);
		});
	});
	
	// Invoking POST method of a REST service.
	$('.attendLink').click(function() {
		$.ajax({
        	type: "POST",
        	url: "http://vehialpes.lubrigras.net/api/v1/ciudad/",
        	dataType: "jsonp",
        	crossDomain: true,
        	data: '{"nombre":"Zipaquira"}',
        	beforeSend: function(xhr) {
				xhr.setRequestHeader("Authentication", "Basic " + encodeURIComponent("daniel" + ":" + "ejes") )
			},
			sucess: function(result) {
				alert('done');
			}
    	});
	});
	
	$("#getButton").click(function() {
		$.getJSON("http://localhost:8080/Resteasy_basix/customers/helloCustomer", function(data) {
			$("#result").append(data.name);
			$("#result").append("," + data.email);
		});
	});
});