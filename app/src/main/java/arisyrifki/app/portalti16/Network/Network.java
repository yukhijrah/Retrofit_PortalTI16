package arisyrifki.app.portalti16.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by rfkchrl on 11/26/2018.
 */

public class Network {
    public static Retrofit request(){
        return new Retrofit.Builder()
                .baseUrl("https://ti16-api.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

}
