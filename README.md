- [1. SDET TRAINING self-paced](#1-sdet-training-self-paced)
  - [1.1. UDEMY](#11-udemy)
    - [1.1.1. Interview Preparation for SDET (Java)](#111-interview-preparation-for-sdet-java)
    - [1.1.2. Cracking Java Coding Interview for Automation Testers (2023)](#112-cracking-java-coding-interview-for-automation-testers-2023)
      - [1.1.2.1. Sección 1: String based Java programming interview  questions with solutions : Part 1](#1121-sección-1-string-based-java-programming-interview--questions-with-solutions--part-1)
        - [1.1.2.1.1. How to count words in a given string using java](#11211-how-to-count-words-in-a-given-string-using-java)
        - [1.1.2.1.2. How to count character occurrences in a given string](#11212-how-to-count-character-occurrences-in-a-given-string)
        - [1.1.2.1.3. How to find duplicate characters in a given string](#11213-how-to-find-duplicate-characters-in-a-given-string)
        - [1.1.2.1.4. Checking anagram strings](#11214-checking-anagram-strings)
        - [1.1.2.1.5. Find first non-repeated character in a given string](#11215-find-first-non-repeated-character-in-a-given-string)
- [2. Some other usefull resources](#2-some-other-usefull-resources)

# 1. SDET TRAINING self-paced

This repo hold exercises from different sources

## 1.1. UDEMY

### 1.1.1. Interview Preparation for SDET (Java)

This Repo holds the excercises from the Udemy Course [Interview Preparation for SDET (Java)](https://www.udemy.com/course/interview-sdet-java/)

Found in package [com.sdet.interview](src/main/java/com/sdet/interview) and summarize the exercises from [JavaCodingChallenges.pdf](JavaCodingChallenges.pdf)

### 1.1.2. Cracking Java Coding Interview for Automation Testers (2023)

This course is [Cracking Java Coding Interview for Automation Testers (2023)](https://www.udemy.com/course/cracking-java-programming-interview-for-selenium-automation-testers/)

The codes from this course are stored in [interview](src/main/java/sdet/craking/interview) and are listed like:

#### 1.1.2.1. Sección 1: String based Java programming interview  questions with solutions : Part 1

##### 1.1.2.1.1. How to count words in a given string using java

In this excercise, it was used a set of tools I don't fully understand.

First, the use a methods for STRING called `split`, and an array for storing the parts. I remember STRINGS are immutable (cannot change its value once initialized) and we need to create another object for that. Here, instructor used an String Array on `String[]` containing elements chopped with `split`method.

Seconds, a special Collections branch of MAP, calls several MAP methods like

- `HashMap`
- `containsKey`
- `put`
- `get`
- `keySet`

Since it got me unprepared, I re discovered the YouTube channel from [@Shakmuria](https://www.youtube.com/@Shakmuria) explaining precisely this example.

So, before re trying this castle boss, I'll need to gather some tools first and train to use them.

1. [Mapas en Java | Map y HashMap. (Ejercicio básico 1).](https://www.youtube.com/watch?v=KXla6JgQ7T8)
2. [Saber la frecuencia de palabras en un array, usando Map y HashMap, en JAVA](https://www.youtube.com/watch?v=wRYoig7CKYM)
3. [Saber la frecuencia de palabras de un array, convertidas en minúsculas, usando Map y HashMap en JAVA](https://www.youtube.com/watch?v=wuvA6IFDsPY)
4. [Interface Set en Java, y sus implementaciones HashSet y TreeSet.](https://www.youtube.com/watch?v=2bm0Ut4hu9A)
5. [Buscar y eliminar datos de un conjunto con interfaz SET, con implementación HashSet](https://www.youtube.com/watch?v=4sZDkfpjsNE)


##### 1.1.2.1.2. How to count character occurrences in a given string

##### 1.1.2.1.3. How to find duplicate characters in a given string

##### 1.1.2.1.4. Checking anagram strings

##### 1.1.2.1.5. Find first non-repeated character in a given string

# 2. Some other usefull resources

1. [Visualizador de ejecuciòn de código JAVA](https://pythontutor.com/java.html#mode=edit)
2. [Convertidor de Python a Java](https://www.codeconvert.ai/free-converter)
3. [Transformador de código entre lenguajes Front End](https://transform.tools/)
4. [Roadmap de JAVA](https://roadmap.sh/java)
5. [Roadmap de QA](https://roadmap.sh/qa)
6. [NotebookLM](https://notebooklm.google/)
7. [GROW de Google](https://grow.google/intl/es/)
8. YouTube channel from [@Shakmuria](https://www.youtube.com/@Shakmuria) and her video lists about DSA.
   1. [⭐Ejercicios de colecciones en Java y algo más. ✅](https://www.youtube.com/watch?v=4sZDkfpjsNE&list=PLDfQIFbmwhrfTCOngoicfGPvEr2F2ZzKc)
   2. [Curso de estructura de datos en Java](https://www.youtube.com/watch?v=jVQy1QzgnwM&list=PLDfQIFbmwhrewABbKSLcTlH_IiFWfk9hh)

---
