/*
 * Copyright © 2023 Hieu Luu (Neo)
 *
 * Email: trunghieu.luu.9x@gmail.com
 */

package org.hieuluu.arch.clean.ui.presenter

import org.hieuluu.arch.clean.ui.view.MVPView
import org.hieuluu.arch.clean.domain.interactor.MVPInteractor

interface MVPPresenter<V: MVPView, I: MVPInteractor> {

  fun onAttach(view: V?)

  fun onDetach()

  fun getView(): V?
}