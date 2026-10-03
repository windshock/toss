package o;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RFC3739QCObjectIdentifiers;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.card.IsCardAppInstalledHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RFC3739QCObjectIdentifiers implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    public static final int IAuthTabCallback;
    private static char IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100;
    private static char asBinder;
    private static char asInterface;
    private static char onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static int onTransact;
    private final Lazy onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.web.message.handlers.card.IsCardAppInstalledHandler$$ExternalSyntheticLambda0
        public final Object invoke() {
            return RFC3739QCObjectIdentifiers.IAuthTabCallback();
        }
    });

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new int[]{0, 15, 0, 8}, true, new byte[]{1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1}, objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        Companion = new onWarmupCompleted(null);
        IAuthTabCallback = 8;
        int i = access100 + 53;
        IAuthTabCallback_Parcel = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ UserChoiceDetails IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        UserChoiceDetails userChoiceDetailsAsBinder = asBinder();
        int i4 = IAuthTabCallbackStub + 37;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return userChoiceDetailsAsBinder;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(str, str2);
        int i4 = onTransact + 39;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 73;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = IAuthTabCallbackStub + 99;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStub + 95;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onNavigationEvent();
        }
        super/*o.drawTextBox*/.onNavigationEvent();
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 57;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = onTransact + 117;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    private final UserChoiceDetails onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        UserChoiceDetails userChoiceDetails = (UserChoiceDetails) this.onWarmupCompleted.getValue();
        int i4 = IAuthTabCallbackStub + 85;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return userChoiceDetails;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final UserChoiceDetails asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Response response = Response.onNavigationEvent;
            return ((getStatementId) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), getStatementId.class)).getOpacity();
        }
        Response response2 = Response.onNavigationEvent;
        ((getStatementId) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), getStatementId.class)).getOpacity();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ALCFaceValidation aLCFaceValidation = ALCFaceValidation.DISABLED;
        int i4 = IAuthTabCallbackStub + 35;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidation;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new IsCardAppInstalledHandler$.ExternalSyntheticLambda1());
        int i2 = IAuthTabCallbackStub + 43;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final boolean onWarmupCompleted(String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return filterCreatePageParams.onTransact(Uri.parse(str));
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        filterCreatePageParams.onTransact(Uri.parse(str));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0098 A[PHI: r13
      0x0098: PHI (r13v37 com.google.gson.JsonElement) = (r13v36 com.google.gson.JsonElement), (r13v41 com.google.gson.JsonElement) binds: [B:16:0x0096, B:13:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull com.google.gson.JsonObject r14, @org.jetbrains.annotations.NotNull o.setOnOutOfMemeryErrorCallback r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RFC3739QCObjectIdentifiers.onExtraCallbackWithResult(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, java.lang.String, com.google.gson.JsonObject, o.setOnOutOfMemeryErrorCallback):void");
    }

    private final boolean onExtraCallbackWithResult(String str) throws PackageManager.NameNotFoundException {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        IAuthTabCallbackStub = i2 % 128;
        boolean z = true;
        try {
            if (i2 % 2 == 0) {
                UserChoiceBillingListener.onExtraCallback.onExtraCallback().getPackageManager().getPackageInfo(str, 1);
                z = false;
            } else {
                UserChoiceBillingListener.onExtraCallback.onExtraCallback().getPackageManager().getPackageInfo(str, 0);
            }
            return z;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $10 + 119;
            $11 = i6 % 128;
            int i7 = 58224;
            if (i6 % i3 == 0) {
                cArr3[i5] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                int i8 = defaultGainProviderExternalSyntheticLambda1.onNavigationEvent;
                cArr3[i5] = cArr[i5];
            } else {
                cArr3[i5] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i9 = i5;
            while (i9 < 16) {
                int i10 = $11 + 15;
                $10 = i10 % 128;
                int i11 = i10 % i3;
                char c = cArr3[1];
                char c2 = cArr3[i5];
                char[] cArr4 = cArr3;
                int i12 = (c2 + i7) ^ ((c2 << 4) + ((char) (asInterface ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackDefault);
                    objArr2[i3] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[0] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int i14 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9;
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i3] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(tapTimeout, i14, iKeyCodeFromString, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda12 = defaultGainProviderExternalSyntheticLambda1;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asBinder)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 10 - ((Process.getThreadPriority(0) + 20) >> 6), 12434 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i9++;
                    cArr3 = cArr4;
                    defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda12;
                    i3 = 2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda13 = defaultGainProviderExternalSyntheticLambda1;
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda13, defaultGainProviderExternalSyntheticLambda13};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                i2 = 2;
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16013 - TextUtils.indexOf((CharSequence) "", '0', 0)), 14 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.combineMeasuredStates(0, 0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda13;
            i3 = i2;
            cArr3 = cArr5;
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = onExtraCallbackWithResult;
        float f = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 105;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 35283), 34 - TextUtils.lastIndexOf("", '0', 0), Color.rgb(0, 0, 0) + 16791455, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 35 - Color.red(0), 14239 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6++;
                }
                f = 0.0f;
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i3];
        System.arraycopy(cArr2, i2, cArr4, 0, i3);
        if (bArr != null) {
            int i8 = $11 + 41;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 1;
            } else {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 10935), 65 - TextUtils.getCapsMode("", 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i9] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getLongPressTimeout() >> 16) + 29, 17658 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i10] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    int i11 = $11 + 59;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 49467), 70 - View.getDefaultSize(0, 0), 12487 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr4, 0, cArr5, 0, i3);
            int i13 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr4, i13, i5);
            System.arraycopy(cArr5, i5, cArr4, 0, i13);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i14 = $10 + 13;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new char[]{27233, 27167, 27144, 27140, 27144, 27141, 27164, 27141, 27136, 27165, 27138, 27139, 27165, 27141, 27141, 27151, 27332, 27356, 27199, 27280, 27287, 27287, 27285, 27310, 27281, 27386, 27360, 27265, 27288, 27286, 27361, 27360, 27288, 27288, 27295, 27378, 27348};
        onExtraCallback = (char) 59478;
        asBinder = (char) 43925;
        asInterface = (char) 32875;
        IAuthTabCallbackDefault = (char) 32323;
    }
}
