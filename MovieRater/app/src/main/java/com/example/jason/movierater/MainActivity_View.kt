package com.example.jason.movierater

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_view.*

class MainActivity_View : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_view)

        val movie = Movie("Venom",
            "When Eddie Brock acquires the powers of a symbiote, he will have to release his alter-ego Venom to save his life",
            "03-10-2018", "English", "Yes")

        titleTV.text = movie.title
        overviewTV.text = movie.description
        languageTV.text = movie.language
        release_dateTV.text = movie.releaseDate
        suitableTV.text = movie.suitable
    }
}

class Movie(Title: String, Description: String, ReleaseDate: String, Language: String, Suitable: String) {
    var title: String
    var description: String
    var releaseDate: String
    var language: String
    var suitable: String

    init {
        this.title = Title
        this.description = Description
        this.releaseDate = ReleaseDate
        this.language = Language
        this.suitable = Suitable
    }


}