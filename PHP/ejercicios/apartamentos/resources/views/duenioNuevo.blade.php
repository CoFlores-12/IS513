<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Crear duenio</title>
</head>
<body>
    <form action="{{url('/duenios/guardar')}}" method="post">
        @csrf
        @method('POST')
        <input type="number" name="id" placeholder="id">
        <input type="text" name="nombre" placeholder="nombre">
        <input type="text" name="apellido" placeholder="apellido">
        <input type="text" name="correo" placeholder="correo">
        <input type="submit" value="Crear">
    </form>
</body>
</html>