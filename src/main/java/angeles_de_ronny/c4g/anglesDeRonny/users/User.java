package angeles_de_ronny.c4g.anglesDeRonny.users;
import javax.validation.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    @Email(message = "Email should be valid")
    private String email;
    @Size(min = 8, max = 8, message = " DNI must be 8 characters only")
    private Integer dni;

    public User(){ }

    public User(String name, String surname, @Email(message = "Email should be valid") String email, @Size(min = 8, max = 8, message = " DNI must be 8 characters only") Integer dni) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }
}
