package im.toss.features.faceverify.impl.ui.register;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.telephony.cdma.CdmaCellLocation;
import android.view.View;
import android.view.ViewConfiguration;
import com.lguplus.usimlib.TsmResponse;
import im.toss.base.BaseActivity;
import im.toss.features.faceverify.impl.domain.usecase.register.RegisterFaceImageUseCase;
import im.toss.features.faceverify.impl.ui.register.FaceRegisterActivity$;
import im.toss.features.selfie.impl.ui.v2.SelfieCameraV2Activity;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.GeckoHubImp;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.LifecyclesKtawaitStarted21;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.appIsMiniService;
import o.findResAndMsg;
import o.getCausesCount;
import o.getTinyLocalStorage;
import o.hasTinyLocalStorage;
import o.isDebugStateOn;
import o.maybeUpdateAnimatable;
import o.onPageExit;
import o.saveIdWithPath;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class FaceRegisterActivity extends Hilt_FaceRegisterActivity {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access100 = 1;
    private static int onTransact = 1;
    private String IAuthTabCallbackStub = "PRE_REG";
    private final IEngagementSignalsCallback_Parcel<Intent> asBinder = onPageExit.onNavigationEvent(this, new FaceRegisterActivity$.ExternalSyntheticLambda0(this));

    @Inject
    public hasTinyLocalStorage imageValidationSdk;

    @Inject
    public appIsMiniService initializeFaceRegisterUseCase;

    @Inject
    public RegisterFaceImageUseCase registerFaceImageUseCase;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int asInterface = 8;

    static {
        int i = IAuthTabCallback_Parcel + 57;
        access100 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(FaceRegisterActivity faceRegisterActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(faceRegisterActivity, iEngagementSignalsCallbackDefault);
        int i4 = IAuthTabCallbackDefault + 49;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return -1L;
        }
        int i3 = 91 / 0;
        return -1L;
    }

    public static final /* synthetic */ String onExtraCallbackWithResult(FaceRegisterActivity faceRegisterActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 39;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        String str = faceRegisterActivity.IAuthTabCallbackStub;
        int i5 = i2 + 107;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ IEngagementSignalsCallback_Parcel onNavigationEvent(FaceRegisterActivity faceRegisterActivity) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 79;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = faceRegisterActivity.asBinder;
        int i5 = i2 + 23;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return iEngagementSignalsCallback_Parcel;
    }

    public final RegisterFaceImageUseCase setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 99;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        RegisterFaceImageUseCase registerFaceImageUseCase = this.registerFaceImageUseCase;
        if (registerFaceImageUseCase == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 97;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return registerFaceImageUseCase;
    }

    public final appIsMiniService onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        appIsMiniService appisminiservice = this.initializeFaceRegisterUseCase;
        if (appisminiservice == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 91;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return appisminiservice;
    }

    public final hasTinyLocalStorage IAuthTabCallback() {
        int i = 2 % 2;
        hasTinyLocalStorage hastinylocalstorage = this.imageValidationSdk;
        Object obj = null;
        if (hastinylocalstorage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = onTransact + 57;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 29;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return hastinylocalstorage;
        }
        obj.hashCode();
        throw null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static long onExtraCallbackWithResult = -2733472418648689018L;
        private static int onNavigationEvent = 1;
        final /* synthetic */ IEngagementSignalsCallbackDefault $result;
        final /* synthetic */ hasTinyLocalStorage $sdk;
        final /* synthetic */ isDebugStateOn.onWarmupCompleted $selfieImageData;
        int I$0;
        int I$1;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(hasTinyLocalStorage hastinylocalstorage, isDebugStateOn.onWarmupCompleted onwarmupcompleted, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$sdk = hastinylocalstorage;
            this.$selfieImageData = onwarmupcompleted;
            this.$result = iEngagementSignalsCallbackDefault;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = FaceRegisterActivity.this.new onWarmupCompleted(this.$sdk, this.$selfieImageData, this.$result, access13800Var);
            int i2 = IAuthTabCallback + 113;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onwarmupcompletedCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 65;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            int i3 = $11 + 93;
            $10 = i3 % 128;
            while (true) {
                int i4 = i3 % 2;
                if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                    objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
                    return;
                }
                int i5 = $10 + 107;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 84 - Drawable.resolveOpacity(0, 0), (-16755983) - Color.rgb(0, 0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14185), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 19, 8809 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                        i3 = $10 + 85;
                        $11 = i3 % 128;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[PHI: r0
          0x003a: PHI (r0v22 java.lang.Object) = (r0v16 java.lang.Object), (r0v25 java.lang.Object) binds: [B:8:0x0025, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b8 A[PHI: r1
          0x00b8: PHI (r1v19 o.getCausesCount) = (r1v18 o.getCausesCount), (r1v22 o.getCausesCount) binds: [B:39:0x00b6, B:36:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
          0x0027: PHI (r1v6 int) = (r1v5 int), (r1v24 int) binds: [B:8:0x0025, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            TossApiCallException.ApiError apiError;
            String stringExtra;
            Object objOnWarmupCompleted;
            int i;
            Rect rectOnNavigationEvent;
            Float f;
            getCausesCount getcausescountIAuthTabCallbackStub;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 73;
            IAuthTabCallback = i3 % 128;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            if (i3 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 80 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    FaceRegisterActivity faceRegisterActivity = FaceRegisterActivity.this;
                    hasTinyLocalStorage hastinylocalstorage = this.$sdk;
                    isDebugStateOn.onWarmupCompleted onwarmupcompleted = this.$selfieImageData;
                    Result.Companion companion3 = Result.Companion;
                    RegisterFaceImageUseCase engagementSignalsCallback = faceRegisterActivity.setEngagementSignalsCallback();
                    String strOnExtraCallbackWithResult = hastinylocalstorage.onExtraCallbackWithResult();
                    String strOnExtraCallback = hastinylocalstorage.onExtraCallback();
                    String strOnExtraCallbackWithResult2 = FaceRegisterActivity.onExtraCallbackWithResult(faceRegisterActivity);
                    getTinyLocalStorage.onExtraCallback onextracallbackIAuthTabCallback = onwarmupcompleted.IAuthTabCallback().IAuthTabCallback();
                    if (onextracallbackIAuthTabCallback != null) {
                        int i5 = onNavigationEvent + 39;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        rectOnNavigationEvent = onextracallbackIAuthTabCallback.onNavigationEvent();
                    } else {
                        rectOnNavigationEvent = null;
                    }
                    if (rectOnNavigationEvent == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    int i7 = IAuthTabCallback + 51;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    getTinyLocalStorage.onExtraCallback onextracallbackIAuthTabCallback2 = onwarmupcompleted.IAuthTabCallback().IAuthTabCallback();
                    saveIdWithPath saveidwithpathOnExtraCallback = onextracallbackIAuthTabCallback2 != null ? onextracallbackIAuthTabCallback2.onExtraCallback() : null;
                    if (saveidwithpathOnExtraCallback == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    getTinyLocalStorage.access100 access100VarOnNavigationEvent = onwarmupcompleted.IAuthTabCallback().onWarmupCompleted().onNavigationEvent();
                    if (access100VarOnNavigationEvent != null) {
                        int i9 = onNavigationEvent + 117;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 != 0) {
                            getcausescountIAuthTabCallbackStub = access100VarOnNavigationEvent.IAuthTabCallbackStub();
                            int i10 = 56 / 0;
                            if (getcausescountIAuthTabCallbackStub != null) {
                                int i11 = onNavigationEvent + 79;
                                IAuthTabCallback = i11 % 128;
                                int i12 = i11 % 2;
                                f = (Float) getcausescountIAuthTabCallbackStub.onExtraCallback();
                            } else {
                                f = null;
                            }
                        } else {
                            getcausescountIAuthTabCallbackStub = access100VarOnNavigationEvent.IAuthTabCallbackStub();
                            if (getcausescountIAuthTabCallbackStub != null) {
                            }
                        }
                        byte[] bArrOnExtraCallback = onwarmupcompleted.onExtraCallback();
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.label = 1;
                        if (engagementSignalsCallback.onExtraCallback(strOnExtraCallbackWithResult, strOnExtraCallback, strOnExtraCallbackWithResult2, rectOnNavigationEvent, saveidwithpathOnExtraCallback, f, bArrOnExtraCallback, this) == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    }
                    BaseActivity baseActivity = FaceRegisterActivity.this;
                    IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = this.$result;
                    if (Result.onNavigationEvent(obj2)) {
                        isDebugStateOn.onExtraCallback.onExtraCallback();
                        Intent intent = new Intent();
                        Intent intentOnExtraCallbackWithResult = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
                        if (intentOnExtraCallbackWithResult != null) {
                            int i13 = onNavigationEvent + 59;
                            IAuthTabCallback = i13 % 128;
                            if (i13 % 2 != 0) {
                                stringExtra = intentOnExtraCallbackWithResult.getStringExtra("transactionId");
                                int i14 = 99 / 0;
                            } else {
                                stringExtra = intentOnExtraCallbackWithResult.getStringExtra("transactionId");
                            }
                        } else {
                            stringExtra = null;
                        }
                        intent.putExtra("transactionId", stringExtra);
                        Intent intentOnExtraCallbackWithResult2 = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
                        intent.putExtra("subTransactionId", intentOnExtraCallbackWithResult2 != null ? intentOnExtraCallbackWithResult2.getStringExtra("subTransactionId") : null);
                        Unit unit = Unit.INSTANCE;
                        baseActivity.setResult(-1, intent);
                        baseActivity.finish();
                    }
                    BaseActivity baseActivity2 = FaceRegisterActivity.this;
                    apiError = Result.exceptionOrNull-impl(obj2);
                    if (apiError != null) {
                        isDebugStateOn.onExtraCallback.onExtraCallback();
                        if (apiError instanceof TossApiCallException.ApiError) {
                            Intent intent2 = new Intent();
                            intent2.putExtra(TsmResponse.errorCode, apiError.asBinder());
                            Object[] objArr = new Object[1];
                            a(new char[]{6448, 6466, 35050, 1285, 24682, 8467, 31519, 35326, 12151, 19254}, View.MeasureSpec.getMode(0), objArr);
                            intent2.putExtra(((String) objArr[0]).intern(), apiError.getMessage());
                            Unit unit2 = Unit.INSTANCE;
                            baseActivity2.setResult(0, intent2);
                        } else {
                            baseActivity2.setResult(0);
                        }
                        baseActivity2.finish();
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            obj2 = Result.constructor-impl(Unit.INSTANCE);
            BaseActivity baseActivity3 = FaceRegisterActivity.this;
            IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault2 = this.$result;
            if (Result.onNavigationEvent(obj2)) {
            }
            BaseActivity baseActivity22 = FaceRegisterActivity.this;
            apiError = Result.exceptionOrNull-impl(obj2);
            if (apiError != null) {
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(FaceRegisterActivity faceRegisterActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            isDebugStateOn.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = isDebugStateOn.onExtraCallback.onExtraCallbackWithResult();
            if (onwarmupcompletedOnExtraCallbackWithResult == null) {
                int i2 = onTransact + 53;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                faceRegisterActivity.finish();
                return Unit.INSTANCE;
            }
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(faceRegisterActivity), (CoroutineContext) null, (setRandomHost) null, faceRegisterActivity.new onWarmupCompleted(faceRegisterActivity.IAuthTabCallback(), onwarmupcompletedOnExtraCallbackWithResult, iEngagementSignalsCallbackDefault, null), 3, (Object) null);
            int i4 = IAuthTabCallbackDefault + 99;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        } else {
            isDebugStateOn.onExtraCallback.onExtraCallback();
            faceRegisterActivity.setResult(0);
            faceRegisterActivity.finish();
        }
        return Unit.INSTANCE;
    }

    public void onDestroy() {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            isDebugStateOn.onExtraCallback.onExtraCallback();
            int i3 = 8 / 0;
        } else {
            super.onDestroy();
            isDebugStateOn.onExtraCallback.onExtraCallback();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.features.faceverify.impl.ui.register.Hilt_FaceRegisterActivity
    public void onCreate(@Nullable Bundle bundle) {
        String str;
        String str2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("EXTRA_REFERRER");
        if (stringExtra == null) {
            int i4 = IAuthTabCallbackDefault + 49;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            str = "";
        } else {
            str = stringExtra;
        }
        String stringExtra2 = getIntent().getStringExtra("EXTRA_SERVICE_REFERRER");
        if (stringExtra2 == null) {
            int i6 = IAuthTabCallbackDefault + 113;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            str2 = "";
        } else {
            str2 = stringExtra2;
        }
        String stringExtra3 = getIntent().getStringExtra("EXTRA_ENTRYPOINT");
        if (stringExtra3 == null) {
            stringExtra3 = "PRE_REG";
        }
        this.IAuthTabCallbackStub = stringExtra3;
        boolean booleanExtra = getIntent().getBooleanExtra("EXTRA_SHOW_CUSHION_PAGE", true);
        boolean booleanExtra2 = getIntent().getBooleanExtra("EXTRA_SHOW_RESULT_PAGE", true);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(getIntent().getStringExtra("EXTRA_EXECUTION_ID"), str, str2, booleanExtra, booleanExtra2, getIntent().getBooleanExtra("EXTRA_ANIMATED", true), null), 3, (Object) null);
    }

    @Override // im.toss.features.faceverify.impl.ui.register.Hilt_FaceRegisterActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.features.faceverify.impl.ui.register.Hilt_FaceRegisterActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.features.faceverify.impl.ui.register.Hilt_FaceRegisterActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.features.faceverify.impl.ui.register.Hilt_FaceRegisterActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ boolean $animated;
        final /* synthetic */ String $executionId;
        final /* synthetic */ String $referrer;
        final /* synthetic */ String $serviceReferrer;
        final /* synthetic */ boolean $showCushionPage;
        final /* synthetic */ boolean $showResultPage;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(String str, String str2, String str3, boolean z, boolean z2, boolean z3, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$executionId = str;
            this.$referrer = str2;
            this.$serviceReferrer = str3;
            this.$showCushionPage = z;
            this.$showResultPage = z2;
            this.$animated = z3;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = FaceRegisterActivity.this.new onNavigationEvent(this.$executionId, this.$referrer, this.$serviceReferrer, this.$showCushionPage, this.$showResultPage, this.$animated, access13800Var);
            int i2 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
        /* JADX WARN: Type inference failed for: r1v4, types: [android.app.Activity, im.toss.features.faceverify.impl.ui.register.FaceRegisterActivity] */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v2, types: [android.content.Context] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            ?? r7;
            Object objOnNavigationEvent;
            Throwable th;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
                Boolean boolOnNavigationEvent = access14000.onNavigationEvent(false);
                this.label = 1;
                int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                objOnExtraCallback = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted21, "face.pay.register.enabled", boolOnNavigationEvent, this}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, iIAuthTabCallback);
                if (objOnExtraCallback != objOnWarmupCompleted) {
                }
                int i3 = onExtraCallbackWithResult + 115;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return objOnWarmupCompleted;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onExtraCallbackWithResult + 25;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                FaceRegisterActivity faceRegisterActivity = (FaceRegisterActivity) this.L$0;
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = ((Result) obj).onNavigationEvent();
                r7 = faceRegisterActivity;
                ?? r1 = FaceRegisterActivity.this;
                String str = this.$executionId;
                String str2 = this.$referrer;
                String str3 = this.$serviceReferrer;
                boolean z = this.$showCushionPage;
                boolean z2 = this.$showResultPage;
                boolean z3 = this.$animated;
                if (Result.onNavigationEvent(objOnNavigationEvent)) {
                    FaceRegisterActivity.onNavigationEvent(r1).onNavigationEvent(SelfieCameraV2Activity.onExtraCallback.onWarmupCompleted(SelfieCameraV2Activity.Companion, (Context) r7, FaceRegisterActivity.onExtraCallbackWithResult(r1), str, str2, str3, z, z2, false, 128, (Object) null));
                    if (!z3) {
                        r1.overridePendingTransition(0, 0);
                    }
                }
                th = Result.exceptionOrNull-impl(objOnNavigationEvent);
                if (th != null) {
                    ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "FaceRegisterActivity", "initializeFaceSdkUseCase", th, (Map) null, 8, (Object) null);
                }
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            objOnExtraCallback = obj;
            if (!((Boolean) objOnExtraCallback).booleanValue()) {
                int i7 = IAuthTabCallback + 103;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                FaceRegisterActivity.this.setResult(0);
                FaceRegisterActivity.this.finish();
                return Unit.INSTANCE;
            }
            FaceRegisterActivity faceRegisterActivity2 = FaceRegisterActivity.this;
            appIsMiniService appisminiserviceOnNavigationEvent = faceRegisterActivity2.onNavigationEvent();
            this.L$0 = faceRegisterActivity2;
            this.label = 2;
            Object objIAuthTabCallback = appisminiserviceOnNavigationEvent.IAuthTabCallback(this);
            if (objIAuthTabCallback != objOnWarmupCompleted) {
                r7 = faceRegisterActivity2;
                objOnNavigationEvent = objIAuthTabCallback;
                ?? r12 = FaceRegisterActivity.this;
                String str4 = this.$executionId;
                String str22 = this.$referrer;
                String str32 = this.$serviceReferrer;
                boolean z4 = this.$showCushionPage;
                boolean z22 = this.$showResultPage;
                boolean z32 = this.$animated;
                if (Result.onNavigationEvent(objOnNavigationEvent)) {
                }
                th = Result.exceptionOrNull-impl(objOnNavigationEvent);
                if (th != null) {
                }
                return Unit.INSTANCE;
            }
            int i32 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i32 % 128;
            int i42 = i32 % 2;
            return objOnWarmupCompleted;
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final Intent onExtraCallback(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, boolean z, boolean z2, boolean z3) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) FaceRegisterActivity.class).putExtra("EXTRA_SERVICE_REFERRER", str).putExtra("EXTRA_REFERRER", str2).putExtra("EXTRA_ENTRYPOINT", str3).putExtra("EXTRA_EXECUTION_ID", str4).putExtra("EXTRA_SHOW_CUSHION_PAGE", z).putExtra("EXTRA_SHOW_RESULT_PAGE", z2).putExtra("EXTRA_ANIMATED", z3);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i2 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return intentPutExtra;
        }
    }
}
