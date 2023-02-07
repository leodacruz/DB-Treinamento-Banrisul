# SuperMercadoProva
Prova Leonardo Cruz
*Fiz oque o enunciado pedia e acrescenteu novas funcionalidades ao programa,abaixo explico com detalhes cada etapa para a conclusao do projeto.

**Funcionalidades novas:
-Retirar item do carrinho
-Finalizar pedido
-secreta!! Mostrar historico de compras(No menu escolha a opcao 99)

Resolucao dos problemas:
*******1= bug era que o item mesmo nao conseguindo dar baixa ele aparece no pedido final e nao pode! 
Para solucionar no metodo Pedido.adicionaItemNaLista() botei um if que pergunta se possuiu a quantidade do produto no estoque.
Antes ele nao descontava do estoque pq nao tinha a quantidade minima, mas add no "carrinho de compras" dai o if serve para ele dar
baixa e add no "carrinho de compras" somente se a quantidade que ele quer tenha no estoque. Para isso modifiquei bastante o metodo
Pedido.adicionaItem() pq tinha umas coisas me incomodando e tirei algumas redundanceas pq algumas coisas eu perguntava no Pedido.adicionaItem()
e no Estoque.darBaixaEmEstoque(). Uma coisa que ficou me incomodando depois de corrigido o bug foi o fato de o Pedido.adicionaItem() ter ficado muito
grande, dai nÃ£o soube dizer se deveria separar os filtros que botei em novos metodos ou deixar como estah. Eu decidi em deixar como estah, pois alguns filtros
encerram o add do item caso alguma informacao passada fosse vista como um erro.

*******2 e 3 =Irei implementar o 2 e 3 juntos num metodo chamado "finalizar compra" 
Finalizar compra: este metodo esta dentro de Pedido e tem a funcionalidade de finalizar uma compra.
De inicio mostra duas opcoes ao usuario:
1= informar cpf;
2= nao informar;
Apos mostra duas opcoes de PAGAMENTO(ITEM 2 E 3 DO ENUNCIADO)
1=pagar com credito (NOVO)
2=pagar com DINHEIRO (ITEM 2 E 3 DO ENUNCIADO)

ao escolher alguma opcao ele trata elas em um metodo;
Depois de finalizado o pagamento , se salva as informações num Array de Clientes que esta dentro
da Classe Pedido, isso para o menu secreto.

Agora explicação de todas as modificações nas classes:
**Cliente : Agora a classe Cliente salva as informações de um pedido. Anteriormente ela noa era usada
em nada e agora tem a funcionalidade de salvar informações das compras deste cliente. Tinha pensando
em criar uma nova classe chamada "nota fiscal" para isso, mas resolvi implementar assim.

**Estoque : não fiz nenhuma grande alteração, mas tirei algumas redundancias. Essa que estavam nos metodos
 darBaixaEmEstoque() nas duas versoes. Anteriormente essa redundancias nao existiam, mas apos corrigir o bug
 elas apareceram pois estava repetindo as mesmas perguntas que ja tinha perguntando em Pedido.adicionaItemNaLista e
 Pedido.adicionaItem. Tb adicionei o metodo repor estoque que serve para quando o usuario quer retirar um item de seu carrinho de compras

**Item : nao mexi

**Main : nao mexi

**Menu : alem de add as novas implementacoes, botei um tratamento de excessoes. 

**Produto : nao mexi

**Pedido : Classe mais alterada e com muitos metodos novos. 
-Add o array de Cliente para salvar o historico de compras(menu opcao 99).
-sobrecarreguei os dois imprime para assim imprimir certrinho o historico de compras.
-adicionaItem() esta grande e com varios filtros para maior controle de estoque
-adicionaItemNaLista() bug foi corrigido alem de mais informacoes para o usuario
-retiraItem() metodo novo que fiz para quando se quer retirar um item do carrinho,ele retira 
o item, entao se tiver arroz 25quantidade, ele remove todos os arroz. E claro oq ele retira do carrinho
volta pro estoque
-finalizarCompra() trata a finalização da compra
-criaCliente() retorna o new Cliente para ser salvo no array
-pagamentoComCartaoCredito() trata o pagamento com cartao de credito
-pagamentoComDinheiro() trata o pagamneto com dinheiro
-menorQuantidadeNotas() retorna uma string com o troco certinho (ITEM 3)
-historicoNotas() Imprime o historico de compras



****Coisas que fiz bastante: 
-Tratei excecoes.
-comentei
-nao expliquei muito pq acho que nao era necessario
-tentei facilitar o maximo o entendimento
-criei novos caminhos em muitos menus, principalmente quando o usuario escrve algo que nao deve;Ex
pedia um numero e ele escrveu letras, gera a excecao e volta pro menu anterior. Um caso so que o usuario
eh obrigado a digitar o valor certo que eh o valor em dinheiro, ele eh obrigado a informar um valor, nao necessariamnete
um valor maior que o total da compra,mas tem que informar um valor.




