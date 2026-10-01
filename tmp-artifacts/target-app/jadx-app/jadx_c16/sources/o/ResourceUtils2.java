package o;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.features.loan.alpha.LoanCreditDebugToolsKt$;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.initMiniApp;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ResourceUtils2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsCallback(function0, gettypedexportedconstants);
            throw null;
        }
        Unit unitICustomTabsCallback = ICustomTabsCallback(function0, gettypedexportedconstants);
        int i3 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unitICustomTabsCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(function0, view);
        int i4 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(function0, gettypedexportedconstants);
        int i4 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getTypedExportedConstants gettypedexportedconstants) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(gettypedexportedconstants);
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(function0, gettypedexportedconstants);
        int i4 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1280751292, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{function0, view}, -1280751292);
        int i4 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnActivityLayout = onActivityLayout(function0, gettypedexportedconstants);
        int i4 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnActivityLayout;
        }
        throw null;
    }

    public static /* synthetic */ Unit asBinder(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(function0, view);
        int i4 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess100;
    }

    public static /* synthetic */ Unit asBinder(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnActivityResized = onActivityResized(function0, gettypedexportedconstants);
        int i4 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnActivityResized;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(function0, gettypedexportedconstants);
        int i4 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return unitAccess100;
    }

    public static /* synthetic */ Unit asInterface(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onMessageChannelReady(function0, gettypedexportedconstants);
        }
        onMessageChannelReady(function0, gettypedexportedconstants);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~i3;
        int i11 = i9 | (~(i8 | i10));
        int i12 = ~(i3 | i4 | i6);
        int i13 = i11 | i12;
        int i14 = i10 | i4;
        int i15 = i4 + i6 + i2 + (112060874 * i) + ((-1891258303) * i5);
        int i16 = i15 * i15;
        int i17 = (i4 * 1286644997) + 1783103488 + (1286644997 * i6) + (i13 * (-1821943044)) + ((-651081208) * i12) + ((-1821943044) * i14) + ((-535298048) * i2) + ((-1427111936) * i) + (1712848896 * i5) + (159514624 * i16);
        int i18 = ((i4 * (-1669307009)) - 1771304782) + (i6 * (-1669307009)) + (i13 * 564) + (i12 * (-1128)) + (i14 * 564) + (i2 * (-1669306445)) + (i * (-1582645698)) + (i5 * (-198941581)) + (i16 * (-203030528));
        switch (i17 + (i18 * i18 * (-2008154112))) {
            case 1:
                Function0 function0 = (Function0) objArr[0];
                getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[1];
                int i19 = 2 % 2;
                int i20 = onNavigationEvent + 57;
                onExtraCallbackWithResult = i20 % 128;
                int i21 = i20 % 2;
                Unit unitWriteTypedObject = writeTypedObject(function0, gettypedexportedconstants);
                int i22 = onNavigationEvent + 93;
                onExtraCallbackWithResult = i22 % 128;
                int i23 = i22 % 2;
                return unitWriteTypedObject;
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                LinearLayout linearLayout = (LinearLayout) objArr[0];
                Function0 function02 = (Function0) objArr[1];
                int i24 = 2 % 2;
                BaseTextView baseTextView = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
                Intrinsics.checkNotNull(baseTextView);
                baseTextView.setText("신용상품 0개로 변경");
                DisplayMetrics displayMetrics = baseTextView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                int iOnNavigationEvent = varyMatches.onNavigationEvent(10, displayMetrics);
                DisplayMetrics displayMetrics2 = baseTextView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                setMinWebSocketMessageToCompressokhttp.onExtraCallback(baseTextView, 0, iOnNavigationEvent, 0, varyMatches.onNavigationEvent(10, displayMetrics2));
                Intrinsics.checkNotNull(baseTextView);
                setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
                setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1916499490, new Object[]{baseTextView, new LoanCreditDebugToolsKt$.ExternalSyntheticLambda1(function02)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1916499491);
                int i25 = onNavigationEvent + 41;
                onExtraCallbackWithResult = i25 % 128;
                int i26 = i25 % 2;
                return null;
            case 7:
                return asInterface(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(function0, view);
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        int i5 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return access000(function0, view);
        }
        access000(function0, view);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallback = extraCallback(function0, gettypedexportedconstants);
        int i4 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted();
        int i4 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            getInterfaceDescriptor(function0, view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit interfaceDescriptor = getInterfaceDescriptor(function0, view);
        int i3 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit onTransact(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            readTypedObject(function0, gettypedexportedconstants);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit typedObject = readTypedObject(function0, gettypedexportedconstants);
        int i3 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return typedObject;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnPostMessage = onPostMessage(function0, gettypedexportedconstants);
        int i4 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnPostMessage;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            return (Unit) onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -205727093, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{function0, view}, 205727098);
        }
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(function0, gettypedexportedconstants);
        int i4 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return interfaceDescriptor;
    }

    public static final class IAuthTabCallback implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        private static int IAuthTabCallback = 1;
        public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public final void onNavigationEvent(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            if (i3 != 0) {
                throw null;
            }
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((initMiniApp.onWarmupCompleted) obj);
            if (i3 == 0) {
                return Unit.INSTANCE;
            }
            int i4 = 13 / 0;
            return Unit.INSTANCE;
        }
    }

    public static final class onWarmupCompleted implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 35;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public final void onExtraCallback(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            int i4 = onExtraCallback + 63;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            onExtraCallback((initMiniApp.onWarmupCompleted) obj);
            if (i3 != 0) {
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 73;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit2;
            }
            obj2.hashCode();
            throw null;
        }
    }

    private static final Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit access100(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            function0.invoke();
            gettypedexportedconstants.dismiss();
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallbackWithResult + 61;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        function0.invoke();
        gettypedexportedconstants.dismiss();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static final Unit getInterfaceDescriptor(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStubProxy(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return unit;
    }

    private static final Unit writeTypedObject(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            function0.invoke();
            gettypedexportedconstants.dismiss();
            unit = Unit.INSTANCE;
            int i3 = 74 / 0;
        } else {
            function0.invoke();
            gettypedexportedconstants.dismiss();
            unit = Unit.INSTANCE;
        }
        int i4 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return unit;
    }

    private static final Unit readTypedObject(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(getTypedExportedConstants gettypedexportedconstants) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent();
            gettypedexportedconstants.dismiss();
            int i3 = 26 / 0;
            return Unit.INSTANCE;
        }
        addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent();
        gettypedexportedconstants.dismiss();
        return Unit.INSTANCE;
    }

    private static final Unit extraCallback(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return unit;
    }

    private static final Unit ICustomTabsCallback(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final void onExtraCallback(@NotNull Context context, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, @NotNull Function0<Unit> function04, @NotNull Function0<Unit> function05, @NotNull Function0<Unit> function06, @NotNull Function0<Unit> function07) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        Intrinsics.checkNotNullParameter(function04, "");
        Intrinsics.checkNotNullParameter(function05, "");
        Intrinsics.checkNotNullParameter(function06, "");
        Intrinsics.checkNotNullParameter(function07, "");
        onWarmupCompleted onwarmupcompleted = onWarmupCompleted.IAuthTabCallback;
        logAndOpenStore.IAuthTabCallback(context, (Long) null);
        getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(context, 0, false, false, -1L, onwarmupcompleted, 14, (DefaultConstructorMarker) null);
        Context context2 = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        needForceUpdate.onNavigationEvent(linearLayout, "일부 항목 세팅 뒤에는 화면이 다시 그려져요");
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        LinearLayout linearLayout2 = new LinearLayout(context3);
        linearLayout2.setOrientation(1);
        DisplayMetrics displayMetrics = linearLayout2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
        DisplayMetrics displayMetrics2 = linearLayout2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(linearLayout2, iOnNavigationEvent, 0, varyMatches.onNavigationEvent(24, displayMetrics2), 0);
        needForceUpdate.onWarmupCompleted(linearLayout2, new LoanCreditDebugToolsKt$.ExternalSyntheticLambda10(function0, gettypedexportedconstants));
        needForceUpdate.onNavigationEvent(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1440979041, new Object[]{linearLayout2, new LoanCreditDebugToolsKt$.ExternalSyntheticLambda11(function02, gettypedexportedconstants)}, -1440979039);
        needForceUpdate.IAuthTabCallback(linearLayout2, new LoanCreditDebugToolsKt$.ExternalSyntheticLambda12(function03, gettypedexportedconstants));
        needForceUpdate.onExtraCallback(linearLayout2, new LoanCreditDebugToolsKt$.ExternalSyntheticLambda13(function04, gettypedexportedconstants));
        needForceUpdate.asInterface(linearLayout2, new LoanCreditDebugToolsKt$.ExternalSyntheticLambda14(function05, gettypedexportedconstants));
        needForceUpdate.onExtraCallbackWithResult(linearLayout2, new LoanCreditDebugToolsKt$.ExternalSyntheticLambda15(gettypedexportedconstants));
        Object[] objArr = {linearLayout2, new LoanCreditDebugToolsKt$.ExternalSyntheticLambda16(function06, gettypedexportedconstants)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1532759727, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), objArr, -1532759723);
        IAuthTabCallback(linearLayout2, (Function0<Unit>) new LoanCreditDebugToolsKt$.ExternalSyntheticLambda17(function07, gettypedexportedconstants));
        Space space = new Space(linearLayout2.getContext());
        DisplayMetrics displayMetrics3 = space.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(space, varyMatches.onNavigationEvent(16, displayMetrics3));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, space);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, linearLayout2);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
        int i2 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit extraCallbackWithResult(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onActivityResized(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onPostMessage(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            function0.invoke();
            gettypedexportedconstants.dismiss();
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        function0.invoke();
        gettypedexportedconstants.dismiss();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static final Unit onMessageChannelReady(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            function0.invoke();
            gettypedexportedconstants.dismiss();
            unit = Unit.INSTANCE;
            int i3 = 50 / 0;
        } else {
            function0.invoke();
            gettypedexportedconstants.dismiss();
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return unit;
    }

    private static final Unit onActivityLayout(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            function0.invoke();
            gettypedexportedconstants.dismiss();
            Unit unit = Unit.INSTANCE;
            int i3 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        function0.invoke();
        gettypedexportedconstants.dismiss();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    public static final void onExtraCallback(@NotNull Context context, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, @NotNull Function0<Unit> function04, @NotNull Function0<Unit> function05) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        Intrinsics.checkNotNullParameter(function04, "");
        Intrinsics.checkNotNullParameter(function05, "");
        IAuthTabCallback iAuthTabCallback = IAuthTabCallback.onExtraCallback;
        logAndOpenStore.IAuthTabCallback(context, (Long) null);
        getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(context, 0, false, false, -1L, iAuthTabCallback, 14, (DefaultConstructorMarker) null);
        Context context2 = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        needForceUpdate.onNavigationEvent(linearLayout, "신용 상품 관련 테스트 도구 모음");
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        LinearLayout linearLayout2 = new LinearLayout(context3);
        linearLayout2.setOrientation(1);
        DisplayMetrics displayMetrics = linearLayout2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
        DisplayMetrics displayMetrics2 = linearLayout2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(linearLayout2, iOnNavigationEvent, 0, varyMatches.onNavigationEvent(24, displayMetrics2), 0);
        onNavigationEvent(linearLayout2, (Function0<Unit>) new LoanCreditDebugToolsKt$.ExternalSyntheticLambda5(function0, gettypedexportedconstants));
        onTransact(linearLayout2, (Function0<Unit>) new LoanCreditDebugToolsKt$.ExternalSyntheticLambda6(function02, gettypedexportedconstants));
        Object[] objArr = {linearLayout2, new LoanCreditDebugToolsKt$.ExternalSyntheticLambda7(function03, gettypedexportedconstants)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 942927344, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), objArr, -942927338);
        Object[] objArr2 = {linearLayout2, new LoanCreditDebugToolsKt$.ExternalSyntheticLambda8(function04, gettypedexportedconstants)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1131962683, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), objArr2, 1131962691);
        onExtraCallbackWithResult(linearLayout2, (Function0<Unit>) new LoanCreditDebugToolsKt$.ExternalSyntheticLambda9(function05, gettypedexportedconstants));
        Space space = new Space(linearLayout2.getContext());
        DisplayMetrics displayMetrics3 = space.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(space, varyMatches.onNavigationEvent(16, displayMetrics3));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, space);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, linearLayout2);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
        int i2 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        int i = 2 % 2;
        BaseTextView baseTextView = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
        Intrinsics.checkNotNull(baseTextView);
        baseTextView.setText("신용상품 결과 반영하기");
        DisplayMetrics displayMetrics = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(10, displayMetrics);
        DisplayMetrics displayMetrics2 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(baseTextView, 0, iOnNavigationEvent, 0, varyMatches.onNavigationEvent(10, displayMetrics2));
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1916499490, new Object[]{baseTextView, new LoanCreditDebugToolsKt$.ExternalSyntheticLambda0(function0)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1916499491);
        int i2 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit getInterfaceDescriptor(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            function0.invoke();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(view, "");
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final void onNavigationEvent(LinearLayout linearLayout, Function0<Unit> function0) {
        int i = 2 % 2;
        BaseTextView baseTextView = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
        Intrinsics.checkNotNull(baseTextView);
        baseTextView.setText("신용상품 2개 이하로 변경 (소팅 제거)");
        DisplayMetrics displayMetrics = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(10, displayMetrics);
        DisplayMetrics displayMetrics2 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(baseTextView, 0, iOnNavigationEvent, 0, varyMatches.onNavigationEvent(10, displayMetrics2));
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
        Object[] objArr = {baseTextView, new LoanCreditDebugToolsKt$.ExternalSyntheticLambda20(function0)};
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1916499490, objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1916499491);
        int i2 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit access000(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final void onTransact(LinearLayout linearLayout, Function0<Unit> function0) {
        int i = 2 % 2;
        BaseTextView baseTextView = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
        Intrinsics.checkNotNull(baseTextView);
        baseTextView.setText("주담대 상품 2개 이하로 변경 (소팅 제거)");
        DisplayMetrics displayMetrics = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(10, displayMetrics);
        DisplayMetrics displayMetrics2 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(baseTextView, 0, iOnNavigationEvent, 0, varyMatches.onNavigationEvent(10, displayMetrics2));
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
        Object[] objArr = {baseTextView, new LoanCreditDebugToolsKt$.ExternalSyntheticLambda4(function0)};
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1916499490, objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1916499491);
        int i2 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit access100(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            function0.invoke();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        function0.invoke();
        Unit unit2 = Unit.INSTANCE;
        int i3 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 57 / 0;
        }
        return unit2;
    }

    private static final Unit IAuthTabCallback_Parcel(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        int i = 2 % 2;
        BaseTextView baseTextView = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
        Intrinsics.checkNotNull(baseTextView);
        baseTextView.setText("주담대상품 0개로 변경");
        DisplayMetrics displayMetrics = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(10, displayMetrics);
        DisplayMetrics displayMetrics2 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(baseTextView, 0, iOnNavigationEvent, 0, varyMatches.onNavigationEvent(10, displayMetrics2));
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
        Object[] objArr2 = {baseTextView, new LoanCreditDebugToolsKt$.ExternalSyntheticLambda3(function0)};
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1916499490, objArr2, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1916499491);
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 19 / 0;
        }
        return null;
    }

    private static final void onExtraCallbackWithResult(LinearLayout linearLayout, Function0<Unit> function0) {
        int i = 2 % 2;
        BaseTextView baseTextView = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
        Intrinsics.checkNotNull(baseTextView);
        baseTextView.setText("주담대 상품에 필터 제거");
        DisplayMetrics displayMetrics = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(10, displayMetrics);
        DisplayMetrics displayMetrics2 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(baseTextView, 0, iOnNavigationEvent, 0, varyMatches.onNavigationEvent(10, displayMetrics2));
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
        Object[] objArr = {baseTextView, new LoanCreditDebugToolsKt$.ExternalSyntheticLambda19(function0)};
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1916499490, objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1916499491);
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void IAuthTabCallback(LinearLayout linearLayout, Function0<Unit> function0) {
        int i = 2 % 2;
        BaseTextView baseTextView = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
        Intrinsics.checkNotNull(baseTextView);
        baseTextView.setText("최적대출 브릿지 테스트");
        DisplayMetrics displayMetrics = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(10, displayMetrics);
        DisplayMetrics displayMetrics2 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(baseTextView, 0, iOnNavigationEvent, 0, varyMatches.onNavigationEvent(10, displayMetrics2));
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1916499490, new Object[]{baseTextView, new LoanCreditDebugToolsKt$.ExternalSyntheticLambda2(function0)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1916499491);
        int i2 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asInterface(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            function0.invoke();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(view, "");
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -1190403076, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{function0, gettypedexportedconstants}, 1190403078);
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -218577382, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{function0, gettypedexportedconstants}, 218577385);
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1706352193, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{function0, gettypedexportedconstants}, -1706352186);
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -1058751535, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{function0, gettypedexportedconstants}, 1058751544);
    }

    public static /* synthetic */ Unit access000(Function0 function0, getTypedExportedConstants gettypedexportedconstants) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -1494864995, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{function0, gettypedexportedconstants}, 1494864996);
    }

    private static final Unit onTransact(Function0 function0, View view) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -205727093, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{function0, view}, 205727098);
    }

    private static final void onExtraCallback(LinearLayout linearLayout, Function0<Unit> function0) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1532759727, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{linearLayout, function0}, -1532759723);
    }

    private static final Unit IAuthTabCallbackStub(Function0 function0, View view) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1280751292, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{function0, view}, -1280751292);
    }

    private static final void onWarmupCompleted(LinearLayout linearLayout, Function0<Unit> function0) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 942927344, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{linearLayout, function0}, -942927338);
    }

    private static final void IAuthTabCallbackDefault(LinearLayout linearLayout, Function0<Unit> function0) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -1131962683, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{linearLayout, function0}, 1131962691);
    }
}
