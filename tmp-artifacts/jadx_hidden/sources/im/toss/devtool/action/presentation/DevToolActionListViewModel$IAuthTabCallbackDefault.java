package im.toss.devtool.action.presentation;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AppNode61;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.GeckoHubImp;
import o.HttpDataSourceInvalidContentTypeException;
import o.HttpDataSourceInvalidResponseCodeException;
import o.PKCS58;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.access15400;
import o.findResAndMsg;
import o.getExtensionManager;
import o.getScopeType;
import o.internalStart;
import o.makePFX_WINS;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.s3;

/* loaded from: classes.dex */
final class DevToolActionListViewModel$IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 7798559133331975163L;
    private static int onExtraCallback = 1;
    private static char onExtraCallbackWithResult = 52802;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = -1776194565;
    final /* synthetic */ getExtensionManager $action;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ DevToolActionListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevToolActionListViewModel$IAuthTabCallbackDefault(DevToolActionListViewModel devToolActionListViewModel, getExtensionManager getextensionmanager, access13800<? super DevToolActionListViewModel$IAuthTabCallbackDefault> access13800Var) {
        super(2, access13800Var);
        this.this$0 = devToolActionListViewModel;
        this.$action = getextensionmanager;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        DevToolActionListViewModel$IAuthTabCallbackDefault devToolActionListViewModel$IAuthTabCallbackDefault = new DevToolActionListViewModel$IAuthTabCallbackDefault(this.this$0, this.$action, access13800Var);
        devToolActionListViewModel$IAuthTabCallbackDefault.L$0 = obj;
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return devToolActionListViewModel$IAuthTabCallbackDefault;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        return objOnExtraCallback;
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        DevToolActionListViewModel$IAuthTabCallbackDefault devToolActionListViewModel$IAuthTabCallbackDefaultCreate = create(findresandmsg, access13800Var);
        if (i3 == 0) {
            return devToolActionListViewModel$IAuthTabCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
        }
        devToolActionListViewModel$IAuthTabCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i3 = $10 + 35;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $11 + 49;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int iN = HttpDataSourceInvalidContentTypeException.n(trackSelectionParametersBuilderExternalSyntheticLambda0);
            int iM = HttpDataSourceInvalidResponseCodeException.m(trackSelectionParametersBuilderExternalSyntheticLambda0);
            makePFX_WINS.onNavigationEvent.C0003onNavigationEvent.k(trackSelectionParametersBuilderExternalSyntheticLambda0, cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718, cArr5[iN]);
            cArr5[iM] = AppNode61.onNavigationEvent.l(cArr4[iM] * 32718, cArr5[iN]);
            cArr4[iM] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iM] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
        }
        objArr[0] = new String(cArr6);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        internalStart.onExtraCallback onextracallback;
        int i = 2 % 2;
        findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        try {
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                Object objIAuthTabCallback = DevToolActionListViewModel.asBinder(this.this$0).IAuthTabCallback();
                Object obj3 = null;
                if (objIAuthTabCallback instanceof internalStart.onExtraCallback) {
                    int i3 = onExtraCallback + 59;
                    onNavigationEvent = i3 % 128;
                    onextracallback = (internalStart.onExtraCallback) objIAuthTabCallback;
                    if (i3 % 2 != 0) {
                        int i4 = 16 / 0;
                    }
                } else {
                    onextracallback = null;
                }
                if (onextracallback != null) {
                    int i5 = onNavigationEvent + 73;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        onextracallback.IAuthTabCallback();
                        throw null;
                    }
                    List<getExtensionManager> listIAuthTabCallback = onextracallback.IAuthTabCallback();
                    if (listIAuthTabCallback != null) {
                        boolean zContains = listIAuthTabCallback.contains(this.$action);
                        DevToolActionListViewModel devToolActionListViewModel = this.this$0;
                        getExtensionManager getextensionmanager = this.$action;
                        Result.Companion companion = Result.Companion;
                        GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(zContains, devToolActionListViewModel, getextensionmanager, null);
                        this.L$0 = access15400.onNavigationEvent(findresandmsg);
                        this.L$1 = access15400.onNavigationEvent(findresandmsg);
                        this.Z$0 = zContains;
                        this.I$0 = 0;
                        this.label = 1;
                        if (maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallbackwithresult, this) == objOnWarmupCompleted) {
                            int i6 = onNavigationEvent + 93;
                            onExtraCallback = i6 % 128;
                            int i7 = i6 % 2;
                            return objOnWarmupCompleted;
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i8 = onNavigationEvent + 35;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    return unit;
                }
                obj3.hashCode();
                throw null;
            }
            if (i2 != 1) {
                Object[] objArr = new Object[1];
                a((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), TextUtils.indexOf((CharSequence) "", '0') - 1898000729, new char[]{9090, 47871, 28821, 53451, 28683, 41668, 53247, 47883, 64423, 50774, 49054, 55597, 59800, 48790, 12068, 61265, 23691, 58071, 45914, 47593, 52655, 33952, 2781, 62045, 45632, 30852, 48623, 7203, 64062, 63683, 57061, 9526, 30831, 31117, 59441, 63365, 36045, 31270, 8481, 38457, 49329, 30773, 16703, 1780, 6029, 51287, 64253}, new char[]{0, 0, 0, 0}, new char[]{42740, 57038, 46990, 26742}, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            obj2 = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th));
            int i9 = onNavigationEvent + 71;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        DevToolActionListViewModel devToolActionListViewModel2 = this.this$0;
        if (Result.onNavigationEvent(obj2)) {
            int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            DevToolActionListViewModel.IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1139016909, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, new Object[]{devToolActionListViewModel2}, 1139016916, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
        }
        return Unit.INSTANCE;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getExtensionManager $action;
        final /* synthetic */ boolean $isQuickAction;
        int label;
        final /* synthetic */ DevToolActionListViewModel this$0;
        private static char[] onExtraCallbackWithResult = {64961, 64989, 64978, 64988, 64963, 64960, 64987, 64986, 64967, 64966, 64990, 64991, 64985, 64964, 64976, 64982, 64965, 64984, 64979, 64962, 64981, 64916, 64915, 64977, 64980};
        private static char onWarmupCompleted = 51244;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(boolean z, DevToolActionListViewModel devToolActionListViewModel, getExtensionManager getextensionmanager, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$isQuickAction = z;
            this.this$0 = devToolActionListViewModel;
            this.$action = getextensionmanager;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            }
            onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$isQuickAction, this.this$0, this.$action, access13800Var);
            int i2 = onNavigationEvent + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 61;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a(new char[]{'\f', 4, 13909, 13909, 23, 7, 2, 23, 20, 1, 20, '\n', 5, 14, 16, 20, 23, 24, 20, 0, 4, 1, 17, 20, 22, 6, 6, 21, 2, 18, 16, 20, 23, '\f', '\b', '\t', 7, 21, '\r', 4, 1, 4, 5, '\t', 6, 2, 13918}, (byte) (143 - AndroidCharacter.getMirror('0')), TextUtils.getOffsetAfter("", 0) + 47, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            if (this.$isQuickAction) {
                Object[] objArr2 = {this.this$0};
                int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
                ((getScopeType) DevToolActionListViewModel.IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 899842925, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, objArr2, -899842924, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback())).onNavigationEvent$252026d8(this.$action);
            } else {
                Object[] objArr3 = {this.this$0};
                int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
                ((getScopeType) DevToolActionListViewModel.IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 899842925, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback2, objArr3, -899842924, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback())).IAuthTabCallback$252026d8(this.$action);
            }
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallback + 7;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) {
            char[] cArr2;
            int i2;
            int i3;
            int i4;
            char[] cArr3;
            int i5;
            int i6 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr4 = onExtraCallbackWithResult;
            int i7 = 0;
            if (cArr4 != null) {
                int length = cArr4.length;
                char[] cArr5 = new char[length];
                for (int i8 = 0; i8 < length; i8++) {
                    cArr5[i8] = PKCS58.onNavigationEvent.z(cArr4[i8]);
                }
                cArr2 = cArr5;
            } else {
                cArr2 = cArr4;
            }
            char cZ = PKCS58.onNavigationEvent.z(onWarmupCompleted);
            char[] cArr6 = new char[i];
            if (i % 2 != 0) {
                int i9 = i - 1;
                cArr6[i9] = (char) (cArr[i9] - b);
                i2 = i9;
            } else {
                i2 = i;
            }
            int i10 = 1;
            if (i2 > 1) {
                int i11 = $10 + 103;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i10];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i10] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        i3 = i10;
                        i4 = i2;
                        cArr3 = cArr6;
                        i5 = i7;
                    } else {
                        i3 = i10;
                        i4 = i2;
                        cArr3 = cArr6;
                        i5 = i7;
                        if (DevToolActionListViewModel$asInterface.A(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0) == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int I = s3.onExtraCallbackWithResult.I(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0);
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[I];
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cZ) - 1) % cZ;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cZ) - 1) % cZ;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                            int i16 = $10 + 109;
                            $11 = i16 % 128;
                            if (i16 % 2 == 0) {
                                int i17 = 4 / 3;
                            }
                        } else {
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i19 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i18];
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i19];
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    cArr6 = cArr3;
                    i10 = i3;
                    i2 = i4;
                    i7 = i5;
                }
            }
            char[] cArr7 = cArr6;
            int i20 = i7;
            int i21 = i20;
            while (i21 < i) {
                int i22 = $10 + 61;
                $11 = i22 % 128;
                if (i22 % 2 == 0) {
                    cArr7[i21] = (char) (cArr7[i21] ^ 696);
                    i21 += 78;
                } else {
                    cArr7[i21] = (char) (cArr7[i21] ^ 13722);
                    i21++;
                }
            }
            objArr[i20] = new String(cArr7);
        }
    }
}
