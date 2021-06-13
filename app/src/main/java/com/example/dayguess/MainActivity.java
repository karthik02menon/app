package com.example.dayguess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MainActivity<i> extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            TextView question = (TextView) findViewById(R.id.question);
            question.setText((CharSequence) new randomDate());

        }
        public static class randomDate{
            public String main(String[] args){
                SimpleDateFormat dfDate = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                int year = randomDate.randbetween(1900,2100);
                int month = randomDate.randbetween(0,11);

                GregorianCalendar gc=new GregorianCalendar(year , month , 1);
                int day= randomDate.randbetween(1 , gc.getActualMaximum(gc.DAY_OF_MONTH));
                gc.set(year,month,day);
                String finalDate = gc.get(GregorianCalendar.DAY_OF_MONTH) + "/" +
                        gc.get(GregorianCalendar.MONTH + 1) + "/" +
                        gc.get(GregorianCalendar.YEAR);
                return finalDate;
            }

            public static int randbetween(int start, int end){
                return start + (int)Math.round(Math.random()*(end-start));
            }
        }
        public static class getDay{
            public String main(String[] args){
                Date finalDate= new Date();
                Calendar c = Calendar.getInstance();
                c.setTime(finalDate);
                String dayWeekText = new SimpleDateFormat("EEEE").format(finalDate);
                System.out.println(dayWeekText);
                String answer = dayWeekText;
                return answer;
            }

        }
        public static class opts{
            public void main(String[] args){
                String answer=new String();
                if(answer=="Monday") {
                    String[] days = {"Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
                    String no1 = days[(int) Math.round(Math.random() * 6)];
                    String answer1=no1;
                    String no2 = days[(int) Math.round(Math.random() * 6)];
                    if (no2 == no1) {
                        no2 = days[(int) Math.round(Math.random() * 6)];
                    }
                    String answer2=no2;
                    String no3 = days[(int) Math.round(Math.random() * 6)];
                    if (no3 == no2 || no3 == no1) {
                        no3 = days[(int) Math.round(Math.random() * 6)];
                    }
                    String answer3=no3;
                }
                else if(answer=="Tuesday"){
                    String[] days1={"Monday","Wednesday","Thursday","Friday","Saturday","Sunday"};
                    String no11=days1[(int)Math.round(Math.random()*6)];
                    String answer1=no11;
                    String no21=days1[(int)Math.round(Math.random()*6)];
                    if (no21==no11){
                        no21=days1[(int)Math.round(Math.random()*6)];
                    }
                    String answer2=no21;
                    String no31=days1[(int)Math.round(Math.random()*6)];
                    if(no31==no21 ||no31==no11){
                        no31=days1[(int)Math.round(Math.random()*6)];
                    }
                    String answer3=no31;
                }
                else if(answer=="Wednesday"){
                    String[] days2={"Tuesday","Monday","Thursday","Friday","Saturday","Sunday"};
                    String no12=days2[(int)Math.round(Math.random()*6)];
                    String answer1=no12;
                    String no22=days2[(int)Math.round(Math.random()*6)];
                    if (no22==no12){
                        no22=days2[(int)Math.round(Math.random()*6)];
                    }
                    String answer2=no22;
                    String no32=days2[(int)Math.round(Math.random()*6)];
                    if(no32==no22 ||no32==no12){
                        no32=days2[(int)Math.round(Math.random()*6)];
                    }
                    String answer3=no32;
                }
                else if(answer=="Thursday"){
                    String[] days3={"Tuesday","Wednesday","Monday","Friday","Saturday","Sunday"};
                    String no13=days3[(int)Math.round(Math.random()*6)];
                    String answer1=no13;
                    String no23=days3[(int)Math.round(Math.random()*6)];
                    if (no23==no13){
                        no23=days3[(int)Math.round(Math.random()*6)];
                    }String answer2=no23;
                    String no33=days3[(int)Math.round(Math.random()*6)];
                    if(no33==no23 ||no33==no13){
                        no33=days3[(int)Math.round(Math.random()*6)];
                    }String answer3=no33;

                }
                else if(answer=="Friday"){
                    String[] days4={"Tuesday","Wednesday","Monday","Thursday","Saturday","Sunday"};
                    String no14=days4[(int)Math.round(Math.random()*6)];
                    String answer1=no14;
                    String no24=days4[(int)Math.round(Math.random()*6)];
                    if (no24==no14){
                        no24=days4[(int)Math.round(Math.random()*6)];
                    }String answer2=no24;
                    String no34=days4[(int)Math.round(Math.random()*6)];
                    if(no34==no24 ||no34==no14){
                        no34=days4[(int)Math.round(Math.random()*6)];
                    }String answer3=no34;

                }
                else if(answer=="Saturday"){
                    String[] days5={"Tuesday","Wednesday","Monday","Friday","Thursday","Sunday"};
                    String no15=days5[(int)Math.round(Math.random()*6)];
                    String answer1=no15;
                    String no25=days5[(int)Math.round(Math.random()*6)];
                    if (no25==no15){
                        no25=days5[(int)Math.round(Math.random()*6)];
                    }String answer2=no25;
                    String no35=days5[(int)Math.round(Math.random()*6)];
                    if(no35==no25 ||no35==no15){
                        no35=days5[(int)Math.round(Math.random()*6)];
                    }String answer3=no35;

                }
                else if(answer=="Sunday"){
                    String[] days6={"Tuesday","Wednesday","Monday","Friday","Saturday","Thursday"};
                    String no16=days6[(int)Math.round(Math.random()*6)];
                    String answer1=no16;
                    String no26=days6[(int)Math.round(Math.random()*6)];
                    if (no26==no16){
                        no26=days6[(int)Math.round(Math.random()*6)];
                    }String answer2=no26;
                    String no36=days6[(int)Math.round(Math.random()*6)];
                    if(no36==no26 ||no36==no16){
                        no36=days6[(int)Math.round(Math.random()*6)];
                    }String answer3=no36;

                }

            }
        }
        public class getopt{
            public int main(String[] args){
                opts answer3 = new opts();
                opts answer1 = new opts();
                opts answer2 = new opts();
                int op = (int) (Math.round(Math.random() * 4) + 1);
                if (op==1){
                    Button option1=(Button) findViewById(R.id.option1);
                    option1.setText((CharSequence) new getDay());
                    int op2 = (int) (Math.round(Math.random() * 3) + 1);
                    if (op2==1){
                        Button option4=(Button) findViewById(R.id.option4);
                        option4.setText((CharSequence)new answer3);
                    }
                    else if (op2==2){
                        Button option2=(Button) findViewById(R.id.option2);
                        option2.setText((CharSequence)new answer3);
                    }
                    else if (op2==3){
                        Button option3=(Button) findViewById(R.id.option3);
                        option3.setText((CharSequence)new answer3);
                    }
                    int op3 = (int) (Math.round(Math.random() * 3) + 1);
                    if (op3==1){
                        Button option4=(Button) findViewById(R.id.option4);
                        option4.setText((CharSequence)new answer2);
                    }
                    else if (op3==2){
                        Button option2=(Button) findViewById(R.id.option2);
                        option2.setText((CharSequence)new answer2);
                    }
                    else if (op3==3){
                        Button option3=(Button) findViewById(R.id.option3);
                        option3.setText((CharSequence)new answer2);
                    }
                    int op4 = (int) (Math.round(Math.random() * 3) + 1);
                    if (op4==1){
                        Button option4=(Button) findViewById(R.id.option4);
                        option4.setText((CharSequence)new answer1);
                    }
                    else if (op4==2){
                        Button option2=(Button) findViewById(R.id.option2);
                        option2.setText((CharSequence)new answer1);
                    }
                    else if (op4==3){
                        Button option3=(Button) findViewById(R.id.option3);
                        option3.setText((CharSequence)new answer1);
                    }



                }
                else if (op==2){
                    Button option2=(Button) findViewById(R.id.option2);
                    option2.setText((CharSequence) new getDay());
                    int op2 = (int) (Math.round(Math.random() * 3) + 1);
                    if (op2==1){
                        Button option4=(Button) findViewById(R.id.option4);
                        option4.setText((CharSequence)new opts.answer3());
                    }
                    else if (op2==2){
                        Button option1=(Button) findViewById(R.id.option1);
                        option1.setText((CharSequence)new answer3);
                    }
                    else if (op2==3){
                        Button option3=(Button) findViewById(R.id.option3);
                        option3.setText((CharSequence)new answer3);
                    }
                    int op3 = (int) (Math.round(Math.random() * 3) + 1);
                    if (op3==1){
                        Button option4=(Button) findViewById(R.id.option4);
                        option4.setText((CharSequence)new answer2);
                    }
                    else if (op3==2){
                        Button option1=(Button) findViewById(R.id.option2);
                        option1.setText((CharSequence)new answer1);
                    }
                    else if (op3==3){
                        Button option3=(Button) findViewById(R.id.option3);
                        option3.setText((CharSequence)new answer2);
                    }
                    int op4 = (int) (Math.round(Math.random() * 3) + 1);
                    if (op4==1){
                        Button option4=(Button) findViewById(R.id.option4);
                        option4.setText((CharSequence)new answer1);
                    }
                    else if (op4==2){
                        Button option1=(Button) findViewById(R.id.option1);
                        option1.setText((CharSequence)new answer1);
                    }
                    else if (op4==3){
                        Button option3=(Button) findViewById(R.id.option3);
                        option3.setText((CharSequence)new answer1);
                    }


                }
                else if (op==3){
                    Button option3=(Button) findViewById(R.id.option3);
                    option3.setText((CharSequence) new getDay());
                    int op2 = (int) (Math.round(Math.random() * 3) + 1);
                    if (op2==1){
                        Button option4=(Button) findViewById(R.id.option4);
                        option4.setText((CharSequence)new opts.answer3());
                    }
                    else if (op2==2){
                        Button option2=(Button) findViewById(R.id.option2);
                        option2.setText((CharSequence)new answer3);
                    }
                    else if (op2==3){
                        Button option1=(Button) findViewById(R.id.option1);
                        option1.setText((CharSequence)new answer3);
                    }
                    int op3 = (int) (Math.round(Math.random() * 3) + 1);
                    if (op3==1){
                        Button option4=(Button) findViewById(R.id.option4);
                        option4.setText((CharSequence)new answer2);
                    }
                    else if (op3==2){
                        Button option2=(Button) findViewById(R.id.option2);
                        option2.setText((CharSequence)new answer2);
                    }
                    else if (op3==3){
                        Button option1=(Button) findViewById(R.id.option1);
                        option1.setText((CharSequence)new answer2);
                    }
                    int op4 = (int) (Math.round(Math.random() * 3) + 1);
                    if (op4==1){
                        Button option4=(Button) findViewById(R.id.option4);
                        option4.setText((CharSequence)new answer1);
                    }
                    else if (op4==2){
                        Button option2=(Button) findViewById(R.id.option2);
                        option2.setText((CharSequence)new answer1);
                    }
                    else if (op4==3){
                        Button option3=(Button) findViewById(R.id.option3);
                        option3.setText((CharSequence)new answer1);
                    }


                }
                else if (op==4){
                    Button option4=(Button) findViewById(R.id.option4);
                    option4.setText((CharSequence) new getDay());
                    int op2 = (int) (Math.round(Math.random() * 3) + 1);
                    if (op2==1){
                        Button option1=(Button) findViewById(R.id.option1);
                        option1.setText((CharSequence)new opts.answer3());
                    }
                    else if (op2==2){
                        Button option2=(Button) findViewById(R.id.option2);
                        option2.setText((CharSequence)new answer3);
                    }
                    else if (op2==3){
                        Button option3=(Button) findViewById(R.id.option3);
                        option3.setText((CharSequence)new answer3);
                    }
                    int op3 = (int) (Math.round(Math.random() * 3) + 1);
                    if (op3==1){
                        Button option1=(Button) findViewById(R.id.option1);
                        option1.setText((CharSequence)new answer1);
                    }
                    else if (op3==2){
                        Button option2=(Button) findViewById(R.id.option2);
                        option2.setText((CharSequence)new answer2);
                    }
                    else if (op3==3){
                        Button option3=(Button) findViewById(R.id.option3);
                        option3.setText((CharSequence)new answer2);
                    }
                    int op4 = (int) (Math.round(Math.random() * 3) + 1);
                    if (op4==1){
                        Button option1=(Button) findViewById(R.id.option1);
                        option1.setText((CharSequence)new answer1);
                    }
                    else if (op4==2){
                        Button option2=(Button) findViewById(R.id.option2);
                        option2.setText((CharSequence)new answer1);
                    }
                    else if (op4==3){
                        Button option3=(Button) findViewById(R.id.option3);
                        option3.setText((CharSequence)new answer1);
                    }


                }

            }

    }

}
