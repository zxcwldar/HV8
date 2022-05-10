package com.example.domain.model

import com.example.kotlin2lesson6.presentation.model.AnimeCharacters

data class RelationshipsModel(
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