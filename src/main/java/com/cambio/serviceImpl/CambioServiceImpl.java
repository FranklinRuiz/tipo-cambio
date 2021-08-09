package com.cambio.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cambio.dao.TipoCambioDao;
import com.cambio.model.TipoCambio;
import com.cambio.request.CambioRequest;
import com.cambio.response.CambioResponse;
import com.cambio.service.CambioService;

@Service
public class CambioServiceImpl implements CambioService {

	private final static Logger LOGGER = Logger.getLogger(CambioServiceImpl.class.getName());

	@Autowired
	private TipoCambioDao tipoCambioDao;

	@Override
	public CambioResponse cambio(CambioRequest request) {

		Double monetoCambio = 0.0;

		CambioResponse cambio = new CambioResponse();
		Optional<TipoCambio> monedaOrigen = tipoCambioDao.findById(request.getMonedaOrigen());
		Optional<TipoCambio> monedaDestino = tipoCambioDao.findById(request.getMonedaDestino());

		monetoCambio = request.getMonto() / monedaOrigen.get().getCambio() * monedaDestino.get().getCambio();

		cambio.setMonto(request.getMonto());
		cambio.setMontoCambio(monetoCambio);
		cambio.setMonedaOrigen(monedaOrigen.get().getMoneda());
		cambio.setMonedaDestino(monedaDestino.get().getMoneda());
		cambio.setTipoCambio(monedaOrigen.get().getTipo() + "/" + monedaDestino.get().getTipo());

		return cambio;
	}

	@Override
	public List<TipoCambio> lista() {
		return (List<TipoCambio>) tipoCambioDao.findAll();
	}

	@Override
	public Boolean actualizar(TipoCambio tipoCambio) {
		Boolean rpta = false;

		try {
			rpta = tipoCambioDao.save(tipoCambio) != null ? true : false;
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}

		return rpta;
	}

}
