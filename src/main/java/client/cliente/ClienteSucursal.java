package client.cliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import client.dominio.SucursalDTO;
import client.util.ResponseDTO;

@FeignClient(url="192.168.1.33:8090", name="sucursal")
public interface ClienteSucursal {
	
	@GetMapping(path="/sucursal", produces="application/json")
	ResponseDTO listar();
	
	@PostMapping(path="/sucursal",produces="application/json")
	ResponseDTO crear(@RequestBody SucursalDTO sucursal);
	
	@PutMapping(path="/sucursal",produces="application/json")
	ResponseDTO actualizar(@RequestBody SucursalDTO sucursal);
	
	@DeleteMapping(path="/sucursal/{id}",produces="application/json")
	ResponseDTO borrar(@RequestParam Long id);
}
