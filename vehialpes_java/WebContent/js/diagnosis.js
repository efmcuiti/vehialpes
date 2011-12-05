$(document).ready(function() {
	// What appointment is being attended.
	var idAppointment = sessionStorage.idAppointment;
	var idVehicle = sessionStorage.idVehicle;
	
	// Preparing data.
	$('#manteinanceDetail').hide();
	$('#moreManteinance').click(function() {
		$('#manteinanceDetail').toggle('slow');
	});
});