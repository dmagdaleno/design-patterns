package com.dmagdaleno.designpatterns.bridge.mapas

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class MapaTest {

    @Test
    fun deveRetornarMapaDoGoogle(){
        val mapa: Mapa = GoogleMaps()

        assertThat(mapa.devolveMapa("teste")).isEqualTo("Mapa do Google")
    }

    @Test
    fun deveRetornarLinkDoMapa(){
        val mapa: Mapa = MapLink()

        assertThat(mapa.devolveMapa("teste")).isEqualTo("Link de um mapa")
    }
}