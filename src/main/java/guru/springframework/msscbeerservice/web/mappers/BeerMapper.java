package guru.springframework.msscbeerservice.web.mappers;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by Bernardo on 8/24/2019
 */
@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto BeerToBeerDto (Beer beer);

    Beer BeerDtoToBeer (BeerDto dto);
}
