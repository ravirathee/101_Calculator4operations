package com.ravirathee.a101_calculator4operaitons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    String text = "0";
    int x=0,y=0,result=0;
    String operation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button del = findViewById(R.id.delete);
        Button clr = findViewById(R.id.clear);
        Button oneButton = findViewById(R.id.oneButton);
        Button twoButton = findViewById(R.id.twoButton);
        Button threeButton = findViewById(R.id.threeButton);
        Button fourButton = findViewById(R.id.fourButton);
        Button fiveButton = findViewById(R.id.fiveButton);
        Button sixButton = findViewById(R.id.sixButton);
        Button sevenButton = findViewById(R.id.sevenButton);
        Button eightButton = findViewById(R.id.eightButton);
        Button nineButton = findViewById(R.id.nineButton);
        Button zeroButton = findViewById(R.id.zeroButton);

        Button plusButton = findViewById(R.id.plus);
        Button minusButton = findViewById(R.id.minus);
        Button multiplyButton = findViewById(R.id.multiply);
        Button divideButton = findViewById(R.id.divide);

        Button calculateButton = findViewById(R.id.calculateButton);



        del.setOnClickListener(this);
        clr.setOnClickListener(this);
        oneButton.setOnClickListener(this);
        twoButton.setOnClickListener(this);
        threeButton.setOnClickListener(this);
        fourButton.setOnClickListener(this);
        fiveButton.setOnClickListener(this);
        sixButton.setOnClickListener(this);
        sevenButton.setOnClickListener(this);
        eightButton.setOnClickListener(this);
        nineButton.setOnClickListener(this);
        zeroButton.setOnClickListener(this);

        plusButton.setOnClickListener(this);
        minusButton.setOnClickListener(this);
        multiplyButton.setOnClickListener(this);
        divideButton.setOnClickListener(this);
        calculateButton.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        TextView first = findViewById(R.id.first);
        TextView second = findViewById(R.id.second);
        String firstText = "";
        String secondText = "";




        switch (view.getId()) {
            case R.id.oneButton: {
                Log.d("1", "onClick: 1 was called");
                text = "1";
                firstText = first.getText().toString();
                secondText = second.getText().toString();

                if( firstText.equals("0") ) {

                    first.setText(text);
                }else{
                    first.setText( firstText+text );
                }


                if( secondText.equals("0")){

                    second.setText(text);
                }else{
                    second.setText(secondText+text);
                }

                break;
            }
            case R.id.twoButton: {
                text = "2";
                firstText = first.getText().toString();
                secondText = second.getText().toString();

                if( firstText.equals("0") ) {

                    first.setText(text);
                }else{
                    first.setText( firstText+text );
                }


                if( secondText.equals("0")){

                    second.setText(text);
                }else{
                    second.setText(secondText+text);
                }


                break;
            }
            case R.id.threeButton: {
                text = "3";
                firstText = first.getText().toString();
                secondText = second.getText().toString();

                if( firstText.equals("0") ) {

                    first.setText(text);
                }else{
                    first.setText( firstText+text );
                }


                if( secondText.equals("0")){

                    second.setText(text);
                }else{
                    second.setText(secondText+text);
                }

                break;
            }
            case R.id.fourButton: {
                text = "4";
                firstText = first.getText().toString();
                secondText = second.getText().toString();

                if( firstText.equals("0") ) {

                    first.setText(text);
                }else{
                    first.setText( firstText+text );
                }


                if( secondText.equals("0")){

                    second.setText(text);
                }else{
                    second.setText(secondText+text);
                }


                break;
            }
            case R.id.fiveButton: {
                text = "5";
                firstText = first.getText().toString();
                secondText = second.getText().toString();

                if( firstText.equals("0") ) {

                    first.setText(text);
                }else{
                    first.setText( firstText+text );
                }


                if( secondText.equals("0")){

                    second.setText(text);
                }else{
                    second.setText(secondText+text);
                }


                break;
            }
            case R.id.sixButton: {
                text = "6";
                firstText = first.getText().toString();
                secondText = second.getText().toString();

                if( firstText.equals("0") ) {

                    first.setText(text);
                }else{
                    first.setText( firstText+text );
                }


                if( secondText.equals("0")){

                    second.setText(text);
                }else{
                    second.setText(secondText+text);
                }


                break;
            }
            case R.id.sevenButton: {
                text = "7";
                firstText = first.getText().toString();
                secondText = second.getText().toString();

                if( firstText.equals("0") ) {

                    first.setText(text);
                }else{
                    first.setText( firstText+text );
                }


                if( secondText.equals("0")){

                    second.setText(text);
                }else{
                    second.setText(secondText+text);
                }


                break;
            }
            case R.id.eightButton: {
                text = "8";
                firstText = first.getText().toString();
                secondText = second.getText().toString();

                if( firstText.equals("0") ) {

                    first.setText(text);
                }else{
                    first.setText( firstText+text );
                }


                if( secondText.equals("0")){

                    second.setText(text);
                }else{
                    second.setText(secondText+text);
                }


                break;
            }
            case R.id.nineButton: {
                text = "9";
                firstText = first.getText().toString();
                secondText = second.getText().toString();

                if( firstText.equals("0") ) {

                    first.setText(text);
                }else{
                    first.setText( firstText+text );
                }


                if( secondText.equals("0")){

                    second.setText(text);
                }else{
                    second.setText(secondText+text);
                }


                break;
            }
            case R.id.zeroButton: {
                text = "0";
                firstText = first.getText().toString();
                secondText = second.getText().toString();

                if (firstText.equals("0")) {

                    first.setText(text);
                } else {
                    first.setText(firstText + text);
                }


                if (secondText.equals("0")) {

                    second.setText(text);
                } else {
                    second.setText(secondText + text);
                }


                break;
            }
            case R.id.plus: {
                text="+";
                operation="+";
                firstText = first.getText().toString();
                secondText = second.getText().toString();
                int lengthFirst = firstText.length();
                int lengthSecond = secondText.length();

                x = Integer.parseInt( firstText );

                if( firstText.equals("0") ) {

                }
                else {
                    first.setText("0");
                }
                if( secondText.equals("0") ) {

                }
                else {
                    second.setText(secondText+text);
                }

                break;
            }
            case R.id.minus: {
                text="-";
                operation="-";
                firstText = first.getText().toString();
                secondText = second.getText().toString();
                int lengthFirst = firstText.length();
                int lengthSecond = secondText.length();

                x = Integer.parseInt( firstText );

                if( firstText.equals("0") ) {

                }
                else {
                    first.setText("0");
                }


                if( secondText.equals("0") ) {

                }
                else {
                    second.setText(secondText+text);
                }
                break;
            }
            case R.id.multiply: {
                text="*";
                operation="*";
                firstText = first.getText().toString();
                secondText = second.getText().toString();
                int lengthFirst = firstText.length();
                int lengthSecond = secondText.length();

                x = Integer.parseInt( firstText );

                if( firstText.equals("0") ) {

                }
                else {
                    first.setText("0");
                }


                if( secondText.equals("0") ) {

                }
                else {
                    second.setText(secondText+text);
                }
                break;
            }
            case R.id.divide: {
                text="/";
                operation="/";
                firstText = first.getText().toString();
                secondText = second.getText().toString();
                int lengthFirst = firstText.length();
                int lengthSecond = secondText.length();

                x = Integer.parseInt( firstText );

                if( firstText.equals("0") ) {

                }
                else {
                    first.setText("0");
                }


                if( secondText.equals("0") ) {

                }
                else {
                    second.setText(secondText+text);
                }
                break;
            }
            case R.id.delete: {
                Log.d("Delete", "onClick: delete was called");

                firstText = first.getText().toString();
                secondText = second.getText().toString();
                int lengthFirst = firstText.length();
                int lengthSecond = secondText.length();

                if( firstText.equals("0") )
                {

                }else if ( lengthFirst==1 ){
                    first.setText("0");
                }
                else {
                    String string_after_delete = firstText.substring(0, lengthFirst-1);
                    first.setText( string_after_delete );
                }


                if( secondText.equals("0") )
                {

                }else if ( lengthSecond==1 ){
                    second.setText("0");
                }
                else {
                    String string_after_delete = secondText.substring(0, lengthSecond-1);
                    second.setText( string_after_delete );
                }


                break;
            }
            case R.id.calculateButton: {

                try {
                    firstText = first.getText().toString();
                    secondText = second.getText().toString();

                    y = Integer.parseInt(firstText);
                    if (operation.equals("+")) {
                        result = x + y;
                    } else if (operation.equals("-")) {
                        result = x - y;
                    } else if (operation.equals("*")) {
                        result = x * y;
                    } else if (operation.equals("/")) {
                        result = x / y;
                    }


                    String resultSring = Integer.toString(result);
                    first.setText("0");
                    second.setText( secondText+"="+resultSring );
                    //Toast.makeText(this,resultSring,Toast.LENGTH_LONG).show();
                }
                catch (ArithmeticException e) {
                    Toast.makeText(this, "Divide by zero not valid", Toast.LENGTH_LONG).show();
                }

                break;
            }
            case R.id.clear:{
                first.setText("0");
                second.setText("0");
                break;
            }

        }



    }
}
