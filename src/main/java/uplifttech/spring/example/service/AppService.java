package uplifttech.spring.example.service;

import io.swagger.v3.oas.annotations.servers.Server;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import uplifttech.spring.example.model.Employee;

import static uplifttech.spring.example.util.Constants.SERVICE;
import static uplifttech.spring.example.util.Constants.WELCOME_MESSAGE;

@Service
@RequiredArgsConstructor
@Slf4j
public class AppService {
    public Employee getEmployee(String employeeId){
        log.info(WELCOME_MESSAGE + SERVICE);
        return null;
    }

}
