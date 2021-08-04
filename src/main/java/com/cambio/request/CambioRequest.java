package com.cambio.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CambioRequest {
	private Double monto;
	private Long monedaOrigen;
	private Long monedaDestino;
}
