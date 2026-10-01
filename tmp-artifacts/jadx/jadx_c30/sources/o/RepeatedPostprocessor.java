package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RepeatedPostprocessor {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("bottomDescription")
    private final String bottomDescription;

    @SerializedName("description")
    private final String description;

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName("eventEnabled")
    private final boolean eventEnabled;

    @SerializedName("groupId")
    private long groupId;

    @SerializedName("hint")
    private final String hint;

    @SerializedName("iconUri")
    private final String iconUri;

    @SerializedName("imageUri")
    private final String imageUri;

    @SerializedName("initialRelease")
    private final boolean initialRelease;

    @SerializedName("linkUri")
    private final String linkUri;
    private final onNavigationEvent logParams;

    @SerializedName("lottieUri")
    private final String lottieUri;

    @SerializedName("menuEntryId")
    private final long menuEntryId;

    @SerializedName("menuIdx")
    private int menuIdx;

    @SerializedName(verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_MESSAGE)
    private final String message;

    @SerializedName("order")
    private final int order;

    @SerializedName("ordering")
    private final int ordering;

    @SerializedName("organizations")
    private List<String> organizations;

    @SerializedName("serviceId")
    private final long serviceId;

    @SerializedName("serviceTitle")
    private final String serviceTitle;

    @SerializedName("updatedVersion")
    private String updatedVersion;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int $stable = 8;
    private static final long NEW_WINDOW = DERSet.onExtraCallback.onNavigationEvent() * 86400000;

    public static final class IAuthTabCallback {
        public static final int $stable = 8;
        private RepeatedPostprocessor service;
    }

    public static final class onExtraCallback {
        public static final int $stable = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final boolean highlightInteractionEnabled;
        private final long menuEntryId;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (this.menuEntryId != onextracallback.menuEntryId) {
                int i2 = onExtraCallbackWithResult + 71;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (this.highlightInteractionEnabled == onextracallback.highlightInteractionEnabled) {
                return true;
            }
            int i4 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i2 % 128;
            return i2 % 2 == 0 ? (Long.hashCode(this.menuEntryId) / 116) * Boolean.hashCode(this.highlightInteractionEnabled) : (Long.hashCode(this.menuEntryId) * 31) + Boolean.hashCode(this.highlightInteractionEnabled);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ServiceHighlightEvent(menuEntryId=" + this.menuEntryId + ", highlightInteractionEnabled=" + this.highlightInteractionEnabled + ")";
            int i2 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }

    public RepeatedPostprocessor() {
        this(0L, 0L, null, 0L, 0, null, null, null, null, null, null, null, false, false, false, null, null, 0, 0, null, 1048575, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 15;
            onExtraCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof RepeatedPostprocessor)) {
            return false;
        }
        RepeatedPostprocessor repeatedPostprocessor = (RepeatedPostprocessor) obj;
        if (this.menuEntryId != repeatedPostprocessor.menuEntryId) {
            int i3 = onExtraCallbackWithResult + 17;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.serviceId != repeatedPostprocessor.serviceId) {
            int i5 = onExtraCallbackWithResult + 87;
            onExtraCallback = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.serviceTitle, repeatedPostprocessor.serviceTitle)) {
            int i6 = onExtraCallback;
            int i7 = i6 + 43;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 33;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.groupId != repeatedPostprocessor.groupId) {
            return false;
        }
        if (this.ordering != repeatedPostprocessor.ordering) {
            int i11 = onExtraCallback + 11;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.description, repeatedPostprocessor.description) || !Intrinsics.areEqual(this.bottomDescription, repeatedPostprocessor.bottomDescription) || !Intrinsics.areEqual(this.hint, repeatedPostprocessor.hint)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.iconUri, repeatedPostprocessor.iconUri)) {
            int i13 = onExtraCallbackWithResult + 69;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.lottieUri, repeatedPostprocessor.lottieUri) || !Intrinsics.areEqual(this.linkUri, repeatedPostprocessor.linkUri) || !Intrinsics.areEqual(this.updatedVersion, repeatedPostprocessor.updatedVersion)) {
            return false;
        }
        if (this.enabled != repeatedPostprocessor.enabled) {
            int i15 = onExtraCallbackWithResult + 19;
            onExtraCallback = i15 % 128;
            return i15 % 2 == 0;
        }
        if (this.eventEnabled != repeatedPostprocessor.eventEnabled || this.initialRelease != repeatedPostprocessor.initialRelease || !Intrinsics.areEqual(this.imageUri, repeatedPostprocessor.imageUri)) {
            return false;
        }
        if (Intrinsics.areEqual(this.message, repeatedPostprocessor.message)) {
            return this.order == repeatedPostprocessor.order && this.menuIdx == repeatedPostprocessor.menuIdx && Intrinsics.areEqual(this.organizations, repeatedPostprocessor.organizations);
        }
        int i16 = onExtraCallbackWithResult;
        int i17 = i16 + 121;
        onExtraCallback = i17 % 128;
        boolean z = i17 % 2 == 0;
        int i18 = i16 + 9;
        onExtraCallback = i18 % 128;
        int i19 = i18 % 2;
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((((((((((((((((((Long.hashCode(this.menuEntryId) * 31) + Long.hashCode(this.serviceId)) * 31) + this.serviceTitle.hashCode()) * 31) + Long.hashCode(this.groupId)) * 31) + Integer.hashCode(this.ordering)) * 31) + this.description.hashCode()) * 31) + this.bottomDescription.hashCode()) * 31) + this.hint.hashCode()) * 31) + this.iconUri.hashCode()) * 31) + this.lottieUri.hashCode()) * 31) + this.linkUri.hashCode()) * 31) + this.updatedVersion.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.eventEnabled)) * 31) + Boolean.hashCode(this.initialRelease)) * 31) + this.imageUri.hashCode()) * 31) + this.message.hashCode()) * 31) + Integer.hashCode(this.order)) * 31) + Integer.hashCode(this.menuIdx)) * 31) + this.organizations.hashCode();
        int i4 = onExtraCallbackWithResult + 25;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Service(menuEntryId=" + this.menuEntryId + ", serviceId=" + this.serviceId + ", serviceTitle=" + this.serviceTitle + ", groupId=" + this.groupId + ", ordering=" + this.ordering + ", description=" + this.description + ", bottomDescription=" + this.bottomDescription + ", hint=" + this.hint + ", iconUri=" + this.iconUri + ", lottieUri=" + this.lottieUri + ", linkUri=" + this.linkUri + ", updatedVersion=" + this.updatedVersion + ", enabled=" + this.enabled + ", eventEnabled=" + this.eventEnabled + ", initialRelease=" + this.initialRelease + ", imageUri=" + this.imageUri + ", message=" + this.message + ", order=" + this.order + ", menuIdx=" + this.menuIdx + ", organizations=" + this.organizations + ")";
        int i2 = onExtraCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public RepeatedPostprocessor(long j, long j2, @NotNull String str, long j3, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, boolean z2, boolean z3, @NotNull String str9, @NotNull String str10, int i2, int i3, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str4, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str5, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str6, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str7, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str8, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str9, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str10, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        this.menuEntryId = j;
        this.serviceId = j2;
        this.serviceTitle = str;
        this.groupId = j3;
        this.ordering = i;
        this.description = str2;
        this.bottomDescription = str3;
        this.hint = str4;
        this.iconUri = str5;
        this.lottieUri = str6;
        this.linkUri = str7;
        this.updatedVersion = str8;
        this.enabled = z;
        this.eventEnabled = z2;
        this.initialRelease = z3;
        this.imageUri = str9;
        this.message = str10;
        this.order = i2;
        this.menuIdx = i3;
        this.organizations = list;
        this.logParams = new onNavigationEvent(null, null, null, 7, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RepeatedPostprocessor(long j, long j2, String str, long j3, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, String str9, String str10, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        long j4;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        boolean z4;
        boolean z5;
        boolean z6;
        String str19;
        String str20;
        int i5;
        String str21;
        String str22;
        int i6;
        if ((i4 & 1) != 0) {
            int i7 = 2 % 2;
            j4 = 0;
        } else {
            j4 = j;
        }
        long j5 = (i4 & 2) != 0 ? 0L : j2;
        if ((i4 & 4) != 0) {
            int i8 = onExtraCallbackWithResult + 89;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            str11 = BuildConfig.FLAVOR;
        } else {
            str11 = str;
        }
        long j6 = (i4 & 8) == 0 ? j3 : 0L;
        int i10 = (i4 & 16) != 0 ? 0 : i;
        String str23 = (i4 & 32) != 0 ? BuildConfig.FLAVOR : str2;
        if ((i4 & 64) != 0) {
            int i11 = onExtraCallbackWithResult + 89;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            str12 = BuildConfig.FLAVOR;
        } else {
            str12 = str3;
        }
        String str24 = (i4 & 128) != 0 ? BuildConfig.FLAVOR : str4;
        if ((i4 & 256) != 0) {
            int i13 = onExtraCallback + 55;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            str13 = BuildConfig.FLAVOR;
        } else {
            str13 = str5;
        }
        String str25 = (i4 & 512) != 0 ? BuildConfig.FLAVOR : str6;
        if ((i4 & 1024) != 0) {
            int i15 = onExtraCallbackWithResult + 103;
            str14 = BuildConfig.FLAVOR;
            onExtraCallback = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 2 % 2;
            }
            str15 = str14;
        } else {
            str14 = BuildConfig.FLAVOR;
            str15 = str7;
        }
        if ((i4 & 2048) != 0) {
            int i17 = onExtraCallback + 65;
            str16 = str15;
            onExtraCallbackWithResult = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 52 / 0;
            }
            int i19 = 2 % 2;
            str17 = str14;
        } else {
            str16 = str15;
            str17 = str8;
        }
        if ((i4 & PKIFailureInfo.certConfirmed) != 0) {
            int i20 = onExtraCallbackWithResult + 95;
            str18 = str17;
            onExtraCallback = i20 % 128;
            int i21 = i20 % 2;
            z4 = false;
        } else {
            str18 = str17;
            z4 = z;
        }
        boolean z7 = (i4 & PKIFailureInfo.certRevoked) != 0 ? false : z2;
        boolean z8 = (i4 & 16384) != 0 ? false : z3;
        if ((i4 & 32768) != 0) {
            z6 = z8;
            int i22 = onExtraCallbackWithResult + 55;
            z5 = z4;
            onExtraCallback = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = 40 / 0;
            }
            str19 = str14;
        } else {
            z5 = z4;
            z6 = z8;
            str19 = str9;
        }
        if ((65536 & i4) != 0) {
            int i24 = onExtraCallback + 125;
            str20 = str19;
            onExtraCallbackWithResult = i24 % 128;
            if (i24 % 2 != 0) {
                i5 = 0;
                int i25 = 47 / 0;
            } else {
                i5 = 0;
            }
            int i26 = 2 % 2;
            str21 = str14;
        } else {
            str20 = str19;
            i5 = 0;
            str21 = str10;
        }
        int i27 = (131072 & i4) != 0 ? i5 : i2;
        if ((i4 & PKIFailureInfo.transactionIdInUse) != 0) {
            i6 = i27;
            int i28 = onExtraCallbackWithResult + 123;
            str22 = str21;
            onExtraCallback = i28 % 128;
            if (i28 % 2 != 0) {
                int i29 = 2 % 2;
            }
        } else {
            str22 = str21;
            i6 = i27;
            i5 = i3;
        }
        this(j4, j5, str11, j6, i10, str23, str12, str24, str13, str25, str16, str18, z5, z7, z6, str20, str22, i6, i5, (i4 & PKIFailureInfo.signerNotTrusted) != 0 ? CollectionsKt.emptyList() : list);
    }

    public static final class onNavigationEvent {
        public static final int $stable = 8;
        private String groupServiceCount;
        private String groupTitle;
        private String index;
        private static final byte[] $$a = {57, 126, 65, 8};
        private static final int $$b = 62;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static char[] onNavigationEvent = {40401};
        private static long onWarmupCompleted = -2174327453986005109L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, byte b, short s2) {
            int i;
            int i2 = 97 - (s * 4);
            byte[] bArr = $$a;
            int i3 = b * 3;
            int i4 = 3 - (s2 * 3);
            byte[] bArr2 = new byte[i3 + 1];
            if (bArr == null) {
                int i5 = i3;
                i = 0;
                i2 += -i5;
                bArr2[i] = (byte) i2;
                i4++;
                if (i == i3) {
                    return new String(bArr2, 0);
                }
                i++;
                i5 = bArr[i4];
                i2 += -i5;
                bArr2[i] = (byte) i2;
                i4++;
                if (i == i3) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i2;
                i4++;
                if (i == i3) {
                }
            }
        }

        public onNavigationEvent() {
            this(null, null, null, 7, null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 59;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i4 = onExtraCallbackWithResult + 101;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!Intrinsics.areEqual(this.index, onnavigationevent.index)) {
                int i6 = onExtraCallbackWithResult;
                int i7 = i6 + 33;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                int i9 = i6 + 37;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.groupTitle, onnavigationevent.groupTitle)) {
                return false;
            }
            if (Intrinsics.areEqual(this.groupServiceCount, onnavigationevent.groupServiceCount)) {
                return true;
            }
            int i11 = onExtraCallback + 115;
            onExtraCallbackWithResult = i11 % 128;
            if (i11 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((this.index.hashCode() * 31) + this.groupTitle.hashCode()) * 31) + this.groupServiceCount.hashCode();
            int i4 = onExtraCallback + 107;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 14 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "LogPrams(index=" + this.index + ", groupTitle=" + this.groupTitle + ", groupServiceCount=" + this.groupServiceCount + ")";
            int i2 = onExtraCallbackWithResult + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = $11 + 123;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (Process.myPid() >> 22)), 18 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 31 - KeyEvent.normalizeMetaState(0), TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49122), ((Process.getThreadPriority(0) + 20) >> 6) + 44, KeyEvent.getDeadChar(0, 0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    Object[] objArr5 = {Integer.valueOf(onNavigationEvent[i + i6])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 17 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 46134), (ViewConfiguration.getEdgeSlop() >> 16) + 31, Color.red(0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback6 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 49123), (ViewConfiguration.getTouchSlop() >> 8) + 44, View.resolveSizeAndState(0, 0, 0) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i7 = $10 + 9;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback7 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 49123), 44 - View.resolveSize(0, 0), 1493 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
            }
            objArr[0] = new String(cArr);
        }

        public onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
            this.index = str;
            this.groupTitle = str2;
            this.groupServiceCount = str3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onNavigationEvent(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
            if ((i & 1) != 0) {
                int i2 = onExtraCallback + 117;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
                str = BuildConfig.FLAVOR;
            }
            if ((i & 2) != 0) {
                int i4 = onExtraCallbackWithResult + 99;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                int i5 = 2 % 2;
                str2 = BuildConfig.FLAVOR;
            }
            if ((i & 4) != 0) {
                int i6 = onExtraCallbackWithResult + 69;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr = new Object[1];
                a(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1 - Gravity.getAbsoluteGravity(0, 0), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 28725), objArr);
                str3 = ((String) objArr[0]).intern();
                int i8 = 2 % 2;
            }
            this(str, str2, str3);
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    static {
        int i = onWarmupCompleted + 121;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
