package com.example.roshan.nepxchange.Networking;

import java.util.List;
import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface APIInterface {

//    @POST("/api/v1/users/token")
//    Observable<LoginResponse> getUserToken(@Body UserParamsLogin userParamsLogin);
//
//    @POST("/api/v1/forget/password")
//    Observable<GenericResponse> forgotPassword(@Body ForgotRequest paramForgot);
//
//    @POST("/api/v1/change/password")
//    Observable<GenericResponse> resetPassword(@Body ResetRequest paramRequest);
//
//
//    @POST("/api/v1/users")
//    Observable<RegisterUserResponse> registerUser(@Body UserParamsRegister paramsRegister);
//
//
//    @POST("/api/v1/users/activate")
//    Observable<VerifyResponse> verifyUser(@Body VerifyParams params);
//
//    @POST("/api/v1/users/activation-code")
//    Observable<GenericResponse> setupUserProfile(@Body UserParamsProfileSetup params);
//
//    @POST("/api/v1/users/verify_mobile")
//    Observable<VerifyResponse> verifyMobileFacebook(@Query("enable_code") String enableCode);
//
//
//    @Multipart
//    @POST("/api/v1/user/image")
//    Observable<GenericResponse> uploadProfileImage(@Part MultipartBody.Part filePart);
//
//
//    @GET("/api/v1/vehicles/filter/{filter}")
//    Observable<GetBikeResponse> getBikes(@Path("filter") String filter, @Query("offset") String offset, @Query("limit") String limit);
//
//    @GET("/api/v1/vehicles/filter/{filter}")
//    Observable<GetBikeResponse> demo_getBikes(@Path("filter") String filter, @Query("offset") String offset,@Query("limit") String limit);
//
//
//    @GET("/api/v1/vehicles/properties")
//    Observable<GetBikePropertyResponse> getBikeProperties();
//
//    @Multipart
//    @POST("/api/v1/vehicles")
//    Observable<SaveBikeResponse> saveBike(@Part List<MultipartBody.Part> parts, @PartMap Map<String, RequestBody> partmap);
//
//    @POST("/api/v1/notify-seller")
//    @FormUrlEncoded
//    Observable<NotifySellerForInfoResponse> notify(@Field("vehicle_id") int id);
//
////    @GET("/api/v1/notification/seller")
////    Observable<NotificationResponse> getBuyNotifications();
////
////
////    @GET("/api/v1/notification/all")
////    Observable<NotificationResponse> getSellNotification();
//
//    @GET(Constants.Notification_ClearUrl)
//    Observable<SeenNotification> clearNotification();
//
//    @GET("/api/v1/notification/all")
//    Observable<NotificationUpdate> getNotificationUpdate();
//
//    @POST("/api/v1/save-fcm-token")
//    @FormUrlEncoded
//    Observable<SaveFcmIdResponse> saveFCmToken(@Field("fcm_token") String refreshedToken);
//
//    @GET("/api/v1/transactions")
//    Observable<TransactionHistoryResponse> getTransactionHistory();
//
//    @PUT("/api/v1/notifications/{status}")
//    Observable<CommonResponse> changeNotificationStatus(@Path("status") int status,@Query("vehicle_id") int id,
//                                                        @Query("notification_id") int id1 , @Query("filter") String filter);
//    @PUT("/api/v1/notifications/{status}")
//    Observable<CommonResponse> changeNotificationStatus(@Path("status") int status,
//                                                        @Query("notification_id") int id1 , @Query("filter") String filter);
//
//
//    @GET("/api/v1/wishlist/{filter}/{ID}")
//    Observable<WishList> addRemoveWishList(@Path("filter") String filter, @Path("ID") String id);
//
//
//    @GET("/api/v1/gen-productid")
//    Observable<ProductIDResponse> generateProductId(@Query("credit") int credit, @Query("rate") int rate);
//
//    @POST("/api/v1/qr-codes")
//    @FormUrlEncoded
//    Observable<GetQRCodeResponse> generateQRCode(@Field("credit") int credit);
//
//    @GET("/api/v1/profile")
//    Observable<MyProfileResponse> getProfile();
//
//    @PUT("/api/v1/qr-codes/{code}")
//    Observable<PurchaseDataRes> confirmPurchasedData(@Path("code") String code,@Query("id") int id);
//
//
//    @POST("/api/v1/shop-notification")
//    @FormUrlEncoded
//    Observable<CreditRequestResponse> requestCredit(@Field("seller_id") int sellerId, @Field("credit") int credit);
//
//    @GET("/api/v1/shops")
//    Observable<ShopResponse> getShops(@Query("latitude") double lat, @Query("longitude") double lon);
//
//
//    @GET("/api/v1/search")
//    Observable<GetBikeResponse> searchVehicles(@Query("brand") String brand, @Query("model") String model,  @Query("price") String price, @Query("offset") String offset,@Query("limit") String limit,@Query("rating")int rating);
//
//
//
//    @POST("/api/v1/via-code")
//    @FormUrlEncoded
//    Observable<ManualPinResponse> matchPin(@Field("via_code") String via_code);


}
