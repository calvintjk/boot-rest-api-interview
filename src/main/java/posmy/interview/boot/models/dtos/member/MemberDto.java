package posmy.interview.boot.models.dtos.member;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MemberDto {
    @NotNull
    @JsonProperty(value = "firstName")
    private String firstName;

    @NotNull
    @JsonProperty(value = "lastName")
    private String lastName;

    @NotNull
    @JsonProperty(value = "phone")
    private String phone;

    @NotNull
    @JsonProperty(value = "email")
    private String email;

    @NotNull
    @JsonProperty(value = "userRole")
    private UserRole userRole;

    public MemberDto() {}

    public MemberDto(String firstName, String lastName, String phone, String email, UserRole userRole) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.userRole = userRole;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}
