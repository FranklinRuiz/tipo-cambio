package com.cambio.service;

import java.util.List;

import com.cambio.model.TipoCambio;
import com.cambio.request.CambioRequest;
import com.cambio.response.CambioResponse;

public interface CambioService {
	CambioResponse cambio(CambioRequest request);
	List<TipoCambio> lista();
	Boolean actualizar(TipoCambio tipoCambio);
}
