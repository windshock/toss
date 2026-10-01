package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import o.r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY {
    private static int onExtraCallback = 0;
    private static int onTransact = 1;
    private final loadNextAdForAdToken IAuthTabCallback;
    private final Function2<String, Integer, Boolean> onExtraCallbackWithResult;
    private final Regex onNavigationEvent;
    private final Function1<MatchResult, String> onWarmupCompleted;

    public static /* synthetic */ boolean onExtraCallback(String str, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 43;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(str, i);
        if (i4 != 0) {
            int i5 = 45 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    private static final boolean onExtraCallbackWithResult(String str, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 109;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int i5 = onExtraCallback + 43;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY(@NotNull loadNextAdForAdToken loadnextadforadtoken, @NotNull Regex regex, @NotNull Function2<? super String, ? super Integer, Boolean> function2, @NotNull Function1<? super MatchResult, String> function1) {
        Intrinsics.checkNotNullParameter(loadnextadforadtoken, "");
        Intrinsics.checkNotNullParameter(regex, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.IAuthTabCallback = loadnextadforadtoken;
        this.onNavigationEvent = regex;
        this.onExtraCallbackWithResult = function2;
        this.onWarmupCompleted = function1;
    }

    public final loadNextAdForAdToken onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        loadNextAdForAdToken loadnextadforadtoken = this.IAuthTabCallback;
        int i5 = i3 + 73;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return loadnextadforadtoken;
    }

    public final Regex onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        Regex regex = this.onNavigationEvent;
        int i5 = i3 + 99;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return regex;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY(loadNextAdForAdToken loadnextadforadtoken, Regex regex, Function2 function2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            function2 = new Function2() { // from class: im.toss.splittarget.impl.analytics.toss.PiiMatcher$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 79;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Boolean boolValueOf = Boolean.valueOf(r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY.onExtraCallback((String) obj, ((Integer) obj2).intValue()));
                    int i5 = IAuthTabCallback + 81;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        return boolValueOf;
                    }
                    throw null;
                }
            };
            int i2 = onExtraCallback + 5;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        this(loadnextadforadtoken, regex, function2, function1);
    }

    public final Function2<String, Integer, Boolean> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 55;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Function2<String, Integer, Boolean> function2 = this.onExtraCallbackWithResult;
        int i4 = i2 + 5;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return function2;
        }
        obj.hashCode();
        throw null;
    }

    public final Function1<MatchResult, String> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        throw null;
    }
}
