package com.oomololu.pubreg.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Publisher {
    @Id
    private String id;
    @NotBlank
    private String name;
    @NotBlank
    private String email;
    private Integer published;

    // required for test
    public Publisher(String name, String email, Integer published) {
        this.name = name;
        this.email = email;
        this.published = published;
    }
}
