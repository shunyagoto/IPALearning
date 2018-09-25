package com.example.agoto.ipalearning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Date date=new Date();//現在の日付

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onIPAhyouButtonTapped(View view){
        CSVFileWriter(date);
        Intent intent = new Intent(this, IPAtableActivity.class);
        startActivity(intent);
    }
        public static void CSVFileWriter(Date date) {

            try {
                //出力先の作成
                FileWriter fw = new FileWriter("f:\\test.csv", true);  //trueでファイルの最後に書き込みを指定
                PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

                //内容を指定する
                pw.print("アプリ起動日時");
                pw.print(",");
                pw.print("アプリ終了日時");
                pw.print(",");
                pw.print("");
                pw.println();


                pw.print(date);
                pw.print(",");
                pw.println();

                //ファイルに書き出す
                pw.close();

                //終了メッセージを画面に出力する
                System.out.println("出力が完了しました。");

            } catch (IOException ex) {
                //例外時処理
                ex.printStackTrace();
            }
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // BackBtnアクション
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
        }
        return true;
    }

}


