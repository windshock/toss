package o;

import kotlin.enums.EnumEntries;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class populateMuteImage {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public static final populateMuteImage onExtraCallbackWithResult = new populateMuteImage();

    static {
        int i = IAuthTabCallback + 43;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private populateMuteImage() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        public static final onExtraCallbackWithResult Bold;
        private static int IAuthTabCallback = 1;
        public static final onExtraCallbackWithResult Light;
        public static final onExtraCallbackWithResult Normal;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final float height;
        private final float radius;

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            onExtraCallbackWithResult[] onextracallbackwithresultArr;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 15;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallbackWithResult onextracallbackwithresult = Light;
                onExtraCallbackWithResult onextracallbackwithresult2 = Normal;
                onExtraCallbackWithResult onextracallbackwithresult3 = Bold;
                onextracallbackwithresultArr = new onExtraCallbackWithResult[4];
                onextracallbackwithresultArr[1] = onextracallbackwithresult;
                onextracallbackwithresultArr[0] = onextracallbackwithresult2;
                onextracallbackwithresultArr[3] = onextracallbackwithresult3;
            } else {
                onextracallbackwithresultArr = new onExtraCallbackWithResult[]{Light, Normal, Bold};
            }
            int i4 = i2 + 59;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            if (i3 == 0) {
                int i4 = 14 / 0;
            }
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            int i4 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i3 = onExtraCallbackWithResult + 79;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return onextracallbackwithresultArr;
        }

        private onExtraCallbackWithResult(String str, int i, float f, float f2) {
            this.height = f;
            this.radius = f2;
        }

        /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
        public final float m95getHeightD9Ej5fM() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 61;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            float f = this.height;
            int i5 = i2 + 47;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return f;
            }
            throw null;
        }

        /* renamed from: getRadius-D9Ej5fM, reason: not valid java name */
        public final float m96getRadiusD9Ej5fM() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            float f = this.radius;
            if (i3 != 0) {
                int i4 = 44 / 0;
            }
            return f;
        }

        static {
            MaxRewardedAdListener maxRewardedAdListener = MaxRewardedAdListener.IAuthTabCallback;
            float fIAuthTabCallback = maxRewardedAdListener.IAuthTabCallback();
            AppLovinAdSize appLovinAdSize = AppLovinAdSize.onWarmupCompleted;
            Light = new onExtraCallbackWithResult("Light", 0, fIAuthTabCallback, appLovinAdSize.IAuthTabCallback());
            Normal = new onExtraCallbackWithResult("Normal", 1, maxRewardedAdListener.onWarmupCompleted(), appLovinAdSize.IAuthTabCallback());
            Bold = new onExtraCallbackWithResult("Bold", 2, maxRewardedAdListener.onExtraCallbackWithResult(), appLovinAdSize.IAuthTabCallback());
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onWarmupCompleted + 47;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 65 / 0;
            }
        }
    }
}
