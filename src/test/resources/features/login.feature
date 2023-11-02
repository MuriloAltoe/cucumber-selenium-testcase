Feature: Login no site
  Como um usuário registrado
  Eu quero fazer login no site
  Para acessar minha conta

Scenario: Login com sucesso
  Given que estou na página de login
  When eu preencho o campo "username" com "meu_usuario"
  And eu preencho o campo "password" com "minha_senha"
  And eu clico no botão "Login"
  Then eu devo ser redirecionado para a página inicial
