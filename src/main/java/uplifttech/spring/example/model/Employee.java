package uplifttech.spring.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class Employee {
    @JsonProperty("id")
    int id;

    @JsonProperty("firstname")
    String firstName;

    @JsonProperty("lastname")
    String lastName;
}
