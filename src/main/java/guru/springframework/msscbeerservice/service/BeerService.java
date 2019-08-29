package guru.springframework.msscbeerservice.service;

import guru.springframework.msscbeerservice.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by Bernardo on 8/29/2019
 */
public interface BeerService {
    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
