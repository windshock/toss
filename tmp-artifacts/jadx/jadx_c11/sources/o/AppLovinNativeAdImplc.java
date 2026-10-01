package o;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ResourceIdCache;
import im.toss.tds.compose.component.atom.image.TdsImageKt$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppLovinNativeAdImplc;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.KeylinesKtExternalSyntheticLambda1;
import o.QuirksExternalSyntheticBackport0;
import o.seek;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinNativeAdImplc {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    private static final Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 13;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 107;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return IAuthTabCallback(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        IAuthTabCallback(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Context context, Object obj, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Painter painter, Function1 function1, Function1 function12, Function1 function13, QuirkSettingsLoader quirkSettingsLoader, immediateFailedFuture immediatefailedfuture, seek seekVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(context, obj, str, quirksExternalSyntheticBackport0, painter, function1, function12, function13, quirkSettingsLoader, immediatefailedfuture, seekVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 63;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Painter painter, Context context, Object obj, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, Function1 function12, Function1 function13, QuirkSettingsLoader quirkSettingsLoader, immediateFailedFuture immediatefailedfuture, seek seekVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 49;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(painter, context, obj, str, quirksExternalSyntheticBackport0, function1, function12, function13, quirkSettingsLoader, immediatefailedfuture, seekVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 89 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i5);
        int i9 = ~i5;
        int i10 = i8 | (~(i9 | i2 | i4));
        int i11 = ~(i7 | i9);
        int i12 = (~i4) | i9;
        int i13 = i11 | (~i12);
        int i14 = ~(i12 | i2);
        int i15 = i2 + i5 + i + ((-1261570137) * i3) + (2040842291 * i6);
        int i16 = i15 * i15;
        int i17 = ((i2 * (-750812765)) - 1471086592) + ((-750812765) * i5) + (1493335646 * i10) + ((-1308296004) * i13) + ((-1493335646) * i14) + (742522880 * i) + ((-1928462336) * i3) + (1629880320 * i6) + (2096168960 * i16);
        int i18 = ((i2 * 1408203179) - 1033136887) + (i5 * 1408203179) + (i10 * (-338)) + (i13 * (-676)) + (i14 * 338) + (i * 1408202841) + (i3 * (-1046847217)) + (i6 * (-121732677)) + (i16 * 1741225984);
        int i19 = i17 + (i18 * i18 * 838795264);
        return i19 != 1 ? i19 != 2 ? onWarmupCompleted(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    public static final void onExtraCallbackWithResult(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit> function1, @Nullable Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit> function12, @Nullable Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit> function13, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable String str2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        long jOnTransact;
        immediateFailedFuture immediatefailedfuture2;
        immediateFailedFuture immediatefailedfutureIAuthTabCallback;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i2 & 4) != 0) {
            int i4 = onWarmupCompleted + 95;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit> function14 = (i2 & 8) != 0 ? null : function1;
        Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit> function15 = (i2 & 16) != 0 ? null : function12;
        Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit> function16 = (i2 & 32) != 0 ? null : function13;
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = (i2 & 64) != 0 ? QuirkSettingsLoader.Companion.onExtraCallback() : quirkSettingsLoader;
        if ((i2 & 128) != 0) {
            int i6 = onWarmupCompleted + 23;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                immediatefailedfutureIAuthTabCallback = immediateFailedFuture.Companion.IAuthTabCallback();
                int i7 = 21 / 0;
            } else {
                immediatefailedfutureIAuthTabCallback = immediateFailedFuture.Companion.IAuthTabCallback();
            }
            immediatefailedfuture2 = immediatefailedfutureIAuthTabCallback;
        } else {
            immediatefailedfuture2 = immediatefailedfuture;
        }
        String str3 = (i2 & 256) != 0 ? null : str2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onNavigationEvent + 111;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2018571594, i, -1, "im.toss.tds.compose.component.atom.image.TdsImage (TdsImage.kt:58)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2018571594, i, -1, "im.toss.tds.compose.component.atom.image.TdsImage (TdsImage.kt:58)");
        }
        int i9 = i << 3;
        onExtraCallback(str, jOnTransact, quirksExternalSyntheticBackport02, str3, function14, function15, function16, quirkSettingsLoaderOnExtraCallback, immediatefailedfuture2, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult, ((i >> 3) & 112) | (i & 14) | (i9 & 896) | ((i >> 15) & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (i9 & 234881024), 512);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public static final void onExtraCallback(int i, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit> function1, @Nullable Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit> function12, @Nullable Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit> function13, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        long jOnTransact;
        immediateFailedFuture immediatefailedfutureIAuthTabCallback;
        String str2;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 3;
        onWarmupCompleted = i5 % 128;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i5 % 2 != 0 ? (i3 & 2) == 0 : (i3 & 2) == 0) ? quirksExternalSyntheticBackport0 : QuirksExternalSyntheticBackport0.Companion;
        if ((i3 & 4) != 0) {
            int i6 = onWarmupCompleted + 77;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit> function14 = (i3 & 8) != 0 ? null : function1;
        Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit> function15 = (i3 & 16) != 0 ? null : function12;
        Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit> function16 = (i3 & 32) != 0 ? null : function13;
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = (i3 & 64) != 0 ? QuirkSettingsLoader.Companion.onExtraCallback() : quirkSettingsLoader;
        if ((i3 & 128) != 0) {
            int i8 = onNavigationEvent + 73;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            immediatefailedfutureIAuthTabCallback = immediateFailedFuture.Companion.IAuthTabCallback();
        } else {
            immediatefailedfutureIAuthTabCallback = immediatefailedfuture;
        }
        if ((i3 & 256) != 0) {
            int i10 = onNavigationEvent + 63;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            str2 = null;
        } else {
            str2 = str;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1564711728, i2, -1, "im.toss.tds.compose.component.atom.image.TdsImage (TdsImage.kt:84)");
        }
        int i12 = i2 << 3;
        onExtraCallback(Integer.valueOf(i), jOnTransact, quirksExternalSyntheticBackport02, str2, function14, function15, function16, quirkSettingsLoaderOnExtraCallback, immediatefailedfutureIAuthTabCallback, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 >> 3) & 112) | (i2 & 14) | (i12 & 896) | ((i2 >> 15) & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (i12 & 234881024), 512);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public static final void onExtraCallbackWithResult(@NotNull Drawable drawable, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit> function1, @Nullable Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit> function12, @Nullable Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit> function13, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        long jOnTransact;
        Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit> function14;
        Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit> function15;
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback;
        immediateFailedFuture immediatefailedfutureIAuthTabCallback;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(drawable, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i2 & 4) != 0) {
            int i4 = onWarmupCompleted + 97;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit> function16 = (i2 & 8) != 0 ? null : function1;
        if ((i2 & 16) != 0) {
            int i6 = onWarmupCompleted + 9;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 38 / 0;
            }
            function14 = null;
        } else {
            function14 = function12;
        }
        if ((i2 & 32) != 0) {
            int i8 = onNavigationEvent + 101;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            function15 = null;
        } else {
            function15 = function13;
        }
        if ((i2 & 64) != 0) {
            int i10 = onNavigationEvent + 97;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
        } else {
            quirkSettingsLoaderOnExtraCallback = quirkSettingsLoader;
        }
        if ((i2 & 128) != 0) {
            int i12 = onNavigationEvent + 79;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            immediatefailedfutureIAuthTabCallback = immediateFailedFuture.Companion.IAuthTabCallback();
        } else {
            immediatefailedfutureIAuthTabCallback = immediatefailedfuture;
        }
        String str2 = (i2 & 256) == 0 ? str : null;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2101073923, i, -1, "im.toss.tds.compose.component.atom.image.TdsImage (TdsImage.kt:110)");
        }
        int i14 = i << 3;
        onExtraCallback(drawable, jOnTransact, quirksExternalSyntheticBackport02, str2, function16, function14, function15, quirkSettingsLoaderOnExtraCallback, immediatefailedfutureIAuthTabCallback, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult, ((i >> 3) & 112) | (i & 14) | (i14 & 896) | ((i >> 15) & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (29360128 & i14) | (i14 & 234881024), 512);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return;
        }
        CameraConfigExternalSyntheticLambda0.onTransact();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@NotNull Bitmap bitmap, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit> function1, @Nullable Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit> function12, @Nullable Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit> function13, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit> function14;
        immediateFailedFuture immediatefailedfutureIAuthTabCallback;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 97;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bitmap, "");
            quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        } else {
            Intrinsics.checkNotNullParameter(bitmap, "");
            if ((i2 & 2) != 0) {
            }
        }
        long jOnTransact = (i2 & 4) != 0 ? setByteOrder.Companion.onTransact() : j;
        String str2 = null;
        if ((i2 & 8) != 0) {
            int i5 = onWarmupCompleted + 7;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            function14 = null;
        } else {
            function14 = function1;
        }
        Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit> function15 = (i2 & 16) != 0 ? null : function12;
        Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit> function16 = (i2 & 32) != 0 ? null : function13;
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = (i2 & 64) != 0 ? QuirkSettingsLoader.Companion.onExtraCallback() : quirkSettingsLoader;
        if ((i2 & 128) != 0) {
            int i6 = onWarmupCompleted + 101;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            immediatefailedfutureIAuthTabCallback = immediateFailedFuture.Companion.IAuthTabCallback();
        } else {
            immediatefailedfutureIAuthTabCallback = immediatefailedfuture;
        }
        if ((i2 & 256) != 0) {
            int i8 = onWarmupCompleted + 123;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
        } else {
            str2 = str;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = onNavigationEvent + 29;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1756401836, i, -1, "im.toss.tds.compose.component.atom.image.TdsImage (TdsImage.kt:136)");
        }
        int i12 = i << 3;
        onExtraCallback(bitmap, jOnTransact, quirksExternalSyntheticBackport02, str2, function14, function15, function16, quirkSettingsLoaderOnExtraCallback, immediatefailedfutureIAuthTabCallback, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult, ((i >> 3) & 112) | (i & 14) | (i12 & 896) | ((i >> 15) & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (i12 & 234881024), 512);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return;
        }
        CameraConfigExternalSyntheticLambda0.onTransact();
    }

    public static final void IAuthTabCallback(@NotNull deprecated_followRedirects deprecated_followredirects, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit> function1, @Nullable Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit> function12, @Nullable Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit> function13, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        long jOnTransact;
        Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit> function14;
        Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit> function15;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i2 & 4) != 0) {
            int i4 = onWarmupCompleted + 29;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        String str2 = null;
        if ((i2 & 8) != 0) {
            int i6 = onNavigationEvent + 55;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            function14 = null;
        } else {
            function14 = function1;
        }
        if ((i2 & 16) != 0) {
            int i8 = onWarmupCompleted + 121;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                str2.hashCode();
                throw null;
            }
            function15 = null;
        } else {
            function15 = function12;
        }
        Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit> function16 = (i2 & 32) != 0 ? null : function13;
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = (i2 & 64) != 0 ? QuirkSettingsLoader.Companion.onExtraCallback() : quirkSettingsLoader;
        immediateFailedFuture immediatefailedfutureIAuthTabCallback = (i2 & 128) != 0 ? immediateFailedFuture.Companion.IAuthTabCallback() : immediatefailedfuture;
        if ((i2 & 256) != 0) {
            int i9 = onNavigationEvent + 105;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
        } else {
            str2 = str;
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i10 = onNavigationEvent + 11;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1724497237, i, -1, "im.toss.tds.compose.component.atom.image.TdsImage (TdsImage.kt:162)");
        }
        int i12 = i << 3;
        onExtraCallback(deprecated_followredirects, jOnTransact, quirksExternalSyntheticBackport02, str2, function14, function15, function16, quirkSettingsLoaderOnExtraCallback, immediatefailedfutureIAuthTabCallback, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult, ((i >> 3) & 112) | (i & 14) | (i12 & 896) | ((i >> 15) & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (i12 & 234881024), 512);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public static final void onExtraCallback(@Nullable Object obj, long j, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable String str, @Nullable Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit> function1, @Nullable Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit> function12, @Nullable Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit> function13, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable Painter painter, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        String str2;
        Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit> function14;
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback;
        seek seekVarOnNavigationEvent;
        int i3 = 2 % 2;
        Object obj2 = null;
        if ((i2 & 4) != 0) {
            int i4 = onWarmupCompleted + 23;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                throw null;
            }
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if ((i2 & 8) != 0) {
            int i5 = onNavigationEvent + 85;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i2 & 16) != 0) {
            int i6 = onNavigationEvent + 115;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            function14 = null;
        } else {
            function14 = function1;
        }
        Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit> function15 = (i2 & 32) != 0 ? null : function12;
        Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit> function16 = (i2 & 64) != 0 ? null : function13;
        if ((i2 & 128) != 0) {
            int i8 = onNavigationEvent + 81;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
        } else {
            quirkSettingsLoaderOnExtraCallback = quirkSettingsLoader;
        }
        immediateFailedFuture immediatefailedfutureIAuthTabCallback = (i2 & 256) != 0 ? immediateFailedFuture.Companion.IAuthTabCallback() : immediatefailedfuture;
        Painter painter2 = (i2 & 512) != 0 ? null : painter;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = onWarmupCompleted + 39;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2020175432, i, -1, "im.toss.tds.compose.component.atom.image.TdsImage (TdsImage.kt:189)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2020175432, i, -1, "im.toss.tds.compose.component.atom.image.TdsImage (TdsImage.kt:189)");
        }
        setByteOrder setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(j);
        if (setbyteorderOnNavigationEvent.access100() == 16) {
            int i11 = onNavigationEvent + 69;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            setbyteorderOnNavigationEvent = null;
        }
        if (setbyteorderOnNavigationEvent != null) {
            int i13 = onWarmupCompleted + 63;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            seekVarOnNavigationEvent = seek.onExtraCallbackWithResult.onNavigationEvent(seek.Companion, setbyteorderOnNavigationEvent.access100(), 0, 2, (Object) null);
        } else {
            seekVarOnNavigationEvent = null;
        }
        int i15 = i >> 3;
        onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{obj, quirksExternalSyntheticBackport02, str2, seekVarOnNavigationEvent, function14, function15, function16, quirkSettingsLoaderOnExtraCallback, immediatefailedfutureIAuthTabCallback, painter2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i & 1879048192) | (i15 & 896) | (i & 14) | (i15 & 112) | (57344 & i) | (458752 & i) | (3670016 & i) | (29360128 & i) | (234881024 & i) | (Painter.$stable << 27)), 0}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i16 = onNavigationEvent + 13;
            onWarmupCompleted = i16 % 128;
            if (i16 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            } else {
                CameraConfigExternalSyntheticLambda0.onTransact();
                obj2.hashCode();
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Context context = (Context) objArr[0];
        Object obj = objArr[1];
        String str = (String) objArr[2];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[3];
        Painter painter = (Painter) objArr[4];
        Function1 function1 = (Function1) objArr[5];
        Function1 function12 = (Function1) objArr[6];
        Function1 function13 = (Function1) objArr[7];
        QuirkSettingsLoader quirkSettingsLoader = (QuirkSettingsLoader) objArr[8];
        immediateFailedFuture immediatefailedfuture = (immediateFailedFuture) objArr[9];
        seek seekVar = (seek) objArr[10];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        int iIntValue = ((Number) objArr[12]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-131374257, iIntValue, -1, "im.toss.tds.compose.component.atom.image.TdsImage.Content (TdsImage.kt:238)");
            }
        } else if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
        }
        CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context);
        AppLovinFullscreenImmersiveActivity appLovinFullscreenImmersiveActivityIAuthTabCallback = showAndRender.IAuthTabCallback();
        CarouselStateExternalSyntheticLambda2.onNavigationEvent(obj, str, carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult, setAdVideoPlaybackListener.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, "AsyncImage", obj, appLovinFullscreenImmersiveActivityIAuthTabCallback), painter, (Painter) null, (Painter) null, function1, showAndRender.onExtraCallback(appLovinFullscreenImmersiveActivityIAuthTabCallback, function12), function13, quirkSettingsLoader, immediatefailedfuture, 0.0f, seekVar, 0, false, cameraCaptureResultEmptyCameraCaptureResult, Painter.$stable << 12, 0, 53344);
        Object obj2 = null;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onWarmupCompleted + 91;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                obj2.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Resources.NotFoundException {
        final Function1 function1;
        final Function1 function12;
        final Painter painter;
        Object obj = objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        String str = (String) objArr[2];
        seek seekVar = (seek) objArr[3];
        Function1 function13 = (Function1) objArr[4];
        Function1 function14 = (Function1) objArr[5];
        Function1 function15 = (Function1) objArr[6];
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = (QuirkSettingsLoader) objArr[7];
        immediateFailedFuture immediatefailedfutureIAuthTabCallback = (immediateFailedFuture) objArr[8];
        Painter painter2 = (Painter) objArr[9];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[10];
        int iIntValue = ((Number) objArr[11]).intValue();
        int iIntValue2 = ((Number) objArr[12]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0 ? (iIntValue2 & 2) != 0 : (iIntValue2 & 4) != 0) {
            quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
        }
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        Object obj2 = null;
        final String str2 = (iIntValue2 & 4) != 0 ? null : str;
        final seek seekVar2 = (iIntValue2 & 8) != 0 ? null : seekVar;
        if ((iIntValue2 & 16) != 0) {
            int i3 = onNavigationEvent + 19;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            function1 = null;
        } else {
            function1 = function13;
        }
        final Function1 function16 = (iIntValue2 & 32) != 0 ? null : function14;
        if ((iIntValue2 & 64) != 0) {
            int i5 = onNavigationEvent + 93;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            function12 = null;
        } else {
            function12 = function15;
        }
        if ((iIntValue2 & 128) != 0) {
            quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
        }
        final QuirkSettingsLoader quirkSettingsLoader = quirkSettingsLoaderOnExtraCallback;
        if ((iIntValue2 & 256) != 0) {
            immediatefailedfutureIAuthTabCallback = immediateFailedFuture.Companion.IAuthTabCallback();
            int i6 = onNavigationEvent + 111;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        final immediateFailedFuture immediatefailedfuture = immediatefailedfutureIAuthTabCallback;
        if ((iIntValue2 & 512) != 0) {
            int i8 = onWarmupCompleted + 15;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            painter2 = null;
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1266105232, iIntValue, -1, "im.toss.tds.compose.component.atom.image.TdsImage (TdsImage.kt:218)");
        }
        final Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
        final Object objOnNavigationEvent = onNavigationEvent(obj, context, cameraCaptureResultEmptyCameraCaptureResult, iIntValue & 14, 0);
        if (painter2 == null) {
            int i10 = onNavigationEvent + 39;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            if (objOnNavigationEvent instanceof Integer) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(139225864);
                Painter painterOnExtraCallbackWithResult = onExtraCallbackWithResult(((Number) objOnNavigationEvent).intValue(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                painter = painterOnExtraCallbackWithResult;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(139272798);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                painter = null;
            }
        } else {
            painter = painter2;
        }
        putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.getInterfaceDescriptor(), null, null, ForwardingCameraControl.onExtraCallback(1822624659, true, new Function2() { // from class: im.toss.tds.compose.component.atom.image.TdsImageKt$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj3, Object obj4) {
                int i12 = 2 % 2;
                int i13 = IAuthTabCallback + 77;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                Unit unitOnExtraCallbackWithResult = AppLovinNativeAdImplc.onExtraCallbackWithResult(painter, context, objOnNavigationEvent, str2, quirksExternalSyntheticBackport02, function1, function16, function12, quirkSettingsLoader, immediatefailedfuture, seekVar2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                int i15 = onWarmupCompleted + 19;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3078, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return null;
    }

    static final class onWarmupCompleted implements StrategyKtExternalSyntheticLambda0 {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Painter IAuthTabCallback;

        onWarmupCompleted(Painter painter) {
            this.IAuthTabCallback = painter;
        }

        public final Object IAuthTabCallback(CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8, RecomposerawaitIdle2 recomposerawaitIdle2, access13800<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted> access13800Var) {
            int i = 2 % 2;
            KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult = new KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult(this.IAuthTabCallback);
            int i2 = onExtraCallback + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }
    }

    private static final Unit onExtraCallback(Context context, Object obj, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Painter painter, Function1 function1, Function1 function12, Function1 function13, QuirkSettingsLoader quirkSettingsLoader, immediateFailedFuture immediatefailedfuture, seek seekVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onNavigationEvent;
            int i4 = i3 + 35;
            onWarmupCompleted = i4 % 128;
            z = i4 % 2 != 0;
            int i5 = i3 + 23;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = onNavigationEvent + 75;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i9 = onNavigationEvent + 3;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1355405800, i, -1, "im.toss.tds.compose.component.atom.image.TdsImage.<anonymous>.<anonymous> (TdsImage.kt:260)");
            }
            onNavigationEvent(ACPayResult.onWarmupCompleted(), 1992482033, ACPayResult.onWarmupCompleted(), new Object[]{context, obj, str, quirksExternalSyntheticBackport0, painter, function1, function12, function13, quirkSettingsLoader, immediatefailedfuture, seekVar, cameraCaptureResultEmptyCameraCaptureResult, 0}, ACPayResult.onWarmupCompleted(), -1992482033, ACPayResult.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onWarmupCompleted + 69;
                onNavigationEvent = i11 % 128;
                if (i11 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(final Painter painter, final Context context, final Object obj, final String str, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final Function1 function1, final Function1 function12, final Function1 function13, final QuirkSettingsLoader quirkSettingsLoader, final immediateFailedFuture immediatefailedfuture, final seek seekVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        boolean zAreEqual;
        Painter painterOnNavigationEvent;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onNavigationEvent + 111;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onNavigationEvent + 63;
            onWarmupCompleted = i5 % 128;
            Object obj2 = null;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onWarmupCompleted + 25;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1822624659, i, -1, "im.toss.tds.compose.component.atom.image.TdsImage.<anonymous> (TdsImage.kt:255)");
                    obj2.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1822624659, i, -1, "im.toss.tds.compose.component.atom.image.TdsImage.<anonymous> (TdsImage.kt:255)");
            }
            if (((Boolean) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(createBitmapFromJpegImage.onExtraCallbackWithResult())).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-804357956);
                zAreEqual = Intrinsics.areEqual(cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AccessibilityServiceStateProvider_androidKtExternalSyntheticLambda5.onNavigationEvent()), StrategyKtExternalSyntheticLambda0.onNavigationEvent);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(834708377);
                zAreEqual = false;
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i7 = onNavigationEvent + 105;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            if (zAreEqual) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(834789695);
                if (painter == null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-804353781);
                    painterOnNavigationEvent = snapshot.onNavigationEvent(R.drawable.ic_menu_report_image, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-804354432);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    painterOnNavigationEvent = painter;
                }
                accessisMonitoringp accessismonitoringpOnNavigationEvent = AccessibilityServiceStateProvider_androidKtExternalSyntheticLambda5.onNavigationEvent();
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(painterOnNavigationEvent);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new onWarmupCompleted(painterOnNavigationEvent);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                setPostviewFormatSelector.onNavigationEvent(accessismonitoringpOnNavigationEvent.onExtraCallback((StrategyKtExternalSyntheticLambda0) objOnMinimized), ForwardingCameraControl.onExtraCallback(-1355405800, true, new Function2() { // from class: im.toss.tds.compose.component.atom.image.TdsImageKt$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj3, Object obj4) {
                        int i9 = 2 % 2;
                        int i10 = IAuthTabCallback + 81;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitOnExtraCallbackWithResult = AppLovinNativeAdImplc.onExtraCallbackWithResult(context, obj, str, quirksExternalSyntheticBackport0, painter, function1, function12, function13, quirkSettingsLoader, immediatefailedfuture, seekVar, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i12 = onExtraCallback + 5;
                        IAuthTabCallback = i12 % 128;
                        if (i12 % 2 == 0) {
                            return unitOnExtraCallbackWithResult;
                        }
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(835119566);
                onNavigationEvent(ACPayResult.onWarmupCompleted(), 1992482033, ACPayResult.onWarmupCompleted(), new Object[]{context, obj, str, quirksExternalSyntheticBackport0, painter, function1, function12, function13, quirkSettingsLoader, immediatefailedfuture, seekVar, cameraCaptureResultEmptyCameraCaptureResult, 0}, ACPayResult.onWarmupCompleted(), -1992482033, ACPayResult.onWarmupCompleted());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onNavigationEvent + 113;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Painter onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Resources.NotFoundException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 99;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1378284821);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1378284821, i2, -1, "im.toss.tds.compose.component.atom.image.safePainterResource (TdsImage.kt:273)");
            int i6 = onWarmupCompleted + 97;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 / 5;
            }
        }
        Resources resources = ((Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback())).getResources();
        ResourceIdCache resourceIdCache = (ResourceIdCache) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.onNavigationEvent());
        Intrinsics.checkNotNull(resources);
        CharSequence charSequence = resourceIdCache.onNavigationEvent(resources, i).string;
        if (charSequence != null) {
            int i8 = onWarmupCompleted + 45;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0 ? StringsKt.endsWith$default(charSequence, ".xml", false, 2, (Object) null) : !StringsKt.endsWith$default(charSequence, ".xml", false, 3, (Object) null)) {
                XmlResourceParser xml = resources.getXml(i);
                Intrinsics.checkNotNullExpressionValue(xml, "");
                if (!Intrinsics.areEqual(SurfaceUtilSurfaceInfo.onExtraCallbackWithResult(xml).getName(), "vector")) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    int i9 = onWarmupCompleted + 109;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    return null;
                }
            }
        }
        Painter painterOnNavigationEvent = snapshot.onNavigationEvent(i, cameraCaptureResultEmptyCameraCaptureResult, i2 & 14);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i11 = onNavigationEvent + 25;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return painterOnNavigationEvent;
    }

    public static final Object onNavigationEvent(@Nullable Object obj, @Nullable Context context, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        if ((i2 & 2) != 0) {
            context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1128796197, i, -1, "im.toss.tds.compose.component.atom.image.tdsImageModel (TdsImage.kt:292)");
        }
        if (obj instanceof deprecated_followRedirects) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1853584939);
            obj = onNavigationEvent(ACPayResult.onWarmupCompleted(), 377537719, ACPayResult.onWarmupCompleted(), new Object[]{(deprecated_followRedirects) obj, context, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i & 126)}, ACPayResult.onWarmupCompleted(), -377537717, ACPayResult.onWarmupCompleted());
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1853585631);
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i4 = onWarmupCompleted + 27;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onWarmupCompleted + 71;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i7 = onNavigationEvent + 43;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        Object objOnWarmupCompleted;
        deprecated_followRedirects deprecated_followredirects = (deprecated_followRedirects) objArr[0];
        Context context = (Context) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1026029492, iIntValue, -1, "im.toss.tds.compose.component.atom.image.toModel (TdsImage.kt:298)");
        }
        if (deprecated_followredirects instanceof deprecated_cookieJar) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1828140636);
            objOnWarmupCompleted = onNavigationEvent(ACPayResult.onWarmupCompleted(), 377537719, ACPayResult.onWarmupCompleted(), new Object[]{((deprecated_cookieJar) deprecated_followredirects).onExtraCallbackWithResult(context), context, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue & 112)}, ACPayResult.onWarmupCompleted(), -377537717, ACPayResult.onWarmupCompleted());
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else if (deprecated_followredirects instanceof accessgetDEFAULT_PROTOCOLScp) {
            int i2 = onNavigationEvent + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1828142094);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            objOnWarmupCompleted = Integer.valueOf(((accessgetDEFAULT_PROTOCOLScp) deprecated_followredirects).onNavigationEvent());
        } else {
            if (!(deprecated_followredirects instanceof verifyClientState)) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1828138520);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                throw new NoWhenBranchMatchedException();
            }
            int i4 = onNavigationEvent + 51;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1828143071);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                deprecated_authenticator.onWarmupCompleted((verifyClientState) deprecated_followredirects, context);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1828143071);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            objOnWarmupCompleted = deprecated_authenticator.onWarmupCompleted((verifyClientState) deprecated_followredirects, context);
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return objOnWarmupCompleted;
    }

    private static final void onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 51;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1708624173);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1708624173);
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onWarmupCompleted + 47;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1708624173, i, -1, "im.toss.tds.compose.component.atom.image.Preview (TdsImage.kt:311)");
                int i6 = onNavigationEvent + 85;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) AppLovinNativeAdLoadListener.onExtraCallbackWithResult.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsImageKt$.ExternalSyntheticLambda1(i));
            int i8 = onWarmupCompleted + 47;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public static final void onExtraCallback(@Nullable Object obj, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable String str, @Nullable seek seekVar, @Nullable Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit> function1, @Nullable Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit> function12, @Nullable Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit> function13, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable Painter painter, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{obj, quirksExternalSyntheticBackport0, str, seekVar, function1, function12, function13, quirkSettingsLoader, immediatefailedfuture, painter, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
    }

    private static final void onWarmupCompleted(Context context, Object obj, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Painter painter, Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit> function1, Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit> function12, Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit> function13, QuirkSettingsLoader quirkSettingsLoader, immediateFailedFuture immediatefailedfuture, seek seekVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        onNavigationEvent(ACPayResult.onWarmupCompleted(), 1992482033, ACPayResult.onWarmupCompleted(), new Object[]{context, obj, str, quirksExternalSyntheticBackport0, painter, function1, function12, function13, quirkSettingsLoader, immediatefailedfuture, seekVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, ACPayResult.onWarmupCompleted(), -1992482033, ACPayResult.onWarmupCompleted());
    }

    public static final Object IAuthTabCallback(@NotNull deprecated_followRedirects deprecated_followredirects, @NotNull Context context, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return onNavigationEvent(ACPayResult.onWarmupCompleted(), 377537719, ACPayResult.onWarmupCompleted(), new Object[]{deprecated_followredirects, context, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, ACPayResult.onWarmupCompleted(), -377537717, ACPayResult.onWarmupCompleted());
    }
}
