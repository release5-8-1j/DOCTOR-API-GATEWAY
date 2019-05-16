package com.bytatech.ayoos.client.appointment.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.bytatech.ayoos.client.doctor.ClientConfiguration;

@FeignClient(name="${appointment.name:appointment}", url="${appointment.url:35.243.137.225:8090/}", configuration = ClientConfiguration.class)
public interface AppointmentQueryResourceApiClient extends AppointmentQueryResourceApi {
}