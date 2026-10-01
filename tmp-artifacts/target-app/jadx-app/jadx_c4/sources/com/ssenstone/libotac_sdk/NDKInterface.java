package com.ssenstone.libotac_sdk;

import android.content.Context;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class NDKInterface {
    static {
        System.loadLibrary("otac_android");
    }

    public native String getOtac(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10);

    public native String getRegisterData(Context context, String str, String str2, String str3, String str4);

    public native String initializeOtac(Context context, String str, String str2, String str3, String str4, String str5);

    public native int otacInit(Context context);
}
