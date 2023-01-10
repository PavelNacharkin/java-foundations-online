package ru.itsjava.iostreams.hw;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class User implements Serializable {

    private transient String login;
    private transient String password;

}
