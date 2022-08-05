package com.alkemy.alkemy.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name="genre")
@Getter
@Setter

public class genreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String image;

    @Column(name="movies_or_series_associated")

    private String moviesOrSeriesAssociated;

}
