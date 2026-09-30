package com.iap.ac.android.acs.operation.biz.region.storage;

import android.content.Context;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class RegionEncryptStorageProvider {
    private static final String BIZ_TYPE_FOR_SECURITY_STORAGE = "RegionManagerSecData";
    private static volatile RegionEncryptStorageProvider instance;
    private final GriverOperationStorageProvider mGriverOperationStorageProvider;

    private RegionEncryptStorageProvider(Context context) {
        this.mGriverOperationStorageProvider = new GriverOperationStorageProvider(context, BIZ_TYPE_FOR_SECURITY_STORAGE);
    }

    public static RegionEncryptStorageProvider getInstance(Context context) {
        if (instance == null) {
            synchronized (RegionEncryptStorageProvider.class) {
                if (instance == null) {
                    instance = new RegionEncryptStorageProvider(context);
                }
            }
        }
        return instance;
    }

    public boolean save(String str, String str2) {
        return this.mGriverOperationStorageProvider.save(str, str2);
    }

    public String get(String str) {
        return this.mGriverOperationStorageProvider.fetch(str);
    }

    public boolean delete(String str) {
        return this.mGriverOperationStorageProvider.delete(str);
    }

    public boolean clear() {
        return this.mGriverOperationStorageProvider.clear();
    }
}
