package com.iap.android.mppclient.container.js;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.iap.android.mppclient.basic.config.ConfigurationManager;
import com.iap.android.mppclient.basic.utils.Util;
import java.lang.reflect.Method;
import java.util.Locale;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class SystemExtension {
    private static final String TAG = "SystemExtension";
    private static short[] onWarmupCompleted;
    private static final byte[] $$a = {115, 30, 119, 102};
    private static final int $$b = 34;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private static int onNavigationEvent = 1334175306;
    private static int onExtraCallbackWithResult = -1538795450;
    private static int IAuthTabCallback = 1967451650;
    private static byte[] onExtraCallback = {-79, 22, 46, 7, 43, 19, 41, -67, 113, Byte.MIN_VALUE};
    private float DEFAULT_TEXT_SIZE = 16.0f;
    private boolean mBatteryBroadcastRegistered = false;
    private int mCachedBatteryPercentage = 0;
    private BatteryBroadcastReceiver mBroadcastReceiver = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6, types: [int] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private static String $$c(int i, short s, short s2) {
        byte[] bArr = $$a;
        int i2 = i * 3;
        int i3 = (s * 4) + 115;
        int i4 = 3 - (s2 * 4);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        byte b = i3;
        if (bArr == null) {
            int i7 = i3 + i4;
            i4 = i4;
            i6 = -1;
            b = i7;
        }
        while (true) {
            int i8 = i6 + 1;
            bArr2[i8] = b;
            int i9 = i4 + 1;
            if (i8 == i5) {
                return new String(bArr2, 0);
            }
            b = bArr[i9] + b;
            i4 = i9;
            i6 = i8;
        }
    }

    static /* synthetic */ int access$100(SystemExtension systemExtension, Intent intent) {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int batteryPercentage = systemExtension.parseBatteryPercentage(intent);
        int i4 = onTransact + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return batteryPercentage;
    }

    static /* synthetic */ int access$200(SystemExtension systemExtension) {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = systemExtension.mCachedBatteryPercentage;
        if (i3 != 0) {
            return i4;
        }
        throw null;
    }

    static /* synthetic */ int access$202(SystemExtension systemExtension, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 11;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        systemExtension.mCachedBatteryPercentage = i;
        int i6 = i3 + 67;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        throw null;
    }

    private String getInternalMemorySize() {
        int i = 2 % 2;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            String fileSize = Util.formatFileSize(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
            int i2 = onTransact + 109;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                return fileSize;
            }
            throw null;
        } catch (Throwable unused) {
            return "";
        }
    }

    public JSONObject getSystemInfoInner(Context context, WebView webView) throws Throwable {
        float f;
        float fRound;
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        try {
            jSONObject.put("model", Build.MANUFACTURER + " " + Build.MODEL);
            if (displayMetrics != null) {
                int i2 = asBinder + 61;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                f = displayMetrics.density;
                jSONObject.put("pixelRatio", f);
                fRound = Math.round(displayMetrics.widthPixels / f);
                jSONObject.put("screenWidth", displayMetrics.widthPixels);
                jSONObject.put("screenHeight", displayMetrics.heightPixels);
            } else {
                f = 0.0f;
                fRound = 0.0f;
            }
            jSONObject.put("windowWidth", fRound);
            jSONObject.put("windowHeight", getHeight(context, webView, f, displayMetrics));
            jSONObject.put("language", Locale.getDefault().getDisplayLanguage() + "-" + Locale.getDefault().getDisplayCountry());
            jSONObject.put("system", Build.VERSION.RELEASE);
            jSONObject.put("platform", "Android");
            Object[] objArr = new Object[1];
            a((short) ((-32) - View.resolveSizeAndState(0, 0, 0)), (byte) (AndroidCharacter.getMirror('0') + 65488), 339591614 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 788318824 + (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), Color.red(0) + (-79), objArr);
            jSONObject.put(((String) objArr[0]).intern(), getInternalMemorySize());
            jSONObject.put("currentBattery", getCurrentBatteryPercentage(context) + "%");
            jSONObject.put("brand", Build.BRAND);
            jSONObject.put("titleBarHeight", getTitleBarHeight(context));
            jSONObject.put("statusBarHeight", getStatusBarHeight(context));
            jSONObject.put("fontSizeSetting", getFontSizeSetting());
            jSONObject.put("version", getProductVersion(context));
            Object[] objArr2 = new Object[1];
            a((short) (ExpandableListView.getPackedPositionChild(0L) - 120), (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 339591621 - (ViewConfiguration.getFadingEdgeLength() >> 16), AndroidCharacter.getMirror('0') + 51751, Process.getGidForName("") - 78, objArr2);
            jSONObject.put(((String) objArr2[0]).intern(), ConfigurationManager.getInstance().getConfiguration().siteName);
            int i4 = onTransact + 67;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return jSONObject;
        } catch (Exception e) {
            e.getMessage();
            int i6 = asBinder + 37;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return jSONObject;
        }
    }

    private float getFontSizeSetting() {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        float f = this.DEFAULT_TEXT_SIZE;
        int i5 = i3 + 67;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    private int getHeight(Context context, WebView webView, float f, DisplayMetrics displayMetrics) {
        int iRound;
        int iRound2;
        int i = 2 % 2;
        if (displayMetrics != null) {
            int i2 = asBinder + 121;
            onTransact = i2 % 128;
            iRound = Math.round(i2 % 2 == 0 ? (displayMetrics.heightPixels - getTitleAndStatusBarHeight(context, f)) % f : (displayMetrics.heightPixels - getTitleAndStatusBarHeight(context, f)) / f);
            int i3 = asBinder + 15;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
        } else {
            iRound = 0;
        }
        if (webView != null) {
            int i5 = asBinder + 61;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            float height = webView.getHeight();
            if (i6 != 0 ? (iRound2 = Math.round(height / f)) > 0 : (iRound2 = Math.round(height * f)) > 0) {
                return iRound2;
            }
        }
        return iRound;
    }

    private int getTitleAndStatusBarHeight(Context context, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        float statusBarHeight = getStatusBarHeight(context);
        float titleBarHeight = getTitleBarHeight(context);
        return Math.round(i3 != 0 ? statusBarHeight * (titleBarHeight % f) : statusBarHeight + (titleBarHeight * f));
    }

    private int getTitleBarHeight(Context context) {
        float fDip2px;
        int i = 2 % 2;
        int i2 = asBinder + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iDip2px = Util.dip2px(context, 1.0f);
        if (iDip2px > 0) {
            int i4 = asBinder + 97;
            onTransact = i4 % 128;
            fDip2px = i4 % 2 == 0 ? Util.dip2px(context, 48.0f) >>> iDip2px : Util.dip2px(context, 48.0f) / iDip2px;
        } else {
            fDip2px = 0.0f;
        }
        return Math.round(fDip2px);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int getStatusBarHeight(Context context) {
        int i = 2 % 2;
        if (context != null) {
            int i2 = onTransact + 117;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 28 / 0;
                if (context instanceof Activity) {
                    int iDip2px = Util.dip2px(context, 1.0f);
                    Rect rect = new Rect();
                    if (iDip2px > 0) {
                        int i4 = onTransact + 59;
                        asBinder = i4 % 128;
                        int i5 = i4 % 2;
                        ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                        int i6 = rect.top;
                        if (i6 > 0) {
                            int i7 = asBinder + 109;
                            onTransact = i7 % 128;
                            int i8 = i7 % 2;
                            return i6 / iDip2px;
                        }
                    }
                }
            } else if (context instanceof Activity) {
            }
        }
        return 0;
    }

    private int getCurrentBatteryPercentage(Context context) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 99;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (this.mBatteryBroadcastRegistered) {
            int i5 = i2 + 17;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return this.mCachedBatteryPercentage;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            BatteryBroadcastReceiver batteryBroadcastReceiver = this.mBroadcastReceiver;
            if (batteryBroadcastReceiver != null) {
                int i7 = onTransact + 87;
                asBinder = i7 % 128;
                if (i7 % 2 != 0) {
                    context.unregisterReceiver(batteryBroadcastReceiver);
                    this.mBroadcastReceiver = null;
                    throw null;
                }
                context.unregisterReceiver(batteryBroadcastReceiver);
                this.mBroadcastReceiver = null;
            }
            BatteryBroadcastReceiver batteryBroadcastReceiver2 = new BatteryBroadcastReceiver(this, (AnonymousClass1) null);
            this.mBroadcastReceiver = batteryBroadcastReceiver2;
            Intent intentRegisterReceiver = context.registerReceiver(batteryBroadcastReceiver2, intentFilter);
            this.mBatteryBroadcastRegistered = true;
            int batteryPercentage = parseBatteryPercentage(intentRegisterReceiver);
            if (batteryPercentage > 0) {
                this.mCachedBatteryPercentage = batteryPercentage;
            }
            return this.mCachedBatteryPercentage;
        } catch (Exception e) {
            e.getMessage();
            return this.mCachedBatteryPercentage;
        }
    }

    private int parseBatteryPercentage(Intent intent) {
        int i = 2 % 2;
        Object obj = null;
        if (intent != null) {
            int i2 = onTransact + 93;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                if ("android.intent.action.BATTERY_CHANGED" == intent.getAction()) {
                    return (intent.getIntExtra("level", 0) * 100) / intent.getIntExtra("scale", 100);
                }
            } else {
                intent.getAction();
                obj.hashCode();
                throw null;
            }
        }
        int i3 = asBinder + 61;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return -1;
        }
        obj.hashCode();
        throw null;
    }

    private String getProductVersion(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        asBinder = i2 % 128;
        try {
            String str = (i2 % 2 != 0 ? context.getApplicationContext().getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 1) : context.getApplicationContext().getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0)).versionName;
            int i3 = asBinder + 87;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x030b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            long j2 = 0;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), Color.red(0) + 42, 22439 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (!z) {
                j = -4629411779493505016L;
            } else {
                byte[] bArr = onExtraCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 39;
                        $10 = i9 % 128;
                        if (i9 % i6 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 55 - ExpandableListView.getPackedPositionGroup(j2), 2166 - MotionEvent.axisFromString(""), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i8])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12843), View.MeasureSpec.getMode(0) + 55, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2167, -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                            i8++;
                        }
                        i6 = 2;
                        j2 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i10 = $10 + 11;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        byte[] bArr3 = onExtraCallback;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16733792) - Color.rgb(0, 0, 0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 43, ExpandableListView.getPackedPositionChild(0L) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] % (-4629411779493505016L))) >>> ((int) (onExtraCallbackWithResult % (-4629411779493505016L)));
                    } else {
                        byte[] bArr4 = onExtraCallback;
                        Object[] objArr6 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getJumpTapTimeout() >> 16)), TextUtils.lastIndexOf("", '0', 0, 0) + 43, 22439 - View.getDefaultSize(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)));
                    }
                    iIntValue = (byte) i4;
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i11 = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ j));
                if (z) {
                    int i12 = $10 + 35;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 3 % 3;
                    }
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i11 + i5;
                Object[] objArr7 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), 86 - TextUtils.getTrimmedLength(""), KeyEvent.getDeadChar(0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback6).invoke(null, objArr7)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onExtraCallback;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        int i15 = $11 + 5;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                        bArr6[i14] = (byte) (bArr5[i14] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr6;
                }
                if (bArr5 != null) {
                    int i17 = $11 + 25;
                    $10 = i17 % 128;
                    boolean z2 = i17 % 2 == 0;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z2) {
                            byte[] bArr7 = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
