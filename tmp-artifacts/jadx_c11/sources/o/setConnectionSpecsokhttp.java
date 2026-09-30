package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.getDelegateokhttp;
import o.pin;
import o.setConnectionSpecsokhttp;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setConnectionSpecsokhttp {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ float onNavigationEvent(pin pinVar) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float fOnExtraCallback = onExtraCallback(pinVar);
        int i4 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return fOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ getDelegateokhttp onWarmupCompleted(Function1 function1, float f, getDelegateokhttp getdelegateokhttp, getDelegateokhttp getdelegateokhttp2, Context context, float f2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getDelegateokhttp getdelegateokhttpOnNavigationEvent = onNavigationEvent(function1, f, getdelegateokhttp, getdelegateokhttp2, context, f2);
        int i4 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return getdelegateokhttpOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ setDnsokhttp IAuthTabCallback(Function1 function1, float f, getDelegateokhttp getdelegateokhttp, getDelegateokhttp getdelegateokhttp2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.view.component.atom.text.style.TdsWordBreakStrategyResolverKt$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2) throws NoWhenBranchMatchedException {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 121;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    float fOnNavigationEvent = setConnectionSpecsokhttp.onNavigationEvent((pin) obj2);
                    if (i6 != 0) {
                        return Float.valueOf(fOnNavigationEvent);
                    }
                    Float.valueOf(fOnNavigationEvent);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            };
        }
        if ((i & 2) != 0) {
            f = Float.MAX_VALUE;
        }
        if ((i & 4) != 0) {
            int i4 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                getDelegateokhttp.Companion.onExtraCallback();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            getdelegateokhttp = getDelegateokhttp.Companion.onExtraCallback();
        }
        if ((i & 8) != 0) {
            getdelegateokhttp2 = getDelegateokhttp.Companion.onNavigationEvent();
        }
        setDnsokhttp setdnsokhttpIAuthTabCallback = IAuthTabCallback(function1, f, getdelegateokhttp, getdelegateokhttp2);
        int i5 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return setdnsokhttpIAuthTabCallback;
    }

    private static final float onExtraCallback(pin pinVar) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pinVar, "");
        float fOnNavigationEvent = CipherSuiteCompanionORDER_BY_NAME1.onNavigationEvent(pinVar);
        int i4 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    public static final setDnsokhttp IAuthTabCallback(@NotNull final Function1<? super pin, Float> function1, final float f, @NotNull final getDelegateokhttp getdelegateokhttp, @NotNull final getDelegateokhttp getdelegateokhttp2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(getdelegateokhttp, "");
        Intrinsics.checkNotNullParameter(getdelegateokhttp2, "");
        setDnsokhttp setdnsokhttp = new setDnsokhttp() { // from class: im.toss.tds.view.component.atom.text.style.TdsWordBreakStrategyResolverKt$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // o.setDnsokhttp
            public final getDelegateokhttp resolve(Context context, float f2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 41;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return setConnectionSpecsokhttp.onWarmupCompleted(function1, f, getdelegateokhttp2, getdelegateokhttp, context, f2);
                }
                setConnectionSpecsokhttp.onWarmupCompleted(function1, f, getdelegateokhttp2, getdelegateokhttp, context, f2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        int i2 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 48 / 0;
        }
        return setdnsokhttp;
    }

    private static final getDelegateokhttp onNavigationEvent(Function1 function1, float f, getDelegateokhttp getdelegateokhttp, getDelegateokhttp getdelegateokhttp2, Context context, float f2) {
        float f3;
        Configuration configuration;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Resources resources = context.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            f3 = 1.0f;
        } else {
            f3 = configuration.fontScale;
            int i4 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        Configuration configuration2 = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        return (f3 >= ((Number) function1.invoke(readIntokhttp.onNavigationEvent(configuration2))).floatValue() || f2 > ((float) varyMatches.IAuthTabCallback(Float.valueOf(f), context))) ? getdelegateokhttp : getdelegateokhttp2;
    }
}
