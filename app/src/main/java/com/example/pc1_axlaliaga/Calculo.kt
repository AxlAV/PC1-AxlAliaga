import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.pc1_axlaliaga.R

class Calculo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo)

        val tnota = findViewById<TextView>(R.id.tnota)

        // Obtener el valor de "nota" del intent
        val intent = intent
        val nota = intent.getStringExtra("nota")

        // Mostrar el valor en el TextView
        tnota.text = "Nota: $nota"
    }
}
