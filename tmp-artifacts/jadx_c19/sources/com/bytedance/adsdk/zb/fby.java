package com.bytedance.adsdk.zb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import com.bytedance.adsdk.zb.lud.tn;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class fby {
    private static final Map<String, ry<ul>> ycx = new HashMap();
    private static final Set<Object> zb = new HashSet();
    private static final byte[] sya = {80, 75, 3, 4};

    public static ry<ul> ycx(Context context, String str) {
        return ycx(context, str, "url_".concat(String.valueOf(str)));
    }

    public static ry<ul> ycx(final Context context, final String str, final String str2) {
        return ycx(str2, new Callable<ok<ul>>() { // from class: com.bytedance.adsdk.zb.fby.1
            @Override // java.util.concurrent.Callable
            /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
            public ok<ul> call() throws Exception {
                ok<ul> okVarYcx = lud.ycx(context).ycx(context, str, str2);
                if (str2 != null && okVarYcx.ycx() != null) {
                    com.bytedance.adsdk.zb.sya.lud.ycx().ycx(str2, okVarYcx.ycx());
                }
                return okVarYcx;
            }
        });
    }

    public static ry<ul> zb(Context context, String str) {
        return zb(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static ry<ul> zb(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return ycx(str2, new Callable<ok<ul>>() { // from class: com.bytedance.adsdk.zb.fby.4
            @Override // java.util.concurrent.Callable
            /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
            public ok<ul> call() throws Exception {
                return fby.sya(applicationContext, str, str2);
            }
        });
    }

    public static ok<ul> sya(Context context, String str) {
        return sya(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static ok<ul> sya(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return zb(context.getAssets().open(str), str2);
            }
            return ycx(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new ok<>((Throwable) e);
        }
    }

    public static ry<ul> ycx(Context context, int i2) {
        return ycx(context, i2, sya(context, i2));
    }

    public static ry<ul> ycx(Context context, final int i2, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return ycx(str, new Callable<ok<ul>>() { // from class: com.bytedance.adsdk.zb.fby.5
            @Override // java.util.concurrent.Callable
            /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
            public ok<ul> call() throws Exception {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return fby.zb(context2, i2, str);
            }
        });
    }

    public static ok<ul> zb(Context context, int i2) {
        return zb(context, i2, sya(context, i2));
    }

    public static ok<ul> zb(Context context, int i2, String str) {
        try {
            return zb(context.getResources().openRawResource(i2), sya(context, i2));
        } catch (Resources.NotFoundException e) {
            return new ok<>((Throwable) e);
        }
    }

    private static String sya(Context context, int i2) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append(ycx(context) ? "_night_" : "_day_");
        sb.append(i2);
        return sb.toString();
    }

    private static boolean ycx(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static ry<ul> ycx(final InputStream inputStream, final String str) {
        return ycx(str, new Callable<ok<ul>>() { // from class: com.bytedance.adsdk.zb.fby.6
            @Override // java.util.concurrent.Callable
            /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
            public ok<ul> call() throws Exception {
                return fby.zb(inputStream, str);
            }
        });
    }

    public static ok<ul> zb(InputStream inputStream, String str) {
        return ycx(inputStream, str, true);
    }

    private static ok<ul> ycx(InputStream inputStream, String str, boolean z) throws IOException {
        try {
            return ycx(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                com.bytedance.adsdk.zb.lt.lt.ycx(inputStream);
            }
        }
    }

    public static ok<ul> ycx(JsonReader jsonReader, String str) {
        return ycx(jsonReader, str, true);
    }

    private static ok<ul> ycx(JsonReader jsonReader, String str, boolean z) throws IOException {
        try {
            try {
                ul ulVarYcx = tn.ycx(jsonReader);
                com.bytedance.adsdk.zb.sya.lud.ycx().ycx(str, ulVarYcx);
                ok<ul> okVar = new ok<>(ulVarYcx);
                if (z) {
                    ycx(jsonReader);
                }
                return okVar;
            } catch (Exception e) {
                ok<ul> okVar2 = new ok<>(e);
                if (z) {
                    ycx(jsonReader);
                }
                return okVar2;
            }
        } catch (Throwable th) {
            if (z) {
                ycx(jsonReader);
            }
            throw th;
        }
    }

    public static void ycx(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static ok<ul> ycx(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return zb(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.zb.lt.lt.ycx(zipInputStream);
        }
    }

    private static ok<ul> zb(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            ul ulVarYcx = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    ulVarYcx = ycx(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).ycx();
                } else if (name.endsWith(".png") || name.endsWith(".webp") || name.endsWith(".jpg") || name.endsWith(".jpeg")) {
                    if (name.contains("../")) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        String[] strArrSplit = name.split("/");
                        map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                } else if (name.endsWith(".ttf") || name.endsWith(".otf")) {
                    if (name.contains("../")) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        String[] strArrSplit2 = name.split("/");
                        String str2 = strArrSplit2[strArrSplit2.length - 1];
                        String str3 = str2.split("\\.")[0];
                        File file = new File(context.getCacheDir(), str2);
                        new FileOutputStream(file);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i2 = zipInputStream.read(bArr);
                                    if (i2 == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i2);
                                }
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } finally {
                            }
                        } catch (Throwable unused) {
                        }
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            file.getAbsolutePath();
                        }
                        map2.put(str3, typefaceCreateFromFile);
                    }
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (ulVarYcx == null) {
                return new ok<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                jc jcVarYcx = ycx(ulVarYcx, (String) entry.getKey());
                if (jcVarYcx != null) {
                    jcVarYcx.ycx(com.bytedance.adsdk.zb.lt.lt.ycx((Bitmap) entry.getValue(), jcVarYcx.ycx(), jcVarYcx.zb()));
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean z = false;
                for (com.bytedance.adsdk.zb.sya.sya syaVar : ulVarYcx.syc().values()) {
                    if (syaVar.ycx().equals(entry2.getKey())) {
                        syaVar.ycx((Typeface) entry2.getValue());
                        z = true;
                    }
                }
                if (!z) {
                }
            }
            if (map.isEmpty()) {
                Iterator<Map.Entry<String, jc>> it = ulVarYcx.dy().entrySet().iterator();
                while (it.hasNext()) {
                    jc value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String strJw = value.jw();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (strJw.startsWith("data:") && strJw.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(strJw.substring(strJw.indexOf(44) + 1), 0);
                            value.ycx(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                        } catch (IllegalArgumentException unused2) {
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, jc> entry3 : ulVarYcx.dy().entrySet()) {
                if (entry3.getValue().ea() == null) {
                    return new ok<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().jw()));
                }
            }
            if (str != null) {
                com.bytedance.adsdk.zb.sya.lud.ycx().ycx(str, ulVarYcx);
            }
            return new ok<>(ulVarYcx);
        } catch (IOException e) {
            return new ok<>((Throwable) e);
        }
    }

    private static jc ycx(ul ulVar, String str) {
        for (jc jcVar : ulVar.dy().values()) {
            if (jcVar.jw().equals(str)) {
                return jcVar;
            }
        }
        return null;
    }

    private static ry<ul> ycx(final String str, Callable<ok<ul>> callable) {
        final ul ulVarYcx = str == null ? null : com.bytedance.adsdk.zb.sya.lud.ycx().ycx(str);
        if (ulVarYcx != null) {
            return new ry<>(new Callable<ok<ul>>() { // from class: com.bytedance.adsdk.zb.fby.7
                @Override // java.util.concurrent.Callable
                /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
                public ok<ul> call() throws Exception {
                    return new ok<>(ulVarYcx);
                }
            });
        }
        if (str != null) {
            Map<String, ry<ul>> map = ycx;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        ry<ul> ryVar = new ry<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ryVar.ycx(new ea<ul>() { // from class: com.bytedance.adsdk.zb.fby.2
                @Override // com.bytedance.adsdk.zb.ea
                public void ycx(ul ulVar) {
                    fby.ycx.remove(str);
                    atomicBoolean.set(true);
                    if (fby.ycx.size() == 0) {
                        fby.zb(true);
                    }
                }
            });
            ryVar.sya(new ea<Throwable>() { // from class: com.bytedance.adsdk.zb.fby.3
                @Override // com.bytedance.adsdk.zb.ea
                public void ycx(Throwable th) {
                    fby.ycx.remove(str);
                    atomicBoolean.set(true);
                    if (fby.ycx.size() == 0) {
                        fby.zb(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, ry<ul>> map2 = ycx;
                map2.put(str, ryVar);
                if (map2.size() == 1) {
                    zb(false);
                }
            }
        }
        return ryVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zb(boolean z) {
        ArrayList arrayList = new ArrayList(zb);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2);
        }
    }
}
