package im.toss.features.home.core.local.model.dst.widget;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import o.access15300;
import o.pushWebview;
import o.safelyFillForConcurrentMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class HomeListRowAttributeLocal$onExtraCallback implements safelyFillForConcurrentMap<pushWebview.onExtraCallbackWithResult> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HomeListRowAttributeLocal$onExtraCallback[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final HomeListRowAttributeLocal$onExtraCallback NONE = new HomeListRowAttributeLocal$onExtraCallback("NONE", 0);
    public static final HomeListRowAttributeLocal$onExtraCallback CENTER = new HomeListRowAttributeLocal$onExtraCallback("CENTER", 1);

    private static final /* synthetic */ HomeListRowAttributeLocal$onExtraCallback[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        HomeListRowAttributeLocal$onExtraCallback[] homeListRowAttributeLocal$onExtraCallbackArr = {NONE, CENTER};
        int i5 = i3 + 35;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return homeListRowAttributeLocal$onExtraCallbackArr;
    }

    public static EnumEntries<HomeListRowAttributeLocal$onExtraCallback> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<HomeListRowAttributeLocal$onExtraCallback> enumEntries = $ENTRIES;
        int i5 = i3 + 11;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static HomeListRowAttributeLocal$onExtraCallback valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeListRowAttributeLocal$onExtraCallback homeListRowAttributeLocal$onExtraCallback = (HomeListRowAttributeLocal$onExtraCallback) Enum.valueOf(HomeListRowAttributeLocal$onExtraCallback.class, str);
        int i4 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return homeListRowAttributeLocal$onExtraCallback;
    }

    public static HomeListRowAttributeLocal$onExtraCallback[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeListRowAttributeLocal$onExtraCallback[] homeListRowAttributeLocal$onExtraCallbackArr = $VALUES;
        if (i3 != 0) {
            return (HomeListRowAttributeLocal$onExtraCallback[]) homeListRowAttributeLocal$onExtraCallbackArr.clone();
        }
        int i4 = 12 / 0;
        return (HomeListRowAttributeLocal$onExtraCallback[]) homeListRowAttributeLocal$onExtraCallbackArr.clone();
    }

    private HomeListRowAttributeLocal$onExtraCallback(String str, int i) {
    }

    public /* bridge */ /* synthetic */ Object toDto() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            m503toDto();
            throw null;
        }
        pushWebview.onExtraCallbackWithResult onextracallbackwithresultM503toDto = m503toDto();
        int i3 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return onextracallbackwithresultM503toDto;
    }

    static {
        HomeListRowAttributeLocal$onExtraCallback[] homeListRowAttributeLocal$onExtraCallbackArr$values = $values();
        $VALUES = homeListRowAttributeLocal$onExtraCallbackArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(homeListRowAttributeLocal$onExtraCallbackArr$values);
        int i = onExtraCallback + 89;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* renamed from: toDto, reason: collision with other method in class */
    public pushWebview.onExtraCallbackWithResult m503toDto() throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0 ? (i = onExtraCallback.onNavigationEvent[ordinal()]) != 1 : (i = onExtraCallback.onNavigationEvent[ordinal()]) != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return pushWebview.onExtraCallbackWithResult.CENTER;
        }
        pushWebview.onExtraCallbackWithResult onextracallbackwithresult = pushWebview.onExtraCallbackWithResult.NONE;
        int i4 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return onextracallbackwithresult;
    }
}
