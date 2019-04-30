package com.example.cs125finaltrivia;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;

import org.json.JSONObject;

public class AppQuestions extends AppCompatActivity {

    String URL = "https://opentdb.com/api.php?amount=1&type=multiple";

    RequestQueue requestQueue = Volley.newRequestQueue(this);

    JsonObjectRequest objectRequest = new JsonObjectRequest(
            Request.Method.GET,
            URL,
            null,
            new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {
                    try {
                        JSONArray jsonArray = response.getJSONArray("results");

                        for (int i = 0; i < jsonArray.length(); i++) {
                            JSONObject jsonResults = jsonArray.getJSONObject(i);

                            /* Question and answers */
                            String question = jsonResults.getString("question");
                            String correctAnswer = jsonResults.getString("correct_answer");
                            JSONArray incorrectAnswersArray = response.getJSONArray("incorrect_answers");
                            for (int j = 0; j < incorrectAnswersArray.length(); j++) {
                                String incorrect1 = incorrectAnswersArray.getString(0);
                                String incorrect2 = incorrectAnswersArray.getString(1);
                                String incorrect3 = incorrectAnswersArray.getString(2);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            },
            new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.e("Rest Response",error.toString());
                }
            }
    );
}