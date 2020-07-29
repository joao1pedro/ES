# Engenharia de Software
Repositório criado para a disciplina de Engenharia de Software.
Por alunos da Universidade Federal do Ceará - Campus Quixadá.

# Ambiente de desenvolvimento

- Sistema operacional: Linux
- Linguagem de programação: Java
- Banco de dados: MariaDB
- Conector com banco de dados: MariaDB Connector/J 2.6.0 Stable
- IDE: Eclipse
- Plugins da IDE: WindowBuilder 1.9.3

# Sistema
O sistema trata-se de um sistema para um restaurante e tem as seguintes funcionalidades:

- Realiza um pedido (venda)
- Estorna pedido
- Usuário pode alterar sua senha
- Usuário pode tentar recuperar sua senha através do **Recuperar Senha**
- Gera um PDF de uma nota para impressão com informações do pedido.
- Gerente pode adicionar novos funcionários (torna-los capazes de acessar o sistema)
- Gerente pode remover funcionários do sistema
- Gerente pode ver os lucros baseados nas vendas registradas no banco de dados
- Gerente pode alterar o preço dos itens (produtos) do sistema
- Gerente pode alterar taxa utilizada no cálculo de cada venda
- Gerente pode adicionar tornar um usuário existente em um usuário com privilégios (gerente)

# Arquitetura do Software
Esse projeto utiliza arquitetura MVC. A arquitetura MVC funciona da seguinte maneira:

- Model: camada de manipulação dos dados
- View: camada de interação com o usuário do sistema.
- Controller: camada de controle (faz o meio campo entre view e model)

# Diagramas de Classe
- Model: 

![Model](img/Diagramas/class_diagram/model.png)

- View: 

![View](img/Diagramas/class_diagram/view.png)

- Controller: 

![Control](img/Diagramas/class_diagram/control.png)

- DAO: 

![DAO](img/Diagramas/class_diagram/dao.png)

- Database: Utilizamos um banco de dados para fazer as informações persistirem. O diagrama do banco de dados criado com suas respectivas tabelas pode ser visto abaixo:

![Database](img/Diagramas/class_diagram/database.png)

# Diagramas de Sequência
- ControlLogin:

![Login](img/Diagramas/diagram_seq/ctrlLogin.png)

- ControlRegistraVenda:

![Registra venda](img/Diagramas/diagram_seq/ctrlRegistraVenda.png)

- ControlValidaCadastro: 

![Valida cadastro de usuário](img/Diagramas/diagram_seq/ctrlValidaCadastroUser.png)

- ControlRemoveUser:

![Remove usuário](img/Diagramas/diagram_seq/ctrlRemoveFunc.png)

# Requisitos não-funcionais
- Usabilidade: Para medir a usabilidade, fizemos uma pesquisa com cinco pessoas que assistiram um vídeo do programa funcionando, e, no final, votaram através de um formulário. O gráfico obtido atráves de tal formulário pode ser visto abaixo:

![Usabilidade](img/usabilidade.png)

- Desempenho: Para o desempenho, utilizamos uma ferramenta chamada JProfiler desenvolvidade pela empresa ej-TECHNOLOGIES, essa ferramenta permite análise de carga da CPU, memória e entre outras funcionalidades. É um programa pago, utilizamos a versão de avaliação que aparentemente não é completa quanto a versão *ultimate*.

![CPU](img/cpu_profiler.png)

![Memória](img/memory_profiler.png)