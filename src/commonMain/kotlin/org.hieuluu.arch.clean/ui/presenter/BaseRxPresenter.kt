/*
 * Copyright © 2023 Hieu Luu (Neo)
 *
 * Email: trunghieu.luu.9x@gmail.com
 */

package org.hieuluu.arch.clean.ui.presenter

//import com.badoo.reaktive.disposable.CompositeDisposable
//import org.hieuluu.arch.clean.ui.view.MVPView
//import org.hieuluu.arch.clean.util.SchedulerProvider
//import org.hieuluu.arch.clean.domain.interactor.MVPInteractor
//
//abstract class BaseRxPresenter<V : MVPView, I : MVPInteractor> internal constructor(
//  protected var interactor: I?,
//  protected val schedulerProvider: SchedulerProvider,
//  protected val compositeDisposable: CompositeDisposable
//) : MVPPresenter<V, I> {
//  private var view: V? = null
//  private val isViewAttached: Boolean get() = view != null
//
//  override fun onAttach(view: V?) {
//    this.view = view
//  }
//
//  override fun getView(): V? = view
//
//  override fun onDetach() {
//    compositeDisposable.dispose()
//    view = null
//    interactor = null
//  }
//}