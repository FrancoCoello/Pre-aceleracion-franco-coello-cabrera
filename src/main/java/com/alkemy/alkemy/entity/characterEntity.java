package com.alkemy.alkemy.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="character")
@Getter
@Setter

public class characterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String image;

    private Long age;

    private Float weight;

    private String history;

    @ManyToMany(mappedBy = "characters", cascade = CascadeType.ALL)
    private List<moviesOrSeriesEntity> moviesOrSeriesEntities = new ArrayList<>();

    @Column(name="movies_or_series_associated")
    private String moviesOrSeriesAssociated;
}
