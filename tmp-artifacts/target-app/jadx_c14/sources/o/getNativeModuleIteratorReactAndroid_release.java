package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getNativeModuleIteratorReactAndroid_release {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getNativeModuleIteratorReactAndroid_release[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final allowsInstagramAppAuth cardImage;
    private final String korName;
    public static final getNativeModuleIteratorReactAndroid_release SKY = new getNativeModuleIteratorReactAndroid_release("SKY", 0, "스카이", allowsInstagramAppAuth.SKY);
    public static final getNativeModuleIteratorReactAndroid_release PINK = new getNativeModuleIteratorReactAndroid_release("PINK", 1, "핑크", allowsInstagramAppAuth.PINK);
    public static final getNativeModuleIteratorReactAndroid_release SNOW = new getNativeModuleIteratorReactAndroid_release("SNOW", 2, "스노우", allowsInstagramAppAuth.SNOW);
    public static final getNativeModuleIteratorReactAndroid_release CLEAR_WHITE = new getNativeModuleIteratorReactAndroid_release("CLEAR_WHITE", 3, "더스트 화이트", allowsInstagramAppAuth.CLEAR_WHITE);
    public static final getNativeModuleIteratorReactAndroid_release CLEAR_BLACK = new getNativeModuleIteratorReactAndroid_release("CLEAR_BLACK", 4, "더스트 블랙", allowsInstagramAppAuth.CLEAR_BLACK);
    public static final getNativeModuleIteratorReactAndroid_release NEON_GREEN = new getNativeModuleIteratorReactAndroid_release("NEON_GREEN", 5, "네온 그린", allowsInstagramAppAuth.NEON_GREEN);
    public static final getNativeModuleIteratorReactAndroid_release WHITE = new getNativeModuleIteratorReactAndroid_release("WHITE", 6, "화이트", allowsInstagramAppAuth.WHITE);
    public static final getNativeModuleIteratorReactAndroid_release BLACK = new getNativeModuleIteratorReactAndroid_release("BLACK", 7, "블랙", allowsInstagramAppAuth.BLACK);
    public static final getNativeModuleIteratorReactAndroid_release BORA = new getNativeModuleIteratorReactAndroid_release("BORA", 8, "보라", allowsInstagramAppAuth.BORA);
    public static final getNativeModuleIteratorReactAndroid_release MINT = new getNativeModuleIteratorReactAndroid_release("MINT", 9, "민트", allowsInstagramAppAuth.MINT);
    public static final getNativeModuleIteratorReactAndroid_release HOLO = new getNativeModuleIteratorReactAndroid_release("HOLO", 10, "홀로", allowsInstagramAppAuth.HOLO);

    private static final /* synthetic */ getNativeModuleIteratorReactAndroid_release[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 83;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        getNativeModuleIteratorReactAndroid_release[] getnativemoduleiteratorreactandroid_releaseArr = {SKY, PINK, SNOW, CLEAR_WHITE, CLEAR_BLACK, NEON_GREEN, WHITE, BLACK, BORA, MINT, HOLO};
        int i5 = i2 + 47;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 23 / 0;
        }
        return getnativemoduleiteratorreactandroid_releaseArr;
    }

    public static EnumEntries<getNativeModuleIteratorReactAndroid_release> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 25;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<getNativeModuleIteratorReactAndroid_release> enumEntries = $ENTRIES;
        int i5 = i2 + 125;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static getNativeModuleIteratorReactAndroid_release valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getNativeModuleIteratorReactAndroid_release getnativemoduleiteratorreactandroid_release = (getNativeModuleIteratorReactAndroid_release) Enum.valueOf(getNativeModuleIteratorReactAndroid_release.class, str);
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        int i5 = onExtraCallback + 13;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return getnativemoduleiteratorreactandroid_release;
    }

    public static getNativeModuleIteratorReactAndroid_release[] values() {
        getNativeModuleIteratorReactAndroid_release[] getnativemoduleiteratorreactandroid_releaseArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            getnativemoduleiteratorreactandroid_releaseArr = (getNativeModuleIteratorReactAndroid_release[]) $VALUES.clone();
            int i3 = 54 / 0;
        } else {
            getnativemoduleiteratorreactandroid_releaseArr = (getNativeModuleIteratorReactAndroid_release[]) $VALUES.clone();
        }
        int i4 = onExtraCallback + 125;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return getnativemoduleiteratorreactandroid_releaseArr;
    }

    private getNativeModuleIteratorReactAndroid_release(String str, int i, String str2, allowsInstagramAppAuth allowsinstagramappauth) {
        this.korName = str2;
        this.cardImage = allowsinstagramappauth;
    }

    public final allowsInstagramAppAuth getCardImage() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        allowsInstagramAppAuth allowsinstagramappauth = this.cardImage;
        int i4 = i3 + 123;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return allowsinstagramappauth;
    }

    public final String getKorName() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 15;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.korName;
        int i5 = i2 + 85;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        getNativeModuleIteratorReactAndroid_release[] getnativemoduleiteratorreactandroid_releaseArr$values = $values();
        $VALUES = getnativemoduleiteratorreactandroid_releaseArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getnativemoduleiteratorreactandroid_releaseArr$values);
        int i = IAuthTabCallback + 15;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
