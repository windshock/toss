package viva.republica.toss.account.register.openbanking;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.zzgsa;
import im.toss.base.BaseActivity;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.uikit.base.UIKitBaseActivity;
import im.toss.utils.RxUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
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
import o.AppLovinAdImpl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.CxxInspectorPackagerConnectionIWebSocket;
import o.EncryptedContentInfoParser;
import o.MapConverter;
import o.NetConverter3;
import o.SessionTrackera;
import o.SetDetectableSize;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import o.ToolkitManager_Update;
import o.TypeUtils2;
import o.UTF8Decoder;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.checkNavigationBarBySystemProperties;
import o.clearTid;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeIntNullableCollection;
import o.deserializeIp;
import o.deserializeUri;
import o.deserializeUriNullableCollection;
import o.findResAndMsg;
import o.getDummyAd;
import o.getEnableJsT2;
import o.getMediaViewVideoRendererApi;
import o.getObjectAt;
import o.getParamImp;
import o.initMiniApp;
import o.maybeUpdateAnimatable;
import o.onJsBridgeReady;
import o.onSeekEngaged;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.setDescriptionTextColor;
import o.setRandomHost;
import o.setSignedData;
import o.shortValue;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.network.model.transfer.ResolveTermIdsRequest;
import viva.republica.toss.network.model.transfer.ResolveTermIdsResponse;
import viva.republica.toss.network.model.verify.SessionKnownType;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class OpenBankingInquiryAgreementActivity extends Hilt_OpenBankingInquiryAgreementActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static long IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 1;
    private static int access100 = 0;
    public static final int asBinder;
    private static int extraCallbackWithResult = 0;
    private static int readTypedObject = 1;
    private Long IAuthTabCallbackStub;
    private boolean access000;
    private getObjectAt getInterfaceDescriptor;

    @Inject
    public getEnableJsT2 kycHelper;

    @Inject
    public getDummyAd standardTermsV2Intent;
    private checkNavigationBarBySystemProperties IAuthTabCallbackDefault = checkNavigationBarBySystemProperties.Companion.IAuthTabCallback();
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda0
        public final Object invoke() {
            return OpenBankingInquiryAgreementActivity.onNavigationEvent(this.f$0);
        }
    });
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda1
        public final Object invoke() {
            Object[] objArr = {this.f$0};
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (String) OpenBankingInquiryAgreementActivity.onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), -1038344548, 1038344554, iOnWarmupCompleted, objArr, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
        }
    });
    private final SessionTrackera IAuthTabCallbackStubProxy = AppLovinAdImpl.IAuthTabCallback(this, new Function1() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda2
        public final Object invoke(Object obj) {
            return OpenBankingInquiryAgreementActivity.IAuthTabCallback(this.f$0, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
        }
    });

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OpenBankingInquiryAgreementActivity.onWarmupCompleted(OpenBankingInquiryAgreementActivity.this, (access13800) this);
        }
    }

    static final class onTransact extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OpenBankingInquiryAgreementActivity.onExtraCallback(OpenBankingInquiryAgreementActivity.this, (access13800) this);
        }
    }

    static {
        setEngagementSignalsCallback();
        Companion = new IAuthTabCallback(null);
        asBinder = 8;
        int i = extraCallbackWithResult + 125;
        ICustomTabsCallback = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity = (OpenBankingInquiryAgreementActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 87;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(openBankingInquiryAgreementActivity, setDetectableSize);
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        int i5 = access100 + 23;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = readTypedObject + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(openBankingInquiryAgreementActivity, deserializeurinullablecollection);
        int i4 = readTypedObject + 21;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 75;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(openBankingInquiryAgreementActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(openBankingInquiryAgreementActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        int i3 = readTypedObject + 99;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void IAuthTabCallback(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 117;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), -1885060127, 1885060138, iOnWarmupCompleted, new Object[]{openBankingInquiryAgreementActivity}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), -1885060127, 1885060138, iOnWarmupCompleted2, new Object[]{openBankingInquiryAgreementActivity}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
        int i3 = readTypedObject + 79;
        access100 = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity = (OpenBankingInquiryAgreementActivity) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 43;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        String str = (String) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), 302968713, -302968710, iOnWarmupCompleted, new Object[]{openBankingInquiryAgreementActivity}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
        int i4 = readTypedObject + 101;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 105;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallback(function1, obj);
        int i4 = access100 + 9;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 57;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        readTypedObject(function1, obj);
        int i4 = readTypedObject + 69;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity = (OpenBankingInquiryAgreementActivity) objArr[0];
        TypeUtils2 typeUtils2 = (TypeUtils2) objArr[1];
        setDescriptionTextColor setdescriptiontextcolor = (setDescriptionTextColor) objArr[2];
        int i = 2 % 2;
        int i2 = readTypedObject + 37;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(openBankingInquiryAgreementActivity, typeUtils2, setdescriptiontextcolor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        deserializeIp deserializeipOnNavigationEvent = onNavigationEvent(openBankingInquiryAgreementActivity, typeUtils2, setdescriptiontextcolor);
        int i3 = access100 + 109;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 95 / 0;
        }
        return deserializeipOnNavigationEvent;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 69;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        access100(function1, obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        getInterfaceDescriptor(function1, obj);
        int i4 = readTypedObject + 49;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity) {
        int i = 2 % 2;
        int i2 = access100 + 101;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(openBankingInquiryAgreementActivity);
        int i4 = access100 + 105;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return interfaceDescriptor;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = readTypedObject + 43;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(openBankingInquiryAgreementActivity, th);
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        int i5 = access100 + 109;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 83;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(openBankingInquiryAgreementActivity, setDetectableSize);
        int i4 = readTypedObject + 23;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, TypeUtils2 typeUtils2) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 99;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(openBankingInquiryAgreementActivity, typeUtils2);
        int i4 = readTypedObject + 75;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = ~(i7 | i8 | i4);
        int i10 = ~((~i4) | i8 | i3);
        int i11 = i9 | i10;
        int i12 = ~(i8 | i3);
        int i13 = (~(i4 | i7)) | (~(i7 | i2)) | i10;
        int i14 = i3 + i2 + i + (1787548100 * i6) + (1101416392 * i5);
        int i15 = i14 * i14;
        int i16 = (((-61410478) * i3) - 623378432) + (561581232 * i2) + (i11 * (-311495855)) + ((-311495855) * i12) + (311495855 * i13) + (250085376 * i) + ((-778043392) * i6) + ((-46137344) * i5) + (324403200 * i15);
        int i17 = (i3 * (-930662234)) + 656878810 + (i2 * (-930660720)) + (i11 * (-757)) + (i12 * (-757)) + (i13 * 757) + (i * (-930661477)) + (i6 * 2052861356) + (i5 * 749768216) + (i15 * (-2028863488));
        switch (i16 + (i17 * i17 * (-1850081280))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onNavigationEvent(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                Function1 function1 = (Function1) objArr[0];
                Object obj = objArr[1];
                int i18 = 2 % 2;
                int i19 = readTypedObject + 69;
                access100 = i19 % 128;
                int i20 = i19 % 2;
                onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), 1858285897, -1858285890, zzgsa.onWarmupCompleted(), new Object[]{function1, obj}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
                int i21 = readTypedObject + 9;
                access100 = i21 % 128;
                int i22 = i21 % 2;
                return null;
            case 9:
                return asBinder(objArr);
            case 10:
                final UIKitBaseActivity uIKitBaseActivity = (OpenBankingInquiryAgreementActivity) objArr[0];
                final TypeUtils2 typeUtils2 = (TypeUtils2) objArr[1];
                int i23 = 2 % 2;
                int i24 = access100 + 81;
                readTypedObject = i24 % 128;
                int i25 = i24 % 2;
                if (uIKitBaseActivity.ICustomTabsServiceDefault().length() != 0) {
                    int i26 = readTypedObject + 41;
                    access100 = i26 % 128;
                    int i27 = i26 % 2;
                    if (uIKitBaseActivity.ICustomTabsServiceStub().length() != 0) {
                        writeRaw<setDescriptionTextColor> writerawUpdateVisuals = uIKitBaseActivity.updateVisuals();
                        final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda7
                            public final Object invoke(Object obj2) {
                                Object[] objArr2 = {this.f$0, typeUtils2, (setDescriptionTextColor) obj2};
                                int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                                return (deserializeIp) OpenBankingInquiryAgreementActivity.onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), 83996576, -83996564, iOnWarmupCompleted, objArr2, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
                            }
                        };
                        writeRaw writerawOnExtraCallbackWithResult = writerawUpdateVisuals.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda8
                            public final Object apply(Object obj2) {
                                Object[] objArr2 = {function12, obj2};
                                int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                                return (deserializeIp) OpenBankingInquiryAgreementActivity.onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), -768602653, 768602657, iOnWarmupCompleted, objArr2, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
                        writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
                        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                        final Function1 function13 = new Function1() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda9
                            public final Object invoke(Object obj2) {
                                return OpenBankingInquiryAgreementActivity.IAuthTabCallback(this.f$0, (deserializeUriNullableCollection) obj2);
                            }
                        };
                        writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda10
                            public final void accept(Object obj2) {
                                OpenBankingInquiryAgreementActivity.IAuthTabCallbackStub(function13, obj2);
                            }
                        }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda11
                            public final void run() throws Throwable {
                                OpenBankingInquiryAgreementActivity.IAuthTabCallback(this.f$0);
                            }
                        });
                        final Function1 function14 = new Function1() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda12
                            public final Object invoke(Object obj2) {
                                return OpenBankingInquiryAgreementActivity.onNavigationEvent(this.f$0, (TabBarInfoQueryPointOnTabBarInfoQueryListener) obj2);
                            }
                        };
                        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda13
                            public final void accept(Object obj2) {
                                OpenBankingInquiryAgreementActivity.IAuthTabCallbackDefault(function14, obj2);
                            }
                        };
                        final Function1 function15 = new Function1() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda14
                            public final Object invoke(Object obj2) {
                                return OpenBankingInquiryAgreementActivity.onNavigationEvent(this.f$0, (Throwable) obj2);
                            }
                        };
                        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawOnWarmupCompleted.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda15
                            public final void accept(Object obj2) {
                                OpenBankingInquiryAgreementActivity.onTransact(function15, obj2);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
                        uIKitBaseActivity.onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
                        return null;
                    }
                }
                onJsBridgeReady.IAuthTabCallback(uIKitBaseActivity, R.string.openbanking_account_invalidate_message, 0, 2, (Object) null);
                uIKitBaseActivity.finish();
                return null;
            case 11:
                return IAuthTabCallbackStub(objArr);
            case 12:
                return access100(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = readTypedObject + 41;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(th);
        int i4 = readTypedObject + 99;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity = (OpenBankingInquiryAgreementActivity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 5;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(openBankingInquiryAgreementActivity, dialogInterface);
        int i4 = readTypedObject + 89;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ String onNavigationEvent(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 91;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            asBinder(openBankingInquiryAgreementActivity);
            obj.hashCode();
            throw null;
        }
        String strAsBinder = asBinder(openBankingInquiryAgreementActivity);
        int i3 = readTypedObject + 9;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return strAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = readTypedObject + 125;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(openBankingInquiryAgreementActivity, dialogInterface);
        int i4 = readTypedObject + 9;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 121;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(openBankingInquiryAgreementActivity, th);
        int i4 = readTypedObject + 59;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) {
        int i = 2 % 2;
        int i2 = readTypedObject + 25;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), 1702724246, -1702724246, iOnWarmupCompleted, new Object[]{openBankingInquiryAgreementActivity, tabBarInfoQueryPointOnTabBarInfoQueryListener}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
        int i4 = readTypedObject + 7;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity = (OpenBankingInquiryAgreementActivity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 1;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(openBankingInquiryAgreementActivity, dialogInterface);
        int i4 = access100 + 23;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 95;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject(function1, obj);
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 7;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStubProxy(function1, obj);
        }
        IAuthTabCallbackStubProxy(function1, obj);
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 33;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(openBankingInquiryAgreementActivity);
        int i4 = access100 + 95;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = readTypedObject + 81;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 63;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return -1L;
    }

    public static final class onNavigationEvent<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public onNavigationEvent(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        public final deserializeIp<setDescriptionTextColor> apply(writeRaw<BaseApiResponse<setDescriptionTextColor>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            final AnonymousClass3 anonymousClass3 = new Function1<BaseApiResponse<setDescriptionTextColor>, deserializeIp<? extends setDescriptionTextColor>>() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity.onNavigationEvent.3
                /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends setDescriptionTextColor> invoke(BaseApiResponse<setDescriptionTextColor> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = setDescriptionTextColor.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            };
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass3) { // from class: o.UtilsKtExternalSyntheticLambda17$onRequestPermissionsResult
                private final /* synthetic */ Function1 onExtraCallbackWithResult;

                {
                    Intrinsics.checkNotNullParameter(anonymousClass3, "");
                    this.onExtraCallbackWithResult = anonymousClass3;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return this.onExtraCallbackWithResult.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onWarmupCompleted;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback_Parcel ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 43;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback_Parcel)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45813 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 83, 21233 - View.resolveSizeAndState(0, 0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14185), 19 - (ViewConfiguration.getLongPressTimeout() >> 16), 8808 - View.resolveSize(0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 39;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    public static final /* synthetic */ String asInterface(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity) {
        int i = 2 % 2;
        int i2 = access100 + 37;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsServiceDefault = openBankingInquiryAgreementActivity.ICustomTabsServiceDefault();
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        int i5 = readTypedObject + 103;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return strICustomTabsServiceDefault;
    }

    public static final /* synthetic */ Object onExtraCallback(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 49;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = openBankingInquiryAgreementActivity.IAuthTabCallback((access13800<? super Unit>) access13800Var);
        int i4 = readTypedObject + 31;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return objIAuthTabCallback;
        }
        throw null;
    }

    public static final /* synthetic */ Object onWarmupCompleted(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, access13800 access13800Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = access100 + 37;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = openBankingInquiryAgreementActivity.onExtraCallback((access13800<? super Boolean>) access13800Var);
        int i4 = access100 + 29;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return objOnExtraCallback;
    }

    public static final /* synthetic */ void onWarmupCompleted(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, getObjectAt getobjectat) {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 69;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        openBankingInquiryAgreementActivity.getInterfaceDescriptor = getobjectat;
        int i5 = i2 + 93;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
    }

    private final String ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = access100 + 29;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.asInterface.getValue();
        int i4 = readTypedObject + 79;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String asBinder(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 117;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = openBankingInquiryAgreementActivity.getIntent();
        if (i3 != 0) {
            intent.getStringExtra("bankCode");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String stringExtra = intent.getStringExtra("bankCode");
        if (stringExtra != null) {
            return stringExtra;
        }
        int i4 = readTypedObject + 115;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return "";
    }

    private final String ICustomTabsServiceStub() {
        String str;
        int i = 2 % 2;
        int i2 = access100 + 9;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            str = (String) this.onTransact.getValue();
            int i3 = 27 / 0;
        } else {
            str = (String) this.onTransact.getValue();
        }
        int i4 = access100 + 113;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallbackWithResult(java.lang.Object[] r4) {
        /*
            r0 = 0
            r4 = r4[r0]
            viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity r4 = (viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity) r4
            r1 = 2
            int r2 = r1 % r1
            int r2 = viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity.access100
            int r2 = r2 + 65
            int r3 = r2 % 128
            viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity.readTypedObject = r3
            int r2 = r2 % r1
            java.lang.String r3 = "accountNo"
            android.content.Intent r4 = r4.getIntent()
            java.lang.String r4 = r4.getStringExtra(r3)
            if (r2 != 0) goto L23
            r2 = 99
            int r2 = r2 / r0
            if (r4 != 0) goto L30
            goto L25
        L23:
            if (r4 != 0) goto L30
        L25:
            int r4 = viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity.readTypedObject
            int r4 = r4 + 7
            int r0 = r4 % 128
            viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity.access100 = r0
            int r4 = r4 % r1
            java.lang.String r4 = ""
        L30:
            int r0 = viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity.readTypedObject
            int r0 = r0 + 57
            int r2 = r0 % 128
            viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity.access100 = r2
            int r0 = r0 % r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity.onExtraCallbackWithResult(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String access200() throws Throwable {
        Intent intent;
        Object obj;
        int i = 2 % 2;
        int i2 = readTypedObject + 85;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            intent = getIntent();
            Object[] objArr = new Object[1];
            a(new char[]{20844, 20766, 42335, 1116, 7257, 24307, 54069, 14178, 54406, 8912, 54360, 24282}, (TypedValue.complexToFloat(1) > 2.0f ? 1 : (TypedValue.complexToFloat(1) == 2.0f ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            intent = getIntent();
            Object[] objArr2 = new Object[1];
            a(new char[]{20844, 20766, 42335, 1116, 7257, 24307, 54069, 14178, 54406, 8912, 54360, 24282}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
            obj = objArr2[0];
        }
        String stringExtra = intent.getStringExtra(((String) obj).intern());
        int i3 = readTypedObject + 45;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return stringExtra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String writeTypedList() {
        int i = 2 % 2;
        int i2 = access100 + 35;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = getIntent().getStringExtra("serviceReferrer");
        int i4 = access100 + 15;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return stringExtra;
    }

    public final getEnableJsT2 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 63;
        int i3 = i2 % 128;
        readTypedObject = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        getEnableJsT2 getenablejst2 = this.kycHelper;
        if (getenablejst2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 31;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return getenablejst2;
        }
        obj.hashCode();
        throw null;
    }

    public final getDummyAd IAuthTabCallback() {
        int i = 2 % 2;
        getDummyAd getdummyad = this.standardTermsV2Intent;
        if (getdummyad != null) {
            int i2 = access100 + 7;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            return getdummyad;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = access100 + 13;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit onExtraCallbackWithResult(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 59;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", "click");
        setDetectableSize.onExtraCallback("screen_name", openBankingInquiryAgreementActivity.getScreenName());
        setDetectableSize.onExtraCallback(openBankingInquiryAgreementActivity.validateRelationship());
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 47;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(final OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) throws Throwable {
        int i;
        int i2 = 2 % 2;
        int i3 = readTypedObject + 37;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), -870852771, 870852780, iOnWarmupCompleted, new Object[]{openBankingInquiryAgreementActivity}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
            ConvertByteArrayToFloatArray.onWarmupCompleted("click_button_confirm", false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda3
                public final Object invoke(Object obj) {
                    return OpenBankingInquiryAgreementActivity.onExtraCallback(this.f$0, (SetDetectableSize) obj);
                }
            }, 30, (Object) null);
            i = readTypedObject + 13;
            access100 = i % 128;
        } else {
            openBankingInquiryAgreementActivity.finish();
            i = access100 + 51;
            readTypedObject = i % 128;
        }
        int i5 = i % 2;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05cf  */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.app.Activity, android.content.Context, im.toss.base.BaseActivity, o.TextFieldScrollKtExternalSyntheticLambda0, viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v43, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v49, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r7v51, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v52, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v58, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // viva.republica.toss.account.register.openbanking.Hilt_OpenBankingInquiryAgreementActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 1569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity.onCreate(android.os.Bundle):void");
    }

    public static final class IAuthTabCallback {
        private static final byte[] $$a = {115, 30, 119, 102};
        private static final int $$b = 163;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onExtraCallback = 478308872;

        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0031). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r6, short r7, byte r8) {
            /*
                int r6 = r6 * 3
                int r6 = 3 - r6
                int r7 = r7 * 4
                int r0 = 1 - r7
                int r8 = r8 * 2
                int r8 = 105 - r8
                byte[] r1 = viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity.IAuthTabCallback.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                r3 = -1
                if (r1 != 0) goto L19
                r4 = r3
                r3 = r6
                goto L31
            L19:
                r5 = r8
                r8 = r6
                r6 = r5
            L1c:
                int r3 = r3 + 1
                int r8 = r8 + 1
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L2b
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L2b:
                r4 = r1[r8]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L31:
                int r6 = r6 + r8
                r8 = r3
                r3 = r4
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity.IAuthTabCallback.$$c(int, short, byte):java.lang.String");
        }

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x016e  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x016f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r22, int r23, char[] r24, boolean r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 389
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity.IAuthTabCallback.a(int, int, char[], boolean, int, java.lang.Object[]):void");
        }

        private IAuthTabCallback() {
        }

        public final Intent onExtraCallback(@NotNull Context context, @NotNull String str, @NotNull String str2, @Nullable Long l, @Nullable String str3, @Nullable String str4) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) OpenBankingInquiryAgreementActivity.class).putExtra("bankCode", str).putExtra("accountNo", str2).putExtra("EXTRA_KEY_COIN_VERIFICATION_SESSION_ID", l);
            Object[] objArr = new Object[1];
            a(8 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 2, new char[]{65530, 7, 7, 65530, 7, 7, 65530, 65531}, true, (KeyEvent.getMaxKeyCode() >> 16) + 140, objArr);
            Intent intentPutExtra2 = intentPutExtra.putExtra(((String) objArr[0]).intern(), str3).putExtra("serviceReferrer", str4);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra2, "");
            int i2 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return intentPutExtra2;
        }
    }

    private static final Unit onWarmupCompleted(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access100 + 69;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        openBankingInquiryAgreementActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 67;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onExtraCallback(o.access13800<? super java.lang.Boolean> r29) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity.onExtraCallback(o.access13800):java.lang.Object");
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super ResolveTermIdsResponse>, Object> {
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ OpenBankingInquiryAgreementActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(access13800 access13800Var, OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity) {
            super(2, access13800Var);
            this.this$0 = openBankingInquiryAgreementActivity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onWarmupCompleted(access13800Var, this.this$0);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super ResolveTermIdsResponse> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 29426), 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback).get(null);
                try {
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1128771703);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 29426), ((byte) KeyEvent.getModifierMetaStateMask()) + 23, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24734, 1913081575, false, "extraCallback", new Class[0]);
                    }
                    onSeekEngaged onseekengaged = (onSeekEngaged) ((Method) objOnExtraCallback2).invoke(obj2, null);
                    ResolveTermIdsRequest resolveTermIdsRequest = new ResolveTermIdsRequest(CollectionsKt.listOf(access14000.onNavigationEvent(Integer.parseInt(OpenBankingInquiryAgreementActivity.asInterface(this.this$0)))), true);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = onseekengaged.onExtraCallbackWithResult(resolveTermIdsRequest, (access13800<? super BaseApiResponse<ResolveTermIdsResponse>>) this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                try {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact != null) {
                        return (ResolveTermIdsResponse) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.transfer.ResolveTermIdsResponse");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(ResolveTermIdsResponse.class, Object.class) || Intrinsics.areEqual(ResolveTermIdsResponse.class, Unit.class)) {
                        return Unit.INSTANCE;
                    }
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
            }
            TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
            if (apiErrorExtraCallbackWithResult == null) {
                throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
            }
            throw apiErrorExtraCallbackWithResult;
        }
    }

    private static final Unit onExtraCallbackWithResult(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = readTypedObject + 25;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        openBankingInquiryAgreementActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 15;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object IAuthTabCallback(o.access13800<? super kotlin.Unit> r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity.IAuthTabCallback(o.access13800):java.lang.Object");
    }

    private static final void IAuthTabCallbackDefault(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity) {
        int i = 2 % 2;
        int i2 = access100 + 115;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        openBankingInquiryAgreementActivity.bo_();
        int i4 = readTypedObject + 77;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
    }

    private static final void getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 23;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = readTypedObject + 35;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit onWarmupCompleted(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, TypeUtils2 typeUtils2) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 57;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(typeUtils2);
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), -1675706368, 1675706378, iOnWarmupCompleted, new Object[]{openBankingInquiryAgreementActivity, typeUtils2}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 5;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = readTypedObject + 73;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        openBankingInquiryAgreementActivity.ICustomTabsService_Parcel();
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 79;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(final OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, openBankingInquiryAgreementActivity, false, (initMiniApp) null, (Function0) null, new Function1() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, (DialogInterface) obj};
                int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                return (Unit) OpenBankingInquiryAgreementActivity.onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), -1445634776, 1445634781, iOnWarmupCompleted, objArr, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
            }
        }, 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = readTypedObject + 125;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        final OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity = (OpenBankingInquiryAgreementActivity) objArr[0];
        int i = 2 % 2;
        BaseActivity.IAuthTabCallback(openBankingInquiryAgreementActivity, (String) null, false, 3, (Object) null);
        writeRaw writerawOnWarmupCompleted = shortValue.IAuthTabCallback(shortValue.Companion, openBankingInquiryAgreementActivity, UTF8Decoder.OPEN_BANKING_INQUIRY_AGREEMENT, 62L, openBankingInquiryAgreementActivity, false, false, (shortValue.onNavigationEvent) null, false, false, (String) null, (Function1) null, 2032, (Object) null).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda16
            public final void run() {
                OpenBankingInquiryAgreementActivity.onWarmupCompleted(this.f$0);
            }
        });
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda17
            public final Object invoke(Object obj) {
                return OpenBankingInquiryAgreementActivity.onExtraCallback(this.f$0, (TypeUtils2) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda18
            public final void accept(Object obj) {
                OpenBankingInquiryAgreementActivity.asInterface(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda19
            public final Object invoke(Object obj) {
                return OpenBankingInquiryAgreementActivity.onExtraCallback(this.f$0, (Throwable) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawOnWarmupCompleted.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda20
            public final void accept(Object obj) throws Throwable {
                Object[] objArr2 = {function12, obj};
                int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                OpenBankingInquiryAgreementActivity.onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), 171176172, -171176164, iOnWarmupCompleted, objArr2, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        openBankingInquiryAgreementActivity.onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
        int i2 = readTypedObject + 23;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return OpenBankingInquiryAgreementActivity.this.new asBinder(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity = OpenBankingInquiryAgreementActivity.this;
                this.label = 1;
                if (OpenBankingInquiryAgreementActivity.onExtraCallback(openBankingInquiryAgreementActivity, (access13800) this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final void ICustomTabsService_Parcel() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new asBinder(null), 3, (Object) null);
        int i2 = access100 + 57;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 30 / 0;
        }
    }

    private static final deserializeIp IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 65;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (deserializeIp) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final deserializeIp onNavigationEvent(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, TypeUtils2 typeUtils2, setDescriptionTextColor setdescriptiontextcolor) {
        int i = 2 % 2;
        int i2 = readTypedObject + 81;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setdescriptiontextcolor, "");
        Long l = openBankingInquiryAgreementActivity.IAuthTabCallbackStub;
        writeRaw writerawOnExtraCallbackWithResult = setSignedData.onExtraCallbackWithResult(new setSignedData(), typeUtils2, openBankingInquiryAgreementActivity.access000, true, setdescriptiontextcolor, false, l != null ? new ToolkitManager_Update.onExtraCallbackWithResult(l.longValue(), SessionKnownType.REGISTER_BANK_ACCOUNT.name(), "SV-OBA") : null, 16, (Object) null);
        int i4 = readTypedObject + 11;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return writerawOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallbackWithResult(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = access100 + 95;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity.IAuthTabCallback(openBankingInquiryAgreementActivity, (String) null, false, 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 93;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 53;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = readTypedObject + 107;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity = (OpenBankingInquiryAgreementActivity) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 107;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        openBankingInquiryAgreementActivity.bo_();
        int i4 = access100 + 53;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final void ICustomTabsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 35;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity = (OpenBankingInquiryAgreementActivity) objArr[0];
        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (TabBarInfoQueryPointOnTabBarInfoQueryListener) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 47;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(tabBarInfoQueryPointOnTabBarInfoQueryListener);
            openBankingInquiryAgreementActivity.onExtraCallbackWithResult(tabBarInfoQueryPointOnTabBarInfoQueryListener);
            Unit unit = Unit.INSTANCE;
            int i3 = access100 + 69;
            readTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNull(tabBarInfoQueryPointOnTabBarInfoQueryListener);
        openBankingInquiryAgreementActivity.onExtraCallbackWithResult(tabBarInfoQueryPointOnTabBarInfoQueryListener);
        Unit unit2 = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    private static final void writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 67;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = readTypedObject + 107;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit getInterfaceDescriptor(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 1;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        openBankingInquiryAgreementActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 5;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(final OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, Throwable th) {
        int i = 2 % 2;
        CxxInspectorPackagerConnectionIWebSocket cxxInspectorPackagerConnectionIWebSocket = CxxInspectorPackagerConnectionIWebSocket.onNavigationEvent;
        Intrinsics.checkNotNull(th);
        cxxInspectorPackagerConnectionIWebSocket.onNavigationEvent(openBankingInquiryAgreementActivity, th, new Function0() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda21
            public final Object invoke() {
                return OpenBankingInquiryAgreementActivity.onExtraCallback(this.f$0);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = readTypedObject + 53;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 19;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
    }

    private final writeRaw<setDescriptionTextColor> updateVisuals() throws Throwable {
        int i = 2 % 2;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29426), 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 24734 - (ViewConfiguration.getTapTimeout() >> 16), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1971988338);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29427 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22, 24734 - Color.argb(0, 0, 0, 0), -1154144738, false, "access000", new Class[0]);
            }
            writeRaw<BaseApiResponse<setDescriptionTextColor>> writerawOnNavigationEvent = ((getMediaViewVideoRendererApi) ((Method) objOnExtraCallback2).invoke(obj, null)).onNavigationEvent(ICustomTabsServiceStub(), ICustomTabsServiceDefault(), "OPEN_BANKING");
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new onNavigationEvent(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda22
                public final Object invoke(Object obj2) {
                    return OpenBankingInquiryAgreementActivity.onExtraCallbackWithResult((Throwable) obj2);
                }
            };
            writeRaw<setDescriptionTextColor> writerawOnWarmupCompleted = writerawIAuthTabCallback.onWarmupCompleted(new deserializeFloat() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda23
                public final void accept(Object obj2) {
                    OpenBankingInquiryAgreementActivity.asBinder(function1, obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
            int i2 = readTypedObject + 125;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            return writerawOnWarmupCompleted;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final Unit asInterface(Throwable th) {
        int i = 2 % 2;
        int i2 = readTypedObject + 119;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("OpenBankingInquiryAgreementActivity", th);
            int i3 = 49 / 0;
            return Unit.INSTANCE;
        }
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("OpenBankingInquiryAgreementActivity", th);
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, SetDetectableSize setDetectableSize) {
        Unit unit;
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("action_type", "impression");
            setDetectableSize.onExtraCallback("screen_name", openBankingInquiryAgreementActivity.getScreenName());
            setDetectableSize.onExtraCallback(openBankingInquiryAgreementActivity.validateRelationship());
            unit = Unit.INSTANCE;
            int i3 = 61 / 0;
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("action_type", "impression");
            setDetectableSize.onExtraCallback("screen_name", openBankingInquiryAgreementActivity.getScreenName());
            setDetectableSize.onExtraCallback(openBankingInquiryAgreementActivity.validateRelationship());
            unit = Unit.INSTANCE;
        }
        int i4 = readTypedObject + 83;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onWarmupCompleted("account_register_withdraw_complete", false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, (SetDetectableSize) obj};
                int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                return (Unit) OpenBankingInquiryAgreementActivity.onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), 788385937, -788385935, iOnWarmupCompleted, objArr, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
            }
        }, 30, (Object) null);
        Intent intentPutParcelableArrayListExtra = new Intent().putExtra("openBankingWithdrawRestriction", this.getInterfaceDescriptor).putExtra("withdrawAgreementCompleted", this.access000).putParcelableArrayListExtra("EXTRA_KEY_REGISTERED_BANK_ACCOUNTS", CollectionsKt.arrayListOf(new TabBarInfoQueryPointOnTabBarInfoQueryListener[]{tabBarInfoQueryPointOnTabBarInfoQueryListener}));
        Intrinsics.checkNotNullExpressionValue(intentPutParcelableArrayListExtra, "");
        setResult(-1, intentPutParcelableArrayListExtra);
        finish();
        int i2 = readTypedObject + 43;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = access100 + 123;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return "account_register__agreement";
        }
        throw null;
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", "screen");
        linkedHashMap.putAll(validateRelationship());
        int i2 = access100 + 59;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Map<java.lang.String, java.lang.Object> validateRelationship() throws java.lang.Throwable {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = r8.access200()
            java.lang.String r2 = r8.writeTypedList()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            o.sendBroadcastWithAdObject r4 = o.sendBroadcastWithAdObject.ACCOUNT_REGISTER
            java.lang.String r5 = "category"
            java.lang.String r6 = r4.getValue()
            r3.put(r5, r6)
            java.lang.String r5 = "service"
            java.lang.String r4 = r4.getValue()
            r3.put(r5, r4)
            o.checkNavigationBarBySystemProperties r4 = r8.IAuthTabCallbackDefault
            int r4 = r4.IAuthTabCallbackStub()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "bank_code"
            r3.put(r5, r4)
            java.lang.String r4 = "count"
            r5 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3.put(r4, r6)
            r4 = 0
            if (r1 == 0) goto L6a
            boolean r6 = kotlin.text.StringsKt.isBlank(r1)
            if (r6 != 0) goto L6a
            r6 = 12
            char[] r6 = new char[r6]
            r6 = {x009a: FILL_ARRAY_DATA , data: [20844, 20766, -23201, 1116, 7257, 24307, -11467, 14178, -11130, 8912, -11176, 24282} // fill-array
            int r7 = android.view.KeyEvent.getDeadChar(r4, r4)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            a(r6, r7, r5)
            r5 = r5[r4]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.intern()
            r3.put(r5, r1)
            int r1 = viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity.readTypedObject
            int r1 = r1 + 31
            int r5 = r1 % 128
            viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity.access100 = r5
            int r1 = r1 % r0
        L6a:
            if (r2 == 0) goto L8c
            int r1 = viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity.readTypedObject
            int r1 = r1 + 37
            int r5 = r1 % 128
            viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity.access100 = r5
            int r1 = r1 % r0
            if (r1 == 0) goto L81
            boolean r0 = kotlin.text.StringsKt.isBlank(r2)
            r1 = 56
            int r1 = r1 / r4
            if (r0 != 0) goto L8c
            goto L87
        L81:
            boolean r0 = kotlin.text.StringsKt.isBlank(r2)
            if (r0 != 0) goto L8c
        L87:
            java.lang.String r0 = "service_referrer"
            r3.put(r0, r2)
        L8c:
            o.getIssuerAndSerialNumber r0 = o.getIssuerAndSerialNumber.onNavigationEvent
            o.UST_CMP_IssueCertificate_SendConf r1 = o.UST_CMP_IssueCertificate_SendConf.BANK
            java.lang.String r0 = r0.onWarmupCompleted(r1)
            java.lang.String r1 = "execution_id"
            r3.put(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity.validateRelationship():java.util.Map");
    }

    public static /* synthetic */ deserializeIp onWarmupCompleted(Function1 function1, Object obj) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return (deserializeIp) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), -768602653, 768602657, iOnWarmupCompleted, new Object[]{function1, obj}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onWarmupCompleted(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), 788385937, -788385935, iOnWarmupCompleted, new Object[]{openBankingInquiryAgreementActivity, setDetectableSize}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
    }

    public static /* synthetic */ void IAuthTabCallback_Parcel(Function1 function1, Object obj) throws Throwable {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), 171176172, -171176164, iOnWarmupCompleted, new Object[]{function1, obj}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
    }

    public static /* synthetic */ deserializeIp onExtraCallbackWithResult(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, TypeUtils2 typeUtils2, setDescriptionTextColor setdescriptiontextcolor) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return (deserializeIp) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), 83996576, -83996564, iOnWarmupCompleted, new Object[]{openBankingInquiryAgreementActivity, typeUtils2, setdescriptiontextcolor}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
    }

    public static /* synthetic */ Unit IAuthTabCallback(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, DialogInterface dialogInterface) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), -1445634776, 1445634781, iOnWarmupCompleted, new Object[]{openBankingInquiryAgreementActivity, dialogInterface}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallback(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, DialogInterface dialogInterface) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), 567317441, -567317440, iOnWarmupCompleted, new Object[]{openBankingInquiryAgreementActivity, dialogInterface}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
    }

    public static /* synthetic */ String onExtraCallbackWithResult(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return (String) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), -1038344548, 1038344554, iOnWarmupCompleted, new Object[]{openBankingInquiryAgreementActivity}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
    }

    private static final String IAuthTabCallbackStub(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return (String) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), 302968713, -302968710, iOnWarmupCompleted, new Object[]{openBankingInquiryAgreementActivity}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
    }

    private final void IEngagementSignalsCallback() throws Throwable {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), -870852771, 870852780, iOnWarmupCompleted, new Object[]{this}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
    }

    private static final void access000(Function1 function1, Object obj) throws Throwable {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), 1858285897, -1858285890, iOnWarmupCompleted, new Object[]{function1, obj}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
    }

    private final void onExtraCallback(TypeUtils2 typeUtils2) throws Throwable {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), -1675706368, 1675706378, iOnWarmupCompleted, new Object[]{this, typeUtils2}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
    }

    private static final void onTransact(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity) throws Throwable {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), -1885060127, 1885060138, iOnWarmupCompleted, new Object[]{openBankingInquiryAgreementActivity}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
    }

    private static final Unit onExtraCallbackWithResult(OpenBankingInquiryAgreementActivity openBankingInquiryAgreementActivity, TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), 1702724246, -1702724246, iOnWarmupCompleted, new Object[]{openBankingInquiryAgreementActivity, tabBarInfoQueryPointOnTabBarInfoQueryListener}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
    }

    @Override // viva.republica.toss.account.register.openbanking.Hilt_OpenBankingInquiryAgreementActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access100 + 79;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = access100 + 111;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.account.register.openbanking.Hilt_OpenBankingInquiryAgreementActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = access100 + 55;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.account.register.openbanking.Hilt_OpenBankingInquiryAgreementActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access100 + 123;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
    }

    @Override // viva.republica.toss.account.register.openbanking.Hilt_OpenBankingInquiryAgreementActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = readTypedObject + 45;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = access100 + 65;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    static void setEngagementSignalsCallback() {
        IAuthTabCallback_Parcel = -5543770437261731222L;
    }
}
