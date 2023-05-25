/*
 * Copyright © 2023 Hieu Luu (Neo)
 *
 * Email: trunghieu.luu.9x@gmail.com
 */

package org.hieuluu.arch.clean.data.preferences

import org.hieuluu.arch.clean.util.BaseAppConstant

/**
 * Created by Hieu Luu (neo) on 23/05/2023
 */
interface PreferenceHelper {

  fun getCurrentUserLoggedInMode(): Int

  fun setCurrentUserLoggedInMode(mode: BaseAppConstant.LoggedInMode)

  fun getCurrentUserId(): Long?

  fun setCurrentUserId(userId: Long?)

  fun getCurrentUserName(): String

  fun setCurrentUserName(userName: String?)

  fun getCurrentUserEmail(): String?

  fun setCurrentUserEmail(email: String?)

  fun getAccessToken(): String?

  fun setAccessToken(accessToken: String?)
}