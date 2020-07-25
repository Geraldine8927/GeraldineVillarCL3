package com.example.geraldinevillarcl3.rest

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SharedMemory.create
import com.example.geraldinevillarcl3.tools.Constantes

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

class RestServicio {
    private var retrofit: Retrofit? = null

    class Retrofit {
        class Builder {
            fun baseUrl(endpoint: String): Any {

            }

        }

    }

    public fun getSERVICIO(): Retrofit? {
        if (retrofit == null){
            val gson = GsonBuilder().setLenient().create()
            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY
            val client = OkHttpClient.Builder()
                .addInterceptor(logging)
                .build()
            retrofit = Retrofit.Builder()
                .baseUrl(Constantes.ENDPOINT)
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
        }
        return retrofit
    }

    class RxJava2CallAdapterFactory {

    }

    class OkHttpClient {

    }

    class GsonConverterFactory {

    }

    class HttpLoggingInterceptor {

    }

    class GsonBuilder {
        fun setLenient(): Any {

        }

    }
}