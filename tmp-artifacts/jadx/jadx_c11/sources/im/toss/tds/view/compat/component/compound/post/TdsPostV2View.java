package im.toss.tds.view.compat.component.compound.post;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.tds.view.compat.R;
import im.toss.tds.view.compat.component.TdsComposeView;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.GraphicDeviceInfo;
import o.QuirksExternalSyntheticBackport0;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.getBacktraceNote;
import o.getDistanceBetweenPoints;
import o.getMinWebSocketMessageToCompressokhttp;
import o.getStarPath;
import o.getSupportedHighSpeedResolutionsFor;
import o.hasProvider;
import o.isRepeatingEnabled;
import o.response;
import o.setByteOrder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TdsPostV2View extends TdsComposeView {
    private static int asInterface = 1;
    private static int onWarmupCompleted;
    private final getSupportedHighSpeedResolutionsFor<Float> IAuthTabCallback;
    private final getSupportedHighSpeedResolutionsFor<getDistanceBetweenPoints.onWarmupCompleted> onExtraCallbackWithResult;
    private final getMinWebSocketMessageToCompressokhttp onNavigationEvent;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsPostV2View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsPostV2View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback(TdsPostV2View tdsPostV2View, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(tdsPostV2View, quirksExternalSyntheticBackport0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 45;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    private static final Unit onNavigationEvent(TdsPostV2View tdsPostV2View, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 101;
        onWarmupCompleted = i4 % 128;
        tdsPostV2View.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i4 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i5 = onWarmupCompleted + 111;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
        return unit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011a A[PHI: r3
      0x011a: PHI (r3v19 im.toss.tds.view.compat.component.compound.post.TdsPostV2View$onExtraCallback) = 
      (r3v9 im.toss.tds.view.compat.component.compound.post.TdsPostV2View$onExtraCallback)
      (r3v17 im.toss.tds.view.compat.component.compound.post.TdsPostV2View$onExtraCallback)
      (r3v3 im.toss.tds.view.compat.component.compound.post.TdsPostV2View$onExtraCallback)
     binds: [B:36:0x0118, B:27:0x00cf, B:9:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TdsPostV2View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws NoWhenBranchMatchedException {
        super(context, attributeSet, i);
        String str = "";
        Intrinsics.checkNotNullParameter(context, "");
        Object obj = null;
        this.IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Float.valueOf(0.0f), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onNavigationEvent = new getMinWebSocketMessageToCompressokhttp((hasProvider) null, 0L, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, 65535, (DefaultConstructorMarker) null);
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(getDistanceBetweenPoints.onWarmupCompleted.Companion.onExtraCallbackWithResult(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsPostV2, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            onExtraCallback onextracallbackwithresult = onExtraCallback.C0001onExtraCallback.onExtraCallbackWithResult;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            Integer numValueOf3 = null;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.TdsPostV2_android_text) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    if (string == null) {
                        int i3 = 2 % 2;
                    } else {
                        int i4 = asInterface + 115;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        int i6 = 2 % 2;
                        str = string;
                    }
                } else if (index == R.styleable.TdsPostV2_android_textColor) {
                    numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == R.styleable.TdsPostV2_indentLevel) {
                    numValueOf2 = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.TdsPostV2_prefixNumber) {
                    numValueOf3 = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.TdsPostV2_postStyle) {
                    switch (typedArrayObtainStyledAttributes.getInt(index, 0)) {
                        case 0:
                            onextracallbackwithresult = onExtraCallback.C0001onExtraCallback.onExtraCallbackWithResult;
                            break;
                        case 1:
                            onextracallbackwithresult = onExtraCallback.IAuthTabCallback.onNavigationEvent;
                            break;
                        case 2:
                            onextracallbackwithresult = onExtraCallback.onWarmupCompleted.onWarmupCompleted;
                            break;
                        case 3:
                            onextracallbackwithresult = onExtraCallback.onNavigationEvent.onExtraCallback;
                            break;
                        case 4:
                            onextracallbackwithresult = onExtraCallback.IAuthTabCallbackStub.onExtraCallbackWithResult;
                            int i32 = 2 % 2;
                            break;
                        case 5:
                            onextracallbackwithresult = onExtraCallback.asInterface.onExtraCallback;
                            break;
                        case 6:
                            onextracallbackwithresult = onExtraCallback.IAuthTabCallbackDefault.onExtraCallbackWithResult;
                            break;
                        case 7:
                            onextracallbackwithresult = new onExtraCallback.onExtraCallbackWithResult(0, 0, null, null, 12, null);
                            break;
                        case 8:
                            onextracallbackwithresult = new onExtraCallback.asBinder(0, 0, null, null, 12, null);
                            break;
                        case 9:
                            onextracallbackwithresult = new onExtraCallback.onTransact(0, 0, null, null, 12, null);
                            break;
                        case 10:
                            onextracallbackwithresult = new onExtraCallback.getInterfaceDescriptor(0);
                            break;
                        case 11:
                            onextracallbackwithresult = new onExtraCallback.IAuthTabCallbackStubProxy(0);
                            break;
                        case 12:
                            onextracallbackwithresult = new onExtraCallback.IAuthTabCallback_Parcel(0);
                            int i7 = onWarmupCompleted + 67;
                            asInterface = i7 % 128;
                            if (i7 % 2 != 0) {
                            }
                            break;
                        default:
                            onextracallbackwithresult = onExtraCallback.C0001onExtraCallback.onExtraCallbackWithResult;
                            break;
                    }
                }
                getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp = this.onNavigationEvent;
                getminwebsocketmessagetocompressokhttp.onNavigationEvent(str);
                if (numValueOf != null) {
                    int i8 = onWarmupCompleted + 115;
                    asInterface = i8 % 128;
                    if (i8 % 2 == 0) {
                        getminwebsocketmessagetocompressokhttp.onNavigationEvent(numValueOf);
                        obj.hashCode();
                        throw null;
                    }
                    getminwebsocketmessagetocompressokhttp.onNavigationEvent(numValueOf);
                }
                setPostStyle(onextracallbackwithresult);
                if (numValueOf2 != null) {
                    setIndentLevel(numValueOf2.intValue());
                }
                if (numValueOf3 != null) {
                    setPrefixNumber(numValueOf3.intValue());
                    int i9 = onWarmupCompleted + 79;
                    asInterface = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = 2 % 2;
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsPostV2View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = asInterface + 121;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 65;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i9 = onWarmupCompleted + 107;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @Override // im.toss.tds.view.compat.component.TdsComposeView
    public void onExtraCallbackWithResult(@NotNull final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1690170798);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i5 = onWarmupCompleted + 97;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 32 : 16;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i7 = onWarmupCompleted + 115;
            asInterface = i7 % 128;
            Object obj = null;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1690170798, i2, -1, "im.toss.tds.view.compat.component.compound.post.TdsPostV2View.TdsContent (TdsPostV2View.kt:74)");
            }
            getBacktraceNote getbacktracenoteOnNavigationEvent = this.onNavigationEvent.onNavigationEvent();
            if (getbacktracenoteOnNavigationEvent == null) {
                int i8 = onWarmupCompleted + 67;
                asInterface = i8 % 128;
                if (i8 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1976545223);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1976545223);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1976545222);
                getStarPath.onExtraCallbackWithResult(-514183958, 514183960, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{getbacktracenoteOnNavigationEvent, (getDistanceBetweenPoints.onWarmupCompleted) this.onExtraCallbackWithResult.onExtraCallbackWithResult(), quirksExternalSyntheticBackport0, Float.valueOf(((Number) this.IAuthTabCallback.onExtraCallbackWithResult()).floatValue()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i2 << 6) & 896), 0}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onWarmupCompleted + 109;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.view.compat.component.compound.post.TdsPostV2View$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i11 = 2 % 2;
                    int i12 = onNavigationEvent + 83;
                    onWarmupCompleted = i12 % 128;
                    int i13 = i12 % 2;
                    TdsPostV2View tdsPostV2View = this.f$0;
                    if (i13 != 0) {
                        return TdsPostV2View.IAuthTabCallback(tdsPostV2View, quirksExternalSyntheticBackport0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    TdsPostV2View.IAuthTabCallback(tdsPostV2View, quirksExternalSyntheticBackport0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            });
        }
    }

    public final void setLowerMargin(float f) {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.IAuthTabCallback(Float.valueOf(f));
        int i4 = onWarmupCompleted + 27;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void setText(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent.onNavigationEvent(str);
        int i4 = onWarmupCompleted + 89;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setText(@NotNull hasProvider hasprovider) {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(hasprovider, "");
            this.onNavigationEvent.onNavigationEvent(hasprovider);
            throw null;
        }
        Intrinsics.checkNotNullParameter(hasprovider, "");
        this.onNavigationEvent.onNavigationEvent(hasprovider);
        int i3 = asInterface + 3;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setTextColor(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 59;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent.onNavigationEvent(Integer.valueOf(i));
        int i5 = onWarmupCompleted + 55;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
    }

    @Deprecated
    public final void setFont(@NotNull response responseVar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(responseVar, "");
        this.onNavigationEvent.onExtraCallbackWithResult().IAuthTabCallback(new GraphicDeviceInfo(responseVar.getWeight()));
        int i2 = asInterface + 21;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 23 / 0;
        }
    }

    public final void setFontWeight(@NotNull GraphicDeviceInfo graphicDeviceInfo) {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(graphicDeviceInfo, "");
        this.onNavigationEvent.onExtraCallbackWithResult().IAuthTabCallback(graphicDeviceInfo);
        int i4 = asInterface + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void setPostStyle(@NotNull onExtraCallback onextracallback) throws NoWhenBranchMatchedException {
        getDistanceBetweenPoints.onWarmupCompleted getinterfacedescriptor;
        getDistanceBetweenPoints.onWarmupCompleted iAuthTabCallbackStubProxy;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        getSupportedHighSpeedResolutionsFor<getDistanceBetweenPoints.onWarmupCompleted> getsupportedhighspeedresolutionsfor = this.onExtraCallbackWithResult;
        if (Intrinsics.areEqual(onextracallback, onExtraCallback.C0001onExtraCallback.onExtraCallbackWithResult)) {
            iAuthTabCallbackStubProxy = getDistanceBetweenPoints.onWarmupCompleted.Companion.onExtraCallbackWithResult();
        } else if (Intrinsics.areEqual(onextracallback, onExtraCallback.IAuthTabCallback.onNavigationEvent)) {
            int i2 = onWarmupCompleted + 119;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            iAuthTabCallbackStubProxy = getDistanceBetweenPoints.onWarmupCompleted.Companion.IAuthTabCallback();
        } else if (Intrinsics.areEqual(onextracallback, onExtraCallback.onWarmupCompleted.onWarmupCompleted)) {
            int i4 = onWarmupCompleted + 21;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                iAuthTabCallbackStubProxy = getDistanceBetweenPoints.onWarmupCompleted.Companion.onExtraCallback();
                int i5 = 8 / 0;
            } else {
                iAuthTabCallbackStubProxy = getDistanceBetweenPoints.onWarmupCompleted.Companion.onExtraCallback();
            }
        } else if (Intrinsics.areEqual(onextracallback, onExtraCallback.onNavigationEvent.onExtraCallback)) {
            iAuthTabCallbackStubProxy = getDistanceBetweenPoints.onWarmupCompleted.Companion.onNavigationEvent();
        } else if (Intrinsics.areEqual(onextracallback, onExtraCallback.IAuthTabCallbackStub.onExtraCallbackWithResult)) {
            iAuthTabCallbackStubProxy = getDistanceBetweenPoints.onWarmupCompleted.Companion.onWarmupCompleted();
        } else if (Intrinsics.areEqual(onextracallback, onExtraCallback.asInterface.onExtraCallback)) {
            int i6 = onWarmupCompleted + 27;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                getDistanceBetweenPoints.onWarmupCompleted.Companion.IAuthTabCallbackDefault();
                throw null;
            }
            iAuthTabCallbackStubProxy = getDistanceBetweenPoints.onWarmupCompleted.Companion.IAuthTabCallbackDefault();
            int i7 = onWarmupCompleted + 95;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
        } else if (Intrinsics.areEqual(onextracallback, onExtraCallback.IAuthTabCallbackDefault.onExtraCallbackWithResult)) {
            iAuthTabCallbackStubProxy = getDistanceBetweenPoints.onWarmupCompleted.Companion.asBinder();
        } else if (onextracallback instanceof onExtraCallback.onExtraCallbackWithResult) {
            onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallback.onExtraCallbackWithResult) onextracallback;
            iAuthTabCallbackStubProxy = new getDistanceBetweenPoints.onWarmupCompleted.asBinder(onextracallbackwithresult.onNavigationEvent(), onextracallbackwithresult.onExtraCallbackWithResult(), onextracallbackwithresult.IAuthTabCallback(), onextracallbackwithresult.onWarmupCompleted(), null);
        } else if (onextracallback instanceof onExtraCallback.asBinder) {
            onExtraCallback.asBinder asbinder = (onExtraCallback.asBinder) onextracallback;
            iAuthTabCallbackStubProxy = new getDistanceBetweenPoints.onWarmupCompleted.access100(asbinder.IAuthTabCallback(), asbinder.onExtraCallback(), asbinder.onExtraCallbackWithResult(), asbinder.onNavigationEvent(), null);
        } else if (onextracallback instanceof onExtraCallback.onTransact) {
            onExtraCallback.onTransact ontransact = (onExtraCallback.onTransact) onextracallback;
            iAuthTabCallbackStubProxy = new getDistanceBetweenPoints.onWarmupCompleted.IAuthTabCallbackStubProxy(ontransact.onExtraCallbackWithResult(), ontransact.IAuthTabCallback(), ontransact.onWarmupCompleted(), ontransact.onExtraCallback(), null);
        } else {
            if (onextracallback instanceof onExtraCallback.getInterfaceDescriptor) {
                getinterfacedescriptor = new getDistanceBetweenPoints.onWarmupCompleted.access000(((onExtraCallback.getInterfaceDescriptor) onextracallback).onExtraCallbackWithResult());
            } else if (onextracallback instanceof onExtraCallback.IAuthTabCallbackStubProxy) {
                getinterfacedescriptor = new getDistanceBetweenPoints.onWarmupCompleted.IAuthTabCallback_Parcel(((onExtraCallback.IAuthTabCallbackStubProxy) onextracallback).onNavigationEvent());
            } else {
                if (!(onextracallback instanceof onExtraCallback.IAuthTabCallback_Parcel)) {
                    throw new NoWhenBranchMatchedException();
                }
                getinterfacedescriptor = new getDistanceBetweenPoints.onWarmupCompleted.getInterfaceDescriptor(((onExtraCallback.IAuthTabCallback_Parcel) onextracallback).onNavigationEvent());
            }
            iAuthTabCallbackStubProxy = getinterfacedescriptor;
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(iAuthTabCallbackStubProxy);
    }

    public final void setIndentLevel(int i) {
        int i2 = 2 % 2;
        getDistanceBetweenPoints.onWarmupCompleted onwarmupcompleted = (getDistanceBetweenPoints.onWarmupCompleted) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        if (onwarmupcompleted instanceof getDistanceBetweenPoints.onWarmupCompleted.asBinder) {
            this.onExtraCallbackWithResult.IAuthTabCallback(getDistanceBetweenPoints.onWarmupCompleted.asBinder.onExtraCallback((getDistanceBetweenPoints.onWarmupCompleted.asBinder) onwarmupcompleted, 0, i, null, null, 13, null));
            return;
        }
        if (!(onwarmupcompleted instanceof getDistanceBetweenPoints.onWarmupCompleted.access100)) {
            if (onwarmupcompleted instanceof getDistanceBetweenPoints.onWarmupCompleted.access000) {
                this.onExtraCallbackWithResult.IAuthTabCallback(((getDistanceBetweenPoints.onWarmupCompleted.access000) onwarmupcompleted).IAuthTabCallback(i));
                return;
            } else {
                if (onwarmupcompleted instanceof getDistanceBetweenPoints.onWarmupCompleted.IAuthTabCallback_Parcel) {
                    this.onExtraCallbackWithResult.IAuthTabCallback(((getDistanceBetweenPoints.onWarmupCompleted.IAuthTabCallback_Parcel) onwarmupcompleted).onExtraCallback(i));
                    int i3 = asInterface + 71;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
                return;
            }
        }
        int i5 = asInterface + 29;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            this.onExtraCallbackWithResult.IAuthTabCallback(getDistanceBetweenPoints.onWarmupCompleted.access100.onWarmupCompleted((getDistanceBetweenPoints.onWarmupCompleted.access100) onwarmupcompleted, 0, i, null, null, 36, null));
        } else {
            this.onExtraCallbackWithResult.IAuthTabCallback(getDistanceBetweenPoints.onWarmupCompleted.access100.onWarmupCompleted((getDistanceBetweenPoints.onWarmupCompleted.access100) onwarmupcompleted, 0, i, null, null, 13, null));
        }
    }

    public final void setPrefixNumber(int i) {
        getDistanceBetweenPoints.onWarmupCompleted.access100 access100Var;
        int i2;
        GraphicDeviceInfo graphicDeviceInfo;
        setByteOrder setbyteorder;
        int i3;
        int i4 = 2 % 2;
        getDistanceBetweenPoints.onWarmupCompleted onwarmupcompleted = (getDistanceBetweenPoints.onWarmupCompleted) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        if (!(!(onwarmupcompleted instanceof getDistanceBetweenPoints.onWarmupCompleted.asBinder))) {
            int i5 = asInterface + 45;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            this.onExtraCallbackWithResult.IAuthTabCallback(getDistanceBetweenPoints.onWarmupCompleted.asBinder.onExtraCallback((getDistanceBetweenPoints.onWarmupCompleted.asBinder) onwarmupcompleted, i, 0, null, null, 14, null));
            return;
        }
        if (!(onwarmupcompleted instanceof getDistanceBetweenPoints.onWarmupCompleted.access100)) {
            return;
        }
        int i7 = onWarmupCompleted + 95;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        getSupportedHighSpeedResolutionsFor<getDistanceBetweenPoints.onWarmupCompleted> getsupportedhighspeedresolutionsfor = this.onExtraCallbackWithResult;
        if (i8 == 0) {
            access100Var = (getDistanceBetweenPoints.onWarmupCompleted.access100) onwarmupcompleted;
            i2 = 0;
            graphicDeviceInfo = null;
            setbyteorder = null;
            i3 = 61;
        } else {
            access100Var = (getDistanceBetweenPoints.onWarmupCompleted.access100) onwarmupcompleted;
            i2 = 0;
            graphicDeviceInfo = null;
            setbyteorder = null;
            i3 = 14;
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(getDistanceBetweenPoints.onWarmupCompleted.access100.onWarmupCompleted(access100Var, i, i2, graphicDeviceInfo, setbyteorder, i3, null));
    }

    public interface onExtraCallback {

        /* renamed from: im.toss.tds.view.compat.component.compound.post.TdsPostV2View$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        public static final class C0001onExtraCallback implements onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            public static final C0001onExtraCallback onExtraCallbackWithResult = new C0001onExtraCallback();
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onNavigationEvent + 85;
                onExtraCallback = i % 128;
                if (i % 2 == 0) {
                    int i2 = 62 / 0;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 43;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0001onExtraCallback)) {
                    int i5 = i2 + 109;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 29 / 0;
                    }
                    return false;
                }
                int i7 = i2 + 111;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    return true;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 107;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                int i4 = i3 + 97;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 71 / 0;
                }
                return -1368171773;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 31;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return "H1";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private C0001onExtraCallback() {
            }
        }

        public static final class IAuthTabCallback implements onExtraCallback {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback();
            private static int onWarmupCompleted;

            static {
                int i = IAuthTabCallback + 27;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 123;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (this == obj) {
                    int i4 = i3 + 13;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                }
                if (!(!(obj instanceof IAuthTabCallback))) {
                    return true;
                }
                int i6 = i3 + 51;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 9;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 121;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return -1368171772;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 89;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 125;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return "H2";
            }

            private IAuthTabCallback() {
            }
        }

        public static final class onWarmupCompleted implements onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 1;
            public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

            static {
                int i = IAuthTabCallback + 7;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onExtraCallbackWithResult + 3;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (obj instanceof onWarmupCompleted) {
                    return true;
                }
                int i4 = onExtraCallback + 105;
                int i5 = i4 % 128;
                onExtraCallbackWithResult = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 79;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 105;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                int i4 = i3 + 51;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return -1368171771;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 31;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                int i4 = i2 + 75;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return "H3";
            }

            private onWarmupCompleted() {
            }
        }

        public static final class onNavigationEvent implements onExtraCallback {
            private static int IAuthTabCallback = 1;
            public static final onNavigationEvent onExtraCallback = new onNavigationEvent();
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int i = onWarmupCompleted + 25;
                IAuthTabCallback = i % 128;
                if (i % 2 == 0) {
                    int i2 = 17 / 0;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 57;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                if (this == obj || (obj instanceof onNavigationEvent)) {
                    return true;
                }
                int i5 = i3 + 17;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 61;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 27;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return -1368171770;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 31;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 7;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 37 / 0;
                }
                return "H4";
            }

            private onNavigationEvent() {
            }
        }

        public static final class IAuthTabCallbackStub implements onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 0;
            public static final IAuthTabCallbackStub onExtraCallbackWithResult = new IAuthTabCallbackStub();
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted = 1;

            static {
                int i = onNavigationEvent + 117;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
            
                if ((r6 instanceof im.toss.tds.view.compat.component.compound.post.TdsPostV2View.onExtraCallback.IAuthTabCallbackStub) != false) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
            
                r1 = r1 + 53;
                im.toss.tds.view.compat.component.compound.post.TdsPostV2View.onExtraCallback.IAuthTabCallbackStub.IAuthTabCallback = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 25;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 22 / 0;
                }
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 93;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 49;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return 1393354228;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 119;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return "Paragraph";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private IAuthTabCallbackStub() {
            }
        }

        public static final class asInterface implements onExtraCallback {
            private static int IAuthTabCallback = 0;
            public static final asInterface onExtraCallback = new asInterface();
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallbackWithResult + 113;
                onWarmupCompleted = i % 128;
                if (i % 2 == 0) {
                    int i2 = 0 / 0;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 117;
                int i4 = i3 % 128;
                IAuthTabCallback = i4;
                int i5 = i3 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof asInterface)) {
                    int i6 = i2 + 21;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                int i8 = i4 + 47;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    return true;
                }
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 21;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 25;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return 526210931;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 31;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return "ParagraphSmall";
                }
                throw null;
            }

            private asInterface() {
            }
        }

        public static final class IAuthTabCallbackDefault implements onExtraCallback {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            public static final IAuthTabCallbackDefault onExtraCallbackWithResult = new IAuthTabCallbackDefault();
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallback + 35;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 9;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                if (this == obj) {
                    int i5 = i3 + 77;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
                if (obj instanceof IAuthTabCallbackDefault) {
                    return true;
                }
                int i7 = i3 + 21;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 43;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = i3 + 71;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return -747849085;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 53;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 13;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return "ParagraphXSmall";
                }
                throw null;
            }

            private IAuthTabCallbackDefault() {
            }
        }

        public static final class onExtraCallbackWithResult implements onExtraCallback {
            private static int asInterface = 1;
            private static int onNavigationEvent;
            private final int IAuthTabCallback;
            private final setByteOrder onExtraCallback;
            private final GraphicDeviceInfo onExtraCallbackWithResult;
            private final int onWarmupCompleted;

            public /* synthetic */ onExtraCallbackWithResult(int i, int i2, GraphicDeviceInfo graphicDeviceInfo, setByteOrder setbyteorder, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, i2, graphicDeviceInfo, setbyteorder);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onExtraCallbackWithResult)) {
                    return false;
                }
                onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
                if (this.onWarmupCompleted != onextracallbackwithresult.onWarmupCompleted) {
                    int i2 = onNavigationEvent + 89;
                    asInterface = i2 % 128;
                    return i2 % 2 == 0;
                }
                if (this.IAuthTabCallback != onextracallbackwithresult.IAuthTabCallback) {
                    int i3 = onNavigationEvent + 93;
                    asInterface = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallbackWithResult)) {
                    int i5 = onNavigationEvent + 7;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback)) {
                    int i7 = asInterface + 125;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    return true;
                }
                int i9 = asInterface + 35;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    return false;
                }
                throw null;
            }

            public int hashCode() {
                int iOnTransact;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 77;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = Integer.hashCode(this.onWarmupCompleted);
                int iHashCode2 = Integer.hashCode(this.IAuthTabCallback);
                int iHashCode3 = this.onExtraCallbackWithResult.hashCode();
                setByteOrder setbyteorder = this.onExtraCallback;
                if (setbyteorder == null) {
                    int i4 = onNavigationEvent + 115;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                    iOnTransact = 0;
                } else {
                    iOnTransact = setByteOrder.onTransact(setbyteorder.access100());
                }
                return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iOnTransact;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "OrderedList(number=" + this.onWarmupCompleted + ", indentLevel=" + this.IAuthTabCallback + ", numberFontWeight=" + this.onExtraCallbackWithResult + ", numberFontColor=" + this.onExtraCallback + ")";
                int i2 = onNavigationEvent + 37;
                asInterface = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private onExtraCallbackWithResult(int i, int i2, GraphicDeviceInfo graphicDeviceInfo, setByteOrder setbyteorder) {
                Intrinsics.checkNotNullParameter(graphicDeviceInfo, "");
                this.onWarmupCompleted = i;
                this.IAuthTabCallback = i2;
                this.onExtraCallbackWithResult = graphicDeviceInfo;
                this.onExtraCallback = setbyteorder;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ onExtraCallbackWithResult(int i, int i2, GraphicDeviceInfo graphicDeviceInfo, setByteOrder setbyteorder, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i3 & 4) != 0) {
                    int i4 = asInterface + 113;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    graphicDeviceInfo = isRepeatingEnabled.onExtraCallback.onTransact();
                    int i6 = 2 % 2;
                }
                GraphicDeviceInfo graphicDeviceInfo2 = graphicDeviceInfo;
                if ((i3 & 8) != 0) {
                    int i7 = onNavigationEvent + 55;
                    asInterface = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = 2 % 2;
                    setbyteorder = null;
                }
                this(i, i2, graphicDeviceInfo2, setbyteorder, null);
            }

            public final int onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 83;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                int i5 = this.onWarmupCompleted;
                int i6 = i2 + 7;
                asInterface = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 31 / 0;
                }
                return i5;
            }

            public final int onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 89;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int i5 = this.IAuthTabCallback;
                int i6 = i2 + 111;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    return i5;
                }
                throw null;
            }

            public final GraphicDeviceInfo IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 107;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                GraphicDeviceInfo graphicDeviceInfo = this.onExtraCallbackWithResult;
                int i5 = i2 + 93;
                asInterface = i5 % 128;
                if (i5 % 2 != 0) {
                    return graphicDeviceInfo;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final setByteOrder onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 45;
                int i3 = i2 % 128;
                asInterface = i3;
                int i4 = i2 % 2;
                setByteOrder setbyteorder = this.onExtraCallback;
                int i5 = i3 + 13;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return setbyteorder;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static final class asBinder implements onExtraCallback {
            private static int asInterface = 1;
            private static int onNavigationEvent;
            private final GraphicDeviceInfo IAuthTabCallback;
            private final int onExtraCallback;
            private final setByteOrder onExtraCallbackWithResult;
            private final int onWarmupCompleted;

            public /* synthetic */ asBinder(int i, int i2, GraphicDeviceInfo graphicDeviceInfo, setByteOrder setbyteorder, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, i2, graphicDeviceInfo, setbyteorder);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = asInterface + 13;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                if (i2 % 2 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof asBinder)) {
                    int i4 = i3 + 43;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                asBinder asbinder = (asBinder) obj;
                if (this.onExtraCallback != asbinder.onExtraCallback) {
                    int i6 = i3 + 101;
                    asInterface = i6 % 128;
                    return i6 % 2 == 0;
                }
                if (this.onWarmupCompleted != asbinder.onWarmupCompleted) {
                    int i7 = i3 + 65;
                    asInterface = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.IAuthTabCallback, asbinder.IAuthTabCallback)) {
                    return Intrinsics.areEqual(this.onExtraCallbackWithResult, asbinder.onExtraCallbackWithResult);
                }
                int i9 = onNavigationEvent + 15;
                asInterface = i9 % 128;
                return i9 % 2 == 0;
            }

            public int hashCode() {
                int iOnTransact;
                int i = 2 % 2;
                int iHashCode = Integer.hashCode(this.onExtraCallback);
                int iHashCode2 = Integer.hashCode(this.onWarmupCompleted);
                int iHashCode3 = this.IAuthTabCallback.hashCode();
                setByteOrder setbyteorder = this.onExtraCallbackWithResult;
                if (setbyteorder == null) {
                    int i2 = asInterface + 43;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    iOnTransact = 0;
                } else {
                    iOnTransact = setByteOrder.onTransact(setbyteorder.access100());
                }
                int i4 = (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iOnTransact;
                int i5 = onNavigationEvent + 3;
                asInterface = i5 % 128;
                if (i5 % 2 != 0) {
                    return i4;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "OrderedListSmall(number=" + this.onExtraCallback + ", indentLevel=" + this.onWarmupCompleted + ", numberFontWeight=" + this.IAuthTabCallback + ", numberFontColor=" + this.onExtraCallbackWithResult + ")";
                int i2 = asInterface + 73;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            private asBinder(int i, int i2, GraphicDeviceInfo graphicDeviceInfo, setByteOrder setbyteorder) {
                Intrinsics.checkNotNullParameter(graphicDeviceInfo, "");
                this.onExtraCallback = i;
                this.onWarmupCompleted = i2;
                this.IAuthTabCallback = graphicDeviceInfo;
                this.onExtraCallbackWithResult = setbyteorder;
            }

            public final int IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = asInterface + 9;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                int i5 = this.onExtraCallback;
                int i6 = i3 + 113;
                asInterface = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 56 / 0;
                }
                return i5;
            }

            public final int onExtraCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 37;
                asInterface = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i4 = this.onWarmupCompleted;
                int i5 = i2 + 89;
                asInterface = i5 % 128;
                if (i5 % 2 != 0) {
                    return i4;
                }
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ asBinder(int i, int i2, GraphicDeviceInfo graphicDeviceInfo, setByteOrder setbyteorder, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                GraphicDeviceInfo graphicDeviceInfoOnTransact = (i3 & 4) != 0 ? isRepeatingEnabled.onExtraCallback.onTransact() : graphicDeviceInfo;
                if ((i3 & 8) != 0) {
                    int i4 = onNavigationEvent;
                    int i5 = i4 + 19;
                    asInterface = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 23 / 0;
                    }
                    int i7 = i4 + 85;
                    asInterface = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 2 % 2;
                    }
                    setbyteorder = null;
                }
                this(i, i2, graphicDeviceInfoOnTransact, setbyteorder, null);
            }

            public final GraphicDeviceInfo onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = asInterface + 93;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                GraphicDeviceInfo graphicDeviceInfo = this.IAuthTabCallback;
                int i5 = i3 + 121;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 40 / 0;
                }
                return graphicDeviceInfo;
            }

            public final setByteOrder onNavigationEvent() {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 95;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                setByteOrder setbyteorder = this.onExtraCallbackWithResult;
                int i5 = i2 + 19;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 60 / 0;
                }
                return setbyteorder;
            }
        }

        public static final class onTransact implements onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int asInterface = 1;
            private final int onExtraCallback;
            private final GraphicDeviceInfo onExtraCallbackWithResult;
            private final int onNavigationEvent;
            private final setByteOrder onWarmupCompleted;

            public /* synthetic */ onTransact(int i, int i2, GraphicDeviceInfo graphicDeviceInfo, setByteOrder setbyteorder, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, i2, graphicDeviceInfo, setbyteorder);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onTransact)) {
                    int i2 = asInterface + 75;
                    IAuthTabCallback = i2 % 128;
                    return i2 % 2 != 0;
                }
                onTransact ontransact = (onTransact) obj;
                if (this.onNavigationEvent != ontransact.onNavigationEvent) {
                    return false;
                }
                if (this.onExtraCallback == ontransact.onExtraCallback) {
                    return Intrinsics.areEqual(this.onExtraCallbackWithResult, ontransact.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onWarmupCompleted, ontransact.onWarmupCompleted);
                }
                int i3 = IAuthTabCallback + 69;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }

            public int hashCode() {
                int i;
                int i2 = 2 % 2;
                int i3 = asInterface + 67;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int iHashCode = Integer.hashCode(this.onNavigationEvent);
                int iHashCode2 = Integer.hashCode(this.onExtraCallback);
                int iHashCode3 = this.onExtraCallbackWithResult.hashCode();
                setByteOrder setbyteorder = this.onWarmupCompleted;
                if (setbyteorder == null) {
                    int i5 = asInterface + 117;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    i = 0;
                } else {
                    int iOnTransact = setByteOrder.onTransact(setbyteorder.access100());
                    int i7 = IAuthTabCallback + 65;
                    asInterface = i7 % 128;
                    int i8 = i7 % 2;
                    i = iOnTransact;
                }
                return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "OrderedListXSmall(number=" + this.onNavigationEvent + ", indentLevel=" + this.onExtraCallback + ", numberFontWeight=" + this.onExtraCallbackWithResult + ", numberFontColor=" + this.onWarmupCompleted + ")";
                int i2 = IAuthTabCallback + 7;
                asInterface = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            private onTransact(int i, int i2, GraphicDeviceInfo graphicDeviceInfo, setByteOrder setbyteorder) {
                Intrinsics.checkNotNullParameter(graphicDeviceInfo, "");
                this.onNavigationEvent = i;
                this.onExtraCallback = i2;
                this.onExtraCallbackWithResult = graphicDeviceInfo;
                this.onWarmupCompleted = setbyteorder;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ onTransact(int i, int i2, GraphicDeviceInfo graphicDeviceInfo, setByteOrder setbyteorder, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                setByteOrder setbyteorder2;
                Object obj = null;
                if ((i3 & 4) != 0) {
                    int i4 = IAuthTabCallback + 107;
                    asInterface = i4 % 128;
                    if (i4 % 2 != 0) {
                        graphicDeviceInfo = isRepeatingEnabled.onExtraCallback.onTransact();
                        int i5 = 2 % 2;
                    } else {
                        isRepeatingEnabled.onExtraCallback.onTransact();
                        obj.hashCode();
                        throw null;
                    }
                }
                GraphicDeviceInfo graphicDeviceInfo2 = graphicDeviceInfo;
                if ((i3 & 8) != 0) {
                    int i6 = IAuthTabCallback + 35;
                    asInterface = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 32 / 0;
                    }
                    setbyteorder2 = null;
                } else {
                    setbyteorder2 = setbyteorder;
                }
                this(i, i2, graphicDeviceInfo2, setbyteorder2, null);
            }

            public final int onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = asInterface + 11;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.onNavigationEvent;
                }
                throw null;
            }

            public final int IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 117;
                int i3 = i2 % 128;
                asInterface = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                int i4 = this.onExtraCallback;
                int i5 = i3 + 9;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return i4;
                }
                throw null;
            }

            public final GraphicDeviceInfo onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 71;
                int i3 = i2 % 128;
                asInterface = i3;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                GraphicDeviceInfo graphicDeviceInfo = this.onExtraCallbackWithResult;
                int i4 = i3 + 101;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 10 / 0;
                }
                return graphicDeviceInfo;
            }

            public final setByteOrder onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 53;
                asInterface = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.onWarmupCompleted;
                }
                throw null;
            }
        }

        public static final class getInterfaceDescriptor implements onExtraCallback {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            private final int onExtraCallbackWithResult;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(!(obj instanceof getInterfaceDescriptor))) {
                    if (this.onExtraCallbackWithResult == ((getInterfaceDescriptor) obj).onExtraCallbackWithResult) {
                        return true;
                    }
                    int i2 = onWarmupCompleted + 83;
                    onExtraCallback = i2 % 128;
                    return i2 % 2 != 0;
                }
                int i3 = onExtraCallback;
                int i4 = i3 + 117;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 49;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    return false;
                }
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 51;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = Integer.hashCode(this.onExtraCallbackWithResult);
                int i4 = onExtraCallback + 59;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "UnorderedList(indentLevel=" + this.onExtraCallbackWithResult + ")";
                int i2 = onExtraCallback + 83;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 49 / 0;
                }
                return str;
            }

            public getInterfaceDescriptor(int i) {
                this.onExtraCallbackWithResult = i;
            }

            public final int onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 9;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = this.onExtraCallbackWithResult;
                if (i3 != 0) {
                    int i5 = 36 / 0;
                }
                return i4;
            }
        }

        public static final class IAuthTabCallbackStubProxy implements onExtraCallback {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            private final int IAuthTabCallback;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onExtraCallback + 95;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 == 0) {
                        return true;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (!(obj instanceof IAuthTabCallbackStubProxy)) {
                    return false;
                }
                if (this.IAuthTabCallback == ((IAuthTabCallbackStubProxy) obj).IAuthTabCallback) {
                    return true;
                }
                int i3 = onExtraCallback + 79;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 53;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = Integer.hashCode(this.IAuthTabCallback);
                int i4 = onExtraCallback + 91;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "UnorderedListSmall(indentLevel=" + this.IAuthTabCallback + ")";
                int i2 = onWarmupCompleted + 11;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            public IAuthTabCallbackStubProxy(int i) {
                this.IAuthTabCallback = i;
            }

            public final int onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 21;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = this.IAuthTabCallback;
                int i6 = i3 + 85;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return i5;
            }
        }

        public static final class IAuthTabCallback_Parcel implements onExtraCallback {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private final int IAuthTabCallback;

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
            
                if ((r6 instanceof im.toss.tds.view.compat.component.compound.post.TdsPostV2View.onExtraCallback.IAuthTabCallback_Parcel) != false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
            
                if (r5.IAuthTabCallback == ((im.toss.tds.view.compat.component.compound.post.TdsPostV2View.onExtraCallback.IAuthTabCallback_Parcel) r6).IAuthTabCallback) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
            
                r1 = r1 + 7;
                im.toss.tds.view.compat.component.compound.post.TdsPostV2View.onExtraCallback.IAuthTabCallback_Parcel.onExtraCallbackWithResult = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                r1 = r1 + 21;
                im.toss.tds.view.compat.component.compound.post.TdsPostV2View.onExtraCallback.IAuthTabCallback_Parcel.onExtraCallbackWithResult = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
            
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 71;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 9 / 0;
                }
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = Integer.hashCode(this.IAuthTabCallback);
                int i4 = onExtraCallbackWithResult + 17;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "UnorderedListXSmall(indentLevel=" + this.IAuthTabCallback + ")";
                int i2 = onNavigationEvent + 49;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 21 / 0;
                }
                return str;
            }

            public IAuthTabCallback_Parcel(int i) {
                this.IAuthTabCallback = i;
            }

            public final int onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 121;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int i5 = this.IAuthTabCallback;
                int i6 = i2 + 59;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return i5;
            }
        }
    }
}
