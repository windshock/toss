package im.toss.define;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class MobileCarrier$onNavigationEvent {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public /* synthetic */ MobileCarrier$onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MobileCarrier$onNavigationEvent() {
    }

    public final MobileCarrier onWarmupCompleted(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        MobileCarrier mobileCarrierOnWarmupCompleted = onWarmupCompleted(str);
        if (mobileCarrierOnWarmupCompleted == MobileCarrier.NONE) {
            int i2 = onWarmupCompleted + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            mobileCarrierOnWarmupCompleted = onNavigationEvent(str2);
        }
        int i4 = onNavigationEvent + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return mobileCarrierOnWarmupCompleted;
    }

    public final MobileCarrier onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        MobileCarrier mobileCarrier = MobileCarrier.SKT;
        if (Intrinsics.areEqual(MobileCarrier.access$getServerValue$p(mobileCarrier), str)) {
            int i4 = onWarmupCompleted + 69;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 50 / 0;
            }
            return mobileCarrier;
        }
        MobileCarrier mobileCarrier2 = MobileCarrier.KT;
        Object obj = null;
        if (Intrinsics.areEqual(MobileCarrier.access$getServerValue$p(mobileCarrier2), str)) {
            int i6 = onNavigationEvent;
            int i7 = i6 + 65;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            int i8 = i6 + 91;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                return mobileCarrier2;
            }
            obj.hashCode();
            throw null;
        }
        MobileCarrier mobileCarrier3 = MobileCarrier.LGU;
        if (!(!Intrinsics.areEqual(MobileCarrier.access$getServerValue$p(mobileCarrier3), str))) {
            int i9 = onWarmupCompleted + 55;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 != 0) {
                return mobileCarrier3;
            }
            obj.hashCode();
            throw null;
        }
        MobileCarrier mobileCarrier4 = MobileCarrier.SK_MVNO;
        if (!(!Intrinsics.areEqual(MobileCarrier.access$getServerValue$p(mobileCarrier4), str))) {
            return mobileCarrier4;
        }
        MobileCarrier mobileCarrier5 = MobileCarrier.KT_MVNO;
        if (Intrinsics.areEqual(MobileCarrier.access$getServerValue$p(mobileCarrier5), str)) {
            int i10 = onWarmupCompleted + 119;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            return mobileCarrier5;
        }
        MobileCarrier mobileCarrier6 = MobileCarrier.LGU_MVNO;
        if (!Intrinsics.areEqual(MobileCarrier.access$getServerValue$p(mobileCarrier6), str)) {
            return MobileCarrier.NONE;
        }
        int i12 = onNavigationEvent + 69;
        onWarmupCompleted = i12 % 128;
        int i13 = i12 % 2;
        return mobileCarrier6;
    }

    private final MobileCarrier onWarmupCompleted(String str) {
        int i = 2 % 2;
        if (str != null) {
            Object obj = null;
            if (StringsKt.endsWith$default(str, "02", false, 2, (Object) null)) {
                return MobileCarrier.KT;
            }
            if (!StringsKt.endsWith$default(str, "04", false, 2, (Object) null)) {
                if (StringsKt.endsWith$default(str, "05", false, 2, (Object) null)) {
                    return MobileCarrier.SKT;
                }
                if (StringsKt.endsWith$default(str, "06", false, 2, (Object) null)) {
                    return MobileCarrier.LGU;
                }
                if (StringsKt.endsWith$default(str, "08", false, 2, (Object) null)) {
                    return MobileCarrier.KT;
                }
                return MobileCarrier.NONE;
            }
            int i2 = onWarmupCompleted + 111;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return MobileCarrier.KT;
            }
            MobileCarrier mobileCarrier = MobileCarrier.KT;
            obj.hashCode();
            throw null;
        }
        int i3 = onNavigationEvent + 123;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return MobileCarrier.NONE;
    }

    private final MobileCarrier onNavigationEvent(String str) {
        int i = 2 % 2;
        if (str == null) {
            int i2 = onWarmupCompleted + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return MobileCarrier.NONE;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (Intrinsics.areEqual(lowerCase, "skt") || Intrinsics.areEqual(lowerCase, "sktelecom")) {
            return MobileCarrier.SKT;
        }
        if (!(!Intrinsics.areEqual(lowerCase, "kt")) || Intrinsics.areEqual(lowerCase, "olleh")) {
            return MobileCarrier.KT;
        }
        if (new Regex(".*lg.*").onExtraCallbackWithResult(lowerCase)) {
            int i4 = onWarmupCompleted + 91;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return MobileCarrier.LGU;
            }
            MobileCarrier mobileCarrier = MobileCarrier.LGU;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MobileCarrier mobileCarrier2 = MobileCarrier.NONE;
        int i5 = onWarmupCompleted + 67;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return mobileCarrier2;
    }

    public final MobileCarrier IAuthTabCallback(@NotNull String str) {
        Object next;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            MobileCarrier.getEntries().iterator();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Iterator it = MobileCarrier.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                int i3 = onWarmupCompleted + 15;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                next = it.next();
                if (Intrinsics.areEqual(((MobileCarrier) next).fullName(), str)) {
                    break;
                }
            } else {
                int i5 = onNavigationEvent + 41;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 3 % 5;
                }
                next = null;
            }
        }
        MobileCarrier mobileCarrier = (MobileCarrier) next;
        if (mobileCarrier != null) {
            return mobileCarrier;
        }
        int i7 = onWarmupCompleted + 41;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return MobileCarrier.NONE;
        }
        MobileCarrier mobileCarrier2 = MobileCarrier.NONE;
        throw null;
    }
}
