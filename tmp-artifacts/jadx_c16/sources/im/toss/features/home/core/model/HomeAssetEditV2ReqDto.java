package im.toss.features.home.core.model;

import im.toss.features.home.core.model.HomeAssetEditV2ReqDto$;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.sp;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class HomeAssetEditV2ReqDto {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final Map<String, String> schemeParams;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new HomeAssetEditV2ReqDto$.ExternalSyntheticLambda0())};

    /* JADX WARN: Illegal instructions before constructor call */
    public HomeAssetEditV2ReqDto() {
        Map map = null;
        this(map, 1, (DefaultConstructorMarker) map);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout));
        int i2 = onExtraCallback + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return getmutilbackgrounddrawable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i4 = onExtraCallback + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallback;
    }

    static {
        int i = IAuthTabCallback + 15;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 94 / 0;
        }
    }

    public /* synthetic */ HomeAssetEditV2ReqDto(int i, Map map, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) != 0) {
            this.schemeParams = map;
            int i2 = onNavigationEvent + 109;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.schemeParams = null;
        int i3 = onExtraCallback + 95;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public HomeAssetEditV2ReqDto(@Nullable Map<String, String> map) {
        this.schemeParams = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035 A[PHI: r1
      0x0035: PHI (r1v6 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0020, B:12:0x002f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r1
      0x0022: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(HomeAssetEditV2ReqDto homeAssetEditV2ReqDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i3 = onExtraCallback + 55;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    Map<String, String> map = homeAssetEditV2ReqDto.schemeParams;
                    throw null;
                }
                if (homeAssetEditV2ReqDto.schemeParams != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, (py) lazyArr[0].getValue(), homeAssetEditV2ReqDto.schemeParams);
                }
            }
        } else {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        int i4 = onExtraCallback + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 87;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i2 + 51;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return lazyArr;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HomeAssetEditV2ReqDto(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 77;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 73;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 4;
            } else {
                int i7 = 2 % 2;
            }
            map = null;
        }
        this(map);
    }
}
