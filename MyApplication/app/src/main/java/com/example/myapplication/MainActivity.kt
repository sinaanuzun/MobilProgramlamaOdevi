import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculateButton.setOnClickListener {
            calculateBMI()
        }
    }

    private fun calculateBMI() {
        val weight = weightEditText.text.toString().toFloat()
        val height = heightEditText.text.toString().toFloat() / 100 // cm'yi metreye çevir

        val bmi = weight / height.pow(2)
        resultTextView.text = String.format("%.2f", bmi) // Sonucu iki ondalık basamağa yuvarla

        val category = when {
            bmi < 18.5 -> "Zayıf"
            bmi < 25 -> "Normal"
            bmi < 30 -> "Fazla kilolu"
            else -> "Obez"
        }
        categoryTextView.text = category
    }
}
