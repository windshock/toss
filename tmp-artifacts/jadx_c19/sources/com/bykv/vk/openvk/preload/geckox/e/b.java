package com.bykv.vk.openvk.preload.geckox.e;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class b {
    private final Map<String, a> a = new HashMap();
    private AtomicBoolean b = new AtomicBoolean(false);
    private String c;

    public b(Context context, String str, File file) {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("access key empty");
        }
        if (file == null) {
            this.c = new File(context.getFilesDir(), "gecko_offline_res_x" + File.separator + str).getAbsolutePath();
            return;
        }
        this.c = new File(file, str).getAbsolutePath();
    }

    public final String a() {
        return this.c;
    }

    public final InputStream a(String str) throws Exception {
        if (this.b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return d(str.trim()).a(str);
    }

    public final int b(String str) throws Exception {
        if (this.b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return d(str.trim()).c(str);
    }

    public final boolean c(String str) throws Exception {
        if (this.b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return d(str.trim()).b(str);
    }

    private a d(String str) {
        a aVar;
        int iIndexOf = str.indexOf("/");
        if (iIndexOf == -1) {
            new RuntimeException("channel：".concat(str));
        }
        String strSubstring = str.substring(0, iIndexOf);
        synchronized (this.a) {
            aVar = this.a.get(strSubstring);
            if (aVar == null) {
                aVar = new a(this.c, strSubstring);
                this.a.put(strSubstring, aVar);
            }
        }
        return aVar;
    }

    public final Map<String, Long> b() {
        HashMap map = new HashMap();
        synchronized (this.a) {
            Collection<a> collectionValues = this.a.values();
            if (collectionValues == null) {
                return map;
            }
            for (a aVar : collectionValues) {
                map.put(aVar.b(), aVar.a());
            }
            return map;
        }
    }

    public final void c() throws Exception {
        if (this.b.getAndSet(true)) {
            return;
        }
        GeckoLogger.d("Loader", new Object[]{"release version res loader"});
        synchronized (this.a) {
            Iterator<a> it = this.a.values().iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.a.clear();
        }
    }
}
