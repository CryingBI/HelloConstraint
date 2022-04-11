package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    //Khai báo thêm 2 biến
    private Button mCountUp;
    private Button mZeroBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);

        //2 biến tạm lấy id của 2 button count và zero
        mCountUp = (Button) findViewById(R.id.button_count);
        mZeroBack = (Button) findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        //Nếu kết quả mCount nhận về số chẵn thì set màu button Count = RED
        if(mCount % 2 == 0){
            mCountUp.setBackgroundColor(Color.RED);
        //Ngược lại thì set màu button Count = BLUE
        }else{
            mCountUp.setBackgroundColor(Color.BLUE);
        }
        //Nếu biến mCount khác 0, tức là button Zero có thể kích hoạt, set màu button Zero = GREEN
        if(mCount != 0) {
            mZeroBack.setBackgroundColor(Color.GREEN);
        }

    }
    // Đưa giá trị trong TextView về 0 khi người dùng ấn button Zero
    public void backToZero(View view) {
        if (mShowCount != null) {
            mCount = 0;
            mShowCount.setText(Integer.toString(mCount));
        }
        //Set lại màu của button Zero = GRAY
        mZeroBack.setBackgroundColor(Color.GRAY);
    }
}