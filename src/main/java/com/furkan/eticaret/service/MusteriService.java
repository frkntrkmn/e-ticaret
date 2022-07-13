package com.furkan.eticaret.service;

import com.furkan.eticaret.dto.request.MusteriSaveDto;
import com.furkan.eticaret.dto.response.MusteriFindAllDto;
import com.furkan.eticaret.dto.response.MusteriFindByName;
import com.furkan.eticaret.mapper.MusteriMapper;
import com.furkan.eticaret.repository.MusteriRepository;
import com.furkan.eticaret.repository.entity.Musteri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public List<MusteriFindAllDto> musteriFindAllDtos(){
        List<MusteriFindAllDto> result= new ArrayList<>();
        for(Musteri musteri: musteriRepository.findAll())
            result.add(musteriMapper.forMusteri(musteri));
    return result;
    }

    public List<MusteriFindByName> musteriFindByNames(String name){
        List<MusteriFindByName> resultname= new ArrayList<>();
        for(Musteri musteri : musteriRepository.findByNameLike(name))
            resultname.add(musteriMapper.forNameMusteri(musteri));
            return resultname;
    }


    public void delete(long id){
        musteriRepository.deleteById(id);
    }

}
