package o;

import im.toss.features.benefit.dto.BenefitActivationIntelligence;
import im.toss.features.benefit.ui.data.BenefitActivationIntelligenceType2Item$;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setNode extends SensorBridgeExtension3 implements SensorBridgeExtension {
    private static int IAuthTabCallbackStub = 1;
    private static int onWarmupCompleted;
    private volatile boolean IAuthTabCallback;
    private final Function1<SensorBridgeExtension3, Boolean> onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final BenefitActivationIntelligence.Type2 onNavigationEvent;

    public static /* synthetic */ setNode IAuthTabCallback(setNode setnode, BenefitActivationIntelligence.Type2 type2, int i, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 35;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            type2 = setnode.onNavigationEvent;
        }
        if ((i2 & 2) != 0) {
            int i7 = i4 + 27;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            i = setnode.onExtraCallbackWithResult;
        }
        if ((i2 & 4) != 0) {
            int i9 = IAuthTabCallbackStub + 25;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            z = setnode.IAuthTabCallback;
        }
        return setnode.IAuthTabCallback(type2, i, z);
    }

    public static /* synthetic */ boolean IAuthTabCallback(setNode setnode, SensorBridgeExtension3 sensorBridgeExtension3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(setnode, sensorBridgeExtension3);
        }
        onNavigationEvent(setnode, sensorBridgeExtension3);
        throw null;
    }

    public final setNode IAuthTabCallback(@NotNull BenefitActivationIntelligence.Type2 type2, int i, boolean z) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(type2, "");
        setNode setnode = new setNode(type2, i, z);
        int i3 = onWarmupCompleted + 81;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return setnode;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r6 instanceof o.setNode) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (o.setNode) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, r6.onNavigationEvent)) == true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r5.onExtraCallbackWithResult == r6.onExtraCallbackWithResult) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r5.IAuthTabCallback == r6.IAuthTabCallback) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        r6 = o.setNode.IAuthTabCallbackStub + 49;
        o.setNode.onWarmupCompleted = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 101;
        o.setNode.IAuthTabCallbackStub = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 97;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 91 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.onNavigationEvent.hashCode() * 31) + Integer.hashCode(this.onExtraCallbackWithResult)) * 31) + Boolean.hashCode(this.IAuthTabCallback);
        int i4 = IAuthTabCallbackStub + 117;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BenefitActivationIntelligenceType2Item(data=" + this.onNavigationEvent + ", sectionOrder=" + this.onExtraCallbackWithResult + ", isCardShown=" + this.IAuthTabCallback + ")";
        int i2 = onWarmupCompleted + 47;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public setNode(@NotNull BenefitActivationIntelligence.Type2 type2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(type2, "");
        this.onNavigationEvent = type2;
        this.onExtraCallbackWithResult = i;
        this.IAuthTabCallback = z;
        this.onExtraCallback = new BenefitActivationIntelligenceType2Item$.ExternalSyntheticLambda0(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setNode(BenefitActivationIntelligence.Type2 type2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onWarmupCompleted + 71;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        }
        if ((i2 & 4) != 0) {
            int i5 = onWarmupCompleted + 113;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z = false;
        }
        this(type2, i, z);
    }

    public final BenefitActivationIntelligence.Type2 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        BenefitActivationIntelligence.Type2 type2 = this.onNavigationEvent;
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        return type2;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 3;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onExtraCallbackWithResult;
        int i6 = i2 + 103;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 3 / 0;
        }
        return i5;
    }

    public final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback = z;
        int i4 = onWarmupCompleted + 109;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.IAuthTabCallback;
        int i4 = onWarmupCompleted + 107;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Function1<SensorBridgeExtension3, Boolean> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 45;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Function1<SensorBridgeExtension3, Boolean> function1 = this.onExtraCallback;
        int i5 = i2 + 67;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return function1;
    }

    private static final boolean onNavigationEvent(setNode setnode, SensorBridgeExtension3 sensorBridgeExtension3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sensorBridgeExtension3, "");
            boolean z = sensorBridgeExtension3 instanceof setNode;
            throw null;
        }
        Intrinsics.checkNotNullParameter(sensorBridgeExtension3, "");
        if (!(sensorBridgeExtension3 instanceof setNode)) {
            return false;
        }
        setNode setnode2 = (setNode) sensorBridgeExtension3;
        if (!Intrinsics.areEqual(setnode2.onNavigationEvent.onWarmupCompleted(), setnode.onNavigationEvent.onWarmupCompleted())) {
            return false;
        }
        int i3 = IAuthTabCallbackStub + 7;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (setnode2.IAuthTabCallback != setnode.IAuthTabCallback) {
            return false;
        }
        int i5 = IAuthTabCallbackStub + 85;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }
}
