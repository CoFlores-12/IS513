<?php

namespace App\Http\Controllers;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\Models\Propiedades;

class propiedadesController extends Controller
{
    public function getAll(){
        $propiedades = Propiedades::all();
        return $propiedades;
    }
    public function get($id){
        $propiedad = Propiedades::find($id);
        return $propiedad;
    }
}
