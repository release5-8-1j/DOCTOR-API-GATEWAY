/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.client.doctor.api;

import java.util.List;
import com.bytatech.ayoos.client.doctor.model.PaymentSettings;
import com.bytatech.ayoos.client.doctor.model.PaymentSettingsDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-06T16:36:02.760+05:30[Asia/Calcutta]")

@Api(value = "PaymentSettingsResource", description = "the PaymentSettingsResource API")
public interface PaymentSettingsResourceApi {

    @ApiOperation(value = "createPaymentSettings", nickname = "createPaymentSettingsUsingPOST", notes = "", response = PaymentSettingsDTO.class, tags={ "payment-settings-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PaymentSettingsDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/payment-settings",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<PaymentSettingsDTO> createPaymentSettingsUsingPOST(@ApiParam(value = "paymentSettingsDTO" ,required=true )  @Valid @RequestBody PaymentSettingsDTO paymentSettingsDTO);


    @ApiOperation(value = "deletePaymentSettings", nickname = "deletePaymentSettingsUsingDELETE", notes = "", tags={ "payment-settings-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/payment-settings/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deletePaymentSettingsUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllPaymentSettings", nickname = "getAllPaymentSettingsUsingGET", notes = "", response = PaymentSettingsDTO.class, responseContainer = "List", tags={ "payment-settings-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PaymentSettingsDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/payment-settings",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<PaymentSettingsDTO>> getAllPaymentSettingsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getPaymentSettings", nickname = "getPaymentSettingsUsingGET", notes = "", response = PaymentSettingsDTO.class, tags={ "payment-settings-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PaymentSettingsDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/payment-settings/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<PaymentSettingsDTO> getPaymentSettingsUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "listToDto", nickname = "listToDtoUsingPOST2", notes = "", response = PaymentSettingsDTO.class, responseContainer = "List", tags={ "payment-settings-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PaymentSettingsDTO.class, responseContainer = "List"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/payment-settings/toDto",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<List<PaymentSettingsDTO>> listToDtoUsingPOST2(@ApiParam(value = "paymentSettings" ,required=true )  @Valid @RequestBody List<PaymentSettings> paymentSettings);


    @ApiOperation(value = "modelToDto", nickname = "modelToDtoUsingPOST2", notes = "", response = PaymentSettingsDTO.class, tags={ "payment-settings-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PaymentSettingsDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/payment-settings/modelToDto",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<PaymentSettingsDTO> modelToDtoUsingPOST2(@ApiParam(value = "paymentSettings" ,required=true )  @Valid @RequestBody PaymentSettings paymentSettings);


    @ApiOperation(value = "searchPaymentSettings", nickname = "searchPaymentSettingsUsingGET", notes = "", response = PaymentSettingsDTO.class, responseContainer = "List", tags={ "payment-settings-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PaymentSettingsDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/payment-settings",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<PaymentSettingsDTO>> searchPaymentSettingsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updatePaymentSettings", nickname = "updatePaymentSettingsUsingPUT", notes = "", response = PaymentSettingsDTO.class, tags={ "payment-settings-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PaymentSettingsDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/payment-settings",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<PaymentSettingsDTO> updatePaymentSettingsUsingPUT(@ApiParam(value = "paymentSettingsDTO" ,required=true )  @Valid @RequestBody PaymentSettingsDTO paymentSettingsDTO);

}
