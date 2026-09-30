package o;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import com.jakewharton.rxbinding3.view.RxView;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AFj1sSDK5;
import o.ALCFaceEmotion;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1sSDK5 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final AFj1rSDKExternalSyntheticLambda6 onNavigationEvent;
    private final boolean onWarmupCompleted;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AFj1sSDK5 aFj1sSDK5 = (AFj1sSDK5) objArr[0];
        ALCFaceEmotion aLCFaceEmotion = (ALCFaceEmotion) objArr[1];
        r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq = (r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        Long l = (Long) objArr[4];
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(aFj1sSDK5, aLCFaceEmotion, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, jLongValue, l);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(aFj1sSDK5, aLCFaceEmotion, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, jLongValue, l);
        int i3 = IAuthTabCallback + 123;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 75 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Long onExtraCallback(Unit unit) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(unit);
        }
        onWarmupCompleted(unit);
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onWarmupCompleted(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 753721046, new Object[]{function1, obj}, -753721046, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback);
        int i4 = onExtraCallback + 53;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Long onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Long lOnNavigationEvent = onNavigationEvent(function1, obj);
        int i4 = onExtraCallback + 37;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return lOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(AFj1sSDK5 aFj1sSDK5, Unit unit) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(aFj1sSDK5, unit);
        int i4 = onExtraCallback + 59;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i3);
        int i9 = ~(i3 | i2);
        int i10 = i7 | (~i3);
        int i11 = i9 | (~(i10 | i6));
        int i12 = (~i6) | i10;
        int i13 = i3 + i2 + i + (1134938392 * i4) + ((-1730424158) * i5);
        int i14 = i13 * i13;
        int i15 = (1345404558 * i3) + 1061748736 + ((-382549644) * i2) + (1727954202 * i8) + ((-1283506547) * i11) + (1283506547 * i12) + ((-1666056192) * i) + (1924136960 * i4) + (748945408 * i5) + (912850944 * i14);
        int i16 = (i3 * 1914917686) + 639827133 + (i2 * 1914918628) + (i8 * (-942)) + (i11 * (-471)) + (i12 * 471) + (i * 1914918157) + (i4 * (-1451741640)) + (i5 * (-1338016710)) + (i14 * (-1605042176));
        return i15 + ((i16 * i16) * (-230752256)) != 1 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    public AFj1sSDK5(@Nullable AFj1rSDKExternalSyntheticLambda6 aFj1rSDKExternalSyntheticLambda6) {
        this.onNavigationEvent = aFj1rSDKExternalSyntheticLambda6;
    }

    private static final void onExtraCallback(AFj1sSDK5 aFj1sSDK5, Unit unit) {
        int i = 2 % 2;
        AFj1rSDKExternalSyntheticLambda6 aFj1rSDKExternalSyntheticLambda6 = aFj1sSDK5.onNavigationEvent;
        if (aFj1rSDKExternalSyntheticLambda6 != null) {
            int i2 = onExtraCallback + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            aFj1rSDKExternalSyntheticLambda6.onFirstGlobalLayout();
        }
        int i4 = IAuthTabCallback + 77;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Long onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Long l = (Long) function1.invoke(obj);
        int i4 = onExtraCallback + 1;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return l;
    }

    private static final Long onWarmupCompleted(Unit unit) {
        Long lValueOf;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(unit, "");
            lValueOf = Long.valueOf(SystemClock.elapsedRealtime());
            int i3 = 59 / 0;
        } else {
            Intrinsics.checkNotNullParameter(unit, "");
            lValueOf = Long.valueOf(SystemClock.elapsedRealtime());
        }
        int i4 = onExtraCallback + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return lValueOf;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 119;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return null;
    }

    private static final Unit onNavigationEvent(AFj1sSDK5 aFj1sSDK5, ALCFaceEmotion aLCFaceEmotion, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, long j, Long l) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        AFj1rSDKExternalSyntheticLambda6 aFj1rSDKExternalSyntheticLambda6 = aFj1sSDK5.onNavigationEvent;
        if (aFj1rSDKExternalSyntheticLambda6 != null) {
            int i5 = i3 + 23;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (aLCFaceEmotion != null) {
                if (aFj1sSDK5.onWarmupCompleted) {
                    onVisit.IAuthTabCallback(aFj1rSDKExternalSyntheticLambda6);
                    aLCFaceEmotion.onNavigationEvent();
                }
                boolean zIsSplashScreen = aFj1rSDKExternalSyntheticLambda6.isSplashScreen();
                if (aLCFaceEmotion.onExtraCallback()) {
                    aLCFaceEmotion.onExtraCallbackWithResult(onVisit.IAuthTabCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq) + ".onDisplay", !zIsSplashScreen, l.longValue() - j);
                    aFj1rSDKExternalSyntheticLambda6.onUiLaunchTime(aLCFaceEmotion);
                    int i7 = onExtraCallback + 125;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        int i9 = IAuthTabCallback + 83;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    public final void onExtraCallback(@NotNull final r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull View view, @Nullable final ALCFaceEmotion aLCFaceEmotion) {
        long j;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(view, "");
        if (!(!(r8lambdakrhaimf1bm5cgjbilhp45vln_xq instanceof Activity))) {
            j = 200;
        } else {
            int i2 = onExtraCallback + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            j = 100;
        }
        final long j2 = j;
        getByteBuffer getbytebufferIAuthTabCallback = RxView.IAuthTabCallback(view);
        getByteBuffer getbytebufferOnNavigationEvent = getbytebufferIAuthTabCallback.onExtraCallback(1L).onExtraCallback(new deserializeFloat() { // from class: im.toss.uikit.base.UiLaunchTimeProducer$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // o.deserializeFloat
            public final void accept(Object obj) {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 53;
                IAuthTabCallback = i5 % 128;
                Object obj2 = null;
                if (i5 % 2 != 0) {
                    AFj1sSDK5.onExtraCallbackWithResult(this.f$0, (Unit) obj);
                    obj2.hashCode();
                    throw null;
                }
                AFj1sSDK5.onExtraCallbackWithResult(this.f$0, (Unit) obj);
                int i6 = onWarmupCompleted + 69;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            }
        }).onNavigationEvent((serializeRaw) getbytebufferIAuthTabCallback);
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnNavigationEvent, "");
        getByteBuffer getbytebufferOnExtraCallback = getbytebufferOnNavigationEvent.onExtraCallback(j2, TimeUnit.MILLISECONDS).onExtraCallback(1L);
        final Function1 function1 = new Function1() { // from class: im.toss.uikit.base.UiLaunchTimeProducer$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 15;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                Long lOnExtraCallback = AFj1sSDK5.onExtraCallback((Unit) obj);
                int i7 = IAuthTabCallback + 113;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return lOnExtraCallback;
            }
        };
        getByteBuffer getbytebufferOnExtraCallbackWithResult = getbytebufferOnExtraCallback.asInterface(new deserializeIntNullableCollection() { // from class: im.toss.uikit.base.UiLaunchTimeProducer$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // o.deserializeIntNullableCollection
            public final Object apply(Object obj) {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 65;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                Long lOnExtraCallbackWithResult = AFj1sSDK5.onExtraCallbackWithResult(function1, obj);
                int i7 = onExtraCallback + 49;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return lOnExtraCallbackWithResult;
            }
        }).onExtraCallbackWithResult(NetConverter3.onExtraCallback());
        final Function1 function12 = new Function1() { // from class: im.toss.uikit.base.UiLaunchTimeProducer$$ExternalSyntheticLambda3
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onNavigationEvent + 77;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                AFj1sSDK5 aFj1sSDK5 = this.f$0;
                ALCFaceEmotion aLCFaceEmotion2 = aLCFaceEmotion;
                r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq2 = r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
                Long lValueOf = Long.valueOf(j2);
                int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                Unit unit = (Unit) AFj1sSDK5.onWarmupCompleted(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 140902329, new Object[]{aFj1sSDK5, aLCFaceEmotion2, r8lambdakrhaimf1bm5cgjbilhp45vln_xq2, lValueOf, (Long) obj}, -140902328, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback);
                int i7 = onNavigationEvent + 53;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 43 / 0;
                }
                return unit;
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = getbytebufferOnExtraCallbackWithResult.IAuthTabCallback(new deserializeFloat() { // from class: im.toss.uikit.base.UiLaunchTimeProducer$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // o.deserializeFloat
            public final void accept(Object obj) {
                int i4 = 2 % 2;
                int i5 = onExtraCallbackWithResult + 53;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                AFj1sSDK5.onExtraCallback(function12, obj);
                int i7 = onExtraCallbackWithResult + 99;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionIAuthTabCallback, r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        int i4 = onExtraCallback + 107;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(AFj1sSDK5 aFj1sSDK5, ALCFaceEmotion aLCFaceEmotion, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, long j, Long l) {
        return (Unit) onWarmupCompleted(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 140902329, new Object[]{aFj1sSDK5, aLCFaceEmotion, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, Long.valueOf(j), l}, -140902328, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onWarmupCompleted(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 753721046, new Object[]{function1, obj}, -753721046, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback);
    }
}
