# 🛒 Ada Commerce - E-Commerce 

## 📌 Descrição do Projeto
Ada Commerce é um sistema de e-commerce simples desenvolvido em **Java**, utilizando **Programação Orientada a Objetos (POO)** e os princípios do **SOLID**. O sistema permite cadastrar clientes, produtos, criar pedidos, adicionar itens ao carrinho e finalizar compras.

## 📂 Estrutura do Projeto
O código está organizado em pacotes para facilitar a manutenção e a compreensão do sistema:

📦 **Pacotes e suas responsabilidades:**
- **`Modelos/`** → Contém as classes que representam os dados do sistema (`Cliente`, `Produto`, `Pedido`, `ItemPedido`).
- **`Repositorios/`** → Simula um banco de dados em memória (`PedidoRepositorio`).
- **`Service/`** → Contém as regras de negócio (`PedidoService`).
- **`Controller/`** → Controla as interações entre a interface do usuário e os serviços (`PedidoController`).
- **`Main.java`** → Ponto de entrada da aplicação.

## ⚙️ Funcionalidades
✔️ Cadastrar clientes com nome e documento obrigatório.  
✔️ Cadastrar produtos com nome e preço.  
✔️ Criar pedidos para clientes.  
✔️ Adicionar itens ao pedido com quantidade e preço customizado.  
✔️ Remover ou alterar itens do pedido enquanto estiver aberto.  
✔️ Finalizar um pedido (após pagamento).  

## 🚀 Como Rodar o Projeto
### 📌 Pré-requisitos:
- Ter o **JDK 17+** instalado na máquina.
- Ter uma IDE (IntelliJ, Eclipse, VS Code) ou rodar via terminal.

### 📌 Clonar o repositório
Se o código estiver no GitHub, clone o projeto:
```sh
git clone https://github.com/seu-usuario/ada-commerce.git
cd ada-commerce
