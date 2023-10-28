<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    public function up(): void
    {
        Schema::create('propiedades', function (Blueprint $table) {
            $table->id();
            $table->integer('piso');
            $table->integer('area');
            $table->string('color');
            $table->string('idDuenio');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
    }
};
