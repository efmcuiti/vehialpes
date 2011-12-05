$(document).ready(function() {
	// Store the template with a key-name and use it later
	$.template('appo-tmpl', $('#appointmentsTemplate'));
	
	// All links that toggles the appointment's detail.
	var mores = $('.moreLink');
	// All of the appointment's detail.
	var details = $('.appointmentDetailDiv');
	// All links that re-directs to the attend window.
	var attends = $('.attendLink');

	// What workshop is logged in.
	sessionStorage.idWorkshop=1;
	sessionStorage.idAppointment=-1;
	sessionStorage.idVehicle=-1;

	// Getting all the appointments for the actual workshop.
	$.getJSON("http://localhost:8080/vehialpes_java/vehialpes/appointments/" + sessionStorage.idWorkshop, function(data) {
		$.tmpl('appo-tmpl', data).appendTo('#bodyContent');
		mores = $('.moreLink');
		details = $('.appointmentDetailDiv');
		$.each(details, function(i, d) {
			$(d).hide();
		});
		
		// Building the dates to show.
		var dates = $('.dateDetailValue');
		$.each(dates, function(i, dt) {
			var date = $(dt).text();
			$(dt).text('');
			var nDate = new Date(date);
			$(dt).datepicker({dateFormat: 'isoDateTime', defaultDate: nDate, disabled: true});
		});
		
		// Loading all the links to be attended.
		attends = $('.attendLink');
	});

	// Every time a "more" link is clicked, its corresponging detail div shall be toggled.
	mores.live('click', function(event) {
		var id = $(this).data('id');
		$('#appointmentDetail' + id).toggle('slow');
	});
	
	// Every time a "attend" link is clicked, its corresponding appointment shall be attached to work with.
	attends.live('click', function(event) {
		var idAppointment = $(this).data('id');
		var idVehicle = $(this).data('vehicle');
		if (idAppointment != null) {
			sessionStorage.idAppointment = idAppointment;
		}
		if (idVehicle != null) {
			sessionStorage.idVehicle = idVehicle;
		}
		window.location.replace('./diagnostic.html');
	});
});