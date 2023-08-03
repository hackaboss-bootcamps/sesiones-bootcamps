# Ejercicios Taller Agosto 2023

1. Registrar los libros que ha escrito un autor:

       libro   = isbn, nombre, autor{id}
       autor   = nombre, correo, dni

2. Registrar inventario de los productos:

       producto   = codigo, nombre, descripcion
       inventario = fecha, codigo, producto{id}, stock

3. Registrar ventas de boleta del concierto:

       boleta  = codigo, nombre_artista, fecha, valor
       venta   = dni, nombre_cliente, boleta{id}, cantidad, valor_pagar

4. Registrar asistencia de clase de spring boot:

       clase      = codigo, nombre
       alumno     = dni, nombre, correo
       asistencia = fecha, asiste{boolean}, alumno{id}, clase{id}

5. Registrar gastos de la persona:

       cuenta = dni, nombre, numero_cuenta, saldo
       movimiento = cuenta{id}, tipo_movimiento{boolean}, valor
