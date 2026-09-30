package com.bytedance.sdk.openadsdk.xkz.ycx.ycx;

import android.content.ContentValues;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.sdk.openadsdk.core.model.tn;
import com.bytedance.sdk.openadsdk.core.pmi;
import com.bytedance.sdk.openadsdk.oty.sya;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int[] onExtraCallback = {1619802078, -1410755197, -1125212189, 1122879857, 984409684, -1680730191, -1088630483, 1632039278, -1336968571, -147705450, -1190245426, -1657691588, 1051798094, -571416840, 1777829578, -1494452004, 1744025123, -215035045};
    private static int onWarmupCompleted;
    private static volatile zb ycx;
    private final WeakReference<ConcurrentHashMap<String, tn>> zb = new WeakReference<>(new ConcurrentHashMap());

    private zb() {
    }

    public static zb ycx() {
        if (ycx == null) {
            synchronized (zb.class) {
                if (ycx == null) {
                    ycx = new zb();
                }
            }
        }
        return ycx;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r14 != (-1)) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r14 != (-1)) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        r14 = r2.getString(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String ycx(String str) {
        com.bytedance.sdk.openadsdk.uh.ycx.ycx ycxVar;
        int columnIndex;
        int i2 = 2 % 2;
        Object obj = null;
        if (TextUtils.isEmpty(str)) {
            int i3 = IAuthTabCallback + 117;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        try {
            ycxVar = new com.bytedance.sdk.openadsdk.uh.ycx.ycx(com.bytedance.sdk.openadsdk.core.ul.zb.ycx(pmi.ycx(), "iab_history_material", new String[]{"material"}, "material_key=?", new String[]{str}, null, null, null));
            try {
            } catch (Throwable th) {
                th = th;
                try {
                    sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "XOs5uAKobNWJS9t/lTyhPF78JJQPl2ze", 92);
                    if (ycxVar != null) {
                        ycxVar.close();
                    }
                    int i4 = IAuthTabCallback + 69;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return null;
                } catch (Throwable th2) {
                    if (ycxVar != null) {
                        ycxVar.close();
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            ycxVar = null;
        }
        if (ycxVar.moveToFirst()) {
            int i6 = IAuthTabCallback + 29;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                columnIndex = ycxVar.getColumnIndex("material");
                int i7 = 34 / 0;
            } else {
                columnIndex = ycxVar.getColumnIndex("material");
            }
            int i42 = IAuthTabCallback + 69;
            onWarmupCompleted = i42 % 128;
            int i52 = i42 % 2;
            return null;
        }
        ycxVar.close();
        int i422 = IAuthTabCallback + 69;
        onWarmupCompleted = i422 % 128;
        int i522 = i422 % 2;
        return null;
    }

    private static void a(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallback;
        int i4 = -1469660336;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = $11 + 15;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 2;
            }
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), Color.green(0) + 72, 8847 - MotionEvent.axisFromString(""), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallback;
        int i8 = 16;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                try {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i9])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> i8), 72 - (Process.myTid() >> 22), 8848 - ((Process.getThreadPriority(0) + 20) >> 6), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i9++;
                    i4 = -1469660336;
                    i8 = 16;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                int i12 = $10 + 107;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ViewConfiguration.getTouchSlop() >> 8)), Color.green(0) + 39, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i10++;
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 4033), Gravity.getAbsoluteGravity(0, 0) + 78, KeyEvent.normalizeMetaState(0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public void ycx(com.bytedance.sdk.openadsdk.xkz.ycx.ycx ycxVar) {
        com.bytedance.sdk.openadsdk.uh.ycx.ycx ycxVar2;
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Object obj = null;
        if (ycxVar != null && !TextUtils.isEmpty(ycxVar.ul())) {
            try {
                ContentValues contentValues = new ContentValues();
                Object[] objArr = new Object[1];
                a(new int[]{2043059075, 1842413326}, 3 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
                contentValues.put(((String) objArr[0]).intern(), ycxVar.lud());
                contentValues.put("main_title", ycxVar.dj());
                contentValues.put("material_key", ycxVar.ul());
                contentValues.put("time", ycxVar.lt());
                contentValues.put("item_index", Integer.valueOf(ycxVar.zb()));
                contentValues.put("sdk_version", ycxVar.ycx());
                com.bytedance.sdk.openadsdk.core.ul.zb.ycx(pmi.ycx(), "iab_history", contentValues);
                String strSya = ycxVar.sya();
                if (!TextUtils.isEmpty(strSya)) {
                    try {
                        ycxVar2 = new com.bytedance.sdk.openadsdk.uh.ycx.ycx(com.bytedance.sdk.openadsdk.core.ul.zb.ycx(pmi.ycx(), "iab_history_material", new String[]{"count"}, "material_key=?", new String[]{ycxVar.ul()}, null, null, null));
                        try {
                            if (ycxVar2.moveToFirst()) {
                                int columnIndex = ycxVar2.getColumnIndex("count");
                                if (columnIndex != -1) {
                                    i2 = ycxVar2.getInt(columnIndex);
                                } else {
                                    int i4 = IAuthTabCallback + 55;
                                    onWarmupCompleted = i4 % 128;
                                    int i5 = i4 % 2;
                                    i2 = 0;
                                }
                                z = true;
                            } else {
                                i2 = 0;
                                z = false;
                            }
                            ycxVar2.close();
                            if (z) {
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("count", Integer.valueOf(i2 + 1));
                                com.bytedance.sdk.openadsdk.core.ul.zb.ycx(pmi.ycx(), "iab_history_material", contentValues2, "material_key=?", new String[]{ycxVar.ul()});
                                return;
                            } else {
                                ContentValues contentValues3 = new ContentValues();
                                contentValues3.put("material_key", ycxVar.ul());
                                contentValues3.put("material", strSya);
                                contentValues3.put("sdk_version", ycxVar.ycx());
                                contentValues3.put("count", (Integer) 0);
                                com.bytedance.sdk.openadsdk.core.ul.zb.ycx(pmi.ycx(), "iab_history_material", contentValues3);
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (ycxVar2 != null) {
                                int i6 = onWarmupCompleted + 61;
                                IAuthTabCallback = i6 % 128;
                                if (i6 % 2 == 0) {
                                    ycxVar2.close();
                                    int i7 = 48 / 0;
                                } else {
                                    ycxVar2.close();
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        ycxVar2 = null;
                    }
                }
            } catch (Throwable th3) {
                sya.ycx(th3, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "UuA+kBGoQc6TXthPlQ==", 175);
            }
        }
        int i8 = onWarmupCompleted + 27;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void zb(com.bytedance.sdk.openadsdk.xkz.ycx.ycx ycxVar) {
        com.bytedance.sdk.openadsdk.uh.ycx.ycx ycxVar2;
        int i2 = 2 % 2;
        if (ycxVar != null && !TextUtils.isEmpty(ycxVar.ul())) {
            try {
                ContentValues contentValues = new ContentValues();
                int i3 = 0;
                Object[] objArr = new Object[1];
                a(new int[]{2043059075, 1842413326}, 3 - Drawable.resolveOpacity(0, 0), objArr);
                contentValues.put(((String) objArr[0]).intern(), ycxVar.lud());
                contentValues.put("main_title", ycxVar.dj());
                contentValues.put("material_key", ycxVar.ul());
                contentValues.put("time", ycxVar.lt());
                contentValues.put("item_index", Integer.valueOf(ycxVar.zb()));
                contentValues.put("sdk_version", ycxVar.ycx());
                com.bytedance.sdk.openadsdk.core.ul.zb.ycx(pmi.ycx(), "iab_history", contentValues);
                String strSya = ycxVar.sya();
                if (!TextUtils.isEmpty(strSya)) {
                    try {
                        ycxVar2 = new com.bytedance.sdk.openadsdk.uh.ycx.ycx(com.bytedance.sdk.openadsdk.core.ul.zb.ycx(pmi.ycx(), "iab_history_material", new String[]{"count"}, "material_key=?", new String[]{ycxVar.ul()}, null, null, null));
                        try {
                            if (ycxVar2.moveToFirst()) {
                                int columnIndex = ycxVar2.getColumnIndex("count");
                                if (columnIndex != -1) {
                                    int i4 = onWarmupCompleted + 97;
                                    IAuthTabCallback = i4 % 128;
                                    int i5 = i4 % 2;
                                    i3 = ycxVar2.getInt(columnIndex);
                                }
                            }
                            ycxVar2.close();
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("material_key", ycxVar.ul());
                            contentValues2.put("material", strSya);
                            contentValues2.put("sdk_version", ycxVar.ycx());
                            contentValues2.put("count", Integer.valueOf(i3 + 1));
                            com.bytedance.sdk.openadsdk.core.ul.zb.zb(pmi.ycx(), "iab_history_material", contentValues2);
                            int i6 = IAuthTabCallback + 105;
                            onWarmupCompleted = i6 % 128;
                            int i7 = i6 % 2;
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (ycxVar2 != null) {
                                ycxVar2.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        ycxVar2 = null;
                    }
                }
            } catch (Throwable th3) {
                sya.ycx(th3, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "UuA+kBGoRtW1WtNcmBSIIUj6Ioca", 227);
                int i8 = onWarmupCompleted + 65;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        int i10 = onWarmupCompleted + 29;
        IAuthTabCallback = i10 % 128;
        int i11 = i10 % 2;
    }

    public List<com.bytedance.sdk.openadsdk.xkz.ycx.ycx> zb() {
        com.bytedance.sdk.openadsdk.uh.ycx.ycx ycxVar;
        Throwable th;
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Object obj = null;
        try {
            ycxVar = new com.bytedance.sdk.openadsdk.uh.ycx.ycx(com.bytedance.sdk.openadsdk.core.ul.zb.ycx(pmi.ycx(), "iab_history", null, null, null, null, null, "time DESC"));
        } catch (Throwable th2) {
            ycxVar = null;
            th = th2;
        }
        try {
            if (ycxVar.moveToFirst()) {
                do {
                    int columnIndex = ycxVar.getColumnIndex("_id");
                    Object[] objArr = new Object[1];
                    a(new int[]{2043059075, 1842413326}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3, objArr);
                    int columnIndex2 = ycxVar.getColumnIndex(((String) objArr[0]).intern());
                    int columnIndex3 = ycxVar.getColumnIndex("main_title");
                    int columnIndex4 = ycxVar.getColumnIndex("material_key");
                    int columnIndex5 = ycxVar.getColumnIndex("time");
                    int columnIndex6 = ycxVar.getColumnIndex("item_index");
                    if (columnIndex != -1) {
                        int i3 = IAuthTabCallback + 21;
                        onWarmupCompleted = i3 % 128;
                        if (i3 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1 && columnIndex5 != -1) {
                            ycxVar.getString(columnIndex);
                            com.bytedance.sdk.openadsdk.xkz.ycx.ycx ycxVar2 = new com.bytedance.sdk.openadsdk.xkz.ycx.ycx();
                            ycxVar2.zb(ycxVar.getInt(columnIndex6));
                            ycxVar2.ycx(columnIndex);
                            ycxVar2.zb(ycxVar.getString(columnIndex4));
                            ycxVar2.lud(ycxVar.getString(columnIndex2));
                            ycxVar2.dj(ycxVar.getString(columnIndex3));
                            ycxVar2.sya(ycxVar.getString(columnIndex5));
                            arrayList.add(ycxVar2);
                        }
                    }
                } while (ycxVar.moveToNext());
            }
            ycxVar.close();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            try {
                sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "XOs5tA+wQc6TXthPlQ==", 270);
                int i4 = onWarmupCompleted + 59;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 40 / 0;
                }
                return arrayList;
            } finally {
                if (ycxVar != null) {
                    ycxVar.close();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        r1.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        r1 = com.bytedance.sdk.openadsdk.xkz.ycx.ycx.zb.IAuthTabCallback + 29;
        com.bytedance.sdk.openadsdk.xkz.ycx.ycx.zb.onWarmupCompleted = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        if (r1 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
    
        if (r1 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void sya() {
        ConcurrentHashMap<String, tn> concurrentHashMap;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 93;
        onWarmupCompleted = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                com.bytedance.sdk.openadsdk.core.ul.zb.ycx(pmi.ycx(), "iab_history", null, null);
                com.bytedance.sdk.openadsdk.core.ul.zb.ycx(pmi.ycx(), "iab_history_material", null, null);
                concurrentHashMap = this.zb.get();
                int i4 = 64 / 0;
            } else {
                com.bytedance.sdk.openadsdk.core.ul.zb.ycx(pmi.ycx(), "iab_history", null, null);
                com.bytedance.sdk.openadsdk.core.ul.zb.ycx(pmi.ycx(), "iab_history_material", null, null);
                concurrentHashMap = this.zb.get();
            }
        } catch (Throwable th) {
            sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "WOIolBGdZcuoQ8RJgwO5", 294);
        }
    }

    public void dj() {
        int i2 = 2 % 2;
        try {
            ArrayList arrayList = new ArrayList();
            int iUl = ul();
            if (iUl > 1000) {
                arrayList.addAll(ycx(iUl - 1000));
            }
            for (String str : ycx(System.currentTimeMillis() - 2592000000L)) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.utils.zb.lud()) {
                sya(arrayList);
                int i3 = onWarmupCompleted + 111;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            } else {
                zb(arrayList);
            }
            ycx(arrayList);
        } catch (Throwable th) {
            sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "WOYolgidZ8OjRtJcgjmpO0/hP4w=", 332);
            int i5 = onWarmupCompleted + 9;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 92 / 0;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    private List<String> ycx(long j) {
        com.bytedance.sdk.openadsdk.uh.ycx.ycx ycxVar;
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        try {
            ycxVar = new com.bytedance.sdk.openadsdk.uh.ycx.ycx(com.bytedance.sdk.openadsdk.core.ul.zb.ycx(pmi.ycx(), "iab_history", new String[]{"_id"}, "time < ?", new String[]{String.valueOf(j)}, null, null, "time ASC"));
        } catch (Throwable th) {
            th = th;
            ycxVar = null;
        }
        try {
            if (!(!ycxVar.moveToFirst())) {
                do {
                    arrayList.add(ycxVar.getString(0));
                } while (ycxVar.moveToNext());
                int i3 = IAuthTabCallback + 61;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            }
            ycxVar.close();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            try {
                sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "XOs5sBusYNWFTv9UnwWvOkLHKYY=", 355);
                if (ycxVar != null) {
                    ycxVar.close();
                    int i5 = IAuthTabCallback + 91;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                }
                return arrayList;
            } catch (Throwable th3) {
                if (ycxVar != null) {
                    ycxVar.close();
                }
                throw th3;
            }
        }
    }

    private int ul() {
        Throwable th;
        com.bytedance.sdk.openadsdk.uh.ycx.ycx ycxVar;
        int i2 = 2 % 2;
        try {
            ycxVar = new com.bytedance.sdk.openadsdk.uh.ycx.ycx(com.bytedance.sdk.openadsdk.core.ul.zb.ycx(pmi.ycx(), "iab_history", new String[]{"COUNT(*)"}, null, null, null, null, null));
            try {
            } catch (Throwable th2) {
                th = th2;
                try {
                    sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "XOs5vQqvfciSU/RSmR+0", 381);
                    if (ycxVar != null) {
                        int i3 = IAuthTabCallback + 115;
                        onWarmupCompleted = i3 % 128;
                        int i4 = i3 % 2;
                        ycxVar.close();
                        int i5 = IAuthTabCallback + 41;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                    }
                    return 0;
                } catch (Throwable th3) {
                    if (ycxVar != null) {
                        ycxVar.close();
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            ycxVar = null;
        }
        if (!ycxVar.moveToFirst()) {
            ycxVar.close();
            return 0;
        }
        int i7 = IAuthTabCallback + 41;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        int i9 = ycxVar.getInt(0);
        ycxVar.close();
        return i9;
    }

    /* JADX WARN: Finally extract failed */
    private List<String> ycx(int i2) {
        com.bytedance.sdk.openadsdk.uh.ycx.ycx ycxVar;
        int i3 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        try {
            ycxVar = new com.bytedance.sdk.openadsdk.uh.ycx.ycx(com.bytedance.sdk.openadsdk.core.ul.zb.ycx(pmi.ycx(), "iab_history", new String[]{"_id"}, null, null, null, null, "time ASC"));
            try {
                if (ycxVar.moveToFirst()) {
                    int i4 = 0;
                    while (i4 < i2) {
                        arrayList.add(ycxVar.getString(0));
                        i4++;
                        if (!ycxVar.moveToNext()) {
                            break;
                        }
                    }
                }
                ycxVar.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                try {
                    sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "XOs5ug+4bNSUYt5OmB6yMXLqPg==", 414);
                    if (ycxVar != null) {
                        ycxVar.close();
                        int i5 = IAuthTabCallback + 95;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                    }
                    int i7 = IAuthTabCallback + 19;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    return arrayList;
                } catch (Throwable th2) {
                    if (ycxVar != null) {
                        ycxVar.close();
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            ycxVar = null;
        }
    }

    private void ycx(List<String> list) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 101;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (!list.isEmpty()) {
            try {
                com.bytedance.sdk.openadsdk.core.ul.zb.ycx(pmi.ycx(), "iab_history", "_id IN (" + TextUtils.join(",", Collections.nCopies(list.size(), "?")) + ")", (String[]) list.toArray(new String[0]));
                return;
            } catch (Throwable th) {
                sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "X+shkBe5Qc6TXthPlTO5AV/9", 435);
                return;
            }
        }
        int i5 = onWarmupCompleted + 17;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private void zb(List<String> list) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 63;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            if (list.isEmpty()) {
                return;
            }
            try {
                com.bytedance.sdk.openadsdk.uh.ycx.ycx ycxVar = new com.bytedance.sdk.openadsdk.uh.ycx.ycx(com.bytedance.sdk.openadsdk.core.ul.zb.ycx(pmi.ycx(), "iab_history", new String[]{"material_key"}, "_id IN (" + TextUtils.join(",", Collections.nCopies(list.size(), "?")) + ")", (String[]) list.toArray(new String[0]), null, null, null));
                ArrayList<String> arrayList = new ArrayList();
                if (ycxVar.moveToFirst()) {
                    do {
                        arrayList.add(ycxVar.getString(0));
                    } while (ycxVar.moveToNext());
                }
                ycxVar.close();
                for (String str : arrayList) {
                    int iZb = zb(str);
                    if (iZb > 0) {
                        int i4 = IAuthTabCallback + 85;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        ycx(str, iZb - 1);
                    }
                    if (iZb <= 0) {
                        sya(str);
                    }
                }
                return;
            } catch (Throwable th) {
                sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "X+shkBe5RMaUT8VUjR2CMXPnPoEMrnDuhFk=", 477);
                return;
            }
        }
        list.isEmpty();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void sya(List<String> list) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 43;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            list.isEmpty();
            throw null;
        }
        if (list.isEmpty()) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.uh.ycx.ycx ycxVar = new com.bytedance.sdk.openadsdk.uh.ycx.ycx(com.bytedance.sdk.openadsdk.core.ul.zb.ycx(pmi.ycx(), "iab_history", new String[]{"material_key"}, "_id IN (" + TextUtils.join(",", Collections.nCopies(list.size(), "?")) + ")", (String[]) list.toArray(new String[0]), null, null, null));
            ArrayList<String> arrayList = new ArrayList();
            if (ycxVar.moveToFirst()) {
                do {
                    arrayList.add(ycxVar.getString(0));
                } while (ycxVar.moveToNext());
            }
            ycxVar.close();
            for (String str : arrayList) {
                int i4 = IAuthTabCallback + 103;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int iZb = zb(str) - 1;
                if (iZb > 0) {
                    ycx(str, iZb);
                } else {
                    sya(str);
                }
            }
        } catch (Throwable th) {
            sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "X+shkBe5R8KXZ9ZJiQOpKVfMNL0Kr33IklP+WZ8=", 512);
            int i6 = onWarmupCompleted + 57;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private int zb(String str) {
        com.bytedance.sdk.openadsdk.uh.ycx.ycx ycxVar;
        int i2 = 2 % 2;
        try {
            ycxVar = new com.bytedance.sdk.openadsdk.uh.ycx.ycx(com.bytedance.sdk.openadsdk.core.ul.zb.ycx(pmi.ycx(), "iab_history_material", new String[]{"count"}, "material_key=?", new String[]{str}, null, null, null));
        } catch (Throwable th) {
            th = th;
            ycxVar = null;
        }
        try {
            if (ycxVar.moveToFirst()) {
                int i3 = IAuthTabCallback + 77;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int i5 = ycxVar.getInt(0);
                ycxVar.close();
                return i5;
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "XOs5uAKobNWJS9t+gwSuPA==", 530);
                if (ycxVar != null) {
                    int i6 = IAuthTabCallback + 75;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    ycxVar.close();
                }
                return 0;
            } catch (Throwable th3) {
                if (ycxVar != null) {
                    ycxVar.close();
                }
                throw th3;
            }
        }
        ycxVar.close();
        return 0;
    }

    private void ycx(String str, int i2) {
        int i3 = 2 % 2;
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("count", Integer.valueOf(i2));
            com.bytedance.sdk.openadsdk.core.ul.zb.ycx(pmi.ycx(), "iab_history_material", contentValues, "material_key=?", new String[]{str});
            int i4 = IAuthTabCallback + 53;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "Tv4plBe5RMaUT8VUjR2DJ07gOQ==", 549);
        }
    }

    private void sya(String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        try {
            com.bytedance.sdk.openadsdk.core.ul.zb.ycx(pmi.ycx(), "iab_history_material", "material_key=?", new String[]{str});
            int i5 = onWarmupCompleted + 119;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 70 / 0;
            }
        } catch (Throwable th) {
            sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PvQqvfciSU/NfpBSsOF78", "X+shkBe5RMaUT8VUjR2CMXDrNA==", 560);
        }
    }

    public static String lud() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 47;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return "CREATE TABLE IF NOT EXISTS iab_history (_id INTEGER PRIMARY KEY AUTOINCREMENT,url TEXT,main_title TEXT,material_key TEXT,time TEXT,item_index INTEGER,sdk_version TEXT)";
        }
        throw null;
    }

    public static String lt() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 87;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i5 = i3 + 73;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return "CREATE TABLE IF NOT EXISTS iab_history_material (material_key TEXT PRIMARY KEY,material TEXT,sdk_version TEXT,count INTEGER DEFAULT 0)";
    }
}
