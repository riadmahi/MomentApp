package com.application.moment.NotificationsUtils

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST
interface APIService {
    @Headers(
        "Content-Type:application/json",
        "Authorization:key=AAAABCy4Xl0:APA91bGF645BnYpfLIZpGxKcMX7jdquQdbQD4j_yoe1KheM2e5RjQLGXZem4vPtGlnb0mvNfwhYFxVwhti7LoXw2gYaM67zRaF0hSidgr4SPlM8cE8IWsCoLX-JhOsFuV3TfmUnQPyG9"
    )
    @POST("fcm/send")
    fun sendNotification(@Body body: NotificationSender?): Call<MyResponse?>
}