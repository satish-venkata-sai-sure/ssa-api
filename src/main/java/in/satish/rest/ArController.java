package in.satish.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.satish.service.ArService;

@RestController
public class ArController {

	@Autowired
	private ArService arService;
	
	@GetMapping("getstate/{ssn}")
	public ResponseEntity<String> sendState(@PathVariable Integer ssn ){
		
		String state = arService.sendState(ssn);
		return new ResponseEntity<>(state,HttpStatus.OK);
		
	}
}
