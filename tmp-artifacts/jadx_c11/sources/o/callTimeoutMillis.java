package o;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.sharebottomsheet.R;
import im.toss.tds.sharebottomsheet.ShareBottomSheet$;
import im.toss.tds.sharebottomsheet.ShareBottomSheet$Companion$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.KeylinesKtExternalSyntheticLambda1;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SetDetectableSize;
import o.callTimeoutMillis;
import o.deprecated_readTimeoutMillis;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class callTimeoutMillis extends BrickModuleImplExternalSyntheticLambda2 {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int ICustomTabsCallback = 0;
    private static int readTypedObject = 1;
    private static int writeTypedObject = 1;
    private final Uri IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private final String IAuthTabCallback_Parcel;
    private final certificateChainCleaner access000;
    private final List<deprecated_readTimeoutMillis> access100;
    private final String asBinder;
    private final Function1<Throwable, Unit> asInterface;
    private final Function1<String, Unit> getInterfaceDescriptor;
    private final Lazy onExtraCallbackWithResult;
    private final String onTransact;
    private final int onWarmupCompleted;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int onNavigationEvent = 8;

    static {
        int i = writeTypedObject + 19;
        ICustomTabsCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ callTimeoutMillis(Context context, String str, String str2, Uri uri, List list, certificateChainCleaner certificatechaincleaner, String str3, Function1 function1, Function1 function12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, uri, list, certificatechaincleaner, str3, function1, function12);
    }

    public static /* synthetic */ Intent IAuthTabCallback(callTimeoutMillis calltimeoutmillis, Intent intent) {
        int i = 2 % 2;
        int i2 = readTypedObject + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(calltimeoutmillis, intent);
        }
        onExtraCallback(calltimeoutmillis, intent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(callTimeoutMillis calltimeoutmillis, RowScope rowScope, deprecated_readTimeoutMillis deprecated_readtimeoutmillis, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = readTypedObject + 75;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        Unit unit = (Unit) onNavigationEvent(-1975335877, new Object[]{calltimeoutmillis, rowScope, deprecated_readtimeoutmillis, function0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1975335879);
        int i6 = readTypedObject + 125;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ void IAuthTabCallback(callTimeoutMillis calltimeoutmillis, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(calltimeoutmillis, dialogInterface);
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
    }

    public static /* synthetic */ CharSequence onExtraCallback(deprecated_readTimeoutMillis deprecated_readtimeoutmillis) {
        int i = 2 % 2;
        int i2 = readTypedObject + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return (CharSequence) onNavigationEvent(323024213, new Object[]{deprecated_readtimeoutmillis}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -323024210);
        }
        int i3 = 19 / 0;
        return (CharSequence) onNavigationEvent(323024213, new Object[]{deprecated_readtimeoutmillis}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -323024210);
    }

    public static /* synthetic */ Unit onExtraCallback(callTimeoutMillis calltimeoutmillis, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(calltimeoutmillis, setDetectableSize);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(calltimeoutmillis, setDetectableSize);
        int i3 = IAuthTabCallbackStubProxy + 81;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 4 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(callTimeoutMillis calltimeoutmillis, deprecated_readTimeoutMillis deprecated_readtimeoutmillis) {
        int i = 2 % 2;
        int i2 = readTypedObject + 117;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(calltimeoutmillis, deprecated_readtimeoutmillis);
        int i4 = IAuthTabCallbackStubProxy + 85;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(callTimeoutMillis calltimeoutmillis, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(calltimeoutmillis, setDetectableSize);
        int i4 = IAuthTabCallbackStubProxy + 111;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return unitOnNavigationEvent;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [android.app.Dialog, o.BrickModuleImplExternalSyntheticLambda2, o.callTimeoutMillis] */
    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws NoWhenBranchMatchedException {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = i6 | i7 | i8;
        int i10 = ~(i3 | i7);
        int i11 = (~(i7 | i8)) | (~i6);
        int i12 = i6 + i + i2 + ((-1537480081) * i4) + ((-1176924877) * i5);
        int i13 = i12 * i12;
        int i14 = (i6 * 1018573086) + 1206756779 + (i * 1018572224) + (i9 * (-431)) + (i10 * 431) + (i11 * 431) + (1018572655 * i2) + ((-758184159) * i4) + ((-595421667) * i5) + (i13 * (-1647378432));
        switch ((((-324914750) * i6) - 1179058176) + ((-1443770816) * i) + (1588055615 * i9) + (i10 * (-1588055615)) + ((-1588055615) * i11) + (1263140864 * i2) + (1226178560 * i4) + ((-1044512768) * i5) + (1201733632 * i13) + (i14 * i14 * 1518272512)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                callTimeoutMillis calltimeoutmillis = (callTimeoutMillis) objArr[0];
                RowScope rowScope = (RowScope) objArr[1];
                deprecated_readTimeoutMillis deprecated_readtimeoutmillis = (deprecated_readTimeoutMillis) objArr[2];
                Function0<Unit> function0 = (Function0) objArr[3];
                int iIntValue = ((Number) objArr[4]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
                ((Number) objArr[6]).intValue();
                int i15 = 2 % 2;
                int i16 = IAuthTabCallbackStubProxy + 1;
                readTypedObject = i16 % 128;
                int i17 = i16 % 2;
                calltimeoutmillis.onExtraCallbackWithResult(rowScope, deprecated_readtimeoutmillis, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue));
                return Unit.INSTANCE;
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                callTimeoutMillis calltimeoutmillis2 = (callTimeoutMillis) objArr[0];
                int i18 = 2 % 2;
                int i19 = readTypedObject + 109;
                IAuthTabCallbackStubProxy = i19 % 128;
                int i20 = i19 % 2;
                String str = (String) calltimeoutmillis2.onExtraCallbackWithResult.getValue();
                int i21 = readTypedObject + 107;
                IAuthTabCallbackStubProxy = i21 % 128;
                int i22 = i21 % 2;
                return str;
            default:
                final ?? r0 = (callTimeoutMillis) objArr[0];
                final deprecated_readTimeoutMillis deprecated_readtimeoutmillis2 = (deprecated_readTimeoutMillis) objArr[1];
                int i23 = 2 % 2;
                onNavigationEvent.onExtraCallbackWithResult(Companion, deprecated_readtimeoutmillis2.getId(), r0.readTypedObject(), ((callTimeoutMillis) r0).access000, null, 8, null);
                Function0<Unit> function02 = new Function0() { // from class: im.toss.tds.sharebottomsheet.ShareBottomSheet$$ExternalSyntheticLambda5
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        int i24 = 2 % 2;
                        int i25 = onNavigationEvent + 87;
                        onExtraCallbackWithResult = i25 % 128;
                        int i26 = i25 % 2;
                        Unit unitOnExtraCallback = callTimeoutMillis.onExtraCallback(this.f$0, deprecated_readtimeoutmillis2);
                        int i27 = onNavigationEvent + 79;
                        onExtraCallbackWithResult = i27 % 128;
                        if (i27 % 2 == 0) {
                            return unitOnExtraCallback;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                };
                if (deprecated_readtimeoutmillis2 == deprecated_networkInterceptors.MORE) {
                    ConvertByteArrayToFloatArray.onExtraCallback(1235583L, false, (String) null, (Map) null, new Function1() { // from class: im.toss.tds.sharebottomsheet.ShareBottomSheet$$ExternalSyntheticLambda6
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj) {
                            int i24 = 2 % 2;
                            int i25 = onWarmupCompleted + 101;
                            onNavigationEvent = i25 % 128;
                            int i26 = i25 % 2;
                            Unit unitOnExtraCallback = callTimeoutMillis.onExtraCallback(this.f$0, (SetDetectableSize) obj);
                            int i27 = onWarmupCompleted + 57;
                            onNavigationEvent = i27 % 128;
                            if (i27 % 2 != 0) {
                                return unitOnExtraCallback;
                            }
                            throw null;
                        }
                    }, 14, (Object) null);
                    Context context = r0.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    deprecated_readtimeoutmillis2.share(context, ((callTimeoutMillis) r0).asBinder, ((callTimeoutMillis) r0).IAuthTabCallback, function02, ((callTimeoutMillis) r0).asInterface, ((callTimeoutMillis) r0).IAuthTabCallback_Parcel, new Function1() { // from class: im.toss.tds.sharebottomsheet.ShareBottomSheet$$ExternalSyntheticLambda7
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult;

                        public final Object invoke(Object obj) {
                            int i24 = 2 % 2;
                            int i25 = onExtraCallback + 45;
                            onExtraCallbackWithResult = i25 % 128;
                            int i26 = i25 % 2;
                            Intent intentIAuthTabCallback = callTimeoutMillis.IAuthTabCallback(this.f$0, (Intent) obj);
                            int i27 = onExtraCallback + 99;
                            onExtraCallbackWithResult = i27 % 128;
                            int i28 = i27 % 2;
                            return intentIAuthTabCallback;
                        }
                    });
                } else {
                    Context context2 = r0.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    deprecated_readTimeoutMillis.onExtraCallbackWithResult(deprecated_readtimeoutmillis2, context2, ((callTimeoutMillis) r0).asBinder, ((callTimeoutMillis) r0).IAuthTabCallback, function02, ((callTimeoutMillis) r0).asInterface, ((callTimeoutMillis) r0).IAuthTabCallback_Parcel, null, 64, null);
                }
                r0.dismiss();
                int i24 = readTypedObject + 121;
                IAuthTabCallbackStubProxy = i24 % 128;
                int i25 = i24 % 2;
                return null;
        }
    }

    public static /* synthetic */ String onNavigationEvent(callTimeoutMillis calltimeoutmillis) {
        int i = 2 % 2;
        int i2 = readTypedObject + 9;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackDefault = IAuthTabCallbackDefault(calltimeoutmillis);
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 103;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return strIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(callTimeoutMillis calltimeoutmillis, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 77;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(calltimeoutmillis, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackStubProxy + 1;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws NoWhenBranchMatchedException {
        callTimeoutMillis calltimeoutmillis = (callTimeoutMillis) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = readTypedObject + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(calltimeoutmillis, iIntValue);
        int i4 = readTypedObject + 7;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ String onWarmupCompleted(callTimeoutMillis calltimeoutmillis) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String strAsInterface = asInterface(calltimeoutmillis);
        int i4 = readTypedObject + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return strAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 57;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) onNavigationEvent(-1867236602, new Object[]{th}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1867236606);
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(callTimeoutMillis calltimeoutmillis, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 57;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(calltimeoutmillis, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackStubProxy + 77;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private callTimeoutMillis(Context context, String str, String str2, Uri uri, List<? extends deprecated_readTimeoutMillis> list, certificateChainCleaner certificatechaincleaner, String str3, Function1<? super String, Unit> function1, Function1<? super Throwable, Unit> function12) {
        super(context);
        this.IAuthTabCallback_Parcel = str;
        this.asBinder = str2;
        this.IAuthTabCallback = uri;
        this.access100 = list;
        this.access000 = certificatechaincleaner;
        this.onTransact = str3;
        this.getInterfaceDescriptor = function1;
        this.asInterface = function12;
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.sharebottomsheet.ShareBottomSheet$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 97;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    callTimeoutMillis.onNavigationEvent(this.f$0);
                    throw null;
                }
                String strOnNavigationEvent = callTimeoutMillis.onNavigationEvent(this.f$0);
                int i3 = onWarmupCompleted + 47;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return strOnNavigationEvent;
            }
        });
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.sharebottomsheet.ShareBottomSheet$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() throws Throwable {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 11;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                String strOnWarmupCompleted = callTimeoutMillis.onWarmupCompleted(this.f$0);
                int i4 = onNavigationEvent + 123;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return strOnWarmupCompleted;
            }
        });
        this.onWarmupCompleted = onExtraCallbackWithResult();
    }

    public static final /* synthetic */ String IAuthTabCallback(callTimeoutMillis calltimeoutmillis) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) onNavigationEvent(679775403, new Object[]{calltimeoutmillis}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -679775397);
        int i4 = readTypedObject + 111;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ certificateChainCleaner onExtraCallback(callTimeoutMillis calltimeoutmillis) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        certificateChainCleaner certificatechaincleaner = calltimeoutmillis.access000;
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
        return certificatechaincleaner;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        callTimeoutMillis calltimeoutmillis = (callTimeoutMillis) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return calltimeoutmillis.readTypedObject();
        }
        calltimeoutmillis.readTypedObject();
        throw null;
    }

    private static final Unit onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 61;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 87;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        deprecated_readTimeoutMillis deprecated_readtimeoutmillis = (deprecated_readTimeoutMillis) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 115;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(deprecated_readtimeoutmillis, "");
            return deprecated_readtimeoutmillis.getId();
        }
        Intrinsics.checkNotNullParameter(deprecated_readtimeoutmillis, "");
        deprecated_readtimeoutmillis.getId();
        throw null;
    }

    private static final String IAuthTabCallbackDefault(callTimeoutMillis calltimeoutmillis) {
        int i = 2 % 2;
        String strJoinToString$default = CollectionsKt.joinToString$default(calltimeoutmillis.access100, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.tds.sharebottomsheet.ShareBottomSheet$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 23;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                CharSequence charSequenceOnExtraCallback = callTimeoutMillis.onExtraCallback((deprecated_readTimeoutMillis) obj);
                if (i4 != 0) {
                    int i5 = 72 / 0;
                }
                int i6 = IAuthTabCallback + 63;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return charSequenceOnExtraCallback;
            }
        }, 30, (Object) null);
        int i2 = readTypedObject + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return strJoinToString$default;
    }

    private static final String asInterface(callTimeoutMillis calltimeoutmillis) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent onnavigationevent = Companion;
        if (i3 != 0) {
            return onNavigationEvent.onExtraCallbackWithResult(onnavigationevent, calltimeoutmillis.asBinder, calltimeoutmillis.IAuthTabCallback);
        }
        onNavigationEvent.onExtraCallbackWithResult(onnavigationevent, calltimeoutmillis.asBinder, calltimeoutmillis.IAuthTabCallback);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String readTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.IAuthTabCallbackDefault.getValue();
        int i4 = readTypedObject + 83;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(callTimeoutMillis calltimeoutmillis, DialogInterface dialogInterface) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1235587L, false, (String) null, (Map) null, new ShareBottomSheet$.ExternalSyntheticLambda9(calltimeoutmillis), 14, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 67;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onNavigationEvent(callTimeoutMillis calltimeoutmillis, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 61;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("close_type", "dim");
        setDetectableSize.onExtraCallback("share_item", calltimeoutmillis.readTypedObject());
        setDetectableSize.onExtraCallback("modal_type", "toss");
        setDetectableSize.onExtraCallback(C0080connectionPool.onExtraCallbackWithResult(calltimeoutmillis.access000));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 43;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(callTimeoutMillis calltimeoutmillis, SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(calltimeoutmillis, setDetectableSize);
            int i4 = onWarmupCompleted + 81;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return unitIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = callTimeoutMillis.this.new IAuthTabCallback(access13800Var);
            int i2 = onWarmupCompleted + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return iAuthTabCallbackCreate.invokeSuspend(unit);
            }
            iAuthTabCallbackCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
        
            return r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r10.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r10.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r11);
            o.ConvertByteArrayToFloatArray.onExtraCallback(1235583, false, (java.lang.String) null, (java.util.Map) null, new im.toss.tds.sharebottomsheet.ShareBottomSheet$onCreate$2$1$1$.ExternalSyntheticLambda0(r10.this$0), 14, (java.lang.Object) null);
            r11 = kotlin.Unit.INSTANCE;
            r1 = o.callTimeoutMillis.IAuthTabCallback.onWarmupCompleted + 73;
            o.callTimeoutMillis.IAuthTabCallback.onNavigationEvent = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 79 / 0;
            }
        }

        private static final Unit IAuthTabCallback(callTimeoutMillis calltimeoutmillis, SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            setDetectableSize.onExtraCallback("service_list", callTimeoutMillis.IAuthTabCallback(calltimeoutmillis));
            setDetectableSize.onExtraCallback("share_item", (String) callTimeoutMillis.onNavigationEvent(-659138554, new Object[]{calltimeoutmillis}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 659138555));
            setDetectableSize.onExtraCallback("modal_type", "toss");
            setDetectableSize.onExtraCallback(C0080connectionPool.onExtraCallbackWithResult(callTimeoutMillis.onExtraCallback(calltimeoutmillis)));
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 85;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
        setOnCancelListener(new ShareBottomSheet$.ExternalSyntheticLambda12(this));
        onNavigationEvent(ForwardingCameraControl.onExtraCallbackWithResult(-992559016, true, new ShareBottomSheet$.ExternalSyntheticLambda13(this)));
        int i2 = readTypedObject + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onWarmupCompleted(callTimeoutMillis calltimeoutmillis, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 59;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent(-570501221, new Object[]{calltimeoutmillis, calltimeoutmillis.access100.get(i)}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 570501221);
        calltimeoutmillis.dismiss();
        Unit unit = Unit.INSTANCE;
        int i5 = readTypedObject + 53;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(callTimeoutMillis calltimeoutmillis, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStubProxy;
        int i6 = i5 + 45;
        readTypedObject = i6 % 128;
        int i7 = i6 % 2;
        if ((i & 3) != 2) {
            int i8 = i5 + 27;
            readTypedObject = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(853110704, i, -1, "im.toss.tds.sharebottomsheet.ShareBottomSheet.onCreate.<anonymous>.<anonymous> (ShareBottomSheet.kt:88)");
            }
            FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f));
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback, QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 6);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i10 = readTypedObject + 105;
                IAuthTabCallbackStubProxy = i10 % 128;
                int i11 = i10 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-138586056);
            int iCeil = (int) Math.ceil(calltimeoutmillis.access100.size() / calltimeoutmillis.onWarmupCompleted);
            for (int i12 = 0; i12 < iCeil; i12++) {
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), QuirkSettingsLoader.Companion.access000(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    int i13 = readTypedObject + 125;
                    IAuthTabCallbackStubProxy = i13 % 128;
                    if (i13 % 2 != 0) {
                        getAwbState.onExtraCallback();
                        throw null;
                    }
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-218990794);
                int i14 = calltimeoutmillis.onWarmupCompleted;
                int i15 = 0;
                while (i15 < i14) {
                    int i16 = (calltimeoutmillis.onWarmupCompleted * i12) + i15;
                    if (i16 < calltimeoutmillis.access100.size()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(214017974);
                        deprecated_readTimeoutMillis deprecated_readtimeoutmillis = calltimeoutmillis.access100.get(i16);
                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(calltimeoutmillis);
                        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i16);
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnExtraCallback | zOnExtraCallback2)) {
                            Object obj = objOnMinimized;
                            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                Object externalSyntheticLambda0 = new ShareBottomSheet$.ExternalSyntheticLambda0(calltimeoutmillis, i16);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda0);
                                obj = externalSyntheticLambda0;
                            }
                            calltimeoutmillis.onExtraCallbackWithResult(rowScopeInstance, deprecated_readtimeoutmillis, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, 6);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            i2 = i15;
                            i3 = i14;
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(214409814);
                        i2 = i15;
                        i3 = i14;
                        ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(RowScope.onNavigationEvent(rowScopeInstance, QuirksExternalSyntheticBackport0.Companion, 1.0f, false, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, 0);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    i15 = i2 + 1;
                    i14 = i3;
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(callTimeoutMillis calltimeoutmillis, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 91;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i5 = readTypedObject + 73;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-992559016, i, -1, "im.toss.tds.sharebottomsheet.ShareBottomSheet.onCreate.<anonymous> (ShareBottomSheet.kt:78)");
            }
            Unit unit = Unit.INSTANCE;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(calltimeoutmillis);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!zOnExtraCallback) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = calltimeoutmillis.new IAuthTabCallback(null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i7 = readTypedObject + 115;
                IAuthTabCallbackStubProxy = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 4 / 3;
                }
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 6);
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(853110704, true, new ShareBottomSheet$.ExternalSyntheticLambda8(calltimeoutmillis), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i9 = readTypedObject + 43;
                IAuthTabCallbackStubProxy = i9 % 128;
                int i10 = i9 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(callTimeoutMillis calltimeoutmillis, deprecated_readTimeoutMillis deprecated_readtimeoutmillis) {
        int i = 2 % 2;
        int i2 = readTypedObject + 25;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        calltimeoutmillis.getInterfaceDescriptor.invoke(deprecated_readtimeoutmillis.getId());
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 31;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(callTimeoutMillis calltimeoutmillis, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("share_item", calltimeoutmillis.readTypedObject());
        setDetectableSize.onExtraCallback("modal_type", "os");
        setDetectableSize.onExtraCallback(C0080connectionPool.onExtraCallbackWithResult(calltimeoutmillis.access000));
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 47;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Intent onExtraCallback(callTimeoutMillis calltimeoutmillis, Intent intent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 57;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        onNavigationEvent onnavigationevent = Companion;
        Context context = calltimeoutmillis.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Intent intentOnExtraCallback = onnavigationevent.onExtraCallback(context, intent, calltimeoutmillis.onTransact, calltimeoutmillis.readTypedObject(), calltimeoutmillis.access000, "os");
        int i4 = IAuthTabCallbackStubProxy + 25;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return intentOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(final RowScope rowScope, final deprecated_readTimeoutMillis deprecated_readtimeoutmillis, final Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-573004018);
        if ((i & 6) == 0) {
            i2 = (!(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rowScope) ^ true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deprecated_readtimeoutmillis) : cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(deprecated_readtimeoutmillis) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i5 = IAuthTabCallbackStubProxy + 39;
            readTypedObject = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 9 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 256 : 128;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            int i7 = readTypedObject + 19;
            IAuthTabCallbackStubProxy = i7 % 128;
            z = i7 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            int i8 = readTypedObject + 23;
            IAuthTabCallbackStubProxy = i8 % 128;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = readTypedObject + 37;
                IAuthTabCallbackStubProxy = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-573004018, i2, -1, "im.toss.tds.sharebottomsheet.ShareBottomSheet.Item (ShareBottomSheet.kt:169)");
            }
            QuirkSettingsLoader.onNavigationEvent onnavigationeventOnTransact = QuirkSettingsLoader.Companion.onTransact();
            FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(RowScope.onNavigationEvent(rowScope, measureChildConstrained.onExtraCallback(onextracallback, false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, function0, 15, (Object) null), 1.0f, false, 2, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 1, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback, onnavigationeventOnTransact, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1586295155);
            AppLovinNativeAdImplc.onExtraCallbackWithResult(deprecated_readtimeoutmillis.getIconUrl(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(48.0f)), 0L, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit>) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 508);
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(deprecated_readtimeoutmillis.getLabel(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), null, AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), 0L, 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0, 130810}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = readTypedObject + 37;
                IAuthTabCallbackStubProxy = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.sharebottomsheet.ShareBottomSheet$$ExternalSyntheticLambda11
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2) {
                    Unit unitIAuthTabCallback;
                    int i13 = 2 % 2;
                    int i14 = onExtraCallback + 79;
                    onExtraCallbackWithResult = i14 % 128;
                    if (i14 % 2 == 0) {
                        unitIAuthTabCallback = callTimeoutMillis.IAuthTabCallback(this.f$0, rowScope, deprecated_readtimeoutmillis, function0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i15 = 33 / 0;
                    } else {
                        unitIAuthTabCallback = callTimeoutMillis.IAuthTabCallback(this.f$0, rowScope, deprecated_readtimeoutmillis, function0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    int i16 = onExtraCallbackWithResult + 115;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    return unitIAuthTabCallback;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int onExtraCallbackWithResult() {
        int iIAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 43;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        M_ m_ = M_.onExtraCallback;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iIntValue = ((Integer) M_.onNavigationEvent(-2118175014, new Object[]{m_, context}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 2118175019, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue();
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        float fFloatValue = ((Float) varyMatches.onNavigationEvent(1845166571, -1845166568, new Object[]{Integer.valueOf(iIntValue), displayMetrics}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback())).floatValue();
        Iterator<Integer> it = deprecated_readTimeoutMillis.Companion.onNavigationEvent().iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            if (fFloatValue < it.next().intValue()) {
                break;
            }
            i4++;
        }
        Integer numValueOf = Integer.valueOf(i4);
        if (numValueOf.intValue() < 0) {
            int i5 = IAuthTabCallbackStubProxy + 63;
            readTypedObject = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIAuthTabCallback = numValueOf.intValue();
        } else {
            iIAuthTabCallback = deprecated_readTimeoutMillis.Companion.IAuthTabCallback() - 1;
        }
        return iIAuthTabCallback + 2;
    }

    public static final class onExtraCallbackWithResult extends BroadcastReceiver {
        public static final IAuthTabCallback Companion;
        private static int IAuthTabCallback;
        private static int IAuthTabCallbackDefault;
        private static short[] asBinder;
        private static byte[] onExtraCallback;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        public static final int onWarmupCompleted;
        private static final byte[] $$a = {52, -58, -85, 74};
        private static final int $$b = 157;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onTransact = 0;
        private static int asInterface = 1;
        private static int IAuthTabCallbackStub = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, short s2, int i) {
            int i2;
            int i3;
            int i4 = s + 4;
            int i5 = (i * 3) + 115;
            byte[] bArr = $$a;
            int i6 = s2 * 2;
            byte[] bArr2 = new byte[i6 + 1];
            if (bArr == null) {
                int i7 = i4;
                int i8 = 0;
                i4 += -i5;
                i3 = i7;
                i2 = i8;
                bArr2[i2] = (byte) i4;
                if (i2 == i6) {
                    return new String(bArr2, 0);
                }
                int i9 = i2 + 1;
                int i10 = i3 + 1;
                i7 = i10;
                i5 = bArr[i10];
                i8 = i9;
                i4 += -i5;
                i3 = i7;
                i2 = i8;
                bArr2[i2] = (byte) i4;
                if (i2 == i6) {
                }
            } else {
                i2 = 0;
                i3 = i4;
                i4 = i5;
                bArr2[i2] = (byte) i4;
                if (i2 == i6) {
                }
            }
        }

        static {
            IAuthTabCallbackDefault = 0;
            IAuthTabCallback();
            Companion = new IAuthTabCallback(null);
            onWarmupCompleted = 8;
            int i = IAuthTabCallbackStub + 69;
            IAuthTabCallbackDefault = i % 128;
            int i2 = i % 2;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) throws Throwable {
            String packageName;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(intent, "");
            ComponentName componentName = (ComponentName) EncoderImplExternalSyntheticLambda3.onWarmupCompleted(intent, "android.intent.extra.CHOSEN_COMPONENT", ComponentName.class);
            onNavigationEvent onnavigationevent = callTimeoutMillis.Companion;
            if (componentName != null && (packageName = componentName.getPackageName()) != null) {
                String stringExtra = intent.getStringExtra("share_item");
                Object[] objArr = new Object[1];
                a((short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) KeyEvent.normalizeMetaState(0), (-1155971107) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-539624185) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) - 35, objArr);
                certificateChainCleaner certificatechaincleaner = new certificateChainCleaner(intent.getStringExtra(((String) objArr[0]).intern()), intent.getStringExtra("service_referrer"), intent.getStringExtra("referrer_button"));
                String stringExtra2 = intent.getStringExtra("modal_type");
                if (stringExtra2 == null) {
                    int i2 = onTransact + 33;
                    asInterface = i2 % 128;
                    int i3 = i2 % 2;
                    stringExtra2 = "toss";
                }
                onNavigationEvent.onNavigationEvent(onnavigationevent, packageName, stringExtra, certificatechaincleaner, stringExtra2);
            }
            int i4 = asInterface + 5;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }

        public static final class IAuthTabCallback {
            private static int $10 = 0;
            private static int $11 = 1;
            private static char[] IAuthTabCallback = {64961, 64960, 64982, 64981};
            private static char onExtraCallbackWithResult = 51243;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private IAuthTabCallback() {
            }

            public final IntentSender IAuthTabCallback(@NotNull Context context, @Nullable String str, @NotNull certificateChainCleaner certificatechaincleaner, @NotNull String str2) throws Throwable {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(certificatechaincleaner, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intent intentPutExtra = new Intent(context, (Class<?>) onExtraCallbackWithResult.class).setAction("im.toss.tds.sharebottomsheet.ACTION_SHARE").putExtra("share_item", str);
                Object[] objArr = new Object[1];
                a(new char[]{2, 0, 2, 3, 13833, 13833, 0, 2}, (byte) (33 - TextUtils.getTrimmedLength("")), 8 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
                Intent intentPutExtra2 = intentPutExtra.putExtra(((String) objArr[0]).intern(), certificatechaincleaner.onWarmupCompleted()).putExtra("service_referrer", certificatechaincleaner.IAuthTabCallback()).putExtra("referrer_button", certificatechaincleaner.onExtraCallback()).putExtra("modal_type", str2);
                Intrinsics.checkNotNullExpressionValue(intentPutExtra2, "");
                IntentSender intentSender = PendingIntent.getBroadcast(context, 7860, intentPutExtra2, 167772160).getIntentSender();
                Intrinsics.checkNotNullExpressionValue(intentSender, "");
                int i2 = onNavigationEvent + 39;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return intentSender;
                }
                throw null;
            }

            private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
                int i2;
                Object obj;
                int length;
                char[] cArr2;
                int i3;
                int i4 = 2 % 2;
                DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
                char[] cArr3 = IAuthTabCallback;
                Object obj2 = null;
                int i5 = 6;
                if (cArr3 != null) {
                    int i6 = $10 + 45;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        length = cArr3.length;
                        cArr2 = new char[length];
                        i3 = 1;
                    } else {
                        length = cArr3.length;
                        cArr2 = new char[length];
                        i3 = 0;
                    }
                    while (i3 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 26 - (ViewConfiguration.getPressedStateDuration() >> 16), ((Process.getThreadPriority(0) + 20) >> i5) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                            }
                            cArr2[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            i3++;
                            i5 = 6;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr3 = cArr2;
                }
                try {
                    Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 26 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 23139 - TextUtils.indexOf("", "", 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    char[] cArr4 = new char[i];
                    if (i % 2 != 0) {
                        i2 = i - 1;
                        cArr4[i2] = (char) (cArr[i2] - b);
                        int i7 = $10 + 61;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                    } else {
                        i2 = i;
                    }
                    if (i2 > 1) {
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                        while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                            defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                                int i9 = $10 + 41;
                                $11 = i9 % 128;
                                if (i9 % 2 == 0) {
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback + b);
                                } else {
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                                }
                                obj = obj2;
                            } else {
                                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                                if (objOnExtraCallback3 == null) {
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 24825), Color.rgb(0, 0, 0) + 16777290, KeyEvent.normalizeMetaState(0) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                    try {
                                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                        if (objOnExtraCallback4 == null) {
                                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 30 - TextUtils.getOffsetAfter("", 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 19489, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                        }
                                        obj = null;
                                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                        int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i10];
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 == null) {
                                            throw th2;
                                        }
                                        throw cause2;
                                    }
                                } else {
                                    obj = null;
                                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i11];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i12];
                                    } else {
                                        int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i13];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i14];
                                    }
                                }
                            }
                            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                            int i15 = $10 + 47;
                            $11 = i15 % 128;
                            int i16 = i15 % 2;
                            obj2 = obj;
                        }
                    }
                    for (int i17 = 0; i17 < i; i17++) {
                        cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                    }
                    objArr[0] = new String(cArr4);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            long j;
            int i4;
            boolean z;
            int length;
            byte[] bArr;
            int i5;
            int i6 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                char c = '0';
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43423), 41 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getJumpTapTimeout() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                int i7 = -1;
                boolean z2 = iIntValue == -1;
                if (z2) {
                    byte[] bArr2 = onExtraCallback;
                    if (bArr2 != null) {
                        int length2 = bArr2.length;
                        byte[] bArr3 = new byte[length2];
                        int i8 = $11 + 13;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                        int i10 = 0;
                        while (i10 < length2) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i10])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char cAlpha = (char) (Color.alpha(0) + 12843);
                                int iLastIndexOf = TextUtils.lastIndexOf("", c) + 56;
                                int iIndexOf = TextUtils.indexOf("", c, 0) + 2168;
                                byte b2 = (byte) i7;
                                byte b3 = (byte) (b2 + 1);
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cAlpha, iLastIndexOf, iIndexOf, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr3[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i10++;
                            i7 = -1;
                            c = '0';
                        }
                        bArr2 = bArr3;
                    }
                    if (bArr2 != null) {
                        byte[] bArr4 = onExtraCallback;
                        try {
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), TextUtils.lastIndexOf("", '0', 0, 0) + 43, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22438, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                            j = -4629411779493505016L;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (asBinder[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    }
                } else {
                    j = -4629411779493505016L;
                }
                if (iIntValue > 0) {
                    int i11 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j));
                    if (z2) {
                        i4 = 1;
                    } else {
                        int i12 = $10 + 67;
                        $11 = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i13 = 3 % 4;
                        }
                        i4 = 0;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i11 + i4;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 86, TextUtils.lastIndexOf("", '0', 0, 0) + 9568, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr5 = onExtraCallback;
                    if (bArr5 != null) {
                        int i14 = $11 + 87;
                        $10 = i14 % 128;
                        if (i14 % 2 != 0) {
                            length = bArr5.length;
                            bArr = new byte[length];
                            i5 = 1;
                        } else {
                            length = bArr5.length;
                            bArr = new byte[length];
                            i5 = 0;
                        }
                        while (i5 < length) {
                            int i15 = $11 + 121;
                            $10 = i15 % 128;
                            if (i15 % 2 != 0) {
                                bArr[i5] = (byte) (bArr5[i5] & (-4629411779493505016L));
                            } else {
                                bArr[i5] = (byte) (bArr5[i5] ^ (-4629411779493505016L));
                                i5++;
                            }
                        }
                        bArr5 = bArr;
                    }
                    if (bArr5 != null) {
                        int i16 = $11 + 87;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (!z) {
                            short[] sArr = asBinder;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                            int i18 = $10 + 23;
                            $11 = i18 % 128;
                            int i19 = i18 % 2;
                        } else {
                            int i20 = $10 + 57;
                            $11 = i20 % 128;
                            int i21 = i20 % 2;
                            byte[] bArr6 = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        static void IAuthTabCallback() {
            IAuthTabCallback = -526294996;
            onNavigationEvent = -1538795485;
            onExtraCallbackWithResult = -2073175198;
            onExtraCallback = new byte[]{5, -5, 8, 5, -9, 9, -5, 8};
        }
    }

    public static final class onNavigationEvent {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private static char[] onExtraCallbackWithResult = {51242, 64978, 64990, 64982, 51240, 64960, 64980, 51245, 51243};
        private static char IAuthTabCallback = 51242;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
            int i7 = ~i4;
            int i8 = ~i;
            int i9 = i7 | i8;
            int i10 = ~(i9 | i3);
            int i11 = (~i3) | i7;
            int i12 = i10 | (~(i11 | i));
            int i13 = (~(i3 | i7)) | (~i9);
            int i14 = (~i11) | (~(i8 | i4));
            int i15 = i4 + i + i2 + (783392123 * i5) + ((-786872706) * i6);
            int i16 = i15 * i15;
            int i17 = (i4 * 375823119) + 1642083618 + (i * 375823682) + (i12 * 563) + (i13 * 1126) + (i14 * 563) + (375824245 * i2) + ((-117547465) * i5) + (763984278 * i6) + (i16 * (-763691008));
            switch (((-1525980173) * i4) + 1729888256 + (218870266 * i) + (i12 * 1744850439) + ((-805266418) * i13) + (1744850439 * i14) + (1963720704 * i2) + ((-1731985408) * i5) + ((-471334912) * i6) + ((-600899584) * i16) + (i17 * i17 * 1830354944)) {
                case 1:
                    return IAuthTabCallback(objArr);
                case 2:
                    return onExtraCallbackWithResult(objArr);
                case 3:
                    onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
                    final Context context = (Context) objArr[1];
                    String str = (String) objArr[2];
                    String str2 = (String) objArr[3];
                    Uri uri = (Uri) objArr[4];
                    final certificateChainCleaner certificatechaincleaner = (certificateChainCleaner) objArr[5];
                    final String str3 = (String) objArr[6];
                    Function0<Unit> function0 = (Function0) objArr[7];
                    Function1<? super Throwable, Unit> function1 = (Function1) objArr[8];
                    int i18 = 2 % 2;
                    final String strOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult(str2, uri);
                    ConvertByteArrayToFloatArray.onExtraCallback(1235583L, false, (String) null, (Map) null, new Function1() { // from class: im.toss.tds.sharebottomsheet.ShareBottomSheet$Companion$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback;

                        public final Object invoke(Object obj) {
                            int i19 = 2 % 2;
                            int i20 = onExtraCallback + 117;
                            IAuthTabCallback = i20 % 128;
                            int i21 = i20 % 2;
                            Unit unitIAuthTabCallback = callTimeoutMillis.onNavigationEvent.IAuthTabCallback(strOnExtraCallbackWithResult, certificatechaincleaner, (SetDetectableSize) obj);
                            int i22 = IAuthTabCallback + 115;
                            onExtraCallback = i22 % 128;
                            int i23 = i22 % 2;
                            return unitIAuthTabCallback;
                        }
                    }, 14, (Object) null);
                    deprecated_networkInterceptors.MORE.share(context, str2, uri, function0, function1, str, new Function1() { // from class: im.toss.tds.sharebottomsheet.ShareBottomSheet$Companion$$ExternalSyntheticLambda1
                        private static int onExtraCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj) {
                            int i19 = 2 % 2;
                            int i20 = onNavigationEvent + 35;
                            onExtraCallback = i20 % 128;
                            if (i20 % 2 == 0) {
                                Object[] objArr2 = {context, str3, strOnExtraCallbackWithResult, certificatechaincleaner, (Intent) obj};
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            Object[] objArr3 = {context, str3, strOnExtraCallbackWithResult, certificatechaincleaner, (Intent) obj};
                            Intent intent = (Intent) callTimeoutMillis.onNavigationEvent.IAuthTabCallback(-2047446686, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 2047446686, objArr3, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
                            int i21 = onExtraCallback + 121;
                            onNavigationEvent = i21 % 128;
                            int i22 = i21 % 2;
                            return intent;
                        }
                    });
                    int i19 = onNavigationEvent + 101;
                    onWarmupCompleted = i19 % 128;
                    int i20 = i19 % 2;
                    return null;
                case 4:
                    return onNavigationEvent(objArr);
                case 5:
                    return onExtraCallback(objArr);
                case 6:
                    return asBinder(objArr);
                default:
                    return onWarmupCompleted(objArr);
            }
        }

        public static /* synthetic */ Unit IAuthTabCallback(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return asInterface(str);
            }
            asInterface(str);
            throw null;
        }

        public static /* synthetic */ Unit IAuthTabCallback(String str, certificateChainCleaner certificatechaincleaner, SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(str, certificatechaincleaner, setDetectableSize);
            if (i3 != 0) {
                int i4 = 50 / 0;
            }
            int i5 = onNavigationEvent + 15;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return unitOnExtraCallback;
        }

        public static /* synthetic */ Unit IAuthTabCallback(Throwable th) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnTransact = onTransact(th);
            if (i3 != 0) {
                int i4 = 63 / 0;
            }
            return unitOnTransact;
        }

        private static /* synthetic */ Object asBinder(Object[] objArr) {
            String str = (String) objArr[0];
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitAsBinder = asBinder(str);
            int i4 = onNavigationEvent + 109;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 68 / 0;
            }
            return unitAsBinder;
        }

        public static /* synthetic */ Unit onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            Unit unit = (Unit) IAuthTabCallback(1212424875, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, -1212424874, new Object[0], LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
            int i4 = onWarmupCompleted + 125;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallback(String str, String str2, String str3, certificateChainCleaner certificatechaincleaner, SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onNavigationEvent(str, str2, str3, certificatechaincleaner, setDetectableSize);
            }
            onNavigationEvent(str, str2, str3, certificatechaincleaner, setDetectableSize);
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallback(Throwable th) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
                return (Unit) IAuthTabCallback(1723065897, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, -1723065895, new Object[]{th}, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
            }
            int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(str);
            int i4 = onNavigationEvent + 95;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unitIAuthTabCallbackDefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit onNavigationEvent(Throwable th) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(th);
            int i4 = onNavigationEvent + 65;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 12 / 0;
            }
            return unitIAuthTabCallbackDefault;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            Context context = (Context) objArr[0];
            String str = (String) objArr[1];
            String str2 = (String) objArr[2];
            certificateChainCleaner certificatechaincleaner = (certificateChainCleaner) objArr[3];
            Intent intent = (Intent) objArr[4];
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intent intentOnWarmupCompleted = onWarmupCompleted(context, str, str2, certificatechaincleaner, intent);
            int i4 = onNavigationEvent + 111;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 54 / 0;
            }
            return intentOnWarmupCompleted;
        }

        public static /* synthetic */ Unit onWarmupCompleted(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(str);
            int i4 = onWarmupCompleted + 85;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return unitOnNavigationEvent;
            }
            throw null;
        }

        public static /* synthetic */ Unit onWarmupCompleted(Throwable th) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitAsBinder = asBinder(th);
            if (i3 == 0) {
                int i4 = 94 / 0;
            }
            int i5 = onWarmupCompleted + 55;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return unitAsBinder;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onNavigationEvent() {
        }

        public static final /* synthetic */ String onExtraCallbackWithResult(onNavigationEvent onnavigationevent, String str, Uri uri) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult(str, uri);
            int i4 = onNavigationEvent + 55;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return strOnExtraCallbackWithResult;
        }

        public static final /* synthetic */ void onNavigationEvent(onNavigationEvent onnavigationevent, String str, String str2, certificateChainCleaner certificatechaincleaner, String str3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onnavigationevent.onWarmupCompleted(str, str2, certificatechaincleaner, str3);
            int i4 = onWarmupCompleted + 5;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ void onExtraCallbackWithResult(onNavigationEvent onnavigationevent, Context context, String str, certificateChainCleaner certificatechaincleaner, List list, String str2, String str3, Function1 function1, Function1 function12, int i, Object obj) throws Throwable {
            List entries;
            String str4;
            int i2 = 2 % 2;
            if ((i & 8) != 0) {
                int i3 = onNavigationEvent + 47;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    EnumC0078cache.getEntries();
                    throw null;
                }
                entries = EnumC0078cache.getEntries();
            } else {
                entries = list;
            }
            String str5 = (i & 16) != 0 ? null : str2;
            if ((i & 32) != 0) {
                int i4 = onNavigationEvent + 97;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                str4 = null;
            } else {
                str4 = str3;
            }
            IAuthTabCallback(-1043999677, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1043999682, new Object[]{onnavigationevent, context, str, certificatechaincleaner, entries, str5, str4, (i & 64) != 0 ? new Function1() { // from class: im.toss.tds.sharebottomsheet.ShareBottomSheet$Companion$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2) {
                    int i6 = 2 % 2;
                    int i7 = onNavigationEvent + 57;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitOnWarmupCompleted = callTimeoutMillis.onNavigationEvent.onWarmupCompleted((String) obj2);
                    int i9 = onExtraCallback + 39;
                    onNavigationEvent = i9 % 128;
                    if (i9 % 2 != 0) {
                        return unitOnWarmupCompleted;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            } : function1, (i & 128) != 0 ? new Function1() { // from class: im.toss.tds.sharebottomsheet.ShareBottomSheet$Companion$$ExternalSyntheticLambda3
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2) {
                    int i6 = 2 % 2;
                    int i7 = onNavigationEvent + 25;
                    onExtraCallback = i7 % 128;
                    Throwable th = (Throwable) obj2;
                    if (i7 % 2 == 0) {
                        return callTimeoutMillis.onNavigationEvent.onExtraCallback(th);
                    }
                    callTimeoutMillis.onNavigationEvent.onExtraCallback(th);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            } : function12}, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
            int i6 = onNavigationEvent + 97;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }

        private static final Unit onNavigationEvent(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                return Unit.INSTANCE;
            }
            Intrinsics.checkNotNullParameter(str, "");
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            Throwable th = (Throwable) objArr[0];
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(th, "");
                return Unit.INSTANCE;
            }
            Intrinsics.checkNotNullParameter(th, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            Context context = (Context) objArr[1];
            String str = (String) objArr[2];
            certificateChainCleaner certificatechaincleaner = (certificateChainCleaner) objArr[3];
            List<? extends EnumC0078cache> list = (List) objArr[4];
            String str2 = (String) objArr[5];
            String str3 = (String) objArr[6];
            Function1<? super String, Unit> function1 = (Function1) objArr[7];
            Function1<? super Throwable, Unit> function12 = (Function1) objArr[8];
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(certificatechaincleaner, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            C0077authenticator c0077authenticatorOnNavigationEvent = C0077authenticator.Companion.onNavigationEvent(context, str2, str, null, certificatechaincleaner, list);
            if (c0077authenticatorOnNavigationEvent == null) {
                return null;
            }
            onnavigationevent.onNavigationEvent(context, c0077authenticatorOnNavigationEvent, str3, function1, function12);
            int i4 = onWarmupCompleted + 75;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2;
            int i4 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onExtraCallbackWithResult;
            Object obj2 = null;
            if (cArr2 != null) {
                int i5 = $11 + 125;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $10 + 121;
                    $11 = i8 % 128;
                    if (i8 % i3 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 26 - View.resolveSizeAndState(0, 0, 0), (Process.myPid() >> 22) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                            }
                            cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0', 0) + 27, 23139 - View.MeasureSpec.getSize(0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    }
                    i7++;
                    i3 = 2;
                }
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), View.resolveSize(0, 0) + 26, Color.green(0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 24824), Drawable.resolveOpacity(0, 0) + 74, 8088 - (KeyEvent.getMaxKeyCode() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback5 == null) {
                                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 30, KeyEvent.keyCodeFromString("") + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                            int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                            } else {
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i14 = 0; i14 < i; i14++) {
                cArr4[i14] = (char) (cArr4[i14] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        private static final Unit asInterface(String str) {
            Unit unit;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                unit = Unit.INSTANCE;
                int i3 = 0 / 0;
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                unit = Unit.INSTANCE;
            }
            int i4 = onNavigationEvent + 27;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 0;
            }
            return unit;
        }

        private static final Unit onTransact(Throwable th) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(th, "");
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            Intrinsics.checkNotNullParameter(th, "");
            Unit unit2 = Unit.INSTANCE;
            int i3 = onNavigationEvent + 13;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return unit2;
        }

        private static final Unit IAuthTabCallbackDefault(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                return Unit.INSTANCE;
            }
            Intrinsics.checkNotNullParameter(str, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        private static final Unit asBinder(Throwable th) {
            Unit unit;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(th, "");
                unit = Unit.INSTANCE;
                int i3 = 63 / 0;
            } else {
                Intrinsics.checkNotNullParameter(th, "");
                unit = Unit.INSTANCE;
            }
            int i4 = onWarmupCompleted + 13;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public static /* synthetic */ void IAuthTabCallback(onNavigationEvent onnavigationevent, Context context, C0077authenticator c0077authenticator, String str, Function1 function1, Function1 function12, int i, Object obj) throws Throwable {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 59;
            onNavigationEvent = i3 % 128;
            Object obj2 = null;
            String str2 = (i3 % 2 != 0 ? (i & 4) == 0 : (i & 5) == 0) ? str : null;
            if ((i & 8) != 0) {
                function1 = new ShareBottomSheet$Companion$.ExternalSyntheticLambda8();
                int i4 = onNavigationEvent + 81;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
            Function1 function13 = function1;
            if ((i & 16) != 0) {
                function12 = new ShareBottomSheet$Companion$.ExternalSyntheticLambda9();
            }
            onnavigationevent.onNavigationEvent(context, c0077authenticator, str2, (Function1<? super String, Unit>) function13, (Function1<? super Throwable, Unit>) function12);
            int i6 = onWarmupCompleted + 27;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }

        private static final Unit asBinder(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            Unit unit2 = Unit.INSTANCE;
            int i3 = onNavigationEvent + 57;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return unit2;
        }

        private static final Unit IAuthTabCallbackDefault(Throwable th) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(th, "");
                Unit unit = Unit.INSTANCE;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(th, "");
            Unit unit2 = Unit.INSTANCE;
            int i3 = onWarmupCompleted + 99;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return unit2;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[PHI: r1
          0x0046: PHI (r1v9 java.util.List<o.deprecated_readTimeoutMillis>) = (r1v8 java.util.List<o.deprecated_readTimeoutMillis>), (r1v17 java.util.List<o.deprecated_readTimeoutMillis>) binds: [B:10:0x0044, B:7:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[PHI: r1
          0x004f: PHI (r1v10 java.util.List<o.deprecated_readTimeoutMillis>) = 
          (r1v8 java.util.List<o.deprecated_readTimeoutMillis>)
          (r1v9 java.util.List<o.deprecated_readTimeoutMillis>)
          (r1v17 java.util.List<o.deprecated_readTimeoutMillis>)
         binds: [B:10:0x0044, B:12:0x004d, B:7:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onNavigationEvent(@NotNull Context context, @NotNull C0077authenticator c0077authenticator, @Nullable String str, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) throws Throwable {
            List<deprecated_readTimeoutMillis> listIAuthTabCallback;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(c0077authenticator, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            if (!c0077authenticator.IAuthTabCallback().isEmpty()) {
                int i2 = onWarmupCompleted + 9;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    listIAuthTabCallback = c0077authenticator.IAuthTabCallback();
                    int i3 = 6 / 0;
                    if (listIAuthTabCallback instanceof Collection) {
                        if (!listIAuthTabCallback.isEmpty()) {
                            Iterator<T> it = listIAuthTabCallback.iterator();
                            while (it.hasNext()) {
                                if (!(((deprecated_readTimeoutMillis) it.next()) instanceof deprecated_networkInterceptors)) {
                                    new callTimeoutMillis(context, c0077authenticator.onTransact(), c0077authenticator.onWarmupCompleted(), c0077authenticator.onNavigationEvent(), c0077authenticator.IAuthTabCallback(), c0077authenticator.onExtraCallback(), str, function1, function12, null).show();
                                    int i4 = onNavigationEvent + 97;
                                    onWarmupCompleted = i4 % 128;
                                    int i5 = i4 % 2;
                                    return;
                                }
                                int i6 = onNavigationEvent + 125;
                                onWarmupCompleted = i6 % 128;
                                int i7 = i6 % 2;
                            }
                        }
                    }
                } else {
                    listIAuthTabCallback = c0077authenticator.IAuthTabCallback();
                    if (listIAuthTabCallback instanceof Collection) {
                    }
                }
            }
            Object[] objArr = {this, context, c0077authenticator.onTransact(), c0077authenticator.onWarmupCompleted(), c0077authenticator.onNavigationEvent(), c0077authenticator.onExtraCallback(), str, new Function0() { // from class: im.toss.tds.sharebottomsheet.ShareBottomSheet$Companion$$ExternalSyntheticLambda5
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke() {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallback + 69;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 != 0) {
                        callTimeoutMillis.onNavigationEvent.onExtraCallback();
                        throw null;
                    }
                    Unit unitOnExtraCallback = callTimeoutMillis.onNavigationEvent.onExtraCallback();
                    int i10 = onExtraCallback + 109;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    throw null;
                }
            }, function12};
            IAuthTabCallback(-1914078969, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1914078972, objArr, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            Unit unit;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                unit = Unit.INSTANCE;
                int i3 = 24 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i4 = onWarmupCompleted + 7;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static final Unit onExtraCallback(String str, certificateChainCleaner certificatechaincleaner, SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                setDetectableSize.onExtraCallback("share_item", str);
                setDetectableSize.onExtraCallback("modal_type", "os");
                setDetectableSize.onExtraCallback(C0080connectionPool.onExtraCallbackWithResult(certificatechaincleaner));
                return Unit.INSTANCE;
            }
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("share_item", str);
            setDetectableSize.onExtraCallback("modal_type", "os");
            setDetectableSize.onExtraCallback(C0080connectionPool.onExtraCallbackWithResult(certificatechaincleaner));
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        private static final Intent onWarmupCompleted(Context context, String str, String str2, certificateChainCleaner certificatechaincleaner, Intent intent) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(intent, "");
                return callTimeoutMillis.Companion.onExtraCallback(context, intent, str, str2, certificatechaincleaner, "os");
            }
            Intrinsics.checkNotNullParameter(intent, "");
            callTimeoutMillis.Companion.onExtraCallback(context, intent, str, str2, certificatechaincleaner, "os");
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ void onExtraCallbackWithResult(onNavigationEvent onnavigationevent, String str, String str2, certificateChainCleaner certificatechaincleaner, String str3, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 8) != 0) {
                int i3 = onNavigationEvent;
                int i4 = i3 + 35;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 17;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                str3 = "toss";
            }
            onnavigationevent.onWarmupCompleted(str, str2, certificatechaincleaner, str3);
        }

        private final void onWarmupCompleted(final String str, final String str2, final certificateChainCleaner certificatechaincleaner, final String str3) {
            int i = 2 % 2;
            ConvertByteArrayToFloatArray.onExtraCallback(1235585L, false, (String) null, (Map) null, new Function1() { // from class: im.toss.tds.sharebottomsheet.ShareBottomSheet$Companion$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 57;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unitOnExtraCallback = callTimeoutMillis.onNavigationEvent.onExtraCallback(str, str2, str3, certificatechaincleaner, (SetDetectableSize) obj);
                    int i5 = onExtraCallback + 81;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }, 14, (Object) null);
            int i2 = onNavigationEvent + 57;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 16 / 0;
            }
        }

        private static final Unit onNavigationEvent(String str, String str2, String str3, certificateChainCleaner certificatechaincleaner, SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                setDetectableSize.onExtraCallback("icon", str);
                setDetectableSize.onExtraCallback("share_item", str2);
                setDetectableSize.onExtraCallback("modal_type", str3);
                setDetectableSize.onExtraCallback(C0080connectionPool.onExtraCallbackWithResult(certificatechaincleaner));
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("icon", str);
            setDetectableSize.onExtraCallback("share_item", str2);
            setDetectableSize.onExtraCallback("modal_type", str3);
            setDetectableSize.onExtraCallback(C0080connectionPool.onExtraCallbackWithResult(certificatechaincleaner));
            Unit unit2 = Unit.INSTANCE;
            int i3 = onNavigationEvent + 89;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return unit2;
        }

        private final String onExtraCallbackWithResult(String str, Uri uri) throws Throwable {
            Object obj;
            int i = 2 % 2;
            ArrayList arrayList = new ArrayList();
            if (str != null && str.length() != 0) {
                int i2 = onWarmupCompleted + 59;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    a(new char[]{0, 5, 13869, 13869, 0, 7, 13891}, (byte) (View.MeasureSpec.makeMeasureSpec(1, 1) * 17), TextUtils.lastIndexOf("", 'r') + 79, objArr);
                    obj = objArr[0];
                } else {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{0, 5, 13869, 13869, 0, 7, 13891}, (byte) (68 - View.MeasureSpec.makeMeasureSpec(0, 0)), TextUtils.lastIndexOf("", '0') + 8, objArr2);
                    obj = objArr2[0];
                }
                arrayList.add(((String) obj).intern());
            }
            if (uri != null) {
                arrayList.add("image");
                int i3 = onNavigationEvent + 19;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            }
            ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
            if (arrayList2 != null) {
                return CollectionsKt.joinToString$default(arrayList2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
            }
            return null;
        }

        public final Intent onExtraCallback(@NotNull Context context, @NotNull Intent intent, @Nullable String str, @Nullable String str2, @NotNull certificateChainCleaner certificatechaincleaner, @NotNull String str3) {
            String string;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(intent, "");
            Intrinsics.checkNotNullParameter(certificatechaincleaner, "");
            Intrinsics.checkNotNullParameter(str3, "");
            if (str == null) {
                int i4 = onWarmupCompleted + 115;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    string = context.getString(R.string.tds_sharebottomsheet_share);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    int i5 = 44 / 0;
                } else {
                    string = context.getString(R.string.tds_sharebottomsheet_share);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                }
            } else {
                string = str;
            }
            Intent intentCreateChooser = Intent.createChooser(intent, string, onExtraCallbackWithResult.Companion.IAuthTabCallback(context, str2, certificatechaincleaner, str3));
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            Intent intentPutExtra = intentCreateChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", (Parcelable[]) ((List) IAuthTabCallback(-534355735, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, 534355739, new Object[]{this, context, intent}, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted())).toArray(new ComponentName[0]));
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i6 = onWarmupCompleted + 53;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 12 / 0;
            }
            return intentPutExtra;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            ComponentName componentName;
            Context context = (Context) objArr[1];
            int i = 2 % 2;
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities((Intent) objArr[2], 0);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "");
            ArrayList arrayList = new ArrayList();
            int i2 = onNavigationEvent + 35;
            while (true) {
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                    componentName = Intrinsics.areEqual(resolveInfo.activityInfo.packageName, context.getPackageName()) ? new ComponentName(context, resolveInfo.activityInfo.name) : null;
                    if (componentName != null) {
                        break;
                    }
                }
                int i4 = onWarmupCompleted + 7;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return arrayList;
                arrayList.add(componentName);
                i2 = onNavigationEvent + 21;
            }
        }

        public static /* synthetic */ Unit onExtraCallback(String str) {
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            return (Unit) IAuthTabCallback(-663773166, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, 663773172, new Object[]{str}, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        }

        public static /* synthetic */ Intent onExtraCallbackWithResult(Context context, String str, String str2, certificateChainCleaner certificatechaincleaner, Intent intent) {
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            return (Intent) IAuthTabCallback(-2047446686, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, 2047446686, new Object[]{context, str, str2, certificatechaincleaner, intent}, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        }

        private final List<ComponentName> onExtraCallback(Context context, Intent intent) {
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            return (List) IAuthTabCallback(-534355735, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, 534355739, new Object[]{this, context, intent}, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        }

        private final void onWarmupCompleted(Context context, String str, String str2, Uri uri, certificateChainCleaner certificatechaincleaner, String str3, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) throws Throwable {
            Object[] objArr = {this, context, str, str2, uri, certificatechaincleaner, str3, function0, function1};
            IAuthTabCallback(-1914078969, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1914078972, objArr, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        }

        private static final Unit onExtraCallbackWithResult(Throwable th) {
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            return (Unit) IAuthTabCallback(1723065897, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, -1723065895, new Object[]{th}, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        }

        private static final Unit IAuthTabCallback() {
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            return (Unit) IAuthTabCallback(1212424875, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, -1212424874, new Object[0], LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        }

        public final void IAuthTabCallback(@NotNull Context context, @NotNull String str, @NotNull certificateChainCleaner certificatechaincleaner, @NotNull List<? extends EnumC0078cache> list, @Nullable String str2, @Nullable String str3, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) throws Throwable {
            Object[] objArr = {this, context, str, certificatechaincleaner, list, str2, str3, function1, function12};
            IAuthTabCallback(-1043999677, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1043999682, objArr, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        }
    }

    public static /* synthetic */ Unit onExtraCallback(callTimeoutMillis calltimeoutmillis, int i) {
        return (Unit) onNavigationEvent(256343243, new Object[]{calltimeoutmillis, Integer.valueOf(i)}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -256343238);
    }

    private static final Unit onExtraCallback(callTimeoutMillis calltimeoutmillis, RowScope rowScope, deprecated_readTimeoutMillis deprecated_readtimeoutmillis, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onNavigationEvent(-1975335877, new Object[]{calltimeoutmillis, rowScope, deprecated_readtimeoutmillis, function0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1975335879);
    }

    private static final Unit onExtraCallbackWithResult(Throwable th) {
        return (Unit) onNavigationEvent(-1867236602, new Object[]{th}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1867236606);
    }

    public static final /* synthetic */ String onExtraCallbackWithResult(callTimeoutMillis calltimeoutmillis) {
        return (String) onNavigationEvent(-659138554, new Object[]{calltimeoutmillis}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 659138555);
    }

    private final String writeTypedObject() {
        return (String) onNavigationEvent(679775403, new Object[]{this}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -679775397);
    }

    private static final CharSequence onExtraCallbackWithResult(deprecated_readTimeoutMillis deprecated_readtimeoutmillis) {
        return (CharSequence) onNavigationEvent(323024213, new Object[]{deprecated_readtimeoutmillis}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -323024210);
    }

    private final void onNavigationEvent(deprecated_readTimeoutMillis deprecated_readtimeoutmillis) throws NoWhenBranchMatchedException {
        onNavigationEvent(-570501221, new Object[]{this, deprecated_readtimeoutmillis}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 570501221);
    }
}
