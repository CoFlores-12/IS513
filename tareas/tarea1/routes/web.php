<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});

Route::get('/{operacion}/{operando1}/{operando2?}', function ($operacion, $operando1, $operando2 = null) {
    if ($operando2 == null) {
        $operando2 = $operando1;
    }
    if (!is_numeric($operando1) || !is_numeric($operando2)) {
        return "Los operandos deben ser numéricos";
    }
    $respuesta = 0;
    switch ($operacion) {
        case '+':
            $respuesta = $operando1 + $operando2;
            break;
        case '-':
            $respuesta = $operando1 - $operando2;
            break;
        case '*':
            $respuesta = $operando1 * $operando2;
            break;
        case ':':
            if ($operando2 == 0) {
                return "No se puede dividir por cero";
            }
            $respuesta = $operando1 / $operando2;
            break;
        default:
            $respuesta = "Operación no válida";
            break;
    }
    return $respuesta;
});
