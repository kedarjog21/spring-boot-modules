package uplifttech.spring.example.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import uplifttech.spring.example.api.AppApi;
import uplifttech.spring.example.model.ResponseDto;
import uplifttech.spring.example.service.AppService;

import static uplifttech.spring.example.util.Constants.CONTROLLER;
import static uplifttech.spring.example.util.Constants.WELCOME_MESSAGE;

@Controller
@Slf4j
@RequiredArgsConstructor
public class AppController implements AppApi {

    private final AppService appService;
    @Override
    public ResponseEntity<ResponseDto> getEmployee(String employeeId) {
        log.info(WELCOME_MESSAGE + CONTROLLER);
        appService.getEmployee(employeeId);
        return null;
    }
}
