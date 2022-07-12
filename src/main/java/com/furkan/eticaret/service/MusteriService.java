package com.furkan.eticaret.service;

import com.furkan.eticaret.dto.request.MusteriSaveDto;
import com.furkan.eticaret.mapper.MusteriMapper;
import com.furkan.eticaret.repository.MusteriRepository;
import com.furkan.eticaret.repository.entity.Musteri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusteriService {
    @Autowired
    MusteriRepository musteriRepository;
    @Autowired
    MusteriMapper musteriMapper;
    public void save(MusteriSaveDto saveDto){
        Musteri musteri= musteriMapper.toSaveMusteri(saveDto);
        musteriRepository.save(musteri);

    }
}
