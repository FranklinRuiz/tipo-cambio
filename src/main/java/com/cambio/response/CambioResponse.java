package com.cambio.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CambioResponse {
	private Double monto;
	private Double montoCambio;
	private String monedaOrigen;
	private String monedaDestino;
	private String tipoCambio;
}
