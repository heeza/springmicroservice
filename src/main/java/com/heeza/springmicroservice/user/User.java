package com.heeza.springmicroservice.user;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class User {
    private Integer id;

    @Size(min=2, message = "Name should have atleast 2 characters")
    private String name;

    @Past(message = "생일은 미래 날짜일 수 없습니다.")
    private LocalDate birthDate;

    public User(int id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }
}
