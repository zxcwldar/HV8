package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.*
import com.example.domain.models.animemodel.AnimeCharacters
import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("genres")
    val genres: GenresModel?,
    @SerializedName("categories")
    val categories: CategoriesModel?,
    @SerializedName("castings")
    val castings: CastingsModel?,
    @SerializedName("installments")
    val installments: InstallmentsModel?,
    @SerializedName("mappings")
    val mappings: MappingsModel?,
    @SerializedName("reviews")
    val reviews: ReviewsModel?,
    @SerializedName("mediaRelationships")
    val mediaRelationships: MediaRelationshipsModel?,
    @SerializedName("characters")
    val characters: CharactersModel?,
    @SerializedName("staff")
    val staff: StaffModel?,
    @SerializedName("productions")
    val productions: ProductionsModel?,
    @SerializedName("quotes")
    val quotes: QuotesModel?,
    @SerializedName("episodes")
    val episodes: EpisodesModel?,
    @SerializedName("streamingLinks")
    val streamingLinks: StreamingLinksModel?,
    @SerializedName("animeProductions")
    val animeProductions: AnimeProductionsModel?,
    @SerializedName("animeCharacters")
    val animeCharacters: AnimeCharacters?,
    @SerializedName("animeStaff")
    val animeStaff: AnimeStaffModel?
)
fun Relationships.toDomain() = RelationshipsModel(genres, categories, castings, installments, mappings, reviews, mediaRelationships, characters, staff, productions, quotes, episodes, streamingLinks, animeProductions, animeCharacters, animeStaff)