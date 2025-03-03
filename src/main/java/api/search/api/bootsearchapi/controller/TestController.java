package api.search.api.bootsearchapi.controller;

import api.search.api.bootsearchapi.service.GoogleSearchApiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Slf4j
@RequiredArgsConstructor
public class TestController {

    private final GoogleSearchApiService googleSearchApiService;

    @GetMapping("/google/{text}")
    public Map<String, Object> test(@PathVariable String text) {
       return googleSearchApiService.search(text);
    }


}
