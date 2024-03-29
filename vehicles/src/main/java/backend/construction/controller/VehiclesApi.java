package backend.construction.controller;


import backend.construction.DAO.Vehicles;
import backend.construction.service.VehiclesService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;
import java.time.ZonedDateTime;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/vehicles")
public class VehiclesApi {

    @Autowired
    VehiclesService vehiclesService;

    HttpClientInstance httpClientInstance;

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody Vehicles request){
        Vehicles responseEmp = vehiclesService.create(request);
//        Employee response = new Employee();
//        modelMapper.map(responseEmp, response);
        return ResponseEntity.ok(responseEmp);

    }

    @GetMapping
    public ResponseEntity<Object> getAll(){
//        WebClient.UriSpec<WebClient.RequestBodySpec> uriSpec = HttpClientInstance.client.method(HttpMethod.POST);
//        WebClient.RequestBodySpec bodySpec = uriSpec.uri("/employee");
//        WebClient.RequestHeadersSpec<?> headersSpec = bodySpec.bodyValue("data");
//        WebClient.ResponseSpec responseSpec = headersSpec.header(
//                        HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
//                .accept(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML)
//                .acceptCharset(StandardCharsets.UTF_8)
//                .ifNoneMatch("*")
//                .ifModifiedSince(ZonedDateTime.now())
//                .retrieve();
//        Mono<String> response = headersSpec.retrieve()
//                .bodyToMono(String.class);
//        System.out.println("Response of employeee" + response);
        List<Vehicles> employees = vehiclesService.getAll();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/getById")
    public ResponseEntity<Object> getById(@PathVariable Long id){
        Vehicles employee = vehiclesService.getById(id);
        return ResponseEntity.ok(employee);
    }
}
