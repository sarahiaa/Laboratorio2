# 🏦​​ Sistema de Simulação de um Sistema Bancário

### :mag_right: Sobre
Este projeto implementa uma simulação de um sistema bancário simples, desenvolvido em **Java**.  
Ele trabalha com conceitos como abastração, herança, interface e polimorfismo, permitindo assim as funcionalidades de **criar conta, depositar, sacar, transferência, listar todas as contas cadastradas e calcular tributos**. Projeto desenvolvido como Laboratório 2 da disciplina IMD0040 - Liguagem de Programação II.

---

## 📋 Funcionalidades  

- Criar uma nova conta dos tipos:
  - Conta corrente;  
  - Conta poupança.
- Depositar valores em conta 
- Sacar valores da conta
- Tranferir entre contas
- Listar contas cadastradas, exibindo:
  - Número;
  - Nome do cliente;
  - Saldo;
  - Tipo da conta (corrente ou poupança).
-  Calcular total de tributos

---

## 🏗️ Estrutura do Projeto

```
lab2/
│
├── Conta.java
│   Classe abstrata base com atributos e métodos comuns
│
├── ContaCorrente.java
│   Classe filha que implementa tributos e taxas
│
├── ContaPoupanca.java
│   Classe filha sem taxas
│
├── Itributavel.java
│   Interface para contas tributáveis
│
└── Main.java
    Classe principal com o menu e lógica do sistema
```

---

## 👩‍💻 Autor
<table>
  <tr>
    <td align="center">
      <a href="https://github.com/sarahiaa">
        <img src="https://github.com/sarahiaa.png" width="100px;" alt="Sarah Lima"/>
        <br />
        <sub><b>Sarah Lima</b></sub>
      </a>
    </td>
  </tr>
</table>
