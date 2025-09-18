<h1>Algoritmo: SimuladorATM</h1>

<p>Este algoritmo consiste em uma atividade de programação em Java, com o objetivo de simular o funcionamento de um caixa eletrônico digital. Ele utiliza conceitos aprendidos em sala de aula, tais como:</p>

<ul>
  <li>A biblioteca Java <code>Scanner</code> para entrada de dados</li>
  <li>Estruturas condicionais <code>if</code> e <code>else</code></li>
  <li>Tratamento de exceções com <code>try</code>, <code>catch</code> e <code>finally</code></li>
  <li>O uso de <code>switch-case</code> para seleção de opções</li>
</ul>

<h2>A execução do código:</h2>

<p>Inicialmente, o usuário visualiza o saldo atual e escolhe uma opção no menu:</p>

<img width="524" height="60" alt="menu inicial" src="https://github.com/user-attachments/assets/menu_simulador_atm.png" />

<p>As opções disponíveis são:</p>
<ul>
  <li>1 - Consultar saldo</li>
  <li>2 - Sacar dinheiro</li>
  <li>3 - Depositar dinheiro</li>
  <li>4 - Encerrar atendimento</li>
</ul>

<h3>1. Consultar saldo</h3>
<p>Ao selecionar a opção 1, o usuário recebe uma mensagem com o saldo atual:</p>
<img width="667" height="285" alt="consulta saldo" src="https://github.com/user-attachments/assets/consulta_saldo.png" />

<h3>2. Sacar dinheiro</h3>
<p>Ao selecionar a opção 2, o usuário deve informar o valor que deseja sacar:</p>
<img width="667" height="285" alt="saque" src="https://github.com/user-attachments/assets/saque_valor.png" />

<details>
  <summary>Validações para saque</summary>
  <ol>
    <li>Se o valor digitado for menor ou igual a zero:</li>
    <img width="600" height="80" alt="erro saque negativo" src="https://github.com/user-attachments/assets/erro_saque_negativo.png" />
    <li>Se o valor for maior que o saldo disponível:</li>
    <img width="600" height="80" alt="erro saldo insuficiente" src="https://github.com/user-attachments/assets/erro_saldo_insuficiente.png" />
    <li>Se o valor for válido, o saque é realizado e o saldo atualizado:</li>
    <img width="600" height="80" alt="saque realizado" src="https://github.com/user-attachments/assets/saque_realizado.png" />
  </ol>
</details>

<h3>3. Depositar dinheiro</h3>
<p>Ao selecionar a opção 3, o usuário deve informar o valor a ser depositado:</p>
<img width="667" height="285" alt="deposito" src="https://github.com/user-attachments/assets/deposito_valor.png" />

<details>
  <summary>Validações para depósito</summary>
  <ol>
    <li>Se o valor digitado for menor ou igual a zero:</li>
    <img width="600" height="80" alt="erro deposito negativo" src="https://github.com/user-attachments/assets/erro_deposito_negativo.png" />
    <li>Se o valor for válido, o depósito é realizado e o saldo atualizado:</li>
    <img width="600" height="80" alt="deposito realizado" src="https://github.com/user-attachments/assets/deposito_realizado.png" />
  </ol>
</details>

<h3>4. Encerrar atendimento</h3>
<p>Ao selecionar a opção 4, o atendimento é encerrado e o saldo final é exibido:</p>
<img width="667" height="285" alt="encerrar atendimento" src="https://github.com/user-attachments/assets/encerrar_atendimento.png" />

<h2>Mensagens de erro:</h2>
<ol>
  <li>Se o usuário digitar caracteres não numéricos:</li>
  <img width="645" height="120" alt="erro input" src="https://github.com/user-attachments/assets/erro_input.png" />
  <li>Se o usuário digitar uma opção inválida no menu:</li>
  <img width="745" height="85" alt="opcao invalida" src="https://github.com/user-attachments/assets/opcao_invalida.png" />
</ol>

<p>O programa garante que o usuário só poderá realizar operações válidas e encerra corretamente, exibindo o saldo final.</p>
