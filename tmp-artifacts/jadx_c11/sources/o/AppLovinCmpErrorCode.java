package o;

import android.content.Context;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BulletSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.compose.foundation.typography.AnnotatedStringsKt$;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinCmpErrorCode;
import o.AppLovinErrorCodes;
import o.hasProvider;
import o.use;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinCmpErrorCode {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = i | i3 | i2;
        int i8 = (~((~i2) | i3)) | i;
        int i9 = ~((~i) | i3);
        int i10 = i + i3 + i4 + (1132004924 * i5) + ((-2047965933) * i6);
        int i11 = i10 * i10;
        int i12 = ((1650805025 * i) - 289800192) + ((-1513965855) * i3) + ((-565098208) * i7) + (i8 * 565098208) + (565098208 * i9) + ((-2079064064) * i4) + (1823473664 * i5) + (830210048 * i6) + ((-1143341056) * i11);
        int i13 = ((i * (-767560105)) - 1188649921) + (i3 * (-767559017)) + (i7 * (-544)) + (i8 * 544) + (i9 * 544) + (i4 * (-767559561)) + (i5 * 1544553956) + (i6 * (-1468578859)) + (i11 * (-2108293120));
        int i14 = i12 + (i13 * i13 * (-2075787264));
        if (i14 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i14 == 2) {
            return IAuthTabCallback(objArr);
        }
        if (i14 == 3) {
            return onNavigationEvent(objArr);
        }
        if (i14 != 4) {
            return onExtraCallbackWithResult(objArr);
        }
        Spanned spanned = (Spanned) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        int i15 = 2 % 2;
        Intrinsics.checkNotNullParameter(spanned, "");
        hasProvider.IAuthTabCallback iAuthTabCallbackOnExtraCallback = new hasProvider.IAuthTabCallback(spanned.length()).onExtraCallback(spanned);
        onExtraCallback(iAuthTabCallbackOnExtraCallback, spanned, function1);
        hasProvider hasproviderOnExtraCallbackWithResult = iAuthTabCallbackOnExtraCallback.onExtraCallbackWithResult();
        int i16 = IAuthTabCallback + 15;
        onWarmupCompleted = i16 % 128;
        int i17 = i16 % 2;
        return hasproviderOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(-799815527, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 799815528, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{function1, str});
        int i4 = IAuthTabCallback + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(hasProvider.IAuthTabCallback iAuthTabCallback, String str, String str2, SurfaceProcessorNode surfaceProcessorNode, SurfaceEdgeSettableSurfaceExternalSyntheticLambda2 surfaceEdgeSettableSurfaceExternalSyntheticLambda2, boolean z, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 79;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(iAuthTabCallback, str, str2, surfaceProcessorNode, surfaceEdgeSettableSurfaceExternalSyntheticLambda2, z, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 51;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(hasProvider.IAuthTabCallback iAuthTabCallback, String str, String str2, SurfaceProcessorNode surfaceProcessorNode, SurfaceEdgeSettableSurfaceExternalSyntheticLambda2 surfaceEdgeSettableSurfaceExternalSyntheticLambda2, boolean z, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 61;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return onNavigationEvent(iAuthTabCallback, str, str2, surfaceProcessorNode, surfaceEdgeSettableSurfaceExternalSyntheticLambda2, z, function1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onNavigationEvent(iAuthTabCallback, str, str2, surfaceProcessorNode, surfaceEdgeSettableSurfaceExternalSyntheticLambda2, z, function1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final hasProvider onNavigationEvent(@NotNull String str, @Nullable Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        if ((i2 & 2) != 0) {
            int i4 = onWarmupCompleted + 79;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            function1 = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2036766174, i, -1, "im.toss.tds.compose.foundation.typography.rememberAnnotatedStringFromHtml (AnnotatedStrings.kt:53)");
        }
        Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(context);
        boolean z2 = true;
        if ((((i & 14) ^ 6) <= 4 || !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str)) && (i & 6) != 4) {
            int i6 = onWarmupCompleted + 59;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        } else {
            z = true;
        }
        if (((i & 112) ^ 48) > 32) {
            int i8 = IAuthTabCallback + 33;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1)) {
                if ((i & 48) != 32) {
                    z2 = false;
                }
            }
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnNavigationEvent | z | z2)) {
            int i9 = onWarmupCompleted + 63;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                obj.hashCode();
                throw null;
            }
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = onWarmupCompleted(context, str, function1);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
        }
        hasProvider hasprovider = (hasProvider) objOnMinimized;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = IAuthTabCallback + 15;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return hasprovider;
    }

    public static /* synthetic */ hasProvider onExtraCallbackWithResult(Context context, String str, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 4) != 0) {
            int i6 = i3 + 31;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            function1 = null;
        }
        hasProvider hasproviderOnWarmupCompleted = onWarmupCompleted(context, str, function1);
        int i8 = onWarmupCompleted + 55;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 73 / 0;
        }
        return hasproviderOnWarmupCompleted;
    }

    public static final hasProvider onWarmupCompleted(@NotNull Context context, @NotNull String str, @Nullable Function1<? super String, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        hasProvider hasprovider = (hasProvider) onExtraCallback(1299780661, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1299780657, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{isExecuted.onNavigationEvent(isExecuted.IAuthTabCallback, str, new Object[0], context, null, null, false, false, null, 248, null), function1});
        int i4 = IAuthTabCallback + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return hasprovider;
    }

    public static /* synthetic */ hasProvider onExtraCallback(Spanned spanned, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 75;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 13;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            function1 = null;
        }
        return (hasProvider) onExtraCallback(1299780661, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1299780657, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{spanned, function1});
    }

    private static final void onExtraCallback(hasProvider.IAuthTabCallback iAuthTabCallback, Spanned spanned, Function1<? super String, Unit> function1) {
        Object[] spans;
        int length;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            spans = spanned.getSpans(1, spanned.length(), Object.class);
            Intrinsics.checkNotNullExpressionValue(spans, "");
            length = spans.length;
        } else {
            spans = spanned.getSpans(0, spanned.length(), Object.class);
            Intrinsics.checkNotNullExpressionValue(spans, "");
            length = spans.length;
        }
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = onWarmupCompleted + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            Object obj = spans[i3];
            long jOnExtraCallback = TargetUtils.onExtraCallback(spanned.getSpanStart(obj), spanned.getSpanEnd(obj));
            Intrinsics.checkNotNull(obj);
            onNavigationEvent(iAuthTabCallback, obj, getNumberOfTargets.IAuthTabCallbackStub(jOnExtraCallback), getNumberOfTargets.onExtraCallback(jOnExtraCallback), function1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(hasProvider.IAuthTabCallback iAuthTabCallback, Object obj, int i, int i2, Function1<? super String, Unit> function1) {
        GraphicDeviceInfo graphicDeviceInfoAsBinder;
        int iOnWarmupCompleted;
        SurfaceProcessorNode surfaceProcessorNode;
        response responseVarOnExtraCallbackWithResult;
        SurfaceProcessorNode surfaceProcessorNode2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 77;
        int i5 = i4 % 128;
        IAuthTabCallback = i5;
        if (i4 % 2 == 0) {
            int i6 = 26 / 0;
            if (obj instanceof StyleSpan) {
                StyleSpan styleSpan = (StyleSpan) obj;
                boolean z = (styleSpan.getStyle() & 1) != 0;
                boolean z2 = (styleSpan.getStyle() & 2) != 0;
                isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
                if (z) {
                    int i7 = onWarmupCompleted + 33;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    graphicDeviceInfoAsBinder = isrepeatingenabled.onExtraCallbackWithResult();
                } else {
                    graphicDeviceInfoAsBinder = isrepeatingenabled.asBinder();
                }
                if ((obj instanceof getPattern) && (responseVarOnExtraCallbackWithResult = ((getPattern) obj).onExtraCallbackWithResult()) != null) {
                    graphicDeviceInfoAsBinder = new GraphicDeviceInfo(responseVarOnExtraCallbackWithResult.getWeight());
                }
                GraphicDeviceInfo graphicDeviceInfo = graphicDeviceInfoAsBinder;
                use.onWarmupCompleted onwarmupcompleted = use.Companion;
                if (z2) {
                    int i9 = IAuthTabCallback + 77;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    iOnWarmupCompleted = onwarmupcompleted.onExtraCallbackWithResult();
                } else {
                    iOnWarmupCompleted = onwarmupcompleted.onWarmupCompleted();
                }
                surfaceProcessorNode = new SurfaceProcessorNode(0L, 0L, graphicDeviceInfo, use.IAuthTabCallback(iOnWarmupCompleted), (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65523, (DefaultConstructorMarker) null);
            } else {
                if (obj instanceof StrikethroughSpan) {
                    surfaceProcessorNode2 = new SurfaceProcessorNode(0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, bindChildren.Companion.onExtraCallback(), (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 61439, (DefaultConstructorMarker) null);
                } else if (obj instanceof UnderlineSpan) {
                    surfaceProcessorNode2 = new SurfaceProcessorNode(0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, bindChildren.Companion.IAuthTabCallback(), (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 61439, (DefaultConstructorMarker) null);
                } else if (obj instanceof SuperscriptSpan) {
                    surfaceProcessorNode2 = new SurfaceProcessorNode(0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, getHighestSurfacePriority.onExtraCallbackWithResult(getHighestSurfacePriority.Companion.onExtraCallbackWithResult()), (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65279, (DefaultConstructorMarker) null);
                } else if (obj instanceof SubscriptSpan) {
                    surfaceProcessorNode2 = new SurfaceProcessorNode(0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, getHighestSurfacePriority.onExtraCallbackWithResult(getHighestSurfacePriority.Companion.onNavigationEvent()), (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65279, (DefaultConstructorMarker) null);
                } else if (obj instanceof ForegroundColorSpan) {
                    surfaceProcessorNode = new SurfaceProcessorNode(ByteOrderedDataOutputStream.onExtraCallback(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65534, (DefaultConstructorMarker) null);
                    int i11 = onWarmupCompleted + 51;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                } else if (obj instanceof URLSpan) {
                    String url = ((URLSpan) obj).getURL();
                    Intrinsics.checkNotNullExpressionValue(url, "");
                    surfaceProcessorNode = onExtraCallback(iAuthTabCallback, url, function1, i, i2);
                } else if (obj instanceof CertificatePinnerCompanion) {
                    surfaceProcessorNode = onExtraCallback(iAuthTabCallback, ((CertificatePinnerCompanion) obj).onNavigationEvent(), function1, i, i2);
                } else {
                    if (!(obj instanceof TypefaceSpan) && !(obj instanceof BulletSpan)) {
                        int i13 = i5 + 33;
                        onWarmupCompleted = i13 % 128;
                        if (i13 % 2 != 0) {
                            boolean z3 = obj instanceof AbsoluteSizeSpan;
                            throw null;
                        }
                        boolean z4 = obj instanceof AbsoluteSizeSpan;
                    }
                    surfaceProcessorNode = null;
                }
                surfaceProcessorNode = surfaceProcessorNode2;
                int i112 = onWarmupCompleted + 51;
                IAuthTabCallback = i112 % 128;
                int i122 = i112 % 2;
            }
        } else if (obj instanceof StyleSpan) {
        }
        if (surfaceProcessorNode != null) {
            iAuthTabCallback.onNavigationEvent(surfaceProcessorNode, i, i2);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(str);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 1;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return unit;
    }

    private static final SurfaceProcessorNode onExtraCallback(hasProvider.IAuthTabCallback iAuthTabCallback, final String str, final Function1<? super String, Unit> function1, int i, int i2) {
        int i3 = 2 % 2;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        String str2 = string + "&t@d;s&" + string;
        if (function1 != null) {
            AppLovinPrivacySettings.onExtraCallbackWithResult().put(string, new Function0() { // from class: im.toss.tds.compose.foundation.typography.AnnotatedStringsKt$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 115;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    Unit unitOnExtraCallbackWithResult = AppLovinCmpErrorCode.onExtraCallbackWithResult(function1, str);
                    int i7 = onNavigationEvent + 43;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 64 / 0;
                    }
                    return unitOnExtraCallbackWithResult;
                }
            });
            int i4 = onWarmupCompleted + 47;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        iAuthTabCallback.onWarmupCompleted("tds:clickable", str2, i, i2);
        SurfaceProcessorNode surfaceProcessorNode = new SurfaceProcessorNode(0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, bindChildren.Companion.IAuthTabCallback(), (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 61439, (DefaultConstructorMarker) null);
        int i6 = IAuthTabCallback + 87;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return surfaceProcessorNode;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str;
        String str2;
        hasProvider.IAuthTabCallback iAuthTabCallback = (hasProvider.IAuthTabCallback) objArr[0];
        boolean z = true;
        String str3 = (String) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        String str4 = (String) objArr[4];
        String str5 = (String) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        Object obj = objArr[7];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0 ? (iIntValue & 4) == 0 : (iIntValue & 5) == 0) {
            z = zBooleanValue;
        } else {
            int i4 = i3 + 59;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        if ((iIntValue & 8) != 0) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            str = string;
        } else {
            str = str4;
        }
        if ((iIntValue & 16) != 0) {
            int i6 = onWarmupCompleted + 29;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            str2 = str;
        } else {
            str2 = str5;
        }
        onWarmupCompleted(iAuthTabCallback, str3, function0, z, str, str2);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@NotNull hasProvider.IAuthTabCallback iAuthTabCallback, @NotNull String str, @NotNull String str2, @Nullable SurfaceProcessorNode surfaceProcessorNode, @Nullable SurfaceEdgeSettableSurfaceExternalSyntheticLambda2 surfaceEdgeSettableSurfaceExternalSyntheticLambda2, boolean z, @NotNull Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        SurfaceProcessorNode surfaceProcessorNode2;
        int i4;
        SurfaceEdgeSettableSurfaceExternalSyntheticLambda2 surfaceEdgeSettableSurfaceExternalSyntheticLambda22;
        int i5;
        boolean z2;
        int i6;
        int i7;
        boolean z3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean zOnExtraCallback;
        int i8 = 2 % 2;
        int i9 = onWarmupCompleted + 93;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-89021723);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i11 = onWarmupCompleted + 119;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback);
            } else {
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallback);
            }
            i3 = (zOnExtraCallback ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            int i13 = IAuthTabCallback + 71;
            onWarmupCompleted = i13 % 128;
            if (i13 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2);
                obj.hashCode();
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 256 : 128;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            int i15 = IAuthTabCallback + 13;
            onWarmupCompleted = i15 % 128;
            i3 = i15 % 2 != 0 ? i3 | 4870 : i3 | 3072;
        } else {
            if ((i & 3072) == 0) {
                int i16 = IAuthTabCallback + 71;
                onWarmupCompleted = i16 % 128;
                int i17 = i16 % 2;
                surfaceProcessorNode2 = surfaceProcessorNode;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(surfaceProcessorNode2) ? 2048 : 1024;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    surfaceEdgeSettableSurfaceExternalSyntheticLambda22 = surfaceEdgeSettableSurfaceExternalSyntheticLambda2;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(surfaceEdgeSettableSurfaceExternalSyntheticLambda22) ? 16384 : 8192;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 196608) == 0) {
                        z2 = z;
                        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                            i6 = 65536;
                        } else {
                            int i18 = IAuthTabCallback + 101;
                            onWarmupCompleted = i18 % 128;
                            if (i18 % 2 != 0) {
                                throw null;
                            }
                            i6 = 131072;
                        }
                        i7 = i6 | i3;
                    }
                    if ((1572864 & i) == 0) {
                        i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 1048576 : 524288;
                    }
                    if ((599187 & i7) == 599186) {
                        int i19 = onWarmupCompleted + 75;
                        IAuthTabCallback = i19 % 128;
                        int i20 = i19 % 2;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i7 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    } else {
                        if (i14 != 0) {
                            surfaceProcessorNode2 = null;
                        }
                        if (i4 != 0) {
                            int i21 = onWarmupCompleted + 25;
                            IAuthTabCallback = i21 % 128;
                            int i22 = i21 % 2;
                            surfaceEdgeSettableSurfaceExternalSyntheticLambda22 = null;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-89021723, i7, -1, "im.toss.tds.compose.foundation.typography.appendCleanLink (AnnotatedStrings.kt:187)");
                        }
                        SurfaceProcessorNode surfaceProcessorNodeOnWarmupCompleted = SurfaceProcessorNode.onWarmupCompleted(surfaceProcessorNode2 == null ? new SurfaceProcessorNode(0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65535, (DefaultConstructorMarker) null) : surfaceProcessorNode2, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65534, (Object) null);
                        int iOnNavigationEvent = surfaceProcessorNodeOnWarmupCompleted != null ? iAuthTabCallback.onNavigationEvent(surfaceProcessorNodeOnWarmupCompleted) : -1;
                        int iOnWarmupCompleted = surfaceEdgeSettableSurfaceExternalSyntheticLambda22 != null ? iAuthTabCallback.onWarmupCompleted(surfaceEdgeSettableSurfaceExternalSyntheticLambda22) : -1;
                        onExtraCallback onextracallback = new onExtraCallback(function1, str2);
                        String string = UUID.randomUUID().toString();
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        String str3 = string + "&t@d;s&" + string;
                        AppLovinPrivacySettings.onExtraCallbackWithResult().put(string, onextracallback);
                        int iIAuthTabCallback = z2 ? iAuthTabCallback.IAuthTabCallback("tds:clickable", str3) : -1;
                        try {
                            iAuthTabCallback.IAuthTabCallback(str);
                            Unit unit = Unit.INSTANCE;
                            if (iOnWarmupCompleted >= 0) {
                                iAuthTabCallback.onNavigationEvent(iOnWarmupCompleted);
                            }
                            if (iOnNavigationEvent >= 0) {
                                int i23 = onWarmupCompleted + 29;
                                IAuthTabCallback = i23 % 128;
                                if (i23 % 2 == 0) {
                                    iAuthTabCallback.onNavigationEvent(iOnNavigationEvent);
                                    throw null;
                                }
                                iAuthTabCallback.onNavigationEvent(iOnNavigationEvent);
                            }
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                int i24 = IAuthTabCallback + 117;
                                onWarmupCompleted = i24 % 128;
                                if (i24 % 2 != 0) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                    throw null;
                                }
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                        } finally {
                            if (z2) {
                                iAuthTabCallback.onNavigationEvent(iIAuthTabCallback);
                            }
                        }
                    }
                    boolean z4 = z2;
                    SurfaceProcessorNode surfaceProcessorNode3 = surfaceProcessorNode2;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AnnotatedStringsKt$.ExternalSyntheticLambda1(iAuthTabCallback, str, str2, surfaceProcessorNode3, surfaceEdgeSettableSurfaceExternalSyntheticLambda22, z4, function1, i, i2));
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                z2 = z;
                i7 = i3;
                if ((1572864 & i) == 0) {
                }
                if ((599187 & i7) == 599186) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i7 & 1)) {
                }
                boolean z42 = z2;
                SurfaceProcessorNode surfaceProcessorNode32 = surfaceProcessorNode2;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            surfaceEdgeSettableSurfaceExternalSyntheticLambda22 = surfaceEdgeSettableSurfaceExternalSyntheticLambda2;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            z2 = z;
            i7 = i3;
            if ((1572864 & i) == 0) {
            }
            if ((599187 & i7) == 599186) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i7 & 1)) {
            }
            boolean z422 = z2;
            SurfaceProcessorNode surfaceProcessorNode322 = surfaceProcessorNode2;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        surfaceProcessorNode2 = surfaceProcessorNode;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        surfaceEdgeSettableSurfaceExternalSyntheticLambda22 = surfaceEdgeSettableSurfaceExternalSyntheticLambda2;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        z2 = z;
        i7 = i3;
        if ((1572864 & i) == 0) {
        }
        if ((599187 & i7) == 599186) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i7 & 1)) {
        }
        boolean z4222 = z2;
        SurfaceProcessorNode surfaceProcessorNode3222 = surfaceProcessorNode2;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(hasProvider.IAuthTabCallback iAuthTabCallback, String str, String str2, SurfaceProcessorNode surfaceProcessorNode, SurfaceEdgeSettableSurfaceExternalSyntheticLambda2 surfaceEdgeSettableSurfaceExternalSyntheticLambda2, boolean z, Function1 function1, int i, Object obj) {
        SurfaceProcessorNode surfaceProcessorNode2;
        boolean z2;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 91;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        Object obj2 = null;
        if (i3 % 2 != 0 ? (i & 4) == 0 : (i & 5) == 0) {
            surfaceProcessorNode2 = surfaceProcessorNode;
        } else {
            int i5 = i4 + 115;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            surfaceProcessorNode2 = null;
        }
        SurfaceEdgeSettableSurfaceExternalSyntheticLambda2 surfaceEdgeSettableSurfaceExternalSyntheticLambda22 = (i & 8) != 0 ? null : surfaceEdgeSettableSurfaceExternalSyntheticLambda2;
        if ((i & 16) != 0) {
            int i6 = i4 + 69;
            onWarmupCompleted = i6 % 128;
            z2 = i6 % 2 == 0;
        } else {
            z2 = z;
        }
        onExtraCallback(iAuthTabCallback, str, str2, surfaceProcessorNode2, surfaceEdgeSettableSurfaceExternalSyntheticLambda22, z2, (Function1<? super String, Unit>) function1);
    }

    public static final class onExtraCallback implements Function0<Unit> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function1<String, Unit> IAuthTabCallback;
        final /* synthetic */ String onExtraCallback;

        /* JADX WARN: Multi-variable type inference failed */
        public onExtraCallback(Function1<? super String, Unit> function1, String str) {
            this.IAuthTabCallback = function1;
            this.onExtraCallback = str;
        }

        public /* synthetic */ Object invoke() {
            Unit unit;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult();
            if (i3 == 0) {
                unit = Unit.INSTANCE;
                int i4 = 89 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i5 = onNavigationEvent + 113;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 86 / 0;
            }
            return unit;
        }

        public final void onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                this.IAuthTabCallback.invoke(this.onExtraCallback);
                throw null;
            }
            this.IAuthTabCallback.invoke(this.onExtraCallback);
            int i3 = onWarmupCompleted + 93;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        hasProvider.IAuthTabCallback iAuthTabCallback = (hasProvider.IAuthTabCallback) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        long jLongValue = ((Number) objArr[2]).longValue();
        String str = (String) objArr[3];
        long jLongValue2 = ((Number) objArr[4]).longValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        Object obj = objArr[6];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if ((iIntValue2 & 2) != 0) {
            jLongValue = setByteOrder.Companion.onTransact();
        }
        if ((iIntValue2 & 4) != 0) {
            int i4 = IAuthTabCallback + 23;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            str = null;
        }
        if ((iIntValue2 & 8) != 0) {
            jLongValue2 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
            int i5 = onWarmupCompleted + 117;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        IAuthTabCallback(iAuthTabCallback, iIntValue, jLongValue, str, jLongValue2);
        return null;
    }

    public static final void IAuthTabCallback(@NotNull hasProvider.IAuthTabCallback iAuthTabCallback, int i, long j, @Nullable String str, long j2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        onExtraCallback(-26584317, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 26584320, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{iAuthTabCallback, new AppLovinEventService(str, Integer.valueOf(i), null, null, null, j, j2, 28, null)});
        int i3 = IAuthTabCallback + 11;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(hasProvider.IAuthTabCallback iAuthTabCallback, String str, long j, String str2, long j2, int i, Object obj) {
        long jOnTransact;
        String str3;
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            jOnTransact = setByteOrder.Companion.onTransact();
            int i3 = onWarmupCompleted + 117;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        } else {
            jOnTransact = j;
        }
        if ((i & 4) != 0) {
            int i5 = IAuthTabCallback + 101;
            onWarmupCompleted = i5 % 128;
            str3 = null;
            if (i5 % 2 != 0) {
                int i6 = 99 / 0;
            }
        } else {
            str3 = str2;
        }
        onWarmupCompleted(iAuthTabCallback, str, jOnTransact, str3, (i & 8) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2);
    }

    public static final void onWarmupCompleted(@NotNull hasProvider.IAuthTabCallback iAuthTabCallback, @NotNull String str, long j, @Nullable String str2, long j2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallback(-26584317, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 26584320, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{iAuthTabCallback, new AppLovinEventService(str2, null, str, null, null, j, j2, 26, null)});
        int i2 = IAuthTabCallback + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(hasProvider.IAuthTabCallback iAuthTabCallback, String str, AppLovinErrorCodes.onWarmupCompleted onwarmupcompleted, AppLovinErrorCodes.IAuthTabCallback iAuthTabCallback2, GraphicDeviceInfo graphicDeviceInfo, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            onwarmupcompleted = AppLovinErrorCodes.onWarmupCompleted.Blue;
        }
        if ((i & 4) != 0) {
            int i3 = onWarmupCompleted + 99;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            iAuthTabCallback2 = AppLovinErrorCodes.IAuthTabCallback.Fill;
        }
        if ((i & 8) != 0) {
            int i5 = onWarmupCompleted + 99;
            int i6 = i5 % 128;
            IAuthTabCallback = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 31;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            graphicDeviceInfo = null;
        }
        onExtraCallbackWithResult(iAuthTabCallback, str, onwarmupcompleted, iAuthTabCallback2, graphicDeviceInfo);
    }

    public static final void onExtraCallbackWithResult(@NotNull hasProvider.IAuthTabCallback iAuthTabCallback, @NotNull String str, @NotNull AppLovinErrorCodes.onWarmupCompleted onwarmupcompleted, @NotNull AppLovinErrorCodes.IAuthTabCallback iAuthTabCallback2, @Nullable GraphicDeviceInfo graphicDeviceInfo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback2, "");
        onExtraCallback(-26584317, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 26584320, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{iAuthTabCallback, new AppLovinErrorCodes(str, onwarmupcompleted, iAuthTabCallback2, graphicDeviceInfo)});
        int i2 = onWarmupCompleted + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final void IAuthTabCallback(@NotNull hasProvider.IAuthTabCallback iAuthTabCallback, @NotNull SurfaceOutputImplExternalSyntheticLambda1 surfaceOutputImplExternalSyntheticLambda1, @NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(surfaceOutputImplExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        onExtraCallback(-26584317, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 26584320, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{iAuthTabCallback, new AppLovinEventTypes(surfaceOutputImplExternalSyntheticLambda1, function2, null, 4, null)});
        int i2 = IAuthTabCallback + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        hasProvider.IAuthTabCallback iAuthTabCallback = (hasProvider.IAuthTabCallback) objArr[0];
        getAdditionalConsentStatus getadditionalconsentstatus = (getAdditionalConsentStatus) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(getadditionalconsentstatus, "");
        String string = getadditionalconsentstatus.toString();
        AppLovinPrivacySettings.IAuthTabCallback().put(string, getadditionalconsentstatus);
        String strIAuthTabCallback = getadditionalconsentstatus.IAuthTabCallback();
        if (strIAuthTabCallback == null) {
            strIAuthTabCallback = "�";
        } else {
            if (strIAuthTabCallback.length() <= 0) {
                int i2 = IAuthTabCallback + 119;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                strIAuthTabCallback = null;
            }
            if (strIAuthTabCallback == null) {
            }
        }
        CameraSelectorBuilder.onNavigationEvent(iAuthTabCallback, string, strIAuthTabCallback);
        int i4 = IAuthTabCallback + 119;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return null;
    }

    public static final void onWarmupCompleted(@NotNull hasProvider.IAuthTabCallback iAuthTabCallback, @NotNull String str, @NotNull Function0<Unit> function0, boolean z, @NotNull String str2, @NotNull String str3) {
        int iIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        String str4 = str2 + "&t@d;s&" + str3;
        AppLovinPrivacySettings.onExtraCallbackWithResult().put(str2, function0);
        if (!z) {
            iIAuthTabCallback = -1;
        } else {
            int i2 = onWarmupCompleted + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            iIAuthTabCallback = iAuthTabCallback.IAuthTabCallback("tds:clickable", str4);
        }
        try {
            iAuthTabCallback.IAuthTabCallback(str);
            Unit unit = Unit.INSTANCE;
            if (z) {
                int i4 = onWarmupCompleted + 33;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                iAuthTabCallback.onNavigationEvent(iIAuthTabCallback);
                if (i5 == 0) {
                    int i6 = 52 / 0;
                }
            }
        } catch (Throwable th) {
            if (z) {
                iAuthTabCallback.onNavigationEvent(iIAuthTabCallback);
            }
            throw th;
        }
    }

    public static final void onExtraCallback(@NotNull hasProvider.IAuthTabCallback iAuthTabCallback, @NotNull String str, @NotNull String str2, @Nullable SurfaceProcessorNode surfaceProcessorNode, @Nullable SurfaceEdgeSettableSurfaceExternalSyntheticLambda2 surfaceEdgeSettableSurfaceExternalSyntheticLambda2, boolean z, @NotNull Function1<? super String, Unit> function1) {
        SurfaceProcessorNode surfaceProcessorNode2;
        int iOnNavigationEvent;
        int iOnWarmupCompleted;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (surfaceProcessorNode == null) {
            SurfaceProcessorNode surfaceProcessorNode3 = new SurfaceProcessorNode(0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65535, (DefaultConstructorMarker) null);
            int i2 = IAuthTabCallback + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            surfaceProcessorNode2 = surfaceProcessorNode3;
        } else {
            surfaceProcessorNode2 = surfaceProcessorNode;
        }
        SurfaceProcessorNode surfaceProcessorNodeOnWarmupCompleted = SurfaceProcessorNode.onWarmupCompleted(surfaceProcessorNode2, 0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, bindChildren.Companion.IAuthTabCallback(), (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 61439, (Object) null);
        if (surfaceProcessorNodeOnWarmupCompleted != null) {
            int i4 = IAuthTabCallback + 23;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            iOnNavigationEvent = iAuthTabCallback.onNavigationEvent(surfaceProcessorNodeOnWarmupCompleted);
        } else {
            iOnNavigationEvent = -1;
        }
        if (surfaceEdgeSettableSurfaceExternalSyntheticLambda2 != null) {
            iOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted(surfaceEdgeSettableSurfaceExternalSyntheticLambda2);
            int i6 = onWarmupCompleted + 13;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        } else {
            iOnWarmupCompleted = -1;
        }
        onExtraCallback onextracallback = new onExtraCallback(function1, str2);
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        String str3 = string + "&t@d;s&" + string;
        AppLovinPrivacySettings.onExtraCallbackWithResult().put(string, onextracallback);
        int iIAuthTabCallback = z ? iAuthTabCallback.IAuthTabCallback("tds:clickable", str3) : -1;
        try {
            iAuthTabCallback.IAuthTabCallback(str);
            Unit unit = Unit.INSTANCE;
            if (z) {
                int i8 = onWarmupCompleted + 79;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                iAuthTabCallback.onNavigationEvent(iIAuthTabCallback);
            }
            if (iOnWarmupCompleted >= 0) {
                int i10 = IAuthTabCallback + 23;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 != 0) {
                    iAuthTabCallback.onNavigationEvent(iOnWarmupCompleted);
                    throw null;
                }
                iAuthTabCallback.onNavigationEvent(iOnWarmupCompleted);
            }
            if (iOnNavigationEvent >= 0) {
                iAuthTabCallback.onNavigationEvent(iOnNavigationEvent);
            }
        } catch (Throwable th) {
            if (z) {
                iAuthTabCallback.onNavigationEvent(iIAuthTabCallback);
            }
            throw th;
        }
    }

    public static final void onExtraCallback(@NotNull hasProvider.IAuthTabCallback iAuthTabCallback, @NotNull getAdditionalConsentStatus getadditionalconsentstatus) {
        onExtraCallback(-26584317, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 26584320, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{iAuthTabCallback, getadditionalconsentstatus});
    }

    private static final Unit IAuthTabCallback(Function1 function1, String str) {
        return (Unit) onExtraCallback(-799815527, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 799815528, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{function1, str});
    }

    public static final hasProvider IAuthTabCallback(@NotNull Spanned spanned, @Nullable Function1<? super String, Unit> function1) {
        return (hasProvider) onExtraCallback(1299780661, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1299780657, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{spanned, function1});
    }
}
