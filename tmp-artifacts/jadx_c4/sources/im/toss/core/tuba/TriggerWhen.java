package im.toss.core.tuba;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.ALCFaceSDK4ExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.liq;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TriggerWhen {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final int times;
    private final ALCFaceSDK4ExternalSyntheticLambda0 type;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.core.tuba.TriggerWhen$$ExternalSyntheticLambda0
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return TriggerWhen.onNavigationEvent();
            }
            TriggerWhen.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }), null};

    /* JADX WARN: Illegal instructions before constructor call */
    public TriggerWhen() {
        ALCFaceSDK4ExternalSyntheticLambda0 aLCFaceSDK4ExternalSyntheticLambda0 = null;
        this(aLCFaceSDK4ExternalSyntheticLambda0, 0, 3, (DefaultConstructorMarker) aLCFaceSDK4ExternalSyntheticLambda0);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.core.tuba.WhenType", ALCFaceSDK4ExternalSyntheticLambda0.values());
        int i4 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i4 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 75;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TriggerWhen)) {
            int i6 = i2 + 99;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        TriggerWhen triggerWhen = (TriggerWhen) obj;
        if (this.type != triggerWhen.type) {
            int i8 = i2 + 77;
            onExtraCallbackWithResult = i8 % 128;
            return i8 % 2 == 0;
        }
        if (this.times != triggerWhen.times) {
            int i9 = i4 + 53;
            onNavigationEvent = i9 % 128;
            return i9 % 2 != 0;
        }
        int i10 = i4 + 21;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1
      0x001c: PHI (r1v10 o.ALCFaceSDK4ExternalSyntheticLambda0) = (r1v4 o.ALCFaceSDK4ExternalSyntheticLambda0), (r1v11 o.ALCFaceSDK4ExternalSyntheticLambda0) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        ALCFaceSDK4ExternalSyntheticLambda0 aLCFaceSDK4ExternalSyntheticLambda0;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i2 % 128;
        int iHashCode = 0;
        if (i2 % 2 == 0) {
            aLCFaceSDK4ExternalSyntheticLambda0 = this.type;
            int i3 = 70 / 0;
            if (aLCFaceSDK4ExternalSyntheticLambda0 != null) {
                iHashCode = aLCFaceSDK4ExternalSyntheticLambda0.hashCode();
            }
        } else {
            aLCFaceSDK4ExternalSyntheticLambda0 = this.type;
            if (aLCFaceSDK4ExternalSyntheticLambda0 != null) {
            }
        }
        int iHashCode2 = (iHashCode * 31) + Integer.hashCode(this.times);
        int i4 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode2;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TriggerWhen(type=" + this.type + ", times=" + this.times + ")";
        int i2 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TriggerWhen> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            TriggerWhen$$serializer triggerWhen$$serializer = TriggerWhen$$serializer.INSTANCE;
            if (i3 == 0) {
                return triggerWhen$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 97;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ TriggerWhen(int i, ALCFaceSDK4ExternalSyntheticLambda0 aLCFaceSDK4ExternalSyntheticLambda0, int i2, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i3 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
            aLCFaceSDK4ExternalSyntheticLambda0 = null;
        }
        this.type = aLCFaceSDK4ExternalSyntheticLambda0;
        if ((i & 2) == 0) {
            this.times = 0;
            return;
        }
        this.times = i2;
        int i5 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
    }

    public TriggerWhen(@Nullable ALCFaceSDK4ExternalSyntheticLambda0 aLCFaceSDK4ExternalSyntheticLambda0, int i) {
        this.type = aLCFaceSDK4ExternalSyntheticLambda0;
        this.times = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(TriggerWhen triggerWhen, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                ALCFaceSDK4ExternalSyntheticLambda0 aLCFaceSDK4ExternalSyntheticLambda0 = triggerWhen.type;
                throw null;
            }
            if (triggerWhen.type != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, (py) lazyArr[0].getValue(), triggerWhen.type);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i5 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 22 / 0;
                if (triggerWhen.times == 0) {
                    return;
                }
            } else if (triggerWhen.times == 0) {
                return;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 1, triggerWhen.times);
        int i7 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 67;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i2 + 15;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TriggerWhen(ALCFaceSDK4ExternalSyntheticLambda0 aLCFaceSDK4ExternalSyntheticLambda0, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            aLCFaceSDK4ExternalSyntheticLambda0 = null;
        }
        if ((i2 & 2) != 0) {
            int i5 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(aLCFaceSDK4ExternalSyntheticLambda0, i);
    }

    public final ALCFaceSDK4ExternalSyntheticLambda0 onWarmupCompleted() {
        ALCFaceSDK4ExternalSyntheticLambda0 aLCFaceSDK4ExternalSyntheticLambda0;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 5;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            aLCFaceSDK4ExternalSyntheticLambda0 = this.type;
            int i4 = 13 / 0;
        } else {
            aLCFaceSDK4ExternalSyntheticLambda0 = this.type;
        }
        int i5 = i2 + 65;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return aLCFaceSDK4ExternalSyntheticLambda0;
        }
        throw null;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = this.times;
        int i6 = i3 + 9;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 86 / 0;
        }
        return i5;
    }
}
