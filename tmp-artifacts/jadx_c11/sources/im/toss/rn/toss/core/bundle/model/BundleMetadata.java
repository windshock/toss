package im.toss.rn.toss.core.bundle.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.rn.spec.bundle.TossReactBundleMeta;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.AUTextView;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.IdGeneratorExternalSyntheticLambda1;
import o.TTAppOpenAdTransActivity;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.adInfo;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.setCampaign;
import o.videoFrameChanged;
import o.vyl;
import o.wie2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class BundleMetadata {
    public static final Companion Companion;
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    private static final wie2 json;
    private static short[] onExtraCallback;
    private static byte[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String deployedAt;
    private final String deploymentId;
    private final String reactNativeVersion;
    private final long savedAt;
    private final String sharedMinDeployedAt;
    private final String signature;
    private final long updatedAt;
    private static final byte[] $$a = {98, -3, -80, -4};
    private static final int $$b = 2;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int onTransact = 0;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3;
        int i4 = 115 - (s2 * 3);
        byte[] bArr = $$a;
        int i5 = s + 4;
        int i6 = 1 - (i * 2);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            i3 = 0;
            int i9 = i5 + (-i8);
            i2 = i3;
            int i10 = i7;
            i4 = i9;
            i5 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            int i11 = i5 + 1;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i11];
            int i12 = i4;
            i7 = i11;
            i5 = i12;
            int i92 = i5 + (-i8);
            i2 = i3;
            int i102 = i7;
            i4 = i92;
            i5 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            int i112 = i5 + 1;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            int i1122 = i5 + 1;
            if (i3 == i6) {
            }
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i3;
        int i8 = (~(i7 | i6)) | i;
        int i9 = (~(i7 | (~i6))) | (~((~i) | i7)) | (~(i | i3 | i6));
        int i10 = ~(i6 | i);
        int i11 = i + i3 + i5 + ((-813770285) * i2) + (135932771 * i4);
        int i12 = i11 * i11;
        int i13 = (526900465 * i) + 74317824 + ((-1745228167) * i3) + ((-249289968) * i8) + (2022838664 * i9) + ((-2022838664) * i10) + (277610496 * i5) + (1331953664 * i2) + ((-366739456) * i4) + ((-1308753920) * i12);
        int i14 = (i * 1149714451) + 247108311 + (i3 * 1149714091) + (i8 * (-720)) + (i9 * (-360)) + (i10 * 360) + (i5 * 1149713731) + (i2 * 1918847289) + (i4 * (-2006650391)) + (i12 * 460980224);
        return i13 + ((i14 * i14) * (-1418592256)) != 1 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(adinfo);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(adinfo);
        int i3 = IAuthTabCallbackDefault + 17;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ BundleMetadata onNavigationEvent(BundleMetadata bundleMetadata, String str, String str2, String str3, String str4, long j, long j2, String str5, int i, Object obj) {
        String str6;
        long j3;
        long j4;
        int i2 = 2 % 2;
        String str7 = (i & 1) != 0 ? bundleMetadata.signature : str;
        if ((i & 2) != 0) {
            int i3 = onTransact + 103;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                str6 = bundleMetadata.deploymentId;
                int i4 = 84 / 0;
            } else {
                str6 = bundleMetadata.deploymentId;
            }
        } else {
            str6 = str2;
        }
        String str8 = (i & 4) != 0 ? bundleMetadata.deployedAt : str3;
        String str9 = (i & 8) != 0 ? bundleMetadata.sharedMinDeployedAt : str4;
        if ((i & 16) != 0) {
            int i5 = onTransact + 3;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            j3 = bundleMetadata.savedAt;
        } else {
            j3 = j;
        }
        if ((i & 32) != 0) {
            int i7 = IAuthTabCallbackDefault + 3;
            onTransact = i7 % 128;
            if (i7 % 2 != 0) {
                j4 = bundleMetadata.updatedAt;
                int i8 = 24 / 0;
            } else {
                j4 = bundleMetadata.updatedAt;
            }
        } else {
            j4 = j2;
        }
        return bundleMetadata.onExtraCallbackWithResult(str7, str6, str8, str9, j3, j4, (i & 64) != 0 ? bundleMetadata.reactNativeVersion : str5);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 103;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 55;
            IAuthTabCallbackDefault = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!(obj instanceof BundleMetadata)) {
            return false;
        }
        BundleMetadata bundleMetadata = (BundleMetadata) obj;
        if (!Intrinsics.areEqual(this.signature, bundleMetadata.signature)) {
            int i6 = IAuthTabCallbackDefault + 27;
            onTransact = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.deploymentId, bundleMetadata.deploymentId)) {
            int i7 = IAuthTabCallbackDefault + 75;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.deployedAt, bundleMetadata.deployedAt) || !Intrinsics.areEqual(this.sharedMinDeployedAt, bundleMetadata.sharedMinDeployedAt)) {
            return false;
        }
        if (this.savedAt != bundleMetadata.savedAt) {
            int i9 = onTransact + 27;
            IAuthTabCallbackDefault = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.updatedAt == bundleMetadata.updatedAt) {
            return Intrinsics.areEqual(this.reactNativeVersion, bundleMetadata.reactNativeVersion);
        }
        int i11 = onTransact + 65;
        IAuthTabCallbackDefault = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onTransact + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.signature.hashCode();
        int iHashCode3 = this.deploymentId.hashCode();
        int iHashCode4 = this.deployedAt.hashCode();
        int iHashCode5 = this.sharedMinDeployedAt.hashCode();
        int iHashCode6 = Long.hashCode(this.savedAt);
        int iHashCode7 = Long.hashCode(this.updatedAt);
        String str = this.reactNativeVersion;
        if (str == null) {
            int i4 = onTransact + 19;
            IAuthTabCallbackDefault = i4 % 128;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i5 = (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode;
        int i6 = IAuthTabCallbackDefault + 67;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final BundleMetadata onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, long j2, @Nullable String str5) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        BundleMetadata bundleMetadata = new BundleMetadata(str, str2, str3, str4, j, j2, str5);
        int i2 = onTransact + 9;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 30 / 0;
        }
        return bundleMetadata;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BundleMetadata(signature=" + this.signature + ", deploymentId=" + this.deploymentId + ", deployedAt=" + this.deployedAt + ", sharedMinDeployedAt=" + this.sharedMinDeployedAt + ", savedAt=" + this.savedAt + ", updatedAt=" + this.updatedAt + ", reactNativeVersion=" + this.reactNativeVersion + ")";
        int i2 = IAuthTabCallbackDefault + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public BundleMetadata(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, long j2, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.signature = str;
        this.deploymentId = str2;
        this.deployedAt = str3;
        this.sharedMinDeployedAt = str4;
        this.savedAt = j;
        this.updatedAt = j2;
        this.reactNativeVersion = str5;
        String string = StringsKt.trim(str3).toString();
        String string2 = StringsKt.trim(str4).toString();
        if (string.length() != 0 && !new Regex("\\d{14}").onExtraCallbackWithResult(string)) {
            throw new IllegalArgumentException(("deployedAt must be empty or valid yyyyMMddHHmmss format (14 digits). Got: '" + str3 + "' (length=" + str3.length() + ", trimmed='" + string + "', trimmed length=" + string.length() + ")").toString());
        }
        if (string2.length() == 0 || new Regex("\\d{14}").onExtraCallbackWithResult(string2)) {
            if (j2 >= j) {
                int i = IAuthTabCallbackDefault + 93;
                onTransact = i % 128;
                int i2 = i % 2;
                return;
            }
            throw new IllegalArgumentException("updatedAt must be >= savedAt");
        }
        throw new IllegalArgumentException(("sharedMinDeployedAt must be empty or valid yyyyMMddHHmmss format (14 digits). Got: '" + str4 + "' (length=" + str4.length() + ", trimmed='" + string2 + "', trimmed length=" + string2.length() + ")").toString());
    }

    public static final /* synthetic */ wie2 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return json;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        BundleMetadata bundleMetadata = (BundleMetadata) objArr[0];
        vyl vylVar = (vyl) objArr[1];
        SerialDescriptor serialDescriptor = (SerialDescriptor) objArr[2];
        int i = 2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, bundleMetadata.signature);
        vylVar.onExtraCallback(serialDescriptor, 1, bundleMetadata.deploymentId);
        vylVar.onExtraCallback(serialDescriptor, 2, bundleMetadata.deployedAt);
        vylVar.onExtraCallback(serialDescriptor, 3, bundleMetadata.sharedMinDeployedAt);
        vylVar.onExtraCallback(serialDescriptor, 4, bundleMetadata.savedAt);
        vylVar.onExtraCallback(serialDescriptor, 5, bundleMetadata.updatedAt);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
            int i2 = onTransact + 31;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 32 / 0;
                if (bundleMetadata.reactNativeVersion == null) {
                    return null;
                }
            } else if (bundleMetadata.reactNativeVersion == null) {
                return null;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, bundleMetadata.reactNativeVersion);
        int i4 = onTransact + 41;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        int i5 = 5 / 5;
        return null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 95;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        String str = this.signature;
        int i5 = i2 + 23;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.deploymentId;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        BundleMetadata bundleMetadata = (BundleMetadata) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String str = bundleMetadata.deployedAt;
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return str;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 95;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sharedMinDeployedAt;
        int i5 = i2 + 83;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long asBinder() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 63;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j = this.savedAt;
        int i4 = i2 + 109;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.updatedAt;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 45;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.reactNativeVersion;
        int i5 = i2 + 109;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ BundleMetadata(int i, String str, String str2, String str3, String str4, long j, long j2, String str5, okycx okycxVar) {
        if (63 != (i & 63)) {
            int i2 = IAuthTabCallbackDefault + 103;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 63, BundleMetadata$$serializer.INSTANCE.getDescriptor());
            int i4 = onTransact + 73;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.signature = str;
        this.deploymentId = str2;
        this.deployedAt = str3;
        this.sharedMinDeployedAt = str4;
        this.savedAt = j;
        this.updatedAt = j2;
        if ((i & 64) == 0) {
            this.reactNativeVersion = null;
        } else {
            this.reactNativeVersion = str5;
        }
        String string = StringsKt.trim(str3).toString();
        String string2 = StringsKt.trim(str4).toString();
        if (string.length() != 0 && !new Regex("\\d{14}").onExtraCallbackWithResult(string)) {
            throw new IllegalArgumentException(("deployedAt must be empty or valid yyyyMMddHHmmss format (14 digits). Got: '" + str3 + "' (length=" + str3.length() + ", trimmed='" + string + "', trimmed length=" + string.length() + ")").toString());
        }
        if (string2.length() == 0 || new Regex("\\d{14}").onExtraCallbackWithResult(string2)) {
            if (j2 < j) {
                throw new IllegalArgumentException("updatedAt must be >= savedAt");
            }
            int i7 = IAuthTabCallbackDefault + 101;
            onTransact = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 12 / 0;
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("sharedMinDeployedAt must be empty or valid yyyyMMddHHmmss format (14 digits). Got: '" + str4 + "' (length=" + str4.length() + ", trimmed='" + string2 + "', trimmed length=" + string2.length() + ")").toString());
    }

    public final Date onExtraCallback() throws Throwable {
        int i = 2 % 2;
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        Object[] objArr = new Object[1];
        a((short) (115 - (KeyEvent.getMaxKeyCode() >> 16)), (byte) ((-100) - ImageFormat.getBitsPerPixel(0)), 173690829 - (ViewConfiguration.getFadingEdgeLength() >> 16), (-1748939592) - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) - 47, objArr);
        Date dateOnWarmupCompleted = setCampaign.onWarmupCompleted(new IdGeneratorExternalSyntheticLambda1(((String) objArr[0]).intern(), locale), this.deployedAt);
        if (dateOnWarmupCompleted == null) {
            int i2 = IAuthTabCallbackDefault + 87;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            dateOnWarmupCompleted = TossReactBundleMeta.Companion.onWarmupCompleted();
        }
        int i4 = onTransact + 15;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return dateOnWarmupCompleted;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BundleMetadata> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            BundleMetadata$$serializer bundleMetadata$$serializer = BundleMetadata$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 57;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return bundleMetadata$$serializer;
        }

        public final String onWarmupCompleted(@NotNull BundleMetadata bundleMetadata) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(bundleMetadata, "");
            String strOnWarmupCompleted = BundleMetadata.IAuthTabCallback().onWarmupCompleted(serializer(), bundleMetadata);
            int i4 = onNavigationEvent + 11;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return strOnWarmupCompleted;
        }

        public final BundleMetadata onExtraCallback(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity) {
            BundleMetadata bundleMetadata;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
                String strOnRelationshipValidationResult = tTAppOpenAdTransActivity.onRelationshipValidationResult();
                wie2 wie2VarIAuthTabCallback = BundleMetadata.IAuthTabCallback();
                wie2VarIAuthTabCallback.onExtraCallback();
                bundleMetadata = (BundleMetadata) wie2VarIAuthTabCallback.onExtraCallback(BundleMetadata.Companion.serializer(), strOnRelationshipValidationResult);
                int i3 = 41 / 0;
            } else {
                Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
                String strOnRelationshipValidationResult2 = tTAppOpenAdTransActivity.onRelationshipValidationResult();
                wie2 wie2VarIAuthTabCallback2 = BundleMetadata.IAuthTabCallback();
                wie2VarIAuthTabCallback2.onExtraCallback();
                bundleMetadata = (BundleMetadata) wie2VarIAuthTabCallback2.onExtraCallback(BundleMetadata.Companion.serializer(), strOnRelationshipValidationResult2);
            }
            int i4 = onWarmupCompleted + 81;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return bundleMetadata;
        }
    }

    static {
        IAuthTabCallbackStub = 1;
        asInterface();
        Companion = new Companion(null);
        json = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.rn.toss.core.bundle.model.BundleMetadata$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 15;
                onNavigationEvent = i2 % 128;
                adInfo adinfo = (adInfo) obj;
                if (i2 % 2 == 0) {
                    BundleMetadata.onExtraCallback(adinfo);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnExtraCallback = BundleMetadata.onExtraCallback(adinfo);
                int i3 = onNavigationEvent + 95;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return unitOnExtraCallback;
            }
        }, 1, (Object) null);
        int i = asBinder + 29;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onExtraCallbackWithResult(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(adinfo, "");
        adinfo.IAuthTabCallbackDefault(true);
        adinfo.IAuthTabCallback(true);
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback3, 186882589, new Object[]{adinfo, true}, iOnExtraCallback2, iOnExtraCallback);
        adinfo.onExtraCallbackWithResult(true);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 91;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - ((Process.getThreadPriority(0) + 20) >> 6)), 41 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr = onExtraCallbackWithResult;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = $11 + 41;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    for (int i8 = 0; i8 < length; i8++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) ($$b - 3);
                            byte b3 = (byte) (b2 + 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 55 - Color.alpha(0), 2167 - Drawable.resolveOpacity(0, 0), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallbackWithResult;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.indexOf("", "")), 42 - (Process.myPid() >> 22), TextUtils.lastIndexOf("", '0', 0, 0) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onExtraCallback[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i9 = $11 + 5;
                int i10 = i9 % 128;
                $10 = i10;
                int i11 = i9 % 2;
                int i12 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                if (!(!z)) {
                    int i13 = i10 + 21;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i12 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 87 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallbackWithResult;
                if (bArr4 != null) {
                    int i15 = $10 + 111;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i17 = 0; i17 < length2; i17++) {
                        bArr5[i17] = (byte) (bArr4[i17] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(BundleMetadata bundleMetadata, vyl vylVar, SerialDescriptor serialDescriptor) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        onExtraCallback(1735847774, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -1735847773, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{bundleMetadata, vylVar, serialDescriptor});
    }

    public final String onWarmupCompleted() {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onExtraCallback(2147204812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -2147204812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{this});
    }

    static void asInterface() {
        IAuthTabCallback = 1373792315;
        onNavigationEvent = -1538795482;
        onWarmupCompleted = -864457783;
        onExtraCallbackWithResult = new byte[]{-24, 34, 32, 34, 77, 34, 14, 34, 31, 34, -34, 34, 34, 34};
    }
}
