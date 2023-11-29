package com.brong90s.wikimedia.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brong90s.wikimedia.producer.stream.WikimediaStreamConsumer;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/wikimedia")
@RequiredArgsConstructor
public class WikimediaController {
    private final WikimediaStreamConsumer wikimediaStreamConsumer;

    @GetMapping
    public void startPublishing() {
        wikimediaStreamConsumer.consumeStreamAndPublish();
    }
}
