package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgc;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$onExtraCallback;
import im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity$4;
import im.toss.devtool.runtime.data.util.Hilt_SchemeExecutorActivity$1;
import im.toss.global.features.leave.test.GlobalLeaveTestActivity$IAuthTabCallback;
import im.toss.network.throwable.TossApiCallException;
import im.toss.security.impl.malware.MalwareAppRepository$fetchMalwareAppList$2$;
import im.toss.security.impl.malware.MalwareDetectActivity$IAuthTabCallback;
import im.toss.security.impl.malware.MalwareDetectActivity$onExtraCallbackWithResult;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.bindContext;
import o.s7;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s5a {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static boolean IAuthTabCallbackDefault = false;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static final String onNavigationEvent;
    private static int onTransact = 1;
    private static boolean onWarmupCompleted;
    private final s5c IAuthTabCallback;

    static {
        onExtraCallback();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-123, -116, -118, -117, -122, -118, -122, -119, -120, -120, -121, -122, -123, -126, -124, -125, -126, -127}, 127 - Color.blue(0), objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        Companion = new onNavigationEvent(null);
        int i = asInterface + 97;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = i8 | i4;
        int i10 = (~(i7 | i8)) | (~(i7 | i4)) | (~i9);
        int i11 = ~i4;
        int i12 = (~(i2 | i11 | i3)) | (~(i7 | i11 | i8)) | (~(i9 | i3));
        int i13 = ~(i8 | i11 | i3);
        int i14 = i4 + i3 + i5 + ((-973178360) * i) + (1542423572 * i6);
        int i15 = i14 * i14;
        int i16 = (((-1657973228) * i4) - 1073741824) + ((-187520530) * i3) + ((-735226349) * i10) + (i12 * 735226349) + (735226349 * i13) + ((-922746880) * i5) + (1207959552 * i) + ((-1275068416) * i6) + (196542464 * i15);
        int i17 = (i4 * (-490823948)) + 944362368 + (i3 * (-490821954)) + (i10 * (-997)) + (i12 * 997) + (i13 * 997) + (i5 * (-490822951)) + (i * 2145288392) + (i6 * 779328756) + (i15 * (-1138819072));
        if (i16 + (i17 * i17 * 1440284672) == 1) {
            return onNavigationEvent(objArr);
        }
        s5a s5aVar = (s5a) objArr[0];
        List<s7> list = (List) objArr[1];
        int i18 = 2 % 2;
        int i19 = asBinder + 9;
        onTransact = i19 % 128;
        int i20 = i19 % 2;
        s5aVar.onExtraCallback(list);
        int i21 = asBinder + 35;
        onTransact = i21 % 128;
        int i22 = i21 % 2;
        return null;
    }

    @Inject
    public s5a(@NotNull s5c s5cVar) {
        Intrinsics.checkNotNullParameter(s5cVar, "");
        this.IAuthTabCallback = s5cVar;
    }

    public static final /* synthetic */ r8lambdaGP_URFhJ0yek514h9gLqn_ckvOI IAuthTabCallback(s5a s5aVar, Context context, PackageInfo packageInfo) {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaGP_URFhJ0yek514h9gLqn_ckvOI r8lambdagp_urfhj0yek514h9glqn_ckvoiOnExtraCallbackWithResult = s5aVar.onExtraCallbackWithResult(context, packageInfo);
        int i4 = onTransact + 19;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return r8lambdagp_urfhj0yek514h9glqn_ckvoiOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallback(s5a s5aVar, Context context, boolean z, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = s5aVar.IAuthTabCallback(context, z, (access13800<? super List<s7>>) access13800Var);
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ s5c onExtraCallbackWithResult(s5a s5aVar) {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        s5c s5cVar = s5aVar.IAuthTabCallback;
        if (i3 == 0) {
            return s5cVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onNavigationEvent(s5a s5aVar, Context context, boolean z, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = s5aVar.onExtraCallback(context, z, access13800Var);
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        int i5 = asBinder + 31;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return objOnExtraCallback;
    }

    public static final /* synthetic */ boolean onNavigationEvent(s5a s5aVar, ApplicationInfo applicationInfo) {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = s5aVar.onWarmupCompleted(applicationInfo);
        int i4 = asBinder + 113;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends s7>>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = -1321401592;
        private static int asBinder = 0;
        private static short[] onExtraCallback = null;
        private static int onExtraCallbackWithResult = -1538795518;
        private static int onNavigationEvent = 1367853498;
        private static int onTransact = 1;
        private static byte[] onWarmupCompleted = {45, -1, 13, -3, -9, 14, -11, 11, 4, 75, -80, -4, 3, -6, 95, -15, -54, -14, -12, -15, 0, 13, 74, 15, -77, -5, 11, 1, 9, 11, 74, -15, -54, -16, -16, 10, 6, -5, 67, 15, -71, -13, 92, -68, 8, 3, -10};
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $report;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(Context context, boolean z, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
            this.$report = z;
        }

        public static /* synthetic */ String onExtraCallbackWithResult(s7 s7Var) {
            int i = 2 % 2;
            int i2 = asBinder + 53;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            String strOnWarmupCompleted = onWarmupCompleted(s7Var);
            int i4 = asBinder + 83;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return strOnWarmupCompleted;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = s5a.this.new onWarmupCompleted(this.$context, this.$report, access13800Var);
            onwarmupcompleted.L$0 = obj;
            int i2 = asBinder + 55;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = asBinder + 45;
            onTransact = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super List<s7>> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = asBinder + 71;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 77 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super List<s7>> access13800Var) {
            int i = 2 % 2;
            int i2 = asBinder + 17;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = asBinder + 67;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* renamed from: o.s5a$onWarmupCompleted$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends s7>>, Object> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int[] IAuthTabCallback = {-2083183650, -691190306, -1908114180, 1887827037, -942607732, 1598575355, -448373651, 1991019864, 1630666435, 1266558496, 107152933, -1848712992, -1588454787, -1814238236, -1581594030, -530470837, -848756831, -816325798};
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ Context $context;
            final /* synthetic */ boolean $report;
            int label;
            final /* synthetic */ s5a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(s5a s5aVar, Context context, boolean z, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.this$0 = s5aVar;
                this.$context = context;
                this.$report = z;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super List<s7>> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 91;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 49;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, this.$context, this.$report, access13800Var);
                int i2 = onWarmupCompleted + 113;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 125;
                onWarmupCompleted = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super List<s7>> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    return IAuthTabCallback(findresandmsg, access13800Var);
                }
                Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                int i3 = 49 / 0;
                return objIAuthTabCallback;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
            
                kotlin.ResultKt.onNavigationEvent(r7);
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
            
                return r7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
            
                r3 = new java.lang.Object[1];
                a(new int[]{381560751, 505290443, -1652893718, -559138918, 1528163635, -752079968, -606562642, 1252505474, -920785139, -1308484817, -1776764608, -34458898, -951365361, 1285802350, -1171751340, 1086901014, -1954715620, -699366528, -412071380, -775991031, 2144750736, -221954843, 1621555843, -1773518387}, 47 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
            
                throw new java.lang.IllegalStateException(((java.lang.String) r3[0]).intern());
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
            
                kotlin.ResultKt.onNavigationEvent(r7);
                r7 = r6.this$0;
                r2 = r6.$context;
                r4 = r6.$report;
                r6.label = 1;
                r7 = o.s5a.onNavigationEvent(r7, r2, r4, r6);
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
            
                if (r7 != r1) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
            
                r7 = o.s5a.onWarmupCompleted.AnonymousClass5.onWarmupCompleted + 87;
                o.s5a.onWarmupCompleted.AnonymousClass5.onExtraCallback = r7 % 128;
                r7 = r7 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
            
                r1 = o.s5a.onWarmupCompleted.AnonymousClass5.onExtraCallback + 65;
                o.s5a.onWarmupCompleted.AnonymousClass5.onWarmupCompleted = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
            
                if ((r1 % 2) != 0) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
            
                return r7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
            
                if (r4 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
            
                if (r4 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
            
                if (r4 != 1) goto L12;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = o.s5a.onWarmupCompleted.AnonymousClass5.onExtraCallback
                    int r1 = r1 + 67
                    int r2 = r1 % 128
                    o.s5a.onWarmupCompleted.AnonymousClass5.onWarmupCompleted = r2
                    int r1 = r1 % r0
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L1c
                    java.lang.Object r1 = o.access14300.onWarmupCompleted()
                    int r4 = r6.label
                    r5 = 41
                    int r5 = r5 / r2
                    if (r4 == 0) goto L4c
                    goto L24
                L1c:
                    java.lang.Object r1 = o.access14300.onWarmupCompleted()
                    int r4 = r6.label
                    if (r4 == 0) goto L4c
                L24:
                    if (r4 != r3) goto L2a
                    kotlin.ResultKt.onNavigationEvent(r7)
                    return r7
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    r0 = 24
                    int[] r0 = new int[r0]
                    r0 = {x0076: FILL_ARRAY_DATA , data: [381560751, 505290443, -1652893718, -559138918, 1528163635, -752079968, -606562642, 1252505474, -920785139, -1308484817, -1776764608, -34458898, -951365361, 1285802350, -1171751340, 1086901014, -1954715620, -699366528, -412071380, -775991031, 2144750736, -221954843, 1621555843, -1773518387} // fill-array
                    int r1 = android.view.ViewConfiguration.getKeyRepeatTimeout()
                    int r1 = r1 >> 16
                    int r1 = 47 - r1
                    java.lang.Object[] r3 = new java.lang.Object[r3]
                    a(r0, r1, r3)
                    r0 = r3[r2]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.String r0 = r0.intern()
                    r7.<init>(r0)
                    throw r7
                L4c:
                    kotlin.ResultKt.onNavigationEvent(r7)
                    o.s5a r7 = r6.this$0
                    android.content.Context r2 = r6.$context
                    boolean r4 = r6.$report
                    r6.label = r3
                    java.lang.Object r7 = o.s5a.onNavigationEvent(r7, r2, r4, r6)
                    if (r7 != r1) goto L67
                    int r7 = o.s5a.onWarmupCompleted.AnonymousClass5.onWarmupCompleted
                    int r7 = r7 + 87
                    int r2 = r7 % 128
                    o.s5a.onWarmupCompleted.AnonymousClass5.onExtraCallback = r2
                    int r7 = r7 % r0
                    return r1
                L67:
                    int r1 = o.s5a.onWarmupCompleted.AnonymousClass5.onExtraCallback
                    int r1 = r1 + 65
                    int r2 = r1 % 128
                    o.s5a.onWarmupCompleted.AnonymousClass5.onWarmupCompleted = r2
                    int r1 = r1 % r0
                    if (r1 != 0) goto L73
                    return r7
                L73:
                    r7 = 0
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: o.s5a.onWarmupCompleted.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            private static void a(int[] iArr, int i, Object[] objArr) {
                int length;
                int[] iArr2;
                int i2;
                int i3 = 2 % 2;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr3 = IAuthTabCallback;
                if (iArr3 != null) {
                    int length2 = iArr3.length;
                    int[] iArr4 = new int[length2];
                    for (int i4 = 0; i4 < length2; i4++) {
                        iArr4[i4] = Hilt_QuickActionBottomSheetActivity$4.h(iArr3[i4]);
                    }
                    iArr3 = iArr4;
                }
                int length3 = iArr3.length;
                int[] iArr5 = new int[length3];
                int[] iArr6 = IAuthTabCallback;
                if (iArr6 != null) {
                    int i5 = $11 + 1;
                    $10 = i5 % 128;
                    if (i5 % 2 != 0) {
                        length = iArr6.length;
                        iArr2 = new int[length];
                        i2 = 1;
                    } else {
                        length = iArr6.length;
                        iArr2 = new int[length];
                        i2 = 0;
                    }
                    while (i2 < length) {
                        iArr2[i2] = Hilt_QuickActionBottomSheetActivity$4.h(iArr6[i2]);
                        i2++;
                    }
                    iArr6 = iArr2;
                }
                System.arraycopy(iArr6, 0, iArr5, 0, length3);
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                    int i6 = $11 + 85;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                    cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                    cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                    cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                    SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                    for (int i8 = 0; i8 < 16; i8++) {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i8];
                        int iJ = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ;
                    }
                    int i9 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i9;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
                    int i10 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                    int i11 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                    cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                    cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                    cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                    cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                    cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                    cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                    DevToolActionListViewModel$onExtraCallback.f(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                }
                objArr[0] = new String(cArr2, 0, i);
            }
        }

        /* renamed from: o.s5a$onWarmupCompleted$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends s7>>, Object> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static short[] IAuthTabCallback = null;
            private static int IAuthTabCallbackDefault = 0;
            private static int IAuthTabCallbackStub = 1;
            private static byte[] onExtraCallback = {85, -89, 87, 93, -92, 95, -95, -82, -31, 26, 86, -87, 80, -11, 91, 96, 88, 94, 91, -86, -89, -32, -91, 25, 81, -95, -85, -93, -95, -32, 91, 96, 90, 90, -96, -84, 81, -23, -91, 19, 89, -10, 22, -94, -87, 92, 8};
            private static int onExtraCallbackWithResult = -820429049;
            private static int onNavigationEvent = 721400897;
            private static int onWarmupCompleted = -1538795458;
            final /* synthetic */ Context $context;
            final /* synthetic */ boolean $report;
            int label;
            final /* synthetic */ s5a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(s5a s5aVar, Context context, boolean z, access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
                this.this$0 = s5aVar;
                this.$context = context;
                this.$report = z;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$context, this.$report, access13800Var);
                int i2 = IAuthTabCallbackStub + 73;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass2;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 97;
                IAuthTabCallbackDefault = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super List<s7>> access13800Var = (access13800) obj2;
                if (i2 % 2 != 0) {
                    onExtraCallback(findresandmsg, access13800Var);
                    throw null;
                }
                Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i3 = IAuthTabCallbackStub + 37;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super List<s7>> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 37;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallbackDefault + 17;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 119;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 == 0) {
                    access14300.onWarmupCompleted();
                    throw null;
                }
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i3 = this.label;
                if (i3 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    s5a s5aVar = this.this$0;
                    Context context = this.$context;
                    boolean z = this.$report;
                    this.label = 1;
                    Object objOnExtraCallback = s5a.onExtraCallback(s5aVar, context, z, this);
                    return objOnExtraCallback == objOnWarmupCompleted ? objOnWarmupCompleted : objOnExtraCallback;
                }
                if (i3 != 1) {
                    Object[] objArr = new Object[1];
                    a((short) TextUtils.getTrimmedLength(""), (byte) ((-86) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), View.MeasureSpec.getMode(0) + 1900516279, (-1801381549) - TextUtils.indexOf((CharSequence) "", '0'), View.getDefaultSize(0, 0) - 7, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
                int i4 = IAuthTabCallbackStub + 87;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 62 / 0;
                }
                return obj;
            }

            /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void a(short r14, byte r15, int r16, int r17, int r18, java.lang.Object[] r19) {
                /*
                    Method dump skipped, instructions count: 324
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o.s5a.onWarmupCompleted.AnonymousClass2.a(short, byte, int, int, int, java.lang.Object[]):void");
            }
        }

        private static final String onWarmupCompleted(s7 s7Var) {
            int i = 2 % 2;
            int i2 = asBinder + 65;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            String strIAuthTabCallback = s7Var.IAuthTabCallback();
            int i4 = onTransact + 105;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return strIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            Object objIAuthTabCallback;
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                ArrayList arrayList = new ArrayList();
                arrayList.add(maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass5(s5a.this, this.$context, this.$report, null), 3, (Object) null));
                arrayList.add(maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass2(s5a.this, this.$context, this.$report, null), 3, (Object) null));
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = access15400.onNavigationEvent(arrayList);
                this.label = 1;
                objIAuthTabCallback = ResourceCallback.IAuthTabCallback(arrayList, this);
                if (objIAuthTabCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (byte) (ViewConfiguration.getLongPressTimeout() >> 16), Drawable.resolveOpacity(0, 0) - 360372992, ExpandableListView.getPackedPositionChild(0L) + 171962034, (-12) - TextUtils.lastIndexOf("", '0', 0, 0), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i3 = onTransact + 57;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                ResultKt.onNavigationEvent(obj);
                int i5 = onTransact + 37;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                objIAuthTabCallback = obj;
            }
            return clearRevision.access000(clearRevision.IAuthTabCallback(clearRevision.onExtraCallbackWithResult(CollectionsKt.asSequence(CollectionsKt.flatten((Iterable) objIAuthTabCallback)), new onNavigationEvent()), new MalwareAppRepository$fetchMalwareAppList$2$.ExternalSyntheticLambda0()));
        }

        public static final class onNavigationEvent<T> implements Comparator {
            static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onNavigationEvent.class);

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5014);
                int i3 = (~iOnWarmupCompleted) & i2;
                int i4 = (~i2) & iOnWarmupCompleted;
                int i5 = (((i4 & i3) | (i3 ^ i4)) >> 2) & 1;
                Object obj = null;
                s7 s7Var = (s7) t2;
                if (i5 == 0) {
                    s7Var.onExtraCallbackWithResult().getLevel();
                    obj.hashCode();
                    throw null;
                }
                int level = s7Var.onExtraCallbackWithResult().getLevel();
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2265);
                int level2 = ((s7) t).onExtraCallbackWithResult().getLevel();
                Integer numValueOf = Integer.valueOf(level);
                Integer numValueOf2 = Integer.valueOf(level2);
                int i6 = IAuthTabCallback;
                int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4098);
                int i7 = (~iOnWarmupCompleted2) & i6;
                int i8 = (~i6) & iOnWarmupCompleted2;
                if (((((i8 & i7) | (i7 ^ i8)) >> 16) & 1) == 0) {
                    getCodeNameBytes.IAuthTabCallback(numValueOf, numValueOf2);
                    throw null;
                }
                int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(numValueOf, numValueOf2);
                int i9 = IAuthTabCallback;
                int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(18);
                int i10 = i9 & iOnWarmupCompleted3;
                if ((((((i9 ^ iOnWarmupCompleted3) | i10) & (~i10)) >> 21) & 1) == 0) {
                    return iIAuthTabCallback;
                }
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(short r14, byte r15, int r16, int r17, int r18, java.lang.Object[] r19) {
            /*
                Method dump skipped, instructions count: 349
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.s5a.onWarmupCompleted.a(short, byte, int, int, int, java.lang.Object[]):void");
        }
    }

    public final Object onNavigationEvent(@NotNull Context context, boolean z, @NotNull access13800<? super List<s7>> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onWarmupCompleted(context, z, null), access13800Var);
        int i2 = onTransact + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    private final Object onExtraCallback(Context context, boolean z, access13800<? super List<s7>> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onExtraCallbackWithResult(context, this, z, null), access13800Var);
        int i2 = asBinder + 43;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends s7>>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long onExtraCallback = -773410017331447836L;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $report;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Context context, boolean z, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
            this.$report = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$context, this.$report, access13800Var);
            int i2 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 19 / 0;
            }
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super List<s7>> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i3 = $11 + 103;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = MalwareDetectActivity$IAuthTabCallback.onExtraCallback.e(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4], timelineExternalSyntheticLambda0.onExtraCallbackWithResult, onExtraCallback);
                tryTriggerOnStart.d(timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0);
                int i5 = $11 + 9;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            }
            objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                s6 s6Var = s6.onWarmupCompleted;
                Context context = this.$context;
                boolean z = this.$report;
                this.label = 1;
                obj = s6Var.onExtraCallbackWithResult(context, z, (access13800<? super List<? extends HarmfulAppsData>>) this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    Object[] objArr = new Object[1];
                    a(new char[]{15911, 12043, 63273, 15940, 64282, 41858, 61077, 24014, 3495, 61431, 47670, 8546, 22848, 56145, 30300, 63121, 42162, 2222, 17404, 47781, 61575, 29697, 7964, 36420, 15464, 41073, 60604, 21474, 3008, 60874, 47319, 10004, 22312, 55592, 29820, 60197, 41735, 1684, 16784, 47318, 61167, 29347, 7482, 35885, 14869, 48716, 59724, 20886, 2478, 60333, 42748}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            }
            Iterable<HarmfulAppsData> iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            int i5 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            for (HarmfulAppsData harmfulAppsData : iterable) {
                int i7 = onExtraCallbackWithResult + 43;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                s7.onExtraCallbackWithResult onextracallbackwithresult = harmfulAppsData.apkCategory == 11 ? s7.onExtraCallbackWithResult.LOW : s7.onExtraCallbackWithResult.SUSPICIOUS;
                String str = harmfulAppsData.apkPackageName;
                Intrinsics.checkNotNullExpressionValue(str, "");
                arrayList.add(new s7(str, onextracallbackwithresult, false, 4, (DefaultConstructorMarker) null));
            }
            int i9 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            return arrayList;
        }
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends s7>>, Object> {
        private static final byte[] $$a;
        private static final int $$b = 175;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback;
        private static int onExtraCallback;
        private static long onWarmupCompleted;
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $report;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        final /* synthetic */ s5a this$0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r5, byte r6, short r7) {
            /*
                int r6 = r6 * 3
                int r6 = 102 - r6
                int r5 = r5 * 4
                int r5 = r5 + 4
                int r7 = r7 * 3
                int r0 = 11 - r7
                byte[] r1 = o.s5a.onExtraCallbackWithResult.$$a
                byte[] r0 = new byte[r0]
                int r7 = 10 - r7
                r2 = 0
                if (r1 != 0) goto L18
                r4 = r7
                r3 = r2
                goto L28
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L24:
                int r3 = r3 + 1
                r4 = r1[r5]
            L28:
                int r5 = r5 + 1
                int r6 = r6 + r4
                int r6 = r6 + 2
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.s5a.onExtraCallbackWithResult.$$c(byte, byte, short):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(Context context, s5a s5aVar, boolean z, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
            this.this$0 = s5aVar;
            this.$report = z;
        }

        public static native long b(long j, long j2, long j3, int i);

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$context, this.this$0, this.$report, access13800Var);
            onextracallbackwithresult.L$0 = obj;
            int i2 = IAuthTabCallback + 95;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 50 / 0;
            }
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 63;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super List<s7>> access13800Var) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 123;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static void a(char[] cArr, int i, Object[] objArr) {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i3 = $11 + 15;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = MalwareDetectActivity$IAuthTabCallback.onExtraCallback.e(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4], timelineExternalSyntheticLambda0.onExtraCallbackWithResult, onWarmupCompleted);
                tryTriggerOnStart.d(timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0);
                int i5 = $11 + 13;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            }
            objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x01ee, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(o.r8lambda2QRzBxsdKeIOemDAyDYxbxq54.class, kotlin.Unit.class) != false) goto L80;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws im.toss.network.throwable.TossApiCallException.ApiError {
            /*
                Method dump skipped, instructions count: 784
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.s5a.onExtraCallbackWithResult.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        static {
            byte[] bArr = {117, -24, -14, 98, 1, 3, -12, -26, 27, -9, 14, -19, 15, 5};
            $$a = bArr;
            ClassLoader parent = onExtraCallbackWithResult.class.getClassLoader().getParent();
            try {
                byte b = (byte) (bArr[4] - 1);
                byte b2 = b;
                Method declaredMethod = ClassLoader.class.getDeclaredMethod($$c(b, b2, b2), String.class);
                declaredMethod.setAccessible(true);
                System.load((String) declaredMethod.invoke(parent, "ea56"));
                IAuthTabCallback = 0;
                onExtraCallback = 1;
                onWarmupCompleted = -1963893978069535279L;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Context context = (Context) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onExtraCallback(context, zBooleanValue, null), (access13800) objArr[3]);
        int i2 = onTransact + 117;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    private final void onExtraCallback(List<s7> list) {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int size = list.size();
        for (s7 s7Var : list) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-115, -112, -113, -120, -120, -126, -115, -122, -123, -126, -124, -125, -126, -114, -115, -118, -117, -122, -118, -122, -119}, 126 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(size);
            String string = sb.toString();
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-122, -114, -126, -108, -122, -109, -126, -111, -117, -126, -110, -111, -120, -126}, 127 - TextUtils.getOffsetAfter("", 0), objArr2);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), s7Var.IAuthTabCallback());
            Object[] objArr3 = new Object[1];
            a(null, null, new byte[]{-122, -120, -106, -107, -120, -120, -126}, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr3);
            Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), s7Var.onExtraCallbackWithResult().getValue())});
            Object[] objArr4 = new Object[1];
            a(null, null, new byte[]{-123, -116, -118, -117, -122, -118, -122, -119, -120, -120, -121, -122, -123, -126, -124, -125, -126, -127}, ImageFormat.getBitsPerPixel(0) + 128, objArr4);
            ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, ((String) objArr4[0]).intern(), string, mapOnWarmupCompleted, null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            int i4 = asBinder + 97;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[PHI: r6
      0x002a: PHI (r6v2 int) = (r6v1 int), (r6v8 int) binds: [B:10:0x0028, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean onWarmupCompleted(android.content.pm.ApplicationInfo r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.s5a.asBinder
            int r2 = r1 + 5
            int r3 = r2 % 128
            o.s5a.onTransact = r3
            int r2 = r2 % r0
            r2 = 0
            if (r6 == 0) goto L51
            int r1 = r1 + 85
            int r3 = r1 % 128
            o.s5a.onTransact = r3
            int r1 = r1 % r0
            r3 = 1
            if (r1 != 0) goto L22
            int r6 = r6.flags
            boolean r1 = o.setReferrerImageURL.onNavigationEvent(r6, r3)
            if (r1 != 0) goto L50
            goto L2a
        L22:
            int r6 = r6.flags
            boolean r1 = o.setReferrerImageURL.onNavigationEvent(r6, r3)
            if (r1 != 0) goto L50
        L2a:
            int r1 = o.s5a.asBinder
            int r1 = r1 + 107
            int r4 = r1 % 128
            o.s5a.onTransact = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L3e
            r1 = 1179(0x49b, float:1.652E-42)
            boolean r6 = o.setReferrerImageURL.onNavigationEvent(r6, r1)
            if (r6 != 0) goto L50
            goto L46
        L3e:
            r1 = 128(0x80, float:1.8E-43)
            boolean r6 = o.setReferrerImageURL.onNavigationEvent(r6, r1)
            if (r6 != 0) goto L50
        L46:
            int r6 = o.s5a.onTransact
            int r6 = r6 + 99
            int r1 = r6 % 128
            o.s5a.asBinder = r1
            int r6 = r6 % r0
            return r2
        L50:
            return r3
        L51:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.s5a.onWarmupCompleted(android.content.pm.ApplicationInfo):boolean");
    }

    private final r8lambdaGP_URFhJ0yek514h9gLqn_ckvOI onExtraCallbackWithResult(Context context, PackageInfo packageInfo) {
        byte[] byteArray;
        String strIntern;
        int i = 2 % 2;
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNull(packageManager);
        String str = packageInfo.packageName;
        Intrinsics.checkNotNullExpressionValue(str, "");
        Signature signature = (Signature) CollectionsKt.firstOrNull(s3a.onExtraCallbackWithResult(packageManager, str));
        if (signature != null) {
            int i2 = onTransact + 5;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                signature.toByteArray();
                throw null;
            }
            byteArray = signature.toByteArray();
        } else {
            byteArray = null;
        }
        String str2 = packageInfo.packageName;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        if (byteArray != null) {
            int i3 = asBinder + 69;
            onTransact = i3 % 128;
            strIntern = i3 % 2 == 0 ? EstimateFaceQualityFromBGRImage.IAuthTabCallback(EstimateFaceQualityFromBGRImage.IAuthTabCallback, byteArray, true, 3, (Object) null) : EstimateFaceQualityFromBGRImage.IAuthTabCallback(EstimateFaceQualityFromBGRImage.IAuthTabCallback, byteArray, false, 2, (Object) null);
        } else {
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-104, -124, -116, -104, -111, -104, -105}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, objArr);
            strIntern = ((String) objArr[0]).intern();
        }
        String str3 = strIntern;
        long j = packageInfo.firstInstallTime;
        long j2 = packageInfo.lastUpdateTime;
        String str4 = packageInfo.packageName;
        Intrinsics.checkNotNullExpressionValue(str4, "");
        String strOnWarmupCompleted = s3a.onWarmupCompleted(packageManager, str4);
        String str5 = packageInfo.packageName;
        Intrinsics.checkNotNullExpressionValue(str5, "");
        return new r8lambdaGP_URFhJ0yek514h9gLqn_ckvOI(str2, str3, j, j2, strOnWarmupCompleted, s3a.onExtraCallback(packageManager, str5));
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onExtraCallbackWithResult;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr4[i3] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr3[i3]);
            }
            cArr3 = cArr4;
        }
        int iY = GlobalLeaveTestActivity$IAuthTabCallback.y(onExtraCallback);
        if (IAuthTabCallbackDefault) {
            int i4 = $11 + 53;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i5 = $11 + 29;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iY);
                Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (onWarmupCompleted) {
            int i7 = $10 + 59;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i9 = $10 + 107;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
        }
        objArr[0] = new String(cArr6);
    }

    public static final /* synthetic */ void onExtraCallback(s5a s5aVar, List list) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onWarmupCompleted(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{s5aVar, list}, iOnExtraCallbackWithResult, 1043963190, -1043963190, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    private final Object IAuthTabCallback(Context context, boolean z, access13800<? super List<s7>> access13800Var) {
        return onWarmupCompleted(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{this, context, Boolean.valueOf(z), access13800Var}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -2086528600, 2086528601, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = new char[]{32500, 32280, 32277, 32258, 32271, 32284, 32504, 32265, 32509, 32269, 32286, 32266, 32473, 32276, 32270, 32455, 32278, 32489, 32274, 32491, 32493, 32256, 32492, 32267};
        onExtraCallback = -1184334151;
        onWarmupCompleted = true;
        IAuthTabCallbackDefault = true;
    }
}
