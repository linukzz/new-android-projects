package bear.coding.ex07_04;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;


/**
 * Created by 이민석 on 2018-03-01.
 */

public class MySQLiteHandler {

    MySQLiteOpenHelper helper;
    SQLiteDatabase db;

    public MySQLiteHandler(Context ctx) {
        helper = new MySQLiteOpenHelper(ctx,"person.sqlite", null, 1);
    }

    //데이터베이스open
    public static MySQLiteHandler open(Context ctx) {
        return new MySQLiteHandler(ctx);
    }

    //데이터베이스 close
    public void close() {
        helper.close();
    }

    /// 여기까진 여닫이만 생성.





     // public void insert(String name, int age, String address) {
     //   db = helper.getWritableDatabase();
     //   String sql = "insert into student (name, age, address)" +
     //           "values('"+name+"','"+age+"'+'"+address+"')";

     //    db.execSQL(sql);
     //   }

    // 저장할 데이터가 많은 경우에 가독성도 떨어지고 single quotes를 실수로 지정하지 않으면
    // 에러 발생도 높아 권장 X



     public void insert(String name, int age, String address) {
         db = helper.getWritableDatabase();
         ContentValues values = new ContentValues();
         values.put("name", name);
         values.put("age", age);
         values.put("address", address);

         db.insert("student", null, values);
     }

     // insert 메소드에 들어가는 인자는 name, age, address이다.
     // 새로운 contentValues를 지정.
     // getWriteableDatabase()로 데이터들을 읽고 쓸 수 있게 한다.
     // name, address, address에 각각이 값이 넣어진다.
     // db에서 삽입되는 테이블, null, 데이터를 집어넣는다.
     // 여기까지 insert 구현


     public void update(String name, int newAge) {
         db = helper.getWritableDatabase();
         ContentValues values = new ContentValues();
         values.put("age", newAge);
         String sql = "update student set age=" +newAge+ "where name=' "+name+" ' ";

         db.execSQL(sql);
     }


     public void delete(String name ) {
         db = helper.getWritableDatabase();

         db.delete("student", "name=?", new String[]{ name });
     }

     //delete 메소드 활용해서 delete 구문 생성


    public void select( ) {

        db = helper.getReadableDatabase();
        String sql ="select _id, name, age, address from student";

        Cursor c = db.rawQuery( sql, null);

        while( c.moveToNext() ) {
            int _id = c.getInt( c.getColumnIndex("_id"));
            String name = c.getString(c.getColumnIndex("name"));
            int age = c.getInt(c.getColumnIndex("age"));
            String address = c.getString(c.getColumnIndex("address"));
            Log.i("My Tag", _id + "" + name + "" + age + "" + address);
        }

    }











}
