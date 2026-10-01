package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getImsiOperator$onNavigationEvent extends getImsiOperator<String> {
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackDefault = 1;
    public static final getImsiOperator$onNavigationEvent onExtraCallback = new getImsiOperator$onNavigationEvent();
    public static final int onExtraCallbackWithResult = 8;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 97;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 89;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof getImsiOperator$onNavigationEvent) {
            return true;
        }
        int i7 = i3 + 7;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return -1498260707;
        }
        int i3 = 61 / 0;
        return -1498260707;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 125;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 8 / 0;
        }
        int i5 = i2 + 21;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return "GlobalBenefitCardsApi";
    }

    private getImsiOperator$onNavigationEvent() {
        super("benefitTab.global.cards.api", "V1", (DefaultConstructorMarker) null);
    }
}
