package uplifttech.spring.example.api;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uplifttech.spring.example.model.ResponseDto;
import org.springframework.http.ResponseEntity;



@RequestMapping("/api")
public interface AppApi {

    @GetMapping(value = "/employee/{employeeId}")

    ResponseEntity<ResponseDto> getEmployee(@Parameter(in = ParameterIn.PATH,description = "employee id",required = true) String employeeId);

}
