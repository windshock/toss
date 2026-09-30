package o;

import android.content.Context;
import android.content.res.Resources;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AlignFaceImage {
    private static final onExtraCallback Companion = new onExtraCallback(null);
    private static final Set<Character> IAuthTabCallback = clearFaultAdjacentMetadata.onExtraCallback(new Character[]{':', '.'});
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final String onWarmupCompleted(long j, @NotNull Resources resources) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(resources, "");
        String strOnNavigationEvent = onNavigationEvent(j, PageExitListener.onExtraCallbackWithResult(resources));
        int i5 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return strOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted(long j, @NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        String strOnWarmupCompleted = onWarmupCompleted(j, resources);
        int i5 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return strOnWarmupCompleted;
    }

    public final String onNavigationEvent(long j, @NotNull Locale locale) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(locale, "");
        long jIAuthTabCallbackStubProxy = setLogBuffers.IAuthTabCallbackStubProxy(j);
        String strOnExtraCallback = onExtraCallback(locale);
        String str = String.format(locale, "%02d%s%02d%s%02d", Arrays.copyOf(new Object[]{Long.valueOf(jIAuthTabCallbackStubProxy / 3600), strOnExtraCallback, Long.valueOf((jIAuthTabCallbackStubProxy % 3600) / 60), strOnExtraCallback, Long.valueOf(jIAuthTabCallbackStubProxy % 60)}, 5));
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i5 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private final String onExtraCallback(Locale locale) {
        Character chValueOf;
        String strValueOf;
        int i2 = 2 % 2;
        String strIAuthTabCallback = EstimateAgeAndGender.onWarmupCompleted.IAuthTabCallback("Hms", locale);
        int i3 = 0;
        while (true) {
            if (i3 >= strIAuthTabCallback.length()) {
                chValueOf = null;
                break;
            }
            int i4 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            char cCharAt = strIAuthTabCallback.charAt(i3);
            if (IAuthTabCallback.contains(Character.valueOf(cCharAt))) {
                int i6 = onNavigationEvent + 39;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                chValueOf = Character.valueOf(cCharAt);
                break;
            }
            i3++;
        }
        if (chValueOf == null || (strValueOf = String.valueOf(chValueOf.charValue())) == null) {
            return ":";
        }
        int i8 = onExtraCallbackWithResult;
        int i9 = i8 + 73;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        int i11 = i8 + 31;
        onNavigationEvent = i11 % 128;
        int i12 = i11 % 2;
        return strValueOf;
    }

    static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    static {
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
