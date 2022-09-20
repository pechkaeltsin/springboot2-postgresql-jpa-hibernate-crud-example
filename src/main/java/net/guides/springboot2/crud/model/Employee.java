package net.guides.springboot2.crud.model;

import lombok.*;

import javax.persistence.*;

/**
 * <DESCRIPTION>.
 *
 * @author fazylzyanov@reksoft.ru
 */

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "firstname")
    private String firstName;
    @Column (name = "lastname")
    private String lastName;
    @Column (name = "emailid")
    private String emailId;
}
