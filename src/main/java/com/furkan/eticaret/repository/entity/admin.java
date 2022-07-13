package com.furkan.eticaret.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@Table(name = "tbladmin")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String name;
    String surname;

}
