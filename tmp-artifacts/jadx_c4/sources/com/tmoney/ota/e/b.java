package com.tmoney.ota.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.CryptoHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class b {
    private static volatile b a;
    private SharedPreferences d;
    private String f;
    private int g;
    private String h;
    private final String b = "pref.ota";
    private final String c = "OtaInfo";
    private int e = 10000;

    private b(Context context) {
        this.f = "";
        SharedPreferences sharedPreferences = context.getSharedPreferences("pref.ota", 0);
        this.d = sharedPreferences;
        this.f = sharedPreferences.getString("OtaInfo", "");
        this.g = TmoneyData.getInstance(context).getServerType();
    }

    public static b getInstance(Context context) {
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new b(context);
                }
            }
        }
        return a;
    }

    public String getOtaInfo() {
        String str = this.h;
        if (str == null || TextUtils.isEmpty(str)) {
            this.h = CryptoHelper.decode(this.f);
        }
        return this.h;
    }

    public int getTimeOut() {
        return this.e;
    }

    public String getUrl() {
        return com.tmoney.d.a.getInstance().getOtaUrl(this.g);
    }

    public void setOtaInfo(String str) {
        this.h = null;
        this.f = CryptoHelper.encode(str);
        SharedPreferences.Editor editorEdit = this.d.edit();
        editorEdit.putString("OtaInfo", this.f);
        editorEdit.apply();
    }
}
