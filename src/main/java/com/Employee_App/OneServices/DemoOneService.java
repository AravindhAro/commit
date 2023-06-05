package com.Employee_App.OneServices;

import com.Employee_App.dto.CommonDto;
import com.Employee_App.dto.FormDto;

public interface DemoOneService {

	

	String view(String name);

	String save(FormDto formDto);

	String viewByName(String name);

}
