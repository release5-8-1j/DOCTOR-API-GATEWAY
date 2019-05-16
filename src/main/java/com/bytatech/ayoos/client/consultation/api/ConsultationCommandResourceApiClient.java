package com.bytatech.ayoos.client.consultation.api;

import org.springframework.cloud.openfeign.FeignClient;

import com.bytatech.ayoos.client.consultation.ConsultationClientConfiguration;

@FeignClient(name="${consultation.name:consultation}", url="${consultation.url:35.243.137.225:8001/}", configuration = ConsultationClientConfiguration.class)
public interface ConsultationCommandResourceApiClient extends ConsultationCommandResourceApi {
}