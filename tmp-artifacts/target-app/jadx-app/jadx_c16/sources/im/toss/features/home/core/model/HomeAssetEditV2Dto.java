package im.toss.features.home.core.model;

import im.toss.features.home.core.model.HomeAssetEditV2Dto$;
import im.toss.features.home.core.model.HomeAssetEditV2Dto$AutomaticTarget$;
import im.toss.features.home.core.model.HomeAssetEditV2Dto$ManualTarget$;
import im.toss.features.home.core.model.HomeAssetEditV2Dto$NavigationItem$;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.liq;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class HomeAssetEditV2Dto {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final AutomaticTarget automaticTarget;
    private final onExtraCallbackWithResult currentTarget;
    private final ManualTarget manualTarget;
    private final NavigationItem navigationItem;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new HomeAssetEditV2Dto$.ExternalSyntheticLambda0()), null, null, null};

    public HomeAssetEditV2Dto() {
        this((onExtraCallbackWithResult) null, (AutomaticTarget) null, (ManualTarget) null, (NavigationItem) null, 15, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer asInterface() {
        KSerializer kSerializerOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult[] onextracallbackwithresultArrValues = onExtraCallbackWithResult.values();
            String[] strArr = new String[3];
            strArr[0] = "AUTOMATIC";
            strArr[1] = "MANUAL";
            Annotation[][] annotationArr = new Annotation[3][];
            annotationArr[0] = null;
            annotationArr[1] = null;
            kSerializerOnNavigationEvent = updateRenderInfoForVideo.onNavigationEvent("im.toss.features.home.core.model.HomeAssetEditV2Dto.Target", onextracallbackwithresultArrValues, strArr, annotationArr, (Annotation[]) null);
        } else {
            kSerializerOnNavigationEvent = updateRenderInfoForVideo.onNavigationEvent("im.toss.features.home.core.model.HomeAssetEditV2Dto.Target", onExtraCallbackWithResult.values(), new String[]{"AUTOMATIC", "MANUAL"}, new Annotation[][]{null, null}, (Annotation[]) null);
        }
        int i3 = onWarmupCompleted + 39;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerOnNavigationEvent;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface();
        }
        asInterface();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeAssetEditV2Dto)) {
            return false;
        }
        HomeAssetEditV2Dto homeAssetEditV2Dto = (HomeAssetEditV2Dto) obj;
        if (this.currentTarget != homeAssetEditV2Dto.currentTarget) {
            return false;
        }
        if (!Intrinsics.areEqual(this.automaticTarget, homeAssetEditV2Dto.automaticTarget)) {
            int i4 = onNavigationEvent + 43;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.manualTarget, homeAssetEditV2Dto.manualTarget)) {
            int i6 = onNavigationEvent + 101;
            onWarmupCompleted = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.navigationItem, homeAssetEditV2Dto.navigationItem)) {
            return false;
        }
        int i7 = onNavigationEvent + 23;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.currentTarget.hashCode();
        int iHashCode3 = this.automaticTarget.hashCode();
        int iHashCode4 = this.manualTarget.hashCode();
        NavigationItem navigationItem = this.navigationItem;
        if (navigationItem == null) {
            int i4 = onNavigationEvent + 1;
            int i5 = i4 % 128;
            onWarmupCompleted = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 59;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            iHashCode = 0;
        } else {
            iHashCode = navigationItem.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HomeAssetEditV2Dto(currentTarget=" + this.currentTarget + ", automaticTarget=" + this.automaticTarget + ", manualTarget=" + this.manualTarget + ", navigationItem=" + this.navigationItem + ")";
        int i2 = onNavigationEvent + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        int i = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 42 / 0;
        }
    }

    public /* synthetic */ HomeAssetEditV2Dto(int i, onExtraCallbackWithResult onextracallbackwithresult, AutomaticTarget automaticTarget, ManualTarget manualTarget, NavigationItem navigationItem, okycx okycxVar) {
        if ((i & 1) == 0) {
            onextracallbackwithresult = onExtraCallbackWithResult.MANUAL;
            int i2 = onWarmupCompleted + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.currentTarget = onextracallbackwithresult;
        if ((i & 2) == 0) {
            this.automaticTarget = new AutomaticTarget((List) null, (Text) null, 3, (DefaultConstructorMarker) null);
        } else {
            this.automaticTarget = automaticTarget;
        }
        if ((i & 4) == 0) {
            this.manualTarget = new ManualTarget(0, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
            int i5 = onNavigationEvent + 109;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
        } else {
            this.manualTarget = manualTarget;
        }
        if ((i & 8) == 0) {
            this.navigationItem = null;
        } else {
            this.navigationItem = navigationItem;
        }
    }

    public HomeAssetEditV2Dto(@NotNull onExtraCallbackWithResult onextracallbackwithresult, @NotNull AutomaticTarget automaticTarget, @NotNull ManualTarget manualTarget, @Nullable NavigationItem navigationItem) {
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(automaticTarget, "");
        Intrinsics.checkNotNullParameter(manualTarget, "");
        this.currentTarget = onextracallbackwithresult;
        this.automaticTarget = automaticTarget;
        this.manualTarget = manualTarget;
        this.navigationItem = navigationItem;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 95;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(HomeAssetEditV2Dto homeAssetEditV2Dto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || homeAssetEditV2Dto.currentTarget != onExtraCallbackWithResult.MANUAL) {
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), homeAssetEditV2Dto.currentTarget);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || (!Intrinsics.areEqual(homeAssetEditV2Dto.automaticTarget, new AutomaticTarget((List) null, (Text) null, 3, (DefaultConstructorMarker) null)))) {
            vylVar.onNavigationEvent(serialDescriptor, 1, HomeAssetEditV2Dto$AutomaticTarget$.serializer.INSTANCE, homeAssetEditV2Dto.automaticTarget);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || (!Intrinsics.areEqual(homeAssetEditV2Dto.manualTarget, new ManualTarget(0, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null)))) {
            vylVar.onNavigationEvent(serialDescriptor, 2, HomeAssetEditV2Dto$ManualTarget$.serializer.INSTANCE, homeAssetEditV2Dto.manualTarget);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i4 = onWarmupCompleted + 125;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            NavigationItem navigationItem = homeAssetEditV2Dto.navigationItem;
            if (i5 != 0) {
                int i6 = 5 / 0;
                if (navigationItem == null) {
                    return;
                }
            } else if (navigationItem == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, HomeAssetEditV2Dto$NavigationItem$.serializer.INSTANCE, homeAssetEditV2Dto.navigationItem);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HomeAssetEditV2Dto(onExtraCallbackWithResult onextracallbackwithresult, AutomaticTarget automaticTarget, ManualTarget manualTarget, NavigationItem navigationItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onextracallbackwithresult = onExtraCallbackWithResult.MANUAL;
        }
        automaticTarget = (i & 2) != 0 ? new AutomaticTarget((List) null, (Text) null, 3, (DefaultConstructorMarker) null) : automaticTarget;
        manualTarget = (i & 4) != 0 ? new ManualTarget(0, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null) : manualTarget;
        if ((i & 8) != 0) {
            int i4 = onWarmupCompleted;
            int i5 = i4 + 33;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 73;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            navigationItem = null;
        }
        this(onextracallbackwithresult, automaticTarget, manualTarget, navigationItem);
    }

    public final onExtraCallbackWithResult IAuthTabCallback() {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 23;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            onextracallbackwithresult = this.currentTarget;
            int i4 = 45 / 0;
        } else {
            onextracallbackwithresult = this.currentTarget;
        }
        int i5 = i2 + 125;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
        return onextracallbackwithresult;
    }

    public final AutomaticTarget onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.automaticTarget;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ManualTarget onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        ManualTarget manualTarget = this.manualTarget;
        int i5 = i2 + 83;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return manualTarget;
    }

    public final NavigationItem IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.navigationItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
