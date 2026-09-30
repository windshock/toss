package im.toss.core.tuba;

import im.toss.core.tracker.entry.CustomizableLog;
import im.toss.core.tracker.entry.TrackEvent;
import im.toss.core.tracker.entry.TrackLog;
import im.toss.core.tracker.entry.TrackState;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.EnumC0061getAntiSpoofingExtension;
import o.TombstoneProtosMemoryMappingBuilder;
import o.downloadZip;
import o.getWrite;
import o.liq;
import o.okycx;
import o.oty1;
import o.py;
import o.setSDKInstallCallBack;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Condition {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String logName;
    private final EnumC0061getAntiSpoofingExtension logType;
    private final Node parameterMatch;
    private final Long schemaId;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.core.tuba.Condition$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) Condition.onExtraCallback(561059674, new Object[0], HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -561059674, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
            int i4 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializer;
        }
    }), null, null, null};

    public static final /* synthetic */ class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[EnumC0061getAntiSpoofingExtension.values().length];
            try {
                iArr[EnumC0061getAntiSpoofingExtension.SCHEMA_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0061getAntiSpoofingExtension.EVENT.ordinal()] = 2;
                int i = IAuthTabCallback + 71;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0061getAntiSpoofingExtension.STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC0061getAntiSpoofingExtension.SCREEN.ordinal()] = 4;
                int i4 = onNavigationEvent + 63;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC0061getAntiSpoofingExtension.POPUP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            onWarmupCompleted = iArr;
        }
    }

    public Condition() {
        this((EnumC0061getAntiSpoofingExtension) null, (Long) null, (String) null, (Node) null, 15, (DefaultConstructorMarker) null);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer = (KSerializer) onExtraCallback(1183252594, new Object[0], HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1183252593, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        int i4 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = (~(i7 | i8)) | i;
        int i10 = i3 | i7;
        int i11 = (~(i3 | i)) | (~(i7 | (~i) | i8)) | (~(i | i4));
        int i12 = i + i4 + i5 + (764943627 * i6) + (189947931 * i2);
        int i13 = i12 * i12;
        int i14 = ((i * (-973936384)) - 801505280) + ((-973936384) * i4) + (1838296578 * i9) + (1228335359 * i10) + ((-1228335359) * i11) + (2092695552 * i5) + ((-1475084288) * i6) + ((-1479278592) * i2) + ((-626393088) * i13);
        int i15 = (i * 1860537600) + 224780607 + (i4 * 1860537600) + (i9 * 1034) + (i10 * (-517)) + (i11 * 517) + (i5 * 1860538117) + (i6 * (-1861700041)) + (i2 * (-831392377)) + (i13 * 995229696);
        if (i14 + (i15 * i15 * 1053163520) != 1) {
            return IAuthTabCallback(objArr);
        }
        int i16 = 2 % 2;
        int i17 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i17 % 128;
        int i18 = i17 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.core.tuba.LogType", EnumC0061getAntiSpoofingExtension.values());
        int i19 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i19 % 128;
        int i20 = i19 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 99;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 63 / 0;
            }
            return true;
        }
        if (!(obj instanceof Condition)) {
            return false;
        }
        Condition condition = (Condition) obj;
        if (this.logType != condition.logType) {
            return false;
        }
        if (!Intrinsics.areEqual(this.schemaId, condition.schemaId)) {
            int i7 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.logName, condition.logName)) {
            return false;
        }
        if (Intrinsics.areEqual(this.parameterMatch, condition.parameterMatch)) {
            return true;
        }
        int i9 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[PHI: r2 r4
      0x0023: PHI (r2v9 o.getAntiSpoofingExtension) = (r2v2 o.getAntiSpoofingExtension), (r2v10 o.getAntiSpoofingExtension) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
      0x0023: PHI (r4v5 int) = (r4v0 int), (r4v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r4
      0x001a: PHI (r4v1 int) = (r4v0 int), (r4v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        EnumC0061getAntiSpoofingExtension enumC0061getAntiSpoofingExtension;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 15;
        onExtraCallbackWithResult = i3 % 128;
        int iHashCode3 = 0;
        if (i3 % 2 != 0) {
            enumC0061getAntiSpoofingExtension = this.logType;
            iHashCode = 1;
            if (enumC0061getAntiSpoofingExtension == null) {
                int i4 = i2 + 43;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = enumC0061getAntiSpoofingExtension.hashCode();
            }
        } else {
            enumC0061getAntiSpoofingExtension = this.logType;
            iHashCode = 0;
            if (enumC0061getAntiSpoofingExtension == null) {
            }
        }
        Long l = this.schemaId;
        if (l == null) {
            int i6 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        } else {
            iHashCode3 = l.hashCode();
        }
        int iHashCode4 = this.logName.hashCode();
        Node node = this.parameterMatch;
        if (node != null) {
            iHashCode = node.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Condition(logType=" + this.logType + ", schemaId=" + this.schemaId + ", logName=" + this.logName + ", parameterMatch=" + this.parameterMatch + ")";
        int i2 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Condition> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Condition$$serializer condition$$serializer = Condition$$serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 8 / 0;
            }
            return condition$$serializer;
        }
    }

    static {
        int i = onNavigationEvent + 71;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Condition(int i, EnumC0061getAntiSpoofingExtension enumC0061getAntiSpoofingExtension, Long l, String str, Node node, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.logType = null;
        } else {
            this.logType = enumC0061getAntiSpoofingExtension;
        }
        if ((i & 2) == 0) {
            int i2 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.schemaId = null;
        } else {
            this.schemaId = l;
            int i4 = 2 % 2;
        }
        if ((i & 4) == 0) {
            this.logName = "";
            int i5 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 3;
            }
            if ((i & 8) == 0) {
                this.parameterMatch = node;
                return;
            }
            int i7 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            this.parameterMatch = null;
            if (i8 != 0) {
                throw null;
            }
            return;
        }
        this.logName = str;
        int i9 = 2 % 2;
        if ((i & 8) == 0) {
        }
    }

    public Condition(@Nullable EnumC0061getAntiSpoofingExtension enumC0061getAntiSpoofingExtension, @Nullable Long l, @NotNull String str, @Nullable Node node) {
        Intrinsics.checkNotNullParameter(str, "");
        this.logType = enumC0061getAntiSpoofingExtension;
        this.schemaId = l;
        this.logName = str;
        this.parameterMatch = node;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(Condition condition, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                EnumC0061getAntiSpoofingExtension enumC0061getAntiSpoofingExtension = condition.logType;
                throw null;
            }
            if (condition.logType != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, (py) lazyArr[0].getValue(), condition.logType);
            }
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 1)) || condition.schemaId != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, condition.schemaId);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || (true ^ Intrinsics.areEqual(condition.logName, ""))) {
            vylVar.onExtraCallback(serialDescriptor, 2, condition.logName);
            int i5 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i7 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            if (condition.parameterMatch == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, Node$$serializer.INSTANCE, condition.parameterMatch);
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Condition(EnumC0061getAntiSpoofingExtension enumC0061getAntiSpoofingExtension, Long l, String str, Node node, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            enumC0061getAntiSpoofingExtension = null;
        }
        if ((i & 2) != 0) {
            int i4 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = 2 % 2;
            l = null;
        }
        if ((i & 4) != 0) {
            int i6 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i7 = 2 % 2;
            str = "";
        }
        this(enumC0061getAntiSpoofingExtension, l, str, (i & 8) != 0 ? null : node);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallback(@NotNull downloadZip downloadzip) throws NoWhenBranchMatchedException {
        boolean zOnExtraCallback;
        Node node;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(downloadzip, "");
        Pair<Long, String> pairIAuthTabCallback = IAuthTabCallback(downloadzip);
        Long l = (Long) pairIAuthTabCallback.onExtraCallbackWithResult();
        String str = (String) pairIAuthTabCallback.IAuthTabCallback();
        if (l == null) {
            int i2 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!onWarmupCompleted(downloadzip)) {
                return false;
            }
        }
        EnumC0061getAntiSpoofingExtension enumC0061getAntiSpoofingExtension = this.logType;
        int i4 = enumC0061getAntiSpoofingExtension == null ? -1 : onExtraCallbackWithResult.onWarmupCompleted[enumC0061getAntiSpoofingExtension.ordinal()];
        if (i4 == -1) {
            return false;
        }
        if (i4 == 1) {
            zOnExtraCallback = onExtraCallback(l);
        } else {
            if (i4 != 2 && i4 != 3) {
                if (i4 != 4) {
                    int i5 = IAuthTabCallback + 73;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    if (i4 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (!onExtraCallback(l) && !onNavigationEvent(str)) {
                    return false;
                }
                int i7 = onExtraCallbackWithResult + 75;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                node = this.parameterMatch;
                if (node == null && !setSDKInstallCallBack.onExtraCallback(node, downloadzip)) {
                    return false;
                }
                int i9 = IAuthTabCallback + 61;
                onExtraCallbackWithResult = i9 % 128;
                return i9 % 2 != 0;
            }
            zOnExtraCallback = onNavigationEvent(str);
        }
        if (!zOnExtraCallback) {
            return false;
        }
        int i72 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i72 % 128;
        int i82 = i72 % 2;
        node = this.parameterMatch;
        if (node == null) {
        }
        int i92 = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i92 % 128;
        if (i92 % 2 != 0) {
        }
    }

    private final boolean onWarmupCompleted(downloadZip downloadzip) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(downloadzip);
        if (strOnNavigationEvent != null) {
            EnumC0061getAntiSpoofingExtension enumC0061getAntiSpoofingExtension = this.logType;
            return StringsKt.equals(enumC0061getAntiSpoofingExtension != null ? enumC0061getAntiSpoofingExtension.name() : null, strOnNavigationEvent, true);
        }
        int i4 = IAuthTabCallback;
        int i5 = i4 + 85;
        onExtraCallbackWithResult = i5 % 128;
        boolean z = i5 % 2 != 0;
        int i6 = i4 + 93;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    private final String onNavigationEvent(downloadZip downloadzip) {
        int i = 2 % 2;
        if (downloadzip instanceof TrackState) {
            return "state";
        }
        if (downloadzip instanceof TrackEvent) {
            int i2 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 67 / 0;
            }
            return "event";
        }
        Object obj = null;
        if (!(downloadzip instanceof CustomizableLog)) {
            int i4 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        int i5 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        String strIAuthTabCallbackStubProxy = ((CustomizableLog) downloadzip).IAuthTabCallbackStubProxy();
        if (strIAuthTabCallbackStubProxy.length() == 0) {
            int i7 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i8 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            return strIAuthTabCallbackStubProxy;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 java.lang.Long) = (r1v4 java.lang.Long), (r1v10 java.lang.Long) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onExtraCallback(Long l) {
        Long l2;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            l2 = this.schemaId;
            int i3 = 77 / 0;
            if (l2 != null) {
                long jLongValue = l2.longValue();
                if (l != null && l.longValue() == jLongValue && l.longValue() != 1005312) {
                    int i4 = onExtraCallbackWithResult + 71;
                    int i5 = i4 % 128;
                    IAuthTabCallback = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 105;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 57 / 0;
                    }
                    return true;
                }
            }
        } else {
            l2 = this.schemaId;
            if (l2 != null) {
            }
        }
        return false;
    }

    private final boolean onNavigationEvent(String str) {
        int i = 2 % 2;
        if (this.logName.length() <= 0) {
            return false;
        }
        int i2 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (!Intrinsics.areEqual(str, this.logName)) {
            return false;
        }
        int i4 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.areEqual(str, "tuba_trigger");
            throw null;
        }
        if (Intrinsics.areEqual(str, "tuba_trigger")) {
            return false;
        }
        int i5 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private final Pair<Long, String> IAuthTabCallback(downloadZip downloadzip) {
        int i = 2 % 2;
        Object obj = null;
        if (downloadzip instanceof TrackLog) {
            int i2 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return getWrite.IAuthTabCallback(Long.valueOf(((TrackLog) downloadzip).getInterfaceDescriptor()), (Object) null);
            }
            int i3 = 3 / 0;
            return getWrite.IAuthTabCallback(Long.valueOf(((TrackLog) downloadzip).getInterfaceDescriptor()), (Object) null);
        }
        if (downloadzip instanceof TrackState) {
            int i4 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return getWrite.IAuthTabCallback((Object) null, ((TrackState) downloadzip).getInterfaceDescriptor());
            }
            getWrite.IAuthTabCallback((Object) null, ((TrackState) downloadzip).getInterfaceDescriptor());
            obj.hashCode();
            throw null;
        }
        if (downloadzip instanceof TrackEvent) {
            return getWrite.IAuthTabCallback((Object) null, ((TrackEvent) downloadzip).getInterfaceDescriptor());
        }
        if (!(downloadzip instanceof CustomizableLog)) {
            return getWrite.IAuthTabCallback((Object) null, (Object) null);
        }
        int i5 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        CustomizableLog customizableLog = (CustomizableLog) downloadzip;
        Pair<Long, String> pairIAuthTabCallback = getWrite.IAuthTabCallback(customizableLog.access000(), customizableLog.IAuthTabCallback_Parcel());
        int i7 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return pairIAuthTabCallback;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        return (KSerializer) onExtraCallback(561059674, new Object[0], HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -561059674, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        return (KSerializer) onExtraCallback(1183252594, new Object[0], HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1183252593, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }
}
