/*
 * Copyright © 2023 Hieu Luu (Neo)
 *
 * Email: trunghieu.luu.9x@gmail.com
 */

package org.hieuluu.arch.clean.data.model

import kotlinx.serialization.SerialName


/**
* Created by Hieu Luu (neo) on 23/05/2023
 *
*/
data class LogoutResponse(
  @SerialName("status_code")
  private var statusCode: String? = null,
  @SerialName("message")
  private var message: String? = null
)
