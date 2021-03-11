package br.com.kvmedia.resource;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.kvmedia.entity.CarroEntity;
import br.com.kvmedia.service.CarroService;

@RestController
@RequestMapping("/carros")
public class CarroResource {

	@Autowired
	private CarroService carrosService;

	@PostMapping
	public ResponseEntity<Void> salvarCarro(@RequestBody CarroEntity carroEntity) {

		carroEntity = carrosService.salvarCarro(carroEntity);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(carroEntity.getIdCarro()).toUri();

		return ResponseEntity.created(uri).build();
	}

	@GetMapping("/{id}")
	public ResponseEntity<CarroEntity> buscarCarro(@PathVariable Integer idCarro) {

		CarroEntity carroEntity = carrosService.buscarCarro(idCarro);

		return ResponseEntity.ok(carroEntity);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<CarroEntity> deletarCarro(@PathVariable Integer idCarro) {

		carrosService.deletarCarro(idCarro);

		return ResponseEntity.noContent().build();
	}
}
