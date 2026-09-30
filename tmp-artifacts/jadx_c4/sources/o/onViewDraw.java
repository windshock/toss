package o;

import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onViewDraw {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ onViewDraw[] $VALUES;
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final long termsId;
    public static final onViewDraw Marketing = new onViewDraw("Marketing", 0, 20000110);
    public static final onViewDraw Analytics = new onViewDraw("Analytics", 1, 20000113);

    private static final /* synthetic */ onViewDraw[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onViewDraw onviewdraw = Marketing;
        if (i3 == 0) {
            return new onViewDraw[]{onviewdraw, Analytics};
        }
        onViewDraw onviewdraw2 = Analytics;
        onViewDraw[] onviewdrawArr = new onViewDraw[5];
        onviewdrawArr[1] = onviewdraw;
        onviewdrawArr[0] = onviewdraw2;
        return onviewdrawArr;
    }

    public static EnumEntries<onViewDraw> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<onViewDraw> enumEntries = $ENTRIES;
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        return enumEntries;
    }

    public static onViewDraw valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onViewDraw onviewdraw = (onViewDraw) Enum.valueOf(onViewDraw.class, str);
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
        int i5 = onNavigationEvent + 41;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
        return onviewdraw;
    }

    public static onViewDraw[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onViewDraw[] onviewdrawArr = $VALUES;
        if (i3 != 0) {
            return (onViewDraw[]) onviewdrawArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private onViewDraw(String str, int i, long j) {
        this.termsId = j;
    }

    public final long getTermsId() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        long j = this.termsId;
        int i5 = i3 + 15;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    static {
        onViewDraw[] onviewdrawArr$values = $values();
        $VALUES = onviewdrawArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(onviewdrawArr$values);
        Companion = new onNavigationEvent(null);
        int i = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final onViewDraw IAuthTabCallback(long j) {
            Object next;
            int i = 2 % 2;
            Iterator it = onViewDraw.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    int i2 = onWarmupCompleted + 91;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    next = null;
                    break;
                }
                next = it.next();
                if (((onViewDraw) next).getTermsId() == j) {
                    break;
                }
            }
            onViewDraw onviewdraw = (onViewDraw) next;
            int i4 = onWarmupCompleted + 69;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 32 / 0;
            }
            return onviewdraw;
        }
    }
}
