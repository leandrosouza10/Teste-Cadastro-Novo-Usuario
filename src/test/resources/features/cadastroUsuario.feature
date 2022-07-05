#language:pt

  @Cadastro
  Funcionalidade: Cadastrar novo Usuário

    @cadastro-sucesso
    Cenario:  Registrar novo usuário com sucesso
      Dado que estou na tela de login
      E acesso o cadastro de usuario
      Quando preencho o formulário de cadastro
      E clico em registrar
      Entao vejo cadastro realizado com sucesso
