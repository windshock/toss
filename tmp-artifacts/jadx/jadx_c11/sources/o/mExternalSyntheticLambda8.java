package o;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.view.animation.Interpolator;
import androidx.collection.LruCache;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.compose.foundation.anim.rally.RallyKt;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.AppLovinSdkSettings;
import o.ExtensionsManager1;
import o.getPackageType;
import o.getSurfaceSize;
import o.hasProvider;
import o.mExternalSyntheticApiModelOutline1;
import o.mExternalSyntheticLambda2;
import o.mExternalSyntheticLambda8;
import o.pxToDp;
import o.r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class mExternalSyntheticLambda8 implements r8lambda49PUoj84d073zThfYmsWH2BreR8 {
    public static final onExtraCallback Companion;
    private static int ICustomTabsCallback_Parcel = 0;
    private static int extraCommand = 0;
    private static int isEngagementSignalsApiAvailable = 1;
    private static int mayLaunchUrl = 1;
    private static final Pair onNavigationEvent = getWrite.IAuthTabCallback(mExternalSyntheticLambda5.onNavigationEvent(), (Object) null);
    private final getSupportedHighSpeedResolutions IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private getPackageType IAuthTabCallbackStub;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallbackStubProxy;
    private final CameraPresenceProviderExternalSyntheticLambda6 IAuthTabCallback_Parcel;
    private final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 ICustomTabsCallback;
    private final SurfaceProcessorWithExecutorExternalSyntheticLambda1 ICustomTabsCallbackDefault;
    private final CameraPresenceProviderExternalSyntheticLambda6 ICustomTabsCallbackStub;
    private final mExternalSyntheticApiModelOutline1.IAuthTabCallbackStubProxy ICustomTabsCallbackStubProxy;
    private final CameraPresenceProviderExternalSyntheticLambda6 access000;
    private final getSupportedHighSpeedResolutionsFor access100;
    private final getSupportedHighSpeedResolutionsFor<ExtensionsManager1> asBinder;
    private final LruCache<Pair<hasProvider, mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault>, mExternalSyntheticLambda6> asInterface;
    private boolean extraCallback;
    private final inflateMenu extraCallbackWithResult;
    private long getInterfaceDescriptor;
    private final setTaggedAddrCtrl<getSurfaceSize, GraphicDeviceInfo, use, delete, Typeface> onActivityLayout;
    private final CameraPresenceProviderExternalSyntheticLambda6 onActivityResized;
    private final getSupportedHighSpeedResolutions onExtraCallback;
    private final getSupportedHighSpeedResolutionsFor<setByteOrder> onExtraCallbackWithResult;
    private r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28 onMessageChannelReady;
    private final getHumanReadableName onMinimized;
    private final mExternalSyntheticApiModelOutline1.onTransact onPostMessage;
    private final getSupportedHighSpeedResolutionsFor onRelationshipValidationResult;
    private findResAndMsg onTransact;
    private final r8lambda4tMrngQSvLENU65MlLmHwvGfT8 onUnminimized;
    private final getSupportedHighSpeedResolutionsFor<mExternalSyntheticLambda9> onWarmupCompleted;
    private final Lazy readTypedObject;
    private Function1<? super access13800<? super Unit>, ? extends Object> writeTypedObject;

    public static /* synthetic */ Camera IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCommand + 105;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Camera interfaceDescriptor = getInterfaceDescriptor();
        int i4 = mayLaunchUrl + 85;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return interfaceDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback(AppLovinSdkSettings appLovinSdkSettings, mExternalSyntheticLambda2 mexternalsyntheticlambda2) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 93;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) onExtraCallbackWithResult(iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), -1647401512, iIAuthTabCallback2, new Object[]{appLovinSdkSettings, mexternalsyntheticlambda2}, 1647401532, OverseasRrnInputTextField.IAuthTabCallback());
        int i4 = mayLaunchUrl + 67;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return appLovinSdkSettings2;
        }
        throw null;
    }

    public static /* synthetic */ hasProvider IAuthTabCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8) {
        int i = 2 % 2;
        int i2 = extraCommand + 29;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        hasProvider interfaceDescriptor = getInterfaceDescriptor(mexternalsyntheticlambda8);
        int i4 = extraCommand + 51;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        mExternalSyntheticLambda2 mexternalsyntheticlambda2 = (mExternalSyntheticLambda2) objArr[1];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 109;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(mexternalsyntheticlambda2, "");
        if (i3 != 0) {
            throw null;
        }
        int i4 = mayLaunchUrl + 81;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return appLovinSdkSettings;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 105;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Matrix matrixExtraCallbackWithResult = extraCallbackWithResult();
        int i4 = extraCommand + 41;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return matrixExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[0];
        mExternalSyntheticLambda2 mexternalsyntheticlambda2 = (mExternalSyntheticLambda2) objArr[1];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 91;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(appLovinSdkSettings, mexternalsyntheticlambda2);
        }
        onExtraCallbackWithResult(appLovinSdkSettings, mexternalsyntheticlambda2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        mExternalSyntheticLambda8 mexternalsyntheticlambda8 = (mExternalSyntheticLambda8) objArr[0];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 53;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
            int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
            return (mExternalSyntheticApiModelOutline1.asInterface) onExtraCallbackWithResult(iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), 1892838788, iIAuthTabCallback2, new Object[]{mexternalsyntheticlambda8}, -1892838773, OverseasRrnInputTextField.IAuthTabCallback());
        }
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback4 = OverseasRrnInputTextField.IAuthTabCallback();
        int i3 = 79 / 0;
        return (mExternalSyntheticApiModelOutline1.asInterface) onExtraCallbackWithResult(iIAuthTabCallback3, OverseasRrnInputTextField.IAuthTabCallback(), 1892838788, iIAuthTabCallback4, new Object[]{mexternalsyntheticlambda8}, -1892838773, OverseasRrnInputTextField.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8, ExtensionsManager1 extensionsManager1, ExtensionsManager1 extensionsManager12) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 85;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(mexternalsyntheticlambda8, extensionsManager1, extensionsManager12);
        int i4 = mayLaunchUrl + 97;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7;
        Integer num;
        int i8 = ~i3;
        int i9 = ~i;
        int i10 = (~(i8 | i9)) | i5;
        int i11 = i9 | i5;
        int i12 = (~((~i5) | i3)) | (~i11);
        int i13 = (~(i | i8 | i5)) | (~(i11 | i3));
        int i14 = i5 + i3 + i4 + (528639218 * i2) + ((-532493036) * i6);
        int i15 = i14 * i14;
        int i16 = (i5 * (-1573143961)) + 2078511484 + (i3 * (-1573143961)) + (i10 * 1872) + (i12 * (-936)) + (i13 * 936) + ((-1573143025) * i4) + (123045422 * i2) + ((-1548035028) * i6) + (i15 * 1845559296);
        switch (((i5 * 873666089) - 1460666368) + (873666089 * i3) + ((-875965520) * i10) + (437982760 * i12) + ((-437982760) * i13) + (435683328 * i4) + (1819279360 * i2) + ((-1621098496) * i6) + (586088448 * i15) + (i16 * i16 * 1848705024)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                mExternalSyntheticLambda8 mexternalsyntheticlambda8 = (mExternalSyntheticLambda8) objArr[0];
                Context context = (Context) objArr[1];
                List list = (List) objArr[2];
                mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback = (mExternalSyntheticApiModelOutline1.IAuthTabCallback) objArr[3];
                mExternalSyntheticApiModelOutline1.onTransact ontransact = (mExternalSyntheticApiModelOutline1.onTransact) objArr[4];
                int iIntValue = ((Number) objArr[5]).intValue();
                int iIntValue2 = ((Number) objArr[6]).intValue();
                int iIntValue3 = ((Number) objArr[7]).intValue();
                boolean zBooleanValue = ((Boolean) objArr[8]).booleanValue();
                int i17 = 2 % 2;
                Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(mexternalsyntheticlambda8.new IAuthTabCallbackStub(list, (r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult) objArr[10], ((Boolean) objArr[9]).booleanValue(), iAuthTabCallback, ontransact, iIntValue2, iIntValue3, iIntValue, zBooleanValue, context, null), (access13800) objArr[11]);
                if (objOnExtraCallbackWithResult == access14300.onWarmupCompleted()) {
                    i7 = mayLaunchUrl + 55;
                } else {
                    objOnExtraCallbackWithResult = Unit.INSTANCE;
                    i7 = mayLaunchUrl + 65;
                }
                extraCommand = i7 % 128;
                int i18 = i7 % 2;
                return objOnExtraCallbackWithResult;
            case 7:
                final mExternalSyntheticLambda8 mexternalsyntheticlambda82 = (mExternalSyntheticLambda8) objArr[0];
                runOnUiThreadDelayed runonuithreaddelayed = (runOnUiThreadDelayed) objArr[1];
                long jLongValue = ((Number) objArr[2]).longValue();
                boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
                Long l = (Long) objArr[4];
                Integer num2 = (Integer) objArr[5];
                Function0 function0 = (Function0) objArr[6];
                access13800 access13800Var = (access13800) objArr[7];
                int iIntValue4 = ((Number) objArr[8]).intValue();
                Object obj = objArr[9];
                int i19 = 2 % 2;
                if ((iIntValue4 & 16) != 0) {
                    int i20 = mayLaunchUrl + 51;
                    extraCommand = i20 % 128;
                    int i21 = i20 % 2;
                    num = null;
                } else {
                    num = num2;
                }
                Object objOnExtraCallbackWithResult2 = onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -845326298, OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{mexternalsyntheticlambda82, runonuithreaddelayed, Long.valueOf(jLongValue), Boolean.valueOf(zBooleanValue2), l, num, (iIntValue4 & 32) != 0 ? new Function0() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1State$$ExternalSyntheticLambda6
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke() {
                        int i22 = 2 % 2;
                        int i23 = onExtraCallback + 73;
                        IAuthTabCallback = i23 % 128;
                        if (i23 % 2 != 0) {
                            mExternalSyntheticLambda8.onWarmupCompleted(this.f$0);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        Unit unitOnWarmupCompleted = mExternalSyntheticLambda8.onWarmupCompleted(this.f$0);
                        int i24 = IAuthTabCallback + 9;
                        onExtraCallback = i24 % 128;
                        int i25 = i24 % 2;
                        return unitOnWarmupCompleted;
                    }
                } : function0, access13800Var}, 845326308, OverseasRrnInputTextField.IAuthTabCallback());
                int i22 = mayLaunchUrl + 11;
                extraCommand = i22 % 128;
                int i23 = i22 % 2;
                return objOnExtraCallbackWithResult2;
            case 8:
                return asBinder(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return onTransact(objArr);
            case 11:
                mExternalSyntheticLambda8 mexternalsyntheticlambda83 = (mExternalSyntheticLambda8) objArr[0];
                hasProvider hasprovider = (hasProvider) objArr[1];
                mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback2 = (mExternalSyntheticApiModelOutline1.IAuthTabCallback) objArr[2];
                mExternalSyntheticApiModelOutline1.onTransact ontransact2 = (mExternalSyntheticApiModelOutline1.onTransact) objArr[3];
                int iIntValue5 = ((Number) objArr[4]).intValue();
                boolean zBooleanValue3 = ((Boolean) objArr[5]).booleanValue();
                Long l2 = (Long) objArr[6];
                int i24 = 2 % 2;
                Intrinsics.checkNotNullParameter(hasprovider, "");
                Intrinsics.checkNotNullParameter(iAuthTabCallback2, "");
                Intrinsics.checkNotNullParameter(ontransact2, "");
                maybeUpdateAnimatable.onNavigationEvent(mexternalsyntheticlambda83.onTransact, (CoroutineContext) null, (setRandomHost) null, mexternalsyntheticlambda83.new asBinder(hasprovider, iAuthTabCallback2, ontransact2, iIntValue5, zBooleanValue3, l2, null), 3, (Object) null);
                int i25 = extraCommand + 81;
                mayLaunchUrl = i25 % 128;
                int i26 = i25 % 2;
                return null;
            case 12:
                return IAuthTabCallbackStub(objArr);
            case 13:
                mExternalSyntheticLambda8 mexternalsyntheticlambda84 = (mExternalSyntheticLambda8) objArr[0];
                hasProvider hasprovider2 = (hasProvider) objArr[1];
                mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback3 = (mExternalSyntheticApiModelOutline1.IAuthTabCallback) objArr[2];
                mExternalSyntheticApiModelOutline1.onTransact ontransact3 = (mExternalSyntheticApiModelOutline1.onTransact) objArr[3];
                int iIntValue6 = ((Number) objArr[4]).intValue();
                boolean zBooleanValue4 = ((Boolean) objArr[5]).booleanValue();
                Long l3 = (Long) objArr[6];
                r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.IAuthTabCallback iAuthTabCallback4 = (r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.IAuthTabCallback) objArr[7];
                access13800<? super Unit> access13800Var2 = (access13800) objArr[8];
                int i27 = 2 % 2;
                int i28 = extraCommand + 53;
                mayLaunchUrl = i28 % 128;
                int i29 = i28 % 2;
                Object objOnExtraCallbackWithResult3 = mexternalsyntheticlambda84.onExtraCallbackWithResult(hasprovider2, iAuthTabCallback3, ontransact3, iIntValue6, zBooleanValue4, l3, iAuthTabCallback4, access13800Var2);
                int i30 = mayLaunchUrl + 89;
                extraCommand = i30 % 128;
                int i31 = i30 % 2;
                return objOnExtraCallbackWithResult3;
            case 14:
                return access100(objArr);
            case 15:
                mExternalSyntheticLambda8 mexternalsyntheticlambda85 = (mExternalSyntheticLambda8) objArr[0];
                int i32 = 2 % 2;
                int i33 = extraCommand + 63;
                mayLaunchUrl = i33 % 128;
                int i34 = i33 % 2;
                mExternalSyntheticApiModelOutline1.asInterface asinterface = (mExternalSyntheticApiModelOutline1.asInterface) mexternalsyntheticlambda85.IAuthTabCallbackStubProxy().getSecond();
                int i35 = mayLaunchUrl + 115;
                extraCommand = i35 % 128;
                int i36 = i35 % 2;
                return asinterface;
            case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                return access000(objArr);
            case R.styleable.TdsListRowV1View_centerType /* 17 */:
                return IAuthTabCallback_Parcel(objArr);
            case R.styleable.TdsListRowV1View_disabledType /* 18 */:
                return getInterfaceDescriptor(objArr);
            case R.styleable.TdsListRowV1View_leftDate /* 19 */:
                mExternalSyntheticLambda8 mexternalsyntheticlambda86 = (mExternalSyntheticLambda8) objArr[0];
                Context context2 = (Context) objArr[1];
                List list2 = (List) objArr[2];
                mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback5 = (mExternalSyntheticApiModelOutline1.IAuthTabCallback) objArr[3];
                mExternalSyntheticApiModelOutline1.onTransact ontransact4 = (mExternalSyntheticApiModelOutline1.onTransact) objArr[4];
                int iIntValue7 = ((Number) objArr[5]).intValue();
                int iIntValue8 = ((Number) objArr[6]).intValue();
                int iIntValue9 = ((Number) objArr[7]).intValue();
                boolean zBooleanValue5 = ((Boolean) objArr[8]).booleanValue();
                boolean zBooleanValue6 = ((Boolean) objArr[9]).booleanValue();
                int i37 = 2 % 2;
                Intrinsics.checkNotNullParameter(context2, "");
                Intrinsics.checkNotNullParameter(list2, "");
                Intrinsics.checkNotNullParameter(iAuthTabCallback5, "");
                Intrinsics.checkNotNullParameter(ontransact4, "");
                maybeUpdateAnimatable.onNavigationEvent(mexternalsyntheticlambda86.onTransact, (CoroutineContext) null, (setRandomHost) null, mexternalsyntheticlambda86.new onNavigationEvent(context2, list2, iAuthTabCallback5, ontransact4, iIntValue7, iIntValue8, iIntValue9, zBooleanValue5, zBooleanValue6, null), 3, (Object) null);
                int i38 = extraCommand + 107;
                mayLaunchUrl = i38 % 128;
                int i39 = i38 % 2;
                return null;
            case R.styleable.TdsListRowV1View_leftImage /* 20 */:
                return IAuthTabCallbackStubProxy(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(mExternalSyntheticLambda8 mexternalsyntheticlambda8, hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = extraCommand + 125;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(mexternalsyntheticlambda8, hasprovider, iAuthTabCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(mexternalsyntheticlambda8, hasprovider, iAuthTabCallback);
        int i3 = mayLaunchUrl + 3;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    private static final AppLovinSdkSettings onExtraCallbackWithResult(AppLovinSdkSettings appLovinSdkSettings, mExternalSyntheticLambda2 mexternalsyntheticlambda2) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 31;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(mexternalsyntheticlambda2, "");
        int i4 = extraCommand + 53;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return appLovinSdkSettings;
    }

    public static /* synthetic */ mExternalSyntheticApiModelOutline1.asInterface onExtraCallbackWithResult(mExternalSyntheticLambda8 mexternalsyntheticlambda8) {
        int i = 2 % 2;
        int i2 = extraCommand + 67;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback_Parcel(mexternalsyntheticlambda8);
        }
        IAuthTabCallback_Parcel(mexternalsyntheticlambda8);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ hasProvider onNavigationEvent(mExternalSyntheticLambda8 mexternalsyntheticlambda8) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 119;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        hasProvider hasproviderAccess100 = access100(mexternalsyntheticlambda8);
        int i4 = extraCommand + 29;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return hasproviderAccess100;
    }

    public static /* synthetic */ Unit onWarmupCompleted(mExternalSyntheticLambda8 mexternalsyntheticlambda8) {
        int i = 2 % 2;
        int i2 = extraCommand + 37;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(mexternalsyntheticlambda8);
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        int i5 = extraCommand + 77;
        mayLaunchUrl = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    public mExternalSyntheticLambda8(@NotNull hasProvider hasprovider, @NotNull SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1, @NotNull mExternalSyntheticApiModelOutline1.onTransact ontransact, @Nullable mExternalSyntheticApiModelOutline1.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy, @NotNull getHumanReadableName gethumanreadablename, @NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, @NotNull setTaggedAddrCtrl<? super getSurfaceSize, ? super GraphicDeviceInfo, ? super use, ? super delete, ? extends Typeface> settaggedaddrctrl, @NotNull findResAndMsg findresandmsg, int i) {
        Intrinsics.checkNotNullParameter(hasprovider, "");
        Intrinsics.checkNotNullParameter(surfaceProcessorWithExecutorExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(ontransact, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename, "");
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        Intrinsics.checkNotNullParameter(settaggedaddrctrl, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        this.ICustomTabsCallbackDefault = surfaceProcessorWithExecutorExternalSyntheticLambda1;
        this.onPostMessage = ontransact;
        this.ICustomTabsCallbackStubProxy = iAuthTabCallbackStubProxy;
        this.onMinimized = gethumanreadablename;
        this.ICustomTabsCallback = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
        this.onActivityLayout = settaggedaddrctrl;
        this.onTransact = findresandmsg;
        this.asInterface = new LruCache<>(i);
        this.extraCallbackWithResult = new inflateMenu();
        this.access100 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(getWrite.IAuthTabCallback(mExternalSyntheticLambda5.onNavigationEvent(), (Object) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.access000 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1State$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 57;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                hasProvider hasproviderIAuthTabCallback = mExternalSyntheticLambda8.IAuthTabCallback(this.f$0);
                int i5 = onExtraCallback + 51;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 47 / 0;
                }
                return hasproviderIAuthTabCallback;
            }
        });
        this.IAuthTabCallback_Parcel = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1State$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 69;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr = {this.f$0};
                    throw null;
                }
                Object[] objArr2 = {this.f$0};
                mExternalSyntheticApiModelOutline1.asInterface asinterface = (mExternalSyntheticApiModelOutline1.asInterface) mExternalSyntheticLambda8.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 1802286102, OverseasRrnInputTextField.IAuthTabCallback(), objArr2, -1802286102, OverseasRrnInputTextField.IAuthTabCallback());
                int i4 = onNavigationEvent + 17;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return asinterface;
            }
        });
        this.onRelationshipValidationResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(getWrite.IAuthTabCallback(mExternalSyntheticLambda5.onNavigationEvent(), (Object) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.ICustomTabsCallbackStub = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1State$$ExternalSyntheticLambda2
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 71;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                hasProvider hasproviderOnNavigationEvent = mExternalSyntheticLambda8.onNavigationEvent(this.f$0);
                int i5 = onNavigationEvent + 63;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return hasproviderOnNavigationEvent;
            }
        });
        this.onActivityResized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1State$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 81;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                mExternalSyntheticApiModelOutline1.asInterface asinterfaceOnExtraCallbackWithResult = mExternalSyntheticLambda8.onExtraCallbackWithResult(this.f$0);
                int i5 = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return asinterfaceOnExtraCallbackWithResult;
                }
                throw null;
            }
        });
        this.getInterfaceDescriptor = r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, 0, 0, 0, 15, (Object) null);
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutionsOnExtraCallbackWithResult = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(1.0f);
        this.IAuthTabCallback = getsupportedhighspeedresolutionsOnExtraCallbackWithResult;
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutionsOnExtraCallbackWithResult2 = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
        this.onExtraCallback = getsupportedhighspeedresolutionsOnExtraCallbackWithResult2;
        getSupportedHighSpeedResolutionsFor<setByteOrder> getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setByteOrder.onNavigationEvent(asBinder().asInterface()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallbackWithResult = getsupportedhighspeedresolutionsforOnWarmupCompleted;
        this.IAuthTabCallbackStubProxy = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new mExternalSyntheticApiModelOutline0(getsupportedhighspeedresolutionsOnExtraCallbackWithResult, getsupportedhighspeedresolutionsOnExtraCallbackWithResult2, getsupportedhighspeedresolutionsforOnWarmupCompleted), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        r8lambda4tMrngQSvLENU65MlLmHwvGfT8 r8lambda4tmrngqsvlenu65mllmhwvgft8 = new r8lambda4tMrngQSvLENU65MlLmHwvGfT8(1, r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback());
        r8lambdalb_N4iUVLbnWVSot7IGZUP33tOo.IAuthTabCallback(r8lambda4tmrngqsvlenu65mllmhwvgft8, asBinder().isEngagementSignalsApiAvailable(), settaggedaddrctrl, r8lambdanm9dm2eewl4vrptnjmesfjqky4, false);
        this.onUnminimized = r8lambda4tmrngqsvlenu65mllmhwvgft8;
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1State$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 59;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Camera cameraIAuthTabCallback = mExternalSyntheticLambda8.IAuthTabCallback();
                int i5 = onExtraCallbackWithResult + 13;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return cameraIAuthTabCallback;
                }
                throw null;
            }
        });
        this.readTypedObject = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1State$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 11;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
                    int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
                    return (Matrix) mExternalSyntheticLambda8.onExtraCallbackWithResult(iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), -1535261262, iIAuthTabCallback2, new Object[0], 1535261276, OverseasRrnInputTextField.IAuthTabCallback());
                }
                int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback4 = OverseasRrnInputTextField.IAuthTabCallback();
                throw null;
            }
        });
        SurfaceProcessorNodeOut surfaceProcessorNodeOutOnExtraCallbackWithResult = onExtraCallbackWithResult(hasprovider);
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(onExtraCallback(this, surfaceProcessorNodeOutOnExtraCallbackWithResult, null, mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault.None, 2, null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.asBinder = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(ExtensionsManager1.onNavigationEvent(ontransact.IAuthTabCallback(CollectionsKt.listOf(surfaceProcessorNodeOutOnExtraCallbackWithResult), 0).onWarmupCompleted()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    public static final /* synthetic */ Object IAuthTabCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8, Function1 function1, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = extraCommand + 51;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
            int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
            return onExtraCallbackWithResult(iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), 791162391, iIAuthTabCallback2, new Object[]{mexternalsyntheticlambda8, function1, access13800Var}, -791162386, OverseasRrnInputTextField.IAuthTabCallback());
        }
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback4 = OverseasRrnInputTextField.IAuthTabCallback();
        onExtraCallbackWithResult(iIAuthTabCallback3, OverseasRrnInputTextField.IAuthTabCallback(), 791162391, iIAuthTabCallback4, new Object[]{mexternalsyntheticlambda8, function1, access13800Var}, -791162386, OverseasRrnInputTextField.IAuthTabCallback());
        throw null;
    }

    public static final /* synthetic */ Object IAuthTabCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8, r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onWarmupCompleted onwarmupcompleted, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 17;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            return mexternalsyntheticlambda8.onExtraCallback(onwarmupcompleted, (access13800<? super Unit>) access13800Var);
        }
        mexternalsyntheticlambda8.onExtraCallback(onwarmupcompleted, (access13800<? super Unit>) access13800Var);
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8, Pair pair) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 91;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        mexternalsyntheticlambda8.onNavigationEvent((Pair<hasProvider, ? extends mExternalSyntheticApiModelOutline1.asInterface>) pair);
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8, getPackageType getpackagetype) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl;
        int i3 = i2 + 31;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        mexternalsyntheticlambda8.IAuthTabCallbackStub = getpackagetype;
        if (i4 != 0) {
            int i5 = 77 / 0;
        }
        int i6 = i2 + 97;
        extraCommand = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        mExternalSyntheticLambda8 mexternalsyntheticlambda8 = (mExternalSyntheticLambda8) objArr[0];
        int i = 2 % 2;
        int i2 = extraCommand + 125;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        getPackageType getpackagetype = mexternalsyntheticlambda8.IAuthTabCallbackStub;
        if (i3 != 0) {
            return getpackagetype;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getSupportedHighSpeedResolutionsFor IAuthTabCallbackStub(mExternalSyntheticLambda8 mexternalsyntheticlambda8) {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 73;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        getSupportedHighSpeedResolutionsFor<setByteOrder> getsupportedhighspeedresolutionsfor = mexternalsyntheticlambda8.onExtraCallbackWithResult;
        if (i4 == 0) {
            int i5 = 39 / 0;
        }
        int i6 = i2 + 25;
        mayLaunchUrl = i6 % 128;
        int i7 = i6 % 2;
        return getsupportedhighspeedresolutionsfor;
    }

    public static final /* synthetic */ r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28 asBinder(mExternalSyntheticLambda8 mexternalsyntheticlambda8) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 99;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28 r8lambdao3fy7vllgo1akyolrhcogjera28 = mexternalsyntheticlambda8.onMessageChannelReady;
        int i5 = i3 + 7;
        mayLaunchUrl = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return r8lambdao3fy7vllgo1akyolrhcogjera28;
    }

    public static final /* synthetic */ getSupportedHighSpeedResolutions asInterface(mExternalSyntheticLambda8 mexternalsyntheticlambda8) {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 87;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = mexternalsyntheticlambda8.IAuthTabCallback;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 113;
        mayLaunchUrl = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
        return getsupportedhighspeedresolutions;
    }

    public static final /* synthetic */ Object onExtraCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8, Context context, List list, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, int i2, int i3, boolean z, boolean z2, r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult, access13800 access13800Var) {
        int i4 = 2 % 2;
        int i5 = mayLaunchUrl + 3;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {mexternalsyntheticlambda8, context, list, iAuthTabCallback, ontransact, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z), Boolean.valueOf(z2), onextracallbackwithresult, access13800Var};
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -38250864, OverseasRrnInputTextField.IAuthTabCallback(), objArr, 38250870, OverseasRrnInputTextField.IAuthTabCallback());
        int i7 = mayLaunchUrl + 111;
        extraCommand = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 7 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ runOnUiThreadDelayed onExtraCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8, mExternalSyntheticLambda9 mexternalsyntheticlambda9) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 87;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallback = mexternalsyntheticlambda8.IAuthTabCallback(mexternalsyntheticlambda9);
        int i4 = extraCommand + 25;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return runonuithreaddelayedIAuthTabCallback;
    }

    public static final /* synthetic */ runOnUiThreadDelayed onExtraCallbackWithResult(mExternalSyntheticLambda8 mexternalsyntheticlambda8, mExternalSyntheticLambda9 mexternalsyntheticlambda9, Function1 function1, int i, mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault iAuthTabCallbackDefault, int i2) {
        int i3 = 2 % 2;
        int i4 = mayLaunchUrl + 31;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallback = mexternalsyntheticlambda8.onExtraCallback(mexternalsyntheticlambda9, (Function1<? super mExternalSyntheticLambda2, AppLovinSdkSettings>) function1, i, iAuthTabCallbackDefault, i2);
        int i6 = extraCommand + 15;
        mayLaunchUrl = i6 % 128;
        if (i6 % 2 != 0) {
            return runonuithreaddelayedOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(mExternalSyntheticLambda8 mexternalsyntheticlambda8, Pair pair) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 73;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        mexternalsyntheticlambda8.IAuthTabCallback((Pair<hasProvider, ? extends mExternalSyntheticApiModelOutline1.asInterface>) pair);
        int i4 = extraCommand + 63;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(mExternalSyntheticLambda8 mexternalsyntheticlambda8, r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28 r8lambdao3fy7vllgo1akyolrhcogjera28) {
        int i = 2 % 2;
        int i2 = extraCommand + 43;
        int i3 = i2 % 128;
        mayLaunchUrl = i3;
        int i4 = i2 % 2;
        mexternalsyntheticlambda8.onMessageChannelReady = r8lambdao3fy7vllgo1akyolrhcogjera28;
        int i5 = i3 + 51;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onNavigationEvent(mExternalSyntheticLambda8 mexternalsyntheticlambda8, hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onNavigationEvent onnavigationevent, access13800 access13800Var) {
        int i2 = 2 % 2;
        int i3 = mayLaunchUrl + 123;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        Object objOnWarmupCompleted = mexternalsyntheticlambda8.onWarmupCompleted(hasprovider, iAuthTabCallbackStub, ontransact, i, z, onnavigationevent, access13800Var);
        int i5 = mayLaunchUrl + 13;
        extraCommand = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
        return objOnWarmupCompleted;
    }

    public static final /* synthetic */ mExternalSyntheticLambda9 onNavigationEvent(mExternalSyntheticLambda8 mexternalsyntheticlambda8, SurfaceProcessorNodeOut surfaceProcessorNodeOut, mExternalSyntheticLambda9 mexternalsyntheticlambda9, mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        int i = 2 % 2;
        int i2 = extraCommand + 5;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        mExternalSyntheticLambda9 mexternalsyntheticlambda9IAuthTabCallback = mexternalsyntheticlambda8.IAuthTabCallback(surfaceProcessorNodeOut, mexternalsyntheticlambda9, iAuthTabCallbackDefault);
        int i4 = mayLaunchUrl + 79;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return mexternalsyntheticlambda9IAuthTabCallback;
    }

    public static final /* synthetic */ runOnUiThreadDelayed onNavigationEvent(mExternalSyntheticLambda8 mexternalsyntheticlambda8, mExternalSyntheticLambda9 mexternalsyntheticlambda9, mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 15;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        runOnUiThreadDelayed runonuithreaddelayed = (runOnUiThreadDelayed) onExtraCallbackWithResult(iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), 1485048389, iIAuthTabCallback2, new Object[]{mexternalsyntheticlambda8, mexternalsyntheticlambda9, iAuthTabCallbackStub}, -1485048388, OverseasRrnInputTextField.IAuthTabCallback());
        int i4 = mayLaunchUrl + 105;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
        return runonuithreaddelayed;
    }

    public static final /* synthetic */ void onNavigationEvent(mExternalSyntheticLambda8 mexternalsyntheticlambda8, mExternalSyntheticLambda9 mexternalsyntheticlambda9) {
        int i = 2 % 2;
        int i2 = extraCommand + 109;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        onExtraCallbackWithResult(iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), 1475453939, iIAuthTabCallback2, new Object[]{mexternalsyntheticlambda8, mexternalsyntheticlambda9}, -1475453922, OverseasRrnInputTextField.IAuthTabCallback());
        int i4 = extraCommand + 113;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ inflateMenu onTransact(mExternalSyntheticLambda8 mexternalsyntheticlambda8) {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 35;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        inflateMenu inflatemenu = mexternalsyntheticlambda8.extraCallbackWithResult;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 31;
        mayLaunchUrl = i5 % 128;
        int i6 = i5 % 2;
        return inflatemenu;
    }

    public static final /* synthetic */ Object onWarmupCompleted(mExternalSyntheticLambda8 mexternalsyntheticlambda8, long j, int i, access13800 access13800Var) {
        int i2 = 2 % 2;
        int i3 = mayLaunchUrl + 45;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        Object objIAuthTabCallback = mexternalsyntheticlambda8.IAuthTabCallback(j, i, (access13800<? super Unit>) access13800Var);
        if (i4 != 0) {
            int i5 = 45 / 0;
        }
        int i6 = mayLaunchUrl + 63;
        extraCommand = i6 % 128;
        int i7 = i6 % 2;
        return objIAuthTabCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 63;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Pair pair = onNavigationEvent;
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        return pair;
    }

    public static final /* synthetic */ List onWarmupCompleted(mExternalSyntheticLambda8 mexternalsyntheticlambda8, List list, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 79;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            return mexternalsyntheticlambda8.onNavigationEvent((List<hasProvider>) list, iAuthTabCallback);
        }
        mexternalsyntheticlambda8.onNavigationEvent((List<hasProvider>) list, iAuthTabCallback);
        throw null;
    }

    public static final /* synthetic */ runOnUiThreadDelayed onWarmupCompleted(mExternalSyntheticLambda8 mexternalsyntheticlambda8, mExternalSyntheticLambda9 mexternalsyntheticlambda9, AppLovinSdkSettings appLovinSdkSettings, int i, mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault iAuthTabCallbackDefault, int i2) {
        int i3 = 2 % 2;
        int i4 = mayLaunchUrl + 25;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallbackWithResult = mexternalsyntheticlambda8.onExtraCallbackWithResult(mexternalsyntheticlambda9, appLovinSdkSettings, i, iAuthTabCallbackDefault, i2);
        int i6 = extraCommand + 37;
        mayLaunchUrl = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 68 / 0;
        }
        return runonuithreaddelayedOnExtraCallbackWithResult;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ mExternalSyntheticLambda8(hasProvider hasprovider, SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1, mExternalSyntheticApiModelOutline1.onTransact ontransact, mExternalSyntheticApiModelOutline1.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy, getHumanReadableName gethumanreadablename, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, setTaggedAddrCtrl settaggedaddrctrl, findResAndMsg findresandmsg, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3;
        if ((i2 & 256) != 0) {
            int i4 = extraCommand;
            int i5 = i4 + 31;
            mayLaunchUrl = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 121;
            mayLaunchUrl = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            i3 = 8;
        } else {
            i3 = i;
        }
        this(hasprovider, surfaceProcessorWithExecutorExternalSyntheticLambda1, ontransact, iAuthTabCallbackStubProxy, gethumanreadablename, r8lambdanm9dm2eewl4vrptnjmesfjqky4, settaggedaddrctrl, findresandmsg, i3);
    }

    public getHumanReadableName asBinder() {
        int i = 2 % 2;
        int i2 = extraCommand + 3;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        getHumanReadableName gethumanreadablename = this.onMinimized;
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        return gethumanreadablename;
    }

    private static final hasProvider getInterfaceDescriptor(mExternalSyntheticLambda8 mexternalsyntheticlambda8) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 21;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        hasProvider hasprovider = (hasProvider) mexternalsyntheticlambda8.IAuthTabCallbackStubProxy().getFirst();
        if (i3 != 0) {
            throw null;
        }
        int i4 = mayLaunchUrl + 87;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return hasprovider;
    }

    private static final hasProvider access100(mExternalSyntheticLambda8 mexternalsyntheticlambda8) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 77;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        hasProvider hasprovider = (hasProvider) mexternalsyntheticlambda8.extraCallback().getFirst();
        int i4 = mayLaunchUrl + 1;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return hasprovider;
    }

    private static final mExternalSyntheticApiModelOutline1.asInterface IAuthTabCallback_Parcel(mExternalSyntheticLambda8 mexternalsyntheticlambda8) {
        int i = 2 % 2;
        int i2 = extraCommand + 31;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        mExternalSyntheticApiModelOutline1.asInterface asinterface = (mExternalSyntheticApiModelOutline1.asInterface) mexternalsyntheticlambda8.extraCallback().getSecond();
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        return asinterface;
    }

    public boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl;
        int i3 = i2 + 87;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        getPackageType getpackagetype = this.IAuthTabCallbackStub;
        if (getpackagetype != null) {
            int i5 = i2 + 35;
            extraCommand = i5 % 128;
            if (i5 % 2 == 0 ? getpackagetype.onExtraCallback() : getpackagetype.onExtraCallback()) {
                int i6 = mayLaunchUrl + 7;
                extraCommand = i6 % 128;
                return i6 % 2 == 0;
            }
        }
        return false;
    }

    private final Camera access000() {
        int i = 2 % 2;
        int i2 = extraCommand + 11;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Camera camera = (Camera) this.IAuthTabCallbackDefault.getValue();
        int i4 = extraCommand + 45;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return camera;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Camera getInterfaceDescriptor() {
        int i = 2 % 2;
        Camera camera = new Camera();
        int i2 = extraCommand + 35;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        return camera;
    }

    private static final Matrix extraCallbackWithResult() {
        int i = 2 % 2;
        Matrix matrix = new Matrix();
        int i2 = mayLaunchUrl + 65;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        return matrix;
    }

    private final Matrix readTypedObject() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 7;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Matrix matrix = (Matrix) this.readTypedObject.getValue();
        int i3 = mayLaunchUrl + 121;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 97 / 0;
        }
        return matrix;
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Function1<access13800<? super Unit>, Object> $pending;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access000(Function1<? super access13800<? super Unit>, ? extends Object> function1, access13800<? super access000> access13800Var) {
            super(2, access13800Var);
            this.$pending = function1;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access000 access000Var = new access000(this.$pending, access13800Var);
            int i2 = onExtraCallbackWithResult + 63;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 62 / 0;
            }
            return access000Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 61;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                Function1<access13800<? super Unit>, Object> function1 = this.$pending;
                this.label = 1;
                if (function1.invoke(this) == objOnWarmupCompleted) {
                    int i3 = onExtraCallback + 105;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onExtraCallback + 93;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // o.r8lambda49PUoj84d073zThfYmsWH2BreR8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallback(long j) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 81;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            this.getInterfaceDescriptor = j;
            int i3 = 58 / 0;
            if (!this.extraCallback) {
                this.extraCallback = true;
                Function1<? super access13800<? super Unit>, ? extends Object> function1 = this.writeTypedObject;
                if (function1 != null) {
                    maybeUpdateAnimatable.onNavigationEvent(this.onTransact, (CoroutineContext) null, (setRandomHost) null, new access000(function1, null), 3, (Object) null);
                    this.writeTypedObject = null;
                }
            }
        } else {
            this.getInterfaceDescriptor = j;
            if (!this.extraCallback) {
            }
        }
        int i4 = extraCommand + 107;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(mExternalSyntheticLambda8 mexternalsyntheticlambda8, String str, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, Long l, int i2, Object obj) {
        int i3;
        int i4 = 2 % 2;
        if ((i2 & 4) != 0) {
            ontransact = mexternalsyntheticlambda8.onPostMessage;
        }
        mExternalSyntheticApiModelOutline1.onTransact ontransact2 = ontransact;
        if ((i2 & 8) != 0) {
            int i5 = extraCommand + 119;
            mayLaunchUrl = i5 % 128;
            if (i5 % 2 == 0) {
                i = 1;
                i3 = i;
            } else {
                i3 = 0;
            }
        } else {
            i3 = i;
        }
        boolean z2 = (i2 & 16) != 0 ? false : z;
        if ((i2 & 32) != 0) {
            int i6 = extraCommand + 49;
            mayLaunchUrl = i6 % 128;
            int i7 = i6 % 2;
            l = null;
        }
        mexternalsyntheticlambda8.IAuthTabCallback(str, iAuthTabCallback, ontransact2, i3, z2, l);
    }

    public final void IAuthTabCallback(@NotNull String str, @NotNull mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, @NotNull mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, @Nullable Long l) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(ontransact, "");
        Object[] objArr = {this, new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), iAuthTabCallback, ontransact, Integer.valueOf(i), Boolean.valueOf(z), l};
        onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 673656132, OverseasRrnInputTextField.IAuthTabCallback(), objArr, -673656121, OverseasRrnInputTextField.IAuthTabCallback());
        int i3 = extraCommand + 37;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(mExternalSyntheticLambda8 mexternalsyntheticlambda8, hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, Long l, int i2, Object obj) {
        mExternalSyntheticApiModelOutline1.onTransact ontransact2;
        int i3;
        int i4 = 2 % 2;
        if ((i2 & 4) != 0) {
            int i5 = mayLaunchUrl;
            int i6 = i5 + 93;
            extraCommand = i6 % 128;
            int i7 = i6 % 2;
            mExternalSyntheticApiModelOutline1.onTransact ontransact3 = mexternalsyntheticlambda8.onPostMessage;
            int i8 = i5 + 107;
            extraCommand = i8 % 128;
            int i9 = i8 % 2;
            ontransact2 = ontransact3;
        } else {
            ontransact2 = ontransact;
        }
        if ((i2 & 8) != 0) {
            int i10 = extraCommand + 63;
            mayLaunchUrl = i10 % 128;
            i3 = i10 % 2 == 0 ? 1 : 0;
        } else {
            i3 = i;
        }
        onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 673656132, OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{mexternalsyntheticlambda8, hasprovider, iAuthTabCallback, ontransact2, Integer.valueOf(i3), Boolean.valueOf((i2 & 16) == 0 ? z : false), (i2 & 32) != 0 ? null : l}, -673656121, OverseasRrnInputTextField.IAuthTabCallback());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ int $initialDelay;
        final /* synthetic */ boolean $isBackward;
        final /* synthetic */ mExternalSyntheticApiModelOutline1.IAuthTabCallback $motion;
        final /* synthetic */ mExternalSyntheticApiModelOutline1.onTransact $sizeStrategy;
        final /* synthetic */ Long $skipDurationMillis;
        final /* synthetic */ hasProvider $text;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, Long l, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$text = hasprovider;
            this.$motion = iAuthTabCallback;
            this.$sizeStrategy = ontransact;
            this.$initialDelay = i;
            this.$isBackward = z;
            this.$skipDurationMillis = l;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            asBinder asbinderCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                objInvokeSuspend = asbinderCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 61 / 0;
            } else {
                objInvokeSuspend = asbinderCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onNavigationEvent + 19;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = mExternalSyntheticLambda8.this.new asBinder(this.$text, this.$motion, this.$sizeStrategy, this.$initialDelay, this.$isBackward, this.$skipDurationMillis, access13800Var);
            int i2 = onNavigationEvent + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 25;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {mExternalSyntheticLambda8.this};
                getPackageType getpackagetype = (getPackageType) mExternalSyntheticLambda8.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 551132828, OverseasRrnInputTextField.IAuthTabCallback(), objArr, -551132816, OverseasRrnInputTextField.IAuthTabCallback());
                if (getpackagetype != null) {
                    int i5 = onNavigationEvent + 45;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                }
                mExternalSyntheticLambda8 mexternalsyntheticlambda8 = mExternalSyntheticLambda8.this;
                hasProvider hasprovider = this.$text;
                mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback = this.$motion;
                mExternalSyntheticApiModelOutline1.onTransact ontransact = this.$sizeStrategy;
                int i7 = this.$initialDelay;
                boolean z = this.$isBackward;
                Long l = this.$skipDurationMillis;
                this.label = 1;
                if (mexternalsyntheticlambda8.onNavigationEvent(hasprovider, iAuthTabCallback, ontransact, i7, z, l, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i8 = onWarmupCompleted + 29;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return unit;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(mExternalSyntheticLambda8 mexternalsyntheticlambda8, hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, Long l, access13800 access13800Var, int i2, Object obj) {
        mExternalSyntheticApiModelOutline1.onTransact ontransact2;
        int i3;
        int i4 = 2 % 2;
        int i5 = mayLaunchUrl + 47;
        int i6 = i5 % 128;
        extraCommand = i6;
        if (i5 % 2 == 0 ? (i2 & 4) == 0 : (i2 & 4) == 0) {
            ontransact2 = ontransact;
        } else {
            mExternalSyntheticApiModelOutline1.onTransact ontransact3 = mexternalsyntheticlambda8.onPostMessage;
            int i7 = i6 + 11;
            mayLaunchUrl = i7 % 128;
            int i8 = i7 % 2;
            ontransact2 = ontransact3;
        }
        if ((i2 & 8) != 0) {
            int i9 = mayLaunchUrl + 81;
            extraCommand = i9 % 128;
            int i10 = i9 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        return mexternalsyntheticlambda8.onNavigationEvent(hasprovider, iAuthTabCallback, ontransact2, i3, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? null : l, access13800Var);
    }

    public final Object onNavigationEvent(@NotNull hasProvider hasprovider, @NotNull mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, @NotNull mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, @Nullable Long l, @NotNull access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(hasprovider, iAuthTabCallback, ontransact, i, z, l, null, access13800Var);
        if (objOnExtraCallbackWithResult != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i3 = mayLaunchUrl;
        int i4 = i3 + 23;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 79;
        extraCommand = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 30 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    private final Object onExtraCallbackWithResult(hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, Long l, r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.IAuthTabCallback iAuthTabCallback2, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(new onTransact(iAuthTabCallback2, hasprovider, iAuthTabCallback, ontransact, i, z, l, null), access13800Var);
        if (objOnExtraCallbackWithResult != access14300.onWarmupCompleted()) {
            Unit unit = Unit.INSTANCE;
            int i3 = extraCommand + 77;
            mayLaunchUrl = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        int i5 = mayLaunchUrl + 7;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ int $initialDelay;
        final /* synthetic */ boolean $isBackward;
        final /* synthetic */ mExternalSyntheticApiModelOutline1.IAuthTabCallback $motion;
        final /* synthetic */ r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.IAuthTabCallback $savedAnimationState;
        final /* synthetic */ mExternalSyntheticApiModelOutline1.onTransact $sizeStrategy;
        final /* synthetic */ Long $skipDurationMillis;
        final /* synthetic */ hasProvider $text;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.IAuthTabCallback iAuthTabCallback, hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback2, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, Long l, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$savedAnimationState = iAuthTabCallback;
            this.$text = hasprovider;
            this.$motion = iAuthTabCallback2;
            this.$sizeStrategy = ontransact;
            this.$initialDelay = i;
            this.$isBackward = z;
            this.$skipDurationMillis = l;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = mExternalSyntheticLambda8.this.new onTransact(this.$savedAnimationState, this.$text, this.$motion, this.$sizeStrategy, this.$initialDelay, this.$isBackward, this.$skipDurationMillis, access13800Var);
            int i2 = IAuthTabCallback + 103;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return ontransact;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 81;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 3;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* renamed from: o.mExternalSyntheticLambda8$onTransact$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ int $initialDelay;
            final /* synthetic */ boolean $isBackward;
            final /* synthetic */ mExternalSyntheticApiModelOutline1.IAuthTabCallback $motion;
            final /* synthetic */ r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.IAuthTabCallback $savedAnimationState;
            final /* synthetic */ mExternalSyntheticApiModelOutline1.onTransact $sizeStrategy;
            final /* synthetic */ Long $skipDurationMillis;
            final /* synthetic */ hasProvider $text;
            int label;
            final /* synthetic */ mExternalSyntheticLambda8 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(mExternalSyntheticLambda8 mexternalsyntheticlambda8, r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.IAuthTabCallback iAuthTabCallback, hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback2, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, Long l, access13800<? super AnonymousClass4> access13800Var) {
                super(1, access13800Var);
                this.this$0 = mexternalsyntheticlambda8;
                this.$savedAnimationState = iAuthTabCallback;
                this.$text = hasprovider;
                this.$motion = iAuthTabCallback2;
                this.$sizeStrategy = ontransact;
                this.$initialDelay = i;
                this.$isBackward = z;
                this.$skipDurationMillis = l;
            }

            public final access13800<Unit> create(access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$savedAnimationState, this.$text, this.$motion, this.$sizeStrategy, this.$initialDelay, this.$isBackward, this.$skipDurationMillis, access13800Var);
                int i2 = onNavigationEvent + 25;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass4;
            }

            public /* synthetic */ Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent((access13800) obj);
                int i4 = onNavigationEvent + 11;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(access13800<? super Unit> access13800Var) {
                Object objInvokeSuspend;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 99;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass4 anonymousClass4Create = create(access13800Var);
                if (i3 != 0) {
                    objInvokeSuspend = anonymousClass4Create.invokeSuspend(Unit.INSTANCE);
                    int i4 = 35 / 0;
                } else {
                    objInvokeSuspend = anonymousClass4Create.invokeSuspend(Unit.INSTANCE);
                }
                int i5 = onNavigationEvent + 65;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* renamed from: o.mExternalSyntheticLambda8$onTransact$4$4, reason: invalid class name and collision with other inner class name */
            static final class C00434 extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;
                final /* synthetic */ int $initialDelay;
                final /* synthetic */ boolean $isBackward;
                final /* synthetic */ mExternalSyntheticApiModelOutline1.IAuthTabCallback $motion;
                final /* synthetic */ r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.IAuthTabCallback $savedAnimationState;
                final /* synthetic */ mExternalSyntheticApiModelOutline1.onTransact $sizeStrategy;
                final /* synthetic */ Long $skipDurationMillis;
                final /* synthetic */ hasProvider $text;
                long J$0;
                Object L$0;
                boolean Z$0;
                int label;
                final /* synthetic */ mExternalSyntheticLambda8 this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00434(r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.IAuthTabCallback iAuthTabCallback, hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback2, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, Long l, mExternalSyntheticLambda8 mexternalsyntheticlambda8, access13800<? super C00434> access13800Var) {
                    super(1, access13800Var);
                    this.$savedAnimationState = iAuthTabCallback;
                    this.$text = hasprovider;
                    this.$motion = iAuthTabCallback2;
                    this.$sizeStrategy = ontransact;
                    this.$initialDelay = i;
                    this.$isBackward = z;
                    this.$skipDurationMillis = l;
                    this.this$0 = mexternalsyntheticlambda8;
                }

                public final access13800<Unit> create(access13800<?> access13800Var) {
                    int i = 2 % 2;
                    C00434 c00434 = new C00434(this.$savedAnimationState, this.$text, this.$motion, this.$sizeStrategy, this.$initialDelay, this.$isBackward, this.$skipDurationMillis, this.this$0, access13800Var);
                    int i2 = onExtraCallbackWithResult + 33;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 == 0) {
                        return c00434;
                    }
                    throw null;
                }

                public /* synthetic */ Object invoke(Object obj) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 71;
                    onWarmupCompleted = i2 % 128;
                    access13800<? super Unit> access13800Var = (access13800) obj;
                    if (i2 % 2 == 0) {
                        return onNavigationEvent(access13800Var);
                    }
                    onNavigationEvent(access13800Var);
                    throw null;
                }

                public final Object onNavigationEvent(access13800<? super Unit> access13800Var) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 67;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    C00434 c00434Create = create(access13800Var);
                    if (i3 == 0) {
                        return c00434Create.invokeSuspend(Unit.INSTANCE);
                    }
                    int i4 = 43 / 0;
                    return c00434Create.invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 7;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i4 = this.label;
                    if (i4 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.IAuthTabCallback iAuthTabCallback = this.$savedAnimationState;
                        if (iAuthTabCallback == null) {
                            iAuthTabCallback = new r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.IAuthTabCallback(this.$text, this.$motion, this.$sizeStrategy, this.$initialDelay, this.$isBackward, this.$skipDurationMillis);
                            mExternalSyntheticLambda8.onExtraCallbackWithResult(this.this$0, iAuthTabCallback);
                        }
                        mExternalSyntheticApiModelOutline1.onTransact.onNavigationEvent onnavigationeventIAuthTabCallback = this.$sizeStrategy.IAuthTabCallback(CollectionsKt.listOf(this.this$0.onExtraCallbackWithResult(this.$text)), 0);
                        long jOnExtraCallback = onnavigationeventIAuthTabCallback.onExtraCallback();
                        boolean zIAuthTabCallback = onnavigationeventIAuthTabCallback.IAuthTabCallback();
                        mExternalSyntheticLambda8 mexternalsyntheticlambda8 = this.this$0;
                        hasProvider hasprovider = this.$text;
                        mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback2 = this.$motion;
                        boolean z = this.$isBackward;
                        int i5 = this.$initialDelay;
                        Long lIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                        r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallback onextracallbackOnNavigationEvent = iAuthTabCallback.onNavigationEvent();
                        this.L$0 = access15400.onNavigationEvent(iAuthTabCallback);
                        this.J$0 = jOnExtraCallback;
                        this.Z$0 = zIAuthTabCallback;
                        this.label = 1;
                        if (mExternalSyntheticLambda8.onExtraCallback(mexternalsyntheticlambda8, hasprovider, null, iAuthTabCallback2, jOnExtraCallback, zIAuthTabCallback, z, i5, lIAuthTabCallback, onextracallbackOnNavigationEvent, this, 2, null) == objOnWarmupCompleted) {
                            int i6 = onWarmupCompleted + 77;
                            onExtraCallbackWithResult = i6 % 128;
                            if (i6 % 2 == 0) {
                                int i7 = 62 / 0;
                            }
                            return objOnWarmupCompleted;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[PHI: r0
              0x0035: PHI (r0v7 java.lang.Object) = (r0v4 java.lang.Object), (r0v14 java.lang.Object) binds: [B:8:0x0025, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r2
              0x0027: PHI (r2v1 int) = (r2v0 int), (r2v4 int) binds: [B:8:0x0025, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objOnWarmupCompleted;
                int i;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 13;
                onExtraCallbackWithResult = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 != 0) {
                    objOnWarmupCompleted = access14300.onWarmupCompleted();
                    i = this.label;
                    int i4 = 97 / 0;
                    if (i == 0) {
                        Object obj3 = objOnWarmupCompleted;
                        ResultKt.onNavigationEvent(obj);
                        inflateMenu inflatemenuOnTransact = mExternalSyntheticLambda8.onTransact(this.this$0);
                        C00434 c00434 = new C00434(this.$savedAnimationState, this.$text, this.$motion, this.$sizeStrategy, this.$initialDelay, this.$isBackward, this.$skipDurationMillis, this.this$0, null);
                        this.label = 1;
                        if (inflateMenu.IAuthTabCallback(inflatemenuOnTransact, (isOverflowMenuShowing) null, c00434, this, 1, (Object) null) == obj3) {
                            int i5 = onNavigationEvent + 77;
                            onExtraCallbackWithResult = i5 % 128;
                            if (i5 % 2 == 0) {
                                return obj3;
                            }
                            throw null;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                    }
                } else {
                    objOnWarmupCompleted = access14300.onWarmupCompleted();
                    i = this.label;
                    if (i != 0) {
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i6 = onExtraCallbackWithResult + 23;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    return unit;
                }
                obj2.hashCode();
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[PHI: r1
          0x003b: PHI (r1v11 java.lang.Object) = (r1v4 java.lang.Object), (r1v12 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
          0x0024: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 9;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 61 / 0;
                if (i != 0) {
                    int i5 = IAuthTabCallback + 45;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    mExternalSyntheticLambda8 mexternalsyntheticlambda8 = mExternalSyntheticLambda8.this;
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(mexternalsyntheticlambda8, this.$savedAnimationState, this.$text, this.$motion, this.$sizeStrategy, this.$initialDelay, this.$isBackward, this.$skipDurationMillis, null);
                    this.label = 1;
                    if (mExternalSyntheticLambda8.IAuthTabCallback(mexternalsyntheticlambda8, (Function1) anonymousClass4, (access13800) this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            Unit unit = Unit.INSTANCE;
            int i7 = IAuthTabCallback + 103;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    public static /* synthetic */ void onNavigationEvent(mExternalSyntheticLambda8 mexternalsyntheticlambda8, Context context, List list, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, int i2, int i3, boolean z, boolean z2, int i4, Object obj) {
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        mExternalSyntheticApiModelOutline1.onTransact ontransact2 = (i4 & 8) != 0 ? mexternalsyntheticlambda8.onPostMessage : ontransact;
        boolean z3 = false;
        if ((i4 & 16) != 0) {
            int i9 = extraCommand + 15;
            int i10 = i9 % 128;
            mayLaunchUrl = i10;
            if (i9 % 2 == 0) {
                int i11 = 38 / 0;
            }
            int i12 = i10 + 9;
            extraCommand = i12 % 128;
            int i13 = i12 % 2;
            i5 = Integer.MAX_VALUE;
        } else {
            i5 = i;
        }
        if ((i4 & 32) != 0) {
            int i14 = extraCommand + 97;
            mayLaunchUrl = i14 % 128;
            i6 = i14 % 2 == 0 ? 1 : 0;
        } else {
            i6 = i2;
        }
        if ((i4 & 64) != 0) {
            int i15 = extraCommand + 35;
            mayLaunchUrl = i15 % 128;
            int i16 = i15 % 2;
            i7 = 0;
        } else {
            i7 = i3;
        }
        if ((i4 & 128) != 0) {
            int i17 = mayLaunchUrl + 13;
            extraCommand = i17 % 128;
            if (i17 % 2 != 0) {
                z3 = true;
            }
        } else {
            z3 = z;
        }
        onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1152298151, OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{mexternalsyntheticlambda8, context, list, iAuthTabCallback, ontransact2, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Boolean.valueOf(z3), Boolean.valueOf((i4 & 256) == 0 ? z2 : true)}, 1152298167, OverseasRrnInputTextField.IAuthTabCallback());
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        int i = 0;
        mExternalSyntheticLambda8 mexternalsyntheticlambda8 = (mExternalSyntheticLambda8) objArr[0];
        Context context = (Context) objArr[1];
        List list = (List) objArr[2];
        mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback = (mExternalSyntheticApiModelOutline1.IAuthTabCallback) objArr[3];
        mExternalSyntheticApiModelOutline1.onTransact ontransact = (mExternalSyntheticApiModelOutline1.onTransact) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int iIntValue3 = ((Number) objArr[7]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[8]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[9]).booleanValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(ontransact, "");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i3 = extraCommand + 125;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        while (i < size) {
            arrayList.add(new hasProvider((String) list.get(i), (List) null, 2, (DefaultConstructorMarker) null));
            i++;
            list = list;
        }
        Object[] objArr2 = {mexternalsyntheticlambda8, context, arrayList, iAuthTabCallback, ontransact, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2)};
        onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -2051626723, OverseasRrnInputTextField.IAuthTabCallback(), objArr2, 2051626742, OverseasRrnInputTextField.IAuthTabCallback());
        return null;
    }

    public static /* synthetic */ void onWarmupCompleted(mExternalSyntheticLambda8 mexternalsyntheticlambda8, Context context, List list, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, int i2, int i3, boolean z, boolean z2, int i4, Object obj) {
        int i5;
        int i6;
        int i7 = 2 % 2;
        mExternalSyntheticApiModelOutline1.onTransact ontransact2 = (i4 & 8) != 0 ? mexternalsyntheticlambda8.onPostMessage : ontransact;
        if ((i4 & 16) != 0) {
            int i8 = extraCommand + 13;
            mayLaunchUrl = i8 % 128;
            int i9 = i8 % 2;
            i5 = Integer.MAX_VALUE;
        } else {
            i5 = i;
        }
        boolean z3 = false;
        int i10 = (i4 & 32) != 0 ? 0 : i2;
        if ((i4 & 64) != 0) {
            int i11 = extraCommand + 89;
            mayLaunchUrl = i11 % 128;
            int i12 = i11 % 2;
            i6 = 0;
        } else {
            i6 = i3;
        }
        boolean z4 = (i4 & 128) != 0 ? false : z;
        if ((i4 & 256) != 0) {
            int i13 = mayLaunchUrl + 75;
            extraCommand = i13 % 128;
            if (i13 % 2 == 0) {
                z3 = true;
            }
        } else {
            z3 = z2;
        }
        onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -2051626723, OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{mexternalsyntheticlambda8, context, list, iAuthTabCallback, ontransact2, Integer.valueOf(i5), Integer.valueOf(i10), Integer.valueOf(i6), Boolean.valueOf(z4), Boolean.valueOf(z3)}, 2051626742, OverseasRrnInputTextField.IAuthTabCallback());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Context $context;
        final /* synthetic */ int $initialDelay;
        final /* synthetic */ int $interval;
        final /* synthetic */ mExternalSyntheticApiModelOutline1.IAuthTabCallback $motion;
        final /* synthetic */ int $playCount;
        final /* synthetic */ mExternalSyntheticApiModelOutline1.onTransact $sizeStrategy;
        final /* synthetic */ boolean $skipIntroMotion;
        final /* synthetic */ boolean $startToStart;
        final /* synthetic */ List<hasProvider> $texts;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(Context context, List<hasProvider> list, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, int i2, int i3, boolean z, boolean z2, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
            this.$texts = list;
            this.$motion = iAuthTabCallback;
            this.$sizeStrategy = ontransact;
            this.$playCount = i;
            this.$initialDelay = i2;
            this.$interval = i3;
            this.$skipIntroMotion = z;
            this.$startToStart = z2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = mExternalSyntheticLambda8.this.new onNavigationEvent(this.$context, this.$texts, this.$motion, this.$sizeStrategy, this.$playCount, this.$initialDelay, this.$interval, this.$skipIntroMotion, this.$startToStart, access13800Var);
            int i2 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
                int i3 = 32 / 0;
            } else {
                objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            int i4 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 78 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {mExternalSyntheticLambda8.this};
                getPackageType getpackagetype = (getPackageType) mExternalSyntheticLambda8.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 551132828, OverseasRrnInputTextField.IAuthTabCallback(), objArr, -551132816, OverseasRrnInputTextField.IAuthTabCallback());
                if (getpackagetype != null) {
                    int i3 = onNavigationEvent + 119;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                }
                mExternalSyntheticLambda8 mexternalsyntheticlambda8 = mExternalSyntheticLambda8.this;
                Context context = this.$context;
                List<hasProvider> list = this.$texts;
                mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback = this.$motion;
                mExternalSyntheticApiModelOutline1.onTransact ontransact = this.$sizeStrategy;
                int i5 = this.$playCount;
                int i6 = this.$initialDelay;
                int i7 = this.$interval;
                boolean z = this.$skipIntroMotion;
                boolean z2 = this.$startToStart;
                this.label = 1;
                Object[] objArr2 = {mexternalsyntheticlambda8, context, list, iAuthTabCallback, ontransact, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Boolean.valueOf(z), Boolean.valueOf(z2), this};
                if (mExternalSyntheticLambda8.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1393860695, OverseasRrnInputTextField.IAuthTabCallback(), objArr2, 1393860713, OverseasRrnInputTextField.IAuthTabCallback()) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = onNavigationEvent + 85;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(mExternalSyntheticLambda8 mexternalsyntheticlambda8, Context context, List list, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, int i2, int i3, boolean z, boolean z2, access13800 access13800Var, int i4, Object obj) {
        int i5;
        int i6 = 2 % 2;
        int i7 = extraCommand;
        int i8 = i7 + 43;
        mayLaunchUrl = i8 % 128;
        mExternalSyntheticApiModelOutline1.onTransact ontransact2 = (i8 % 2 != 0 ? (i4 & 8) == 0 : (i4 & 78) == 0) ? ontransact : mexternalsyntheticlambda8.onPostMessage;
        int i9 = (i4 & 16) != 0 ? Integer.MAX_VALUE : i;
        boolean z3 = false;
        int i10 = (i4 & 32) != 0 ? 0 : i2;
        if ((i4 & 64) != 0) {
            int i11 = i7 + 107;
            mayLaunchUrl = i11 % 128;
            i5 = i11 % 2 == 0 ? 1 : 0;
        } else {
            i5 = i3;
        }
        if ((i4 & 128) != 0) {
            int i12 = mayLaunchUrl + 37;
            extraCommand = i12 % 128;
            int i13 = i12 % 2;
        } else {
            z3 = z;
        }
        return onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1393860695, OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{mexternalsyntheticlambda8, context, list, iAuthTabCallback, ontransact2, Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i5), Boolean.valueOf(z3), Boolean.valueOf((i4 & 256) == 0 ? z2 : true), access13800Var}, 1393860713, OverseasRrnInputTextField.IAuthTabCallback());
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        mExternalSyntheticLambda8 mexternalsyntheticlambda8 = (mExternalSyntheticLambda8) objArr[0];
        Context context = (Context) objArr[1];
        List list = (List) objArr[2];
        mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback = (mExternalSyntheticApiModelOutline1.IAuthTabCallback) objArr[3];
        mExternalSyntheticApiModelOutline1.onTransact ontransact = (mExternalSyntheticApiModelOutline1.onTransact) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int iIntValue3 = ((Number) objArr[7]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[8]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[9]).booleanValue();
        access13800 access13800Var = (access13800) objArr[10];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 15;
        extraCommand = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Object[] objArr2 = {mexternalsyntheticlambda8, context, list, iAuthTabCallback, ontransact, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2), null, access13800Var};
            onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -38250864, OverseasRrnInputTextField.IAuthTabCallback(), objArr2, 38250870, OverseasRrnInputTextField.IAuthTabCallback());
            access14300.onWarmupCompleted();
            obj.hashCode();
            throw null;
        }
        Object[] objArr3 = {mexternalsyntheticlambda8, context, list, iAuthTabCallback, ontransact, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2), null, access13800Var};
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -38250864, OverseasRrnInputTextField.IAuthTabCallback(), objArr3, 38250870, OverseasRrnInputTextField.IAuthTabCallback());
        if (objOnExtraCallbackWithResult != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i3 = mayLaunchUrl + 121;
        extraCommand = i3 % 128;
        if (i3 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Context $context;
        final /* synthetic */ int $initialDelay;
        final /* synthetic */ int $interval;
        final /* synthetic */ mExternalSyntheticApiModelOutline1.IAuthTabCallback $motion;
        final /* synthetic */ int $playCount;
        final /* synthetic */ r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult $savedAnimationState;
        final /* synthetic */ mExternalSyntheticApiModelOutline1.onTransact $sizeStrategy;
        final /* synthetic */ boolean $skipIntroMotion;
        final /* synthetic */ boolean $startToStart;
        final /* synthetic */ List<hasProvider> $texts;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(List<hasProvider> list, r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult, boolean z, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, int i2, int i3, boolean z2, Context context, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$texts = list;
            this.$savedAnimationState = onextracallbackwithresult;
            this.$startToStart = z;
            this.$motion = iAuthTabCallback;
            this.$sizeStrategy = ontransact;
            this.$initialDelay = i;
            this.$interval = i2;
            this.$playCount = i3;
            this.$skipIntroMotion = z2;
            this.$context = context;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = mExternalSyntheticLambda8.this.new IAuthTabCallbackStub(this.$texts, this.$savedAnimationState, this.$startToStart, this.$motion, this.$sizeStrategy, this.$initialDelay, this.$interval, this.$playCount, this.$skipIntroMotion, this.$context, access13800Var);
            int i2 = onWarmupCompleted + 25;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 9 / 0;
            }
            return iAuthTabCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 15;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 18 / 0;
            }
            int i5 = onWarmupCompleted + 89;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* renamed from: o.mExternalSyntheticLambda8$IAuthTabCallbackStub$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ Context $context;
            final /* synthetic */ int $initialDelay;
            final /* synthetic */ int $interval;
            final /* synthetic */ mExternalSyntheticApiModelOutline1.IAuthTabCallback $motion;
            final /* synthetic */ int $playCount;
            final /* synthetic */ r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult $savedAnimationState;
            final /* synthetic */ mExternalSyntheticApiModelOutline1.onTransact $sizeStrategy;
            final /* synthetic */ boolean $skipIntroMotion;
            final /* synthetic */ boolean $startToStart;
            final /* synthetic */ List<hasProvider> $texts;
            int label;
            final /* synthetic */ mExternalSyntheticLambda8 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(List<hasProvider> list, mExternalSyntheticLambda8 mexternalsyntheticlambda8, r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult, boolean z, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, int i2, int i3, boolean z2, Context context, access13800<? super AnonymousClass4> access13800Var) {
                super(1, access13800Var);
                this.$texts = list;
                this.this$0 = mexternalsyntheticlambda8;
                this.$savedAnimationState = onextracallbackwithresult;
                this.$startToStart = z;
                this.$motion = iAuthTabCallback;
                this.$sizeStrategy = ontransact;
                this.$initialDelay = i;
                this.$interval = i2;
                this.$playCount = i3;
                this.$skipIntroMotion = z2;
                this.$context = context;
            }

            public final access13800<Unit> create(access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$texts, this.this$0, this.$savedAnimationState, this.$startToStart, this.$motion, this.$sizeStrategy, this.$initialDelay, this.$interval, this.$playCount, this.$skipIntroMotion, this.$context, access13800Var);
                int i2 = onWarmupCompleted + 123;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass4;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 49;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback((access13800) obj);
                int i4 = IAuthTabCallback + 65;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 83;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass4 anonymousClass4Create = create(access13800Var);
                if (i3 == 0) {
                    anonymousClass4Create.invokeSuspend(Unit.INSTANCE);
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass4Create.invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 121;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            /* renamed from: o.mExternalSyntheticLambda8$IAuthTabCallbackStub$4$5, reason: invalid class name */
            static final class AnonymousClass5 extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;
                final /* synthetic */ Context $context;
                final /* synthetic */ int $initialDelay;
                final /* synthetic */ int $interval;
                final /* synthetic */ mExternalSyntheticApiModelOutline1.IAuthTabCallback $motion;
                final /* synthetic */ int $playCount;
                final /* synthetic */ r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult $savedAnimationState;
                final /* synthetic */ mExternalSyntheticApiModelOutline1.onTransact $sizeStrategy;
                final /* synthetic */ boolean $skipIntroMotion;
                final /* synthetic */ boolean $startToStart;
                final /* synthetic */ List<hasProvider> $texts;
                int I$0;
                int I$1;
                int I$2;
                int I$3;
                int I$4;
                int I$5;
                int I$6;
                int I$7;
                long J$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                Object L$5;
                Object L$6;
                Object L$7;
                Object L$8;
                Object L$9;
                boolean Z$0;
                boolean Z$1;
                boolean Z$2;
                int label;
                final /* synthetic */ mExternalSyntheticLambda8 this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult, boolean z, List<hasProvider> list, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, int i2, int i3, boolean z2, mExternalSyntheticLambda8 mexternalsyntheticlambda8, Context context, access13800<? super AnonymousClass5> access13800Var) {
                    super(1, access13800Var);
                    this.$savedAnimationState = onextracallbackwithresult;
                    this.$startToStart = z;
                    this.$texts = list;
                    this.$motion = iAuthTabCallback;
                    this.$sizeStrategy = ontransact;
                    this.$initialDelay = i;
                    this.$interval = i2;
                    this.$playCount = i3;
                    this.$skipIntroMotion = z2;
                    this.this$0 = mexternalsyntheticlambda8;
                    this.$context = context;
                }

                public final access13800<Unit> create(access13800<?> access13800Var) {
                    int i = 2 % 2;
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$savedAnimationState, this.$startToStart, this.$texts, this.$motion, this.$sizeStrategy, this.$initialDelay, this.$interval, this.$playCount, this.$skipIntroMotion, this.this$0, this.$context, access13800Var);
                    int i2 = onExtraCallbackWithResult + 123;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        return anonymousClass5;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public /* synthetic */ Object invoke(Object obj) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 11;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object objOnNavigationEvent = onNavigationEvent((access13800) obj);
                    int i4 = IAuthTabCallback + 43;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 38 / 0;
                    }
                    return objOnNavigationEvent;
                }

                public final Object onNavigationEvent(access13800<? super Unit> access13800Var) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 77;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
                    int i4 = IAuthTabCallback + 99;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objInvokeSuspend;
                    }
                    throw null;
                }

                /* JADX WARN: Removed duplicated region for block: B:100:0x05ba  */
                /* JADX WARN: Removed duplicated region for block: B:103:0x05d0  */
                /* JADX WARN: Removed duplicated region for block: B:104:0x05d3  */
                /* JADX WARN: Removed duplicated region for block: B:107:0x0671  */
                /* JADX WARN: Removed duplicated region for block: B:108:0x0684  */
                /* JADX WARN: Removed duplicated region for block: B:111:0x06c7  */
                /* JADX WARN: Removed duplicated region for block: B:116:0x0742  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x0267  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0294  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x02da  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x02e5  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x02e8  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0370  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0373  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x03a1  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0402  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x0497  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x04c6  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x071d -> B:115:0x072c). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0742 -> B:117:0x0753). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x03e4 -> B:63:0x03ef). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0402 -> B:65:0x0410). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    int i;
                    Integer numOnNavigationEvent;
                    int iMax;
                    r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult;
                    List<hasProvider> list;
                    Object obj2;
                    mExternalSyntheticApiModelOutline1.onTransact ontransact;
                    int i2;
                    int i3;
                    r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult2;
                    boolean z;
                    mExternalSyntheticLambda8 mexternalsyntheticlambda8;
                    int i4;
                    List list2;
                    mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback;
                    boolean z2;
                    int i5;
                    int i6;
                    List<SurfaceProcessorNodeOut> list3;
                    r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult3;
                    List<hasProvider> list4;
                    mExternalSyntheticApiModelOutline1.onTransact ontransact2;
                    mExternalSyntheticLambda8 mexternalsyntheticlambda82;
                    mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback2;
                    int i7;
                    int i8;
                    int i9;
                    boolean z3;
                    boolean z4;
                    int i10;
                    r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult4;
                    int i11;
                    List<SurfaceProcessorNodeOut> list5;
                    Object obj3;
                    int i12;
                    hasProvider hasprovider;
                    int i13;
                    boolean z5;
                    long j;
                    mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback3;
                    r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult5;
                    int i14;
                    boolean z6;
                    int i15;
                    int i16;
                    mExternalSyntheticApiModelOutline1.onTransact ontransact3;
                    int i17;
                    List<SurfaceProcessorNodeOut> list6;
                    mExternalSyntheticLambda8 mexternalsyntheticlambda83;
                    boolean z7;
                    List list7;
                    int i18;
                    int iCoerceAtLeast;
                    Object obj4;
                    mExternalSyntheticApiModelOutline1.onTransact ontransact4;
                    mExternalSyntheticLambda8 mexternalsyntheticlambda84;
                    mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback4;
                    r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult6;
                    List list8;
                    List<SurfaceProcessorNodeOut> list9;
                    Object obj5;
                    boolean z8;
                    int i19;
                    boolean z9;
                    int i20;
                    int i21;
                    int i22;
                    int i23;
                    int i24;
                    int i25;
                    long jOnExtraCallback;
                    int i26;
                    Object obj6;
                    boolean z10;
                    int i27;
                    boolean z11;
                    int i28;
                    int i29;
                    int i30;
                    r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallback onextracallbackOnNavigationEvent;
                    mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback5;
                    Object obj7;
                    mExternalSyntheticLambda8 mexternalsyntheticlambda85;
                    long j2;
                    Object obj8;
                    mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback6;
                    r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult7;
                    hasProvider hasprovider2;
                    List<SurfaceProcessorNodeOut> list10;
                    boolean z12;
                    int i31;
                    boolean z13;
                    int i32;
                    int i33;
                    int i34;
                    boolean z14;
                    List<hasProvider> list11;
                    mExternalSyntheticApiModelOutline1.onTransact ontransact5;
                    hasProvider hasprovider3;
                    long j3;
                    mExternalSyntheticLambda8 mexternalsyntheticlambda86;
                    mExternalSyntheticApiModelOutline1.onTransact ontransact6;
                    int i35;
                    boolean z15;
                    mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback7;
                    int i36;
                    int i37;
                    r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult8;
                    long jOnExtraCallback2;
                    boolean z16;
                    r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallback onextracallbackOnNavigationEvent2;
                    boolean z17;
                    int i38;
                    AnonymousClass5 anonymousClass5 = this;
                    int i39 = 2 % 2;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i40 = anonymousClass5.label;
                    if (i40 != 0) {
                        int i41 = onExtraCallbackWithResult;
                        int i42 = i41 + 33;
                        IAuthTabCallback = i42 % 128;
                        int i43 = i42 % 2;
                        if (i40 != 1) {
                            int i44 = i41 + 77;
                            IAuthTabCallback = i44 % 128;
                            if (i44 % 2 != 0 ? i40 == 2 : i40 == 5) {
                                i35 = anonymousClass5.I$3;
                                int i45 = anonymousClass5.I$2;
                                int i46 = anonymousClass5.I$1;
                                boolean z18 = anonymousClass5.Z$1;
                                int i47 = anonymousClass5.I$0;
                                boolean z19 = anonymousClass5.Z$0;
                                List<SurfaceProcessorNodeOut> list12 = (List) anonymousClass5.L$7;
                                onextracallbackwithresult8 = (r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult) anonymousClass5.L$5;
                                iAuthTabCallback7 = (mExternalSyntheticApiModelOutline1.IAuthTabCallback) anonymousClass5.L$4;
                                mExternalSyntheticLambda8 mexternalsyntheticlambda87 = (mExternalSyntheticLambda8) anonymousClass5.L$3;
                                mExternalSyntheticApiModelOutline1.onTransact ontransact7 = (mExternalSyntheticApiModelOutline1.onTransact) anonymousClass5.L$2;
                                List<hasProvider> list13 = (List) anonymousClass5.L$1;
                                r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult9 = (r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult) anonymousClass5.L$0;
                                ResultKt.onNavigationEvent(obj);
                                boolean z20 = z18;
                                Object obj9 = objOnWarmupCompleted;
                                ontransact2 = ontransact7;
                                onextracallbackwithresult3 = onextracallbackwithresult9;
                                i9 = i45;
                                list4 = list13;
                                i11 = i35;
                                mExternalSyntheticLambda8 mexternalsyntheticlambda88 = mexternalsyntheticlambda87;
                                i7 = i46;
                                mexternalsyntheticlambda82 = mexternalsyntheticlambda88;
                                r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult10 = onextracallbackwithresult8;
                                i10 = i47;
                                list5 = list12;
                                z3 = z19;
                                onextracallbackwithresult4 = onextracallbackwithresult10;
                                onextracallbackwithresult4.onExtraCallback(onextracallbackwithresult4.IAuthTabCallback_Parcel() + 1);
                                i8 = Integer.MAX_VALUE;
                                boolean z21 = z20;
                                objOnWarmupCompleted = obj9;
                                iAuthTabCallback2 = iAuthTabCallback7;
                                z4 = z21;
                                if (i10 == i8 && onextracallbackwithresult4.onWarmupCompleted() >= i10) {
                                    return Unit.INSTANCE;
                                }
                                hasprovider3 = list4.get(onextracallbackwithresult4.asBinder());
                                mExternalSyntheticApiModelOutline1.onTransact.onNavigationEvent onnavigationeventIAuthTabCallback = ontransact2.IAuthTabCallback(list5, onextracallbackwithresult4.asBinder());
                                Object obj10 = objOnWarmupCompleted;
                                jOnExtraCallback2 = onnavigationeventIAuthTabCallback.onExtraCallback();
                                boolean zIAuthTabCallback = onnavigationeventIAuthTabCallback.IAuthTabCallback();
                                if (onextracallbackwithresult4.IAuthTabCallback_Parcel() != 0) {
                                    int i48 = IAuthTabCallback + 115;
                                    z16 = zIAuthTabCallback;
                                    onExtraCallbackWithResult = i48 % 128;
                                    int i49 = i48 % 2;
                                    if (z4) {
                                        int i50 = i11;
                                        mExternalSyntheticLambda8.onNavigationEvent(mexternalsyntheticlambda82, mExternalSyntheticLambda8.onNavigationEvent(mexternalsyntheticlambda82, list5.get(onextracallbackwithresult4.asBinder()), null, iAuthTabCallback2.onExtraCallback()));
                                        mexternalsyntheticlambda82.onNavigationEvent(jOnExtraCallback2);
                                        i36 = i9;
                                        j3 = jOnExtraCallback2;
                                        ontransact6 = ontransact2;
                                        i35 = i50;
                                        obj8 = obj10;
                                        anonymousClass5 = this;
                                        mexternalsyntheticlambda86 = mexternalsyntheticlambda82;
                                        z14 = z16;
                                        boolean z22 = z4;
                                        iAuthTabCallback7 = iAuthTabCallback2;
                                        z15 = z22;
                                        int i51 = i7;
                                        list10 = list5;
                                        i37 = i10;
                                        onextracallbackwithresult8 = onextracallbackwithresult4;
                                        i32 = i51;
                                        if (i35 > 0) {
                                            int i52 = i36;
                                            anonymousClass5.L$0 = access15400.onNavigationEvent(onextracallbackwithresult3);
                                            anonymousClass5.L$1 = list4;
                                            anonymousClass5.L$2 = ontransact6;
                                            anonymousClass5.L$3 = mexternalsyntheticlambda86;
                                            anonymousClass5.L$4 = iAuthTabCallback7;
                                            anonymousClass5.L$5 = onextracallbackwithresult8;
                                            anonymousClass5.L$6 = access15400.onNavigationEvent(hasprovider3);
                                            anonymousClass5.L$7 = list10;
                                            anonymousClass5.Z$0 = z3;
                                            anonymousClass5.I$0 = i37;
                                            anonymousClass5.Z$1 = z15;
                                            anonymousClass5.I$1 = i32;
                                            anonymousClass5.I$2 = i52;
                                            anonymousClass5.I$3 = i35;
                                            anonymousClass5.Z$2 = z14;
                                            z20 = z15;
                                            int i53 = i37;
                                            anonymousClass5.J$0 = j3;
                                            anonymousClass5.label = 2;
                                            obj9 = obj8;
                                            if (formatMsgs.onWarmupCompleted(i35, anonymousClass5) == obj9) {
                                                return obj9;
                                            }
                                            i46 = i32;
                                            z19 = z3;
                                            list12 = list10;
                                            mexternalsyntheticlambda87 = mexternalsyntheticlambda86;
                                            ontransact7 = ontransact6;
                                            list13 = list4;
                                            i45 = i52;
                                            i47 = i53;
                                            onextracallbackwithresult9 = onextracallbackwithresult3;
                                            ontransact2 = ontransact7;
                                            onextracallbackwithresult3 = onextracallbackwithresult9;
                                            i9 = i45;
                                            list4 = list13;
                                            i11 = i35;
                                            mExternalSyntheticLambda8 mexternalsyntheticlambda882 = mexternalsyntheticlambda87;
                                            i7 = i46;
                                            mexternalsyntheticlambda82 = mexternalsyntheticlambda882;
                                            r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult102 = onextracallbackwithresult8;
                                            i10 = i47;
                                            list5 = list12;
                                            z3 = z19;
                                            onextracallbackwithresult4 = onextracallbackwithresult102;
                                            onextracallbackwithresult4.onExtraCallback(onextracallbackwithresult4.IAuthTabCallback_Parcel() + 1);
                                            i8 = Integer.MAX_VALUE;
                                            boolean z212 = z20;
                                            objOnWarmupCompleted = obj9;
                                            iAuthTabCallback2 = iAuthTabCallback7;
                                            z4 = z212;
                                            if (i10 == i8) {
                                            }
                                            hasprovider3 = list4.get(onextracallbackwithresult4.asBinder());
                                            mExternalSyntheticApiModelOutline1.onTransact.onNavigationEvent onnavigationeventIAuthTabCallback2 = ontransact2.IAuthTabCallback(list5, onextracallbackwithresult4.asBinder());
                                            Object obj102 = objOnWarmupCompleted;
                                            jOnExtraCallback2 = onnavigationeventIAuthTabCallback2.onExtraCallback();
                                            boolean zIAuthTabCallback2 = onnavigationeventIAuthTabCallback2.IAuthTabCallback();
                                            if (onextracallbackwithresult4.IAuthTabCallback_Parcel() != 0) {
                                                z16 = zIAuthTabCallback2;
                                            }
                                        } else {
                                            z20 = z15;
                                            int i54 = i37;
                                            obj9 = obj8;
                                            list5 = list10;
                                            mexternalsyntheticlambda82 = mexternalsyntheticlambda86;
                                            i9 = i36;
                                            i7 = i32;
                                            onextracallbackwithresult4 = onextracallbackwithresult8;
                                            ontransact2 = ontransact6;
                                            i10 = i54;
                                            i11 = i35;
                                            onextracallbackwithresult4.onExtraCallback(onextracallbackwithresult4.IAuthTabCallback_Parcel() + 1);
                                            i8 = Integer.MAX_VALUE;
                                            boolean z2122 = z20;
                                            objOnWarmupCompleted = obj9;
                                            iAuthTabCallback2 = iAuthTabCallback7;
                                            z4 = z2122;
                                            if (i10 == i8) {
                                            }
                                            hasprovider3 = list4.get(onextracallbackwithresult4.asBinder());
                                            mExternalSyntheticApiModelOutline1.onTransact.onNavigationEvent onnavigationeventIAuthTabCallback22 = ontransact2.IAuthTabCallback(list5, onextracallbackwithresult4.asBinder());
                                            Object obj1022 = objOnWarmupCompleted;
                                            jOnExtraCallback2 = onnavigationeventIAuthTabCallback22.onExtraCallback();
                                            boolean zIAuthTabCallback22 = onnavigationeventIAuthTabCallback22.IAuthTabCallback();
                                            if (onextracallbackwithresult4.IAuthTabCallback_Parcel() != 0) {
                                            }
                                        }
                                    }
                                }
                                int i55 = i11;
                                int i56 = !onextracallbackwithresult4.access100() ? i7 : 0;
                                onextracallbackOnNavigationEvent2 = onextracallbackwithresult4.onNavigationEvent();
                                anonymousClass5 = this;
                                anonymousClass5.L$0 = access15400.onNavigationEvent(onextracallbackwithresult3);
                                anonymousClass5.L$1 = list4;
                                anonymousClass5.L$2 = ontransact2;
                                anonymousClass5.L$3 = mexternalsyntheticlambda82;
                                anonymousClass5.L$4 = iAuthTabCallback2;
                                anonymousClass5.L$5 = onextracallbackwithresult4;
                                anonymousClass5.L$6 = access15400.onNavigationEvent(hasprovider3);
                                anonymousClass5.L$7 = list5;
                                anonymousClass5.Z$0 = z3;
                                anonymousClass5.I$0 = i10;
                                anonymousClass5.Z$1 = z4;
                                anonymousClass5.I$1 = i7;
                                anonymousClass5.I$2 = i9;
                                anonymousClass5.I$3 = i55;
                                z17 = z16;
                                anonymousClass5.Z$2 = z17;
                                List<hasProvider> list14 = list4;
                                anonymousClass5.J$0 = jOnExtraCallback2;
                                anonymousClass5.label = 1;
                                mexternalsyntheticlambda85 = mexternalsyntheticlambda82;
                                mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback8 = iAuthTabCallback2;
                                List<SurfaceProcessorNodeOut> list15 = list5;
                                r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult11 = onextracallbackwithresult4;
                                boolean z23 = z3;
                                int i57 = i10;
                                boolean z24 = z4;
                                i38 = i56;
                                int i58 = i7;
                                int i59 = i9;
                                j2 = jOnExtraCallback2;
                                mExternalSyntheticApiModelOutline1.onTransact ontransact8 = ontransact2;
                                obj8 = obj1022;
                                if (mExternalSyntheticLambda8.onExtraCallback(mexternalsyntheticlambda82, hasprovider3, null, iAuthTabCallback2, jOnExtraCallback2, z17, false, i38, null, onextracallbackOnNavigationEvent2, this, 2, null) != obj8) {
                                    return obj8;
                                }
                                z12 = z23;
                                hasprovider2 = hasprovider3;
                                list11 = list14;
                                iAuthTabCallback6 = iAuthTabCallback8;
                                i32 = i58;
                                i34 = i55;
                                z13 = z24;
                                i33 = i59;
                                ontransact5 = ontransact8;
                                z14 = z17;
                                i31 = i57;
                                onextracallbackwithresult7 = onextracallbackwithresult11;
                                list10 = list15;
                                hasprovider3 = hasprovider2;
                                j3 = j2;
                                mexternalsyntheticlambda86 = mexternalsyntheticlambda85;
                                r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult12 = onextracallbackwithresult7;
                                ontransact6 = ontransact5;
                                i35 = i34;
                                z15 = z13;
                                z3 = z12;
                                iAuthTabCallback7 = iAuthTabCallback6;
                                list4 = list11;
                                i36 = i33;
                                i37 = i31;
                                onextracallbackwithresult8 = onextracallbackwithresult12;
                                if (i35 > 0) {
                                }
                            } else if (i40 == 3) {
                                int i60 = anonymousClass5.I$5;
                                i23 = anonymousClass5.I$4;
                                i22 = anonymousClass5.I$3;
                                i21 = anonymousClass5.I$2;
                                i20 = anonymousClass5.I$1;
                                z9 = anonymousClass5.Z$1;
                                i19 = anonymousClass5.I$0;
                                z8 = anonymousClass5.Z$0;
                                List<SurfaceProcessorNodeOut> list16 = (List) anonymousClass5.L$9;
                                List list17 = (List) anonymousClass5.L$6;
                                r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult13 = (r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult) anonymousClass5.L$5;
                                mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback9 = (mExternalSyntheticApiModelOutline1.IAuthTabCallback) anonymousClass5.L$4;
                                mExternalSyntheticLambda8 mexternalsyntheticlambda89 = (mExternalSyntheticLambda8) anonymousClass5.L$3;
                                mExternalSyntheticApiModelOutline1.onTransact ontransact9 = (mExternalSyntheticApiModelOutline1.onTransact) anonymousClass5.L$2;
                                List<hasProvider> list18 = (List) anonymousClass5.L$1;
                                r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult14 = (r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult) anonymousClass5.L$0;
                                ResultKt.onNavigationEvent(obj);
                                onextracallbackwithresult = onextracallbackwithresult14;
                                ontransact4 = ontransact9;
                                i24 = i60;
                                list = list18;
                                list9 = list16;
                                obj5 = objOnWarmupCompleted;
                                mexternalsyntheticlambda84 = mexternalsyntheticlambda89;
                                iAuthTabCallback4 = iAuthTabCallback9;
                                onextracallbackwithresult6 = onextracallbackwithresult13;
                                list8 = list17;
                                int i61 = i19;
                                z = z8;
                                i5 = i21;
                                ontransact = ontransact4;
                                mExternalSyntheticLambda8 mexternalsyntheticlambda810 = mexternalsyntheticlambda84;
                                int i62 = i24;
                                mexternalsyntheticlambda8 = mexternalsyntheticlambda810;
                                mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback10 = iAuthTabCallback4;
                                r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult15 = onextracallbackwithresult6;
                                i6 = i22;
                                onextracallbackwithresult2 = onextracallbackwithresult15;
                                List list19 = list8;
                                i = i20;
                                list3 = list9;
                                z2 = z9;
                                list2 = list19;
                                i2 = i23;
                                i25 = i62;
                                i12 = Integer.MAX_VALUE;
                                iAuthTabCallback3 = iAuthTabCallback10;
                                obj4 = obj5;
                                i4 = i61;
                                onextracallbackwithresult2.onExtraCallback(onextracallbackwithresult2.IAuthTabCallback_Parcel() + 1);
                                mexternalsyntheticlambda8 = mexternalsyntheticlambda8;
                                obj2 = obj4;
                                iAuthTabCallback = iAuthTabCallback3;
                                iMax = i25;
                                i3 = i12;
                                if (i4 == i3) {
                                }
                                hasprovider = list.get(onextracallbackwithresult2.asBinder());
                                mExternalSyntheticApiModelOutline1.onTransact.onNavigationEvent onnavigationeventIAuthTabCallback3 = ontransact.IAuthTabCallback(list3, onextracallbackwithresult2.asBinder());
                                int i63 = i5;
                                int i64 = i4;
                                jOnExtraCallback = onnavigationeventIAuthTabCallback3.onExtraCallback();
                                boolean zIAuthTabCallback3 = onnavigationeventIAuthTabCallback3.IAuthTabCallback();
                                if (onextracallbackwithresult2.IAuthTabCallback_Parcel() == 0) {
                                }
                                if (onextracallbackwithresult2.access100()) {
                                }
                                onextracallbackOnNavigationEvent = onextracallbackwithresult2.onNavigationEvent();
                                anonymousClass5.L$0 = access15400.onNavigationEvent(onextracallbackwithresult);
                                anonymousClass5.L$1 = list;
                                anonymousClass5.L$2 = ontransact;
                                anonymousClass5.L$3 = mexternalsyntheticlambda8;
                                anonymousClass5.L$4 = iAuthTabCallback;
                                anonymousClass5.L$5 = onextracallbackwithresult2;
                                anonymousClass5.L$6 = list2;
                                anonymousClass5.L$7 = access15400.onNavigationEvent(hasprovider);
                                anonymousClass5.L$8 = list3;
                                anonymousClass5.L$9 = null;
                                anonymousClass5.Z$0 = z;
                                anonymousClass5.I$0 = i27;
                                anonymousClass5.Z$1 = z10;
                                anonymousClass5.I$1 = i;
                                anonymousClass5.I$2 = i63;
                                int i65 = i27;
                                int i66 = i26;
                                anonymousClass5.I$3 = i66;
                                anonymousClass5.I$4 = i28;
                                int i67 = i28;
                                int i68 = i29;
                                anonymousClass5.I$5 = i68;
                                anonymousClass5.Z$2 = z11;
                                anonymousClass5.J$0 = jOnExtraCallback;
                                anonymousClass5.label = 4;
                                mExternalSyntheticLambda8 mexternalsyntheticlambda811 = mexternalsyntheticlambda8;
                                iAuthTabCallback5 = iAuthTabCallback;
                                r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult16 = onextracallbackwithresult2;
                                mExternalSyntheticApiModelOutline1.onTransact ontransact10 = ontransact;
                                obj7 = obj6;
                                List<SurfaceProcessorNodeOut> list20 = list3;
                                List list21 = list2;
                                boolean z25 = z;
                                boolean z26 = z10;
                                int i69 = i;
                                boolean z27 = z11;
                                i12 = Integer.MAX_VALUE;
                                if (mExternalSyntheticLambda8.onExtraCallback(mexternalsyntheticlambda8, hasprovider, null, iAuthTabCallback5, jOnExtraCallback, z11, false, i30, null, onextracallbackOnNavigationEvent, this, 2, null) == obj7) {
                                }
                            } else if (i40 == 4) {
                                long j4 = anonymousClass5.J$0;
                                boolean z28 = anonymousClass5.Z$2;
                                int i70 = anonymousClass5.I$5;
                                int i71 = anonymousClass5.I$4;
                                int i72 = anonymousClass5.I$3;
                                int i73 = anonymousClass5.I$2;
                                int i74 = anonymousClass5.I$1;
                                boolean z29 = anonymousClass5.Z$1;
                                int i75 = anonymousClass5.I$0;
                                boolean z30 = anonymousClass5.Z$0;
                                List<SurfaceProcessorNodeOut> list22 = (List) anonymousClass5.L$8;
                                hasProvider hasprovider4 = (hasProvider) anonymousClass5.L$7;
                                List list23 = (List) anonymousClass5.L$6;
                                r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult17 = (r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult) anonymousClass5.L$5;
                                mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback11 = (mExternalSyntheticApiModelOutline1.IAuthTabCallback) anonymousClass5.L$4;
                                mExternalSyntheticLambda8 mexternalsyntheticlambda812 = (mExternalSyntheticLambda8) anonymousClass5.L$3;
                                mExternalSyntheticApiModelOutline1.onTransact ontransact11 = (mExternalSyntheticApiModelOutline1.onTransact) anonymousClass5.L$2;
                                List<hasProvider> list24 = (List) anonymousClass5.L$1;
                                r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult18 = (r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult) anonymousClass5.L$0;
                                ResultKt.onNavigationEvent(obj);
                                onextracallbackwithresult = onextracallbackwithresult18;
                                z5 = z28;
                                i18 = i70;
                                i13 = i71;
                                z7 = z30;
                                hasprovider = hasprovider4;
                                obj3 = objOnWarmupCompleted;
                                j = j4;
                                onextracallbackwithresult5 = onextracallbackwithresult17;
                                mexternalsyntheticlambda83 = mexternalsyntheticlambda812;
                                i12 = Integer.MAX_VALUE;
                                iAuthTabCallback3 = iAuthTabCallback11;
                                z6 = z29;
                                list7 = list23;
                                list = list24;
                                i16 = i73;
                                i17 = i72;
                                list6 = list22;
                                i14 = i75;
                                i15 = i74;
                                ontransact3 = ontransact11;
                                int iIntValue = ((Number) ((Pair) list7.get(onextracallbackwithresult5.asBinder())).getSecond()).intValue();
                                int i76 = i17;
                                iCoerceAtLeast = RangesKt.coerceAtLeast(i18 - iIntValue, 0);
                                if (iCoerceAtLeast <= 0) {
                                }
                            } else {
                                if (i40 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i77 = anonymousClass5.I$5;
                                int i78 = anonymousClass5.I$4;
                                int i79 = anonymousClass5.I$3;
                                int i80 = anonymousClass5.I$2;
                                int i81 = anonymousClass5.I$1;
                                boolean z31 = anonymousClass5.Z$1;
                                int i82 = anonymousClass5.I$0;
                                boolean z32 = anonymousClass5.Z$0;
                                List<SurfaceProcessorNodeOut> list25 = (List) anonymousClass5.L$8;
                                List list26 = (List) anonymousClass5.L$6;
                                r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult19 = (r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult) anonymousClass5.L$5;
                                mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback12 = (mExternalSyntheticApiModelOutline1.IAuthTabCallback) anonymousClass5.L$4;
                                mExternalSyntheticLambda8 mexternalsyntheticlambda813 = (mExternalSyntheticLambda8) anonymousClass5.L$3;
                                mExternalSyntheticApiModelOutline1.onTransact ontransact12 = (mExternalSyntheticApiModelOutline1.onTransact) anonymousClass5.L$2;
                                List<hasProvider> list27 = (List) anonymousClass5.L$1;
                                r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult20 = (r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult) anonymousClass5.L$0;
                                ResultKt.onNavigationEvent(obj);
                                mExternalSyntheticApiModelOutline1.onTransact ontransact13 = ontransact12;
                                int i83 = i77;
                                list = list27;
                                i12 = Integer.MAX_VALUE;
                                int i84 = i78;
                                obj4 = objOnWarmupCompleted;
                                List<SurfaceProcessorNodeOut> list28 = list25;
                                mExternalSyntheticLambda8 mexternalsyntheticlambda814 = mexternalsyntheticlambda813;
                                i14 = i82;
                                List list29 = list26;
                                z6 = z31;
                                list6 = list28;
                                iAuthTabCallback3 = iAuthTabCallback12;
                                i16 = i80;
                                boolean z33 = z32;
                                i15 = i81;
                                mexternalsyntheticlambda83 = mexternalsyntheticlambda814;
                                onextracallbackwithresult5 = onextracallbackwithresult19;
                                ontransact3 = ontransact13;
                                onextracallbackwithresult = onextracallbackwithresult20;
                                i18 = i83;
                                int i85 = i84;
                                int i86 = i79;
                                int i87 = i85;
                                i2 = i87;
                                onextracallbackwithresult2 = onextracallbackwithresult5;
                                i25 = i18;
                                mexternalsyntheticlambda8 = mexternalsyntheticlambda83;
                                list3 = list6;
                                list2 = list29;
                                int i88 = i86;
                                z = z33;
                                ontransact = ontransact3;
                                i5 = i16;
                                i4 = i14;
                                i6 = i88;
                                boolean z34 = z6;
                                i = i15;
                                z2 = z34;
                                onextracallbackwithresult2.onExtraCallback(onextracallbackwithresult2.IAuthTabCallback_Parcel() + 1);
                                mexternalsyntheticlambda8 = mexternalsyntheticlambda8;
                                obj2 = obj4;
                                iAuthTabCallback = iAuthTabCallback3;
                                iMax = i25;
                                i3 = i12;
                                if (i4 == i3 && onextracallbackwithresult2.onWarmupCompleted() >= i4) {
                                    return Unit.INSTANCE;
                                }
                                hasprovider = list.get(onextracallbackwithresult2.asBinder());
                                mExternalSyntheticApiModelOutline1.onTransact.onNavigationEvent onnavigationeventIAuthTabCallback32 = ontransact.IAuthTabCallback(list3, onextracallbackwithresult2.asBinder());
                                int i632 = i5;
                                int i642 = i4;
                                jOnExtraCallback = onnavigationeventIAuthTabCallback32.onExtraCallback();
                                boolean zIAuthTabCallback32 = onnavigationeventIAuthTabCallback32.IAuthTabCallback();
                                if (onextracallbackwithresult2.IAuthTabCallback_Parcel() == 0) {
                                    int i89 = onExtraCallbackWithResult;
                                    int i90 = i89 + 81;
                                    i26 = i6;
                                    IAuthTabCallback = i90 % 128;
                                    int i91 = i90 % 2;
                                    if (z2) {
                                        int i92 = i89 + 19;
                                        boolean z35 = z2;
                                        IAuthTabCallback = i92 % 128;
                                        int i93 = i92 % 2;
                                        SurfaceProcessorNodeOut surfaceProcessorNodeOut = list3.get(onextracallbackwithresult2.asBinder());
                                        mExternalSyntheticLambda8.onNavigationEvent(mexternalsyntheticlambda8, mExternalSyntheticLambda8.onNavigationEvent(mexternalsyntheticlambda8, surfaceProcessorNodeOut, null, iAuthTabCallback.onExtraCallback()));
                                        mexternalsyntheticlambda8.onNavigationEvent(jOnExtraCallback);
                                        if (iMax <= 0) {
                                            int i94 = IAuthTabCallback + 43;
                                            onExtraCallbackWithResult = i94 % 128;
                                            int i95 = i94 % 2;
                                            if (i <= 0) {
                                                i5 = i632;
                                                z2 = z35;
                                                i6 = i26;
                                                i2 = i2;
                                                i25 = iMax;
                                                i12 = Integer.MAX_VALUE;
                                                iAuthTabCallback3 = iAuthTabCallback;
                                                obj4 = obj2;
                                                i4 = i642;
                                                onextracallbackwithresult2.onExtraCallback(onextracallbackwithresult2.IAuthTabCallback_Parcel() + 1);
                                                mexternalsyntheticlambda8 = mexternalsyntheticlambda8;
                                                obj2 = obj4;
                                                iAuthTabCallback = iAuthTabCallback3;
                                                iMax = i25;
                                                i3 = i12;
                                                if (i4 == i3) {
                                                }
                                                hasprovider = list.get(onextracallbackwithresult2.asBinder());
                                                mExternalSyntheticApiModelOutline1.onTransact.onNavigationEvent onnavigationeventIAuthTabCallback322 = ontransact.IAuthTabCallback(list3, onextracallbackwithresult2.asBinder());
                                                int i6322 = i5;
                                                int i6422 = i4;
                                                jOnExtraCallback = onnavigationeventIAuthTabCallback322.onExtraCallback();
                                                boolean zIAuthTabCallback322 = onnavigationeventIAuthTabCallback322.IAuthTabCallback();
                                                if (onextracallbackwithresult2.IAuthTabCallback_Parcel() == 0) {
                                                    i26 = i6;
                                                    obj6 = obj2;
                                                    z10 = z2;
                                                    i27 = i6422;
                                                    int i96 = iMax;
                                                    z11 = zIAuthTabCallback322;
                                                    i28 = i2;
                                                    i29 = i96;
                                                }
                                            }
                                        }
                                        long j5 = i + iMax;
                                        anonymousClass5.L$0 = access15400.onNavigationEvent(onextracallbackwithresult);
                                        anonymousClass5.L$1 = list;
                                        anonymousClass5.L$2 = ontransact;
                                        anonymousClass5.L$3 = mexternalsyntheticlambda8;
                                        anonymousClass5.L$4 = iAuthTabCallback;
                                        anonymousClass5.L$5 = onextracallbackwithresult2;
                                        anonymousClass5.L$6 = list2;
                                        anonymousClass5.L$7 = access15400.onNavigationEvent(hasprovider);
                                        anonymousClass5.L$8 = access15400.onNavigationEvent(surfaceProcessorNodeOut);
                                        anonymousClass5.L$9 = list3;
                                        anonymousClass5.Z$0 = z;
                                        anonymousClass5.I$0 = i6422;
                                        anonymousClass5.Z$1 = z35;
                                        anonymousClass5.I$1 = i;
                                        anonymousClass5.I$2 = i6322;
                                        anonymousClass5.I$3 = i26;
                                        int i97 = i2;
                                        anonymousClass5.I$4 = i97;
                                        anonymousClass5.I$5 = iMax;
                                        int i98 = iMax;
                                        anonymousClass5.Z$2 = zIAuthTabCallback322;
                                        anonymousClass5.J$0 = jOnExtraCallback;
                                        anonymousClass5.label = 3;
                                        obj5 = obj2;
                                        if (formatMsgs.onWarmupCompleted(j5, anonymousClass5) == obj5) {
                                            return obj5;
                                        }
                                        mexternalsyntheticlambda84 = mexternalsyntheticlambda8;
                                        z8 = z;
                                        i19 = i6422;
                                        i24 = i98;
                                        ontransact4 = ontransact;
                                        list9 = list3;
                                        i20 = i;
                                        i21 = i6322;
                                        list8 = list2;
                                        z9 = z35;
                                        onextracallbackwithresult6 = onextracallbackwithresult2;
                                        i22 = i26;
                                        iAuthTabCallback4 = iAuthTabCallback;
                                        i23 = i97;
                                        int i612 = i19;
                                        z = z8;
                                        i5 = i21;
                                        ontransact = ontransact4;
                                        mExternalSyntheticLambda8 mexternalsyntheticlambda8102 = mexternalsyntheticlambda84;
                                        int i622 = i24;
                                        mexternalsyntheticlambda8 = mexternalsyntheticlambda8102;
                                        mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback102 = iAuthTabCallback4;
                                        r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult152 = onextracallbackwithresult6;
                                        i6 = i22;
                                        onextracallbackwithresult2 = onextracallbackwithresult152;
                                        List list192 = list8;
                                        i = i20;
                                        list3 = list9;
                                        z2 = z9;
                                        list2 = list192;
                                        i2 = i23;
                                        i25 = i622;
                                        i12 = Integer.MAX_VALUE;
                                        iAuthTabCallback3 = iAuthTabCallback102;
                                        obj4 = obj5;
                                        i4 = i612;
                                        onextracallbackwithresult2.onExtraCallback(onextracallbackwithresult2.IAuthTabCallback_Parcel() + 1);
                                        mexternalsyntheticlambda8 = mexternalsyntheticlambda8;
                                        obj2 = obj4;
                                        iAuthTabCallback = iAuthTabCallback3;
                                        iMax = i25;
                                        i3 = i12;
                                        if (i4 == i3) {
                                        }
                                        hasprovider = list.get(onextracallbackwithresult2.asBinder());
                                        mExternalSyntheticApiModelOutline1.onTransact.onNavigationEvent onnavigationeventIAuthTabCallback3222 = ontransact.IAuthTabCallback(list3, onextracallbackwithresult2.asBinder());
                                        int i63222 = i5;
                                        int i64222 = i4;
                                        jOnExtraCallback = onnavigationeventIAuthTabCallback3222.onExtraCallback();
                                        boolean zIAuthTabCallback3222 = onnavigationeventIAuthTabCallback3222.IAuthTabCallback();
                                        if (onextracallbackwithresult2.IAuthTabCallback_Parcel() == 0) {
                                        }
                                    } else {
                                        z10 = z2;
                                        i28 = i2;
                                        obj6 = obj2;
                                        i27 = i64222;
                                        i29 = iMax;
                                        z11 = zIAuthTabCallback3222;
                                    }
                                }
                                i30 = onextracallbackwithresult2.access100() ? i : 0;
                                onextracallbackOnNavigationEvent = onextracallbackwithresult2.onNavigationEvent();
                                anonymousClass5.L$0 = access15400.onNavigationEvent(onextracallbackwithresult);
                                anonymousClass5.L$1 = list;
                                anonymousClass5.L$2 = ontransact;
                                anonymousClass5.L$3 = mexternalsyntheticlambda8;
                                anonymousClass5.L$4 = iAuthTabCallback;
                                anonymousClass5.L$5 = onextracallbackwithresult2;
                                anonymousClass5.L$6 = list2;
                                anonymousClass5.L$7 = access15400.onNavigationEvent(hasprovider);
                                anonymousClass5.L$8 = list3;
                                anonymousClass5.L$9 = null;
                                anonymousClass5.Z$0 = z;
                                anonymousClass5.I$0 = i27;
                                anonymousClass5.Z$1 = z10;
                                anonymousClass5.I$1 = i;
                                anonymousClass5.I$2 = i63222;
                                int i652 = i27;
                                int i662 = i26;
                                anonymousClass5.I$3 = i662;
                                anonymousClass5.I$4 = i28;
                                int i672 = i28;
                                int i682 = i29;
                                anonymousClass5.I$5 = i682;
                                anonymousClass5.Z$2 = z11;
                                anonymousClass5.J$0 = jOnExtraCallback;
                                anonymousClass5.label = 4;
                                mExternalSyntheticLambda8 mexternalsyntheticlambda8112 = mexternalsyntheticlambda8;
                                iAuthTabCallback5 = iAuthTabCallback;
                                r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult162 = onextracallbackwithresult2;
                                mExternalSyntheticApiModelOutline1.onTransact ontransact102 = ontransact;
                                obj7 = obj6;
                                List<SurfaceProcessorNodeOut> list202 = list3;
                                List list212 = list2;
                                boolean z252 = z;
                                boolean z262 = z10;
                                int i692 = i;
                                boolean z272 = z11;
                                i12 = Integer.MAX_VALUE;
                                if (mExternalSyntheticLambda8.onExtraCallback(mexternalsyntheticlambda8, hasprovider, null, iAuthTabCallback5, jOnExtraCallback, z11, false, i30, null, onextracallbackOnNavigationEvent, this, 2, null) == obj7) {
                                    int i99 = onExtraCallbackWithResult + 109;
                                    int i100 = i99 % 128;
                                    IAuthTabCallback = i100;
                                    int i101 = i99 % 2;
                                    int i102 = i100 + 45;
                                    onExtraCallbackWithResult = i102 % 128;
                                    int i103 = i102 % 2;
                                    return obj7;
                                }
                                obj3 = obj7;
                                z6 = z262;
                                ontransact3 = ontransact102;
                                list6 = list202;
                                i15 = i692;
                                i17 = i662;
                                i14 = i652;
                                z5 = z272;
                                i13 = i672;
                                i16 = i63222;
                                i18 = i682;
                                mexternalsyntheticlambda83 = mexternalsyntheticlambda8112;
                                iAuthTabCallback3 = iAuthTabCallback5;
                                onextracallbackwithresult5 = onextracallbackwithresult162;
                                list7 = list212;
                                z7 = z252;
                                j = jOnExtraCallback;
                                int iIntValue2 = ((Number) ((Pair) list7.get(onextracallbackwithresult5.asBinder())).getSecond()).intValue();
                                int i762 = i17;
                                iCoerceAtLeast = RangesKt.coerceAtLeast(i18 - iIntValue2, 0);
                                if (iCoerceAtLeast <= 0) {
                                    boolean z36 = z7;
                                    long j6 = iCoerceAtLeast;
                                    anonymousClass5.L$0 = access15400.onNavigationEvent(onextracallbackwithresult);
                                    anonymousClass5.L$1 = list;
                                    anonymousClass5.L$2 = ontransact3;
                                    anonymousClass5.L$3 = mexternalsyntheticlambda83;
                                    anonymousClass5.L$4 = iAuthTabCallback3;
                                    anonymousClass5.L$5 = onextracallbackwithresult5;
                                    anonymousClass5.L$6 = list7;
                                    anonymousClass5.L$7 = access15400.onNavigationEvent(hasprovider);
                                    anonymousClass5.L$8 = list6;
                                    anonymousClass5.Z$0 = z36;
                                    anonymousClass5.I$0 = i14;
                                    anonymousClass5.Z$1 = z6;
                                    anonymousClass5.I$1 = i15;
                                    anonymousClass5.I$2 = i16;
                                    anonymousClass5.I$3 = i762;
                                    List list30 = list7;
                                    int i104 = i13;
                                    anonymousClass5.I$4 = i104;
                                    anonymousClass5.I$5 = i18;
                                    i83 = i18;
                                    anonymousClass5.Z$2 = z5;
                                    anonymousClass5.I$6 = iIntValue2;
                                    anonymousClass5.I$7 = iCoerceAtLeast;
                                    i84 = i104;
                                    anonymousClass5.J$0 = j;
                                    anonymousClass5.label = 5;
                                    obj4 = obj3;
                                    if (formatMsgs.onWarmupCompleted(j6, anonymousClass5) == obj4) {
                                        return obj4;
                                    }
                                    onextracallbackwithresult20 = onextracallbackwithresult;
                                    ontransact13 = ontransact3;
                                    onextracallbackwithresult19 = onextracallbackwithresult5;
                                    mexternalsyntheticlambda814 = mexternalsyntheticlambda83;
                                    i81 = i15;
                                    z32 = z36;
                                    i79 = i762;
                                    i80 = i16;
                                    iAuthTabCallback12 = iAuthTabCallback3;
                                    list28 = list6;
                                    z31 = z6;
                                    list26 = list30;
                                    List list292 = list26;
                                    z6 = z31;
                                    list6 = list28;
                                    iAuthTabCallback3 = iAuthTabCallback12;
                                    i16 = i80;
                                    boolean z332 = z32;
                                    i15 = i81;
                                    mexternalsyntheticlambda83 = mexternalsyntheticlambda814;
                                    onextracallbackwithresult5 = onextracallbackwithresult19;
                                    ontransact3 = ontransact13;
                                    onextracallbackwithresult = onextracallbackwithresult20;
                                    i18 = i83;
                                    int i852 = i84;
                                    int i862 = i79;
                                    int i872 = i852;
                                    i2 = i872;
                                    onextracallbackwithresult2 = onextracallbackwithresult5;
                                    i25 = i18;
                                    mexternalsyntheticlambda8 = mexternalsyntheticlambda83;
                                    list3 = list6;
                                    list2 = list292;
                                    int i882 = i862;
                                    z = z332;
                                    ontransact = ontransact3;
                                    i5 = i16;
                                    i4 = i14;
                                    i6 = i882;
                                    boolean z342 = z6;
                                    i = i15;
                                    z2 = z342;
                                    onextracallbackwithresult2.onExtraCallback(onextracallbackwithresult2.IAuthTabCallback_Parcel() + 1);
                                    mexternalsyntheticlambda8 = mexternalsyntheticlambda8;
                                    obj2 = obj4;
                                    iAuthTabCallback = iAuthTabCallback3;
                                    iMax = i25;
                                    i3 = i12;
                                    if (i4 == i3) {
                                    }
                                    hasprovider = list.get(onextracallbackwithresult2.asBinder());
                                    mExternalSyntheticApiModelOutline1.onTransact.onNavigationEvent onnavigationeventIAuthTabCallback32222 = ontransact.IAuthTabCallback(list3, onextracallbackwithresult2.asBinder());
                                    int i632222 = i5;
                                    int i642222 = i4;
                                    jOnExtraCallback = onnavigationeventIAuthTabCallback32222.onExtraCallback();
                                    boolean zIAuthTabCallback32222 = onnavigationeventIAuthTabCallback32222.IAuthTabCallback();
                                    if (onextracallbackwithresult2.IAuthTabCallback_Parcel() == 0) {
                                    }
                                    if (onextracallbackwithresult2.access100()) {
                                    }
                                    onextracallbackOnNavigationEvent = onextracallbackwithresult2.onNavigationEvent();
                                    anonymousClass5.L$0 = access15400.onNavigationEvent(onextracallbackwithresult);
                                    anonymousClass5.L$1 = list;
                                    anonymousClass5.L$2 = ontransact;
                                    anonymousClass5.L$3 = mexternalsyntheticlambda8;
                                    anonymousClass5.L$4 = iAuthTabCallback;
                                    anonymousClass5.L$5 = onextracallbackwithresult2;
                                    anonymousClass5.L$6 = list2;
                                    anonymousClass5.L$7 = access15400.onNavigationEvent(hasprovider);
                                    anonymousClass5.L$8 = list3;
                                    anonymousClass5.L$9 = null;
                                    anonymousClass5.Z$0 = z;
                                    anonymousClass5.I$0 = i27;
                                    anonymousClass5.Z$1 = z10;
                                    anonymousClass5.I$1 = i;
                                    anonymousClass5.I$2 = i632222;
                                    int i6522 = i27;
                                    int i6622 = i26;
                                    anonymousClass5.I$3 = i6622;
                                    anonymousClass5.I$4 = i28;
                                    int i6722 = i28;
                                    int i6822 = i29;
                                    anonymousClass5.I$5 = i6822;
                                    anonymousClass5.Z$2 = z11;
                                    anonymousClass5.J$0 = jOnExtraCallback;
                                    anonymousClass5.label = 4;
                                    mExternalSyntheticLambda8 mexternalsyntheticlambda81122 = mexternalsyntheticlambda8;
                                    iAuthTabCallback5 = iAuthTabCallback;
                                    r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult1622 = onextracallbackwithresult2;
                                    mExternalSyntheticApiModelOutline1.onTransact ontransact1022 = ontransact;
                                    obj7 = obj6;
                                    List<SurfaceProcessorNodeOut> list2022 = list3;
                                    List list2122 = list2;
                                    boolean z2522 = z;
                                    boolean z2622 = z10;
                                    int i6922 = i;
                                    boolean z2722 = z11;
                                    i12 = Integer.MAX_VALUE;
                                    if (mExternalSyntheticLambda8.onExtraCallback(mexternalsyntheticlambda8, hasprovider, null, iAuthTabCallback5, jOnExtraCallback, z11, false, i30, null, onextracallbackOnNavigationEvent, this, 2, null) == obj7) {
                                    }
                                } else {
                                    list292 = list7;
                                    obj4 = obj3;
                                    z332 = z7;
                                    i872 = i13;
                                    i862 = i762;
                                    i2 = i872;
                                    onextracallbackwithresult2 = onextracallbackwithresult5;
                                    i25 = i18;
                                    mexternalsyntheticlambda8 = mexternalsyntheticlambda83;
                                    list3 = list6;
                                    list2 = list292;
                                    int i8822 = i862;
                                    z = z332;
                                    ontransact = ontransact3;
                                    i5 = i16;
                                    i4 = i14;
                                    i6 = i8822;
                                    boolean z3422 = z6;
                                    i = i15;
                                    z2 = z3422;
                                    onextracallbackwithresult2.onExtraCallback(onextracallbackwithresult2.IAuthTabCallback_Parcel() + 1);
                                    mexternalsyntheticlambda8 = mexternalsyntheticlambda8;
                                    obj2 = obj4;
                                    iAuthTabCallback = iAuthTabCallback3;
                                    iMax = i25;
                                    i3 = i12;
                                    if (i4 == i3) {
                                    }
                                    hasprovider = list.get(onextracallbackwithresult2.asBinder());
                                    mExternalSyntheticApiModelOutline1.onTransact.onNavigationEvent onnavigationeventIAuthTabCallback322222 = ontransact.IAuthTabCallback(list3, onextracallbackwithresult2.asBinder());
                                    int i6322222 = i5;
                                    int i6422222 = i4;
                                    jOnExtraCallback = onnavigationeventIAuthTabCallback322222.onExtraCallback();
                                    boolean zIAuthTabCallback322222 = onnavigationeventIAuthTabCallback322222.IAuthTabCallback();
                                    if (onextracallbackwithresult2.IAuthTabCallback_Parcel() == 0) {
                                    }
                                    if (onextracallbackwithresult2.access100()) {
                                    }
                                    onextracallbackOnNavigationEvent = onextracallbackwithresult2.onNavigationEvent();
                                    anonymousClass5.L$0 = access15400.onNavigationEvent(onextracallbackwithresult);
                                    anonymousClass5.L$1 = list;
                                    anonymousClass5.L$2 = ontransact;
                                    anonymousClass5.L$3 = mexternalsyntheticlambda8;
                                    anonymousClass5.L$4 = iAuthTabCallback;
                                    anonymousClass5.L$5 = onextracallbackwithresult2;
                                    anonymousClass5.L$6 = list2;
                                    anonymousClass5.L$7 = access15400.onNavigationEvent(hasprovider);
                                    anonymousClass5.L$8 = list3;
                                    anonymousClass5.L$9 = null;
                                    anonymousClass5.Z$0 = z;
                                    anonymousClass5.I$0 = i27;
                                    anonymousClass5.Z$1 = z10;
                                    anonymousClass5.I$1 = i;
                                    anonymousClass5.I$2 = i6322222;
                                    int i65222 = i27;
                                    int i66222 = i26;
                                    anonymousClass5.I$3 = i66222;
                                    anonymousClass5.I$4 = i28;
                                    int i67222 = i28;
                                    int i68222 = i29;
                                    anonymousClass5.I$5 = i68222;
                                    anonymousClass5.Z$2 = z11;
                                    anonymousClass5.J$0 = jOnExtraCallback;
                                    anonymousClass5.label = 4;
                                    mExternalSyntheticLambda8 mexternalsyntheticlambda811222 = mexternalsyntheticlambda8;
                                    iAuthTabCallback5 = iAuthTabCallback;
                                    r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult16222 = onextracallbackwithresult2;
                                    mExternalSyntheticApiModelOutline1.onTransact ontransact10222 = ontransact;
                                    obj7 = obj6;
                                    List<SurfaceProcessorNodeOut> list20222 = list3;
                                    List list21222 = list2;
                                    boolean z25222 = z;
                                    boolean z26222 = z10;
                                    int i69222 = i;
                                    boolean z27222 = z11;
                                    i12 = Integer.MAX_VALUE;
                                    if (mExternalSyntheticLambda8.onExtraCallback(mexternalsyntheticlambda8, hasprovider, null, iAuthTabCallback5, jOnExtraCallback, z11, false, i30, null, onextracallbackOnNavigationEvent, this, 2, null) == obj7) {
                                    }
                                }
                            }
                        } else {
                            long j7 = anonymousClass5.J$0;
                            z14 = anonymousClass5.Z$2;
                            i34 = anonymousClass5.I$3;
                            i33 = anonymousClass5.I$2;
                            i32 = anonymousClass5.I$1;
                            z13 = anonymousClass5.Z$1;
                            i31 = anonymousClass5.I$0;
                            z12 = anonymousClass5.Z$0;
                            list10 = (List) anonymousClass5.L$7;
                            hasprovider2 = (hasProvider) anonymousClass5.L$6;
                            onextracallbackwithresult7 = (r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult) anonymousClass5.L$5;
                            iAuthTabCallback6 = (mExternalSyntheticApiModelOutline1.IAuthTabCallback) anonymousClass5.L$4;
                            mExternalSyntheticLambda8 mexternalsyntheticlambda815 = (mExternalSyntheticLambda8) anonymousClass5.L$3;
                            mExternalSyntheticApiModelOutline1.onTransact ontransact14 = (mExternalSyntheticApiModelOutline1.onTransact) anonymousClass5.L$2;
                            list11 = (List) anonymousClass5.L$1;
                            r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult21 = (r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult) anonymousClass5.L$0;
                            ResultKt.onNavigationEvent(obj);
                            mexternalsyntheticlambda85 = mexternalsyntheticlambda815;
                            j2 = j7;
                            onextracallbackwithresult3 = onextracallbackwithresult21;
                            obj8 = objOnWarmupCompleted;
                            ontransact5 = ontransact14;
                            hasprovider3 = hasprovider2;
                            j3 = j2;
                            mexternalsyntheticlambda86 = mexternalsyntheticlambda85;
                            r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult122 = onextracallbackwithresult7;
                            ontransact6 = ontransact5;
                            i35 = i34;
                            z15 = z13;
                            z3 = z12;
                            iAuthTabCallback7 = iAuthTabCallback6;
                            list4 = list11;
                            i36 = i33;
                            i37 = i31;
                            onextracallbackwithresult8 = onextracallbackwithresult122;
                            if (i35 > 0) {
                            }
                        }
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult22 = anonymousClass5.$savedAnimationState;
                        boolean zIAuthTabCallbackStub = onextracallbackwithresult22 != null ? onextracallbackwithresult22.IAuthTabCallbackStub() : anonymousClass5.$startToStart;
                        r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult23 = anonymousClass5.$savedAnimationState;
                        if (onextracallbackwithresult23 == null) {
                            r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult24 = new r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult(anonymousClass5.$texts, anonymousClass5.$motion, anonymousClass5.$sizeStrategy, anonymousClass5.$initialDelay, anonymousClass5.$interval, anonymousClass5.$playCount, anonymousClass5.$skipIntroMotion, zIAuthTabCallbackStub);
                            mExternalSyntheticLambda8.onExtraCallbackWithResult(anonymousClass5.this$0, onextracallbackwithresult24);
                            onextracallbackwithresult23 = onextracallbackwithresult24;
                        }
                        List<hasProvider> list31 = anonymousClass5.$texts;
                        Context context = anonymousClass5.$context;
                        int i105 = anonymousClass5.$interval;
                        int i106 = anonymousClass5.$playCount;
                        mExternalSyntheticApiModelOutline1.onTransact ontransact15 = anonymousClass5.$sizeStrategy;
                        boolean z37 = anonymousClass5.$skipIntroMotion;
                        mExternalSyntheticLambda8 mexternalsyntheticlambda816 = anonymousClass5.this$0;
                        mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback13 = anonymousClass5.$motion;
                        i = anonymousClass5.$initialDelay;
                        ArrayList arrayList = new ArrayList(list31.size());
                        int size = list31.size();
                        int i107 = 0;
                        while (i107 < size) {
                            arrayList.add(mexternalsyntheticlambda816.onExtraCallbackWithResult(list31.get(i107)));
                            i107++;
                            onextracallbackwithresult23 = onextracallbackwithresult23;
                        }
                        r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult25 = onextracallbackwithresult23;
                        if (P0.IAuthTabCallback(context) && i105 == 0) {
                            i105 = 1000;
                        }
                        if (!zIAuthTabCallbackStub) {
                            int i108 = onExtraCallbackWithResult + 35;
                            IAuthTabCallback = i108 % 128;
                            int i109 = i108 % 2;
                            onextracallbackwithresult3 = onextracallbackwithresult25;
                            list4 = list31;
                            ontransact2 = ontransact15;
                            mexternalsyntheticlambda82 = mexternalsyntheticlambda816;
                            iAuthTabCallback2 = iAuthTabCallback13;
                            i7 = i;
                            i8 = Integer.MAX_VALUE;
                            i9 = 0;
                            z3 = zIAuthTabCallbackStub;
                            z4 = z37;
                            i10 = i106;
                            onextracallbackwithresult4 = onextracallbackwithresult3;
                            i11 = i105;
                            list5 = arrayList;
                            if (i10 == i8) {
                            }
                            hasprovider3 = list4.get(onextracallbackwithresult4.asBinder());
                            mExternalSyntheticApiModelOutline1.onTransact.onNavigationEvent onnavigationeventIAuthTabCallback222 = ontransact2.IAuthTabCallback(list5, onextracallbackwithresult4.asBinder());
                            Object obj10222 = objOnWarmupCompleted;
                            jOnExtraCallback2 = onnavigationeventIAuthTabCallback222.onExtraCallback();
                            boolean zIAuthTabCallback222 = onnavigationeventIAuthTabCallback222.IAuthTabCallback();
                            if (onextracallbackwithresult4.IAuthTabCallback_Parcel() != 0) {
                            }
                            int i552 = i11;
                            if (!onextracallbackwithresult4.access100()) {
                            }
                            onextracallbackOnNavigationEvent2 = onextracallbackwithresult4.onNavigationEvent();
                            anonymousClass5 = this;
                            anonymousClass5.L$0 = access15400.onNavigationEvent(onextracallbackwithresult3);
                            anonymousClass5.L$1 = list4;
                            anonymousClass5.L$2 = ontransact2;
                            anonymousClass5.L$3 = mexternalsyntheticlambda82;
                            anonymousClass5.L$4 = iAuthTabCallback2;
                            anonymousClass5.L$5 = onextracallbackwithresult4;
                            anonymousClass5.L$6 = access15400.onNavigationEvent(hasprovider3);
                            anonymousClass5.L$7 = list5;
                            anonymousClass5.Z$0 = z3;
                            anonymousClass5.I$0 = i10;
                            anonymousClass5.Z$1 = z4;
                            anonymousClass5.I$1 = i7;
                            anonymousClass5.I$2 = i9;
                            anonymousClass5.I$3 = i552;
                            z17 = z16;
                            anonymousClass5.Z$2 = z17;
                            List<hasProvider> list142 = list4;
                            anonymousClass5.J$0 = jOnExtraCallback2;
                            anonymousClass5.label = 1;
                            mexternalsyntheticlambda85 = mexternalsyntheticlambda82;
                            mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback82 = iAuthTabCallback2;
                            List<SurfaceProcessorNodeOut> list152 = list5;
                            r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult112 = onextracallbackwithresult4;
                            boolean z232 = z3;
                            int i572 = i10;
                            boolean z242 = z4;
                            i38 = i56;
                            int i582 = i7;
                            int i592 = i9;
                            j2 = jOnExtraCallback2;
                            mExternalSyntheticApiModelOutline1.onTransact ontransact82 = ontransact2;
                            obj8 = obj10222;
                            if (mExternalSyntheticLambda8.onExtraCallback(mexternalsyntheticlambda82, hasprovider3, null, iAuthTabCallback2, jOnExtraCallback2, z17, false, i38, null, onextracallbackOnNavigationEvent2, this, 2, null) != obj8) {
                            }
                        } else {
                            List listOnWarmupCompleted = mExternalSyntheticLambda8.onWarmupCompleted(mexternalsyntheticlambda816, list31, iAuthTabCallback13);
                            Iterator it = listOnWarmupCompleted.iterator();
                            if (it.hasNext()) {
                                numOnNavigationEvent = access14000.onNavigationEvent(((Number) ((Pair) it.next()).getSecond()).intValue());
                                while (it.hasNext()) {
                                    Integer numOnNavigationEvent2 = access14000.onNavigationEvent(((Number) ((Pair) it.next()).getSecond()).intValue());
                                    if (numOnNavigationEvent.compareTo(numOnNavigationEvent2) < 0) {
                                        numOnNavigationEvent = numOnNavigationEvent2;
                                    }
                                }
                            } else {
                                numOnNavigationEvent = null;
                            }
                            int iIntValue3 = numOnNavigationEvent != null ? numOnNavigationEvent.intValue() : 0;
                            iMax = Math.max(i105, iIntValue3);
                            onextracallbackwithresult = onextracallbackwithresult25;
                            list = list31;
                            obj2 = objOnWarmupCompleted;
                            ontransact = ontransact15;
                            i2 = iIntValue3;
                            i3 = Integer.MAX_VALUE;
                            onextracallbackwithresult2 = onextracallbackwithresult;
                            z = zIAuthTabCallbackStub;
                            mexternalsyntheticlambda8 = mexternalsyntheticlambda816;
                            i4 = i106;
                            list2 = listOnWarmupCompleted;
                            iAuthTabCallback = iAuthTabCallback13;
                            z2 = z37;
                            i5 = 0;
                            i6 = i105;
                            list3 = arrayList;
                            if (i4 == i3) {
                            }
                            hasprovider = list.get(onextracallbackwithresult2.asBinder());
                            mExternalSyntheticApiModelOutline1.onTransact.onNavigationEvent onnavigationeventIAuthTabCallback3222222 = ontransact.IAuthTabCallback(list3, onextracallbackwithresult2.asBinder());
                            int i63222222 = i5;
                            int i64222222 = i4;
                            jOnExtraCallback = onnavigationeventIAuthTabCallback3222222.onExtraCallback();
                            boolean zIAuthTabCallback3222222 = onnavigationeventIAuthTabCallback3222222.IAuthTabCallback();
                            if (onextracallbackwithresult2.IAuthTabCallback_Parcel() == 0) {
                            }
                            if (onextracallbackwithresult2.access100()) {
                            }
                            onextracallbackOnNavigationEvent = onextracallbackwithresult2.onNavigationEvent();
                            anonymousClass5.L$0 = access15400.onNavigationEvent(onextracallbackwithresult);
                            anonymousClass5.L$1 = list;
                            anonymousClass5.L$2 = ontransact;
                            anonymousClass5.L$3 = mexternalsyntheticlambda8;
                            anonymousClass5.L$4 = iAuthTabCallback;
                            anonymousClass5.L$5 = onextracallbackwithresult2;
                            anonymousClass5.L$6 = list2;
                            anonymousClass5.L$7 = access15400.onNavigationEvent(hasprovider);
                            anonymousClass5.L$8 = list3;
                            anonymousClass5.L$9 = null;
                            anonymousClass5.Z$0 = z;
                            anonymousClass5.I$0 = i27;
                            anonymousClass5.Z$1 = z10;
                            anonymousClass5.I$1 = i;
                            anonymousClass5.I$2 = i63222222;
                            int i652222 = i27;
                            int i662222 = i26;
                            anonymousClass5.I$3 = i662222;
                            anonymousClass5.I$4 = i28;
                            int i672222 = i28;
                            int i682222 = i29;
                            anonymousClass5.I$5 = i682222;
                            anonymousClass5.Z$2 = z11;
                            anonymousClass5.J$0 = jOnExtraCallback;
                            anonymousClass5.label = 4;
                            mExternalSyntheticLambda8 mexternalsyntheticlambda8112222 = mexternalsyntheticlambda8;
                            iAuthTabCallback5 = iAuthTabCallback;
                            r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult162222 = onextracallbackwithresult2;
                            mExternalSyntheticApiModelOutline1.onTransact ontransact102222 = ontransact;
                            obj7 = obj6;
                            List<SurfaceProcessorNodeOut> list202222 = list3;
                            List list212222 = list2;
                            boolean z252222 = z;
                            boolean z262222 = z10;
                            int i692222 = i;
                            boolean z272222 = z11;
                            i12 = Integer.MAX_VALUE;
                            if (mExternalSyntheticLambda8.onExtraCallback(mexternalsyntheticlambda8, hasprovider, null, iAuthTabCallback5, jOnExtraCallback, z11, false, i30, null, onextracallbackOnNavigationEvent, this, 2, null) == obj7) {
                            }
                        }
                    }
                }
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 15;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    access14300.onWarmupCompleted();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i3 = this.label;
                if (i3 != 0) {
                    int i4 = onWarmupCompleted + 39;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i6 = onWarmupCompleted + 35;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    if (this.$texts.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    inflateMenu inflatemenuOnTransact = mExternalSyntheticLambda8.onTransact(this.this$0);
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$savedAnimationState, this.$startToStart, this.$texts, this.$motion, this.$sizeStrategy, this.$initialDelay, this.$interval, this.$playCount, this.$skipIntroMotion, this.this$0, this.$context, null);
                    this.label = 1;
                    if (inflateMenu.IAuthTabCallback(inflatemenuOnTransact, (isOverflowMenuShowing) null, anonymousClass5, this, 1, (Object) null) == objOnWarmupCompleted) {
                        int i8 = onWarmupCompleted + 63;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        return objOnWarmupCompleted;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onNavigationEvent + 77;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                mExternalSyntheticLambda8 mexternalsyntheticlambda8 = mExternalSyntheticLambda8.this;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$texts, mexternalsyntheticlambda8, this.$savedAnimationState, this.$startToStart, this.$motion, this.$sizeStrategy, this.$initialDelay, this.$interval, this.$playCount, this.$skipIntroMotion, this.$context, null);
                this.label = 1;
                if (mExternalSyntheticLambda8.IAuthTabCallback(mexternalsyntheticlambda8, (Function1) anonymousClass4, (access13800) this) == objOnWarmupCompleted) {
                    int i7 = onWarmupCompleted + 57;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final List<Pair<hasProvider, Integer>> onNavigationEvent(List<hasProvider> list, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback) {
        int i;
        int iIntValue;
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = mayLaunchUrl + 81;
            extraCommand = i4 % 128;
            int i5 = i4 % 2;
            hasProvider hasprovider = list.get(i3);
            mExternalSyntheticLambda6 mexternalsyntheticlambda6OnNavigationEvent = onNavigationEvent(onExtraCallbackWithResult(hasprovider), iAuthTabCallback.onExtraCallback());
            if (mexternalsyntheticlambda6OnNavigationEvent.isEmpty()) {
                int i6 = mayLaunchUrl + 43;
                extraCommand = i6 % 128;
                i = i6 % 2 != 0 ? 1 : 0;
            } else {
                Iterator<mExternalSyntheticLambda2> it = mexternalsyntheticlambda6OnNavigationEvent.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iOnWarmupCompleted = it.next().onWarmupCompleted(iAuthTabCallback.onExtraCallback());
                while (it.hasNext()) {
                    int iOnWarmupCompleted2 = it.next().onWarmupCompleted(iAuthTabCallback.onExtraCallback());
                    if (iOnWarmupCompleted < iOnWarmupCompleted2) {
                        iOnWarmupCompleted = iOnWarmupCompleted2;
                    }
                }
                i = iOnWarmupCompleted + 1;
            }
            mExternalSyntheticLambda2 mexternalsyntheticlambda2 = (mExternalSyntheticLambda2) CollectionsKt.firstOrNull(mexternalsyntheticlambda6OnNavigationEvent);
            int iIntValue2 = mexternalsyntheticlambda2 != null ? ((Integer) onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -208752203, OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this, iAuthTabCallback.onExtraCallbackWithResult().invoke(), mexternalsyntheticlambda2}, 208752206, OverseasRrnInputTextField.IAuthTabCallback())).intValue() : 0;
            if (mexternalsyntheticlambda2 != null) {
                int i7 = mayLaunchUrl + 77;
                extraCommand = i7 % 128;
                if (i7 % 2 != 0) {
                    iIntValue = ((Integer) onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -208752203, OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this, iAuthTabCallback.onWarmupCompleted().invoke(), mexternalsyntheticlambda2}, 208752206, OverseasRrnInputTextField.IAuthTabCallback())).intValue();
                    int i8 = 94 / 0;
                } else {
                    iIntValue = ((Integer) onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -208752203, OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this, iAuthTabCallback.onWarmupCompleted().invoke(), mexternalsyntheticlambda2}, 208752206, OverseasRrnInputTextField.IAuthTabCallback())).intValue();
                }
            } else {
                iIntValue = 0;
            }
            int i9 = i - 1;
            int iOnNavigationEvent = iIntValue2 + (iAuthTabCallback.onNavigationEvent() * i9);
            int iOnTransact = iIntValue + (i9 * iAuthTabCallback.onTransact());
            Integer numIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
            arrayList.add(getWrite.IAuthTabCallback(hasprovider, Integer.valueOf(numIAuthTabCallback != null ? Math.max(iOnTransact, RangesKt.coerceAtLeast(numIAuthTabCallback.intValue(), 0) + iOnNavigationEvent) : Math.max(iOnNavigationEvent, iOnTransact))));
        }
        return arrayList;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objArr[1];
        mExternalSyntheticLambda2 mexternalsyntheticlambda2 = (mExternalSyntheticLambda2) objArr[2];
        int i = 2 % 2;
        int i2 = extraCommand + 43;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallbackStub = RallysKt.onWarmupCompleted(null, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt.listOf(RallysKt.onExtraCallback((setCreativeDebuggerEnabled) mexternalsyntheticlambda2, appLovinSdkSettings, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 1788, (Object) null)), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 3833, null).IAuthTabCallbackStub();
        int i4 = mayLaunchUrl + 27;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return Integer.valueOf(iIAuthTabCallbackStub);
        }
        throw null;
    }

    static /* synthetic */ Object onExtraCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8, hasProvider hasprovider, SurfaceProcessorNodeOut surfaceProcessorNodeOut, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, long j, boolean z, boolean z2, int i, Long l, r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallback onextracallback, access13800 access13800Var, int i2, Object obj) {
        SurfaceProcessorNodeOut surfaceProcessorNodeOutOnExtraCallbackWithResult;
        int i3 = 2 % 2;
        int i4 = mayLaunchUrl + 99;
        int i5 = i4 % 128;
        extraCommand = i5;
        int i6 = i4 % 2;
        if ((i2 & 2) != 0) {
            int i7 = i5 + 33;
            mayLaunchUrl = i7 % 128;
            if (i7 % 2 == 0) {
                mexternalsyntheticlambda8.onExtraCallbackWithResult(hasprovider);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            surfaceProcessorNodeOutOnExtraCallbackWithResult = mexternalsyntheticlambda8.onExtraCallbackWithResult(hasprovider);
        } else {
            surfaceProcessorNodeOutOnExtraCallbackWithResult = surfaceProcessorNodeOut;
        }
        return mexternalsyntheticlambda8.onExtraCallback(hasprovider, surfaceProcessorNodeOutOnExtraCallbackWithResult, iAuthTabCallback, j, z, z2, i, l, onextracallback, access13800Var);
    }

    public static final class access100 implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        access100() {
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public void onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            mExternalSyntheticLambda8.asInterface(mExternalSyntheticLambda8.this).onNavigationEvent(f);
            int i4 = IAuthTabCallback + 23;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit onNavigationEvent(mExternalSyntheticLambda8 mexternalsyntheticlambda8, hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 119;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            mexternalsyntheticlambda8.onNavigationEvent(getWrite.IAuthTabCallback(hasprovider, iAuthTabCallback));
            return Unit.INSTANCE;
        }
        mexternalsyntheticlambda8.onNavigationEvent(getWrite.IAuthTabCallback(hasprovider, iAuthTabCallback));
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public static final class getInterfaceDescriptor implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        getInterfaceDescriptor() {
        }

        @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
        public void onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            mExternalSyntheticLambda8.asInterface(mExternalSyntheticLambda8.this).onNavigationEvent(f);
            int i4 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallback(final hasProvider hasprovider, SurfaceProcessorNodeOut surfaceProcessorNodeOut, final mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, long j, boolean z, boolean z2, int i, Long l, r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallback onextracallback, access13800<? super Unit> access13800Var) {
        AppLovinSdkSettings appLovinSdkSettings;
        int iCoerceAtLeast;
        int iOnNavigationEvent;
        int size;
        int i2;
        int i3 = 2 % 2;
        int i4 = extraCommand + 57;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(getWrite.IAuthTabCallback(hasprovider, iAuthTabCallback));
        mExternalSyntheticLambda9 mexternalsyntheticlambda9IAuthTabCallback = IAuthTabCallback(surfaceProcessorNodeOut, IAuthTabCallbackStub(), iAuthTabCallback.onExtraCallback());
        onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 1475453939, OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this, mexternalsyntheticlambda9IAuthTabCallback}, -1475453922, OverseasRrnInputTextField.IAuthTabCallback());
        mExternalSyntheticLambda6 mexternalsyntheticlambda6OnNavigationEvent = mexternalsyntheticlambda9IAuthTabCallback.onNavigationEvent();
        int size2 = mexternalsyntheticlambda6OnNavigationEvent.size();
        for (int i6 = 0; i6 < size2; i6++) {
            mexternalsyntheticlambda6OnNavigationEvent.get(i6).onExtraCallbackWithResult(iAuthTabCallback.asBinder());
        }
        mExternalSyntheticLambda6 mexternalsyntheticlambda6OnWarmupCompleted = mexternalsyntheticlambda9IAuthTabCallback.onWarmupCompleted();
        if (mexternalsyntheticlambda6OnWarmupCompleted != null) {
            int i7 = mayLaunchUrl + 7;
            extraCommand = i7 % 128;
            if (i7 % 2 != 0) {
                size = mexternalsyntheticlambda6OnWarmupCompleted.size();
                i2 = 1;
            } else {
                size = mexternalsyntheticlambda6OnWarmupCompleted.size();
                i2 = 0;
            }
            while (i2 < size) {
                mexternalsyntheticlambda6OnWarmupCompleted.get(i2).onExtraCallbackWithResult(iAuthTabCallback.asBinder());
                i2++;
            }
        }
        AppLovinSdkSettings appLovinSdkSettingsInvoke = iAuthTabCallback.onExtraCallbackWithResult().invoke();
        AppLovinSdkSettings appLovinSdkSettingsInvoke2 = iAuthTabCallback.onWarmupCompleted().invoke();
        Object obj = null;
        if (S0.onNavigationEvent(hasprovider)) {
            int length = i + ((hasprovider.length() - 1) * (z2 ? iAuthTabCallback.onTransact() : iAuthTabCallback.onNavigationEvent()));
            pxToDp.onWarmupCompleted onwarmupcompleted = pxToDp.onWarmupCompleted.IAuthTabCallback;
            List listMutableListOf = CollectionsKt.mutableListOf(new Rally[]{Rally.onTransact(RallysKt.IAuthTabCallback((shouldFailAdDisplayIfDontKeepActivitiesIsEnabled) new access100(), appLovinSdkSettingsInvoke, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null), null, new Function0() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1State$$ExternalSyntheticLambda9
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 97;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    mExternalSyntheticLambda8 mexternalsyntheticlambda8 = this.f$0;
                    if (i10 == 0) {
                        return mExternalSyntheticLambda8.onExtraCallbackWithResult(mexternalsyntheticlambda8, hasprovider, iAuthTabCallback);
                    }
                    int i11 = 6 / 0;
                    return mExternalSyntheticLambda8.onExtraCallbackWithResult(mexternalsyntheticlambda8, hasprovider, iAuthTabCallback);
                }
            }, 1, null)});
            if (length > 0) {
                listMutableListOf.add(RallysKt.IAuthTabCallback((shouldFailAdDisplayIfDontKeepActivitiesIsEnabled) new getInterfaceDescriptor(), isMuted.onNavigationEvent(RallysKt.onExtraCallback(length), access14000.onExtraCallbackWithResult(1.0f), access14000.onExtraCallbackWithResult(1.0f), (Function1) null, 4, (Object) null), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null));
            }
            runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted(null, onwarmupcompleted, listMutableListOf, 0, null, 0, null, null, access14000.onNavigationEvent(false), 0, 0L, false, 3833, null);
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            listCreateListBuilder.add(runonuithreaddelayedOnWarmupCompleted);
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(RallysKt.onWarmupCompleted(null, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt.build(listCreateListBuilder), 0, null, 0, null, null, access14000.onNavigationEvent(false), 0, 0L, false, 3833, null), j, z, l, onextracallback, access13800Var);
            return objOnExtraCallbackWithResult == access14300.onWarmupCompleted() ? objOnExtraCallbackWithResult : Unit.INSTANCE;
        }
        if (!z2) {
            appLovinSdkSettings = appLovinSdkSettingsInvoke2;
        } else {
            int i8 = extraCommand + 97;
            mayLaunchUrl = i8 % 128;
            int i9 = i8 % 2;
            appLovinSdkSettings = appLovinSdkSettingsInvoke;
        }
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallbackWithResult = onExtraCallbackWithResult(mexternalsyntheticlambda9IAuthTabCallback, appLovinSdkSettings, !(z2 ^ true) ? iAuthTabCallback.onNavigationEvent() : iAuthTabCallback.onTransact(), iAuthTabCallback.onExtraCallback(), i);
        if (runonuithreaddelayedOnExtraCallbackWithResult != null) {
            int i10 = mayLaunchUrl + 23;
            extraCommand = i10 % 128;
            int i11 = i10 % 2;
            iCoerceAtLeast = iAuthTabCallback.IAuthTabCallback() != null ? i + RangesKt.coerceAtLeast(iAuthTabCallback.IAuthTabCallback().intValue(), 0) : i;
        }
        AppLovinSdkSettings appLovinSdkSettings2 = z2 ? appLovinSdkSettingsInvoke2 : appLovinSdkSettingsInvoke;
        if (z2) {
            int i12 = extraCommand + 47;
            mayLaunchUrl = i12 % 128;
            int i13 = i12 % 2;
            iOnNavigationEvent = iAuthTabCallback.onTransact();
        } else {
            iOnNavigationEvent = iAuthTabCallback.onNavigationEvent();
        }
        runOnUiThreadDelayed runonuithreaddelayedOnNavigationEvent = onNavigationEvent(mexternalsyntheticlambda9IAuthTabCallback, appLovinSdkSettings2, iOnNavigationEvent, iAuthTabCallback.onExtraCallback(), iCoerceAtLeast);
        List listCreateListBuilder2 = CollectionsKt.createListBuilder();
        if (runonuithreaddelayedOnExtraCallbackWithResult != null) {
            listCreateListBuilder2.add(runonuithreaddelayedOnExtraCallbackWithResult);
            int i14 = mayLaunchUrl + 125;
            extraCommand = i14 % 128;
            int i15 = i14 % 2;
        }
        if (runonuithreaddelayedOnNavigationEvent != null) {
            int i16 = extraCommand + 75;
            mayLaunchUrl = i16 % 128;
            if (i16 % 2 == 0) {
                listCreateListBuilder2.add(runonuithreaddelayedOnNavigationEvent);
                obj.hashCode();
                throw null;
            }
            listCreateListBuilder2.add(runonuithreaddelayedOnNavigationEvent);
        }
        Object objOnExtraCallbackWithResult2 = onExtraCallbackWithResult(RallysKt.onWarmupCompleted(null, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt.build(listCreateListBuilder2), 0, null, 0, null, null, access14000.onNavigationEvent(false), 0, 0L, false, 3833, null), j, z, l, onextracallback, access13800Var);
        return objOnExtraCallbackWithResult2 == access14300.onWarmupCompleted() ? objOnExtraCallbackWithResult2 : Unit.INSTANCE;
    }

    public static /* synthetic */ void onExtraCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8, String str, mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, int i2, Object obj) {
        boolean z2;
        int i3 = 2 % 2;
        int i4 = extraCommand;
        int i5 = i4 + 53;
        mayLaunchUrl = i5 % 128;
        if (i5 % 2 != 0 ? (i2 & 4) != 0 : (i2 & 2) != 0) {
            ontransact = mexternalsyntheticlambda8.onPostMessage;
        }
        mExternalSyntheticApiModelOutline1.onTransact ontransact2 = ontransact;
        int i6 = (i2 & 8) != 0 ? 0 : i;
        if ((i2 & 16) != 0) {
            int i7 = i4 + 15;
            mayLaunchUrl = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i4 + 117;
            mayLaunchUrl = i9 % 128;
            int i10 = i9 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        mexternalsyntheticlambda8.onNavigationEvent(str, iAuthTabCallbackStub, ontransact2, i6, z2);
    }

    public final void onNavigationEvent(@NotNull String str, @NotNull mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub, @NotNull mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        Intrinsics.checkNotNullParameter(ontransact, "");
        onExtraCallback(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), iAuthTabCallbackStub, ontransact, i, z);
        int i3 = extraCommand + 99;
        mayLaunchUrl = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onNavigationEvent(mExternalSyntheticLambda8 mexternalsyntheticlambda8, hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, int i2, Object obj) {
        int i3;
        int i4 = 2 % 2;
        int i5 = extraCommand;
        int i6 = i5 + 65;
        mayLaunchUrl = i6 % 128;
        if (i6 % 2 != 0 ? (i2 & 4) != 0 : (i2 & 3) != 0) {
            int i7 = i5 + 111;
            mayLaunchUrl = i7 % 128;
            int i8 = i7 % 2;
            ontransact = mexternalsyntheticlambda8.onPostMessage;
            int i9 = i5 + 67;
            mayLaunchUrl = i9 % 128;
            int i10 = i9 % 2;
        }
        mExternalSyntheticApiModelOutline1.onTransact ontransact2 = ontransact;
        if ((i2 & 8) != 0) {
            int i11 = mayLaunchUrl;
            int i12 = i11 + 49;
            extraCommand = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i11 + 25;
            extraCommand = i14 % 128;
            int i15 = i14 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        mexternalsyntheticlambda8.onExtraCallback(hasprovider, iAuthTabCallbackStub, ontransact2, i3, (i2 & 16) != 0 ? false : z);
    }

    public final void onExtraCallback(@NotNull hasProvider hasprovider, @NotNull mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub, @NotNull mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        Intrinsics.checkNotNullParameter(ontransact, "");
        maybeUpdateAnimatable.onNavigationEvent(this.onTransact, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(hasprovider, iAuthTabCallbackStub, ontransact, i, z, null), 3, (Object) null);
        int i3 = mayLaunchUrl + 55;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ int $initialDelay;
        final /* synthetic */ mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub $motion;
        final /* synthetic */ mExternalSyntheticApiModelOutline1.onTransact $sizeStrategy;
        final /* synthetic */ boolean $skipIntroMotion;
        final /* synthetic */ hasProvider $text;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$text = hasprovider;
            this.$motion = iAuthTabCallbackStub;
            this.$sizeStrategy = ontransact;
            this.$initialDelay = i;
            this.$skipIntroMotion = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = mExternalSyntheticLambda8.this.new onExtraCallbackWithResult(this.$text, this.$motion, this.$sizeStrategy, this.$initialDelay, this.$skipIntroMotion, access13800Var);
            int i2 = onNavigationEvent + 87;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 10 / 0;
            } else {
                objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = IAuthTabCallback + 61;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onNavigationEvent = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                int i4 = onNavigationEvent + 91;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {mExternalSyntheticLambda8.this};
                getPackageType getpackagetype = (getPackageType) mExternalSyntheticLambda8.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 551132828, OverseasRrnInputTextField.IAuthTabCallback(), objArr, -551132816, OverseasRrnInputTextField.IAuthTabCallback());
                if (getpackagetype != null) {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                }
                mExternalSyntheticLambda8 mexternalsyntheticlambda8 = mExternalSyntheticLambda8.this;
                hasProvider hasprovider = this.$text;
                mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub = this.$motion;
                mExternalSyntheticApiModelOutline1.onTransact ontransact = this.$sizeStrategy;
                int i6 = this.$initialDelay;
                boolean z = this.$skipIntroMotion;
                this.label = 1;
                if (mexternalsyntheticlambda8.onWarmupCompleted(hasprovider, iAuthTabCallbackStub, ontransact, i6, z, (access13800<? super Unit>) this) == objOnWarmupCompleted) {
                    int i7 = onNavigationEvent;
                    int i8 = i7 + 53;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                    int i9 = i7 + 51;
                    IAuthTabCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    obj2.hashCode();
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8, hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, access13800 access13800Var, int i2, Object obj) {
        mExternalSyntheticApiModelOutline1.onTransact ontransact2;
        int i3;
        int i4 = 2 % 2;
        if ((i2 & 4) != 0) {
            int i5 = mayLaunchUrl;
            int i6 = i5 + 125;
            extraCommand = i6 % 128;
            int i7 = i6 % 2;
            mExternalSyntheticApiModelOutline1.onTransact ontransact3 = mexternalsyntheticlambda8.onPostMessage;
            int i8 = i5 + 9;
            extraCommand = i8 % 128;
            int i9 = i8 % 2;
            ontransact2 = ontransact3;
        } else {
            ontransact2 = ontransact;
        }
        if ((i2 & 8) != 0) {
            int i10 = mayLaunchUrl + 45;
            extraCommand = i10 % 128;
            int i11 = i10 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        return mexternalsyntheticlambda8.onWarmupCompleted(hasprovider, iAuthTabCallbackStub, ontransact2, i3, (i2 & 16) != 0 ? false : z, (access13800<? super Unit>) access13800Var);
    }

    public final Object onWarmupCompleted(@NotNull hasProvider hasprovider, @NotNull mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub, @NotNull mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, @NotNull access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        Object objOnWarmupCompleted = onWarmupCompleted(hasprovider, iAuthTabCallbackStub, ontransact, i, z, null, access13800Var);
        if (objOnWarmupCompleted != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i3 = extraCommand;
        int i4 = i3 + 21;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 53;
        mayLaunchUrl = i6 % 128;
        int i7 = i6 % 2;
        return objOnWarmupCompleted;
    }

    private final Object onWarmupCompleted(hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onNavigationEvent onnavigationevent, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(new IAuthTabCallback(onnavigationevent, hasprovider, iAuthTabCallbackStub, ontransact, i, z, null), access13800Var);
        if (objOnExtraCallbackWithResult == access14300.onWarmupCompleted()) {
            int i3 = extraCommand + 121;
            mayLaunchUrl = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallbackWithResult;
        }
        Unit unit = Unit.INSTANCE;
        int i5 = extraCommand + 61;
        mayLaunchUrl = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ int $initialDelay;
        final /* synthetic */ mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub $motion;
        final /* synthetic */ r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onNavigationEvent $savedAnimationState;
        final /* synthetic */ mExternalSyntheticApiModelOutline1.onTransact $sizeStrategy;
        final /* synthetic */ boolean $skipIntroMotion;
        final /* synthetic */ hasProvider $text;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onNavigationEvent onnavigationevent, hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$savedAnimationState = onnavigationevent;
            this.$text = hasprovider;
            this.$motion = iAuthTabCallbackStub;
            this.$sizeStrategy = ontransact;
            this.$initialDelay = i;
            this.$skipIntroMotion = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = mExternalSyntheticLambda8.this.new IAuthTabCallback(this.$savedAnimationState, this.$text, this.$motion, this.$sizeStrategy, this.$initialDelay, this.$skipIntroMotion, access13800Var);
            int i2 = onWarmupCompleted + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                objInvokeSuspend = iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 25 / 0;
            } else {
                objInvokeSuspend = iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onWarmupCompleted + 109;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o.mExternalSyntheticLambda8$IAuthTabCallback$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ int $initialDelay;
            final /* synthetic */ mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub $motion;
            final /* synthetic */ r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onNavigationEvent $savedAnimationState;
            final /* synthetic */ mExternalSyntheticApiModelOutline1.onTransact $sizeStrategy;
            final /* synthetic */ boolean $skipIntroMotion;
            final /* synthetic */ hasProvider $text;
            int label;
            final /* synthetic */ mExternalSyntheticLambda8 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(mExternalSyntheticLambda8 mexternalsyntheticlambda8, r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onNavigationEvent onnavigationevent, hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, access13800<? super AnonymousClass1> access13800Var) {
                super(1, access13800Var);
                this.this$0 = mexternalsyntheticlambda8;
                this.$savedAnimationState = onnavigationevent;
                this.$text = hasprovider;
                this.$motion = iAuthTabCallbackStub;
                this.$sizeStrategy = ontransact;
                this.$initialDelay = i;
                this.$skipIntroMotion = z;
            }

            public final access13800<Unit> create(access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$savedAnimationState, this.$text, this.$motion, this.$sizeStrategy, this.$initialDelay, this.$skipIntroMotion, access13800Var);
                int i2 = onWarmupCompleted + 47;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass1;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 99;
                onExtraCallbackWithResult = i2 % 128;
                access13800<? super Unit> access13800Var = (access13800) obj;
                if (i2 % 2 == 0) {
                    onExtraCallbackWithResult(access13800Var);
                    throw null;
                }
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(access13800Var);
                int i3 = onWarmupCompleted + 59;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return objOnExtraCallbackWithResult;
                }
                throw null;
            }

            public final Object onExtraCallbackWithResult(access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 3;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallbackWithResult + 31;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 19 / 0;
                }
                return objInvokeSuspend;
            }

            /* renamed from: o.mExternalSyntheticLambda8$IAuthTabCallback$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;
                final /* synthetic */ int $initialDelay;
                final /* synthetic */ mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub $motion;
                final /* synthetic */ r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onNavigationEvent $savedAnimationState;
                final /* synthetic */ mExternalSyntheticApiModelOutline1.onTransact $sizeStrategy;
                final /* synthetic */ boolean $skipIntroMotion;
                final /* synthetic */ hasProvider $text;
                long J$0;
                Object L$0;
                Object L$1;
                Object L$2;
                boolean Z$0;
                boolean Z$1;
                int label;
                final /* synthetic */ mExternalSyntheticLambda8 this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onNavigationEvent onnavigationevent, hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, mExternalSyntheticLambda8 mexternalsyntheticlambda8, access13800<? super AnonymousClass2> access13800Var) {
                    super(1, access13800Var);
                    this.$savedAnimationState = onnavigationevent;
                    this.$text = hasprovider;
                    this.$motion = iAuthTabCallbackStub;
                    this.$sizeStrategy = ontransact;
                    this.$initialDelay = i;
                    this.$skipIntroMotion = z;
                    this.this$0 = mexternalsyntheticlambda8;
                }

                public static /* synthetic */ Unit IAuthTabCallback(mExternalSyntheticLambda2 mexternalsyntheticlambda2, float f) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 53;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Unit unitOnExtraCallback = onExtraCallback(mexternalsyntheticlambda2, f);
                    int i4 = onNavigationEvent + 41;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return unitOnExtraCallback;
                }

                public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted(mExternalSyntheticLambda2 mexternalsyntheticlambda2) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 83;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        return onExtraCallback(mexternalsyntheticlambda2);
                    }
                    onExtraCallback(mexternalsyntheticlambda2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final access13800<Unit> create(access13800<?> access13800Var) {
                    int i = 2 % 2;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$savedAnimationState, this.$text, this.$motion, this.$sizeStrategy, this.$initialDelay, this.$skipIntroMotion, this.this$0, access13800Var);
                    int i2 = onExtraCallback + 105;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        return anonymousClass2;
                    }
                    throw null;
                }

                public /* synthetic */ Object invoke(Object obj) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 103;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((access13800) obj);
                    int i4 = onExtraCallback + 113;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objOnExtraCallbackWithResult;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                public final Object onExtraCallbackWithResult(access13800<? super Unit> access13800Var) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 77;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
                    int i4 = onExtraCallback + 63;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 1 / 0;
                    }
                    return objInvokeSuspend;
                }

                /* renamed from: o.mExternalSyntheticLambda8$IAuthTabCallback$1$2$IAuthTabCallback, reason: collision with other inner class name */
                public static final class C0041IAuthTabCallback implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;
                    final /* synthetic */ getAdView onExtraCallbackWithResult;
                    final /* synthetic */ mExternalSyntheticLambda8 onWarmupCompleted;

                    C0041IAuthTabCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8, getAdView getadview) {
                        this.onWarmupCompleted = mexternalsyntheticlambda8;
                        this.onExtraCallbackWithResult = getadview;
                    }

                    @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
                    public void onNavigationEvent(float f) {
                        int i = 2 % 2;
                        int i2 = onExtraCallback + 121;
                        IAuthTabCallback = i2 % 128;
                        int i3 = i2 % 2;
                        mExternalSyntheticLambda8.IAuthTabCallbackStub(this.onWarmupCompleted).IAuthTabCallback(setByteOrder.onNavigationEvent(this.onExtraCallbackWithResult.onExtraCallbackWithResult(f)));
                        int i4 = IAuthTabCallback + 45;
                        onExtraCallback = i4 % 128;
                        if (i4 % 2 != 0) {
                            throw null;
                        }
                    }
                }

                /* renamed from: o.mExternalSyntheticLambda8$IAuthTabCallback$1$2$onNavigationEvent */
                public static final class onNavigationEvent implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;
                    final /* synthetic */ mExternalSyntheticLambda8 onNavigationEvent;

                    onNavigationEvent(mExternalSyntheticLambda8 mexternalsyntheticlambda8) {
                        this.onNavigationEvent = mexternalsyntheticlambda8;
                    }

                    @Override // o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled
                    public void onNavigationEvent(float f) {
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 51;
                        onExtraCallbackWithResult = i2 % 128;
                        int i3 = i2 % 2;
                        mExternalSyntheticLambda8.asInterface(this.onNavigationEvent).onNavigationEvent(f);
                        int i4 = onExtraCallbackWithResult + 71;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                    }
                }

                private static final AppLovinSdkSettings onExtraCallback(final mExternalSyntheticLambda2 mexternalsyntheticlambda2) {
                    int i = 2 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback());
                    float fOnNavigationEvent = mexternalsyntheticlambda2.onNavigationEvent();
                    Object[] objArr = {appLovinSdkSettingsOnExtraCallback, Float.valueOf(0.0f), Float.valueOf(fOnNavigationEvent), new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1State$animateInfiniteSuspended$4$1$1$$ExternalSyntheticLambda0
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj) {
                            int i2 = 2 % 2;
                            int i3 = onWarmupCompleted + 29;
                            onExtraCallback = i3 % 128;
                            int i4 = i3 % 2;
                            Unit unitIAuthTabCallback = mExternalSyntheticLambda8.IAuthTabCallback.AnonymousClass1.AnonymousClass2.IAuthTabCallback(mexternalsyntheticlambda2, ((Float) obj).floatValue());
                            int i5 = onWarmupCompleted + 55;
                            onExtraCallback = i5 % 128;
                            if (i5 % 2 != 0) {
                                return unitIAuthTabCallback;
                            }
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    }, null, 8, null};
                    AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, objArr, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                    int i2 = onNavigationEvent + 65;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return appLovinSdkSettings;
                }

                private static final Unit onExtraCallback(mExternalSyntheticLambda2 mexternalsyntheticlambda2, float f) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 125;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    mexternalsyntheticlambda2.onNavigationEvent(f);
                    Unit unit = Unit.INSTANCE;
                    int i4 = onNavigationEvent + 31;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x012d  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x021f A[PHI: r2 r5 r7 r9
                  0x021f: PHI (r2v8 o.mExternalSyntheticApiModelOutline1$IAuthTabCallbackDefault) = 
                  (r2v7 o.mExternalSyntheticApiModelOutline1$IAuthTabCallbackDefault)
                  (r2v15 o.mExternalSyntheticApiModelOutline1$IAuthTabCallbackDefault)
                 binds: [B:39:0x021d, B:36:0x01f1] A[DONT_GENERATE, DONT_INLINE]
                  0x021f: PHI (r5v9 o.runOnUiThreadDelayed) = (r5v8 o.runOnUiThreadDelayed), (r5v13 o.runOnUiThreadDelayed) binds: [B:39:0x021d, B:36:0x01f1] A[DONT_GENERATE, DONT_INLINE]
                  0x021f: PHI (r7v4 java.util.List) = (r7v3 java.util.List), (r7v6 java.util.List) binds: [B:39:0x021d, B:36:0x01f1] A[DONT_GENERATE, DONT_INLINE]
                  0x021f: PHI (r9v11 o.mExternalSyntheticApiModelOutline1$IAuthTabCallbackStub) = 
                  (r9v10 o.mExternalSyntheticApiModelOutline1$IAuthTabCallbackStub)
                  (r9v13 o.mExternalSyntheticApiModelOutline1$IAuthTabCallbackStub)
                 binds: [B:39:0x021d, B:36:0x01f1] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0245  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x02f9 A[RETURN] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    List list;
                    mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub;
                    runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted;
                    mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault iAuthTabCallbackDefault;
                    runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted2;
                    runOnUiThreadDelayed runonuithreaddelayedOnExtraCallbackWithResult;
                    runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted3;
                    long jOnExtraCallback;
                    boolean zIAuthTabCallback;
                    mExternalSyntheticLambda8 mexternalsyntheticlambda8;
                    r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallback onextracallbackOnNavigationEvent;
                    int iOnNavigationEvent;
                    int i = 2 % 2;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onNavigationEvent onnavigationevent = this.$savedAnimationState;
                        if (onnavigationevent == null) {
                            onnavigationevent = new r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onNavigationEvent(this.$text, this.$motion, this.$sizeStrategy, this.$initialDelay, this.$skipIntroMotion);
                            mExternalSyntheticLambda8.onExtraCallbackWithResult(this.this$0, onnavigationevent);
                        }
                        mExternalSyntheticLambda8.onExtraCallbackWithResult(this.this$0, getWrite.IAuthTabCallback(this.$text, this.$motion));
                        SurfaceProcessorNodeOut surfaceProcessorNodeOutOnExtraCallbackWithResult = this.this$0.onExtraCallbackWithResult(this.$text);
                        boolean zOnNavigationEvent = S0.onNavigationEvent(this.$text);
                        if (zOnNavigationEvent) {
                            int i3 = onNavigationEvent + 59;
                            onExtraCallback = i3 % 128;
                            int i4 = i3 % 2;
                            mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub2 = this.$motion;
                            if (iAuthTabCallbackStub2 instanceof mExternalSyntheticApiModelOutline1.onExtraCallback) {
                                Integer numOnExtraCallbackWithResult = ((mExternalSyntheticApiModelOutline1.onExtraCallback) iAuthTabCallbackStub2).onExtraCallbackWithResult();
                                long jOnExtraCallback2 = ByteOrderedDataOutputStream.onExtraCallback(numOnExtraCallbackWithResult != null ? numOnExtraCallbackWithResult.intValue() : ByteOrderedDataOutputStream.onNavigationEvent(this.this$0.asBinder().asInterface()));
                                Integer numOnNavigationEvent = ((mExternalSyntheticApiModelOutline1.onExtraCallback) this.$motion).onNavigationEvent();
                                if (numOnNavigationEvent != null) {
                                    iOnNavigationEvent = numOnNavigationEvent.intValue();
                                    int i5 = onNavigationEvent + 97;
                                    onExtraCallback = i5 % 128;
                                    int i6 = i5 % 2;
                                } else {
                                    iOnNavigationEvent = ByteOrderedDataOutputStream.onNavigationEvent(this.this$0.asBinder().asInterface());
                                }
                                runonuithreaddelayedOnWarmupCompleted3 = RallysKt.onWarmupCompleted(null, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt.listOf(RallysKt.IAuthTabCallback((shouldFailAdDisplayIfDontKeepActivitiesIsEnabled) new C0041IAuthTabCallback(this.this$0, new getAdView(jOnExtraCallback2, ByteOrderedDataOutputStream.onExtraCallback(iOnNavigationEvent), null)), isMuted.onNavigationEvent(RallysKt.onExtraCallback(mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub.Companion.onWarmupCompleted().IAuthTabCallback(), 2400), access14000.onExtraCallbackWithResult(0.0f), access14000.onExtraCallbackWithResult(1.0f), (Function1) null, 4, (Object) null), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)), -1, getExtraParameters.Alternate, 0, null, null, access14000.onNavigationEvent(false), 0, 0L, false, 3809, null);
                            } else if (zOnNavigationEvent) {
                                runonuithreaddelayedOnWarmupCompleted3 = RallysKt.onWarmupCompleted(null, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt.listOf(RallysKt.IAuthTabCallback((shouldFailAdDisplayIfDontKeepActivitiesIsEnabled) new onNavigationEvent(this.this$0), isMuted.onNavigationEvent(RallysKt.onExtraCallback(mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub.Companion.onWarmupCompleted().IAuthTabCallback(), 2400), access14000.onExtraCallbackWithResult(0.4f), access14000.onExtraCallbackWithResult(1.0f), (Function1) null, 4, (Object) null), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)), -1, getExtraParameters.Normal, 0, null, null, access14000.onNavigationEvent(false), 0, 0L, false, 3809, null);
                            } else {
                                mExternalSyntheticLambda8 mexternalsyntheticlambda82 = this.this$0;
                                mExternalSyntheticLambda9 mexternalsyntheticlambda9OnNavigationEvent = mExternalSyntheticLambda8.onNavigationEvent(mexternalsyntheticlambda82, surfaceProcessorNodeOutOnExtraCallbackWithResult, this.$skipIntroMotion ? null : mexternalsyntheticlambda82.IAuthTabCallbackStub(), this.$motion.onExtraCallback());
                                mExternalSyntheticLambda8.onNavigationEvent(this.this$0, mexternalsyntheticlambda9OnNavigationEvent);
                                boolean z = this.$skipIntroMotion;
                                mExternalSyntheticLambda8 mexternalsyntheticlambda83 = this.this$0;
                                mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub3 = this.$motion;
                                List listCreateListBuilder = CollectionsKt.createListBuilder();
                                if (z) {
                                    list = listCreateListBuilder;
                                    iAuthTabCallbackStub = iAuthTabCallbackStub3;
                                } else {
                                    int i7 = onExtraCallback + 81;
                                    onNavigationEvent = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent(onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.onTransact()), (Float) null, access14000.onExtraCallbackWithResult(1.0f), (Function1) null, 4, (Object) null);
                                        iAuthTabCallbackDefault = mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault.None;
                                        list = listCreateListBuilder;
                                        iAuthTabCallbackStub = iAuthTabCallbackStub3;
                                        runonuithreaddelayedOnWarmupCompleted2 = mExternalSyntheticLambda8.onWarmupCompleted(mexternalsyntheticlambda83, mexternalsyntheticlambda9OnNavigationEvent, appLovinSdkSettingsOnNavigationEvent, 0, iAuthTabCallbackDefault, 1);
                                        if (runonuithreaddelayedOnWarmupCompleted2 != null) {
                                            int i8 = onNavigationEvent + 117;
                                            onExtraCallback = i8 % 128;
                                            if (i8 % 2 != 0) {
                                                list.add(runonuithreaddelayedOnWarmupCompleted2);
                                                throw null;
                                            }
                                            list.add(runonuithreaddelayedOnWarmupCompleted2);
                                        }
                                        runonuithreaddelayedOnExtraCallbackWithResult = mExternalSyntheticLambda8.onExtraCallbackWithResult(mexternalsyntheticlambda83, mexternalsyntheticlambda9OnNavigationEvent, new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1State$animateInfiniteSuspended$4$1$1$$ExternalSyntheticLambda1
                                            private static int onNavigationEvent = 0;
                                            private static int onWarmupCompleted = 1;

                                            public final Object invoke(Object obj2) {
                                                int i9 = 2 % 2;
                                                int i10 = onWarmupCompleted + 125;
                                                onNavigationEvent = i10 % 128;
                                                int i11 = i10 % 2;
                                                AppLovinSdkSettings appLovinSdkSettingsOnWarmupCompleted = mExternalSyntheticLambda8.IAuthTabCallback.AnonymousClass1.AnonymousClass2.onWarmupCompleted((mExternalSyntheticLambda2) obj2);
                                                int i12 = onWarmupCompleted + 97;
                                                onNavigationEvent = i12 % 128;
                                                int i13 = i12 % 2;
                                                return appLovinSdkSettingsOnWarmupCompleted;
                                            }
                                        }, 0, iAuthTabCallbackDefault, 100);
                                        if (runonuithreaddelayedOnExtraCallbackWithResult != null) {
                                            int i9 = onExtraCallback + 77;
                                            onNavigationEvent = i9 % 128;
                                            if (i9 % 2 == 0) {
                                                list.add(runonuithreaddelayedOnExtraCallbackWithResult);
                                                int i10 = 23 / 0;
                                            } else {
                                                list.add(runonuithreaddelayedOnExtraCallbackWithResult);
                                            }
                                        }
                                    } else {
                                        list = listCreateListBuilder;
                                        iAuthTabCallbackStub = iAuthTabCallbackStub3;
                                        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent2 = isMuted.onNavigationEvent(onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.onTransact()), (Float) null, access14000.onExtraCallbackWithResult(0.0f), (Function1) null, 5, (Object) null);
                                        iAuthTabCallbackDefault = mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault.None;
                                        runonuithreaddelayedOnWarmupCompleted2 = mExternalSyntheticLambda8.onWarmupCompleted(mexternalsyntheticlambda83, mexternalsyntheticlambda9OnNavigationEvent, appLovinSdkSettingsOnNavigationEvent2, 0, iAuthTabCallbackDefault, 0);
                                        if (runonuithreaddelayedOnWarmupCompleted2 != null) {
                                        }
                                        runonuithreaddelayedOnExtraCallbackWithResult = mExternalSyntheticLambda8.onExtraCallbackWithResult(mexternalsyntheticlambda83, mexternalsyntheticlambda9OnNavigationEvent, new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1State$animateInfiniteSuspended$4$1$1$$ExternalSyntheticLambda1
                                            private static int onNavigationEvent = 0;
                                            private static int onWarmupCompleted = 1;

                                            public final Object invoke(Object obj2) {
                                                int i92 = 2 % 2;
                                                int i102 = onWarmupCompleted + 125;
                                                onNavigationEvent = i102 % 128;
                                                int i11 = i102 % 2;
                                                AppLovinSdkSettings appLovinSdkSettingsOnWarmupCompleted = mExternalSyntheticLambda8.IAuthTabCallback.AnonymousClass1.AnonymousClass2.onWarmupCompleted((mExternalSyntheticLambda2) obj2);
                                                int i12 = onWarmupCompleted + 97;
                                                onNavigationEvent = i12 % 128;
                                                int i13 = i12 % 2;
                                                return appLovinSdkSettingsOnWarmupCompleted;
                                            }
                                        }, 0, iAuthTabCallbackDefault, 100);
                                        if (runonuithreaddelayedOnExtraCallbackWithResult != null) {
                                        }
                                    }
                                }
                                runOnUiThreadDelayed runonuithreaddelayedOnNavigationEvent = mExternalSyntheticLambda8.onNavigationEvent(mexternalsyntheticlambda83, mexternalsyntheticlambda9OnNavigationEvent, iAuthTabCallbackStub);
                                if (runonuithreaddelayedOnNavigationEvent != null) {
                                    int i11 = onNavigationEvent + 77;
                                    onExtraCallback = i11 % 128;
                                    int i12 = i11 % 2;
                                    list.add(runonuithreaddelayedOnNavigationEvent);
                                }
                                runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted(null, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt.build(list), 0, null, 0, null, null, access14000.onNavigationEvent(false), this.$initialDelay, 0L, false, 3321, null);
                                int i13 = onNavigationEvent + 91;
                                onExtraCallback = i13 % 128;
                                int i14 = i13 % 2;
                                mExternalSyntheticLambda8.IAuthTabCallback(this.this$0, getWrite.IAuthTabCallback(this.$text, this.$motion));
                                mExternalSyntheticApiModelOutline1.onTransact.onNavigationEvent onnavigationeventIAuthTabCallback = this.$sizeStrategy.IAuthTabCallback(CollectionsKt.listOf(this.this$0.onExtraCallbackWithResult(this.$text)), 0);
                                jOnExtraCallback = onnavigationeventIAuthTabCallback.onExtraCallback();
                                zIAuthTabCallback = onnavigationeventIAuthTabCallback.IAuthTabCallback();
                                mexternalsyntheticlambda8 = this.this$0;
                                onextracallbackOnNavigationEvent = onnavigationevent.onNavigationEvent();
                                this.L$0 = access15400.onNavigationEvent(onnavigationevent);
                                this.L$1 = access15400.onNavigationEvent(surfaceProcessorNodeOutOnExtraCallbackWithResult);
                                this.L$2 = access15400.onNavigationEvent(runonuithreaddelayedOnWarmupCompleted);
                                this.Z$0 = zOnNavigationEvent;
                                this.J$0 = jOnExtraCallback;
                                this.Z$1 = zIAuthTabCallback;
                                this.label = 1;
                                if (mExternalSyntheticLambda8.IAuthTabCallback(mexternalsyntheticlambda8, runonuithreaddelayedOnWarmupCompleted, jOnExtraCallback, zIAuthTabCallback, (Long) null, onextracallbackOnNavigationEvent, (access13800) this, 8, (Object) null) == objOnWarmupCompleted) {
                                    return objOnWarmupCompleted;
                                }
                            }
                            runonuithreaddelayedOnWarmupCompleted = runonuithreaddelayedOnWarmupCompleted3;
                            mExternalSyntheticLambda8.IAuthTabCallback(this.this$0, getWrite.IAuthTabCallback(this.$text, this.$motion));
                            mExternalSyntheticApiModelOutline1.onTransact.onNavigationEvent onnavigationeventIAuthTabCallback2 = this.$sizeStrategy.IAuthTabCallback(CollectionsKt.listOf(this.this$0.onExtraCallbackWithResult(this.$text)), 0);
                            jOnExtraCallback = onnavigationeventIAuthTabCallback2.onExtraCallback();
                            zIAuthTabCallback = onnavigationeventIAuthTabCallback2.IAuthTabCallback();
                            mexternalsyntheticlambda8 = this.this$0;
                            onextracallbackOnNavigationEvent = onnavigationevent.onNavigationEvent();
                            this.L$0 = access15400.onNavigationEvent(onnavigationevent);
                            this.L$1 = access15400.onNavigationEvent(surfaceProcessorNodeOutOnExtraCallbackWithResult);
                            this.L$2 = access15400.onNavigationEvent(runonuithreaddelayedOnWarmupCompleted);
                            this.Z$0 = zOnNavigationEvent;
                            this.J$0 = jOnExtraCallback;
                            this.Z$1 = zIAuthTabCallback;
                            this.label = 1;
                            if (mExternalSyntheticLambda8.IAuthTabCallback(mexternalsyntheticlambda8, runonuithreaddelayedOnWarmupCompleted, jOnExtraCallback, zIAuthTabCallback, (Long) null, onextracallbackOnNavigationEvent, (access13800) this, 8, (Object) null) == objOnWarmupCompleted) {
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 69;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    inflateMenu inflatemenuOnTransact = mExternalSyntheticLambda8.onTransact(this.this$0);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$savedAnimationState, this.$text, this.$motion, this.$sizeStrategy, this.$initialDelay, this.$skipIntroMotion, this.this$0, null);
                    this.label = 1;
                    if (inflateMenu.IAuthTabCallback(inflatemenuOnTransact, (isOverflowMenuShowing) null, anonymousClass2, this, 1, (Object) null) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                Unit unit = Unit.INSTANCE;
                int i5 = onWarmupCompleted + 23;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                int i4 = onNavigationEvent + 75;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0 ? i3 != 1 : i3 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                mExternalSyntheticLambda8 mexternalsyntheticlambda8 = mExternalSyntheticLambda8.this;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(mexternalsyntheticlambda8, this.$savedAnimationState, this.$text, this.$motion, this.$sizeStrategy, this.$initialDelay, this.$skipIntroMotion, null);
                this.label = 1;
                if (mExternalSyntheticLambda8.IAuthTabCallback(mexternalsyntheticlambda8, (Function1) anonymousClass1, (access13800) this) == objOnWarmupCompleted) {
                    int i5 = onNavigationEvent + 33;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 38 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i7 = onNavigationEvent + 119;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        mExternalSyntheticLambda8 mexternalsyntheticlambda8 = (mExternalSyntheticLambda8) objArr[0];
        Function1<? super access13800<? super Unit>, ? extends Object> function1 = (Function1) objArr[1];
        access13800 access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 125;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        if (!mexternalsyntheticlambda8.extraCallback) {
            int i5 = i3 + 5;
            mayLaunchUrl = i5 % 128;
            int i6 = i5 % 2;
            mexternalsyntheticlambda8.writeTypedObject = function1;
            return Unit.INSTANCE;
        }
        Object objInvoke = function1.invoke(access13800Var);
        if (objInvoke != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i7 = extraCommand + 23;
        mayLaunchUrl = i7 % 128;
        int i8 = i7 % 2;
        return objInvoke;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        mExternalSyntheticLambda8 mexternalsyntheticlambda8 = (mExternalSyntheticLambda8) objArr[0];
        access13800<? super Unit> access13800Var = (access13800) objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 91;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = mexternalsyntheticlambda8.onExtraCallback((r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onWarmupCompleted) null, access13800Var);
        if (objOnExtraCallback == access14300.onWarmupCompleted()) {
            int i4 = mayLaunchUrl + 1;
            extraCommand = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
        Unit unit = Unit.INSTANCE;
        int i6 = extraCommand + 33;
        mayLaunchUrl = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private final Object onExtraCallback(r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onWarmupCompleted onwarmupcompleted, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 87;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        mExternalSyntheticApiModelOutline1.asInterface asinterfaceIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (IAuthTabCallback_Parcel() || (asinterfaceIAuthTabCallbackDefault instanceof mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub)) {
            int i4 = extraCommand + 25;
            mayLaunchUrl = i4 % 128;
            int i5 = i4 % 2;
            Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(new onWarmupCompleted(onwarmupcompleted, this, null), access13800Var);
            return objOnExtraCallbackWithResult == access14300.onWarmupCompleted() ? objOnExtraCallbackWithResult : Unit.INSTANCE;
        }
        if (!(!(asinterfaceIAuthTabCallbackDefault instanceof mExternalSyntheticApiModelOutline1.IAuthTabCallback))) {
            int i6 = mayLaunchUrl + 23;
            extraCommand = i6 % 128;
            if (i6 % 2 != 0) {
                onExtraCallbackWithResult(this, "", (mExternalSyntheticApiModelOutline1.IAuthTabCallback) asinterfaceIAuthTabCallbackDefault, mExternalSyntheticApiModelOutline1.onTransact.Companion.onExtraCallback(), 1, true, (Long) null, 19, (Object) null);
            } else {
                onExtraCallbackWithResult(this, "", (mExternalSyntheticApiModelOutline1.IAuthTabCallback) asinterfaceIAuthTabCallbackDefault, mExternalSyntheticApiModelOutline1.onTransact.Companion.onExtraCallback(), 0, false, (Long) null, 56, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onWarmupCompleted $savedAnimationState;
        Object L$0;
        int label;
        final /* synthetic */ mExternalSyntheticLambda8 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onWarmupCompleted onwarmupcompleted, mExternalSyntheticLambda8 mexternalsyntheticlambda8, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$savedAnimationState = onwarmupcompleted;
            this.this$0 = mexternalsyntheticlambda8;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onwarmupcompletedCreate.invokeSuspend(unit);
            }
            onwarmupcompletedCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$savedAnimationState, this.this$0, access13800Var);
            int i2 = onExtraCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 27 / 0;
            }
            int i5 = onExtraCallback + 71;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        /* renamed from: o.mExternalSyntheticLambda8$onWarmupCompleted$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            final /* synthetic */ r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onWarmupCompleted $animationState;
            Object L$0;
            int label;
            final /* synthetic */ mExternalSyntheticLambda8 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(mExternalSyntheticLambda8 mexternalsyntheticlambda8, r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onWarmupCompleted onwarmupcompleted, access13800<? super AnonymousClass2> access13800Var) {
                super(1, access13800Var);
                this.this$0 = mexternalsyntheticlambda8;
                this.$animationState = onwarmupcompleted;
            }

            public final access13800<Unit> create(access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$animationState, access13800Var);
                int i2 = onExtraCallbackWithResult + 73;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 9 / 0;
                }
                return anonymousClass2;
            }

            public /* synthetic */ Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 85;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((access13800) obj);
                if (i3 != 0) {
                    int i4 = 43 / 0;
                }
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 71;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object obj = null;
                AnonymousClass2 anonymousClass2Create = create(access13800Var);
                if (i3 == 0) {
                    anonymousClass2Create.invokeSuspend(Unit.INSTANCE);
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass2Create.invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallbackWithResult + 91;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                obj.hashCode();
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onExtraCallback + 95;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    mExternalSyntheticLambda8 mexternalsyntheticlambda8 = this.this$0;
                    int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
                    int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
                    mExternalSyntheticLambda8.onExtraCallbackWithResult(mexternalsyntheticlambda8, (Pair) mExternalSyntheticLambda8.onExtraCallbackWithResult(iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), 774461970, iIAuthTabCallback2, new Object[0], -774461968, OverseasRrnInputTextField.IAuthTabCallback()));
                    mExternalSyntheticLambda8 mexternalsyntheticlambda82 = this.this$0;
                    runOnUiThreadDelayed runonuithreaddelayedOnExtraCallback = mExternalSyntheticLambda8.onExtraCallback(mexternalsyntheticlambda82, mexternalsyntheticlambda82.IAuthTabCallbackStub());
                    mExternalSyntheticLambda8 mexternalsyntheticlambda83 = this.this$0;
                    long jAsBinder = mexternalsyntheticlambda83.onExtraCallbackWithResult(mexternalsyntheticlambda83.onTransact()).asBinder();
                    r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallback onextracallbackOnNavigationEvent = this.$animationState.onNavigationEvent();
                    this.L$0 = access15400.onNavigationEvent(runonuithreaddelayedOnExtraCallback);
                    this.label = 1;
                    if (mExternalSyntheticLambda8.IAuthTabCallback(mexternalsyntheticlambda83, runonuithreaddelayedOnExtraCallback, jAsBinder, true, (Long) null, onextracallbackOnNavigationEvent, (access13800) this, 8, (Object) null) == objOnWarmupCompleted) {
                        int i5 = onExtraCallback + 69;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onWarmupCompleted onwarmupcompleted = this.$savedAnimationState;
                if (onwarmupcompleted == null) {
                    onwarmupcompleted = r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onWarmupCompleted.onExtraCallback;
                    mExternalSyntheticLambda8.onExtraCallbackWithResult(this.this$0, onwarmupcompleted);
                }
                Object[] objArr = {this.this$0};
                getPackageType getpackagetype = (getPackageType) mExternalSyntheticLambda8.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 551132828, OverseasRrnInputTextField.IAuthTabCallback(), objArr, -551132816, OverseasRrnInputTextField.IAuthTabCallback());
                if (getpackagetype != null) {
                    int i3 = onExtraCallbackWithResult + 1;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 0, (Object) null);
                    } else {
                        getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                    }
                }
                inflateMenu inflatemenuOnTransact = mExternalSyntheticLambda8.onTransact(this.this$0);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, onwarmupcompleted, null);
                this.L$0 = access15400.onNavigationEvent(onwarmupcompleted);
                this.label = 1;
                if (inflateMenu.IAuthTabCallback(inflatemenuOnTransact, (isOverflowMenuShowing) null, anonymousClass2, this, 1, (Object) null) == objOnWarmupCompleted) {
                    int i4 = onExtraCallbackWithResult + 103;
                    int i5 = i4 % 128;
                    onExtraCallback = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 29;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static /* synthetic */ Object IAuthTabCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8, runOnUiThreadDelayed runonuithreaddelayed, long j, boolean z, Long l, r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallback onextracallback, access13800 access13800Var, int i, Object obj) {
        Long l2;
        int i2 = 2 % 2;
        int i3 = mayLaunchUrl + 93;
        int i4 = i3 % 128;
        extraCommand = i4;
        if (i3 % 2 == 0 ? (i & 8) == 0 : (i & 54) == 0) {
            l2 = l;
        } else {
            int i5 = i4 + 105;
            mayLaunchUrl = i5 % 128;
            int i6 = i5 % 2;
            l2 = null;
        }
        return mexternalsyntheticlambda8.onExtraCallbackWithResult(runonuithreaddelayed, j, z, l2, onextracallback, (access13800<? super Unit>) access13800Var);
    }

    private final Object onExtraCallbackWithResult(runOnUiThreadDelayed runonuithreaddelayed, long j, boolean z, Long l, r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallback onextracallback, access13800<? super Unit> access13800Var) {
        int iOnWarmupCompleted;
        int i = 2 % 2;
        if (onextracallback == null) {
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -729951703, OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this, runonuithreaddelayed, Long.valueOf(j), Boolean.valueOf(z), l, null, null, access13800Var, 48, null}, 729951710, OverseasRrnInputTextField.IAuthTabCallback());
            return objOnExtraCallbackWithResult == access14300.onWarmupCompleted() ? objOnExtraCallbackWithResult : Unit.INSTANCE;
        }
        r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28 r8lambdao3fy7vllgo1akyolrhcogjera28 = this.onMessageChannelReady;
        if (r8lambdao3fy7vllgo1akyolrhcogjera28 != null) {
            r8lambdao3fy7vllgo1akyolrhcogjera28.onExtraCallback(null);
        }
        Long lOnExtraCallback = access14000.onExtraCallback(onextracallback.onNavigationEvent());
        if (z) {
            int i2 = extraCommand + 81;
            mayLaunchUrl = i2 % 128;
            int i3 = i2 % 2;
            iOnWarmupCompleted = onextracallback.onWarmupCompleted();
        } else {
            iOnWarmupCompleted = 0;
        }
        Object objOnExtraCallbackWithResult2 = onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -729951703, OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this, runonuithreaddelayed, Long.valueOf(j), Boolean.valueOf(z), lOnExtraCallback, access14000.onNavigationEvent(iOnWarmupCompleted), null, access13800Var, 32, null}, 729951710, OverseasRrnInputTextField.IAuthTabCallback());
        if (objOnExtraCallbackWithResult2 != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i4 = extraCommand + 93;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallbackWithResult2;
    }

    public static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ boolean $animateSize;
        final /* synthetic */ Function0<Unit> $onCompletion;
        final /* synthetic */ long $size;
        final /* synthetic */ Integer $sizeAnimationDuration;
        final /* synthetic */ runOnUiThreadDelayed $timeline;
        final /* synthetic */ Long $timelinePosition;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ mExternalSyntheticLambda8 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(Integer num, mExternalSyntheticLambda8 mexternalsyntheticlambda8, runOnUiThreadDelayed runonuithreaddelayed, long j, Long l, boolean z, Function0<Unit> function0, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$sizeAnimationDuration = num;
            this.this$0 = mexternalsyntheticlambda8;
            this.$timeline = runonuithreaddelayed;
            this.$size = j;
            this.$timelinePosition = l;
            this.$animateSize = z;
            this.$onCompletion = function0;
        }

        public static /* synthetic */ Unit onExtraCallback(runOnUiThreadDelayed runonuithreaddelayed, mExternalSyntheticLambda8 mexternalsyntheticlambda8, Function0 function0, long j, Ref.IntRef intRef, Throwable th) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(runonuithreaddelayed, mexternalsyntheticlambda8, function0, j, intRef, th);
            int i4 = onWarmupCompleted + 107;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unitIAuthTabCallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = new asInterface(this.$sizeAnimationDuration, this.this$0, this.$timeline, this.$size, this.$timelinePosition, this.$animateSize, this.$onCompletion, access13800Var);
            asinterface.L$0 = obj;
            int i2 = onWarmupCompleted + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return asinterface;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            asInterface asinterfaceCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 57 / 0;
            } else {
                objInvokeSuspend = asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onNavigationEvent + 91;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            final Ref.IntRef intRef = new Ref.IntRef();
            Integer num = this.$sizeAnimationDuration;
            intRef.element = num != null ? num.intValue() : 0;
            mExternalSyntheticLambda8 mexternalsyntheticlambda8 = this.this$0;
            getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass1(this.$timeline, mexternalsyntheticlambda8, this.$size, this.$timelinePosition, this.$sizeAnimationDuration, this.$animateSize, intRef, null), 3, (Object) null);
            final runOnUiThreadDelayed runonuithreaddelayed = this.$timeline;
            final mExternalSyntheticLambda8 mexternalsyntheticlambda82 = this.this$0;
            final Function0<Unit> function0 = this.$onCompletion;
            getpackagetypeOnNavigationEvent.onExtraCallback(new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1State$playAnimation$4$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallback + 115;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        return mExternalSyntheticLambda8.asInterface.onExtraCallback(runonuithreaddelayed, mexternalsyntheticlambda82, function0, jElapsedRealtime, intRef, (Throwable) obj2);
                    }
                    mExternalSyntheticLambda8.asInterface.onExtraCallback(runonuithreaddelayed, mexternalsyntheticlambda82, function0, jElapsedRealtime, intRef, (Throwable) obj2);
                    throw null;
                }
            });
            mExternalSyntheticLambda8.IAuthTabCallback(mexternalsyntheticlambda8, getpackagetypeOnNavigationEvent);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 31;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 85 / 0;
            }
            return unit;
        }

        /* renamed from: o.mExternalSyntheticLambda8$asInterface$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ boolean $animateSize;
            final /* synthetic */ Ref.IntRef $runningSizeAnimationDuration;
            final /* synthetic */ long $size;
            final /* synthetic */ Integer $sizeAnimationDuration;
            final /* synthetic */ runOnUiThreadDelayed $timeline;
            final /* synthetic */ Long $timelinePosition;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ mExternalSyntheticLambda8 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(runOnUiThreadDelayed runonuithreaddelayed, mExternalSyntheticLambda8 mexternalsyntheticlambda8, long j, Long l, Integer num, boolean z, Ref.IntRef intRef, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.$timeline = runonuithreaddelayed;
                this.this$0 = mexternalsyntheticlambda8;
                this.$size = j;
                this.$timelinePosition = l;
                this.$sizeAnimationDuration = num;
                this.$animateSize = z;
                this.$runningSizeAnimationDuration = intRef;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$timeline, this.this$0, this.$size, this.$timelinePosition, this.$sizeAnimationDuration, this.$animateSize, this.$runningSizeAnimationDuration, access13800Var);
                anonymousClass1.L$0 = obj;
                int i2 = onWarmupCompleted + 81;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass1;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 31;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                int i4 = onWarmupCompleted + 57;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 68 / 0;
                }
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 67;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 35;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i;
                int i2 = 2 % 2;
                findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                runOnUiThreadDelayed runonuithreaddelayed = this.$timeline;
                if (runonuithreaddelayed != null) {
                    maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass4(runonuithreaddelayed, this.$timelinePosition, this.$sizeAnimationDuration, this.$animateSize, this.$runningSizeAnimationDuration, this.this$0, this.$size, null), 3, (Object) null);
                    i = IAuthTabCallback + 45;
                    onWarmupCompleted = i % 128;
                } else {
                    this.this$0.onNavigationEvent(this.$size);
                    i = onWarmupCompleted + 119;
                    IAuthTabCallback = i % 128;
                }
                int i3 = i % 2;
                return Unit.INSTANCE;
            }

            /* renamed from: o.mExternalSyntheticLambda8$asInterface$1$4, reason: invalid class name */
            static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;
                final /* synthetic */ boolean $animateSize;
                final /* synthetic */ Ref.IntRef $runningSizeAnimationDuration;
                final /* synthetic */ long $size;
                final /* synthetic */ Integer $sizeAnimationDuration;
                final /* synthetic */ runOnUiThreadDelayed $timeline;
                final /* synthetic */ Long $timelinePosition;
                int I$0;
                int I$1;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;
                final /* synthetic */ mExternalSyntheticLambda8 this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(runOnUiThreadDelayed runonuithreaddelayed, Long l, Integer num, boolean z, Ref.IntRef intRef, mExternalSyntheticLambda8 mexternalsyntheticlambda8, long j, access13800<? super AnonymousClass4> access13800Var) {
                    super(2, access13800Var);
                    this.$timeline = runonuithreaddelayed;
                    this.$timelinePosition = l;
                    this.$sizeAnimationDuration = num;
                    this.$animateSize = z;
                    this.$runningSizeAnimationDuration = intRef;
                    this.this$0 = mexternalsyntheticlambda8;
                    this.$size = j;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$timeline, this.$timelinePosition, this.$sizeAnimationDuration, this.$animateSize, this.$runningSizeAnimationDuration, this.this$0, this.$size, access13800Var);
                    anonymousClass4.L$0 = obj;
                    int i2 = IAuthTabCallback + 31;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        return anonymousClass4;
                    }
                    throw null;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 107;
                    IAuthTabCallback = i2 % 128;
                    findResAndMsg findresandmsg = (findResAndMsg) obj;
                    access13800<? super Unit> access13800Var = (access13800) obj2;
                    if (i2 % 2 != 0) {
                        return onNavigationEvent(findresandmsg, access13800Var);
                    }
                    onNavigationEvent(findresandmsg, access13800Var);
                    throw null;
                }

                public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                    Object objInvokeSuspend;
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 53;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    AnonymousClass4 anonymousClass4Create = create(findresandmsg, access13800Var);
                    if (i3 == 0) {
                        objInvokeSuspend = anonymousClass4Create.invokeSuspend(Unit.INSTANCE);
                        int i4 = 98 / 0;
                    } else {
                        objInvokeSuspend = anonymousClass4Create.invokeSuspend(Unit.INSTANCE);
                    }
                    int i5 = IAuthTabCallback + 81;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        return objInvokeSuspend;
                    }
                    throw null;
                }

                /* renamed from: o.mExternalSyntheticLambda8$asInterface$1$4$1, reason: invalid class name and collision with other inner class name */
                static final class C00421 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;
                    final /* synthetic */ Ref.IntRef $runningSizeAnimationDuration;
                    final /* synthetic */ long $size;
                    int label;
                    final /* synthetic */ mExternalSyntheticLambda8 this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00421(mExternalSyntheticLambda8 mexternalsyntheticlambda8, long j, Ref.IntRef intRef, access13800<? super C00421> access13800Var) {
                        super(2, access13800Var);
                        this.this$0 = mexternalsyntheticlambda8;
                        this.$size = j;
                        this.$runningSizeAnimationDuration = intRef;
                    }

                    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                        int i = 2 % 2;
                        C00421 c00421 = new C00421(this.this$0, this.$size, this.$runningSizeAnimationDuration, access13800Var);
                        int i2 = onWarmupCompleted + 67;
                        IAuthTabCallback = i2 % 128;
                        int i3 = i2 % 2;
                        return c00421;
                    }

                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = onWarmupCompleted + 117;
                        IAuthTabCallback = i2 % 128;
                        findResAndMsg findresandmsg = (findResAndMsg) obj;
                        access13800<? super Unit> access13800Var = (access13800) obj2;
                        if (i2 % 2 != 0) {
                            return onWarmupCompleted(findresandmsg, access13800Var);
                        }
                        Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
                        int i3 = 65 / 0;
                        return objOnWarmupCompleted;
                    }

                    public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 81;
                        onWarmupCompleted = i2 % 128;
                        int i3 = i2 % 2;
                        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                        int i4 = IAuthTabCallback + 61;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        return objInvokeSuspend;
                    }

                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                        int i2 = this.label;
                        if (i2 == 0) {
                            ResultKt.onNavigationEvent(obj);
                            mExternalSyntheticLambda8 mexternalsyntheticlambda8 = this.this$0;
                            long j = this.$size;
                            int i3 = this.$runningSizeAnimationDuration.element;
                            this.label = 1;
                            if (mExternalSyntheticLambda8.onWarmupCompleted(mexternalsyntheticlambda8, j, i3, this) == objOnWarmupCompleted) {
                                return objOnWarmupCompleted;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i4 = onWarmupCompleted + 19;
                            IAuthTabCallback = i4 % 128;
                            int i5 = i4 % 2;
                            ResultKt.onNavigationEvent(obj);
                        }
                        Unit unit = Unit.INSTANCE;
                        int i6 = IAuthTabCallback + 5;
                        onWarmupCompleted = i6 % 128;
                        if (i6 % 2 == 0) {
                            return unit;
                        }
                        throw null;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x00b2 A[RETURN] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    int iCoerceAtLeast;
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 123;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i4 = this.label;
                    if (i4 != 0) {
                        int i5 = onNavigationEvent + 107;
                        IAuthTabCallback = i5 % 128;
                        if (i5 % 2 != 0 ? i4 != 1 : i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        int iIntValue = 0;
                        runOnUiThreadDelayed runonuithreaddelayed = (runOnUiThreadDelayed) isFireOS.onExtraCallbackWithResult(this.$timeline, false, 1, null);
                        int iOnNavigationEvent = mExternalSyntheticLambda5.onNavigationEvent(this.$timelinePosition, runonuithreaddelayed);
                        Integer num = this.$sizeAnimationDuration;
                        if (num != null) {
                            int i6 = IAuthTabCallback + 15;
                            onNavigationEvent = i6 % 128;
                            int i7 = i6 % 2;
                            iIntValue = num.intValue();
                        } else {
                            if (this.$animateSize) {
                                iCoerceAtLeast = RangesKt.coerceAtLeast(runonuithreaddelayed.IAuthTabCallbackStub() - iOnNavigationEvent, 0);
                            }
                            Ref.IntRef intRef = this.$runningSizeAnimationDuration;
                            intRef.element = iCoerceAtLeast;
                            if (iCoerceAtLeast <= 0) {
                                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new C00421(this.this$0, this.$size, intRef, null), 3, (Object) null);
                            } else {
                                this.this$0.onNavigationEvent(this.$size);
                            }
                            runonuithreaddelayed.onExtraCallback(iOnNavigationEvent);
                            this.L$0 = access15400.onNavigationEvent(findresandmsg);
                            this.L$1 = access15400.onNavigationEvent(runonuithreaddelayed);
                            this.I$0 = iOnNavigationEvent;
                            this.I$1 = iCoerceAtLeast;
                            this.label = 1;
                            if (RallyKt.onWarmupCompleted(runonuithreaddelayed, null, this, 1, null) == objOnWarmupCompleted) {
                                return objOnWarmupCompleted;
                            }
                        }
                        iCoerceAtLeast = iIntValue;
                        Ref.IntRef intRef2 = this.$runningSizeAnimationDuration;
                        intRef2.element = iCoerceAtLeast;
                        if (iCoerceAtLeast <= 0) {
                        }
                        runonuithreaddelayed.onExtraCallback(iOnNavigationEvent);
                        this.L$0 = access15400.onNavigationEvent(findresandmsg);
                        this.L$1 = access15400.onNavigationEvent(runonuithreaddelayed);
                        this.I$0 = iOnNavigationEvent;
                        this.I$1 = iCoerceAtLeast;
                        this.label = 1;
                        if (RallyKt.onWarmupCompleted(runonuithreaddelayed, null, this, 1, null) == objOnWarmupCompleted) {
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit IAuthTabCallback(runOnUiThreadDelayed runonuithreaddelayed, mExternalSyntheticLambda8 mexternalsyntheticlambda8, Function0 function0, long j, Ref.IntRef intRef, Throwable th) {
            int i = 2 % 2;
            int iICustomTabsService = runonuithreaddelayed != null ? runonuithreaddelayed.ICustomTabsService() : 0;
            if (runonuithreaddelayed == null || iICustomTabsService >= runonuithreaddelayed.IAuthTabCallbackStub()) {
                function0.invoke();
            } else {
                int i2 = onNavigationEvent;
                int i3 = i2 + 81;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    boolean z = th instanceof CancellationException;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (th instanceof CancellationException) {
                    int i4 = i2 + 35;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        boolean zAreEqual = Intrinsics.areEqual(((CancellationException) th).getMessage(), "save");
                        int i5 = 28 / 0;
                        if (zAreEqual) {
                            r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28 r8lambdao3fy7vllgo1akyolrhcogjera28AsBinder = mExternalSyntheticLambda8.asBinder(mexternalsyntheticlambda8);
                            if (r8lambdao3fy7vllgo1akyolrhcogjera28AsBinder != null) {
                                r8lambdao3fy7vllgo1akyolrhcogjera28AsBinder.onExtraCallback(new r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallback(iICustomTabsService, RangesKt.coerceAtLeast(intRef.element - ((int) (SystemClock.elapsedRealtime() - j)), 0)));
                            }
                        }
                    } else if (Intrinsics.areEqual(((CancellationException) th).getMessage(), "save")) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit IAuthTabCallbackStubProxy(mExternalSyntheticLambda8 mexternalsyntheticlambda8) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 15;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        mexternalsyntheticlambda8.onNavigationEvent(mexternalsyntheticlambda8.extraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = mayLaunchUrl + 109;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        mExternalSyntheticLambda8 mexternalsyntheticlambda8 = (mExternalSyntheticLambda8) objArr[0];
        runOnUiThreadDelayed runonuithreaddelayed = (runOnUiThreadDelayed) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        Long l = (Long) objArr[4];
        Integer num = (Integer) objArr[5];
        Function0 function0 = (Function0) objArr[6];
        access13800 access13800Var = (access13800) objArr[7];
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(access13800Var.getContext(), new asInterface(num, mexternalsyntheticlambda8, runonuithreaddelayed, jLongValue, l, zBooleanValue, function0, null), access13800Var);
        if (objOnExtraCallback != access14300.onWarmupCompleted()) {
            Unit unit = Unit.INSTANCE;
            int i2 = extraCommand + 55;
            mayLaunchUrl = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 / 0;
            }
            return unit;
        }
        int i4 = extraCommand + 65;
        int i5 = i4 % 128;
        mayLaunchUrl = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 63;
        extraCommand = i7 % 128;
        if (i7 % 2 == 0) {
            return objOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final runOnUiThreadDelayed onExtraCallbackWithResult(mExternalSyntheticLambda9 mexternalsyntheticlambda9, final AppLovinSdkSettings appLovinSdkSettings, int i, mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault iAuthTabCallbackDefault, int i2) {
        int i3 = 2 % 2;
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallbackWithResult = onExtraCallbackWithResult(mexternalsyntheticlambda9, new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1State$$ExternalSyntheticLambda7
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onExtraCallback + 11;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = {appLovinSdkSettings, (mExternalSyntheticLambda2) obj};
                if (i6 == 0) {
                    return (AppLovinSdkSettings) mExternalSyntheticLambda8.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -433398364, OverseasRrnInputTextField.IAuthTabCallback(), objArr, 433398372, OverseasRrnInputTextField.IAuthTabCallback());
                }
                throw null;
            }
        }, i, iAuthTabCallbackDefault, i2);
        int i4 = mayLaunchUrl + 81;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
        return runonuithreaddelayedOnExtraCallbackWithResult;
    }

    private final runOnUiThreadDelayed onExtraCallbackWithResult(mExternalSyntheticLambda9 mexternalsyntheticlambda9, Function1<? super mExternalSyntheticLambda2, AppLovinSdkSettings> function1, int i, mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault iAuthTabCallbackDefault, int i2) {
        int i3 = 2 % 2;
        int i4 = mayLaunchUrl + 109;
        extraCommand = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            mexternalsyntheticlambda9.onWarmupCompleted();
            obj.hashCode();
            throw null;
        }
        mExternalSyntheticLambda6 mexternalsyntheticlambda6OnWarmupCompleted = mexternalsyntheticlambda9.onWarmupCompleted();
        if (mexternalsyntheticlambda6OnWarmupCompleted == null || mexternalsyntheticlambda6OnWarmupCompleted.isEmpty()) {
            return null;
        }
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        mExternalSyntheticLambda6 mexternalsyntheticlambda6OnWarmupCompleted2 = mexternalsyntheticlambda9.onWarmupCompleted();
        ArrayList arrayList = new ArrayList(mexternalsyntheticlambda6OnWarmupCompleted2.size());
        int size = mexternalsyntheticlambda6OnWarmupCompleted2.size();
        int i5 = mayLaunchUrl + 67;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (i7 < size) {
            int i8 = mayLaunchUrl + 83;
            extraCommand = i8 % 128;
            int i9 = i8 % 2;
            mExternalSyntheticLambda2 mexternalsyntheticlambda2 = mexternalsyntheticlambda6OnWarmupCompleted2.get(i7);
            arrayList.add(RallysKt.onExtraCallback((setCreativeDebuggerEnabled) mexternalsyntheticlambda2, (AppLovinSdkSettings) function1.invoke(mexternalsyntheticlambda2), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, i2 + (mexternalsyntheticlambda2.onWarmupCompleted(iAuthTabCallbackDefault) * i), 0L, false, 1788, (Object) null));
            i7++;
            int i10 = mayLaunchUrl + 37;
            extraCommand = i10 % 128;
            int i11 = i10 % 2;
        }
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted(null, iAuthTabCallback, arrayList, 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 3833, null);
        int i12 = mayLaunchUrl + 79;
        extraCommand = i12 % 128;
        if (i12 % 2 == 0) {
            return runonuithreaddelayedOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    private final runOnUiThreadDelayed onNavigationEvent(mExternalSyntheticLambda9 mexternalsyntheticlambda9, final AppLovinSdkSettings appLovinSdkSettings, int i, mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault iAuthTabCallbackDefault, int i2) {
        int i3 = 2 % 2;
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallback = onExtraCallback(mexternalsyntheticlambda9, new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1State$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 101;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = mExternalSyntheticLambda8.IAuthTabCallback(appLovinSdkSettings, (mExternalSyntheticLambda2) obj);
                int i7 = IAuthTabCallback + 43;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return appLovinSdkSettingsIAuthTabCallback;
            }
        }, i, iAuthTabCallbackDefault, i2);
        int i4 = mayLaunchUrl + 31;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return runonuithreaddelayedOnExtraCallback;
        }
        throw null;
    }

    private final runOnUiThreadDelayed onExtraCallback(mExternalSyntheticLambda9 mexternalsyntheticlambda9, Function1<? super mExternalSyntheticLambda2, AppLovinSdkSettings> function1, int i, mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault iAuthTabCallbackDefault, int i2) {
        int i3 = 2 % 2;
        if (mexternalsyntheticlambda9.onNavigationEvent().isEmpty()) {
            int i4 = extraCommand + 85;
            mayLaunchUrl = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            int i5 = 39 / 0;
            return null;
        }
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        mExternalSyntheticLambda6 mexternalsyntheticlambda6OnNavigationEvent = mexternalsyntheticlambda9.onNavigationEvent();
        ArrayList arrayList = new ArrayList(mexternalsyntheticlambda6OnNavigationEvent.size());
        int size = mexternalsyntheticlambda6OnNavigationEvent.size();
        for (int i6 = 0; i6 < size; i6++) {
            int i7 = mayLaunchUrl + 37;
            extraCommand = i7 % 128;
            int i8 = i7 % 2;
            mExternalSyntheticLambda2 mexternalsyntheticlambda2 = mexternalsyntheticlambda6OnNavigationEvent.get(i6);
            arrayList.add(RallysKt.onExtraCallback((setCreativeDebuggerEnabled) mexternalsyntheticlambda2, (AppLovinSdkSettings) function1.invoke(mexternalsyntheticlambda2), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, i2 + (mexternalsyntheticlambda2.onWarmupCompleted(iAuthTabCallbackDefault) * i), 0L, false, 1788, (Object) null));
        }
        return RallysKt.onWarmupCompleted(null, iAuthTabCallback, arrayList, 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 3833, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0097 A[PHI: r1 r4
      0x0097: PHI (r1v7 java.lang.Float) = (r1v4 java.lang.Float), (r1v8 java.lang.Float) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x0097: PHI (r4v6 o.pxToDp$IAuthTabCallback) = (r4v1 o.pxToDp$IAuthTabCallback), (r4v7 o.pxToDp$IAuthTabCallback) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r1 r4 r5
      0x002b: PHI (r1v5 java.lang.Float) = (r1v4 java.lang.Float), (r1v8 java.lang.Float) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r4v2 o.pxToDp$IAuthTabCallback) = (r4v1 o.pxToDp$IAuthTabCallback), (r4v7 o.pxToDp$IAuthTabCallback) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r5v1 o.mExternalSyntheticLambda6) = (r5v0 o.mExternalSyntheticLambda6), (r5v7 o.mExternalSyntheticLambda6) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final runOnUiThreadDelayed IAuthTabCallback(mExternalSyntheticLambda9 mexternalsyntheticlambda9) {
        Float fValueOf;
        pxToDp.IAuthTabCallback iAuthTabCallback;
        mExternalSyntheticLambda6 mexternalsyntheticlambda6OnWarmupCompleted;
        Collection arrayList;
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 111;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            fValueOf = Float.valueOf(0.0f);
            iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
            mexternalsyntheticlambda6OnWarmupCompleted = mexternalsyntheticlambda9.onWarmupCompleted();
            if (mexternalsyntheticlambda6OnWarmupCompleted != null) {
                arrayList = new ArrayList(mexternalsyntheticlambda6OnWarmupCompleted.size());
                int size = mexternalsyntheticlambda6OnWarmupCompleted.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList.add(RallysKt.onExtraCallback((setCreativeDebuggerEnabled) mexternalsyntheticlambda6OnWarmupCompleted.get(i3), isMuted.onNavigationEvent((AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.onTransact(), 400}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null));
                }
            } else {
                arrayList = CollectionsKt.emptyList();
                int i4 = extraCommand + 43;
                mayLaunchUrl = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 / 5;
                }
            }
        } else {
            fValueOf = Float.valueOf(0.0f);
            iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
            mexternalsyntheticlambda6OnWarmupCompleted = mexternalsyntheticlambda9.onWarmupCompleted();
            if (mexternalsyntheticlambda6OnWarmupCompleted != null) {
            }
        }
        pxToDp.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
        Collection collection = arrayList;
        mExternalSyntheticLambda6 mexternalsyntheticlambda6OnNavigationEvent = mexternalsyntheticlambda9.onNavigationEvent();
        ArrayList arrayList2 = new ArrayList(mexternalsyntheticlambda6OnNavigationEvent.size());
        int size2 = mexternalsyntheticlambda6OnNavigationEvent.size();
        int i6 = mayLaunchUrl + 89;
        extraCommand = i6 % 128;
        int i7 = i6 % 2;
        for (int i8 = 0; i8 < size2; i8++) {
            int i9 = extraCommand + 87;
            mayLaunchUrl = i9 % 128;
            int i10 = i9 % 2;
            arrayList2.add(RallysKt.onExtraCallback((setCreativeDebuggerEnabled) mexternalsyntheticlambda6OnNavigationEvent.get(i8), isMuted.onNavigationEvent((AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.onTransact(), 400}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null));
        }
        return RallysKt.onWarmupCompleted(null, iAuthTabCallback2, CollectionsKt.plus(collection, arrayList2), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 3833, null);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 0;
        mExternalSyntheticLambda9 mexternalsyntheticlambda9 = (mExternalSyntheticLambda9) objArr[1];
        mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub = (mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub) objArr[2];
        int i2 = 2 % 2;
        int i3 = mayLaunchUrl + 85;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        if (mexternalsyntheticlambda9.onNavigationEvent().isEmpty()) {
            return null;
        }
        List<AppLovinSdkSettings> listInvoke = iAuthTabCallbackStub.IAuthTabCallback().invoke();
        mExternalSyntheticLambda6 mexternalsyntheticlambda6OnNavigationEvent = mexternalsyntheticlambda9.onNavigationEvent();
        ArrayList arrayList = new ArrayList(mexternalsyntheticlambda6OnNavigationEvent.size());
        for (int size = mexternalsyntheticlambda6OnNavigationEvent.size(); i < size; size = size) {
            int i5 = mayLaunchUrl + 81;
            extraCommand = i5 % 128;
            int i6 = i5 % 2;
            mExternalSyntheticLambda2 mexternalsyntheticlambda2 = mexternalsyntheticlambda6OnNavigationEvent.get(i);
            ArrayList arrayList2 = arrayList;
            arrayList2.add(RallysKt.onExtraCallbackWithResult(mexternalsyntheticlambda2, listInvoke, -1, getExtraParameters.Normal, 0, null, null, Boolean.TRUE, mexternalsyntheticlambda2.onWarmupCompleted(iAuthTabCallbackStub.onExtraCallback()) * iAuthTabCallbackStub.onWarmupCompleted(), 0L, false, 1648, null));
            i++;
            int i7 = mayLaunchUrl + 27;
            extraCommand = i7 % 128;
            int i8 = i7 % 2;
            arrayList = arrayList2;
        }
        return RallysKt.onWarmupCompleted(null, pxToDp.IAuthTabCallback.onExtraCallback, arrayList, 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 3833, null);
    }

    private final Object IAuthTabCallback(long j, int i, access13800<? super Unit> access13800Var) {
        getThumbPosition getthumbpositionOnExtraCallback;
        int i2 = 2 % 2;
        long jOnExtraCallback = onExtraCallback();
        getThumbTintList getthumbtintlistOnExtraCallbackWithResult = getThumbTextPadding.onExtraCallbackWithResult(ExtensionsManager1.Companion);
        getIconContentView geticoncontentview = getIconContentView.onWarmupCompleted;
        if (i < geticoncontentview.IAuthTabCallback().onExtraCallback()) {
            int i3 = mayLaunchUrl + 47;
            extraCommand = i3 % 128;
            int i4 = i3 % 2;
            getthumbpositionOnExtraCallback = onQueryRefine.onExtraCallbackWithResult(i, 0, geticoncontentview.IAuthTabCallback(), 2, (Object) null);
        } else {
            getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(geticoncontentview.IAuthTabCallback(), 0, 2, (Object) null);
        }
        Object objOnExtraCallbackWithResult = getShowText.onExtraCallbackWithResult(getthumbtintlistOnExtraCallbackWithResult, ExtensionsManager1.onNavigationEvent(jOnExtraCallback), ExtensionsManager1.onNavigationEvent(j), (Object) null, getthumbpositionOnExtraCallback, new Function2() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1State$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i5 = 2 % 2;
                int i6 = onNavigationEvent + 71;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                Unit unitOnExtraCallback = mExternalSyntheticLambda8.onExtraCallback(this.f$0, (ExtensionsManager1) obj, (ExtensionsManager1) obj2);
                int i8 = IAuthTabCallback + 11;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 70 / 0;
                }
                return unitOnExtraCallback;
            }
        }, access13800Var, 8, (Object) null);
        if (objOnExtraCallbackWithResult != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i5 = mayLaunchUrl + 61;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8, ExtensionsManager1 extensionsManager1, ExtensionsManager1 extensionsManager12) {
        int i = 2 % 2;
        int i2 = extraCommand + 15;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        mexternalsyntheticlambda8.onNavigationEvent(extensionsManager1.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 91;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return unit;
    }

    static /* synthetic */ mExternalSyntheticLambda9 onExtraCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8, SurfaceProcessorNodeOut surfaceProcessorNodeOut, SurfaceProcessorNodeOut surfaceProcessorNodeOut2, mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault iAuthTabCallbackDefault, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i3 = mayLaunchUrl + 29;
            extraCommand = i3 % 128;
            if (i3 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            surfaceProcessorNodeOut2 = null;
        }
        mExternalSyntheticLambda9 mexternalsyntheticlambda9OnExtraCallbackWithResult = mexternalsyntheticlambda8.onExtraCallbackWithResult(surfaceProcessorNodeOut, surfaceProcessorNodeOut2, iAuthTabCallbackDefault);
        int i4 = extraCommand + 87;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return mexternalsyntheticlambda9OnExtraCallbackWithResult;
        }
        throw null;
    }

    private final mExternalSyntheticLambda9 onExtraCallbackWithResult(SurfaceProcessorNodeOut surfaceProcessorNodeOut, SurfaceProcessorNodeOut surfaceProcessorNodeOut2, mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        mExternalSyntheticLambda6 mexternalsyntheticlambda6OnNavigationEvent;
        int i = 2 % 2;
        int i2 = extraCommand + 97;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        mExternalSyntheticLambda6 mexternalsyntheticlambda6OnNavigationEvent2 = onNavigationEvent(surfaceProcessorNodeOut, iAuthTabCallbackDefault);
        if (surfaceProcessorNodeOut2 != null) {
            int i4 = extraCommand + 91;
            mayLaunchUrl = i4 % 128;
            int i5 = i4 % 2;
            mexternalsyntheticlambda6OnNavigationEvent = onNavigationEvent(surfaceProcessorNodeOut2, iAuthTabCallbackDefault);
        } else {
            mexternalsyntheticlambda6OnNavigationEvent = null;
        }
        return new mExternalSyntheticLambda9(mexternalsyntheticlambda6OnNavigationEvent2, mexternalsyntheticlambda6OnNavigationEvent);
    }

    private final mExternalSyntheticLambda9 IAuthTabCallback(SurfaceProcessorNodeOut surfaceProcessorNodeOut, mExternalSyntheticLambda9 mexternalsyntheticlambda9, mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        mExternalSyntheticLambda6 mexternalsyntheticlambda6OnNavigationEvent;
        int i = 2 % 2;
        mExternalSyntheticLambda6 mexternalsyntheticlambda6OnNavigationEvent2 = onNavigationEvent(surfaceProcessorNodeOut, iAuthTabCallbackDefault);
        if (mexternalsyntheticlambda9 != null) {
            int i2 = extraCommand + 39;
            mayLaunchUrl = i2 % 128;
            int i3 = i2 % 2;
            mexternalsyntheticlambda6OnNavigationEvent = mexternalsyntheticlambda9.onNavigationEvent();
            int i4 = extraCommand + 39;
            mayLaunchUrl = i4 % 128;
            int i5 = i4 % 2;
        } else {
            mexternalsyntheticlambda6OnNavigationEvent = null;
        }
        return new mExternalSyntheticLambda9(mexternalsyntheticlambda6OnNavigationEvent2, mexternalsyntheticlambda6OnNavigationEvent);
    }

    private static final void onExtraCallback(hasProvider hasprovider, List<mExternalSyntheticLambda2> list, mExternalSyntheticLambda8 mexternalsyntheticlambda8, SurfaceProcessorNodeOut surfaceProcessorNodeOut, Ref.IntRef intRef, Ref.IntRef intRef2, Ref.IntRef intRef3, int i) {
        int i2 = 2 % 2;
        hasProvider hasproviderIAuthTabCallbackStub = hasprovider.IAuthTabCallbackStub(i, i + 1);
        char cFirst = StringsKt.first(hasproviderIAuthTabCallbackStub.onTransact());
        list.add(new mExternalSyntheticLambda2(hasproviderIAuthTabCallbackStub, ByteOrderedDataOutputStream.onExtraCallback(mexternalsyntheticlambda8.onUnminimized.getColor()), i, surfaceProcessorNodeOut.IAuthTabCallbackStub(i), surfaceProcessorNodeOut.onExtraCallback(i, true), surfaceProcessorNodeOut.onWarmupCompleted(i), intRef.element, intRef2.element, intRef3.element, null));
        if (cFirst == '\n') {
            intRef3.element++;
            intRef2.element++;
            return;
        }
        int i3 = extraCommand;
        int i4 = i3 + 73;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        if (cFirst != ' ') {
            int i6 = i3 + 17;
            mayLaunchUrl = i6 % 128;
            int i7 = i6 % 2;
            intRef.element++;
            int i8 = extraCommand + 103;
            mayLaunchUrl = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        if (intRef.element > 0) {
            int i10 = mayLaunchUrl + 27;
            extraCommand = i10 % 128;
            if (i10 % 2 != 0) {
                intRef2.element >>>= 1;
            } else {
                intRef2.element++;
            }
        }
    }

    private static final void onExtraCallbackWithResult(List<mExternalSyntheticLambda2> list, hasProvider hasprovider, mExternalSyntheticLambda8 mexternalsyntheticlambda8, SurfaceProcessorNodeOut surfaceProcessorNodeOut, Ref.IntRef intRef, Ref.IntRef intRef2, Ref.IntRef intRef3, int i, int i2) {
        int i3 = 2 % 2;
        list.add(new mExternalSyntheticLambda2(hasprovider.IAuthTabCallbackStub(i, i2), ByteOrderedDataOutputStream.onExtraCallback(mexternalsyntheticlambda8.onUnminimized.getColor()), i, surfaceProcessorNodeOut.IAuthTabCallbackStub(i), surfaceProcessorNodeOut.onExtraCallback(i, true), surfaceProcessorNodeOut.onWarmupCompleted(i), intRef.element, intRef2.element, intRef3.element, null));
        intRef.element++;
        int i4 = extraCommand + 43;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final mExternalSyntheticLambda6 onNavigationEvent(SurfaceProcessorNodeOut surfaceProcessorNodeOut, mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        int i = 2 % 2;
        CharSequence charSequenceOnNavigationEvent = surfaceProcessorNodeOut.onTransact().onNavigationEvent().onNavigationEvent();
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(charSequenceOnNavigationEvent, iAuthTabCallbackDefault);
        mExternalSyntheticLambda6 mexternalsyntheticlambda6 = (mExternalSyntheticLambda6) this.asInterface.get(pairIAuthTabCallback);
        int i2 = 0;
        if (mexternalsyntheticlambda6 != null) {
            int i3 = extraCommand + 79;
            mayLaunchUrl = i3 % 128;
            if (i3 % 2 == 0) {
                mexternalsyntheticlambda6.onNavigationEvent();
                int i4 = 50 / 0;
            } else {
                mexternalsyntheticlambda6.onNavigationEvent();
            }
            return mexternalsyntheticlambda6;
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        Ref.IntRef intRef = new Ref.IntRef();
        Ref.IntRef intRef2 = new Ref.IntRef();
        Ref.IntRef intRef3 = new Ref.IntRef();
        Pattern patternOnExtraCallback = CacheCacheResponseBody1.onNavigationEvent.onExtraCallback();
        Matcher matcher = patternOnExtraCallback != null ? patternOnExtraCallback.matcher(charSequenceOnNavigationEvent) : null;
        if (matcher != null) {
            int i5 = extraCommand + 41;
            mayLaunchUrl = i5 % 128;
            int i6 = i5 % 2;
            while (matcher.find()) {
                int iStart = matcher.start();
                int i7 = mayLaunchUrl + 37;
                extraCommand = i7 % 128;
                int i8 = i7 % 2;
                for (int i9 = i2; i9 < iStart; i9++) {
                    onExtraCallback((hasProvider) charSequenceOnNavigationEvent, (List<mExternalSyntheticLambda2>) listCreateListBuilder, this, surfaceProcessorNodeOut, intRef, intRef2, intRef3, i9);
                }
                int iStart2 = matcher.start();
                int iEnd = matcher.end();
                onExtraCallbackWithResult((List<mExternalSyntheticLambda2>) listCreateListBuilder, (hasProvider) charSequenceOnNavigationEvent, this, surfaceProcessorNodeOut, intRef, intRef2, intRef3, iStart2, iEnd);
                i2 = iEnd;
            }
            int length = charSequenceOnNavigationEvent.length();
            for (int i10 = i2; i10 < length; i10++) {
                int i11 = extraCommand + 41;
                mayLaunchUrl = i11 % 128;
                int i12 = i11 % 2;
                onExtraCallback((hasProvider) charSequenceOnNavigationEvent, (List<mExternalSyntheticLambda2>) listCreateListBuilder, this, surfaceProcessorNodeOut, intRef, intRef2, intRef3, i10);
            }
        }
        mExternalSyntheticLambda6 mexternalsyntheticlambda62 = new mExternalSyntheticLambda6(surfaceProcessorNodeOut, CollectionsKt.build(listCreateListBuilder), iAuthTabCallbackDefault);
        this.asInterface.put(pairIAuthTabCallback, mexternalsyntheticlambda62);
        return mexternalsyntheticlambda62;
    }

    public final SurfaceProcessorNodeOut onExtraCallbackWithResult(@NotNull hasProvider hasprovider) {
        SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1;
        getHumanReadableName gethumanreadablenameAsBinder;
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4;
        int i;
        boolean z;
        int i2;
        List list;
        long j;
        ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability;
        getSurfaceSize.IAuthTabCallback iAuthTabCallback;
        boolean z2;
        int i3;
        int i4 = 2 % 2;
        int i5 = extraCommand + 31;
        mayLaunchUrl = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(hasprovider, "");
            surfaceProcessorWithExecutorExternalSyntheticLambda1 = this.ICustomTabsCallbackDefault;
            gethumanreadablenameAsBinder = asBinder();
            r8lambdanm9dm2eewl4vrptnjmesfjqky4 = this.ICustomTabsCallback;
            i = 1;
            z = false;
            i2 = 1;
            list = null;
            j = this.getInterfaceDescriptor;
            extensionsManagerExtensionsAvailability = null;
            iAuthTabCallback = null;
            z2 = false;
            i3 = 3988;
        } else {
            Intrinsics.checkNotNullParameter(hasprovider, "");
            surfaceProcessorWithExecutorExternalSyntheticLambda1 = this.ICustomTabsCallbackDefault;
            gethumanreadablenameAsBinder = asBinder();
            r8lambdanm9dm2eewl4vrptnjmesfjqky4 = this.ICustomTabsCallback;
            i = 0;
            z = false;
            i2 = 0;
            list = null;
            j = this.getInterfaceDescriptor;
            extensionsManagerExtensionsAvailability = null;
            iAuthTabCallback = null;
            z2 = false;
            i3 = 1724;
        }
        return SurfaceProcessorWithExecutorExternalSyntheticLambda1.onWarmupCompleted(surfaceProcessorWithExecutorExternalSyntheticLambda1, hasprovider, gethumanreadablenameAsBinder, i, z, i2, list, j, extensionsManagerExtensionsAvailability, r8lambdanm9dm2eewl4vrptnjmesfjqky4, iAuthTabCallback, z2, i3, (Object) null);
    }

    public final void onExtraCallbackWithResult(@NotNull SurfaceProcessorNodeOut surfaceProcessorNodeOut, @NotNull Canvas canvas, @NotNull mExternalSyntheticLambda2 mexternalsyntheticlambda2, @NotNull mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault iAuthTabCallbackDefault, long j) {
        Shader shaderOnWarmupCompleted;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(mexternalsyntheticlambda2, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
        mExternalSyntheticApiModelOutline1.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = this.ICustomTabsCallbackStubProxy;
        if (iAuthTabCallbackStubProxy != null) {
            int i2 = extraCommand + 39;
            mayLaunchUrl = i2 % 128;
            int i3 = i2 % 2;
            shaderOnWarmupCompleted = iAuthTabCallbackStubProxy.onWarmupCompleted(RangesKt.coerceAtLeast((int) (surfaceProcessorNodeOut.asBinder() >> 32), 1.0f), RangesKt.coerceAtLeast((int) surfaceProcessorNodeOut.asBinder(), 1.0f));
        } else {
            int i4 = extraCommand + 31;
            mayLaunchUrl = i4 % 128;
            int i5 = i4 % 2;
            shaderOnWarmupCompleted = null;
        }
        if (shaderOnWarmupCompleted != null) {
            int i6 = extraCommand + 107;
            mayLaunchUrl = i6 % 128;
            if (i6 % 2 == 0) {
                this.onUnminimized.setShader(shaderOnWarmupCompleted);
                int i7 = 6 / 0;
            } else {
                this.onUnminimized.setShader(shaderOnWarmupCompleted);
            }
            int i8 = mayLaunchUrl + 45;
            extraCommand = i8 % 128;
            int i9 = i8 % 2;
        } else {
            r8lambda4tMrngQSvLENU65MlLmHwvGfT8 r8lambda4tmrngqsvlenu65mllmhwvgft8 = this.onUnminimized;
            readFully readfullyOnNavigationEvent = asBinder().onNavigationEvent();
            float fAsBinder = (int) (surfaceProcessorNodeOut.asBinder() >> 32);
            r8lambda4tmrngqsvlenu65mllmhwvgft8.onExtraCallback(readfullyOnNavigationEvent, setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits((int) surfaceProcessorNodeOut.asBinder()) & 4294967295L) | (Float.floatToRawIntBits(fAsBinder) << 32)), asBinder().onExtraCallbackWithResult());
        }
        mexternalsyntheticlambda2.onExtraCallback(surfaceProcessorNodeOut, canvas, access000(), readTypedObject(), this.onUnminimized, this.onActivityLayout, iAuthTabCallbackDefault, j);
    }

    public final void access100() {
        int i = 2 % 2;
        getPackageType getpackagetype = this.IAuthTabCallbackStub;
        if (getpackagetype != null) {
            int i2 = mayLaunchUrl + 97;
            extraCommand = i2 % 128;
            if (i2 % 2 != 0) {
                getFullPackage.IAuthTabCallback(getpackagetype, "save", (Throwable) null, 5, (Object) null);
            } else {
                getFullPackage.IAuthTabCallback(getpackagetype, "save", (Throwable) null, 2, (Object) null);
            }
        }
        int i3 = extraCommand + 51;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onNavigationEvent(@NotNull Context context, @NotNull findResAndMsg findresandmsg) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 81;
        extraCommand = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(findresandmsg, "");
            this.onTransact = findresandmsg;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        this.onTransact = findresandmsg;
        r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28 r8lambdao3fy7vllgo1akyolrhcogjera28 = this.onMessageChannelReady;
        if (r8lambdao3fy7vllgo1akyolrhcogjera28 != null) {
            maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(r8lambdao3fy7vllgo1akyolrhcogjera28, this, context, null), 3, (Object) null);
            return;
        }
        int i3 = extraCommand + 47;
        mayLaunchUrl = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 50 / 0;
        }
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Context $context;
        final /* synthetic */ r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28 $restoreState;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ mExternalSyntheticLambda8 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackDefault(r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28 r8lambdao3fy7vllgo1akyolrhcogjera28, mExternalSyntheticLambda8 mexternalsyntheticlambda8, Context context, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
            this.$restoreState = r8lambdao3fy7vllgo1akyolrhcogjera28;
            this.this$0 = mexternalsyntheticlambda8;
            this.$context = context;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(this.$restoreState, this.this$0, this.$context, access13800Var);
            int i2 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 16 / 0;
            }
            return iAuthTabCallbackDefault;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
        
            if (o.mExternalSyntheticLambda8.onNavigationEvent(r5, r2, r3, r4, r7, r9, r6, (o.access13800) r21) == r13) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x013a, code lost:
        
            if (o.mExternalSyntheticLambda8.onExtraCallback(r5, r6, r3, r4, r7, r9, r11, r14, r15, r16, r10, r21) == r13) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0197, code lost:
        
            if (o.mExternalSyntheticLambda8.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), -1966619362, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), r18, 1966619375, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback()) == r13) goto L40;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                if (i4 != 1) {
                    int i5 = IAuthTabCallback + 51;
                    int i6 = i5 % 128;
                    onExtraCallbackWithResult = i6;
                    int i7 = i5 % 2;
                    if (i4 != 2) {
                        int i8 = i6 + 83;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 != 0 ? i4 != 3 : i4 != 4) {
                            if (i4 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                    }
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28 r8lambdao3fy7vllgo1akyolrhcogjera28 = this.$restoreState;
                mExternalSyntheticLambda8 mexternalsyntheticlambda8 = this.this$0;
                Context context = this.$context;
                if (r8lambdao3fy7vllgo1akyolrhcogjera28.onNavigationEvent() == null) {
                    int i9 = onExtraCallbackWithResult + 35;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    return Unit.INSTANCE;
                }
                if (r8lambdao3fy7vllgo1akyolrhcogjera28 instanceof r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onWarmupCompleted) {
                    r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onWarmupCompleted onwarmupcompleted = (r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onWarmupCompleted) r8lambdao3fy7vllgo1akyolrhcogjera28;
                    this.L$0 = access15400.onNavigationEvent(r8lambdao3fy7vllgo1akyolrhcogjera28);
                    this.I$0 = 0;
                    this.label = 1;
                    if (mExternalSyntheticLambda8.IAuthTabCallback(mexternalsyntheticlambda8, onwarmupcompleted, (access13800) this) == objOnWarmupCompleted) {
                        int i11 = IAuthTabCallback + 123;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        return objOnWarmupCompleted;
                    }
                } else if (r8lambdao3fy7vllgo1akyolrhcogjera28 instanceof r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onNavigationEvent) {
                    r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onNavigationEvent onnavigationevent = (r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onNavigationEvent) r8lambdao3fy7vllgo1akyolrhcogjera28;
                    hasProvider hasproviderIAuthTabCallbackStub = onnavigationevent.IAuthTabCallbackStub();
                    mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStubIAuthTabCallback = onnavigationevent.IAuthTabCallback();
                    mExternalSyntheticApiModelOutline1.onTransact ontransactOnExtraCallback = onnavigationevent.onExtraCallback();
                    int iOnWarmupCompleted = onnavigationevent.onWarmupCompleted();
                    boolean zOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult();
                    this.L$0 = access15400.onNavigationEvent(r8lambdao3fy7vllgo1akyolrhcogjera28);
                    this.I$0 = 0;
                    this.label = 2;
                } else if (r8lambdao3fy7vllgo1akyolrhcogjera28 instanceof r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult) {
                    r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult = (r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult) r8lambdao3fy7vllgo1akyolrhcogjera28;
                    int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
                    List list = (List) r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult.onExtraCallback(-582533298, JsParamKeys.onExtraCallbackWithResult(), 582533298, new Object[]{onextracallbackwithresult}, iOnExtraCallbackWithResult2, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
                    mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult();
                    mExternalSyntheticApiModelOutline1.onTransact onTransact = onextracallbackwithresult.onTransact();
                    int iIAuthTabCallbackDefault = onextracallbackwithresult.IAuthTabCallbackDefault();
                    int iOnExtraCallback = onextracallbackwithresult.onExtraCallback();
                    int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult4 = JsParamKeys.onExtraCallbackWithResult();
                    int iIntValue = ((Integer) r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult.onExtraCallback(1987232077, JsParamKeys.onExtraCallbackWithResult(), -1987232076, new Object[]{onextracallbackwithresult}, iOnExtraCallbackWithResult4, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3)).intValue();
                    boolean zAsInterface = onextracallbackwithresult.asInterface();
                    boolean zIAuthTabCallbackStub = onextracallbackwithresult.IAuthTabCallbackStub();
                    this.L$0 = access15400.onNavigationEvent(r8lambdao3fy7vllgo1akyolrhcogjera28);
                    this.I$0 = 0;
                    this.label = 3;
                } else {
                    if (!(r8lambdao3fy7vllgo1akyolrhcogjera28 instanceof r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.IAuthTabCallback)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.IAuthTabCallback iAuthTabCallback = (r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.IAuthTabCallback) r8lambdao3fy7vllgo1akyolrhcogjera28;
                    hasProvider hasproviderAsBinder = iAuthTabCallback.asBinder();
                    mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallbackOnExtraCallback = iAuthTabCallback.onExtraCallback();
                    mExternalSyntheticApiModelOutline1.onTransact ontransactOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
                    int iOnWarmupCompleted2 = iAuthTabCallback.onWarmupCompleted();
                    boolean zIAuthTabCallbackStub2 = iAuthTabCallback.IAuthTabCallbackStub();
                    Long lIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                    this.L$0 = access15400.onNavigationEvent(r8lambdao3fy7vllgo1akyolrhcogjera28);
                    this.I$0 = 0;
                    this.label = 4;
                    Object[] objArr = {mexternalsyntheticlambda8, hasproviderAsBinder, iAuthTabCallbackOnExtraCallback, ontransactOnExtraCallbackWithResult, Integer.valueOf(iOnWarmupCompleted2), Boolean.valueOf(zIAuthTabCallbackStub2), lIAuthTabCallback, iAuthTabCallback, this};
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        int i = ICustomTabsCallback_Parcel + 97;
        isEngagementSignalsApiAvailable = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    private final Pair<hasProvider, mExternalSyntheticApiModelOutline1.asInterface> IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = extraCommand + 19;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Pair<hasProvider, mExternalSyntheticApiModelOutline1.asInterface> pair = (Pair) this.access100.onExtraCallbackWithResult();
        int i4 = mayLaunchUrl + 125;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return pair;
    }

    private final void onNavigationEvent(Pair<hasProvider, ? extends mExternalSyntheticApiModelOutline1.asInterface> pair) {
        int i = 2 % 2;
        int i2 = extraCommand + 83;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        this.access100.IAuthTabCallback(pair);
        int i4 = extraCommand + 61;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
    }

    public final hasProvider asInterface() {
        int i = 2 % 2;
        int i2 = extraCommand + 49;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 != 0) {
            return (hasProvider) this.access000.onExtraCallbackWithResult();
        }
        throw null;
    }

    private final Pair<hasProvider, mExternalSyntheticApiModelOutline1.asInterface> extraCallback() {
        int i = 2 % 2;
        int i2 = extraCommand + 41;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Pair<hasProvider, mExternalSyntheticApiModelOutline1.asInterface> pair = (Pair) this.onRelationshipValidationResult.onExtraCallbackWithResult();
        int i4 = extraCommand + 73;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return pair;
        }
        throw null;
    }

    private final void IAuthTabCallback(Pair<hasProvider, ? extends mExternalSyntheticApiModelOutline1.asInterface> pair) {
        int i = 2 % 2;
        int i2 = extraCommand + 125;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        this.onRelationshipValidationResult.IAuthTabCallback(pair);
        int i4 = mayLaunchUrl + 29;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
    }

    public final hasProvider onTransact() {
        int i = 2 % 2;
        int i2 = extraCommand + 115;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        hasProvider hasprovider = (hasProvider) this.ICustomTabsCallbackStub.onExtraCallbackWithResult();
        int i4 = mayLaunchUrl + 25;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return hasprovider;
        }
        throw null;
    }

    public final mExternalSyntheticApiModelOutline1.asInterface IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCommand + 125;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 != 0) {
            mExternalSyntheticApiModelOutline1.asInterface asinterface = (mExternalSyntheticApiModelOutline1.asInterface) this.onActivityResized.onExtraCallbackWithResult();
            int i3 = mayLaunchUrl + 53;
            extraCommand = i3 % 128;
            int i4 = i3 % 2;
            return asinterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        mExternalSyntheticLambda8 mexternalsyntheticlambda8 = (mExternalSyntheticLambda8) objArr[0];
        int i = 2 % 2;
        int i2 = extraCommand + 31;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        mExternalSyntheticApiModelOutline0 mexternalsyntheticapimodeloutline0 = (mExternalSyntheticApiModelOutline0) mexternalsyntheticlambda8.IAuthTabCallbackStubProxy.onExtraCallbackWithResult();
        int i4 = extraCommand + 49;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return mexternalsyntheticapimodeloutline0;
    }

    public final mExternalSyntheticLambda9 IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 103;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            mExternalSyntheticLambda9 mexternalsyntheticlambda9 = (mExternalSyntheticLambda9) this.onWarmupCompleted.onExtraCallbackWithResult();
            int i3 = mayLaunchUrl + 81;
            extraCommand = i3 % 128;
            int i4 = i3 % 2;
            return mexternalsyntheticlambda9;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        mExternalSyntheticLambda8 mexternalsyntheticlambda8 = (mExternalSyntheticLambda8) objArr[0];
        mExternalSyntheticLambda9 mexternalsyntheticlambda9 = (mExternalSyntheticLambda9) objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 115;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            mexternalsyntheticlambda8.onWarmupCompleted.IAuthTabCallback(mexternalsyntheticlambda9);
            int i3 = 82 / 0;
        } else {
            mexternalsyntheticlambda8.onWarmupCompleted.IAuthTabCallback(mexternalsyntheticlambda9);
        }
        int i4 = extraCommand + 93;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // o.r8lambda49PUoj84d073zThfYmsWH2BreR8
    public long onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCommand + 15;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
            return ((ExtensionsManager1) this.asBinder.onExtraCallbackWithResult()).onExtraCallbackWithResult();
        }
        return ((ExtensionsManager1) this.asBinder.onExtraCallbackWithResult()).onExtraCallbackWithResult();
    }

    public void onNavigationEvent(long j) {
        int i = 2 % 2;
        int i2 = extraCommand + 75;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder.IAuthTabCallback(ExtensionsManager1.onNavigationEvent(j));
        int i4 = extraCommand + 23;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ mExternalSyntheticApiModelOutline1.asInterface onExtraCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return (mExternalSyntheticApiModelOutline1.asInterface) onExtraCallbackWithResult(iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), 1802286102, iIAuthTabCallback2, new Object[]{mexternalsyntheticlambda8}, -1802286102, OverseasRrnInputTextField.IAuthTabCallback());
    }

    public static /* synthetic */ Matrix onWarmupCompleted() {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return (Matrix) onExtraCallbackWithResult(iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), -1535261262, iIAuthTabCallback2, new Object[0], 1535261276, OverseasRrnInputTextField.IAuthTabCallback());
    }

    public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted(AppLovinSdkSettings appLovinSdkSettings, mExternalSyntheticLambda2 mexternalsyntheticlambda2) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return (AppLovinSdkSettings) onExtraCallbackWithResult(iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), -433398364, iIAuthTabCallback2, new Object[]{appLovinSdkSettings, mexternalsyntheticlambda2}, 433398372, OverseasRrnInputTextField.IAuthTabCallback());
    }

    public static final /* synthetic */ Object onWarmupCompleted(mExternalSyntheticLambda8 mexternalsyntheticlambda8, hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, Long l, r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.IAuthTabCallback iAuthTabCallback2, access13800 access13800Var) {
        Object[] objArr = {mexternalsyntheticlambda8, hasprovider, iAuthTabCallback, ontransact, Integer.valueOf(i), Boolean.valueOf(z), l, iAuthTabCallback2, access13800Var};
        return onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1966619362, OverseasRrnInputTextField.IAuthTabCallback(), objArr, 1966619375, OverseasRrnInputTextField.IAuthTabCallback());
    }

    public static final /* synthetic */ getPackageType IAuthTabCallbackDefault(mExternalSyntheticLambda8 mexternalsyntheticlambda8) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return (getPackageType) onExtraCallbackWithResult(iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), 551132828, iIAuthTabCallback2, new Object[]{mexternalsyntheticlambda8}, -551132816, OverseasRrnInputTextField.IAuthTabCallback());
    }

    public static final /* synthetic */ Pair onExtraCallbackWithResult() {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return (Pair) onExtraCallbackWithResult(iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), 774461970, iIAuthTabCallback2, new Object[0], -774461968, OverseasRrnInputTextField.IAuthTabCallback());
    }

    private final Object onNavigationEvent(Context context, List<hasProvider> list, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, int i2, int i3, boolean z, boolean z2, r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28.onExtraCallbackWithResult onextracallbackwithresult, access13800<? super Unit> access13800Var) {
        Object[] objArr = {this, context, list, iAuthTabCallback, ontransact, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z), Boolean.valueOf(z2), onextracallbackwithresult, access13800Var};
        return onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -38250864, OverseasRrnInputTextField.IAuthTabCallback(), objArr, 38250870, OverseasRrnInputTextField.IAuthTabCallback());
    }

    private static final AppLovinSdkSettings onExtraCallback(AppLovinSdkSettings appLovinSdkSettings, mExternalSyntheticLambda2 mexternalsyntheticlambda2) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return (AppLovinSdkSettings) onExtraCallbackWithResult(iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), -1647401512, iIAuthTabCallback2, new Object[]{appLovinSdkSettings, mexternalsyntheticlambda2}, 1647401532, OverseasRrnInputTextField.IAuthTabCallback());
    }

    private final runOnUiThreadDelayed onWarmupCompleted(mExternalSyntheticLambda9 mexternalsyntheticlambda9, mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return (runOnUiThreadDelayed) onExtraCallbackWithResult(iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), 1485048389, iIAuthTabCallback2, new Object[]{this, mexternalsyntheticlambda9, iAuthTabCallbackStub}, -1485048388, OverseasRrnInputTextField.IAuthTabCallback());
    }

    private static final mExternalSyntheticApiModelOutline1.asInterface access000(mExternalSyntheticLambda8 mexternalsyntheticlambda8) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return (mExternalSyntheticApiModelOutline1.asInterface) onExtraCallbackWithResult(iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), 1892838788, iIAuthTabCallback2, new Object[]{mexternalsyntheticlambda8}, -1892838773, OverseasRrnInputTextField.IAuthTabCallback());
    }

    private final int onNavigationEvent(AppLovinSdkSettings appLovinSdkSettings, mExternalSyntheticLambda2 mexternalsyntheticlambda2) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return ((Integer) onExtraCallbackWithResult(iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), -208752203, iIAuthTabCallback2, new Object[]{this, appLovinSdkSettings, mexternalsyntheticlambda2}, 208752206, OverseasRrnInputTextField.IAuthTabCallback())).intValue();
    }

    private final Object onExtraCallback(runOnUiThreadDelayed runonuithreaddelayed, long j, boolean z, Long l, Integer num, Function0<Unit> function0, access13800<? super Unit> access13800Var) {
        Object[] objArr = {this, runonuithreaddelayed, Long.valueOf(j), Boolean.valueOf(z), l, num, function0, access13800Var};
        return onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -845326298, OverseasRrnInputTextField.IAuthTabCallback(), objArr, 845326308, OverseasRrnInputTextField.IAuthTabCallback());
    }

    static /* synthetic */ Object onNavigationEvent(mExternalSyntheticLambda8 mexternalsyntheticlambda8, runOnUiThreadDelayed runonuithreaddelayed, long j, boolean z, Long l, Integer num, Function0 function0, access13800 access13800Var, int i, Object obj) {
        Object[] objArr = {mexternalsyntheticlambda8, runonuithreaddelayed, Long.valueOf(j), Boolean.valueOf(z), l, num, function0, access13800Var, Integer.valueOf(i), obj};
        return onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -729951703, OverseasRrnInputTextField.IAuthTabCallback(), objArr, 729951710, OverseasRrnInputTextField.IAuthTabCallback());
    }

    private final Object onExtraCallbackWithResult(Function1<? super access13800<? super Unit>, ? extends Object> function1, access13800<? super Unit> access13800Var) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return onExtraCallbackWithResult(iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), 791162391, iIAuthTabCallback2, new Object[]{this, function1, access13800Var}, -791162386, OverseasRrnInputTextField.IAuthTabCallback());
    }

    private final void onWarmupCompleted(mExternalSyntheticLambda9 mexternalsyntheticlambda9) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        onExtraCallbackWithResult(iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), 1475453939, iIAuthTabCallback2, new Object[]{this, mexternalsyntheticlambda9}, -1475453922, OverseasRrnInputTextField.IAuthTabCallback());
    }

    public final Object IAuthTabCallback(@NotNull access13800<? super Unit> access13800Var) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return onExtraCallbackWithResult(iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), 525570848, iIAuthTabCallback2, new Object[]{this, access13800Var}, -525570844, OverseasRrnInputTextField.IAuthTabCallback());
    }

    public final void IAuthTabCallback(@NotNull Context context, @NotNull List<hasProvider> list, @NotNull mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, @NotNull mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, int i2, int i3, boolean z, boolean z2) {
        Object[] objArr = {this, context, list, iAuthTabCallback, ontransact, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z), Boolean.valueOf(z2)};
        onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -2051626723, OverseasRrnInputTextField.IAuthTabCallback(), objArr, 2051626742, OverseasRrnInputTextField.IAuthTabCallback());
    }

    public final void onNavigationEvent(@NotNull Context context, @NotNull List<String> list, @NotNull mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, @NotNull mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, int i2, int i3, boolean z, boolean z2) {
        Object[] objArr = {this, context, list, iAuthTabCallback, ontransact, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z), Boolean.valueOf(z2)};
        onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1152298151, OverseasRrnInputTextField.IAuthTabCallback(), objArr, 1152298167, OverseasRrnInputTextField.IAuthTabCallback());
    }

    public final Object onExtraCallbackWithResult(@NotNull Context context, @NotNull List<hasProvider> list, @NotNull mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, @NotNull mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, int i2, int i3, boolean z, boolean z2, @NotNull access13800<? super Unit> access13800Var) {
        Object[] objArr = {this, context, list, iAuthTabCallback, ontransact, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z), Boolean.valueOf(z2), access13800Var};
        return onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1393860695, OverseasRrnInputTextField.IAuthTabCallback(), objArr, 1393860713, OverseasRrnInputTextField.IAuthTabCallback());
    }

    public final void onWarmupCompleted(@NotNull hasProvider hasprovider, @NotNull mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, @NotNull mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, @Nullable Long l) {
        Object[] objArr = {this, hasprovider, iAuthTabCallback, ontransact, Integer.valueOf(i), Boolean.valueOf(z), l};
        onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 673656132, OverseasRrnInputTextField.IAuthTabCallback(), objArr, -673656121, OverseasRrnInputTextField.IAuthTabCallback());
    }

    public final mExternalSyntheticApiModelOutline0 onNavigationEvent() {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return (mExternalSyntheticApiModelOutline0) onExtraCallbackWithResult(iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), -204277934, iIAuthTabCallback2, new Object[]{this}, 204277943, OverseasRrnInputTextField.IAuthTabCallback());
    }
}
