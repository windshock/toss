package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import com.tmoney.LiveCheckConstants;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCTimerLabelCallBack implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static final String IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static char onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new char[]{46787, 49629, 64410, 35184, 41549, 41856, 11643, 8821, 9454, 2890, 25069, 2277, 57673, 63880, 27849, 17905, 27864, 28704, 19048, 511, 48846, 60511, 23155, 41352, 19131, 8518, 22533, 56115}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 27, objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        Companion = new onNavigationEvent(null);
        int i = onTransact + 7;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    @Override // o.drawTextBox
    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 121;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 73;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    @Override // o.drawTextBox
    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super.onExtraCallback();
        int i4 = IAuthTabCallbackDefault + 115;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return onoutofmemoryOnExtraCallback;
    }

    @Override // o.ALCFaceQuality
    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 115;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 45;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return super.onExtraCallbackWithResult();
        }
        super.onExtraCallbackWithResult();
        throw null;
    }

    @Override // o.drawTextBox
    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            super.onWarmupCompleted(str);
            throw null;
        }
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super.onWarmupCompleted(str);
        int i3 = IAuthTabCallbackStub + 117;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    @Override // o.ALCFaceQuality
    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        Intent intentIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(new char[]{16328, 38310, 37490, 61455, 45243, 62312}, 6 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        boolean zBooleanValue = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr[0]).intern(), false})).booleanValue();
        Object[] objArr2 = new Object[1];
        a(new char[]{46787, 49629, 64410, 35184, 41549, 41856, 11643, 8821, 9454, 2890, 25069, 2277, 57673, 63880, 27849, 17905, 27864, 28704, 19048, 511, 48846, 60511, 23155, 41352, 19131, 8518, 22533, 56115}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 27, objArr2);
        Uri uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{((String) objArr2[0]).intern()});
        if (uri != null) {
            int i2 = IAuthTabCallbackDefault + 91;
            IAuthTabCallbackStub = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                intentIAuthTabCallback = filterCreatePageParams.IAuthTabCallback(uri, null, null, 5, null);
                if (intentIAuthTabCallback == null) {
                    return;
                }
            } else {
                intentIAuthTabCallback = filterCreatePageParams.IAuthTabCallback(uri, null, null, 3, null);
                if (intentIAuthTabCallback == null) {
                    return;
                }
            }
            Intent intent = intentIAuthTabCallback;
            int i3 = IAuthTabCallbackStub + 19;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (!zBooleanValue) {
                Object[] objArr3 = new Object[1];
                a(new char[]{56499, 61073, 201, 40652, 45054, 35904, 4045, 24262, 45243, 62312, 62703, 45584, 8320, 14364, 5074, 6513, 19725, 49063, 4045, 24262, 46787, 49629, 16593, 14211, 2031, 23740}, 25 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr3);
                r8lambdakrhaimf1bm5cgjbilhp45vln_xq.putInstanceStateData(-2, RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), Boolean.TRUE)}));
                PageAnimStore.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, intent, 50011, (Bundle) null, 4, (Object) null);
                return;
            }
            PageAnimStore.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, intent, 50010, (Bundle) null, 4, (Object) null);
            int i4 = IAuthTabCallbackStub + 83;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
    @Override // o.ALCFaceQuality
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) throws Throwable {
        Intent intentIAuthTabCallback;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 85;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
            super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
            switch (i) {
            }
        }
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i5 = 22 / 0;
        switch (i) {
            case 50010:
                setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, null, 1, null);
                int i6 = IAuthTabCallbackDefault + 65;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                break;
            case 50011:
                Object[] objArr = new Object[1];
                a(new char[]{56499, 61073, 201, 40652, 45054, 35904, 4045, 24262, 45243, 62312, 62703, 45584, 8320, 14364, 5074, 6513, 19725, 49063, 4045, 24262, 46787, 49629, 16593, 14211, 2031, 23740}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 25, objArr);
                r8lambdakrhaimf1bm5cgjbilhp45vln_xq.putInstanceStateData(-2, RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), Boolean.FALSE)}));
                Object[] objArr2 = new Object[1];
                a(new char[]{46787, 49629, 64410, 35184, 41549, 41856, 11643, 8821, 9454, 2890, 25069, 2277, 57673, 63880, 27849, 17905, 27864, 28704, 19048, 511, 48846, 60511, 23155, 41352, 19131, 8518, 22533, 56115}, 27 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
                Uri uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{((String) objArr2[0]).intern()});
                if (uri != null) {
                    int i8 = IAuthTabCallbackStub + 95;
                    IAuthTabCallbackDefault = i8 % 128;
                    if (i8 % 2 != 0) {
                        intentIAuthTabCallback = filterCreatePageParams.IAuthTabCallback(uri, null, null, 4, null);
                        if (intentIAuthTabCallback == null) {
                        }
                    } else {
                        intentIAuthTabCallback = filterCreatePageParams.IAuthTabCallback(uri, null, null, 3, null);
                        if (intentIAuthTabCallback == null) {
                        }
                    }
                    PageAnimStore.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, intentIAuthTabCallback, 50010, (Bundle) null, 4, (Object) null);
                    break;
                }
                break;
            default:
                int i9 = IAuthTabCallbackDefault + 23;
                IAuthTabCallbackStub = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 68 / 0;
                    break;
                }
                break;
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 99;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = $10 + 25;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 4;
            }
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                int i10 = $11 + 101;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char deadChar = (char) KeyEvent.getDeadChar(i3, i3);
                        int scrollBarSize = 10 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int bitsPerPixel = 12433 - ImageFormat.getBitsPerPixel(i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(deadChar, scrollBarSize, bitsPerPixel, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9, 12435 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16013 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 16777230 + Color.rgb(0, 0, 0), Color.alpha(0) + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i14 = $10 + 13;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = (char) 34813;
        onWarmupCompleted = (char) 34002;
        onExtraCallback = (char) 24693;
        onNavigationEvent = (char) 19502;
    }
}
