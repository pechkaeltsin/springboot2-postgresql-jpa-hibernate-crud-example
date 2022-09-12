package net.guides.springboot2.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

/**
 * <DESCRIPTION>.
 *
 * @author fazylzyanov@reksoft.ru
 */

@Data   //is equivalent to @Getter + @Setter + @RequiredArgsConstructor + @ToString + @EqualsAndHashCode
@AllArgsConstructor
public class Employee {
    private @Getter @Setter long id;
    private @Getter @Setter String firstName;
    private @Getter @Setter String lastName;
    private @Getter @Setter String emailId;
}
