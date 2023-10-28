<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <style>
        a > button {
            margin: 10px 30px;
            border: 2px solid #24b4fb;
            background-color: #24b4fb;
            border-radius: 0.9em;
            padding: 0.8em 1.2em 0.8em 1em;
            transition: all ease-in-out 0.2s;
            font-size: 16px;
        }
        select {
            padding:10px;
        }
        #verDuenioSelect > button, #propiedadSelect > button {
            margin-right: 1px;
        }
    </style>
</head>
<body>
    <a href={{route('propiedades')}}> <button>Ver todas las propiedades</button> </a>
    <br>
    <a href={{route('duenios')}}> <button>Ver todos los duenios</button> </a>
    <br>
    <a href={{route('duenios.nuevo')}}> <button>Nuevo duenio</button> </a>
    <br>
    <div>
        <a href="" id="verDuenioSelect"> <button>Ver propiedades de </button> </a>
        <select name="duenios" id="duenios" onchange="dueniosChange(this)">
            <option value="null">Seleccione un duenio</option>
            @foreach ($duenios as $duenio)
                <option value="{{$duenio->idDuenio}}">{{$duenio->nombre}}</option>
            @endforeach
        </select>
    </div>
    <div>
        <a href="" id="propiedadSelect"> <button>Ver duenio de la propiedad</button> </a>
        <select name="propiedades" id="propiedades" onchange="propiedadesChange(this)">
            <option value="null">Seleccione una propiedad</option>
            @foreach ($propiedades as $propiedad)
                <option value="{{$propiedad->id}}">{{$propiedad->id}}</option>
            @endforeach
        </select>
    </div>

    <script>
        let ds = document.getElementById('verDuenioSelect');
        let ps = document.getElementById('propiedadSelect');
        function dueniosChange(e) {
            if (e.value == "null") {
                return
            }
            ds.href = 'duenio/'+e.value
        }
        function propiedadesChange(e) {
            if (e.value == "null") {
                return
            }
            ps.href = '/propiedades/'+e.value
        }
    </script>
    </body>
</html>