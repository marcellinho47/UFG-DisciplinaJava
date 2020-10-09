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

import br.com.kvmedia.entity.FabricanteEntity;
import br.com.kvmedia.entity.ModeloEntity;
import br.com.kvmedia.service.ModeloService;

@RestController
@RequestMapping("/modelos")
public class ModeloResource {

	@Autowired
	private ModeloService modeloService;

	@PostMapping
	public ResponseEntity<Void> salvarModelo(@RequestBody ModeloEntity modeloEntity) {

		modeloEntity = modeloService.salvarModelo(modeloEntity);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(modeloEntity.getIdModelo()).toUri();

		return ResponseEntity.created(uri).build();
	}

	@GetMapping("/{id}")
	public ResponseEntity<ModeloEntity> buscarModelo(@PathVariable Integer idModelo) {

		ModeloEntity modeloEntity = modeloService.buscarModelo(idModelo);

		return ResponseEntity.ok(modeloEntity);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<FabricanteEntity> deletarModelo(@PathVariable Integer idModelo) {

		modeloService.deletarModelo(idModelo);

		return ResponseEntity.noContent().build();
	}
}
