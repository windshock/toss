package im.toss.ads_sdk.admob;

import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AdmobAdFormat {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdmobAdFormat[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final AdmobAdFormat INTERSTITIAL = new AdmobAdFormat("INTERSTITIAL", 0);
    public static final AdmobAdFormat REWARDED = new AdmobAdFormat("REWARDED", 1);
    public static final AdmobAdFormat NATIVE = new AdmobAdFormat("NATIVE", 2);
    public static final AdmobAdFormat BANNER = new AdmobAdFormat("BANNER", 3);

    /* renamed from: $r8$lambda$CJ6JRr6SrP1x7xBN0-7U0bgkUMg, reason: not valid java name */
    public static /* synthetic */ KSerializer m11$r8$lambda$CJ6JRr6SrP1x7xBN07U0bgkUMg() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = IAuthTabCallback + 109;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer_init_$_anonymous_;
    }

    private static final /* synthetic */ AdmobAdFormat[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AdmobAdFormat admobAdFormat = INTERSTITIAL;
        if (i3 == 0) {
            return new AdmobAdFormat[]{admobAdFormat, REWARDED, NATIVE, BANNER};
        }
        AdmobAdFormat admobAdFormat2 = REWARDED;
        AdmobAdFormat admobAdFormat3 = NATIVE;
        AdmobAdFormat admobAdFormat4 = BANNER;
        AdmobAdFormat[] admobAdFormatArr = {admobAdFormat, admobAdFormat2};
        admobAdFormatArr[3] = admobAdFormat3;
        admobAdFormatArr[5] = admobAdFormat4;
        return admobAdFormatArr;
    }

    public static EnumEntries<AdmobAdFormat> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<AdmobAdFormat> enumEntries = $ENTRIES;
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        return enumEntries;
    }

    public static AdmobAdFormat valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AdmobAdFormat admobAdFormat = (AdmobAdFormat) Enum.valueOf(AdmobAdFormat.class, str);
        if (i3 != 0) {
            return admobAdFormat;
        }
        throw null;
    }

    public static AdmobAdFormat[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AdmobAdFormat[] admobAdFormatArr = (AdmobAdFormat[]) $VALUES.clone();
        int i4 = onNavigationEvent + 37;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return admobAdFormatArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AdmobAdFormat(String str, int i) {
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $cachedSerializer$delegate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        AdmobAdFormat[] admobAdFormatArr$values = $values();
        $VALUES = admobAdFormatArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(admobAdFormatArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.admob.AdmobAdFormat$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 15;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerM11$r8$lambda$CJ6JRr6SrP1x7xBN07U0bgkUMg = AdmobAdFormat.m11$r8$lambda$CJ6JRr6SrP1x7xBN07U0bgkUMg();
                int i4 = IAuthTabCallback + 17;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerM11$r8$lambda$CJ6JRr6SrP1x7xBN07U0bgkUMg;
            }
        });
        int i = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializer = (KSerializer) AdmobAdFormat.access$get$cachedSerializer$delegate$cp().getValue();
            int i3 = onNavigationEvent + 85;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return kSerializer;
        }

        public final KSerializer<AdmobAdFormat> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent();
                throw null;
            }
            KSerializer<AdmobAdFormat> kSerializerOnNavigationEvent = onNavigationEvent();
            int i3 = IAuthTabCallback + 111;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnNavigationEvent;
        }

        public final AdmobAdFormat IAuthTabCallback(@NotNull String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            Object obj = null;
            switch (upperCase.hashCode()) {
                case -1999289321:
                    if (!(!upperCase.equals("NATIVE"))) {
                        return AdmobAdFormat.NATIVE;
                    }
                    break;
                case -1880997073:
                    if (upperCase.equals("REWARD")) {
                        int i4 = IAuthTabCallback + 83;
                        onNavigationEvent = i4 % 128;
                        if (i4 % 2 == 0) {
                            return AdmobAdFormat.REWARDED;
                        }
                        AdmobAdFormat admobAdFormat = AdmobAdFormat.REWARDED;
                        obj.hashCode();
                        throw null;
                    }
                    break;
                case -1372958932:
                    if (upperCase.equals("INTERSTITIAL")) {
                        int i5 = IAuthTabCallback + 33;
                        onNavigationEvent = i5 % 128;
                        if (i5 % 2 != 0) {
                            AdmobAdFormat admobAdFormat2 = AdmobAdFormat.INTERSTITIAL;
                            obj.hashCode();
                            throw null;
                        }
                        AdmobAdFormat admobAdFormat3 = AdmobAdFormat.INTERSTITIAL;
                        int i6 = IAuthTabCallback + 61;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        return admobAdFormat3;
                    }
                    break;
                case 543046670:
                    if (upperCase.equals("REWARDED")) {
                        return AdmobAdFormat.REWARDED;
                    }
                    break;
                case 1951953708:
                    if (upperCase.equals("BANNER")) {
                        return AdmobAdFormat.BANNER;
                    }
                    break;
                default:
                    int i8 = onNavigationEvent + 107;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    break;
            }
            AdmobAdFormat admobAdFormat4 = AdmobAdFormat.INTERSTITIAL;
            int i10 = onNavigationEvent + 95;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 != 0) {
                return admobAdFormat4;
            }
            throw null;
        }
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.ads_sdk.admob.AdmobAdFormat", values());
        }
        int i3 = 68 / 0;
        return updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.ads_sdk.admob.AdmobAdFormat", values());
    }
}
