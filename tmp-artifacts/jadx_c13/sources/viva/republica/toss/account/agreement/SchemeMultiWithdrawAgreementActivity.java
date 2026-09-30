package viva.republica.toss.account.agreement;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.base.BaseActivity;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CollectPerformancePoint;
import o.GeckoHubImp;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.SessionTrackerb;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda1;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14100;
import o.access15400;
import o.deserializeIntNullableCollection;
import o.disableOldAndroidAttachmentMetricsWorkarounds;
import o.findResAndMsg;
import o.getPackageType;
import o.maybeUpdateAnimatable;
import o.onLoadStarted;
import o.onPageExit;
import o.putChannelInfo;
import o.setDoubleTapZoomDpi;
import o.writeRaw;
import o.zzaj;
import o.zzbq;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.account.register.MultiAccountAgreementActivity;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class SchemeMultiWithdrawAgreementActivity extends Hilt_SchemeMultiWithdrawAgreementActivity {
    public static final onNavigationEvent Companion;
    public static final int IAuthTabCallbackStub;
    private static long IAuthTabCallback_Parcel;
    private static char[] getInterfaceDescriptor;
    private static int readTypedObject;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {52, -107, 59, -11};
    private static final int $$b = 65;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int extraCallbackWithResult = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int writeTypedObject = 1;
    private final Lazy asInterface = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: viva.republica.toss.account.agreement.SchemeMultiWithdrawAgreementActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SchemeMultiWithdrawAgreementActivity.onExtraCallback(this.f$0);
        }
    });
    private final Lazy access100 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: viva.republica.toss.account.agreement.SchemeMultiWithdrawAgreementActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(SchemeMultiWithdrawAgreementActivity.IAuthTabCallback(this.f$0));
        }
    });
    private final Lazy onTransact = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: viva.republica.toss.account.agreement.SchemeMultiWithdrawAgreementActivity$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.f$0};
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            return (String) SchemeMultiWithdrawAgreementActivity.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 15927051, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, -15927049);
        }
    });
    private final Lazy asBinder = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: viva.republica.toss.account.agreement.SchemeMultiWithdrawAgreementActivity$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SchemeMultiWithdrawAgreementActivity.onWarmupCompleted(this.f$0);
        }
    });
    private final Lazy access000 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: viva.republica.toss.account.agreement.SchemeMultiWithdrawAgreementActivity$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SchemeMultiWithdrawAgreementActivity.onNavigationEvent(this.f$0);
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallbackDefault = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.account.agreement.SchemeMultiWithdrawAgreementActivity$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Object[] objArr = {this.f$0, (IEngagementSignalsCallbackDefault) obj};
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            return (Unit) SchemeMultiWithdrawAgreementActivity.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1706634649, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, -1706634649);
        }
    });

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SchemeMultiWithdrawAgreementActivity.onNavigationEvent(SchemeMultiWithdrawAgreementActivity.this, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, byte b3) {
        int i;
        int i2 = 3 - (b2 * 2);
        int i3 = b3 * 4;
        byte[] bArr = $$a;
        int i4 = 97 - (b * 3);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i5 = i3;
            i = 0;
            i4 += i5;
            i2++;
            bArr2[i] = (byte) i4;
            if (i == i3) {
                return new String(bArr2, 0);
            }
            i5 = bArr[i2];
            i++;
            i4 += i5;
            i2++;
            bArr2[i] = (byte) i4;
            if (i == i3) {
            }
        } else {
            i = 0;
            i2++;
            bArr2[i] = (byte) i4;
            if (i == i3) {
            }
        }
    }

    static {
        readTypedObject = 0;
        IAuthTabCallback();
        Companion = new onNavigationEvent(null);
        IAuthTabCallbackStub = 8;
        int i = extraCallbackWithResult + 29;
        readTypedObject = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ boolean IAuthTabCallback(SchemeMultiWithdrawAgreementActivity schemeMultiWithdrawAgreementActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 113;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder(schemeMultiWithdrawAgreementActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zAsBinder = asBinder(schemeMultiWithdrawAgreementActivity);
        int i3 = writeTypedObject + 15;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return zAsBinder;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = (~(i7 | i3)) | (~(i6 | i3));
        int i9 = i6 | i5;
        int i10 = (~(i5 | (~i3))) | (~(i7 | (~i6))) | (~i9);
        int i11 = i6 + i3 + i2 + (1350191703 * i4) + ((-44904237) * i);
        int i12 = i11 * i11;
        int i13 = ((i6 * (-560584373)) - 948043776) + ((-560584373) * i3) + ((-826660534) * i8) + (i9 * 826660534) + (826660534 * i10) + (266076160 * i2) + ((-71041024) * i4) + ((-766246912) * i) + (1339949056 * i12);
        int i14 = (i6 * 1657715387) + 2046152777 + (i3 * 1657715387) + (i8 * (-918)) + (i9 * 918) + (i10 * 918) + (i2 * 1657716305) + (i4 * 1507858311) + (i * 1845144771) + (i12 * 155058176);
        int i15 = i13 + (i14 * i14 * 417464320);
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        SchemeMultiWithdrawAgreementActivity schemeMultiWithdrawAgreementActivity = (SchemeMultiWithdrawAgreementActivity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(schemeMultiWithdrawAgreementActivity, iEngagementSignalsCallbackDefault);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(schemeMultiWithdrawAgreementActivity, iEngagementSignalsCallbackDefault);
        int i3 = IAuthTabCallbackStubProxy + 19;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ String onExtraCallback(SchemeMultiWithdrawAgreementActivity schemeMultiWithdrawAgreementActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String strOnTransact = onTransact(schemeMultiWithdrawAgreementActivity);
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        int i5 = writeTypedObject + 11;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return strOnTransact;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        SchemeMultiWithdrawAgreementActivity schemeMultiWithdrawAgreementActivity = (SchemeMultiWithdrawAgreementActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStub(schemeMultiWithdrawAgreementActivity);
        }
        IAuthTabCallbackStub(schemeMultiWithdrawAgreementActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String onNavigationEvent(SchemeMultiWithdrawAgreementActivity schemeMultiWithdrawAgreementActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 25;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackDefault = IAuthTabCallbackDefault(schemeMultiWithdrawAgreementActivity);
        int i4 = writeTypedObject + 101;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return strIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ String onWarmupCompleted(SchemeMultiWithdrawAgreementActivity schemeMultiWithdrawAgreementActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            asInterface(schemeMultiWithdrawAgreementActivity);
            throw null;
        }
        String strAsInterface = asInterface(schemeMultiWithdrawAgreementActivity);
        int i3 = writeTypedObject + 21;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 5 / 0;
        }
        return strAsInterface;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return -1L;
        }
        int i3 = 78 / 0;
        return -1L;
    }

    public static final /* synthetic */ Object onNavigationEvent(SchemeMultiWithdrawAgreementActivity schemeMultiWithdrawAgreementActivity, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = schemeMultiWithdrawAgreementActivity.onExtraCallbackWithResult((access13800<? super List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener>>) access13800Var);
        int i4 = writeTypedObject + 35;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(SchemeMultiWithdrawAgreementActivity schemeMultiWithdrawAgreementActivity, List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        schemeMultiWithdrawAgreementActivity.IAuthTabCallback((List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener>) list);
        int i4 = IAuthTabCallbackStubProxy + 11;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public final SessionTrackerb onNavigationEvent() {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 93;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            return null;
        }
        int i5 = i2 + 81;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return sessionTrackerb;
    }

    private final String ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = (String) this.asInterface.getValue();
        int i3 = writeTypedObject + 81;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String onTransact(SchemeMultiWithdrawAgreementActivity schemeMultiWithdrawAgreementActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = schemeMultiWithdrawAgreementActivity.getIntent().getStringExtra("redirectURL");
        if (stringExtra != null) {
            return stringExtra;
        }
        int i4 = writeTypedObject + 9;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        SchemeMultiWithdrawAgreementActivity schemeMultiWithdrawAgreementActivity = (SchemeMultiWithdrawAgreementActivity) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) schemeMultiWithdrawAgreementActivity.access100.getValue()).booleanValue();
        int i4 = writeTypedObject + 25;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        int i5 = 9 / 0;
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String IAuthTabCallbackStub(SchemeMultiWithdrawAgreementActivity schemeMultiWithdrawAgreementActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = schemeMultiWithdrawAgreementActivity.getIntent();
        if (i3 != 0) {
            intent.getStringExtra("mainTitle");
            throw null;
        }
        String stringExtra = intent.getStringExtra("mainTitle");
        if (stringExtra != null) {
            return stringExtra;
        }
        int i4 = writeTypedObject + 103;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return _UrlKt.FRAGMENT_ENCODE_SET;
    }

    private final String setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onTransact.getValue();
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
        return str;
    }

    private final String ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 1;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.asBinder.getValue();
        int i4 = writeTypedObject + 43;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String asInterface(SchemeMultiWithdrawAgreementActivity schemeMultiWithdrawAgreementActivity) throws Throwable {
        int i = 2 % 2;
        Intent intent = schemeMultiWithdrawAgreementActivity.getIntent();
        int mirror = '0' - AndroidCharacter.getMirror('0');
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        Object[] objArr = new Object[1];
        a(mirror, TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 8, (char) (30275 - Color.argb(0, 0, 0, 0)), objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        if (stringExtra == null) {
            int i2 = IAuthTabCallbackStubProxy + 83;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
        } else {
            str = stringExtra;
        }
        int i4 = writeTypedObject + 89;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String IAuthTabCallbackDefault(SchemeMultiWithdrawAgreementActivity schemeMultiWithdrawAgreementActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = schemeMultiWithdrawAgreementActivity.getIntent().getStringExtra("serviceReferrer");
        if (stringExtra == null) {
            stringExtra = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        int i4 = IAuthTabCallbackStubProxy + 73;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return stringExtra;
        }
        throw null;
    }

    private final String updateVisuals() {
        String str;
        int i = 2 % 2;
        int i2 = writeTypedObject + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            str = (String) this.access000.getValue();
            int i3 = 56 / 0;
        } else {
            str = (String) this.access000.getValue();
        }
        int i4 = IAuthTabCallbackStubProxy + 67;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(SchemeMultiWithdrawAgreementActivity schemeMultiWithdrawAgreementActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            iEngagementSignalsCallbackDefault.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            if (schemeMultiWithdrawAgreementActivity.ICustomTabsServiceStub().length() > 0) {
                int i3 = IAuthTabCallbackStubProxy + 11;
                writeTypedObject = i3 % 128;
                int i4 = i3 % 2;
                SessionTrackerb.IAuthTabCallback(schemeMultiWithdrawAgreementActivity.onNavigationEvent(), schemeMultiWithdrawAgreementActivity, schemeMultiWithdrawAgreementActivity.ICustomTabsServiceStub(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            }
            schemeMultiWithdrawAgreementActivity.setResult(-1, iEngagementSignalsCallbackDefault.onExtraCallbackWithResult());
        }
        setDoubleTapZoomDpi.onNavigationEvent(setDoubleTapZoomDpi.IAuthTabCallback, schemeMultiWithdrawAgreementActivity, 0L, 1, (Object) null);
        return Unit.INSTANCE;
    }

    @Override // viva.republica.toss.account.agreement.Hilt_SchemeMultiWithdrawAgreementActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback3 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int i4 = IAuthTabCallbackStubProxy + 87;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return SchemeMultiWithdrawAgreementActivity.this.new IAuthTabCallback(access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((IAuthTabCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                SchemeMultiWithdrawAgreementActivity schemeMultiWithdrawAgreementActivity = SchemeMultiWithdrawAgreementActivity.this;
                this.label = 1;
                obj = SchemeMultiWithdrawAgreementActivity.onNavigationEvent(schemeMultiWithdrawAgreementActivity, this);
                if (obj == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            SchemeMultiWithdrawAgreementActivity.onWarmupCompleted(SchemeMultiWithdrawAgreementActivity.this, (List) obj);
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        SchemeMultiWithdrawAgreementActivity schemeMultiWithdrawAgreementActivity = (SchemeMultiWithdrawAgreementActivity) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        getPackageType getpackagetypeOnExtraCallback = onLoadStarted.onExtraCallback(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(schemeMultiWithdrawAgreementActivity), null, null, schemeMultiWithdrawAgreementActivity.new IAuthTabCallback(null), 3, null);
        int i2 = writeTypedObject + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return getpackagetypeOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener>>, Object> {
        int I$0;
        int I$1;
        Object L$0;
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener>> access13800Var) {
            return ((onExtraCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallback(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM31constructorimpl;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Result.Companion companion = Result.Companion;
                    writeRaw writerawOnWarmupCompleted = disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback.IAuthTabCallback(true).onWarmupCompleted(new deserializeIntNullableCollection(onExtraCallbackWithResult.onNavigationEvent) { // from class: viva.republica.toss.account.agreement.SchemeMultiWithdrawAgreementActivity.onWarmupCompleted
                        private final /* synthetic */ Function1 onExtraCallback;

                        {
                            Intrinsics.checkNotNullParameter(function1, "");
                            this.onExtraCallback = function1;
                        }

                        @Override // o.deserializeIntNullableCollection
                        public final /* synthetic */ Object apply(Object obj2) {
                            return this.onExtraCallback.invoke(obj2);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = RxAwaitKt.onWarmupCompleted(writerawOnWarmupCompleted, this);
                    if (obj == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                objM31constructorimpl = Result.m31constructorimpl(obj);
            } catch (WebResourceResponseModel e) {
                Result.Companion companion2 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion3 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e3));
            }
            return Result.onExtraCallback(objM31constructorimpl) ? CollectionsKt__CollectionsKt.emptyList() : objM31constructorimpl;
        }

        static final class onExtraCallbackWithResult implements Function1<CollectPerformancePoint, List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener>> {
            public static final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();

            onExtraCallbackWithResult() {
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final List<TabBarInfoQueryPointOnTabBarInfoQueryListener> invoke(CollectPerformancePoint collectPerformancePoint) {
                Intrinsics.checkNotNullParameter(collectPerformancePoint, "");
                List listOnNavigationEvent = collectPerformancePoint.onNavigationEvent();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listOnNavigationEvent) {
                    if (((TabBarInfoQueryPointOnTabBarInfoQueryListener) obj).receiveFile()) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(access13800<? super List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener>> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = access13800Var instanceof onExtraCallbackWithResult;
            throw null;
        }
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i3 = onextracallbackwithresult.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = writeTypedObject + 83;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 != 0) {
                    onextracallbackwithresult.label = i3 - Integer.MIN_VALUE;
                } else {
                    onextracallbackwithresult.label = i3 - 2147483648;
                }
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object objOnExtraCallback = onextracallbackwithresult.result;
        Object objOnExtraCallback2 = access14100.onExtraCallback();
        int i5 = onextracallbackwithresult.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            BaseActivity.IAuthTabCallback(this, (String) null, false, 3, (Object) null);
            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            onExtraCallback onextracallback = new onExtraCallback(null);
            onextracallbackwithresult.label = 1;
            objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallback, onextracallbackwithresult);
            if (objOnExtraCallback == objOnExtraCallback2) {
                return objOnExtraCallback2;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = writeTypedObject + 107;
            IAuthTabCallbackStubProxy = i6 % 128;
            if (i6 % 2 != 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                throw null;
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
            int i7 = writeTypedObject + 45;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
        }
        List list = (List) objOnExtraCallback;
        bo_();
        Intrinsics.checkNotNull(list);
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener> list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        MultiAccountAgreementActivity.onNavigationEvent onnavigationevent = MultiAccountAgreementActivity.Companion;
        TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult = TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult.MYDATA;
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback3 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        this.IAuthTabCallbackDefault.onNavigationEvent(onnavigationevent.onExtraCallbackWithResult(this, list, onextracallbackwithresult, false, ((Boolean) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, 338829593, iOnExtraCallback3, iOnExtraCallback, -338829590)).booleanValue(), setEngagementSignalsCallback(), ICustomTabsServiceDefault(), updateVisuals()));
        int i4 = IAuthTabCallbackStubProxy + 89;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.app.Activity, viva.republica.toss.account.agreement.SchemeMultiWithdrawAgreementActivity] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v42, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v44, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v48, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r6v49, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v50, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r6v51, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r6v52, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
    private static final boolean asBinder(SchemeMultiWithdrawAgreementActivity schemeMultiWithdrawAgreementActivity) {
        Bundle extras;
        ?? string;
        Object next;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = schemeMultiWithdrawAgreementActivity.getIntent();
        ?? r1 = Boolean.TRUE;
        if (intent != null && (extras = intent.getExtras()) != null) {
            int i4 = writeTypedObject + 33;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            if (extras.containsKey("showSMSGuide")) {
                if (zzbq.onNavigationEvent(intent)) {
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null && (string = extras2.getString("showSMSGuide")) != 0) {
                        if (Intrinsics.areEqual(Boolean.class, Integer.class)) {
                            string = StringsKt__StringNumberConversionsKt.toIntOrNull(string);
                        } else if (Intrinsics.areEqual(Boolean.class, Long.class)) {
                            string = StringsKt__StringNumberConversionsKt.toLongOrNull(string);
                        } else if (!(!Intrinsics.areEqual(Boolean.class, Float.class))) {
                            string = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string);
                        } else if (Intrinsics.areEqual(Boolean.class, Double.class)) {
                            int i6 = writeTypedObject + 109;
                            IAuthTabCallbackStubProxy = i6 % 128;
                            if (i6 % 2 != 0) {
                                StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(string);
                                throw null;
                            }
                            string = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(string);
                        } else if (Intrinsics.areEqual(Boolean.class, Short.class)) {
                            string = StringsKt__StringNumberConversionsKt.toShortOrNull(string);
                        } else if (Intrinsics.areEqual(Boolean.class, Byte.class)) {
                            string = StringsKt__StringNumberConversionsKt.toByteOrNull(string);
                        } else if (Intrinsics.areEqual(Boolean.class, Boolean.class)) {
                            int i7 = writeTypedObject + 39;
                            IAuthTabCallbackStubProxy = i7 % 128;
                            int i8 = i7 % 2;
                            string = Boolean.valueOf(Boolean.parseBoolean(string));
                        } else {
                            if (Intrinsics.areEqual(Boolean.class, Character.class)) {
                                string = Character.valueOf(string.charAt(0));
                            } else if (!Intrinsics.areEqual(Boolean.class, String.class)) {
                                if (Intrinsics.areEqual(Boolean.class, Integer[].class)) {
                                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj : listSplit$default) {
                                        if (((String) obj).length() > 0) {
                                            arrayList.add(obj);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it.next()).toString())));
                                    }
                                    string = arrayList2.toArray(new Integer[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Long[].class)) {
                                    List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj2 : listSplit$default2) {
                                        if (((String) obj2).length() > 0) {
                                            int i9 = IAuthTabCallbackStubProxy + 71;
                                            writeTypedObject = i9 % 128;
                                            int i10 = i9 % 2;
                                            arrayList3.add(obj2);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                                    Iterator it2 = arrayList3.iterator();
                                    while (it2.hasNext()) {
                                        arrayList4.add(Long.valueOf(Long.parseLong(StringsKt__StringsKt.trim((CharSequence) it2.next()).toString())));
                                    }
                                    string = arrayList4.toArray(new Long[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Float[].class)) {
                                    List listSplit$default3 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj3 : listSplit$default3) {
                                        int i11 = IAuthTabCallbackStubProxy + 19;
                                        writeTypedObject = i11 % 128;
                                        int i12 = i11 % 2;
                                        if (((String) obj3).length() > 0) {
                                            arrayList5.add(obj3);
                                        }
                                    }
                                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                                    Iterator it3 = arrayList5.iterator();
                                    while (it3.hasNext()) {
                                        int i13 = IAuthTabCallbackStubProxy + 77;
                                        writeTypedObject = i13 % 128;
                                        if (i13 % 2 == 0) {
                                            arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it3.next()).toString())));
                                            throw null;
                                        }
                                        arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it3.next()).toString())));
                                    }
                                    string = arrayList6.toArray(new Float[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Double[].class)) {
                                    List listSplit$default4 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList7 = new ArrayList();
                                    for (Object obj4 : listSplit$default4) {
                                        if (((String) obj4).length() > 0) {
                                            arrayList7.add(obj4);
                                        }
                                    }
                                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                                    Iterator it4 = arrayList7.iterator();
                                    while (!(!it4.hasNext())) {
                                        arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it4.next()).toString())));
                                    }
                                    string = arrayList8.toArray(new Double[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Short[].class)) {
                                    List listSplit$default5 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList9 = new ArrayList();
                                    Iterator it5 = listSplit$default5.iterator();
                                    while (it5.hasNext()) {
                                        int i14 = IAuthTabCallbackStubProxy + 111;
                                        writeTypedObject = i14 % 128;
                                        if (i14 % 2 == 0) {
                                            ((String) it5.next()).length();
                                            obj.hashCode();
                                            throw null;
                                        }
                                        Object next2 = it5.next();
                                        if (((String) next2).length() > 0) {
                                            arrayList9.add(next2);
                                        }
                                    }
                                    ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList9, 10));
                                    Iterator it6 = arrayList9.iterator();
                                    while (it6.hasNext()) {
                                        arrayList10.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it6.next()).toString())));
                                    }
                                    string = arrayList10.toArray(new Short[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Byte[].class)) {
                                    List listSplit$default6 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList11 = new ArrayList();
                                    for (Object obj5 : listSplit$default6) {
                                        int i15 = IAuthTabCallbackStubProxy + 73;
                                        writeTypedObject = i15 % 128;
                                        int i16 = i15 % 2;
                                        if (((String) obj5).length() > 0) {
                                            arrayList11.add(obj5);
                                        }
                                    }
                                    ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList11, 10));
                                    Iterator it7 = arrayList11.iterator();
                                    while (it7.hasNext()) {
                                        arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it7.next()).toString())));
                                    }
                                    string = arrayList12.toArray(new Byte[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Boolean[].class)) {
                                    List listSplit$default7 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList13 = new ArrayList();
                                    Iterator it8 = listSplit$default7.iterator();
                                    while (!(!it8.hasNext())) {
                                        Object next3 = it8.next();
                                        if (((String) next3).length() > 0) {
                                            arrayList13.add(next3);
                                        }
                                    }
                                    ArrayList arrayList14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList13, 10));
                                    Iterator it9 = arrayList13.iterator();
                                    while (it9.hasNext()) {
                                        arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt__StringsKt.trim((CharSequence) it9.next()).toString())));
                                    }
                                    string = arrayList14.toArray(new Boolean[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Character[].class)) {
                                    List listSplit$default8 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList15 = new ArrayList();
                                    for (Object obj6 : listSplit$default8) {
                                        int i17 = IAuthTabCallbackStubProxy + 55;
                                        writeTypedObject = i17 % 128;
                                        int i18 = i17 % 2;
                                        if (((String) obj6).length() > 0) {
                                            arrayList15.add(obj6);
                                        }
                                    }
                                    ArrayList arrayList16 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList15, 10));
                                    Iterator it10 = arrayList15.iterator();
                                    while (it10.hasNext()) {
                                        arrayList16.add(Character.valueOf(StringsKt__StringsKt.trim((CharSequence) it10.next()).toString().charAt(0)));
                                    }
                                    string = arrayList16.toArray(new Character[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, String[].class)) {
                                    List listSplit$default9 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList17 = new ArrayList();
                                    for (Object obj7 : listSplit$default9) {
                                        if (((String) obj7).length() > 0) {
                                            arrayList17.add(obj7);
                                        }
                                    }
                                    string = arrayList17.toArray(new String[0]);
                                } else {
                                    Object[] enumConstants = Boolean.class.getEnumConstants();
                                    if (enumConstants != null) {
                                        ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                        for (Object obj8 : enumConstants) {
                                            Intrinsics.checkNotNull(obj8, "");
                                            arrayList18.add((Enum) obj8);
                                        }
                                        Iterator it11 = arrayList18.iterator();
                                        while (true) {
                                            if (!it11.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it11.next();
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
                                            throw new IllegalArgumentException(Boolean.class.getSimpleName() + " is not supported");
                                        }
                                        string = 0;
                                    }
                                }
                            }
                        }
                        obj = (Boolean) (string instanceof Boolean ? string : null);
                    }
                } else {
                    Bundle extras3 = intent.getExtras();
                    Object obj9 = extras3 != null ? extras3.get("showSMSGuide") : null;
                    obj = (Boolean) (obj9 instanceof Boolean ? obj9 : null);
                }
            }
        }
        if (obj != null) {
            r1 = obj;
        }
        return r1.booleanValue();
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(getInterfaceDescriptor[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 59697), 17 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 10973 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(IAuthTabCallback_Parcel), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - Color.green(0)), ImageFormat.getBitsPerPixel(0) + 32, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 20219, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49122), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i5 = $11 + 81;
                $10 = i5 % 128;
                int i6 = i5 % 2;
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
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET)), 44 - TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), 1494 - (Process.myPid() >> 22), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i7 = $10 + 7;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr);
    }

    public static /* synthetic */ String onExtraCallbackWithResult(SchemeMultiWithdrawAgreementActivity schemeMultiWithdrawAgreementActivity) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback3 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (String) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{schemeMultiWithdrawAgreementActivity}, iOnExtraCallback2, 15927051, iOnExtraCallback3, iOnExtraCallback, -15927049);
    }

    public static /* synthetic */ Unit onExtraCallback(SchemeMultiWithdrawAgreementActivity schemeMultiWithdrawAgreementActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback3 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{schemeMultiWithdrawAgreementActivity, iEngagementSignalsCallbackDefault}, iOnExtraCallback2, 1706634649, iOnExtraCallback3, iOnExtraCallback, -1706634649);
    }

    private final boolean validateRelationship() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback3 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return ((Boolean) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, 338829593, iOnExtraCallback3, iOnExtraCallback, -338829590)).booleanValue();
    }

    private final getPackageType writeTypedList() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback3 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (getPackageType) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, 1359017125, iOnExtraCallback3, iOnExtraCallback, -1359017124);
    }

    @Override // viva.republica.toss.account.agreement.Hilt_SchemeMultiWithdrawAgreementActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 77;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.account.agreement.Hilt_SchemeMultiWithdrawAgreementActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 1;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 77;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.account.agreement.Hilt_SchemeMultiWithdrawAgreementActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = writeTypedObject + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.account.agreement.Hilt_SchemeMultiWithdrawAgreementActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 83;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
    }

    static void IAuthTabCallback() {
        getInterfaceDescriptor = new char[]{39909, 23309, 6671, 55567, 38937, 24350, 7688, 56604};
        IAuthTabCallback_Parcel = -3416351132952089301L;
    }
}
