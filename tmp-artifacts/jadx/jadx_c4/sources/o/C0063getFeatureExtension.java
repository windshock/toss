package o;

import com.google.gson.annotations.SerializedName;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.getFeatureExtension, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0063getFeatureExtension {
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;

    @SerializedName("matchCount")
    private final int IAuthTabCallback;

    @SerializedName("mutedUntil")
    private final long onExtraCallback;

    @SerializedName("periodLimit")
    private final extractFaceQuality onExtraCallbackWithResult;

    @SerializedName("triggerId")
    private final String onNavigationEvent;

    @SerializedName("playCount")
    private final int onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = i4 | i9;
        int i11 = ~i4;
        int i12 = i9 | (~(i11 | i2));
        int i13 = (~(i3 | i7 | i4)) | (~(i8 | i11 | i7));
        int i14 = i2 + i4 + i + ((-619979367) * i5) + (68302741 * i6);
        int i15 = i14 * i14;
        int i16 = (i2 * 561304900) + 382271488 + (561304900 * i4) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i) + (1615200256 * i5) + ((-1821507584) * i6) + (428933120 * i15);
        int i17 = ((i2 * (-96142684)) - 56799437) + (i4 * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i * (-96141863)) + (i5 * (-1380774991)) + (i6 * (-1175232947)) + (i15 * (-118947840));
        return i16 + ((i17 * i17) * (-1369505792)) != 1 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        C0063getFeatureExtension c0063getFeatureExtension = (C0063getFeatureExtension) objArr[0];
        String str = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        extractFaceQuality extractfacequality = (extractFaceQuality) objArr[4];
        long jLongValue = ((Number) objArr[5]).longValue();
        int iIntValue3 = ((Number) objArr[6]).intValue();
        Object obj = objArr[7];
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 7;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if ((iIntValue3 & 1) != 0) {
            int i5 = i2 + 49;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            str = c0063getFeatureExtension.onNavigationEvent;
        }
        if ((iIntValue3 & 2) != 0) {
            iIntValue = c0063getFeatureExtension.onWarmupCompleted;
        }
        if ((iIntValue3 & 4) != 0) {
            int i7 = i2 + 11;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = c0063getFeatureExtension.IAuthTabCallback;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            iIntValue2 = c0063getFeatureExtension.IAuthTabCallback;
        }
        if ((iIntValue3 & 8) != 0) {
            extractFaceQuality extractfacequality2 = c0063getFeatureExtension.onExtraCallbackWithResult;
            int i9 = IAuthTabCallbackStub + 63;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
            extractfacequality = extractfacequality2;
        }
        if ((iIntValue3 & 16) != 0) {
            jLongValue = c0063getFeatureExtension.onExtraCallback;
        }
        return c0063getFeatureExtension.onNavigationEvent(str, iIntValue, iIntValue2, extractfacequality, jLongValue);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asInterface + 61;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof C0063getFeatureExtension)) {
            int i4 = asInterface + 61;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        C0063getFeatureExtension c0063getFeatureExtension = (C0063getFeatureExtension) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, c0063getFeatureExtension.onNavigationEvent)) {
            int i5 = IAuthTabCallbackStub + 39;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.onWarmupCompleted != c0063getFeatureExtension.onWarmupCompleted || this.IAuthTabCallback != c0063getFeatureExtension.IAuthTabCallback) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, c0063getFeatureExtension.onExtraCallbackWithResult)) {
            return this.onExtraCallback == c0063getFeatureExtension.onExtraCallback;
        }
        int i7 = IAuthTabCallbackStub + 103;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 81;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.onNavigationEvent.hashCode();
        int iHashCode2 = Integer.hashCode(this.onWarmupCompleted);
        int iHashCode3 = Integer.hashCode(this.IAuthTabCallback);
        extractFaceQuality extractfacequality = this.onExtraCallbackWithResult;
        if (extractfacequality == null) {
            i = 0;
        } else {
            int iHashCode4 = extractfacequality.hashCode();
            int i5 = IAuthTabCallbackStub + 97;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode4;
        }
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i) * 31) + Long.hashCode(this.onExtraCallback);
    }

    public final C0063getFeatureExtension onNavigationEvent(@NotNull String str, int i, int i2, @Nullable extractFaceQuality extractfacequality, long j) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        C0063getFeatureExtension c0063getFeatureExtension = new C0063getFeatureExtension(str, i, i2, extractfacequality, j);
        int i4 = asInterface + 31;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return c0063getFeatureExtension;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TriggerPlayInfo(triggerId=" + this.onNavigationEvent + ", playCount=" + this.onWarmupCompleted + ", matchCount=" + this.IAuthTabCallback + ", periodLimit=" + this.onExtraCallbackWithResult + ", mutedUntil=" + this.onExtraCallback + ")";
        int i2 = IAuthTabCallbackStub + 119;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public C0063getFeatureExtension(@NotNull String str, int i, int i2, @Nullable extractFaceQuality extractfacequality, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent = str;
        this.onWarmupCompleted = i;
        this.IAuthTabCallback = i2;
        this.onExtraCallbackWithResult = extractfacequality;
        this.onExtraCallback = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0063getFeatureExtension(String str, int i, int i2, extractFaceQuality extractfacequality, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        int i4;
        int i5;
        long j2;
        if ((i3 & 2) != 0) {
            int i6 = IAuthTabCallbackStub + 83;
            int i7 = i6 % 128;
            asInterface = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 23;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 4) != 0) {
            int i12 = IAuthTabCallbackStub;
            int i13 = i12 + 31;
            asInterface = i13 % 128;
            i5 = (i13 % 2 != 0 ? 1 : 0) ^ 1;
            int i14 = i12 + 71;
            asInterface = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 2 % 5;
            } else {
                int i16 = 2 % 2;
            }
        } else {
            i5 = i2;
        }
        extractFaceQuality extractfacequality2 = (i3 & 8) != 0 ? null : extractfacequality;
        if ((i3 & 16) != 0) {
            int i17 = IAuthTabCallbackStub + 25;
            asInterface = i17 % 128;
            int i18 = i17 % 2;
            int i19 = 2 % 2;
            j2 = 0;
        } else {
            j2 = j;
        }
        this(str, i4, i5, extractfacequality2, j2);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onNavigationEvent;
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return str;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 13;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onWarmupCompleted;
        int i6 = i2 + 77;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 109;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.IAuthTabCallback;
        int i6 = i2 + 43;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final extractFaceQuality onExtraCallbackWithResult() {
        extractFaceQuality extractfacequality;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            extractfacequality = this.onExtraCallbackWithResult;
            int i4 = 64 / 0;
        } else {
            extractfacequality = this.onExtraCallbackWithResult;
        }
        int i5 = i3 + 75;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return extractfacequality;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 105;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.onExtraCallback;
        int i4 = i2 + 105;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final boolean onExtraCallbackWithResult(@NotNull Date date) {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(date, "");
        boolean zIAuthTabCallback = ALCFaceSDKExternalSyntheticLambda2.IAuthTabCallback(this.onExtraCallback, date);
        int i4 = asInterface + 47;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    public final C0063getFeatureExtension onWarmupCompleted(@NotNull Date date, int i, @NotNull TimeUnit timeUnit) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 77;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(timeUnit, "");
        if (i > 0) {
            return (C0063getFeatureExtension) IAuthTabCallback(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this, null, 0, 0, null, Long.valueOf(ALCFaceSDKExternalSyntheticLambda2.onWarmupCompleted(date, i, timeUnit)), 15, null}, -388402864, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 388402864, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        }
        int i5 = IAuthTabCallbackStub + 65;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
        return this;
    }

    public final C0063getFeatureExtension onTransact() {
        Object objIAuthTabCallback;
        int i = 2 % 2;
        int i2 = asInterface + 103;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            objIAuthTabCallback = IAuthTabCallback(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this, null, 1, Integer.valueOf(this.IAuthTabCallback), null, 1L, 93, null}, -388402864, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 388402864, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        } else {
            objIAuthTabCallback = IAuthTabCallback(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this, null, 0, Integer.valueOf(this.IAuthTabCallback + 1), null, 0L, 27, null}, -388402864, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 388402864, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        }
        return (C0063getFeatureExtension) objIAuthTabCallback;
    }

    public final C0063getFeatureExtension IAuthTabCallbackStub() {
        extractFaceQuality extractfacequalityOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = this.onWarmupCompleted;
        extractFaceQuality extractfacequality = this.onExtraCallbackWithResult;
        if (extractfacequality != null) {
            int i3 = asInterface + 37;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            extractfacequalityOnExtraCallbackWithResult = extractfacequality.onExtraCallbackWithResult();
        } else {
            extractfacequalityOnExtraCallbackWithResult = null;
        }
        Integer numValueOf = Integer.valueOf(i2 + 1);
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        C0063getFeatureExtension c0063getFeatureExtension = (C0063getFeatureExtension) IAuthTabCallback(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this, null, numValueOf, 0, extractfacequalityOnExtraCallbackWithResult, 0L, 21, null}, -388402864, iOnExtraCallbackWithResult, 388402864, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        int i5 = IAuthTabCallbackStub + 33;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return c0063getFeatureExtension;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        C0063getFeatureExtension c0063getFeatureExtension = (C0063getFeatureExtension) objArr[0];
        Date date = (Date) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(date, "");
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        gregorianCalendar.add(5, iIntValue);
        C0063getFeatureExtension c0063getFeatureExtension2 = (C0063getFeatureExtension) IAuthTabCallback(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{c0063getFeatureExtension, null, 0, 0, new extractFaceQuality(timeInMillis, gregorianCalendar.getTimeInMillis(), iIntValue2), 0L, 23, null}, -388402864, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 388402864, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        int i2 = asInterface + 3;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 91 / 0;
        }
        return c0063getFeatureExtension2;
    }

    public static /* synthetic */ C0063getFeatureExtension onExtraCallbackWithResult(C0063getFeatureExtension c0063getFeatureExtension, String str, int i, int i2, extractFaceQuality extractfacequality, long j, int i3, Object obj) {
        return (C0063getFeatureExtension) IAuthTabCallback(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{c0063getFeatureExtension, str, Integer.valueOf(i), Integer.valueOf(i2), extractfacequality, Long.valueOf(j), Integer.valueOf(i3), obj}, -388402864, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 388402864, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    public final C0063getFeatureExtension onExtraCallback(@NotNull Date date, int i, int i2) {
        return (C0063getFeatureExtension) IAuthTabCallback(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this, date, Integer.valueOf(i), Integer.valueOf(i2)}, 396314821, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -396314820, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }
}
