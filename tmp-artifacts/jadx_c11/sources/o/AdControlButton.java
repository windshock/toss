package o;

import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AdControlButton {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdControlButton[] $VALUES;
    public static final onWarmupCompleted Companion;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String baseURL;
    private final boolean isAirlineEnabled;
    private final getPricingPhaseList region;
    public static final AdControlButton KR = new AdControlButton("KR", 0, getPricingPhaseList.KR, zzaj.onNavigationEvent().updateVisuals(), false, 4, null);
    public static final AdControlButton AU = new AdControlButton("AU", 1, getPricingPhaseList.AU, zzaj.onNavigationEvent().prefetchWithMultipleUrls(), false);
    public static final AdControlButton EU = new AdControlButton("EU", 2, getPricingPhaseList.EU, zzaj.onNavigationEvent().ICustomTabsServiceStubProxy(), false);
    public static final AdControlButton JP = new AdControlButton("JP", 3, getPricingPhaseList.JP, zzaj.onNavigationEvent().prefetchWithMultipleUrls(), false);

    private static final /* synthetic */ AdControlButton[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return new AdControlButton[]{KR, AU, EU, JP};
        }
        AdControlButton adControlButton = KR;
        AdControlButton adControlButton2 = AU;
        AdControlButton adControlButton3 = EU;
        AdControlButton adControlButton4 = JP;
        AdControlButton[] adControlButtonArr = {adControlButton2, adControlButton};
        adControlButtonArr[2] = adControlButton3;
        adControlButtonArr[2] = adControlButton4;
        return adControlButtonArr;
    }

    public static EnumEntries<AdControlButton> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        EnumEntries<AdControlButton> enumEntries = $ENTRIES;
        int i5 = i3 + 23;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static AdControlButton valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AdControlButton adControlButton = (AdControlButton) Enum.valueOf(AdControlButton.class, str);
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        return adControlButton;
    }

    public static AdControlButton[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AdControlButton[] adControlButtonArr = (AdControlButton[]) $VALUES.clone();
        int i4 = onNavigationEvent + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return adControlButtonArr;
    }

    private AdControlButton(String str, int i, getPricingPhaseList getpricingphaselist, String str2, boolean z) {
        this.region = getpricingphaselist;
        this.baseURL = str2;
        this.isAirlineEnabled = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* synthetic */ AdControlButton(String str, int i, getPricingPhaseList getpricingphaselist, String str2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z2;
        if ((i2 & 4) != 0) {
            int i3 = onExtraCallback;
            int i4 = i3 + 33;
            onNavigationEvent = i4 % 128;
            boolean z3 = i4 % 2 != 0;
            int i5 = i3 + 57;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            z2 = z3;
        } else {
            z2 = z;
        }
        this(str, i, getpricingphaselist, str2, z2);
    }

    public final String getBaseURL() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.baseURL;
        }
        throw null;
    }

    public final getPricingPhaseList getRegion() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        getPricingPhaseList getpricingphaselist = this.region;
        int i5 = i2 + 73;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return getpricingphaselist;
    }

    public final boolean isAirlineEnabled() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.isAirlineEnabled;
        int i4 = i3 + 49;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    static {
        AdControlButton[] adControlButtonArr$values = $values();
        $VALUES = adControlButtonArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(adControlButtonArr$values);
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        int i = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final AdControlButton onNavigationEvent(@NotNull getPricingPhaseList getpricingphaselist) {
            Object next;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(getpricingphaselist, "");
            Iterator it = AdControlButton.getEntries().iterator();
            int i4 = onNavigationEvent + 119;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                int i6 = IAuthTabCallback + 21;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                next = it.next();
                if (((AdControlButton) next).getRegion() == getpricingphaselist) {
                    break;
                }
            }
            AdControlButton adControlButton = (AdControlButton) next;
            if (adControlButton != null) {
                return adControlButton;
            }
            throw new IllegalArgumentException("Cannot match exact region: " + getpricingphaselist);
        }
    }
}
