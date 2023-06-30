package monitorenergia.pessoasapi.config;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.format.DateTimeFormatter;

@Configuration
public class GlobalConfig {

    @Bean
    public Jackson2ObjectMapperBuilderCustomizer jsonCustomizer() {
        return builder -> {
            final String dateTimePattern = "dd/MM/yyyy HH:mm:ss";
            final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateTimePattern);
            builder
                    .simpleDateFormat(dateTimePattern)
                    .serializers(new LocalDateSerializer(dateFormatter), new LocalDateTimeSerializer(dateTimeFormatter))
                    .deserializers(new LocalDateDeserializer(dateFormatter), new LocalDateTimeDeserializer(dateTimeFormatter));
        };
    }
}
