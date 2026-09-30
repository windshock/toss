package o;

import android.app.Application;
import android.content.Context;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.bytedance.sdk.openadsdk.wwx.lt;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class requestAssetInfo implements copyFile {
    public static final onWarmupCompleted Companion;
    private static int access100 = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private static int onTransact;
    private final setAssetUpdatedDate IAuthTabCallback;
    private final getCornerRadius<Boolean> IAuthTabCallbackDefault;
    private final TextRoundCornerProgressBarSavedState1 IAuthTabCallbackStub;
    private final initLayout onExtraCallback;
    private final Object onExtraCallbackWithResult;
    private final Set<Integer> onNavigationEvent;
    private final parseDate onWarmupCompleted;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        int i = asBinder + 41;
        asInterface = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = i3 | i6;
        int i8 = ~((~i6) | i3);
        int i9 = ~i3;
        int i10 = i8 | (~(i9 | i2 | i6));
        int i11 = (~(i6 | i9)) | i2;
        int i12 = i3 + i2 + i + (2127773517 * i4) + (1026174006 * i5);
        int i13 = i12 * i12;
        int i14 = (i3 * (-484454144)) + 743702528 + ((-484454144) * i2) + (i7 * (-1605095679)) + (1605095679 * i10) + ((-1605095679) * i11) + ((-2089549824) * i) + (367263744 * i4) + ((-1434976256) * i5) + (1105526784 * i13);
        int i15 = (i3 * 21308160) + 1622758390 + (i2 * 21308160) + (i7 * 947) + (i10 * (-947)) + (i11 * 947) + (i * 21309107) + (i4 * 1708896471) + (i5 * 664464834) + (i13 * 287244288);
        return i14 + ((i15 * i15) * 966983680) != 1 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    @Inject
    public requestAssetInfo(@NotNull setAssetUpdatedDate setassetupdateddate, @NotNull parseDate parsedate, @NotNull initLayout initlayout, @NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        Intrinsics.checkNotNullParameter(setassetupdateddate, "");
        Intrinsics.checkNotNullParameter(parsedate, "");
        Intrinsics.checkNotNullParameter(initlayout, "");
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        this.IAuthTabCallback = setassetupdateddate;
        this.onWarmupCompleted = parsedate;
        this.onExtraCallback = initlayout;
        this.IAuthTabCallbackStub = textRoundCornerProgressBarSavedState1;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        Intrinsics.checkNotNullExpressionValue(keySetViewNewKeySet, "");
        this.onNavigationEvent = keySetViewNewKeySet;
        this.onExtraCallbackWithResult = new Object();
        this.IAuthTabCallbackDefault = setShine.onNavigationEvent(Boolean.FALSE);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        requestAssetInfo requestassetinfo = (requestAssetInfo) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 113;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        getIconPaddingTop geticonpaddingtopAsInterface = requestassetinfo.asInterface();
        int i4 = onTransact + 45;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return geticonpaddingtopAsInterface;
        }
        throw null;
    }

    public static final /* synthetic */ getCornerRadius IAuthTabCallback(requestAssetInfo requestassetinfo) {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        getCornerRadius<Boolean> getcornerradius = requestassetinfo.IAuthTabCallbackDefault;
        if (i3 != 0) {
            return getcornerradius;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean IAuthTabCallbackStub(requestAssetInfo requestassetinfo) {
        int i = 2 % 2;
        int i2 = access100 + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTransact = requestassetinfo.onTransact();
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        return zOnTransact;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(requestAssetInfo requestassetinfo, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = requestassetinfo.IAuthTabCallback((access13800<? super Boolean>) access13800Var);
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ setAssetUpdatedDate onExtraCallbackWithResult(requestAssetInfo requestassetinfo) {
        int i = 2 % 2;
        int i2 = access100 + 105;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        setAssetUpdatedDate setassetupdateddate = requestassetinfo.IAuthTabCallback;
        int i5 = i3 + 49;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return setassetupdateddate;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        requestAssetInfo requestassetinfo = (requestAssetInfo) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 75;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        parseDate parsedate = requestassetinfo.onWarmupCompleted;
        if (i4 != 0) {
            int i5 = 85 / 0;
        }
        int i6 = i3 + 29;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return parsedate;
    }

    public static final /* synthetic */ Set onNavigationEvent(requestAssetInfo requestassetinfo) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 31;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Set<Integer> set = requestassetinfo.onNavigationEvent;
        int i5 = i2 + 81;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return set;
        }
        throw null;
    }

    public static final /* synthetic */ Object onWarmupCompleted(requestAssetInfo requestassetinfo) {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = requestassetinfo.onExtraCallbackWithResult;
        if (i3 != 0) {
            return obj;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.copyFile
    public void onExtraCallbackWithResult(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        synchronized (this.onExtraCallbackWithResult) {
            if (!onTransact()) {
                throw new IllegalStateException("AppsFlyer init attempted without marketing consent");
            }
            AppsFlyerConversionListener appsFlyerConversionListenerOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(application);
            AppsFlyerLib.getInstance().subscribeForDeepLink(this.IAuthTabCallback.IAuthTabCallback(application));
            AppsFlyerLib.getInstance().setDebugLog(false);
            AppsFlyerLib.getInstance().init(zzaj.onNavigationEvent().onExtraCallbackWithResult(), appsFlyerConversionListenerOnExtraCallbackWithResult, application);
            this.IAuthTabCallbackDefault.onWarmupCompleted(Boolean.TRUE);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // o.copyFile
    public void onNavigationEvent(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        synchronized (this.onExtraCallbackWithResult) {
            if (!onTransact()) {
                throw new IllegalStateException("AppsFlyer start attempted without marketing consent");
            }
            AppsFlyerLib.getInstance().stop(false, application);
            onNavigationEvent((Context) application);
            AppsFlyerLib.getInstance().start(application, (String) null, new IAuthTabCallbackStub());
            this.onWarmupCompleted.onExtraCallback(application);
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final class IAuthTabCallbackStub implements AppsFlyerRequestListener {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        IAuthTabCallbackStub() {
        }

        public void onSuccess() {
            requestAssetInfo.onNavigationEvent(requestAssetInfo.this).clear();
            Object objOnWarmupCompleted = requestAssetInfo.onWarmupCompleted(requestAssetInfo.this);
            requestAssetInfo requestassetinfo = requestAssetInfo.this;
            synchronized (objOnWarmupCompleted) {
                if (requestAssetInfo.IAuthTabCallbackStub(requestassetinfo)) {
                    int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
                    ((parseDate) requestAssetInfo.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 1610004736, -1610004735, new Object[]{requestassetinfo}, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult)).asBinder();
                }
                Unit unit = Unit.INSTANCE;
            }
        }

        public void onError(int i, String str) throws Throwable {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                requestAssetInfo.onNavigationEvent(requestAssetInfo.this).add(Integer.valueOf(i));
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            if (requestAssetInfo.onNavigationEvent(requestAssetInfo.this).add(Integer.valueOf(i))) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "AppsFlyerManager", "AppsFlyer SDK start failed", (Throwable) null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("errorCode", Integer.valueOf(i)), getWrite.IAuthTabCallback("errorDesc", str)}), 4, (Object) null);
            }
            int i4 = onExtraCallbackWithResult + 7;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // o.copyFile
    public void onExtraCallback(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        synchronized (this.onExtraCallbackWithResult) {
            this.onWarmupCompleted.asInterface();
            Object[] objArr = {this.IAuthTabCallback};
            int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            setAssetUpdatedDate.IAuthTabCallback(2136714032, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -2136714030, objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent);
            AppsFlyerLib.getInstance().stop(true, application);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // o.copyFile
    public void onWarmupCompleted(@NotNull Application application) {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(application, "");
            onNavigationEvent(application);
            int i3 = 79 / 0;
        } else {
            Intrinsics.checkNotNullParameter(application, "");
            onNavigationEvent(application);
        }
        int i4 = access100 + 99;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.copyFile
    public void onExtraCallback(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this.onExtraCallbackWithResult) {
            if (((Boolean) this.IAuthTabCallbackDefault.IAuthTabCallback()).booleanValue() && onTransact()) {
                AppsFlyerLib.getInstance().updateServerUninstallToken(context, str);
            } else {
                this.IAuthTabCallbackStub.IAuthTabCallback("appsflyer_pending_uninstall_token", str, true);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void onNavigationEvent(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = this.IAuthTabCallbackStub.IAuthTabCallback("appsflyer_pending_uninstall_token");
        if (strIAuthTabCallback != null) {
            AppsFlyerLib.getInstance().updateServerUninstallToken(context, strIAuthTabCallback);
            this.IAuthTabCallbackStub.onTransact("appsflyer_pending_uninstall_token");
            return;
        }
        int i4 = access100 + 87;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
    }

    @Override // o.copyFile
    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            ((Boolean) this.IAuthTabCallbackDefault.IAuthTabCallback()).booleanValue();
            throw null;
        }
        if (!((Boolean) this.IAuthTabCallbackDefault.IAuthTabCallback()).booleanValue() || !onTransact()) {
            return "";
        }
        String strOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted();
        int i3 = onTransact + 65;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 13 / 0;
        }
        return strOnWarmupCompleted;
    }

    @Override // o.copyFile
    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (((Boolean) this.IAuthTabCallbackDefault.IAuthTabCallback()).booleanValue() && onTransact()) {
            return this.onWarmupCompleted.onExtraCallbackWithResult();
        }
        int i4 = onTransact + 99;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // o.copyFile
    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access100 + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (!onTransact()) {
            return null;
        }
        String strOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult();
        int i4 = onTransact + 15;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    @Override // o.copyFile
    public Object onExtraCallbackWithResult(long j, @NotNull access13800<? super String> access13800Var) {
        int i = 2 % 2;
        Object objOnWarmupCompleted = doGet.onWarmupCompleted(j, new onNavigationEvent(null), access13800Var);
        int i2 = access100 + 17;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return objOnWarmupCompleted;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super String> access13800Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onnavigationeventCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(unit);
            int i4 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 14 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = requestAssetInfo.this.new onNavigationEvent(access13800Var);
            int i2 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 42 / 0;
            }
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super String> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = 55 / 0;
            return objIAuthTabCallback;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
        
            if (r15 != r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
        
            if (r15 != r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
        
            if (r15 != r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0122, code lost:
        
            if (o.setAssetUpdatedDate.IAuthTabCallback(-1052632502, com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1052632503, new java.lang.Object[]{r15, r14}, r11, r12) == r1) goto L56;
         */
        /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                int i3 = IAuthTabCallback.onExtraCallbackWithResult[((getIconPaddingTop) requestAssetInfo.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 684536738, -684536738, new Object[]{requestAssetInfo.this}, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult())).ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        int i4 = onNavigationEvent + 121;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 == 0 ? i3 != 3 : i3 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (!((Boolean) requestAssetInfo.IAuthTabCallback(requestAssetInfo.this).IAuthTabCallback()).booleanValue()) {
                            int i5 = onExtraCallbackWithResult + 57;
                            onNavigationEvent = i5 % 128;
                            if (i5 % 2 == 0) {
                                requestAssetInfo requestassetinfo = requestAssetInfo.this;
                                this.label = 5;
                                obj = requestAssetInfo.onExtraCallbackWithResult(requestassetinfo, (access13800) this);
                            } else {
                                requestAssetInfo requestassetinfo2 = requestAssetInfo.this;
                                this.label = 2;
                                obj = requestAssetInfo.onExtraCallbackWithResult(requestassetinfo2, (access13800) this);
                            }
                        }
                    } else {
                        requestAssetInfo requestassetinfo3 = requestAssetInfo.this;
                        this.label = 1;
                        obj = requestAssetInfo.onExtraCallbackWithResult(requestassetinfo3, (access13800) this);
                    }
                    return objOnWarmupCompleted;
                }
                return null;
            }
            int i6 = onNavigationEvent + 51;
            int i7 = i6 % 128;
            onExtraCallbackWithResult = i7;
            int i8 = i6 % 2;
            if (i2 != 1) {
                int i9 = i7 + 37;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 != 0 ? i2 != 2 : i2 != 5) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    if (requestAssetInfo.IAuthTabCallbackStub(requestAssetInfo.this)) {
                        return requestAssetInfo.onExtraCallbackWithResult(requestAssetInfo.this).onExtraCallbackWithResult();
                    }
                    return null;
                }
                ResultKt.onNavigationEvent(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
            } else {
                ResultKt.onNavigationEvent(obj);
                if (!((Boolean) obj).booleanValue()) {
                    int i10 = onExtraCallbackWithResult + 65;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    return null;
                }
            }
            if (((Boolean) requestAssetInfo.IAuthTabCallback(requestAssetInfo.this).IAuthTabCallback()).booleanValue() && requestAssetInfo.IAuthTabCallbackStub(requestAssetInfo.this)) {
                setAssetUpdatedDate setassetupdateddateOnExtraCallbackWithResult = requestAssetInfo.onExtraCallbackWithResult(requestAssetInfo.this);
                this.label = 3;
                int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            }
            if (requestAssetInfo.IAuthTabCallbackStub(requestAssetInfo.this)) {
            }
            return null;
        }
    }

    @Override // o.copyFile
    public boolean asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (onTransact() && this.IAuthTabCallback.onExtraCallback()) {
            int i4 = access100 + 73;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = access100 + 3;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 3 / 0;
        }
        return false;
    }

    @Override // o.copyFile
    public void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.onWarmupCompleted();
        int i4 = access100 + 109;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.copyFile
    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onTransact();
            throw null;
        }
        if (!onTransact()) {
            return null;
        }
        Object[] objArr = {this.IAuthTabCallback};
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        String str = (String) setAssetUpdatedDate.IAuthTabCallback(333124378, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -333124374, objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent);
        int i3 = onTransact + 25;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.copyFile
    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100 + 51;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            onTransact();
            throw null;
        }
        if (!onTransact()) {
            return null;
        }
        String strOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent();
        int i3 = access100 + 1;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 63 / 0;
        }
        return strOnNavigationEvent;
    }

    private final boolean onTransact() {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            asInterface();
            getIconPaddingTop geticonpaddingtop = getIconPaddingTop.Start;
            throw null;
        }
        if (asInterface() == getIconPaddingTop.Start) {
            return true;
        }
        int i3 = access100 + 73;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    private final getIconPaddingTop asInterface() {
        int i = 2 % 2;
        int i2 = access100 + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        initLayout initlayout = this.onExtraCallback;
        if (i3 == 0) {
            return initlayout.IAuthTabCallback(onViewDraw.Marketing);
        }
        initlayout.IAuthTabCallback(onViewDraw.Marketing);
        throw null;
    }

    static final class asBinder extends SuspendLambda implements Function2<setRipple<? super getIconPaddingTop>, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private /* synthetic */ Object L$0;
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(setRipple<? super getIconPaddingTop> setripple, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(setripple, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 36 / 0;
            }
            int i5 = onNavigationEvent + 93;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = requestAssetInfo.this.new asBinder(access13800Var);
            asbinder.L$0 = obj;
            int i2 = onWarmupCompleted + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((setRipple) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 39;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            setRipple setripple = (setRipple) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                getIconPaddingTop geticonpaddingtop = (getIconPaddingTop) requestAssetInfo.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 684536738, -684536738, new Object[]{requestAssetInfo.this}, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult());
                this.L$0 = access15400.onNavigationEvent(setripple);
                this.label = 1;
                if (setripple.emit(geticonpaddingtop, this) == objOnWarmupCompleted) {
                    int i5 = onNavigationEvent + 91;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements getBacktraceNote<Boolean, getIconPaddingTop, access13800<? super Boolean>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(3, access13800Var);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (i3 == 0) {
                return onExtraCallbackWithResult(zBooleanValue, (getIconPaddingTop) obj2, (access13800) obj3);
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(zBooleanValue, (getIconPaddingTop) obj2, (access13800) obj3);
            int i4 = 22 / 0;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(boolean z, getIconPaddingTop geticonpaddingtop, access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(access13800Var);
            iAuthTabCallback.Z$0 = z;
            iAuthTabCallback.L$0 = geticonpaddingtop;
            Object objInvokeSuspend = iAuthTabCallback.invokeSuspend(Unit.INSTANCE);
            int i2 = IAuthTabCallback + 23;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        
            if (r1 != false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        
            if (r1 != false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        
            return o.access14000.onNavigationEvent(true);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean z = this.Z$0;
            getIconPaddingTop geticonpaddingtop = (getIconPaddingTop) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (geticonpaddingtop == getIconPaddingTop.Stop) {
                int i4 = onWarmupCompleted + 63;
                IAuthTabCallback = i4 % 128;
                return i4 % 2 != 0 ? access14000.onNavigationEvent(true) : access14000.onNavigationEvent(false);
            }
            if (geticonpaddingtop == getIconPaddingTop.Start) {
                int i5 = IAuthTabCallback + 105;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 40 / 0;
                }
            }
            int i7 = onWarmupCompleted + 7;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 14 / 0;
            }
            return null;
        }
    }

    private final Object IAuthTabCallback(access13800<? super Boolean> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = ycxycx.onExtraCallback(ycxycx.onExtraCallbackWithResult(ycxycx.onWarmupCompleted(this.IAuthTabCallbackDefault, ycxycx.asBinder(new onExtraCallbackWithResult(new onExtraCallback(this.onExtraCallback.onExtraCallback()), this), new asBinder(null)), new IAuthTabCallback(null))), access13800Var);
        int i2 = access100 + 65;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public static final /* synthetic */ parseDate onExtraCallback(requestAssetInfo requestassetinfo) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        return (parseDate) onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 1610004736, -1610004735, new Object[]{requestassetinfo}, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ getIconPaddingTop IAuthTabCallbackDefault(requestAssetInfo requestassetinfo) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        return (getIconPaddingTop) onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 684536738, -684536738, new Object[]{requestassetinfo}, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }
}
