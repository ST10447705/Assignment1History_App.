package za.ac.iie.lu2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val infOfDeadPeople = arrayOf(
        "Michael Jackson, known as the King Of Pop",
        "Kobe Bryant, a basketball icon known for his exceptional talent and dedication in Basketball",
        "Marilyn Monroe, an iconic actress and model was famous for her roles in films such as Some Like It Hot",
        "Prince Nelson, a prolific musician, Prince was celebrated for his innovative music, style and hits like Purple Rain",
        "Elvis Presley, widely regarded as the King of Rock and Roll",
        "John Lennon, a founding member of The Beatles, John Lennon was a prolific songwriter and musician",
        "Whitney Houston, a legendary singer and actress, Whitney Houston's voice graced hits like I Will Always Love You",
        "Robin Williams, renowned for his comedic genius and versatile acting",
        "Amy Winehouse, a talented singer-songwriter, was known for her soulful voice and hits like Rehab",
        "Heath Ledger, acclaimed for his versatile acting, Heath Ledger starred in films such as The Dark Knight"
    )

    private val ages = arrayOf(
        50,
        41,
        36,
        57,
        42,
        40,
        48,
        63,
        27,
        28
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val editTextAge = findViewById<EditText>(R.id.editTextNumber2)
        val textViewResult = findViewById<TextView>(R.id.textView3)

        button2.setOnClickListener {
            val enteredAgeText = editTextAge.text.toString().trim()
            if (enteredAgeText.isNotEmpty()) {
                val enteredAge = enteredAgeText.toIntOrNull()
                if (enteredAge != null && enteredAge in 20..100) {
                    val index = ages.indexOf(enteredAge)
                    if (index != -1 && index < infOfDeadPeople.size) {
                        val name = infOfDeadPeople[index]
                        textViewResult.text = "The person who died at the age $enteredAge is $name."
                    } else {
                        textViewResult.text = "No famous person died at the age of $enteredAge."
                    }
                } else {
                    textViewResult.text = "Please enter a valid age between 20 and 100."
                }
            } else {
                textViewResult.text = "Please enter an age."
            }
        }

        button3.setOnClickListener {
            editTextAge.text.clear()
            textViewResult.text = ""
        }
    }
}



