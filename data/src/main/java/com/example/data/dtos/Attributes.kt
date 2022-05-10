package com.example.data.dtos

import com.example.domain.model.*

data class Attributes(
    val createdAt: String?,
    val updatedAt: String?,
    val slug: String?,
    val synopsis: String?,
    val description: String?,
    val coverImageTopOffset: Int?,
    val titles: TitlesModel?,
    val canonicalTitle: String?,
    val abbreviatedTitles: List<Any>?,
    val averageRating: String?,
    val ratingFrequencies: RatingFrequenciesModel?,
    val userCount: Int?,
    val favoritesCount: Int?,
    val startDate: String?,
    val endDate: String?,
    val nextRelease: NextReleaseModel?,
    val popularityRank: Int?,
    val ratingRank: Int?,
    val ageRating: String?,
    val ageRatingGuide: String?,
    val subtype: String?,
    val status: String?,
    val tba: String?,
    val posterImage: PosterImageModel?,
    val coverImage: CoverImageModel?,
    val episodeCount: Int?,
    val episodeLength: Int?,
    val totalLength: Int?,
    val youtubeVideoId: String?,
    val showType: String?,
    val nsfw: Boolean?
)
fun Attributes.toDomain() = AttributesModel(createdAt, updatedAt, slug, synopsis, description, coverImageTopOffset, titles, canonicalTitle, abbreviatedTitles, averageRating, ratingFrequencies, userCount, favoritesCount, startDate, endDate, nextRelease, popularityRank, ratingRank, ageRating, ageRatingGuide, subtype, status, tba, posterImage, coverImage, episodeCount, episodeLength, totalLength, youtubeVideoId, showType, nsfw)