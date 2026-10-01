package im.toss.devtool.action.presentation;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import im.toss.devtool.domain.usecase.RunDevToolActionUseCase;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.PKCS58;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.getExtensionManager;
import o.s3;

/* loaded from: classes.dex */
final class DevToolActionListViewModel$onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    final /* synthetic */ getExtensionManager $action;
    int label;
    final /* synthetic */ DevToolActionListViewModel this$0;
    private static char[] onExtraCallbackWithResult = {64987, 64979, 64981, 64976, 64964, 64984, 64980, 64991, 64989, 65064, 65065, 64916, 64961, 64977, 64986, 64960, 64965, 64982, 64983, 64978, 64988, 64915, 64990, 64966, 64967};
    private static char IAuthTabCallback = 51244;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevToolActionListViewModel$onExtraCallbackWithResult(DevToolActionListViewModel devToolActionListViewModel, getExtensionManager getextensionmanager, access13800<? super DevToolActionListViewModel$onExtraCallbackWithResult> access13800Var) {
        super(2, access13800Var);
        this.this$0 = devToolActionListViewModel;
        this.$action = getextensionmanager;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        DevToolActionListViewModel$onExtraCallbackWithResult devToolActionListViewModel$onExtraCallbackWithResult = new DevToolActionListViewModel$onExtraCallbackWithResult(this.this$0, this.$action, access13800Var);
        int i2 = onExtraCallback + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return devToolActionListViewModel$onExtraCallbackWithResult;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
        int i4 = onWarmupCompleted + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return objOnWarmupCompleted;
    }

    public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DevToolActionListViewModel$onExtraCallbackWithResult devToolActionListViewModel$onExtraCallbackWithResultCreate = create(findresandmsg, access13800Var);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return devToolActionListViewModel$onExtraCallbackWithResultCreate.invokeSuspend(unit);
        }
        devToolActionListViewModel$onExtraCallbackWithResultCreate.invokeSuspend(unit);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = this.label;
        if (i4 != 0) {
            int i5 = onExtraCallback + 23;
            int i6 = i5 % 128;
            onWarmupCompleted = i6;
            int i7 = i5 % 2;
            if (i4 != 1) {
                Object[] objArr = new Object[1];
                a(new char[]{4, 18, 13858, 13858, 22, 20, 21, 22, '\f', '\r', 18, 16, 24, 23, 16, '\f', 23, 11, 22, 7, 22, '\n', 16, 22, '\f', '\n', 6, 18, 0, '\n', 16, '\f', 24, 1, 19, 4, 1, 20, 0, 23, '\n', 22, 24, 20, '\r', '\t', 13867}, (byte) (TextUtils.getTrimmedLength("") + 44), 47 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i8 = i6 + 65;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            ResultKt.onNavigationEvent(obj);
            int i10 = onExtraCallback + 37;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
        } else {
            ResultKt.onNavigationEvent(obj);
            RunDevToolActionUseCase runDevToolActionUseCaseOnNavigationEvent = DevToolActionListViewModel.onNavigationEvent(this.this$0);
            getExtensionManager getextensionmanager = this.$action;
            this.label = 1;
            if (RunDevToolActionUseCase.onExtraCallback$5a2aa680(runDevToolActionUseCaseOnNavigationEvent, getextensionmanager, (Map) null, (Object) null, this, 6, (Object) null) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) {
        char[] cArr2;
        int i2;
        int i3;
        char[] cArr3;
        int i4;
        int i5;
        int length;
        char[] cArr4;
        int i6;
        int i7 = 2;
        int i8 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr5 = onExtraCallbackWithResult;
        int i9 = 0;
        int i10 = 1;
        if (cArr5 != null) {
            int i11 = $10 + 11;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
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
        char cZ = PKCS58.onNavigationEvent.z(IAuthTabCallback);
        char[] cArr6 = new char[i];
        if (i % 2 != 0) {
            int i12 = i - 1;
            cArr6[i12] = (char) (cArr[i12] - b);
            i2 = i12;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            int i13 = $10 + 41;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i10];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i15 = $11 + 119;
                    $10 = i15 % 128;
                    int i16 = i15 % i7;
                    cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i10] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    i3 = i2;
                    cArr3 = cArr6;
                    i4 = i10;
                    i5 = i9;
                } else {
                    i3 = i2;
                    cArr3 = cArr6;
                    i4 = i10;
                    i5 = i9;
                    if (DevToolActionListViewModel$asInterface.A(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0) == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int I = s3.onExtraCallbackWithResult.I(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0);
                        int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[I];
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                        int i18 = $10 + 119;
                        $11 = i18 % 128;
                        int i19 = i18 % 2;
                    } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cZ) - 1) % cZ;
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cZ) - 1) % cZ;
                        int i20 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        int i21 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i20];
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i21];
                    } else {
                        int i22 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        int i23 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i22];
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i23];
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                cArr6 = cArr3;
                i7 = 2;
                i2 = i3;
                i10 = i4;
                i9 = i5;
            }
        }
        char[] cArr7 = cArr6;
        int i24 = i9;
        for (int i25 = i24; i25 < i; i25++) {
            cArr7[i25] = (char) (cArr7[i25] ^ 13722);
        }
        objArr[i24] = new String(cArr7);
    }
}
