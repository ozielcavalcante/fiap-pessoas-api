package monitorenergia.pessoasapi.dtos;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record PessoaDTO(
        @NotBlank String nome,
        @NotNull @Past LocalDate dataNascimento,
        String sexo,
        String parentesco
) {
}
