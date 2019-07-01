package com.bytatech.ayoos.client.doctor.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.bytatech.ayoos.client.doctor.ClientConfiguration;

@FeignClient(name="${doctor.name:doctor}", url="${doctor.url:35.184.100.236:7070/}", configuration = ClientConfiguration.class)
public interface AccountResourceApiClient extends AccountResourceApi {
}