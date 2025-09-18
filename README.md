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

<img width="445" height="198" alt="image" src="https://github.com/user-attachments/assets/f62edf86-a109-4ae8-afef-afe5642d0c77" />

<p>As opções disponíveis são:</p>
<ul>
  <li>1 - Consultar saldo</li>
  <li>2 - Sacar dinheiro</li>
  <li>3 - Depositar dinheiro</li>
  <li>4 - Encerrar atendimento</li>
</ul>

<h3>1. Consultar saldo</h3>
<p>Ao selecionar a opção 1, o usuário recebe uma mensagem com o saldo atual:</p>
<img width="519" height="255" alt="image" src="https://github.com/user-attachments/assets/fc09f496-460f-4270-9a76-c763f3cf2fa5" />

<h3>2. Sacar dinheiro</h3>
<p>Ao selecionar a opção 2, o usuário deve informar o valor que deseja sacar:</p>
<img width="469" height="202" alt="image" src="https://github.com/user-attachments/assets/7d0d6d73-049a-4f50-80b8-bcb2b2c35bc8" />

<details>
  <summary>Validações para saque</summary>
  <ol>
    <li>Se o valor digitado for menor ou igual a zero:</li>
<img width="517" height="112" alt="image" src="https://github.com/user-attachments/assets/316e740b-161d-400f-88e6-8ef495a0c7bc" />
    <li>Se o valor for maior que o saldo disponível:</li>
<img width="494" height="127" alt="image" src="https://github.com/user-attachments/assets/117a8b23-1df7-40bd-bfb2-82a487fc1c09" />
    <li>Se o valor for válido, o saque é realizado e o saldo atualizado:</li>
<img width="500" height="160" alt="image" src="https://github.com/user-attachments/assets/06cab569-4908-49be-bbcc-aa60ef2f7e0a" />
  </ol>
</details>

<h3>3. Depositar dinheiro</h3>
<p>Ao selecionar a opção 3, o usuário deve informar o valor a ser depositado:</p>
<img width="493" height="199" alt="image" src="https://github.com/user-attachments/assets/72d4f456-64e9-4bfb-ace0-6a3c4949d1d2" />

<details>
  <summary>Validações para depósito</summary>
  <ol>
    <li>Se o valor digitado for menor ou igual a zero:</li>
<img width="414" height="79" alt="image" src="https://github.com/user-attachments/assets/59a22b6c-bf01-4c43-9486-7cf99fe3b89f" />
    <li>Se o valor for válido, o depósito é realizado e o saldo atualizado:</li>
<img width="486" height="152" alt="image" src="https://github.com/user-attachments/assets/4b29e507-560f-4475-9c10-1d849191adfa" />
  </ol>
</details>

<h3>4. Encerrar atendimento</h3>
<p>Ao selecionar a opção 4, o atendimento é encerrado e o saldo final é exibido:</p>
<img width="510" height="263" alt="image" src="https://github.com/user-attachments/assets/67b27df3-8a8d-45c9-8ef9-53db86c68b27" />

<h2>Mensagens de erro:</h2>
<ol>
  <li>Se o usuário digitar caracteres não numéricos:</li>
<img width="435" height="185" alt="image" src="https://github.com/user-attachments/assets/b94fbaf6-38a6-4ef6-b176-2547ee5029f7" />
  <li>Se o usuário digitar uma opção inválida no menu:</li>
<img width="385" height="204" alt="image" src="https://github.com/user-attachments/assets/182e080f-2f17-4790-bfed-f79111954822" />
</ol>
