package com.bjttools.requests

import kotlinx.serialization.Serializable

@Serializable
class VoltageRequest (
    val uin: Float,
    val r1: Float,
    val r2: Float,
    val rl: Float,
    val rc: Float
)

val voltageRequests = mutableListOf(
    VoltageRequest( 0f,0f,0f,0f,0f)
)