package im.toss.devtool.action.presentation;

import im.toss.devtool.domain.usecase.RunDevToolActionUseCase;
import im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity$5;
import im.toss.global.features.leave.test.Hilt_GlobalLeaveTestActivity$4;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.EngineConfig1;
import o.TrackGroupExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.destroy;
import o.findResAndMsg;
import o.getExtensionManager;
import o.getExternalTransactionToken;

/* loaded from: classes.dex */
final class DevToolActionListViewModel$onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = {27173, 27291, 27287, 27281, 27383, 27379, 27306, 27380, 27352, 27377, 27280, 27281, 27305, 27306, 27282, 27383, 27352, 27386, 27288, 27286, 27283, 27309, 27280, 27387, 27352, 27381, 27280, 27307, 27307, 27310, 27285, 27383, 27352, 27376, 27309, 27311, 27311, 27385, 27386, 27282, 27309, 27309, 27307, 27305, 27311, 27280, 27282};
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    final /* synthetic */ getExtensionManager $action;
    int label;
    final /* synthetic */ DevToolActionListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevToolActionListViewModel$onNavigationEvent(DevToolActionListViewModel devToolActionListViewModel, getExtensionManager getextensionmanager, access13800<? super DevToolActionListViewModel$onNavigationEvent> access13800Var) {
        super(2, access13800Var);
        this.this$0 = devToolActionListViewModel;
        this.$action = getextensionmanager;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        DevToolActionListViewModel$onNavigationEvent devToolActionListViewModel$onNavigationEvent = new DevToolActionListViewModel$onNavigationEvent(this.this$0, this.$action, access13800Var);
        int i2 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return devToolActionListViewModel$onNavigationEvent;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(findresandmsg, access13800Var);
        }
        onWarmupCompleted(findresandmsg, access13800Var);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(obj);
            RunDevToolActionUseCase runDevToolActionUseCaseOnNavigationEvent = DevToolActionListViewModel.onNavigationEvent(this.this$0);
            getExtensionManager getextensionmanager = this.$action;
            destroy destroyVar = (destroy) this.this$0.onNavigationEvent$15da5ecc();
            this.label = 1;
            if (RunDevToolActionUseCase.onExtraCallback$5a2aa680(runDevToolActionUseCaseOnNavigationEvent, getextensionmanager, (Map) null, destroyVar, this, 2, (Object) null) == objOnWarmupCompleted) {
                int i5 = onNavigationEvent + 59;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return objOnWarmupCompleted;
            }
        } else {
            if (i4 != 1) {
                Object[] objArr = new Object[1];
                a(new int[]{0, 47, 115, 0}, false, new byte[]{0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1}, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i7 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            ResultKt.onNavigationEvent(obj);
        }
        return Unit.INSTANCE;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) {
        int i;
        int length;
        char[] cArr;
        int i2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = IAuthTabCallback;
        if (cArr2 != null) {
            int i8 = $10 + 29;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                cArr[i2] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr2[i2]);
                i2++;
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr2, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i9 = $11 + 75;
                $10 = i9 % 128;
                if (i9 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = getExternalTransactionToken.q(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                } else {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Hilt_SchemeHistoryActivity$5.w(trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i10 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i10, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i10);
        }
        if (!(!z)) {
            char[] cArr6 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i11 = $11 + 39;
                $10 = i11 % 128;
                int i12 = i11 % 2;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i13 = $11 + 59;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[5]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
        }
        String str = new String(cArr3);
        int i14 = $11 + 67;
        $10 = i14 % 128;
        if (i14 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i15 = 86 / 0;
            objArr[0] = str;
        }
    }
}
