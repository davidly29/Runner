package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "championsmid")
public class Champion {
    @Id
    private String name;
    private String role;
    private String att;

}
