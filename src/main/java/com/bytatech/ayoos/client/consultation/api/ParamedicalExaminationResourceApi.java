/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.client.consultation.api;

import com.bytatech.ayoos.client.consultation.model.ParamedicalExaminationDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-08T15:10:06.040+05:30[Asia/Kolkata]")

@Api(value = "ParamedicalExaminationResource", description = "the ParamedicalExaminationResource API")
public interface ParamedicalExaminationResourceApi {

    @ApiOperation(value = "createParamedicalExamination", nickname = "createParamedicalExaminationUsingPOST", notes = "", response = ParamedicalExaminationDTO.class, tags={ "paramedical-examination-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ParamedicalExaminationDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/paramedical-examinations",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ParamedicalExaminationDTO> createParamedicalExaminationUsingPOST(@ApiParam(value = "paramedicalExaminationDTO" ,required=true )  @Valid @RequestBody ParamedicalExaminationDTO paramedicalExaminationDTO);


    @ApiOperation(value = "deleteParamedicalExamination", nickname = "deleteParamedicalExaminationUsingDELETE", notes = "", tags={ "paramedical-examination-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/paramedical-examinations/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteParamedicalExaminationUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllParamedicalExaminations", nickname = "getAllParamedicalExaminationsUsingGET", notes = "", response = ParamedicalExaminationDTO.class, responseContainer = "List", tags={ "paramedical-examination-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ParamedicalExaminationDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/paramedical-examinations",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ParamedicalExaminationDTO>> getAllParamedicalExaminationsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getParamedicalExamination", nickname = "getParamedicalExaminationUsingGET", notes = "", response = ParamedicalExaminationDTO.class, tags={ "paramedical-examination-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ParamedicalExaminationDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/paramedical-examinations/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<ParamedicalExaminationDTO> getParamedicalExaminationUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchParamedicalExaminations", nickname = "searchParamedicalExaminationsUsingGET", notes = "", response = ParamedicalExaminationDTO.class, responseContainer = "List", tags={ "paramedical-examination-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ParamedicalExaminationDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/paramedical-examinations",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ParamedicalExaminationDTO>> searchParamedicalExaminationsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateParamedicalExamination", nickname = "updateParamedicalExaminationUsingPUT", notes = "", response = ParamedicalExaminationDTO.class, tags={ "paramedical-examination-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ParamedicalExaminationDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/paramedical-examinations",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<ParamedicalExaminationDTO> updateParamedicalExaminationUsingPUT(@ApiParam(value = "paramedicalExaminationDTO" ,required=true )  @Valid @RequestBody ParamedicalExaminationDTO paramedicalExaminationDTO);

}
