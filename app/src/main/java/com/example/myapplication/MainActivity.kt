package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       calculator.setOnClickListener()
        {
           val input1:String = price_value.text.toString()
            val input2:String = payment_value.text.toString()
            val input3:String = loan_value.text.toString()
            val input4:String = rate_value.text.toString()

            val price:Double = input1.toDouble()
            val payment:Double = input2.toDouble()
            val loan:Int = input3.toInt()
            val rate:Double = input4.toDouble()

            val carLoan:Double = price - payment
            val interest:Double = carLoan * loan * rate
            val mRepayment:Double = (carLoan + interest) / loan / 12

            carloan_value.text = "%.2f".format(carLoan)
            interest_value.text = "%.2f".format(interest)
            repayment_value.text = "%.2f".format(mRepayment)

        }

    }
}
