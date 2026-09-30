package com.iap.ac.android.acs.operation.biz.region.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class GriverOperationStorageProvider {
    private static final String SP_PREFIX = "GriverOperation_sp";
    private static final String TAG = "GriverOperationStorageProvider";
    private SharedPreferences sharedPreferences;

    public GriverOperationStorageProvider(@NonNull Context context, @NonNull String str) {
        if (context == null) {
            RVLogger.e(TAG, "ACStorageProvider, Context should not be null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            RVLogger.e(TAG, "ACStorageProvider, bizType should not be null");
            return;
        }
        this.sharedPreferences = context.getSharedPreferences(SP_PREFIX + str, 0);
    }

    public boolean save(String str, String str2) {
        synchronized (this) {
            if (TextUtils.isEmpty(str)) {
                RVLogger.e(TAG, "ACStorageProvider, key should not be null, save fail for key: " + str + ", value: " + str2);
                return false;
            }
            try {
                this.sharedPreferences.edit().putString(str, str2).apply();
                return true;
            } catch (Exception e) {
                RVLogger.e(TAG, "ACStorageProvider, save exception: " + e);
                return false;
            }
        }
    }

    public String fetch(String str) {
        synchronized (this) {
            if (TextUtils.isEmpty(str)) {
                RVLogger.e(TAG, "ACStorageProvider, fetch, key should not be null, return null");
                return null;
            }
            try {
                if (!this.sharedPreferences.contains(str)) {
                    RVLogger.e(TAG, "ACStorageProvider, fetch, value of key " + str + " does not exist, return null");
                    return null;
                }
                return this.sharedPreferences.getString(str, "");
            } catch (Exception e) {
                RVLogger.e(TAG, "ACStorageProvider, fetch exception: " + e);
                return null;
            }
        }
    }

    public boolean delete(String str) {
        synchronized (this) {
            if (TextUtils.isEmpty(str)) {
                RVLogger.e(TAG, "ACStorageProvider, delete, key should not be null, delete failed.");
                return false;
            }
            try {
                this.sharedPreferences.edit().remove(str).apply();
                return true;
            } catch (Exception e) {
                RVLogger.e(TAG, "ACStorageProvider, delete exception: " + e);
                return false;
            }
        }
    }

    public boolean clear() {
        synchronized (this) {
            try {
                this.sharedPreferences.edit().clear().apply();
            } catch (Exception e) {
                RVLogger.e(TAG, "ACStorageProvider, clear exception: " + e);
                return false;
            }
        }
        return true;
    }
}
