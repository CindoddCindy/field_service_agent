package com.ingenicomovement.fieldserviceagent.retrofit;

import com.ingenicomovement.fieldserviceagent.pojo.AssignShopeeResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitMethod {

    @GET("api/jobs/assign?accountId=1&skip=0&dateTime=20200420000000&signature=7f92cd4e71c23704912e39f149fcfbeb")
    Call<AssignShopeeResponse> getShpeeAsignInProgress();



}
