package im.toss.appsintoss.data.remote.model;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AppsInTossAvailableProductListResponse {
    public static final int $stable = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final List<AppsInTossProductResponse> products;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.appsintoss.data.remote.model.AppsInTossAvailableProductListResponse$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            KSerializer kSerializerIAuthTabCallback = AppsInTossAvailableProductListResponse.IAuthTabCallback();
            int i5 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 62 / 0;
            }
            return kSerializerIAuthTabCallback;
        }
    })};

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        KSerializer kSerializerOnExtraCallback;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 109;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            kSerializerOnExtraCallback = onExtraCallback();
            int i4 = 90 / 0;
        } else {
            kSerializerOnExtraCallback = onExtraCallback();
        }
        int i5 = onWarmupCompleted + 35;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return kSerializerOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i2 = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(AppsInTossProductResponse$$serializer.INSTANCE);
        int i3 = onNavigationEvent + 55;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 9;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        Object obj2 = null;
        if (this == obj) {
            int i7 = i5 + 85;
            int i8 = i7 % 128;
            onNavigationEvent = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 1;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof AppsInTossAvailableProductListResponse)) {
            int i11 = i3 + 17;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.products, ((AppsInTossAvailableProductListResponse) obj).products)) {
            return false;
        }
        int i13 = onNavigationEvent + 79;
        onWarmupCompleted = i13 % 128;
        if (i13 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 123;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            iHashCode = this.products.hashCode();
            int i4 = 96 / 0;
        } else {
            iHashCode = this.products.hashCode();
        }
        int i5 = onWarmupCompleted + 79;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "AppsInTossAvailableProductListResponse(products=" + this.products + ")";
        int i3 = onNavigationEvent + 91;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppsInTossAvailableProductListResponse> serializer() {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 77;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            AppsInTossAvailableProductListResponse$$serializer appsInTossAvailableProductListResponse$$serializer = AppsInTossAvailableProductListResponse$$serializer.INSTANCE;
            int i5 = onWarmupCompleted + 113;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return appsInTossAvailableProductListResponse$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public /* synthetic */ AppsInTossAvailableProductListResponse(int i2, List list, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i3 = 1;
        if (1 != (i2 & 1)) {
            int i4 = onWarmupCompleted + 87;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                descriptor = AppsInTossAvailableProductListResponse$$serializer.INSTANCE.getDescriptor();
                i3 = 0;
            } else {
                descriptor = AppsInTossAvailableProductListResponse$$serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i2, i3, descriptor);
            int i5 = 2 % 2;
        }
        this.products = list;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(AppsInTossAvailableProductListResponse appsInTossAvailableProductListResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 83;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), appsInTossAvailableProductListResponse.products);
        int i5 = onNavigationEvent + 13;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 125;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i6 = i4 + 45;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return lazyArr;
    }

    public final List<AppsInTossProductResponse> onWarmupCompleted() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 117;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        List<AppsInTossProductResponse> list = this.products;
        int i5 = i4 + 51;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }
}
