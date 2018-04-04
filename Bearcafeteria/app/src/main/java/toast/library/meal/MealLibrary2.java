package toast.library.meal;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by 이민석 on 2018-04-04.
 */

public class MealLibrary2{
    String name;
    String output;
    List<Item> info;

    public String getName() {
        return name;
    }

    public String getOutput() {
        return output;
    }

    public List<Item> getInfo() {
        return info;
    }

    public class Item {

        String name;
        String output;

        String name() {
            return name;
        }

        String output() {
            return output;
        }
    }

    public interface RetrofitService {
        @GET("index.php")
        Call<RetrofitService> getIndex(@Query("name") String name);

        @GET("test.php")
        Call<RetrofitService> getItem(@QueryMap Map<String, String>, option);
    }


}
