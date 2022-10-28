package com.example.springcloudserverless1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String status;

}
