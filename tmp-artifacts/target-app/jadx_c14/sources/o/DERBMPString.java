package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.ApiServerError;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DERBMPString extends isTestMode {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int onExtraCallback = 8;
    private final MutableLiveData<String> IAuthTabCallback;
    private final MutableLiveData<List<DERApplicationSpecific>> IAuthTabCallbackDefault;
    private final LiveData<List<DERApplicationSpecific>> IAuthTabCallbackStub;
    private final Rmipmap<Boolean> IAuthTabCallback_Parcel;
    private final Rmipmap<Throwable> access000;
    private final LiveData<String> access100;
    private final Rmipmap<ApiServerError> asBinder;
    private final MutableLiveData<String> asInterface;
    private final DERBitString getInterfaceDescriptor;
    private final MutableLiveData<Date> onExtraCallbackWithResult;
    private final MutableLiveData<List<DERApplicationSpecific>> onNavigationEvent;
    private final LiveData<isConstructed> onTransact;
    private final MutableLiveData<isConstructed> onWarmupCompleted;

    public DERBMPString(@NotNull DERBitString dERBitString) {
        Intrinsics.checkNotNullParameter(dERBitString, "");
        this.getInterfaceDescriptor = dERBitString;
        this.onExtraCallbackWithResult = new MutableLiveData<>();
        this.IAuthTabCallback = new MutableLiveData<>();
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.asInterface = mutableLiveData;
        this.access100 = onNavigationEvent(mutableLiveData);
        MutableLiveData<isConstructed> mutableLiveData2 = new MutableLiveData<>(isConstructed.ALL);
        this.onWarmupCompleted = mutableLiveData2;
        this.onTransact = onNavigationEvent(mutableLiveData2);
        this.IAuthTabCallbackDefault = new MutableLiveData<>();
        MutableLiveData<List<DERApplicationSpecific>> mutableLiveData3 = new MutableLiveData<>();
        this.onNavigationEvent = mutableLiveData3;
        this.IAuthTabCallbackStub = onNavigationEvent(mutableLiveData3);
        this.IAuthTabCallback_Parcel = new Rmipmap<>();
        this.asBinder = new Rmipmap<>();
        this.access000 = new Rmipmap<>();
    }

    public final LiveData<String> IAuthTabCallbackStub() {
        return this.access100;
    }

    public final LiveData<isConstructed> onNavigationEvent() {
        return this.onTransact;
    }

    public final LiveData<List<DERApplicationSpecific>> onExtraCallback() {
        return this.IAuthTabCallbackStub;
    }

    public final Rmipmap<Boolean> asBinder() {
        return this.IAuthTabCallback_Parcel;
    }

    public final Rmipmap<ApiServerError> onExtraCallbackWithResult() {
        return this.asBinder;
    }

    public final Rmipmap<Throwable> IAuthTabCallback() {
        return this.access000;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        Object L$0;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return DERBMPString.this.new onWarmupCompleted(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            DERBMPString dERBMPString;
            Unit unit;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    DERBMPString.this.asBinder().setValue(access14000.onNavigationEvent(true));
                    DERBMPString dERBMPString2 = DERBMPString.this;
                    Result.Companion companion = Result.Companion;
                    DERBitString dERBitString = dERBMPString2.getInterfaceDescriptor;
                    this.L$0 = dERBMPString2;
                    this.I$0 = 0;
                    this.label = 1;
                    Object objOnWarmupCompleted2 = dERBitString.onWarmupCompleted(this);
                    if (objOnWarmupCompleted2 == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    dERBMPString = dERBMPString2;
                    obj = objOnWarmupCompleted2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dERBMPString = (DERBMPString) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                NativeBannerAdViewType nativeBannerAdViewType = (NativeBannerAdViewType) baseApiResponse.onTransact();
                if (nativeBannerAdViewType != null) {
                    dERBMPString.asInterface.setValue(nativeBannerAdViewType.onExtraCallbackWithResult());
                    unit = Unit.INSTANCE;
                } else {
                    ApiServerError apiServerErrorAsInterface = baseApiResponse.asInterface();
                    if (apiServerErrorAsInterface != null) {
                        dERBMPString.onExtraCallbackWithResult().setValue(apiServerErrorAsInterface);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                }
                obj2 = Result.constructor-impl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj2);
            if (th2 != null) {
                DERBMPString.this.IAuthTabCallback().setValue(th2);
            }
            return Unit.INSTANCE;
        }
    }

    public final void onTransact() {
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(null), 3, (Object) null);
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        Object L$0;
        Object L$1;
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return DERBMPString.this.new onExtraCallback(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 342
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.DERBMPString.onExtraCallback.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void asInterface() {
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getInterfaceDescriptor() {
        Date dateAccess100 = access100();
        CharSequence charSequence = (CharSequence) this.asInterface.getValue();
        if (charSequence != null && charSequence.length() != 0 && dateAccess100.getTime() < IAuthTabCallbackStubProxy().getTime()) {
            dateAccess100 = null;
        }
        if (dateAccess100 == null) {
            dateAccess100 = IAuthTabCallbackStubProxy();
        }
        return commonTestFlag.onExtraCallback.IAuthTabCallback("yyyyMMdd", dateAccess100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String IAuthTabCallbackDefault() {
        commonTestFlag commontestflag = commonTestFlag.onExtraCallback;
        Date date = (Date) this.onExtraCallbackWithResult.getValue();
        if (date == null) {
            date = new Date();
        }
        return commontestflag.IAuthTabCallback("yyyyMMdd", date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Date access100() {
        Date date = (Date) this.onExtraCallbackWithResult.getValue();
        if (date == null) {
            date = new Date();
        }
        return onWarmupCompleted(date);
    }

    private final Date onWarmupCompleted(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(2, -2);
        calendar.add(6, -1);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "");
        return time;
    }

    private final Date IAuthTabCallbackStubProxy() {
        try {
            IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = CommonModule_closeView.onNavigationEvent;
            String str = (String) this.asInterface.getValue();
            if (str == null) {
                str = "";
            }
            Date date = idGeneratorExternalSyntheticLambda1.parse(str);
            return date == null ? new Date() : date;
        } catch (Exception unused) {
            return new Date();
        }
    }

    public final boolean onWarmupCompleted() {
        Date date = (Date) this.onExtraCallbackWithResult.getValue();
        if (date == null) {
            date = new Date();
        }
        return !date.before(IAuthTabCallbackStubProxy());
    }

    private final List<DERApplicationSpecific> access000() {
        List listEmptyList = (List) this.IAuthTabCallbackDefault.getValue();
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listEmptyList) {
            DERApplicationSpecific dERApplicationSpecific = (DERApplicationSpecific) obj;
            isConstructed isconstructed = (isConstructed) this.onWarmupCompleted.getValue();
            if (isconstructed != null) {
                if (isconstructed == isConstructed.ALL) {
                    isconstructed = null;
                }
                if (isconstructed == null || Intrinsics.areEqual(dERApplicationSpecific.onWarmupCompleted().onWarmupCompleted(), isconstructed.name())) {
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final void IAuthTabCallback(@NotNull isConstructed isconstructed) {
        Intrinsics.checkNotNullParameter(isconstructed, "");
        this.onWarmupCompleted.setValue(isconstructed);
        IAuthTabCallback_Parcel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IAuthTabCallback_Parcel() {
        this.onNavigationEvent.setValue(access000());
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
