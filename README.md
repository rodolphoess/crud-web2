# crud_web2

CRUD simples em JSF para a prova 1 da disciplina de Web II. Na aplicação é feito o cadastramento, deleção e edição de um Funcionário, de um Chefe e de um Departamento. Para realizar o acesso a cada um dos CRUDs foi feito um menu simples linkando para cada .xhtml de cadastro, o cadastro_funcionario.xhtml, cadastro_departamento.xhtml e cadastro_chefe.xhtml. Para realizar essas operações foi aplicado o padrão de projeto Singleton através da notação @SessionScoped na classe Bean. As camadas da aplicação foi dividida em pacotes, o pacote bean, o negocio, modelo e o dao. O Bean contém as classes de controle, que recebe as requisições por parte da view, popula as classes de modelo e encaminha as requisições para as classes de negocio, que contem os Services capazes de realizar validações negociais caso haja necessidade, e por fim as classes Service enviam requisição para a classe DAO correspondente para que essa realize a persistência, que nesse caso foi somente em memória com a utilização de Collections, mais especificamente uma Lista.