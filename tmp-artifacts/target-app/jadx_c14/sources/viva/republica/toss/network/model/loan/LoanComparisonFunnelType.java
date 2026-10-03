package viva.republica.toss.network.model.loan;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanComparisonFunnelType;
import viva.republica.toss.network.model.loan.LoanComparisonFunnelType$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanComparisonFunnelType {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final List<FunnelType> funnelTypes;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanComparisonFunnelType$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return LoanComparisonFunnelType.onExtraCallbackWithResult();
            }
            LoanComparisonFunnelType.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    })};

    /* JADX WARN: Illegal instructions before constructor call */
    public LoanComparisonFunnelType() {
        List list = null;
        this(list, 1, (DefaultConstructorMarker) list);
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnWarmupCompleted;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoanComparisonFunnelType$FunnelType$$serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof LoanComparisonFunnelType)) {
            return false;
        }
        if (Intrinsics.areEqual(this.funnelTypes, ((LoanComparisonFunnelType) obj).funnelTypes)) {
            return true;
        }
        int i3 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.funnelTypes.hashCode();
        int i4 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonFunnelType(funnelTypes=" + this.funnelTypes + ")";
        int i2 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @liq
    public static final class FunnelType {
        private static final Lazy<KSerializer<Object>>[] $childSerializers;
        public static final Companion Companion;
        private static int asBinder;
        private static char[] onNavigationEvent;
        private static long onWarmupCompleted;
        private final LoanFunnelType funnelType;
        private final String jobType;
        private static final byte[] $$a = {68, -59, -116, 119};
        private static final int $$b = 139;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        private static String $$c(byte b, short s, int i) {
            int i2 = b * 4;
            int i3 = s + 4;
            int i4 = (i * 2) + 97;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i2 + 1];
            int i5 = -1;
            if (bArr == null) {
                i4 = (-i4) + i2;
                i5 = -1;
            }
            while (true) {
                int i6 = i5 + 1;
                bArr2[i6] = (byte) i4;
                if (i6 == i2) {
                    return new String(bArr2, 0);
                }
                i3++;
                i4 = (-bArr[i3]) + i4;
                i5 = i6;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FunnelType() {
            this((LoanFunnelType) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerAsInterface = asInterface();
            int i4 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerAsInterface;
        }

        private static final /* synthetic */ KSerializer asInterface() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<LoanFunnelType> kSerializerSerializer = LoanFunnelType.Companion.serializer();
            int i4 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerSerializer;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 33;
            IAuthTabCallback = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FunnelType)) {
                int i4 = i2 + 9;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            FunnelType funnelType = (FunnelType) obj;
            if (this.funnelType != funnelType.funnelType || !Intrinsics.areEqual(this.jobType, funnelType.jobType)) {
                return false;
            }
            int i6 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.funnelType.hashCode();
            return i3 != 0 ? (iHashCode - 89) * this.jobType.hashCode() : (iHashCode * 31) + this.jobType.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "FunnelType(funnelType=" + this.funnelType + ", jobType=" + this.jobType + ")";
            int i2 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 40 / 0;
            }
            return str;
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i4 = $11 + 65;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59698 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 17 - View.combineMeasuredStates(0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 46134), 31 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 20220 - (Process.myPid() >> 22), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback3 == null) {
                                byte b = (byte) 0;
                                byte b2 = (byte) (b - 1);
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 49123), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 45, 1494 - (ViewConfiguration.getPressedStateDuration() >> 16), -1657859959, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i7 = $11 + 125;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                try {
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 44 - (ViewConfiguration.getTapTimeout() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1493, -1657859959, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            String str = new String(cArr);
            int i9 = $10 + 115;
            $11 = i9 % 128;
            if (i9 % 2 != 0) {
                objArr[0] = str;
            } else {
                int i10 = 9 / 0;
                objArr[0] = str;
            }
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<FunnelType> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 3;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                LoanComparisonFunnelType$FunnelType$$serializer loanComparisonFunnelType$FunnelType$$serializer = LoanComparisonFunnelType$FunnelType$$serializer.INSTANCE;
                if (i3 == 0) {
                    return loanComparisonFunnelType$FunnelType$$serializer;
                }
                throw null;
            }
        }

        static {
            asBinder = 1;
            onNavigationEvent();
            Companion = new Companion(null);
            $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanComparisonFunnelType$FunnelType$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 49;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        return LoanComparisonFunnelType.FunnelType.IAuthTabCallback();
                    }
                    LoanComparisonFunnelType.FunnelType.IAuthTabCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }), null};
            int i = onExtraCallback + 31;
            asBinder = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ FunnelType(int i, LoanFunnelType loanFunnelType, String str, okycx okycxVar) throws Throwable {
            if ((i & 1) == 0) {
                loanFunnelType = LoanFunnelType.MANUAL;
                int i2 = IAuthTabCallback + 111;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this.funnelType = loanFunnelType;
            if ((i & 2) != 0) {
                this.jobType = str;
                return;
            }
            Object[] objArr = new Object[1];
            a(ViewConfiguration.getPressedStateDuration() >> 16, 7 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (58993 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr);
            this.jobType = ((String) objArr[0]).intern();
            int i5 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public FunnelType(@NotNull LoanFunnelType loanFunnelType, @NotNull String str) {
            Intrinsics.checkNotNullParameter(loanFunnelType, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.funnelType = loanFunnelType;
            this.jobType = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[PHI: r1
          0x0026: PHI (r1v7 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001e, B:10:0x0024, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
          0x0020: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanComparisonFunnelType.FunnelType r8, o.vyl r9, kotlinx.serialization.descriptors.SerialDescriptor r10) throws java.lang.Throwable {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.loan.LoanComparisonFunnelType.FunnelType.onExtraCallbackWithResult
                int r1 = r1 + 125
                int r2 = r1 % 128
                viva.republica.toss.network.model.loan.LoanComparisonFunnelType.FunnelType.IAuthTabCallback = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 == 0) goto L18
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.LoanComparisonFunnelType.FunnelType.$childSerializers
                boolean r3 = r9.onWarmupCompleted(r10, r2)
                if (r3 != 0) goto L26
                goto L20
            L18:
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.LoanComparisonFunnelType.FunnelType.$childSerializers
                boolean r3 = r9.onWarmupCompleted(r10, r2)
                if (r3 != 0) goto L26
            L20:
                viva.republica.toss.network.model.loan.LoanFunnelType r3 = r8.funnelType
                viva.republica.toss.network.model.loan.LoanFunnelType r4 = viva.republica.toss.network.model.loan.LoanFunnelType.MANUAL
                if (r3 == r4) goto L33
            L26:
                r1 = r1[r2]
                java.lang.Object r1 = r1.getValue()
                o.py r1 = (o.py) r1
                viva.republica.toss.network.model.loan.LoanFunnelType r3 = r8.funnelType
                r9.onNavigationEvent(r10, r2, r1, r3)
            L33:
                r1 = 1
                boolean r3 = r9.onWarmupCompleted(r10, r1)
                if (r3 != 0) goto L67
                java.lang.String r3 = r8.jobType
                java.lang.String r4 = ""
                int r4 = android.text.TextUtils.indexOf(r4, r4, r2)
                float r5 = android.view.ViewConfiguration.getScrollFriction()
                r6 = 0
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                int r5 = r5 + 6
                r6 = 58992(0xe670, float:8.2665E-41)
                int r7 = android.graphics.ImageFormat.getBitsPerPixel(r2)
                int r6 = r6 - r7
                char r6 = (char) r6
                java.lang.Object[] r7 = new java.lang.Object[r1]
                a(r4, r5, r6, r7)
                r2 = r7[r2]
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r2 = r2.intern()
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r2)
                if (r2 == r1) goto L6c
            L67:
                java.lang.String r8 = r8.jobType
                r9.onExtraCallback(r10, r1, r8)
            L6c:
                int r8 = viva.republica.toss.network.model.loan.LoanComparisonFunnelType.FunnelType.onExtraCallbackWithResult
                int r8 = r8 + 89
                int r9 = r8 % 128
                viva.republica.toss.network.model.loan.LoanComparisonFunnelType.FunnelType.IAuthTabCallback = r9
                int r8 = r8 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonFunnelType.FunnelType.onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanComparisonFunnelType$FunnelType, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public static final /* synthetic */ Lazy[] onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i3 + 71;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 0 / 0;
            }
            return lazyArr;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ FunnelType(LoanFunnelType loanFunnelType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 47;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    loanFunnelType = LoanFunnelType.MANUAL;
                    int i3 = 8 / 0;
                } else {
                    loanFunnelType = LoanFunnelType.MANUAL;
                }
                int i4 = 2 % 2;
            }
            if ((i & 2) != 0) {
                int i5 = IAuthTabCallback + 9;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = new Object[1];
                a(Process.getGidForName("") + 1, 7 - Color.alpha(0), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 58993), objArr);
                str = ((String) objArr[0]).intern();
                int i7 = IAuthTabCallback + 57;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 2;
                }
            }
            this(loanFunnelType, str);
        }

        public final LoanFunnelType onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return this.funnelType;
            }
            throw null;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 43;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.jobType;
            int i5 = i2 + 65;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static void onNavigationEvent() {
            onNavigationEvent = new char[]{3056, 33271, 8150, 38335, 9114, 47486, 14147};
            onWarmupCompleted = 8253421728169224136L;
        }
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanComparisonFunnelType> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            LoanComparisonFunnelType$.serializer serializerVar = LoanComparisonFunnelType$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 85;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ LoanComparisonFunnelType(int i, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.funnelTypes = CollectionsKt.emptyList();
            int i2 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.funnelTypes = list;
        int i4 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
    }

    public LoanComparisonFunnelType(@NotNull List<FunnelType> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.funnelTypes = list;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            lazyArr = $childSerializers;
            int i4 = 85 / 0;
        } else {
            lazyArr = $childSerializers;
        }
        int i5 = i3 + 45;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.loan.LoanComparisonFunnelType r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.LoanComparisonFunnelType.$childSerializers
            r2 = 0
            boolean r3 = r7.onWarmupCompleted(r8, r2)
            r4 = 1
            if (r3 == r4) goto L23
            int r3 = viva.republica.toss.network.model.loan.LoanComparisonFunnelType.onExtraCallbackWithResult
            int r3 = r3 + 119
            int r5 = r3 % 128
            viva.republica.toss.network.model.loan.LoanComparisonFunnelType.onNavigationEvent = r5
            int r3 = r3 % r0
            java.util.List<viva.republica.toss.network.model.loan.LoanComparisonFunnelType$FunnelType> r3 = r6.funnelTypes
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r5)
            r3 = r3 ^ r4
            if (r3 == 0) goto L39
        L23:
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<viva.republica.toss.network.model.loan.LoanComparisonFunnelType$FunnelType> r6 = r6.funnelTypes
            r7.onNavigationEvent(r8, r2, r1, r6)
            int r6 = viva.republica.toss.network.model.loan.LoanComparisonFunnelType.onExtraCallbackWithResult
            int r6 = r6 + 3
            int r7 = r6 % 128
            viva.republica.toss.network.model.loan.LoanComparisonFunnelType.onNavigationEvent = r7
            int r6 = r6 % r0
        L39:
            int r6 = viva.republica.toss.network.model.loan.LoanComparisonFunnelType.onNavigationEvent
            int r6 = r6 + 23
            int r7 = r6 % 128
            viva.republica.toss.network.model.loan.LoanComparisonFunnelType.onExtraCallbackWithResult = r7
            int r6 = r6 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonFunnelType.onNavigationEvent(viva.republica.toss.network.model.loan.LoanComparisonFunnelType, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanComparisonFunnelType(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                list = CollectionsKt.emptyList();
                int i3 = 2 % 2;
            } else {
                CollectionsKt.emptyList();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        this(list);
    }

    public final List<FunnelType> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 51;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<FunnelType> list = this.funnelTypes;
        int i4 = i2 + 41;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }
}
