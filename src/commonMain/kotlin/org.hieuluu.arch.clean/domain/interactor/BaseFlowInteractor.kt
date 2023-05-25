/*
 * Copyright © 2023 Hieu Luu (Neo)
 *
 * Email: trunghieu.luu.9x@gmail.com
 */

package org.hieuluu.arch.clean.domain.interactor

import org.hieuluu.arch.clean.util.BaseAppConstant
import org.hieuluu.arch.clean.data.preferences.PreferenceHelper

/**
 * Created by Hieu Luu (neo) on 23/05/2023
 */
open class BaseFlowInteractor() : MVPInteractor {
  protected lateinit var preferenceHelper: PreferenceHelper
  protected lateinit var repository: BaseRepository

  constructor(preferenceHelper: PreferenceHelper, repository: BaseRepository): this () {
    this.preferenceHelper = preferenceHelper
    this.repository = repository
//    this.apiHelper = apiHelper
  }

  override fun isUserLoggedIn(): Boolean =
    this.preferenceHelper.getCurrentUserLoggedInMode() != BaseAppConstant.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT.type

  override fun performUserLogout() = preferenceHelper.let {
    it.setCurrentUserId(null)
    it.setAccessToken(null)
    it.setCurrentUserEmail(null)
    it.setCurrentUserLoggedInMode(BaseAppConstant.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT)
  }
}