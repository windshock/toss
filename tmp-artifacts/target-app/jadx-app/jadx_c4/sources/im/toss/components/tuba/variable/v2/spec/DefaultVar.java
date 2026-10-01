package im.toss.components.tuba.variable.v2.spec;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.ALCFeatureMatch;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import o.zzaj;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DefaultVar {
    public static final Companion Companion;
    private static byte[] IAuthTabCallback;
    private static int asInterface;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static short[] onNavigationEvent;
    private static int onWarmupCompleted;
    private final Lazy currentVersion$delegate;
    private final Lazy defaultValue$delegate;
    private final boolean hasAbTests;
    private final String key;
    private final VersionConstraints maxVerConstraints;
    private final Lazy maxVersion$delegate;
    private final VersionConstraints minVerConstraints;
    private final Lazy minVersion$delegate;
    private final Lazy shouldFetchValueFromServer$delegate;
    private final String value;
    private static final byte[] $$a = {50, 44, -54, 25};
    private static final int $$b = 218;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4 = (i * 2) + 115;
        int i5 = (i2 * 2) + 4;
        byte[] bArr = $$a;
        int i6 = s * 4;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i4 += i7;
            i5++;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i3++;
            i7 = bArr[i5];
            i4 += i7;
            i5++;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    static {
        asInterface = 0;
        IAuthTabCallbackDefault();
        Companion = new Companion(null);
        int i = IAuthTabCallbackStub + 79;
        asInterface = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ String IAuthTabCallback(DefaultVar defaultVar) {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            return (String) onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{defaultVar}, 84496748, -84496746, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback);
        }
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        throw null;
    }

    public static /* synthetic */ ALCFeatureMatch IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStub();
            throw null;
        }
        ALCFeatureMatch aLCFeatureMatchIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i3 = IAuthTabCallbackDefault + 21;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return aLCFeatureMatchIAuthTabCallbackStub;
    }

    public static /* synthetic */ ALCFeatureMatch IAuthTabCallbackDefault(DefaultVar defaultVar) {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ALCFeatureMatch aLCFeatureMatchAsBinder = asBinder(defaultVar);
        int i4 = asBinder + 47;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return aLCFeatureMatchAsBinder;
    }

    public static /* synthetic */ String IAuthTabCallbackStub(DefaultVar defaultVar) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(defaultVar);
        int i4 = asBinder + 73;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ boolean asInterface(DefaultVar defaultVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCallbackWithResult = extraCallbackWithResult(defaultVar);
        int i4 = asBinder + 111;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return zExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ ALCFeatureMatch onExtraCallback(DefaultVar defaultVar) {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        ALCFeatureMatch aLCFeatureMatch = (ALCFeatureMatch) onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{defaultVar}, -112421319, 112421319, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback);
        int i4 = asBinder + 75;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return aLCFeatureMatch;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(DefaultVar defaultVar) {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            access000(defaultVar);
            obj.hashCode();
            throw null;
        }
        boolean zAccess000 = access000(defaultVar);
        int i3 = asBinder + 85;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return zAccess000;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = ~i6;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = (~(i6 | i2)) | (~(i7 | i9));
        int i12 = ~(i9 | i3 | i2);
        int i13 = i3 + i2 + i + ((-194346734) * i4) + (9035316 * i5);
        int i14 = i13 * i13;
        int i15 = (((-787818500) * i3) - 443744256) + ((-1492047866) * i2) + (352114683 * i10) + (i11 * (-352114683)) + ((-352114683) * i12) + ((-1139933184) * i) + (1190920192 * i4) + (1456996352 * i5) + ((-1774911488) * i14);
        int i16 = (i3 * 1174986172) + 1294669563 + (i2 * 1174986598) + (i10 * (-213)) + (i11 * 213) + (i12 * 213) + (i * 1174986385) + (i4 * (-1060063438)) + (i5 * 107475828) + (i14 * 168099840);
        int i17 = i15 + (i16 * i16 * 40566784);
        if (i17 != 1) {
            return i17 != 2 ? i17 != 3 ? i17 != 4 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr);
        }
        DefaultVar defaultVar = (DefaultVar) objArr[0];
        int i18 = 2 % 2;
        int i19 = IAuthTabCallbackDefault + 23;
        asBinder = i19 % 128;
        int i20 = i19 % 2;
        String str = (String) defaultVar.defaultValue$delegate.getValue();
        int i21 = asBinder + 87;
        IAuthTabCallbackDefault = i21 % 128;
        int i22 = i21 % 2;
        return str;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ALCFeatureMatch aLCFeatureMatch;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            aLCFeatureMatch = (ALCFeatureMatch) onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[0], -1840264703, 1840264707, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback);
            int i3 = 79 / 0;
        } else {
            int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            aLCFeatureMatch = (ALCFeatureMatch) onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[0], -1840264703, 1840264707, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback2);
        }
        int i4 = IAuthTabCallbackDefault + 45;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return aLCFeatureMatch;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ ALCFeatureMatch onNavigationEvent(DefaultVar defaultVar) {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onTransact(defaultVar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ALCFeatureMatch aLCFeatureMatchOnTransact = onTransact(defaultVar);
        int i3 = asBinder + 21;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 41 / 0;
        }
        return aLCFeatureMatchOnTransact;
    }

    public static /* synthetic */ ALCFeatureMatch onWarmupCompleted(DefaultVar defaultVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ALCFeatureMatch interfaceDescriptor = getInterfaceDescriptor(defaultVar);
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        return interfaceDescriptor;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asBinder + 45;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof DefaultVar)) {
            int i4 = asBinder + 41;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        DefaultVar defaultVar = (DefaultVar) obj;
        if (!Intrinsics.areEqual(this.key, defaultVar.key)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.value, defaultVar.value)) {
            int i6 = asBinder + 7;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.hasAbTests != defaultVar.hasAbTests) {
            int i8 = IAuthTabCallbackDefault + 49;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.minVerConstraints, defaultVar.minVerConstraints)) {
            return false;
        }
        if (Intrinsics.areEqual(this.maxVerConstraints, defaultVar.maxVerConstraints)) {
            return true;
        }
        int i10 = IAuthTabCallbackDefault + 103;
        asBinder = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.key.hashCode();
        int iHashCode3 = this.value.hashCode();
        int iHashCode4 = Boolean.hashCode(this.hasAbTests);
        VersionConstraints versionConstraints = this.minVerConstraints;
        int i2 = 0;
        if (versionConstraints == null) {
            int i3 = asBinder + 31;
            IAuthTabCallbackDefault = i3 % 128;
            iHashCode = i3 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = versionConstraints.hashCode();
        }
        VersionConstraints versionConstraints2 = this.maxVerConstraints;
        if (versionConstraints2 != null) {
            int i4 = IAuthTabCallbackDefault + 75;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            int iHashCode5 = versionConstraints2.hashCode();
            if (i5 != 0) {
                int i6 = 9 / 0;
            }
            i2 = iHashCode5;
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + i2;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.key;
        String str2 = this.value;
        boolean z = this.hasAbTests;
        VersionConstraints versionConstraints = this.minVerConstraints;
        VersionConstraints versionConstraints2 = this.maxVerConstraints;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((short) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 40), (byte) (Color.red(0) + 103), (-1006748837) - TextUtils.indexOf((CharSequence) "", '0', 0), Color.argb(0, 0, 0, 0) - 1000983967, ((Process.getThreadPriority(0) + 20) >> 6) - 10, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a((short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 37), (byte) ((-94) - ExpandableListView.getPackedPositionChild(0L)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1006748822, (-1000983991) - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.rgb(0, 0, 0) + 16777206, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str2);
        Object[] objArr3 = new Object[1];
        a((short) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 60), (byte) (View.resolveSizeAndState(0, 0, 0) - 101), Color.rgb(0, 0, 0) - 989971597, TextUtils.lastIndexOf("", '0', 0, 0) - 1000983990, (-10) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(z);
        Object[] objArr4 = new Object[1];
        a((short) ((-122) - TextUtils.indexOf("", "")), (byte) (6 - KeyEvent.normalizeMetaState(0)), (-1006748800) - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) - 1000983991, (-10) - (ViewConfiguration.getScrollBarSize() >> 8), objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(versionConstraints);
        Object[] objArr5 = new Object[1];
        a((short) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 19), (byte) ((-72) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-1006748780) - View.resolveSize(0, 0), AndroidCharacter.getMirror('0') - 52711, (-10) - KeyEvent.getDeadChar(0, 0), objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(versionConstraints2);
        Object[] objArr6 = new Object[1];
        a((short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 17), (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) - 92), (-1006748760) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (-1000983994) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-10) - (Process.myPid() >> 22), objArr6);
        sb.append(((String) objArr6[0]).intern());
        String string = sb.toString();
        int i2 = asBinder + 123;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DefaultVar> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            DefaultVar$$serializer defaultVar$$serializer = DefaultVar$$serializer.INSTANCE;
            if (i3 != 0) {
                return defaultVar$$serializer;
            }
            throw null;
        }
    }

    public /* synthetic */ DefaultVar(int i, String str, String str2, boolean z, VersionConstraints versionConstraints, VersionConstraints versionConstraints2, okycx okycxVar) {
        if (7 != (i & 7)) {
            htf31.onExtraCallbackWithResult(i, 7, DefaultVar$$serializer.INSTANCE.getDescriptor());
            int i2 = asBinder + 69;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.key = str;
        this.value = str2;
        this.hasAbTests = z;
        if ((i & 8) == 0) {
            this.minVerConstraints = null;
            int i5 = IAuthTabCallbackDefault + 17;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        } else {
            this.minVerConstraints = versionConstraints;
        }
        if ((i & 16) == 0) {
            int i7 = asBinder + 9;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            this.maxVerConstraints = null;
        } else {
            this.maxVerConstraints = versionConstraints2;
        }
        this.currentVersion$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.tuba.variable.v2.spec.DefaultVar$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i9 = 2 % 2;
                int i10 = IAuthTabCallback + 113;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                ALCFeatureMatch aLCFeatureMatchIAuthTabCallback = DefaultVar.IAuthTabCallback();
                if (i11 == 0) {
                    int i12 = 91 / 0;
                }
                return aLCFeatureMatchIAuthTabCallback;
            }
        });
        this.minVersion$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.tuba.variable.v2.spec.DefaultVar$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i9 = 2 % 2;
                int i10 = onNavigationEvent + 1;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                ALCFeatureMatch aLCFeatureMatchOnNavigationEvent = DefaultVar.onNavigationEvent(this.f$0);
                int i12 = IAuthTabCallback + 53;
                onNavigationEvent = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 5 / 0;
                }
                return aLCFeatureMatchOnNavigationEvent;
            }
        });
        this.maxVersion$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.tuba.variable.v2.spec.DefaultVar$$ExternalSyntheticLambda2
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i9 = 2 % 2;
                int i10 = onWarmupCompleted + 91;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                ALCFeatureMatch aLCFeatureMatchIAuthTabCallbackDefault = DefaultVar.IAuthTabCallbackDefault(this.f$0);
                int i12 = onNavigationEvent + 41;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                return aLCFeatureMatchIAuthTabCallbackDefault;
            }
        });
        this.defaultValue$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.tuba.variable.v2.spec.DefaultVar$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i9 = 2 % 2;
                int i10 = onWarmupCompleted + 31;
                onExtraCallback = i10 % 128;
                Object obj = null;
                if (i10 % 2 != 0) {
                    DefaultVar.IAuthTabCallback(this.f$0);
                    throw null;
                }
                String strIAuthTabCallback = DefaultVar.IAuthTabCallback(this.f$0);
                int i11 = onExtraCallback + 75;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 != 0) {
                    return strIAuthTabCallback;
                }
                obj.hashCode();
                throw null;
            }
        });
        this.shouldFetchValueFromServer$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.tuba.variable.v2.spec.DefaultVar$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i9 = 2 % 2;
                int i10 = onNavigationEvent + 123;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                Boolean boolValueOf = Boolean.valueOf(DefaultVar.onExtraCallbackWithResult(this.f$0));
                if (i11 == 0) {
                    int i12 = 3 / 0;
                }
                return boolValueOf;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(DefaultVar defaultVar, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, defaultVar.key);
        vylVar.onExtraCallback(serialDescriptor, 1, defaultVar.value);
        vylVar.onNavigationEvent(serialDescriptor, 2, defaultVar.hasAbTests);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i2 = IAuthTabCallbackDefault + 91;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                VersionConstraints versionConstraints = defaultVar.minVerConstraints;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (defaultVar.minVerConstraints != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, DefaultVar$VersionConstraints$$serializer.INSTANCE, defaultVar.minVerConstraints);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || defaultVar.maxVerConstraints != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, DefaultVar$VersionConstraints$$serializer.INSTANCE, defaultVar.maxVerConstraints);
            int i3 = IAuthTabCallbackDefault + 25;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.key;
        int i4 = i3 + 31;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final ALCFeatureMatch IAuthTabCallbackStub() {
        int i = 2 % 2;
        ALCFeatureMatch aLCFeatureMatch = new ALCFeatureMatch(zzaj.onNavigationEvent().getSmallIconBitmap());
        int i2 = IAuthTabCallbackDefault + 123;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return aLCFeatureMatch;
        }
        throw null;
    }

    private final ALCFeatureMatch asBinder() {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ALCFeatureMatch aLCFeatureMatch = (ALCFeatureMatch) this.currentVersion$delegate.getValue();
        if (i3 != 0) {
            return aLCFeatureMatch;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        ALCFeatureMatch aLCFeatureMatch = new ALCFeatureMatch(zzaj.onNavigationEvent().getSmallIconBitmap());
        int i2 = IAuthTabCallbackDefault + 35;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return aLCFeatureMatch;
        }
        throw null;
    }

    private final ALCFeatureMatch getInterfaceDescriptor() {
        ALCFeatureMatch aLCFeatureMatch;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            aLCFeatureMatch = (ALCFeatureMatch) this.minVersion$delegate.getValue();
            int i3 = 31 / 0;
        } else {
            aLCFeatureMatch = (ALCFeatureMatch) this.minVersion$delegate.getValue();
        }
        int i4 = asBinder + 37;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return aLCFeatureMatch;
    }

    private static final ALCFeatureMatch onTransact(DefaultVar defaultVar) {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        VersionConstraints versionConstraints = defaultVar.minVerConstraints;
        Object obj = null;
        if (versionConstraints != null) {
            int i5 = i3 + 55;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                versionConstraints.onExtraCallbackWithResult();
                obj.hashCode();
                throw null;
            }
            String strOnExtraCallbackWithResult = versionConstraints.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult != null) {
                return new ALCFeatureMatch(strOnExtraCallbackWithResult);
            }
        }
        int i6 = asBinder + 121;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        VersionConstraints versionConstraints = ((DefaultVar) objArr[0]).minVerConstraints;
        if (versionConstraints != null) {
            int i2 = IAuthTabCallbackDefault + 75;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallbackWithResult = versionConstraints.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult != null) {
                ALCFeatureMatch aLCFeatureMatch = new ALCFeatureMatch(strOnExtraCallbackWithResult);
                int i4 = IAuthTabCallbackDefault + 117;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    return aLCFeatureMatch;
                }
                throw null;
            }
        }
        return null;
    }

    private static final ALCFeatureMatch asBinder(DefaultVar defaultVar) {
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        VersionConstraints versionConstraints = defaultVar.maxVerConstraints;
        if (versionConstraints != null && (strOnExtraCallbackWithResult = versionConstraints.onExtraCallbackWithResult()) != null) {
            return new ALCFeatureMatch(strOnExtraCallbackWithResult);
        }
        int i4 = IAuthTabCallbackDefault + 61;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final ALCFeatureMatch getInterfaceDescriptor(DefaultVar defaultVar) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 83;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        VersionConstraints versionConstraints = defaultVar.maxVerConstraints;
        Object obj = null;
        if (versionConstraints != null) {
            int i5 = i2 + 115;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            String strOnExtraCallbackWithResult = versionConstraints.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult != null) {
                ALCFeatureMatch aLCFeatureMatch = new ALCFeatureMatch(strOnExtraCallbackWithResult);
                int i7 = IAuthTabCallbackDefault + 33;
                asBinder = i7 % 128;
                if (i7 % 2 == 0) {
                    return aLCFeatureMatch;
                }
                obj.hashCode();
                throw null;
            }
        }
        return null;
    }

    private final ALCFeatureMatch onTransact() {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ALCFeatureMatch aLCFeatureMatch = (ALCFeatureMatch) this.maxVersion$delegate.getValue();
        int i4 = asBinder + 109;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return aLCFeatureMatch;
    }

    private static final String IAuthTabCallbackStubProxy(DefaultVar defaultVar) {
        String strOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            defaultVar.getInterfaceDescriptor();
            throw null;
        }
        if (defaultVar.getInterfaceDescriptor() != null) {
            ALCFeatureMatch aLCFeatureMatchAsBinder = defaultVar.asBinder();
            ALCFeatureMatch interfaceDescriptor = defaultVar.getInterfaceDescriptor();
            Intrinsics.checkNotNull(interfaceDescriptor);
            if (aLCFeatureMatchAsBinder.onExtraCallbackWithResult(interfaceDescriptor) < 0) {
                VersionConstraints versionConstraints = defaultVar.minVerConstraints;
                if (versionConstraints != null) {
                    int i3 = IAuthTabCallbackDefault + 113;
                    asBinder = i3 % 128;
                    int i4 = i3 % 2;
                    String strOnExtraCallback2 = versionConstraints.onExtraCallback();
                    if (strOnExtraCallback2 != null) {
                        int i5 = asBinder + 7;
                        IAuthTabCallbackDefault = i5 % 128;
                        int i6 = i5 % 2;
                        return strOnExtraCallback2;
                    }
                }
                return defaultVar.value;
            }
        }
        if (defaultVar.onTransact() != null) {
            ALCFeatureMatch aLCFeatureMatchAsBinder2 = defaultVar.asBinder();
            ALCFeatureMatch aLCFeatureMatchOnTransact = defaultVar.onTransact();
            Intrinsics.checkNotNull(aLCFeatureMatchOnTransact);
            if (aLCFeatureMatchAsBinder2.onExtraCallbackWithResult(aLCFeatureMatchOnTransact) > 0) {
                VersionConstraints versionConstraints2 = defaultVar.maxVerConstraints;
                if (versionConstraints2 == null || (strOnExtraCallback = versionConstraints2.onExtraCallback()) == null) {
                    return defaultVar.value;
                }
                int i7 = IAuthTabCallbackDefault + 81;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                return strOnExtraCallback;
            }
        }
        return defaultVar.value;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String strOnExtraCallback;
        DefaultVar defaultVar = (DefaultVar) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        if (defaultVar.getInterfaceDescriptor() != null) {
            ALCFeatureMatch aLCFeatureMatchAsBinder = defaultVar.asBinder();
            ALCFeatureMatch interfaceDescriptor = defaultVar.getInterfaceDescriptor();
            Intrinsics.checkNotNull(interfaceDescriptor);
            if (aLCFeatureMatchAsBinder.onExtraCallbackWithResult(interfaceDescriptor) < 0) {
                VersionConstraints versionConstraints = defaultVar.minVerConstraints;
                if (versionConstraints != null) {
                    int i2 = asBinder + 99;
                    IAuthTabCallbackDefault = i2 % 128;
                    if (i2 % 2 == 0) {
                        versionConstraints.onExtraCallback();
                        obj.hashCode();
                        throw null;
                    }
                    String strOnExtraCallback2 = versionConstraints.onExtraCallback();
                    if (strOnExtraCallback2 != null) {
                        return strOnExtraCallback2;
                    }
                }
                return defaultVar.value;
            }
        }
        if (defaultVar.onTransact() != null) {
            int i3 = IAuthTabCallbackDefault + 53;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                ALCFeatureMatch aLCFeatureMatchAsBinder2 = defaultVar.asBinder();
                ALCFeatureMatch aLCFeatureMatchOnTransact = defaultVar.onTransact();
                Intrinsics.checkNotNull(aLCFeatureMatchOnTransact);
                aLCFeatureMatchAsBinder2.onExtraCallbackWithResult(aLCFeatureMatchOnTransact);
                obj.hashCode();
                throw null;
            }
            ALCFeatureMatch aLCFeatureMatchAsBinder3 = defaultVar.asBinder();
            ALCFeatureMatch aLCFeatureMatchOnTransact2 = defaultVar.onTransact();
            Intrinsics.checkNotNull(aLCFeatureMatchOnTransact2);
            if (aLCFeatureMatchAsBinder3.onExtraCallbackWithResult(aLCFeatureMatchOnTransact2) > 0) {
                VersionConstraints versionConstraints2 = defaultVar.maxVerConstraints;
                if (versionConstraints2 != null && (strOnExtraCallback = versionConstraints2.onExtraCallback()) != null) {
                    return strOnExtraCallback;
                }
                String str = defaultVar.value;
                int i4 = IAuthTabCallbackDefault + 5;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    return str;
                }
                throw null;
            }
        }
        return defaultVar.value;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.shouldFetchValueFromServer$delegate.getValue()).booleanValue();
        int i4 = IAuthTabCallbackDefault + 53;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean access000(DefaultVar defaultVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 55 / 0;
            if (defaultVar.hasAbTests) {
                if (defaultVar.getInterfaceDescriptor() != null) {
                    int i4 = IAuthTabCallbackDefault + 89;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                    ALCFeatureMatch aLCFeatureMatchAsBinder = defaultVar.asBinder();
                    ALCFeatureMatch interfaceDescriptor = defaultVar.getInterfaceDescriptor();
                    Intrinsics.checkNotNull(interfaceDescriptor);
                    if (aLCFeatureMatchAsBinder.onExtraCallbackWithResult(interfaceDescriptor) >= 0) {
                        if (defaultVar.onTransact() == null) {
                            return true;
                        }
                        int i6 = IAuthTabCallbackDefault + 123;
                        asBinder = i6 % 128;
                        int i7 = i6 % 2;
                        ALCFeatureMatch aLCFeatureMatchAsBinder2 = defaultVar.asBinder();
                        ALCFeatureMatch aLCFeatureMatchOnTransact = defaultVar.onTransact();
                        Intrinsics.checkNotNull(aLCFeatureMatchOnTransact);
                        if (aLCFeatureMatchAsBinder2.onExtraCallbackWithResult(aLCFeatureMatchOnTransact) <= 0) {
                            return true;
                        }
                    }
                }
            }
        } else if (defaultVar.hasAbTests) {
        }
        return false;
    }

    private static final boolean extraCallbackWithResult(DefaultVar defaultVar) {
        int i = 2 % 2;
        if (!defaultVar.hasAbTests) {
            return false;
        }
        int i2 = IAuthTabCallbackDefault + 41;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (defaultVar.getInterfaceDescriptor() != null) {
            ALCFeatureMatch aLCFeatureMatchAsBinder = defaultVar.asBinder();
            ALCFeatureMatch interfaceDescriptor = defaultVar.getInterfaceDescriptor();
            Intrinsics.checkNotNull(interfaceDescriptor);
            if (aLCFeatureMatchAsBinder.onExtraCallbackWithResult(interfaceDescriptor) < 0) {
                return false;
            }
        }
        if (defaultVar.onTransact() != null) {
            int i4 = IAuthTabCallbackDefault + 107;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            ALCFeatureMatch aLCFeatureMatchAsBinder2 = defaultVar.asBinder();
            ALCFeatureMatch aLCFeatureMatchOnTransact = defaultVar.onTransact();
            Intrinsics.checkNotNull(aLCFeatureMatchOnTransact);
            if (aLCFeatureMatchAsBinder2.onExtraCallbackWithResult(aLCFeatureMatchOnTransact) > 0) {
                return false;
            }
        }
        return true;
    }

    @liq
    public static final class VersionConstraints {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final Companion Companion;
        private static char IAuthTabCallback = 0;
        private static int IAuthTabCallbackStub = 0;
        private static int asBinder = 1;
        private static int asInterface = 1;
        private static char onExtraCallback;
        private static char onExtraCallbackWithResult;
        private static char onNavigationEvent;
        private static int onWarmupCompleted;
        private final String androidVersion;
        private final String defaultValue;

        static {
            onWarmupCompleted();
            Companion = new Companion(null);
            int i = onWarmupCompleted + 3;
            asInterface = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public VersionConstraints() {
            String str = null;
            this(str, str, 3, (DefaultConstructorMarker) str);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallbackStub + 1;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof VersionConstraints)) {
                int i4 = IAuthTabCallbackStub + 87;
                asBinder = i4 % 128;
                return i4 % 2 == 0;
            }
            VersionConstraints versionConstraints = (VersionConstraints) obj;
            if (!Intrinsics.areEqual(this.defaultValue, versionConstraints.defaultValue)) {
                return false;
            }
            if (Intrinsics.areEqual(this.androidVersion, versionConstraints.androidVersion)) {
                return true;
            }
            int i5 = asBinder + 111;
            int i6 = i5 % 128;
            IAuthTabCallbackStub = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 105;
            asBinder = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 6 / 0;
            }
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 121;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            String str = this.defaultValue;
            int iHashCode2 = 0;
            if (str == null) {
                int i5 = i2 + 123;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.androidVersion;
            if (str2 != null) {
                int i7 = asBinder + 125;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                iHashCode2 = str2.hashCode();
            }
            int i9 = (iHashCode * 31) + iHashCode2;
            int i10 = asBinder + 101;
            IAuthTabCallbackStub = i10 % 128;
            if (i10 % 2 == 0) {
                return i9;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            String str = this.defaultValue;
            String str2 = this.androidVersion;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{33104, 34297, 24137, 33221, 20227, 36701, 41948, 39054, 39660, 2172, 58391, 23879, 42655, 5510, 24296, 11330, 14503, 16259, 18493, 2801, 11639, 44476, 3282, 50510, 51429, 13267, 37870, 55976, 4971, 59211, 25011, 53910}, Color.argb(0, 0, 0, 0) + 32, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            Object[] objArr2 = new Object[1];
            a(new char[]{49498, 2376, 3082, 54424, 42453, 8460, 5854, 25389, 8574, 1703, 6490, 36102, 53848, 53074, 39660, 2172, 22343, 12286}, Color.alpha(0) + 17, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(str2);
            Object[] objArr3 = new Object[1];
            a(new char[]{54865, 12936}, (KeyEvent.getMaxKeyCode() >> 16) + 1, objArr3);
            sb.append(((String) objArr3[0]).intern());
            String string = sb.toString();
            int i2 = IAuthTabCallbackStub + 37;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return string;
            }
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<VersionConstraints> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 51;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                DefaultVar$VersionConstraints$$serializer defaultVar$VersionConstraints$$serializer = DefaultVar$VersionConstraints$$serializer.INSTANCE;
                if (i3 != 0) {
                    return defaultVar$VersionConstraints$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public /* synthetic */ VersionConstraints(int i, String str, String str2, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.defaultValue = null;
                int i2 = asBinder + 55;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 3 % 5;
                } else {
                    int i4 = 2 % 2;
                }
            } else {
                this.defaultValue = str;
            }
            if ((i & 2) != 0) {
                this.androidVersion = str2;
                int i5 = asBinder + 101;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i6 = IAuthTabCallbackStub + 99;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            this.androidVersion = null;
            if (i7 == 0) {
                int i8 = 53 / 0;
            }
        }

        public VersionConstraints(@Nullable String str, @Nullable String str2) {
            this.defaultValue = str;
            this.androidVersion = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallback(VersionConstraints versionConstraints, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            Object obj = null;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i2 = IAuthTabCallbackStub + 83;
                asBinder = i2 % 128;
                if (i2 % 2 == 0) {
                    String str = versionConstraints.defaultValue;
                    obj.hashCode();
                    throw null;
                }
                if (versionConstraints.defaultValue != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, versionConstraints.defaultValue);
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i3 = asBinder + 89;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 != 0) {
                    String str2 = versionConstraints.androidVersion;
                    obj.hashCode();
                    throw null;
                }
                if (versionConstraints.androidVersion != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, versionConstraints.androidVersion);
                }
            }
            int i4 = asBinder + 43;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ VersionConstraints(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallbackStub + 53;
                asBinder = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 5 / 4;
                } else {
                    int i4 = 2 % 2;
                }
                str = null;
            }
            if ((i & 2) != 0) {
                int i5 = asBinder + 101;
                int i6 = i5 % 128;
                IAuthTabCallbackStub = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 97;
                asBinder = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 2 % 2;
                }
                str2 = null;
            }
            this(str, str2);
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = asBinder + 27;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            String str = this.defaultValue;
            int i5 = i3 + 39;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asBinder + 115;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return this.androidVersion;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i4 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i5 = $10 + 85;
                $11 = i5 % 128;
                int i6 = 58224;
                if (i5 % 2 == 0) {
                    cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    i2 = 1;
                } else {
                    cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                    i2 = i4;
                }
                while (i2 < 16) {
                    int i7 = $10 + 31;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i4];
                    int i9 = (c2 + i6) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                    int i10 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onNavigationEvent);
                        objArr2[2] = Integer.valueOf(i10);
                        objArr2[1] = Integer.valueOf(i9);
                        objArr2[i4] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char cResolveSize = (char) View.resolveSize(i4, i4);
                            int iIndexOf = TextUtils.indexOf("", "", i4) + 10;
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 12435;
                            Class[] clsArr = new Class[4];
                            clsArr[i4] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveSize, iIndexOf, iLastIndexOf, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 10 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getTapTimeout() >> 16) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i2++;
                        cArr3 = cArr4;
                        i4 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = cArr3;
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getPressedStateDuration() >> 16)), TextUtils.lastIndexOf("", '0', 0, 0) + 15, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 19902, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i11 = $11 + 57;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr3 = cArr5;
                i4 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        static void onWarmupCompleted() {
            onExtraCallbackWithResult = (char) 6929;
            onExtraCallback = (char) 29653;
            IAuthTabCallback = (char) 63137;
            onNavigationEvent = (char) 375;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getLongPressTimeout() >> 16)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 42, 22438 - TextUtils.lastIndexOf("", '0'), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $11 + 83;
                $10 = i6 % 128;
                i4 = i6 % 2 != 0 ? 0 : 1;
            }
            if (i4 != 0) {
                byte[] bArr = IAuthTabCallback;
                if (bArr != null) {
                    int i7 = $10 + 15;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i9 = 0; i9 < length; i9++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.getTrimmedLength("")), 55 - (ViewConfiguration.getLongPressTimeout() >> 16), 2167 - (ViewConfiguration.getTouchSlop() >> 8), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = IAuthTabCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43423), 43 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 22439 - ((Process.getThreadPriority(0) + 20) >> 6), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getJumpTapTimeout() >> 16) + 86, (-16767649) - Color.rgb(0, 0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = IAuthTabCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i10 = 0; i10 < length2; i10++) {
                        bArr5[i10] = (byte) (bArr4[i10] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        int i11 = $10 + 123;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        byte[] bArr6 = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            String string = sb.toString();
            int i13 = $10 + 3;
            $11 = i13 % 128;
            if (i13 % 2 != 0) {
                objArr[0] = string;
            } else {
                int i14 = 58 / 0;
                objArr[0] = string;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static /* synthetic */ ALCFeatureMatch onWarmupCompleted() {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (ALCFeatureMatch) onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[0], 398866368, -398866365, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback);
    }

    private static final String IAuthTabCallback_Parcel(DefaultVar defaultVar) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (String) onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{defaultVar}, 84496748, -84496746, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback);
    }

    private static final ALCFeatureMatch asInterface() {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (ALCFeatureMatch) onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[0], -1840264703, 1840264707, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback);
    }

    private static final ALCFeatureMatch access100(DefaultVar defaultVar) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (ALCFeatureMatch) onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{defaultVar}, -112421319, 112421319, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback);
    }

    public final String onNavigationEvent() {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (String) onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{this}, 1280857246, -1280857245, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback);
    }

    static void IAuthTabCallbackDefault() {
        onExtraCallbackWithResult = -1740235604;
        onWarmupCompleted = -1538795519;
        onExtraCallback = -1611786773;
        IAuthTabCallback = new byte[]{14, 114, 66, 124, -13, -96, 69, 75, 84, 78, 111, 66, 123, 53, 21, -9, 95, 39, -114, -116, 44, -39, 59, 12, 29, 32, 86, 81, 70, 37, 118, 17, 69, 46, -97, 59, 3, 78, 123, 114, 117, Byte.MIN_VALUE, 107, 122, -119, 117, 123, -84, 89, -115, -117, 96, 117, 124, -51, 100, 3, -104, 83, -52, -51, -38, 99, 84, -63, -51, 83, -90, 113, -59, -61, 116, -69, 94, 5, 94, -16};
    }
}
