package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Sending {
    @Id
    @GeneratedValue
    @Column(name="sending_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="sender_id")
    private Sender sender;

    @Embedded
    private Point location;

    private String img;

    @Enumerated(EnumType.STRING)
    private SendingStatus status; // READY, MATCHED
}
