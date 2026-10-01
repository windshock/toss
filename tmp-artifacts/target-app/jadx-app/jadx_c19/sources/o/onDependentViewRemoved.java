package o;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.internal.mayLaunchUrl;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class onDependentViewRemoved {
    private static final Map<String, String> IAuthTabCallback;
    private static final AtomicBoolean onExtraCallback;
    private static SharedPreferences onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static int onTransact;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {69, 81, 99, -123};
    private static final int $$b = 85;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallbackDefault = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, int i2) {
        int i3;
        int i4;
        int i5 = 4 - (b * 2);
        int i6 = 1 - (i2 * 4);
        ?? r7 = 97 - (s * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            byte b2 = r7;
            i3 = 0;
            int i7 = i5;
            i5++;
            i4 = i7 + (-b2);
            int i8 = i4;
            int i9 = i5;
            bArr2[i3] = (byte) i8;
            i3++;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            b2 = bArr[i9];
            i7 = i8;
            i5 = i9;
            i5++;
            i4 = i7 + (-b2);
            int i82 = i4;
            int i92 = i5;
            bArr2[i3] = (byte) i82;
            i3++;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            i4 = r7;
            int i822 = i4;
            int i922 = i5;
            bArr2[i3] = (byte) i822;
            i3++;
            if (i3 == i6) {
            }
        }
    }

    onDependentViewRemoved() {
    }

    static {
        onTransact = 1;
        onExtraCallback();
        IAuthTabCallback = new HashMap();
        onExtraCallback = new AtomicBoolean(false);
        int i2 = IAuthTabCallbackDefault + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = asInterface + 27;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            convertResponseToCredentialManager.onExtraCallback(onDependentViewRemoved.class);
            obj.hashCode();
            throw null;
        }
        if (!(!convertResponseToCredentialManager.onExtraCallback(onDependentViewRemoved.class))) {
            return;
        }
        int i4 = asInterface + 31;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        try {
            AtomicBoolean atomicBoolean = onExtraCallback;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = performIntercept.onExtraCallbackWithResult().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            onExtraCallbackWithResult = sharedPreferences;
            IAuthTabCallback.putAll(mayLaunchUrl.onWarmupCompleted(sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "")));
            atomicBoolean.set(true);
            int i6 = asBinder + 65;
            asInterface = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onDependentViewRemoved.class);
        }
    }

    static void onWarmupCompleted(String str, String str2) {
        int i2 = 2 % 2;
        if (convertResponseToCredentialManager.onExtraCallback(onDependentViewRemoved.class)) {
            int i3 = asBinder + 67;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        try {
            if (!onExtraCallback.get()) {
                int i5 = asInterface + 11;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                IAuthTabCallback();
            }
            Map<String, String> map = IAuthTabCallback;
            map.put(str, str2);
            SharedPreferences.Editor editorEdit = onExtraCallbackWithResult.edit();
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            editorEdit.putString("SUGGESTED_EVENTS_HISTORY", (String) mayLaunchUrl.onExtraCallbackWithResult(-1474375584, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{map}, iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent, 1474375590)).apply();
            int i7 = asBinder + 53;
            asInterface = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 95 / 0;
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onDependentViewRemoved.class);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if ((r9 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        r1 = new org.json.JSONObject();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r2 = new java.lang.Object[1];
        a(android.text.TextUtils.getCapsMode("", 0, 0), android.graphics.Color.green(0) + 4, (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 27044), r2);
        r1.put(((java.lang.String) r2[0]).intern(), r10);
        r10 = new org.json.JSONArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        if (r9 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        r10.put(r9.getClass().getSimpleName());
        r9 = o.onLayoutChild.IAuthTabCallbackDefault(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        r1.put("classname", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        o.convertResponseToCredentialManager.onExtraCallbackWithResult(r9, o.onDependentViewRemoved.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (o.convertResponseToCredentialManager.onExtraCallback(o.onDependentViewRemoved.class) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (o.convertResponseToCredentialManager.onExtraCallback(o.onDependentViewRemoved.class) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r9 = o.onDependentViewRemoved.asBinder + 1;
        o.onDependentViewRemoved.asInterface = r9 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static String IAuthTabCallback(View view, String str) {
        JSONObject jSONObject;
        int i2 = 2 % 2;
        int i3 = asBinder + 69;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 32 / 0;
        }
        String strAsBinder = mayLaunchUrl.asBinder(jSONObject.toString());
        int i5 = asInterface + 41;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return strAsBinder;
    }

    static String IAuthTabCallback(String str) {
        int i2 = 2 % 2;
        int i3 = asInterface + 21;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (convertResponseToCredentialManager.onExtraCallback(onDependentViewRemoved.class)) {
            int i5 = asInterface + 63;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        try {
            Map<String, String> map = IAuthTabCallback;
            if (!map.containsKey(str)) {
                return null;
            }
            return map.get(str);
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onDependentViewRemoved.class);
            return null;
        }
    }

    private static void a(int i2, int i3, char c, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i5 = $11 + 19;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i2 % i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 46135), Color.green(0) + 31, 20220 - ExpandableListView.getPackedPositionGroup(0L), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback3 == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 49123), 45 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } else {
                int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(onNavigationEvent[i2 + i7])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 59697), 17 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getTouchSlop() >> 8) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 30 - TextUtils.indexOf((CharSequence) "", '0'), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20221, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49124), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44, 1494 - ExpandableListView.getPackedPositionGroup(0L), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49122), 45 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Color.argb(0, 0, 0, 0) + 1494, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
            int i8 = $10 + 41;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr);
    }

    static void onExtraCallback() {
        onNavigationEvent = new char[]{33796, 5241, 42192, 13632};
        onWarmupCompleted = 1889922813976739256L;
    }
}
