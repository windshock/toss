package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DefaultMediaViewVideoRendererApi {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DefaultMediaViewVideoRendererApi[] $VALUES;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final DefaultMediaViewVideoRendererApi SUBSCRIBE = new DefaultMediaViewVideoRendererApi("SUBSCRIBE", 0);
    public static final DefaultMediaViewVideoRendererApi UNSUBSCRIBE = new DefaultMediaViewVideoRendererApi("UNSUBSCRIBE", 1);
    public static final DefaultMediaViewVideoRendererApi NOT_SUPPORT = new DefaultMediaViewVideoRendererApi("NOT_SUPPORT", 2);

    private static final /* synthetic */ DefaultMediaViewVideoRendererApi[] $values() {
        DefaultMediaViewVideoRendererApi[] defaultMediaViewVideoRendererApiArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 9;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            defaultMediaViewVideoRendererApiArr = new DefaultMediaViewVideoRendererApi[]{SUBSCRIBE, UNSUBSCRIBE};
            defaultMediaViewVideoRendererApiArr[2] = NOT_SUPPORT;
        } else {
            defaultMediaViewVideoRendererApiArr = new DefaultMediaViewVideoRendererApi[]{SUBSCRIBE, UNSUBSCRIBE, NOT_SUPPORT};
        }
        int i4 = i2 + 27;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return defaultMediaViewVideoRendererApiArr;
    }

    public static EnumEntries<DefaultMediaViewVideoRendererApi> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<DefaultMediaViewVideoRendererApi> enumEntries = $ENTRIES;
        int i5 = i3 + 17;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 37 / 0;
        }
        return enumEntries;
    }

    public static DefaultMediaViewVideoRendererApi valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        DefaultMediaViewVideoRendererApi defaultMediaViewVideoRendererApi = (DefaultMediaViewVideoRendererApi) Enum.valueOf(DefaultMediaViewVideoRendererApi.class, str);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 111;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return defaultMediaViewVideoRendererApi;
    }

    public static DefaultMediaViewVideoRendererApi[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        DefaultMediaViewVideoRendererApi[] defaultMediaViewVideoRendererApiArr = (DefaultMediaViewVideoRendererApi[]) $VALUES.clone();
        int i4 = onNavigationEvent + 65;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return defaultMediaViewVideoRendererApiArr;
    }

    private DefaultMediaViewVideoRendererApi(String str, int i) {
    }

    static {
        DefaultMediaViewVideoRendererApi[] defaultMediaViewVideoRendererApiArr$values = $values();
        $VALUES = defaultMediaViewVideoRendererApiArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(defaultMediaViewVideoRendererApiArr$values);
        int i = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }
}
