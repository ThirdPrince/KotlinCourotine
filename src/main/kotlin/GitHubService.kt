
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.await
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("/repos/enbandari/Kotlin-Tutorials/stargazers")
     fun getStarGazers(): Call<List<User>>

    @GET("users/{login}")
    fun getUser(@Path("login") login: String): Call<User>

    @GET("users/{login}")
    fun getUser2(@Path("login") login: String): Deferred<User>

    @GET("users/{login}")
    suspend fun getUserAsync(@Path("login") login: String): User

}
object Service{
    val gitHubService:GitHubService by lazy {
        Retrofit.Builder().baseUrl("https://api.github.com").addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build().create(GitHubService::class.java)
    }
}

fun main() {
//    Service.gitHubService.getStarGazers().execute().body().map {
//        println(it)
//    }

    GlobalScope.launch {
        try {
            var starGazers = Service.gitHubService.getStarGazers().await()
            starGazers.forEach {
                println(it.toString())
            }
           // println(starGazers)

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    GlobalScope.launch {
        try {
            println(Service.gitHubService.getUser2("ThirdPrince").await())
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    GlobalScope.launch {
        try {
            println(Service.gitHubService.getUserAsync("bennyhuo"))
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    Thread.sleep(3000)
    println("====")

}