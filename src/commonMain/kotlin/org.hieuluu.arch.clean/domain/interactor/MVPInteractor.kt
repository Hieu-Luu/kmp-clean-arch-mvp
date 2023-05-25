/*
 * Copyright © 2023 Hieu Luu (Neo)
 *
 * Email: trunghieu.luu.9x@gmail.com
 *  Github: https://github.com/Hieu-Luu
 *  LinkedIn: https://www.linkedin.com/in/luu-hieu
 */

package org.hieuluu.arch.clean.domain.interactor

/**
 * Created by Hieu Luu (neo) on 25/05/2023
 */

interface MVPInteractor {

    fun isUserLoggedIn(): Boolean

    fun performUserLogout()
}

interface BaseRepository