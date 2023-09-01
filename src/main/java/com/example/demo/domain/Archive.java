package com.example.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Entity
@Getter @Setter
public class Archive {

    @Id
    @GeneratedValue
    @Column(name="data_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="sender_id")
    private Sender sender;

    private String img_mine;

    private String img_matched;

    @Embedded
    private Point location;
}
