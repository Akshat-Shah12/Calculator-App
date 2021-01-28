package com.example.calculatorplus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import static java.lang.System.err;
import static java.lang.System.exit;

public class MainActivity extends AppCompatActivity {

    TextView TvDisplay,TvResult;
    /*ArrayList<Double> numbers = new ArrayList<Double>();
    ArrayList<Character> operators = new ArrayList<Character>();*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TvDisplay = (TextView)findViewById(R.id.tvDisplay);
        TvResult = (TextView)findViewById(R.id.tvResult);
    }
    public void universalClick(){
        if(TvDisplay.getText().toString()=="Syntax Error"){
            String abc = TvResult.getText().toString();
            TvDisplay.setText(abc);
            TvResult.setText("");
        }
    }
    public void universalClick(int a){
        if(TvDisplay.getText().toString()=="Syntax Error"){
            String abc = TvResult.getText().toString();
            TvDisplay.setText(abc);
            TvResult.setText("");
        }
        else if(TvResult.getText().toString().length()>0){
            String x = TvResult.getText().toString();
            TvDisplay.setText(x);
            TvResult.setText("");
        }
    }
    public void btn1Click(View view){
        universalClick();
        String get = TvDisplay.getText().toString();
        TvDisplay.setText(get+"1");
    }
    public void btn2Click(View view){
        universalClick();
        String get = TvDisplay.getText().toString();
        TvDisplay.setText(get+"2");
    }
    public void btn3Click(View view){
        universalClick();
        String get = TvDisplay.getText().toString();
        TvDisplay.setText(get+"3");
    }
    public void btn4Click(View view){
        universalClick();
        String get = TvDisplay.getText().toString();
        TvDisplay.setText(get+"4");
    }
    public void btn5Click(View view){
        universalClick();
        String get = TvDisplay.getText().toString();
        TvDisplay.setText(get+"5");
    }
    public void btn6Click(View view){
        universalClick();
        String get = TvDisplay.getText().toString();
        TvDisplay.setText(get+"6");
    }
    public void btn7Click(View view){
        universalClick();
        String get = TvDisplay.getText().toString();
        TvDisplay.setText(get+"7");
    }
    public void btn8Click(View view){
        universalClick();
        String get = TvDisplay.getText().toString();
        TvDisplay.setText(get+"8");
    }
    public void btn9Click(View view){
        universalClick();
        String get = TvDisplay.getText().toString();
        TvDisplay.setText(get+"9");
    }
    public void btn0Click(View view){
        universalClick();
        String get = TvDisplay.getText().toString();
        TvDisplay.setText(get+"0");
    }

    public void btnAdditionClick(View view){
        universalClick(1);
        String get = TvDisplay.getText().toString();
        TvDisplay.setText(get+"+");
    }
    public void btnSubtractionClick(View view){
        universalClick(2);
        String get = TvDisplay.getText().toString();
        TvDisplay.setText(get+"-");
    }
    public void btnMultiplicationClick(View view){
        universalClick(3);
        String get = TvDisplay.getText().toString();
        TvDisplay.setText(get+"*");
    }
    public void btnDivisionClick(View view){
        universalClick(4);
        String get = TvDisplay.getText().toString();
        TvDisplay.setText(get+"/");
    }
    public void btnPercentageClick(View view){
        universalClick(7);
        String get = TvDisplay.getText().toString();
        TvDisplay.setText(get+"%");
    }
    public void btnEqualClick(View view){
        /*String lineOfOperations;
        lineOfOperations=TvDisplay.getText().toString();
        int len = lineOfOperations.length();*/

