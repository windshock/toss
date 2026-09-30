package im.toss.appsintoss.data.remote.model;

import im.toss.appsintoss.data.remote.model.ProductDetailDisclaimer$;
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
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ProductDetailDisclaimer {
    public static final int $stable = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final List<String> description;
    private final String title;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.appsintoss.data.remote.model.ProductDetailDisclaimer$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 57;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = ProductDetailDisclaimer.onExtraCallbackWithResult();
            int i5 = IAuthTabCallback + 99;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return kSerializerOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    })};

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        KSerializer kSerializerOnWarmupCompleted;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 67;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            kSerializerOnWarmupCompleted = onWarmupCompleted();
            int i4 = 59 / 0;
        } else {
            kSerializerOnWarmupCompleted = onWarmupCompleted();
        }
        int i5 = onExtraCallback + 91;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return kSerializerOnWarmupCompleted;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i2 = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i3 = onExtraCallback + 71;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailDisclaimer)) {
            return false;
        }
        ProductDetailDisclaimer productDetailDisclaimer = (ProductDetailDisclaimer) obj;
        if (!Intrinsics.areEqual(this.title, productDetailDisclaimer.title)) {
            int i3 = onWarmupCompleted + 109;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.description, productDetailDisclaimer.description)) {
            int i5 = onExtraCallback + 15;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = onExtraCallback + 5;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 1;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (this.title.hashCode() * 31) + this.description.hashCode();
        int i5 = onExtraCallback + 15;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "ProductDetailDisclaimer(title=" + this.title + ", description=" + this.description + ")";
        int i3 = onExtraCallback + 125;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ProductDetailDisclaimer> serializer() {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                ProductDetailDisclaimer$.serializer serializerVar = ProductDetailDisclaimer$.serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ProductDetailDisclaimer$.serializer serializerVar2 = ProductDetailDisclaimer$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 95;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar2;
        }
    }

    static {
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 13 / 0;
        }
    }

    public /* synthetic */ ProductDetailDisclaimer(int i2, String str, List list, okycx okycxVar) {
        if (3 != (i2 & 3)) {
            int i3 = onWarmupCompleted + 83;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            htf31.onExtraCallbackWithResult(i2, 3, ProductDetailDisclaimer$.serializer.INSTANCE.getDescriptor());
            int i5 = onWarmupCompleted + 61;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this.title = str;
        this.description = list;
    }

    public ProductDetailDisclaimer(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.title = str;
        this.description = list;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(ProductDetailDisclaimer productDetailDisclaimer, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 9;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, productDetailDisclaimer.title);
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[1].getValue(), productDetailDisclaimer.description);
        } else {
            Lazy<KSerializer<Object>>[] lazyArr2 = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, productDetailDisclaimer.title);
            vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr2[1].getValue(), productDetailDisclaimer.description);
        }
        int i4 = onExtraCallback + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i6 = i3 + 87;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return lazyArr;
    }

    public final String IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        String str = this.title;
        int i6 = i3 + 19;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final List<String> onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 97;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.description;
        if (i4 == 0) {
            int i5 = 44 / 0;
        }
        return list;
    }
}
