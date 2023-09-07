package kr.hs.emirim.kkhhss.dialogmultichoiceitems

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.btn)

        btn.setOnClickListener{
            var foodArray = arrayOf("부추김치", "낙지탕탕이", "마라탕")
            var checkArray = booleanArrayOf(false, true, false)
            var dlg = AlertDialog.Builder(this@MainActivity)
            dlg.setTitle("좋아하는 음식은?")
            dlg.setIcon(R.mipmap.ic_launcher)
            dlg.setMultiChoiceItems(foodArray, checkArray){
                dialog, index, isChecked ->
                btn.text = foodArray[index]
            }
            dlg.setNegativeButton("닫기", null)
            dlg.show()
        }
    }
}

