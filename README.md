# SystemHotelReservas

**SystemHotelReservas** es un sistema de gestión de reservas desarrollado para el Hotel Costabela, un hotel de 3 estrellas con más de 10 años de experiencia en el sector hotelero, ubicado en la Av. Pacífico N° 586, en el Distrito de Nuevo Chimbote. Este sistema facilita la gestión integral de habitaciones, reservas y servicios, ofreciendo una interfaz intuitiva y eficiente que mejora la experiencia tanto del personal como de los huéspedes.

## Descripción

Hotel Costabela se destaca por brindar una atención cálida y personalizada, garantizando que cada estancia sea cómoda y satisfactoria. Las características y servicios principales del hotel incluyen:
- **Reservas de habitaciones acogedoras**
- **Servicio de limpieza diario**
- **Servicio de cafetería y sala de conferencias**

El sistema **SystemHotelReservas** permite administrar eficientemente estos servicios, facilitando un control centralizado y en tiempo real de las operaciones del hotel.

## Características del Sistema

- **Gestión de Reservas**: Permite crear, modificar y cancelar reservas de habitaciones.
- **Administración de Habitaciones**: Controla el estado de las habitaciones (disponible, ocupada, en limpieza).
- **Perfil de Clientes y Empleados**: Almacena y gestiona la información de los huéspedes y del personal.
- **Documentación de Reportes**: Utiliza Apache POI para generar informes en Excel.
- **Configuración de Temas**: Personalización de la interfaz (tema claro/oscuro) para una experiencia de usuario mejorada.
- **Reportes**: Genera reportes de ocupación, ingresos, y estadísticas relevantes.

## Tecnologías Utilizadas

- **Lenguaje**: Java
- **Frameworks y Librerías**:
  - **Java Swing**: Para la interfaz gráfica de usuario.
  - **FlatLaf**: Para el diseño y personalización de temas.
  - **Apache POI**: Para la creación de reportes en formato Excel.
  - **Hibernate**: ORM para la persistencia de datos.
  - **Spring Data JPA**: Para el manejo de datos.
  - **Retrofit y OpenFeign**: Para consumo de APIs externas.
  - **JUnit**: Para pruebas unitarias.
- **Base de Datos**: MySQL
- **Maven**: Para la gestión de dependencias y construcción del proyecto.

## Base de Datos

La base de datos utilizada en este sistema se llama **bdHotelCostabela** y contiene las siguientes tablas:

- **Roles**: Almacena los roles de los empleados.
- **Empleado**: Contiene información personal de cada empleado.
- **Empleados_Roles**: Relación entre empleados y sus roles.
- **Tipo_Habitacion**: Define los tipos de habitaciones disponibles.
- **Habitacion**: Registra las habitaciones individuales y sus características.
- **Cliente**: Almacena los datos de los clientes.
- **Reserva**: Guarda información sobre las reservas realizadas.
- **Servicios**: Contiene los servicios adicionales disponibles en el hotel.
- **Detalles_Reserva**: Relación entre reservas, habitaciones y servicios.
- **Pago**: Registro de pagos realizados para reservas.
- **Ticket**: Genera un ticket para cada reserva completada y pagada.

Cada tabla está estructurada para optimizar la gestión de reservas, empleados y servicios dentro del hotel, permitiendo una administración fluida y efectiva.

## Requisitos

- **Java JDK 11 o superior**
- **MySQL Server**
- **Maven**

## Instalación

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/codigo04/SystemHotelReservas.git
