package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.features.password.api.annotation.RequiresAuth;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.rx2.RxSingleKt;
import o.RememberLottieCompositionKtlottieComposition1;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TimeoutCompanionNONE1;
import o.getIssuer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getIssuer {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final getIssuer IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static long asInterface = 0;
    public static final int onExtraCallback;
    private static final Set<Class<?>> onExtraCallbackWithResult;
    private static final Set<Class<?>> onNavigationEvent;
    private static int onTransact = 1;
    private static final AppSetIdAndScope1 onWarmupCompleted;

    public static /* synthetic */ JsonReaderErrorInfo IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        JsonReaderErrorInfo jsonReaderErrorInfoAsBinder = asBinder(function1, obj);
        int i4 = IAuthTabCallbackStub + 61;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return jsonReaderErrorInfoAsBinder;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ RememberLottieCompositionKtlottieComposition1 IAuthTabCallback(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1OnExtraCallbackWithResult = onExtraCallbackWithResult(rememberLottieCompositionKtlottieComposition1, th);
        int i4 = IAuthTabCallbackStub + 9;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return rememberLottieCompositionKtlottieComposition1OnExtraCallbackWithResult;
    }

    public static /* synthetic */ serializeRaw IAuthTabCallback(RequiresAuth requiresAuth, long j, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1) {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        serializeRaw serializeraw = (serializeRaw) onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{requiresAuth, Long.valueOf(j), rememberLottieCompositionKtlottieComposition1}, -140480240, 140480240, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted());
        int i3 = onTransact + 119;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return serializeraw;
    }

    public static /* synthetic */ void IAuthTabCallback(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(rememberLottieCompositionKtlottieComposition1);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onTransact + 15;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(function1, obj);
        int i4 = onTransact + 17;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return null;
    }

    public static /* synthetic */ JsonReaderErrorInfo onExtraCallback(isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            return (JsonReaderErrorInfo) onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{isjsontypeignore}, 1548751818, -1548751817, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted3);
        }
        int iOnWarmupCompleted4 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted5 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted6 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        throw null;
    }

    public static /* synthetic */ serializeRaw onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(function1, obj);
        }
        onWarmupCompleted(function1, obj);
        throw null;
    }

    private static final RememberLottieCompositionKtlottieComposition1 onExtraCallbackWithResult(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        int i4 = IAuthTabCallbackStub + 47;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return rememberLottieCompositionKtlottieComposition1;
        }
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | (~(i8 | i5));
        int i10 = ~i5;
        int i11 = i9 | (~(i10 | i3 | i2));
        int i12 = i3 | i2;
        int i13 = i10 | i12;
        int i14 = (~(i5 | i3)) | (~i12);
        int i15 = i3 + i2 + i4 + (1068639271 * i6) + ((-1919980423) * i);
        int i16 = i15 * i15;
        int i17 = ((i3 * 1648758371) - 594280448) + (1648758371 * i2) + (i11 * (-226102882)) + ((-226102882) * i13) + (226102882 * i14) + (1422655488 * i4) + ((-1693188096) * i6) + (611057664 * i) + ((-810221568) * i16);
        int i18 = (i3 * 982247175) + 1844138806 + (i2 * 982247175) + (i11 * (-762)) + (i13 * (-762)) + (i14 * 762) + (i4 * 982246413) + (i6 * 1533776379) + (i * 1016546853) + (i16 * (-1070530560));
        int i19 = i17 + (i18 * i18 * 1708326912);
        if (i19 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i19 != 2) {
            return i19 != 3 ? i19 != 4 ? i19 != 5 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
        }
        RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1 = (RememberLottieCompositionKtlottieComposition1) objArr[0];
        RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition12 = (RememberLottieCompositionKtlottieComposition1) objArr[1];
        int i20 = 2 % 2;
        int i21 = IAuthTabCallbackStub + 53;
        onTransact = i21 % 128;
        int i22 = i21 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(rememberLottieCompositionKtlottieComposition1, rememberLottieCompositionKtlottieComposition12);
        int i23 = IAuthTabCallbackStub + 121;
        onTransact = i23 % 128;
        int i24 = i23 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(rememberLottieCompositionKtlottieComposition1, th);
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        int i5 = IAuthTabCallbackStub + 109;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        int i5 = IAuthTabCallbackStub + 69;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    private getIssuer() {
    }

    static {
        onExtraCallback();
        IAuthTabCallback = new getIssuer();
        onWarmupCompleted = ea10.onExtraCallbackWithResult("ActivityAuthHandler");
        onNavigationEvent = Collections.synchronizedSet(new LinkedHashSet());
        onExtraCallbackWithResult = Collections.synchronizedSet(new LinkedHashSet());
        onExtraCallback = 8;
        int i = IAuthTabCallbackDefault + 37;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getIssuer getissuer = (getIssuer) objArr[0];
        Context context = (Context) objArr[1];
        RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1 = (RememberLottieCompositionKtlottieComposition1) objArr[2];
        Intent intent = (Intent) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(rememberLottieCompositionKtlottieComposition1, "");
        Objects.toString(rememberLottieCompositionKtlottieComposition1);
        if (intent != null) {
            wasLastName waslastnameOnExtraCallbackWithResult = getissuer.onExtraCallbackWithResult(context, rememberLottieCompositionKtlottieComposition1, new Intent[]{intent});
            int i2 = IAuthTabCallbackStub + 5;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return waslastnameOnExtraCallbackWithResult;
        }
        int i4 = IAuthTabCallbackStub + 113;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        wasLastName waslastnameIAuthTabCallback = wasLastName.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(waslastnameIAuthTabCallback, "");
        return waslastnameIAuthTabCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.wasLastName onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull android.content.Context r10, @org.jetbrains.annotations.NotNull final o.RememberLottieCompositionKtlottieComposition1 r11, @org.jetbrains.annotations.Nullable android.content.Intent[] r12) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getIssuer.onExtraCallbackWithResult(android.content.Context, o.RememberLottieCompositionKtlottieComposition1, android.content.Intent[]):o.wasLastName");
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(asInterface ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 125;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 115;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(asInterface)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getLongPressTimeout() >> 16)), 84 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 21232 - MotionEvent.axisFromString(""), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 14185), 20 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    private static final serializeRaw onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        serializeRaw serializeraw = (serializeRaw) function1.invoke(obj);
        int i4 = onTransact + 117;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return serializeraw;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r21) {
        /*
            r0 = 0
            r0 = r21[r0]
            im.toss.features.password.api.annotation.RequiresAuth r0 = (im.toss.features.password.api.annotation.RequiresAuth) r0
            r1 = 1
            r1 = r21[r1]
            java.lang.Number r1 = (java.lang.Number) r1
            long r5 = r1.longValue()
            r1 = 2
            r2 = r21[r1]
            r3 = r2
            o.RememberLottieCompositionKtlottieComposition1 r3 = (o.RememberLottieCompositionKtlottieComposition1) r3
            int r2 = r1 % r1
            int r2 = o.getIssuer.onTransact
            int r2 = r2 + 99
            int r4 = r2 % 128
            o.getIssuer.IAuthTabCallbackStub = r4
            int r2 = r2 % r1
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            o.shortValue$onWarmupCompleted r2 = o.shortValue.Companion
            if (r0 == 0) goto L3f
            int r4 = o.getIssuer.onTransact
            int r4 = r4 + 3
            int r7 = r4 % 128
            o.getIssuer.IAuthTabCallbackStub = r7
            int r4 = r4 % r1
            if (r4 != 0) goto L3a
            o.UTF8Decoder r0 = r0.onWarmupCompleted()
            if (r0 != 0) goto L41
            goto L3f
        L3a:
            r0.onWarmupCompleted()
            r0 = 0
            throw r0
        L3f:
            o.UTF8Decoder r0 = o.UTF8Decoder.SERVICE_ENTER
        L41:
            r4 = r0
            r7 = 0
            r8 = 0
            r9 = 1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 32728(0x7fd8, float:4.5862E-41)
            r20 = 0
            o.getByteBuffer r0 = o.shortValue.IAuthTabCallback(r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getIssuer.onNavigationEvent(java.lang.Object[]):java.lang.Object");
    }

    private static final JsonReaderErrorInfo asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        JsonReaderErrorInfo jsonReaderErrorInfo = (JsonReaderErrorInfo) function1.invoke(obj);
        int i4 = IAuthTabCallbackStub + 103;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return jsonReaderErrorInfo;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        isJSONTypeIgnore isjsontypeignore = (isJSONTypeIgnore) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(isjsontypeignore, "");
        wasLastName waslastnameIAuthTabCallback = wasLastName.IAuthTabCallback();
        int i4 = IAuthTabCallbackStub + 63;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return waslastnameIAuthTabCallback;
    }

    private static final void onExtraCallbackWithResult(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1) {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Set<Class<?>> set = onNavigationEvent;
            getIssuer getissuer = IAuthTabCallback;
            set.remove(getissuer.onNavigationEvent(rememberLottieCompositionKtlottieComposition1));
            if (onExtraCallbackWithResult.remove(getissuer.onNavigationEvent(rememberLottieCompositionKtlottieComposition1))) {
                Activity activity = rememberLottieCompositionKtlottieComposition1 instanceof Activity ? (Activity) rememberLottieCompositionKtlottieComposition1 : null;
                if (activity != null) {
                    int i3 = onTransact + 105;
                    IAuthTabCallbackStub = i3 % 128;
                    int i4 = i3 % 2;
                    activity.finish();
                    int i5 = onTransact + 57;
                    IAuthTabCallbackStub = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                return;
            }
            return;
        }
        Set<Class<?>> set2 = onNavigationEvent;
        getIssuer getissuer2 = IAuthTabCallback;
        set2.remove(getissuer2.onNavigationEvent(rememberLottieCompositionKtlottieComposition1));
        onExtraCallbackWithResult.remove(getissuer2.onNavigationEvent(rememberLottieCompositionKtlottieComposition1));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super RememberLottieCompositionKtlottieComposition1>, Object> {
        final /* synthetic */ Application $application;
        final /* synthetic */ RememberLottieCompositionKtlottieComposition1 $authView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(Application application, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$application = application;
            this.$authView = rememberLottieCompositionKtlottieComposition1;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super RememberLottieCompositionKtlottieComposition1> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onWarmupCompleted(this.$application, this.$authView, access13800Var);
        }

        /* renamed from: o.getIssuer$onWarmupCompleted$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<ok<? super Activity>, access13800<? super Unit>, Object> {
            final /* synthetic */ Application $application;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(Application application, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.$application = application;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$application, access13800Var);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ok<? super Activity> okVar, access13800<? super Unit> access13800Var) {
                return create(okVar, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* renamed from: o.getIssuer$onWarmupCompleted$4$onExtraCallbackWithResult */
            public static final class onExtraCallbackWithResult implements UST_CERT_GetSignatureAlgorithmType {
                final /* synthetic */ ok<Activity> IAuthTabCallback;

                /* JADX WARN: Multi-variable type inference failed */
                onExtraCallbackWithResult(ok<? super Activity> okVar) {
                    this.IAuthTabCallback = okVar;
                }

                @Override // o.UST_CERT_GetSignatureAlgorithmType, android.app.Application.ActivityLifecycleCallbacks
                public /* bridge */ void onActivityCreated(Activity activity, Bundle bundle) {
                    super.onActivityCreated(activity, bundle);
                }

                @Override // o.UST_CERT_GetSignatureAlgorithmType, android.app.Application.ActivityLifecycleCallbacks
                public /* bridge */ void onActivityDestroyed(Activity activity) {
                    super.onActivityDestroyed(activity);
                }

                @Override // o.UST_CERT_GetSignatureAlgorithmType, android.app.Application.ActivityLifecycleCallbacks
                public /* bridge */ void onActivityPaused(Activity activity) {
                    super.onActivityPaused(activity);
                }

                @Override // o.UST_CERT_GetSignatureAlgorithmType, android.app.Application.ActivityLifecycleCallbacks
                public /* bridge */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    super.onActivitySaveInstanceState(activity, bundle);
                }

                @Override // o.UST_CERT_GetSignatureAlgorithmType, android.app.Application.ActivityLifecycleCallbacks
                public /* bridge */ void onActivityStarted(Activity activity) {
                    super.onActivityStarted(activity);
                }

                @Override // o.UST_CERT_GetSignatureAlgorithmType, android.app.Application.ActivityLifecycleCallbacks
                public /* bridge */ void onActivityStopped(Activity activity) {
                    super.onActivityStopped(activity);
                }

                @Override // o.UST_CERT_GetSignatureAlgorithmType, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                    this.IAuthTabCallback.IAuthTabCallback(activity);
                }
            }

            public final Object invokeSuspend(Object obj) {
                ok okVar = (ok) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    final onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(okVar);
                    Application application = this.$application;
                    if (application != null) {
                        application.registerActivityLifecycleCallbacks(onextracallbackwithresult);
                    }
                    final Application application2 = this.$application;
                    Function0 function0 = new Function0() { // from class: viva.republica.toss.common.ActivityAuthHandler$waitForForegroundAuthViewSingle$1$1$$ExternalSyntheticLambda0
                        public final Object invoke() {
                            return getIssuer.onWarmupCompleted.AnonymousClass4.onNavigationEvent(application2, onextracallbackwithresult);
                        }
                    };
                    this.L$0 = access15400.onNavigationEvent(okVar);
                    this.L$1 = access15400.onNavigationEvent(onextracallbackwithresult);
                    this.label = 1;
                    if (jw.onWarmupCompleted(okVar, function0, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit onNavigationEvent(Application application, onExtraCallbackWithResult onextracallbackwithresult) {
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(onextracallbackwithresult);
                }
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            IAnimation iAnimationOnExtraCallbackWithResult = ycxycx.onExtraCallbackWithResult(ycxycx.onNavigationEvent(ycxycx.onNavigationEvent(new AnonymousClass4(this.$application, null)), new AnonymousClass2(this.$authView, null)));
            this.label = 1;
            Object objOnExtraCallback = ycxycx.onExtraCallback(iAnimationOnExtraCallbackWithResult, this);
            return objOnExtraCallback == objOnWarmupCompleted ? objOnWarmupCompleted : objOnExtraCallback;
        }

        /* renamed from: o.getIssuer$onWarmupCompleted$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<Activity, access13800<? super RememberLottieCompositionKtlottieComposition1>, Object> {
            final /* synthetic */ RememberLottieCompositionKtlottieComposition1 $authView;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
                this.$authView = rememberLottieCompositionKtlottieComposition1;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$authView, access13800Var);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Activity activity, access13800<? super RememberLottieCompositionKtlottieComposition1> access13800Var) {
                return create(activity, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                View decorView;
                RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1 = (Activity) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    if (!(rememberLottieCompositionKtlottieComposition1 instanceof RememberLottieCompositionKtlottieComposition1)) {
                        return null;
                    }
                    Window window = rememberLottieCompositionKtlottieComposition1.getWindow();
                    if (window != null && (decorView = window.getDecorView()) != null) {
                        this.L$0 = rememberLottieCompositionKtlottieComposition1;
                        this.label = 1;
                        if (zzcv.onNavigationEvent(decorView, this) == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                if (Intrinsics.areEqual(rememberLottieCompositionKtlottieComposition1, this.$authView.getActivity())) {
                    return this.$authView;
                }
                if (rememberLottieCompositionKtlottieComposition1 instanceof RememberLottieCompositionKtlottieComposition1) {
                    return rememberLottieCompositionKtlottieComposition1;
                }
                return null;
            }
        }
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStub + 109;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onNavigationEvent(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition12) {
        int i = 2 % 2;
        if (!Intrinsics.areEqual(rememberLottieCompositionKtlottieComposition12, rememberLottieCompositionKtlottieComposition1)) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ActivityAuthHandler", "AuthView changed during waiting for foreground: " + rememberLottieCompositionKtlottieComposition1.getClass() + "} -> " + rememberLottieCompositionKtlottieComposition12.getClass() + "}", (Map) null, (String) null, false, (String) null, 60, (Object) null);
            int i2 = IAuthTabCallbackStub + 95;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 123;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 105;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private final writeRaw<RememberLottieCompositionKtlottieComposition1> onWarmupCompleted(Context context, final RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1) {
        Application application;
        int i = 2 % 2;
        int i2 = onTransact + 77;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (DERSet.onExtraCallback.onUnminimized()) {
            int i4 = onTransact + 13;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            writeRaw<RememberLottieCompositionKtlottieComposition1> writerawOnExtraCallback = writeRaw.onExtraCallback(rememberLottieCompositionKtlottieComposition1);
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallback, "");
            return writerawOnExtraCallback;
        }
        Context applicationContext = context.getApplicationContext();
        Object obj = null;
        if (applicationContext instanceof Application) {
            int i6 = IAuthTabCallbackStub + 69;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            application = (Application) applicationContext;
        } else {
            application = null;
        }
        if (!TextLinkScopeExternalSyntheticLambda3.Companion.onExtraCallbackWithResult().getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED)) {
            writeRaw writerawIAuthTabCallback = RxSingleKt.IAuthTabCallback((CoroutineContext) null, new onWarmupCompleted(application, rememberLottieCompositionKtlottieComposition1, null), 1, (Object) null);
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.common.ActivityAuthHandler$$ExternalSyntheticLambda0
                public final Object invoke(Object obj2) {
                    Object[] objArr = {rememberLottieCompositionKtlottieComposition1, (RememberLottieCompositionKtlottieComposition1) obj2};
                    int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                    return (Unit) getIssuer.onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr, -1082964084, 1082964086, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted());
                }
            };
            writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.common.ActivityAuthHandler$$ExternalSyntheticLambda1
                public final void accept(Object obj2) {
                    getIssuer.onNavigationEvent(function1, obj2);
                }
            }).onWarmupCompleted(5L, TimeUnit.SECONDS);
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.common.ActivityAuthHandler$$ExternalSyntheticLambda2
                public final Object invoke(Object obj2) {
                    return getIssuer.onNavigationEvent(rememberLottieCompositionKtlottieComposition1, (Throwable) obj2);
                }
            };
            writeRaw<RememberLottieCompositionKtlottieComposition1> writerawAsInterface = writerawOnWarmupCompleted.onWarmupCompleted(new deserializeFloat() { // from class: viva.republica.toss.common.ActivityAuthHandler$$ExternalSyntheticLambda3
                public final void accept(Object obj2) {
                    Object[] objArr = {function12, obj2};
                    int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                    getIssuer.onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr, -2024013398, 2024013401, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted());
                }
            }).asInterface(new deserializeIntNullableCollection() { // from class: viva.republica.toss.common.ActivityAuthHandler$$ExternalSyntheticLambda4
                public final Object apply(Object obj2) {
                    return getIssuer.IAuthTabCallback(rememberLottieCompositionKtlottieComposition1, (Throwable) obj2);
                }
            });
            Intrinsics.checkNotNull(writerawAsInterface);
            return writerawAsInterface;
        }
        int i8 = onTransact + 1;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 == 0) {
            writeRaw<RememberLottieCompositionKtlottieComposition1> writerawOnExtraCallback2 = writeRaw.onExtraCallback(rememberLottieCompositionKtlottieComposition1);
            Intrinsics.checkNotNull(writerawOnExtraCallback2);
            return writerawOnExtraCallback2;
        }
        Intrinsics.checkNotNull(writeRaw.onExtraCallback(rememberLottieCompositionKtlottieComposition1));
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        public static final onExtraCallback ALWAYS;
        private static int IAuthTabCallback = 0;
        public static final onExtraCallback NONE;
        public static final onExtraCallback SESSION;
        private static int[] onExtraCallback = null;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 87;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallback[] onextracallbackArr = {SESSION, ALWAYS, NONE};
            int i5 = i2 + 115;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 51;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i2 + 69;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            if (i3 == 0) {
                return onextracallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = $VALUES;
            if (i3 == 0) {
                return (onExtraCallback[]) onextracallbackArr.clone();
            }
            int i4 = 5 / 0;
            return (onExtraCallback[]) onextracallbackArr.clone();
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onExtraCallback;
            int i4 = -1469660336;
            int i5 = 0;
            if (iArr2 != null) {
                int i6 = $10 + 17;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i8 = 0;
                while (i8 < length) {
                    int i9 = $11 + 23;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), MotionEvent.axisFromString("") + 73, 8848 - (Process.myPid() >> 22), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i8++;
                        i4 = -1469660336;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onExtraCallback;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i11 = 0;
                while (i11 < length3) {
                    int i12 = $10 + 77;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr5[i11]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", i5), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 71, TextUtils.indexOf((CharSequence) "", '0', i5) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i11++;
                    i5 = 0;
                }
                i2 = i5;
                iArr5 = iArr6;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr5, i2, iArr4, i2, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                int i14 = $10 + 25;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                for (int i16 = 0; i16 < 16; i16++) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i16];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0, 0) + 22252), View.getDefaultSize(0, 0) + 39, 10302 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                }
                int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - KeyEvent.keyCodeFromString("")), View.combineMeasuredStates(0, 0) + 78, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            IAuthTabCallback();
            SESSION = new onExtraCallback("SESSION", 0);
            Object[] objArr = new Object[1];
            a(new int[]{745540363, -1034056150, -1594958706, 1482757847}, (KeyEvent.getMaxKeyCode() >> 16) + 6, objArr);
            ALWAYS = new onExtraCallback(((String) objArr[0]).intern(), 1);
            NONE = new onExtraCallback("NONE", 2);
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void IAuthTabCallback() {
            onExtraCallback = new int[]{549866380, 84127326, -1202193892, 2029943738, 1191468573, -1076344688, 1450453615, -1279043606, 1134603799, -1426537011, -554504292, -584447034, 656023963, 447784841, 163881303, -403319568, -1672977171, 887189168};
        }
    }

    private static final Unit onExtraCallback(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, Throwable th) {
        int i;
        int i2 = 2 % 2;
        if (th instanceof TimeoutException) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ActivityAuthHandler", "Timeout waiting for foreground AuthView, proceed with original AuthView: " + rememberLottieCompositionKtlottieComposition1.getClass() + "}", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            i = onTransact + 69;
            IAuthTabCallbackStub = i % 128;
        } else {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ActivityAuthHandler", "Error waiting for foreground AuthView, proceed with original AuthView: " + rememberLottieCompositionKtlottieComposition1.getClass() + "}", th, (Map) null, 8, (Object) null);
            i = IAuthTabCallbackStub + 67;
            onTransact = i % 128;
        }
        int i3 = i % 2;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035 A[PHI: r1
      0x0035: PHI (r1v6 boolean) = (r1v5 boolean), (r1v9 boolean) binds: [B:8:0x0032, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onExtraCallback(@org.jetbrains.annotations.NotNull o.RememberLottieCompositionKtlottieComposition1 r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getIssuer.onTransact
            int r1 = r1 + 111
            int r2 = r1 % 128
            o.getIssuer.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 == 0) goto L24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.util.Set<java.lang.Class<?>> r1 = o.getIssuer.onNavigationEvent
            java.lang.Class r2 = r4.onNavigationEvent(r5)
            boolean r1 = r1.contains(r2)
            r2 = 24
            int r2 = r2 / 0
            if (r1 == 0) goto L47
            goto L35
        L24:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.util.Set<java.lang.Class<?>> r1 = o.getIssuer.onNavigationEvent
            java.lang.Class r2 = r4.onNavigationEvent(r5)
            boolean r1 = r1.contains(r2)
            r2 = 1
            if (r1 == r2) goto L35
            goto L47
        L35:
            java.util.Set<java.lang.Class<?>> r2 = o.getIssuer.onExtraCallbackWithResult
            java.lang.Class r3 = r4.onNavigationEvent(r5)
            r2.add(r3)
            int r2 = o.getIssuer.IAuthTabCallbackStub
            int r2 = r2 + 7
            int r3 = r2 % 128
            o.getIssuer.onTransact = r3
            int r2 = r2 % r0
        L47:
            java.util.Objects.toString(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getIssuer.onExtraCallback(o.RememberLottieCompositionKtlottieComposition1):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[PHI: r6
      0x003e: PHI (r6v4 android.content.Intent) = (r6v3 android.content.Intent), (r6v8 android.content.Intent) binds: [B:12:0x003b, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallbackWithResult(java.lang.Object[] r9) {
        /*
            r0 = 0
            r1 = r9[r0]
            o.getIssuer r1 = (o.getIssuer) r1
            r1 = 1
            r9 = r9[r1]
            android.content.Intent[] r9 = (android.content.Intent[]) r9
            r2 = 2
            int r3 = r2 % r2
            if (r9 == 0) goto L69
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r9.length
            r5 = r0
        L16:
            if (r5 >= r4) goto L4e
            int r6 = o.getIssuer.IAuthTabCallbackStub
            int r6 = r6 + 51
            int r7 = r6 % 128
            o.getIssuer.onTransact = r7
            int r6 = r6 % r2
            if (r6 != 0) goto L32
            r6 = r9[r5]
            o.getIssuer r7 = o.getIssuer.IAuthTabCallback
            boolean r7 = r7.onExtraCallbackWithResult(r6)
            r8 = 37
            int r8 = r8 / r0
            r7 = r7 ^ r1
            if (r7 == 0) goto L4b
            goto L3e
        L32:
            r6 = r9[r5]
            o.getIssuer r7 = o.getIssuer.IAuthTabCallback
            boolean r7 = r7.onExtraCallbackWithResult(r6)
            r7 = r7 ^ r1
            if (r7 == r1) goto L3e
            goto L4b
        L3e:
            r3.add(r6)
            int r6 = o.getIssuer.IAuthTabCallbackStub
            int r6 = r6 + 29
            int r7 = r6 % 128
            o.getIssuer.onTransact = r7
            int r6 = r6 % 2
        L4b:
            int r5 = r5 + 1
            goto L16
        L4e:
            android.content.Intent[] r9 = new android.content.Intent[r0]
            java.lang.Object[] r9 = r3.toArray(r9)
            android.content.Intent[] r9 = (android.content.Intent[]) r9
            if (r9 == 0) goto L69
            int r0 = o.getIssuer.IAuthTabCallbackStub
            int r0 = r0 + 23
            int r1 = r0 % 128
            o.getIssuer.onTransact = r1
            int r0 = r0 % r2
            if (r0 == 0) goto L64
            return r9
        L64:
            r9 = 0
            r9.hashCode()
            throw r9
        L69:
            android.content.Intent[] r9 = new android.content.Intent[r0]
            int r1 = o.getIssuer.IAuthTabCallbackStub
            int r1 = r1 + 115
            int r3 = r1 % 128
            o.getIssuer.onTransact = r3
            int r1 = r1 % r2
            if (r1 != 0) goto L79
            r1 = 44
            int r1 = r1 / r0
        L79:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getIssuer.onExtraCallbackWithResult(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onExtraCallbackWithResult(@org.jetbrains.annotations.Nullable android.content.Intent r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getIssuer.onTransact
            int r1 = r1 + 79
            int r2 = r1 % 128
            o.getIssuer.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            r1 = 0
            r2 = 0
            if (r7 == 0) goto L2c
            android.content.ComponentName r3 = r7.getComponent()     // Catch: java.lang.Exception -> L55
            if (r3 == 0) goto L2c
            int r4 = o.getIssuer.onTransact
            int r4 = r4 + 81
            int r5 = r4 % 128
            o.getIssuer.IAuthTabCallbackStub = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L26
            java.lang.String r3 = r3.getClassName()     // Catch: java.lang.Exception -> L55
            goto L36
        L26:
            r3.getClassName()     // Catch: java.lang.Exception -> L55
            throw r2     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L55
        L2a:
            r7 = move-exception
            throw r7
        L2c:
            int r3 = o.getIssuer.IAuthTabCallbackStub
            int r3 = r3 + 27
            int r4 = r3 % 128
            o.getIssuer.onTransact = r4
            int r3 = r3 % r0
            r3 = r2
        L36:
            if (r3 != 0) goto L4a
            int r3 = o.getIssuer.IAuthTabCallbackStub
            int r3 = r3 + 119
            int r4 = r3 % 128
            o.getIssuer.onTransact = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L46
            java.lang.String r3 = ""
            goto L4a
        L46:
            r2.hashCode()
            throw r2
        L4a:
            java.lang.Class r0 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L55
            java.lang.Class<im.toss.features.password.api.annotation.RequiresAuth> r2 = im.toss.features.password.api.annotation.RequiresAuth.class
            boolean r0 = r0.isAnnotationPresent(r2)     // Catch: java.lang.Exception -> L55
            goto L56
        L55:
            r0 = r1
        L56:
            o.getIssuer$onExtraCallback r7 = r6.onWarmupCompleted(r7)
            o.getIssuer$onExtraCallback r2 = o.getIssuer.onExtraCallback.NONE
            if (r7 != r2) goto L60
            if (r0 == 0) goto L61
        L60:
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getIssuer.onExtraCallbackWithResult(android.content.Intent):boolean");
    }

    public final boolean onNavigationEvent(@Nullable Intent[] intentArr) {
        int i = 2 % 2;
        if (intentArr != null) {
            for (Intent intent : intentArr) {
                int i2 = IAuthTabCallbackStub + 117;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                if (!(!IAuthTabCallback.onExtraCallbackWithResult(intent))) {
                    int i4 = IAuthTabCallbackStub + 71;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean onNavigationEvent() {
        Set<Class<?>> set;
        int i = 2 % 2;
        int i2 = onTransact + 53;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Set<Class<?>> set2 = onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(set2, "");
            set = set2;
        } else {
            Set<Class<?>> set3 = onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(set3, "");
            set = set3;
        }
        boolean z = !set.isEmpty();
        int i3 = IAuthTabCallbackStub + 31;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v100, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r5v101, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r5v102, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v103 */
    /* JADX WARN: Type inference failed for: r5v104, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v105, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v50, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v71, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v80, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v89, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r5v96, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r5v97, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v98, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r5v99, types: [java.lang.Short] */
    private final onExtraCallback onWarmupCompleted(Intent intent) throws Throwable {
        Object obj;
        ?? string;
        Object next;
        Object next2;
        int i = 2 % 2;
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null && extras.containsKey("_auth_type")) {
                    if (zzbq.onNavigationEvent(intent)) {
                        Bundle extras2 = intent.getExtras();
                        if (extras2 != null && (string = extras2.getString("_auth_type")) != 0) {
                            if (Intrinsics.areEqual(String.class, Integer.class)) {
                                int i2 = onTransact + 57;
                                IAuthTabCallbackStub = i2 % 128;
                                if (i2 % 2 != 0) {
                                    string = StringsKt.toIntOrNull((String) string);
                                    int i3 = 63 / 0;
                                } else {
                                    string = StringsKt.toIntOrNull((String) string);
                                }
                            } else if (Intrinsics.areEqual(String.class, Long.class)) {
                                string = StringsKt.toLongOrNull((String) string);
                            } else if (Intrinsics.areEqual(String.class, Float.class)) {
                                string = StringsKt.toFloatOrNull((String) string);
                            } else if (Intrinsics.areEqual(String.class, Double.class)) {
                                string = StringsKt.toDoubleOrNull((String) string);
                            } else if (Intrinsics.areEqual(String.class, Short.class)) {
                                string = StringsKt.toShortOrNull((String) string);
                            } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                                string = StringsKt.toByteOrNull((String) string);
                            } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                                string = Boolean.valueOf(Boolean.parseBoolean(string));
                            } else if (Intrinsics.areEqual(String.class, Character.class)) {
                                int i4 = onTransact + 55;
                                IAuthTabCallbackStub = i4 % 128;
                                int i5 = i4 % 2;
                                string = Character.valueOf(string.charAt(0));
                            } else if (!Intrinsics.areEqual(String.class, String.class)) {
                                if (Intrinsics.areEqual(String.class, Integer[].class)) {
                                    List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj2 : listSplit$default) {
                                        if (((String) obj2).length() > 0) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                                    }
                                    string = arrayList2.toArray(new Integer[0]);
                                } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                                    List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj3 : listSplit$default2) {
                                        if (((String) obj3).length() > 0) {
                                            arrayList3.add(obj3);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                                    Iterator it2 = arrayList3.iterator();
                                    while (it2.hasNext()) {
                                        arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it2.next()).toString())));
                                    }
                                    string = arrayList4.toArray(new Long[0]);
                                } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                                    List listSplit$default3 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj4 : listSplit$default3) {
                                        if (((String) obj4).length() > 0) {
                                            arrayList5.add(obj4);
                                        }
                                    }
                                    ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                                    Iterator it3 = arrayList5.iterator();
                                    while (it3.hasNext()) {
                                        arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it3.next()).toString())));
                                    }
                                    string = arrayList6.toArray(new Float[0]);
                                } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                                    List listSplit$default4 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList7 = new ArrayList();
                                    for (Object obj5 : listSplit$default4) {
                                        if (((String) obj5).length() > 0) {
                                            arrayList7.add(obj5);
                                        }
                                    }
                                    ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                                    Iterator it4 = arrayList7.iterator();
                                    while (it4.hasNext()) {
                                        int i6 = IAuthTabCallbackStub + 67;
                                        onTransact = i6 % 128;
                                        int i7 = i6 % 2;
                                        arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it4.next()).toString())));
                                    }
                                    string = arrayList8.toArray(new Double[0]);
                                } else if (Intrinsics.areEqual(String.class, Short[].class)) {
                                    List listSplit$default5 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList9 = new ArrayList();
                                    for (Object obj6 : listSplit$default5) {
                                        if (((String) obj6).length() > 0) {
                                            arrayList9.add(obj6);
                                        }
                                    }
                                    ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                                    Iterator it5 = arrayList9.iterator();
                                    while (it5.hasNext()) {
                                        arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it5.next()).toString())));
                                    }
                                    string = arrayList10.toArray(new Short[0]);
                                } else if (Intrinsics.areEqual(String.class, Byte[].class)) {
                                    List listSplit$default6 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList11 = new ArrayList();
                                    for (Object obj7 : listSplit$default6) {
                                        if (((String) obj7).length() > 0) {
                                            arrayList11.add(obj7);
                                        }
                                    }
                                    ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                                    Iterator it6 = arrayList11.iterator();
                                    while (it6.hasNext()) {
                                        arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it6.next()).toString())));
                                    }
                                    string = arrayList12.toArray(new Byte[0]);
                                } else if (Intrinsics.areEqual(String.class, Boolean[].class)) {
                                    List listSplit$default7 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList13 = new ArrayList();
                                    for (Object obj8 : listSplit$default7) {
                                        if (((String) obj8).length() > 0) {
                                            arrayList13.add(obj8);
                                        }
                                    }
                                    ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
                                    Iterator it7 = arrayList13.iterator();
                                    int i8 = onTransact + 101;
                                    IAuthTabCallbackStub = i8 % 128;
                                    int i9 = i8 % 2;
                                    while (it7.hasNext()) {
                                        arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it7.next()).toString())));
                                    }
                                    string = arrayList14.toArray(new Boolean[0]);
                                } else if (Intrinsics.areEqual(String.class, Character[].class)) {
                                    List listSplit$default8 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList15 = new ArrayList();
                                    Iterator it8 = listSplit$default8.iterator();
                                    while (it8.hasNext()) {
                                        int i10 = onTransact + 115;
                                        IAuthTabCallbackStub = i10 % 128;
                                        if (i10 % 2 != 0) {
                                            next2 = it8.next();
                                            int i11 = 50 / 0;
                                            if (((String) next2).length() > 0) {
                                                arrayList15.add(next2);
                                            }
                                        } else {
                                            next2 = it8.next();
                                            if (((String) next2).length() > 0) {
                                                arrayList15.add(next2);
                                            }
                                        }
                                    }
                                    ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                                    Iterator it9 = arrayList15.iterator();
                                    while (it9.hasNext()) {
                                        int i12 = IAuthTabCallbackStub + 67;
                                        onTransact = i12 % 128;
                                        int i13 = i12 % 2;
                                        arrayList16.add(Character.valueOf(StringsKt.trim((String) it9.next()).toString().charAt(0)));
                                    }
                                    string = arrayList16.toArray(new Character[0]);
                                } else if (Intrinsics.areEqual(String.class, String[].class)) {
                                    List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList17 = new ArrayList();
                                    for (Object obj9 : listSplit$default9) {
                                        if (((String) obj9).length() > 0) {
                                            arrayList17.add(obj9);
                                        }
                                    }
                                    string = arrayList17.toArray(new String[0]);
                                } else {
                                    Object[] enumConstants = String.class.getEnumConstants();
                                    if (enumConstants != null) {
                                        ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                        for (Object obj10 : enumConstants) {
                                            Intrinsics.checkNotNull(obj10, "");
                                            arrayList18.add((Enum) obj10);
                                        }
                                        Iterator it10 = arrayList18.iterator();
                                        while (true) {
                                            if (!it10.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it10.next();
                                            if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                                int i14 = onTransact + 65;
                                                IAuthTabCallbackStub = i14 % 128;
                                                if (i14 % 2 != 0) {
                                                    obj.hashCode();
                                                    throw null;
                                                }
                                            }
                                        }
                                        string = (Enum) next;
                                    } else {
                                        string = 0;
                                    }
                                    if (string == 0) {
                                        if (zzaj.onNavigationEvent().onActivityLayout()) {
                                            throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                                        }
                                        int i15 = onTransact + 27;
                                        IAuthTabCallbackStub = i15 % 128;
                                        if (i15 % 2 != 0) {
                                            obj.hashCode();
                                            throw null;
                                        }
                                        string = 0;
                                    }
                                }
                            }
                            obj = (String) (string instanceof String ? string : null);
                        }
                    } else {
                        Bundle extras3 = intent.getExtras();
                        if (extras3 != null) {
                            int i16 = IAuthTabCallbackStub + 45;
                            onTransact = i16 % 128;
                            int i17 = i16 % 2;
                            obj = extras3.get("_auth_type");
                        } else {
                            obj = null;
                        }
                        obj = (String) (obj instanceof String ? obj : null);
                    }
                }
            } catch (Exception unused) {
                return onExtraCallback.NONE;
            }
        }
        Object[] objArr = new Object[1];
        a(new char[]{44855, 36094, 44868, 11016, 7191, 21314, 59815, 8045, 12562, 51534, 61707}, 1 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
        if (!Intrinsics.areEqual(obj, ((String) objArr[0]).intern())) {
            return Intrinsics.areEqual(obj, "always") ? onExtraCallback.ALWAYS : onExtraCallback.NONE;
        }
        int i18 = IAuthTabCallbackStub + 25;
        onTransact = i18 % 128;
        int i19 = i18 % 2;
        return onExtraCallback.SESSION;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final im.toss.features.password.api.annotation.RequiresAuth onNavigationEvent(android.content.Intent r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getIssuer.IAuthTabCallbackStub
            int r1 = r1 + 79
            int r2 = r1 % 128
            o.getIssuer.onTransact = r2
            int r1 = r1 % r0
            r1 = 0
            if (r7 == 0) goto L2a
            int r2 = r2 + 25
            int r3 = r2 % 128
            o.getIssuer.IAuthTabCallbackStub = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L23
            android.content.ComponentName r7 = r7.getComponent()     // Catch: java.lang.Exception -> L60
            if (r7 == 0) goto L2a
            java.lang.String r7 = r7.getClassName()     // Catch: java.lang.Exception -> L60
            goto L2b
        L23:
            r7.getComponent()     // Catch: java.lang.Exception -> L60
            r1.hashCode()
            throw r1
        L2a:
            r7 = r1
        L2b:
            java.lang.String r2 = ""
            if (r7 != 0) goto L39
            int r7 = o.getIssuer.onTransact
            int r7 = r7 + 45
            int r3 = r7 % 128
            o.getIssuer.IAuthTabCallbackStub = r3
            int r7 = r7 % r0
            r7 = r2
        L39:
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Exception -> L60
            java.lang.annotation.Annotation[] r7 = r7.getAnnotations()     // Catch: java.lang.Exception -> L60
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)     // Catch: java.lang.Exception -> L60
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L60
            r0.<init>()     // Catch: java.lang.Exception -> L60
            int r2 = r7.length     // Catch: java.lang.Exception -> L60
            r3 = 0
        L4b:
            if (r3 >= r2) goto L59
            r4 = r7[r3]     // Catch: java.lang.Exception -> L60
            boolean r5 = r4 instanceof im.toss.features.password.api.annotation.RequiresAuth     // Catch: java.lang.Exception -> L60
            if (r5 == 0) goto L56
            r0.add(r4)     // Catch: java.lang.Exception -> L60
        L56:
            int r3 = r3 + 1
            goto L4b
        L59:
            java.lang.Object r7 = kotlin.collections.CollectionsKt.firstOrNull(r0)     // Catch: java.lang.Exception -> L60
            im.toss.features.password.api.annotation.RequiresAuth r7 = (im.toss.features.password.api.annotation.RequiresAuth) r7     // Catch: java.lang.Exception -> L60
            return r7
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getIssuer.onNavigationEvent(android.content.Intent):im.toss.features.password.api.annotation.RequiresAuth");
    }

    private final Class<?> onNavigationEvent(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1) {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return rememberLottieCompositionKtlottieComposition1.getClass();
        }
        rememberLottieCompositionKtlottieComposition1.getClass();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition12) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{rememberLottieCompositionKtlottieComposition1, rememberLottieCompositionKtlottieComposition12}, -1082964084, 1082964086, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted3);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{function1, obj}, -2024013398, 2024013401, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted3);
    }

    private static final serializeRaw onExtraCallback(RequiresAuth requiresAuth, long j, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1) {
        Object[] objArr = {requiresAuth, Long.valueOf(j), rememberLottieCompositionKtlottieComposition1};
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (serializeRaw) onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr, -140480240, 140480240, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted());
    }

    private static final JsonReaderErrorInfo onWarmupCompleted(isJSONTypeIgnore isjsontypeignore) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (JsonReaderErrorInfo) onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{isjsontypeignore}, 1548751818, -1548751817, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted3);
    }

    public final Intent[] onExtraCallback(@Nullable Intent[] intentArr) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Intent[]) onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{this, intentArr}, -1251972212, 1251972217, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted3);
    }

    public final wasLastName onExtraCallback(@NotNull Context context, @NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, @Nullable Intent intent) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (wasLastName) onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{this, context, rememberLottieCompositionKtlottieComposition1, intent}, 1466415498, -1466415494, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted3);
    }

    static void onExtraCallback() {
        asInterface = 2142636473117629599L;
    }
}
