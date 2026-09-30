package im.toss.feature.credit.ui.quiz.qna;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.lifecycle.ViewModel;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ANROptimizeSwitch;
import o.AppLoadInterceptorPoint;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CloseableUtils;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import o.ImageLoaderBuilderExternalSyntheticLambda6;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.TextLinkScopeExternalSyntheticLambda7;
import o.TimeoutCompanionNONE1;
import o.access13800;
import o.access14300;
import o.access15400;
import o.enableAudioDjangoExecutorOpt;
import o.enableContextFromLogger;
import o.enableEndSpmReportInIOThread;
import o.enableGetInstalledPackageInIOThread;
import o.enableLoginReceiverExecuteInIOThread;
import o.findResAndMsg;
import o.formatMsgs;
import o.getBorderRadius;
import o.getCornerRadius;
import o.getShine;
import o.getTileModeX;
import o.h5ScreenShotObserverOnChangeOpt;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import o.setRubIn;
import o.setShine;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditQuizViewModel extends ViewModel {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long extraCallback = 3047499507393859311L;
    private static int extraCallbackWithResult = 0;
    private static int readTypedObject = 1;
    private getCornerRadius<enableContextFromLogger> IAuthTabCallback;
    private enableAudioDjangoExecutorOpt IAuthTabCallbackDefault;
    private final enableGetInstalledPackageInIOThread IAuthTabCallbackStub;
    private final ImageLoaderBuilderExternalSyntheticLambda6 IAuthTabCallbackStubProxy;
    private final enableLoginReceiverExecuteInIOThread IAuthTabCallback_Parcel;
    private int access000;
    private final TextLinkScopeExternalSyntheticLambda7 access100;
    private ANROptimizeSwitch asBinder;
    private final setRubIn<enableContextFromLogger> asInterface;
    private String getInterfaceDescriptor;
    private final getCornerRadius<enableContextFromLogger> onExtraCallback;
    private final getBorderRadius<AppLoadInterceptorPoint> onExtraCallbackWithResult;
    private LinkedList<enableContextFromLogger> onNavigationEvent;
    private final getTileModeX<AppLoadInterceptorPoint> onTransact;
    private getCornerRadius<enableContextFromLogger> onWarmupCompleted;

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i6);
        int i9 = (~(i7 | i4)) | i8 | (~(i6 | i4));
        int i10 = (~(i7 | (~i4))) | i8;
        int i11 = (~(i4 | i)) | (~((~i6) | i));
        int i12 = i + i6 + i5 + (929125522 * i3) + (1849324972 * i2);
        int i13 = i12 * i12;
        int i14 = (1419820811 * i) + 1146290176 + ((-1462591364) * i6) + (i9 * 470851707) + (470851707 * i10) + ((-470851707) * i11) + ((-1933443072) * i5) + ((-291241984) * i3) + (1012400128 * i2) + ((-1810169856) * i13);
        int i15 = ((i * (-2058557531)) - 518432259) + (i6 * (-2058559676)) + (i9 * (-715)) + (i10 * (-715)) + (i11 * 715) + (i5 * (-2058558961)) + (i3 * 548722830) + (i2 * 1549712660) + (i13 * (-2087387136));
        int i16 = i14 + (i15 * i15 * (-343605248));
        if (i16 != 1) {
            return i16 != 2 ? i16 != 3 ? i16 != 4 ? onExtraCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
        }
        CreditQuizViewModel creditQuizViewModel = (CreditQuizViewModel) objArr[0];
        enableAudioDjangoExecutorOpt enableaudiodjangoexecutoropt = (enableAudioDjangoExecutorOpt) objArr[1];
        int i17 = 2 % 2;
        int i18 = extraCallbackWithResult + 73;
        int i19 = i18 % 128;
        readTypedObject = i19;
        int i20 = i18 % 2;
        creditQuizViewModel.IAuthTabCallbackDefault = enableaudiodjangoexecutoropt;
        int i21 = i19 + 53;
        extraCallbackWithResult = i21 % 128;
        int i22 = i21 % 2;
        return null;
    }

    @Inject
    public CreditQuizViewModel(@NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7, @NotNull enableLoginReceiverExecuteInIOThread enableloginreceiverexecuteiniothread, @NotNull enableGetInstalledPackageInIOThread enablegetinstalledpackageiniothread) {
        Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
        Intrinsics.checkNotNullParameter(enableloginreceiverexecuteiniothread, "");
        Intrinsics.checkNotNullParameter(enablegetinstalledpackageiniothread, "");
        this.access100 = textLinkScopeExternalSyntheticLambda7;
        this.IAuthTabCallback_Parcel = enableloginreceiverexecuteiniothread;
        this.IAuthTabCallbackStub = enablegetinstalledpackageiniothread;
        this.IAuthTabCallbackStubProxy = new ImageLoaderBuilderExternalSyntheticLambda6(1500L);
        this.onNavigationEvent = new LinkedList<>();
        getCornerRadius<enableContextFromLogger> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent((Object) null);
        this.IAuthTabCallback = getcornerradiusOnNavigationEvent;
        this.asInterface = getcornerradiusOnNavigationEvent;
        this.onWarmupCompleted = setShine.onNavigationEvent((Object) null);
        this.onExtraCallback = setShine.onNavigationEvent((Object) null);
        getBorderRadius<AppLoadInterceptorPoint> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.onExtraCallbackWithResult = getborderradiusOnWarmupCompleted;
        this.onTransact = ycxycx.onExtraCallbackWithResult(getborderradiusOnWarmupCompleted);
        this.getInterfaceDescriptor = h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.onActivityResized.onExtraCallback, false, "credit_quiz", true, null, 9, null);
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new AnonymousClass2(null), 3, (Object) null);
    }

    public static final /* synthetic */ int IAuthTabCallback(CreditQuizViewModel creditQuizViewModel) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 111;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int i4 = creditQuizViewModel.access000;
        if (i3 == 0) {
            int i5 = 87 / 0;
        }
        return i4;
    }

    public static final /* synthetic */ void IAuthTabCallback(CreditQuizViewModel creditQuizViewModel, ANROptimizeSwitch aNROptimizeSwitch) {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 77;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        creditQuizViewModel.asBinder = aNROptimizeSwitch;
        int i5 = i2 + 115;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ getCornerRadius asBinder(CreditQuizViewModel creditQuizViewModel) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 35;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        getCornerRadius<enableContextFromLogger> getcornerradius = creditQuizViewModel.onWarmupCompleted;
        if (i3 != 0) {
            return getcornerradius;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CreditQuizViewModel creditQuizViewModel = (CreditQuizViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 1;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        LinkedList<enableContextFromLogger> linkedList = creditQuizViewModel.onNavigationEvent;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 85;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return linkedList;
    }

    public static final /* synthetic */ TextLinkScopeExternalSyntheticLambda7 onExtraCallback(CreditQuizViewModel creditQuizViewModel) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 75;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7 = creditQuizViewModel.access100;
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        return textLinkScopeExternalSyntheticLambda7;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CreditQuizViewModel creditQuizViewModel = (CreditQuizViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 25;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<enableContextFromLogger> getcornerradius = creditQuizViewModel.IAuthTabCallback;
        int i5 = i2 + 39;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return getcornerradius;
    }

    public static final /* synthetic */ enableLoginReceiverExecuteInIOThread onExtraCallbackWithResult(CreditQuizViewModel creditQuizViewModel) {
        int i = 2 % 2;
        int i2 = readTypedObject + 97;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        enableLoginReceiverExecuteInIOThread enableloginreceiverexecuteiniothread = creditQuizViewModel.IAuthTabCallback_Parcel;
        if (i3 == 0) {
            return enableloginreceiverexecuteiniothread;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(CreditQuizViewModel creditQuizViewModel, LinkedList linkedList) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 53;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        creditQuizViewModel.onNavigationEvent = linkedList;
        int i5 = i3 + 75;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(CreditQuizViewModel creditQuizViewModel, enableEndSpmReportInIOThread enableendspmreportiniothread) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 99;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        creditQuizViewModel.onNavigationEvent(enableendspmreportiniothread);
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
        int i5 = readTypedObject + 69;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditQuizViewModel creditQuizViewModel = (CreditQuizViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 45;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        getBorderRadius<AppLoadInterceptorPoint> getborderradius = creditQuizViewModel.onExtraCallbackWithResult;
        int i5 = i3 + 5;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return getborderradius;
    }

    public static final /* synthetic */ enableGetInstalledPackageInIOThread onWarmupCompleted(CreditQuizViewModel creditQuizViewModel) {
        int i = 2 % 2;
        int i2 = readTypedObject + 23;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        enableGetInstalledPackageInIOThread enablegetinstalledpackageiniothread = creditQuizViewModel.IAuthTabCallbackStub;
        int i5 = i3 + 119;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return enablegetinstalledpackageiniothread;
        }
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(CreditQuizViewModel creditQuizViewModel, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 3;
        int i4 = i3 % 128;
        readTypedObject = i4;
        int i5 = i3 % 2;
        creditQuizViewModel.access000 = i;
        if (i5 == 0) {
            int i6 = 49 / 0;
        }
        int i7 = i4 + 83;
        extraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public final ImageLoaderBuilderExternalSyntheticLambda6 IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 65;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        ImageLoaderBuilderExternalSyntheticLambda6 imageLoaderBuilderExternalSyntheticLambda6 = this.IAuthTabCallbackStubProxy;
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        return imageLoaderBuilderExternalSyntheticLambda6;
    }

    public final enableAudioDjangoExecutorOpt asInterface() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 61;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final setRubIn<enableContextFromLogger> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 83;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<enableContextFromLogger> setrubin = this.asInterface;
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
        return setrubin;
    }

    public final getCornerRadius<enableContextFromLogger> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 109;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        getCornerRadius<enableContextFromLogger> getcornerradius = this.onExtraCallback;
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        return getcornerradius;
    }

    public final getTileModeX<AppLoadInterceptorPoint> onExtraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 107;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        getTileModeX<AppLoadInterceptorPoint> gettilemodex = this.onTransact;
        int i5 = i3 + 51;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return gettilemodex;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        CreditQuizViewModel creditQuizViewModel = (CreditQuizViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7 = creditQuizViewModel.access100;
        Object[] objArr2 = new Object[1];
        a(new char[]{2986, 24924, 56956, 19230, 41006, 7631, 35579, 59277}, TextUtils.indexOf("", "", 0) + 27361, objArr2);
        boolean zAreEqual = Intrinsics.areEqual(textLinkScopeExternalSyntheticLambda7.onExtraCallback(((String) objArr2[0]).intern()), "my_loan_mgmt__mission_detail");
        int i4 = readTypedObject + 1;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zAreEqual);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 35;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            this.onNavigationEvent.isEmpty();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.onNavigationEvent.isEmpty() || this.access000 != 0) {
            return false;
        }
        int i3 = extraCallbackWithResult + 51;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public final String IAuthTabCallbackStub() {
        String str;
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 51;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.getInterfaceDescriptor;
            int i4 = 94 / 0;
        } else {
            str = this.getInterfaceDescriptor;
        }
        int i5 = i2 + 59;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ANROptimizeSwitch onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 93;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        ANROptimizeSwitch aNROptimizeSwitch = this.asBinder;
        int i5 = i3 + 79;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return aNROptimizeSwitch;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: im.toss.feature.credit.ui.quiz.qna.CreditQuizViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        Object L$0;
        int label;

        AnonymousClass2(access13800<? super AnonymousClass2> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass2 anonymousClass2 = CreditQuizViewModel.this.new AnonymousClass2(access13800Var);
            int i2 = IAuthTabCallback + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return anonymousClass2;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 41;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AnonymousClass2 anonymousClass2Create = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return anonymousClass2Create.invokeSuspend(Unit.INSTANCE);
            }
            anonymousClass2Create.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
        
            if (r4 != r2) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0137, code lost:
        
            if (r3.emit(r5, r17) == r2) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CreditQuizViewModel creditQuizViewModel;
            enableAudioDjangoExecutorOpt enableaudiodjangoexecutoropt;
            Object objOnWarmupCompleted;
            enableAudioDjangoExecutorOpt enableaudiodjangoexecutoroptAsInterface;
            List<enableContextFromLogger> listEmptyList;
            Object[] objArr;
            int iOnWarmupCompleted;
            int iOnWarmupCompleted2;
            int i = 2 % 2;
            Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                creditQuizViewModel = CreditQuizViewModel.this;
                enableaudiodjangoexecutoropt = (enableAudioDjangoExecutorOpt) CreditQuizViewModel.onExtraCallback(creditQuizViewModel).onExtraCallback("quiz");
                if (enableaudiodjangoexecutoropt != null) {
                    int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                    int iOnWarmupCompleted4 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                    CreditQuizViewModel.onExtraCallbackWithResult(1858362426, new Object[]{creditQuizViewModel, enableaudiodjangoexecutoropt}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted4, -1858362425);
                    CreditQuizViewModel creditQuizViewModel2 = CreditQuizViewModel.this;
                    enableaudiodjangoexecutoroptAsInterface = creditQuizViewModel2.asInterface();
                    if (enableaudiodjangoexecutoroptAsInterface != null) {
                        int i3 = onWarmupCompleted + 31;
                        IAuthTabCallback = i3 % 128;
                        int i4 = i3 % 2;
                        listEmptyList = enableaudiodjangoexecutoroptAsInterface.onExtraCallbackWithResult();
                        if (listEmptyList == null) {
                        }
                        CreditQuizViewModel.onExtraCallbackWithResult(creditQuizViewModel2, new LinkedList(listEmptyList));
                        CreditQuizViewModel creditQuizViewModel3 = CreditQuizViewModel.this;
                        int iOnWarmupCompleted5 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                        int iOnWarmupCompleted6 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                        CreditQuizViewModel.onWarmupCompleted(creditQuizViewModel3, ((LinkedList) CreditQuizViewModel.onExtraCallbackWithResult(590734946, new Object[]{creditQuizViewModel3}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted5, iOnWarmupCompleted6, -590734946)).size());
                        objArr = new Object[]{CreditQuizViewModel.this};
                        iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                        iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                        Object obj2 = null;
                        if (((LinkedList) CreditQuizViewModel.onExtraCallbackWithResult(590734946, objArr, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, -590734946)).isEmpty()) {
                            Object[] objArr2 = {CreditQuizViewModel.this};
                            int iOnWarmupCompleted7 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                            int iOnWarmupCompleted8 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                            getBorderRadius getborderradius = (getBorderRadius) CreditQuizViewModel.onExtraCallbackWithResult(1667173530, objArr2, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted7, iOnWarmupCompleted8, -1667173526);
                            AppLoadInterceptorPoint.onNavigationEvent onnavigationevent = AppLoadInterceptorPoint.onNavigationEvent.onExtraCallback;
                            this.L$0 = null;
                            this.label = 2;
                        } else {
                            int i5 = IAuthTabCallback + 93;
                            onWarmupCompleted = i5 % 128;
                            if (i5 % 2 != 0) {
                                CreditQuizViewModel.this.onTransact();
                                obj2.hashCode();
                                throw null;
                            }
                            CreditQuizViewModel.this.onTransact();
                        }
                        return Unit.INSTANCE;
                    }
                    listEmptyList = CollectionsKt.emptyList();
                    CreditQuizViewModel.onExtraCallbackWithResult(creditQuizViewModel2, new LinkedList(listEmptyList));
                    CreditQuizViewModel creditQuizViewModel32 = CreditQuizViewModel.this;
                    int iOnWarmupCompleted52 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                    int iOnWarmupCompleted62 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                    CreditQuizViewModel.onWarmupCompleted(creditQuizViewModel32, ((LinkedList) CreditQuizViewModel.onExtraCallbackWithResult(590734946, new Object[]{creditQuizViewModel32}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted52, iOnWarmupCompleted62, -590734946)).size());
                    objArr = new Object[]{CreditQuizViewModel.this};
                    iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                    iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                    Object obj22 = null;
                    if (((LinkedList) CreditQuizViewModel.onExtraCallbackWithResult(590734946, objArr, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, -590734946)).isEmpty()) {
                    }
                    return Unit.INSTANCE;
                }
                enableGetInstalledPackageInIOThread enablegetinstalledpackageiniothreadOnWarmupCompleted = CreditQuizViewModel.onWarmupCompleted(CreditQuizViewModel.this);
                this.L$0 = creditQuizViewModel;
                this.label = 1;
                objOnWarmupCompleted = enablegetinstalledpackageiniothreadOnWarmupCompleted.onWarmupCompleted(this);
                return objOnWarmupCompleted2;
            }
            int i6 = IAuthTabCallback + 79;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0 ? i2 != 1 : i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            creditQuizViewModel = (CreditQuizViewModel) this.L$0;
            ResultKt.onNavigationEvent(obj);
            objOnWarmupCompleted = obj;
            enableaudiodjangoexecutoropt = (enableAudioDjangoExecutorOpt) objOnWarmupCompleted;
            int iOnWarmupCompleted32 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted42 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            CreditQuizViewModel.onExtraCallbackWithResult(1858362426, new Object[]{creditQuizViewModel, enableaudiodjangoexecutoropt}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted32, iOnWarmupCompleted42, -1858362425);
            CreditQuizViewModel creditQuizViewModel22 = CreditQuizViewModel.this;
            enableaudiodjangoexecutoroptAsInterface = creditQuizViewModel22.asInterface();
            if (enableaudiodjangoexecutoroptAsInterface != null) {
            }
            listEmptyList = CollectionsKt.emptyList();
            CreditQuizViewModel.onExtraCallbackWithResult(creditQuizViewModel22, new LinkedList(listEmptyList));
            CreditQuizViewModel creditQuizViewModel322 = CreditQuizViewModel.this;
            int iOnWarmupCompleted522 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted622 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            CreditQuizViewModel.onWarmupCompleted(creditQuizViewModel322, ((LinkedList) CreditQuizViewModel.onExtraCallbackWithResult(590734946, new Object[]{creditQuizViewModel322}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted522, iOnWarmupCompleted622, -590734946)).size());
            objArr = new Object[]{CreditQuizViewModel.this};
            iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            Object obj222 = null;
            if (((LinkedList) CreditQuizViewModel.onExtraCallbackWithResult(590734946, objArr, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, -590734946)).isEmpty()) {
            }
            return Unit.INSTANCE;
        }
    }

    public final void onTransact() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(null), 3, (Object) null);
        int i2 = extraCallbackWithResult + 41;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 24 - View.MeasureSpec.getSize(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (extraCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), TextUtils.getTrimmedLength("") + 59, 6383 - (ViewConfiguration.getEdgeSlop() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i4 = $11 + 49;
                $10 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 59 - (Process.myPid() >> 22), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i6 = $10 + 119;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        Object L$0;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = CreditQuizViewModel.this.new onExtraCallbackWithResult(access13800Var);
            int i2 = onExtraCallback + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onWarmupCompleted = i2 % 128;
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
            int i2 = onWarmupCompleted + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onextracallbackwithresultCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(unit);
            int i4 = onExtraCallback + 15;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x013d, code lost:
        
            if (r2.emit(r3, r11) == r1) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00d0 A[PHI: r0 r2
          0x00d0: PHI (r0v4 o.getBorderRadius) = (r0v3 o.getBorderRadius), (r0v11 o.getBorderRadius) binds: [B:24:0x00ce, B:21:0x00a3] A[DONT_GENERATE, DONT_INLINE]
          0x00d0: PHI (r2v11 o.enableAudioDjangoExecutorOpt) = (r2v10 o.enableAudioDjangoExecutorOpt), (r2v14 o.enableAudioDjangoExecutorOpt) binds: [B:24:0x00ce, B:21:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00d5 A[PHI: r0
          0x00d5: PHI (r0v8 o.getBorderRadius) = (r0v3 o.getBorderRadius), (r0v11 o.getBorderRadius) binds: [B:24:0x00ce, B:21:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            getBorderRadius getborderradius;
            enableAudioDjangoExecutorOpt enableaudiodjangoexecutoroptAsInterface;
            long jOnExtraCallback;
            enableContextFromLogger enablecontextfromlogger;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                enableContextFromLogger enablecontextfromlogger2 = (enableContextFromLogger) ((LinkedList) CreditQuizViewModel.onExtraCallbackWithResult(590734946, new Object[]{CreditQuizViewModel.this}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -590734946)).pollFirst();
                if (enablecontextfromlogger2 == null || CreditQuizViewModel.IAuthTabCallback(CreditQuizViewModel.this) <= 0) {
                    getBorderRadius getborderradius2 = (getBorderRadius) CreditQuizViewModel.onExtraCallbackWithResult(1667173530, new Object[]{CreditQuizViewModel.this}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1667173526);
                    AppLoadInterceptorPoint.IAuthTabCallback iAuthTabCallback = AppLoadInterceptorPoint.IAuthTabCallback.onNavigationEvent;
                    this.L$0 = access15400.onNavigationEvent(enablecontextfromlogger2);
                    this.label = 2;
                } else {
                    int i3 = onWarmupCompleted + 95;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        getborderradius = (getBorderRadius) CreditQuizViewModel.onExtraCallbackWithResult(1667173530, new Object[]{CreditQuizViewModel.this}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1667173526);
                        enableaudiodjangoexecutoroptAsInterface = CreditQuizViewModel.this.asInterface();
                        int i4 = 3 / 0;
                        jOnExtraCallback = enableaudiodjangoexecutoroptAsInterface != null ? enableaudiodjangoexecutoroptAsInterface.onExtraCallback() : 0L;
                    } else {
                        getborderradius = (getBorderRadius) CreditQuizViewModel.onExtraCallbackWithResult(1667173530, new Object[]{CreditQuizViewModel.this}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1667173526);
                        enableaudiodjangoexecutoroptAsInterface = CreditQuizViewModel.this.asInterface();
                        if (enableaudiodjangoexecutoroptAsInterface != null) {
                        }
                    }
                    AppLoadInterceptorPoint.onExtraCallbackWithResult onextracallbackwithresult = new AppLoadInterceptorPoint.onExtraCallbackWithResult(enablecontextfromlogger2, jOnExtraCallback);
                    this.L$0 = enablecontextfromlogger2;
                    this.label = 1;
                    if (getborderradius.emit(onextracallbackwithresult, this) != objOnWarmupCompleted) {
                        enablecontextfromlogger = enablecontextfromlogger2;
                        ((getCornerRadius) CreditQuizViewModel.onExtraCallbackWithResult(-1724661493, new Object[]{CreditQuizViewModel.this}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1724661496)).onWarmupCompleted(enablecontextfromlogger);
                    }
                }
                return objOnWarmupCompleted;
            }
            if (i2 != 1) {
                int i5 = onWarmupCompleted + 57;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0 ? i2 != 2 : i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                enablecontextfromlogger = (enableContextFromLogger) this.L$0;
                ResultKt.onNavigationEvent(obj);
                ((getCornerRadius) CreditQuizViewModel.onExtraCallbackWithResult(-1724661493, new Object[]{CreditQuizViewModel.this}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1724661496)).onWarmupCompleted(enablecontextfromlogger);
            }
            return Unit.INSTANCE;
        }
    }

    public final void onExtraCallback(@Nullable Boolean bool) {
        int i = 2 % 2;
        int i2 = readTypedObject + 49;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (this.asInterface.IAuthTabCallback() != null) {
            maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(bool, null), 3, (Object) null);
            return;
        }
        int i4 = readTypedObject + 105;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Boolean $answer;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(Boolean bool, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$answer = bool;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = CreditQuizViewModel.this.new onNavigationEvent(this.$answer, access13800Var);
            int i2 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 59 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x01a2, code lost:
        
            if (r10.emit(r11, r21) == r2) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x01e1, code lost:
        
            if (r3.emit(r7, r21) == r2) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:33:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x01f1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01f2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            Object obj2;
            Throwable th;
            Object obj3;
            CreditQuizViewModel creditQuizViewModel;
            enableEndSpmReportInIOThread enableendspmreportiniothread;
            int i2;
            int i3;
            int i4 = 2 % 2;
            Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
            int i5 = this.label;
            Object obj4 = null;
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                enableLoginReceiverExecuteInIOThread enableloginreceiverexecuteiniothreadOnExtraCallbackWithResult = CreditQuizViewModel.onExtraCallbackWithResult(CreditQuizViewModel.this);
                enableContextFromLogger enablecontextfromlogger = (enableContextFromLogger) CreditQuizViewModel.this.IAuthTabCallback().IAuthTabCallback();
                Boolean bool = this.$answer;
                this.label = 1;
                objOnWarmupCompleted = enableloginreceiverexecuteiniothreadOnExtraCallbackWithResult.onWarmupCompleted(enablecontextfromlogger, bool, this);
                if (objOnWarmupCompleted != objOnWarmupCompleted2) {
                }
                return objOnWarmupCompleted2;
            }
            int i6 = IAuthTabCallback;
            int i7 = i6 + 55;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0 ? i5 == 1 : i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                objOnWarmupCompleted = ((Result) obj).onNavigationEvent();
            } else if (i5 == 2) {
                i3 = this.I$0;
                enableendspmreportiniothread = (enableEndSpmReportInIOThread) this.L$2;
                creditQuizViewModel = (CreditQuizViewModel) this.L$1;
                obj2 = this.L$0;
                ResultKt.onNavigationEvent(obj);
                int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
                CreditQuizViewModel.IAuthTabCallback(creditQuizViewModel, (ANROptimizeSwitch) enableEndSpmReportInIOThread.IAuthTabCallback(1139514439, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1139514438, new Object[]{enableendspmreportiniothread}, iOnWarmupCompleted));
                if (!enableendspmreportiniothread.IAuthTabCallbackDefault()) {
                    int i8 = onExtraCallbackWithResult + 9;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    if (enableendspmreportiniothread.asInterface()) {
                        int i10 = onExtraCallbackWithResult + 113;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                        this.L$0 = obj2;
                        this.L$1 = creditQuizViewModel;
                        this.L$2 = access15400.onNavigationEvent(enableendspmreportiniothread);
                        this.I$0 = i3;
                        this.label = 3;
                        if (formatMsgs.onWarmupCompleted(1200L, this) != objOnWarmupCompleted2) {
                            i2 = i3;
                            obj3 = obj2;
                            getBorderRadius getborderradius = (getBorderRadius) CreditQuizViewModel.onExtraCallbackWithResult(1667173530, new Object[]{creditQuizViewModel}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1667173526);
                            AppLoadInterceptorPoint.onWarmupCompleted onwarmupcompleted = AppLoadInterceptorPoint.onWarmupCompleted.IAuthTabCallback;
                            this.L$0 = obj3;
                            this.L$1 = access15400.onNavigationEvent(enableendspmreportiniothread);
                            this.L$2 = null;
                            this.I$0 = i2;
                            this.label = 4;
                        }
                    }
                    return objOnWarmupCompleted2;
                }
                CreditQuizViewModel creditQuizViewModel2 = CreditQuizViewModel.this;
                th = Result.exceptionOrNull-impl(obj2);
                if (th != null) {
                }
                Unit unit = Unit.INSTANCE;
                i = IAuthTabCallback + 85;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 != 0) {
                }
            } else if (i5 == 3) {
                int i12 = this.I$0;
                enableEndSpmReportInIOThread enableendspmreportiniothread2 = (enableEndSpmReportInIOThread) this.L$2;
                CreditQuizViewModel creditQuizViewModel3 = (CreditQuizViewModel) this.L$1;
                Object obj5 = this.L$0;
                ResultKt.onNavigationEvent(obj);
                i2 = i12;
                obj3 = obj5;
                creditQuizViewModel = creditQuizViewModel3;
                enableendspmreportiniothread = enableendspmreportiniothread2;
                getBorderRadius getborderradius2 = (getBorderRadius) CreditQuizViewModel.onExtraCallbackWithResult(1667173530, new Object[]{creditQuizViewModel}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1667173526);
                AppLoadInterceptorPoint.onWarmupCompleted onwarmupcompleted2 = AppLoadInterceptorPoint.onWarmupCompleted.IAuthTabCallback;
                this.L$0 = obj3;
                this.L$1 = access15400.onNavigationEvent(enableendspmreportiniothread);
                this.L$2 = null;
                this.I$0 = i2;
                this.label = 4;
            } else {
                if (i5 != 4) {
                    int i13 = i6 + 3;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    if (i5 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    Unit unit2 = Unit.INSTANCE;
                    i = IAuthTabCallback + 85;
                    onExtraCallbackWithResult = i % 128;
                    if (i % 2 != 0) {
                        return unit2;
                    }
                    obj4.hashCode();
                    throw null;
                }
                obj3 = this.L$0;
                ResultKt.onNavigationEvent(obj);
                obj2 = obj3;
                CreditQuizViewModel creditQuizViewModel22 = CreditQuizViewModel.this;
                th = Result.exceptionOrNull-impl(obj2);
                if (th != null) {
                    getBorderRadius getborderradius3 = (getBorderRadius) CreditQuizViewModel.onExtraCallbackWithResult(1667173530, new Object[]{creditQuizViewModel22}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1667173526);
                    AppLoadInterceptorPoint.onNavigationEvent onnavigationevent = AppLoadInterceptorPoint.onNavigationEvent.onExtraCallback;
                    this.L$0 = obj2;
                    this.L$1 = access15400.onNavigationEvent(th);
                    this.L$2 = null;
                    this.I$0 = 0;
                    this.label = 5;
                }
                Unit unit22 = Unit.INSTANCE;
                i = IAuthTabCallback + 85;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 != 0) {
                }
            }
            obj2 = objOnWarmupCompleted;
            int i15 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i15 % 128;
            if (i15 % 2 != 0) {
                Result.onNavigationEvent(obj2);
                throw null;
            }
            CreditQuizViewModel creditQuizViewModel4 = CreditQuizViewModel.this;
            if (Result.onNavigationEvent(obj2)) {
                enableEndSpmReportInIOThread enableendspmreportiniothread3 = (enableEndSpmReportInIOThread) obj2;
                CreditQuizViewModel.onExtraCallbackWithResult(creditQuizViewModel4, enableendspmreportiniothread3);
                CreditQuizViewModel.onWarmupCompleted(creditQuizViewModel4, CreditQuizViewModel.IAuthTabCallback(creditQuizViewModel4) - 1);
                CreditQuizViewModel.asBinder(creditQuizViewModel4).onWarmupCompleted(creditQuizViewModel4.IAuthTabCallback().IAuthTabCallback());
                getBorderRadius getborderradius4 = (getBorderRadius) CreditQuizViewModel.onExtraCallbackWithResult(1667173530, new Object[]{creditQuizViewModel4}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1667173526);
                AppLoadInterceptorPoint.onExtraCallback onextracallback = new AppLoadInterceptorPoint.onExtraCallback(enableendspmreportiniothread3);
                this.L$0 = obj2;
                this.L$1 = creditQuizViewModel4;
                this.L$2 = enableendspmreportiniothread3;
                this.I$0 = 0;
                this.label = 2;
                if (getborderradius4.emit(onextracallback, this) != objOnWarmupCompleted2) {
                    int i16 = onExtraCallbackWithResult + 87;
                    IAuthTabCallback = i16 % 128;
                    int i17 = i16 % 2;
                    enableendspmreportiniothread = enableendspmreportiniothread3;
                    creditQuizViewModel = creditQuizViewModel4;
                    i3 = 0;
                    int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
                    CreditQuizViewModel.IAuthTabCallback(creditQuizViewModel, (ANROptimizeSwitch) enableEndSpmReportInIOThread.IAuthTabCallback(1139514439, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1139514438, new Object[]{enableendspmreportiniothread}, iOnWarmupCompleted2));
                    if (!enableendspmreportiniothread.IAuthTabCallbackDefault()) {
                    }
                    CreditQuizViewModel creditQuizViewModel222 = CreditQuizViewModel.this;
                    th = Result.exceptionOrNull-impl(obj2);
                    if (th != null) {
                    }
                    Unit unit222 = Unit.INSTANCE;
                    i = IAuthTabCallback + 85;
                    onExtraCallbackWithResult = i % 128;
                    if (i % 2 != 0) {
                    }
                }
            } else {
                CreditQuizViewModel creditQuizViewModel2222 = CreditQuizViewModel.this;
                th = Result.exceptionOrNull-impl(obj2);
                if (th != null) {
                }
                Unit unit2222 = Unit.INSTANCE;
                i = IAuthTabCallback + 85;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 != 0) {
                }
            }
            return objOnWarmupCompleted2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(enableEndSpmReportInIOThread enableendspmreportiniothread) {
        int i = 2 % 2;
        int i2 = readTypedObject + 89;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        h5ScreenShotObserverOnChangeOpt.onActivityResized onactivityresized = h5ScreenShotObserverOnChangeOpt.onActivityResized.onExtraCallback;
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        String str = (String) enableEndSpmReportInIOThread.IAuthTabCallback(1543781057, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1543781057, new Object[]{enableendspmreportiniothread}, iOnWarmupCompleted);
        Object obj = null;
        if (str != null) {
            int i4 = extraCallbackWithResult + 19;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            if (((Boolean) onExtraCallbackWithResult(-1435130174, new Object[]{this}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1435130176)).booleanValue()) {
                str = null;
            }
        }
        this.getInterfaceDescriptor = h5ScreenShotObserverOnChangeOpt.onActivityResized.onExtraCallback(onactivityresized, null, str, 1, null);
        int i6 = extraCallbackWithResult + 37;
        readTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ LinkedList onNavigationEvent(CreditQuizViewModel creditQuizViewModel) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (LinkedList) onExtraCallbackWithResult(590734946, new Object[]{creditQuizViewModel}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, -590734946);
    }

    public static final /* synthetic */ getCornerRadius onTransact(CreditQuizViewModel creditQuizViewModel) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (getCornerRadius) onExtraCallbackWithResult(-1724661493, new Object[]{creditQuizViewModel}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, 1724661496);
    }

    public static final /* synthetic */ getBorderRadius asInterface(CreditQuizViewModel creditQuizViewModel) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (getBorderRadius) onExtraCallbackWithResult(1667173530, new Object[]{creditQuizViewModel}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, -1667173526);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(CreditQuizViewModel creditQuizViewModel, enableAudioDjangoExecutorOpt enableaudiodjangoexecutoropt) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        onExtraCallbackWithResult(1858362426, new Object[]{creditQuizViewModel, enableaudiodjangoexecutoropt}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, -1858362425);
    }

    private final boolean asBinder() {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return ((Boolean) onExtraCallbackWithResult(-1435130174, new Object[]{this}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, 1435130176)).booleanValue();
    }
}
