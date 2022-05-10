package com.example.data.dtos

import com.example.domain.model.*
import com.example.domain.model.AnimeCharacters

data class Relationships(
    val genres: GenresModel?,
    val categories: CategoriesModel?,
    val castings: CastingsModel?,
    val installments: InstallmentsModel?,
    val mappings: MappingsModel?,
    val reviews: ReviewsModel?,
    val mediaRelationships: MediaRelationshipsModel?,
    val characters: CharactersModel?,
    val staff: StaffModel?,
    val productions: ProductionsModel?,
    val quotes: QuotesModel?,
    val episodes: EpisodesModel?,
    val streamingLinks: StreamingLinksModel?,
    val animeProductions: AnimeProductionsModel?,
    val animeCharacters: AnimeCharacters?,
    val animeStaff: AnimeStaffModel?
)
fun Relationships.toDoamin() = RelationshipsModel(genres, categories, castings, installments, mappings, reviews, mediaRelationships, characters, staff, productions, quotes, episodes, streamingLinks, animeProductions, animeCharacters, animeStaff)