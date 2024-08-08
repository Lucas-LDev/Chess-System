
# Chess System Java | Sistema de Xadrez em Java

## English:
Chess game system project in Java, based on the Udemy course ["Java COMPLETO: Object-Oriented Programming + Projects" by professor Nelio Alves.](https://www.udemy.com/course/java-curso-completo/)

**Applied Knowledge:**
- Encapsulation
- Arrays
- Inheritance
- Static Members
- Layered Architecture
- Enums
- Polymorphism
- Exception Handling

**Model UML:**
![Uml classes model](https://github.com/Lucas-LDev/Chess-System/blob/main/images/chess-system-design.png?raw=true)

**Preview:**
![Chess Game System Preview](https://github.com/Lucas-LDev/Chess-System/blob/main/images/chess-system-preview.png?raw=true)
**⚠️ Attention:** Black pieces have been represented with yellow due to the terminal's background color.

## How to run the project on your machine

**Prerequisites:**
- Java JDK (version 11 or higher) installed on your machine.
- A Java IDE or a terminal. It is recommended to use the Git Bash terminal, which offers a more colorful and user-friendly interface.

### Steps to run the project:

1. **Clone the project into a directory of your choice** using the following command in Git Bash:

   ```bash
   git clone https://github.com/Lucas-LDev/Chess-System.git
   ```

2. **Navigate to the project's root directory** (Chess-System), which contains the `.idea`, `images`, and `src` folders.

3. **Open Git Bash in the root directory** or **open the project in your preferred IDE**. If using an IDE, run the project through the `Program.java` file located in the `application` package.

4. **In Git Bash**, create the `out` folder where the project will be compiled using the command:

   ```bash
   mkdir -p out
   ```

5. **Compile the project** with the following command:

   ```bash
   javac -d out -cp src src/application/Program.java
   ```

6. **If the compilation is successful** (no errors), you can test the chess system with the command:

   ```bash
   java -cp out application.Program
   ```


---
## Português:
Projeto de sistema de jogo de xadrez em Java, baseado no curso da Udemy ["Java COMPLETO: Programação Orientada a Objetos + Projetos" do professor Nelio Alves.](https://www.udemy.com/course/java-curso-completo/)

**Conhecimento aplicado:**
- Encapsulamento
- Matrizes
- Herança
- Membros estáticos
- Padrão de camadas
- Enums
- Polimorfismo
- Tratamento de exceções

**Modelo UML:**
![Uml classes model](https://github.com/Lucas-LDev/Chess-System/blob/main/images/chess-system-design.png?raw=true)

**Preview:**
![Prévia do Sistema de Jogo de Xadrez](https://github.com/Lucas-LDev/Chess-System/blob/main/images/chess-system-preview.png?raw=true)
**⚠️ Atenção:** as peças de cor preta foram representadas com a cor amarela por conta da cor de fundo do terminal.

## Como rodar o projeto na sua máquina

**Pré-requisitos:**
- Java JDK (versão 11 ou superior) instalado na sua máquina.
- Uma IDE Java ou um terminal. Recomenda-se o uso do terminal Bash do Git, que oferece uma interface mais colorida e amigável.

### Passos para rodar o projeto:

1. **Clone o projeto em uma pasta de sua preferência** usando o seguinte comando no Git Bash:

   ```bash
   git clone https://github.com/Lucas-LDev/Chess-System.git
   ```

2. **Navegue até a pasta raiz do projeto** (Chess-System), que contém as pastas `.idea`, `images` e `src`.

3. **Abra o Git Bash na pasta raiz** ou **abra o projeto na sua IDE de preferência**. Caso esteja usando uma IDE, execute o projeto através do arquivo `Program.java` localizado no pacote `application`.

4. **No Git Bash**, crie a pasta `out` onde o projeto será compilado, utilizando o comando:

   ```bash
   mkdir -p out
   ```

5. **Compile o projeto** com o seguinte comando:

   ```bash
   javac -d out -cp src src/application/Program.java
   ```

6. **Se a compilação foi bem-sucedida** (sem erros), você pode testar o sistema de xadrez com o comando:

   ```bash
   java -cp out application.Program
   ```
