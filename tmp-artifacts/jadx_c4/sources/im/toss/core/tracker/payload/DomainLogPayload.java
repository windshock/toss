package im.toss.core.tracker.payload;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.GetFeatureExtension;
import o.GetMotionInteractionState;
import o.InterfaceC0059deInitialize;
import o.PangleEncryptUtilsType4;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkValidYaw;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.sp;
import o.vyl;
import o.wie2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DomainLogPayload implements InterfaceC0059deInitialize {
    private static int IAuthTabCallback = 1;
    public static final String STORE_ID = "domainLog";
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String company;
    private final String domain;
    private final String logId;
    private final String logName;
    private final String logTime;
    private final Map<String, Object> params;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.core.tracker.payload.DomainLogPayload$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnNavigationEvent = DomainLogPayload.onNavigationEvent();
            int i4 = onExtraCallback + 57;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnNavigationEvent;
        }
    }), null, null, null, null};

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DomainLogPayload onNavigationEvent(DomainLogPayload domainLogPayload, String str, Map map, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 23;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            str = domainLogPayload.domain;
        }
        if ((i & 2) != 0) {
            int i6 = i3 + 49;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                Map<String, Object> map2 = domainLogPayload.params;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            map = domainLogPayload.params;
        }
        if ((i & 4) != 0) {
            int i7 = IAuthTabCallback + 85;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            str2 = domainLogPayload.logId;
        }
        if ((i & 8) != 0) {
            str3 = domainLogPayload.logTime;
        }
        return domainLogPayload.onNavigationEvent(str, map, str2, str3);
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnTransact = onTransact();
        int i4 = IAuthTabCallback + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
        return kSerializerOnTransact;
    }

    private static final /* synthetic */ KSerializer onTransact() {
        int i = 2 % 2;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(GetMotionInteractionState.onExtraCallback));
        int i2 = IAuthTabCallback + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return getmutilbackgrounddrawable;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DomainLogPayload)) {
            return false;
        }
        DomainLogPayload domainLogPayload = (DomainLogPayload) obj;
        if (Intrinsics.areEqual(this.domain, domainLogPayload.domain)) {
            if (Intrinsics.areEqual(this.params, domainLogPayload.params)) {
                return Intrinsics.areEqual(this.logId, domainLogPayload.logId) && Intrinsics.areEqual(this.logTime, domainLogPayload.logTime);
            }
            int i2 = IAuthTabCallback + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = IAuthTabCallback;
        int i5 = i4 + 33;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 27;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.domain.hashCode() * 31) + this.params.hashCode()) * 31) + this.logId.hashCode()) * 31) + this.logTime.hashCode();
        int i4 = onExtraCallback + 91;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return iHashCode;
    }

    public final DomainLogPayload onNavigationEvent(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull String str2, @NotNull String str3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        DomainLogPayload domainLogPayload = new DomainLogPayload(str, map, str2, str3);
        int i2 = IAuthTabCallback + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return domainLogPayload;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DomainLogPayload(domain=" + this.domain + ", params=" + this.params + ", logId=" + this.logId + ", logTime=" + this.logTime + ")";
        int i2 = IAuthTabCallback + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ DomainLogPayload(int i, String str, Map map, String str2, String str3, String str4, String str5, okycx okycxVar) {
        if (3 != (i & 3)) {
            htf31.onExtraCallbackWithResult(i, 3, DomainLogPayload$$serializer.INSTANCE.getDescriptor());
            int i2 = IAuthTabCallback + 95;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        this.domain = str;
        this.params = map;
        if ((i & 4) == 0) {
            this.logId = GetFeatureExtension.onWarmupCompleted.ICustomTabsCallbackDefault();
        } else {
            this.logId = str2;
            int i4 = 2 % 2;
        }
        if ((i & 8) == 0) {
            int i5 = onExtraCallback + 59;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                this.logTime = GetFeatureExtension.onWarmupCompleted.asInterface();
                int i6 = 13 / 0;
            } else {
                this.logTime = GetFeatureExtension.onWarmupCompleted.asInterface();
            }
        } else {
            this.logTime = str3;
            int i7 = IAuthTabCallback + 69;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
        }
        if ((i & 16) == 0) {
            this.company = GetFeatureExtension.onWarmupCompleted.asBinder();
        } else {
            this.company = str4;
            int i9 = 2 % 2;
        }
        if ((i & 32) != 0) {
            this.logName = str5;
            return;
        }
        int i10 = IAuthTabCallback + 1;
        onExtraCallback = i10 % 128;
        if (i10 % 2 == 0) {
            this.logName = access100();
            return;
        }
        this.logName = access100();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public DomainLogPayload(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.domain = str;
        this.params = map;
        this.logId = str2;
        this.logTime = str3;
        this.company = GetFeatureExtension.onWarmupCompleted.asBinder();
        this.logName = access100();
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(DomainLogPayload domainLogPayload, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, domainLogPayload.domain);
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), domainLogPayload.extraCallbackWithResult());
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i2 = onExtraCallback + 25;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.areEqual(domainLogPayload.access100(), GetFeatureExtension.onWarmupCompleted.ICustomTabsCallbackDefault());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(domainLogPayload.access100(), GetFeatureExtension.onWarmupCompleted.ICustomTabsCallbackDefault())) {
                vylVar.onExtraCallback(serialDescriptor, 2, domainLogPayload.access100());
                int i3 = onExtraCallback + 31;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(domainLogPayload.IAuthTabCallbackStub(), GetFeatureExtension.onWarmupCompleted.asInterface())) {
            vylVar.onExtraCallback(serialDescriptor, 3, domainLogPayload.IAuthTabCallbackStub());
            int i5 = IAuthTabCallback + 21;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        if (true ^ vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i7 = IAuthTabCallback + 97;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            if (!Intrinsics.areEqual(domainLogPayload.IAuthTabCallback(), GetFeatureExtension.onWarmupCompleted.asBinder())) {
                vylVar.onExtraCallback(serialDescriptor, 4, domainLogPayload.IAuthTabCallback());
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || !Intrinsics.areEqual(domainLogPayload.IAuthTabCallbackStubProxy(), domainLogPayload.access100())) {
            vylVar.onExtraCallback(serialDescriptor, 5, domainLogPayload.IAuthTabCallbackStubProxy());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DomainLogPayload(String str, Map map, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = onExtraCallback + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            str2 = GetFeatureExtension.onWarmupCompleted.ICustomTabsCallbackDefault();
        }
        if ((i & 8) != 0) {
            int i4 = IAuthTabCallback + 123;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                GetFeatureExtension.onWarmupCompleted.asInterface();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str3 = GetFeatureExtension.onWarmupCompleted.asInterface();
            int i5 = 2 % 2;
        }
        this(str, map, str2, str3);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.domain;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.InterfaceC0059deInitialize
    public Map<String, Object> extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.params;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.InterfaceC0059deInitialize
    public String access100() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            str = this.logId;
            int i4 = 82 / 0;
        } else {
            str = this.logId;
        }
        int i5 = i3 + 45;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.logTime;
        int i5 = i3 + 25;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // o.InterfaceC0059deInitialize
    public String onPostMessage() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 21;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return STORE_ID;
    }

    @Override // o.InterfaceC0059deInitialize
    public String onMinimized() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.domain;
        int i5 = i3 + 27;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 7;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.company;
        int i5 = i2 + 41;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // o.InterfaceC0059deInitialize
    public String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.logName;
        int i5 = i3 + 23;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DomainLogPayload> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            DomainLogPayload$$serializer domainLogPayload$$serializer = DomainLogPayload$$serializer.INSTANCE;
            int i4 = onExtraCallback + 107;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 11 / 0;
            }
            return domainLogPayload$$serializer;
        }
    }

    static {
        int i = onWarmupCompleted + 33;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    @Override // o.Deinitialize
    public void IAuthTabCallback(@NotNull OutputStream outputStream) throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(outputStream, "");
                wie2 wie2VarIAuthTabCallback = checkValidYaw.IAuthTabCallback();
                wie2VarIAuthTabCallback.onExtraCallback();
                PangleEncryptUtilsType4.onExtraCallback(wie2VarIAuthTabCallback, Companion.serializer(), this, outputStream);
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(outputStream, "");
            wie2 wie2VarIAuthTabCallback2 = checkValidYaw.IAuthTabCallback();
            wie2VarIAuthTabCallback2.onExtraCallback();
            PangleEncryptUtilsType4.onExtraCallback(wie2VarIAuthTabCallback2, Companion.serializer(), this, outputStream);
            int i3 = onExtraCallback + 109;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    @Override // o.Deinitialize
    public String onWarmupCompleted() {
        int i = 2 % 2;
        String str = IAuthTabCallbackStub() + access100() + ".json";
        int i2 = IAuthTabCallback + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
