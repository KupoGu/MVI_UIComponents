package com.ezike.tobenna.starwarssearch.lib_character_search.data

import com.ezike.tobenna.starwarssearch.lib_character_search.data.model.CharacterDetailEntity
import com.ezike.tobenna.starwarssearch.lib_character_search.data.model.CharacterEntity
import com.ezike.tobenna.starwarssearch.lib_character_search.data.model.FilmEntity
import com.ezike.tobenna.starwarssearch.lib_character_search.data.model.PlanetEntity
import com.ezike.tobenna.starwarssearch.lib_character_search.data.model.SpecieEntity
import com.ezike.tobenna.starwarssearch.lib_character_search.domain.model.Character
import com.ezike.tobenna.starwarssearch.lib_character_search.domain.model.CharacterDetail
import com.ezike.tobenna.starwarssearch.lib_character_search.domain.model.Film
import com.ezike.tobenna.starwarssearch.lib_character_search.domain.model.Planet
import com.ezike.tobenna.starwarssearch.lib_character_search.domain.model.Specie

internal object DummyData {

    const val name: String = "leia"

    val characterEntity = CharacterEntity(
        "Leia organa",
        "21BBA",
        "5'5",
        "https://swapi.dev/people/11/"
    )

    val character = Character(
        "Leia organa",
        "21BBA",
        "5'5",
        "https://swapi.dev/people/11/"
    )

    val characterDetailEntity = CharacterDetailEntity(
        listOf("www.url.com"),
        "http://swapi.dev/planet",
        listOf("https://swapi.dev.people"),
        "https://swapi.dev/people/12/"
    )

    val filmEntity = FilmEntity(
        "Some title",
        "An opening crawl"
    )

    val planetEntity = PlanetEntity(
        "tatooine",
        "1000000"
    )

    val specieEntity = SpecieEntity(
        "Iroko",
        "Yoruba",
        "Enugu"
    )

    val characterDetail = CharacterDetail(
        listOf("www.url.com"),
        "http://swapi.dev/planet",
        listOf("https://swapi.dev.people"),
        "https://swapi.dev/people/12/"
    )

    val film = Film(
        "Some title",
        "An opening crawl"
    )

    val planet = Planet(
        "tatooine",
        "1000000"
    )

    val specie = Specie(
        "Iroko",
        "Yoruba",
        "Enugu"
    )
}
