# Consome CEP

Este é um projeto Java com Spring Boot que consome uma API de CEP para retornar informações de endereço a partir de um CEP informado.

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- API ViaCEP (ou similar)
- Maven
- Git

## 📦 Funcionalidades

- Consulta de CEP via requisição HTTP
- Retorno de dados como:
  - Logradouro
  - Bairro
  - Cidade
  - Estado
  - DDD
- Página HTML simples para teste (frontend estático)
- Tratamento de erros para CEPs inválidos

## 🔧 Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/Dfabios/consome_cep.git
cd consome_cep

    Execute o projeto com o Maven ou pela sua IDE:

./mvnw spring-boot:run

    Acesse no navegador:

http://localhost:8080

📁 Estrutura do Projeto

src/
├── main/
│   ├── java/
│   │   └── com.exemplo.cep/
│   │       ├── controller/
│   │       ├── service/
│   │       └── model/
│   └── resources/
│       ├── application.properties
│       └── static/
│           └── index.html

🧪 Exemplo de Requisição

GET http://localhost:8080/api/cep/01001000

Resposta:

{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "bairro": "Sé",
  "localidade": "São Paulo",
  "uf": "SP",
  "ddd": "11"
}

🤝 Contribuição

Contribuições são bem-vindas! Fique à vontade para abrir issues ou enviar pull requests.
📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.



