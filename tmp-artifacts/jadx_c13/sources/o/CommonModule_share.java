package o;

import android.content.Context;
import android.net.Uri;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.CommonModule_share;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class CommonModule_share {
    public static final CommonModule_share IAuthTabCallback = new CommonModule_share();
    private static int IAuthTabCallbackDefault = 1;
    private static final DateTimeFormatter onExtraCallback;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Integer IAuthTabCallback(Context context, Uri uri) throws IOException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(context, uri);
        }
        onWarmupCompleted(context, uri);
        throw null;
    }

    public static /* synthetic */ Float onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Float fOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, obj);
        int i4 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return fOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Integer num = (Integer) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Float fIAuthTabCallback = IAuthTabCallback(num);
        int i4 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return fIAuthTabCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = (~((~i) | i5)) | i6;
        int i8 = ~i6;
        int i9 = (~(i8 | i5)) | (~(i8 | i)) | (~(i5 | i));
        int i10 = (~(i | (~i5))) | i8;
        int i11 = i6 + i5 + i2 + ((-2137991558) * i3) + (111092868 * i4);
        int i12 = i11 * i11;
        int i13 = (((-431794203) * i6) - 566755328) + (427185167 * i5) + (i7 * 1717982222) + (1717982222 * i9) + ((-1717982222) * i10) + ((-1290797056) * i2) + ((-1247805440) * i3) + ((-1807745024) * i4) + ((-591921152) * i12);
        int i14 = (i6 * (-1469267343)) + 1003592187 + (i5 * (-1469268429)) + (i7 * (-362)) + (i9 * (-362)) + (i10 * 362) + (i2 * (-1469268067)) + (i3 * 1951436498) + (i4 * (-746069772)) + (i12 * (-1529348096));
        return i13 + ((i14 * i14) * 1762131968) != 1 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public final float IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        if (i == 3) {
            return 180.0f;
        }
        if (i == 6) {
            return 90.0f;
        }
        int i3 = onExtraCallbackWithResult + 37;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 == 0) {
            if (i == 72) {
                return 270.0f;
            }
        } else if (i == 8) {
            return 270.0f;
        }
        int i5 = i4 + 45;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return 0.0f;
    }

    private CommonModule_share() {
    }

    private static final Integer onWarmupCompleted(Context context, Uri uri) throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        int iOnWarmupCompleted = 1;
        if (inputStreamOpenInputStream != null) {
            try {
                iOnWarmupCompleted = new FlowColumnOverflowScopeImplExternalSyntheticLambda0(inputStreamOpenInputStream).onWarmupCompleted("Orientation", 1);
                int i4 = onNavigationEvent + 51;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            } finally {
            }
        }
        CloseableKt.closeFinally(inputStreamOpenInputStream, null);
        return Integer.valueOf(iOnWarmupCompleted);
    }

    private static final Float IAuthTabCallback(Integer num) {
        Float fValueOf;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(num, "");
            fValueOf = Float.valueOf(IAuthTabCallback.IAuthTabCallback(num.intValue()));
            int i3 = 21 / 0;
        } else {
            Intrinsics.checkNotNullParameter(num, "");
            fValueOf = Float.valueOf(IAuthTabCallback.IAuthTabCallback(num.intValue()));
        }
        int i4 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return fValueOf;
    }

    private static final Float onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Float f = (Float) function1.invoke(obj);
        int i4 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public final writeRaw<Float> onExtraCallbackWithResult(@NotNull final Context context, @NotNull final Uri uri) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        writeRaw writerawOnNavigationEvent = writeRaw.onNavigationEvent(new Callable() { // from class: im.toss.uikit.utils.ExifUtils$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // java.util.concurrent.Callable
            public final Object call() throws IOException {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 111;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Integer numIAuthTabCallback = CommonModule_share.IAuthTabCallback(context, uri);
                int i5 = onNavigationEvent + 37;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return numIAuthTabCallback;
                }
                throw null;
            }
        });
        final Function1 function1 = new Function1() { // from class: im.toss.uikit.utils.ExifUtils$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 65;
                onNavigationEvent = i3 % 128;
                Integer num = (Integer) obj;
                if (i3 % 2 != 0) {
                    throw null;
                }
                Float f = (Float) CommonModule_share.onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -18914050, 18914051, new Object[]{num});
                int i4 = onNavigationEvent + 115;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 71 / 0;
                }
                return f;
            }
        };
        writeRaw<Float> writerawOnWarmupCompleted = writerawOnNavigationEvent.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: im.toss.uikit.utils.ExifUtils$$ExternalSyntheticLambda2
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // o.deserializeIntNullableCollection
            public final Object apply(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 105;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Float fOnExtraCallback = CommonModule_share.onExtraCallback(function1, obj);
                int i5 = onNavigationEvent + 37;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return fOnExtraCallback;
                }
                throw null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
        int i2 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return writerawOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049 A[EXC_TOP_SPLITTER, PHI: r8
      0x0049: PHI (r8v16 java.io.InputStream) = (r8v15 java.io.InputStream), (r8v18 java.io.InputStream) binds: [B:13:0x0047, B:7:0x0032] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Object objM31constructorimpl;
        InputStream inputStreamOpenInputStream;
        CommonModule_setIosSwipeGestureEnabled commonModule_setIosSwipeGestureEnabled;
        CommonModule_share commonModule_share = (CommonModule_share) objArr[0];
        Context context = (Context) objArr[1];
        Uri uri = (Uri) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(uri, "");
                Result.Companion companion = Result.Companion;
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                int i3 = 34 / 0;
                if (inputStreamOpenInputStream != null) {
                    try {
                        FlowColumnOverflowScopeImplExternalSyntheticLambda0 flowColumnOverflowScopeImplExternalSyntheticLambda0 = new FlowColumnOverflowScopeImplExternalSyntheticLambda0(inputStreamOpenInputStream);
                        commonModule_setIosSwipeGestureEnabled = new CommonModule_setIosSwipeGestureEnabled(commonModule_share.IAuthTabCallback(flowColumnOverflowScopeImplExternalSyntheticLambda0.onWarmupCompleted("Orientation", 1)), commonModule_share.onWarmupCompleted(flowColumnOverflowScopeImplExternalSyntheticLambda0.onWarmupCompleted("DateTimeOriginal"), flowColumnOverflowScopeImplExternalSyntheticLambda0.onWarmupCompleted("OffsetTimeOriginal")));
                        CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                    } finally {
                    }
                } else {
                    commonModule_setIosSwipeGestureEnabled = null;
                }
            } else {
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(uri, "");
                Result.Companion companion2 = Result.Companion;
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream != null) {
                }
            }
            objM31constructorimpl = Result.m31constructorimpl(commonModule_setIosSwipeGestureEnabled);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(objM31constructorimpl)) {
            int i4 = onNavigationEvent;
            int i5 = i4 + 77;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 7;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            objM31constructorimpl = null;
        }
        CommonModule_setIosSwipeGestureEnabled commonModule_setIosSwipeGestureEnabled2 = (CommonModule_setIosSwipeGestureEnabled) objM31constructorimpl;
        if (commonModule_setIosSwipeGestureEnabled2 == null) {
            commonModule_setIosSwipeGestureEnabled2 = new CommonModule_setIosSwipeGestureEnabled(0.0f, null, 3, null);
        }
        int i9 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 != 0) {
            return commonModule_setIosSwipeGestureEnabled2;
        }
        throw null;
    }

    public final Long onWarmupCompleted(@Nullable String str, @Nullable String str2) {
        Object objM31constructorimpl;
        ZoneOffset zoneOffsetOf;
        int i = 2 % 2;
        Object obj = null;
        if (str == null) {
            return null;
        }
        if (StringsKt__StringsKt.isBlank(str)) {
            int i2 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            LocalDateTime localDateTime = LocalDateTime.parse(str, onExtraCallback);
            if (str2 != null) {
                zoneOffsetOf = ZoneOffset.of(str2);
            } else {
                int i4 = onNavigationEvent + 73;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                zoneOffsetOf = null;
            }
            objM31constructorimpl = Result.m31constructorimpl(Long.valueOf(zoneOffsetOf != null ? localDateTime.toInstant(zoneOffsetOf).getEpochSecond() : localDateTime.B(ZoneId.systemDefault()).toEpochSecond()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
            int i6 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        if (Result.onExtraCallback(objM31constructorimpl)) {
            int i8 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 36 / 0;
            }
        } else {
            obj = objM31constructorimpl;
        }
        return (Long) obj;
    }

    static {
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy:MM:dd HH:mm:ss");
        Intrinsics.checkNotNullExpressionValue(dateTimeFormatterOfPattern, "");
        onExtraCallback = dateTimeFormatterOfPattern;
        int i = IAuthTabCallbackDefault + 111;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Float onExtraCallback(Integer num) {
        return (Float) onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -18914050, 18914051, new Object[]{num});
    }

    public final CommonModule_setIosSwipeGestureEnabled onNavigationEvent(@NotNull Context context, @NotNull Uri uri) {
        return (CommonModule_setIosSwipeGestureEnabled) onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 1336674902, -1336674902, new Object[]{this, context, uri});
    }
}
