package com.bjttools.requests

import kotlinx.serialization.Serializable

@Serializable
class ResistorsRequest (
    val r: String,
    val gm: Float
)

val resistorsRequests = mutableListOf(
    ResistorsRequest( "r1", 0f)
)