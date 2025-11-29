<a name="readme-top"></a>

<div align="center">

  <h1>☕ Analyse Lexicale : Principes Fondamentaux</h1>
  
  <p>
    <b>Implémentation en Java pur</b>
  </p>
  
  <p>
    Ce projet pédagogique vise à comprendre les mécanismes internes d'un analyseur lexical (Lexer).
    Il implémente la reconnaissance de mots simples, nombres et identifiants en utilisant la logique des <b>Automates Finis Déterministes (DFA)</b>.
  </p>

  <p>
    <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
    <img src="https://img.shields.io/badge/Concept-Automates_Fini-blue?style=for-the-badge" alt="DFA">
    <img src="https://img.shields.io/badge/IDE-IntelliJ_/_Eclipse-000000?style=for-the-badge&logo=intellij-idea&logoColor=white" alt="IDE">
  </p>

  <a href="#features">Fonctionnalités</a> •
  <a href="#installation">Exécution</a> •
  <a href="#code-snippet">Voir le Code</a>
</div>

---

## 📘 Contexte du Projet

Dans le cadre du module de **Compilation**, ce TP se concentre sur la première étape de la traduction d'un programme : **l'Analyse Lexicale**.

Plutôt que d'utiliser des générateurs comme JFlex, ce projet code la logique "à la main" en Java pour :
1.  Lire un flux de caractères.
2.  Identifier des motifs (Patterns) simples.
3.  Générer des **Tokens** (Unités lexicales).



---

## 📂 Organisation du Code <a name="features"></a>

Le projet est structuré pour isoler chaque concept lexical :

| Fichier / Classe | Description | Concept abordé |
| :--- | :--- | :--- |
| `Main.java` | Point d'entrée. Lit le texte et lance l'analyse. | Flux d'entrée/sortie |
| `Lexer.java` | Le cœur du programme. Parcourt le texte caractère par caractère. | Boucle de lecture |
| `Token.java` | Classe objet représentant un mot reconnu (Type + Valeur). | Structure de données |
| `Automate.java` | Implémente les transitions d'états (État 0 -> État 1...). | Logique DFA / Switch-Case |

---

## 💻 Installation & Exécution <a name="installation"></a>

Pas besoin de bibliothèques externes, le **JDK** standard suffit.

### 1. Cloner le projet
```bash
git clone [https://github.com/ton-user/ton-repo-lexical.git](https://github.com/ton-user/ton-repo-lexical.git)
cd ton-repo-lexical
