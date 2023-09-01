package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Sender {

    @Id
    @Column(name="sender_id")
    private String id;

    @OneToMany(mappedBy="sender", cascade = CascadeType.ALL)
    private List<Archive> archive = new ArrayList<>();

    @OneToMany(mappedBy="sender", cascade = CascadeType.ALL)
    private List<Sending> sendings = new ArrayList<>();

    // 연관관계 편의 메서드
    public void addArchive(Archive data){
        archive.add(data);
        data.setSender(this);
    }
    public void addSending(Sending sending){
        sendings.add(sending);
        sending.setSender(this);
    }
}
