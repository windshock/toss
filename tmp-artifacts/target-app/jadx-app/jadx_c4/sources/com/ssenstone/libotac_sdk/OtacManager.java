package com.ssenstone.libotac_sdk;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.TossApplication;
import o.setMeasurementCacheEnabled;
import o.setRecyclerView;
import o.shouldMeasureChild;
import o.shouldReMeasureChild;
import o.startSmoothScroll;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class OtacManager {
    private static Context mContext;
    private static NDKInterface ndkInterface;

    public OtacManager(Context context) {
        if (ndkInterface == null) {
            ndkInterface = new NDKInterface();
            mContext = context;
        }
        if (ndkInterface.otacInit(context) == 0) {
            generateRsa(context.getPackageName());
        }
    }

    private boolean addOtpUserData(String str, String str2, String str3, String str4, String str5, String str6) {
        setMeasurementCacheEnabled setmeasurementcacheenabledOnExtraCallbackWithResult = setMeasurementCacheEnabled.onExtraCallbackWithResult(mContext);
        SQLiteDatabase readableDatabase = setmeasurementcacheenabledOnExtraCallbackWithResult.getReadableDatabase();
        if (setmeasurementcacheenabledOnExtraCallbackWithResult.IAuthTabCallback(readableDatabase, str, str2)) {
            setmeasurementcacheenabledOnExtraCallbackWithResult.onWarmupCompleted(readableDatabase, str, str2);
        }
        startSmoothScroll startsmoothscroll = new startSmoothScroll();
        startsmoothscroll.IAuthTabCallback = str;
        startsmoothscroll.onWarmupCompleted = str2;
        startsmoothscroll.onExtraCallback = str3;
        startsmoothscroll.onExtraCallbackWithResult = str4;
        startsmoothscroll.onNavigationEvent = str5;
        startsmoothscroll.asInterface = str6;
        startsmoothscroll.IAuthTabCallbackDefault = "";
        return setmeasurementcacheenabledOnExtraCallbackWithResult.IAuthTabCallback(readableDatabase, startsmoothscroll);
    }

    private String endecryptAES(String str, String str2, String str3, boolean z) throws Throwable {
        try {
            if (!z) {
                return setRecyclerView.onExtraCallbackWithResult(mContext, str, str2, str3);
            }
            setRecyclerView.onExtraCallback(mContext, str, 1);
            return setRecyclerView.IAuthTabCallback(mContext, str, str2, str3);
        } catch (Exception unused) {
            return "";
        }
    }

    private String endecryptRSA(String str, String str2, int i, boolean z) {
        try {
            if (z) {
                return setRecyclerView.onNavigationEvent(str, str2, i);
            }
            return (String) setRecyclerView.onExtraCallback(TossApplication.onSessionEnded.onExtraCallback(), new Object[]{str, str2, Integer.valueOf(i)}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 832425670, TossApplication.onSessionEnded.onExtraCallback(), -832425670);
        } catch (Exception unused) {
            return "";
        }
    }

    private String generateRsa(String str) {
        try {
            return setRecyclerView.onWarmupCompleted(mContext, str);
        } catch (Exception unused) {
            return "";
        }
    }

    private String getDBData(String str, String str2, int i) {
        shouldReMeasureChild shouldremeasurechildOnExtraCallback = shouldReMeasureChild.onExtraCallback(mContext);
        SQLiteDatabase readableDatabase = shouldremeasurechildOnExtraCallback.getReadableDatabase();
        if (!shouldremeasurechildOnExtraCallback.asBinder(readableDatabase, str, str2)) {
            return null;
        }
        if (i == 1) {
            return shouldremeasurechildOnExtraCallback.onExtraCallbackWithResult(readableDatabase, str, str2);
        }
        if (i == 2) {
            return shouldremeasurechildOnExtraCallback.onNavigationEvent(readableDatabase, str, str2);
        }
        return null;
    }

    private String getHash(String str, int i) {
        if (i != 1) {
            return "";
        }
        try {
            return shouldMeasureChild.onExtraCallbackWithResult(str);
        } catch (Exception unused) {
            return "";
        }
    }

    private String getPublicKey(String str) {
        try {
            return setRecyclerView.onNavigationEvent(mContext, str);
        } catch (Exception unused) {
            return "";
        }
    }

    private boolean isExistsKey(String str) {
        try {
            Object[] objArr = {mContext, str};
            return ((Boolean) setRecyclerView.onExtraCallback(TossApplication.onSessionEnded.onExtraCallback(), objArr, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 1217161195, TossApplication.onSessionEnded.onExtraCallback(), -1217161194)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    private int updateFailCount(String str, String str2, String str3, boolean z) {
        shouldReMeasureChild shouldremeasurechildOnExtraCallback = shouldReMeasureChild.onExtraCallback(mContext);
        return shouldremeasurechildOnExtraCallback.onNavigationEvent(shouldremeasurechildOnExtraCallback.getReadableDatabase(), str, str2, str3, z);
    }

    private boolean updateOtpData(String str, String str2) {
        setMeasurementCacheEnabled setmeasurementcacheenabledOnExtraCallbackWithResult = setMeasurementCacheEnabled.onExtraCallbackWithResult(mContext);
        SQLiteDatabase readableDatabase = setmeasurementcacheenabledOnExtraCallbackWithResult.getReadableDatabase();
        startSmoothScroll startsmoothscrollOnExtraCallbackWithResult = setmeasurementcacheenabledOnExtraCallbackWithResult.onExtraCallbackWithResult(readableDatabase, str, str2);
        shouldReMeasureChild shouldremeasurechildOnExtraCallback = shouldReMeasureChild.onExtraCallback(mContext);
        SQLiteDatabase readableDatabase2 = shouldremeasurechildOnExtraCallback.getReadableDatabase();
        if (shouldremeasurechildOnExtraCallback.asBinder(readableDatabase2, str, str2)) {
            shouldremeasurechildOnExtraCallback.onExtraCallback(readableDatabase2, str, str2);
        }
        shouldremeasurechildOnExtraCallback.IAuthTabCallback(readableDatabase2, startsmoothscrollOnExtraCallbackWithResult);
        if (!setmeasurementcacheenabledOnExtraCallbackWithResult.IAuthTabCallback(readableDatabase, str, str2)) {
            return true;
        }
        setmeasurementcacheenabledOnExtraCallbackWithResult.onExtraCallback(readableDatabase, str, str2);
        return true;
    }

    public String SSGenerateOTAC(@Nullable String str, @Nullable String str2, @Nullable String str3, @NonNull String str4, @Nullable String str5, @Nullable String str6, @NonNull String str7, @Nullable String str8, @Nullable String str9, @NonNull String str10) {
        try {
            return ndkInterface.getOtac(mContext, str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
        } catch (Exception unused) {
            return "null";
        }
    }

    public String SSInitializeOTAC(@Nullable String str, @Nullable String str2, @Nullable String str3, @NonNull String str4, @NonNull String str5) {
        try {
            return ndkInterface.initializeOtac(mContext, str, str2, str3, str4, str5);
        } catch (Exception unused) {
            return "";
        }
    }

    public String SSRegisterDATA(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        try {
            return ndkInterface.getRegisterData(mContext, str, str2, str3, str4);
        } catch (Exception unused) {
            return "";
        }
    }

    public String getVersion() {
        return "{\"version\":\"1.0.4\"}";
    }
}
