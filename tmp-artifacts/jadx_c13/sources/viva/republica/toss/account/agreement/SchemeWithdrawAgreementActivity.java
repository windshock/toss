package viva.republica.toss.account.agreement;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.base.BaseActivity;
import im.toss.define.MobileCarrier;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import o.ASN1SequenceParser;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.GeckoHubImp;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.JsonReaderUnknownNumberParsing;
import o.PageShowPoint;
import o.SessionTrackerb;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda1;
import o.UST_CMP_IssueCertificate_SendConf;
import o.UTF8Decoder;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14100;
import o.access15400;
import o.access8200;
import o.checkDeviceBrand;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeUriNullableCollection;
import o.disableOldAndroidAttachmentMetricsWorkarounds;
import o.findResAndMsg;
import o.getIssuerAndSerialNumber;
import o.getPackageType;
import o.getParamImp;
import o.getWrite;
import o.initMiniApp;
import o.issueCertV3;
import o.maybeUpdateAnimatable;
import o.onLoadStarted;
import o.onPageExit;
import o.overrideEventDispatcher;
import o.putChannelInfo;
import o.setDescriptionTextColor;
import o.setDoubleTapZoomDpi;
import o.setIndicatorY;
import o.updateRuntimeShadowNodeReferencesOnCommit;
import o.writeRaw;
import o.zzaj;
import o.zzbq;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import ua.naiksoftware.stomp.dto.StompHeader;
import viva.republica.toss.R;
import viva.republica.toss.account.agreement.AccountAgreementActivity;
import viva.republica.toss.network.model.verify.SessionKnownType;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class SchemeWithdrawAgreementActivity extends Hilt_SchemeWithdrawAgreementActivity {
    public static final IAuthTabCallback Companion;
    public static final int IAuthTabCallbackStub;
    private static long access000;
    private static char[] access100;
    private static int extraCallback;
    private long asInterface;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {57, 126, 65, 8};
    private static final int $$b = 233;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallback = 1;
    private static int readTypedObject = 0;
    private static int writeTypedObject = 1;
    private String getInterfaceDescriptor = _UrlKt.FRAGMENT_ENCODE_SET;
    private String IAuthTabCallbackStubProxy = _UrlKt.FRAGMENT_ENCODE_SET;
    private boolean IAuthTabCallback_Parcel = true;
    private final IEngagementSignalsCallback_Parcel<Intent> onTransact = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.account.agreement.SchemeWithdrawAgreementActivity$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return SchemeWithdrawAgreementActivity.onNavigationEvent(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> asBinder = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.account.agreement.SchemeWithdrawAgreementActivity$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return SchemeWithdrawAgreementActivity.onExtraCallbackWithResult(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallbackDefault = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.account.agreement.SchemeWithdrawAgreementActivity$$ExternalSyntheticLambda10
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return SchemeWithdrawAgreementActivity.onExtraCallback(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });

    static final class onExtraCallback extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SchemeWithdrawAgreementActivity.IAuthTabCallback(SchemeWithdrawAgreementActivity.this, (String) null, this);
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SchemeWithdrawAgreementActivity.onNavigationEvent(SchemeWithdrawAgreementActivity.this, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, byte b) {
        int i2;
        int i3;
        int i4 = 97 - (b * 4);
        int i5 = 4 - (i * 4);
        byte[] bArr = $$a;
        int i6 = (s * 3) + 1;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            int i8 = i5;
            int i9 = (-i5) + i7;
            int i10 = i8 + 1;
            i2 = i3;
            i4 = i9;
            i5 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            int i11 = i4;
            i8 = i5;
            i5 = bArr[i5];
            i7 = i11;
            int i92 = (-i5) + i7;
            int i102 = i8 + 1;
            i2 = i3;
            i4 = i92;
            i5 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    static {
        extraCallback = 0;
        onNavigationEvent();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new IAuthTabCallback(defaultConstructorMarker);
        IAuthTabCallbackStub = 8;
        int i = ICustomTabsCallback + 89;
        extraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [android.app.Activity, viva.republica.toss.account.agreement.SchemeWithdrawAgreementActivity] */
    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        AccountAgreementActivity.onExtraCallback onextracallback;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel;
        Long lValueOf;
        UTF8Decoder uTF8Decoder;
        boolean z;
        int i7;
        int i8 = ~i3;
        int i9 = ~i2;
        int i10 = ~i6;
        int i11 = (~(i8 | i9 | i10)) | (~(i2 | i6));
        int i12 = ~(i8 | i10);
        int i13 = i2 | i12;
        int i14 = (~(i6 | i3)) | i12 | (~(i9 | i3));
        int i15 = i3 + i2 + i4 + (296844165 * i5) + (1729652556 * i);
        int i16 = i15 * i15;
        int i17 = ((i3 * 599922083) - 580124672) + (599922083 * i2) + (2088888926 * i11) + ((-117189444) * i13) + ((-2088888926) * i14) + ((-1606156288) * i4) + ((-279707648) * i5) + ((-265289728) * i) + (2117271552 * i16);
        int i18 = (i3 * (-1181628991)) + 1322814002 + (i2 * (-1181628991)) + (i11 * (-118)) + (i13 * (-236)) + (i14 * Imgproc.COLOR_YUV2BGR_YVYU) + ((-1181629109) * i4) + ((-698251017) * i5) + (1773125444 * i) + (i16 * 938541056);
        switch (i17 + (i18 * i18 * (-109772800))) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                ?? r2 = (SchemeWithdrawAgreementActivity) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                String str = (String) objArr[2];
                String str2 = (String) objArr[3];
                TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult = (TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult) objArr[4];
                Long l = (Long) objArr[5];
                String str3 = (String) objArr[6];
                String str4 = (String) objArr[7];
                boolean zBooleanValue = ((Boolean) objArr[8]).booleanValue();
                boolean zBooleanValue2 = ((Boolean) objArr[9]).booleanValue();
                String str5 = (String) objArr[10];
                String str6 = (String) objArr[11];
                int i19 = 2 % 2;
                int i20 = writeTypedObject + 73;
                readTypedObject = i20 % 128;
                if (i20 % 2 != 0) {
                    onextracallback = AccountAgreementActivity.Companion;
                    iEngagementSignalsCallback_Parcel = ((SchemeWithdrawAgreementActivity) r2).onTransact;
                    lValueOf = Long.valueOf(jLongValue);
                    uTF8Decoder = null;
                    z = false;
                    i7 = 110;
                } else {
                    onextracallback = AccountAgreementActivity.Companion;
                    iEngagementSignalsCallback_Parcel = ((SchemeWithdrawAgreementActivity) r2).onTransact;
                    lValueOf = Long.valueOf(jLongValue);
                    uTF8Decoder = null;
                    z = true;
                    i7 = 64;
                }
                AccountAgreementActivity.onExtraCallback.IAuthTabCallback(onextracallback, r2, iEngagementSignalsCallback_Parcel, lValueOf, str, str2, onextracallbackwithresult, uTF8Decoder, z, l, str3, str4, zBooleanValue, zBooleanValue2, str5, str6, i7, null);
                int i21 = readTypedObject + 21;
                writeTypedObject = i21 % 128;
                int i22 = i21 % 2;
                return null;
            case 7:
                return asBinder(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity, long j, setDescriptionTextColor setdescriptiontextcolor) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 33;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(schemeWithdrawAgreementActivity, j, setdescriptiontextcolor);
        int i4 = readTypedObject + 83;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 85;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(schemeWithdrawAgreementActivity, th);
        int i4 = readTypedObject + 23;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 87;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onTransact(schemeWithdrawAgreementActivity);
        int i4 = writeTypedObject + 75;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 3;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        int i4 = readTypedObject + 107;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 31;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = readTypedObject + 71;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + Imgproc.COLOR_YUV2RGB_YVYU;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(schemeWithdrawAgreementActivity, iEngagementSignalsCallbackDefault);
        int i4 = writeTypedObject + 23;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 27;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(schemeWithdrawAgreementActivity, iEngagementSignalsCallbackDefault);
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        int i5 = readTypedObject + 87;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = readTypedObject + 21;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(schemeWithdrawAgreementActivity, iEngagementSignalsCallbackDefault);
        int i4 = readTypedObject + 45;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity = (SchemeWithdrawAgreementActivity) objArr[0];
        deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 13;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(schemeWithdrawAgreementActivity, deserializeurinullablecollection);
        int i4 = readTypedObject + 37;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 5;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{schemeWithdrawAgreementActivity, dialogInterface}, -1663016386, 1663016387, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult);
        int i4 = readTypedObject + 55;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{function1, obj}, -948299086, 948299089, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult);
            return;
        }
        int iOnExtraCallbackWithResult4 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{function1, obj}, -948299086, 948299089, iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult6, iOnExtraCallbackWithResult4);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 15;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return -1L;
    }

    public static final /* synthetic */ Object IAuthTabCallback(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity, String str, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 11;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        Object objIAuthTabCallback = IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{schemeWithdrawAgreementActivity, str, access13800Var}, -1592717688, 1592717695, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult);
        int i4 = writeTypedObject + 95;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity = (SchemeWithdrawAgreementActivity) objArr[0];
        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (TabBarInfoQueryPointOnTabBarInfoQueryListener) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 53;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        schemeWithdrawAgreementActivity.IAuthTabCallback(tabBarInfoQueryPointOnTabBarInfoQueryListener);
        if (i3 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean IAuthTabCallbackDefault(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 65;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean z = schemeWithdrawAgreementActivity.IAuthTabCallback_Parcel;
        if (i3 == 0) {
            return z;
        }
        throw null;
    }

    public static final /* synthetic */ boolean asInterface(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 123;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return schemeWithdrawAgreementActivity.ICustomTabsServiceDefault();
        }
        schemeWithdrawAgreementActivity.ICustomTabsServiceDefault();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity = (SchemeWithdrawAgreementActivity) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 111;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        Object obj = null;
        String str = schemeWithdrawAgreementActivity.getInterfaceDescriptor;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 113;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final /* synthetic */ String onExtraCallback(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 7;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        String str = schemeWithdrawAgreementActivity.IAuthTabCallbackStubProxy;
        if (i4 != 0) {
            int i5 = 87 / 0;
        }
        int i6 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
        writeTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final /* synthetic */ boolean onExtraCallbackWithResult(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity, TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) {
        int i = 2 % 2;
        int i2 = readTypedObject + 59;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = schemeWithdrawAgreementActivity.onExtraCallback(tabBarInfoQueryPointOnTabBarInfoQueryListener);
        int i4 = readTypedObject + 69;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnExtraCallback;
        }
        throw null;
    }

    public static final /* synthetic */ Object onNavigationEvent(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity, String str, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 21;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = schemeWithdrawAgreementActivity.onExtraCallbackWithResult(str, (access13800<? super TabBarInfoQueryPointOnTabBarInfoQueryListener>) access13800Var);
        int i4 = writeTypedObject + 15;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static final /* synthetic */ String onNavigationEvent(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 53;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        String str = (String) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{schemeWithdrawAgreementActivity}, -238421177, 238421181, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult);
        int i4 = writeTypedObject + 35;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static final /* synthetic */ String onWarmupCompleted(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 89;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            schemeWithdrawAgreementActivity.setEngagementSignalsCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String engagementSignalsCallback = schemeWithdrawAgreementActivity.setEngagementSignalsCallback();
        int i3 = readTypedObject + 113;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 7 / 0;
        }
        return engagementSignalsCallback;
    }

    public static final /* synthetic */ void onWarmupCompleted(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity, String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 81;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        schemeWithdrawAgreementActivity.onNavigationEvent(str, str2);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = writeTypedObject + 65;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public final SessionTrackerb IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 63;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            return null;
        }
        int i5 = i3 + 105;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return sessionTrackerb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 115;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = getIntent().getStringExtra("skipSmsGuideCompleteMessage");
        if (stringExtra != null) {
            return Boolean.parseBoolean(stringExtra);
        }
        int i4 = readTypedObject + 71;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String setEngagementSignalsCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 49;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        Object[] objArr = new Object[1];
        a(View.MeasureSpec.getSize(0), View.MeasureSpec.getMode(0) + 8, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 54622), objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        int i4 = writeTypedObject + 5;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return stringExtra;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        BaseActivity baseActivity = (SchemeWithdrawAgreementActivity) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 93;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = baseActivity.getIntent().getStringExtra("serviceReferrer");
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        return stringExtra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        SessionTrackerb sessionTrackerbIAuthTabCallback;
        String str;
        boolean z;
        Function1 function1;
        Bundle bundle;
        boolean z2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            if (schemeWithdrawAgreementActivity.IAuthTabCallbackStubProxy.length() > 0) {
                int i3 = writeTypedObject + 103;
                readTypedObject = i3 % 128;
                if (i3 % 2 != 0) {
                    sessionTrackerbIAuthTabCallback = schemeWithdrawAgreementActivity.IAuthTabCallback();
                    str = schemeWithdrawAgreementActivity.IAuthTabCallbackStubProxy;
                    z = true;
                    function1 = null;
                    bundle = null;
                    z2 = true;
                    i = 92;
                } else {
                    sessionTrackerbIAuthTabCallback = schemeWithdrawAgreementActivity.IAuthTabCallback();
                    str = schemeWithdrawAgreementActivity.IAuthTabCallbackStubProxy;
                    z = false;
                    function1 = null;
                    bundle = null;
                    z2 = false;
                    i = 60;
                }
                SessionTrackerb.IAuthTabCallback(sessionTrackerbIAuthTabCallback, schemeWithdrawAgreementActivity, str, z, function1, bundle, z2, i, (Object) null);
            }
            schemeWithdrawAgreementActivity.setResult(-1, iEngagementSignalsCallbackDefault.onExtraCallbackWithResult());
            int i4 = writeTypedObject + 77;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        setDoubleTapZoomDpi.onNavigationEvent(setDoubleTapZoomDpi.IAuthTabCallback, schemeWithdrawAgreementActivity, 0L, 1, (Object) null);
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 39;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i4 = writeTypedObject + 73;
            readTypedObject = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr = {schemeWithdrawAgreementActivity, iEngagementSignalsCallbackDefault.onExtraCallbackWithResult()};
                int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
                IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, 228225292, -228225284, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
                throw null;
            }
            Object[] objArr2 = {schemeWithdrawAgreementActivity, iEngagementSignalsCallbackDefault.onExtraCallbackWithResult()};
            int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr2, 228225292, -228225284, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        } else {
            schemeWithdrawAgreementActivity.finish();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i2 = writeTypedObject + Imgproc.COLOR_YUV2RGBA_YVYU;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            schemeWithdrawAgreementActivity.onExtraCallbackWithResult(iEngagementSignalsCallbackDefault.onExtraCallbackWithResult());
        } else {
            schemeWithdrawAgreementActivity.finish();
            int i4 = writeTypedObject + 83;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0ae8  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x105e  */
    /* JADX WARN: Type inference failed for: r29v0, types: [android.app.Activity, im.toss.base.BaseActivity, viva.republica.toss.account.agreement.SchemeWithdrawAgreementActivity] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v55, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v68, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r2v69, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v70, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r2v71, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r2v72, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r2v73, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v76, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v103, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v108, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v113, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v118, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v123, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v128, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v133, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v138, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v143, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v145, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r3v147, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v148, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r3v149, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r3v150, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r3v151, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r3v152, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r3v153 */
    /* JADX WARN: Type inference failed for: r3v157, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v92, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v93 */
    /* JADX WARN: Type inference failed for: r3v94 */
    /* JADX WARN: Type inference failed for: r3v97 */
    /* JADX WARN: Type inference failed for: r3v98 */
    @Override // viva.republica.toss.account.agreement.Hilt_SchemeWithdrawAgreementActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) {
        String str;
        String str2;
        Boolean bool;
        Bundle extras;
        Object obj;
        ?? string;
        Object next;
        String string2;
        Object array;
        Object obj2;
        Object next2;
        Object array2;
        Object array3;
        Bundle extras2;
        ?? string3;
        Object next3;
        int i = 2 % 2;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (extras2 = intent.getExtras()) == null || !extras2.containsKey(StompHeader.ID)) {
            str = null;
        } else if (zzbq.onNavigationEvent(intent)) {
            Bundle extras3 = intent.getExtras();
            if (extras3 != null && (string3 = extras3.getString(StompHeader.ID)) != 0) {
                if (Intrinsics.areEqual(String.class, Integer.class)) {
                    string3 = StringsKt__StringNumberConversionsKt.toIntOrNull(string3);
                } else if (Intrinsics.areEqual(String.class, Long.class)) {
                    string3 = StringsKt__StringNumberConversionsKt.toLongOrNull(string3);
                } else if (Intrinsics.areEqual(String.class, Float.class)) {
                    string3 = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string3);
                } else if (Intrinsics.areEqual(String.class, Double.class)) {
                    string3 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(string3);
                } else if (Intrinsics.areEqual(String.class, Short.class)) {
                    string3 = StringsKt__StringNumberConversionsKt.toShortOrNull(string3);
                } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                    string3 = StringsKt__StringNumberConversionsKt.toByteOrNull(string3);
                } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                    string3 = Boolean.valueOf(Boolean.parseBoolean(string3));
                } else if (Intrinsics.areEqual(String.class, Character.class)) {
                    string3 = Character.valueOf(string3.charAt(0));
                } else if (!Intrinsics.areEqual(String.class, String.class)) {
                    if (Intrinsics.areEqual(String.class, Integer[].class)) {
                        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : listSplit$default) {
                            if (((String) obj3).length() > 0) {
                                arrayList.add(obj3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it.next()).toString())));
                        }
                        string3 = arrayList2.toArray(new Integer[0]);
                    } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                        List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj4 : listSplit$default2) {
                            if (((String) obj4).length() > 0) {
                                arrayList3.add(obj4);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(Long.valueOf(Long.parseLong(StringsKt__StringsKt.trim((CharSequence) it2.next()).toString())));
                        }
                        string3 = arrayList4.toArray(new Long[0]);
                    } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                        List listSplit$default3 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj5 : listSplit$default3) {
                            if (((String) obj5).length() > 0) {
                                arrayList5.add(obj5);
                            }
                        }
                        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                        Iterator it3 = arrayList5.iterator();
                        while (it3.hasNext()) {
                            arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it3.next()).toString())));
                        }
                        string3 = arrayList6.toArray(new Float[0]);
                    } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                        List listSplit$default4 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj6 : listSplit$default4) {
                            if (((String) obj6).length() > 0) {
                                arrayList7.add(obj6);
                            }
                        }
                        ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                        Iterator it4 = arrayList7.iterator();
                        while (it4.hasNext()) {
                            arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it4.next()).toString())));
                        }
                        string3 = arrayList8.toArray(new Double[0]);
                    } else if (Intrinsics.areEqual(String.class, Short[].class)) {
                        List listSplit$default5 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList9 = new ArrayList();
                        for (Object obj7 : listSplit$default5) {
                            if (((String) obj7).length() > 0) {
                                arrayList9.add(obj7);
                            }
                        }
                        ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList9, 10));
                        Iterator it5 = arrayList9.iterator();
                        while (it5.hasNext()) {
                            int i2 = readTypedObject + 77;
                            writeTypedObject = i2 % 128;
                            if (i2 % 2 == 0) {
                                arrayList10.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it5.next()).toString())));
                                int i3 = 16 / 0;
                            } else {
                                arrayList10.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it5.next()).toString())));
                            }
                        }
                        string3 = arrayList10.toArray(new Short[0]);
                    } else if (Intrinsics.areEqual(String.class, Byte[].class)) {
                        List listSplit$default6 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList11 = new ArrayList();
                        for (Object obj8 : listSplit$default6) {
                            if (((String) obj8).length() > 0) {
                                arrayList11.add(obj8);
                            }
                        }
                        ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList11, 10));
                        Iterator it6 = arrayList11.iterator();
                        while (it6.hasNext()) {
                            arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it6.next()).toString())));
                        }
                        string3 = arrayList12.toArray(new Byte[0]);
                    } else if (Intrinsics.areEqual(String.class, Boolean[].class)) {
                        List listSplit$default7 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList13 = new ArrayList();
                        for (Object obj9 : listSplit$default7) {
                            if (((String) obj9).length() > 0) {
                                arrayList13.add(obj9);
                            }
                        }
                        ArrayList arrayList14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList13, 10));
                        Iterator it7 = arrayList13.iterator();
                        while (it7.hasNext()) {
                            arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt__StringsKt.trim((CharSequence) it7.next()).toString())));
                        }
                        string3 = arrayList14.toArray(new Boolean[0]);
                    } else if (Intrinsics.areEqual(String.class, Character[].class)) {
                        List listSplit$default8 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList15 = new ArrayList();
                        for (Object obj10 : listSplit$default8) {
                            if (((String) obj10).length() > 0) {
                                int i4 = writeTypedObject + 29;
                                readTypedObject = i4 % 128;
                                if (i4 % 2 != 0) {
                                    arrayList15.add(obj10);
                                    throw null;
                                }
                                arrayList15.add(obj10);
                            }
                        }
                        ArrayList arrayList16 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList15, 10));
                        Iterator it8 = arrayList15.iterator();
                        while (it8.hasNext()) {
                            arrayList16.add(Character.valueOf(StringsKt__StringsKt.trim((CharSequence) it8.next()).toString().charAt(0)));
                        }
                        string3 = arrayList16.toArray(new Character[0]);
                    } else if (Intrinsics.areEqual(String.class, String[].class)) {
                        List listSplit$default9 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList17 = new ArrayList();
                        for (Object obj11 : listSplit$default9) {
                            if (((String) obj11).length() > 0) {
                                arrayList17.add(obj11);
                            }
                        }
                        string3 = arrayList17.toArray(new String[0]);
                    } else {
                        Object[] enumConstants = String.class.getEnumConstants();
                        if (enumConstants != null) {
                            ArrayList arrayList18 = new ArrayList(enumConstants.length);
                            for (Object obj12 : enumConstants) {
                                Intrinsics.checkNotNull(obj12, "");
                                arrayList18.add((Enum) obj12);
                            }
                            Iterator it9 = arrayList18.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    next3 = it9.next();
                                    if (Intrinsics.areEqual(((Enum) next3).name(), (Object) string3)) {
                                        break;
                                    }
                                } else {
                                    next3 = null;
                                    break;
                                }
                            }
                            string3 = (Enum) next3;
                        } else {
                            string3 = 0;
                        }
                        if (string3 == 0) {
                            if (zzaj.onNavigationEvent().onActivityLayout()) {
                                throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                            }
                            string3 = 0;
                        }
                    }
                }
                boolean z = string3 instanceof String;
                String str3 = string3;
                if (!z) {
                    str3 = null;
                }
                str = str3;
            }
        } else {
            Bundle extras4 = intent.getExtras();
            Object obj13 = extras4 != null ? extras4.get(StompHeader.ID) : null;
            if (!(obj13 instanceof String)) {
                obj13 = null;
            }
            str = (String) obj13;
        }
        Class<Integer[]> cls = Integer[].class;
        Class<Short[]> cls2 = Short[].class;
        Class<Byte[]> cls3 = Byte[].class;
        Class<Boolean[]> cls4 = Boolean[].class;
        Class<Character[]> cls5 = Character[].class;
        if (str == null) {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        this.getInterfaceDescriptor = str;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            int i5 = readTypedObject + 111;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            Bundle extras5 = intent2.getExtras();
            if (extras5 == null || !extras5.containsKey("redirectURL")) {
                str2 = null;
            } else if (zzbq.onNavigationEvent(intent2)) {
                Bundle extras6 = intent2.getExtras();
                if (extras6 != null && (string2 = extras6.getString("redirectURL")) != null) {
                    if (Intrinsics.areEqual(String.class, Integer.class)) {
                        array2 = StringsKt__StringNumberConversionsKt.toIntOrNull(string2);
                    } else if (Intrinsics.areEqual(String.class, Long.class)) {
                        array2 = StringsKt__StringNumberConversionsKt.toLongOrNull(string2);
                    } else if (Intrinsics.areEqual(String.class, Float.class)) {
                        array2 = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string2);
                    } else if (Intrinsics.areEqual(String.class, Double.class)) {
                        array2 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(string2);
                    } else if (Intrinsics.areEqual(String.class, Short.class)) {
                        array2 = StringsKt__StringNumberConversionsKt.toShortOrNull(string2);
                    } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                        array2 = StringsKt__StringNumberConversionsKt.toByteOrNull(string2);
                    } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                        array2 = Boolean.valueOf(Boolean.parseBoolean(string2));
                    } else if (Intrinsics.areEqual(String.class, Character.class)) {
                        array2 = Character.valueOf(string2.charAt(0));
                    } else {
                        array2 = string2;
                        if (!Intrinsics.areEqual(String.class, String.class)) {
                            if (Intrinsics.areEqual(String.class, Integer[].class)) {
                                List listSplit$default10 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList19 = new ArrayList();
                                for (Object obj14 : listSplit$default10) {
                                    if (((String) obj14).length() > 0) {
                                        arrayList19.add(obj14);
                                    }
                                }
                                ArrayList arrayList20 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList19, 10));
                                Iterator it10 = arrayList19.iterator();
                                while (it10.hasNext()) {
                                    arrayList20.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it10.next()).toString())));
                                }
                                array3 = arrayList20.toArray(new Integer[0]);
                                cls = Integer[].class;
                            } else {
                                cls = Integer[].class;
                                if (Intrinsics.areEqual(String.class, Long[].class)) {
                                    List listSplit$default11 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList21 = new ArrayList();
                                    for (Object obj15 : listSplit$default11) {
                                        int i7 = readTypedObject + 97;
                                        writeTypedObject = i7 % 128;
                                        int i8 = i7 % 2;
                                        if (((String) obj15).length() > 0) {
                                            arrayList21.add(obj15);
                                        }
                                    }
                                    ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList21, 10));
                                    Iterator it11 = arrayList21.iterator();
                                    while (it11.hasNext()) {
                                        arrayList22.add(Long.valueOf(Long.parseLong(StringsKt__StringsKt.trim((CharSequence) it11.next()).toString())));
                                    }
                                    array2 = arrayList22.toArray(new Long[0]);
                                } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                                    List listSplit$default12 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList23 = new ArrayList();
                                    for (Object obj16 : listSplit$default12) {
                                        if (((String) obj16).length() > 0) {
                                            arrayList23.add(obj16);
                                        }
                                    }
                                    ArrayList arrayList24 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList23, 10));
                                    Iterator it12 = arrayList23.iterator();
                                    while (it12.hasNext()) {
                                        arrayList24.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it12.next()).toString())));
                                    }
                                    array2 = arrayList24.toArray(new Float[0]);
                                } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                                    List listSplit$default13 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList25 = new ArrayList();
                                    for (Object obj17 : listSplit$default13) {
                                        if (((String) obj17).length() > 0) {
                                            arrayList25.add(obj17);
                                        }
                                    }
                                    ArrayList arrayList26 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList25, 10));
                                    Iterator it13 = arrayList25.iterator();
                                    while (it13.hasNext()) {
                                        arrayList26.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it13.next()).toString())));
                                    }
                                    array2 = arrayList26.toArray(new Double[0]);
                                } else if (Intrinsics.areEqual(String.class, Short[].class)) {
                                    List listSplit$default14 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList27 = new ArrayList();
                                    for (Object obj18 : listSplit$default14) {
                                        if (((String) obj18).length() > 0) {
                                            arrayList27.add(obj18);
                                        }
                                    }
                                    ArrayList arrayList28 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList27, 10));
                                    Iterator it14 = arrayList27.iterator();
                                    while (it14.hasNext()) {
                                        arrayList28.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it14.next()).toString())));
                                    }
                                    array3 = arrayList28.toArray(new Short[0]);
                                    cls2 = Short[].class;
                                } else {
                                    cls2 = Short[].class;
                                    if (Intrinsics.areEqual(String.class, Byte[].class)) {
                                        List listSplit$default15 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList29 = new ArrayList();
                                        for (Object obj19 : listSplit$default15) {
                                            if (((String) obj19).length() > 0) {
                                                arrayList29.add(obj19);
                                            }
                                        }
                                        ArrayList arrayList30 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList29, 10));
                                        Iterator it15 = arrayList29.iterator();
                                        while (it15.hasNext()) {
                                            arrayList30.add(Byte.valueOf(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it15.next()).toString())));
                                        }
                                        cls3 = Byte[].class;
                                        array2 = arrayList30.toArray(new Byte[0]);
                                    } else if (Intrinsics.areEqual(String.class, Boolean[].class)) {
                                        List listSplit$default16 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList31 = new ArrayList();
                                        for (Object obj20 : listSplit$default16) {
                                            if (((String) obj20).length() > 0) {
                                                arrayList31.add(obj20);
                                            }
                                        }
                                        ArrayList arrayList32 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList31, 10));
                                        Iterator it16 = arrayList31.iterator();
                                        while (it16.hasNext()) {
                                            arrayList32.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt__StringsKt.trim((CharSequence) it16.next()).toString())));
                                        }
                                        Object array4 = arrayList32.toArray(new Boolean[0]);
                                        cls4 = Boolean[].class;
                                        cls3 = Byte[].class;
                                        array2 = array4;
                                    } else {
                                        if (Intrinsics.areEqual(String.class, Character[].class)) {
                                            List listSplit$default17 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList33 = new ArrayList();
                                            for (Object obj21 : listSplit$default17) {
                                                if (((String) obj21).length() > 0) {
                                                    arrayList33.add(obj21);
                                                }
                                            }
                                            ArrayList arrayList34 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList33, 10));
                                            Iterator it17 = arrayList33.iterator();
                                            while (it17.hasNext()) {
                                                arrayList34.add(Character.valueOf(StringsKt__StringsKt.trim((CharSequence) it17.next()).toString().charAt(0)));
                                            }
                                            Object array5 = arrayList34.toArray(new Character[0]);
                                            cls5 = Character[].class;
                                            cls4 = Boolean[].class;
                                            obj2 = array5;
                                        } else {
                                            if (Intrinsics.areEqual(String.class, String[].class)) {
                                                List listSplit$default18 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                                ArrayList arrayList35 = new ArrayList();
                                                for (Object obj22 : listSplit$default18) {
                                                    if (((String) obj22).length() > 0) {
                                                        arrayList35.add(obj22);
                                                    }
                                                }
                                                array = arrayList35.toArray(new String[0]);
                                            } else {
                                                Object[] enumConstants2 = String.class.getEnumConstants();
                                                if (enumConstants2 != null) {
                                                    ArrayList arrayList36 = new ArrayList(enumConstants2.length);
                                                    for (Object obj23 : enumConstants2) {
                                                        Intrinsics.checkNotNull(obj23, "");
                                                        arrayList36.add((Enum) obj23);
                                                    }
                                                    Iterator it18 = arrayList36.iterator();
                                                    while (true) {
                                                        if (!it18.hasNext()) {
                                                            next2 = null;
                                                            break;
                                                        }
                                                        next2 = it18.next();
                                                        if (Intrinsics.areEqual(((Enum) next2).name(), string2)) {
                                                            int i9 = writeTypedObject + 27;
                                                            readTypedObject = i9 % 128;
                                                            int i10 = i9 % 2;
                                                            break;
                                                        }
                                                    }
                                                    array = (Enum) next2;
                                                } else {
                                                    array = null;
                                                }
                                                if (array == null) {
                                                    if (zzaj.onNavigationEvent().onActivityLayout()) {
                                                        throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                                                    }
                                                    cls4 = Boolean[].class;
                                                    cls5 = Character[].class;
                                                    obj2 = null;
                                                }
                                            }
                                            cls4 = Boolean[].class;
                                            cls5 = Character[].class;
                                            obj2 = array;
                                        }
                                        cls3 = Byte[].class;
                                        array2 = obj2;
                                    }
                                }
                            }
                            array2 = array3;
                        }
                    }
                    boolean z2 = array2 instanceof String;
                    Object obj24 = array2;
                    if (!z2) {
                        obj24 = null;
                    }
                    str2 = (String) obj24;
                }
            } else {
                Bundle extras7 = intent2.getExtras();
                Object obj25 = extras7 != null ? extras7.get("redirectURL") : null;
                if (!(obj25 instanceof String)) {
                    int i11 = readTypedObject + 103;
                    writeTypedObject = i11 % 128;
                    int i12 = i11 % 2;
                    obj25 = null;
                }
                str2 = (String) obj25;
            }
        }
        if (str2 == null) {
            str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        this.IAuthTabCallbackStubProxy = str2;
        Intent intent3 = getIntent();
        Boolean bool2 = Boolean.TRUE;
        if (intent3 == null || (extras = intent3.getExtras()) == null || !extras.containsKey("showSmsGuide")) {
            bool = null;
        } else if (zzbq.onNavigationEvent(intent3)) {
            Bundle extras8 = intent3.getExtras();
            if (extras8 != null && (string = extras8.getString("showSmsGuide")) != 0) {
                if (Intrinsics.areEqual(Boolean.class, Integer.class)) {
                    string = StringsKt__StringNumberConversionsKt.toIntOrNull(string);
                } else if (Intrinsics.areEqual(Boolean.class, Long.class)) {
                    string = StringsKt__StringNumberConversionsKt.toLongOrNull(string);
                } else if (Intrinsics.areEqual(Boolean.class, Float.class)) {
                    string = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string);
                } else if (Intrinsics.areEqual(Boolean.class, Double.class)) {
                    string = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(string);
                } else if (Intrinsics.areEqual(Boolean.class, Short.class)) {
                    string = StringsKt__StringNumberConversionsKt.toShortOrNull(string);
                } else if (Intrinsics.areEqual(Boolean.class, Byte.class)) {
                    string = StringsKt__StringNumberConversionsKt.toByteOrNull(string);
                } else if (Intrinsics.areEqual(Boolean.class, Boolean.class)) {
                    string = Boolean.valueOf(Boolean.parseBoolean(string));
                } else if (Intrinsics.areEqual(Boolean.class, Character.class)) {
                    int i13 = writeTypedObject + 39;
                    readTypedObject = i13 % 128;
                    int i14 = i13 % 2;
                    string = Character.valueOf(string.charAt(0));
                } else if (!Intrinsics.areEqual(Boolean.class, String.class)) {
                    if (Intrinsics.areEqual(Boolean.class, cls)) {
                        List listSplit$default19 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList37 = new ArrayList();
                        for (Object obj26 : listSplit$default19) {
                            if (((String) obj26).length() > 0) {
                                int i15 = readTypedObject + 51;
                                writeTypedObject = i15 % 128;
                                if (i15 % 2 == 0) {
                                    arrayList37.add(obj26);
                                    int i16 = 4 / 0;
                                } else {
                                    arrayList37.add(obj26);
                                }
                            }
                        }
                        ArrayList arrayList38 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList37, 10));
                        Iterator it19 = arrayList37.iterator();
                        while (it19.hasNext()) {
                            arrayList38.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it19.next()).toString())));
                        }
                        string = arrayList38.toArray(new Integer[0]);
                    } else if (Intrinsics.areEqual(Boolean.class, Long[].class)) {
                        List listSplit$default20 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList39 = new ArrayList();
                        for (Object obj27 : listSplit$default20) {
                            if (((String) obj27).length() > 0) {
                                arrayList39.add(obj27);
                            }
                        }
                        ArrayList arrayList40 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList39, 10));
                        Iterator it20 = arrayList39.iterator();
                        while (it20.hasNext()) {
                            arrayList40.add(Long.valueOf(Long.parseLong(StringsKt__StringsKt.trim((CharSequence) it20.next()).toString())));
                        }
                        string = arrayList40.toArray(new Long[0]);
                    } else if (Intrinsics.areEqual(Boolean.class, Float[].class)) {
                        List listSplit$default21 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList41 = new ArrayList();
                        for (Object obj28 : listSplit$default21) {
                            if (((String) obj28).length() > 0) {
                                arrayList41.add(obj28);
                            }
                        }
                        ArrayList arrayList42 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList41, 10));
                        Iterator it21 = arrayList41.iterator();
                        while (it21.hasNext()) {
                            arrayList42.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it21.next()).toString())));
                        }
                        string = arrayList42.toArray(new Float[0]);
                    } else if (Intrinsics.areEqual(Boolean.class, Double[].class)) {
                        List listSplit$default22 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList43 = new ArrayList();
                        for (Object obj29 : listSplit$default22) {
                            if (((String) obj29).length() > 0) {
                                int i17 = readTypedObject + 115;
                                writeTypedObject = i17 % 128;
                                if (i17 % 2 == 0) {
                                    arrayList43.add(obj29);
                                    int i18 = 98 / 0;
                                } else {
                                    arrayList43.add(obj29);
                                }
                            }
                        }
                        ArrayList arrayList44 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList43, 10));
                        Iterator it22 = arrayList43.iterator();
                        while (it22.hasNext()) {
                            arrayList44.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it22.next()).toString())));
                        }
                        string = arrayList44.toArray(new Double[0]);
                    } else if (Intrinsics.areEqual(Boolean.class, cls2)) {
                        List listSplit$default23 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList45 = new ArrayList();
                        for (Object obj30 : listSplit$default23) {
                            if (((String) obj30).length() > 0) {
                                arrayList45.add(obj30);
                            }
                        }
                        ArrayList arrayList46 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList45, 10));
                        Iterator it23 = arrayList45.iterator();
                        while (!(!it23.hasNext())) {
                            arrayList46.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it23.next()).toString())));
                        }
                        string = arrayList46.toArray(new Short[0]);
                    } else if (Intrinsics.areEqual(Boolean.class, cls3)) {
                        List listSplit$default24 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList47 = new ArrayList();
                        for (Object obj31 : listSplit$default24) {
                            if (((String) obj31).length() > 0) {
                                arrayList47.add(obj31);
                            }
                        }
                        ArrayList arrayList48 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList47, 10));
                        Iterator it24 = arrayList47.iterator();
                        while (it24.hasNext()) {
                            arrayList48.add(Byte.valueOf(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it24.next()).toString())));
                        }
                        string = arrayList48.toArray(new Byte[0]);
                    } else if (Intrinsics.areEqual(Boolean.class, cls4)) {
                        List listSplit$default25 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList49 = new ArrayList();
                        for (Object obj32 : listSplit$default25) {
                            if (((String) obj32).length() > 0) {
                                arrayList49.add(obj32);
                            }
                        }
                        ArrayList arrayList50 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList49, 10));
                        Iterator it25 = arrayList49.iterator();
                        while (it25.hasNext()) {
                            arrayList50.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt__StringsKt.trim((CharSequence) it25.next()).toString())));
                        }
                        string = arrayList50.toArray(new Boolean[0]);
                    } else if (Intrinsics.areEqual(Boolean.class, cls5)) {
                        List listSplit$default26 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList51 = new ArrayList();
                        for (Object obj33 : listSplit$default26) {
                            if (((String) obj33).length() > 0) {
                                arrayList51.add(obj33);
                            }
                        }
                        ArrayList arrayList52 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList51, 10));
                        Iterator it26 = arrayList51.iterator();
                        while (it26.hasNext()) {
                            arrayList52.add(Character.valueOf(StringsKt__StringsKt.trim((CharSequence) it26.next()).toString().charAt(0)));
                        }
                        string = arrayList52.toArray(new Character[0]);
                    } else if (Intrinsics.areEqual(Boolean.class, String[].class)) {
                        List listSplit$default27 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList53 = new ArrayList();
                        for (Object obj34 : listSplit$default27) {
                            if (((String) obj34).length() > 0) {
                                arrayList53.add(obj34);
                            }
                        }
                        string = arrayList53.toArray(new String[0]);
                    } else {
                        Object[] enumConstants3 = Boolean.class.getEnumConstants();
                        if (enumConstants3 != null) {
                            ArrayList arrayList54 = new ArrayList(enumConstants3.length);
                            for (Object obj35 : enumConstants3) {
                                Intrinsics.checkNotNull(obj35, "");
                                arrayList54.add((Enum) obj35);
                            }
                            Iterator it27 = arrayList54.iterator();
                            while (true) {
                                if (it27.hasNext()) {
                                    next = it27.next();
                                    if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            string = (Enum) next;
                        } else {
                            string = 0;
                        }
                        if (string == 0) {
                            if (zzaj.onNavigationEvent().onActivityLayout()) {
                                throw new IllegalArgumentException(Boolean.class.getSimpleName() + " is not supported");
                            }
                            string = 0;
                        }
                    }
                }
                bool = !(string instanceof Boolean) ? null : string;
            }
        } else {
            Bundle extras9 = intent3.getExtras();
            Object obj36 = extras9 != null ? extras9.get("showSmsGuide") : null;
            if (!(!(obj36 instanceof Boolean))) {
                obj = obj36;
            } else {
                int i19 = readTypedObject + 69;
                writeTypedObject = i19 % 128;
                int i20 = i19 % 2;
                obj = null;
            }
            bool = (Boolean) obj;
        }
        if (bool != null) {
            bool2 = bool;
        }
        this.IAuthTabCallback_Parcel = bool2.booleanValue();
        updateVisuals();
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return SchemeWithdrawAgreementActivity.this.new onExtraCallbackWithResult(access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((onExtraCallbackWithResult) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r17v0 */
        /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r17v2 */
        /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v26 */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r1v34 */
        /* JADX WARN: Type inference failed for: r1v35 */
        /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r1v60, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r1v70, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r1v75, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r1v80, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r1v82, types: [java.lang.Character] */
        /* JADX WARN: Type inference failed for: r1v84, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r1v85, types: [java.lang.Byte] */
        /* JADX WARN: Type inference failed for: r1v86, types: [java.lang.Short] */
        /* JADX WARN: Type inference failed for: r1v87, types: [java.lang.Double] */
        /* JADX WARN: Type inference failed for: r1v88, types: [java.lang.Float] */
        /* JADX WARN: Type inference failed for: r1v89, types: [java.lang.Long] */
        /* JADX WARN: Type inference failed for: r1v90 */
        /* JADX WARN: Type inference failed for: r1v91, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r3v1, types: [android.app.Activity, viva.republica.toss.account.agreement.SchemeWithdrawAgreementActivity] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objIAuthTabCallback;
            Bundle extras;
            ?? string;
            Object next;
            String stringExtra;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity = SchemeWithdrawAgreementActivity.this;
                String str = (String) SchemeWithdrawAgreementActivity.IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{schemeWithdrawAgreementActivity}, 2116348081, -2116348079, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
                this.label = 1;
                objIAuthTabCallback = SchemeWithdrawAgreementActivity.IAuthTabCallback(schemeWithdrawAgreementActivity, str, this);
                if (objIAuthTabCallback == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objIAuthTabCallback = obj;
            }
            TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (TabBarInfoQueryPointOnTabBarInfoQueryListener) objIAuthTabCallback;
            if (tabBarInfoQueryPointOnTabBarInfoQueryListener == null) {
                if (SchemeWithdrawAgreementActivity.onExtraCallback(SchemeWithdrawAgreementActivity.this).length() > 0) {
                    SessionTrackerb sessionTrackerbIAuthTabCallback = SchemeWithdrawAgreementActivity.this.IAuthTabCallback();
                    ?? r3 = SchemeWithdrawAgreementActivity.this;
                    SessionTrackerb.IAuthTabCallback(sessionTrackerbIAuthTabCallback, (Activity) r3, SchemeWithdrawAgreementActivity.onExtraCallback((SchemeWithdrawAgreementActivity) r3), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                }
                SchemeWithdrawAgreementActivity.this.finish();
            } else {
                if (issueCertV3.onTransact(tabBarInfoQueryPointOnTabBarInfoQueryListener) && SchemeWithdrawAgreementActivity.onExtraCallbackWithResult(SchemeWithdrawAgreementActivity.this, tabBarInfoQueryPointOnTabBarInfoQueryListener)) {
                    SchemeWithdrawAgreementActivity.this.finish();
                    return Unit.INSTANCE;
                }
                if (!tabBarInfoQueryPointOnTabBarInfoQueryListener.extraCommand().canInquiry()) {
                    SchemeWithdrawAgreementActivity.onWarmupCompleted(SchemeWithdrawAgreementActivity.this, tabBarInfoQueryPointOnTabBarInfoQueryListener.asInterface(), tabBarInfoQueryPointOnTabBarInfoQueryListener.bP_());
                } else if (tabBarInfoQueryPointOnTabBarInfoQueryListener.extraCommand() == TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult.OPEN_BANKING && ((stringExtra = SchemeWithdrawAgreementActivity.this.getIntent().getStringExtra("EXTRA_SESSION_ID")) == null || stringExtra.length() == 0)) {
                    SchemeWithdrawAgreementActivity.IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{SchemeWithdrawAgreementActivity.this, tabBarInfoQueryPointOnTabBarInfoQueryListener}, 40185526, -40185521, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
                } else {
                    SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity2 = SchemeWithdrawAgreementActivity.this;
                    long jNewSessionWithExtras = tabBarInfoQueryPointOnTabBarInfoQueryListener.newSessionWithExtras();
                    String strAsInterface = tabBarInfoQueryPointOnTabBarInfoQueryListener.asInterface();
                    String strBP_ = tabBarInfoQueryPointOnTabBarInfoQueryListener.bP_();
                    TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresultExtraCommand = tabBarInfoQueryPointOnTabBarInfoQueryListener.extraCommand();
                    Intent intent = SchemeWithdrawAgreementActivity.this.getIntent();
                    if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("agreementTitle")) {
                        if (zzbq.onNavigationEvent(intent)) {
                            Bundle extras2 = intent.getExtras();
                            if (extras2 != null && (string = extras2.getString("agreementTitle")) != 0) {
                                if (Intrinsics.areEqual(String.class, Integer.class)) {
                                    string = StringsKt__StringNumberConversionsKt.toIntOrNull(string);
                                } else if (Intrinsics.areEqual(String.class, Long.class)) {
                                    string = StringsKt__StringNumberConversionsKt.toLongOrNull(string);
                                } else if (Intrinsics.areEqual(String.class, Float.class)) {
                                    string = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string);
                                } else if (Intrinsics.areEqual(String.class, Double.class)) {
                                    string = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(string);
                                } else if (Intrinsics.areEqual(String.class, Short.class)) {
                                    string = StringsKt__StringNumberConversionsKt.toShortOrNull(string);
                                } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                                    string = StringsKt__StringNumberConversionsKt.toByteOrNull(string);
                                } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                                    string = access14000.onNavigationEvent(Boolean.parseBoolean(string));
                                } else {
                                    if (Intrinsics.areEqual(String.class, Character.class)) {
                                        string = access14000.onNavigationEvent(string.charAt(0));
                                    } else if (!Intrinsics.areEqual(String.class, String.class)) {
                                        if (Intrinsics.areEqual(String.class, Integer[].class)) {
                                            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj2 : listSplit$default) {
                                                if (((String) obj2).length() > 0) {
                                                    arrayList.add(obj2);
                                                }
                                            }
                                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                                            Iterator it = arrayList.iterator();
                                            while (it.hasNext()) {
                                                arrayList2.add(access14000.onNavigationEvent(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it.next()).toString())));
                                            }
                                            string = arrayList2.toArray(new Integer[0]);
                                        } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                                            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList3 = new ArrayList();
                                            for (Object obj3 : listSplit$default2) {
                                                if (((String) obj3).length() > 0) {
                                                    arrayList3.add(obj3);
                                                }
                                            }
                                            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                                            Iterator it2 = arrayList3.iterator();
                                            while (it2.hasNext()) {
                                                arrayList4.add(access14000.onExtraCallback(Long.parseLong(StringsKt__StringsKt.trim((CharSequence) it2.next()).toString())));
                                            }
                                            string = arrayList4.toArray(new Long[0]);
                                        } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                                            List listSplit$default3 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList5 = new ArrayList();
                                            for (Object obj4 : listSplit$default3) {
                                                if (((String) obj4).length() > 0) {
                                                    arrayList5.add(obj4);
                                                }
                                            }
                                            ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                                            Iterator it3 = arrayList5.iterator();
                                            while (it3.hasNext()) {
                                                arrayList6.add(access14000.onExtraCallbackWithResult(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it3.next()).toString())));
                                            }
                                            string = arrayList6.toArray(new Float[0]);
                                        } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                                            List listSplit$default4 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList7 = new ArrayList();
                                            for (Object obj5 : listSplit$default4) {
                                                if (((String) obj5).length() > 0) {
                                                    arrayList7.add(obj5);
                                                }
                                            }
                                            ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                                            Iterator it4 = arrayList7.iterator();
                                            while (it4.hasNext()) {
                                                arrayList8.add(access14000.onNavigationEvent(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it4.next()).toString())));
                                            }
                                            string = arrayList8.toArray(new Double[0]);
                                        } else if (Intrinsics.areEqual(String.class, Short[].class)) {
                                            List listSplit$default5 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList9 = new ArrayList();
                                            for (Object obj6 : listSplit$default5) {
                                                if (((String) obj6).length() > 0) {
                                                    arrayList9.add(obj6);
                                                }
                                            }
                                            ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList9, 10));
                                            Iterator it5 = arrayList9.iterator();
                                            while (it5.hasNext()) {
                                                arrayList10.add(access14000.onExtraCallback(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it5.next()).toString())));
                                            }
                                            string = arrayList10.toArray(new Short[0]);
                                        } else if (Intrinsics.areEqual(String.class, Byte[].class)) {
                                            List listSplit$default6 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList11 = new ArrayList();
                                            for (Object obj7 : listSplit$default6) {
                                                if (((String) obj7).length() > 0) {
                                                    arrayList11.add(obj7);
                                                }
                                            }
                                            ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList11, 10));
                                            Iterator it6 = arrayList11.iterator();
                                            while (it6.hasNext()) {
                                                arrayList12.add(access14000.IAuthTabCallback(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it6.next()).toString())));
                                            }
                                            string = arrayList12.toArray(new Byte[0]);
                                        } else if (Intrinsics.areEqual(String.class, Boolean[].class)) {
                                            List listSplit$default7 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList13 = new ArrayList();
                                            for (Object obj8 : listSplit$default7) {
                                                if (((String) obj8).length() > 0) {
                                                    arrayList13.add(obj8);
                                                }
                                            }
                                            ArrayList arrayList14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList13, 10));
                                            Iterator it7 = arrayList13.iterator();
                                            while (it7.hasNext()) {
                                                arrayList14.add(access14000.onNavigationEvent(Boolean.parseBoolean(StringsKt__StringsKt.trim((CharSequence) it7.next()).toString())));
                                            }
                                            string = arrayList14.toArray(new Boolean[0]);
                                        } else if (Intrinsics.areEqual(String.class, Character[].class)) {
                                            List listSplit$default8 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList15 = new ArrayList();
                                            for (Object obj9 : listSplit$default8) {
                                                if (((String) obj9).length() > 0) {
                                                    arrayList15.add(obj9);
                                                }
                                            }
                                            ArrayList arrayList16 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList15, 10));
                                            Iterator it8 = arrayList15.iterator();
                                            while (it8.hasNext()) {
                                                arrayList16.add(access14000.onNavigationEvent(StringsKt__StringsKt.trim((CharSequence) it8.next()).toString().charAt(0)));
                                            }
                                            string = arrayList16.toArray(new Character[0]);
                                        } else if (Intrinsics.areEqual(String.class, String[].class)) {
                                            List listSplit$default9 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList17 = new ArrayList();
                                            for (Object obj10 : listSplit$default9) {
                                                if (((String) obj10).length() > 0) {
                                                    arrayList17.add(obj10);
                                                }
                                            }
                                            string = arrayList17.toArray(new String[0]);
                                        } else {
                                            Object[] enumConstants = String.class.getEnumConstants();
                                            if (enumConstants != null) {
                                                ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                                for (Object obj11 : enumConstants) {
                                                    Intrinsics.checkNotNull(obj11, "");
                                                    arrayList18.add((Enum) obj11);
                                                }
                                                Iterator it9 = arrayList18.iterator();
                                                while (true) {
                                                    if (!it9.hasNext()) {
                                                        next = null;
                                                        break;
                                                    }
                                                    next = it9.next();
                                                    if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                                        break;
                                                    }
                                                }
                                                string = (Enum) next;
                                            } else {
                                                string = 0;
                                            }
                                            if (string == 0) {
                                                if (zzaj.onNavigationEvent().onActivityLayout()) {
                                                    throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                                                }
                                                string = 0;
                                            }
                                        }
                                    }
                                }
                                obj = (String) (string instanceof String ? string : null);
                            }
                        } else {
                            Bundle extras3 = intent.getExtras();
                            Object obj12 = extras3 != null ? extras3.get("agreementTitle") : null;
                            obj = (String) (obj12 instanceof String ? obj12 : null);
                        }
                    }
                    SchemeWithdrawAgreementActivity.onExtraCallback(schemeWithdrawAgreementActivity2, jNewSessionWithExtras, strAsInterface, strBP_, onextracallbackwithresultExtraCommand, null, obj == null ? _UrlKt.FRAGMENT_ENCODE_SET : obj, SchemeWithdrawAgreementActivity.this.getIntent().getStringExtra("titleType"), SchemeWithdrawAgreementActivity.IAuthTabCallbackDefault(SchemeWithdrawAgreementActivity.this), SchemeWithdrawAgreementActivity.asInterface(SchemeWithdrawAgreementActivity.this), SchemeWithdrawAgreementActivity.onWarmupCompleted(SchemeWithdrawAgreementActivity.this), SchemeWithdrawAgreementActivity.onNavigationEvent(SchemeWithdrawAgreementActivity.this), 16, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final getPackageType updateVisuals() {
        int i = 2 % 2;
        getPackageType getpackagetypeOnExtraCallback = onLoadStarted.onExtraCallback(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), null, null, new onExtraCallbackWithResult(null), 3, null);
        int i2 = readTypedObject + 39;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return getpackagetypeOnExtraCallback;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 47;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(access100[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getScrollBarSize() >> 8) + 17, 10973 - ((Process.getThreadPriority(0) + 20) >> 6), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(access000), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46135 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 31 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 20220 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 49123), 44 - TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 1495, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 43;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 49124), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43, 1494 - KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i9 = $11 + 63;
        $10 = i9 % 128;
        if (i9 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asBinder(Object[] objArr) {
        onExtraCallback onextracallback;
        SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity = (SchemeWithdrawAgreementActivity) objArr[0];
        String str = (String) objArr[1];
        access13800 access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i2 = onextracallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = readTypedObject + 99;
                writeTypedObject = i3 % 128;
                int i4 = i3 % 2;
                onextracallback.label = i2 - 2147483648;
            } else {
                onextracallback = schemeWithdrawAgreementActivity.new onExtraCallback(access13800Var);
            }
        }
        Object objOnExtraCallbackWithResult = onextracallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i5 = onextracallback.label;
        if (i5 != 0) {
            int i6 = writeTypedObject + 63;
            readTypedObject = i6 % 128;
            if (i6 % 2 == 0 ? i5 != 1 : i5 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) onextracallback.L$0;
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        } else {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted = PageShowPoint.Companion.onWarmupCompleted(str);
            if (tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted != null) {
                int i7 = readTypedObject + 47;
                writeTypedObject = i7 % 128;
                int i8 = i7 % 2;
                if (tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted.requestPostMessageChannelWithExtras()) {
                    tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted = null;
                }
                if (tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted != null) {
                    return tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted;
                }
            }
            onextracallback.L$0 = str;
            onextracallback.label = 1;
            objOnExtraCallbackWithResult = schemeWithdrawAgreementActivity.onExtraCallbackWithResult(str, onextracallback);
            if (objOnExtraCallbackWithResult == objOnExtraCallback) {
                int i9 = writeTypedObject + 61;
                readTypedObject = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 64 / 0;
                }
                return objOnExtraCallback;
            }
        }
        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (TabBarInfoQueryPointOnTabBarInfoQueryListener) objOnExtraCallbackWithResult;
        if (tabBarInfoQueryPointOnTabBarInfoQueryListener == null) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SchemeWithdrawAgreementActivity", "account not found (accountId: " + str + ")", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            return null;
        }
        if (!tabBarInfoQueryPointOnTabBarInfoQueryListener.requestPostMessageChannelWithExtras()) {
            return tabBarInfoQueryPointOnTabBarInfoQueryListener;
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SchemeWithdrawAgreementActivity", "account is already valid (accountId: " + str + ")", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        int i11 = readTypedObject + 113;
        writeTypedObject = i11 % 128;
        int i12 = i11 % 2;
        return null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super TabBarInfoQueryPointOnTabBarInfoQueryListener>, Object> {
        final /* synthetic */ String $accountId;
        int I$0;
        int I$1;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(String str, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$accountId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onNavigationEvent(this.$accountId, access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super TabBarInfoQueryPointOnTabBarInfoQueryListener> access13800Var) {
            return ((onNavigationEvent) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Result.Companion companion = Result.Companion;
                    JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnNavigationEvent = disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback.onNavigationEvent(true);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = setIndicatorY.onExtraCallbackWithResult(jsonReaderUnknownNumberParsingOnNavigationEvent, this);
                    if (obj == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                Result.m31constructorimpl(obj);
            } catch (WebResourceResponseModel e) {
                Result.Companion companion2 = Result.Companion;
                Result.m31constructorimpl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion3 = Result.Companion;
                Result.m31constructorimpl(ResultKt.createFailure(e3));
            }
            return PageShowPoint.Companion.onWarmupCompleted(this.$accountId);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(String str, access13800<? super TabBarInfoQueryPointOnTabBarInfoQueryListener> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 57;
        readTypedObject = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            int i4 = 24 / 0;
            if (access13800Var instanceof onWarmupCompleted) {
                int i5 = i2 + 109;
                readTypedObject = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = ((onWarmupCompleted) access13800Var).label;
                    obj.hashCode();
                    throw null;
                }
                onwarmupcompleted = (onWarmupCompleted) access13800Var;
                int i7 = onwarmupcompleted.label;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    onwarmupcompleted.label = i7 - 2147483648;
                } else {
                    onwarmupcompleted = new onWarmupCompleted(access13800Var);
                }
            }
        } else if (access13800Var instanceof onWarmupCompleted) {
        }
        Object objOnExtraCallback = onwarmupcompleted.result;
        Object objOnExtraCallback2 = access14100.onExtraCallback();
        int i8 = onwarmupcompleted.label;
        if (i8 != 0) {
            int i9 = readTypedObject + 119;
            writeTypedObject = i9 % 128;
            if (i9 % 2 != 0 ? i8 != 1 : i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        } else {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            BaseActivity.IAuthTabCallback(this, (String) null, false, 3, (Object) null);
            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            onNavigationEvent onnavigationevent = new onNavigationEvent(str, null);
            onwarmupcompleted.L$0 = access15400.onNavigationEvent(str);
            onwarmupcompleted.label = 1;
            objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onnavigationevent, onwarmupcompleted);
            if (objOnExtraCallback == objOnExtraCallback2) {
                int i10 = writeTypedObject + 9;
                readTypedObject = i10 % 128;
                int i11 = i10 % 2;
                return objOnExtraCallback2;
            }
        }
        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (TabBarInfoQueryPointOnTabBarInfoQueryListener) objOnExtraCallback;
        bo_();
        return tabBarInfoQueryPointOnTabBarInfoQueryListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean onExtraCallback(TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) {
        int i = 2 % 2;
        int i2 = readTypedObject + 125;
        writeTypedObject = i2 % 128;
        ComponentName component = null;
        if (i2 % 2 != 0) {
            String strPrefetch = tabBarInfoQueryPointOnTabBarInfoQueryListener.prefetch();
            if (strPrefetch == null) {
                return false;
            }
            Intent intentOnExtraCallback = IAuthTabCallback().onExtraCallback(this, strPrefetch);
            if (intentOnExtraCallback != null) {
                component = intentOnExtraCallback.getComponent();
                int i3 = writeTypedObject + 25;
                readTypedObject = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 5 / 2;
                }
            } else {
                int i5 = writeTypedObject + 93;
                readTypedObject = i5 % 128;
                int i6 = i5 % 2;
            }
            if (Intrinsics.areEqual(component, getComponentName())) {
                return false;
            }
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SchemeWithdrawAgreementActivity", "unexpected account: toss securities account", access8200.IAuthTabCallback(getWrite.IAuthTabCallback("withdrawAgreementScheme", strPrefetch)), (String) null, false, (String) null, 56, (Object) null);
            if (intentOnExtraCallback == null) {
                return true;
            }
            int i7 = writeTypedObject + 59;
            readTypedObject = i7 % 128;
            int i8 = i7 % 2;
            startActivity(intentOnExtraCallback);
            return true;
        }
        tabBarInfoQueryPointOnTabBarInfoQueryListener.prefetch();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(String str, String str2) throws Throwable {
        String str3;
        String str4;
        int i = 2 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = this.asBinder;
        overrideEventDispatcher overrideeventdispatcher = overrideEventDispatcher.onNavigationEvent;
        String string = SessionKnownType.REGISTER_BANK_ACCOUNT.toString();
        String str5 = "WITHDRAW_AGREEMENT_SCHEME_EXECUTION_ID:" + getIssuerAndSerialNumber.onNavigationEvent.onWarmupCompleted(UST_CMP_IssueCertificate_SendConf.BANK);
        String engagementSignalsCallback = setEngagementSignalsCallback();
        if (engagementSignalsCallback == null) {
            int i2 = readTypedObject + 123;
            writeTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 87 / 0;
            }
            str3 = _UrlKt.FRAGMENT_ENCODE_SET;
        } else {
            str3 = engagementSignalsCallback;
        }
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        String str6 = (String) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, -238421177, 238421181, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        if (str6 == null) {
            int i4 = readTypedObject + 37;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            str4 = _UrlKt.FRAGMENT_ENCODE_SET;
        } else {
            str4 = str6;
        }
        iEngagementSignalsCallback_Parcel.onNavigationEvent(overrideEventDispatcher.onExtraCallback(overrideeventdispatcher, this, string, "SV-WBA", (checkDeviceBrand) null, (String) null, false, (String) null, (String) null, (MobileCarrier) null, (String) null, (String) null, false, false, false, str3, str4, str5, false, Boolean.TRUE, false, (String) null, (String) null, str, str2, false, false, false, (String) null, false, (updateRuntimeShadowNodeReferencesOnCommit) null, 0L, 0L, false, false, false, false, false, (String) null, (String) null, -12959752, 127, (Object) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) throws Throwable {
        String str;
        String str2;
        int i = 2 % 2;
        this.asInterface = tabBarInfoQueryPointOnTabBarInfoQueryListener.newSessionWithExtras();
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = this.IAuthTabCallbackDefault;
        overrideEventDispatcher overrideeventdispatcher = overrideEventDispatcher.onNavigationEvent;
        String string = SessionKnownType.REGISTER_BANK_ACCOUNT.toString();
        String str3 = "WITHDRAW_AGREEMENT_SCHEME_EXECUTION_ID:" + getIssuerAndSerialNumber.onNavigationEvent.onWarmupCompleted(UST_CMP_IssueCertificate_SendConf.BANK);
        String engagementSignalsCallback = setEngagementSignalsCallback();
        if (engagementSignalsCallback == null) {
            int i2 = writeTypedObject + Imgproc.COLOR_YUV2RGB_YVYU;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        } else {
            str = engagementSignalsCallback;
        }
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        String str4 = (String) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, -238421177, 238421181, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        if (str4 == null) {
            int i4 = readTypedObject + Imgproc.COLOR_YUV2RGBA_YVYU;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        } else {
            str2 = str4;
        }
        iEngagementSignalsCallback_Parcel.onNavigationEvent(overrideEventDispatcher.onExtraCallback(overrideeventdispatcher, this, string, "SV-WBA", (checkDeviceBrand) null, (String) null, false, (String) null, (String) null, (MobileCarrier) null, (String) null, (String) null, false, false, false, str, str2, str3, false, Boolean.TRUE, false, (String) null, (String) null, tabBarInfoQueryPointOnTabBarInfoQueryListener.asInterface(), tabBarInfoQueryPointOnTabBarInfoQueryListener.bP_(), false, false, false, (String) null, false, (updateRuntimeShadowNodeReferencesOnCommit) null, 0L, 0L, false, false, false, false, false, (String) null, (String) null, -12959752, 127, (Object) null));
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 9;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = readTypedObject + 9;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        String string;
        boolean z;
        int i = 2 % 2;
        int i2 = readTypedObject + 115;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            string = schemeWithdrawAgreementActivity.getString(R.string.account_confirm_in_progress);
            Intrinsics.checkNotNullExpressionValue(string, "");
            z = true;
        } else {
            string = schemeWithdrawAgreementActivity.getString(R.string.account_confirm_in_progress);
            Intrinsics.checkNotNullExpressionValue(string, "");
            z = false;
        }
        schemeWithdrawAgreementActivity.onNavigationEvent(string, z);
        Unit unit = Unit.INSTANCE;
        int i3 = readTypedObject + 85;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final void onTransact(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 45;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        schemeWithdrawAgreementActivity.bo_();
        int i4 = readTypedObject + 103;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 43;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = writeTypedObject + 93;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 91;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = writeTypedObject + 21;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x055a, code lost:
    
        r12 = (java.lang.Enum) r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v30, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v38, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v41, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v61, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v70, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v79, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v86, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r12v87, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r12v88, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r12v89, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r12v90, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r12v91, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r12v92, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v93 */
    /* JADX WARN: Type inference failed for: r12v94, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r23v0, types: [android.app.Activity, java.lang.Object, viva.republica.toss.account.agreement.SchemeWithdrawAgreementActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity, long j, setDescriptionTextColor setdescriptiontextcolor) throws Throwable {
        Object obj;
        Bundle extras;
        ?? string;
        Object next;
        int i = 2 % 2;
        long jOnWarmupCompleted = setdescriptiontextcolor.onWarmupCompleted();
        int iOnExtraCallback = setdescriptiontextcolor.onExtraCallback();
        String strOnExtraCallbackWithResult = setdescriptiontextcolor.onExtraCallbackWithResult();
        TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = setdescriptiontextcolor.IAuthTabCallback();
        Intent intent = schemeWithdrawAgreementActivity.getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("agreementTitle")) {
            if (zzbq.onNavigationEvent(intent)) {
                int i2 = writeTypedObject + 21;
                readTypedObject = i2 % 128;
                if (i2 % 2 != 0) {
                    intent.getExtras();
                    throw null;
                }
                Bundle extras2 = intent.getExtras();
                if (extras2 != null && (string = extras2.getString("agreementTitle")) != 0) {
                    if (Intrinsics.areEqual(String.class, Integer.class)) {
                        string = StringsKt__StringNumberConversionsKt.toIntOrNull(string);
                    } else if (Intrinsics.areEqual(String.class, Long.class)) {
                        string = StringsKt__StringNumberConversionsKt.toLongOrNull(string);
                    } else if (Intrinsics.areEqual(String.class, Float.class)) {
                        string = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string);
                    } else if (Intrinsics.areEqual(String.class, Double.class)) {
                        int i3 = readTypedObject + 85;
                        writeTypedObject = i3 % 128;
                        int i4 = i3 % 2;
                        string = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(string);
                    } else if (Intrinsics.areEqual(String.class, Short.class)) {
                        string = StringsKt__StringNumberConversionsKt.toShortOrNull(string);
                    } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                        string = StringsKt__StringNumberConversionsKt.toByteOrNull(string);
                    } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                        string = Boolean.valueOf(Boolean.parseBoolean(string));
                    } else {
                        if (Intrinsics.areEqual(String.class, Character.class)) {
                            string = Character.valueOf(string.charAt(0));
                        } else if (!Intrinsics.areEqual(String.class, String.class)) {
                            if (Intrinsics.areEqual(String.class, Integer[].class)) {
                                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList = new ArrayList();
                                for (Object obj2 : listSplit$default) {
                                    if (((String) obj2).length() > 0) {
                                        arrayList.add(obj2);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it.next()).toString())));
                                }
                                string = arrayList2.toArray(new Integer[0]);
                            } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                                List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj3 : listSplit$default2) {
                                    if (((String) obj3).length() > 0) {
                                        arrayList3.add(obj3);
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(Long.valueOf(Long.parseLong(StringsKt__StringsKt.trim((CharSequence) it2.next()).toString())));
                                }
                                string = arrayList4.toArray(new Long[0]);
                            } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                                List listSplit$default3 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj4 : listSplit$default3) {
                                    if (((String) obj4).length() > 0) {
                                        arrayList5.add(obj4);
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                                Iterator it3 = arrayList5.iterator();
                                while (it3.hasNext()) {
                                    arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it3.next()).toString())));
                                }
                                string = arrayList6.toArray(new Float[0]);
                            } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                                List listSplit$default4 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj5 : listSplit$default4) {
                                    if (((String) obj5).length() > 0) {
                                        int i5 = writeTypedObject + Imgproc.COLOR_YUV2RGB_YVYU;
                                        readTypedObject = i5 % 128;
                                        if (i5 % 2 != 0) {
                                            arrayList7.add(obj5);
                                            int i6 = 37 / 0;
                                        } else {
                                            arrayList7.add(obj5);
                                        }
                                    }
                                }
                                ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                                Iterator it4 = arrayList7.iterator();
                                while (it4.hasNext()) {
                                    int i7 = writeTypedObject + 79;
                                    readTypedObject = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it4.next()).toString())));
                                        int i8 = 54 / 0;
                                    } else {
                                        arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it4.next()).toString())));
                                    }
                                }
                                string = arrayList8.toArray(new Double[0]);
                            } else if (Intrinsics.areEqual(String.class, Short[].class)) {
                                List listSplit$default5 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList9 = new ArrayList();
                                for (Object obj6 : listSplit$default5) {
                                    if (((String) obj6).length() > 0) {
                                        int i9 = readTypedObject + 97;
                                        writeTypedObject = i9 % 128;
                                        int i10 = i9 % 2;
                                        arrayList9.add(obj6);
                                    }
                                }
                                ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList9, 10));
                                Iterator it5 = arrayList9.iterator();
                                while (!(!it5.hasNext())) {
                                    arrayList10.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it5.next()).toString())));
                                }
                                string = arrayList10.toArray(new Short[0]);
                            } else if (Intrinsics.areEqual(String.class, Byte[].class)) {
                                List listSplit$default6 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList11 = new ArrayList();
                                for (Object obj7 : listSplit$default6) {
                                    if (((String) obj7).length() > 0) {
                                        arrayList11.add(obj7);
                                    }
                                }
                                ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList11, 10));
                                Iterator it6 = arrayList11.iterator();
                                while (it6.hasNext()) {
                                    arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it6.next()).toString())));
                                }
                                string = arrayList12.toArray(new Byte[0]);
                            } else if (Intrinsics.areEqual(String.class, Boolean[].class)) {
                                List listSplit$default7 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList13 = new ArrayList();
                                Iterator it7 = listSplit$default7.iterator();
                                while (it7.hasNext()) {
                                    int i11 = writeTypedObject + 41;
                                    readTypedObject = i11 % 128;
                                    if (i11 % 2 != 0) {
                                        ((String) it7.next()).length();
                                        throw null;
                                    }
                                    Object next2 = it7.next();
                                    if (((String) next2).length() > 0) {
                                        arrayList13.add(next2);
                                    }
                                }
                                ArrayList arrayList14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList13, 10));
                                Iterator it8 = arrayList13.iterator();
                                while (it8.hasNext()) {
                                    arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt__StringsKt.trim((CharSequence) it8.next()).toString())));
                                }
                                string = arrayList14.toArray(new Boolean[0]);
                            } else if (Intrinsics.areEqual(String.class, Character[].class)) {
                                List listSplit$default8 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList15 = new ArrayList();
                                for (Object obj8 : listSplit$default8) {
                                    if (((String) obj8).length() > 0) {
                                        arrayList15.add(obj8);
                                    }
                                }
                                ArrayList arrayList16 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList15, 10));
                                Iterator it9 = arrayList15.iterator();
                                while (it9.hasNext()) {
                                    arrayList16.add(Character.valueOf(StringsKt__StringsKt.trim((CharSequence) it9.next()).toString().charAt(0)));
                                }
                                string = arrayList16.toArray(new Character[0]);
                            } else if (Intrinsics.areEqual(String.class, String[].class)) {
                                List listSplit$default9 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList17 = new ArrayList();
                                for (Object obj9 : listSplit$default9) {
                                    if (((String) obj9).length() > 0) {
                                        arrayList17.add(obj9);
                                    }
                                }
                                string = arrayList17.toArray(new String[0]);
                            } else {
                                Object[] enumConstants = String.class.getEnumConstants();
                                if (enumConstants != null) {
                                    ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                    for (Object obj10 : enumConstants) {
                                        int i12 = writeTypedObject + 103;
                                        readTypedObject = i12 % 128;
                                        int i13 = i12 % 2;
                                        Intrinsics.checkNotNull(obj10, "");
                                        arrayList18.add((Enum) obj10);
                                    }
                                    Iterator it10 = arrayList18.iterator();
                                    while (true) {
                                        if (!it10.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        int i14 = writeTypedObject + 63;
                                        readTypedObject = i14 % 128;
                                        if (i14 % 2 != 0) {
                                            Intrinsics.areEqual(((Enum) it10.next()).name(), (Object) string);
                                            throw null;
                                        }
                                        next = it10.next();
                                        if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                            break;
                                        }
                                    }
                                } else {
                                    string = 0;
                                }
                                if (string == 0) {
                                    if (zzaj.onNavigationEvent().onActivityLayout()) {
                                        throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                                    }
                                    string = 0;
                                }
                            }
                        }
                    }
                    if (!(string instanceof String)) {
                        int i15 = readTypedObject + 99;
                        writeTypedObject = i15 % 128;
                        int i16 = i15 % 2;
                    } else {
                        obj = string;
                    }
                    obj = (String) obj;
                }
            } else {
                Bundle extras3 = intent.getExtras();
                Object obj11 = extras3 != null ? extras3.get("agreementTitle") : null;
                obj = (String) (obj11 instanceof String ? obj11 : null);
            }
        }
        if (obj == null) {
            int i17 = writeTypedObject + 49;
            readTypedObject = i17 % 128;
            int i18 = i17 % 2;
            obj = _UrlKt.FRAGMENT_ENCODE_SET;
        } else {
            obj = obj;
        }
        IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{schemeWithdrawAgreementActivity, Long.valueOf(jOnWarmupCompleted), String.valueOf(iOnExtraCallback), strOnExtraCallbackWithResult, onextracallbackwithresultIAuthTabCallback, Long.valueOf(j), obj, schemeWithdrawAgreementActivity.getIntent().getStringExtra("titleType"), Boolean.valueOf(((SchemeWithdrawAgreementActivity) schemeWithdrawAgreementActivity).IAuthTabCallback_Parcel), Boolean.valueOf(schemeWithdrawAgreementActivity.ICustomTabsServiceDefault()), schemeWithdrawAgreementActivity.setEngagementSignalsCallback(), (String) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{schemeWithdrawAgreementActivity}, -238421177, 238421181, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult())}, -792999914, 792999920, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity = (SchemeWithdrawAgreementActivity) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 27;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            schemeWithdrawAgreementActivity.finish();
            Unit unit = Unit.INSTANCE;
            int i3 = readTypedObject + 35;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        schemeWithdrawAgreementActivity.finish();
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(final SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity, Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, schemeWithdrawAgreementActivity, true, (initMiniApp) null, (Function0) null, new Function1() { // from class: viva.republica.toss.account.agreement.SchemeWithdrawAgreementActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SchemeWithdrawAgreementActivity.onWarmupCompleted(this.f$0, (DialogInterface) obj);
            }
        }, 12, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = readTypedObject + 109;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [im.toss.uikit.base.UIKitBaseActivity, viva.republica.toss.account.agreement.SchemeWithdrawAgreementActivity] */
    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        String stringExtra;
        String stringExtra2;
        TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresultExtraCommand;
        final ?? r0 = (SchemeWithdrawAgreementActivity) objArr[0];
        Intent intent = (Intent) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 45;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        final long longExtra = intent != null ? intent.getLongExtra("EXTRA_SESSION_ID", 0L) : 0L;
        if (intent == null || (stringExtra = intent.getStringExtra("EXTRA_BANK_CODE")) == null) {
            stringExtra = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if (intent == null || (stringExtra2 = intent.getStringExtra("EXTRA_ACCOUNT_NO")) == null) {
            stringExtra2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListenerOnExtraCallback = PageShowPoint.Companion.onExtraCallback(stringExtra, stringExtra2);
        if (tabBarInfoQueryPointOnTabBarInfoQueryListenerOnExtraCallback == null || (onextracallbackwithresultExtraCommand = tabBarInfoQueryPointOnTabBarInfoQueryListenerOnExtraCallback.extraCommand()) == null) {
            onextracallbackwithresultExtraCommand = TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult.UNDEFINED;
            int i4 = readTypedObject + 33;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        writeRaw writerawOnNavigationEvent = new ASN1SequenceParser(stringExtra2, stringExtra, onextracallbackwithresultExtraCommand).onNavigationEvent();
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.agreement.SchemeWithdrawAgreementActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr2 = {this.f$0, (deserializeUriNullableCollection) obj};
                int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
                return (Unit) SchemeWithdrawAgreementActivity.IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr2, -1093313818, 1093313818, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
            }
        };
        writeRaw writerawOnWarmupCompleted = writerawOnNavigationEvent.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.account.agreement.SchemeWithdrawAgreementActivity$$ExternalSyntheticLambda2
            @Override // o.deserializeFloat
            public final void accept(Object obj) {
                SchemeWithdrawAgreementActivity.asInterface(function1, obj);
            }
        }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.account.agreement.SchemeWithdrawAgreementActivity$$ExternalSyntheticLambda3
            @Override // o.deserializeDecimalCollection
            public final void run() {
                SchemeWithdrawAgreementActivity.IAuthTabCallback(this.f$0);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.agreement.SchemeWithdrawAgreementActivity$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SchemeWithdrawAgreementActivity.IAuthTabCallback(this.f$0, longExtra, (setDescriptionTextColor) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.account.agreement.SchemeWithdrawAgreementActivity$$ExternalSyntheticLambda5
            @Override // o.deserializeFloat
            public final void accept(Object obj) {
                SchemeWithdrawAgreementActivity.IAuthTabCallbackStub(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.account.agreement.SchemeWithdrawAgreementActivity$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SchemeWithdrawAgreementActivity.IAuthTabCallback(this.f$0, (Throwable) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawOnWarmupCompleted.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.account.agreement.SchemeWithdrawAgreementActivity$$ExternalSyntheticLambda7
            @Override // o.deserializeFloat
            public final void accept(Object obj) throws Throwable {
                SchemeWithdrawAgreementActivity.onWarmupCompleted(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        r0.onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
        int i6 = readTypedObject + 73;
        writeTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x060a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(Intent intent) throws Throwable {
        String stringExtra;
        TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresultExtraCommand;
        String str;
        Bundle extras;
        String string;
        Object obj;
        Object floatOrNull;
        Object obj2;
        String stringExtra2;
        int i = 2 % 2;
        long longExtra = intent != null ? intent.getLongExtra("EXTRA_SESSION_ID", 0L) : 0L;
        if (intent == null || (stringExtra = intent.getStringExtra("EXTRA_BANK_CODE")) == null) {
            stringExtra = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        String str2 = (intent == null || (stringExtra2 = intent.getStringExtra("EXTRA_ACCOUNT_NO")) == null) ? _UrlKt.FRAGMENT_ENCODE_SET : stringExtra2;
        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListenerOnExtraCallback = PageShowPoint.Companion.onExtraCallback(stringExtra, str2);
        if (tabBarInfoQueryPointOnTabBarInfoQueryListenerOnExtraCallback == null || (onextracallbackwithresultExtraCommand = tabBarInfoQueryPointOnTabBarInfoQueryListenerOnExtraCallback.extraCommand()) == null) {
            onextracallbackwithresultExtraCommand = TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult.UNDEFINED;
        }
        TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult = onextracallbackwithresultExtraCommand;
        long j = this.asInterface;
        Intent intent2 = getIntent();
        if (intent2 == null || (extras = intent2.getExtras()) == null || !extras.containsKey("agreementTitle")) {
            str = null;
        } else if (zzbq.onNavigationEvent(intent2)) {
            int i2 = readTypedObject + 103;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            Bundle extras2 = intent2.getExtras();
            if (extras2 != null && (string = extras2.getString("agreementTitle")) != null) {
                if (Intrinsics.areEqual(String.class, Integer.class)) {
                    floatOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(string);
                } else if (Intrinsics.areEqual(String.class, Long.class)) {
                    floatOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(string);
                } else {
                    if (!(!Intrinsics.areEqual(String.class, Float.class))) {
                        obj = null;
                        floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string);
                    } else if (Intrinsics.areEqual(String.class, Double.class)) {
                        floatOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(string);
                    } else if (Intrinsics.areEqual(String.class, Short.class)) {
                        floatOrNull = StringsKt__StringNumberConversionsKt.toShortOrNull(string);
                    } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                        floatOrNull = StringsKt__StringNumberConversionsKt.toByteOrNull(string);
                    } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                        floatOrNull = Boolean.valueOf(Boolean.parseBoolean(string));
                    } else {
                        if (Intrinsics.areEqual(String.class, Character.class)) {
                            floatOrNull = Character.valueOf(string.charAt(0));
                        } else {
                            floatOrNull = string;
                            if (!Intrinsics.areEqual(String.class, String.class)) {
                                if (Intrinsics.areEqual(String.class, Integer[].class)) {
                                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj3 : listSplit$default) {
                                        if (((String) obj3).length() > 0) {
                                            arrayList.add(obj3);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it.next()).toString())));
                                    }
                                    floatOrNull = arrayList2.toArray(new Integer[0]);
                                } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                                    List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList3 = new ArrayList();
                                    int i4 = writeTypedObject + 41;
                                    readTypedObject = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        int i5 = 2 / 2;
                                    }
                                    for (Object obj4 : listSplit$default2) {
                                        int i6 = readTypedObject + 125;
                                        writeTypedObject = i6 % 128;
                                        int i7 = i6 % 2;
                                        if (((String) obj4).length() > 0) {
                                            arrayList3.add(obj4);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                                    Iterator it2 = arrayList3.iterator();
                                    while (it2.hasNext()) {
                                        arrayList4.add(Long.valueOf(Long.parseLong(StringsKt__StringsKt.trim((CharSequence) it2.next()).toString())));
                                    }
                                    floatOrNull = arrayList4.toArray(new Long[0]);
                                } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                                    List listSplit$default3 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj5 : listSplit$default3) {
                                        if (((String) obj5).length() > 0) {
                                            int i8 = writeTypedObject + 75;
                                            readTypedObject = i8 % 128;
                                            if (i8 % 2 != 0) {
                                                arrayList5.add(obj5);
                                                int i9 = 32 / 0;
                                            } else {
                                                arrayList5.add(obj5);
                                            }
                                        }
                                    }
                                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                                    Iterator it3 = arrayList5.iterator();
                                    while (it3.hasNext()) {
                                        arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it3.next()).toString())));
                                    }
                                    floatOrNull = arrayList6.toArray(new Float[0]);
                                } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                                    List listSplit$default4 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList7 = new ArrayList();
                                    Iterator it4 = listSplit$default4.iterator();
                                    while (!(!it4.hasNext())) {
                                        Object next = it4.next();
                                        if (((String) next).length() > 0) {
                                            arrayList7.add(next);
                                        }
                                    }
                                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                                    Iterator it5 = arrayList7.iterator();
                                    while (it5.hasNext()) {
                                        arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it5.next()).toString())));
                                    }
                                    floatOrNull = arrayList8.toArray(new Double[0]);
                                } else if (Intrinsics.areEqual(String.class, Short[].class)) {
                                    List listSplit$default5 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList9 = new ArrayList();
                                    for (Object obj6 : listSplit$default5) {
                                        if (((String) obj6).length() > 0) {
                                            arrayList9.add(obj6);
                                        }
                                    }
                                    ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList9, 10));
                                    Iterator it6 = arrayList9.iterator();
                                    while (it6.hasNext()) {
                                        int i10 = readTypedObject + 83;
                                        writeTypedObject = i10 % 128;
                                        if (i10 % 2 == 0) {
                                            arrayList10.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it6.next()).toString())));
                                            throw null;
                                        }
                                        arrayList10.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it6.next()).toString())));
                                    }
                                    floatOrNull = arrayList10.toArray(new Short[0]);
                                } else if (Intrinsics.areEqual(String.class, Byte[].class)) {
                                    List listSplit$default6 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList11 = new ArrayList();
                                    for (Object obj7 : listSplit$default6) {
                                        if (((String) obj7).length() > 0) {
                                            arrayList11.add(obj7);
                                        }
                                    }
                                    ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList11, 10));
                                    Iterator it7 = arrayList11.iterator();
                                    while (it7.hasNext()) {
                                        int i11 = readTypedObject + 23;
                                        writeTypedObject = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it7.next()).toString())));
                                            throw null;
                                        }
                                        arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it7.next()).toString())));
                                    }
                                    floatOrNull = arrayList12.toArray(new Byte[0]);
                                } else if (Intrinsics.areEqual(String.class, Boolean[].class)) {
                                    List listSplit$default7 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList13 = new ArrayList();
                                    for (Object obj8 : listSplit$default7) {
                                        if (((String) obj8).length() > 0) {
                                            arrayList13.add(obj8);
                                        }
                                    }
                                    ArrayList arrayList14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList13, 10));
                                    Iterator it8 = arrayList13.iterator();
                                    while (it8.hasNext()) {
                                        arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt__StringsKt.trim((CharSequence) it8.next()).toString())));
                                    }
                                    floatOrNull = arrayList14.toArray(new Boolean[0]);
                                } else if (Intrinsics.areEqual(String.class, Character[].class)) {
                                    List listSplit$default8 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList15 = new ArrayList();
                                    for (Object obj9 : listSplit$default8) {
                                        int i12 = readTypedObject + 21;
                                        writeTypedObject = i12 % 128;
                                        int i13 = i12 % 2;
                                        if (((String) obj9).length() > 0) {
                                            arrayList15.add(obj9);
                                        }
                                    }
                                    ArrayList arrayList16 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList15, 10));
                                    Iterator it9 = arrayList15.iterator();
                                    while (it9.hasNext()) {
                                        int i14 = readTypedObject + 1;
                                        writeTypedObject = i14 % 128;
                                        int i15 = i14 % 2;
                                        arrayList16.add(Character.valueOf(StringsKt__StringsKt.trim((CharSequence) it9.next()).toString().charAt(0)));
                                    }
                                    floatOrNull = arrayList16.toArray(new Character[0]);
                                } else if (Intrinsics.areEqual(String.class, String[].class)) {
                                    List listSplit$default9 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList17 = new ArrayList();
                                    for (Object obj10 : listSplit$default9) {
                                        if (((String) obj10).length() > 0) {
                                            arrayList17.add(obj10);
                                        }
                                    }
                                    floatOrNull = arrayList17.toArray(new String[0]);
                                } else {
                                    Object[] enumConstants = String.class.getEnumConstants();
                                    if (enumConstants != null) {
                                        ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                        for (Object obj11 : enumConstants) {
                                            Intrinsics.checkNotNull(obj11, "");
                                            arrayList18.add((Enum) obj11);
                                        }
                                        Iterator it10 = arrayList18.iterator();
                                        while (true) {
                                            if (!it10.hasNext()) {
                                                obj = null;
                                                int i16 = writeTypedObject + 79;
                                                readTypedObject = i16 % 128;
                                                int i17 = i16 % 2;
                                                obj2 = null;
                                                break;
                                            }
                                            Object next2 = it10.next();
                                            if (Intrinsics.areEqual(((Enum) next2).name(), string)) {
                                                int i18 = readTypedObject + 95;
                                                writeTypedObject = i18 % 128;
                                                if (i18 % 2 == 0) {
                                                    throw null;
                                                }
                                                obj2 = next2;
                                                obj = null;
                                            }
                                        }
                                        floatOrNull = (Enum) obj2;
                                    } else {
                                        obj = null;
                                        floatOrNull = null;
                                    }
                                    if (floatOrNull == null) {
                                        if (zzaj.onNavigationEvent().onActivityLayout()) {
                                            throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                                        }
                                        floatOrNull = obj;
                                    }
                                }
                            }
                        }
                    }
                    if (floatOrNull instanceof String) {
                        obj = floatOrNull;
                    }
                    str = (String) obj;
                }
                obj = null;
                if (floatOrNull instanceof String) {
                }
                str = (String) obj;
            }
        } else {
            Bundle extras3 = intent2.getExtras();
            Object obj12 = extras3 != null ? extras3.get("agreementTitle") : null;
            str = (String) (obj12 instanceof String ? obj12 : null);
        }
        if (str == null) {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this, Long.valueOf(j), stringExtra, str2, onextracallbackwithresult, Long.valueOf(longExtra), str, getIntent().getStringExtra("titleType"), Boolean.valueOf(this.IAuthTabCallback_Parcel), Boolean.valueOf(ICustomTabsServiceDefault()), setEngagementSignalsCallback(), (String) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, -238421177, 238421181, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult())}, -792999914, 792999920, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    static /* synthetic */ void onExtraCallback(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity, long j, String str, String str2, TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult, Long l, String str3, String str4, boolean z, boolean z2, String str5, String str6, int i, Object obj) throws Throwable {
        Long l2;
        String str7;
        boolean z3;
        boolean z4;
        int i2 = 2 % 2;
        if ((i & 16) != 0) {
            int i3 = readTypedObject + 79;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            l2 = null;
        } else {
            l2 = l;
        }
        if ((i & 32) != 0) {
            int i5 = writeTypedObject + 111;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
            str7 = _UrlKt.FRAGMENT_ENCODE_SET;
        } else {
            str7 = str3;
        }
        String str8 = (i & 64) != 0 ? null : str4;
        if ((i & 128) != 0) {
            int i7 = writeTypedObject + 11;
            readTypedObject = i7 % 128;
            int i8 = i7 % 2;
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i & 256) != 0) {
            int i9 = readTypedObject + 79;
            writeTypedObject = i9 % 128;
            int i10 = i9 % 2;
            z4 = false;
        } else {
            z4 = z2;
        }
        IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{schemeWithdrawAgreementActivity, Long.valueOf(j), str, str2, onextracallbackwithresult, l2, str7, str8, Boolean.valueOf(z3), Boolean.valueOf(z4), str5, str6}, -792999914, 792999920, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        int i = 2 % 2;
        int i2 = readTypedObject + 77;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.finish();
        overridePendingTransition(0, 0);
        int i4 = writeTypedObject + 11;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{schemeWithdrawAgreementActivity, deserializeurinullablecollection}, -1093313818, 1093313818, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ String onExtraCallbackWithResult(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (String) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{schemeWithdrawAgreementActivity}, 2116348081, -2116348079, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ void onWarmupCompleted(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity, TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) throws Throwable {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{schemeWithdrawAgreementActivity, tabBarInfoQueryPointOnTabBarInfoQueryListener}, 40185526, -40185521, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult);
    }

    private final String validateRelationship() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (String) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, -238421177, 238421181, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult);
    }

    private final Object IAuthTabCallback(String str, access13800<? super TabBarInfoQueryPointOnTabBarInfoQueryListener> access13800Var) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this, str, access13800Var}, -1592717688, 1592717695, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult);
    }

    private final void onNavigationEvent(Intent intent) throws Throwable {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this, intent}, 228225292, -228225284, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult);
    }

    private static final Unit IAuthTabCallback(SchemeWithdrawAgreementActivity schemeWithdrawAgreementActivity, DialogInterface dialogInterface) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{schemeWithdrawAgreementActivity, dialogInterface}, -1663016386, 1663016387, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult);
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) throws Throwable {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{function1, obj}, -948299086, 948299089, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult);
    }

    private final void onNavigationEvent(long j, String str, String str2, TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult, Long l, String str3, String str4, boolean z, boolean z2, String str5, String str6) throws Throwable {
        Object[] objArr = {this, Long.valueOf(j), str, str2, onextracallbackwithresult, l, str3, str4, Boolean.valueOf(z), Boolean.valueOf(z2), str5, str6};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, -792999914, 792999920, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    @Override // viva.republica.toss.account.agreement.Hilt_SchemeWithdrawAgreementActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 47;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
        int i5 = writeTypedObject + 85;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.account.agreement.Hilt_SchemeWithdrawAgreementActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 119;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.account.agreement.Hilt_SchemeWithdrawAgreementActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = readTypedObject + 29;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = readTypedObject + 13;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
    }

    @Override // viva.republica.toss.account.agreement.Hilt_SchemeWithdrawAgreementActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 21;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
    }

    static void onNavigationEvent() {
        access100 = new char[]{14585, 62731, 41767, 20801, 3949, 15744, 60336, 39354};
        access000 = 6462634190210539569L;
    }
}
