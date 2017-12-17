package mum.edu.domain;

import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @NotEmpty
    @Column(name = "studentId")
    private String studentId;
    @NotEmpty
    @NotNull
    @Column(name = "firstName")
    private String firstName;
    @NotEmpty
    @NotNull
    @Column(name = "lastName")
    private String lastName;
    @NotEmpty
    @NotNull
    @Column(name = "email")
    private String email;
    @NotNull
    @Embedded
    private Address studentAddress;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "student_id")
    private List<TMCheckingReport> _TmCheckings;
    
    
    public List<TMCheckingReport> getTmCheckings() {
        return _TmCheckings;
    }

    public Student(){
        
    }
    
    public void setTmCheckings(List<TMCheckingReport> tmCheckings) {
        _TmCheckings = tmCheckings;
    }


    public Long getId() {
        return id;
    }

    public String getStudentId() {
        return studentId;
    }

    public Address getStudentAddress() {
        return studentAddress;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentId='" + studentId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", studentAddress=" + studentAddress +
                ", gender=" + gender +
                ", _TmCheckings=" + _TmCheckings +
                '}';
    }
}
