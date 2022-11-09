package com.programminglanguagesworkspace.api.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "languages")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String name;
    @OneToMany(mappedBy = "language")
    private List<Technology> technologyList;
}
