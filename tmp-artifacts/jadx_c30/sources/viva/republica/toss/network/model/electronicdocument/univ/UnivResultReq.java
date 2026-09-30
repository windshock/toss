package viva.republica.toss.network.model.electronicdocument.univ;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UnivResultReq {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final Map<String, String> resultParams;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.electronicdocument.univ.UnivResultReq$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return UnivResultReq.IAuthTabCallback();
            }
            UnivResultReq.IAuthTabCallback();
            throw null;
        }
    })};

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        KSerializer kSerializerOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerOnWarmupCompleted = onWarmupCompleted();
            int i3 = 72 / 0;
        } else {
            kSerializerOnWarmupCompleted = onWarmupCompleted();
        }
        int i4 = onExtraCallback + 49;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnWarmupCompleted;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getwrigglelayout, getwrigglelayout);
        int i2 = onExtraCallback + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return getmutilbackgrounddrawable;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof UnivResultReq)) {
            int i4 = onNavigationEvent + 45;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 54 / 0;
            }
            return false;
        }
        if (Intrinsics.areEqual(this.resultParams, ((UnivResultReq) obj).resultParams)) {
            return true;
        }
        int i6 = onNavigationEvent + 91;
        onExtraCallback = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = this.resultParams.hashCode();
            int i3 = 18 / 0;
        } else {
            iHashCode = this.resultParams.hashCode();
        }
        int i4 = onExtraCallback + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UnivResultReq(resultParams=" + this.resultParams + ")";
        int i2 = onNavigationEvent + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UnivResultReq> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            UnivResultReq$$serializer univResultReq$$serializer = UnivResultReq$$serializer.INSTANCE;
            if (i3 != 0) {
                return univResultReq$$serializer;
            }
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ UnivResultReq(int i, Map map, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallback + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, UnivResultReq$$serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 3;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.resultParams = map;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 43;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(UnivResultReq univResultReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        vylVar.onNavigationEvent(serialDescriptor, 0, i2 % 2 == 0 ? (py) $childSerializers[1].getValue() : (py) $childSerializers[0].getValue(), univResultReq.resultParams);
    }
}
