package viva.republica.toss.network.model.teens;

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
import viva.republica.toss.network.model.teens.TeensCardDesignStockResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TeensCardDesignStockResponse {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final List<TeensCardDesignStock> items;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.teens.TeensCardDesignStockResponse$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return TeensCardDesignStockResponse.onExtraCallback();
            }
            TeensCardDesignStockResponse.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    })};

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = onWarmupCompleted + 89;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(TeensCardDesignStockResponse$TeensCardDesignStock$$serializer.INSTANCE);
        int i2 = IAuthTabCallback + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if ((!(obj instanceof TeensCardDesignStockResponse)) || !Intrinsics.areEqual(this.items, ((TeensCardDesignStockResponse) obj).items)) {
            return false;
        }
        int i4 = IAuthTabCallback + 85;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = this.items.hashCode();
            int i3 = 72 / 0;
        } else {
            iHashCode = this.items.hashCode();
        }
        int i4 = IAuthTabCallback + 123;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensCardDesignStockResponse(items=" + this.items + ")";
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TeensCardDesignStockResponse> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            TeensCardDesignStockResponse$.serializer serializerVar = TeensCardDesignStockResponse$.serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 6 / 0;
            }
            return serializerVar;
        }
    }

    static {
        int i = onNavigationEvent + 85;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ TeensCardDesignStockResponse(int i, List list, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onWarmupCompleted + 65;
            IAuthTabCallback = i2 % 128;
            htf31.onExtraCallbackWithResult(i, 1, (i2 % 2 != 0 ? TeensCardDesignStockResponse$.serializer.INSTANCE : TeensCardDesignStockResponse$.serializer.INSTANCE).getDescriptor());
            int i3 = IAuthTabCallback + 73;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        this.items = list;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(TeensCardDesignStockResponse teensCardDesignStockResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) (i2 % 2 == 0 ? $childSerializers[1] : $childSerializers[0]).getValue(), teensCardDesignStockResponse.items);
        int i3 = onWarmupCompleted + 93;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public final List<TeensCardDesignStock> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        List<TeensCardDesignStock> list = this.items;
        int i5 = i2 + 15;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    @liq
    public static final class TeensCardDesignStock {
        public static final Companion Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final String design;
        private final int stock;

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = IAuthTabCallback + 49;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 47;
                onExtraCallbackWithResult = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!(obj instanceof TeensCardDesignStock)) {
                int i3 = onExtraCallback + 37;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            TeensCardDesignStock teensCardDesignStock = (TeensCardDesignStock) obj;
            if (Intrinsics.areEqual(this.design, teensCardDesignStock.design)) {
                return this.stock == teensCardDesignStock.stock;
            }
            int i5 = onExtraCallback + 115;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            int iHashCode = i2 % 2 == 0 ? (this.design.hashCode() << 68) << Integer.hashCode(this.stock) : (this.design.hashCode() * 31) + Integer.hashCode(this.stock);
            int i3 = onExtraCallback + 9;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "TeensCardDesignStock(design=" + this.design + ", stock=" + this.stock + ")";
            int i2 = onExtraCallbackWithResult + 99;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public static final class Companion {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TeensCardDesignStock> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 27;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    TeensCardDesignStockResponse$TeensCardDesignStock$$serializer teensCardDesignStockResponse$TeensCardDesignStock$$serializer = TeensCardDesignStockResponse$TeensCardDesignStock$$serializer.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                TeensCardDesignStockResponse$TeensCardDesignStock$$serializer teensCardDesignStockResponse$TeensCardDesignStock$$serializer2 = TeensCardDesignStockResponse$TeensCardDesignStock$$serializer.INSTANCE;
                int i3 = onWarmupCompleted + 43;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 22 / 0;
                }
                return teensCardDesignStockResponse$TeensCardDesignStock$$serializer2;
            }
        }

        public /* synthetic */ TeensCardDesignStock(int i, String str, int i2, okycx okycxVar) {
            if (3 != (i & 3)) {
                int i3 = onExtraCallback + 69;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    htf31.onExtraCallbackWithResult(i, 5, TeensCardDesignStockResponse$TeensCardDesignStock$$serializer.INSTANCE.getDescriptor());
                } else {
                    htf31.onExtraCallbackWithResult(i, 3, TeensCardDesignStockResponse$TeensCardDesignStock$$serializer.INSTANCE.getDescriptor());
                }
                int i4 = onExtraCallbackWithResult + 15;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 / 3;
                } else {
                    int i6 = 2 % 2;
                }
            }
            this.design = str;
            this.stock = i2;
        }

        @JvmStatic
        public static final /* synthetic */ void onNavigationEvent(TeensCardDesignStock teensCardDesignStock, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                vylVar.onExtraCallback(serialDescriptor, 1, teensCardDesignStock.design);
            } else {
                vylVar.onExtraCallback(serialDescriptor, 0, teensCardDesignStock.design);
            }
            vylVar.onExtraCallback(serialDescriptor, 1, teensCardDesignStock.stock);
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 109;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.design;
            int i5 = i2 + 89;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 10 / 0;
            }
            return str;
        }

        public final int onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = this.stock;
            int i6 = i3 + 29;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            throw null;
        }
    }
}
