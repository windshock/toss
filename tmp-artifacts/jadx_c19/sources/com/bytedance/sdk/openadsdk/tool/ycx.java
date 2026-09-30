package com.bytedance.sdk.openadsdk.tool;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.sdk.component.utils.htf;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.oty.sya;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx {
    private static final byte[] $$a = {69, 81, 99, -123};
    private static final int $$b = 112;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onExtraCallback = 1;
    private static char[] onWarmupCompleted = {14460, 44131, 4191, 33863, 31750, 59401, 21565, 49200, 11334, 38999, 1146};
    private static long onNavigationEvent = 1138508213007579588L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, byte b3) {
        int i2;
        int i3 = (b3 * 3) + 4;
        byte[] bArr = $$a;
        int i4 = b * 3;
        int i5 = 97 - (b2 * 2);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            int i8 = i4;
            i5 = (-i5) + i8;
            i3 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            int i9 = bArr[i3];
            int i10 = i3;
            i8 = i5;
            i5 = i9;
            i7 = i2 + 1;
            i6 = i10;
            i5 = (-i5) + i8;
            i3 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    public static String ycx(List<FilterWord> list) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 119;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (!(!it.hasNext())) {
            JSONObject jSONObjectYcx = ycx(it.next());
            if (jSONObjectYcx != null) {
                int i5 = onExtraCallback + 83;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                jSONArray.put(jSONObjectYcx);
            }
        }
        String string = jSONArray.toString();
        int i7 = onExtraCallbackWithResult + 1;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public static List<FilterWord> ycx(String str) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                FilterWord filterWordYcx = ycx(jSONArray.optJSONObject(i3));
                if (filterWordYcx != null && filterWordYcx.isValid()) {
                    int i4 = onExtraCallbackWithResult + 125;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        arrayList.add(filterWordYcx);
                        int i5 = 5 / 0;
                    } else {
                        arrayList.add(filterWordYcx);
                    }
                }
            }
            int i6 = onExtraCallbackWithResult + 87;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return arrayList;
            }
            throw null;
        } catch (JSONException e) {
            sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5geryQ=", "du85kBG1aMutT8NcuB6vJEg=", "XOs5swqwfcKSfdhPiD2pO0/IP5oOllrormvFT40IkzxJ", 45);
            htf.sya("MaterialMetaTools", e.getMessage());
            return arrayList;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r10 = 42 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r1 = new com.bytedance.sdk.openadsdk.FilterWord();
        r1.setId(r10.optString(com.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID));
        r9 = new java.lang.Object[1];
        a(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, 4 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (54727 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), r9);
        r1.setName(r10.optString(((java.lang.String) r9[0]).intern()));
        r1.setIsSelected(r10.optBoolean("is_selected"));
        r7 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6, (char) (37308 - android.widget.ExpandableListView.getPackedPositionChild(0)), r7);
        r10 = r10.optJSONArray(((java.lang.String) r7[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009d, code lost:
    
        if (r10 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a3, code lost:
    
        if (r10.length() <= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
    
        if (r4 >= r10.length()) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        r2 = com.bytedance.sdk.openadsdk.tool.ycx.onExtraCallbackWithResult + 81;
        com.bytedance.sdk.openadsdk.tool.ycx.onExtraCallback = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b4, code lost:
    
        r2 = ycx(r10.optJSONObject(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
    
        if (r2 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c2, code lost:
    
        if (r2.isValid() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c4, code lost:
    
        r1.addOption(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c7, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ca, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cb, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cc, code lost:
    
        com.bytedance.sdk.openadsdk.oty.sya.ycx(r10, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5geryQ=", "du85kBG1aMutT8NcuB6vJEg=", "Vu8mkCW1ZdOFWOBSnhU=", 77);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d7, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r10 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r10 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 9;
        r10 = r1 % 128;
        com.bytedance.sdk.openadsdk.tool.ycx.onExtraCallback = r10;
        r1 = r1 % 2;
        r10 = r10 + 35;
        com.bytedance.sdk.openadsdk.tool.ycx.onExtraCallbackWithResult = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if ((r10 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static FilterWord ycx(JSONObject jSONObject) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 95;
        onExtraCallback = i4 % 128;
        int i5 = 0;
        if (i4 % 2 == 0) {
            int i6 = 1 / 0;
        }
    }

    private static void a(int i2, int i3, char c, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i5 = $11 + 15;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i2 + i7])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 59697), 17 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (Process.myTid() >> 22)), Process.getGidForName("") + 32, 20219 - Process.getGidForName(""), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 49123), View.resolveSizeAndState(0, 0, 0) + 44, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1493, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i8 = $11 + 113;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.resolveSize(0, 0)), 43 - TextUtils.lastIndexOf("", '0', 0), 1493 - ImageFormat.getBitsPerPixel(0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i10 = $10 + 61;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    private static JSONObject ycx(FilterWord filterWord) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 21;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if (filterWord == null) {
            int i6 = i4 + 107;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return null;
            }
            throw null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TtmlNode.ATTR_ID, filterWord.getId());
                Object[] objArr = new Object[1];
                a(View.resolveSizeAndState(0, 0, 0), 4 - ExpandableListView.getPackedPositionGroup(0L), (char) (54726 - View.resolveSizeAndState(0, 0, 0)), objArr);
                jSONObject.put(((String) objArr[0]).intern(), filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        int i7 = onExtraCallback + 99;
                        onExtraCallbackWithResult = i7 % 128;
                        if (i7 % 2 != 0) {
                            jSONArray.put(ycx((FilterWord) it.next()));
                            throw null;
                        }
                        jSONArray.put(ycx((FilterWord) it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        int i8 = onExtraCallback + 95;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        Object[] objArr2 = new Object[1];
                        a((-16777212) - Color.rgb(0, 0, 0), 7 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 37310), objArr2);
                        jSONObject.put(((String) objArr2[0]).intern(), jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable th) {
            sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5geryQ=", "du85kBG1aMutT8NcuB6vJEg=", "T+ELnA+obNW3RcVZpgKvJg==", 109);
            int i10 = onExtraCallback + 57;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
        }
        return null;
    }
}
