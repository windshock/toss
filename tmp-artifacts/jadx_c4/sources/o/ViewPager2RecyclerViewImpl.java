package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ViewPager2RecyclerViewImpl {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ViewPager2RecyclerViewImpl[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final ViewPager2RecyclerViewImpl CUSTOM = new ViewPager2RecyclerViewImpl("CUSTOM", 0);
    public static final ViewPager2RecyclerViewImpl TEMPLATE = new ViewPager2RecyclerViewImpl("TEMPLATE", 1);
    public static final ViewPager2RecyclerViewImpl TURNKEY = new ViewPager2RecyclerViewImpl("TURNKEY", 2);

    private static final /* synthetic */ ViewPager2RecyclerViewImpl[] $values() {
        ViewPager2RecyclerViewImpl[] viewPager2RecyclerViewImplArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            ViewPager2RecyclerViewImpl viewPager2RecyclerViewImpl = CUSTOM;
            ViewPager2RecyclerViewImpl viewPager2RecyclerViewImpl2 = TEMPLATE;
            ViewPager2RecyclerViewImpl viewPager2RecyclerViewImpl3 = TURNKEY;
            viewPager2RecyclerViewImplArr = new ViewPager2RecyclerViewImpl[5];
            viewPager2RecyclerViewImplArr[1] = viewPager2RecyclerViewImpl;
            viewPager2RecyclerViewImplArr[1] = viewPager2RecyclerViewImpl2;
            viewPager2RecyclerViewImplArr[2] = viewPager2RecyclerViewImpl3;
        } else {
            viewPager2RecyclerViewImplArr = new ViewPager2RecyclerViewImpl[]{CUSTOM, TEMPLATE, TURNKEY};
        }
        int i4 = i3 + 69;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return viewPager2RecyclerViewImplArr;
    }

    public static EnumEntries<ViewPager2RecyclerViewImpl> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ViewPager2RecyclerViewImpl valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ViewPager2RecyclerViewImpl viewPager2RecyclerViewImpl = (ViewPager2RecyclerViewImpl) Enum.valueOf(ViewPager2RecyclerViewImpl.class, str);
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
        int i5 = onExtraCallback + 23;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return viewPager2RecyclerViewImpl;
        }
        throw null;
    }

    public static ViewPager2RecyclerViewImpl[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ViewPager2RecyclerViewImpl[] viewPager2RecyclerViewImplArr = (ViewPager2RecyclerViewImpl[]) $VALUES.clone();
        int i4 = onExtraCallback + 101;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return viewPager2RecyclerViewImplArr;
    }

    private ViewPager2RecyclerViewImpl(String str, int i) {
    }

    static {
        ViewPager2RecyclerViewImpl[] viewPager2RecyclerViewImplArr$values = $values();
        $VALUES = viewPager2RecyclerViewImplArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(viewPager2RecyclerViewImplArr$values);
        int i = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
