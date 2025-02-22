package otus.homework.coroutines

import retrofit2.http.GET

interface ImagesService {
    @GET("search")
    suspend fun getImage() : List<Image>
}