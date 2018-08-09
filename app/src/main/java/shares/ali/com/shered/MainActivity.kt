package shares.ali.com.shered

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var myshered :SharedPreferences? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            myshered = getSharedPreferences("myshared", 0)
            var editor:SharedPreferences.Editor = myshered!!.edit()
            var userData =  editText1.text.toString()
            editor.putString("name",userData)
            editor.commit()
        }

        var databack : SharedPreferences = getSharedPreferences("myshared",0)
      textView1.text =  databack.getString("name","لا يوجد بيانات")


    }
}
