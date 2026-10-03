package viva.republica.toss.network.model.loan;

import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.okycx;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanComparisonResultOverlay$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanComparisonResultOverlay {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    /* renamed from: case, reason: not valid java name */
    private final onNavigationEvent f1case;
    private final String ctaTitle;
    private final String distinctKey;
    private final String eventId;
    private final Double myInterestRate;
    private final Double preScreenInterestRate;
    private final String resourceUrl;
    private final String scheme;
    private final String subtitle;
    private final String title;
    private final onExtraCallbackWithResult type;

    public LoanComparisonResultOverlay() {
        this((String) null, (String) null, (onExtraCallbackWithResult) null, (String) null, (String) null, (String) null, (String) null, (onNavigationEvent) null, (Double) null, (Double) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer access100() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.OverlayType", onExtraCallbackWithResult.values());
        int i4 = onNavigationEvent + 115;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            return (KSerializer) onNavigationEvent(-1673685397, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[0], AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1673685399, iOnWarmupCompleted, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        }
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = (~i5) | i8;
        int i10 = ~(i5 | i8);
        int i11 = i4 + i + i2 + ((-714989572) * i6) + (1142003473 * i3);
        int i12 = i11 * i11;
        int i13 = (((-190873766) * i4) - 1983905792) + (1136689320 * i) + (i7 * (-1483702105)) + (1483702105 * i9) + ((-1483702105) * i10) + ((-1674575872) * i2) + ((-1891631104) * i6) + ((-1355808768) * i3) + ((-1882259456) * i12);
        int i14 = (i4 * (-1158907614)) + 1427560840 + (i * (-1158905656)) + (i7 * 979) + (i9 * (-979)) + (i10 * 979) + (i2 * (-1158906635)) + (i6 * 1387703340) + (i3 * 1202573125) + (i12 * (-451215360));
        int i15 = i13 + (i14 * i14 * (-310837248));
        if (i15 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i15 != 2) {
            return onExtraCallback(objArr);
        }
        int i16 = 2 % 2;
        int i17 = onExtraCallback + 107;
        onNavigationEvent = i17 % 128;
        int i18 = i17 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.UpDownNudgeCase", onNavigationEvent.values());
        int i19 = onExtraCallback + 19;
        onNavigationEvent = i19 % 128;
        int i20 = i19 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAccess100 = access100();
        int i4 = onNavigationEvent + 67;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerAccess100;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof LoanComparisonResultOverlay)) {
            int i4 = onNavigationEvent + 25;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        LoanComparisonResultOverlay loanComparisonResultOverlay = (LoanComparisonResultOverlay) obj;
        if (!Intrinsics.areEqual(this.eventId, loanComparisonResultOverlay.eventId)) {
            int i6 = onExtraCallback + 123;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.distinctKey, loanComparisonResultOverlay.distinctKey)) {
            return false;
        }
        if (this.type != loanComparisonResultOverlay.type) {
            int i8 = onNavigationEvent + 99;
            onExtraCallback = i8 % 128;
            return i8 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.title, loanComparisonResultOverlay.title) || !Intrinsics.areEqual(this.subtitle, loanComparisonResultOverlay.subtitle) || !Intrinsics.areEqual(this.ctaTitle, loanComparisonResultOverlay.ctaTitle) || !Intrinsics.areEqual(this.scheme, loanComparisonResultOverlay.scheme)) {
            return false;
        }
        if (this.f1case != loanComparisonResultOverlay.f1case) {
            int i9 = onExtraCallback + 25;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.myInterestRate, loanComparisonResultOverlay.myInterestRate)) {
            return false;
        }
        if (Intrinsics.areEqual(this.preScreenInterestRate, loanComparisonResultOverlay.preScreenInterestRate)) {
            return Intrinsics.areEqual(this.resourceUrl, loanComparisonResultOverlay.resourceUrl);
        }
        int i11 = onExtraCallback + 103;
        onNavigationEvent = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.eventId;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.distinctKey;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        int iHashCode6 = this.type.hashCode();
        String str3 = this.title;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.subtitle;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.ctaTitle;
        if (str5 == null) {
            int i4 = onExtraCallback + 123;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 3;
            }
            iHashCode = 0;
        } else {
            iHashCode = str5.hashCode();
        }
        String str6 = this.scheme;
        if (str6 == null) {
            int i6 = onExtraCallback + 107;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str6.hashCode();
        }
        onNavigationEvent onnavigationevent = this.f1case;
        int iHashCode9 = onnavigationevent == null ? 0 : onnavigationevent.hashCode();
        Double d = this.myInterestRate;
        int iHashCode10 = d == null ? 0 : d.hashCode();
        Double d2 = this.preScreenInterestRate;
        if (d2 == null) {
            iHashCode3 = 0;
        } else {
            iHashCode3 = d2.hashCode();
            int i8 = onExtraCallback + 117;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
        }
        String str7 = this.resourceUrl;
        return (((((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode3) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonResultOverlay(eventId=" + this.eventId + ", distinctKey=" + this.distinctKey + ", type=" + this.type + ", title=" + this.title + ", subtitle=" + this.subtitle + ", ctaTitle=" + this.ctaTitle + ", scheme=" + this.scheme + ", case=" + this.f1case + ", myInterestRate=" + this.myInterestRate + ", preScreenInterestRate=" + this.preScreenInterestRate + ", resourceUrl=" + this.resourceUrl + ")";
        int i2 = onExtraCallback + 83;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanComparisonResultOverlay> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            LoanComparisonResultOverlay$.serializer serializerVar = LoanComparisonResultOverlay$.serializer.INSTANCE;
            if (i3 != 0) {
                int i4 = 74 / 0;
            }
            return serializerVar;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanComparisonResultOverlay$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 41;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return LoanComparisonResultOverlay.onNavigationEvent();
                }
                LoanComparisonResultOverlay.onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanComparisonResultOverlay$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                KSerializer kSerializerOnExtraCallback;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 23;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    kSerializerOnExtraCallback = LoanComparisonResultOverlay.onExtraCallback();
                    int i3 = 87 / 0;
                } else {
                    kSerializerOnExtraCallback = LoanComparisonResultOverlay.onExtraCallback();
                }
                int i4 = onWarmupCompleted + 79;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 86 / 0;
                }
                return kSerializerOnExtraCallback;
            }
        }), null, null, null};
        int i = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ LoanComparisonResultOverlay(int i, String str, String str2, onExtraCallbackWithResult onextracallbackwithresult, String str3, String str4, String str5, String str6, onNavigationEvent onnavigationevent, Double d, Double d2, String str7, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.eventId = null;
        } else {
            this.eventId = str;
            int i2 = 2 % 2;
        }
        if ((i & 2) == 0) {
            int i3 = onExtraCallback + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            this.distinctKey = null;
        } else {
            this.distinctKey = str2;
        }
        if ((i & 4) == 0) {
            int i5 = onExtraCallback + 13;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                this.type = onExtraCallbackWithResult.UNKNOWN;
            } else {
                this.type = onExtraCallbackWithResult.UNKNOWN;
                obj.hashCode();
                throw null;
            }
        } else {
            this.type = onextracallbackwithresult;
        }
        if ((i & 8) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 16) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str4;
        }
        int i6 = 2 % 2;
        if ((i & 32) == 0) {
            int i7 = onNavigationEvent + 75;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            this.ctaTitle = null;
        } else {
            this.ctaTitle = str5;
        }
        if ((i & 64) == 0) {
            this.scheme = null;
        } else {
            this.scheme = str6;
        }
        if ((i & 128) == 0) {
            this.f1case = null;
            int i9 = 2 % 2;
        } else {
            this.f1case = onnavigationevent;
        }
        if ((i & 256) == 0) {
            this.myInterestRate = null;
        } else {
            this.myInterestRate = d;
        }
        if ((i & 512) == 0) {
            this.preScreenInterestRate = null;
        } else {
            this.preScreenInterestRate = d2;
        }
        if ((i & 1024) != 0) {
            this.resourceUrl = str7;
            return;
        }
        int i10 = onNavigationEvent + 25;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        this.resourceUrl = null;
        if (i11 == 0) {
            throw null;
        }
    }

    public LoanComparisonResultOverlay(@Nullable String str, @Nullable String str2, @NotNull onExtraCallbackWithResult onextracallbackwithresult, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable onNavigationEvent onnavigationevent, @Nullable Double d, @Nullable Double d2, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.eventId = str;
        this.distinctKey = str2;
        this.type = onextracallbackwithresult;
        this.title = str3;
        this.subtitle = str4;
        this.ctaTitle = str5;
        this.scheme = str6;
        this.f1case = onnavigationevent;
        this.myInterestRate = d;
        this.preScreenInterestRate = d2;
        this.resourceUrl = str7;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.loan.LoanComparisonResultOverlay r7, o.vyl r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.onExtraCallback(viva.republica.toss.network.model.loan.LoanComparisonResultOverlay, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 71;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 97;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanComparisonResultOverlay(String str, String str2, onExtraCallbackWithResult onextracallbackwithresult, String str3, String str4, String str5, String str6, onNavigationEvent onnavigationevent, Double d, Double d2, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str8;
        String str9;
        onExtraCallbackWithResult onextracallbackwithresult2;
        String str10;
        String str11;
        Double d3;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str8 = null;
        } else {
            str8 = str;
        }
        if ((i & 2) != 0) {
            int i3 = onNavigationEvent + 73;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            str9 = null;
        } else {
            str9 = str2;
        }
        if ((i & 4) != 0) {
            int i5 = onExtraCallback + 101;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            onextracallbackwithresult2 = onExtraCallbackWithResult.UNKNOWN;
            int i7 = onNavigationEvent + 119;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        } else {
            onextracallbackwithresult2 = onextracallbackwithresult;
        }
        if ((i & 8) != 0) {
            int i10 = onExtraCallback + 59;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            str10 = null;
        } else {
            str10 = str3;
        }
        if ((i & 16) != 0) {
            int i13 = 2 % 2;
            str11 = null;
        } else {
            str11 = str4;
        }
        String str12 = (i & 32) != 0 ? null : str5;
        String str13 = (i & 64) != 0 ? null : str6;
        onNavigationEvent onnavigationevent2 = (i & 128) != 0 ? null : onnavigationevent;
        if ((i & 256) != 0) {
            int i14 = onExtraCallback + 23;
            onNavigationEvent = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 2 % 2;
            d3 = null;
        } else {
            d3 = d;
        }
        this(str8, str9, onextracallbackwithresult2, str10, str11, str12, str13, onnavigationevent2, d3, (i & 512) != 0 ? null : d2, (i & 1024) == 0 ? str7 : null);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LoanComparisonResultOverlay loanComparisonResultOverlay = (LoanComparisonResultOverlay) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 59;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        String str = loanComparisonResultOverlay.eventId;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 79;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.distinctKey;
        }
        throw null;
    }

    public final onExtraCallbackWithResult IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = this.type;
        int i5 = i2 + 83;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return onextracallbackwithresult;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        LoanComparisonResultOverlay loanComparisonResultOverlay = (LoanComparisonResultOverlay) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = loanComparisonResultOverlay.title;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.subtitle;
        int i4 = i3 + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.ctaTitle;
        int i5 = i3 + 87;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.scheme;
        int i5 = i2 + 61;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final onNavigationEvent IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        onNavigationEvent onnavigationevent = this.f1case;
        int i5 = i3 + 35;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return onnavigationevent;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.resourceUrl;
        int i5 = i3 + 125;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static char IAuthTabCallback = 0;
        private static int IAuthTabCallbackStub = 1;
        public static final onExtraCallbackWithResult INTEREST_RATE_UPDOWN_NUDGE;
        public static final onExtraCallbackWithResult OVERLAY;
        public static final onExtraCallbackWithResult POINT;
        public static final onExtraCallbackWithResult SCHEME;
        public static final onExtraCallbackWithResult UNKNOWN;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static char[] onWarmupCompleted;

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 55;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {INTEREST_RATE_UPDOWN_NUDGE, POINT, SCHEME, OVERLAY, UNKNOWN};
            int i5 = i2 + 3;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return onextracallbackwithresultArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 61;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i5 = i2 + 15;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            int i4 = onExtraCallbackWithResult + 61;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i3 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return onextracallbackwithresultArr;
            }
            throw null;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult();
            INTEREST_RATE_UPDOWN_NUDGE = new onExtraCallbackWithResult("INTEREST_RATE_UPDOWN_NUDGE", 0);
            POINT = new onExtraCallbackWithResult("POINT", 1);
            SCHEME = new onExtraCallbackWithResult("SCHEME", 2);
            OVERLAY = new onExtraCallbackWithResult("OVERLAY", 3);
            Object[] objArr = new Object[1];
            a(new char[]{1, 3, 1, 7, 0, 2, 13838}, (byte) (Gravity.getAbsoluteGravity(0, 0) + 58), 7 - View.MeasureSpec.getSize(0), objArr);
            UNKNOWN = new onExtraCallbackWithResult(((String) objArr[0]).intern(), 4);
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = IAuthTabCallbackStub + 91;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onWarmupCompleted;
            float f = 0.0f;
            Object obj2 = null;
            if (cArr2 != null) {
                int i4 = $10 + 3;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 26, 23138 - TextUtils.indexOf((CharSequence) "", '0', 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6++;
                        f = 0.0f;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            try {
                Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), 25 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                        int i7 = $10 + 19;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            obj = obj2;
                        } else {
                            try {
                                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                                if (objOnExtraCallback3 == null) {
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 24825), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 74, TextUtils.lastIndexOf("", '0') + 8089, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                    try {
                                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                        if (objOnExtraCallback4 == null) {
                                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 30, 19489 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                        }
                                        obj = null;
                                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                        int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 == null) {
                                            throw th2;
                                        }
                                        throw cause2;
                                    }
                                } else {
                                    obj = null;
                                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                        int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                                    } else {
                                        int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                                    }
                                }
                            } catch (Throwable th3) {
                                Throwable cause3 = th3.getCause();
                                if (cause3 == null) {
                                    throw th3;
                                }
                                throw cause3;
                            }
                        }
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                        obj2 = obj;
                    }
                }
                int i14 = 0;
                while (i14 < i) {
                    cArr4[i14] = (char) (cArr4[i14] ^ 13722);
                    i14++;
                    int i15 = $10 + 27;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                }
                objArr[0] = new String(cArr4);
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }

        static void onExtraCallbackWithResult() {
            onWarmupCompleted = new char[]{64998, 64996, 65020, 65023, 65021, 65017, 65019, 65016, 65018};
            IAuthTabCallback = (char) 51242;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        public static final onNavigationEvent UP = new onNavigationEvent("UP", 0);
        public static final onNavigationEvent DOWN = new onNavigationEvent("DOWN", 1);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            onNavigationEvent[] onnavigationeventArr = {i2 % 2 == 0 ? UP : UP, DOWN};
            int i4 = i3 + 23;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i3 + 49;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            if (i3 == 0) {
                int i4 = 16 / 0;
            }
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            onNavigationEvent[] onnavigationeventArr;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
                int i3 = 48 / 0;
            } else {
                onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            }
            int i4 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return onnavigationeventArr;
            }
            throw null;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = IAuthTabCallback + 125;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 36 / 0;
            }
        }
    }

    public final IAuthTabCallback onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 63;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        onNavigationEvent onnavigationevent = this.f1case;
        Object obj = null;
        if (onnavigationevent == null) {
            int i6 = i4 + 95;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 12 / 0;
            }
            return null;
        }
        String str = this.title;
        if (str == null) {
            return null;
        }
        String str2 = this.subtitle;
        if (str2 == null) {
            int i8 = i2 + 113;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        Double d = this.myInterestRate;
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            Double d2 = this.preScreenInterestRate;
            if (d2 != null) {
                return new IAuthTabCallback(onnavigationevent, str, str2, dDoubleValue, d2.doubleValue());
            }
        }
        return null;
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        /* renamed from: case, reason: not valid java name */
        private final onNavigationEvent f2case;
        private final double minInterestRate;
        private final double myInterestRate;
        private final String subtitle;
        private final String title;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r8 instanceof viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback) != false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        
            r8 = (viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback) r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        
            if (r7.f2case == r8.f2case) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        
            r1 = r1 + 63;
            viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback.onWarmupCompleted = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r7.title, r8.title) != false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r7.subtitle, r8.subtitle) != false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        
            r8 = viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback.onWarmupCompleted + 37;
            viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback.IAuthTabCallback = r8 % 128;
            r8 = r8 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        
            if (java.lang.Double.compare(r7.myInterestRate, r8.myInterestRate) == 0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
        
            r8 = viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback.IAuthTabCallback;
            r1 = r8 + 107;
            viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback.onWarmupCompleted = r1 % 128;
            r1 = r1 % 2;
            r8 = r8 + 15;
            viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback.onWarmupCompleted = r8 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
        
            if ((r8 % 2) != 0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
        
            r8 = null;
            r8.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
        
            if (java.lang.Double.compare(r7.minInterestRate, r8.minInterestRate) == 0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
        
            r8 = viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback.IAuthTabCallback;
            r1 = r8 + 95;
            viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback.onWarmupCompleted = r1 % 128;
            r1 = r1 % 2;
            r8 = r8 + 101;
            viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback.onWarmupCompleted = r8 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
        
            if ((r8 % 2) == 0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
        
            r8 = 12 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r7 == r8) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r7 == r8) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r8) {
            /*
                r7 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback.IAuthTabCallback
                int r2 = r1 + 49
                int r3 = r2 % 128
                viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback.onWarmupCompleted = r3
                int r2 = r2 % r0
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L16
                r2 = 45
                int r2 = r2 / r4
                if (r7 != r8) goto L19
                goto L18
            L16:
                if (r7 != r8) goto L19
            L18:
                return r3
            L19:
                boolean r2 = r8 instanceof viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback
                if (r2 != 0) goto L1e
                return r4
            L1e:
                viva.republica.toss.network.model.loan.LoanComparisonResultOverlay$IAuthTabCallback r8 = (viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback) r8
                viva.republica.toss.network.model.loan.LoanComparisonResultOverlay$onNavigationEvent r2 = r7.f2case
                viva.republica.toss.network.model.loan.LoanComparisonResultOverlay$onNavigationEvent r5 = r8.f2case
                if (r2 == r5) goto L2e
                int r1 = r1 + 63
                int r8 = r1 % 128
                viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback.onWarmupCompleted = r8
                int r1 = r1 % r0
                return r4
            L2e:
                java.lang.String r1 = r7.title
                java.lang.String r2 = r8.title
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                if (r1 != 0) goto L39
                return r4
            L39:
                java.lang.String r1 = r7.subtitle
                java.lang.String r2 = r8.subtitle
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                if (r1 != 0) goto L4d
                int r8 = viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback.onWarmupCompleted
                int r8 = r8 + 37
                int r1 = r8 % 128
                viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback.IAuthTabCallback = r1
                int r8 = r8 % r0
                return r4
            L4d:
                double r1 = r7.myInterestRate
                double r5 = r8.myInterestRate
                int r1 = java.lang.Double.compare(r1, r5)
                if (r1 == 0) goto L6f
                int r8 = viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback.IAuthTabCallback
                int r1 = r8 + 107
                int r2 = r1 % 128
                viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback.onWarmupCompleted = r2
                int r1 = r1 % r0
                int r8 = r8 + 15
                int r1 = r8 % 128
                viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback.onWarmupCompleted = r1
                int r8 = r8 % r0
                if (r8 != 0) goto L6a
                return r4
            L6a:
                r8 = 0
                r8.hashCode()
                throw r8
            L6f:
                double r1 = r7.minInterestRate
                double r5 = r8.minInterestRate
                int r8 = java.lang.Double.compare(r1, r5)
                if (r8 == 0) goto L8f
                int r8 = viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback.IAuthTabCallback
                int r1 = r8 + 95
                int r2 = r1 % 128
                viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback.onWarmupCompleted = r2
                int r1 = r1 % r0
                int r8 = r8 + 101
                int r1 = r8 % 128
                viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback.onWarmupCompleted = r1
                int r8 = r8 % r0
                if (r8 == 0) goto L8e
                r8 = 12
                int r8 = r8 / r4
            L8e:
                return r4
            L8f:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonResultOverlay.IAuthTabCallback.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((((this.f2case.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + Double.hashCode(this.myInterestRate)) * 31) + Double.hashCode(this.minInterestRate);
            int i4 = onWarmupCompleted + 53;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 31 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "UpDownNudgeOverlayData(case=" + this.f2case + ", title=" + this.title + ", subtitle=" + this.subtitle + ", myInterestRate=" + this.myInterestRate + ", minInterestRate=" + this.minInterestRate + ")";
            int i2 = onWarmupCompleted + 45;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public IAuthTabCallback(@NotNull onNavigationEvent onnavigationevent, @NotNull String str, @NotNull String str2, double d, double d2) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.f2case = onnavigationevent;
            this.title = str;
            this.subtitle = str2;
            this.myInterestRate = d;
            this.minInterestRate = d2;
        }

        public final onNavigationEvent onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            onNavigationEvent onnavigationevent = this.f2case;
            int i5 = i3 + 115;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 13 / 0;
            }
            return onnavigationevent;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.title;
            int i5 = i3 + 55;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 90 / 0;
            }
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 77;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.subtitle;
            int i5 = i2 + 35;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 78 / 0;
            }
            return str;
        }

        public final double IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            double d = this.myInterestRate;
            int i5 = i3 + 43;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return d;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final double onNavigationEvent() {
            double d;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 89;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                d = this.minInterestRate;
                int i4 = 3 / 0;
            } else {
                d = this.minInterestRate;
            }
            int i5 = i2 + 121;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return d;
            }
            throw null;
        }
    }

    private static final /* synthetic */ KSerializer IAuthTabCallback_Parcel() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (KSerializer) onNavigationEvent(-1673685397, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[0], AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1673685399, iOnWarmupCompleted, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public final String asBinder() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onNavigationEvent(-868584407, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 868584407, iOnWarmupCompleted, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public final String getInterfaceDescriptor() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onNavigationEvent(-148778177, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 148778178, iOnWarmupCompleted, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }
}
