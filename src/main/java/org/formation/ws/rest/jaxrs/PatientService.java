package org.formation.ws.rest.jaxrs;

import java.util.Collection;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

// on annotera l'interface 

@Produces({"application/xml", "application/json"})

public interface PatientService {
	// le CRUD
	// les methodes annotées ne seront appelées que par la methodes annotée

	@GET
	@Path("/patients/{id}/")
	Patient getPatient(@PathParam("id") String id);

	@GET // le end point: http://host/projet/services/patients
	@Path("/patients/")
	Collection<Patient> getAllPatients();

	@PUT
	@Path("/patients/")
	
	Response updatePatient(Patient patient);

	@POST
	@Path("/patients/")
	Response addPatient(Patient patient);

	@DELETE
	@Path("/patients/{id}/")
	Response deletePatients(@PathParam("id") String id);

	
	
	@Path("/prescription/{id}/")
	Prescription getPrescription(@PathParam("id") String prescriptionId);

}