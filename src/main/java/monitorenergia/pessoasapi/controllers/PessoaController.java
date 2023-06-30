package monitorenergia.pessoasapi.controllers;

import monitorenergia.pessoasapi.dtos.PessoaDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pessoas")
public class PessoaController {

    @PostMapping
    public String novo(@RequestBody @Validated PessoaDTO pessoaDTO) {
        return "pessoa OK";
    }
}
