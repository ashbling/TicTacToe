package com.example.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

//try to make same program using array then class

/*
class c{
Button r;
boolean even;
boolean done;
c(){
this.even=true;
this.done=false;
}

void reset(){
this.even=true;
this.done=false;
tb();

}

void tb()
{this.r.setBackgroundResource(R.drawable.blank);
}

void tx()
{this.r.setBackgroundResource(R.drawable.x);
}

void to()
{this.r.setBackgroundResource(R.drawable.o);
}

}
*/
int chance=0;

Button r,a1,a2,a3,a4,a5,a6,a7,a8,a9;
boolean c=true;
String won="No One";
boolean p1=false;
boolean p2=false;
boolean p3=false;
boolean p4=false;
boolean p5=false;
boolean p6=false;
boolean p7=false;
boolean p8=false;
boolean p9=false;

double isx1=3;
double isx2=4;
double isx3=5;
double isx4=6;
double isx5=7;
double isx6=8;
double isx7=83;
double isx8=63;
double isx9=43;

int pos=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
r=(Button)findViewById(R.id.r);

a1=(Button)findViewById(R.id.a1);
a2=(Button)findViewById(R.id.a2);
a3=(Button)findViewById(R.id.a3);

a4=(Button)findViewById(R.id.a4);
a5=(Button)findViewById(R.id.a5);
a6=(Button)findViewById(R.id.a6);

a7=(Button)findViewById(R.id.a7);
a8=(Button)findViewById(R.id.a8);
a9=(Button)findViewById(R.id.a9);

r.setOnClickListener(this);

a1.setOnClickListener(this);
a2.setOnClickListener(this);
a3.setOnClickListener(this);

a4.setOnClickListener(this);
a5.setOnClickListener(this);
a6.setOnClickListener(this);

a7.setOnClickListener(this);
a8.setOnClickListener(this);
a9.setOnClickListener(this);

    }

