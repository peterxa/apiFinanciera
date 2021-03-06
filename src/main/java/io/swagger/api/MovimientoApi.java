/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.34).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.MovimientoDto;
import io.swagger.model.MensajeSalida;
import io.swagger.model.MovimientoCliente;
import io.swagger.model.MovimientoDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.Date;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-09T22:14:32.376Z[GMT]")
@Validated
public interface MovimientoApi {

	@Operation(summary = "Consulta de movimiento por usuario y rango de fecha", description = "", tags = {
			"Movimientos" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MovimientoCliente.class))) })
	@RequestMapping(value = "/movimiento/obtenerReporte/{usuario}/{fechaInicio}/{FechaFinal}", produces = {
			"application/json" }, method = RequestMethod.GET)
	ResponseEntity<?> getMovimientoObtenerReporte(
			@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("usuario") String usuario,
			@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("fechaInicio") Date fechaInicio,
			@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("FechaFinal") Date fechaFinal);

	@Operation(summary = "Crear Movimiento", description = "", tags = { "Movimientos" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MensajeSalida.class))),
			@ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MensajeSalida.class))),
			@ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MensajeSalida.class))) })
	@RequestMapping(value = "/movimiento/crearMovimiento", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	ResponseEntity<?> postMovimiento(
			@Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema()) @Valid @RequestBody MovimientoDto body);

	@Operation(summary = "Actualizar Movimiento", description = "", tags = { "Movimientos" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MovimientoDto.class))),
			@ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MensajeSalida.class))),
			@ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MensajeSalida.class))) })
	@RequestMapping(value = "/Movimiento/actualizarMovimiento", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.PUT)
	ResponseEntity<?> putMovimiento(
			@Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema()) @Valid @RequestBody MovimientoDto body);

	@Operation(summary = "consultar Movimiento", description = "", tags = { "Movimientos" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MovimientoDto.class))),
			@ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MensajeSalida.class))),
			@ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MensajeSalida.class))) })
	@RequestMapping(value = "/Movimiento/obtenerMovimiento", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<?> getMovimiento();

	@Operation(summary = "eliminarMovimiento", description = "Elimina un Movimiento por ID", tags = { "Movimientos" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = Boolean.class))),
			@ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = MensajeSalida.class))),
			@ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema(implementation = MensajeSalida.class))) })
	@RequestMapping(value = "/Movimientos/{MovimientoId}", produces = "application/json; charset=UTF-8", method = RequestMethod.DELETE)
	ResponseEntity<?> eliminarMovimiento(
			@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("MovimientoId") String movimientoId);

}
