package monitorenergia.pessoasapi.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@ControllerAdvice
public class ErrorHandlingControllerAdvice {

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    List<String> onMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        List<String> errors = e.getFieldErrors()
                .stream()
                .map(f -> f.getField() + " " + f.getDefaultMessage())
                .toList();
        log.error(errors.toString());
        return errors;
    }
}
