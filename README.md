# 🏦💰 Simulación de Cajero Automático en Java  

## 🚀 Descripción  
Este proyecto es una **aplicación de cajero automático en Java** desarrollada con **Programación Orientada a Objetos (POO)**.  
Permite gestionar cuentas bancarias simuladas, realizar operaciones como **retiros, depósitos, transferencias** y verificar saldos.  

El objetivo del proyecto es aplicar los principios de **POO** en Java, utilizando **clases, herencia, encapsulamiento y polimorfismo**.  

---

## 🔹 Tecnologías utilizadas  
✅ **Java** - Lenguaje principal de programación  
✅ **Programación Orientada a Objetos (POO)** - Modelado de cuentas bancarias  
✅ **Estructuras de datos** - Uso de listas y colecciones para gestionar usuarios  
✅ **Archivos (Opcional)** - Persistencia de datos en archivos de texto o bases de datos  

---

## 📊 Funcionalidades  
✔ **Iniciar sesión con un usuario y contraseña** 🏦  
✔ **Consultar saldo disponible** 💵  
✔ **Realizar retiros y depósitos** 🔄  
✔ **Transferencias entre cuentas** 💳  
✔ **Salir del sistema de manera segura** 🚪  

---

## 🛠 Estructura del código  
El proyecto se basa en el uso de **clases POO**, con una estructura similar a la siguiente:

📌 **Clases principales:**  
- `CuentaBancaria` → Clase base con atributos como `saldo`, `titular`, `numeroCuenta`.  
- `CuentaAhorro` y `CuentaCorriente` → Heredan de `CuentaBancaria`, con reglas específicas.  
- `Usuario` → Representa a los clientes, con métodos para interactuar con su cuenta.  
- `Cajero` → Contiene la lógica de operaciones y transacciones.  
- `Main` → Método principal que ejecuta el programa.  
