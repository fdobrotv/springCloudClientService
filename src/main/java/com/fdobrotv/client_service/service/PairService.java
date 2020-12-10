package com.fdobrotv.client_service.service;

import com.fdobrotv.client_service.model.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class PairService {

    private static final Logger logger = LoggerFactory.getLogger(PairService.class);

    Pair[] data = {Pair.of("First", 1), Pair.of("Second", 2)};

    @NewSpan("byValueReactive")
    public Flux<Pair> byValue(Double maxValue) {
        logger.debug("inside byValue Reactive");
        return Flux.fromArray(data).filter(pair -> pair.getValue() > maxValue);
    }
}