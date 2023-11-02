Feature: Acesso ao formulario
  Verificar se o formulário:
    Está recebendo informações do usuário
    Está recebendo a solicitação de "submit"

Scenario: Login com sucesso
  Given Entrando na página de cadastroexemplo do próprio selenium
  When Prenchendo o Textinput "my-text-id" com "texto :)"
  And Clicando no botão "button"
  Then Devo receber a mensagem "message"
