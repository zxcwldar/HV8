package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.*
import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: String?,
    @SerializedName("updateAt")
    val updatedAt: String?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("synopsis")
    val synopsis: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("coverImageTopOffset")
    val coverImageTopOffset: Int?,
    @SerializedName("titles")
    val titles: TitlesModel?,
    @SerializedName("canonicalTitle")
    val canonicalTitle: String?,
    @SerializedName("abbreviatedTitles")
    val abbreviatedTitles: List<Any>?,
    @SerializedName("averageRating")
    val averageRating: String?,
    @SerializedName("ratingFrequencies")
    val ratingFrequencies: RatingFrequenciesModel?,
    @SerializedName("userCount")
    val userCount: Int?,
    @SerializedName("favoritesCount")
    val favoritesCount: Int?,
    @SerializedName("startDate")
    val startDate: String?,
    @SerializedName("endDate")
    val endDate: String?,
    @SerializedName("nextRelease")
    val nextRelease: NextReleaseModel?,
    @SerializedName("popularityRank")
    val popularityRank: Int?,
    @SerializedName("ratingRank")
    val ratingRank: Int?,
    @SerializedName("ageRating")
    val ageRating: String?,
    @SerializedName("ageRatingGuide")
    val ageRatingGuide: String?,
    @SerializedName("subtype")
    val subtype: String?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("tba")
    val tba: String?,
    @SerializedName("posterImage")
    val posterImage: PosterImageModel?,
    @SerializedName("coverImage")
    val coverImage: CoverImageModel?,
    @SerializedName("episodeCount")
    val episodeCount: Int?,
    @SerializedName("episodeLength")
    val episodeLength: Int?,
    @SerializedName("totalLength")
    val totalLength: Int?,
    @SerializedName("youtubeVideoId")
    val youtubeVideoId: String?,
    @SerializedName("showType")
    val showType: String?,
    @SerializedName("nsfw:")
    val nsfw: Boolean?
)
fun Attributes.toDomain() = AttributesModel(createdAt, updatedAt, slug, synopsis, description, coverImageTopOffset, titles, canonicalTitle, abbreviatedTitles, averageRating, ratingFrequencies, userCount, favoritesCount, startDate, endDate, nextRelease, popularityRank, ratingRank, ageRating, ageRatingGuide, subtype, status, tba, posterImage, coverImage, episodeCount, episodeLength, totalLength, youtubeVideoId, showType, nsfw)