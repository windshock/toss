package viva.republica.toss.cardrecommend.issuev2.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.utils.RxUtils;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.JsonReaderUnknownNumberParsing;
import o.PageContext;
import o.RippleNode;
import o.RotationProvider1;
import o.SemanticsInformation;
import o.UTIL_GetDataFromLDAP;
import o.addAllCommandLine;
import o.createAdSizeApi;
import o.getCertId;
import o.getIconPaddingLeft;
import o.getParamImp;
import o.getWrite;
import o.initMiniApp;
import o.preFillDefault;
import o.setMessageBytes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.service.LabFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CreditCardIssueActionableWebFragment extends CardIssueBaseFragment<getCertId> {
    private static int $10 = 0;
    private static int $11 = 1;
    static final /* synthetic */ addAllCommandLine<Object>[] IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static char IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access100 = 1;
    private static char asBinder = 0;
    private static char asInterface = 0;
    private static char onExtraCallback = 0;
    private static int onTransact = 1;
    public static final int onWarmupCompleted;
    private final PageContext onExtraCallbackWithResult;
    private final boolean onNavigationEvent;

    static {
        IAuthTabCallback();
        IAuthTabCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(CreditCardIssueActionableWebFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCreditCardIssueCommonContainerBinding;", 0)};
        onWarmupCompleted = 8;
        int i = IAuthTabCallbackStubProxy + 19;
        access100 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditCardIssueActionableWebFragment creditCardIssueActionableWebFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditCardIssueActionableWebFragment, th);
        int i4 = onTransact + 39;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditCardIssueActionableWebFragment creditCardIssueActionableWebFragment, SemanticsInformation semanticsInformation) {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditCardIssueActionableWebFragment, semanticsInformation);
        int i4 = IAuthTabCallbackDefault + 49;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public CreditCardIssueActionableWebFragment() {
        super(R.layout.fragment_credit_card_issue_common_container);
        this.onExtraCallbackWithResult = preFillDefault.onExtraCallbackWithResult(this, onNavigationEvent.onNavigationEvent);
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public boolean ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.onNavigationEvent;
        int i4 = i3 + 23;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function1<View, UTIL_GetDataFromLDAP> {
        public static final onNavigationEvent onNavigationEvent = new onNavigationEvent();

        onNavigationEvent() {
            super(1, UTIL_GetDataFromLDAP.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCreditCardIssueCommonContainerBinding;", 0);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final UTIL_GetDataFromLDAP invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return UTIL_GetDataFromLDAP.onExtraCallback(view);
        }
    }

    private final UTIL_GetDataFromLDAP onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        UTIL_GetDataFromLDAP uTIL_GetDataFromLDAP = (UTIL_GetDataFromLDAP) this.onExtraCallbackWithResult.onExtraCallbackWithResult(this, IAuthTabCallback[0]);
        int i4 = IAuthTabCallbackDefault + 109;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return uTIL_GetDataFromLDAP;
    }

    private static final Unit onNavigationEvent(CreditCardIssueActionableWebFragment creditCardIssueActionableWebFragment, SemanticsInformation semanticsInformation) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Map<String, createAdSizeApi> mapOnExtraCallbackWithResult = creditCardIssueActionableWebFragment.readTypedObject().onExtraCallbackWithResult();
        createAdSizeApi createadsizeapi = null;
        if (mapOnExtraCallbackWithResult != null) {
            int i4 = IAuthTabCallbackDefault + 15;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                mapOnExtraCallbackWithResult.get(semanticsInformation.onNavigationEvent());
                createadsizeapi.hashCode();
                throw null;
            }
            createadsizeapi = mapOnExtraCallbackWithResult.get(semanticsInformation.onNavigationEvent());
        }
        createAdSizeApi createadsizeapi2 = createadsizeapi;
        if (createadsizeapi2 != null) {
            int i5 = onTransact + 61;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            creditCardIssueActionableWebFragment.writeTypedObject().onWarmupCompleted(RippleNode.onNavigationEvent(creditCardIssueActionableWebFragment), createadsizeapi2, creditCardIssueActionableWebFragment.extraCallback(), (String) null, semanticsInformation.IAuthTabCallback());
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(CreditCardIssueActionableWebFragment creditCardIssueActionableWebFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            getParamImp.onWarmupCompleted(th, creditCardIssueActionableWebFragment.requireBaseActivity(), true, (initMiniApp) null, (Function0) null, (Function1) null, 37, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(th, "");
            getParamImp.onWarmupCompleted(th, creditCardIssueActionableWebFragment.requireBaseActivity(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackDefault + 1;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        boolean zBooleanValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        FlowMeasureLazyPolicyExternalSyntheticLambda3 childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        String strOnTransact = readTypedObject().onTransact();
        UUID uuidRandomUUID = UUID.randomUUID();
        Object[] objArr = new Object[1];
        a(new char[]{39236, 41881, 46965, 33480}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), strOnTransact + "&uuid=" + uuidRandomUUID);
        Boolean boolOnWarmupCompleted = readTypedObject().onWarmupCompleted();
        if (boolOnWarmupCompleted != null) {
            zBooleanValue = boolOnWarmupCompleted.booleanValue();
            int i2 = IAuthTabCallbackDefault + 9;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        } else {
            zBooleanValue = true;
        }
        Object[] objArr2 = new Object[1];
        a(new char[]{12053, 41766, 16172, 12487, 64081, 670, 64294, 14038, 53247, 45949, 46606, 43384}, 12 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
        Bundle bundleOnNavigationEvent = RotationProvider1.onNavigationEvent(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), String.valueOf(zBooleanValue))});
        LabFragment labFragmentInstantiate = childFragmentManager.onMessageChannelReady().instantiate(ClassLoader.getSystemClassLoader(), LabFragment.class.getName());
        if (labFragmentInstantiate == null) {
            throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.service.LabFragment");
        }
        int i4 = onTransact;
        int i5 = i4 + 5;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        LabFragment labFragment = labFragmentInstantiate;
        if (bundleOnNavigationEvent != null) {
            int i7 = i4 + 117;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 != 0) {
                labFragment.setArguments(bundleOnNavigationEvent);
                throw null;
            }
            labFragment.setArguments(bundleOnNavigationEvent);
        }
        getChildFragmentManager().onExtraCallbackWithResult().IAuthTabCallback(onWarmupCompleted().onExtraCallback.getId(), labFragment).IAuthTabCallback();
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback = getIconPaddingLeft.IAuthTabCallback.onWarmupCompleted().onExtraCallback(SemanticsInformation.class);
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnExtraCallback, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsingOnExtraCallback.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        autoDisposable(setMessageBytes.onNavigationEvent(jsonReaderUnknownNumberParsingOnWarmupCompleted, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueActionableWebFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CreditCardIssueActionableWebFragment.IAuthTabCallback(this.f$0, (Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueActionableWebFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return CreditCardIssueActionableWebFragment.onWarmupCompleted(this.f$0, (SemanticsInformation) obj);
            }
        }, 2, (Object) null));
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 71;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 103;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (asInterface ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackStub);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', i3, i3) + 11;
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(longPressTimeout, iLastIndexOf, iLastIndexOf2, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    int i12 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asBinder)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 10 - (ViewConfiguration.getWindowTouchSlop() >> 8), 12434 - Drawable.resolveOpacity(0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i12 + 1;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 19902 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i13 = $11 + 111;
        $10 = i13 % 128;
        if (i13 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i14 = 9 / 0;
            objArr[0] = str;
        }
    }

    static void IAuthTabCallback() {
        onExtraCallback = (char) 10917;
        asBinder = (char) 54888;
        asInterface = (char) 10565;
        IAuthTabCallbackStub = (char) 9037;
    }
}
