package com.iap.ac.android.loglite.core;

import android.text.TextUtils;
import com.iap.ac.android.loglite.utils.BizCodeMatchUtils;
import com.iap.ac.android.loglite.utils.LoggerWrapper;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class DefaultLogEncryptClient implements LogEncryptClient {
    public String decrypt(String str) {
        try {
            String strA = BizCodeMatchUtils.a(str, "µµÿðæáýæÜÀáãëÐÛÐÜòÏîñúËÂ", "¹º»¼½¾¿°±¸¹º»¼½¾");
            if (TextUtils.isEmpty(strA) && !TextUtils.isEmpty(str)) {
                LoggerWrapper.w("DefaultLogEncryptClient", "decrypt value error!! value = " + str);
            }
            return strA;
        } catch (Throwable th) {
            LoggerWrapper.w("DefaultLogEncryptClient", th);
            return null;
        }
    }

    public String encrypt(String str) {
        try {
            String strB = BizCodeMatchUtils.b(str, "µµÿðæáýæÜÀáãëÐÛÐÜòÏîñúËÂ", "¹º»¼½¾¿°±¸¹º»¼½¾");
            if (TextUtils.isEmpty(strB) && !TextUtils.isEmpty(str)) {
                LoggerWrapper.w("DefaultLogEncryptClient", "encrypt value error!! value = " + str);
            }
            return strB;
        } catch (Throwable th) {
            LoggerWrapper.w("DefaultLogEncryptClient", th);
            return null;
        }
    }
}
