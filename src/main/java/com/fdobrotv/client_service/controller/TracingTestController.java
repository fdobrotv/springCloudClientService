package com.fdobrotv.client_service.controller;

import com.fdobrotv.client_service.model.Pair;
import com.fdobrotv.client_service.service.PairService;
//import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
//import org.springframework.cloud.sleuth.Tracer;
//import org.springframework.cloud.sleuth.annotation.ContinueSpan;
//import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.net.URI;
import java.time.Duration;
import java.util.List;
import java.util.Optional;

@RestController
public class TracingTestController {

    private static final Logger log = LoggerFactory.getLogger(TracingTestController.class);

    @Autowired
    private PairService pairService;

//    @Autowired
//    private Tracer tracer;

//    @Autowired
//    private DiscoveryClient discoveryClient;
//
//    @RequestMapping("/chaining")
//    @ContinueSpan
//    public Flux<Pair> chaining() {
//        log.info("active span: " + tracer.currentSpan());
//        return callWithDelay();
//    }

//    @NewSpan("chainingSomeReactive")
//    private Flux<Pair> callWithDelay() {
//        log.info("active span: " + tracer.currentSpan());
//        List<ServiceInstance> instances = discoveryClient.getInstances("gateway-service");
//        instances.forEach((ServiceInstance s) -> {
//            log.info(ToStringBuilder.reflectionToString(s));
//        });
//        Optional<ServiceInstance> firstInstantOptional = instances.stream().findFirst();
//        ServiceInstance serviceInstance = firstInstantOptional.orElseThrow(RuntimeException::new);
//        URI instanceUri = serviceInstance.getUri();
//        log.trace("instanceUri of Gateway is " + instanceUri);
//        return WebClient.create(instanceUri + "/clientService").get().uri("/byValueReactive?maxValue=1").retrieve().bodyToFlux(Pair.class).checkpoint();
//    }

//    @GetMapping("/byValueReactive")
////    @ContinueSpan
//    public Flux<Pair> byValueReactive(@RequestParam Double maxValue) {
//
//        log.debug("tracer: " + tracer);
//        log.info("active span: " + tracer.currentSpan());
//        // just a log statement to show the current context
//        log.debug("starting statement");
//
//        return pairService
//                .byValue(maxValue)
//                .delayElements(Duration.ofSeconds(1))
//                .doOnNext(r -> log.debug("found pair {} for ${}", r.getName(), r.getValue()))
//                .doOnComplete(() -> log.debug("done!"))
//                .doOnError(e -> log.error("failure", e));
//    }

}