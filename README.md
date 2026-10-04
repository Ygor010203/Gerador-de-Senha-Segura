# 🔐 Password Generator API

Uma API RESTful desenvolvida em **Java** com **Spring Boot** para a geração automática de senhas fortes e aleatórias. O projeto foi construído com foco em boas práticas de backend, utilizando segurança e aleatoriedade robustas.

## 🚀 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Maven** (Gerenciamento de dependências)
- **SecureRandom** (Para geração segura de caracteres)

## 📌 Como Executar o Projeto

Certifique-se de ter o Java e o Maven instalados na sua máquina.

1. Clone o repositório:
   ```bash
   git clone [https://github.com/YgorOliveiraBorges/Gerador-de-Senha-Segura.git](https://github.com/YgorOliveiraBorges/Gerador-de-Senha-Segura.git)

   Entre na pasta do projeto:

Bash
cd Gerador-de-Senha-Segura
Execute a aplicação usando o Maven:

Bash
./mvnw spring-boot:run
(No Windows/CMD, você pode usar mvn spring-boot:run)

A API estará rodando localmente na porta 8080.

🔌 Endpoints da API
Gerar Senha
URL: GET /api/v1/password/generate

Descrição: Gera uma senha aleatória padrão (12 caracteres contendo letras maiúsculas, minúsculas, números e símbolos).

Exemplo de Resposta (JSON):
JSON
{
  "password": "|0-s53}^W%sx"
}
Desenvolvido por Ygor Oliveira Borges.


Basta copiar esse texto inteiro, colar lá no GitHub substituindo o que estava errado e clicar em **Commit changes** para salvar! Me avisa quando concluir.

<FollowUp label="Já salvei o README corrigido no GitHub!" query="Já atualizei e salvei o README correto no GitHub. O que faço agora?"/>
