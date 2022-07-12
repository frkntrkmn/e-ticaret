package com.furkan.eticaret.repository;

import com.furkan.eticaret.repository.entity.Musteri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusteriRepository extends JpaRepository<Musteri,Long> {

    List<Musteri> findByNameLike(String name);
}
