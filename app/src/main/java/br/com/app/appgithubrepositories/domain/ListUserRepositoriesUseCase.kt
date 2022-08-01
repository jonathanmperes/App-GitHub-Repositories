package br.com.app.appgithubrepositories.domain

import br.com.app.appgithubrepositories.core.UseCase
import br.com.app.appgithubrepositories.data.model.Repo
import br.com.app.appgithubrepositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}