package org.itstep.one_to_one_bi;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "person",uniqueConstraints=@UniqueConstraint(columnNames={"first_name", "last_name"}))

public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    //Нельзя добавлять одного и того же человека
    //нельзя, чтобы у одного человека было несколько паспортов и наоборот

    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
    private Passport passport;

    @Override
    public String toString() {
        return "Person [id=" + id + ", firstName=" + firstName + "]\n" + "\tPassport [id=" + id + ", number=" + passport.getNumber() + "]";
    }
}


