package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.AttributesModel

data class AttributesModelUI(
    val createdAt: String?,
    val updatedAt: String?,
    val slug: String?,
    val synopsis: String?,
    val description: String?,
    val coverImageTopOffset: Int?,
    val titles: TitlesModelUI?,
    val canonicalTitle: String?,
    val abbreviatedTitles: List<Any>?,
    val averageRating: String?,
    val ratingFrequencies: RatingFrequenciesModelUI?,
    val userCount: Int?,
    val favoritesCount: Int?,
    val startDate: String?,
    val endDate: String?,
    //val nextRelease: NextReleaseModelUI?,
    val popularityRank: Int?,
    val ratingRank: Int?,
    val ageRating: String?,
    val ageRatingGuide: String?,
    val subtype: String?,
    val status: String?,
    val tba: String?,
    val posterImage: PosterImageModelUI?,
    val coverImage: CoverImageModelUI?,
    val episodeCount: Int?,
    val episodeLength: Int?,
    val totalLength: Int?,
    val youtubeVideoId: String?,
    val showType: String?,
    val nsfw: Boolean?
)
fun AttributesModel.toUI() = AttributesModelUI(
    createdAt , updatedAt , slug , synopsis,description, coverImageTopOffset, titles?.toUI() , canonicalTitle, abbreviatedTitles ,
    averageRating ,ratingFrequencies?.toUI() , userCount , favoritesCount , startDate , endDate, popularityRank , ratingRank,
    ageRating , ageRatingGuide , subtype , status , tba , posterImage?.toUI() , coverImage?.toUI() ,  episodeCount, episodeLength, totalLength, youtubeVideoId, showType, nsfw
)
