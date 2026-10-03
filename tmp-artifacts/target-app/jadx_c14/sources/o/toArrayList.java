package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.network.throwable.ApiServerError;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.initMiniApp;
import o.toArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.network.model.transfer.MyAccountInfo;
import viva.republica.toss.send.TransferHelper$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class toArrayList {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static long onNavigationEvent;
    public static final toArrayList onWarmupCompleted;

    static {
        onExtraCallback();
        onWarmupCompleted = new toArrayList();
        int i = onExtraCallbackWithResult + 79;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ApiServerError apiServerError = (ApiServerError) objArr[0];
        Context context = (Context) objArr[1];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(apiServerError, context, commonModule_setLeftEdgeTouchEnabled);
        }
        onWarmupCompleted(apiServerError, context, commonModule_setLeftEdgeTouchEnabled);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(function0, gettypedexportedconstants, view);
        int i4 = onExtraCallback + 69;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(setDetectableSize);
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void IAuthTabCallback(Function0 function0, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(-1464686638, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), 1464686639, new Object[]{function0, dialogInterface}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback());
        } else {
            onWarmupCompleted(-1464686638, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), 1464686639, new Object[]{function0, dialogInterface}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback());
            int i3 = 87 / 0;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(function0, dialogInterface);
        int i4 = onExtraCallback + 19;
        IAuthTabCallback = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(function0, gettypedexportedconstants, view);
        int i4 = onExtraCallback + 113;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(setDetectableSize);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(setDetectableSize);
        int i3 = IAuthTabCallback + 49;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) onWarmupCompleted(1061287956, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -1061287956, new Object[]{gettypedexportedconstants, view}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Function0 function0, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(function0, dialogInterface);
        int i4 = onExtraCallback + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(function0, gettypedexportedconstants, view);
        int i4 = IAuthTabCallback + 75;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0, gettypedexportedconstants, view);
        int i4 = IAuthTabCallback + 31;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        Function0<Unit> function0;
        Function0<Unit> function02;
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = ~i2;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i2 | i);
        int i12 = i10 | i11;
        int i13 = (~(i7 | i)) | (~(i7 | i9)) | (~(i9 | i));
        int i14 = i + i4 + i3 + (669352129 * i5) + (266941808 * i6);
        int i15 = i14 * i14;
        int i16 = (720661947 * i) + 1572077568 + ((-1243901369) * i4) + (1165201990 * i12) + (i11 * (-1165201990)) + ((-1165201990) * i13) + (1885863936 * i3) + ((-1100480512) * i5) + ((-1249902592) * i6) + ((-491520000) * i15);
        int i17 = (i * 1617402437) + 56426783 + (i4 * 1617401273) + (i12 * (-582)) + (i11 * 582) + (i13 * 582) + (i3 * 1617401855) + (i5 * 1244927807) + (i6 * (-404665712)) + (i15 * (-45350912));
        switch (i16 + (i17 * i17 * 1565261824)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onNavigationEvent(objArr);
            case 2:
                toArrayList toarraylist = (toArrayList) objArr[0];
                Context context = (Context) objArr[1];
                String str = (String) objArr[2];
                String str2 = (String) objArr[3];
                Function0<Unit> function03 = (Function0) objArr[4];
                Function0<Unit> function04 = (Function0) objArr[5];
                int iIntValue = ((Number) objArr[6]).intValue();
                Object obj = objArr[7];
                int i18 = 2 % 2;
                if ((iIntValue & 8) != 0) {
                    int i19 = onExtraCallback;
                    int i20 = i19 + 75;
                    IAuthTabCallback = i20 % 128;
                    int i21 = i20 % 2;
                    int i22 = i19 + 51;
                    IAuthTabCallback = i22 % 128;
                    int i23 = i22 % 2;
                    function0 = null;
                } else {
                    function0 = function03;
                }
                if ((iIntValue & 16) != 0) {
                    int i24 = onExtraCallback + 33;
                    IAuthTabCallback = i24 % 128;
                    int i25 = i24 % 2;
                    function02 = null;
                } else {
                    function02 = function04;
                }
                toarraylist.onExtraCallback(context, str, str2, function0, function02);
                return null;
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                String str3 = (String) objArr[1];
                int i26 = 2 % 2;
                Intrinsics.checkNotNullParameter(str3, "");
                Charset charsetForName = Charset.forName("ISO-2022-KR");
                Intrinsics.checkNotNull(charsetForName);
                String str4 = new String(PageKey.IAuthTabCallback(str3, charsetForName), charsetForName);
                int i27 = onExtraCallback + 107;
                IAuthTabCallback = i27 % 128;
                int i28 = i27 % 2;
                return str4;
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(Context context, Function0 function0, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(context, function0, commonModule_setLeftEdgeTouchEnabled);
        int i4 = onExtraCallback + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(dialogInterface);
        int i4 = IAuthTabCallback + 83;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(gettypedexportedconstants, view);
        int i4 = onExtraCallback + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onWarmupCompleted(Function0 function0, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function0, dialogInterface);
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
    }

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public onNavigationEvent(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallback implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final onExtraCallback onExtraCallback = new onExtraCallback();

        public final void IAuthTabCallback(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        }

        public /* synthetic */ Object invoke(Object obj) {
            IAuthTabCallback((initMiniApp.onWarmupCompleted) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class onExtraCallbackWithResult implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult();

        public final void onNavigationEvent(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        }

        public /* synthetic */ Object invoke(Object obj) {
            onNavigationEvent((initMiniApp.onWarmupCompleted) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class onWarmupCompleted implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted();

        public final void onNavigationEvent(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        }

        public /* synthetic */ Object invoke(Object obj) {
            onNavigationEvent((initMiniApp.onWarmupCompleted) obj);
            return Unit.INSTANCE;
        }
    }

    private toArrayList() {
    }

    public final void IAuthTabCallback(@NotNull final Context context, @Nullable final ApiServerError apiServerError) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new Function1() { // from class: viva.republica.toss.send.TransferHelper$$ExternalSyntheticLambda10
            public final Object invoke(Object obj) {
                return (Unit) toArrayList.onWarmupCompleted(1411290548, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -1411290543, new Object[]{apiServerError, context, (CommonModule_setLeftEdgeTouchEnabled) obj}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback());
            }
        });
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onWarmupCompleted(im.toss.network.throwable.ApiServerError r11, android.content.Context r12, o.CommonModule_setLeftEdgeTouchEnabled r13) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            r2 = 0
            if (r11 == 0) goto L2a
            int r3 = o.toArrayList.onExtraCallback
            int r3 = r3 + 81
            int r4 = r3 % 128
            o.toArrayList.IAuthTabCallback = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L26
            java.lang.String r3 = r11.asBinder()
            if (r3 == 0) goto L2a
            int r4 = r3.length()
            if (r4 > 0) goto L23
            r3 = r2
        L23:
            if (r3 != 0) goto L33
            goto L2a
        L26:
            r11.asBinder()
            throw r2
        L2a:
            int r3 = viva.republica.toss.R.string.app_transfer_failed_title
            java.lang.String r3 = r12.getString(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
        L33:
            r13.onExtraCallback(r3)
            r3 = 0
            if (r11 == 0) goto L5d
            java.lang.String r11 = r11.IAuthTabCallbackDefault()
            if (r11 == 0) goto L5d
            int r4 = o.toArrayList.IAuthTabCallback
            int r4 = r4 + 103
            int r5 = r4 % 128
            o.toArrayList.onExtraCallback = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L54
            int r0 = r11.length()
            r4 = 18
            int r4 = r4 / r3
            if (r0 > 0) goto L5b
            goto L5a
        L54:
            int r0 = r11.length()
            if (r0 > 0) goto L5b
        L5a:
            r11 = r2
        L5b:
            if (r11 != 0) goto L66
        L5d:
            int r11 = viva.republica.toss.R.string.app_transfer_failed_message
            java.lang.String r11 = r12.getString(r11)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
        L66:
            r13.IAuthTabCallback(r11)
            r11 = 1
            o.CommonModule_setLeftEdgeTouchEnabled$onExtraCallback r11 = o.CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(r13, r2, r11, r2)
            java.lang.Object[] r6 = new java.lang.Object[]{r13, r11}
            int r7 = com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()
            int r4 = com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()
            int r10 = com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()
            int r8 = com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()
            r9 = -675760947(0xffffffffd7b8b4cd, float:-4.0617335E14)
            r5 = 675760957(0x28474b3d, float:1.1063034E-14)
            o.CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r13, r11}
            int r3 = com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()
            int r0 = com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()
            int r6 = com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()
            int r4 = com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()
            r5 = -1081265446(0xffffffffbf8d32da, float:-1.1031144)
            r1 = 1081265451(0x4072cd2b, float:3.7937725)
            o.CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.toArrayList.onWarmupCompleted(im.toss.network.throwable.ApiServerError, android.content.Context, o.CommonModule_setLeftEdgeTouchEnabled):kotlin.Unit");
    }

    public final void onExtraCallbackWithResult(@NotNull MyAccountInfo myAccountInfo) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(myAccountInfo, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr = new Object[1];
        a(new char[]{11546, 14725, 1085, 4299, 32633, 19445, 22173, 48435, 35321, 37987, 57589, 53134, 55862, 9972, 3399, 6640, 25738, 29487, 24520, 43591, 46843, 40340, 59415, 62643, 50007, 12273, 14991, 274, 28081, 30804, 17636, 21388}, 5273 - Color.alpha(0), objArr);
        textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onNavigationEvent(((String) objArr[0]).intern(), String.valueOf(myAccountInfo.IAuthTabCallbackStub()));
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub2 = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr2 = new Object[1];
        a(new char[]{11546, 32265, 35621, 54335, 24905, 45665, 57205, 26767, 46489, 50879, 5085, 48378, 51686, 5408, 42559, 62268, 7242, 43363, 64112, 1939, 20651, 64928, 3839, 23532, 58613, 12288, 23843, 60972, 15180, 17531, 37191, 8843, 20385}, 21268 - TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
        textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub2.onNavigationEvent(((String) objArr2[0]).intern(), myAccountInfo.onExtraCallback());
        int i4 = IAuthTabCallback + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean onWarmupCompleted(@NotNull MyAccountInfo myAccountInfo) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(myAccountInfo, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr = new Object[1];
        a(new char[]{11546, 14725, 1085, 4299, 32633, 19445, 22173, 48435, 35321, 37987, 57589, 53134, 55862, 9972, 3399, 6640, 25738, 29487, 24520, 43591, 46843, 40340, 59415, 62643, 50007, 12273, 14991, 274, 28081, 30804, 17636, 21388}, TextUtils.getOffsetBefore("", 0) + 5273, objArr);
        String strOnExtraCallbackWithResult = textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallbackWithResult(((String) objArr[0]).intern(), "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub2 = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr2 = new Object[1];
        a(new char[]{11546, 32265, 35621, 54335, 24905, 45665, 57205, 26767, 46489, 50879, 5085, 48378, 51686, 5408, 42559, 62268, 7242, 43363, 64112, 1939, 20651, 64928, 3839, 23532, 58613, 12288, 23843, 60972, 15180, 17531, 37191, 8843, 20385}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 21269, objArr2);
        String strOnExtraCallbackWithResult2 = textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub2.onExtraCallbackWithResult(((String) objArr2[0]).intern(), "");
        if (!(!Intrinsics.areEqual(String.valueOf(myAccountInfo.IAuthTabCallbackStub()), strOnExtraCallbackWithResult))) {
            int i2 = IAuthTabCallback + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallback = myAccountInfo.onExtraCallback();
            if (i3 == 0) {
                Intrinsics.areEqual(strOnExtraCallback, strOnExtraCallbackWithResult2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (Intrinsics.areEqual(strOnExtraCallback, strOnExtraCallbackWithResult2)) {
                int i4 = onExtraCallback + 117;
                IAuthTabCallback = i4 % 128;
                return i4 % 2 == 0;
            }
        }
        return false;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(toArrayList toarraylist, Context context, String str, String str2, String str3, Function0 function0, Function0 function02, int i, Object obj) {
        Function0 function03;
        Function0 function04;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 39;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Object obj2 = null;
        if ((i & 16) != 0) {
            int i6 = i3 + 91;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 30 / 0;
            }
            function03 = null;
        } else {
            function03 = function0;
        }
        if ((i & 32) != 0) {
            int i8 = onExtraCallback + 89;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            function04 = null;
        } else {
            function04 = function02;
        }
        toarraylist.onExtraCallbackWithResult(context, str, str2, str3, function03, function04);
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
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), 25 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 19627 - (Process.myTid() >> 22), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onNavigationEvent ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Color.alpha(0) + 59, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        int i4 = $10 + 95;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 99;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 59 - View.MeasureSpec.makeMeasureSpec(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), Color.blue(0) + 59, 6383 - TextUtils.getOffsetBefore("", 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        if (function0 != null) {
            int i2 = IAuthTabCallback + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            function0.invoke();
        }
        int i4 = IAuthTabCallback + 95;
        onExtraCallback = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(Function0 function0, getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (function0 != null) {
            function0.invoke();
        }
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 39;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(getTypedExportedConstants gettypedexportedconstants, View view) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            gettypedexportedconstants.cancel();
            unit = Unit.INSTANCE;
            int i3 = 28 / 0;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            gettypedexportedconstants.cancel();
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallback + 25;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void onExtraCallbackWithResult(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable final Function0<Unit> function0, @Nullable final Function0<Unit> function02) {
        String str4;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (str2.length() > 0) {
            int i2 = IAuthTabCallback + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        onExtraCallback onextracallback = onExtraCallback.onExtraCallback;
        logAndOpenStore.IAuthTabCallback(context, (Long) null);
        final getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(context, 0, false, false, -1L, onextracallback, 14, (DefaultConstructorMarker) null);
        gettypedexportedconstants.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: viva.republica.toss.send.TransferHelper$$ExternalSyntheticLambda7
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                toArrayList.IAuthTabCallback(function02, dialogInterface);
            }
        });
        Context context2 = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setTitle(context.getString(R.string.app_transfer_confirm_title, str3));
        bottomSheetHeader.setShowCloseIcon(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        BaseTextView baseTextView = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
        Intrinsics.checkNotNull(baseTextView);
        baseTextView.setPadding(varyMatches.IAuthTabCallback(baseTextView, 24), baseTextView.getPaddingTop(), varyMatches.IAuthTabCallback(baseTextView, 24), baseTextView.getPaddingBottom());
        Context context4 = baseTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        Configuration configuration = context4.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        baseTextView.setTextColor(new getUrlokhttp(new onNavigationEvent(configuration)).ICustomTabsCallbackStubProxy());
        if (!PageExitListener.onWarmupCompleted(context)) {
            str4 = "";
        } else if (FaceDetectCallBack.onExtraCallbackWithResult.IAuthTabCallback(str, true)) {
            int i4 = IAuthTabCallback + 51;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 41 / 0;
            }
            str4 = "으로";
        } else {
            str4 = "로";
            int i6 = IAuthTabCallback + 113;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        baseTextView.setText(onIconClick.onNavigationEvent(context, R.string.transfer_contact_verification, new Object[]{str, str4, str3}));
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
        Context context5 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context5);
        String string = context.getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new Function1() { // from class: viva.republica.toss.send.TransferHelper$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return (Unit) toArrayList.onWarmupCompleted(1199173097, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -1199173093, new Object[]{function0, gettypedexportedconstants, (View) obj}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback());
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        String string2 = context.getString(R.string.close);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        tdsBottomCtaV1View.setSecondary(string2, new Function1() { // from class: viva.republica.toss.send.TransferHelper$$ExternalSyntheticLambda9
            public final Object invoke(Object obj) {
                return toArrayList.onWarmupCompleted(gettypedexportedconstants, (View) obj);
            }
        }, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DARK, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 12, (DefaultConstructorMarker) null));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
    }

    public final void onNavigationEvent(@NotNull Context context, @Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new TransferHelper$.ExternalSyntheticLambda11(context, function0));
        int i2 = onExtraCallback + 93;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallbackDefault(Function0 function0, DialogInterface dialogInterface) {
        int i = 2 % 2;
        if (function0 != null) {
            int i2 = onExtraCallback + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            function0.invoke();
            int i4 = IAuthTabCallback + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final void onTransact(Function0 function0, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 66 / 0;
            if (function0 == null) {
                return;
            }
        } else if (function0 == null) {
            return;
        }
        function0.invoke();
        int i4 = onExtraCallback + 119;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallback(Context context, Function0 function0, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(context.getString(R.string.transfer_not_member_error_title));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(context.getString(R.string.transfer_not_member_error_message));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, im.toss.uikit.R.string.uikit_confirm, (TdsButtonV1View.asInterface) null, false, new TransferHelper$.ExternalSyntheticLambda12(), 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new TransferHelper$.ExternalSyntheticLambda13(function0));
        commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new TransferHelper$.ExternalSyntheticLambda14(function0));
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final void IAuthTabCallbackStub(Function0 function0, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (function0 != null) {
            int i5 = i3 + 73;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            function0.invoke();
            int i7 = IAuthTabCallback + 35;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private static final Unit asInterface(Function0 function0, getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (function0 != null) {
            int i4 = onExtraCallback + 35;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                function0.invoke();
                throw null;
            }
            function0.invoke();
        }
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallback + 13;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        gettypedexportedconstants.cancel();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 93;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public final void onExtraCallback(@NotNull Context context, @NotNull String str, @NotNull String str2, @Nullable final Function0<Unit> function0, @Nullable final Function0<Unit> function02) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        onWarmupCompleted onwarmupcompleted = onWarmupCompleted.onNavigationEvent;
        logAndOpenStore.IAuthTabCallback(context, (Long) null);
        final getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(context, 0, false, false, -1L, onwarmupcompleted, 14, (DefaultConstructorMarker) null);
        gettypedexportedconstants.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: viva.republica.toss.send.TransferHelper$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                toArrayList.onExtraCallback(function02, dialogInterface);
            }
        });
        Context context2 = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setTitle(context.getString(R.string.app_transfer_confirm_with_phone, Cookies_flush.onNavigationEvent(str2), str));
        bottomSheetHeader.setShowCloseIcon(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        BaseTextView baseTextView = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
        Intrinsics.checkNotNull(baseTextView);
        baseTextView.setPadding(varyMatches.IAuthTabCallback(baseTextView, 24), baseTextView.getPaddingTop(), varyMatches.IAuthTabCallback(baseTextView, 24), baseTextView.getPaddingBottom());
        Context context4 = baseTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        Configuration configuration = context4.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        baseTextView.setTextColor(new getUrlokhttp(new IAuthTabCallbackStub(configuration)).ICustomTabsCallbackStubProxy());
        baseTextView.setText(context.getString(R.string.app_transfer_confirm_message));
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
        Context context5 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context5);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, im.toss.uikit.R.string.uikit_confirm, new Function1() { // from class: viva.republica.toss.send.TransferHelper$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return toArrayList.IAuthTabCallback(function0, gettypedexportedconstants, (View) obj);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        tdsBottomCtaV1View.setSecondary(R.string.close, new Function1() { // from class: viva.republica.toss.send.TransferHelper$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return toArrayList.onExtraCallback(gettypedexportedconstants, (View) obj);
            }
        }, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DARK, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 12, (DefaultConstructorMarker) null));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
        int i2 = onExtraCallback + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("button_type", "Y");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 11;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0, getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1222785L, false, (String) null, (Map) null, new TransferHelper$.ExternalSyntheticLambda0(), 14, (Object) null);
        function0.invoke();
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 95;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("button_type", "N");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 29;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onTransact(Function0 function0, getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1222785L, false, (String) null, (Map) null, new TransferHelper$.ExternalSyntheticLambda3(), 14, (Object) null);
        function0.invoke();
        gettypedexportedconstants.dismiss();
        SubsamplingScaleImageViewTileLoadTask.onNavigationEvent.onWarmupCompleted("입금할 계좌를 다시 확인해주세요", (126 & 2) != 0 ? getEnabledAmazonAdUnitIds.Companion.onNavigationEvent() : getEnabledAmazonAdUnitIds.Companion.onExtraCallback(), (126 & 4) != 0 ? null : null, (126 & 8) != 0 ? 0 : 0, (126 & 16) != 0 ? null : null, (126 & 32) != 0 ? null : null, (126 & 64) == 0 ? null : null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1222783L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult.onExtraCallback;
        logAndOpenStore.IAuthTabCallback(context, (Long) null);
        getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(context, 0, false, false, -1L, onextracallbackwithresult, 14, (DefaultConstructorMarker) null);
        gettypedexportedconstants.setCancelable(false);
        Context context2 = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setTitle(context.getString(R.string.app_transfer_confirm_receiver_title, str));
        bottomSheetHeader.setShowCloseIcon(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        BaseTextView baseTextView = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
        Intrinsics.checkNotNull(baseTextView);
        baseTextView.setPadding(varyMatches.IAuthTabCallback(baseTextView, 24), baseTextView.getPaddingTop(), varyMatches.IAuthTabCallback(baseTextView, 24), baseTextView.getPaddingBottom());
        Context context4 = baseTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        Configuration configuration = context4.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        baseTextView.setTextColor(new getUrlokhttp(new IAuthTabCallback(configuration)).ICustomTabsCallbackStubProxy());
        baseTextView.setText(internal_registerInteropModule.onWarmupCompleted(str2, str3, (String) null, 4, (Object) null));
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
        Context context5 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context5);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, R.string.app_transfer_yes, new TransferHelper$.ExternalSyntheticLambda1(function0, gettypedexportedconstants), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        tdsBottomCtaV1View.setSecondary(R.string.app_transfer_no, new TransferHelper$.ExternalSyntheticLambda2(function02, gettypedexportedconstants), new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DARK, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 12, (DefaultConstructorMarker) null));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
        int i2 = onExtraCallback + 51;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 29 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        String string;
        TossApiCallException.ApiError apiError = (Throwable) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(apiError, "");
        Object obj = null;
        if (apiError instanceof TossApiCallException.ApiError) {
            TossApiCallException.ApiError apiError2 = apiError;
            if (Intrinsics.areEqual(apiError2.asBinder(), "TE00006")) {
                Map mapAsInterface = apiError2.asInterface();
                Object[] objArr2 = new Object[1];
                a(new char[]{11549, 29212, 37668, 12344, 20807, 63070}, Color.alpha(0) + 24337, objArr2);
                Object obj2 = mapAsInterface.get(((String) objArr2[0]).intern());
                if (obj2 != null) {
                    int i2 = onExtraCallback + 25;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    string = obj2.toString();
                    int i4 = IAuthTabCallback + 7;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    string = null;
                }
                if (string != null) {
                    int i6 = IAuthTabCallback + 65;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (string.length() != 0) {
                        int i8 = IAuthTabCallback + 61;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            return string;
                        }
                        obj.hashCode();
                        throw null;
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ Unit onExtraCallback(ApiServerError apiServerError, Context context, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        return (Unit) onWarmupCompleted(1411290548, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -1411290543, new Object[]{apiServerError, context, commonModule_setLeftEdgeTouchEnabled}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, getTypedExportedConstants gettypedexportedconstants, View view) {
        return (Unit) onWarmupCompleted(1199173097, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -1199173093, new Object[]{function0, gettypedexportedconstants, view}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    private static final void onNavigationEvent(Function0 function0, DialogInterface dialogInterface) {
        onWarmupCompleted(-1464686638, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), 1464686639, new Object[]{function0, dialogInterface}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    private static final Unit IAuthTabCallback(getTypedExportedConstants gettypedexportedconstants, View view) {
        return (Unit) onWarmupCompleted(1061287956, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -1061287956, new Object[]{gettypedexportedconstants, view}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    public final String onExtraCallback(@NotNull String str) {
        return (String) onWarmupCompleted(-1115908289, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), 1115908296, new Object[]{this, str}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    public final String onNavigationEvent(@NotNull Throwable th) {
        return (String) onWarmupCompleted(1160439371, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -1160439368, new Object[]{this, th}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback());
    }

    static void onExtraCallback() {
        onNavigationEvent = -2689796084381669287L;
    }
}
