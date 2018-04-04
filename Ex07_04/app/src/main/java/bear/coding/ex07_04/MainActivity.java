package bear.coding.ex07_04;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //1. 데이터베이스 open
        MySQLiteHandler handler =
                MySQLiteHandler.open(getApplication());

        //2. 데이터 저장
        handler.insert("홍길동", 20, "서울");
        handler.insert("이순신", 45, "전라");

        //3. 데이터 수정
        handler.update("홍길동",100);

        //4.데이터 삭제
        handler.delete("이순신");

        //5. 데이터 조회
        handler.select();

        //6. 데이터베이스 close
        handler.close();
    }

}
