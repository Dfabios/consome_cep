package com.example.cepapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/cep")
public class CepController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/{cep}")
    public ResponseEntity<?> buscarCep(@PathVariable String cep) {
        cep = cep.replaceAll("\\D", "");

        if (!cep.matches("\\d{8}")) {
            return ResponseEntity.badRequest().body("CEP inválido. Use 8 números.");
        }

        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        ViaCepResponse response = restTemplate.getForObject(url, ViaCepResponse.class);

        if (response == null || response.getCep() == null) {
            return ResponseEntity.status(404).body("CEP não encontrado.");
        }

        return ResponseEntity.ok(response);
    }
}
