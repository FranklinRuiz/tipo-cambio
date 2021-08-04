package com.cambio.serviceImpl;

import java.util.List;
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
		TipoCambio monedaOrigen = tipoCambioDao.findByid(request.getMonedaOrigen());
		TipoCambio monedaDestino = tipoCambioDao.findByid(request.getMonedaDestino());

		monetoCambio = request.getMonto() / monedaOrigen.getCambio() * monedaDestino.getCambio();

		cambio.setMonto(request.getMonto());
		cambio.setMontoCambio(monetoCambio);
		cambio.setMonedaOrigen(monedaOrigen.getMoneda());
		cambio.setMonedaDestino(monedaDestino.getMoneda());
		cambio.setTipoCambio(monedaOrigen.getTipo() + "/" + monedaDestino.getTipo());

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
