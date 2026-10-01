package im.toss.features.kyc.intro.viewmodel;

import androidx.lifecycle.ViewModel;
import im.toss.features.kyc.intro.viewmodel.RetryFullPageViewModel$;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import im.toss.utils.RxUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CloseableUtils;
import o.IAnimation;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14300;
import o.deserializeUriNullableCollection;
import o.findResAndMsg;
import o.getBorderRadius;
import o.getCornerRadius;
import o.getShine;
import o.getTileModeX;
import o.maybeUpdateAnimatable;
import o.nLockFileSegment;
import o.setExtraJsT2MapStr;
import o.setRandomHost;
import o.setRubIn;
import o.setShine;
import o.setValidDomains;
import o.writeRaw;
import o.ycxycx;
import o.zb;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RetryFullPageViewModel extends ViewModel {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access100 = 1;
    private final getBorderRadius<Throwable> IAuthTabCallback;
    private deserializeUriNullableCollection IAuthTabCallbackDefault;
    private final getTileModeX<Throwable> IAuthTabCallbackStub;
    private final getTileModeX<setExtraJsT2MapStr> asBinder;
    private final IAnimation<Boolean> asInterface;
    private final getBorderRadius<setExtraJsT2MapStr> onExtraCallback;
    private final getCornerRadius<setValidDomains> onExtraCallbackWithResult;
    private final nLockFileSegment<Boolean> onNavigationEvent;
    private final boolean onTransact;
    private final setRubIn<setValidDomains> onWarmupCompleted;

    public static /* synthetic */ Unit onExtraCallback(RetryFullPageViewModel retryFullPageViewModel, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(retryFullPageViewModel, th);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(retryFullPageViewModel, th);
        int i3 = access100 + 47;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 33 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(RetryFullPageViewModel retryFullPageViewModel, setExtraJsT2MapStr setextrajst2mapstr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 49;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{retryFullPageViewModel, setextrajst2mapstr}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1161611715, iOnExtraCallback, iOnExtraCallback2, 1161611717);
        int i4 = IAuthTabCallbackStubProxy + 125;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 49;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = access100 + 107;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = i7 | i6;
        int i9 = ~(i8 | i4);
        int i10 = (~i4) | (~((~i6) | i3));
        int i11 = (~(i4 | i6)) | (~(i7 | i4)) | (~i8);
        int i12 = i3 + i6 + i5 + ((-953487067) * i) + ((-1992133889) * i2);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i3) + 1765277696 + (1051104396 * i6) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i5) + ((-1703411712) * i) + (1961361408 * i2) + (907935744 * i13);
        int i15 = ((i3 * 272661978) - 2115615402) + (i6 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i5 * 272662391) + (i * 2077717299) + (i2 * 1957688713) + (i13 * 166854656);
        int i16 = i14 + (i15 * i15 * (-213778432));
        return i16 != 1 ? i16 != 2 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public RetryFullPageViewModel(boolean z) {
        this.onTransact = z;
        getBorderRadius<setExtraJsT2MapStr> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.onExtraCallback = getborderradiusOnWarmupCompleted;
        this.asBinder = getborderradiusOnWarmupCompleted;
        getBorderRadius<Throwable> getborderradiusOnWarmupCompleted2 = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.IAuthTabCallback = getborderradiusOnWarmupCompleted2;
        this.IAuthTabCallbackStub = getborderradiusOnWarmupCompleted2;
        getCornerRadius<setValidDomains> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(new setValidDomains(false, false, false));
        this.onExtraCallbackWithResult = getcornerradiusOnNavigationEvent;
        this.onWarmupCompleted = getcornerradiusOnNavigationEvent;
        nLockFileSegment<Boolean> nlockfilesegmentOnExtraCallbackWithResult = zb.onExtraCallbackWithResult(-2, (CloseableUtils) null, (Function1) null, 6, (Object) null);
        this.onNavigationEvent = nlockfilesegmentOnExtraCallbackWithResult;
        this.asInterface = ycxycx.IAuthTabCallback(nlockfilesegmentOnExtraCallbackWithResult);
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new AnonymousClass1(null), 3, (Object) null);
    }

    public static final /* synthetic */ getBorderRadius IAuthTabCallback(RetryFullPageViewModel retryFullPageViewModel) {
        int i = 2 % 2;
        int i2 = access100 + 91;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        getBorderRadius<setExtraJsT2MapStr> getborderradius = retryFullPageViewModel.onExtraCallback;
        int i5 = i3 + 119;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return getborderradius;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        RetryFullPageViewModel retryFullPageViewModel = (RetryFullPageViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 59;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        getBorderRadius<Throwable> getborderradius = retryFullPageViewModel.IAuthTabCallback;
        int i5 = i3 + 121;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return getborderradius;
    }

    public static final /* synthetic */ nLockFileSegment onExtraCallback(RetryFullPageViewModel retryFullPageViewModel) {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 27;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        nLockFileSegment<Boolean> nlockfilesegment = retryFullPageViewModel.onNavigationEvent;
        int i5 = i2 + 61;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return nlockfilesegment;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean onNavigationEvent(RetryFullPageViewModel retryFullPageViewModel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 99;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = retryFullPageViewModel.onTransact;
        int i5 = i2 + 95;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public static final /* synthetic */ getCornerRadius onWarmupCompleted(RetryFullPageViewModel retryFullPageViewModel) {
        int i = 2 % 2;
        int i2 = access100 + 35;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        getCornerRadius<setValidDomains> getcornerradius = retryFullPageViewModel.onExtraCallbackWithResult;
        int i5 = i3 + 5;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
        return getcornerradius;
    }

    public final getTileModeX<setExtraJsT2MapStr> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        getTileModeX<setExtraJsT2MapStr> gettilemodex = this.asBinder;
        int i5 = i3 + 115;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return gettilemodex;
    }

    public final getTileModeX<Throwable> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 29;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        getTileModeX<Throwable> gettilemodex = this.IAuthTabCallbackStub;
        int i5 = i2 + 23;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return gettilemodex;
    }

    public final setRubIn<setValidDomains> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 111;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        setRubIn<setValidDomains> setrubin = this.onWarmupCompleted;
        int i5 = i2 + 59;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return setrubin;
    }

    public final IAnimation<Boolean> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: im.toss.features.kyc.intro.viewmodel.RetryFullPageViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        Object L$0;
        int label;

        AnonymousClass1(access13800<? super AnonymousClass1> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass1 anonymousClass1 = RetryFullPageViewModel.this.new AnonymousClass1(access13800Var);
            int i2 = onExtraCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return anonymousClass1;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 59;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 98 / 0;
            }
            int i5 = onExtraCallback + 85;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
        
            if (r10.onExtraCallback(r0, r9) != r1) goto L25;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            getCornerRadius getcornerradius;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                nLockFileSegment nlockfilesegmentOnExtraCallback = RetryFullPageViewModel.onExtraCallback(RetryFullPageViewModel.this);
                Boolean boolOnNavigationEvent = access14000.onNavigationEvent(true);
                this.label = 1;
                if (nlockfilesegmentOnExtraCallback.onExtraCallback(boolOnNavigationEvent, this) != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 45;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0 ? i2 == 1 : i2 == 0) {
                ResultKt.onNavigationEvent(obj);
            } else {
                int i5 = i3 + 85;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                getcornerradius = (getCornerRadius) this.L$0;
                ResultKt.onNavigationEvent(obj);
                getcornerradius.onWarmupCompleted(obj);
                nLockFileSegment nlockfilesegmentOnExtraCallback2 = RetryFullPageViewModel.onExtraCallback(RetryFullPageViewModel.this);
                Boolean boolOnNavigationEvent2 = access14000.onNavigationEvent(false);
                this.L$0 = null;
                this.label = 3;
            }
            getCornerRadius getcornerradiusOnWarmupCompleted = RetryFullPageViewModel.onWarmupCompleted(RetryFullPageViewModel.this);
            setValidDomains.onWarmupCompleted onwarmupcompleted = setValidDomains.Companion;
            boolean zOnNavigationEvent = RetryFullPageViewModel.onNavigationEvent(RetryFullPageViewModel.this);
            this.L$0 = getcornerradiusOnWarmupCompleted;
            this.label = 2;
            Object objOnWarmupCompleted2 = onwarmupcompleted.onWarmupCompleted(zOnNavigationEvent, this);
            if (objOnWarmupCompleted2 != objOnWarmupCompleted) {
                getcornerradius = getcornerradiusOnWarmupCompleted;
                obj = objOnWarmupCompleted2;
                getcornerradius.onWarmupCompleted(obj);
                nLockFileSegment nlockfilesegmentOnExtraCallback22 = RetryFullPageViewModel.onExtraCallback(RetryFullPageViewModel.this);
                Boolean boolOnNavigationEvent22 = access14000.onNavigationEvent(false);
                this.L$0 = null;
                this.label = 3;
            }
            return objOnWarmupCompleted;
        }
    }

    public final void onExtraCallback(@NotNull writeRaw<setExtraJsT2MapStr> writeraw) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(writeraw, "");
        deserializeUriNullableCollection deserializeurinullablecollection = this.IAuthTabCallbackDefault;
        Object obj = null;
        if (deserializeurinullablecollection != null) {
            int i4 = access100 + 117;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                deserializeurinullablecollection.dispose();
                obj.hashCode();
                throw null;
            }
            deserializeurinullablecollection.dispose();
            int i5 = IAuthTabCallbackStubProxy + 37;
            access100 = i5 % 128;
            int i6 = i5 % 2;
        }
        writeRaw writerawIAuthTabCallback = writeraw.IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        this.IAuthTabCallbackDefault = writerawIAuthTabCallback.onNavigationEvent(new RetryFullPageViewModel$.ExternalSyntheticLambda1(new RetryFullPageViewModel$.ExternalSyntheticLambda0(this)), new RetryFullPageViewModel$.ExternalSyntheticLambda3(new RetryFullPageViewModel$.ExternalSyntheticLambda2(this)));
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 99;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        RetryFullPageViewModel retryFullPageViewModel = (RetryFullPageViewModel) objArr[0];
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(retryFullPageViewModel), (CoroutineContext) null, (setRandomHost) null, new RetryFullPageViewModel$setKycStream$1$1(retryFullPageViewModel, (setExtraJsT2MapStr) objArr[1], null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 7;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(RetryFullPageViewModel retryFullPageViewModel, Throwable th) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(retryFullPageViewModel), (CoroutineContext) null, (setRandomHost) null, new RetryFullPageViewModel$setKycStream$2$1(retryFullPageViewModel, th, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = access100 + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = access100 + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        deserializeUriNullableCollection deserializeurinullablecollection = ((RetryFullPageViewModel) objArr[0]).IAuthTabCallbackDefault;
        Object obj = null;
        if (deserializeurinullablecollection != null) {
            int i2 = access100 + 19;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            deserializeurinullablecollection.dispose();
            if (i3 != 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i4 = access100 + 51;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public void onCleared() {
        int i = 2 % 2;
        int i2 = access100 + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{this}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 888920948, iOnExtraCallback, iOnExtraCallback2, -888920947);
            super.onCleared();
            return;
        }
        int iOnExtraCallback3 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback4 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{this}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 888920948, iOnExtraCallback3, iOnExtraCallback4, -888920947);
        super.onCleared();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getBorderRadius onExtraCallbackWithResult(RetryFullPageViewModel retryFullPageViewModel) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (getBorderRadius) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{retryFullPageViewModel}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 812264664, iOnExtraCallback, iOnExtraCallback2, -812264664);
    }

    private static final Unit onWarmupCompleted(RetryFullPageViewModel retryFullPageViewModel, setExtraJsT2MapStr setextrajst2mapstr) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{retryFullPageViewModel, setextrajst2mapstr}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1161611715, iOnExtraCallback, iOnExtraCallback2, 1161611717);
    }

    public final void onExtraCallback() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{this}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 888920948, iOnExtraCallback, iOnExtraCallback2, -888920947);
    }
}
