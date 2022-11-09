package com.programminglanguagesworkspace.api.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "technologies")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String name;
    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;
}