        /*int len = lineOfOperations.length();
        int lastStartNum=0;
        for(int i=0;i<len;i++){
            if(lineOfOperations.charAt(i)=='+' && lineOfOperations.charAt(i)=='/' && lineOfOperations.charAt(i)=='*' && lineOfOperations.charAt(i)=='-'){
                operators.add(lineOfOperations.charAt(i));
                numbers.add(Double.parseDouble(lineOfOperations.substring(lastStartNum,i)));
                lastStartNum=i+1;
            }
        }
        numbers.add(Double.parseDouble(lineOfOperations.substring(lastStartNum,len)));
        TvResult.setText(numbers.get(0)+"");
        TvDisplay.setText("");
        Log.i("check",numbers.get(0)+operators.get(0)+numbers.get(1)+"");*/
        /*Character[] operators={'/','*','-','+'};
        Double num1=null;
        Double num2 = null;
        int start=0;
        int end=0;
        Boolean error =false;
        Double result=0.0;
        Character inOrder='/';
        Character op;
        for(int z=0;z<4;z++){
            inOrder = operators[z];
            for(int i=0;i<len;i++){
                if(lineOfOperations.charAt(i)==inOrder){
                    for(int x=i-1;x>=0;x--){
                        if(lineOfOperations.charAt(x)=='+' && lineOfOperations.charAt(x)=='/' && lineOfOperations.charAt(x)=='*' && lineOfOperations.charAt(x)=='-'){
                            num1=Double.parseDouble(lineOfOperations.substring(x+1,i));
                            start=x+1;
                        }
                    }
                    for(int y=i+1;y<len;y++){
                        if(lineOfOperations.charAt(y)=='+' && lineOfOperations.charAt(y)=='/' && lineOfOperations.charAt(y)=='*' && lineOfOperations.charAt(y)=='-'){
                            num2=Double.parseDouble(lineOfOperations.substring(i+1,y));
                            end=y;
                        }
                        
                    }
                }
                if(i==0){
                    if(num2==0){
                        error=true;
                    }
                    result=num1/num2;
                }
                else if(i==1){
                    result=num1*num2;
                }
                else if(i==2){
                    result=num1-num2;
                }
                else if(i==3){
                    result=num1+num2;
                }
                lineOfOperations=lineOfOperations.substring(0,start)+result+lineOfOperations.substring(end,lineOfOperations.length());
            }
        }
        if(error){
            TvDisplay.setText(lineOfOperations);
            TvResult.setText("ERROR");
        }
        else {
            TvResult.setText(lineOfOperations);
            TvDisplay.setText("");
        }*/
        universalClick();
        String answer = calc();
        TvResult.setText(answer);

    }
    public String calc()
    {
        String s= TvDisplay.getText().toString();
        int index,op,k=0,d =0,m=0;
        float result1=0,num1=0,num2=0;
        boolean flag = true;
        while(flag)
        {
            flag = false;
            index = 0;
            op = 0;
            m=0;
            d=0;
            for(int j=0;j<s.length();j++)
            {
                if((s.charAt(j)>='0'&&s.charAt(j)<='9')||(s.charAt(j)=='.')||(s.charAt(j)=='-'&&j==0))
                    continue;
                if(pri(s.charAt(j))>op)
                {
                    index = j;
                    op = pri(s.charAt(j));
                }
            }
            String temp="",temp1="",temp2="";
            for(k=index-1;((k>=0)&&((s.charAt(k)>='0'&&s.charAt(k)<='9')||(s.charAt(k)=='.')||(s.charAt(k)=='-'&&k==0)));k--)
            {
                temp+=s.charAt(k);
                d=k;
            }
            for(k=index+1;((k<s.length())&&((s.charAt(k)>='0'&&s.charAt(k)<='9')||(s.charAt(k)=='.')));k++)
            {
                temp2+=s.charAt(k);
                m=k;
            }
            for(k=temp.length()-1;k>=0;k--)
                temp1+=temp.charAt(k);
            try
            {
                num1=Float.parseFloat(temp1);
                num2=Float.parseFloat(temp2);
            }
            catch(Exception e11)
            {
                TvDisplay.setText("Syntax Error");
            }
            switch(s.charAt(index))
            {
                case '+':result1= num1+num2;
                    break;
                case '-':result1= num1-num2;
                    break;
                case '*':result1= num1*num2;
                    break;
                case '/':if(num2==0)
                {
                    TvDisplay.setText("Syntax Error");
                    break;
                }
                    result1= num1/num2;
                    break;
                case '%':result1= (num1/100)*num2;
                    break;
            }
            if(d!=0||m!=0)
            {
                String r = Float.toString(result1);
                if(r.substring(r.indexOf(".")+1).equals("0"))
                {
                    r=r.substring(0,r.indexOf("."));
                }

                s=s.substring(0, d)+r+s.substring(m+1,s.length());
            }
            else
                break;
            for(k=0;k<s.length();k++)
            {
                if(s.charAt(k)=='-'&&k==0)
                {
                    flag=false;
                }
                else if(s.charAt(k)=='+'||s.charAt(k)=='-'||s.charAt(k)=='*'||s.charAt(k)=='/')
                    flag=true;
            }
        }
        return s;
    }

    public static int pri(char ch)
    {
        if(ch=='*'||ch=='/'||ch=='%')
            return 2;
        else if(ch=='+'||ch=='-')
            return 1;
        return 0;
    }

    public void btnClearClick(View view){
        TvDisplay.setText("");
        TvResult.setText("");
    }
    public void btnDotClick(View view){
        universalClick(6);
        String get = TvDisplay.getText().toString();
        TvDisplay.setText(get+".");
    }
    public void btnBackSpaceClick(View v){
        universalClick(5);
        String a = TvDisplay.getText().toString();
        if(a.length()!=0){
            TvDisplay.setText(TvDisplay.getText().toString().substring(0,a.length()-1));
        }
    }
}