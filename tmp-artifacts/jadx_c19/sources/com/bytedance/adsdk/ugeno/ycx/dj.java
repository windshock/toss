package com.bytedance.adsdk.ugeno.ycx;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ExpandableListView;
import com.bytedance.adsdk.ugeno.ycx.sya;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj {
    private static final byte[] $$a = {75, -35, 114, 51};
    private static final int $$b = 190;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallback = 1;
    private static char[] onNavigationEvent = {60858, 31476, 49979, 10354};
    private static long IAuthTabCallback = 2518327554261547669L;

    private static String $$c(int i2, int i3, short s) {
        int i4 = 97 - (i2 * 2);
        byte[] bArr = $$a;
        int i5 = (i3 * 2) + 4;
        int i6 = s * 2;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        int i8 = -1;
        if (bArr == null) {
            i4 += i7;
            i5++;
        }
        while (true) {
            i8++;
            bArr2[i8] = (byte) i4;
            if (i8 == i7) {
                return new String(bArr2, 0);
            }
            i4 += bArr[i5];
            i5++;
        }
    }

    public static int ycx(int i2) {
        int i3 = 2 % 2;
        if (i2 < 0) {
            return -1;
        }
        if (i2 != 0) {
            return i2 - 1;
        }
        int i4 = onExtraCallback;
        int i5 = i4 + 121;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 91;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r1 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r4 = new org.json.JSONArray(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r4.length() > 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r2 >= r4.length()) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        r7 = com.bytedance.adsdk.ugeno.ycx.dj.onExtraCallback + 103;
        com.bytedance.adsdk.ugeno.ycx.dj.onWarmupCompleted = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if ((r7 % 2) != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        r7 = r4.optJSONObject(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r7 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        r5 = com.bytedance.adsdk.ugeno.ycx.dj.onWarmupCompleted + 29;
        com.bytedance.adsdk.ugeno.ycx.dj.onExtraCallback = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        r1.add(ycx(r7, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        r2 = r2 + 1;
        r7 = com.bytedance.adsdk.ugeno.ycx.dj.onWarmupCompleted + 93;
        com.bytedance.adsdk.ugeno.ycx.dj.onExtraCallback = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        r4.optJSONObject(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        throw new java.lang.RuntimeException(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (android.text.TextUtils.isEmpty(r7) != true) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (android.text.TextUtils.isEmpty(r7) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r7 = com.bytedance.adsdk.ugeno.ycx.dj.onExtraCallback + 19;
        com.bytedance.adsdk.ugeno.ycx.dj.onWarmupCompleted = r7 % 128;
        r7 = r7 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List<sya> ycx(String str, JSONObject jSONObject) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = 0;
        Object obj = null;
        if (i3 % 2 != 0) {
            int i5 = 3 / 0;
        }
    }

    private static void a(int i2, int i3, char c, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i6 = $10 + 111;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            i4 = -1401950695;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i3) {
                break;
            }
            int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i2 + i8])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 59697), 17 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.MeasureSpec.getMode(0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 46134), 31 - View.resolveSize(0, 0), 20220 - KeyEvent.getDeadChar(0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49122), ExpandableListView.getPackedPositionType(0L) + 44, 1493 - TextUtils.indexOf((CharSequence) "", '0'), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i9 = $11 + 61;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 44 - View.MeasureSpec.getMode(0), 1494 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i4 = -1401950695;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }

    public static sya ycx(JSONObject jSONObject, JSONObject jSONObject2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 23;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (jSONObject == null) {
            return null;
        }
        sya syaVar = new sya();
        syaVar.zb(com.bytedance.adsdk.ugeno.fby.sya.ycx(com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONObject.optString("delay"), jSONObject2), 0L));
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getMinimumFlingVelocity() >> 16, 4 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) KeyEvent.keyCodeFromString(""), objArr);
        syaVar.sya(com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONObject.optString(((String) objArr[0]).intern()), jSONObject2));
        syaVar.zb(com.bytedance.adsdk.ugeno.fby.sya.ycx(com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONObject.optString("playState"), jSONObject2), 1));
        syaVar.ycx(Math.max(com.bytedance.adsdk.ugeno.fby.sya.ycx(com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONObject.optString("duration"), jSONObject2), 0L), 0L));
        syaVar.ycx(com.bytedance.adsdk.ugeno.fby.sya.ycx(com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONObject.optString("playCount"), jSONObject2), 1));
        syaVar.ycx(com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONObject.optString("playDirection"), jSONObject2));
        syaVar.ycx(sya(jSONObject.optString("transformOrigin"), jSONObject2));
        syaVar.zb(com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONObject.optString("timingFunction", "linear"), jSONObject2));
        syaVar.ycx(jSONObject.optJSONObject("effect"));
        syaVar.ycx(ycx(jSONObject.optJSONArray("keyframes"), jSONObject2));
        int i5 = onWarmupCompleted + 19;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return syaVar;
    }

    public static Map<String, TreeMap<Float, String>> ycx(JSONArray jSONArray, JSONObject jSONObject) {
        float fOptDouble;
        Iterator<String> itKeys;
        int i2 = 2 % 2;
        Object obj = null;
        if (jSONArray != null) {
            int i3 = onExtraCallback + 7;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                jSONArray.length();
                throw null;
            }
            if (jSONArray.length() > 0) {
                HashMap map = new HashMap();
                int i4 = 0;
                while (i4 < jSONArray.length()) {
                    int i5 = onWarmupCompleted + 115;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        jSONArray.optJSONObject(i4);
                        obj.hashCode();
                        throw null;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i4);
                    if (jSONObjectOptJSONObject != null) {
                        int i6 = onExtraCallback + 73;
                        onWarmupCompleted = i6 % 128;
                        if (i6 % 2 != 0) {
                            fOptDouble = (float) jSONObjectOptJSONObject.optDouble("offset");
                            itKeys = jSONObjectOptJSONObject.keys();
                            int i7 = 82 / 0;
                        } else {
                            fOptDouble = (float) jSONObjectOptJSONObject.optDouble("offset");
                            itKeys = jSONObjectOptJSONObject.keys();
                        }
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            if (!TextUtils.equals(next, "offset")) {
                                int i8 = onExtraCallback + 41;
                                onWarmupCompleted = i8 % 128;
                                if (i8 % 2 != 0) {
                                    throw null;
                                }
                                TreeMap treeMap = (TreeMap) map.get(next);
                                if (treeMap == null) {
                                    treeMap = new TreeMap();
                                    map.put(next, treeMap);
                                }
                                treeMap.put(Float.valueOf(fOptDouble), dj(jSONObjectOptJSONObject.optString(next), jSONObject));
                            }
                        }
                    }
                    i4++;
                    int i9 = onWarmupCompleted + 45;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                }
                return map;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        return java.util.Arrays.toString(zb(r3, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3 = com.bytedance.adsdk.ugeno.dj.zb.ycx(r3, r4);
        r4 = com.bytedance.adsdk.ugeno.ycx.dj.onExtraCallback + 69;
        com.bytedance.adsdk.ugeno.ycx.dj.onWarmupCompleted = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if ((!sya(r3)) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (sya(r3) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String dj(String str, JSONObject jSONObject) {
        String strYcx;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 39;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            strYcx = com.bytedance.adsdk.ugeno.dj.zb.ycx(str, jSONObject);
            int i4 = 26 / 0;
        } else {
            strYcx = com.bytedance.adsdk.ugeno.dj.zb.ycx(str, jSONObject);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r1 != (-1039745817)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r4.equals("normal");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r4.equals("alternate") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r4 = com.bytedance.adsdk.ugeno.ycx.dj.onWarmupCompleted + 37;
        com.bytedance.adsdk.ugeno.ycx.dj.onExtraCallback = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        return 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1 != (-1408024454)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r1 != (-1408024454)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int ycx(String str) {
        int iHashCode;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 107;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            iHashCode = str.hashCode();
            int i4 = 5 / 0;
        } else {
            iHashCode = str.hashCode();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Interpolator zb(String str) {
        int i2 = 2 % 2;
        switch (str.hashCode()) {
            case -1965072618:
                if (str.equals("ease_in")) {
                    AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
                    int i3 = onWarmupCompleted + 83;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        return accelerateInterpolator;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                break;
            case -1102672091:
                str.equals("linear");
                break;
            case -787702915:
                if (str.equals("ease_out")) {
                    DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                    int i4 = onWarmupCompleted + 123;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return decelerateInterpolator;
                }
                break;
            case 1065009829:
                if (str.equals("ease_in_out")) {
                    return new AccelerateDecelerateInterpolator();
                }
                break;
        }
        return new LinearInterpolator();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[PHI: r1 r7
      0x002a: PHI (r1v5 float[]) = (r1v4 float[]), (r1v7 float[]) binds: [B:8:0x0028, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x002a: PHI (r7v2 org.json.JSONArray) = (r7v1 org.json.JSONArray), (r7v11 org.json.JSONArray) binds: [B:8:0x0028, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static float[] zb(String str, JSONObject jSONObject) {
        float[] fArr;
        JSONArray jSONArrayYcx;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 121;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            fArr = new float[]{0.0f, 0.0f, 0.0f};
            fArr[0] = 0.0f;
            jSONArrayYcx = com.bytedance.adsdk.ugeno.fby.zb.ycx(jSONObject, str, null);
            if (jSONArrayYcx != null) {
                int i4 = onExtraCallback + 33;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0 ? jSONArrayYcx.length() == 2 : jSONArrayYcx.length() == 3) {
                    int i5 = onExtraCallback + 33;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        fArr[1] = (float) com.bytedance.adsdk.ugeno.fby.sya.ycx(com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONArrayYcx.optString(1), jSONObject), 0.0d);
                        fArr[1] = (float) com.bytedance.adsdk.ugeno.fby.sya.ycx(com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONArrayYcx.optString(0), jSONObject), 1.0d);
                    } else {
                        fArr[0] = (float) com.bytedance.adsdk.ugeno.fby.sya.ycx(com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONArrayYcx.optString(0), jSONObject), 0.0d);
                        fArr[1] = (float) com.bytedance.adsdk.ugeno.fby.sya.ycx(com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONArrayYcx.optString(1), jSONObject), 0.0d);
                    }
                }
            }
        } else {
            fArr = new float[]{0.0f, 0.0f};
            jSONArrayYcx = com.bytedance.adsdk.ugeno.fby.zb.ycx(jSONObject, str, null);
            if (jSONArrayYcx != null) {
            }
        }
        return fArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r4
      0x0020: PHI (r4v2 org.json.JSONArray) = (r4v1 org.json.JSONArray), (r4v9 org.json.JSONArray) binds: [B:8:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean sya(String str) {
        JSONArray jSONArrayYcx;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 97;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            jSONArrayYcx = com.bytedance.adsdk.ugeno.fby.zb.ycx(str, (JSONArray) null);
            int i4 = 80 / 0;
            if (jSONArrayYcx != null) {
                if (jSONArrayYcx.length() > 0) {
                    int i5 = onWarmupCompleted + 43;
                    int i6 = i5 % 128;
                    onExtraCallback = i6;
                    int i7 = i5 % 2;
                    int i8 = i6 + 59;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 34 / 0;
                    }
                    return true;
                }
            }
        } else {
            jSONArrayYcx = com.bytedance.adsdk.ugeno.fby.zb.ycx(str, (JSONArray) null);
            if (jSONArrayYcx != null) {
            }
        }
        return false;
    }

    public static sya.ycx sya(String str, JSONObject jSONObject) {
        int i2 = 2 % 2;
        if (!TextUtils.isEmpty(str)) {
            JSONArray jSONArrayYcx = com.bytedance.adsdk.ugeno.fby.zb.ycx(jSONObject, str, null);
            if (jSONArrayYcx != null) {
                int i3 = onExtraCallback + 75;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (jSONArrayYcx.length() == 2) {
                    sya.ycx ycxVar = new sya.ycx();
                    ycxVar.ycx = com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONArrayYcx.optString(0), jSONObject);
                    ycxVar.zb = com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONArrayYcx.optString(1), jSONObject);
                    return ycxVar;
                }
            }
            int i5 = onWarmupCompleted + 41;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 31 / 0;
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int ycx(String str, int i2) {
        char c;
        float f;
        int i3 = 2 % 2;
        int i4 = i2 / 2;
        if (!TextUtils.isEmpty(str)) {
            switch (str.hashCode()) {
                case -1383228885:
                    if (!str.equals("bottom")) {
                        c = 65535;
                        break;
                    } else {
                        int i5 = onWarmupCompleted + 15;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        c = 0;
                        break;
                    }
                case -1364013995:
                    if (str.equals(TtmlNode.CENTER)) {
                        int i7 = onWarmupCompleted + 35;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        c = 1;
                        break;
                    }
                    break;
                case 115029:
                    if (str.equals("top")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3317767:
                    if (str.equals(TtmlNode.LEFT)) {
                        c = 3;
                        break;
                    }
                    break;
                case 108511772:
                    if (str.equals(TtmlNode.RIGHT)) {
                        int i9 = onExtraCallback + 27;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c == 2 || c == 3) {
                        int i11 = onExtraCallback + 27;
                        onWarmupCompleted = i11 % 128;
                        if (i11 % 2 == 0) {
                            return 0;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (c != 4) {
                        if (!str.endsWith("%")) {
                            try {
                                return Integer.parseInt(str);
                            } catch (NumberFormatException unused) {
                                return i4;
                            }
                        }
                        int i12 = onExtraCallback + 105;
                        onWarmupCompleted = i12 % 128;
                        try {
                            if (i12 % 2 != 0) {
                                f = (i2 % Float.parseFloat(str.substring(0, str.length() - 1))) * 100.0f;
                            } else {
                                f = (i2 * Float.parseFloat(str.substring(0, str.length() - 1))) / 100.0f;
                            }
                            return (int) f;
                        } catch (NumberFormatException unused2) {
                        }
                    }
                }
            }
            return i2;
        }
        return i4;
    }
}
