<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\propiedadesController;
use App\Http\Controllers\dueniosController;
use App\Models\Duenios;
use App\Models\Propiedades;

Route::get('/', function () {
    $duenios = Duenios::all();
    $propiedades = Propiedades::all();
    return view('welcome', compact('duenios', 'propiedades'));
})->name('inicio');

Route::get('/calcular/{area}/{piso?}', function ($area, $piso = 1) {
    $factor = $piso == 1 ? 1 : ( ( ($piso-1) *0.001) + 1);
    $precio = 1500*$factor*$area;
    return '$'.$precio;
});

Route::get('/propiedades', [propiedadesController::class, 'getAll'])->name('propiedades');

Route::get('/propiedades/{id}', function ($id){
    $duenio = Duenios::find($id);
    return $duenio;
});



Route::get('/duenios', [dueniosController::class, 'getAll'])->name('duenios');

Route::get('/duenio/{id}', function (string $id) {
    $propiedades = Propiedades::where('idDuenio', '=', $id);
    return $propiedades;
})->name('duenios.ver');

Route::get('/duenios/crear', function () {
    return view('duenioNuevo');
})->name('duenios.nuevo');

Route::post('/duenios/guardar', [dueniosController::class, 'guardar']);