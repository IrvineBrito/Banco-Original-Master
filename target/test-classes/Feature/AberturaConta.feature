
@aberturadecontas
Feature: Abertura de conta

  @PF
  Scenario Outline: Abertura de conta PF
  
    Given que acesse a url "https://www.original.com.br"
    And clicar no botao aceitar cookies
    And clicar no botao abrir conta
    And clicar no botao que corresponde abrir conta para voce
    #When preencher o formulario de abertura de conta
    And preencher o campo nome com o nome "<nome>"
    And preencher o campo telefone com o telefone "<telefone>"
    And preencher o campo email com o email "<email>"
    And preencher o campo cpf com o cpf "<cpf>"
    And clicar no botao quero ser cliente
    Then sera exibido o texto falta pouco
    
 #   @PJ
 # Scenario: Abertura de conta PJ
  
Examples:
|nome                         |telefone    |email             |cpf        |
|Diego Lucca Alexandre Souza  |11111111111 |teste@teste.com   |42519644460|
#|"Rafaela Marques Albuquerque"  |"11111111111" |"teste@teste.com"   |"42519644460"|