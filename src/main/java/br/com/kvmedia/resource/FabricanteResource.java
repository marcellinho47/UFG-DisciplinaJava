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
import br.com.kvmedia.service.FabricanteService;

@RestController
@RequestMapping("/fabricantes")
public class FabricanteResource {

	@Autowired
	private FabricanteService fabricanteService;

	@PostMapping
	public ResponseEntity<Void> salvarFabricante(@RequestBody FabricanteEntity fabricanteEntity) {

		fabricanteEntity = fabricanteService.salvarFabricante(fabricanteEntity);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(fabricanteEntity.getIdFabricante()).toUri();

		return ResponseEntity.created(uri).build();
	}

	@GetMapping("/{id}")
	public ResponseEntity<FabricanteEntity> buscarFabricante(@PathVariable Integer idFabricante) {

		FabricanteEntity fabricanteEntity = fabricanteService.buscarFabricante(idFabricante);

		return ResponseEntity.ok(fabricanteEntity);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<FabricanteEntity> deletarFabricante(@PathVariable Integer idFabricante) {

		fabricanteService.deletarFabricante(idFabricante);

		return ResponseEntity.noContent().build();
	}
}
