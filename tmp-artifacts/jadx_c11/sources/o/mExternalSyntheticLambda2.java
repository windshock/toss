package o;

import android.graphics.BlurMaskFilter;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.Typeface;
import androidx.compose.ui.geometry.Rect;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.tds.foundation.anim.rally.Rotate3D;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.AppLovinWebViewActivitya;
import o.hasProvider;
import o.mExternalSyntheticApiModelOutline1;
import o.mExternalSyntheticLambda2;
import o.r8lambda4tMrngQSvLENU65MlLmHwvGfT8;
import o.r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk;
import o.setByteOrder;
import o.setImageUrl;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class mExternalSyntheticLambda2 extends mExternalSyntheticLambda3 {
    private static int ICustomTabsCallback_Parcel = 1;
    private static int mayLaunchUrl;
    private final hasProvider IAuthTabCallback;
    private final getSupportedHighSpeedResolutions IAuthTabCallbackDefault;
    private getAdView IAuthTabCallbackStub;
    private final int IAuthTabCallbackStubProxy;
    private final getSupportedHighSpeedResolutions IAuthTabCallback_Parcel;
    private final float ICustomTabsCallback;
    private final getSupportedHighSpeedResolutions ICustomTabsCallbackDefault;
    private final getSupportedHighSpeedResolutions ICustomTabsCallbackStub;
    private final getSupportedHighSpeedResolutions ICustomTabsCallbackStubProxy;
    private final getSupportedHighSpeedResolutions ICustomTabsService;
    private final getSupportedHighSpeedResolutionsFor access000;
    private final Matrix access100;
    private final int asBinder;
    private final long asInterface;
    private final getSupportedHighSpeedResolutions extraCallback;
    private final getSupportedHighSpeedResolutions extraCallbackWithResult;
    private final int extraCommand;
    private final int getInterfaceDescriptor;
    private boolean isEngagementSignalsApiAvailable;
    private final getSupportedHighSpeedResolutions onActivityLayout;
    private final List<SurfaceProcessorNode> onActivityResized;
    private final getSupportedHighSpeedResolutions onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final Matrix onMessageChannelReady;
    private final getSupportedHighSpeedResolutions onMinimized;
    private final Rect onNavigationEvent;
    private final getSupportedHighSpeedResolutions onPostMessage;
    private final getSupportedHighSpeedResolutions onRelationshipValidationResult;
    private final Map<setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled, Float> onTransact;
    private final getSupportedHighSpeedResolutions onUnminimized;
    private final getSupportedHighSpeedResolutionsFor<setByteOrder> onWarmupCompleted;
    private RenderNode readTypedObject;
    private final getSupportedHighSpeedResolutions writeTypedObject;

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        static {
            int[] iArr = new int[mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault.values().length];
            try {
                iArr[mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault.Char.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault.Line.ordinal()] = 2;
                int i = onExtraCallbackWithResult + 51;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault.Word.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault.None.ordinal()] = 4;
                int i4 = onExtraCallback + 81;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            IAuthTabCallback = iArr;
            int i7 = onExtraCallbackWithResult + 53;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ mExternalSyntheticLambda2(hasProvider hasprovider, long j, int i, int i2, float f, Rect rect, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(hasprovider, j, i, i2, f, rect, i3, i4, i5);
    }

    public static /* synthetic */ Unit IAuthTabCallback(Canvas canvas, mExternalSyntheticLambda2 mexternalsyntheticlambda2, r8lambda4tMrngQSvLENU65MlLmHwvGfT8 r8lambda4tmrngqsvlenu65mllmhwvgft8, float f, float f2, r8lambda4tMrngQSvLENU65MlLmHwvGfT8 r8lambda4tmrngqsvlenu65mllmhwvgft82) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 65;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(canvas, mexternalsyntheticlambda2, r8lambda4tmrngqsvlenu65mllmhwvgft8, f, f2, r8lambda4tmrngqsvlenu65mllmhwvgft82);
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i3);
        int i9 = (~(i7 | i)) | i8 | (~(i3 | i));
        int i10 = (~((~i3) | i4)) | (~(i4 | i));
        int i11 = (~((~i) | i7)) | i8;
        int i12 = i4 + i3 + i6 + (1821889583 * i2) + ((-349070011) * i5);
        int i13 = i12 * i12;
        int i14 = (575745661 * i4) + 325058560 + (1920428227 * i3) + (i9 * 448227522) + ((-448227522) * i10) + (448227522 * i11) + (1472200704 * i6) + (473956352 * i2) + (1723858944 * i5) + ((-1436549120) * i13);
        int i15 = (i4 * 921699331) + 387174459 + (i3 * 921699517) + (i9 * 62) + (i10 * (-62)) + (i11 * 62) + (i6 * 921699455) + (i2 * 347275089) + (i5 * 1925323067) + (i13 * 94371840);
        switch (i14 + (i15 * i15 * (-174063616))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                mExternalSyntheticLambda2 mexternalsyntheticlambda2 = (mExternalSyntheticLambda2) objArr[0];
                int i16 = 2 % 2;
                int i17 = mayLaunchUrl + 109;
                ICustomTabsCallback_Parcel = i17 % 128;
                int i18 = i17 % 2;
                float fOnNavigationEvent = mexternalsyntheticlambda2.ICustomTabsCallbackStubProxy.onNavigationEvent();
                int i19 = ICustomTabsCallback_Parcel + 65;
                mayLaunchUrl = i19 % 128;
                int i20 = i19 % 2;
                return Float.valueOf(fOnNavigationEvent);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                mExternalSyntheticLambda2 mexternalsyntheticlambda22 = (mExternalSyntheticLambda2) objArr[0];
                int i21 = 2 % 2;
                int i22 = ICustomTabsCallback_Parcel + 45;
                mayLaunchUrl = i22 % 128;
                int i23 = i22 % 2;
                float fOnNavigationEvent2 = mexternalsyntheticlambda22.ICustomTabsCallbackDefault.onNavigationEvent();
                int i24 = ICustomTabsCallback_Parcel + 17;
                mayLaunchUrl = i24 % 128;
                int i25 = i24 % 2;
                return Float.valueOf(fOnNavigationEvent2);
            case 7:
                return onExtraCallbackWithResult(objArr);
            default:
                mExternalSyntheticLambda2 mexternalsyntheticlambda23 = (mExternalSyntheticLambda2) objArr[0];
                Float f = (Float) objArr[1];
                int i26 = 2 % 2;
                int i27 = ICustomTabsCallback_Parcel + 5;
                mayLaunchUrl = i27 % 128;
                int i28 = i27 % 2;
                mexternalsyntheticlambda23.access000.IAuthTabCallback(f);
                int i29 = mayLaunchUrl + 101;
                ICustomTabsCallback_Parcel = i29 % 128;
                int i30 = i29 % 2;
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private mExternalSyntheticLambda2(hasProvider hasprovider, long j, int i, int i2, float f, Rect rect, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(hasprovider, "");
        Intrinsics.checkNotNullParameter(rect, "");
        this.IAuthTabCallback = hasprovider;
        this.IAuthTabCallbackStubProxy = i;
        this.asBinder = i2;
        this.ICustomTabsCallback = f;
        this.onNavigationEvent = rect;
        this.onExtraCallbackWithResult = i3;
        this.extraCommand = i4;
        this.getInterfaceDescriptor = i5;
        this.ICustomTabsCallbackDefault = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
        this.ICustomTabsService = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
        this.onUnminimized = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
        this.onRelationshipValidationResult = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
        this.writeTypedObject = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
        this.extraCallbackWithResult = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
        this.extraCallback = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
        Object obj = null;
        this.access000 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallback_Parcel = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(1.0f);
        this.IAuthTabCallbackDefault = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(1.0f);
        this.onActivityLayout = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(1.0f);
        this.onPostMessage = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(1.0f);
        this.onMinimized = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(1.0f);
        this.ICustomTabsCallbackStub = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.5f);
        this.ICustomTabsCallbackStubProxy = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.5f);
        this.onExtraCallback = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
        this.IAuthTabCallbackStub = getAdView.Companion.onExtraCallbackWithResult();
        this.onMessageChannelReady = new Matrix();
        this.access100 = new Matrix();
        this.onActivityResized = new ArrayList();
        int i6 = 2 % 2;
        for (hasProvider.onExtraCallbackWithResult onextracallbackwithresult : hasprovider.onWarmupCompleted()) {
            this.onActivityResized.add(onextracallbackwithresult.onExtraCallback());
            long jOnExtraCallback = ((SurfaceProcessorNode) onextracallbackwithresult.onExtraCallback()).onExtraCallback();
            if (jOnExtraCallback != 16) {
                int i7 = mayLaunchUrl + 71;
                ICustomTabsCallback_Parcel = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
                j = jOnExtraCallback;
            }
        }
        this.asInterface = j;
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setByteOrder.onNavigationEvent(j), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onTransact = new LinkedHashMap();
        int i8 = mayLaunchUrl + 99;
        ICustomTabsCallback_Parcel = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 47;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        this.isEngagementSignalsApiAvailable = z;
        int i5 = i2 + 61;
        mayLaunchUrl = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r5 == 2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        r2 = o.mExternalSyntheticLambda2.mayLaunchUrl + 39;
        r3 = r2 % 128;
        o.mExternalSyntheticLambda2.ICustomTabsCallback_Parcel = r3;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r5 == 3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r3 = r3 + 75;
        r2 = r3 % 128;
        o.mExternalSyntheticLambda2.mayLaunchUrl = r2;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r5 != 4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r2 = r2 + 121;
        o.mExternalSyntheticLambda2.ICustomTabsCallback_Parcel = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        return r4.extraCommand;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        r5 = r4.getInterfaceDescriptor;
        r2 = o.mExternalSyntheticLambda2.ICustomTabsCallback_Parcel + 31;
        o.mExternalSyntheticLambda2.mayLaunchUrl = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if ((r2 % 2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        r0 = 9 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        return r4.onExtraCallbackWithResult;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r5 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r5 != 1) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int onWarmupCompleted(@NotNull mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        int i;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback_Parcel + 81;
        mayLaunchUrl = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
            i = onExtraCallback.IAuthTabCallback[iAuthTabCallbackDefault.ordinal()];
        } else {
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
            i = onExtraCallback.IAuthTabCallback[iAuthTabCallbackDefault.ordinal()];
        }
    }

    @Override // o.setCreativeDebuggerEnabled
    public void onExtraCallbackWithResult(@NotNull isCreativeDebuggerEnabled iscreativedebuggerenabled, float f) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
        Object obj = null;
        if (!Intrinsics.areEqual(this.onTransact.get(iscreativedebuggerenabled.IAuthTabCallback()), f)) {
            this.onTransact.put(iscreativedebuggerenabled.IAuthTabCallback(), Float.valueOf(f));
            if (iscreativedebuggerenabled instanceof AppLovinWebViewActivitya.onNavigationEvent) {
                onNavigationEvent(new Object[]{this, Float.valueOf(f)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1213232967, -1213232963, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                return;
            }
            if (iscreativedebuggerenabled instanceof AppLovinWebViewActivitya.onExtraCallbackWithResult) {
                onNavigationEvent(new Object[]{this, Float.valueOf(f)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1720582926, 1720582929, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                return;
            }
            if (iscreativedebuggerenabled instanceof r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk.onWarmupCompleted) {
                getInterfaceDescriptor(f);
                return;
            }
            if (iscreativedebuggerenabled instanceof r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk.IAuthTabCallback) {
                IAuthTabCallbackStubProxy(f);
                return;
            }
            if (iscreativedebuggerenabled instanceof Rotate3D.X) {
                int i2 = mayLaunchUrl + 107;
                ICustomTabsCallback_Parcel = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallback(f);
                return;
            }
            if (iscreativedebuggerenabled instanceof Rotate3D.Y) {
                onWarmupCompleted(f);
                return;
            }
            if (iscreativedebuggerenabled instanceof Rotate3D.Z) {
                asBinder(f);
                return;
            }
            if (iscreativedebuggerenabled instanceof setUserIdentifier) {
                onNavigationEvent(new Object[]{this, Float.valueOf(f)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1104242191, -1104242191, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                return;
            }
            if (iscreativedebuggerenabled instanceof setVerboseLogging) {
                onNavigationEvent(new Object[]{this, Float.valueOf(RangesKt.coerceIn(f, 0.0f, 1.0f))}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 591623534, -591623529, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                return;
            }
            if (iscreativedebuggerenabled instanceof isTv) {
                IAuthTabCallbackDefault(f);
                return;
            }
            if (iscreativedebuggerenabled instanceof isFireTv) {
                int i4 = ICustomTabsCallback_Parcel + 101;
                mayLaunchUrl = i4 % 128;
                if (i4 % 2 == 0) {
                    asInterface(f);
                    return;
                } else {
                    asInterface(f);
                    obj.hashCode();
                    throw null;
                }
            }
            if (iscreativedebuggerenabled instanceof isSdkVersionGreaterThanOrEqualTo) {
                onTransact(f);
                return;
            }
            if (iscreativedebuggerenabled instanceof setImageUrl.onWarmupCompleted) {
                int i5 = mayLaunchUrl + 93;
                ICustomTabsCallback_Parcel = i5 % 128;
                if (i5 % 2 != 0) {
                    onNavigationEvent(new Object[]{this, Float.valueOf(f)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1120752608, 1120752615, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                    return;
                } else {
                    onNavigationEvent(new Object[]{this, Float.valueOf(f)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1120752608, 1120752615, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                    throw null;
                }
            }
            if (iscreativedebuggerenabled instanceof setImageUrl.onExtraCallbackWithResult) {
                access000(f);
                return;
            }
            if (iscreativedebuggerenabled instanceof AppLovinSdkUtilsSize) {
                AppLovinSdkUtilsSize appLovinSdkUtilsSize = (AppLovinSdkUtilsSize) iscreativedebuggerenabled;
                Integer numOnExtraCallback = appLovinSdkUtilsSize.onExtraCallback();
                long jOnExtraCallback = numOnExtraCallback != null ? ByteOrderedDataOutputStream.onExtraCallback(numOnExtraCallback.intValue()) : this.asInterface;
                Integer numOnExtraCallbackWithResult = appLovinSdkUtilsSize.onExtraCallbackWithResult();
                long jOnExtraCallback2 = numOnExtraCallbackWithResult != null ? ByteOrderedDataOutputStream.onExtraCallback(numOnExtraCallbackWithResult.intValue()) : this.asInterface;
                if (!setByteOrder.onExtraCallbackWithResult(jOnExtraCallback, this.IAuthTabCallbackStub.onExtraCallback().access100()) || !setByteOrder.onExtraCallbackWithResult(jOnExtraCallback2, this.IAuthTabCallbackStub.onWarmupCompleted().access100())) {
                    this.IAuthTabCallbackStub = new getAdView(jOnExtraCallback, jOnExtraCallback2, null);
                }
                onExtraCallbackWithResult(this.IAuthTabCallbackStub.onExtraCallbackWithResult(f));
                return;
            }
            if (!(iscreativedebuggerenabled instanceof showMediationDebugger)) {
                int i6 = ICustomTabsCallback_Parcel + 21;
                int i7 = i6 % 128;
                mayLaunchUrl = i7;
                if (i6 % 2 != 0) {
                    boolean z = iscreativedebuggerenabled instanceof onSdkInitialized;
                    throw null;
                }
                if (!(iscreativedebuggerenabled instanceof onSdkInitialized)) {
                    int i8 = i7 + 93;
                    ICustomTabsCallback_Parcel = i8 % 128;
                    if (i8 % 2 == 0) {
                        boolean z2 = iscreativedebuggerenabled instanceof AppLovinSdkInitializationConfiguration;
                        throw null;
                    }
                    if (!(iscreativedebuggerenabled instanceof AppLovinSdkInitializationConfiguration)) {
                        if (iscreativedebuggerenabled instanceof onReceivedEvent) {
                            ((onReceivedEvent) iscreativedebuggerenabled).onExtraCallbackWithResult().invoke(Float.valueOf(f));
                        }
                    }
                }
            }
            IAuthTabCallback(f);
            return;
        }
        int i9 = mayLaunchUrl + 69;
        ICustomTabsCallback_Parcel = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.setCreativeDebuggerEnabled
    public Float onWarmupCompleted(@NotNull isCreativeDebuggerEnabled iscreativedebuggerenabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
        if (iscreativedebuggerenabled instanceof AppLovinWebViewActivitya.onNavigationEvent) {
            return Float.valueOf(((Float) onNavigationEvent(new Object[]{this}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -926548060, 926548066, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).floatValue());
        }
        Object obj = null;
        if (iscreativedebuggerenabled instanceof AppLovinWebViewActivitya.onExtraCallbackWithResult) {
            int i2 = mayLaunchUrl + 43;
            ICustomTabsCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                return Float.valueOf(readTypedObject());
            }
            Float.valueOf(readTypedObject());
            obj.hashCode();
            throw null;
        }
        if (iscreativedebuggerenabled instanceof r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk.onWarmupCompleted) {
            return Float.valueOf(access000());
        }
        if (iscreativedebuggerenabled instanceof r8lambdaxR7N6f_4q7KerXY7LkZD2yTBk.IAuthTabCallback) {
            return Float.valueOf(getInterfaceDescriptor());
        }
        if (iscreativedebuggerenabled instanceof Rotate3D.X) {
            int i3 = ICustomTabsCallback_Parcel + 71;
            mayLaunchUrl = i3 % 128;
            if (i3 % 2 == 0) {
                return Float.valueOf(onExtraCallbackWithResult());
            }
            Float.valueOf(onExtraCallbackWithResult());
            throw null;
        }
        if (iscreativedebuggerenabled instanceof Rotate3D.Y) {
            int i4 = mayLaunchUrl + 35;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return Float.valueOf(onTransact());
        }
        if (iscreativedebuggerenabled instanceof Rotate3D.Z) {
            return Float.valueOf(asBinder());
        }
        if (iscreativedebuggerenabled instanceof setUserIdentifier) {
            int i6 = mayLaunchUrl + 77;
            ICustomTabsCallback_Parcel = i6 % 128;
            return i6 % 2 == 0 ? Float.valueOf(2.0f) : Float.valueOf(0.0f);
        }
        if (iscreativedebuggerenabled instanceof setVerboseLogging) {
            return Float.valueOf(IAuthTabCallback());
        }
        if (iscreativedebuggerenabled instanceof isTv) {
            return Float.valueOf(IAuthTabCallbackDefault());
        }
        if (iscreativedebuggerenabled instanceof isFireTv) {
            int i7 = mayLaunchUrl + 79;
            ICustomTabsCallback_Parcel = i7 % 128;
            if (i7 % 2 != 0) {
                return Float.valueOf(asInterface());
            }
            Float.valueOf(asInterface());
            obj.hashCode();
            throw null;
        }
        if (iscreativedebuggerenabled instanceof isSdkVersionGreaterThanOrEqualTo) {
            return Float.valueOf(IAuthTabCallbackStub());
        }
        if (iscreativedebuggerenabled instanceof setImageUrl.onWarmupCompleted) {
            int i8 = ICustomTabsCallback_Parcel + 113;
            mayLaunchUrl = i8 % 128;
            if (i8 % 2 == 0) {
                return Float.valueOf(access100());
            }
            Float.valueOf(access100());
            throw null;
        }
        if (!(!(iscreativedebuggerenabled instanceof setImageUrl.onExtraCallbackWithResult))) {
            return Float.valueOf(((Float) onNavigationEvent(new Object[]{this}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1778380464, 1778380466, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).floatValue());
        }
        if (!(iscreativedebuggerenabled instanceof showMediationDebugger)) {
            int i9 = mayLaunchUrl + 77;
            int i10 = i9 % 128;
            ICustomTabsCallback_Parcel = i10;
            int i11 = i9 % 2;
            if (!(iscreativedebuggerenabled instanceof onSdkInitialized)) {
                int i12 = i10 + 25;
                int i13 = i12 % 128;
                mayLaunchUrl = i13;
                int i14 = i12 % 2;
                if (!(iscreativedebuggerenabled instanceof AppLovinSdkInitializationConfiguration)) {
                    int i15 = i13 + 111;
                    int i16 = i15 % 128;
                    ICustomTabsCallback_Parcel = i16;
                    int i17 = i15 % 2;
                    int i18 = i16 + 13;
                    mayLaunchUrl = i18 % 128;
                    if (i18 % 2 == 0) {
                        return null;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
        }
        return Float.valueOf(onExtraCallback());
    }

    public final void extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 99;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.onTransact.clear();
        onNavigationEvent(new Object[]{this, Float.valueOf(0.0f)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1213232967, -1213232963, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        onNavigationEvent(new Object[]{this, Float.valueOf(0.0f)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1720582926, 1720582929, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        getInterfaceDescriptor(0.0f);
        IAuthTabCallbackStubProxy(0.0f);
        onExtraCallback(0.0f);
        onWarmupCompleted(0.0f);
        asBinder(0.0f);
        onNavigationEvent(new Object[]{this, null}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1104242191, -1104242191, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        onNavigationEvent(new Object[]{this, Float.valueOf(1.0f)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 591623534, -591623529, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        asInterface(1.0f);
        onTransact(1.0f);
        IAuthTabCallbackDefault(1.0f);
        onNavigationEvent(new Object[]{this, Float.valueOf(0.5f)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1120752608, 1120752615, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        access000(0.5f);
        IAuthTabCallback(0.0f);
        this.isEngagementSignalsApiAvailable = false;
        this.IAuthTabCallbackStub = getAdView.Companion.onExtraCallbackWithResult();
        onExtraCallbackWithResult(this.asInterface);
        this.readTypedObject = null;
        int i4 = ICustomTabsCallback_Parcel + 101;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(Canvas canvas, mExternalSyntheticLambda2 mexternalsyntheticlambda2, r8lambda4tMrngQSvLENU65MlLmHwvGfT8 r8lambda4tmrngqsvlenu65mllmhwvgft8, float f, float f2, r8lambda4tMrngQSvLENU65MlLmHwvGfT8 r8lambda4tmrngqsvlenu65mllmhwvgft82) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 85;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda4tmrngqsvlenu65mllmhwvgft82, "");
        Shader shader = r8lambda4tmrngqsvlenu65mllmhwvgft8.getShader();
        if (shader == null) {
            canvas.drawText(mexternalsyntheticlambda2.IAuthTabCallback.onTransact(), 0.0f, 0.0f, r8lambda4tmrngqsvlenu65mllmhwvgft8);
        } else {
            shader.getLocalMatrix(mexternalsyntheticlambda2.access100);
            mexternalsyntheticlambda2.onMessageChannelReady.set(mexternalsyntheticlambda2.access100);
            mexternalsyntheticlambda2.onMessageChannelReady.postTranslate(-f, -f2);
            shader.setLocalMatrix(mexternalsyntheticlambda2.onMessageChannelReady);
            canvas.drawText(mexternalsyntheticlambda2.IAuthTabCallback.onTransact(), 0.0f, 0.0f, r8lambda4tmrngqsvlenu65mllmhwvgft8);
            shader.setLocalMatrix(mexternalsyntheticlambda2.access100);
            int i4 = mayLaunchUrl + 33;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        SurfaceProcessorNodeOut surfaceProcessorNodeOut = (SurfaceProcessorNodeOut) objArr[1];
        int i = 2 % 2;
        Paint.FontMetrics fontMetrics = ((r8lambda4tMrngQSvLENU65MlLmHwvGfT8) objArr[2]).getFontMetrics();
        int iIAuthTabCallbackDefault = surfaceProcessorNodeOut.IAuthTabCallbackDefault();
        float fMax = -3.4028235E38f;
        float fMax2 = -3.4028235E38f;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < iIAuthTabCallbackDefault; i2++) {
            int i3 = mayLaunchUrl + 55;
            ICustomTabsCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            fMin = Math.min(fMin, surfaceProcessorNodeOut.asInterface(i2));
            fMax2 = Math.max(fMax2, surfaceProcessorNodeOut.onTransact(i2));
            float fOnExtraCallback = surfaceProcessorNodeOut.onExtraCallback(i2);
            fMin2 = Math.min(fMin2, fontMetrics.ascent + fOnExtraCallback);
            fMax = Math.max(fMax, fOnExtraCallback + fontMetrics.descent);
        }
        if (fMin != Float.MAX_VALUE) {
            int i5 = ICustomTabsCallback_Parcel;
            int i6 = i5 + 75;
            mayLaunchUrl = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 20 / 0;
                if (fMin2 != Float.MAX_VALUE) {
                    if (fMax2 != -3.4028235E38f) {
                        int i8 = i5 + 73;
                        int i9 = i8 % 128;
                        mayLaunchUrl = i9;
                        int i10 = i8 % 2;
                        if (fMax != -3.4028235E38f) {
                            int i11 = i9 + 61;
                            ICustomTabsCallback_Parcel = i11 % 128;
                            if (i11 % 2 == 0) {
                                int i12 = 85 / 0;
                                if (fMax2 > fMin) {
                                    if (fMax > fMin2) {
                                        return new Rect(fMin, fMin2, fMax2, fMax);
                                    }
                                }
                            } else if (fMax2 > fMin) {
                            }
                        }
                    }
                }
            } else if (fMin2 != Float.MAX_VALUE) {
            }
        }
        Rect rect = new Rect(0.0f, 0.0f, (int) (surfaceProcessorNodeOut.asBinder() >> 32), (int) surfaceProcessorNodeOut.asBinder());
        int i13 = mayLaunchUrl + 3;
        ICustomTabsCallback_Parcel = i13 % 128;
        int i14 = i13 % 2;
        return rect;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(r8lambda4tMrngQSvLENU65MlLmHwvGfT8 r8lambda4tmrngqsvlenu65mllmhwvgft8, List<SurfaceProcessorNode> list, setTaggedAddrCtrl<? super getSurfaceSize, ? super GraphicDeviceInfo, ? super use, ? super delete, ? extends Typeface> settaggedaddrctrl, Function1<? super r8lambda4tMrngQSvLENU65MlLmHwvGfT8, Unit> function1) {
        char c;
        int iOnWarmupCompleted;
        int i = 2 % 2;
        int color = r8lambda4tmrngqsvlenu65mllmhwvgft8.getColor();
        Typeface typeface = r8lambda4tmrngqsvlenu65mllmhwvgft8.getTypeface();
        int alpha = r8lambda4tmrngqsvlenu65mllmhwvgft8.getAlpha();
        Shader shader = r8lambda4tmrngqsvlenu65mllmhwvgft8.getShader();
        getAdView getadview = this.IAuthTabCallbackStub;
        long jAccess100 = getadview.onExtraCallback().access100();
        setByteOrder.onExtraCallbackWithResult onextracallbackwithresult = setByteOrder.Companion;
        if (!setByteOrder.onExtraCallbackWithResult(jAccess100, onextracallbackwithresult.onTransact()) && !setByteOrder.onExtraCallbackWithResult(getadview.onWarmupCompleted().access100(), onextracallbackwithresult.onTransact()) && writeTypedObject() != 16) {
            int i2 = ICustomTabsCallback_Parcel + 25;
            mayLaunchUrl = i2 % 128;
            if (i2 % 2 != 0) {
                r8lambda4tmrngqsvlenu65mllmhwvgft8.onExtraCallback(writeTypedObject());
                int i3 = 66 / 0;
            } else {
                r8lambda4tmrngqsvlenu65mllmhwvgft8.onExtraCallback(writeTypedObject());
            }
        }
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            SurfaceProcessorNode surfaceProcessorNode = list.get(i4);
            getAdView getadview2 = this.IAuthTabCallbackStub;
            int i5 = color;
            long jAccess1002 = getadview2.onExtraCallback().access100();
            setByteOrder.onExtraCallbackWithResult onextracallbackwithresult2 = setByteOrder.Companion;
            if ((setByteOrder.onExtraCallbackWithResult(jAccess1002, onextracallbackwithresult2.onTransact()) || setByteOrder.onExtraCallbackWithResult(getadview2.onWarmupCompleted().access100(), onextracallbackwithresult2.onTransact())) && surfaceProcessorNode.onExtraCallback() != 16) {
                int i6 = mayLaunchUrl + 11;
                ICustomTabsCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                r8lambda4tmrngqsvlenu65mllmhwvgft8.onExtraCallback(surfaceProcessorNode.onExtraCallback());
            }
            if (surfaceProcessorNode.onTransact() == null) {
                int i8 = ICustomTabsCallback_Parcel + 83;
                mayLaunchUrl = i8 % 128;
                Object obj = null;
                if (i8 % 2 != 0) {
                    surfaceProcessorNode.access000();
                    throw null;
                }
                if (surfaceProcessorNode.access000() == null && surfaceProcessorNode.IAuthTabCallbackStub() == null) {
                    int i9 = ICustomTabsCallback_Parcel + 5;
                    mayLaunchUrl = i9 % 128;
                    if (i9 % 2 != 0) {
                        surfaceProcessorNode.access100();
                        obj.hashCode();
                        throw null;
                    }
                    if (surfaceProcessorNode.access100() == null) {
                        c = 2;
                    }
                } else {
                    getSurfaceSize getsurfacesizeOnTransact = surfaceProcessorNode.onTransact();
                    if (getsurfacesizeOnTransact == null) {
                        getsurfacesizeOnTransact = setMaxPreloadedAdCount.Companion.onExtraCallbackWithResult();
                    }
                    GraphicDeviceInfo graphicDeviceInfoAccess000 = surfaceProcessorNode.access000();
                    if (graphicDeviceInfoAccess000 == null) {
                        graphicDeviceInfoAccess000 = (GraphicDeviceInfo) isRepeatingEnabled.IAuthTabCallback(new Object[]{isRepeatingEnabled.onExtraCallback}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1863337886, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1863337887);
                    }
                    use useVarIAuthTabCallbackStub = surfaceProcessorNode.IAuthTabCallbackStub();
                    if (useVarIAuthTabCallbackStub != null) {
                        iOnWarmupCompleted = useVarIAuthTabCallbackStub.onExtraCallback();
                        int i10 = mayLaunchUrl + 69;
                        ICustomTabsCallback_Parcel = i10 % 128;
                        c = 2;
                        int i11 = i10 % 2;
                    } else {
                        c = 2;
                        iOnWarmupCompleted = use.Companion.onWarmupCompleted();
                    }
                    use useVarIAuthTabCallback = use.IAuthTabCallback(iOnWarmupCompleted);
                    delete deleteVarAccess100 = surfaceProcessorNode.access100();
                    Typeface typeface2 = (Typeface) settaggedaddrctrl.invoke(getsurfacesizeOnTransact, graphicDeviceInfoAccess000, useVarIAuthTabCallback, delete.IAuthTabCallback(deleteVarAccess100 != null ? deleteVarAccess100.IAuthTabCallback() : delete.Companion.onWarmupCompleted()));
                    if (typeface2 != null) {
                        r8lambda4tmrngqsvlenu65mllmhwvgft8.setTypeface(typeface2);
                    }
                }
            }
            i4++;
            color = i5;
        }
        int i12 = color;
        if (IAuthTabCallback() > 0.0f) {
            r8lambda4tmrngqsvlenu65mllmhwvgft8.setAlpha(RangesKt.coerceIn((int) (r8lambda4tmrngqsvlenu65mllmhwvgft8.getAlpha() * IAuthTabCallback() * onNavigationEvent()), 0, 255));
            function1.invoke(r8lambda4tmrngqsvlenu65mllmhwvgft8);
            r8lambda4tmrngqsvlenu65mllmhwvgft8.setAlpha(alpha);
        }
        r8lambda4tmrngqsvlenu65mllmhwvgft8.setColor(i12);
        r8lambda4tmrngqsvlenu65mllmhwvgft8.setTypeface(typeface);
        r8lambda4tmrngqsvlenu65mllmhwvgft8.setShader(shader);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        mExternalSyntheticLambda2 mexternalsyntheticlambda2 = (mExternalSyntheticLambda2) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 25;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            mexternalsyntheticlambda2.ICustomTabsCallbackDefault.onNavigationEvent(fFloatValue);
            return null;
        }
        mexternalsyntheticlambda2.ICustomTabsCallbackDefault.onNavigationEvent(fFloatValue);
        throw null;
    }

    public final float readTypedObject() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 17;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            float fOnNavigationEvent = this.ICustomTabsService.onNavigationEvent();
            int i3 = ICustomTabsCallback_Parcel + 125;
            mayLaunchUrl = i3 % 128;
            int i4 = i3 % 2;
            return fOnNavigationEvent;
        }
        this.ICustomTabsService.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        mExternalSyntheticLambda2 mexternalsyntheticlambda2 = (mExternalSyntheticLambda2) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 19;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            mexternalsyntheticlambda2.ICustomTabsService.onNavigationEvent(fFloatValue);
            int i3 = ICustomTabsCallback_Parcel + 95;
            mayLaunchUrl = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            throw null;
        }
        mexternalsyntheticlambda2.ICustomTabsService.onNavigationEvent(fFloatValue);
        throw null;
    }

    public final float access000() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 13;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onUnminimized.onNavigationEvent();
        }
        this.onUnminimized.onNavigationEvent();
        throw null;
    }

    private final void getInterfaceDescriptor(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 109;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 != 0) {
            this.onUnminimized.onNavigationEvent(f);
            int i3 = 15 / 0;
        } else {
            this.onUnminimized.onNavigationEvent(f);
        }
        int i4 = ICustomTabsCallback_Parcel + 1;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
    }

    public final float getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 1;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = this.onRelationshipValidationResult.onNavigationEvent();
        int i4 = mayLaunchUrl + 23;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return fOnNavigationEvent;
        }
        throw null;
    }

    private final void IAuthTabCallbackStubProxy(float f) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 27;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.onRelationshipValidationResult.onNavigationEvent(f);
        int i4 = mayLaunchUrl + 83;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 79;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = this.writeTypedObject.onNavigationEvent();
        int i4 = mayLaunchUrl + 1;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    private final void onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 123;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            this.writeTypedObject.onNavigationEvent(f);
            int i3 = mayLaunchUrl + 31;
            ICustomTabsCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 83 / 0;
                return;
            }
            return;
        }
        this.writeTypedObject.onNavigationEvent(f);
        throw null;
    }

    public final float onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 37;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = this.extraCallbackWithResult.onNavigationEvent();
        int i4 = mayLaunchUrl + 99;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return fOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 17;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            this.extraCallbackWithResult.onNavigationEvent(f);
            int i3 = mayLaunchUrl + 37;
            ICustomTabsCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 46 / 0;
                return;
            }
            return;
        }
        this.extraCallbackWithResult.onNavigationEvent(f);
        throw null;
    }

    public final float asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 83;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            float fOnNavigationEvent = this.extraCallback.onNavigationEvent();
            int i3 = mayLaunchUrl + 113;
            ICustomTabsCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            return fOnNavigationEvent;
        }
        this.extraCallback.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void asBinder(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 25;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            this.extraCallback.onNavigationEvent(f);
            int i3 = ICustomTabsCallback_Parcel + 69;
            mayLaunchUrl = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.extraCallback.onNavigationEvent(f);
        throw null;
    }

    public final Float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 31;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            Float f = (Float) this.access000.onExtraCallbackWithResult();
            int i3 = mayLaunchUrl + 113;
            ICustomTabsCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 27;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = this.IAuthTabCallback_Parcel.onNavigationEvent();
        int i4 = ICustomTabsCallback_Parcel + 9;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        mExternalSyntheticLambda2 mexternalsyntheticlambda2 = (mExternalSyntheticLambda2) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 101;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        mexternalsyntheticlambda2.IAuthTabCallback_Parcel.onNavigationEvent(fFloatValue);
        int i4 = mayLaunchUrl + 109;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return null;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 81;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = this.IAuthTabCallbackDefault.onNavigationEvent();
        int i4 = ICustomTabsCallback_Parcel + 59;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    public final void onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 85;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            this.IAuthTabCallbackDefault.onNavigationEvent(f);
            int i3 = 70 / 0;
        } else {
            this.IAuthTabCallbackDefault.onNavigationEvent(f);
        }
    }

    public final float asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 53;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = this.onActivityLayout.onNavigationEvent();
        int i4 = mayLaunchUrl + 73;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    private final void asInterface(float f) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 109;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            this.onActivityLayout.onNavigationEvent(f);
            int i3 = ICustomTabsCallback_Parcel + 121;
            mayLaunchUrl = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.onActivityLayout.onNavigationEvent(f);
        throw null;
    }

    public final float IAuthTabCallbackStub() {
        float fOnNavigationEvent;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 9;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 != 0) {
            fOnNavigationEvent = this.onPostMessage.onNavigationEvent();
            int i3 = 83 / 0;
        } else {
            fOnNavigationEvent = this.onPostMessage.onNavigationEvent();
        }
        int i4 = ICustomTabsCallback_Parcel + 5;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            return fOnNavigationEvent;
        }
        throw null;
    }

    private final void onTransact(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 69;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        this.onPostMessage.onNavigationEvent(f);
        int i4 = mayLaunchUrl + 47;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public final float IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 21;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = this.onMinimized.onNavigationEvent();
        int i4 = mayLaunchUrl + 7;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return fOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallbackDefault(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 49;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        this.onMinimized.onNavigationEvent(f);
        int i4 = ICustomTabsCallback_Parcel + 47;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
    }

    public final float access100() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 103;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ICustomTabsCallbackStub.onNavigationEvent();
        }
        this.ICustomTabsCallbackStub.onNavigationEvent();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        mExternalSyntheticLambda2 mexternalsyntheticlambda2 = (mExternalSyntheticLambda2) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 61;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            mexternalsyntheticlambda2.ICustomTabsCallbackStub.onNavigationEvent(fFloatValue);
            int i3 = ICustomTabsCallback_Parcel + 91;
            mayLaunchUrl = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 94 / 0;
            }
            return null;
        }
        mexternalsyntheticlambda2.ICustomTabsCallbackStub.onNavigationEvent(fFloatValue);
        throw null;
    }

    private final void access000(float f) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 117;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.ICustomTabsCallbackStubProxy.onNavigationEvent(f);
        int i4 = ICustomTabsCallback_Parcel + 53;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 13;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = this.onExtraCallback.onNavigationEvent();
        int i4 = mayLaunchUrl + 125;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    private final void IAuthTabCallback(float f) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 121;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.onNavigationEvent(f);
        int i4 = mayLaunchUrl + 45;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private final long writeTypedObject() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 71;
        ICustomTabsCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            long jAccess100 = ((setByteOrder) this.onWarmupCompleted.onExtraCallbackWithResult()).access100();
            int i3 = ICustomTabsCallback_Parcel + 95;
            mayLaunchUrl = i3 % 128;
            if (i3 % 2 == 0) {
                return jAccess100;
            }
            obj.hashCode();
            throw null;
        }
        ((setByteOrder) this.onWarmupCompleted.onExtraCallbackWithResult()).access100();
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 9;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.IAuthTabCallback(setByteOrder.onNavigationEvent(j));
        int i4 = mayLaunchUrl + 87;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull SurfaceProcessorNodeOut surfaceProcessorNodeOut, @NotNull final Canvas canvas, @NotNull Camera camera, @NotNull Matrix matrix, @NotNull final r8lambda4tMrngQSvLENU65MlLmHwvGfT8 r8lambda4tmrngqsvlenu65mllmhwvgft8, @NotNull setTaggedAddrCtrl<? super getSurfaceSize, ? super GraphicDeviceInfo, ? super use, ? super delete, ? extends Typeface> settaggedaddrctrl, @NotNull mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault iAuthTabCallbackDefault, long j) {
        float fFloatValue;
        float f;
        float f2;
        float f3;
        Pair pairIAuthTabCallback;
        Canvas canvas2;
        r8lambda4tMrngQSvLENU65MlLmHwvGfT8 r8lambda4tmrngqsvlenu65mllmhwvgft82;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 59;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(camera, "");
        Intrinsics.checkNotNullParameter(matrix, "");
        Intrinsics.checkNotNullParameter(r8lambda4tmrngqsvlenu65mllmhwvgft8, "");
        Intrinsics.checkNotNullParameter(settaggedaddrctrl, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
        float fAsBinder = (int) (surfaceProcessorNodeOut.asBinder() >> 32);
        Rect rect = this.onNavigationEvent;
        float fIAuthTabCallback_Parcel = rect.IAuthTabCallback_Parcel() - rect.IAuthTabCallbackStubProxy();
        Rect rect2 = this.onNavigationEvent;
        float fIAuthTabCallbackDefault = rect2.IAuthTabCallbackDefault() - rect2.extraCallback();
        if (((Float) onNavigationEvent(new Object[]{this}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -926548060, 926548066, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).floatValue() == 0.0f) {
            int i4 = mayLaunchUrl + 49;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            int i6 = onExtraCallback.IAuthTabCallback[iAuthTabCallbackDefault.ordinal()];
            if (i6 == 1 || i6 == 3) {
                float fAccess000 = access000();
                fFloatValue = fAccess000 * fIAuthTabCallback_Parcel;
                int i7 = ICustomTabsCallback_Parcel + 103;
                mayLaunchUrl = i7 % 128;
                int i8 = i7 % 2;
            } else {
                fFloatValue = fAsBinder * access000();
            }
        } else {
            fFloatValue = ((Float) onNavigationEvent(new Object[]{this}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -926548060, 926548066, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).floatValue();
        }
        float interfaceDescriptor = readTypedObject() == 0.0f ? getInterfaceDescriptor() * fIAuthTabCallbackDefault : readTypedObject();
        float fOnExtraCallback = surfaceProcessorNodeOut.onExtraCallback(this.asBinder);
        float fIAuthTabCallbackStubProxy = this.onNavigationEvent.IAuthTabCallbackStubProxy();
        float f4 = interfaceDescriptor;
        int i9 = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i9);
        int i10 = (int) j;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10);
        camera.save();
        Float fOnWarmupCompleted = onWarmupCompleted();
        if (fOnWarmupCompleted != null) {
            f = fIntBitsToFloat2;
            f2 = 0.0f;
            camera.setLocation(0.0f, 0.0f, -fOnWarmupCompleted.floatValue());
        } else {
            f = fIntBitsToFloat2;
            f2 = 0.0f;
        }
        if (onExtraCallbackWithResult() == f2 && onTransact() == f2) {
            int i11 = ICustomTabsCallback_Parcel + 117;
            mayLaunchUrl = i11 % 128;
            int i12 = i11 % 2;
            if (asBinder() == 0.0f) {
                f3 = fIntBitsToFloat;
            }
        } else {
            f3 = fIntBitsToFloat;
            camera.rotate(onExtraCallbackWithResult(), onTransact(), -asBinder());
        }
        camera.getMatrix(matrix);
        camera.restore();
        float fAsInterface = asInterface();
        float fIAuthTabCallbackDefault2 = IAuthTabCallbackDefault();
        float fIAuthTabCallbackStub = IAuthTabCallbackStub();
        float fIAuthTabCallbackDefault3 = IAuthTabCallbackDefault();
        if (iAuthTabCallbackDefault == mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault.None) {
            Rect rect3 = (Rect) onNavigationEvent(new Object[]{this, surfaceProcessorNodeOut, r8lambda4tmrngqsvlenu65mllmhwvgft8}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 628817858, -628817857, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
            float fIAuthTabCallbackStubProxy2 = rect3.IAuthTabCallbackStubProxy();
            float fIAuthTabCallback_Parcel2 = rect3.IAuthTabCallback_Parcel();
            float fIAuthTabCallbackStubProxy3 = rect3.IAuthTabCallbackStubProxy();
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf((fIAuthTabCallbackStubProxy2 + ((fIAuthTabCallback_Parcel2 - fIAuthTabCallbackStubProxy3) * access100())) - this.onNavigationEvent.IAuthTabCallbackStubProxy()), Float.valueOf((rect3.extraCallback() + ((rect3.IAuthTabCallbackDefault() - rect3.extraCallback()) * ((Float) onNavigationEvent(new Object[]{this}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1778380464, 1778380466, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).floatValue())) - fOnExtraCallback));
        } else if (this.isEngagementSignalsApiAvailable) {
            Paint.FontMetrics fontMetrics = r8lambda4tmrngqsvlenu65mllmhwvgft8.getFontMetrics();
            float f5 = fontMetrics.ascent;
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(fIAuthTabCallback_Parcel * access100()), Float.valueOf(f5 + ((fontMetrics.descent - f5) * ((Float) onNavigationEvent(new Object[]{this}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1778380464, 1778380466, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).floatValue())));
        } else {
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(fIAuthTabCallback_Parcel * access100()), Float.valueOf(fIAuthTabCallbackDefault * ((Float) onNavigationEvent(new Object[]{this}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1778380464, 1778380466, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).floatValue()));
        }
        float fFloatValue2 = ((Number) pairIAuthTabCallback.onExtraCallbackWithResult()).floatValue();
        float fFloatValue3 = ((Number) pairIAuthTabCallback.IAuthTabCallback()).floatValue();
        matrix.preScale(fAsInterface * fIAuthTabCallbackDefault2, fIAuthTabCallbackStub * fIAuthTabCallbackDefault3);
        matrix.preTranslate(-fFloatValue2, -fFloatValue3);
        matrix.postTranslate(fFloatValue2, fFloatValue3);
        int iSave = canvas.save();
        try {
            canvas2 = canvas;
            try {
                canvas2.translate(this.onNavigationEvent.IAuthTabCallbackStubProxy() + fFloatValue + Float.intBitsToFloat(i9), fOnExtraCallback + f4 + Float.intBitsToFloat(i10));
                canvas2.concat(matrix);
                if (onExtraCallback() > 0.0f) {
                    r8lambda4tmrngqsvlenu65mllmhwvgft82 = r8lambda4tmrngqsvlenu65mllmhwvgft8;
                    r8lambda4tmrngqsvlenu65mllmhwvgft82.setMaskFilter(new BlurMaskFilter(onExtraCallback(), BlurMaskFilter.Blur.NORMAL));
                } else {
                    r8lambda4tmrngqsvlenu65mllmhwvgft82 = r8lambda4tmrngqsvlenu65mllmhwvgft8;
                }
                final float f6 = fIAuthTabCallbackStubProxy + f3;
                final float f7 = fOnExtraCallback + f;
                onExtraCallbackWithResult(r8lambda4tmrngqsvlenu65mllmhwvgft82, this.onActivityResized, settaggedaddrctrl, new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1CharFrame$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i13 = 2 % 2;
                        int i14 = onExtraCallbackWithResult + 71;
                        onNavigationEvent = i14 % 128;
                        if (i14 % 2 != 0) {
                            return mExternalSyntheticLambda2.IAuthTabCallback(canvas, this, r8lambda4tmrngqsvlenu65mllmhwvgft8, f6, f7, (r8lambda4tMrngQSvLENU65MlLmHwvGfT8) obj);
                        }
                        mExternalSyntheticLambda2.IAuthTabCallback(canvas, this, r8lambda4tmrngqsvlenu65mllmhwvgft8, f6, f7, (r8lambda4tMrngQSvLENU65MlLmHwvGfT8) obj);
                        throw null;
                    }
                });
                r8lambda4tmrngqsvlenu65mllmhwvgft82.setMaskFilter(null);
                canvas2.restoreToCount(iSave);
                matrix.reset();
            } catch (Throwable th) {
                th = th;
                canvas2.restoreToCount(iSave);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            canvas2 = canvas;
        }
    }

    private final void onExtraCallbackWithResult(float f) {
        onNavigationEvent(new Object[]{this, Float.valueOf(f)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 591623534, -591623529, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private final void onWarmupCompleted(Float f) {
        onNavigationEvent(new Object[]{this, f}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1104242191, -1104242191, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private final void IAuthTabCallbackStub(float f) {
        onNavigationEvent(new Object[]{this, Float.valueOf(f)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1120752608, 1120752615, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private final void access100(float f) {
        onNavigationEvent(new Object[]{this, Float.valueOf(f)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1213232967, -1213232963, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private final void IAuthTabCallback_Parcel(float f) {
        onNavigationEvent(new Object[]{this, Float.valueOf(f)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1720582926, 1720582929, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private final Rect onWarmupCompleted(SurfaceProcessorNodeOut surfaceProcessorNodeOut, r8lambda4tMrngQSvLENU65MlLmHwvGfT8 r8lambda4tmrngqsvlenu65mllmhwvgft8) {
        return (Rect) onNavigationEvent(new Object[]{this, surfaceProcessorNodeOut, r8lambda4tmrngqsvlenu65mllmhwvgft8}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 628817858, -628817857, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    public final float IAuthTabCallbackStubProxy() {
        return ((Float) onNavigationEvent(new Object[]{this}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1778380464, 1778380466, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).floatValue();
    }

    public final float IAuthTabCallback_Parcel() {
        return ((Float) onNavigationEvent(new Object[]{this}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -926548060, 926548066, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).floatValue();
    }
}
