package com.grupo3.api.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class ComicService implements IComic{

    @Value("${api.comic.url}")
    private String apiUrl;

    @Value("${api.ts.key}")
    private String apiTs;

    @Value("${api.public.key}")
    private String apiKey;

    @Value("${api.hash.key}")
    private String apiHash;

    @Override
    public String getComics() {
        RestTemplate client = new RestTemplate();
        String url = apiUrl + "?ts=" + apiTs + "&apikey=" + apiKey + "&hash=" + apiHash + "&format=comic&formatType=comicts=1";
        String response = client.getForObject(url, String.class);
        return response;
    }
}
