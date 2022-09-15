package net.guides.springboot2.crud.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * <DESCRIPTION>.
 *
 * @author fazylzyanov@reksoft.ru
 */

@Data   //is equivalent to @Getter + @Setter + @RequiredArgsConstructor + @ToString + @EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
