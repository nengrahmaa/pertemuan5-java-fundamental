# Java Fundamental - Pertemuan 5  

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
![GitHub repo size](https://img.shields.io/github/repo-size/nengrahmaa/pertemuan5-java-fundamental?style=for-the-badge)
![GitHub last commit](https://img.shields.io/github/last-commit/nengrahmaa/pertemuan5-java-fundamental?style=for-the-badge)
![GitHub stars](https://img.shields.io/github/stars/nengrahmaa/pertemuan5-java-fundamental?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/nengrahmaa/pertemuan5-java-fundamental?style=for-the-badge)

**Materi:** Inheritance & Method Overriding  

---

## Deskripsi  
Repository ini berisi kode latihan **Pertemuan 5 Java Fundamental**.  
Materi berfokus pada konsep **Pewarisan (Inheritance)** dan **Method Overriding**, meliputi:  

- Membuat **superclass** dan **subclass**
- Menggunakan **keyword `extends`** untuk mewarisi atribut dan method
- Mengakses method dan atribut dari superclass
- Melakukan **overriding method** untuk mengubah perilaku pada subclass
- Demonstrasi **polymorphism** sederhana melalui pemanggilan method yang dioverride

## Teknologi  
- **Bahasa**: Java  
- **JDK**: Minimal JDK 8  
- **IDE**: Bebas (Eclipse, IntelliJ IDEA, VS Code, NetBeans, dll.)  

## Struktur Program  
struktur file:  

pertemuan5-java-fundamental/  
├── model/  
│   ├── EducationDivision.java  
│   ├── EducationDivision.class  
│   ├── PubManagement.java  
│   ├── PubManagement.class  
│   ├── SpiritualDivision.java  
│   ├── SpiritualDivision.class  
│   ├── WalfareDivision.java  
│   └── WalfareDivision.class  
├── App.java  
├── App.class  
└── README.md  



**Penjelasan File:**  
- **folder model** → Berisi atribut dan method umum yang akan diwarisi oleh subclass, dan juga berisi `ParentClass` dan melakukan overriding pada method tertentu untuk menyesuaikan perilaku.  
- **App.java** → Berisi kode utama untuk membuat objek dari `ParentClass` dan `ChildClass` serta menguji pewarisan dan method overriding.  

## Cara Menjalankan  
1. Pastikan Java Development Kit (JDK) sudah terpasang di komputer  
2. Clone repository ini:
   ```bash
   git clone https://github.com/nengrahmaa/pertemuan5-java-fundamental.git
3. Masuk ke folder project:
   ```bash
   cd pertemuan5-java-fundamental
   ```
4. Compile seluruh file Java (termasuk yang ada di folder model):
   ```bash
   javac App.java model/*.java 
   ```
5. Jalankan program:
   ```bash
   java App
   ```
