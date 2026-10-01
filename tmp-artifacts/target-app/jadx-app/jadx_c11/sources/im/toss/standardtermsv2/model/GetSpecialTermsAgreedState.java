package im.toss.standardtermsv2.model;

import im.toss.standardtermsv2.model.GetSpecialTermsAgreedState$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class GetSpecialTermsAgreedState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private final boolean kakaoAgreed;
    private final boolean nightAgreed;
    private final boolean personalizedServiceAgreed;
    private final boolean pushAgreed;
    private final boolean smsAgreed;
    private final boolean userOptimizationAgreed;

    static {
        int i = onExtraCallbackWithResult + 125;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSpecialTermsAgreedState)) {
            int i2 = IAuthTabCallback + 31;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            boolean z = i2 % 2 == 0;
            int i4 = i3 + 57;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return z;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        GetSpecialTermsAgreedState getSpecialTermsAgreedState = (GetSpecialTermsAgreedState) obj;
        if (this.userOptimizationAgreed != getSpecialTermsAgreedState.userOptimizationAgreed || this.personalizedServiceAgreed != getSpecialTermsAgreedState.personalizedServiceAgreed) {
            return false;
        }
        if (this.smsAgreed == getSpecialTermsAgreedState.smsAgreed) {
            return this.pushAgreed == getSpecialTermsAgreedState.pushAgreed && this.nightAgreed == getSpecialTermsAgreedState.nightAgreed && this.kakaoAgreed == getSpecialTermsAgreedState.kakaoAgreed;
        }
        int i5 = onNavigationEvent + 97;
        int i6 = i5 % 128;
        IAuthTabCallback = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 13;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 30 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((Boolean.hashCode(this.userOptimizationAgreed) * 31) + Boolean.hashCode(this.personalizedServiceAgreed)) * 31) + Boolean.hashCode(this.smsAgreed)) * 31) + Boolean.hashCode(this.pushAgreed)) * 31) + Boolean.hashCode(this.nightAgreed)) * 31) + Boolean.hashCode(this.kakaoAgreed);
        int i4 = IAuthTabCallback + 79;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetSpecialTermsAgreedState(userOptimizationAgreed=" + this.userOptimizationAgreed + ", personalizedServiceAgreed=" + this.personalizedServiceAgreed + ", smsAgreed=" + this.smsAgreed + ", pushAgreed=" + this.pushAgreed + ", nightAgreed=" + this.nightAgreed + ", kakaoAgreed=" + this.kakaoAgreed + ")";
        int i2 = onNavigationEvent + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetSpecialTermsAgreedState> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            GetSpecialTermsAgreedState$.serializer serializerVar = GetSpecialTermsAgreedState$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ GetSpecialTermsAgreedState(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 63;
        if (63 != (i & 63)) {
            int i3 = onNavigationEvent + 67;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = GetSpecialTermsAgreedState$.serializer.INSTANCE.getDescriptor();
                i2 = 85;
            } else {
                descriptor = GetSpecialTermsAgreedState$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.userOptimizationAgreed = z;
        this.personalizedServiceAgreed = z2;
        this.smsAgreed = z3;
        this.pushAgreed = z4;
        this.nightAgreed = z5;
        this.kakaoAgreed = z6;
    }

    public GetSpecialTermsAgreedState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.userOptimizationAgreed = z;
        this.personalizedServiceAgreed = z2;
        this.smsAgreed = z3;
        this.pushAgreed = z4;
        this.nightAgreed = z5;
        this.kakaoAgreed = z6;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(GetSpecialTermsAgreedState getSpecialTermsAgreedState, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, getSpecialTermsAgreedState.userOptimizationAgreed);
        vylVar.onNavigationEvent(serialDescriptor, 1, getSpecialTermsAgreedState.personalizedServiceAgreed);
        vylVar.onNavigationEvent(serialDescriptor, 2, getSpecialTermsAgreedState.smsAgreed);
        vylVar.onNavigationEvent(serialDescriptor, 3, getSpecialTermsAgreedState.pushAgreed);
        vylVar.onNavigationEvent(serialDescriptor, 4, getSpecialTermsAgreedState.nightAgreed);
        vylVar.onNavigationEvent(serialDescriptor, 5, getSpecialTermsAgreedState.kakaoAgreed);
        int i4 = IAuthTabCallback + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 19;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.userOptimizationAgreed;
        int i5 = i2 + 17;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean onWarmupCompleted() {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            z = this.personalizedServiceAgreed;
            int i4 = 51 / 0;
        } else {
            z = this.personalizedServiceAgreed;
        }
        int i5 = i3 + 23;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.smsAgreed;
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        return z;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.pushAgreed;
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        return z;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 79;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.nightAgreed;
        int i5 = i2 + 85;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 111;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.kakaoAgreed;
        int i5 = i2 + 77;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
