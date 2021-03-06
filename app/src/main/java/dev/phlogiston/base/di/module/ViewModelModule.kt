package dev.phlogiston.base.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dev.phlogiston.base.core.mvvm.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dev.phlogiston.base.core.mvvm.ViewModelFactory
import dev.phlogiston.base.ui.main.MainViewModel

@Suppress("unused")
@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel
}