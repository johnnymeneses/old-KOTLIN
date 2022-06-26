package com.johnny.kotlin_android.data;

import com.johnny.kotlin_android.domain.Match;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesAPI {

    @GET("matches.json")

    Call<List<Match>> getMatches();


}
