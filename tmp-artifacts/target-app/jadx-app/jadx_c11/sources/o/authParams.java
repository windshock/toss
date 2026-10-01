package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class authParams {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ authParams[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final authParams BackgroundDefault = new authParams("BackgroundDefault", 0);
    public static final authParams BackgroundDim = new authParams("BackgroundDim", 1);
    public static final authParams BackgroundFloated100 = new authParams("BackgroundFloated100", 2);
    public static final authParams BackgroundFloated200 = new authParams("BackgroundFloated200", 3);
    public static final authParams BackgroundLower = new authParams("BackgroundLower", 4);
    public static final authParams BackgroundUpper = new authParams("BackgroundUpper", 5);
    public static final authParams BorderDefault = new authParams("BorderDefault", 6);
    public static final authParams BorderFocusRingInner = new authParams("BorderFocusRingInner", 7);
    public static final authParams BorderFocusRingOuter = new authParams("BorderFocusRingOuter", 8);
    public static final authParams FillBrand = new authParams("FillBrand", 9);
    public static final authParams FillBrandClearHover = new authParams("FillBrandClearHover", 10);
    public static final authParams FillBrandHover = new authParams("FillBrandHover", 11);
    public static final authParams FillBrandWeak = new authParams("FillBrandWeak", 12);
    public static final authParams FillBrandWeakHover = new authParams("FillBrandWeakHover", 13);
    public static final authParams FillDanger = new authParams("FillDanger", 14);
    public static final authParams FillDangerClearHover = new authParams("FillDangerClearHover", 15);
    public static final authParams FillDangerHover = new authParams("FillDangerHover", 16);
    public static final authParams FillDangerWeak = new authParams("FillDangerWeak", 17);
    public static final authParams FillDangerWeakHover = new authParams("FillDangerWeakHover", 18);
    public static final authParams FillHover = new authParams("FillHover", 19);
    public static final authParams FillInverse = new authParams("FillInverse", 20);
    public static final authParams FillInverseWeak = new authParams("FillInverseWeak", 21);
    public static final authParams FillNeutral = new authParams("FillNeutral", 22);
    public static final authParams FillNeutralWeak = new authParams("FillNeutralWeak", 23);
    public static final authParams FillNeutralWeakHover = new authParams("FillNeutralWeakHover", 24);
    public static final authParams FillPressed = new authParams("FillPressed", 25);
    public static final authParams FillSuccess = new authParams("FillSuccess", 26);
    public static final authParams FillSuccessHover = new authParams("FillSuccessHover", 27);
    public static final authParams FillSuccessWeak = new authParams("FillSuccessWeak", 28);
    public static final authParams FillWarning = new authParams("FillWarning", 29);
    public static final authParams FillWarningHover = new authParams("FillWarningHover", 30);
    public static final authParams FillWarningWeak = new authParams("FillWarningWeak", 31);
    public static final authParams IconBrand = new authParams("IconBrand", 32);
    public static final authParams IconDanger = new authParams("IconDanger", 33);
    public static final authParams IconOnFill = new authParams("IconOnFill", 34);
    public static final authParams IconOnFillBrand = new authParams("IconOnFillBrand", 35);
    public static final authParams IconOnFillWarning = new authParams("IconOnFillWarning", 36);
    public static final authParams IconPrimary = new authParams("IconPrimary", 37);
    public static final authParams IconQuaternary = new authParams("IconQuaternary", 38);
    public static final authParams IconSecondary = new authParams("IconSecondary", 39);
    public static final authParams IconSuccess = new authParams("IconSuccess", 40);
    public static final authParams IconTertiary = new authParams("IconTertiary", 41);
    public static final authParams IconUnselected = new authParams("IconUnselected", 42);
    public static final authParams IconWarning = new authParams("IconWarning", 43);
    public static final authParams NewShadowMedium = new authParams("NewShadowMedium", 44);
    public static final authParams NewShadowStrong = new authParams("NewShadowStrong", 45);
    public static final authParams NewShadowWeak = new authParams("NewShadowWeak", 46);
    public static final authParams ShadowMedium = new authParams("ShadowMedium", 47);
    public static final authParams ShadowTiny = new authParams("ShadowTiny", 48);
    public static final authParams ShadowWeak = new authParams("ShadowWeak", 49);
    public static final authParams TextBrand = new authParams("TextBrand", 50);
    public static final authParams TextDanger = new authParams("TextDanger", 51);
    public static final authParams TextOnFill = new authParams("TextOnFill", 52);
    public static final authParams TextOnFillBrand = new authParams("TextOnFillBrand", 53);
    public static final authParams TextOnFillWarning = new authParams("TextOnFillWarning", 54);
    public static final authParams TextPrimary = new authParams("TextPrimary", 55);
    public static final authParams TextQuaternary = new authParams("TextQuaternary", 56);
    public static final authParams TextSecondary = new authParams("TextSecondary", 57);
    public static final authParams TextStrong = new authParams("TextStrong", 58);
    public static final authParams TextSuccess = new authParams("TextSuccess", 59);
    public static final authParams TextTertiary = new authParams("TextTertiary", 60);
    public static final authParams TextWarning = new authParams("TextWarning", 61);

    private static final /* synthetic */ authParams[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        authParams[] authparamsArr = {BackgroundDefault, BackgroundDim, BackgroundFloated100, BackgroundFloated200, BackgroundLower, BackgroundUpper, BorderDefault, BorderFocusRingInner, BorderFocusRingOuter, FillBrand, FillBrandClearHover, FillBrandHover, FillBrandWeak, FillBrandWeakHover, FillDanger, FillDangerClearHover, FillDangerHover, FillDangerWeak, FillDangerWeakHover, FillHover, FillInverse, FillInverseWeak, FillNeutral, FillNeutralWeak, FillNeutralWeakHover, FillPressed, FillSuccess, FillSuccessHover, FillSuccessWeak, FillWarning, FillWarningHover, FillWarningWeak, IconBrand, IconDanger, IconOnFill, IconOnFillBrand, IconOnFillWarning, IconPrimary, IconQuaternary, IconSecondary, IconSuccess, IconTertiary, IconUnselected, IconWarning, NewShadowMedium, NewShadowStrong, NewShadowWeak, ShadowMedium, ShadowTiny, ShadowWeak, TextBrand, TextDanger, TextOnFill, TextOnFillBrand, TextOnFillWarning, TextPrimary, TextQuaternary, TextSecondary, TextStrong, TextSuccess, TextTertiary, TextWarning};
        int i5 = i3 + 67;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 10 / 0;
        }
        return authparamsArr;
    }

    public static EnumEntries<authParams> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<authParams> enumEntries = $ENTRIES;
        int i5 = i2 + 33;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static authParams valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        authParams authparams = (authParams) Enum.valueOf(authParams.class, str);
        int i4 = onWarmupCompleted + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return authparams;
    }

    public static authParams[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        authParams[] authparamsArr = (authParams[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return authparamsArr;
        }
        throw null;
    }

    private authParams(String str, int i) {
    }

    static {
        authParams[] authparamsArr$values = $values();
        $VALUES = authparamsArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(authparamsArr$values);
        int i = onExtraCallback + 93;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
