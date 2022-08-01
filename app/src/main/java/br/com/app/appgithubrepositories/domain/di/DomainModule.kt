package br.com.app.appgithubrepositories.domain.di

import br.com.app.appgithubrepositories.domain.ListUserRepositoriesUseCase
import org.koin.core.context.GlobalContext.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {

    fun load() {
        loadKoinModules(useCaseModule())
    }

    private fun useCaseModule(): Module {
        return module {
            factory { ListUserRepositoriesUseCase(get()) }
        }
    }

}