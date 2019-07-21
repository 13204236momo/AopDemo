package com.example.aopdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.aopdemo.annotation.ClickBehavior;

public class MainActivity extends AppCompatActivity {


    private final String TAG = "AOPDEMO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @ClickBehavior("登录")
    public void login(View view) {
        Log.e(TAG,"模拟登录请求...验证通过，登陆成功");
    }

    //用户行为统计
    @ClickBehavior("评论")
    public void remark(View view) {
        Log.e(TAG,"评论 --> 评论、点赞、转发界面");
        startActivity(new Intent(this,ContentActivity.class));
    }

    //用户行为统计
    @ClickBehavior("点赞")
    public void zan(View view) {
        Log.e(TAG,"点赞 --> 评论、点赞、转发界面");
        startActivity(new Intent(this,ContentActivity.class));
    }

    //用户行为统计
    @ClickBehavior("转发")
    public void transmit(View view) {
        Log.e(TAG,"转发 --> 评论、点赞、转发界面");
        startActivity(new Intent(this,ContentActivity.class));
    }
}
