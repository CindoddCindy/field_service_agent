package com.ingenicomovement.fieldserviceagent.retrofit;

import com.ingenicomovement.fieldserviceagent.pojo.ResponseCloseAssign;
import com.ingenicomovement.fieldserviceagent.pojo.ResponseDetailAssign;
import com.ingenicomovement.fieldserviceagent.pojo.ResponseDoneAssign;
import com.ingenicomovement.fieldserviceagent.pojo.ResponseInProgAssign;
import com.ingenicomovement.fieldserviceagent.pojo.ResponseRevisitAssign;
import com.ingenicomovement.fieldserviceagent.pojo.ResponseStatusAssign;
import com.ingenicomovement.fieldserviceagent.pojo_auth.AuthLoginResponse;
import com.ingenicomovement.fieldserviceagent.pojo_post.ResponseSubmitJobs;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RetrofitMethod {

    @GET("api/jobs/assign-inprogress")
    Call<ResponseInProgAssign> getAssignInProgress(@Query("accountId") int accountId, @Query("skip") int skip,

                                                       @Query("dateTime") int dateTime, @Query("signature") String signature);

    @GET("api/jobs/assign-done")
    Call<ResponseDoneAssign> getAssignDone(@Query("accountId") int accountId, @Query("skip") int skip,

                                             @Query("dateTime") int dateTime, @Query("signature") String signature);

    @GET("jobs/assign-status")
    Call<ResponseStatusAssign> getAssignStatus(@Query("accountId") String accountId,
                                               @Query("dateTime") String dateTime, @Query("signature") String signature);

    @GET("api/jobs/assign-detail")
    Call<ResponseDetailAssign> getAssignDetail(@Query("accountId") int accountId,@Query("jobsId") int jobsId,
                                             @Query("dateTime") int dateTime, @Query("signature") String signature);

    @GET("api/jobs/assign-revisit")
    Call<ResponseRevisitAssign> getAssignRevisit(@Query("accountId") int accountId, @Query("skip") int skip,

                                                 @Query("dateTime") int dateTime, @Query("signature") String signature);


    @GET("api/jobs/assign-close")
    Call<ResponseCloseAssign> getAssignClose(@Query("accountId") int accountId, @Query("skip") int skip,

                                             @Query("dateTime") int dateTime, @Query("signature") String signature);



    @FormUrlEncoded
    @POST("auth/login")
    Call<AuthLoginResponse> loginUserTech(@Field("username") String username,
                                          @Field("password") String password,
                                          @Field("dateTime") String dateTime,
                                          @Field("signature") String signature);



/*
    @Multipart
    @POST("/imagefolder/index.php")
    Call<UploadObject> uploadFile(@Part MultipartBody.Part file, @Part("name") RequestBody name);

 */

    @FormUrlEncoded
    @POST("api/jobs/submit")
    Call<ResponseSubmitJobs> submitJobs(@Field("accountId") String accountId,
                                        @Field("jobsId") String jobsId,
                                        @Field("picName") String picName ,
                                        @Field("picNumber") String picNumber ,
                                        @Field("snEdc ") String snEdc,
                                        @Field("snSim ") String snSim,
                                        @Field("note ") String note,
                                        @Field("photoMerchant ") String photoMerchant,
                                        @Field(" photoEdc") String photoEdc,
                                        @Field("photoFormulir ") String photoFormulir,
                                        @Field("photoOthers ") String photoOthers,
                                        @Field("latitude ") String latitude,
                                        @Field("longitude ") String longitude ,
                                        @Field("status ") String status,
                                        @Field(" dateTime") String dateTime,
                                        @Field(" signature") String signature);





    ///metod test
    @GET("jobs/assign-done?accountId=1&skip=0&dateTime=20200420000000&signature=7f92cd4e71c23704912e39f149fcfbeb")
    Call<ResponseDoneAssign> getAssignDones();

    @GET("jobs/assign-status?accountId=1&dateTime=20200420000000&signature=7f92cd4e71c23704912e39f149fcfbeb")
    Call<ResponseStatusAssign> getAssignStatuss();

    @GET("jobs/assign-status?accountId=1&dateTime=20200420000000&signature=7f92cd4e71c23704912e39f149fcfbeb")
    Call<ResponseStatusAssign> getAssignStatusses();

    @GET("jobs/assign-inprogress?accountId=1&skip=0&dateTime=20200420000000&signature=7f92cd4e71c23704912e39f149fcfbeb")
    Call<ResponseInProgAssign> getAssignInProgressess();

    @GET("jobs/assign-revisit?accountId=1&skip=0&dateTime=20200420000000&signature=7f92cd4e71c23704912e39f149fcfbeb")
    Call<ResponseRevisitAssign> getAssignRevisitest();









}
