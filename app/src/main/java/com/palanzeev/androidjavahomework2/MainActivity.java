package com.palanzeev.androidjavahomework2;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    double deposit = 1000.0;
    int month = 0;
    int needMoney = 14000;
    int monthlyIncome = 2500;
    double monthlyPercentage = 5.0;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView calculationMoney = findViewById(R.id.myText);
        calculationMoney.setText("Начальный депозит = " + deposit + "монет");

        while (needMoney > deposit) {
            month++;
            deposit = deposit + (deposit * monthlyPercentage / 100);
            deposit += monthlyIncome;
        }


        calculationMoney.setText(calculationMoney.getText() + "\nДля накопления " + needMoney +
                " необходимо " + month + " месяцев");
        calculationMoney.setText(calculationMoney.getText() + "\nНакопленная сумма равна "
                + deposit + " монет");
    }
}