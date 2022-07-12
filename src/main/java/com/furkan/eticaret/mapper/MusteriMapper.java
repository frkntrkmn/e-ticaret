package com.furkan.eticaret.mapper;

import com.furkan.eticaret.dto.request.MusteriSaveDto;
import com.furkan.eticaret.dto.response.MusteriFindAllDto;
import com.furkan.eticaret.dto.response.MusteriFindByName;
import com.furkan.eticaret.dto.response.MusteriFindBySurname;
import com.furkan.eticaret.repository.entity.Musteri;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import javax.swing.*;
import java.util.function.UnaryOperator;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface MusteriMapper {
    Musteri toSaveMusteri(final MusteriSaveDto musteriSaveDto);
    MusteriFindAllDto forMusteri(final Musteri musteri);
    MusteriFindByName forNameMusteri(final Musteri musteri);
    MusteriFindBySurname forSurnameMusteri(final Musteri musteri);
}
