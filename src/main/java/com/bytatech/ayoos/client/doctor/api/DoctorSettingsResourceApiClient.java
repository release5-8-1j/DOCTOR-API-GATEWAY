package com.bytatech.ayoos.client.doctor.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.bytatech.ayoos.client.doctor.ClientConfiguration;

@FeignClient(name="${doctor.name:doctor}", url="${doctor.url:35.229.27.47:8083/}", configuration = ClientConfiguration.class)
public interface DoctorSettingsResourceApiClient extends DoctorSettingsResourceApi {
}