public void check(int pos){
switch(pos)
  {
case 1:
if((isx1==isx2&&isx1==isx3)||(isx1==isx4&&isx1==isx7)|| (isx1==isx5&&isx1==isx9))
{if(isx1==1)
{won="Player X Won!";
chance=10;
Toast.makeText(this,won,Toast.LENGTH_SHORT).show();}
else{won="Player O Won!";
chance=10;
Toast.makeText(this,won,Toast.LENGTH_SHORT).show();
}
}
break;

case 2:
if((isx1==isx2&&isx2==isx3)||(isx2==isx5&&isx2==isx8))
{if(isx2==1)
{won="Player X Won!";chance=10;
Toast.makeText(this,won,Toast.LENGTH_SHORT).show();}
else{won="Player O Won!";chance=10;
Toast.makeText(this,won,Toast.LENGTH_SHORT).show();
}
}
break;

case 3:
if((isx1==isx3&&isx2==isx3)||(isx3==isx6&&isx3==isx9)|| (isx3==isx5&&isx3==isx7))
{if(isx3==1)
{won="Player X Won!";chance=10;
Toast.makeText(this,won,Toast.LENGTH_SHORT).show();
}
else{won="Player O Won!";chance=10;
Toast.makeText(this,won,Toast.LENGTH_SHORT).show();
}
}
break;

case 4:
if((isx4==isx5&&isx4==isx6)||(isx1==isx4&&isx4==isx7))
{if(isx4==1)
{won="Player X Won!";chance=10;
Toast.makeText(this,won,Toast.LENGTH_SHORT).show();
}
else{won="Player O Won!";chance=10;
Toast.makeText(this,won,Toast.LENGTH_SHORT).show();
}
}
break;

case 5:
if((isx1==isx5&&isx5==isx9)||(isx2==isx5&&isx5==isx8)||(isx3==isx5&&isx5==isx7)||(isx4==isx5&&isx5==isx6))
{if(isx5==1)
{won="Player X Won!";chance=10;
Toast.makeText(this,won,Toast.LENGTH_SHORT).show();
}
else{won="Player O Won!";chance=10;
Toast.makeText(this,won,Toast.LENGTH_SHORT).show();
}
}
break;

case 6:
if((isx9==isx6&&isx6==isx3)||(isx4==isx6&&isx5==isx6))
{if(isx6==1)
{won="Player X Won!";chance=10;
Toast.makeText(this,won,Toast.LENGTH_SHORT).show();
}
else{won="Player O Won!";chance=10;
Toast.makeText(this,won,Toast.LENGTH_SHORT).show();
}
}
break;

case 7:
if((isx7==isx5&&isx7==isx3)||(isx1==isx7&&isx4==isx7)|| (isx7==isx8&&isx7==isx9))
{if(isx7==1)
{won="Player X Won!";chance=10;
Toast.makeText(this,won,Toast.LENGTH_SHORT).show();
}
else{won="Player O Won!";chance=10;
Toast.makeText(this,won,Toast.LENGTH_SHORT).show();
}
}
break;

case 8:
if((isx8==isx7&&isx8==isx9)||isx2==isx8&&isx5==isx8)
{if(isx8==1)
{won="Player X Won!";chance=10;
Toast.makeText(this,won,Toast.LENGTH_SHORT).show();
}
else{won="Player O Won!";chance=10;
Toast.makeText(this,won,Toast.LENGTH_SHORT).show();
}
}
break;

case 9:
if((isx7==isx9&&isx8==isx9)||(isx3==isx9&&isx6==isx9)|| (isx1==isx9&&isx5==isx9))
{if(isx9==1)
{won="Player X Won!";chance=10;
Toast.makeText(this,won,Toast.LENGTH_SHORT).show();
}
else{won="Player O Won!";chance=10;
Toast.makeText(this,won,Toast.LENGTH_SHORT).show();
}
}
break;


  }
}

   @Override public void onClick(View v) { 
		if(v.getId()==R.id.a1) { 
if(isx1!=0||isx1!=1)
   {chance++;}
   if(chance<10)
			{if(p1==false&&c==true)
				{a1.setBackgroundResource(R.drawable.x);
				 p1=true;
				 c=false;
isx1=1;
    check(1);
				}
			else if(p1==false&&c==false){
				p1=true;
				c=true;
isx1=0;
				a1.setBackgroundResource(R.drawable.o);
check(1);}
 			}}
 		else if(v.getId()==R.id.a2) { 
if(isx2!=0||isx2!=1)
   {chance++;}
   if(chance<10){
 		if(p2==false&&c==true)
 		{a2.setBackgroundResource(R.drawable.x);
 		p2=true;
 		c=false;
isx2=1;
check(2);
 		}
 		else if(p2==false&&c==false){
 		p2=true;
 		c=true;
isx2=0;
 		a2.setBackgroundResource(R.drawable.o);
check(2);}
 		}}
 		else if(v.getId()==R.id.a3) { 
 if(isx3!=0||isx3!=1)
  { chance++;}
   if(chance<10){
 		if(p3==false&&c==true)
 		{a3.setBackgroundResource(R.drawable.x);
 		p3=true;
 		c=false; 
isx3=1;
check(3);
 		}
 		else if(p3==false&&c==false){
 		p3=true;
 		c=true;
 		a3.setBackgroundResource(R.drawable.o);
isx3=0;
check(3);}
 		}}
 		else if(v.getId()==R.id.a4) { 
 if(isx4!=0||isx4!=1)
   {chance++;}
   if(chance<10){
 		if(p4==false&&c==true)
 		{a4.setBackgroundResource(R.drawable.x);
 		p4=true;
 		c=false;
isx4=1;
check(4);
 		}
 		else if(p4==false&&c==false){
 		p4=true;
 		c=true;
 		a4.setBackgroundResource(R.drawable.o); 
isx4=0;
check(4);}
 		}}
 		
 		else if(v.getId()==R.id.a5) { 
 if(isx5!=0||isx5!=1)
   {chance++;}
   if(chance<10){
 		if(p5==false&&c==true)
 		{a5.setBackgroundResource(R.drawable.x);
 		p5=true;
 		c=false;
isx5=1;
check(5);
 		}
 		else if(p5==false&&c==false){
 		p5=true;
 		c=true;
 		a5.setBackgroundResource(R.drawable.o);
isx5=0;
check(5);}
 		}}
 		else if(v.getId()==R.id.a6) { if(isx6!=0||isx6!=1)
  { chance++;}
 
   if(chance<10){
 		if(p6==false&&c==true)
 		{a6.setBackgroundResource(R.drawable.x);
 		p6=true;
 		c=false;
isx6=1;
check(6);
 		}
 		else if(p6==false&&c==false){
 		p6=true;
 		c=true;
 		a6.setBackgroundResource(R.drawable.o);
isx6=0;
check(6);}
 		}}
 		else if(v.getId()==R.id.a7) { 
 if(isx7!=0||isx7!=1)
   {chance++;}
   if(chance<10){
 		if(p7==false&&c==true)
 		{a7.setBackgroundResource(R.drawable.x);
 		p7=true;
 		c=false;
isx7=1;
check (7);
 		}
 		else if(p7==false&&c==false){
 		p7=true;
 		c=true;
 		a7.setBackgroundResource(R.drawable.o);
isx7=0;
check(7);}
 		}}
 		
 		else if(v.getId()==R.id.a8) { 
 if(isx8!=0||isx8!=1)
 {  chance++;}
   if(chance<10){
 		if(p8==false&&c==true)
 		{a8.setBackgroundResource(R.drawable.x);
 		p8=true;
 		c=false;
isx8=1;
check(8);
 		}
 		else if(p8==false&&c==false){
 		p8=true;
 		c=true;
 		a8.setBackgroundResource(R.drawable.o);
isx8=0;
check(8);}
 		}}
 		else if(v.getId()==R.id.a9) { 
 if(isx9!=0||isx9!=1)
   {chance++;}
   if(chance<10){
 		if(p9==false&&c==true)
 		{a9.setBackgroundResource(R.drawable.x);
 		p9=true;
 		c=false;
isx9=1;
check(9);
 		}
 		else if(p9==false&&c==false){
 		p9=true;
 		c=true;
 		a9.setBackgroundResource(R.drawable.o);
isx9=0;
check(9);}
 		}}
   else if(v.getId()==R.id.r)
   {
a1.setBackgroundResource(R.drawable.blank);
a2.setBackgroundResource(R.drawable.blank);
a3.setBackgroundResource(R.drawable.blank);
a4.setBackgroundResource(R.drawable.blank);
a5.setBackgroundResource(R.drawable.blank);
a6.setBackgroundResource(R.drawable.blank);
a7.setBackgroundResource(R.drawable.blank);
a8.setBackgroundResource(R.drawable.blank);
a9.setBackgroundResource(R.drawable.blank);
 c=true;

 p1=false;
 p2=false;
 p3=false;
 p4=false;
 p5=false;
 p6=false;
 p7=false;
 p8=false;
 p9=false;

isx1=3;
 isx2=4;
 isx3=5;
 isx4=6;
 isx5=7;
 isx6=8;
 isx7=83;
 isx8=63;
 isx9=43;
chance=0;
    }
 		
 	
 		
	}



}