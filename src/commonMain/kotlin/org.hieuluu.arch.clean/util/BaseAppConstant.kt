/*
 * Copyright © 2023 Hieu Luu (Neo)
 *
 * Email: trunghieu.luu.9x@gmail.com
 */

package org.hieuluu.arch.clean.util

/**
 * Created by Hieu Luu (neo) on 23/05/2023
 */
object BaseAppConstant {
  internal val EMPTY_EMAIL_ERROR = 1001
  internal val INVALID_EMAIL_ERROR = 1002
  internal val EMPTY_PASSWORD_ERROR = 1003
  internal val LOGIN_FAILURE = 1004
  internal val NULL_INDEX = -1L

  enum class LoggedInMode constructor(val type: Int) {
    LOGGED_IN_MODE_LOGGED_OUT(0),
    LOGGED_IN_MODE_GOOGLE(1),
    LOGGED_IN_MODE_FB(2),
    LOGGED_IN_MODE_SERVER(3)
  }
}