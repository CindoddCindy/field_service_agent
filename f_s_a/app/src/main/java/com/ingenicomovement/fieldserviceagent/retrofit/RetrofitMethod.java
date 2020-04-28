package com.ingenicomovement.fieldserviceagent.retrofit;

import com.ingenicomovement.fieldserviceagent.pojo.AssignDataResponse;
import com.ingenicomovement.fieldserviceagent.pojo.AuthLoginResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RetrofitMethod {

    @GET("api/jobs/assign?accountId=1&skip=0&dateTime=20200420000000&signature=7f92cd4e71c23704912e39f149fcfbeb")
    Call<AssignDataResponse> getShpeeAsignInProgress();

    @GET("api/jobs/assign-detail?accountId=1&jobsId=3&dateTime=20200420000000&signature=7f92cd4e71c23704912e39f149fcfbeb")
    Call<AssignDataResponse> getShpeeAsignInProgressDetail();

    @FormUrlEncoded
    @POST("api/auth/login")
    Call<AuthLoginResponse> loginUserTech(@Field("username") String username,
                                          @Field("password") String password,
                                          @Field("dateTime") String dateTime,
                                          @Field("signature") String signature);




}
