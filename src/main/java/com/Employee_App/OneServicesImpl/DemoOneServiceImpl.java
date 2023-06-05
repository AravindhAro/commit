package com.Employee_App.OneServicesImpl;



import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import com.Employee_App.OneServices.DemoOneService;
import com.Employee_App.dto.FormDto;


@Service
public class DemoOneServiceImpl implements DemoOneService {
	


	@Override
	public String view(String name) {
		RestTemplate restTemplate=new RestTemplate();
		 String endpointUrl = "http://localhost:8081/hello";
	        String response = restTemplate.postForObject(endpointUrl, name, String.class);
	        return response;
	}

	@Override
	public String save(FormDto formDto) {
		RestTemplate restTemplate=new RestTemplate();
		 String endpointUrl = "http://localhost:8081/hi";
	        String response = restTemplate.postForObject(endpointUrl, formDto, String.class);
	        return response;
	}

	@Override
	public String viewByName(String name) {
	    RestTemplate restTemplate = new RestTemplate();
	    String endpointUrl = "http://localhost:8081/view?name=" + name;
	    String response = restTemplate.getForObject(endpointUrl, String.class);
	    return response;
	}

}
