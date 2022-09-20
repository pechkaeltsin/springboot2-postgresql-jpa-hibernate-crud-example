package net.guides.springboot2.crud.swagger;

import io.swagger.annotations.*;

/**
 * <DESCRIPTION>.
 *
 * @author fazylzyanov@reksoft.ru
 */

@SwaggerDefinition(
        info = @Info(
                description = "Some description",
                version = "1.0",
                title = "Title",
                contact = @Contact(
                        name = "Timur",
                        email = "some@emai;.com",
                        url = "https://www.someurl.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "http://www.apache.org/licenses/LICENSE-2.0"
                )
        ),
        consumes = {"application/json", "application/xml"},
        produces = {"application/json", "application/xml"},
        schemes = {SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS},
        externalDocs = @ExternalDocs(value = "Read This For Sure", url = "http://in28minutes.com")
)

public interface ApiDocumentationConfig {
}
