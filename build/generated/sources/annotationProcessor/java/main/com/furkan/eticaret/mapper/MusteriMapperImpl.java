package com.furkan.eticaret.mapper;

import com.furkan.eticaret.dto.request.MusteriSaveDto;
import com.furkan.eticaret.dto.response.MusteriFindAllDto;
import com.furkan.eticaret.dto.response.MusteriFindByName;
import com.furkan.eticaret.dto.response.MusteriFindBySurname;
import com.furkan.eticaret.repository.entity.Musteri;
import com.furkan.eticaret.repository.entity.Musteri.MusteriBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-12T22:51:50+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.15 (JetBrains s.r.o.)"
)
@Component
public class MusteriMapperImpl implements MusteriMapper {

    @Override
    public Musteri toSaveMusteri(MusteriSaveDto musteriSaveDto) {
        if ( musteriSaveDto == null ) {
            return null;
        }

        MusteriBuilder musteri = Musteri.builder();

        musteri.name( musteriSaveDto.getName() );
        musteri.surname( musteriSaveDto.getSurname() );
        musteri.email( musteriSaveDto.getEmail() );
        musteri.number( musteriSaveDto.getNumber() );

        return musteri.build();
    }

    @Override
    public MusteriFindAllDto forMusteri(Musteri musteri) {
        if ( musteri == null ) {
            return null;
        }

        MusteriFindAllDto musteriFindAllDto = new MusteriFindAllDto();

        musteriFindAllDto.setName( musteri.getName() );
        musteriFindAllDto.setSurname( musteri.getSurname() );
        musteriFindAllDto.setNumber( musteri.getNumber() );
        musteriFindAllDto.setEmail( musteri.getEmail() );

        return musteriFindAllDto;
    }

    @Override
    public MusteriFindByName forNameMusteri(Musteri musteri) {
        if ( musteri == null ) {
            return null;
        }

        MusteriFindByName musteriFindByName = new MusteriFindByName();

        musteriFindByName.setName( musteri.getName() );

        return musteriFindByName;
    }

    @Override
    public MusteriFindBySurname forSurnameMusteri(Musteri musteri) {
        if ( musteri == null ) {
            return null;
        }

        MusteriFindBySurname musteriFindBySurname = new MusteriFindBySurname();

        musteriFindBySurname.setSurname( musteri.getSurname() );

        return musteriFindBySurname;
    }
}
