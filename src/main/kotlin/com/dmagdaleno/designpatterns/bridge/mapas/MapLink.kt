package com.dmagdaleno.designpatterns.bridge.mapas

class MapLink : Mapa {
    override fun devolveMapa(rua: String): String {
        return "Link de um mapa"
    }
}