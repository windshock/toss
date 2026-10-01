package im.toss.core.webkit;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.ALCFaceValidationConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.Cookies_getFromResponse;
import o.Cookies_set;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import o.GRVAndroidMediaPlayer1;
import o.GRVAndroidMediaPlayer10;
import o.GRVAndroidMediaPlayer12;
import o.GRVAndroidMediaPlayer14;
import o.RotationProvider1;
import o.SegmentedButtonKtExternalSyntheticLambda5;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access1514;
import o.access15400;
import o.access4000;
import o.access8100;
import o.findRes;
import o.findResAndMsg;
import o.getPackageType;
import o.getWrite;
import o.isNeedUnzip;
import o.maybeUpdateAnimatable;
import o.onCompletion;
import o.putChannelInfo;
import o.setByType;
import o.setLensFacing;
import o.setRandomHost;
import o.setTaggedAddrCtrl;
import o.surfaceChanged;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class TossCoreWebView extends TossBridgeWebView implements onCompletion {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static boolean IAuthTabCallback = false;
    private static char IAuthTabCallbackStubProxy = 0;
    private static char IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 1;
    private static char[] access000 = null;
    private static char extraCallback = 0;
    private static int extraCallbackWithResult = 1;
    private static char getInterfaceDescriptor;
    private static final String onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static Function0<String> onWarmupCompleted;
    private static int readTypedObject;
    private static int writeTypedObject;
    private GRVAndroidMediaPlayer12 IAuthTabCallbackDefault;
    private setTaggedAddrCtrl<? super GRVAndroidMediaPlayer1, ? super Integer, ? super GRVAndroidMediaPlayer10, ? super Float, Unit> IAuthTabCallbackStub;
    private List<? extends surfaceChanged> access100;
    private getPackageType asBinder;
    private final findResAndMsg asInterface;
    private Float onTransact;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object[] objArr = {TossCoreWebView.this, null, null, this};
            int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted4 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            if (i3 == 0) {
                return TossCoreWebView.IAuthTabCallback(1090645510, iOnWarmupCompleted3, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted4, objArr, -1090645509);
            }
            TossCoreWebView.IAuthTabCallback(1090645510, iOnWarmupCompleted3, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted4, objArr, -1090645509);
            throw null;
        }
    }

    static {
        ICustomTabsCallbackStub();
        Object[] objArr = new Object[1];
        b(true, new byte[]{0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0}, new int[]{0, 15, 0, 12}, objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(true, new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, new int[]{15, 10, 0, 0}, objArr2);
        onExtraCallbackWithResult = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(false, new byte[]{0, 0, 1, 1, 1, 0, 0, 1}, new int[]{25, 8, 0, 8}, objArr3);
        onExtraCallback = ((String) objArr3[0]).intern();
        Companion = new onExtraCallbackWithResult(null);
        int i = readTypedObject + 49;
        ICustomTabsCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i3);
        int i9 = ~i;
        int i10 = ~i3;
        int i11 = i8 | (~(i9 | i10 | i6));
        int i12 = (~(i3 | i9 | i6)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i + i6 + i4 + (762713021 * i2) + (1579510587 * i5);
        int i15 = i14 * i14;
        int i16 = ((i * (-1846875272)) - 1480523776) + ((-1846875272) * i6) + (i11 * (-1613556599)) + (i12 * (-1613556599)) + ((-1613556599) * i13) + (834535424 * i4) + ((-750387200) * i2) + ((-523632640) * i5) + ((-1971257344) * i15);
        int i17 = ((i * (-1364308824)) - 1074288667) + (i6 * (-1364308824)) + (i11 * 659) + (i12 * 659) + (i13 * 659) + (i4 * (-1364308165)) + (i2 * (-893132913)) + (i5 * 986770329) + (i15 * (-1162149888));
        int i18 = i16 + (i17 * i17 * (-1529413632));
        return i18 != 1 ? i18 != 2 ? onExtraCallback(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static final access1514 ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 75;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ access1514 onActivityResized() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 73;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        access1514 access1514VarICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy();
        int i4 = extraCallbackWithResult + 119;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return access1514VarICustomTabsCallbackStubProxy;
    }

    public static /* synthetic */ access1514 onExtraCallbackWithResult(access4000 access4000Var, TossCoreWebView tossCoreWebView, GRVAndroidMediaPlayer10 gRVAndroidMediaPlayer10) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 53;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            return (access1514) IAuthTabCallback(933513712, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), new Object[]{access4000Var, tossCoreWebView, gRVAndroidMediaPlayer10}, -933513710);
        }
        int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted4 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        access1514 access1514Var = (access1514) IAuthTabCallback(933513712, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted4, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), new Object[]{access4000Var, tossCoreWebView, gRVAndroidMediaPlayer10}, -933513710);
        int i3 = 90 / 0;
        return access1514Var;
    }

    public static /* synthetic */ Unit onNavigationEvent(TossCoreWebView tossCoreWebView, GRVAndroidMediaPlayer10 gRVAndroidMediaPlayer10, Float f, GRVAndroidMediaPlayer1 gRVAndroidMediaPlayer1) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 61;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(tossCoreWebView, gRVAndroidMediaPlayer10, f, gRVAndroidMediaPlayer1);
        }
        IAuthTabCallback(tossCoreWebView, gRVAndroidMediaPlayer10, f, gRVAndroidMediaPlayer1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 99;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean z = IAuthTabCallback;
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        return Boolean.valueOf(z);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        TossCoreWebView tossCoreWebView = (TossCoreWebView) objArr[0];
        String str = (String) objArr[1];
        Map<String, String> map = (Map) objArr[2];
        access13800<? super setByType.onWarmupCompleted> access13800Var = (access13800) objArr[3];
        int i = 2 % 2;
        int i2 = writeTypedObject + 113;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = tossCoreWebView.onNavigationEvent(str, map, access13800Var);
        int i4 = writeTypedObject + 11;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnNavigationEvent;
        }
        throw null;
    }

    public static final /* synthetic */ Function0 onPostMessage() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 115;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Function0<String> function0 = onWarmupCompleted;
        int i5 = i2 + 91;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return function0;
    }

    public static final /* synthetic */ void onWarmupCompleted(TossCoreWebView tossCoreWebView, String str, Map map) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 61;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.loadUrl(str, map);
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 61;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        onWarmupCompleted = function0;
        int i5 = i3 + 89;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 111;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback = z;
        int i5 = i2 + 67;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public GRVAndroidMediaPlayer12 onUnminimized() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 107;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        GRVAndroidMediaPlayer12 gRVAndroidMediaPlayer12 = this.IAuthTabCallbackDefault;
        int i5 = i2 + 91;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
        return gRVAndroidMediaPlayer12;
    }

    public void setFlingDamper(@Nullable GRVAndroidMediaPlayer12 gRVAndroidMediaPlayer12) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 101;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackDefault = gRVAndroidMediaPlayer12;
        if (i3 == 0) {
            throw null;
        }
    }

    public final void setFlingCap(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 125;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            if (Intrinsics.areEqual(this.onTransact, f)) {
                return;
            }
            this.onTransact = f;
            onWarmupCompleted();
            int i3 = writeTypedObject + 53;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        Intrinsics.areEqual(this.onTransact, f);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setOnFlingEvent(@Nullable setTaggedAddrCtrl<? super GRVAndroidMediaPlayer1, ? super Integer, ? super GRVAndroidMediaPlayer10, ? super Float, Unit> settaggedaddrctrl) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 59;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackStub = settaggedaddrctrl;
        int i5 = i2 + 1;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 55;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        final Float f = this.onTransact;
        if (f == null || f.floatValue() < 0.0f) {
            f = null;
        }
        if (f == null) {
            int i4 = extraCallbackWithResult + 5;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            setFlingDamper(null);
            return;
        }
        if (Intrinsics.areEqual(f, 0.0f)) {
            GRVAndroidMediaPlayer14.IAuthTabCallback(this, new Function0() { // from class: im.toss.core.webkit.TossCoreWebView$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke() {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 13;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        return TossCoreWebView.onActivityResized();
                    }
                    TossCoreWebView.onActivityResized();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }, (Function1) null, 2, (Object) null);
            int i6 = extraCallbackWithResult + 37;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        GRVAndroidMediaPlayer10.onNavigationEvent onnavigationevent = GRVAndroidMediaPlayer10.Companion;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final GRVAndroidMediaPlayer10 gRVAndroidMediaPlayer10OnNavigationEvent = onnavigationevent.onNavigationEvent(context);
        final access4000 access4000Var = new access4000(f.floatValue(), false, 2, (DefaultConstructorMarker) null);
        GRVAndroidMediaPlayer14.onExtraCallbackWithResult(this, new Function0() { // from class: im.toss.core.webkit.TossCoreWebView$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i8 = 2 % 2;
                int i9 = onNavigationEvent + 79;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                access1514 access1514VarOnExtraCallbackWithResult = TossCoreWebView.onExtraCallbackWithResult(access4000Var, this, gRVAndroidMediaPlayer10OnNavigationEvent);
                int i11 = onNavigationEvent + 89;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 != 0) {
                    return access1514VarOnExtraCallbackWithResult;
                }
                throw null;
            }
        }, new Function1() { // from class: im.toss.core.webkit.TossCoreWebView$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = onExtraCallback + 57;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 != 0) {
                    TossCoreWebView.onNavigationEvent(this.f$0, gRVAndroidMediaPlayer10OnNavigationEvent, f, (GRVAndroidMediaPlayer1) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnNavigationEvent = TossCoreWebView.onNavigationEvent(this.f$0, gRVAndroidMediaPlayer10OnNavigationEvent, f, (GRVAndroidMediaPlayer1) obj);
                int i10 = onNavigationEvent + 37;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                return unitOnNavigationEvent;
            }
        });
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        access4000 access4000Var = (access4000) objArr[0];
        TossCoreWebView tossCoreWebView = (TossCoreWebView) objArr[1];
        GRVAndroidMediaPlayer10 gRVAndroidMediaPlayer10 = (GRVAndroidMediaPlayer10) objArr[2];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 41;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return access4000Var.onExtraCallback(tossCoreWebView.getHeight(), gRVAndroidMediaPlayer10);
        }
        access1514 access1514VarOnExtraCallback = access4000Var.onExtraCallback(tossCoreWebView.getHeight(), gRVAndroidMediaPlayer10);
        int i3 = 8 / 0;
        return access1514VarOnExtraCallback;
    }

    private static final Unit IAuthTabCallback(TossCoreWebView tossCoreWebView, GRVAndroidMediaPlayer10 gRVAndroidMediaPlayer10, Float f, GRVAndroidMediaPlayer1 gRVAndroidMediaPlayer1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(gRVAndroidMediaPlayer1, "");
        setTaggedAddrCtrl<? super GRVAndroidMediaPlayer1, ? super Integer, ? super GRVAndroidMediaPlayer10, ? super Float, Unit> settaggedaddrctrl = tossCoreWebView.IAuthTabCallbackStub;
        if (settaggedaddrctrl != null) {
            int i2 = writeTypedObject + 77;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            settaggedaddrctrl.invoke(gRVAndroidMediaPlayer1, Integer.valueOf(tossCoreWebView.getHeight()), gRVAndroidMediaPlayer10, f);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 101;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TossCoreWebView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.asInterface = findRes.onWarmupCompleted(putChannelInfo.onExtraCallback().onExtraCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TossCoreWebView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.asInterface = findRes.onWarmupCompleted(putChannelInfo.onExtraCallback().onExtraCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TossCoreWebView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.asInterface = findRes.onWarmupCompleted(putChannelInfo.onExtraCallback().onExtraCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null)));
    }

    protected List<surfaceChanged> ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 33;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        List<surfaceChanged> listEmptyList = CollectionsKt.emptyList();
        int i4 = writeTypedObject + 119;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return listEmptyList;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 83;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $11 + 69;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i10 = (c3 + i8) ^ ((c3 << 4) + ((char) (IAuthTabCallbackStubProxy ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(extraCallback);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cGreen = (char) Color.green(0);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 10;
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cGreen, iMakeMeasureSpec, maximumDrawingCacheSize, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i12 = i9;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback_Parcel ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(getInterfaceDescriptor)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 9 - TextUtils.lastIndexOf("", '0', 0, 0), 12435 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9 = i12 + 1;
                    cArr3 = cArr4;
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
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - Color.alpha(0)), 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getPressedStateDuration() >> 16) + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i13 = $10 + 25;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    protected List<surfaceChanged> onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 11;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        List<surfaceChanged> listEmptyList = CollectionsKt.emptyList();
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return listEmptyList;
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            final /* synthetic */ Context $context;
            final /* synthetic */ String $webViewFeatureIdsToLog;
            private /* synthetic */ Object L$0;
            int label;
            private static final byte[] $$a = {57, 126, 65, 8};
            private static final int $$b = 204;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onWarmupCompleted = 0;
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent = 478309026;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String $$c(short s, int i, byte b) {
                int i2;
                int i3 = i + 4;
                int i4 = (s * 3) + 105;
                int i5 = b * 4;
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[i5 + 1];
                if (bArr == null) {
                    int i6 = i3;
                    i4 = i5;
                    int i7 = 0;
                    i4 += i3;
                    i3 = i6;
                    i2 = i7;
                    int i8 = i3 + 1;
                    bArr2[i2] = (byte) i4;
                    if (i2 == i5) {
                        return new String(bArr2, 0);
                    }
                    int i9 = i2 + 1;
                    i6 = i8;
                    i3 = bArr[i8];
                    i7 = i9;
                    i4 += i3;
                    i3 = i6;
                    i2 = i7;
                    int i82 = i3 + 1;
                    bArr2[i2] = (byte) i4;
                    if (i2 == i5) {
                    }
                } else {
                    i2 = 0;
                    int i822 = i3 + 1;
                    bArr2[i2] = (byte) i4;
                    if (i2 == i5) {
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onWarmupCompleted(String str, Context context, access13800<? super onWarmupCompleted> access13800Var) {
                super(2, access13800Var);
                this.$webViewFeatureIdsToLog = str;
                this.$context = context;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$webViewFeatureIdsToLog, this.$context, access13800Var);
                onwarmupcompleted.L$0 = obj;
                int i2 = IAuthTabCallback + 57;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 21 / 0;
                }
                return onwarmupcompleted;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 63;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
                int i4 = IAuthTabCallback + 115;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return objOnExtraCallback;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 121;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 17;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x016e  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x016f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
                long j;
                Throwable cause;
                int i4 = 2 % 2;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
                char[] cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (true) {
                    j = 0;
                    if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                        break;
                    }
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                    int i5 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 35125), 23 - (ViewConfiguration.getScrollBarSize() >> 8), 10277 - ImageFormat.getBitsPerPixel(0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback2 == null) {
                            byte b = (byte) 0;
                            byte b2 = (byte) (b - 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 12843), KeyEvent.getDeadChar(0, 0) + 55, 2167 - ExpandableListView.getPackedPositionType(0L), 1298711993, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                if (i2 > 0) {
                    int i6 = $11 + 19;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                    char[] cArr3 = new char[i];
                    System.arraycopy(cArr2, 0, cArr3, 0, i);
                    System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                    System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                }
                if (!(!z)) {
                    int i8 = $11 + 85;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    char[] cArr4 = new char[i];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                    while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                        int i10 = $10 + 59;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 - 1);
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 12843), ExpandableListView.getPackedPositionType(j) + 55, TextUtils.getOffsetAfter("", 0) + 2167, 1298711993, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        j = 0;
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                Object obj2;
                String str;
                String str2;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 7;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Context context = this.$context;
                try {
                    Result.Companion companion = Result.Companion;
                    PackageInfo packageInfoIAuthTabCallback = Cookies_set.onNavigationEvent.IAuthTabCallback(context);
                    if (packageInfoIAuthTabCallback != null) {
                        int i4 = onWarmupCompleted + 101;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        str2 = packageInfoIAuthTabCallback.packageName;
                        int i6 = IAuthTabCallback + 103;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        str2 = null;
                    }
                    linkedHashMap.put("webViewPackage", str2);
                    linkedHashMap.put("webViewVersion", packageInfoIAuthTabCallback != null ? packageInfoIAuthTabCallback.versionName : null);
                    linkedHashMap.put("webViewVersionCode", packageInfoIAuthTabCallback != null ? access14000.onExtraCallback(Cookies_getFromResponse.onNavigationEvent(packageInfoIAuthTabCallback)) : null);
                    Result.constructor-impl(Unit.INSTANCE);
                    int i8 = IAuthTabCallback + 15;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Result.constructor-impl(ResultKt.createFailure(th));
                }
                List listSplit$default = StringsKt.split$default(this.$webViewFeatureIdsToLog, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList<String> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
                Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    int i10 = onWarmupCompleted + 13;
                    IAuthTabCallback = i10 % 128;
                    if (i10 % 2 == 0) {
                        arrayList.add(StringsKt.trim((String) it.next()).toString());
                        throw null;
                    }
                    arrayList.add(StringsKt.trim((String) it.next()).toString());
                }
                for (String str3 : arrayList) {
                    try {
                        Result.Companion companion3 = Result.Companion;
                        String str4 = "webViewFeature_" + str3;
                        if (SegmentedButtonKtExternalSyntheticLambda5.IAuthTabCallback(str3)) {
                            str = "Y";
                        } else {
                            int i11 = IAuthTabCallback + 1;
                            onWarmupCompleted = i11 % 128;
                            if (i11 % 2 != 0) {
                                int i12 = 4 % 5;
                            }
                            str = "N";
                        }
                        linkedHashMap.put(str4, str);
                        obj2 = Result.constructor-impl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
                    }
                    Throwable th3 = Result.exceptionOrNull-impl(obj2);
                    if (th3 != null) {
                        linkedHashMap.put("webViewFeature_" + str3, "error/" + th3.getMessage());
                    }
                }
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr = new Object[1];
                a((KeyEvent.getMaxKeyCode() >> 16) + 15, 12 - Color.green(0), new char[]{14, 65502, '\n', '\r', 0, 65522, 0, 65533, 65521, 4, 0, 18, 65519, '\n', 14}, false, 239 - TextUtils.lastIndexOf("", '0', 0), objArr);
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, ((String) objArr[0]).intern(), "WebViewInfo", (Map) linkedHashMap, (String) null, false, (String) null, 56, (Object) null);
                return Unit.INSTANCE;
            }
        }

        private onExtraCallbackWithResult() {
        }

        public static final /* synthetic */ void onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, Context context) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onextracallbackwithresult.onExtraCallback(context);
            int i4 = IAuthTabCallback + 101;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean zIAuthTabCallback = TossBridgeWebView.Companion.IAuthTabCallback();
            int i4 = onExtraCallback + 105;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return zIAuthTabCallback;
        }

        public final void onNavigationEvent(boolean z) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                TossBridgeWebView.Companion.onWarmupCompleted(z);
                int i3 = 20 / 0;
            } else {
                TossBridgeWebView.Companion.onWarmupCompleted(z);
            }
            int i4 = onExtraCallback + 89;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public final void onExtraCallbackWithResult(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TossBridgeWebView.Companion.IAuthTabCallback(z);
            int i4 = IAuthTabCallback + 121;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public final Function0<String> IAuthTabCallback() {
            Function0<String> function0OnPostMessage;
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                function0OnPostMessage = TossCoreWebView.onPostMessage();
                int i3 = 36 / 0;
            } else {
                function0OnPostMessage = TossCoreWebView.onPostMessage();
            }
            int i4 = IAuthTabCallback + 115;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return function0OnPostMessage;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onNavigationEvent(@Nullable Function0<String> function0) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TossCoreWebView.onWarmupCompleted(function0);
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private final void onExtraCallback(Context context) {
            String str;
            int i = 2 % 2;
            if (((Boolean) TossCoreWebView.IAuthTabCallback(-94038761, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), new Object[0], 94038761)).booleanValue()) {
                return;
            }
            int i2 = onExtraCallback + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Function0<String> function0IAuthTabCallback = IAuthTabCallback();
            if (function0IAuthTabCallback == null || (str = (String) function0IAuthTabCallback.invoke()) == null) {
                return;
            }
            int i4 = IAuthTabCallback + 91;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (str.length() != 0) {
                TossCoreWebView.onWarmupCompleted(true);
                maybeUpdateAnimatable.onNavigationEvent(findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback()), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(str, context, null), 3, (Object) null);
                return;
            }
            int i6 = onExtraCallback + 77;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 53 / 0;
            }
        }
    }

    @Override // im.toss.core.webkit.TossBridgeWebView
    protected void writeTypedObject() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 17;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            this.access100 = CollectionsKt.plus(ICustomTabsCallbackDefault(), onRelationshipValidationResult());
            throw null;
        }
        List<? extends surfaceChanged> listPlus = CollectionsKt.plus(ICustomTabsCallbackDefault(), onRelationshipValidationResult());
        this.access100 = listPlus;
        if (listPlus != null) {
            Iterator<T> it = listPlus.iterator();
            while (!(!it.hasNext())) {
                int i3 = writeTypedObject + 73;
                extraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                ((surfaceChanged) it.next()).IAuthTabCallback(this);
            }
        }
        super.writeTypedObject();
        onExtraCallbackWithResult onextracallbackwithresult = Companion;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, context);
        setLensFacing setlensfacingMayLaunchUrl = mayLaunchUrl();
        List<? extends surfaceChanged> list = this.access100;
        if (list != null) {
            int i5 = extraCallbackWithResult + 61;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                ((surfaceChanged) it2.next()).onExtraCallbackWithResult(setlensfacingMayLaunchUrl);
            }
        }
        List<? extends surfaceChanged> list2 = this.access100;
        if (list2 != null) {
            int i7 = writeTypedObject + 107;
            extraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                ((surfaceChanged) it3.next()).onWarmupCompleted(this);
            }
        }
    }

    @Override // im.toss.core.webkit.TossBridgeWebView, android.webkit.WebView
    public void loadUrl(@NotNull String str, @NotNull Map<String, String> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        List<? extends surfaceChanged> list = this.access100;
        if (list == null || list.isEmpty()) {
            super.loadUrl(str, map);
            return;
        }
        getPackageType getpackagetype = this.asBinder;
        if (getpackagetype != null) {
            int i2 = extraCallbackWithResult + 121;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        this.asBinder = maybeUpdateAnimatable.onNavigationEvent(this.asInterface, (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(str, map, null), 3, (Object) null);
        int i4 = writeTypedObject + 71;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Map<String, String> $additionalHttpHeaders;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(String str, Map<String, String> map, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$url = str;
            this.$additionalHttpHeaders = map;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = TossCoreWebView.this.new onWarmupCompleted(this.$url, this.$additionalHttpHeaders, access13800Var);
            int i2 = IAuthTabCallback + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 37;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 67;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                TossCoreWebView tossCoreWebView = TossCoreWebView.this;
                String str = this.$url;
                Map<String, String> map = this.$additionalHttpHeaders;
                this.label = 1;
                int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
                int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
                obj = TossCoreWebView.IAuthTabCallback(1090645510, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), new Object[]{tossCoreWebView, str, map, this}, -1090645509);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            setByType.onWarmupCompleted onwarmupcompleted = (setByType.onWarmupCompleted) obj;
            TossCoreWebView.onWarmupCompleted(TossCoreWebView.this, onwarmupcompleted.onExtraCallbackWithResult(), onwarmupcompleted.onNavigationEvent());
            Unit unit = Unit.INSTANCE;
            int i5 = onWarmupCompleted + 125;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00fe -> B:28:0x0101). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(String str, Map<String, String> map, access13800<? super setByType.onWarmupCompleted> access13800Var) throws Throwable {
        IAuthTabCallback iAuthTabCallback;
        IAuthTabCallback iAuthTabCallback2;
        Map mapOnWarmupCompleted;
        String str2;
        Iterator<? extends surfaceChanged> it;
        Map<String, String> map2;
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 121;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            int i5 = i3 + 81;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i7 = iAuthTabCallback.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i7 - 2147483648;
                int i8 = extraCallbackWithResult + 91;
                writeTypedObject = i8 % 128;
                int i9 = i8 % 2;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object obj = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i10 = iAuthTabCallback.label;
        if (i10 == 0) {
            ResultKt.onNavigationEvent(obj);
            Map mapOnWarmupCompleted2 = access8100.onWarmupCompleted(map);
            List<? extends surfaceChanged> listEmptyList = this.access100;
            if (listEmptyList == null) {
                int i11 = writeTypedObject + 1;
                extraCallbackWithResult = i11 % 128;
                if (i11 % 2 == 0) {
                    CollectionsKt.emptyList();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                listEmptyList = CollectionsKt.emptyList();
            }
            Iterator<? extends surfaceChanged> it2 = listEmptyList.iterator();
            iAuthTabCallback2 = iAuthTabCallback;
            mapOnWarmupCompleted = mapOnWarmupCompleted2;
            str2 = str;
            it = it2;
            map2 = map;
            strOnExtraCallbackWithResult = str2;
            if (it.hasNext()) {
            }
        } else {
            if (i10 != 1) {
                Object[] objArr = new Object[1];
                c(new char[]{20471, 37403, 49777, 31769, 59797, 60356, 40139, 5979, 52341, 14773, 36043, 56471, 51621, 40408, 53794, 26106, 16790, 63491, 25718, 16157, 18859, 61228, 57984, 17959, 61910, 2102, 16235, 19734, 4816, 7225, 53794, 26106, 62177, 57523, 60843, 23400, 14190, 12743, 18410, 31777, 32745, 63652, 9021, 63758, 22405, 53556, 30364, 44465}, ExpandableListView.getPackedPositionChild(0L) + 48, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            it = (Iterator) iAuthTabCallback.L$4;
            Map<String, String> map3 = (Map) iAuthTabCallback.L$1;
            String str3 = (String) iAuthTabCallback.L$0;
            ResultKt.onNavigationEvent(obj);
            int i12 = writeTypedObject + 75;
            extraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            map2 = map3;
            setByType.onWarmupCompleted onwarmupcompleted = (setByType.onWarmupCompleted) obj;
            strOnExtraCallbackWithResult = onwarmupcompleted.onExtraCallbackWithResult();
            IAuthTabCallback iAuthTabCallback3 = iAuthTabCallback;
            mapOnWarmupCompleted = access8100.onWarmupCompleted(onwarmupcompleted.onNavigationEvent());
            str2 = str3;
            iAuthTabCallback2 = iAuthTabCallback3;
            if (it.hasNext()) {
                surfaceChanged next = it.next();
                ALCFaceValidationConfig aLCFaceValidationConfig = new ALCFaceValidationConfig(strOnExtraCallbackWithResult, access8100.IAuthTabCallback(mapOnWarmupCompleted));
                iAuthTabCallback2.L$0 = access15400.onNavigationEvent(str2);
                iAuthTabCallback2.L$1 = access15400.onNavigationEvent(map2);
                iAuthTabCallback2.L$2 = access15400.onNavigationEvent(strOnExtraCallbackWithResult);
                iAuthTabCallback2.L$3 = access15400.onNavigationEvent(mapOnWarmupCompleted);
                iAuthTabCallback2.L$4 = it;
                iAuthTabCallback2.L$5 = access15400.onNavigationEvent(next);
                iAuthTabCallback2.L$6 = access15400.onNavigationEvent(aLCFaceValidationConfig);
                iAuthTabCallback2.label = 1;
                Object objOnNavigationEvent = next.onNavigationEvent(aLCFaceValidationConfig, iAuthTabCallback2);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                iAuthTabCallback = iAuthTabCallback2;
                str3 = str2;
                obj = objOnNavigationEvent;
                setByType.onWarmupCompleted onwarmupcompleted2 = (setByType.onWarmupCompleted) obj;
                strOnExtraCallbackWithResult = onwarmupcompleted2.onExtraCallbackWithResult();
                IAuthTabCallback iAuthTabCallback32 = iAuthTabCallback;
                mapOnWarmupCompleted = access8100.onWarmupCompleted(onwarmupcompleted2.onNavigationEvent());
                str2 = str3;
                iAuthTabCallback2 = iAuthTabCallback32;
                if (it.hasNext()) {
                    return new setByType.onWarmupCompleted(strOnExtraCallbackWithResult, mapOnWarmupCompleted);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r1
      0x0023: PHI (r1v6 java.util.List<? extends o.surfaceChanged>) = (r1v5 java.util.List<? extends o.surfaceChanged>), (r1v14 java.util.List<? extends o.surfaceChanged>) binds: [B:8:0x0021, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // im.toss.core.webkit.TossBridgeWebView, android.webkit.WebView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void destroy() {
        List<? extends surfaceChanged> list;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 17;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            findRes.onExtraCallbackWithResult(this.asInterface, (CancellationException) null, 1, (Object) null);
            list = this.access100;
            if (list != null) {
                int i3 = extraCallbackWithResult + 43;
                writeTypedObject = i3 % 128;
                if (i3 % 2 != 0) {
                    list.iterator();
                    obj.hashCode();
                    throw null;
                }
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((surfaceChanged) it.next()).IAuthTabCallback();
                }
            }
        } else {
            findRes.onExtraCallbackWithResult(this.asInterface, (CancellationException) null, 1, (Object) null);
            list = this.access100;
            if (list != null) {
            }
        }
        super.destroy();
        int i4 = extraCallbackWithResult + 51;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 5;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            onUnminimized();
            throw null;
        }
        Intrinsics.checkNotNullParameter(motionEvent, "");
        GRVAndroidMediaPlayer12 gRVAndroidMediaPlayer12OnUnminimized = onUnminimized();
        if (gRVAndroidMediaPlayer12OnUnminimized != null) {
            gRVAndroidMediaPlayer12OnUnminimized.onNavigationEvent(motionEvent);
        }
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        int i3 = extraCallbackWithResult + 77;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 12 / 0;
        }
        return zDispatchTouchEvent;
    }

    @Override // im.toss.core.webkit.TossBridgeWebView, android.view.View
    protected Parcelable onSaveInstanceState() throws Throwable {
        Bundle bundleOnNavigationEvent;
        int i = 2 % 2;
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState instanceof Bundle) {
            bundleOnNavigationEvent = (Bundle) parcelableOnSaveInstanceState;
            int i2 = extraCallbackWithResult + 81;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = extraCallbackWithResult + 107;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            bundleOnNavigationEvent = null;
        }
        if (bundleOnNavigationEvent == null) {
            int i6 = extraCallbackWithResult + 73;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            b(true, new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, new int[]{15, 10, 0, 0}, objArr);
            bundleOnNavigationEvent = RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), parcelableOnSaveInstanceState)});
        }
        Float f = this.onTransact;
        if (f != null) {
            Object[] objArr2 = new Object[1];
            b(false, new byte[]{0, 0, 1, 1, 1, 0, 0, 1}, new int[]{25, 8, 0, 8}, objArr2);
            bundleOnNavigationEvent.putFloat(((String) objArr2[0]).intern(), f.floatValue());
        }
        return bundleOnNavigationEvent;
    }

    @Override // im.toss.core.webkit.TossBridgeWebView, android.view.View
    protected void onRestoreInstanceState(@Nullable Parcelable parcelable) throws Throwable {
        Bundle bundle;
        Object obj;
        int i = 2 % 2;
        super.onRestoreInstanceState(parcelable);
        if (parcelable instanceof Bundle) {
            bundle = (Bundle) parcelable;
        } else {
            int i2 = extraCallbackWithResult + 33;
            writeTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 5;
            }
            bundle = null;
        }
        if (bundle != null) {
            int i4 = writeTypedObject + 45;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 53 / 0;
                if (this.onTransact != null) {
                    return;
                }
            } else if (this.onTransact != null) {
                return;
            }
            Object[] objArr = new Object[1];
            b(false, new byte[]{0, 0, 1, 1, 1, 0, 0, 1}, new int[]{25, 8, 0, 8}, objArr);
            if (bundle.containsKey(((String) objArr[0]).intern())) {
                int i6 = extraCallbackWithResult + 113;
                writeTypedObject = i6 % 128;
                byte[] bArr = {0, 0, 1, 1, 1, 0, 0, 1};
                int[] iArr = {25, 8, 0, 8};
                if (i6 % 2 != 0) {
                    Object[] objArr2 = new Object[1];
                    b(true, bArr, iArr, objArr2);
                    obj = objArr2[0];
                } else {
                    Object[] objArr3 = new Object[1];
                    b(false, bArr, iArr, objArr3);
                    obj = objArr3[0];
                }
                setFlingCap(Float.valueOf(bundle.getFloat(((String) obj).intern())));
            }
        }
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = access000;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 35283), View.getDefaultSize(0, 0) + 35, TextUtils.getOffsetAfter("", 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 10935), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 64, 16718 - (Process.myTid() >> 22), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.lastIndexOf("", '0', 0) + 30, 17657 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), KeyEvent.keyCodeFromString("") + 70, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i10 = $11 + 31;
                $10 = i10 % 128;
                int i11 = i10 % 2;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i12 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i12, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i12);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i13 = $11 + 19;
                $10 = i13 % 128;
                int i14 = i13 % 2;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i15 = $10 + 31;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static final class onNavigationEvent implements setLensFacing {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        onNavigationEvent() {
        }

        @Override // o.setLensFacing
        public void onWarmupCompleted(String str, String str2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{TossCoreWebView.this, str, str2}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1210589485, -1210589480, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                return;
            }
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{TossCoreWebView.this, str, str2}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1210589485, -1210589480, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final setLensFacing mayLaunchUrl() {
        int i = 2 % 2;
        onNavigationEvent onnavigationevent = new onNavigationEvent();
        int i2 = extraCallbackWithResult + 69;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return onnavigationevent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean onMinimized() {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return ((Boolean) IAuthTabCallback(-94038761, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), new Object[0], 94038761)).booleanValue();
    }

    public static final /* synthetic */ Object onWarmupCompleted(TossCoreWebView tossCoreWebView, String str, Map map, access13800 access13800Var) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return IAuthTabCallback(1090645510, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), new Object[]{tossCoreWebView, str, map, access13800Var}, -1090645509);
    }

    private static final access1514 onExtraCallback(access4000 access4000Var, TossCoreWebView tossCoreWebView, GRVAndroidMediaPlayer10 gRVAndroidMediaPlayer10) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (access1514) IAuthTabCallback(933513712, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), new Object[]{access4000Var, tossCoreWebView, gRVAndroidMediaPlayer10}, -933513710);
    }

    static void ICustomTabsCallbackStub() {
        access000 = new char[]{27237, 27154, 27181, 27152, 27152, 27173, 27198, 27159, 27157, 27197, 27199, 27183, 27179, 27168, 27177, 27260, 27170, 27172, 27172, 27181, 27180, 27173, 27172, 27196, 27194, 27261, 27175, 27172, 27173, 27172, 27163, 27164, 27174};
        IAuthTabCallback_Parcel = (char) 50414;
        getInterfaceDescriptor = (char) 2525;
        IAuthTabCallbackStubProxy = (char) 26689;
        extraCallback = (char) 42831;
    }
}
