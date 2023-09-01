package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Matching {
    @Id @GeneratedValue
    @Column(name="matching_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="sender_id1")
    private Sender sender1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="sender_id2")
    private Sender sender2;

    // 로직1: Matching 할 때 두명의 Sender 할당하기
    public void makeMatching(Sender sender1, Sender sender2){
        this.setSender1(sender1);
        this.setSender2(sender2);
    }
}
