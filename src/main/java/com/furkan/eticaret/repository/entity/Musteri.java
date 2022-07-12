package com.furkan.eticaret.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="tblmusteri")
public class Musteri {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long ıd;
    String name;
    String surname;
    String email;

}
