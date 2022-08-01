package br.com.app.appgithubrepositories.data.repositories

import br.com.app.appgithubrepositories.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}