package im.toss.features.home.core.remote.model.dst.widget;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import o.access15300;
import o.pushWebview;
import o.safelyFillForConcurrentMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class HomeListRowAttributeResponse$onExtraCallback implements safelyFillForConcurrentMap<pushWebview.onExtraCallbackWithResult> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HomeListRowAttributeResponse$onExtraCallback[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final HomeListRowAttributeResponse$onExtraCallback NONE = new HomeListRowAttributeResponse$onExtraCallback("NONE", 0);
    public static final HomeListRowAttributeResponse$onExtraCallback CENTER = new HomeListRowAttributeResponse$onExtraCallback("CENTER", 1);

    private static final /* synthetic */ HomeListRowAttributeResponse$onExtraCallback[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 23;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        HomeListRowAttributeResponse$onExtraCallback[] homeListRowAttributeResponse$onExtraCallbackArr = {NONE, CENTER};
        int i5 = i2 + 69;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return homeListRowAttributeResponse$onExtraCallbackArr;
    }

    public static EnumEntries<HomeListRowAttributeResponse$onExtraCallback> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<HomeListRowAttributeResponse$onExtraCallback> enumEntries = $ENTRIES;
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        return enumEntries;
    }

    public static HomeListRowAttributeResponse$onExtraCallback valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        HomeListRowAttributeResponse$onExtraCallback homeListRowAttributeResponse$onExtraCallback = (HomeListRowAttributeResponse$onExtraCallback) Enum.valueOf(HomeListRowAttributeResponse$onExtraCallback.class, str);
        if (i3 != 0) {
            return homeListRowAttributeResponse$onExtraCallback;
        }
        throw null;
    }

    public static HomeListRowAttributeResponse$onExtraCallback[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        HomeListRowAttributeResponse$onExtraCallback[] homeListRowAttributeResponse$onExtraCallbackArr = $VALUES;
        if (i3 == 0) {
            return (HomeListRowAttributeResponse$onExtraCallback[]) homeListRowAttributeResponse$onExtraCallbackArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private HomeListRowAttributeResponse$onExtraCallback(String str, int i) {
    }

    public /* bridge */ /* synthetic */ Object toDto() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        pushWebview.onExtraCallbackWithResult onextracallbackwithresultM599toDto = m599toDto();
        int i4 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return onextracallbackwithresultM599toDto;
    }

    static {
        HomeListRowAttributeResponse$onExtraCallback[] homeListRowAttributeResponse$onExtraCallbackArr$values = $values();
        $VALUES = homeListRowAttributeResponse$onExtraCallbackArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(homeListRowAttributeResponse$onExtraCallbackArr$values);
        int i = IAuthTabCallback + 115;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 68 / 0;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* renamed from: toDto, reason: collision with other method in class */
    public pushWebview.onExtraCallbackWithResult m599toDto() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted.onExtraCallback[ordinal()];
        if (i2 == 1) {
            pushWebview.onExtraCallbackWithResult onextracallbackwithresult = pushWebview.onExtraCallbackWithResult.NONE;
            int i3 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return onextracallbackwithresult;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i5 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return pushWebview.onExtraCallbackWithResult.CENTER;
    }
}
