package com.bytatech.ayoos.client.consultation.api;

import org.springframework.cloud.openfeign.FeignClient;

import com.bytatech.ayoos.client.consultation.ConsultationClientConfiguration;

@FeignClient(name="${consultation.name:consultation}", url="${consultation.url}", configuration = ConsultationClientConfiguration.class)
public interface ConsultationQueryResourceApiClient extends ConsultationQueryResourceApi {
}