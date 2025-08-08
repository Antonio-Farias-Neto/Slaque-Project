# Slaque - Sistema de Chat Simples em Java

## Descrição

Slaque é uma aplicação Java que simula um sistema básico de chat com canais e usuários, inspirado em plataformas como Slack. Os usuários podem ser cadastrados, adicionados a canais, enviar mensagens nos canais e remover usuários dos canais.

---

## Estrutura do Projeto

### Classes Principais

- **Slaque**  
  Classe principal que gerencia os usuários e canais. Permite cadastrar usuários e canais, adicionar/remover usuários de canais e enviar mensagens.

- **Canal**  
  Representa um canal de chat. Mantém uma lista de usuários e o histórico de mensagens do canal.

- **Usuario**  
  Representa um usuário, com nome e email. Usa o email como identificador único.

- **Mensagem**  
  Representa uma mensagem enviada por um usuário dentro de um canal.

- **SlaqueMain**  
  Classe com o método `main` para executar um exemplo de uso do sistema.

---

## Funcionalidades

- Cadastrar usuários com nome e email.
- Criar canais de chat.
- Adicionar usuários a canais.
- Remover usuários de canais.
- Enviar mensagens nos canais.
- Visualizar usuários de um canal.
- Visualizar histórico de mensagens de um canal.

---

## Como usar

Exemplo básico de uso, conforme a classe  `SlaqueMain` (Main apenas para testar as funcionalidades):

```java
Slaque sl = new Slaque();

sl.cadastraUsuario("Hugo", "Hugo@gmail.com");
sl.cadastraUsuario("Diego", "Diego@gmail.com");
sl.cadastraCanal("Homens");

sl.adicionaUsuarioNoCanal("Hugo@gmail.com", "Homens");
sl.adicionaUsuarioNoCanal("Diego@gmail.com", "Homens");

sl.mandarMensagem("Hugo@gmail.com", "Homens", "oi");
sl.mandarMensagem("Diego@gmail.com", "Homens", "Oi Hugo, tudo bem?");

System.out.println(sl.imprimeUsuariosDoCanal("Homens"));
System.out.println(sl.imprimeHistoricoDeMensagensDoCanal("Homens"));

sl.removeUsuarioDoCanal("Diego@gmail.com", "Homens");
System.out.println(sl.imprimeUsuariosDoCanal("Homens")); 

```
# Dependencias
Nenhuma dependência externa. Projeto puro em Java utilizando apenas classes da biblioteca padrão.

# Autor
- Antonio Neto [GitHub](https://www.github.com/Antonio-Farias-Neto)
- projeto feito nas aulas de programação da UFCG.