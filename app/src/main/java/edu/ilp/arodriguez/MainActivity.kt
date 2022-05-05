package edu.ilp.arodriguez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //hallar area de un triangulo
       var  A=area(10.0,20.0)
        println("la area del triangulo:++$A")
        // factorail de un numero
        factorial();
        // numer odescendente
        Descendente();


    }

    fun area(b:Double,h:Double):Double{
        return b*h/2;


    }


    fun factorial(){

        val Num=5
        var Factori=1
        for(i in 1..Num) {
            Factori = Factori * i;
        }

       println("el factorial de "+Num+"es  ="+Factori)
    }
fun Descendente(){

    for(i in 50 downTo  1 step 2)

        println("= "+ i);

}

}