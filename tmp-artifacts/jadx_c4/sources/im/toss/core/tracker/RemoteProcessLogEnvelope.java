package im.toss.core.tracker;

import im.toss.core.tracker.RemoteProcessLogKind;
import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access8100;
import o.encryptType4;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RemoteProcessLogEnvelope {
    private static int IAuthTabCallback = 1;
    public static final int SCHEMA_VERSION = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final RemoteProcessAppLog appLog;
    private final String createdAt;
    private final RemoteProcessEventLogOptions eventOptions;
    private final String id;
    private final boolean immediate;
    private final RemoteProcessLogKind kind;
    private final JsonObject payload;
    private final int schemaVersion;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.core.tracker.RemoteProcessLogEnvelope$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnWarmupCompleted = RemoteProcessLogEnvelope.onWarmupCompleted();
            int i4 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerOnWarmupCompleted;
            }
            throw null;
        }
    }), null, null, null, null};

    private static final /* synthetic */ KSerializer access100() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RemoteProcessLogKind.Companion companion = RemoteProcessLogKind.Companion;
        if (i3 == 0) {
            return companion.serializer();
        }
        companion.serializer();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~i4;
        int i11 = i9 | (~(i10 | i6));
        int i12 = i8 | i5;
        int i13 = ~(i12 | i4);
        int i14 = (~(i6 | i7)) | (~(i8 | i10)) | (~i12);
        int i15 = i5 + i4 + i + (1650861130 * i3) + ((-924421097) * i2);
        int i16 = i15 * i15;
        int i17 = (i5 * (-405912681)) + 1474035712 + ((-405912681) * i4) + (i11 * (-1619411862)) + (1619411862 * i13) + ((-1619411862) * i14) + ((-2025324544) * i) + (986710016 * i3) + ((-948436992) * i2) + ((-1864630272) * i16);
        int i18 = ((i5 * (-959335331)) - 587927435) + (i4 * (-959335331)) + (i11 * 462) + (i13 * (-462)) + (i14 * 462) + (i * (-959334869)) + (i3 * 22983790) + (i2 * 637852125) + (i16 * (-1124859904));
        if (i17 + (i18 * i18 * (-1807482880)) == 1) {
            return onNavigationEvent(objArr);
        }
        RemoteProcessLogEnvelope remoteProcessLogEnvelope = (RemoteProcessLogEnvelope) objArr[0];
        int i19 = 2 % 2;
        int i20 = onNavigationEvent + 71;
        int i21 = i20 % 128;
        onExtraCallback = i21;
        int i22 = i20 % 2;
        JsonObject jsonObject = remoteProcessLogEnvelope.payload;
        int i23 = i21 + 85;
        onNavigationEvent = i23 % 128;
        int i24 = i23 % 2;
        return jsonObject;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAccess100 = access100();
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        return kSerializerAccess100;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof RemoteProcessLogEnvelope)) {
            return false;
        }
        RemoteProcessLogEnvelope remoteProcessLogEnvelope = (RemoteProcessLogEnvelope) obj;
        if (this.schemaVersion != remoteProcessLogEnvelope.schemaVersion) {
            return false;
        }
        if (!Intrinsics.areEqual(this.id, remoteProcessLogEnvelope.id)) {
            int i4 = onNavigationEvent + 67;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.createdAt, remoteProcessLogEnvelope.createdAt) || this.kind != remoteProcessLogEnvelope.kind || this.immediate != remoteProcessLogEnvelope.immediate || !Intrinsics.areEqual(this.payload, remoteProcessLogEnvelope.payload)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.eventOptions, remoteProcessLogEnvelope.eventOptions)) {
            int i6 = onNavigationEvent + 61;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.appLog, remoteProcessLogEnvelope.appLog)) {
            return true;
        }
        int i8 = onNavigationEvent + 89;
        onExtraCallback = i8 % 128;
        return i8 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int iHashCode = Integer.hashCode(this.schemaVersion);
        int iHashCode2 = this.id.hashCode();
        int iHashCode3 = this.createdAt.hashCode();
        int iHashCode4 = this.kind.hashCode();
        int iHashCode5 = Boolean.hashCode(this.immediate);
        int iHashCode6 = this.payload.hashCode();
        RemoteProcessEventLogOptions remoteProcessEventLogOptions = this.eventOptions;
        int iHashCode7 = 0;
        int iHashCode8 = remoteProcessEventLogOptions == null ? 0 : remoteProcessEventLogOptions.hashCode();
        RemoteProcessAppLog remoteProcessAppLog = this.appLog;
        if (remoteProcessAppLog != null) {
            int i2 = onNavigationEvent + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode7 = remoteProcessAppLog.hashCode();
            int i4 = onExtraCallback + 93;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode8) * 31) + iHashCode7;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteProcessLogEnvelope(schemaVersion=" + this.schemaVersion + ", id=" + this.id + ", createdAt=" + this.createdAt + ", kind=" + this.kind + ", immediate=" + this.immediate + ", payload=" + this.payload + ", eventOptions=" + this.eventOptions + ", appLog=" + this.appLog + ")";
        int i2 = onExtraCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ RemoteProcessLogEnvelope(int i, int i2, String str, String str2, RemoteProcessLogKind remoteProcessLogKind, boolean z, JsonObject jsonObject, RemoteProcessEventLogOptions remoteProcessEventLogOptions, RemoteProcessAppLog remoteProcessAppLog, okycx okycxVar) {
        if (14 != (i & 14)) {
            htf31.onExtraCallbackWithResult(i, 14, RemoteProcessLogEnvelope$$serializer.INSTANCE.getDescriptor());
        }
        this.schemaVersion = (i & 1) == 0 ? 1 : i2;
        this.id = str;
        this.createdAt = str2;
        this.kind = remoteProcessLogKind;
        if ((i & 16) == 0) {
            int i3 = onNavigationEvent + 77;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            this.immediate = false;
        } else {
            this.immediate = z;
        }
        if ((i & 32) == 0) {
            this.payload = new JsonObject(access8100.onNavigationEvent());
        } else {
            this.payload = jsonObject;
        }
        int i5 = 2 % 2;
        if ((i & 64) == 0) {
            this.eventOptions = null;
        } else {
            this.eventOptions = remoteProcessEventLogOptions;
            int i6 = onExtraCallback + 79;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        }
        if ((i & 128) != 0) {
            this.appLog = remoteProcessAppLog;
            return;
        }
        int i9 = onNavigationEvent + 91;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        this.appLog = null;
        if (i10 != 0) {
            throw null;
        }
    }

    public RemoteProcessLogEnvelope(int i, @NotNull String str, @NotNull String str2, @NotNull RemoteProcessLogKind remoteProcessLogKind, boolean z, @NotNull JsonObject jsonObject, @Nullable RemoteProcessEventLogOptions remoteProcessEventLogOptions, @Nullable RemoteProcessAppLog remoteProcessAppLog) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(remoteProcessLogKind, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        this.schemaVersion = i;
        this.id = str;
        this.createdAt = str2;
        this.kind = remoteProcessLogKind;
        this.immediate = z;
        this.payload = jsonObject;
        this.eventOptions = remoteProcessEventLogOptions;
        this.appLog = remoteProcessAppLog;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 77;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 3;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(RemoteProcessLogEnvelope remoteProcessLogEnvelope, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || remoteProcessLogEnvelope.schemaVersion != 1) {
            vylVar.onExtraCallback(serialDescriptor, 0, remoteProcessLogEnvelope.schemaVersion);
        }
        vylVar.onExtraCallback(serialDescriptor, 1, remoteProcessLogEnvelope.id);
        vylVar.onExtraCallback(serialDescriptor, 2, remoteProcessLogEnvelope.createdAt);
        vylVar.onNavigationEvent(serialDescriptor, 3, (py) lazyArr[3].getValue(), remoteProcessLogEnvelope.kind);
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || remoteProcessLogEnvelope.immediate) {
            vylVar.onNavigationEvent(serialDescriptor, 4, remoteProcessLogEnvelope.immediate);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || !Intrinsics.areEqual(remoteProcessLogEnvelope.payload, new JsonObject(access8100.onNavigationEvent()))) {
            vylVar.onNavigationEvent(serialDescriptor, 5, encryptType4.IAuthTabCallback, remoteProcessLogEnvelope.payload);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || remoteProcessLogEnvelope.eventOptions != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, RemoteProcessEventLogOptions$$serializer.INSTANCE, remoteProcessLogEnvelope.eventOptions);
            int i4 = onExtraCallback + 81;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || remoteProcessLogEnvelope.appLog != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 7, RemoteProcessAppLog$$serializer.INSTANCE, remoteProcessLogEnvelope.appLog);
        }
    }

    public /* synthetic */ RemoteProcessLogEnvelope(int i, String str, String str2, RemoteProcessLogKind remoteProcessLogKind, boolean z, JsonObject jsonObject, RemoteProcessEventLogOptions remoteProcessEventLogOptions, RemoteProcessAppLog remoteProcessAppLog, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3;
        boolean z2;
        JsonObject jsonObject2;
        RemoteProcessAppLog remoteProcessAppLog2;
        if ((i2 & 1) != 0) {
            int i4 = onExtraCallback + 11;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            i3 = 1;
        } else {
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            int i6 = 2 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i2 & 32) != 0) {
            int i7 = 2 % 2;
            jsonObject2 = new JsonObject(access8100.onNavigationEvent());
        } else {
            jsonObject2 = jsonObject;
        }
        RemoteProcessEventLogOptions remoteProcessEventLogOptions2 = (i2 & 64) != 0 ? null : remoteProcessEventLogOptions;
        if ((i2 & 128) != 0) {
            int i8 = onExtraCallback + 73;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            int i9 = 2 % 2;
            remoteProcessAppLog2 = null;
        } else {
            remoteProcessAppLog2 = remoteProcessAppLog;
        }
        this(i3, str, str2, remoteProcessLogKind, z2, jsonObject2, remoteProcessEventLogOptions2, remoteProcessAppLog2);
    }

    public final int asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.schemaVersion;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        RemoteProcessLogEnvelope remoteProcessLogEnvelope = (RemoteProcessLogEnvelope) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 119;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = remoteProcessLogEnvelope.id;
        int i5 = i2 + 85;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.createdAt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RemoteProcessLogKind onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 75;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        RemoteProcessLogKind remoteProcessLogKind = this.kind;
        int i4 = i2 + 85;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return remoteProcessLogKind;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.immediate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RemoteProcessEventLogOptions onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        RemoteProcessEventLogOptions remoteProcessEventLogOptions = this.eventOptions;
        int i4 = i3 + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return remoteProcessEventLogOptions;
    }

    public final RemoteProcessAppLog IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 101;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        RemoteProcessAppLog remoteProcessAppLog = this.appLog;
        int i5 = i2 + 21;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return remoteProcessAppLog;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RemoteProcessLogEnvelope> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            RemoteProcessLogEnvelope$$serializer remoteProcessLogEnvelope$$serializer = RemoteProcessLogEnvelope$$serializer.INSTANCE;
            if (i3 == 0) {
                return remoteProcessLogEnvelope$$serializer;
            }
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 7;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final String IAuthTabCallbackStub() {
        int iOnExtraCallback = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (String) onExtraCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1133045555, 1133045556, iOnExtraCallback);
    }

    public final JsonObject asInterface() {
        int iOnExtraCallback = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (JsonObject) onExtraCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1465023755, 1465023755, iOnExtraCallback);
    }
}
