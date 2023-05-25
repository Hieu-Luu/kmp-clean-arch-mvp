/*
 * Copyright © 2023 Hieu Luu (Neo)
 *
 * Email: trunghieu.luu.9x@gmail.com
 */

package org.hieuluu.arch.clean.domain.repository

import kotlinx.coroutines.flow.Flow
import org.hieuluu.arch.clean.data.model.LoginResponse
import org.hieuluu.arch.clean.data.model.LogoutResponse

/**
 * Created by Hieu Luu (neo) on 24/05/2023
 */
interface BaseCommonFlowRepository : BaseRepository {

  fun doServerLogin(email: String, password: String): Flow<LoginResponse>

  fun doFaceBookLogin(userId: String, accessToken: String): Flow<LoginResponse>

  fun doGoogleLogin(userId: String, token: String): Flow<LoginResponse>

  fun doLogout(): Flow<LogoutResponse>
}
