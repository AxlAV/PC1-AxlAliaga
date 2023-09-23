import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.pc1_axlaliaga.Calculo
import com.example.pc1_axlaliaga.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEnviar = findViewById<Button>(R.id.btnCalcular)

        btnEnviar.setOnClickListener {
            val etparcial = findViewById<EditText>(R.id.etparcial).text.toString()
            val etfinal = findViewById<EditText>(R.id.etfinal).text.toString()
            val etpep = findViewById<EditText>(R.id.etpep).text.toString()

            val nota = etparcial.toDouble() + 0.2 + etfinal.toDouble() * 0.2 + etpep.toDouble() * 0.6

            val intent = Intent(this, Calculo::class.java)
            intent.putExtra("nota", nota.toString()) // Aquí pasas el valor al otro Activity
            startActivity(intent)
        }
    }
}
