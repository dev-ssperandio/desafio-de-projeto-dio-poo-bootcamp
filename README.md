## 📚 Desafio de Projeto DIO: Abstraindo um Bootcamp Usando Orientação a Objetos em Java

### 📜 Descrição:

Este `Desafio de Projeto` foi proposto pela `DIO - Digital Innovation One` no `Bootcamp Claro - Java com Spring Boot`.

O objetivo deste projeto prático é reforçar o conhecimento em `Programação Orientada a Objetos (POO)`, explorando seus pilares: `Abstração`, `Encapsulamento`, `Herança` e `Polimorfismo`, através da implementação em `Java` com o `domínio` de um Bootcamp. 


### ⏯ Como utilizar:

Neste projeto há no diretório raiz `src` a classe principal `Main.java` e os subdiretórios `br.com.dio.desafio.dominio` que armazenam todas as demais classes, começando pela classe de domínio `Bootcamp.java`. Essa classe possui `atributos` que representam as informações do bootcamp, incluindo uma lista para armazenar objeto `Dev` inscrito e outra lista para armazenar objeto `Conteudo`. A classe `Dev` possui o `atributo` para representar o nome do desenvolvedor, uma lista para armazenar objeto `Conteudo` o qual o desenvolvedor está inscrito, outra para armazenar objeto `Conteudo` que o desenvolvedor já concluiu, possui `métodos` para representar as inscrição no bootcamp, para progredir nos conteúdos e calcular o total de experiência obtida enquanto progride. `Conteudo.java` é uma `superclasse` que define os `atributos` necessários para a criação de conteúdos e implementa o `método` para calcular experiência. Os conteúdos se dividem em dois tipos `Curso.java` e `Mentoria.java`, `subclasses` que herdam `Conteudo.java`. `Curso.java` possui um `atributo` para representar sua carga horária e `Mentoria.java` um `atributo` para representar a data em que irá ocorrer.

Na classe principal `Main.java` deve-se instanciar conteúdos e em seguida instanciar um objeto da classe `Bootcamp.java` para que seja possível adicionar os conteúdos a ele, para então instanciar um objeto da classe `Dev.java` e testar testar seus métodos de inscrição, progresso e exibição do total de experiência.


### 🛠 Tecnologias utilizadas:
<div>
    <img align="center" alt="ssperandio-Java" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" />
    <img align="center" alt="ssperandio-Git" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/git/git-original.svg" />
    <img align="center" alt="ssperandio-GitHub" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/github/github-original.svg" />    
</div>


### 📫 Entre em contato comigo:
<div>
  <a href="https://www.linkedin.com/in/sidneysperandio" target="_blank"><img loading="lazy" src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>   
  <a href = "mailto:dev.ssperandio@gmail.com"><img loading="lazy" src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
  <a href="https://wa.me/5511975018322" target="_blank"><img loading="lazy" src="https://img.shields.io/badge/-WhatsApp-%2325D366?style=for-the-badge&logo=whatsapp&logoColor=white" alt="WhatsApp"></a>
</div>


### 🤝 Contribua:
Sinta-se a vontade para somar com a sua contribuição, basta dar um `fork`.

⭐️ Dê um `star` no projeto.

🐛 Abra uma `issues` para relatar algum problema.