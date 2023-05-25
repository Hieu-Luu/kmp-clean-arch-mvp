/*
 * Copyright © 2023 Hieu Luu (Neo)
 *
 * Email: trunghieu.luu.9x@gmail.com
 *  Github: https://github.com/Hieu-Luu
 *  LinkedIn: https://www.linkedin.com/in/luu-hieu
 */

package org.hieuluu.arch.clean.ui.presenter

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancel
import org.hieuluu.arch.clean.domain.interactor.MVPInteractor
import org.hieuluu.arch.clean.ui.view.MVPView
import org.hieuluu.arch.clean.util.DispatcherProvider

/**
 * Created by Hieu Luu (neo) on 25/05/2023
 */
class BaseFlowPresenter<V : MVPView, I : MVPInteractor> internal constructor(
    protected var interactor: I?,
    protected val dispatcherProvider: DispatcherProvider,
    protected val scope: CoroutineScope
) : MVPPresenter<V, I> {
    private var view: V? = null
    private val isViewAttached: Boolean get() = view != null


    override fun onAttach(view: V?) {
        this.view = view
    }

    override fun getView(): V? = view

    override fun onDetach() {
        scope.coroutineContext.cancel()
        view = null
        interactor = null
    }
}