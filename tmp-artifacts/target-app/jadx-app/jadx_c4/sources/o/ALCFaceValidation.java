package o;

import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCFaceValidation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ALCFaceValidation[] $VALUES;
    public static final onExtraCallbackWithResult Companion;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String paramName;
    public static final ALCFaceValidation DISABLED = new ALCFaceValidation("DISABLED", 0, "disabled");
    public static final ALCFaceValidation WITHOUT_CONTENTS = new ALCFaceValidation("WITHOUT_CONTENTS", 1, "without-contents");
    public static final ALCFaceValidation ALL = new ALCFaceValidation("ALL", 2, "all");

    private static final /* synthetic */ ALCFaceValidation[] $values() {
        ALCFaceValidation[] aLCFaceValidationArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 31;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            ALCFaceValidation aLCFaceValidation = DISABLED;
            ALCFaceValidation aLCFaceValidation2 = WITHOUT_CONTENTS;
            ALCFaceValidation aLCFaceValidation3 = ALL;
            aLCFaceValidationArr = new ALCFaceValidation[2];
            aLCFaceValidationArr[1] = aLCFaceValidation;
            aLCFaceValidationArr[1] = aLCFaceValidation2;
            aLCFaceValidationArr[2] = aLCFaceValidation3;
        } else {
            aLCFaceValidationArr = new ALCFaceValidation[]{DISABLED, WITHOUT_CONTENTS, ALL};
        }
        int i4 = i2 + 69;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationArr;
    }

    public static EnumEntries<ALCFaceValidation> getEntries() {
        EnumEntries<ALCFaceValidation> enumEntries;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            enumEntries = $ENTRIES;
            int i4 = 94 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 111;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static ALCFaceValidation valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidation = (ALCFaceValidation) Enum.valueOf(ALCFaceValidation.class, str);
        if (i3 != 0) {
            return aLCFaceValidation;
        }
        throw null;
    }

    public static ALCFaceValidation[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation[] aLCFaceValidationArr = $VALUES;
        if (i3 != 0) {
            return (ALCFaceValidation[]) aLCFaceValidationArr.clone();
        }
        int i4 = 53 / 0;
        return (ALCFaceValidation[]) aLCFaceValidationArr.clone();
    }

    private ALCFaceValidation(String str, int i, String str2) {
        this.paramName = str2;
    }

    public final String getParamName() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 49;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.paramName;
        int i5 = i2 + 105;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        ALCFaceValidation[] aLCFaceValidationArr$values = $values();
        $VALUES = aLCFaceValidationArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(aLCFaceValidationArr$values);
        Companion = new onExtraCallbackWithResult(null);
        int i = onExtraCallbackWithResult + 75;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00d7 A[Catch: all -> 0x00e3, TRY_ENTER, TryCatch #0 {all -> 0x00e3, blocks: (B:18:0x005a, B:22:0x006f, B:29:0x00d7, B:30:0x00da, B:31:0x00dc, B:25:0x009e, B:33:0x00de), top: B:44:0x005a }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00da A[Catch: all -> 0x00e3, TryCatch #0 {all -> 0x00e3, blocks: (B:18:0x005a, B:22:0x006f, B:29:0x00d7, B:30:0x00da, B:31:0x00dc, B:25:0x009e, B:33:0x00de), top: B:44:0x005a }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ALCFaceValidation onExtraCallbackWithResult(@NotNull setText settext, @NotNull ALCFaceValidation aLCFaceValidation) {
            Object objCreateFailure;
            Object obj;
            int i;
            ALCFaceValidation aLCFaceValidation2;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 19;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(settext, "");
            Intrinsics.checkNotNullParameter(aLCFaceValidation, "");
            try {
                Result.Companion companion = kotlin.Result.Companion;
                ALCFaceValidation[] aLCFaceValidationArrValues = ALCFaceValidation.values();
                int length = aLCFaceValidationArrValues.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        aLCFaceValidation2 = null;
                        break;
                    }
                    int i6 = IAuthTabCallback + 7;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    aLCFaceValidation2 = aLCFaceValidationArrValues[i5];
                    if (Intrinsics.areEqual(aLCFaceValidation2.getParamName(), settext.onNavigationEvent("logMode", ""))) {
                        break;
                    }
                    i5++;
                }
                objCreateFailure = kotlin.Result.constructor-impl(aLCFaceValidation2);
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                objCreateFailure = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (kotlin.Result.onNavigationEvent(objCreateFailure)) {
                try {
                    Result.Companion companion3 = kotlin.Result.Companion;
                    ALCFaceValidation aLCFaceValidation3 = (ALCFaceValidation) objCreateFailure;
                    if (aLCFaceValidation3 == null) {
                        int i8 = onWarmupCompleted + 89;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 == 0) {
                            if (((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, "enableLog", true})).booleanValue()) {
                                i = IAuthTabCallback + 51;
                                onWarmupCompleted = i % 128;
                                if (i % 2 == 0) {
                                    ALCFaceValidation aLCFaceValidation4 = ALCFaceValidation.ALL;
                                    throw null;
                                }
                                aLCFaceValidation3 = ALCFaceValidation.ALL;
                            }
                            aLCFaceValidation3 = aLCFaceValidation;
                        } else {
                            if (((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, "enableLog", false})).booleanValue()) {
                                i = IAuthTabCallback + 51;
                                onWarmupCompleted = i % 128;
                                if (i % 2 == 0) {
                                }
                            } else {
                                aLCFaceValidation3 = aLCFaceValidation;
                            }
                        }
                    }
                    obj = kotlin.Result.constructor-impl(aLCFaceValidation3);
                } catch (Throwable th2) {
                    Result.Companion companion4 = kotlin.Result.Companion;
                    objCreateFailure = ResultKt.createFailure(th2);
                }
            } else {
                obj = kotlin.Result.constructor-impl(objCreateFailure);
            }
            if (kotlin.Result.onExtraCallback(obj)) {
                obj = aLCFaceValidation;
            }
            return (ALCFaceValidation) obj;
        }
    }
}
