/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.lxisoft.inventory.client.default.api;

import com.lxisoft.inventory.client.default.model.JWTToken;
import com.lxisoft.inventory.client.default.model.LoginVM;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-27T10:21:09.062+05:30[Asia/Kolkata]")

@Api(value = "UserJwtController", description = "the UserJwtController API")
public interface UserJwtControllerApi {

    @ApiOperation(value = "authorize", nickname = "authorizeUsingPOST", notes = "", response = JWTToken.class, tags={ "user-jwt-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = JWTToken.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/authenticate",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<JWTToken> authorizeUsingPOST(@ApiParam(value = "loginVM" ,required=true )  @Valid @RequestBody LoginVM loginVM);

}
