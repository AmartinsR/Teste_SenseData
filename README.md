# Teste_SenseData
Projeto de automação do site Saucedemo - Swag Labs

# :Funcionalidades: relizar login| adicionar produtos ao carrinho de compras| ir para o carrinho de compras|
finalizar compra

# :Autor do projeto: AmartinsR;

# :Versão da ferramenta de gerenciamento de dependências, Maven: versão 4.0.0;


# :Funcionalidades do projeto

`Funcionalidade realizar login`: preencher usuario e senha com dados validos
`Funcionalidade adicionar dois produtos ao carrinho`: clicar em add to cart de dois produtos
`Funcionalidade ir para carrinho`: clicar no icone com a imagem do carrinho
`Funcionalidade finalizar compra`: clicar em checkout preencher nome| sobrenome| cep| clicar em continue| clicar em finish

# :Tecnologias utilizadas

Eclipse IDE
Java SDK 8
Orientação a objeto
metodos e classes selenium
metodos e classe junit
Steps| passo a passo gerkin - Cucumber, arquivo .feature
Biblioteca Selenium - version 4.6.0 - no pom.xml
Biblioteca Junit - version 4.13.2 - no pom.xml
Biblioteca io cucumber-java - version 6.11.0 - no pom.xml
Biblioteca io cucumber-core - version 6.11.0 - no pom.xml
Biblioteca io cucumber-junit - version 6.11.0 - no pom.xml
Biblioteca selenium-http-jdk-client - version 4.5.0 - no pom.xml

# :divisão das classes e pastas e arquivos
-Pasta Drivers - Contem a classe Drivers - que instancia o objeto WebDriver
-Pasta Elementos - Contem a classe Elementos - que guardamos os elementos inspecionados por id e xpath
-Pasta Metodos - Contem a classe de métodos - que utilizaremos para escrever| clicar| validar mensagem - Herdamos também a classe Drivers, para ter acesso a seus métodos
-Pasta Run - Contem a classe Executar - onde colocamos as tags padrão cucumber para nosso projeto e nela também criamos o método para abrir navegador e iniciar a automação, aqui Herdamos também a classe Drivers, para ter acesso a seus métodos
-Pasta Steps - Contem a classe steps - onde implementamos os steps gerados pelo cucumber no arquivo compra.feature, que tráz o passo a passo do teste
-Pasta features - dentro de src/test/resources - contem o arquivo compra.feature - que irá gerar os steps de passo a passo em gerkin
-Pasta Drivers - contem o exeutavel do chromedriver.exe
-arquivo pom.xml - contem as bibluotecas listadas no tópico a cima # :Tecnologias utilizadas

# :classe executa 
Nela iremos clicar em Run As (seta verde) e executar com JUnit Test

# :resultado do teste
no console na aba com simbolo do Junit, visualizaremos a barra na cor verde
Bem como o site irá abrir e a automação será realizada visivelmente


