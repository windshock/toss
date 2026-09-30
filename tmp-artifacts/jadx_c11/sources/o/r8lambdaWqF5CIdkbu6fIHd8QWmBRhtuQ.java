package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.JsonObject;
import im.toss.global.localization.domain.di.RegionDomainModuleKt;
import im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleRepository;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.r8lambdaWqF5CIdkbu6fIHd8QWmBRhtuQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaWqF5CIdkbu6fIHd8QWmBRhtuQ implements ALCFaceQuality, hExternalSyntheticLambda0 {
    private final Lazy onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.handler.bundle.InvalidateReactBundleHandler$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ReactBundleRepository reactBundleRepositoryIAuthTabCallback = r8lambdaWqF5CIdkbu6fIHd8QWmBRhtuQ.IAuthTabCallback();
            int i4 = onExtraCallback + 101;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return reactBundleRepositoryIAuthTabCallback;
        }
    });
    private static final byte[] $$a = {81, 99, 107, 124};
    private static final int $$b = 125;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted = 478308936;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i) {
        int i2;
        int i3;
        int i4 = (s2 * 2) + 4;
        byte[] bArr = $$a;
        int i5 = 1 - (i * 4);
        int i6 = 105 - (s * 3);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            i4++;
            i6 = (-i6) + i7;
            i2 = i8;
            int i9 = i4;
            int i10 = i6;
            bArr2[i2] = (byte) i10;
            i3 = i2 + 1;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i4 = i9;
            i6 = bArr[i9];
            i8 = i3;
            i7 = i10;
            i4++;
            i6 = (-i6) + i7;
            i2 = i8;
            int i92 = i4;
            int i102 = i6;
            bArr2[i2] = (byte) i102;
            i3 = i2 + 1;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            int i922 = i4;
            int i1022 = i6;
            bArr2[i2] = (byte) i1022;
            i3 = i2 + 1;
            if (i3 == i5) {
            }
        }
    }

    public static /* synthetic */ ReactBundleRepository IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            asInterface();
            obj.hashCode();
            throw null;
        }
        ReactBundleRepository reactBundleRepositoryAsInterface = asInterface();
        int i3 = onExtraCallback + 25;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return reactBundleRepositoryAsInterface;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        onOutOfMemory onoutofmemoryOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
            int i3 = 72 / 0;
        } else {
            onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        }
        int i4 = onExtraCallback + 31;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 47;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = onNavigationEvent + 55;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
            int i3 = 30 / 0;
        } else {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        int i4 = onNavigationEvent + 99;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = onNavigationEvent + 73;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = onExtraCallback + 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 == 0) {
            throw null;
        }
        int i6 = onNavigationEvent + 21;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 18 / 0;
        }
    }

    private final ReactBundleRepository onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ReactBundleRepository reactBundleRepository = (ReactBundleRepository) this.onExtraCallbackWithResult.getValue();
        int i4 = onExtraCallback + 101;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return reactBundleRepository;
    }

    private static final ReactBundleRepository asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        ReactBundleRepository reactBundleRepositoryComponentActivityExternalSyntheticLambda1 = ((ReactBundleRepository.EntryPoint) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), ReactBundleRepository.EntryPoint.class)).ComponentActivityExternalSyntheticLambda1();
        int i4 = onNavigationEvent + 23;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return reactBundleRepositoryComponentActivityExternalSyntheticLambda1;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(Color.argb(0, 0, 0, 0) + 10, TextUtils.indexOf("", "", 0) + 7, new char[]{65535, 7, 0, 65513, 65532, '\b', 0, 65533, 16, '\t'}, false, 198 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        a(6 - ImageFormat.getBitsPerPixel(0), 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{'\r', 65527, 3, 1, 4, 65525, 2}, false, 205 - Color.red(0), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(5 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 3 - (Process.myTid() >> 22), new char[]{5, '\b', 65531, 65529}, false, TextUtils.indexOf("", "") + 203, objArr3);
        String strOnNavigationEvent2 = settext.onNavigationEvent(strIntern, ((String) objArr3[0]).intern());
        onWarmupCompleted().onExtraCallback(strOnNavigationEvent, RegionDomainModuleKt.onExtraCallbackWithResult().onExtraCallbackWithResult().getCode(), strOnNavigationEvent2);
        setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
        int i2 = onNavigationEvent + 75;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 61 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 35125), 23 - View.resolveSizeAndState(0, 0, 0), 10277 - ImageFormat.getBitsPerPixel(0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 55 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 2168, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i7 = $10 + 119;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i9 = $10 + 33;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i11 = $11 + 83;
            $10 = i11 % 128;
            int i12 = i11 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i13 = $10 + 13;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 12843), 55 - (ViewConfiguration.getJumpTapTimeout() >> 16), 2168 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
