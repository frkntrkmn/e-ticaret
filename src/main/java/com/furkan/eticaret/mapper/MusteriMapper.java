package com.furkan.eticaret.mapper;

import com.furkan.eticaret.dto.request.MusteriDeleteDto;
import com.furkan.eticaret.dto.request.MusteriSaveDto;
import com.furkan.eticaret.dto.response.MusteriFindAllDto;
import com.furkan.eticaret.dto.response.MusteriFindByName;
import com.furkan.eticaret.repository.entity.Musteri;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface MusteriMapper {
    Musteri toSaveMusteri(final MusteriSaveDto musteriSaveDto);
    Musteri toDeleteMusteri(final MusteriDeleteDto musteriDeleteDto);


    MusteriFindAllDto forMusteri(final Musteri musteri);
    MusteriFindByName forNameMusteri(final Musteri musteri);
}
