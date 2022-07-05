#language:pt

  @Cadastro
  Funcionalidade: Cadastrar novo Usuário

    @cadastro-sucesso
    Cenario:  Registrar novo usuário com sucesso
      Dado que estou na tela de login
      E acesso o cadastro de usuario
      Quando preencho o formulário de cadastro
      Entao vejo a mensagem de cadastro realizado com sucesso
