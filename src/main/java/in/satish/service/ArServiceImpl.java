package in.satish.service;

import org.springframework.stereotype.Service;

@Service
public class ArServiceImpl implements ArService {

	@Override
	public String sendState(Integer ssn) {
		// TODO Auto-generated method stub
		
		String ssnNo = ssn+"";
		String sno=ssnNo.charAt(0)+"";
		
		switch(sno) {
		case "1":
			return "Ohio";
		case "2":
			return "NewYork";
		case "3":
			return "WashingTon";
		case "4":
			return "Dallas";
		case "5":
			return "varginia";
		case "6":
			return "NewJersey";
		default:
			return "Invalid ssn";
		}
		
	}

	
}
