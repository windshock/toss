package o;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCFeatureMatch implements Comparable<ALCFeatureMatch> {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String onExtraCallback;

    static {
        int i = IAuthTabCallback + 113;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 51;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ALCFeatureMatch) {
            return Intrinsics.areEqual(this.onExtraCallback, ((ALCFeatureMatch) obj).onExtraCallback);
        }
        int i5 = i2 + 59;
        onExtraCallbackWithResult = i5 % 128;
        return i5 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallback.hashCode();
        int i4 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Version(versionName=" + this.onExtraCallback + ")";
        int i2 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public ALCFeatureMatch(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallback = str;
    }

    public static final /* synthetic */ String IAuthTabCallback(ALCFeatureMatch aLCFeatureMatch) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = aLCFeatureMatch.onExtraCallback;
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        return str;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(ALCFeatureMatch aLCFeatureMatch) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(aLCFeatureMatch);
        int i4 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return iOnExtraCallbackWithResult;
        }
        throw null;
    }

    public int onExtraCallbackWithResult(@NotNull ALCFeatureMatch aLCFeatureMatch) {
        int iIntValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aLCFeatureMatch, "");
        onExtraCallbackWithResult onextracallbackwithresult = Companion;
        List listOnExtraCallback = onExtraCallbackWithResult.onExtraCallback(onextracallbackwithresult, this);
        List listOnExtraCallback2 = onExtraCallbackWithResult.onExtraCallback(onextracallbackwithresult, aLCFeatureMatch);
        int iMin = Math.min(listOnExtraCallback.size(), listOnExtraCallback2.size());
        for (int i2 = 0; i2 < iMin; i2++) {
            int i3 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Integer intOrNull = StringsKt.toIntOrNull((String) listOnExtraCallback.get(i2));
            int iIntValue2 = -1;
            if (intOrNull != null) {
                int i5 = onNavigationEvent + 105;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    intOrNull.intValue();
                    throw null;
                }
                iIntValue = intOrNull.intValue();
            } else {
                iIntValue = -1;
            }
            Integer intOrNull2 = StringsKt.toIntOrNull((String) listOnExtraCallback2.get(i2));
            if (intOrNull2 != null) {
                iIntValue2 = intOrNull2.intValue();
                int i6 = onExtraCallbackWithResult + 77;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            Integer numValueOf = Integer.valueOf(Intrinsics.compare(iIntValue, iIntValue2));
            Integer num = numValueOf.intValue() != 0 ? numValueOf : null;
            if (num != null) {
                return num.intValue();
            }
        }
        return Intrinsics.compare(listOnExtraCallback.size(), listOnExtraCallback2.size());
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public static final /* synthetic */ List onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, ALCFeatureMatch aLCFeatureMatch) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            List<String> listOnExtraCallback = onextracallbackwithresult.onExtraCallback(aLCFeatureMatch);
            int i4 = onExtraCallback + 87;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return listOnExtraCallback;
            }
            throw null;
        }

        private final List<String> onExtraCallback(ALCFeatureMatch aLCFeatureMatch) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String strIAuthTabCallback = ALCFeatureMatch.IAuthTabCallback(aLCFeatureMatch);
            int length = strIAuthTabCallback.length();
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    if (strIAuthTabCallback.charAt(i4) != '-') {
                        i4++;
                        int i5 = onExtraCallbackWithResult + 29;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                    } else {
                        strIAuthTabCallback = strIAuthTabCallback.substring(0, i4);
                        Intrinsics.checkNotNullExpressionValue(strIAuthTabCallback, "");
                        break;
                    }
                } else {
                    break;
                }
            }
            return StringsKt.split$default(strIAuthTabCallback, new char[]{'.'}, false, 0, 6, (Object) null);
        }
    }
}
