/*
 * Copyright © 2023 Hieu Luu (Neo)
 *
 * Email: trunghieu.luu.9x@gmail.com
 */

package org.hieuluu.arch.clean.data.remote

import kotlinx.coroutines.flow.Flow
import org.hieuluu.arch.clean.data.model.LoginRequest
import org.hieuluu.arch.clean.data.model.LoginResponse
import org.hieuluu.arch.clean.data.model.LogoutResponse

/**
 * Created by Hieu Luu (neo) on 23/05/2023
 */
interface BaseFlowApiHelper {
  fun performServerLogin(request: LoginRequest.ServerLoginRequest): Flow<LoginResponse>

  fun performFaceBookLogin(request: LoginRequest.FacebookLoginRequest): Flow<LoginResponse>

  fun performGoogleLogin(request: LoginRequest.GoogleLoginRequest): Flow<LoginResponse>

  fun performLogout(): Flow<LogoutResponse>
}