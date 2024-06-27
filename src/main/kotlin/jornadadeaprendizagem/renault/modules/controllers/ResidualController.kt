package jornadadeaprendizagem.renault.modules.controllers

import io.swagger.annotations.Api
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses

import jornadadeaprendizagem.renault.models.dtos.residual.RequestResidualDTO
import jornadadeaprendizagem.renault.models.dtos.residual.ResponseResidualDTO
import jornadadeaprendizagem.renault.modules.services.ResidualService
import org.springframework.web.bind.annotation.*
import java.util.*

@Api(value = "Residual", description = "Residual Controller")
@RestController
@RequestMapping("/residual_risk")
class ResidualController (private val residualService: ResidualService){

    @PostMapping
    @Operation(summary = "Create a residual_risk")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "OK"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun createResidual(requestResidualDTO : RequestResidualDTO) : ResponseResidualDTO {
        return residualService.create(requestResidualDTO)
    }

    //read
    @GetMapping
    @Operation(summary = "Get all residual_risks")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "Ok"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun getAllResiduals() : List<ResponseResidualDTO> {
        return residualService.findAll()
    }

    //read
    @GetMapping("/{id}")
    @Operation(summary = "Get all residual_risks by id")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "OK"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun getResidualnById(id: UUID) : ResponseResidualDTO {
        return residualService.findById(id)
    }

    @PutMapping
    @Operation(summary = "Update a residual")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "OK"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun updatePilot(id: UUID, requestResidualDTO: RequestResidualDTO) : ResponseResidualDTO {
        return residualService.update(id, requestResidualDTO)
    }

    @DeleteMapping
    @Operation(summary = "Delete a residual")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "OK"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun deletePilot(id: UUID) {
        return residualService.delete(id)
    }
}