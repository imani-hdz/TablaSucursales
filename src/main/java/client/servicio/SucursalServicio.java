package client.servicio;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

import client.cliente.ClienteSucursal;
import client.dominio.SucursalDTO;
import client.util.ResponseDTO;

@Service
public class SucursalServicio {

	@Autowired
	ClienteSucursal clientebd;
	
	public Map<String, Object>listar(){
		Map<String, Object>model= new HashMap<>();
		
		try
		{
			ResponseDTO sucursalList=clientebd.listar();
			model.put("sucursalList",sucursalList.getRespuesta());
		}
		catch(Exception e)
		{
			model.put("error", "error");
			model.put("msg", "Error al extraer los datos, si su problema persiste por favor contactenos");
			e.printStackTrace();
		}
		
		return model;
	}
	
	
	public Map<String, Object>crear(SucursalDTO sucursal){
		Map<String, Object>model= new HashMap<>();
		
		try {
			ResponseDTO res=clientebd.crear(sucursal);
		} catch (HttpStatusCodeException  e) {
			
			model.put("msg", ResponseDTO.MSG_FATAL_ERROR);
			e.printStackTrace();
		}
		
		return model;
	}
	
	
	public Map<String, Object>actualizar(SucursalDTO sucursal){
		Map<String, Object>model= new HashMap<>();
		
		try {
			ResponseDTO res=clientebd.actualizar(sucursal);
		} catch (HttpStatusCodeException e) {
			
			model.put("msg", ResponseDTO.MSG_FATAL_ERROR);
			e.printStackTrace();
		}
		
		return model;
	}
	
	public  Map<String, Object>borrar(Long id){
		Map<String, Object>model= new HashMap<>();
		
		try {
			clientebd.borrar(id);
			
		} catch (HttpStatusCodeException e) {
			model.put("msg", ResponseDTO.MSG_FATAL_ERROR);
			e.printStackTrace();
		}
		return model;
	}

}
