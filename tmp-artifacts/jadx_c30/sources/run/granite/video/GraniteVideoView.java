package run.granite.video;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access8100;
import o.decryptForRecoveryKey;
import o.getCertPEM;
import o.getCertV3PEM;
import o.getDecryptData;
import o.getDigestInfo;
import o.getHashData;
import o.getLicenseInfo;
import o.getSignForPKCS7;
import o.getSignForPKCS7AndVIDRV2;
import o.getSignForPKCS7AndVIDRV2NoContents;
import o.getSignForPKCS7AndVIDRV2NoContentsWithAttr;
import o.getSignForPKCS7AndVIDRV2WithAttr;
import o.getSignForPKCS7AndVIDRV3;
import o.getSignForPKCS7AndVIDRV3NoContents;
import o.getSignForPKCS7AndVIDRV3NoContentsWithAttr;
import o.getSignForPKCS7AppCertAndVIDR;
import o.getSignForPKCS7NoContents;
import o.getSignForPKCS7V2WithAttr;
import o.getWrite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class GraniteVideoView extends FrameLayout implements getHashData {
    private static short[] access100;
    private decryptForRecoveryKey IAuthTabCallback;
    private float IAuthTabCallbackDefault;
    private String IAuthTabCallbackStub;
    private boolean asBinder;
    private float asInterface;
    private View onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private final Function0<getSignForPKCS7NoContents> onTransact;
    private getSignForPKCS7NoContents onWarmupCompleted;
    private static final byte[] $$a = {79, 23, 89, 11};
    private static final int $$b = 15;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int writeTypedObject = 0;
    private static int ICustomTabsCallback = 1;
    private static int access000 = -1030930950;
    private static int IAuthTabCallbackStubProxy = -1538795400;
    private static int getInterfaceDescriptor = -939422732;
    private static byte[] IAuthTabCallback_Parcel = {-100, -88, -86, -8, -100, 55, 91, 72, -97, -19, -23, -19, -21, -6, -7, -99, -110, 25, 27, -69, -112, 75, 74, -7, 63, ISO7816.INS_WRITE_BINARY, 71, ISO7816.INS_CREATE_FILE, -109, 116, -101, ISOFileInfo.CHANNEL_SECURITY, -99, -100, ISOFileInfo.SECURITY_ATTR_COMPACT, -124, -119, ISOFileInfo.FILE_IDENTIFIER, -102};
    private static char[] extraCallback = {60839, 53434, 38833, 23174, 6545, 56460, 33784, 60858, 53438, 38831, 23184, 60832, 53430, 38838, 23193, 6557, 60833, 53421, 38827, 56609, 57387, 42807, 27147};
    private static long extraCallbackWithResult = -8990430270327893793L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, byte b2) {
        int i;
        int i2 = 115 - (b * 18);
        byte[] bArr = $$a;
        int i3 = s + 4;
        int i4 = b2 * 2;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i4;
            int i6 = 0;
            i2 += i5;
            i = i6;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i4) {
                return new String(bArr2, 0);
            }
            i3++;
            i5 = bArr[i3];
            i2 += i5;
            i = i6;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i4) {
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GraniteVideoView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        Function0 function0 = null;
        this(context, function0, 2, function0);
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = i7 | i5;
        int i11 = (~i10) | i9;
        int i12 = ~i5;
        int i13 = (~(i2 | i10)) | (~(i8 | i12)) | (~(i12 | i6));
        int i14 = i6 + i5 + i4 + ((-1017789379) * i3) + (461141949 * i);
        int i15 = i14 * i14;
        int i16 = ((-551480932) * i6) + 431816704 + ((-1613042074) * i5) + ((-1061561142) * i11) + (i13 * (-1616703077)) + ((-1616703077) * i9) + (1065222144 * i4) + ((-1727660032) * i3) + (1912995840 * i) + ((-1005256704) * i15);
        int i17 = ((i6 * (-1063000396)) - 360994079) + (i5 * (-1063001374)) + (i11 * (-978)) + (i13 * 489) + (i9 * 489) + (i4 * (-1063000885)) + (i3 * (-90181537)) + (i * (-1548859681)) + (i15 * 816250880);
        int i18 = i16 + (i17 * i17 * 1493368832);
        return i18 != 1 ? i18 != 2 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraniteVideoView(@NotNull Context context, @Nullable Function0<? extends getSignForPKCS7NoContents> function0) {
        super(context);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        this.onTransact = function0;
        this.onExtraCallbackWithResult = true;
        this.IAuthTabCallbackDefault = 1.0f;
        this.asInterface = 1.0f;
        this.IAuthTabCallbackStub = "contain";
        onNavigationEvent(context);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GraniteVideoView(Context context, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = writeTypedObject + 5;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 93;
            writeTypedObject = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            function0 = null;
        }
        this(context, function0);
    }

    public final void setEventListener(@Nullable decryptForRecoveryKey decryptforrecoverykey) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 53;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallback = decryptforrecoverykey;
        if (i4 != 0) {
            int i5 = 44 / 0;
        }
        int i6 = i2 + 101;
        writeTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(Context context) {
        getSignForPKCS7NoContents getsignforpkcs7nocontentsOnNavigationEvent;
        int i = 2 % 2;
        Function0<getSignForPKCS7NoContents> function0 = this.onTransact;
        if (function0 != null) {
            int i2 = writeTypedObject + 105;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            getsignforpkcs7nocontentsOnNavigationEvent = (getSignForPKCS7NoContents) function0.invoke();
            if (getsignforpkcs7nocontentsOnNavigationEvent == null) {
                getsignforpkcs7nocontentsOnNavigationEvent = getSignForPKCS7AppCertAndVIDR.onExtraCallbackWithResult.onNavigationEvent();
                if (getsignforpkcs7nocontentsOnNavigationEvent == null) {
                    throw new IllegalStateException("No video provider registered. Either register a provider via GraniteVideoRegistry.registerFactory() or enable the default provider by setting GRANITE_VIDEO_DEFAULT_PROVIDER=true.");
                }
            }
        }
        this.onWarmupCompleted = getsignforpkcs7nocontentsOnNavigationEvent;
        getsignforpkcs7nocontentsOnNavigationEvent.onExtraCallback(this);
        getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
        View viewOnExtraCallback = null;
        if (getsignforpkcs7nocontents != null) {
            int i4 = writeTypedObject + 121;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 == 0) {
                getsignforpkcs7nocontents.onExtraCallback(context);
                throw null;
            }
            viewOnExtraCallback = getsignforpkcs7nocontents.onExtraCallback(context);
        } else {
            int i5 = writeTypedObject + 69;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        this.onExtraCallback = viewOnExtraCallback;
        if (viewOnExtraCallback != null) {
            viewOnExtraCallback.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(viewOnExtraCallback);
        }
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i4 = $10 + 109;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(extraCallback[i2 << i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 59698), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(extraCallbackWithResult), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 46134), TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 31, TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 20221, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (-b);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 49123), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1493, -1657859959, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(extraCallback[i2 + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 59697), 17 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(extraCallbackWithResult), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getScrollBarSize() >> 8)), 31 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 20220 - View.getDefaultSize(0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (-b3);
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16826339), 44 - View.MeasureSpec.makeMeasureSpec(0, 0), (Process.myTid() >> 22) + 1494, -1657859959, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i7 = $10 + 111;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback7 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (-b5);
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16826339), 45 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1494 - (Process.myPid() >> 22), -1657859959, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
                int i9 = $10 + 35;
                $11 = i9 % 128;
                int i10 = i9 % 2;
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

    public final void setSource(@Nullable Map<String, ? extends Object> map) throws Throwable {
        Boolean bool;
        Boolean bool2;
        boolean zBooleanValue;
        Boolean bool3;
        Number number;
        int iIntValue;
        double dDoubleValue;
        int iIntValue2;
        Boolean bool4;
        getSignForPKCS7NoContents getsignforpkcs7nocontents;
        int i = 2 % 2;
        if (map != null) {
            int i2 = writeTypedObject + 105;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a((short) ((-106) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (byte) (123 - ExpandableListView.getPackedPositionType(0L)), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) - 1724573162, (-1833325460) - Color.rgb(0, 0, 0), (-113) - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            Map map2 = (Map) onNavigationEvent(new Object[]{this, map.get(((String) objArr[0]).intern())}, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 834395958, -834395956);
            Object[] objArr2 = new Object[1];
            b((ViewConfiguration.getPressedStateDuration() >> 16) + 3, (char) (ImageFormat.getBitsPerPixel(0) + 1), 16 - ExpandableListView.getPackedPositionType(0L), objArr2);
            Object obj = map.get(((String) objArr2[0]).intern());
            String str = obj instanceof String ? (String) obj : null;
            Object[] objArr3 = new Object[1];
            a((short) (56 - Color.alpha(0)), (byte) (MotionEvent.axisFromString(BuildConfig.FLAVOR) + 46), (-1724573170) - (ViewConfiguration.getWindowTouchSlop() >> 8), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1816548232, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 114, objArr3);
            Object obj2 = map.get(((String) objArr3[0]).intern());
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = map.get("startTime");
            Number number2 = obj3 instanceof Number ? (Number) obj3 : null;
            double dDoubleValue2 = number2 != null ? number2.doubleValue() : 0.0d;
            Object obj4 = map.get("endTime");
            Number number3 = obj4 instanceof Number ? (Number) obj4 : null;
            double dDoubleValue3 = number3 != null ? number3.doubleValue() : 0.0d;
            Object obj5 = map.get("drm");
            getLicenseInfo getlicenseinfoOnWarmupCompleted = onWarmupCompleted(obj5 instanceof Map ? (Map) obj5 : null);
            Object obj6 = map.get("isNetwork");
            Boolean bool5 = obj6 instanceof Boolean ? (Boolean) obj6 : null;
            Object obj7 = map.get("isAsset");
            if (obj7 instanceof Boolean) {
                int i4 = ICustomTabsCallback + 105;
                writeTypedObject = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                bool = (Boolean) obj7;
            } else {
                bool = null;
            }
            boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
            Object obj8 = map.get("isLocalAssetFile");
            if (obj8 instanceof Boolean) {
                int i5 = ICustomTabsCallback + 11;
                writeTypedObject = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                bool2 = (Boolean) obj8;
            } else {
                bool2 = null;
            }
            if (bool2 != null) {
                int i6 = ICustomTabsCallback + 25;
                writeTypedObject = i6 % 128;
                if (i6 % 2 != 0) {
                    bool2.booleanValue();
                    map.hashCode();
                    throw null;
                }
                zBooleanValue = bool2.booleanValue();
            } else {
                zBooleanValue = false;
            }
            Object obj9 = map.get("shouldCache");
            if (obj9 instanceof Boolean) {
                int i7 = ICustomTabsCallback + 119;
                writeTypedObject = i7 % 128;
                if (i7 % 2 != 0) {
                    map.hashCode();
                    throw null;
                }
                bool3 = (Boolean) obj9;
            } else {
                bool3 = null;
            }
            boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : true;
            Object obj10 = map.get("mainVer");
            if (obj10 instanceof Number) {
                int i8 = writeTypedObject + 117;
                ICustomTabsCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    number = (Number) obj10;
                    int i9 = 11 / 0;
                } else {
                    number = (Number) obj10;
                }
            } else {
                number = null;
            }
            int iIntValue3 = number != null ? number.intValue() : 0;
            Object obj11 = map.get("patchVer");
            Number number4 = obj11 instanceof Number ? (Number) obj11 : null;
            if (number4 != null) {
                int i10 = writeTypedObject + 111;
                ICustomTabsCallback = i10 % 128;
                int i11 = i10 % 2;
                iIntValue = number4.intValue();
            } else {
                iIntValue = 0;
            }
            Object obj12 = map.get("contentStartTime");
            Number number5 = !(obj12 instanceof Number) ? null : (Number) obj12;
            if (number5 != null) {
                int i12 = writeTypedObject + 9;
                ICustomTabsCallback = i12 % 128;
                int i13 = i12 % 2;
                dDoubleValue = number5.doubleValue();
            } else {
                dDoubleValue = -1.0d;
            }
            double d = dDoubleValue;
            Object obj13 = map.get("minLoadRetryCount");
            Number number6 = obj13 instanceof Number ? (Number) obj13 : null;
            if (number6 != null) {
                int i14 = writeTypedObject + 11;
                ICustomTabsCallback = i14 % 128;
                int i15 = i14 % 2;
                iIntValue2 = number6.intValue();
            } else {
                iIntValue2 = 3;
            }
            Object obj14 = map.get("textTracksAllowChunklessPreparation");
            if (obj14 instanceof Boolean) {
                int i16 = writeTypedObject + 95;
                ICustomTabsCallback = i16 % 128;
                if (i16 % 2 == 0) {
                    bool4 = (Boolean) obj14;
                    int i17 = 91 / 0;
                } else {
                    bool4 = (Boolean) obj14;
                }
            } else {
                bool4 = null;
            }
            boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : true;
            Object obj15 = map.get("metadata");
            getSignForPKCS7AndVIDRV2WithAttr getsignforpkcs7andvidrv2withattrOnExtraCallbackWithResult = onExtraCallbackWithResult(obj15 instanceof Map ? (Map) obj15 : null);
            Object obj16 = map.get("cmcd");
            getDecryptData getdecryptdata = (getDecryptData) onNavigationEvent(new Object[]{this, obj16 instanceof Map ? (Map) obj16 : null}, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -1420428096, 1420428096);
            Object obj17 = map.get("textTracks");
            List<getSignForPKCS7V2WithAttr> listOnExtraCallbackWithResult = onExtraCallbackWithResult(obj17 instanceof List ? (List) obj17 : null);
            Object obj18 = map.get("ad");
            getCertPEM getcertpemIAuthTabCallback = IAuthTabCallback(obj18 instanceof Map ? (Map) obj18 : null);
            Object obj19 = map.get("bufferConfig");
            getSignForPKCS7AndVIDRV3 getsignforpkcs7andvidrv3 = new getSignForPKCS7AndVIDRV3(str, str2, dDoubleValue2, dDoubleValue3, map2, getlicenseinfoOnWarmupCompleted, bool5, zBooleanValue2, zBooleanValue, zBooleanValue3, iIntValue3, iIntValue, d, iIntValue2, zBooleanValue4, getsignforpkcs7andvidrv2withattrOnExtraCallbackWithResult, getdecryptdata, listOnExtraCallbackWithResult, getcertpemIAuthTabCallback, onExtraCallback(obj19 instanceof Map ? (Map) obj19 : null));
            getSignForPKCS7NoContents getsignforpkcs7nocontents2 = this.onWarmupCompleted;
            if (getsignforpkcs7nocontents2 != null) {
                getsignforpkcs7nocontents2.onExtraCallbackWithResult(getsignforpkcs7andvidrv3);
            }
            if (this.onExtraCallbackWithResult || (getsignforpkcs7nocontents = this.onWarmupCompleted) == null) {
                return;
            }
            getsignforpkcs7nocontents.asInterface();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final getLicenseInfo onWarmupCompleted(Map<String, ? extends Object> map) throws Throwable {
        getSignForPKCS7AndVIDRV2NoContents getsignforpkcs7andvidrv2nocontents;
        String str;
        int i = 2 % 2;
        String str2 = null;
        if (map == null) {
            int i2 = writeTypedObject + 43;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        Object[] objArr = new Object[1];
        a((short) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 56), (byte) (Color.green(0) + 45), (-1724573170) - (KeyEvent.getMaxKeyCode() >> 16), View.combineMeasuredStates(0, 0) - 1816548232, TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') - 112, objArr);
        Object obj = map.get(((String) objArr[0]).intern());
        String str3 = !((obj instanceof String) ^ true) ? (String) obj : null;
        if (str3 == null) {
            getsignforpkcs7andvidrv2nocontents = getSignForPKCS7AndVIDRV2NoContents.NONE;
        } else {
            int iHashCode = str3.hashCode();
            if (iHashCode != -1860423953) {
                if (iHashCode != -1400551171) {
                    int i4 = ICustomTabsCallback + 115;
                    writeTypedObject = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    if (iHashCode == 790309106 && str3.equals("clearkey")) {
                        int i5 = writeTypedObject + 101;
                        ICustomTabsCallback = i5 % 128;
                        if (i5 % 2 == 0) {
                            getSignForPKCS7AndVIDRV2NoContents getsignforpkcs7andvidrv2nocontents2 = getSignForPKCS7AndVIDRV2NoContents.CLEARKEY;
                            str2.hashCode();
                            throw null;
                        }
                        getsignforpkcs7andvidrv2nocontents = getSignForPKCS7AndVIDRV2NoContents.CLEARKEY;
                    }
                } else if (str3.equals("widevine")) {
                    int i6 = ICustomTabsCallback + 103;
                    writeTypedObject = i6 % 128;
                    if (i6 % 2 != 0) {
                        getsignforpkcs7andvidrv2nocontents = getSignForPKCS7AndVIDRV2NoContents.WIDEVINE;
                        int i7 = 84 / 0;
                    } else {
                        getsignforpkcs7andvidrv2nocontents = getSignForPKCS7AndVIDRV2NoContents.WIDEVINE;
                    }
                }
            } else if (str3.equals("playready")) {
                getsignforpkcs7andvidrv2nocontents = getSignForPKCS7AndVIDRV2NoContents.PLAYREADY;
            }
        }
        Object[] objArr2 = new Object[1];
        a((short) ((-107) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 123), View.combineMeasuredStates(0, 0) - 1724573162, (Process.myTid() >> 22) - 1816548244, 65471 - AndroidCharacter.getMirror('0'), objArr2);
        Map map2 = (Map) onNavigationEvent(new Object[]{this, map.get(((String) objArr2[0]).intern())}, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 834395958, -834395956);
        Object obj2 = map.get("licenseServer");
        String str4 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("contentId");
        if (obj3 instanceof String) {
            int i8 = ICustomTabsCallback + 81;
            writeTypedObject = i8 % 128;
            if (i8 % 2 != 0) {
                str = (String) obj3;
                int i9 = 33 / 0;
            } else {
                str = (String) obj3;
            }
            str2 = str;
        }
        return new getLicenseInfo(getsignforpkcs7andvidrv2nocontents, str4, map2, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        Pair pairIAuthTabCallback;
        String str;
        String str2;
        Pair pairIAuthTabCallback2;
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 9;
        ICustomTabsCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            boolean z = obj instanceof Map;
            throw null;
        }
        if (obj instanceof Map) {
            Set<Map.Entry> setEntrySet = ((Map) obj).entrySet();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : setEntrySet) {
                int i3 = writeTypedObject + 31;
                ICustomTabsCallback = i3 % 128;
                int i4 = i3 % 2;
                Object key = entry.getKey();
                Object value = entry.getValue();
                String str3 = key instanceof String ? (String) key : null;
                if (str3 != null) {
                    String str4 = value instanceof String ? (String) value : null;
                    pairIAuthTabCallback2 = str4 != null ? getWrite.IAuthTabCallback(str3, str4) : null;
                }
                if (pairIAuthTabCallback2 != null) {
                    arrayList.add(pairIAuthTabCallback2);
                }
            }
            Map mapOnExtraCallbackWithResult = access8100.onExtraCallbackWithResult(arrayList);
            if (!mapOnExtraCallbackWithResult.isEmpty()) {
                return mapOnExtraCallbackWithResult;
            }
            int i5 = writeTypedObject + 49;
            int i6 = i5 % 128;
            ICustomTabsCallback = i6;
            if (i5 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            int i7 = i6 + 117;
            writeTypedObject = i7 % 128;
            if (i7 % 2 == 0) {
                return null;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof List)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : (Iterable) obj) {
            int i8 = ICustomTabsCallback + 109;
            writeTypedObject = i8 % 128;
            int i9 = i8 % 2;
            Map map = obj3 instanceof Map ? (Map) obj3 : null;
            if (map == null) {
                pairIAuthTabCallback = null;
            } else {
                Object[] objArr2 = new Object[1];
                b(4 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) View.combineMeasuredStates(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 8, objArr2);
                Object obj4 = map.get(((String) objArr2[0]).intern());
                if (obj4 instanceof String) {
                    int i10 = ICustomTabsCallback + 115;
                    writeTypedObject = i10 % 128;
                    if (i10 % 2 != 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    str = (String) obj4;
                } else {
                    str = null;
                }
                if (str != null) {
                    Object[] objArr3 = new Object[1];
                    a((short) (View.MeasureSpec.getSize(0) - 85), (byte) ((-75) - View.combineMeasuredStates(0, 0)), (-1724573155) + (ViewConfiguration.getLongPressTimeout() >> 16), (-1816548231) - ((byte) KeyEvent.getModifierMetaStateMask()), (-113) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
                    Object obj5 = map.get(((String) objArr3[0]).intern());
                    if (obj5 instanceof String) {
                        int i11 = writeTypedObject + 23;
                        ICustomTabsCallback = i11 % 128;
                        int i12 = i11 % 2;
                        str2 = (String) obj5;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        int i13 = ICustomTabsCallback + 61;
                        writeTypedObject = i13 % 128;
                        if (i13 % 2 != 0) {
                            pairIAuthTabCallback = getWrite.IAuthTabCallback(str, str2);
                            int i14 = 83 / 0;
                        } else {
                            pairIAuthTabCallback = getWrite.IAuthTabCallback(str, str2);
                        }
                    }
                }
            }
            if (pairIAuthTabCallback != null) {
                arrayList2.add(pairIAuthTabCallback);
            }
        }
        Map mapOnExtraCallbackWithResult2 = access8100.onExtraCallbackWithResult(arrayList2);
        if (mapOnExtraCallbackWithResult2.isEmpty()) {
            return null;
        }
        return mapOnExtraCallbackWithResult2;
    }

    private final getSignForPKCS7AndVIDRV2WithAttr onExtraCallbackWithResult(Map<String, ? extends Object> map) throws Throwable {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i = 2 % 2;
        String str6 = null;
        if (map == null) {
            int i2 = writeTypedObject + 35;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }
        Object[] objArr = new Object[1];
        b(5 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 11 - (Process.myTid() >> 22), objArr);
        Object obj = map.get(((String) objArr[0]).intern());
        if (obj instanceof String) {
            int i3 = ICustomTabsCallback + 41;
            writeTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                str5 = (String) obj;
                int i4 = 97 / 0;
            } else {
                str5 = (String) obj;
            }
            str = str5;
        } else {
            str = null;
        }
        Object[] objArr2 = new Object[1];
        a((short) (View.MeasureSpec.getMode(0) + 108), (byte) (86 - Drawable.resolveOpacity(0, 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1724573151, (-1833325449) - Color.rgb(0, 0, 0), (-113) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
        Object obj2 = map.get(((String) objArr2[0]).intern());
        String str7 = obj2 instanceof String ? (String) obj2 : null;
        Object[] objArr3 = new Object[1];
        a((short) ((-7) - View.combineMeasuredStates(0, 0)), (byte) ((-118) - View.getDefaultSize(0, 0)), Drawable.resolveOpacity(0, 0) - 1724573142, (ViewConfiguration.getTouchSlop() >> 8) - 1816548248, (-114) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), objArr3);
        Object obj3 = map.get(((String) objArr3[0]).intern());
        if (obj3 instanceof String) {
            int i5 = writeTypedObject + 43;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 == 0) {
                str4 = (String) obj3;
                int i6 = 43 / 0;
            } else {
                str4 = (String) obj3;
            }
            str2 = str4;
        } else {
            str2 = null;
        }
        Object obj4 = map.get("artist");
        if (obj4 instanceof String) {
            int i7 = ICustomTabsCallback + 111;
            writeTypedObject = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            str3 = (String) obj4;
        } else {
            str3 = null;
        }
        Object obj5 = map.get("imageUri");
        if (obj5 instanceof String) {
            int i8 = ICustomTabsCallback + 21;
            writeTypedObject = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            str6 = (String) obj5;
        }
        return new getSignForPKCS7AndVIDRV2WithAttr(str, str7, str2, str3, str6);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        int i;
        Map map;
        Map map2;
        int iIntValue;
        Map map3 = (Map) objArr[1];
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 69;
        writeTypedObject = i3 % 128;
        Map map4 = null;
        if (i3 % 2 != 0) {
            map4.hashCode();
            throw null;
        }
        if (map3 == null) {
            return null;
        }
        Object[] objArr2 = new Object[1];
        a((short) ((-78) - (Process.myPid() >> 22)), (byte) (ExpandableListView.getPackedPositionType(0L) - 16), (-1724573166) - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), (-1816548239) + ExpandableListView.getPackedPositionType(0L), (-112) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
        Object obj = map3.get(((String) objArr2[0]).intern());
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            int i4 = ICustomTabsCallback + 47;
            writeTypedObject = i4 % 128;
            if (i4 % 2 != 0) {
                iIntValue = number.intValue();
                int i5 = 25 / 0;
            } else {
                iIntValue = number.intValue();
            }
            i = iIntValue;
        } else {
            i = 1;
        }
        Object obj2 = map3.get("request");
        Map map5 = obj2 instanceof Map ? (Map) obj2 : null;
        Object[] objArr3 = new Object[1];
        b(7 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), (char) View.combineMeasuredStates(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
        Object obj3 = map3.get(((String) objArr3[0]).intern());
        if (obj3 instanceof Map) {
            int i6 = ICustomTabsCallback + 87;
            writeTypedObject = i6 % 128;
            if (i6 % 2 != 0) {
                map2 = (Map) obj3;
                int i7 = 38 / 0;
            } else {
                map2 = (Map) obj3;
            }
            map = map2;
        } else {
            map = null;
        }
        Object obj4 = map3.get("object");
        Map map6 = obj4 instanceof Map ? (Map) obj4 : null;
        Object obj5 = map3.get("status");
        if (!(!(obj5 instanceof Map))) {
            int i8 = ICustomTabsCallback + 77;
            writeTypedObject = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            map4 = (Map) obj5;
        }
        return new getDecryptData(i, map5, map, map6, map4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r1.hasNext() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        r5 = (java.util.Map) r1.next();
        r6 = (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5;
        r8 = net.sf.scuba.smartcards.BuildConfig.FLAVOR;
        r12 = new java.lang.Object[1];
        b(r6, (char) (android.text.TextUtils.lastIndexOf(net.sf.scuba.smartcards.BuildConfig.FLAVOR, '0', 0) + 1), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, r12);
        r6 = r5.get(((java.lang.String) r12[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        if ((r6 instanceof java.lang.String) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        r7 = run.granite.video.GraniteVideoView.ICustomTabsCallback + 31;
        run.granite.video.GraniteVideoView.writeTypedObject = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        if ((r7 % 2) != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        r6 = (java.lang.String) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        r6 = (java.lang.String) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (r6 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        r6 = run.granite.video.GraniteVideoView.writeTypedObject + 23;
        run.granite.video.GraniteVideoView.ICustomTabsCallback = r6 % 128;
        r6 = r6 % 2;
        r6 = net.sf.scuba.smartcards.BuildConfig.FLAVOR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        r7 = r5.get("language");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        if ((r7 instanceof java.lang.String) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        r7 = (java.lang.String) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        if (r7 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        r7 = run.granite.video.GraniteVideoView.writeTypedObject + 123;
        run.granite.video.GraniteVideoView.ICustomTabsCallback = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        if ((r7 % 2) == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        r7 = net.sf.scuba.smartcards.BuildConfig.FLAVOR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
    
        r10 = new java.lang.Object[1];
        a((short) (56 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (byte) (45 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) - 1724573170, android.view.View.combineMeasuredStates(0, 0) - 1816548232, android.view.KeyEvent.getDeadChar(0, 0) - 113, r10);
        r10 = r5.get(((java.lang.String) r10[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e6, code lost:
    
        if ((r10 instanceof java.lang.String) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e8, code lost:
    
        r10 = (java.lang.String) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00eb, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ec, code lost:
    
        if (r10 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ee, code lost:
    
        r10 = net.sf.scuba.smartcards.BuildConfig.FLAVOR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
    
        r9 = new java.lang.Object[1];
        b((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 3, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 1), 16 - android.view.Gravity.getAbsoluteGravity(0, 0), r9);
        r5 = r5.get(((java.lang.String) r9[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011a, code lost:
    
        if ((r5 instanceof java.lang.String) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011c, code lost:
    
        r5 = (java.lang.String) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011f, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0120, code lost:
    
        if (r5 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0123, code lost:
    
        r8 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0124, code lost:
    
        r4.add(new o.getSignForPKCS7V2WithAttr(r6, r7, r10, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0132, code lost:
    
        if (r4.isEmpty() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0134, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0135, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r19 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r19 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r1 = r19;
        r4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, 10));
        r1 = r1.iterator();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<getSignForPKCS7V2WithAttr> onExtraCallbackWithResult(List<? extends Map<String, ? extends Object>> list) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 111;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 84 / 0;
        }
    }

    private final getCertPEM IAuthTabCallback(Map<String, ? extends Object> map) throws Throwable {
        String str;
        String str2;
        int i = 2 % 2;
        if (map == null) {
            return null;
        }
        Object[] objArr = new Object[1];
        a((short) (55 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 44), (-1724573169) + TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), Color.rgb(0, 0, 0) - 1799771016, View.resolveSizeAndState(0, 0, 0) - 113, objArr);
        Object obj = map.get(((String) objArr[0]).intern());
        String str3 = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("streamType");
        String str4 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("adTagUrl");
        if (obj3 instanceof String) {
            int i2 = ICustomTabsCallback + 93;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            str = (String) obj3;
        } else {
            str = null;
        }
        Object obj4 = map.get("adLanguage");
        String str5 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = map.get("contentSourceId");
        String str6 = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = map.get("videoId");
        String str7 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = map.get("assetKey");
        String str8 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = map.get("format");
        String str9 = obj8 instanceof String ? (String) obj8 : null;
        Object obj9 = map.get("fallbackUri");
        if (obj9 instanceof String) {
            int i4 = writeTypedObject + 19;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 == 0) {
                map.hashCode();
                throw null;
            }
            str2 = (String) obj9;
        } else {
            str2 = null;
        }
        Object obj10 = map.get("adTagParameters");
        return new getCertPEM(str3, str4, str, str5, str6, str7, str8, str9, str2, obj10 instanceof Map ? (Map) obj10 : null);
    }

    private final getCertV3PEM onExtraCallback(Map<String, ? extends Object> map) {
        Number number;
        Number number2;
        Number number3;
        getDigestInfo getdigestinfo;
        float f;
        int iIntValue;
        Number number4;
        int iIntValue2;
        int i;
        int iIntValue3;
        float fFloatValue;
        int i2 = 2 % 2;
        if (map == null) {
            return null;
        }
        Object obj = map.get("live");
        Map map2 = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map.get("minBufferMs");
        Number number5 = obj2 instanceof Number ? (Number) obj2 : null;
        int iIntValue4 = number5 != null ? number5.intValue() : 15000;
        Object obj3 = map.get("maxBufferMs");
        if (obj3 instanceof Number) {
            int i3 = ICustomTabsCallback + 77;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            number = (Number) obj3;
        } else {
            number = null;
        }
        int iIntValue5 = number != null ? number.intValue() : 50000;
        Object obj4 = map.get("bufferForPlaybackMs");
        Number number6 = obj4 instanceof Number ? (Number) obj4 : null;
        int iIntValue6 = number6 != null ? number6.intValue() : 2500;
        Object obj5 = map.get("bufferForPlaybackAfterRebufferMs");
        if (obj5 instanceof Number) {
            int i5 = writeTypedObject + 123;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            number2 = (Number) obj5;
        } else {
            number2 = null;
        }
        int iIntValue7 = number2 != null ? number2.intValue() : 5000;
        Object obj6 = map.get("backBufferDurationMs");
        if (!(!(obj6 instanceof Number))) {
            int i7 = ICustomTabsCallback + 95;
            writeTypedObject = i7 % 128;
            if (i7 % 2 != 0) {
                number.hashCode();
                throw null;
            }
            number3 = (Number) obj6;
        } else {
            number3 = null;
        }
        int iIntValue8 = number3 != null ? number3.intValue() : 0;
        Object obj7 = map.get("cacheSizeMB");
        Number number7 = obj7 instanceof Number ? (Number) obj7 : null;
        int iIntValue9 = number7 != null ? number7.intValue() : 0;
        if (map2 != null) {
            Object obj8 = map2.get("maxPlaybackSpeed");
            Number number8 = obj8 instanceof Number ? (Number) obj8 : null;
            if (number8 != null) {
                int i8 = writeTypedObject + 65;
                ICustomTabsCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    fFloatValue = number8.floatValue();
                    int i9 = 52 / 0;
                } else {
                    fFloatValue = number8.floatValue();
                }
                f = fFloatValue;
            } else {
                f = -1.0f;
            }
            Object obj9 = map2.get("minPlaybackSpeed");
            Number number9 = obj9 instanceof Number ? (Number) obj9 : null;
            float fFloatValue2 = number9 != null ? number9.floatValue() : -1.0f;
            Object obj10 = map2.get("maxOffsetMs");
            Number number10 = obj10 instanceof Number ? (Number) obj10 : null;
            if (number10 != null) {
                int i10 = ICustomTabsCallback + 99;
                writeTypedObject = i10 % 128;
                if (i10 % 2 != 0) {
                    number10.intValue();
                    number.hashCode();
                    throw null;
                }
                iIntValue = number10.intValue();
            } else {
                iIntValue = -1;
            }
            Object obj11 = map2.get("minOffsetMs");
            if (obj11 instanceof Number) {
                int i11 = ICustomTabsCallback + 59;
                writeTypedObject = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
                number4 = (Number) obj11;
            } else {
                number4 = null;
            }
            if (number4 != null) {
                int i12 = ICustomTabsCallback + 49;
                writeTypedObject = i12 % 128;
                int i13 = i12 % 2;
                iIntValue2 = number4.intValue();
            } else {
                int i14 = writeTypedObject + 91;
                ICustomTabsCallback = i14 % 128;
                int i15 = i14 % 2;
                iIntValue2 = -1;
            }
            Object obj12 = map2.get("targetOffsetMs");
            number = obj12 instanceof Number ? (Number) obj12 : null;
            if (number != null) {
                int i16 = writeTypedObject + 119;
                ICustomTabsCallback = i16 % 128;
                if (i16 % 2 == 0) {
                    iIntValue3 = number.intValue();
                    int i17 = 62 / 0;
                } else {
                    iIntValue3 = number.intValue();
                }
                i = iIntValue3;
            } else {
                i = -1;
            }
            getdigestinfo = new getDigestInfo(f, fFloatValue2, iIntValue, iIntValue2, i);
        } else {
            getdigestinfo = null;
        }
        return new getCertV3PEM(iIntValue4, iIntValue5, iIntValue6, iIntValue7, iIntValue8, iIntValue9, getdigestinfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setPaused(boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 93;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        if (i2 % 2 == 0) {
            this.onExtraCallbackWithResult = z;
            int i4 = 46 / 0;
            if (!z) {
                getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
                if (getsignforpkcs7nocontents != null) {
                    int i5 = i3 + 31;
                    writeTypedObject = i5 % 128;
                    int i6 = i5 % 2;
                    getsignforpkcs7nocontents.asInterface();
                }
            } else {
                getSignForPKCS7NoContents getsignforpkcs7nocontents2 = this.onWarmupCompleted;
                if (getsignforpkcs7nocontents2 != null) {
                    int i7 = i3 + 115;
                    writeTypedObject = i7 % 128;
                    int i8 = i7 % 2;
                    getsignforpkcs7nocontents2.asBinder();
                    return;
                }
            }
        } else {
            this.onExtraCallbackWithResult = z;
            if (z) {
            }
        }
        int i9 = ICustomTabsCallback + 115;
        writeTypedObject = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e A[PHI: r1
      0x001e: PHI (r1v5 o.getSignForPKCS7NoContents) = (r1v4 o.getSignForPKCS7NoContents), (r1v7 o.getSignForPKCS7NoContents) binds: [B:8:0x001c, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setMuted(boolean z) {
        getSignForPKCS7NoContents getsignforpkcs7nocontents;
        int i = 2 % 2;
        int i2 = writeTypedObject + 75;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.onNavigationEvent = z;
            getsignforpkcs7nocontents = this.onWarmupCompleted;
            int i3 = 3 / 0;
            if (getsignforpkcs7nocontents != null) {
                getsignforpkcs7nocontents.onNavigationEvent(z);
            }
        } else {
            this.onNavigationEvent = z;
            getsignforpkcs7nocontents = this.onWarmupCompleted;
            if (getsignforpkcs7nocontents != null) {
            }
        }
        int i4 = ICustomTabsCallback + 23;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r1
      0x001f: PHI (r1v5 o.getSignForPKCS7NoContents) = (r1v4 o.getSignForPKCS7NoContents), (r1v8 o.getSignForPKCS7NoContents) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setVolume(float f) {
        getSignForPKCS7NoContents getsignforpkcs7nocontents;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 105;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            this.IAuthTabCallbackDefault = f;
            getsignforpkcs7nocontents = this.onWarmupCompleted;
            int i3 = 83 / 0;
            if (getsignforpkcs7nocontents != null) {
                getsignforpkcs7nocontents.onWarmupCompleted(f);
                int i4 = ICustomTabsCallback + 87;
                writeTypedObject = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            this.IAuthTabCallbackDefault = f;
            getsignforpkcs7nocontents = this.onWarmupCompleted;
            if (getsignforpkcs7nocontents != null) {
            }
        }
        int i6 = writeTypedObject + 55;
        ICustomTabsCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        boolean z2;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallbackStubProxy)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            float f = 0.0f;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString(BuildConfig.FLAVOR) + 43425), 42 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 22439 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i7 = -1;
            if (iIntValue == -1) {
                int i8 = $11 + 97;
                $10 = i8 % 128;
                z = i8 % 2 == 0;
            }
            if (z) {
                byte[] bArr2 = IAuthTabCallback_Parcel;
                if (bArr2 != null) {
                    int i9 = $11 + 125;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i5])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char cRgb = (char) (Color.rgb(0, 0, 0) + 16790059);
                            int iIndexOf = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 55;
                            int i10 = 2167 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1));
                            byte b2 = (byte) i7;
                            byte b3 = (byte) (b2 + 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRgb, iIndexOf, i10, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr[i5] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i5++;
                        i7 = -1;
                        f = 0.0f;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = IAuthTabCallback_Parcel;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(access000)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 43424), Color.red(0) + 42, 22440 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStubProxy ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (access100[i + ((int) (access000 ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStubProxy ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i11 = ((i + iIntValue) - 2) + ((int) (access000 ^ (-4629411779493505016L)));
                if (z) {
                    int i12 = $11 + 45;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i11 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(getInterfaceDescriptor), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 87, View.resolveSizeAndState(0, 0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = IAuthTabCallback_Parcel;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr5[i14] = (byte) (bArr4[i14] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i15 = $10 + 43;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i17 = $10;
                    int i18 = i17 + 123;
                    $11 = i18 % 128;
                    if (i18 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (z2) {
                        int i19 = i17 + 15;
                        $11 = i19 % 128;
                        int i20 = i19 % 2;
                        byte[] bArr6 = IAuthTabCallback_Parcel;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = access100;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
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

    public final void setRate(float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 43;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface = f;
        getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
        if (getsignforpkcs7nocontents != null) {
            getsignforpkcs7nocontents.onExtraCallback(f);
            int i4 = ICustomTabsCallback + 13;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void setRepeat(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 115;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        this.asBinder = z;
        getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
        if (getsignforpkcs7nocontents != null) {
            int i5 = i2 + 123;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            getsignforpkcs7nocontents.IAuthTabCallbackStub(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setResizeMode(@NotNull String str) throws Throwable {
        getSignForPKCS7AndVIDRV3NoContentsWithAttr getsignforpkcs7andvidrv3nocontentswithattr;
        int i = 2 % 2;
        int i2 = writeTypedObject + 65;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.IAuthTabCallbackStub = str;
        int iHashCode = str.hashCode();
        if (iHashCode != -1881872635) {
            int i4 = writeTypedObject + 9;
            int i5 = i4 % 128;
            ICustomTabsCallback = i5;
            int i6 = i4 % 2;
            if (iHashCode == 3387192) {
                Object[] objArr = new Object[1];
                b(4 - (Process.myTid() >> 22), (char) (Process.getGidForName(BuildConfig.FLAVOR) + 12444), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19, objArr);
                if (str.equals(((String) objArr[0]).intern())) {
                    int i7 = ICustomTabsCallback + 123;
                    writeTypedObject = i7 % 128;
                    if (i7 % 2 != 0) {
                        getsignforpkcs7andvidrv3nocontentswithattr = getSignForPKCS7AndVIDRV3NoContentsWithAttr.NONE;
                        int i8 = 97 / 0;
                    } else {
                        getsignforpkcs7andvidrv3nocontentswithattr = getSignForPKCS7AndVIDRV3NoContentsWithAttr.NONE;
                    }
                    int i9 = ICustomTabsCallback + 101;
                    writeTypedObject = i9 % 128;
                    int i10 = i9 % 2;
                }
            } else if (iHashCode == 94852023) {
                int i11 = i5 + 67;
                writeTypedObject = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 57 / 0;
                    if (str.equals("cover")) {
                        int i13 = writeTypedObject + 25;
                        ICustomTabsCallback = i13 % 128;
                        int i14 = i13 % 2;
                        getsignforpkcs7andvidrv3nocontentswithattr = getSignForPKCS7AndVIDRV3NoContentsWithAttr.COVER;
                    } else {
                        getsignforpkcs7andvidrv3nocontentswithattr = getSignForPKCS7AndVIDRV3NoContentsWithAttr.CONTAIN;
                    }
                } else if (str.equals("cover")) {
                }
            }
        } else if (str.equals("stretch")) {
            getsignforpkcs7andvidrv3nocontentswithattr = getSignForPKCS7AndVIDRV3NoContentsWithAttr.STRETCH;
        }
        getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
        if (getsignforpkcs7nocontents != null) {
            getsignforpkcs7nocontents.onWarmupCompleted(getsignforpkcs7andvidrv3nocontentswithattr);
        }
    }

    public final void setControls(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 3;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
        if (getsignforpkcs7nocontents != null) {
            getsignforpkcs7nocontents.onExtraCallback(z);
        }
        int i3 = ICustomTabsCallback + 61;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setFullscreen(boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 77;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
        if (getsignforpkcs7nocontents != null) {
            getSignForPKCS7NoContents.onExtraCallback(getsignforpkcs7nocontents, z, false, 2, (Object) null);
            int i3 = writeTypedObject + 111;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public final void setPictureInPicture(boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 15;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 87;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setDisableAudioFocus(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 121;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
        if (getsignforpkcs7nocontents != null) {
            int i4 = i2 + 61;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            getsignforpkcs7nocontents.IAuthTabCallback(z);
        }
    }

    public final void setPlayInBackground(boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 115;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
        if (getsignforpkcs7nocontents != null) {
            int i5 = i2 + 51;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            getsignforpkcs7nocontents.onExtraCallbackWithResult(z);
            if (i6 == 0) {
                int i7 = 37 / 0;
            }
        }
        int i8 = writeTypedObject + 51;
        ICustomTabsCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setPlayWhenInactive(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 59;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 13;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setBufferConfig(@Nullable Map<String, ? extends Object> map) {
        Map map2;
        Number number;
        int iIntValue;
        Number number2;
        int iIntValue2;
        int iIntValue3;
        getDigestInfo getdigestinfo;
        Number number3;
        int i = 2 % 2;
        if (map != null) {
            Object obj = map.get("live");
            if (obj instanceof Map) {
                int i2 = ICustomTabsCallback + 75;
                writeTypedObject = i2 % 128;
                if (i2 % 2 != 0) {
                    map2 = (Map) obj;
                    int i3 = 42 / 0;
                } else {
                    map2 = (Map) obj;
                }
            } else {
                map2 = null;
            }
            Object obj2 = map.get("minBufferMs");
            Number number4 = !((obj2 instanceof Number) ^ true) ? (Number) obj2 : null;
            int iIntValue4 = number4 != null ? number4.intValue() : 15000;
            Object obj3 = map.get("maxBufferMs");
            if (obj3 instanceof Number) {
                int i4 = writeTypedObject + 95;
                ICustomTabsCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                number = (Number) obj3;
            } else {
                number = null;
            }
            if (number != null) {
                iIntValue = number.intValue();
            } else {
                int i5 = ICustomTabsCallback + 11;
                writeTypedObject = i5 % 128;
                int i6 = i5 % 2;
                iIntValue = 50000;
            }
            int i7 = iIntValue;
            Object obj4 = map.get("bufferForPlaybackMs");
            if (obj4 instanceof Number) {
                int i8 = ICustomTabsCallback + 121;
                writeTypedObject = i8 % 128;
                int i9 = i8 % 2;
                number2 = (Number) obj4;
            } else {
                number2 = null;
            }
            if (number2 != null) {
                int i10 = ICustomTabsCallback + 77;
                writeTypedObject = i10 % 128;
                int i11 = i10 % 2;
                iIntValue2 = number2.intValue();
            } else {
                iIntValue2 = 2500;
            }
            int i12 = iIntValue2;
            Object obj5 = map.get("bufferForPlaybackAfterRebufferMs");
            Number number5 = obj5 instanceof Number ? (Number) obj5 : null;
            int iIntValue5 = number5 != null ? number5.intValue() : 5000;
            Object obj6 = map.get("backBufferDurationMs");
            Number number6 = obj6 instanceof Number ? (Number) obj6 : null;
            if (number6 != null) {
                int i13 = writeTypedObject + 81;
                ICustomTabsCallback = i13 % 128;
                if (i13 % 2 == 0) {
                    number6.intValue();
                    throw null;
                }
                iIntValue3 = number6.intValue();
            } else {
                iIntValue3 = 0;
            }
            Object obj7 = map.get("cacheSizeMB");
            Number number7 = obj7 instanceof Number ? (Number) obj7 : null;
            int iIntValue6 = number7 != null ? number7.intValue() : 0;
            if (map2 != null) {
                Object obj8 = map2.get("maxPlaybackSpeed");
                Number number8 = obj8 instanceof Number ? (Number) obj8 : null;
                float fFloatValue = number8 != null ? number8.floatValue() : -1.0f;
                Object obj9 = map2.get("minPlaybackSpeed");
                Number number9 = obj9 instanceof Number ? (Number) obj9 : null;
                float fFloatValue2 = number9 != null ? number9.floatValue() : -1.0f;
                Object obj10 = map2.get("maxOffsetMs");
                Number number10 = obj10 instanceof Number ? (Number) obj10 : null;
                int iIntValue7 = number10 != null ? number10.intValue() : -1;
                Object obj11 = map2.get("minOffsetMs");
                if (obj11 instanceof Number) {
                    int i14 = ICustomTabsCallback + 83;
                    writeTypedObject = i14 % 128;
                    int i15 = i14 % 2;
                    number3 = (Number) obj11;
                } else {
                    number3 = null;
                }
                int iIntValue8 = number3 != null ? number3.intValue() : -1;
                Object obj12 = map2.get("targetOffsetMs");
                Number number11 = (obj12 instanceof Number) ^ true ? null : (Number) obj12;
                getdigestinfo = new getDigestInfo(fFloatValue, fFloatValue2, iIntValue7, iIntValue8, number11 != null ? number11.intValue() : -1);
            } else {
                getdigestinfo = null;
            }
            getCertV3PEM getcertv3pem = new getCertV3PEM(iIntValue4, i7, i12, iIntValue5, iIntValue3, iIntValue6, getdigestinfo);
            getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
            if (getsignforpkcs7nocontents != null) {
                int i16 = writeTypedObject + 121;
                ICustomTabsCallback = i16 % 128;
                int i17 = i16 % 2;
                getsignforpkcs7nocontents.onExtraCallback(getcertv3pem);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 o.getSignForPKCS7NoContents) = (r1v4 o.getSignForPKCS7NoContents), (r1v7 o.getSignForPKCS7NoContents) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setMaxBitRate(int i) {
        getSignForPKCS7NoContents getsignforpkcs7nocontents;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 77;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            getsignforpkcs7nocontents = this.onWarmupCompleted;
            int i4 = 99 / 0;
            if (getsignforpkcs7nocontents != null) {
                getsignforpkcs7nocontents.onExtraCallbackWithResult(i);
            }
        } else {
            getsignforpkcs7nocontents = this.onWarmupCompleted;
            if (getsignforpkcs7nocontents != null) {
            }
        }
        int i5 = writeTypedObject + 37;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 o.getSignForPKCS7NoContents) = (r1v4 o.getSignForPKCS7NoContents), (r1v7 o.getSignForPKCS7NoContents) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setMinLoadRetryCount(int i) {
        getSignForPKCS7NoContents getsignforpkcs7nocontents;
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 107;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            getsignforpkcs7nocontents = this.onWarmupCompleted;
            int i4 = 94 / 0;
            if (getsignforpkcs7nocontents != null) {
                getsignforpkcs7nocontents.onExtraCallback(i);
            }
        } else {
            getsignforpkcs7nocontents = this.onWarmupCompleted;
            if (getsignforpkcs7nocontents != null) {
            }
        }
        int i5 = writeTypedObject + 23;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setContentStartTime(double d) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 101;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
        if (getsignforpkcs7nocontents != null) {
            int i5 = i2 + 5;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            getsignforpkcs7nocontents.onWarmupCompleted(d);
        }
    }

    public final void setSelectedAudioTrack(@Nullable Map<String, ? extends Object> map) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 93;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 78 / 0;
            if (map == null) {
                return;
            }
        } else if (map == null) {
            return;
        }
        Object[] objArr = new Object[1];
        a((short) (Drawable.resolveOpacity(0, 0) + 56), (byte) (45 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (-1724573171) + (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (-1816548232) - Color.green(0), (-114) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        Object obj = map.get(((String) objArr[0]).intern());
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            int i4 = writeTypedObject + 123;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 == 0) {
                str.hashCode();
                throw null;
            }
            str = "system";
        }
        Object[] objArr2 = new Object[1];
        a((short) ((ViewConfiguration.getFadingEdgeLength() >> 16) - 85), (byte) ((-76) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0)), (-1724573155) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 1816548230, (-113) - Color.blue(0), objArr2);
        Object obj2 = map.get(((String) objArr2[0]).intern());
        getSignForPKCS7AndVIDRV3NoContents getsignforpkcs7andvidrv3nocontents = new getSignForPKCS7AndVIDRV3NoContents(str, !((obj2 instanceof String) ^ true) ? (String) obj2 : null);
        getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
        if (getsignforpkcs7nocontents != null) {
            getsignforpkcs7nocontents.onWarmupCompleted(getsignforpkcs7andvidrv3nocontents);
        }
    }

    public final void setSelectedTextTrack(@Nullable Map<String, ? extends Object> map) throws Throwable {
        String str;
        String str2;
        int i = 2 % 2;
        if (map != null) {
            Object[] objArr = new Object[1];
            a((short) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 56), (byte) (45 - (ViewConfiguration.getPressedStateDuration() >> 16)), Drawable.resolveOpacity(0, 0) - 1724573170, (-1816548232) + ((Process.getThreadPriority(0) + 20) >> 6), (-114) - ExpandableListView.getPackedPositionChild(0L), objArr);
            Object obj = map.get(((String) objArr[0]).intern());
            if (obj instanceof String) {
                str = (String) obj;
                int i2 = ICustomTabsCallback + 3;
                writeTypedObject = i2 % 128;
                int i3 = i2 % 2;
            } else {
                str = null;
            }
            if (str == null) {
                str = "system";
            }
            Object[] objArr2 = new Object[1];
            a((short) ((ViewConfiguration.getEdgeSlop() >> 16) - 85), (byte) (ExpandableListView.getPackedPositionGroup(0L) - 75), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) - 1724573154, (-1816548230) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-113) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
            Object obj2 = map.get(((String) objArr2[0]).intern());
            if (obj2 instanceof String) {
                str2 = (String) obj2;
                int i4 = ICustomTabsCallback + 93;
                writeTypedObject = i4 % 128;
                int i5 = i4 % 2;
            } else {
                str2 = null;
            }
            getSignForPKCS7AndVIDRV3NoContents getsignforpkcs7andvidrv3nocontents = new getSignForPKCS7AndVIDRV3NoContents(str, str2);
            getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
            if (getsignforpkcs7nocontents != null) {
                int i6 = writeTypedObject + 25;
                ICustomTabsCallback = i6 % 128;
                int i7 = i6 % 2;
                getsignforpkcs7nocontents.onNavigationEvent(getsignforpkcs7andvidrv3nocontents);
                if (i7 == 0) {
                    throw null;
                }
            }
        }
    }

    public final void setSelectedVideoTrack(@NotNull String str, int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 105;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
        if (getsignforpkcs7nocontents != null) {
            int i5 = writeTypedObject + 71;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            getsignforpkcs7nocontents.onNavigationEvent(str, i);
            if (i6 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i7 = ICustomTabsCallback + 3;
            writeTypedObject = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public final void setUseTextureView(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 29;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
        if (getsignforpkcs7nocontents != null) {
            getsignforpkcs7nocontents.asBinder(z);
            int i4 = ICustomTabsCallback + 69;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void setUseSecureView(boolean z) {
        int i = 2 % 2;
        getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
        Object obj = null;
        if (getsignforpkcs7nocontents != null) {
            int i2 = ICustomTabsCallback + 5;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            getsignforpkcs7nocontents.asInterface(z);
            if (i3 != 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i4 = ICustomTabsCallback + 9;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void setShutterColor(int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject;
        int i4 = i3 + 115;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
        if (getsignforpkcs7nocontents != null) {
            int i6 = i3 + 63;
            ICustomTabsCallback = i6 % 128;
            int i7 = i6 % 2;
            getsignforpkcs7nocontents.onWarmupCompleted(i);
            if (i7 == 0) {
                int i8 = 96 / 0;
            }
        }
        int i9 = ICustomTabsCallback + 9;
        writeTypedObject = i9 % 128;
        int i10 = i9 % 2;
    }

    public final void setHideShutterView(boolean z) {
        int i = 2 % 2;
        getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
        if (getsignforpkcs7nocontents != null) {
            int i2 = ICustomTabsCallback + 97;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            getsignforpkcs7nocontents.onWarmupCompleted(z);
        }
        int i4 = ICustomTabsCallback + 41;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallbackWithResult(double d, double d2) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 41;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
        if (getsignforpkcs7nocontents != null) {
            getsignforpkcs7nocontents.onNavigationEvent(d, d2);
            int i3 = ICustomTabsCallback + 95;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public final void onWarmupCompleted(double d, double d2) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 39;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(d, d2);
        int i4 = writeTypedObject + 77;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
    }

    public final void asBinder() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 123;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
        if (getsignforpkcs7nocontents != null) {
            int i5 = i3 + 69;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            getsignforpkcs7nocontents.asBinder();
            if (i6 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void access100() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 65;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
        if (getsignforpkcs7nocontents != null) {
            int i5 = i2 + 75;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            getsignforpkcs7nocontents.asInterface();
        }
        int i7 = writeTypedObject + 5;
        ICustomTabsCallback = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void setVolumeCommand(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 35;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        setVolume(f);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setFullScreenCommand(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 107;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        setFullscreen(z);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSourceCommand(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 31;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Object[] objArr = new Object[1];
        b((KeyEvent.getMaxKeyCode() >> 16) + 3, (char) View.getDefaultSize(0, 0), 17 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        setSource(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str)));
        int i4 = writeTypedObject + 13;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        getSignForPKCS7NoContents getsignforpkcs7nocontents = this.onWarmupCompleted;
        if (getsignforpkcs7nocontents != null) {
            int i2 = ICustomTabsCallback + 109;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            getsignforpkcs7nocontents.onWarmupCompleted();
            int i4 = writeTypedObject + 21;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void onWarmupCompleted(boolean z, @NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        decryptForRecoveryKey decryptforrecoverykey = this.IAuthTabCallback;
        if (decryptforrecoverykey != null) {
            int i2 = writeTypedObject + 97;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            decryptforrecoverykey.onNavigationEvent(z, str, str2);
        }
        int i4 = ICustomTabsCallback + 57;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onExtraCallbackWithResult(@NotNull getSignForPKCS7AndVIDRV2 getsignforpkcs7andvidrv2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getsignforpkcs7andvidrv2, BuildConfig.FLAVOR);
        decryptForRecoveryKey decryptforrecoverykey = this.IAuthTabCallback;
        if (decryptforrecoverykey != null) {
            int i2 = ICustomTabsCallback + 33;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            decryptforrecoverykey.onNavigationEvent(getsignforpkcs7andvidrv2);
            int i4 = writeTypedObject + 107;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void onExtraCallback(@NotNull getSignForPKCS7 getsignforpkcs7) {
        decryptForRecoveryKey decryptforrecoverykey;
        int i = 2 % 2;
        int i2 = writeTypedObject + 11;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(getsignforpkcs7, BuildConfig.FLAVOR);
            decryptforrecoverykey = this.IAuthTabCallback;
            int i3 = 88 / 0;
            if (decryptforrecoverykey == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(getsignforpkcs7, BuildConfig.FLAVOR);
            decryptforrecoverykey = this.IAuthTabCallback;
            if (decryptforrecoverykey == null) {
                return;
            }
        }
        int i4 = writeTypedObject + 65;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        decryptforrecoverykey.onExtraCallback(getsignforpkcs7);
        if (i5 == 0) {
            int i6 = 52 / 0;
        }
    }

    public void onNavigationEvent(@NotNull getSignForPKCS7AndVIDRV2NoContentsWithAttr getsignforpkcs7andvidrv2nocontentswithattr) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 63;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getsignforpkcs7andvidrv2nocontentswithattr, BuildConfig.FLAVOR);
        decryptForRecoveryKey decryptforrecoverykey = this.IAuthTabCallback;
        if (decryptforrecoverykey != null) {
            int i4 = ICustomTabsCallback + 77;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            decryptforrecoverykey.onExtraCallbackWithResult(getsignforpkcs7andvidrv2nocontentswithattr);
        }
        int i6 = ICustomTabsCallback + 125;
        writeTypedObject = i6 % 128;
        int i7 = i6 % 2;
    }

    public void onNavigationEvent(double d, double d2) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 33;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        decryptForRecoveryKey decryptforrecoverykey = this.IAuthTabCallback;
        if (decryptforrecoverykey != null) {
            int i5 = i2 + 123;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            decryptforrecoverykey.onWarmupCompleted(d, d2);
            if (i6 == 0) {
                int i7 = 39 / 0;
            }
        }
    }

    public void onWarmupCompleted() {
        int i = 2 % 2;
        decryptForRecoveryKey decryptforrecoverykey = this.IAuthTabCallback;
        if (decryptforrecoverykey != null) {
            int i2 = ICustomTabsCallback + 21;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            decryptforrecoverykey.onWarmupCompleted();
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = writeTypedObject + 91;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 87;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        decryptForRecoveryKey decryptforrecoverykey = this.IAuthTabCallback;
        if (decryptforrecoverykey != null) {
            int i5 = i3 + 65;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            decryptforrecoverykey.IAuthTabCallback(z);
        }
    }

    public void onExtraCallbackWithResult(double d, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallback + 7;
        int i5 = i4 % 128;
        writeTypedObject = i5;
        int i6 = i4 % 2;
        decryptForRecoveryKey decryptforrecoverykey = this.IAuthTabCallback;
        if (decryptforrecoverykey != null) {
            int i7 = i5 + 91;
            ICustomTabsCallback = i7 % 128;
            int i8 = i7 % 2;
            decryptforrecoverykey.onExtraCallbackWithResult(d, i, i2);
        }
    }

    public void onWarmupCompleted(boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        decryptForRecoveryKey decryptforrecoverykey = this.IAuthTabCallback;
        if (decryptforrecoverykey != null) {
            decryptforrecoverykey.IAuthTabCallback(z, z2, z3);
            int i2 = writeTypedObject + 103;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 4;
            }
        }
        int i4 = ICustomTabsCallback + 27;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public void IAuthTabCallback(float f) {
        decryptForRecoveryKey decryptforrecoverykey;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 37;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            decryptforrecoverykey = this.IAuthTabCallback;
            int i3 = 90 / 0;
            if (decryptforrecoverykey == null) {
                return;
            }
        } else {
            decryptforrecoverykey = this.IAuthTabCallback;
            if (decryptforrecoverykey == null) {
                return;
            }
        }
        decryptforrecoverykey.onExtraCallback(f);
        int i4 = ICustomTabsCallback + 103;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 101;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        decryptForRecoveryKey decryptforrecoverykey = this.IAuthTabCallback;
        if (decryptforrecoverykey != null) {
            decryptforrecoverykey.onExtraCallbackWithResult(f);
        }
        int i4 = writeTypedObject + 119;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r1
      0x001a: PHI (r1v5 o.decryptForRecoveryKey) = (r1v4 o.decryptForRecoveryKey), (r1v9 o.decryptForRecoveryKey) binds: [B:8:0x0018, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallbackDefault() {
        decryptForRecoveryKey decryptforrecoverykey;
        int i = 2 % 2;
        int i2 = writeTypedObject + 65;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            decryptforrecoverykey = this.IAuthTabCallback;
            int i3 = 4 / 0;
            if (decryptforrecoverykey != null) {
                decryptforrecoverykey.IAuthTabCallbackDefault();
            }
        } else {
            decryptforrecoverykey = this.IAuthTabCallback;
            if (decryptforrecoverykey != null) {
            }
        }
        int i4 = ICustomTabsCallback + 3;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r1
      0x001a: PHI (r1v5 o.decryptForRecoveryKey) = (r1v4 o.decryptForRecoveryKey), (r1v9 o.decryptForRecoveryKey) binds: [B:8:0x0018, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onTransact() {
        decryptForRecoveryKey decryptforrecoverykey;
        int i = 2 % 2;
        int i2 = writeTypedObject + 49;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            decryptforrecoverykey = this.IAuthTabCallback;
            int i3 = 6 / 0;
            if (decryptforrecoverykey != null) {
                decryptforrecoverykey.IAuthTabCallbackStub();
            }
        } else {
            decryptforrecoverykey = this.IAuthTabCallback;
            if (decryptforrecoverykey != null) {
            }
        }
        int i4 = ICustomTabsCallback + 15;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 23;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        decryptForRecoveryKey decryptforrecoverykey = this.IAuthTabCallback;
        if (decryptforrecoverykey != null) {
            decryptforrecoverykey.onExtraCallbackWithResult(z);
            int i3 = ICustomTabsCallback + 57;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public void onExtraCallback() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 67;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        decryptForRecoveryKey decryptforrecoverykey = this.IAuthTabCallback;
        if (decryptforrecoverykey != null) {
            decryptforrecoverykey.IAuthTabCallback();
        }
        int i4 = ICustomTabsCallback + 29;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void asInterface() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 61;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        decryptForRecoveryKey decryptforrecoverykey = this.IAuthTabCallback;
        if (decryptforrecoverykey != null) {
            decryptforrecoverykey.asBinder();
            int i4 = ICustomTabsCallback + 59;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 11;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        decryptForRecoveryKey decryptforrecoverykey = this.IAuthTabCallback;
        if (decryptforrecoverykey != null) {
            int i5 = i3 + 117;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            decryptforrecoverykey.onNavigationEvent();
            if (i6 == 0) {
                throw null;
            }
        }
    }

    public void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 117;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        decryptForRecoveryKey decryptforrecoverykey = this.IAuthTabCallback;
        if (decryptforrecoverykey != null) {
            decryptforrecoverykey.onExtraCallback();
            int i4 = writeTypedObject + 51;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void onNavigationEvent() {
        int i = 2 % 2;
        decryptForRecoveryKey decryptforrecoverykey = this.IAuthTabCallback;
        if (decryptforrecoverykey != null) {
            int i2 = writeTypedObject + 109;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            decryptforrecoverykey.onExtraCallbackWithResult();
        }
        int i4 = ICustomTabsCallback + 109;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
    }

    public void onExtraCallback(boolean z) {
        decryptForRecoveryKey decryptforrecoverykey;
        int i = 2 % 2;
        int i2 = writeTypedObject + 27;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            decryptforrecoverykey = this.IAuthTabCallback;
            int i3 = 35 / 0;
            if (decryptforrecoverykey == null) {
                return;
            }
        } else {
            decryptforrecoverykey = this.IAuthTabCallback;
            if (decryptforrecoverykey == null) {
                return;
            }
        }
        decryptforrecoverykey.onExtraCallback(z);
        int i4 = ICustomTabsCallback + 117;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onExtraCallback(double d, double d2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 105;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        decryptForRecoveryKey decryptforrecoverykey = this.IAuthTabCallback;
        if (decryptforrecoverykey != null) {
            int i4 = i3 + 87;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            decryptforrecoverykey.onExtraCallbackWithResult(d, d2);
            if (i5 == 0) {
                throw null;
            }
        }
    }

    public void onExtraCallbackWithResult(@NotNull String str, long j) {
        decryptForRecoveryKey decryptforrecoverykey;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 95;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            decryptforrecoverykey = this.IAuthTabCallback;
            int i3 = 92 / 0;
            if (decryptforrecoverykey == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            decryptforrecoverykey = this.IAuthTabCallback;
            if (decryptforrecoverykey == null) {
                return;
            }
        }
        decryptforrecoverykey.onNavigationEvent(str, j);
        int i4 = writeTypedObject + 75;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        GraniteVideoView graniteVideoView = (GraniteVideoView) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 115;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            getSignForPKCS7NoContents getsignforpkcs7nocontents = graniteVideoView.onWarmupCompleted;
            throw null;
        }
        getSignForPKCS7NoContents getsignforpkcs7nocontents2 = graniteVideoView.onWarmupCompleted;
        if (getsignforpkcs7nocontents2 != null) {
            getsignforpkcs7nocontents2.IAuthTabCallbackStub();
        }
        graniteVideoView.onWarmupCompleted = null;
        int i3 = writeTypedObject + 31;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 81;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        onNavigationEvent(new Object[]{this}, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent2, -1985831968, 1985831969);
        int i4 = ICustomTabsCallback + 123;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 1;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDetachedFromWindow();
            IAuthTabCallback_Parcel();
            int i3 = 30 / 0;
        } else {
            super.onDetachedFromWindow();
            IAuthTabCallback_Parcel();
        }
        int i4 = writeTypedObject + 95;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private final getDecryptData onNavigationEvent(Map<String, ? extends Object> map) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (getDecryptData) onNavigationEvent(new Object[]{this, map}, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent2, -1420428096, 1420428096);
    }

    private final Map<String, String> onExtraCallbackWithResult(Object obj) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (Map) onNavigationEvent(new Object[]{this, obj}, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent2, 834395958, -834395956);
    }

    private final void getInterfaceDescriptor() {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        onNavigationEvent(new Object[]{this}, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent2, -1985831968, 1985831969);
    }
}
