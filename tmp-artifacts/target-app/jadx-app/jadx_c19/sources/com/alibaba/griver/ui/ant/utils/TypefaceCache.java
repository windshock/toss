package com.alibaba.griver.ui.ant.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.alibaba.griver.base.common.logger.GriverLogger;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class TypefaceCache {
    public static TypefaceCache b;
    public final Map<String, WeakReference<Typeface>> a = new ConcurrentHashMap();

    public static TypefaceCache getInstance() {
        TypefaceCache typefaceCache;
        synchronized (TypefaceCache.class) {
            if (b == null) {
                b = new TypefaceCache();
            }
            typefaceCache = b;
        }
        return typefaceCache;
    }

    public static Typeface getTypeface(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str2)) {
            return null;
        }
        Typeface typefaceByCat = getInstance().getTypefaceByCat(str, str2);
        if (typefaceByCat == null) {
            try {
                typefaceByCat = Typeface.createFromAsset(context.getAssets(), str2);
            } catch (Exception unused) {
                GriverLogger.d("ExtConfigManager", "getExtTypeface error");
            }
            if (typefaceByCat != null) {
                getInstance().putTypeface(str, str2, typefaceByCat);
            }
        }
        return typefaceByCat;
    }

    public void clear() {
        this.a.clear();
    }

    public Typeface getTypefaceByCat(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        WeakReference<Typeface> weakReference = this.a.get(str + str2);
        if (weakReference != null && weakReference.get() != null) {
            return weakReference.get();
        }
        this.a.remove(str + str2);
        return null;
    }

    public void putTypeface(String str, String str2, Typeface typeface) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || typeface == null) {
            return;
        }
        this.a.put(str + str2, new WeakReference<>(typeface));
    }
}
