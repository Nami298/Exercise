import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.farsitel.jalali.CalendarUtils

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

        val currentDate = CalendarUtils.getCurrentJalaliDate()
        val dateTextView: TextView = findViewById(R.id.date_text_view)
        dateTextView.text = "تاریخ امروز: $currentDate"

    }
}
