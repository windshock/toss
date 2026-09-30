package o;

import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import o.addCustomQueryParams;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class addCustomQueryParams {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ String onExtraCallbackWithResult(Function1 function1, MatchResult matchResult) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallback = onExtraCallback(function1, matchResult);
        int i4 = onNavigationEvent + 101;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallback;
    }

    private static final String onExtraCallback(Function1 function1, MatchResult matchResult) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(matchResult, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(matchResult, "");
        String str = (String) function1.invoke(matchResult.getGroupValues());
        int i3 = onWarmupCompleted + 115;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public static final r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY onExtraCallbackWithResult(@NotNull loadNextAdForAdToken loadnextadforadtoken, @NotNull Regex regex, @NotNull final Function1<? super List<String>, String> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(loadnextadforadtoken, "");
        Intrinsics.checkNotNullParameter(regex, "");
        Intrinsics.checkNotNullParameter(function1, "");
        r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY r8lambdarbv3rxsgnvgjhknxmwmoyzieky = new r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY(loadnextadforadtoken, regex, null, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.PiiMatcherKt$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 111;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                String strOnExtraCallbackWithResult = addCustomQueryParams.onExtraCallbackWithResult(function1, (MatchResult) obj);
                int i5 = onWarmupCompleted + 105;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return strOnExtraCallbackWithResult;
            }
        }, 4, null);
        int i2 = onNavigationEvent + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return r8lambdarbv3rxsgnvgjhknxmwmoyzieky;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
    
        r7 = r2.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, "");
        r8 = o.addCustomQueryParams.onWarmupCompleted + 25;
        o.addCustomQueryParams.onNavigationEvent = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a4, code lost:
    
        if ((r8 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String onWarmupCompleted(@NotNull String str, @NotNull List<r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY> list, @NotNull Set<loadNextAdForAdToken> set) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(set, "");
        StringBuilder sb = new StringBuilder();
        int last = 0;
        while (true) {
            Object obj = null;
            if (last >= str.length()) {
                break;
            }
            int i2 = onNavigationEvent + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getStringListFromAdObject getstringlistfromadobjectOnNavigationEvent = onNavigationEvent(str, last, list);
            if (getstringlistfromadobjectOnNavigationEvent == null) {
                int i4 = onWarmupCompleted + 121;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    sb.append((CharSequence) str, last, str.length());
                    obj.hashCode();
                    throw null;
                }
                sb.append((CharSequence) str, last, str.length());
            } else {
                sb.append((CharSequence) str, last, getstringlistfromadobjectOnNavigationEvent.onExtraCallbackWithResult().onExtraCallback().getFirst());
                String str2 = (String) getstringlistfromadobjectOnNavigationEvent.onWarmupCompleted().onExtraCallbackWithResult().invoke(getstringlistfromadobjectOnNavigationEvent.onExtraCallbackWithResult());
                sb.append(str2);
                if (!Intrinsics.areEqual(str2, getstringlistfromadobjectOnNavigationEvent.onExtraCallbackWithResult().onExtraCallbackWithResult())) {
                    set.add(getstringlistfromadobjectOnNavigationEvent.onWarmupCompleted().onExtraCallback());
                }
                last = getstringlistfromadobjectOnNavigationEvent.onExtraCallbackWithResult().onExtraCallback().getLast() + 1;
            }
        }
    }

    private static final getStringListFromAdObject onNavigationEvent(String str, int i, List<r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY> list) {
        int i2 = 2 % 2;
        getStringListFromAdObject getstringlistfromadobject = null;
        for (r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY r8lambdarbv3rxsgnvgjhknxmwmoyzieky : list) {
            int i3 = onWarmupCompleted + 111;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            MatchResult matchResultOnExtraCallbackWithResult = r8lambdarbv3rxsgnvgjhknxmwmoyzieky.onNavigationEvent().onExtraCallbackWithResult(str, i);
            int i5 = onNavigationEvent + 33;
            onWarmupCompleted = i5 % 128;
            while (true) {
                int i6 = i5 % 2;
                if (matchResultOnExtraCallbackWithResult == null || (!((Boolean) r8lambdarbv3rxsgnvgjhknxmwmoyzieky.onWarmupCompleted().invoke(str, Integer.valueOf(matchResultOnExtraCallbackWithResult.onExtraCallback().getFirst()))).booleanValue())) {
                    break;
                }
                int i7 = onWarmupCompleted + 31;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                matchResultOnExtraCallbackWithResult = r8lambdarbv3rxsgnvgjhknxmwmoyzieky.onNavigationEvent().onExtraCallbackWithResult(str, matchResultOnExtraCallbackWithResult.onExtraCallback().getFirst() + 1);
                i5 = onWarmupCompleted + 39;
                onNavigationEvent = i5 % 128;
            }
            if (matchResultOnExtraCallbackWithResult != null) {
                int i9 = onNavigationEvent + 87;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                if (getstringlistfromadobject == null || matchResultOnExtraCallbackWithResult.onExtraCallback().getFirst() < getstringlistfromadobject.onExtraCallbackWithResult().onExtraCallback().getFirst()) {
                    getstringlistfromadobject = new getStringListFromAdObject(matchResultOnExtraCallbackWithResult, r8lambdarbv3rxsgnvgjhknxmwmoyzieky);
                    if (matchResultOnExtraCallbackWithResult.onExtraCallback().getFirst() == i) {
                        break;
                    }
                }
            }
        }
        return getstringlistfromadobject;
    }
}
