/*
 * Copyright © 2023 Hieu Luu (Neo)
 *
 * Email: trunghieu.luu.9x@gmail.com
 *  Github: https://github.com/Hieu-Luu
 *  LinkedIn: https://www.linkedin.com/in/luu-hieu
 */

package org.hieuluu.arch.clean.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by Hieu Luu (neo) on 25/05/2023
 */
class LoginRequest {
    @Serializable
    data class ServerLoginRequest internal constructor(internal val email: String, internal val password: String)

    @Serializable
    data class FacebookLoginRequest internal constructor(
        @SerialName("fb_user_id") internal val fbUserId: String,
        @SerialName("fb_access_token") internal val fbAccessToken: String
    )

    data class GoogleLoginRequest internal constructor(
        @SerialName("google_user_id")
        internal val googleUserId: String,
        @SerialName("google_id_token")
        internal val idToken: String
    )
}