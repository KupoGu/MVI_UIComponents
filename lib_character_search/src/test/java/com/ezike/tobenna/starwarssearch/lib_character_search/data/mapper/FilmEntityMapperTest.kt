package com.ezike.tobenna.starwarssearch.lib_character_search.data.mapper

import com.ezike.tobenna.starwarssearch.lib_character_search.data.DummyData
import com.ezike.tobenna.starwarssearch.lib_character_search.data.model.FilmEntity
import com.ezike.tobenna.starwarssearch.lib_character_search.domain.model.Film
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class FilmEntityMapperTest {

    private val mapper = FilmEntityMapper()

    @Test
    fun mapFromEntity() {
        val entity: FilmEntity = DummyData.filmEntity
        val domain: Film = mapper.mapFromEntity(entity)
        assertThat(entity.openingCrawl).isEqualTo(domain.openingCrawl)
        assertThat(entity.title).isEqualTo(domain.title)
    }

    @Test
    fun mapToEntity() {
        val domain: Film = DummyData.film
        val entity: FilmEntity = mapper.mapToEntity(domain)
        assertThat(domain.openingCrawl).isEqualTo(entity.openingCrawl)
        assertThat(domain.title).isEqualTo(entity.title)
    }
}
