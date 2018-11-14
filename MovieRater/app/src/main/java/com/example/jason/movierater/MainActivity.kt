package com.example.jason.movierater

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var suitableForAllAge = "false"
        checkboxCB.setOnClickListener( {
            if (checkboxCB.isChecked == true) {
                violenceID.visibility = View.VISIBLE
                languageUsedID.visibility = View.VISIBLE
                suitableForAllAge = "true"
            } else {
                violenceID.visibility = View.INVISIBLE
                languageUsedID.visibility = View.INVISIBLE
                suitableForAllAge = "false"
            }
        })

        addBtn.setOnClickListener( {
            var validate = true
            if(nameET.text.isEmpty()) {
                validate = false
                nameET.setError("Field empty")
            }
            if(descriptionET.text.isEmpty()) {
                validate = false
                descriptionET.setError("Field empty")
            }
            if(releaseDateET.text.isEmpty()) {
                validate = false
                releaseDateET.setError("Field empty")
            }

            var languageUsed = ""
            if(languageUsedID.isChecked) {
                languageUsed = "Language"
            }

            var violence = ""
            if(violenceID.isChecked) {
                violence = "Violence"
            }

            var language = ""
            if(EnglishLanguage.isChecked) {
                language = "English"
            }
            else if (ChineseLanguage.isChecked) {
                language = "Chinese"
            }
            else if (MalayLanguage.isChecked) {
                language = "Malay"
            }
            else if (TamilLanguage.isChecked) {
                language = "Tamil"
            }

            if(validate) {
                Toast.makeText(this,
                    "Title = " + nameET.text +
                    "\nOverview = " + descriptionET.text +
                    "\nRelease date = " + releaseDateET.text +
                    "\nLanguage = " + language +
                    "\nSuitable for all ages = " + suitableForAllAge +
                    "\nReason: \n" +
                    violence + "\n" +
                    languageUsed,
                    Toast.LENGTH_LONG
                ).show()

            }
        })
    }

}
