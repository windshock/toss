package im.toss.devtool.action.presentation;

import im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity$4;
import im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity$5;
import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
import im.toss.global.features.leave.test.Hilt_GlobalLeaveTestActivity$4;
import im.toss.security.impl.malware.MalwareDetectActivity$IAuthTabCallback;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.EngineConfig1;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.access15400;
import o.bindContext;
import o.findResAndMsg;
import o.getExtensionManager;
import o.getExternalTransactionToken;
import o.getScopeType;
import o.internalStart;
import o.tryTriggerOnStart;

/* loaded from: classes.dex */
final class DevToolActionListViewModel$onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static long onExtraCallbackWithResult = 3460722661511299959L;
    private static int onWarmupCompleted = 1;
    final /* synthetic */ boolean $isAlphaPackage;
    final /* synthetic */ boolean $isTossTeam;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ DevToolActionListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevToolActionListViewModel$onWarmupCompleted(DevToolActionListViewModel devToolActionListViewModel, boolean z, boolean z2, access13800<? super DevToolActionListViewModel$onWarmupCompleted> access13800Var) {
        super(2, access13800Var);
        this.this$0 = devToolActionListViewModel;
        this.$isTossTeam = z;
        this.$isAlphaPackage = z2;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        DevToolActionListViewModel$onWarmupCompleted devToolActionListViewModel$onWarmupCompleted = new DevToolActionListViewModel$onWarmupCompleted(this.this$0, this.$isTossTeam, this.$isAlphaPackage, access13800Var);
        devToolActionListViewModel$onWarmupCompleted.L$0 = obj;
        int i2 = onWarmupCompleted + 29;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return devToolActionListViewModel$onWarmupCompleted;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
        int i4 = onWarmupCompleted + 59;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnExtraCallback;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        DevToolActionListViewModel$onWarmupCompleted devToolActionListViewModel$onWarmupCompletedCreate = create(findresandmsg, access13800Var);
        if (i3 == 0) {
            return devToolActionListViewModel$onWarmupCompletedCreate.invokeSuspend(Unit.INSTANCE);
        }
        int i4 = 56 / 0;
        return devToolActionListViewModel$onWarmupCompletedCreate.invokeSuspend(Unit.INSTANCE);
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int[] onWarmupCompleted = {1854646085, -1349595538, -1822789657, -732403882, 9661400, 383823652, 318899201, 1761473363, -457291637, -1170980967, 999902308, 762897507, 1143888628, -304767381, -1518419906, -1663753220, -1974946474, 367331086};
        int label;
        final /* synthetic */ DevToolActionListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(DevToolActionListViewModel devToolActionListViewModel, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.this$0 = devToolActionListViewModel;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.this$0, access13800Var);
            int i2 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            }
            onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
        
            if (r8.emit(r2, r7) != r1) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = im.toss.devtool.action.presentation.DevToolActionListViewModel$onWarmupCompleted.onExtraCallbackWithResult.onNavigationEvent
                int r1 = r1 + 3
                int r2 = r1 % 128
                im.toss.devtool.action.presentation.DevToolActionListViewModel$onWarmupCompleted.onExtraCallbackWithResult.onExtraCallbackWithResult = r2
                int r1 = r1 % r0
                if (r1 == 0) goto Lb3
                java.lang.Object r1 = o.access14300.onWarmupCompleted()
                int r2 = r7.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L50
                if (r2 == r4) goto L4c
                int r1 = im.toss.devtool.action.presentation.DevToolActionListViewModel$onWarmupCompleted.onExtraCallbackWithResult.onExtraCallbackWithResult
                int r1 = r1 + 45
                int r5 = r1 % 128
                im.toss.devtool.action.presentation.DevToolActionListViewModel$onWarmupCompleted.onExtraCallbackWithResult.onNavigationEvent = r5
                int r1 = r1 % r0
                if (r2 != r0) goto L2a
                kotlin.ResultKt.onNavigationEvent(r8)
                goto La2
            L2a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                r0 = 24
                int[] r0 = new int[r0]
                r0 = {x00bc: FILL_ARRAY_DATA , data: [-1175003631, 212955451, -1798667578, -743237331, 1710296937, 1628373738, -622747648, -358999623, -792541908, -2097089028, -509597408, -312133342, -1884631047, -431316840, 720355666, 51645723, -2025107730, 1241709593, -869647491, -1208123589, 2127159852, 1939701502, 1470827537, 687140961} // fill-array
                int r1 = android.os.Process.myTid()
                int r1 = r1 >> 22
                int r1 = 47 - r1
                java.lang.Object[] r2 = new java.lang.Object[r4]
                a(r0, r1, r2)
                r0 = r2[r3]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                r8.<init>(r0)
                throw r8
            L4c:
                kotlin.ResultKt.onNavigationEvent(r8)
                goto L91
            L50:
                kotlin.ResultKt.onNavigationEvent(r8)
                im.toss.devtool.action.presentation.DevToolActionListViewModel r8 = r7.this$0
                o.getCornerRadius r8 = im.toss.devtool.action.presentation.DevToolActionListViewModel.asBinder(r8)
                java.lang.Object r8 = r8.IAuthTabCallback()
                boolean r8 = r8 instanceof o.internalStart.onExtraCallback
                if (r8 != 0) goto La2
                int r8 = im.toss.devtool.action.presentation.DevToolActionListViewModel$onWarmupCompleted.onExtraCallbackWithResult.onNavigationEvent
                int r8 = r8 + 107
                int r2 = r8 % 128
                im.toss.devtool.action.presentation.DevToolActionListViewModel$onWarmupCompleted.onExtraCallbackWithResult.onExtraCallbackWithResult = r2
                int r8 = r8 % r0
                if (r8 != 0) goto L7f
                o.setLogBuffers$IAuthTabCallback r8 = o.setLogBuffers.Companion
                r8 = 23717(0x5ca5, float:3.3235E-41)
                o.setRevision r2 = o.setRevision.MILLISECONDS
                long r5 = o.setCommandLine.onWarmupCompleted(r8, r2)
                r7.label = r4
                java.lang.Object r8 = o.formatMsgs.IAuthTabCallback(r5, r7)
                if (r8 == r1) goto La1
                goto L91
            L7f:
                o.setLogBuffers$IAuthTabCallback r8 = o.setLogBuffers.Companion
                r8 = 500(0x1f4, float:7.0E-43)
                o.setRevision r2 = o.setRevision.MILLISECONDS
                long r5 = o.setCommandLine.onWarmupCompleted(r8, r2)
                r7.label = r4
                java.lang.Object r8 = o.formatMsgs.IAuthTabCallback(r5, r7)
                if (r8 == r1) goto La1
            L91:
                im.toss.devtool.action.presentation.DevToolActionListViewModel r8 = r7.this$0
                o.getCornerRadius r8 = im.toss.devtool.action.presentation.DevToolActionListViewModel.asBinder(r8)
                o.internalStart$onExtraCallbackWithResult r2 = o.internalStart.onExtraCallbackWithResult.IAuthTabCallback
                r7.label = r0
                java.lang.Object r8 = r8.emit(r2, r7)
                if (r8 != r1) goto La2
            La1:
                return r1
            La2:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                int r1 = im.toss.devtool.action.presentation.DevToolActionListViewModel$onWarmupCompleted.onExtraCallbackWithResult.onExtraCallbackWithResult
                int r1 = r1 + 111
                int r2 = r1 % 128
                im.toss.devtool.action.presentation.DevToolActionListViewModel$onWarmupCompleted.onExtraCallbackWithResult.onNavigationEvent = r2
                int r1 = r1 % r0
                if (r1 == 0) goto Lb2
                r0 = 93
                int r0 = r0 / r3
            Lb2:
                return r8
            Lb3:
                o.access14300.onWarmupCompleted()
                r8 = 0
                r8.hashCode()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: im.toss.devtool.action.presentation.DevToolActionListViewModel$onWarmupCompleted.onExtraCallbackWithResult.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        private static void a(int[] iArr, int i, Object[] objArr) {
            int length;
            int[] iArr2;
            int i2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = onWarmupCompleted;
            if (iArr3 != null) {
                int i4 = $11 + 67;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i2 = 1;
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i2 = 0;
                }
                while (i2 < length) {
                    iArr2[i2] = Hilt_QuickActionBottomSheetActivity$4.h(iArr3[i2]);
                    i2++;
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onWarmupCompleted;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i5 = $10 + 97;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                for (int i7 = 0; i7 < length3; i7++) {
                    iArr6[i7] = Hilt_QuickActionBottomSheetActivity$4.h(iArr5[i7]);
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i8 = 0;
                while (i8 < 16) {
                    int i9 = $10 + 3;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i8];
                        int iJ = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ;
                        i8 += 121;
                    } else {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i8];
                        int iJ2 = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ2;
                        i8++;
                    }
                }
                int i10 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i10;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i11 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i12 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                DevToolActionListViewModel$onExtraCallback.f(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 105;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = MalwareDetectActivity$IAuthTabCallback.onExtraCallback.e(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4], timelineExternalSyntheticLambda0.onExtraCallbackWithResult, onExtraCallbackWithResult);
            tryTriggerOnStart.d(timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0);
            int i5 = $11 + 43;
            $10 = i5 % 128;
            int i6 = i5 % 2;
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super internalStart.onExtraCallback>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] IAuthTabCallback = {27230, 27141, 27198, 27168, 27168, 27146, 27151, 27175, 27198, 27198, 27196, 27194, 27168, 27173, 27175, 27178, 27180, 27176, 27170, 27144, 27140, 27199, 27145, 27245, 27138, 27173, 27170, 27194, 27199, 27175, 27144, 27245, 27151, 27181, 27179, 27172, 27198, 27173, 27148, 27245, 27142, 27173, 27196, 27196, 27171, 27174, 27144};
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ boolean $isAlphaPackage;
        final /* synthetic */ boolean $isTossTeam;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        final /* synthetic */ DevToolActionListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(DevToolActionListViewModel devToolActionListViewModel, boolean z, boolean z2, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.this$0 = devToolActionListViewModel;
            this.$isTossTeam = z;
            this.$isAlphaPackage = z2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.this$0, this.$isTossTeam, this.$isAlphaPackage, access13800Var);
            int i2 = onExtraCallbackWithResult + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super internalStart.onExtraCallback> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object objOnWarmupCompleted;
            List list;
            List list2;
            int i = 2 % 2;
            Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {this.this$0};
                int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
                List listTake = CollectionsKt.take(CollectionsKt.asReversed(((getScopeType) DevToolActionListViewModel.IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 899842925, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, objArr, -899842924, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback())).onWarmupCompleted()), 3);
                boolean z = this.$isTossTeam;
                boolean z2 = this.$isAlphaPackage;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listTake) {
                    if (((getExtensionManager) obj2).onNavigationEvent(z, z2)) {
                        arrayList2.add(obj2);
                    }
                }
                Object[] objArr2 = {this.this$0};
                int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
                List listOnExtraCallbackWithResult = ((getScopeType) DevToolActionListViewModel.IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 899842925, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback2, objArr2, -899842924, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback())).onExtraCallbackWithResult();
                boolean z3 = this.$isTossTeam;
                boolean z4 = this.$isAlphaPackage;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : listOnExtraCallbackWithResult) {
                    if (((getExtensionManager) obj3).onNavigationEvent(z3, z4)) {
                        int i3 = onExtraCallbackWithResult + 41;
                        onWarmupCompleted = i3 % 128;
                        if (i3 % 2 == 0) {
                            arrayList3.add(obj3);
                            int i4 = 17 / 0;
                        } else {
                            arrayList3.add(obj3);
                        }
                    }
                }
                Object[] objArr3 = {this.this$0};
                int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
                List listIAuthTabCallback = ((getScopeType) DevToolActionListViewModel.IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 899842925, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback3, objArr3, -899842924, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback())).IAuthTabCallback();
                boolean z5 = this.$isTossTeam;
                boolean z6 = this.$isAlphaPackage;
                arrayList = new ArrayList();
                for (Object obj4 : listIAuthTabCallback) {
                    if (((getExtensionManager) obj4).onNavigationEvent(z5, z6)) {
                        arrayList.add(obj4);
                        int i5 = onWarmupCompleted + 45;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
                DevToolActionListViewModel devToolActionListViewModel = this.this$0;
                this.L$0 = access15400.onNavigationEvent(arrayList2);
                this.L$1 = access15400.onNavigationEvent(arrayList3);
                this.L$2 = access15400.onNavigationEvent(arrayList);
                this.L$3 = arrayList2;
                this.L$4 = arrayList3;
                this.L$5 = arrayList;
                this.label = 1;
                objOnWarmupCompleted = DevToolActionListViewModel.onWarmupCompleted(devToolActionListViewModel, arrayList, this);
                if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                    return objOnWarmupCompleted2;
                }
                list = arrayList2;
                list2 = arrayList3;
            } else {
                if (i2 != 1) {
                    Object[] objArr4 = new Object[1];
                    a(new int[]{0, 47, 0, 15}, false, new byte[]{0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0}, objArr4);
                    throw new IllegalStateException(((String) objArr4[0]).intern());
                }
                int i7 = onExtraCallbackWithResult + 69;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                ?? r1 = (List) this.L$5;
                list2 = (List) this.L$4;
                list = (List) this.L$3;
                ResultKt.onNavigationEvent(obj);
                arrayList = r1;
                objOnWarmupCompleted = obj;
            }
            return new internalStart.onExtraCallback(list, list2, arrayList, (Map) objOnWarmupCompleted);
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) {
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = IAuthTabCallback;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i6 = 0; i6 < length; i6++) {
                    int i7 = $10 + 63;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        cArr2[i6] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr[i6]);
                    } else {
                        cArr2[i6] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr[i6]);
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr, i2, cArr3, 0, i3);
            if (bArr != null) {
                int i8 = $10 + 13;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char[] cArr4 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i10 = $10 + 35;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                    } else {
                        cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = getExternalTransactionToken.q(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                        int i12 = $11 + 13;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Hilt_SchemeHistoryActivity$5.w(trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0);
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 0, i3);
                int i14 = i3 - i5;
                System.arraycopy(cArr5, 0, cArr3, i14, i5);
                System.arraycopy(cArr5, i5, cArr3, 0, i14);
            }
            if (z) {
                char[] cArr6 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                int i15 = $11 + 21;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i17 = $10 + 63;
                    $11 = i17 % 128;
                    if (i17 % 2 == 0) {
                        cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 / trackGroupExternalSyntheticLambda0.onNavigationEvent) << 1];
                    } else {
                        cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    }
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr3 = cArr6;
            }
            if (i4 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                int i18 = $10 + 63;
                $11 = i18 % 128;
                int i19 = i18 % 2;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ae, code lost:
    
        if (r14 != r9) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0126, code lost:
    
        if (r4.emit(r5, r13) != r9) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0102 A[PHI: r5
      0x0102: PHI (r5v7 o.internalStart$onExtraCallback) = (r5v6 o.internalStart$onExtraCallback), (r5v10 o.internalStart$onExtraCallback) binds: [B:32:0x0100, B:29:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010a A[PHI: r5
      0x010a: PHI (r5v8 o.internalStart$onExtraCallback) = (r5v6 o.internalStart$onExtraCallback), (r5v10 o.internalStart$onExtraCallback) binds: [B:32:0x0100, B:29:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0131  */
    /* JADX WARN: Type inference failed for: r3v12, types: [o.GeckoHubImp1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, o.GeckoHubImp1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.toss.devtool.action.presentation.DevToolActionListViewModel$onWarmupCompleted.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
