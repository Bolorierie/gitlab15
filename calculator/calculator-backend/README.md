# 🧮 Calculator – Java Maven Төсөл

Энэ бол `Java` хэл дээр бичигдсэн энгийн тооны машины (`calculator`) аппликейшн бөгөөд `Maven`-ийг төслийн хамаарлууд, тест, кодын чанарын шалгалт болон code coverage-ийг удирдахад ашиглаж байна.

---

## 📁 Төслийн бүтэц

calculator/
├── pom.xml
├── checkstyle.xml
├── .gitignore
├── README.md
├── src/
│ ├── main/
│ │ └── java/labxx/sict/must/edu/mn/ # Эх код
│ └── test/
│ └── java/labxx/sict/must/edu/mn/ # Тестүүд


---

## ⚙️ Ашигласан технологиуд

- Java 17
- Maven
- JUnit 5 – Нэгж тест
- Maven Surefire Plugin – Тест гүйцэтгэх
- Maven Checkstyle Plugin – Кодын хэв маяг шалгах
- JaCoCo Maven Plugin – Кодын хамрах хүрээ шалгах

---

## 🚀 Төслийг угсрах болон ажиллуулах

1. **Төслийг угсрах**

```bash
mvn clean install
