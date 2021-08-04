package com.cambio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cambio.model.TipoCambio;
import com.cambio.request.CambioRequest;
import com.cambio.response.CambioResponse;
import com.cambio.service.CambioService;

@RestController
public class CambioController {

	@Autowired
	private CambioService cambioService;

	@PostMapping("cambio")
	public ResponseEntity<CambioResponse> cambio(@RequestBody CambioRequest request) {
		CambioResponse response = null;
		try {
			response = cambioService.cambio(request);
		} catch (Exception e) {
			return new ResponseEntity<CambioResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<CambioResponse>(response, HttpStatus.OK);
	}

	@GetMapping("lista-tipo-cambio")
	public ResponseEntity<List<TipoCambio>> lista() {
		List<TipoCambio> lista = null;
		try {
			lista = cambioService.lista();
		} catch (Exception e) {
			return new ResponseEntity<List<TipoCambio>>(lista, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<TipoCambio>>(lista, HttpStatus.OK);
	}

	@PostMapping("actualizar-tipo-cambio")
	public ResponseEntity<Boolean> actualizar(@RequestBody TipoCambio tipoCambio) {
		Boolean rpta = false;
		try {
			rpta = cambioService.actualizar(tipoCambio);
		} catch (Exception e) {
			return new ResponseEntity<Boolean>(rpta, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Boolean>(rpta, HttpStatus.OK);
	}

}
