package im.toss.devtool.action.presentation;

import android.os.Process;
import android.text.TextUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.GeckoHubImp;
import o.LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0;
import o.PKCS58;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.bindContext;
import o.findResAndMsg;
import o.getExtensionManager;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.s3;

/* loaded from: classes.dex */
final class DevToolActionListViewModel$IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    final /* synthetic */ getExtensionManager $action;
    int label;
    final /* synthetic */ DevToolActionListViewModel this$0;
    private static char[] IAuthTabCallback = {64961, 64989, 64979, 64915, 64966, 64965, 64984, 64964, 64916, 64963, 64991, 64967, 64981, 64978, 64982, 64962, 64985, 64986, 64990, 64977, 64980, 64988, 64976, 64960, 64987};
    private static char onNavigationEvent = 51244;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevToolActionListViewModel$IAuthTabCallback(DevToolActionListViewModel devToolActionListViewModel, getExtensionManager getextensionmanager, access13800<? super DevToolActionListViewModel$IAuthTabCallback> access13800Var) {
        super(2, access13800Var);
        this.this$0 = devToolActionListViewModel;
        this.$action = getextensionmanager;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        DevToolActionListViewModel$IAuthTabCallback devToolActionListViewModel$IAuthTabCallback = new DevToolActionListViewModel$IAuthTabCallback(this.this$0, this.$action, access13800Var);
        int i2 = onExtraCallbackWithResult + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return devToolActionListViewModel$IAuthTabCallback;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
        int i4 = onExtraCallbackWithResult + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return objOnWarmupCompleted;
    }

    public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        return objInvokeSuspend;
    }

    /* renamed from: im.toss.devtool.action.presentation.DevToolActionListViewModel$IAuthTabCallback$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted = 478308931;
        final /* synthetic */ getExtensionManager $action;
        int label;
        final /* synthetic */ DevToolActionListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(DevToolActionListViewModel devToolActionListViewModel, getExtensionManager getextensionmanager, access13800<? super AnonymousClass5> access13800Var) {
            super(2, access13800Var);
            this.this$0 = devToolActionListViewModel;
            this.$action = getextensionmanager;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, this.$action, access13800Var);
            int i2 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return anonymousClass5;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AnonymousClass5 anonymousClass5Create = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                anonymousClass5Create.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = anonymousClass5Create.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) {
            int i4 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i5 = $11 + 109;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback + i3);
                int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                cArr2[i7] = bindContext.access000.g(cArr2[i7], onWarmupCompleted);
                LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
            }
            if (i2 > 0) {
                int i8 = $10 + 77;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (!(!z)) {
                int i10 = $10 + 115;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
        
            r0 = new java.lang.Object[1];
            a(47 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 31, new char[]{65476, 6, '\t', '\n', 19, 22, '\t', 65476, 65483, '\r', 18, 26, 19, 15, '\t', 65483, 65476, 27, '\r', 24, '\f', 65476, 7, 19, 22, 19, 25, 24, '\r', 18, '\t', 7, 5, 16, 16, 65476, 24, 19, 65476, 65483, 22, '\t', 23, 25, 17, '\t', 65483}, false, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 198, r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0080, code lost:
        
            throw new java.lang.IllegalStateException(((java.lang.String) r0[0]).intern());
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r10.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r10.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            r2 = r2 + 103;
            im.toss.devtool.action.presentation.DevToolActionListViewModel$IAuthTabCallback.AnonymousClass5.onExtraCallbackWithResult = r2 % 128;
            r2 = r2 % 2;
            kotlin.ResultKt.onNavigationEvent(r11);
            r4 = new java.lang.Object[]{r10.this$0};
            r3 = im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            ((o.getScopeType) im.toss.devtool.action.presentation.DevToolActionListViewModel.IAuthTabCallback(im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 899842925, im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), r3, r4, -899842924, im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback())).onExtraCallback$252026d8(r10.$action);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = im.toss.devtool.action.presentation.DevToolActionListViewModel$IAuthTabCallback.AnonymousClass5.onExtraCallbackWithResult
                int r1 = r1 + 55
                int r2 = r1 % 128
                im.toss.devtool.action.presentation.DevToolActionListViewModel$IAuthTabCallback.AnonymousClass5.IAuthTabCallback = r2
                int r1 = r1 % r0
                r3 = 0
                if (r1 == 0) goto L17
                int r1 = r10.label
                r4 = 93
                int r4 = r4 / r3
                if (r1 != 0) goto L4f
                goto L1b
            L17:
                int r1 = r10.label
                if (r1 != 0) goto L4f
            L1b:
                int r2 = r2 + 103
                int r1 = r2 % 128
                im.toss.devtool.action.presentation.DevToolActionListViewModel$IAuthTabCallback.AnonymousClass5.onExtraCallbackWithResult = r1
                int r2 = r2 % r0
                kotlin.ResultKt.onNavigationEvent(r11)
                im.toss.devtool.action.presentation.DevToolActionListViewModel r11 = r10.this$0
                java.lang.Object[] r4 = new java.lang.Object[]{r11}
                int r3 = im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback()
                int r0 = im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback()
                int r6 = im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback()
                int r2 = im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback()
                r1 = 899842925(0x35a2836d, float:1.210819E-6)
                r5 = -899842924(0xffffffffca5d7c94, float:-3628837.0)
                java.lang.Object r11 = im.toss.devtool.action.presentation.DevToolActionListViewModel.IAuthTabCallback(r0, r1, r2, r3, r4, r5, r6)
                o.getScopeType r11 = (o.getScopeType) r11
                o.getExtensionManager r0 = r10.$action
                r11.onExtraCallback$252026d8(r0)
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            L4f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
                r1 = 47
                int r4 = 47 - r0
                int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
                int r5 = r0 + 31
                char[] r6 = new char[r1]
                r6 = {x0082: FILL_ARRAY_DATA , data: [-60, 6, 9, 10, 19, 22, 9, -60, -53, 13, 18, 26, 19, 15, 9, -53, -60, 27, 13, 24, 12, -60, 7, 19, 22, 19, 25, 24, 13, 18, 9, 7, 5, 16, 16, -60, 24, 19, -60, -53, 22, 9, 23, 25, 17, 9, -53} // fill-array
                r7 = 0
                float r0 = android.media.AudioTrack.getMinVolume()
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                int r8 = r0 + 198
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r9 = r0
                a(r4, r5, r6, r7, r8, r9)
                r0 = r0[r3]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                r11.<init>(r0)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: im.toss.devtool.action.presentation.DevToolActionListViewModel$IAuthTabCallback.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(obj);
            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, this.$action, null);
            this.label = 1;
            if (maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, anonymousClass5, this) == objOnWarmupCompleted) {
                int i5 = onExtraCallbackWithResult + 99;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return objOnWarmupCompleted;
            }
        } else {
            if (i4 != 1) {
                Object[] objArr = new Object[1];
                a(new char[]{23, '\f', 13919, 13919, 1, '\r', 23, 1, 5, 3, '\r', 24, 3, 19, '\r', '\t', 4, 18, '\n', '\r', 20, 1, '\r', 4, 7, 18, 0, 6, 1, 11, '\r', '\t', 2, '\b', 16, '\f', 23, 4, 23, 22, 1, 20, 1, 14, 16, 2, 13928}, (byte) (105 - TextUtils.indexOf("", "", 0, 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 47, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i7 = onExtraCallbackWithResult + 121;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            ResultKt.onNavigationEvent(obj);
            int i9 = onExtraCallback + 21;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
        }
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) {
        char[] cArr2;
        int i2;
        int i3;
        int i4;
        int i5;
        char[] cArr3;
        int length;
        char[] cArr4;
        int i6;
        int i7 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr5 = IAuthTabCallback;
        int i8 = 0;
        int i9 = 1;
        if (cArr5 != null) {
            int i10 = $10 + 5;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                length = cArr5.length;
                cArr4 = new char[length];
                i6 = 1;
            } else {
                length = cArr5.length;
                cArr4 = new char[length];
                i6 = 0;
            }
            while (i6 < length) {
                cArr4[i6] = PKCS58.onNavigationEvent.z(cArr5[i6]);
                i6++;
            }
            cArr2 = cArr4;
        } else {
            cArr2 = cArr5;
        }
        char cZ = PKCS58.onNavigationEvent.z(onNavigationEvent);
        char[] cArr6 = new char[i];
        if (i % 2 != 0) {
            int i11 = i - 1;
            cArr6[i11] = (char) (cArr[i11] - b);
            int i12 = $10 + 65;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 2 / 5;
            }
            i2 = i11;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i14 = $11 + 83;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i9];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i9] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    i3 = i2;
                    cArr3 = cArr6;
                    i4 = i9;
                    i5 = i8;
                } else {
                    i3 = i2;
                    char[] cArr7 = cArr6;
                    i4 = i9;
                    i5 = i8;
                    if (DevToolActionListViewModel$asInterface.A(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0) == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i16 = $10 + 95;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                        int I = s3.onExtraCallbackWithResult.I(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0);
                        int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr3 = cArr7;
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[I];
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                    } else {
                        cArr3 = cArr7;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cZ) - 1) % cZ;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cZ) - 1) % cZ;
                            int i19 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i20 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i19];
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i20];
                        } else {
                            int i21 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i22 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i21];
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i22];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                cArr6 = cArr3;
                i2 = i3;
                i9 = i4;
                i8 = i5;
            }
        }
        char[] cArr8 = cArr6;
        int i23 = i8;
        for (int i24 = i23; i24 < i; i24++) {
            int i25 = $10 + 107;
            $11 = i25 % 128;
            int i26 = i25 % 2;
            cArr8[i24] = (char) (cArr8[i24] ^ 13722);
        }
        objArr[i23] = new String(cArr8);
    }
}
