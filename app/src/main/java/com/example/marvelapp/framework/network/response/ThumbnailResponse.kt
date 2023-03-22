package com.example.marvelapp.framework.network.response

import com.google.gson.annotations.SerializedName

data class ThumbnailResponse(
    @SerializedName("path") val path: String,
    @SerializedName("extesion") val extesion: String
)
