package viva.republica.toss.tosscert.tosscacert.api.model;

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
import viva.republica.toss.tosscert.tosscacert.api.model.CertificationCenterBannerItem$;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class Category {
    public static final int $stable = 0;
    private final String name;
    private final List<CertificationCenterBannerItem> references;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.tosscert.tosscacert.api.model.Category$$ExternalSyntheticLambda0
        public final Object invoke() {
            return Category.onExtraCallback();
        }
    })};

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer onExtraCallback() {
        return new checkCanOpenLandingPage(CertificationCenterBannerItem$.serializer.INSTANCE);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Category)) {
            return false;
        }
        Category category = (Category) obj;
        return Intrinsics.areEqual(this.name, category.name) && Intrinsics.areEqual(this.references, category.references);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.references.hashCode();
    }

    public String toString() {
        return "Category(name=" + this.name + ", references=" + this.references + ")";
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Category> serializer() {
            return Category$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Category(int i, String str, List list, okycx okycxVar) {
        if (3 != (i & 3)) {
            htf31.onExtraCallbackWithResult(i, 3, Category$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.references = list;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(Category category, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, category.name);
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), category.references);
    }

    public final String onWarmupCompleted() {
        return this.name;
    }

    public final List<CertificationCenterBannerItem> onExtraCallbackWithResult() {
        return this.references;
    }
}
