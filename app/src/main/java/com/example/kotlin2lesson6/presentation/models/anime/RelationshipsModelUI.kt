package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.RelationshipsModel

data class RelationshipsModelUI(
    val genres: GenresModelUI?,
    val categories: CategoriesModelUI?,
    val castings: CastingsModelUI?,
    val installments: InstallmentsModelUI?,
    val mappings: MappingsModelUI?,
    val reviews: ReviewsModelUI?,
    val mediaRelationships: MediaRelationshipsModelUI?,
    val characters: CharactersModelUI?,
    val staff: StaffModelUI?,
    val productions: ProductionsModelUI?,
    val quotes: QuotesModelUI?,
    val episodes: EpisodesModelUI?,
    val streamingLinks: StreamingLinksModelUI?,
    val animeProductions: AnimeProductionsModelUI?,
    val animeCharacters: AnimeCharacters?,
    val animeStaff: AnimeStaffModelUI?
)
fun RelationshipsModel.toUI() = RelationshipsModelUI(genres?.toUI(), categories?.toUI() , castings?.toUI() ,
installments?.toUI() , mappings?.toUI() , reviews?.toUI() , mediaRelationships?.toUI() , characters?.toUI() , staff?.toUI() ,
 productions?.toUI() , quotes?.toUI() , episodes?.toUI() , streamingLinks?.toUI() , animeProductions?.toUI() , animeCharacters?.toUI(),
animeStaff?.toUI())