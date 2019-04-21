package com.dmagdaleno.designpatterns.bridge.mapas

class GoogleMaps : Mapa {

    override fun devolveMapa(rua: String): String {
        return "Mapa do Google"
    }
}