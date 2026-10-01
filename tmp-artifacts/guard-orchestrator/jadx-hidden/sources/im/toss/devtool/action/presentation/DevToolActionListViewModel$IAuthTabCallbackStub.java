package im.toss.devtool.action.presentation;

import android.graphics.ImageFormat;
import android.os.Process;
import android.view.ViewConfiguration;
import im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity$5;
import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
import im.toss.global.features.leave.test.Hilt_GlobalLeaveTestActivity$4;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.EngineConfig1;
import o.GeckoHubImp;
import o.HttpDataSourceInvalidResponseCodeException;
import o.TimelineExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.getExtensionManager;
import o.getExternalTransactionToken;
import o.getPageByNodeId;
import o.getScopeType;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.s5a;

/* loaded from: classes.dex */
final class DevToolActionListViewModel$IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    final /* synthetic */ List<getExtensionManager> $quickActions;
    int label;
    final /* synthetic */ DevToolActionListViewModel this$0;
    private static char[] onNavigationEvent = {11680, 26436, 47203, 52509, 1659, 23497, 60616, 8617, 31444, 36775, 49498, 6738, 44926, 57344, 13618, 20126, 33667, 54503, 27018, 41655, 62548, 2415, 16994, 38729, 10356, 32220, 46833, 52215, 7300, 20902, 60242, 15422, 28963, 35346, 57126, 4293, 42483, 65245, 13188, 17574, 40513, 54138, 25610, 47381, 61986, 1987, 22770};
    private static long onExtraCallbackWithResult = -6636546486568310990L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevToolActionListViewModel$IAuthTabCallbackStub(DevToolActionListViewModel devToolActionListViewModel, List<getExtensionManager> list, access13800<? super DevToolActionListViewModel$IAuthTabCallbackStub> access13800Var) {
        super(2, access13800Var);
        this.this$0 = devToolActionListViewModel;
        this.$quickActions = list;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        DevToolActionListViewModel$IAuthTabCallbackStub devToolActionListViewModel$IAuthTabCallbackStub = new DevToolActionListViewModel$IAuthTabCallbackStub(this.this$0, this.$quickActions, access13800Var);
        int i2 = onExtraCallback + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 96 / 0;
        }
        return devToolActionListViewModel$IAuthTabCallbackStub;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
        int i4 = onWarmupCompleted + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallbackWithResult;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onExtraCallback + 43;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    private static void a(int i, int i2, char c, Object[] objArr) {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 115;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                jArr[i5] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(onNavigationEvent[i >>> i5]), i5, onExtraCallbackWithResult, c);
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                jArr[i6] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(onNavigationEvent[i + i6]), i6, onExtraCallbackWithResult, c);
            }
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 103;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
            int i9 = $11 + 85;
            $10 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr);
    }

    /* renamed from: im.toss.devtool.action.presentation.DevToolActionListViewModel$IAuthTabCallbackStub$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static char[] onExtraCallback = {27229, 27144, 27174, 27171, 27196, 27196, 27173, 27142, 27245, 27148, 27173, 27198, 27172, 27179, 27181, 27151, 27245, 27144, 27175, 27199, 27194, 27170, 27173, 27138, 27245, 27145, 27199, 27140, 27144, 27170, 27176, 27180, 27178, 27175, 27173, 27168, 27194, 27196, 27198, 27198, 27175, 27151, 27146, 27168, 27168, 27198, 27141};
        private static int onWarmupCompleted = 1;
        final /* synthetic */ List<getExtensionManager> $quickActions;
        int label;
        final /* synthetic */ DevToolActionListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(DevToolActionListViewModel devToolActionListViewModel, List<getExtensionManager> list, access13800<? super AnonymousClass2> access13800Var) {
            super(2, access13800Var);
            this.this$0 = devToolActionListViewModel;
            this.$quickActions = list;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 51;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$quickActions, access13800Var);
            int i2 = IAuthTabCallback + 121;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return anonymousClass2;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objIAuthTabCallback;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                int i3 = 57 / 0;
            } else {
                objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            }
            int i4 = onWarmupCompleted + 37;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a(new int[]{0, 47, 0, 32}, true, new byte[]{1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1}, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i2 = onWarmupCompleted + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            Object[] objArr2 = {this.this$0};
            int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            ((getScopeType) DevToolActionListViewModel.IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 899842925, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, objArr2, -899842924, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback())).IAuthTabCallback(this.$quickActions);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 97;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) {
            int length;
            char[] cArr;
            int i;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr2 = onExtraCallback;
            if (cArr2 != null) {
                int i7 = $11 + 67;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                    i = 1;
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                    i = 0;
                }
                while (i < length) {
                    cArr[i] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr2[i]);
                    i++;
                }
                cArr2 = cArr;
            }
            char[] cArr3 = new char[i4];
            System.arraycopy(cArr2, i3, cArr3, 0, i4);
            if (bArr != null) {
                char[] cArr4 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i8 = $11 + 93;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                        cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                    } else {
                        cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = getExternalTransactionToken.q(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Hilt_SchemeHistoryActivity$5.w(trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0);
                }
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                int i10 = i4 - i6;
                System.arraycopy(cArr5, 0, cArr3, i10, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i10);
            }
            if (z) {
                char[] cArr6 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i11 = $10 + 81;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr3 = cArr6;
            }
            if (i5 > 0) {
                int i13 = $11 + 31;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i15 = $10 + 77;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$quickActions, null);
            this.label = 1;
            if (maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, anonymousClass2, this) == objOnWarmupCompleted) {
                int i3 = onExtraCallback + 13;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 33 / 0;
                }
                return objOnWarmupCompleted;
            }
        } else {
            if (i2 != 1) {
                Object[] objArr = new Object[1];
                a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, 47 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (ImageFormat.getBitsPerPixel(0) + 49176), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onWarmupCompleted + 53;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }
}
