package im.toss.appsintoss.data.remote.model;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ProductDetailContent {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String description;
    private final String title;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i2 = onExtraCallback + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i3 % 128;
            return i3 % 2 != 0;
        }
        if (!(obj instanceof ProductDetailContent)) {
            return false;
        }
        ProductDetailContent productDetailContent = (ProductDetailContent) obj;
        if (!(!Intrinsics.areEqual(this.title, productDetailContent.title))) {
            return Intrinsics.areEqual(this.description, productDetailContent.description);
        }
        int i4 = onExtraCallbackWithResult;
        int i5 = i4 + 9;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 97;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (this.title.hashCode() * 31) + this.description.hashCode();
        int i5 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "ProductDetailContent(title=" + this.title + ", description=" + this.description + ")";
        int i3 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ProductDetailContent> serializer() {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 89;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            ProductDetailContent$$serializer productDetailContent$$serializer = ProductDetailContent$$serializer.INSTANCE;
            if (i4 != 0) {
                return productDetailContent$$serializer;
            }
            throw null;
        }
    }

    public /* synthetic */ ProductDetailContent(int i2, String str, String str2, okycx okycxVar) {
        if (3 != (i2 & 3)) {
            int i3 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            htf31.onExtraCallbackWithResult(i2, 3, ProductDetailContent$$serializer.INSTANCE.getDescriptor());
            int i5 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this.title = str;
        this.description = str2;
    }

    public ProductDetailContent(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.title = str;
        this.description = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(ProductDetailContent productDetailContent, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, productDetailContent.title);
        vylVar.onExtraCallback(serialDescriptor, 1, productDetailContent.description);
        int i5 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String onWarmupCompleted() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 93;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        String str = this.title;
        int i6 = i3 + 19;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        String str = this.description;
        int i6 = i3 + 1;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 72 / 0;
        }
        return str;
    }
}
