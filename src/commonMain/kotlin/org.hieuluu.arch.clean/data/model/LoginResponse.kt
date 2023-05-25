/*
 * Copyright © 2023 Hieu Luu (Neo)
 *
 * Email: trunghieu.luu.9x@gmail.com
 */

package org.hieuluu.arch.clean.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by Hieu Luu (neo) on 23/05/2023
 */
@Serializable
data class LoginResponse(
  @SerialName("status_code")
  var statusCode: String? = null,

  @SerialName("user_id")
  var userId: Long? = null,

  @SerialName("access_token")
  var accessToken: String? = null,

  @SerialName("user_name")
  var userName: String? = null,

  @SerialName("email")
  var userEmail: String? = null,

  @SerialName("server_profile_pic_url")
  var serverProfilePicUrl: String? = null,

  @SerialName("fb_profile_pic_url")
  var fbProfilePicUrl: String? = null,

  @SerialName("google_profile_pic_url")
  var googleProfilePicUrl: String? = null,

  @SerialName("message")
  var message: String? = null
)
