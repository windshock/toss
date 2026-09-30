package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class vibrateChangeThread {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int asInterface = 0;
    private static char[] onExtraCallback = null;
    public static final vibrateChangeThread onExtraCallbackWithResult;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;

    static {
        onNavigationEvent();
        onExtraCallbackWithResult = new vibrateChangeThread();
        int i = onNavigationEvent + 39;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private vibrateChangeThread() {
    }

    public final String onExtraCallbackWithResult(@NotNull String str, @Nullable String str2) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        if (str2 == null) {
            int i2 = asInterface + 61;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }
        Uri uri = Uri.parse(str);
        Object[] objArr = new Object[1];
        a(new char[]{'\b', 7, 13814}, (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), 3 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        String str3 = (String) filterCreatePageParams.onWarmupCompleted(new Object[]{uri, ((String) objArr[0]).intern(), ""}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789);
        if (str3.length() <= 0) {
            int i3 = asInterface + 117;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 / 2;
            }
            str3 = null;
        }
        if (str3 != null) {
            int i5 = onTransact + 13;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            if (str3.length() != 0) {
                Uri uri2 = Uri.parse(str3);
                Intrinsics.checkNotNullExpressionValue(uri2, "");
                Object[] objArr2 = new Object[1];
                a(new char[]{'\b', 3, 5, '\b', 13871, 13871, 3, '\b'}, (byte) (70 - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.getCapsMode("", 0, 0) + 8, objArr2);
                String strOnNavigationEvent = filterCreatePageParams.onNavigationEvent(uri2, new Pair[]{getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str2)});
                Intrinsics.checkNotNull(uri);
                Object[] objArr3 = new Object[1];
                a(new char[]{'\b', 7, 13814}, (byte) ((-1) - MotionEvent.axisFromString("")), 2 - ImageFormat.getBitsPerPixel(0), objArr3);
                return filterCreatePageParams.onNavigationEvent(uri, new Pair[]{getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), strOnNavigationEvent)});
            }
        }
        Object[] objArr4 = new Object[1];
        a(new char[]{'\b', 3, 5, '\b', 13871, 13871, 3, '\b'}, (byte) (70 - TextUtils.indexOf((CharSequence) "", '0')), 7 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr4);
        String queryParameter = uri.getQueryParameter(((String) objArr4[0]).intern());
        if (queryParameter != null && queryParameter.length() != 0) {
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        Intrinsics.checkNotNull(uri);
        Object[] objArr5 = new Object[1];
        a(new char[]{'\b', 3, 5, '\b', 13871, 13871, 3, '\b'}, (byte) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 71), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7, objArr5);
        String strOnNavigationEvent2 = filterCreatePageParams.onNavigationEvent(uri, new Pair[]{getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), str2)});
        int i7 = asInterface + 63;
        onTransact = i7 % 128;
        if (i7 % 2 != 0) {
            return strOnNavigationEvent2;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallback;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), ExpandableListView.getPackedPositionType(0L) + 26, 23138 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25, 23139 - Color.argb(0, 0, 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i5 = $10 + 105;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - View.MeasureSpec.getMode(0)), ExpandableListView.getPackedPositionType(j) + 74, View.MeasureSpec.getSize(0) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 30 - ((Process.getThreadPriority(0) + 20) >> 6), 19488 - View.resolveSize(0, 0), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i7 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i7];
                    } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                        int i8 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i8];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                    } else {
                        int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                j = 0;
            }
        }
        for (int i12 = 0; i12 < i; i12++) {
            int i13 = $11 + 119;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr4[i12] = (char) (cArr4[i12] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void onNavigationEvent() {
        onExtraCallback = new char[]{51243, 51245, 64981, 51242, 51240, 64982, 64961, 64966, 64991};
        onWarmupCompleted = (char) 51242;
    }
}
