<?php

namespace App\Http\Controllers;

use App\Http\Controllers\Controller;
use App\Models\Duenios;
use Illuminate\Http\Request;

class dueniosController extends Controller
{
    public function getAll(){
        $duenios = Duenios::all();
        return $duenios;
    }
    public function get($id){
        $duenio = Duenios::find($id);
        return $duenio;
    }
    public function guardar(Request $request){
        $duenio = new Duenios();
        $duenio->idDuenio = $request->id;
        $duenio->nombre = $request->nombre;
        $duenio->apellido = $request->apellido;
        $duenio->correo = $request->correo;
        $duenio->save();
        return redirect()->route("inicio")->with("success","");
    }
}
