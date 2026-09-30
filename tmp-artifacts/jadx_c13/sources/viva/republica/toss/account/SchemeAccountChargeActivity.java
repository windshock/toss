package viva.republica.toss.account;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.base.BaseActivity;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DERConstructedSet;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.KeyBoardVisiblePoint;
import o.PageShowPoint;
import o.SessionTrackerb;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.UST_TSA_VerifyTimeStampTokenWithHash;
import o.access13800;
import o.access14100;
import o.access15400;
import o.access8000;
import o.findResAndMsg;
import o.getWrite;
import o.issueCertV3;
import o.maybeUpdateAnimatable;
import o.onCollectWhenDestroy;
import o.onDisclaimerClick;
import o.onJsBridgeReady;
import o.onLoadStarted;
import o.putChannelInfo;
import o.verifyHASH;
import o.zzaj;
import o.zzbq;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.R;
import viva.republica.toss.account.SchemeAccountChargeActivity$;
import viva.republica.toss.account.SchemeAccountChargeActivity$getAvailableAccounts$2$;
import viva.republica.toss.send.v4.entity.TransferTextType;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class SchemeAccountChargeActivity extends Hilt_SchemeAccountChargeActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    public static final int IAuthTabCallbackDefault;
    private static char IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access100 = 1;
    private static char asBinder = 0;
    private static char asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    private static char onTransact;

    @Inject
    public SessionTrackerb tossRouter;

    static {
        onNavigationEvent();
        Companion = new onWarmupCompleted(null);
        IAuthTabCallbackDefault = 8;
        int i = access100 + 79;
        IAuthTabCallbackStubProxy = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = ~i5;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i4 | i5);
        int i12 = (~(i5 | i4)) | (~(i7 | i9)) | i8;
        int i13 = i + i4 + i6 + (62936680 * i2) + ((-2032430997) * i3);
        int i14 = i13 * i13;
        int i15 = ((-476632153) * i) + 797966336 + (1756943451 * i4) + (i10 * (-1030695846)) + ((-1030695846) * i11) + (1030695846 * i12) + ((-1507328000) * i6) + ((-264241152) * i2) + ((-222822400) * i3) + (2040594432 * i14);
        int i16 = ((i * 1175661207) - 43826732) + (i4 * 1175659659) + (i10 * (-774)) + (i11 * (-774)) + (i12 * 774) + (i6 * 1175660433) + (i2 * 1188219112) + (i3 * (-816965221)) + (i14 * 1798373376);
        int i17 = i15 + (i16 * i16 * 914292736);
        return i17 != 1 ? i17 != 2 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SchemeAccountChargeActivity schemeAccountChargeActivity, onExtraCallbackWithResult onextracallbackwithresult, String str, KeyBoardVisiblePoint keyBoardVisiblePoint) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(schemeAccountChargeActivity, onextracallbackwithresult, str, keyBoardVisiblePoint);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(schemeAccountChargeActivity, onextracallbackwithresult, str, keyBoardVisiblePoint);
        int i3 = getInterfaceDescriptor + 31;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 91 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onNavigationEvent(SchemeAccountChargeActivity schemeAccountChargeActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(schemeAccountChargeActivity, dialogInterface);
        int i4 = getInterfaceDescriptor + 65;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 5;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 119;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return -1L;
    }

    public static final /* synthetic */ Object onExtraCallback(SchemeAccountChargeActivity schemeAccountChargeActivity, String str, String str2, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 107;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(-825045830, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 825045832, new Object[]{schemeAccountChargeActivity, str, str2, access13800Var}, iOnNavigationEvent, iOnNavigationEvent2);
        int i4 = getInterfaceDescriptor + 33;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(SchemeAccountChargeActivity schemeAccountChargeActivity, String str, String str2, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 109;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {schemeAccountChargeActivity, str, str2, access13800Var};
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent4 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        if (i3 == 0) {
            onExtraCallbackWithResult(1721276908, iOnNavigationEvent3, iOnNavigationEvent4, -1721276908, objArr, iOnNavigationEvent, iOnNavigationEvent2);
            throw null;
        }
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(1721276908, iOnNavigationEvent3, iOnNavigationEvent4, -1721276908, objArr, iOnNavigationEvent, iOnNavigationEvent2);
        int i4 = IAuthTabCallback_Parcel + 5;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        SchemeAccountChargeActivity schemeAccountChargeActivity = (SchemeAccountChargeActivity) objArr[0];
        List<? extends KeyBoardVisiblePoint> list = (List) objArr[1];
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[2];
        String str = (String) objArr[3];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        schemeAccountChargeActivity.IAuthTabCallback(list, onextracallbackwithresult, str);
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        int i5 = getInterfaceDescriptor + 33;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(SchemeAccountChargeActivity schemeAccountChargeActivity, KeyBoardVisiblePoint keyBoardVisiblePoint, onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        schemeAccountChargeActivity.onWarmupCompleted(keyBoardVisiblePoint, onextracallbackwithresult);
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
    }

    public static final /* synthetic */ Object onNavigationEvent(SchemeAccountChargeActivity schemeAccountChargeActivity, onExtraCallbackWithResult onextracallbackwithresult, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = schemeAccountChargeActivity.onExtraCallback(onextracallbackwithresult, access13800Var);
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return objOnExtraCallback;
    }

    public final SessionTrackerb IAuthTabCallback() {
        int i = 2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        Object obj = null;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i2 = IAuthTabCallback_Parcel + 89;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = getInterfaceDescriptor + 89;
        int i5 = i4 % 128;
        IAuthTabCallback_Parcel = i5;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i5 + 119;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
        return sessionTrackerb;
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ String $accountId;
        final /* synthetic */ String $accountNo;
        final /* synthetic */ String $accountType;
        final /* synthetic */ String $bankCode;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackDefault(String str, String str2, String str3, String str4, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
            this.$accountId = str;
            this.$accountType = str2;
            this.$accountNo = str3;
            this.$bankCode = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return SchemeAccountChargeActivity.this.new IAuthTabCallbackDefault(this.$accountId, this.$accountType, this.$accountNo, this.$bankCode, access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((IAuthTabCallbackDefault) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnExtraCallback;
            KeyBoardVisiblePoint keyBoardVisiblePoint;
            Object objOnExtraCallbackWithResult;
            onExtraCallbackWithResult onwarmupcompleted;
            String strAsInterface;
            Object objOnNavigationEvent;
            KeyBoardVisiblePoint keyBoardVisiblePoint2;
            String str;
            Object objOnNavigationEvent2;
            String str2;
            onExtraCallbackWithResult onextracallbackwithresult;
            List list;
            Object objOnExtraCallback2 = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                BaseActivity.IAuthTabCallback(SchemeAccountChargeActivity.this, (String) null, false, 3, (Object) null);
                SchemeAccountChargeActivity schemeAccountChargeActivity = SchemeAccountChargeActivity.this;
                String str3 = this.$accountId;
                String str4 = this.$accountType;
                this.label = 1;
                objOnExtraCallback = SchemeAccountChargeActivity.onExtraCallback(schemeAccountChargeActivity, str3, str4, this);
                if (objOnExtraCallback == objOnExtraCallback2) {
                    return objOnExtraCallback2;
                }
            } else if (i == 1) {
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = obj;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = (String) this.L$2;
                        onextracallbackwithresult = (onExtraCallbackWithResult) this.L$1;
                        ResultKt.onNavigationEvent(obj);
                        objOnNavigationEvent2 = obj;
                        list = (List) objOnNavigationEvent2;
                        SchemeAccountChargeActivity.this.bo_();
                        if (!list.isEmpty()) {
                            SchemeAccountChargeActivity.onExtraCallbackWithResult(1232297336, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1232297335, new Object[]{SchemeAccountChargeActivity.this, list, onextracallbackwithresult, str2}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                        } else {
                            SchemeAccountChargeActivity.onExtraCallbackWithResult(SchemeAccountChargeActivity.this, (KeyBoardVisiblePoint) null, onextracallbackwithresult);
                            SchemeAccountChargeActivity.this.finish();
                        }
                        return Unit.INSTANCE;
                    }
                    str = (String) this.L$2;
                    onwarmupcompleted = (onExtraCallbackWithResult) this.L$1;
                    keyBoardVisiblePoint2 = (KeyBoardVisiblePoint) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    objOnNavigationEvent = obj;
                    List list2 = (List) objOnNavigationEvent;
                    verifyHASH verifyhash = verifyHASH.onExtraCallback;
                    this.L$0 = access15400.onNavigationEvent(keyBoardVisiblePoint2);
                    this.L$1 = onwarmupcompleted;
                    this.L$2 = str;
                    this.L$3 = access15400.onNavigationEvent(list2);
                    this.I$0 = 0;
                    this.label = 4;
                    objOnNavigationEvent2 = verifyhash.onNavigationEvent(list2, this);
                    if (objOnNavigationEvent2 != objOnExtraCallback2) {
                        return objOnExtraCallback2;
                    }
                    str2 = str;
                    onextracallbackwithresult = onwarmupcompleted;
                    list = (List) objOnNavigationEvent2;
                    SchemeAccountChargeActivity.this.bo_();
                    if (!list.isEmpty()) {
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallbackWithResult = obj;
                keyBoardVisiblePoint = (KeyBoardVisiblePoint) objOnExtraCallbackWithResult;
                if (keyBoardVisiblePoint == null) {
                    onwarmupcompleted = new onExtraCallbackWithResult.onExtraCallback(keyBoardVisiblePoint);
                } else if (!StringsKt__StringsKt.isBlank(this.$bankCode) && !StringsKt__StringsKt.isBlank(this.$accountNo)) {
                    onwarmupcompleted = new onExtraCallbackWithResult.onWarmupCompleted(this.$bankCode, this.$accountNo);
                } else {
                    ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SchemeAccountChargeActivity", "target account not found", access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("accountId", this.$accountId), getWrite.IAuthTabCallback("accountType", this.$accountType), getWrite.IAuthTabCallback("accountNo", this.$accountNo), getWrite.IAuthTabCallback("bankCode", this.$bankCode)), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                    BaseActivity baseActivity = SchemeAccountChargeActivity.this;
                    onJsBridgeReady.onNavigationEvent(baseActivity, baseActivity.getString(R.string.app_account___a6d21f1be3), 0, 2, (Object) null);
                    SchemeAccountChargeActivity.this.finish();
                    return Unit.INSTANCE;
                }
                if (keyBoardVisiblePoint != null || (strAsInterface = keyBoardVisiblePoint.asInterface()) == null) {
                    strAsInterface = this.$bankCode;
                    if (strAsInterface.length() == 0) {
                        strAsInterface = null;
                    }
                }
                SchemeAccountChargeActivity schemeAccountChargeActivity2 = SchemeAccountChargeActivity.this;
                this.L$0 = access15400.onNavigationEvent(keyBoardVisiblePoint);
                this.L$1 = onwarmupcompleted;
                this.L$2 = strAsInterface;
                this.label = 3;
                objOnNavigationEvent = SchemeAccountChargeActivity.onNavigationEvent(schemeAccountChargeActivity2, onwarmupcompleted, this);
                if (objOnNavigationEvent != objOnExtraCallback2) {
                    return objOnExtraCallback2;
                }
                String str5 = strAsInterface;
                keyBoardVisiblePoint2 = keyBoardVisiblePoint;
                str = str5;
                List list22 = (List) objOnNavigationEvent;
                verifyHASH verifyhash2 = verifyHASH.onExtraCallback;
                this.L$0 = access15400.onNavigationEvent(keyBoardVisiblePoint2);
                this.L$1 = onwarmupcompleted;
                this.L$2 = str;
                this.L$3 = access15400.onNavigationEvent(list22);
                this.I$0 = 0;
                this.label = 4;
                objOnNavigationEvent2 = verifyhash2.onNavigationEvent(list22, this);
                if (objOnNavigationEvent2 != objOnExtraCallback2) {
                }
            }
            keyBoardVisiblePoint = (KeyBoardVisiblePoint) objOnExtraCallback;
            if (keyBoardVisiblePoint == null) {
                SchemeAccountChargeActivity schemeAccountChargeActivity3 = SchemeAccountChargeActivity.this;
                String str6 = this.$accountNo;
                String str7 = this.$bankCode;
                this.label = 2;
                objOnExtraCallbackWithResult = SchemeAccountChargeActivity.onExtraCallbackWithResult(schemeAccountChargeActivity3, str6, str7, this);
                if (objOnExtraCallbackWithResult == objOnExtraCallback2) {
                    return objOnExtraCallback2;
                }
                keyBoardVisiblePoint = (KeyBoardVisiblePoint) objOnExtraCallbackWithResult;
            }
            if (keyBoardVisiblePoint == null) {
            }
            if (keyBoardVisiblePoint != null) {
                strAsInterface = this.$bankCode;
                if (strAsInterface.length() == 0) {
                }
                SchemeAccountChargeActivity schemeAccountChargeActivity22 = SchemeAccountChargeActivity.this;
                this.L$0 = access15400.onNavigationEvent(keyBoardVisiblePoint);
                this.L$1 = onwarmupcompleted;
                this.L$2 = strAsInterface;
                this.label = 3;
                objOnNavigationEvent = SchemeAccountChargeActivity.onNavigationEvent(schemeAccountChargeActivity22, onwarmupcompleted, this);
                if (objOnNavigationEvent != objOnExtraCallback2) {
                }
            }
            list = (List) objOnNavigationEvent2;
            SchemeAccountChargeActivity.this.bo_();
            if (!list.isEmpty()) {
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x1016  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x103f  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x158e  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v120 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v0, types: [android.app.Activity, im.toss.base.BaseActivity, o.TextFieldScrollKtExternalSyntheticLambda0, viva.republica.toss.account.SchemeAccountChargeActivity] */
    @Override // viva.republica.toss.account.Hilt_SchemeAccountChargeActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Bundle extras;
        ?? string;
        Object obj;
        Bundle extras2;
        String string2;
        Object shortOrNull;
        Object obj2;
        Object array;
        Bundle extras3;
        Object obj3;
        String string3;
        Object obj4;
        Object array2;
        Object obj5;
        Object next;
        Object array3;
        Bundle extras4;
        String string4;
        Object array4;
        Object next2;
        Object intOrNull;
        int i = 2 % 2;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Object obj6 = null;
        if (intent == null || (extras4 = intent.getExtras()) == null || !extras4.containsKey("accountId")) {
            str = null;
        } else if (zzbq.onNavigationEvent(intent)) {
            Bundle extras5 = intent.getExtras();
            if (extras5 != null && (string4 = extras5.getString("accountId")) != null) {
                if (Intrinsics.areEqual(String.class, Integer.class)) {
                    intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(string4);
                } else {
                    if (Intrinsics.areEqual(String.class, Long.class)) {
                        int i2 = getInterfaceDescriptor + 89;
                        IAuthTabCallback_Parcel = i2 % 128;
                        if (i2 % 2 != 0) {
                            StringsKt__StringNumberConversionsKt.toLongOrNull(string4);
                            obj6.hashCode();
                            throw null;
                        }
                        array4 = StringsKt__StringNumberConversionsKt.toLongOrNull(string4);
                    } else if (Intrinsics.areEqual(String.class, Float.class)) {
                        array4 = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string4);
                    } else if (Intrinsics.areEqual(String.class, Double.class)) {
                        array4 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(string4);
                    } else if (Intrinsics.areEqual(String.class, Short.class)) {
                        array4 = StringsKt__StringNumberConversionsKt.toShortOrNull(string4);
                    } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                        array4 = StringsKt__StringNumberConversionsKt.toByteOrNull(string4);
                    } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                        array4 = Boolean.valueOf(Boolean.parseBoolean(string4));
                    } else if (Intrinsics.areEqual(String.class, Character.class)) {
                        array4 = Character.valueOf(string4.charAt(0));
                    } else {
                        intOrNull = string4;
                        if (!Intrinsics.areEqual(String.class, String.class)) {
                            if (Intrinsics.areEqual(String.class, Integer[].class)) {
                                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string4, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList = new ArrayList();
                                for (Object obj7 : listSplit$default) {
                                    if (((String) obj7).length() > 0) {
                                        arrayList.add(obj7);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it.next()).toString())));
                                }
                                array4 = arrayList2.toArray(new Integer[0]);
                            } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                                List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) string4, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj8 : listSplit$default2) {
                                    if (((String) obj8).length() > 0) {
                                        arrayList3.add(obj8);
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(Long.valueOf(Long.parseLong(StringsKt__StringsKt.trim((CharSequence) it2.next()).toString())));
                                }
                                array4 = arrayList4.toArray(new Long[0]);
                            } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                                List listSplit$default3 = StringsKt__StringsKt.split$default((CharSequence) string4, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj9 : listSplit$default3) {
                                    if (((String) obj9).length() > 0) {
                                        arrayList5.add(obj9);
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                                Iterator it3 = arrayList5.iterator();
                                while (it3.hasNext()) {
                                    arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it3.next()).toString())));
                                }
                                array4 = arrayList6.toArray(new Float[0]);
                            } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                                List listSplit$default4 = StringsKt__StringsKt.split$default((CharSequence) string4, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj10 : listSplit$default4) {
                                    if (((String) obj10).length() > 0) {
                                        arrayList7.add(obj10);
                                    }
                                }
                                ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                                Iterator it4 = arrayList7.iterator();
                                while (it4.hasNext()) {
                                    arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it4.next()).toString())));
                                }
                                array4 = arrayList8.toArray(new Double[0]);
                            } else if (Intrinsics.areEqual(String.class, Short[].class)) {
                                List listSplit$default5 = StringsKt__StringsKt.split$default((CharSequence) string4, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList9 = new ArrayList();
                                for (Object obj11 : listSplit$default5) {
                                    if (((String) obj11).length() > 0) {
                                        arrayList9.add(obj11);
                                    }
                                }
                                ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList9, 10));
                                Iterator it5 = arrayList9.iterator();
                                while (it5.hasNext()) {
                                    arrayList10.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it5.next()).toString())));
                                }
                                array4 = arrayList10.toArray(new Short[0]);
                            } else if (Intrinsics.areEqual(String.class, Byte[].class)) {
                                List listSplit$default6 = StringsKt__StringsKt.split$default((CharSequence) string4, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList11 = new ArrayList();
                                for (Object obj12 : listSplit$default6) {
                                    if (((String) obj12).length() > 0) {
                                        arrayList11.add(obj12);
                                    }
                                }
                                ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList11, 10));
                                Iterator it6 = arrayList11.iterator();
                                while (it6.hasNext()) {
                                    arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it6.next()).toString())));
                                }
                                array4 = arrayList12.toArray(new Byte[0]);
                            } else if (Intrinsics.areEqual(String.class, Boolean[].class)) {
                                List listSplit$default7 = StringsKt__StringsKt.split$default((CharSequence) string4, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList13 = new ArrayList();
                                for (Object obj13 : listSplit$default7) {
                                    if (((String) obj13).length() > 0) {
                                        arrayList13.add(obj13);
                                    }
                                }
                                ArrayList arrayList14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList13, 10));
                                Iterator it7 = arrayList13.iterator();
                                while (it7.hasNext()) {
                                    arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt__StringsKt.trim((CharSequence) it7.next()).toString())));
                                }
                                array4 = arrayList14.toArray(new Boolean[0]);
                            } else if (Intrinsics.areEqual(String.class, Character[].class)) {
                                List listSplit$default8 = StringsKt__StringsKt.split$default((CharSequence) string4, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList15 = new ArrayList();
                                for (Object obj14 : listSplit$default8) {
                                    if (((String) obj14).length() > 0) {
                                        arrayList15.add(obj14);
                                    }
                                }
                                ArrayList arrayList16 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList15, 10));
                                Iterator it8 = arrayList15.iterator();
                                while (it8.hasNext()) {
                                    arrayList16.add(Character.valueOf(StringsKt__StringsKt.trim((CharSequence) it8.next()).toString().charAt(0)));
                                }
                                array4 = arrayList16.toArray(new Character[0]);
                            } else if (Intrinsics.areEqual(String.class, String[].class)) {
                                List listSplit$default9 = StringsKt__StringsKt.split$default((CharSequence) string4, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList17 = new ArrayList();
                                for (Object obj15 : listSplit$default9) {
                                    if (((String) obj15).length() > 0) {
                                        arrayList17.add(obj15);
                                    }
                                }
                                array4 = arrayList17.toArray(new String[0]);
                            } else {
                                Object[] enumConstants = String.class.getEnumConstants();
                                if (enumConstants != null) {
                                    ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                    for (Object obj16 : enumConstants) {
                                        Intrinsics.checkNotNull(obj16, "");
                                        arrayList18.add((Enum) obj16);
                                    }
                                    Iterator it9 = arrayList18.iterator();
                                    while (true) {
                                        if (it9.hasNext()) {
                                            next2 = it9.next();
                                            if (Intrinsics.areEqual(((Enum) next2).name(), string4)) {
                                                break;
                                            }
                                        } else {
                                            next2 = null;
                                            break;
                                        }
                                    }
                                    array4 = (Enum) next2;
                                } else {
                                    array4 = null;
                                }
                                if (array4 == null) {
                                    if (zzaj.onNavigationEvent().onActivityLayout()) {
                                        throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                                    }
                                    int i3 = getInterfaceDescriptor + 115;
                                    IAuthTabCallback_Parcel = i3 % 128;
                                    if (i3 % 2 != 0) {
                                        int i4 = 93 / 0;
                                    }
                                    array4 = null;
                                }
                            }
                        }
                    }
                    if (!(array4 instanceof String)) {
                        array4 = null;
                    }
                    str = (String) array4;
                }
                array4 = intOrNull;
                if (!(array4 instanceof String)) {
                }
                str = (String) array4;
            }
        } else {
            Bundle extras6 = intent.getExtras();
            Object obj17 = extras6 != null ? extras6.get("accountId") : null;
            if (!(obj17 instanceof String)) {
                obj17 = null;
            }
            str = (String) obj17;
        }
        Class<Integer[]> cls = Integer[].class;
        Class<Short[]> cls2 = Short[].class;
        Class<Byte[]> cls3 = Byte[].class;
        Class<Boolean[]> cls4 = Boolean[].class;
        String str6 = str == null ? _UrlKt.FRAGMENT_ENCODE_SET : str;
        Intent intent2 = getIntent();
        if (intent2 == null || (extras3 = intent2.getExtras()) == null) {
            str2 = null;
        } else {
            int i5 = IAuthTabCallback_Parcel + 41;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0 ? extras3.containsKey("accountType") : !extras3.containsKey("accountType")) {
                if (zzbq.onNavigationEvent(intent2)) {
                    Bundle extras7 = intent2.getExtras();
                    if (extras7 != null && (string3 = extras7.getString("accountType")) != null) {
                        if (Intrinsics.areEqual(String.class, Integer.class)) {
                            array3 = StringsKt__StringNumberConversionsKt.toIntOrNull(string3);
                        } else if (Intrinsics.areEqual(String.class, Long.class)) {
                            array3 = StringsKt__StringNumberConversionsKt.toLongOrNull(string3);
                        } else if (Intrinsics.areEqual(String.class, Float.class)) {
                            array3 = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string3);
                        } else if (Intrinsics.areEqual(String.class, Double.class)) {
                            array3 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(string3);
                        } else if (Intrinsics.areEqual(String.class, Short.class)) {
                            array3 = StringsKt__StringNumberConversionsKt.toShortOrNull(string3);
                        } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                            array3 = StringsKt__StringNumberConversionsKt.toByteOrNull(string3);
                        } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                            array3 = Boolean.valueOf(Boolean.parseBoolean(string3));
                        } else if (Intrinsics.areEqual(String.class, Character.class)) {
                            array3 = Character.valueOf(string3.charAt(0));
                        } else {
                            array3 = string3;
                            if (!Intrinsics.areEqual(String.class, String.class)) {
                                if (Intrinsics.areEqual(String.class, Integer[].class)) {
                                    List listSplit$default10 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList19 = new ArrayList();
                                    for (Object obj18 : listSplit$default10) {
                                        if (((String) obj18).length() > 0) {
                                            arrayList19.add(obj18);
                                        }
                                    }
                                    ArrayList arrayList20 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList19, 10));
                                    Iterator it10 = arrayList19.iterator();
                                    while (it10.hasNext()) {
                                        arrayList20.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it10.next()).toString())));
                                    }
                                    cls = Integer[].class;
                                    array3 = arrayList20.toArray(new Integer[0]);
                                } else {
                                    cls = Integer[].class;
                                    if (Intrinsics.areEqual(String.class, Long[].class)) {
                                        List listSplit$default11 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList21 = new ArrayList();
                                        for (Object obj19 : listSplit$default11) {
                                            if (((String) obj19).length() > 0) {
                                                arrayList21.add(obj19);
                                            }
                                        }
                                        ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList21, 10));
                                        Iterator it11 = arrayList21.iterator();
                                        while (it11.hasNext()) {
                                            arrayList22.add(Long.valueOf(Long.parseLong(StringsKt__StringsKt.trim((CharSequence) it11.next()).toString())));
                                        }
                                        array3 = arrayList22.toArray(new Long[0]);
                                    } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                                        List listSplit$default12 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList23 = new ArrayList();
                                        for (Object obj20 : listSplit$default12) {
                                            if (((String) obj20).length() > 0) {
                                                arrayList23.add(obj20);
                                            }
                                        }
                                        ArrayList arrayList24 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList23, 10));
                                        Iterator it12 = arrayList23.iterator();
                                        while (it12.hasNext()) {
                                            arrayList24.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it12.next()).toString())));
                                        }
                                        array3 = arrayList24.toArray(new Float[0]);
                                    } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                                        List listSplit$default13 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList25 = new ArrayList();
                                        for (Object obj21 : listSplit$default13) {
                                            if (((String) obj21).length() > 0) {
                                                arrayList25.add(obj21);
                                            }
                                        }
                                        ArrayList arrayList26 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList25, 10));
                                        Iterator it13 = arrayList25.iterator();
                                        while (it13.hasNext()) {
                                            arrayList26.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it13.next()).toString())));
                                        }
                                        array3 = arrayList26.toArray(new Double[0]);
                                    } else if (Intrinsics.areEqual(String.class, Short[].class)) {
                                        List listSplit$default14 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList27 = new ArrayList();
                                        for (Object obj22 : listSplit$default14) {
                                            if (((String) obj22).length() > 0) {
                                                arrayList27.add(obj22);
                                            }
                                        }
                                        ArrayList arrayList28 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList27, 10));
                                        Iterator it14 = arrayList27.iterator();
                                        while (it14.hasNext()) {
                                            arrayList28.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it14.next()).toString())));
                                        }
                                        cls2 = Short[].class;
                                        array3 = arrayList28.toArray(new Short[0]);
                                    } else if (Intrinsics.areEqual(String.class, Byte[].class)) {
                                        List listSplit$default15 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList29 = new ArrayList();
                                        for (Object obj23 : listSplit$default15) {
                                            if (((String) obj23).length() > 0) {
                                                arrayList29.add(obj23);
                                            }
                                        }
                                        ArrayList arrayList30 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList29, 10));
                                        Iterator it15 = arrayList29.iterator();
                                        while (it15.hasNext()) {
                                            arrayList30.add(Byte.valueOf(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it15.next()).toString())));
                                        }
                                        Object array5 = arrayList30.toArray(new Byte[0]);
                                        cls3 = Byte[].class;
                                        cls2 = Short[].class;
                                        array3 = array5;
                                    } else {
                                        if (Intrinsics.areEqual(String.class, Boolean[].class)) {
                                            List listSplit$default16 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList31 = new ArrayList();
                                            for (Object obj24 : listSplit$default16) {
                                                if (((String) obj24).length() > 0) {
                                                    arrayList31.add(obj24);
                                                }
                                            }
                                            ArrayList arrayList32 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList31, 10));
                                            Iterator it16 = arrayList31.iterator();
                                            while (it16.hasNext()) {
                                                arrayList32.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt__StringsKt.trim((CharSequence) it16.next()).toString())));
                                            }
                                            Object array6 = arrayList32.toArray(new Boolean[0]);
                                            cls4 = Boolean[].class;
                                            cls3 = Byte[].class;
                                            obj5 = array6;
                                        } else {
                                            if (Intrinsics.areEqual(String.class, Character[].class)) {
                                                List listSplit$default17 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                                ArrayList arrayList33 = new ArrayList();
                                                for (Object obj25 : listSplit$default17) {
                                                    if (((String) obj25).length() > 0) {
                                                        arrayList33.add(obj25);
                                                    }
                                                }
                                                ArrayList arrayList34 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList33, 10));
                                                Iterator it17 = arrayList33.iterator();
                                                while (it17.hasNext()) {
                                                    arrayList34.add(Character.valueOf(StringsKt__StringsKt.trim((CharSequence) it17.next()).toString().charAt(0)));
                                                }
                                                array2 = arrayList34.toArray(new Character[0]);
                                            } else if (Intrinsics.areEqual(String.class, String[].class)) {
                                                List listSplit$default18 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                                ArrayList arrayList35 = new ArrayList();
                                                for (Object obj26 : listSplit$default18) {
                                                    if (((String) obj26).length() > 0) {
                                                        arrayList35.add(obj26);
                                                    }
                                                }
                                                array2 = arrayList35.toArray(new String[0]);
                                            } else {
                                                Object[] enumConstants2 = String.class.getEnumConstants();
                                                if (enumConstants2 != null) {
                                                    ArrayList arrayList36 = new ArrayList(enumConstants2.length);
                                                    for (Object obj27 : enumConstants2) {
                                                        Intrinsics.checkNotNull(obj27, "");
                                                        arrayList36.add((Enum) obj27);
                                                    }
                                                    Iterator it18 = arrayList36.iterator();
                                                    while (true) {
                                                        if (it18.hasNext()) {
                                                            next = it18.next();
                                                            if (Intrinsics.areEqual(((Enum) next).name(), string3)) {
                                                                break;
                                                            }
                                                        } else {
                                                            next = null;
                                                            break;
                                                        }
                                                    }
                                                    obj4 = (Enum) next;
                                                } else {
                                                    obj4 = null;
                                                }
                                                if (obj4 != null) {
                                                    array2 = obj4;
                                                } else {
                                                    if (zzaj.onNavigationEvent().onActivityLayout()) {
                                                        throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                                                    }
                                                    cls3 = Byte[].class;
                                                    cls4 = Boolean[].class;
                                                    obj5 = null;
                                                }
                                            }
                                            cls3 = Byte[].class;
                                            cls4 = Boolean[].class;
                                            obj5 = array2;
                                        }
                                        cls2 = Short[].class;
                                        array3 = obj5;
                                    }
                                }
                            }
                        }
                        boolean z = array3 instanceof String;
                        Object obj28 = array3;
                        if (!z) {
                            obj28 = null;
                        }
                        str2 = (String) obj28;
                    }
                } else {
                    Bundle extras8 = intent2.getExtras();
                    if (extras8 != null) {
                        int i6 = IAuthTabCallback_Parcel + 75;
                        getInterfaceDescriptor = i6 % 128;
                        if (i6 % 2 == 0) {
                            extras8.get("accountType");
                            Object obj29 = null;
                            obj29.hashCode();
                            throw null;
                        }
                        obj3 = extras8.get("accountType");
                    } else {
                        obj3 = null;
                    }
                    if (!(obj3 instanceof String)) {
                        obj3 = null;
                    }
                    str2 = (String) obj3;
                }
            }
        }
        if (str2 == null) {
            str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        Intent intent3 = getIntent();
        if (intent3 == null || (extras2 = intent3.getExtras()) == null || !extras2.containsKey("bankCode")) {
            str3 = null;
            str4 = null;
        } else if (zzbq.onNavigationEvent(intent3)) {
            Bundle extras9 = intent3.getExtras();
            if (extras9 != null && (string2 = extras9.getString("bankCode")) != null) {
                if (Intrinsics.areEqual(String.class, Integer.class)) {
                    array = StringsKt__StringNumberConversionsKt.toIntOrNull(string2);
                } else if (Intrinsics.areEqual(String.class, Long.class)) {
                    array = StringsKt__StringNumberConversionsKt.toLongOrNull(string2);
                } else if (Intrinsics.areEqual(String.class, Float.class)) {
                    array = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string2);
                } else if (Intrinsics.areEqual(String.class, Double.class)) {
                    array = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(string2);
                } else {
                    if (!(!Intrinsics.areEqual(String.class, Short.class))) {
                        shortOrNull = StringsKt__StringNumberConversionsKt.toShortOrNull(string2);
                    } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                        int i7 = getInterfaceDescriptor + 69;
                        IAuthTabCallback_Parcel = i7 % 128;
                        if (i7 % 2 != 0) {
                            StringsKt__StringNumberConversionsKt.toByteOrNull(string2);
                            Object obj30 = null;
                            obj30.hashCode();
                            throw null;
                        }
                        array = StringsKt__StringNumberConversionsKt.toByteOrNull(string2);
                    } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                        shortOrNull = Boolean.valueOf(Boolean.parseBoolean(string2));
                    } else if (Intrinsics.areEqual(String.class, Character.class)) {
                        array = Character.valueOf(string2.charAt(0));
                    } else {
                        array = string2;
                        if (!Intrinsics.areEqual(String.class, String.class)) {
                            if (Intrinsics.areEqual(String.class, cls)) {
                                List listSplit$default19 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList37 = new ArrayList();
                                for (Object obj31 : listSplit$default19) {
                                    if (((String) obj31).length() > 0) {
                                        arrayList37.add(obj31);
                                    }
                                }
                                ArrayList arrayList38 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList37, 10));
                                Iterator it19 = arrayList37.iterator();
                                while (it19.hasNext()) {
                                    arrayList38.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it19.next()).toString())));
                                }
                                array = arrayList38.toArray(new Integer[0]);
                            } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                                List listSplit$default20 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList39 = new ArrayList();
                                for (Object obj32 : listSplit$default20) {
                                    if (((String) obj32).length() > 0) {
                                        int i8 = IAuthTabCallback_Parcel + 15;
                                        getInterfaceDescriptor = i8 % 128;
                                        if (i8 % 2 == 0) {
                                            arrayList39.add(obj32);
                                            int i9 = 42 / 0;
                                        } else {
                                            arrayList39.add(obj32);
                                        }
                                    }
                                }
                                ArrayList arrayList40 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList39, 10));
                                Iterator it20 = arrayList39.iterator();
                                while (it20.hasNext()) {
                                    int i10 = IAuthTabCallback_Parcel + 33;
                                    getInterfaceDescriptor = i10 % 128;
                                    int i11 = i10 % 2;
                                    arrayList40.add(Long.valueOf(Long.parseLong(StringsKt__StringsKt.trim((CharSequence) it20.next()).toString())));
                                }
                                array = arrayList40.toArray(new Long[0]);
                            } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                                List listSplit$default21 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList41 = new ArrayList();
                                for (Object obj33 : listSplit$default21) {
                                    if (((String) obj33).length() > 0) {
                                        arrayList41.add(obj33);
                                    }
                                }
                                ArrayList arrayList42 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList41, 10));
                                Iterator it21 = arrayList41.iterator();
                                while (it21.hasNext()) {
                                    arrayList42.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it21.next()).toString())));
                                }
                                array = arrayList42.toArray(new Float[0]);
                            } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                                List listSplit$default22 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList43 = new ArrayList();
                                for (Object obj34 : listSplit$default22) {
                                    if (((String) obj34).length() > 0) {
                                        arrayList43.add(obj34);
                                    }
                                }
                                ArrayList arrayList44 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList43, 10));
                                Iterator it22 = arrayList43.iterator();
                                while (it22.hasNext()) {
                                    arrayList44.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it22.next()).toString())));
                                }
                                array = arrayList44.toArray(new Double[0]);
                            } else if (Intrinsics.areEqual(String.class, cls2)) {
                                List listSplit$default23 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList45 = new ArrayList();
                                for (Object obj35 : listSplit$default23) {
                                    if (((String) obj35).length() > 0) {
                                        arrayList45.add(obj35);
                                    }
                                }
                                ArrayList arrayList46 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList45, 10));
                                Iterator it23 = arrayList45.iterator();
                                while (it23.hasNext()) {
                                    arrayList46.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it23.next()).toString())));
                                }
                                array = arrayList46.toArray(new Short[0]);
                            } else if (Intrinsics.areEqual(String.class, cls3)) {
                                List listSplit$default24 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList47 = new ArrayList();
                                for (Object obj36 : listSplit$default24) {
                                    if (((String) obj36).length() > 0) {
                                        arrayList47.add(obj36);
                                    }
                                }
                                ArrayList arrayList48 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList47, 10));
                                Iterator it24 = arrayList47.iterator();
                                while (it24.hasNext()) {
                                    arrayList48.add(Byte.valueOf(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it24.next()).toString())));
                                }
                                array = arrayList48.toArray(new Byte[0]);
                            } else if (Intrinsics.areEqual(String.class, cls4)) {
                                List listSplit$default25 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList49 = new ArrayList();
                                for (Object obj37 : listSplit$default25) {
                                    if (((String) obj37).length() > 0) {
                                        arrayList49.add(obj37);
                                    }
                                }
                                ArrayList arrayList50 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList49, 10));
                                Iterator it25 = arrayList49.iterator();
                                while (it25.hasNext()) {
                                    arrayList50.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt__StringsKt.trim((CharSequence) it25.next()).toString())));
                                }
                                array = arrayList50.toArray(new Boolean[0]);
                            } else if (Intrinsics.areEqual(String.class, Character[].class)) {
                                List listSplit$default26 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList51 = new ArrayList();
                                for (Object obj38 : listSplit$default26) {
                                    if (((String) obj38).length() > 0) {
                                        arrayList51.add(obj38);
                                    }
                                }
                                ArrayList arrayList52 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList51, 10));
                                Iterator it26 = arrayList51.iterator();
                                while (it26.hasNext()) {
                                    arrayList52.add(Character.valueOf(StringsKt__StringsKt.trim((CharSequence) it26.next()).toString().charAt(0)));
                                }
                                array = arrayList52.toArray(new Character[0]);
                            } else if (Intrinsics.areEqual(String.class, String[].class)) {
                                List listSplit$default27 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList53 = new ArrayList();
                                for (Object obj39 : listSplit$default27) {
                                    if (((String) obj39).length() > 0) {
                                        arrayList53.add(obj39);
                                    }
                                }
                                array = arrayList53.toArray(new String[0]);
                            } else {
                                Object[] enumConstants3 = String.class.getEnumConstants();
                                if (enumConstants3 != null) {
                                    ArrayList arrayList54 = new ArrayList(enumConstants3.length);
                                    for (Object obj40 : enumConstants3) {
                                        Intrinsics.checkNotNull(obj40, "");
                                        arrayList54.add((Enum) obj40);
                                    }
                                    Iterator it27 = arrayList54.iterator();
                                    while (true) {
                                        if (!it27.hasNext()) {
                                            obj2 = null;
                                            break;
                                        }
                                        Object next3 = it27.next();
                                        if (Intrinsics.areEqual(((Enum) next3).name(), string2)) {
                                            obj2 = next3;
                                            break;
                                        }
                                    }
                                    shortOrNull = (Enum) obj2;
                                } else {
                                    shortOrNull = null;
                                }
                                if (shortOrNull == null) {
                                    if (zzaj.onNavigationEvent().onActivityLayout()) {
                                        throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                                    }
                                    shortOrNull = null;
                                }
                            }
                        }
                    }
                    if (!(shortOrNull instanceof String)) {
                        shortOrNull = null;
                    }
                    str4 = (String) shortOrNull;
                    str3 = null;
                }
                shortOrNull = array;
                if (!(shortOrNull instanceof String)) {
                }
                str4 = (String) shortOrNull;
                str3 = null;
            }
        } else {
            Bundle extras10 = intent3.getExtras();
            Object obj41 = extras10 != null ? extras10.get("bankCode") : null;
            if (!(obj41 instanceof String)) {
                int i12 = getInterfaceDescriptor + 99;
                IAuthTabCallback_Parcel = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
                obj41 = null;
            }
            str3 = null;
            str4 = (String) obj41;
        }
        String str7 = str4 == null ? _UrlKt.FRAGMENT_ENCODE_SET : str4;
        Intent intent4 = getIntent();
        if (intent4 == null || (extras = intent4.getExtras()) == null || !extras.containsKey("accountNo")) {
            str5 = str3;
        } else if (zzbq.onNavigationEvent(intent4)) {
            Bundle extras11 = intent4.getExtras();
            if (extras11 != null && (string = extras11.getString("accountNo")) != 0) {
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
                    string = Boolean.valueOf(Boolean.parseBoolean(string));
                } else if (Intrinsics.areEqual(String.class, Character.class)) {
                    string = Character.valueOf(string.charAt(0));
                } else if (!Intrinsics.areEqual(String.class, String.class)) {
                    if (Intrinsics.areEqual(String.class, cls)) {
                        List listSplit$default28 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList55 = new ArrayList();
                        for (Object obj42 : listSplit$default28) {
                            if (((String) obj42).length() > 0) {
                                arrayList55.add(obj42);
                            }
                        }
                        ArrayList arrayList56 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList55, 10));
                        Iterator it28 = arrayList55.iterator();
                        while (it28.hasNext()) {
                            arrayList56.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it28.next()).toString())));
                        }
                        string = arrayList56.toArray(new Integer[0]);
                    } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                        List listSplit$default29 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList57 = new ArrayList();
                        for (Object obj43 : listSplit$default29) {
                            if (((String) obj43).length() > 0) {
                                arrayList57.add(obj43);
                            }
                        }
                        ArrayList arrayList58 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList57, 10));
                        Iterator it29 = arrayList57.iterator();
                        while (it29.hasNext()) {
                            arrayList58.add(Long.valueOf(Long.parseLong(StringsKt__StringsKt.trim((CharSequence) it29.next()).toString())));
                        }
                        string = arrayList58.toArray(new Long[0]);
                    } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                        List listSplit$default30 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList59 = new ArrayList();
                        for (Object obj44 : listSplit$default30) {
                            if (((String) obj44).length() > 0) {
                                arrayList59.add(obj44);
                            }
                        }
                        ArrayList arrayList60 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList59, 10));
                        Iterator it30 = arrayList59.iterator();
                        while (it30.hasNext()) {
                            arrayList60.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it30.next()).toString())));
                        }
                        string = arrayList60.toArray(new Float[0]);
                    } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                        List listSplit$default31 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList61 = new ArrayList();
                        for (Object obj45 : listSplit$default31) {
                            if (((String) obj45).length() > 0) {
                                arrayList61.add(obj45);
                            }
                        }
                        ArrayList arrayList62 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList61, 10));
                        Iterator it31 = arrayList61.iterator();
                        while (it31.hasNext()) {
                            arrayList62.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it31.next()).toString())));
                        }
                        string = arrayList62.toArray(new Double[0]);
                    } else if (Intrinsics.areEqual(String.class, cls2)) {
                        List listSplit$default32 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList63 = new ArrayList();
                        for (Object obj46 : listSplit$default32) {
                            if (((String) obj46).length() > 0) {
                                int i13 = IAuthTabCallback_Parcel + 89;
                                getInterfaceDescriptor = i13 % 128;
                                int i14 = i13 % 2;
                                arrayList63.add(obj46);
                            }
                        }
                        ArrayList arrayList64 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList63, 10));
                        Iterator it32 = arrayList63.iterator();
                        while (it32.hasNext()) {
                            arrayList64.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it32.next()).toString())));
                        }
                        string = arrayList64.toArray(new Short[0]);
                    } else if (Intrinsics.areEqual(String.class, cls3)) {
                        List listSplit$default33 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList65 = new ArrayList();
                        for (Object obj47 : listSplit$default33) {
                            if (((String) obj47).length() > 0) {
                                arrayList65.add(obj47);
                            }
                        }
                        ArrayList arrayList66 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList65, 10));
                        Iterator it33 = arrayList65.iterator();
                        while (it33.hasNext()) {
                            arrayList66.add(Byte.valueOf(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it33.next()).toString())));
                        }
                        string = arrayList66.toArray(new Byte[0]);
                    } else if (Intrinsics.areEqual(String.class, cls4)) {
                        List listSplit$default34 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList67 = new ArrayList();
                        for (Object obj48 : listSplit$default34) {
                            int i15 = getInterfaceDescriptor + 73;
                            IAuthTabCallback_Parcel = i15 % 128;
                            int i16 = i15 % 2;
                            if (((String) obj48).length() > 0) {
                                arrayList67.add(obj48);
                            }
                        }
                        ArrayList arrayList68 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList67, 10));
                        Iterator it34 = arrayList67.iterator();
                        while (it34.hasNext()) {
                            arrayList68.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt__StringsKt.trim((CharSequence) it34.next()).toString())));
                        }
                        string = arrayList68.toArray(new Boolean[0]);
                    } else if (Intrinsics.areEqual(String.class, Character[].class)) {
                        List listSplit$default35 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList69 = new ArrayList();
                        for (Object obj49 : listSplit$default35) {
                            if (((String) obj49).length() > 0) {
                                arrayList69.add(obj49);
                            }
                        }
                        ArrayList arrayList70 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList69, 10));
                        Iterator it35 = arrayList69.iterator();
                        while (it35.hasNext()) {
                            arrayList70.add(Character.valueOf(StringsKt__StringsKt.trim((CharSequence) it35.next()).toString().charAt(0)));
                        }
                        string = arrayList70.toArray(new Character[0]);
                    } else if (Intrinsics.areEqual(String.class, String[].class)) {
                        List listSplit$default36 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList71 = new ArrayList();
                        for (Object obj50 : listSplit$default36) {
                            if (((String) obj50).length() > 0) {
                                arrayList71.add(obj50);
                            }
                        }
                        string = arrayList71.toArray(new String[0]);
                    } else {
                        Object[] enumConstants4 = String.class.getEnumConstants();
                        if (enumConstants4 != null) {
                            ArrayList arrayList72 = new ArrayList(enumConstants4.length);
                            for (Object obj51 : enumConstants4) {
                                Intrinsics.checkNotNull(obj51, "");
                                arrayList72.add((Enum) obj51);
                            }
                            Iterator it36 = arrayList72.iterator();
                            while (true) {
                                if (!it36.hasNext()) {
                                    obj = str3;
                                    break;
                                }
                                Object next4 = it36.next();
                                if (Intrinsics.areEqual(((Enum) next4).name(), (Object) string)) {
                                    obj = next4;
                                    break;
                                }
                            }
                            string = (Enum) obj;
                        } else {
                            string = str3;
                        }
                        if (string == 0) {
                            if (zzaj.onNavigationEvent().onActivityLayout()) {
                                throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                            }
                            string = str3;
                        }
                    }
                }
                str5 = !(string instanceof String) ? str3 : string;
            }
        } else {
            Bundle extras12 = intent4.getExtras();
            ?? r0 = extras12 != null ? extras12.get("accountNo") : str3;
            str5 = !(r0 instanceof String) ? str3 : r0;
        }
        onLoadStarted.onExtraCallback(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent((TextFieldScrollKtExternalSyntheticLambda0) this), null, null, new IAuthTabCallbackDefault(str6, str2, str5 == null ? _UrlKt.FRAGMENT_ENCODE_SET : str5, str7, null), 3, null);
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super KeyBoardVisiblePoint>, Object> {
        final /* synthetic */ String $accountId;
        final /* synthetic */ String $accountType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(String str, String str2, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$accountType = str;
            this.$accountId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallback(this.$accountType, this.$accountId, access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super KeyBoardVisiblePoint> access13800Var) {
            return ((onExtraCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            onCollectWhenDestroy oncollectwhendestroy;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (this.$accountType.length() == 0) {
                PageShowPoint.onWarmupCompleted onwarmupcompleted = PageShowPoint.Companion;
                TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted = onwarmupcompleted.onWarmupCompleted(this.$accountId);
                return tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted != null ? tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted : onwarmupcompleted.onNavigationEvent(this.$accountId);
            }
            String lowerCase = this.$accountType.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (Intrinsics.areEqual(lowerCase, "toss")) {
                oncollectwhendestroy = onCollectWhenDestroy.TOSS_ACCOUNT;
            } else {
                oncollectwhendestroy = Intrinsics.areEqual(lowerCase, "bank") ? onCollectWhenDestroy.BANK_ACCOUNT : onCollectWhenDestroy.UNDEFINED;
            }
            return DERConstructedSet.onWarmupCompleted(this.$accountId, oncollectwhendestroy);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        access13800 access13800Var = (access13800) objArr[3];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 87;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (!(!StringsKt__StringsKt.isBlank(str))) {
                return null;
            }
            Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onExtraCallback(str2, str, null), access13800Var);
            int i3 = getInterfaceDescriptor + 123;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallback;
        }
        StringsKt__StringsKt.isBlank(str);
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 93;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 41;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (asInterface ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(asBinder);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int i12 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9;
                        int gidForName = Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET) + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(touchSlop, i12, gidForName, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallbackStub ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onTransact)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 10, 12434 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    i3 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 16014), 14 - (ViewConfiguration.getLongPressTimeout() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 19900, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i13 = $11 + 29;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 3 % 2;
            }
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super KeyBoardVisiblePoint>, Object> {
        final /* synthetic */ String $accountNo;
        final /* synthetic */ String $bankCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(String str, String str2, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$bankCode = str;
            this.$accountNo = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallback(this.$bankCode, this.$accountNo, access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super KeyBoardVisiblePoint> access13800Var) {
            return ((IAuthTabCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return PageShowPoint.Companion.IAuthTabCallback(this.$bankCode, this.$accountNo);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        access13800 access13800Var = (access13800) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 59;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            str.length();
            throw null;
        }
        if (str.length() == 0 || str2.length() == 0) {
            return null;
        }
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new IAuthTabCallback(str2, str, null), access13800Var);
        int i3 = IAuthTabCallback_Parcel + 101;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return objOnExtraCallback;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends KeyBoardVisiblePoint>>, Object> {
        final /* synthetic */ onExtraCallbackWithResult $targetAccount;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$targetAccount = onextracallbackwithresult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onNavigationEvent(this.$targetAccount, access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super List<? extends KeyBoardVisiblePoint>> access13800Var) {
            return ((onNavigationEvent) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            ArrayList arrayList = new ArrayList();
            onExtraCallbackWithResult onextracallbackwithresult = this.$targetAccount;
            PageShowPoint.onWarmupCompleted onwarmupcompleted = PageShowPoint.Companion;
            arrayList.addAll(onwarmupcompleted.IAuthTabCallback());
            arrayList.addAll(issueCertV3.onExtraCallback((List<? extends KeyBoardVisiblePoint>) onwarmupcompleted.asInterface()));
            if (onextracallbackwithresult instanceof onExtraCallbackWithResult.onExtraCallback) {
                CollectionsKt__MutableCollectionsKt.removeAll((List) arrayList, (Function1) new SchemeAccountChargeActivity$getAvailableAccounts$2$.ExternalSyntheticLambda0(onextracallbackwithresult));
            }
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new UST_TSA_VerifyTimeStampTokenWithHash());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((KeyBoardVisiblePoint) obj2).readTypedObject()) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, KeyBoardVisiblePoint keyBoardVisiblePoint) {
            onExtraCallbackWithResult.onExtraCallback onextracallback = (onExtraCallbackWithResult.onExtraCallback) onextracallbackwithresult;
            return Intrinsics.areEqual(keyBoardVisiblePoint.onExtraCallbackWithResult(), onextracallback.onNavigationEvent().onExtraCallbackWithResult()) && keyBoardVisiblePoint.onWarmupCompleted() == onextracallback.onNavigationEvent().onWarmupCompleted();
        }
    }

    private final Object onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, access13800<? super List<? extends KeyBoardVisiblePoint>> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onNavigationEvent(onextracallbackwithresult, null), access13800Var);
        int i2 = getInterfaceDescriptor + 5;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    private static final Unit onExtraCallback(SchemeAccountChargeActivity schemeAccountChargeActivity, onExtraCallbackWithResult onextracallbackwithresult, String str, KeyBoardVisiblePoint keyBoardVisiblePoint) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 27;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        schemeAccountChargeActivity.onWarmupCompleted(keyBoardVisiblePoint, onextracallbackwithresult);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 91;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallbackWithResult(SchemeAccountChargeActivity schemeAccountChargeActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 11;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        schemeAccountChargeActivity.finish();
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.app.Dialog, o.BrickModuleImplExternalSyntheticLambda0, viva.republica.toss.account.SelectAccountBottomSheetDialog] */
    private final void IAuthTabCallback(List<? extends KeyBoardVisiblePoint> list, onExtraCallbackWithResult onextracallbackwithresult, String str) throws Throwable {
        int i = 2 % 2;
        String string = getString(R.string.app_account___535525e3fa);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Intent intent = getIntent();
        Object[] objArr = new Object[1];
        a(new char[]{22277, 54467, 27907, 35081, 19414, 36049, 25842, 28177}, ((Process.getThreadPriority(0) + 20) >> 6) + 8, objArr);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        KeyBoardVisiblePoint keyBoardVisiblePoint = null;
        boolean z = false;
        TdsCheckBoxV2View.onNavigationEvent onnavigationevent = null;
        ?? selectAccountBottomSheetDialog = new SelectAccountBottomSheetDialog(this, string, str2, str3, str4, list, keyBoardVisiblePoint, z, onnavigationevent, new SchemeAccountChargeActivity$.ExternalSyntheticLambda0(this, onextracallbackwithresult), null, str, intent.getStringExtra(((String) objArr[0]).intern()), 1372, null);
        selectAccountBottomSheetDialog.setOnDismissListener(new SchemeAccountChargeActivity$.ExternalSyntheticLambda1(this));
        selectAccountBottomSheetDialog.show();
        int i2 = IAuthTabCallback_Parcel + Imgproc.COLOR_YUV2RGB_YVYU;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 39 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0af8  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0b1a  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0b28  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x1085  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x108c  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x10df  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x1106  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x1132  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x114d  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x1156  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x1163  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x1168  */
    /* JADX WARN: Type inference failed for: r10v72 */
    /* JADX WARN: Type inference failed for: r10v73 */
    /* JADX WARN: Type inference failed for: r10v95 */
    /* JADX WARN: Type inference failed for: r10v96 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v55, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r2v69, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v70, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r2v71, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r2v72, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r2v73, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v76, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r30v0, types: [android.app.Activity, im.toss.base.BaseActivity, viva.republica.toss.account.SchemeAccountChargeActivity] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v57, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX WARN: Type inference failed for: r3v89 */
    /* JADX WARN: Type inference failed for: r3v90 */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r3v93 */
    /* JADX WARN: Type inference failed for: r3v94 */
    /* JADX WARN: Type inference failed for: r3v95 */
    /* JADX WARN: Type inference failed for: r3v96 */
    /* JADX WARN: Type inference failed for: r3v97 */
    /* JADX WARN: Type inference failed for: r3v98 */
    /* JADX WARN: Type inference failed for: r3v99 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(KeyBoardVisiblePoint keyBoardVisiblePoint, onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        Long l;
        Class<Short[]> cls;
        Class<Short[]> cls2;
        Boolean bool;
        Intent intent;
        boolean z;
        String str;
        String str2;
        String stringExtra;
        Uri.Builder builderBuildUpon;
        ?? string;
        Object next;
        Bundle extras;
        String string2;
        Class<Short[]> cls3;
        Class<Byte[]> cls4;
        Object obj;
        Object array;
        Object next2;
        boolean z2;
        Object array2;
        Bundle extras2;
        String string3;
        ?? r10;
        ?? array3;
        Object next3;
        boolean z3;
        int i = 2 % 2;
        Intent intent2 = getIntent();
        if (intent2 == null || (extras2 = intent2.getExtras()) == null || !extras2.containsKey("amount")) {
            l = null;
        } else if (zzbq.onNavigationEvent(intent2)) {
            Bundle extras3 = intent2.getExtras();
            if (extras3 != null && (string3 = extras3.getString("amount")) != null) {
                if (Intrinsics.areEqual(Long.class, Integer.class)) {
                    array3 = StringsKt__StringNumberConversionsKt.toIntOrNull(string3);
                } else if (Intrinsics.areEqual(Long.class, Long.class)) {
                    array3 = StringsKt__StringNumberConversionsKt.toLongOrNull(string3);
                } else if (Intrinsics.areEqual(Long.class, Float.class)) {
                    array3 = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string3);
                } else if (Intrinsics.areEqual(Long.class, Double.class)) {
                    array3 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(string3);
                } else if (Intrinsics.areEqual(Long.class, Short.class)) {
                    array3 = StringsKt__StringNumberConversionsKt.toShortOrNull(string3);
                } else if (Intrinsics.areEqual(Long.class, Byte.class)) {
                    array3 = StringsKt__StringNumberConversionsKt.toByteOrNull(string3);
                } else if (Intrinsics.areEqual(Long.class, Boolean.class)) {
                    array3 = Boolean.valueOf(Boolean.parseBoolean(string3));
                } else if (Intrinsics.areEqual(Long.class, Character.class)) {
                    array3 = Character.valueOf(string3.charAt(0));
                } else {
                    array3 = string3;
                    if (!Intrinsics.areEqual(Long.class, String.class)) {
                        if (Intrinsics.areEqual(Long.class, Integer[].class)) {
                            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : listSplit$default) {
                                int i2 = IAuthTabCallback_Parcel + 67;
                                getInterfaceDescriptor = i2 % 128;
                                int i3 = i2 % 2;
                                if (((String) obj2).length() > 0) {
                                    arrayList.add(obj2);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it.next()).toString())));
                            }
                            array3 = arrayList2.toArray(new Integer[0]);
                        } else if (Intrinsics.areEqual(Long.class, Long[].class)) {
                            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
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
                            array3 = arrayList4.toArray(new Long[0]);
                        } else if (Intrinsics.areEqual(Long.class, Float[].class)) {
                            List listSplit$default3 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
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
                            array3 = arrayList6.toArray(new Float[0]);
                        } else {
                            if (Intrinsics.areEqual(Long.class, Double[].class)) {
                                List listSplit$default4 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj5 : listSplit$default4) {
                                    if (((String) obj5).length() > 0) {
                                        int i4 = IAuthTabCallback_Parcel + 47;
                                        getInterfaceDescriptor = i4 % 128;
                                        if (i4 % 2 == 0) {
                                            arrayList7.add(obj5);
                                            throw null;
                                        }
                                        arrayList7.add(obj5);
                                    }
                                }
                                r10 = null;
                                ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                                Iterator it4 = arrayList7.iterator();
                                while (it4.hasNext()) {
                                    arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it4.next()).toString())));
                                }
                                array3 = arrayList8.toArray(new Double[0]);
                            } else {
                                r10 = null;
                                if (Intrinsics.areEqual(Long.class, Short[].class)) {
                                    List listSplit$default5 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList9 = new ArrayList();
                                    Iterator it5 = listSplit$default5.iterator();
                                    while (!(!it5.hasNext())) {
                                        Object next4 = it5.next();
                                        if (((String) next4).length() > 0) {
                                            arrayList9.add(next4);
                                        }
                                    }
                                    ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList9, 10));
                                    Iterator it6 = arrayList9.iterator();
                                    while (it6.hasNext()) {
                                        arrayList10.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it6.next()).toString())));
                                    }
                                    array3 = arrayList10.toArray(new Short[0]);
                                } else if (Intrinsics.areEqual(Long.class, Byte[].class)) {
                                    List listSplit$default6 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList11 = new ArrayList();
                                    for (Object obj6 : listSplit$default6) {
                                        if (((String) obj6).length() > 0) {
                                            int i5 = IAuthTabCallback_Parcel + 59;
                                            getInterfaceDescriptor = i5 % 128;
                                            int i6 = i5 % 2;
                                            arrayList11.add(obj6);
                                        }
                                    }
                                    ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList11, 10));
                                    Iterator it7 = arrayList11.iterator();
                                    while (it7.hasNext()) {
                                        arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it7.next()).toString())));
                                    }
                                    array3 = arrayList12.toArray(new Byte[0]);
                                } else if (Intrinsics.areEqual(Long.class, Boolean[].class)) {
                                    List listSplit$default7 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList13 = new ArrayList();
                                    for (Object obj7 : listSplit$default7) {
                                        if (((String) obj7).length() > 0) {
                                            arrayList13.add(obj7);
                                        }
                                    }
                                    ArrayList arrayList14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList13, 10));
                                    Iterator it8 = arrayList13.iterator();
                                    while (it8.hasNext()) {
                                        arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt__StringsKt.trim((CharSequence) it8.next()).toString())));
                                    }
                                    array3 = arrayList14.toArray(new Boolean[0]);
                                } else if (Intrinsics.areEqual(Long.class, Character[].class)) {
                                    List listSplit$default8 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
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
                                    array3 = arrayList16.toArray(new Character[0]);
                                } else if (Intrinsics.areEqual(Long.class, String[].class)) {
                                    List listSplit$default9 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList17 = new ArrayList();
                                    for (Object obj9 : listSplit$default9) {
                                        if (((String) obj9).length() > 0) {
                                            arrayList17.add(obj9);
                                        }
                                    }
                                    array3 = arrayList17.toArray(new String[0]);
                                    int i7 = IAuthTabCallback_Parcel + 27;
                                    getInterfaceDescriptor = i7 % 128;
                                    int i8 = i7 % 2;
                                } else {
                                    Object[] enumConstants = Long.class.getEnumConstants();
                                    if (enumConstants != null) {
                                        ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                        for (Object obj10 : enumConstants) {
                                            Intrinsics.checkNotNull(obj10, "");
                                            arrayList18.add((Enum) obj10);
                                        }
                                        Iterator it10 = arrayList18.iterator();
                                        while (true) {
                                            if (!it10.hasNext()) {
                                                next3 = null;
                                                break;
                                            }
                                            next3 = it10.next();
                                            if (Intrinsics.areEqual(((Enum) next3).name(), string3)) {
                                                int i9 = getInterfaceDescriptor + 73;
                                                IAuthTabCallback_Parcel = i9 % 128;
                                                int i10 = i9 % 2;
                                                break;
                                            }
                                        }
                                        array3 = (Enum) next3;
                                    } else {
                                        array3 = 0;
                                    }
                                    if (array3 == 0) {
                                        if (zzaj.onNavigationEvent().onActivityLayout()) {
                                            throw new IllegalArgumentException(Long.class.getSimpleName() + " is not supported");
                                        }
                                        array3 = 0;
                                    }
                                }
                            }
                            z3 = array3 instanceof Long;
                            Long l2 = array3;
                            if (!z3) {
                                l2 = r10;
                            }
                            l = l2;
                        }
                    }
                }
                r10 = null;
                z3 = array3 instanceof Long;
                Long l22 = array3;
                if (!z3) {
                }
                l = l22;
            }
        } else {
            Bundle extras4 = intent2.getExtras();
            Object obj11 = extras4 != null ? extras4.get("amount") : null;
            if (!(obj11 instanceof Long)) {
                obj11 = null;
            }
            l = (Long) obj11;
        }
        Class<Byte[]> cls5 = Byte[].class;
        Class<Boolean[]> cls6 = Boolean[].class;
        Class<Character[]> cls7 = Character[].class;
        long jLongValue = (l != null ? l : -1L).longValue();
        Intent intent3 = getIntent();
        Boolean bool2 = Boolean.FALSE;
        if (intent3 != null && (extras = intent3.getExtras()) != null) {
            int i11 = getInterfaceDescriptor + 99;
            cls = Short[].class;
            IAuthTabCallback_Parcel = i11 % 128;
            int i12 = i11 % 2;
            if (extras.containsKey("skipAd")) {
                if (zzbq.onNavigationEvent(intent3)) {
                    Bundle extras5 = intent3.getExtras();
                    if (extras5 != null && (string2 = extras5.getString("skipAd")) != null) {
                        if (Intrinsics.areEqual(Boolean.class, Integer.class)) {
                            array2 = StringsKt__StringNumberConversionsKt.toIntOrNull(string2);
                        } else if (Intrinsics.areEqual(Boolean.class, Long.class)) {
                            array2 = StringsKt__StringNumberConversionsKt.toLongOrNull(string2);
                        } else if (Intrinsics.areEqual(Boolean.class, Float.class)) {
                            array2 = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string2);
                        } else if (Intrinsics.areEqual(Boolean.class, Double.class)) {
                            array2 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(string2);
                        } else if (Intrinsics.areEqual(Boolean.class, Short.class)) {
                            array2 = StringsKt__StringNumberConversionsKt.toShortOrNull(string2);
                        } else if (Intrinsics.areEqual(Boolean.class, Byte.class)) {
                            array2 = StringsKt__StringNumberConversionsKt.toByteOrNull(string2);
                        } else if (Intrinsics.areEqual(Boolean.class, Boolean.class)) {
                            array2 = Boolean.valueOf(Boolean.parseBoolean(string2));
                        } else if (Intrinsics.areEqual(Boolean.class, Character.class)) {
                            array2 = Character.valueOf(string2.charAt(0));
                        } else {
                            array2 = string2;
                            if (!Intrinsics.areEqual(Boolean.class, String.class)) {
                                if (Intrinsics.areEqual(Boolean.class, Integer[].class)) {
                                    List listSplit$default10 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList19 = new ArrayList();
                                    for (Object obj12 : listSplit$default10) {
                                        int i13 = getInterfaceDescriptor + 53;
                                        IAuthTabCallback_Parcel = i13 % 128;
                                        int i14 = i13 % 2;
                                        if (((String) obj12).length() > 0) {
                                            arrayList19.add(obj12);
                                        }
                                    }
                                    ArrayList arrayList20 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList19, 10));
                                    Iterator it11 = arrayList19.iterator();
                                    while (it11.hasNext()) {
                                        arrayList20.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it11.next()).toString())));
                                    }
                                    array2 = arrayList20.toArray(new Integer[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Long[].class)) {
                                    List listSplit$default11 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList21 = new ArrayList();
                                    Iterator it12 = listSplit$default11.iterator();
                                    while (!(!it12.hasNext())) {
                                        Object next5 = it12.next();
                                        if (((String) next5).length() > 0) {
                                            arrayList21.add(next5);
                                        }
                                    }
                                    ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList21, 10));
                                    Iterator it13 = arrayList21.iterator();
                                    while (it13.hasNext()) {
                                        arrayList22.add(Long.valueOf(Long.parseLong(StringsKt__StringsKt.trim((CharSequence) it13.next()).toString())));
                                    }
                                    array2 = arrayList22.toArray(new Long[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Float[].class)) {
                                    List listSplit$default12 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList23 = new ArrayList();
                                    for (Object obj13 : listSplit$default12) {
                                        if (((String) obj13).length() > 0) {
                                            arrayList23.add(obj13);
                                        }
                                    }
                                    ArrayList arrayList24 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList23, 10));
                                    Iterator it14 = arrayList23.iterator();
                                    while (it14.hasNext()) {
                                        arrayList24.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it14.next()).toString())));
                                    }
                                    array2 = arrayList24.toArray(new Float[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Double[].class)) {
                                    List listSplit$default13 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList25 = new ArrayList();
                                    for (Object obj14 : listSplit$default13) {
                                        if (((String) obj14).length() > 0) {
                                            arrayList25.add(obj14);
                                        }
                                    }
                                    ArrayList arrayList26 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList25, 10));
                                    Iterator it15 = arrayList25.iterator();
                                    while (it15.hasNext()) {
                                        arrayList26.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it15.next()).toString())));
                                    }
                                    array2 = arrayList26.toArray(new Double[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Short[].class)) {
                                    List listSplit$default14 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList27 = new ArrayList();
                                    for (Object obj15 : listSplit$default14) {
                                        if (((String) obj15).length() > 0) {
                                            arrayList27.add(obj15);
                                        }
                                    }
                                    cls = Short[].class;
                                    ArrayList arrayList28 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList27, 10));
                                    Iterator it16 = arrayList27.iterator();
                                    while (it16.hasNext()) {
                                        arrayList28.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it16.next()).toString())));
                                    }
                                    array2 = arrayList28.toArray(new Short[0]);
                                } else {
                                    cls2 = Short[].class;
                                    if (Intrinsics.areEqual(Boolean.class, Byte[].class)) {
                                        List listSplit$default15 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList29 = new ArrayList();
                                        for (Object obj16 : listSplit$default15) {
                                            if (((String) obj16).length() > 0) {
                                                arrayList29.add(obj16);
                                            }
                                        }
                                        ArrayList arrayList30 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList29, 10));
                                        Iterator it17 = arrayList29.iterator();
                                        while (it17.hasNext()) {
                                            arrayList30.add(Byte.valueOf(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it17.next()).toString())));
                                        }
                                        cls5 = Byte[].class;
                                        array = arrayList30.toArray(new Byte[0]);
                                    } else {
                                        cls5 = Byte[].class;
                                        if (Intrinsics.areEqual(Boolean.class, Boolean[].class)) {
                                            List listSplit$default16 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList31 = new ArrayList();
                                            for (Object obj17 : listSplit$default16) {
                                                if (((String) obj17).length() > 0) {
                                                    arrayList31.add(obj17);
                                                }
                                            }
                                            ArrayList arrayList32 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList31, 10));
                                            Iterator it18 = arrayList31.iterator();
                                            while (it18.hasNext()) {
                                                arrayList32.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt__StringsKt.trim((CharSequence) it18.next()).toString())));
                                            }
                                            cls6 = Boolean[].class;
                                            array = arrayList32.toArray(new Boolean[0]);
                                        } else {
                                            cls6 = Boolean[].class;
                                            if (Intrinsics.areEqual(Boolean.class, Character[].class)) {
                                                List listSplit$default17 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                                ArrayList arrayList33 = new ArrayList();
                                                for (Object obj18 : listSplit$default17) {
                                                    if (((String) obj18).length() > 0) {
                                                        arrayList33.add(obj18);
                                                    }
                                                }
                                                ArrayList arrayList34 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList33, 10));
                                                Iterator it19 = arrayList33.iterator();
                                                while (it19.hasNext()) {
                                                    arrayList34.add(Character.valueOf(StringsKt__StringsKt.trim((CharSequence) it19.next()).toString().charAt(0)));
                                                }
                                                cls7 = Character[].class;
                                                array = arrayList34.toArray(new Character[0]);
                                            } else {
                                                cls7 = Character[].class;
                                                if (Intrinsics.areEqual(Boolean.class, String[].class)) {
                                                    List listSplit$default18 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                                    ArrayList arrayList35 = new ArrayList();
                                                    for (Object obj19 : listSplit$default18) {
                                                        if (((String) obj19).length() > 0) {
                                                            arrayList35.add(obj19);
                                                        }
                                                    }
                                                    array = arrayList35.toArray(new String[0]);
                                                } else {
                                                    Object[] enumConstants2 = Boolean.class.getEnumConstants();
                                                    if (enumConstants2 != null) {
                                                        cls3 = cls2;
                                                        ArrayList arrayList36 = new ArrayList(enumConstants2.length);
                                                        int length = enumConstants2.length;
                                                        cls4 = cls5;
                                                        int i15 = 0;
                                                        while (i15 < length) {
                                                            int i16 = length;
                                                            Object obj20 = enumConstants2[i15];
                                                            Intrinsics.checkNotNull(obj20, "");
                                                            arrayList36.add((Enum) obj20);
                                                            i15++;
                                                            length = i16;
                                                        }
                                                        Iterator it20 = arrayList36.iterator();
                                                        while (true) {
                                                            if (it20.hasNext()) {
                                                                next2 = it20.next();
                                                                if (Intrinsics.areEqual(((Enum) next2).name(), string2)) {
                                                                    break;
                                                                }
                                                            } else {
                                                                next2 = null;
                                                                break;
                                                            }
                                                        }
                                                        obj = (Enum) next2;
                                                    } else {
                                                        cls3 = cls2;
                                                        cls4 = cls5;
                                                        obj = null;
                                                    }
                                                    if (obj != null) {
                                                        cls2 = cls3;
                                                        cls5 = cls4;
                                                        array = obj;
                                                    } else {
                                                        if (zzaj.onNavigationEvent().onActivityLayout()) {
                                                            throw new IllegalArgumentException(Boolean.class.getSimpleName() + " is not supported");
                                                        }
                                                        cls2 = cls3;
                                                        cls5 = cls4;
                                                        array = null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    z2 = array instanceof Boolean;
                                    Object obj21 = array;
                                    if (!z2) {
                                        obj21 = null;
                                    }
                                    bool = (Boolean) obj21;
                                }
                            }
                        }
                        cls2 = cls;
                        array = array2;
                        z2 = array instanceof Boolean;
                        Object obj212 = array;
                        if (!z2) {
                        }
                        bool = (Boolean) obj212;
                    }
                } else {
                    Bundle extras6 = intent3.getExtras();
                    Object obj22 = extras6 != null ? extras6.get("skipAd") : null;
                    if (!(obj22 instanceof Boolean)) {
                        obj22 = null;
                    }
                    bool = (Boolean) obj22;
                    cls2 = cls;
                }
            }
            if (bool != null) {
                bool2 = bool;
            }
            boolean zBooleanValue = bool2.booleanValue();
            intent = getIntent();
            if (intent == null) {
                str = "skipAd";
                Bundle extras7 = intent.getExtras();
                if (extras7 != null) {
                    z = zBooleanValue;
                    if (extras7.containsKey("origin")) {
                        if (zzbq.onNavigationEvent(intent)) {
                            Bundle extras8 = intent.getExtras();
                            if (extras8 != null && (string = extras8.getString("origin")) != 0) {
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
                                    string = Boolean.valueOf(Boolean.parseBoolean(string));
                                } else if (Intrinsics.areEqual(String.class, Character.class)) {
                                    int i17 = IAuthTabCallback_Parcel + 3;
                                    getInterfaceDescriptor = i17 % 128;
                                    int i18 = i17 % 2;
                                    string = Character.valueOf(string.charAt(0));
                                } else if (!Intrinsics.areEqual(String.class, String.class)) {
                                    if (Intrinsics.areEqual(String.class, Integer[].class)) {
                                        List listSplit$default19 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList37 = new ArrayList();
                                        for (Object obj23 : listSplit$default19) {
                                            if (((String) obj23).length() > 0) {
                                                arrayList37.add(obj23);
                                            }
                                        }
                                        ArrayList arrayList38 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList37, 10));
                                        Iterator it21 = arrayList37.iterator();
                                        while (it21.hasNext()) {
                                            arrayList38.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it21.next()).toString())));
                                        }
                                        string = arrayList38.toArray(new Integer[0]);
                                    } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                                        List listSplit$default20 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList39 = new ArrayList();
                                        for (Object obj24 : listSplit$default20) {
                                            if (((String) obj24).length() > 0) {
                                                arrayList39.add(obj24);
                                            }
                                        }
                                        ArrayList arrayList40 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList39, 10));
                                        Iterator it22 = arrayList39.iterator();
                                        while (it22.hasNext()) {
                                            arrayList40.add(Long.valueOf(Long.parseLong(StringsKt__StringsKt.trim((CharSequence) it22.next()).toString())));
                                        }
                                        string = arrayList40.toArray(new Long[0]);
                                    } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                                        List listSplit$default21 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList41 = new ArrayList();
                                        for (Object obj25 : listSplit$default21) {
                                            if (((String) obj25).length() > 0) {
                                                arrayList41.add(obj25);
                                            }
                                        }
                                        ArrayList arrayList42 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList41, 10));
                                        Iterator it23 = arrayList41.iterator();
                                        while (it23.hasNext()) {
                                            arrayList42.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it23.next()).toString())));
                                        }
                                        string = arrayList42.toArray(new Float[0]);
                                    } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                                        List listSplit$default22 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList43 = new ArrayList();
                                        for (Object obj26 : listSplit$default22) {
                                            if (((String) obj26).length() > 0) {
                                                int i19 = getInterfaceDescriptor + 91;
                                                IAuthTabCallback_Parcel = i19 % 128;
                                                if (i19 % 2 != 0) {
                                                    arrayList43.add(obj26);
                                                    int i20 = 82 / 0;
                                                } else {
                                                    arrayList43.add(obj26);
                                                }
                                            }
                                        }
                                        ArrayList arrayList44 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList43, 10));
                                        Iterator it24 = arrayList43.iterator();
                                        while (it24.hasNext()) {
                                            arrayList44.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it24.next()).toString())));
                                        }
                                        string = arrayList44.toArray(new Double[0]);
                                    } else if (Intrinsics.areEqual(String.class, cls2)) {
                                        List listSplit$default23 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList45 = new ArrayList();
                                        for (Object obj27 : listSplit$default23) {
                                            if (((String) obj27).length() > 0) {
                                                arrayList45.add(obj27);
                                            }
                                        }
                                        ArrayList arrayList46 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList45, 10));
                                        Iterator it25 = arrayList45.iterator();
                                        while (it25.hasNext()) {
                                            arrayList46.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it25.next()).toString())));
                                        }
                                        string = arrayList46.toArray(new Short[0]);
                                    } else if (Intrinsics.areEqual(String.class, cls5)) {
                                        List listSplit$default24 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList47 = new ArrayList();
                                        for (Object obj28 : listSplit$default24) {
                                            if (((String) obj28).length() > 0) {
                                                arrayList47.add(obj28);
                                            }
                                        }
                                        ArrayList arrayList48 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList47, 10));
                                        Iterator it26 = arrayList47.iterator();
                                        while (it26.hasNext()) {
                                            arrayList48.add(Byte.valueOf(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it26.next()).toString())));
                                        }
                                        string = arrayList48.toArray(new Byte[0]);
                                    } else if (Intrinsics.areEqual(String.class, cls6)) {
                                        List listSplit$default25 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList49 = new ArrayList();
                                        for (Object obj29 : listSplit$default25) {
                                            if (((String) obj29).length() > 0) {
                                                arrayList49.add(obj29);
                                            }
                                        }
                                        ArrayList arrayList50 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList49, 10));
                                        Iterator it27 = arrayList49.iterator();
                                        while (it27.hasNext()) {
                                            arrayList50.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt__StringsKt.trim((CharSequence) it27.next()).toString())));
                                        }
                                        string = arrayList50.toArray(new Boolean[0]);
                                    } else if (Intrinsics.areEqual(String.class, cls7)) {
                                        List listSplit$default26 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList51 = new ArrayList();
                                        for (Object obj30 : listSplit$default26) {
                                            if (((String) obj30).length() > 0) {
                                                arrayList51.add(obj30);
                                            }
                                        }
                                        ArrayList arrayList52 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList51, 10));
                                        Iterator it28 = arrayList51.iterator();
                                        while (it28.hasNext()) {
                                            arrayList52.add(Character.valueOf(StringsKt__StringsKt.trim((CharSequence) it28.next()).toString().charAt(0)));
                                        }
                                        string = arrayList52.toArray(new Character[0]);
                                    } else if (Intrinsics.areEqual(String.class, String[].class)) {
                                        List listSplit$default27 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList53 = new ArrayList();
                                        for (Object obj31 : listSplit$default27) {
                                            if (((String) obj31).length() > 0) {
                                                arrayList53.add(obj31);
                                            }
                                        }
                                        string = arrayList53.toArray(new String[0]);
                                    } else {
                                        Object[] enumConstants3 = String.class.getEnumConstants();
                                        if (enumConstants3 != null) {
                                            ArrayList arrayList54 = new ArrayList(enumConstants3.length);
                                            for (Object obj32 : enumConstants3) {
                                                int i21 = getInterfaceDescriptor + 113;
                                                IAuthTabCallback_Parcel = i21 % 128;
                                                int i22 = i21 % 2;
                                                Intrinsics.checkNotNull(obj32, "");
                                                arrayList54.add((Enum) obj32);
                                            }
                                            Iterator it29 = arrayList54.iterator();
                                            while (true) {
                                                if (it29.hasNext()) {
                                                    next = it29.next();
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
                                            if (!(!zzaj.onNavigationEvent().onActivityLayout())) {
                                                throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                                            }
                                            string = 0;
                                        }
                                    }
                                }
                                str2 = !(string instanceof String) ? null : string;
                            }
                        } else {
                            Bundle extras9 = intent.getExtras();
                            Object obj33 = extras9 != null ? extras9.get("origin") : null;
                            str2 = (String) (!(obj33 instanceof String) ? null : obj33);
                        }
                    }
                    if (str2 == null) {
                        str2 = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                    Intent intent4 = getIntent();
                    Object[] objArr = new Object[1];
                    a(new char[]{22277, 54467, 27907, 35081, 19414, 36049, 25842, 28177}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9, objArr);
                    stringExtra = intent4.getStringExtra(((String) objArr[0]).intern());
                    Object[] objArr2 = new Object[1];
                    a(new char[]{44616, 40975, 25851, 33897, 31173, 62633, 46190, 57633, 25998, 3082, 46121, 21813, 51207, 57936, 1538, 40343}, 17 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
                    builderBuildUpon = Uri.parse(((String) objArr2[0]).intern()).buildUpon();
                    if (onextracallbackwithresult instanceof onExtraCallbackWithResult.onExtraCallback) {
                        KeyBoardVisiblePoint keyBoardVisiblePointOnNavigationEvent = ((onExtraCallbackWithResult.onExtraCallback) onextracallbackwithresult).onNavigationEvent();
                        if (keyBoardVisiblePointOnNavigationEvent instanceof onDisclaimerClick) {
                            builderBuildUpon.appendQueryParameter("toMyTossAccountId", keyBoardVisiblePointOnNavigationEvent.onExtraCallbackWithResult());
                        } else {
                            builderBuildUpon.appendQueryParameter("accountNo", keyBoardVisiblePointOnNavigationEvent.bP_());
                            builderBuildUpon.appendQueryParameter("bankCode", keyBoardVisiblePointOnNavigationEvent.asInterface());
                        }
                    } else {
                        if (!(onextracallbackwithresult instanceof onExtraCallbackWithResult.onWarmupCompleted)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        onExtraCallbackWithResult.onWarmupCompleted onwarmupcompleted = (onExtraCallbackWithResult.onWarmupCompleted) onextracallbackwithresult;
                        builderBuildUpon.appendQueryParameter("accountNo", onwarmupcompleted.IAuthTabCallback());
                        builderBuildUpon.appendQueryParameter("bankCode", onwarmupcompleted.onWarmupCompleted());
                    }
                    builderBuildUpon.appendQueryParameter("justClose", "true");
                    builderBuildUpon.appendQueryParameter("textType", TransferTextType.FILL.getType());
                    if (keyBoardVisiblePoint != null) {
                        builderBuildUpon.appendQueryParameter("accountFrom", keyBoardVisiblePoint.onExtraCallbackWithResult());
                        builderBuildUpon.appendQueryParameter("accountTypeFrom", keyBoardVisiblePoint instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener ? "bank" : "toss");
                    }
                    if (jLongValue > 0) {
                        builderBuildUpon.appendQueryParameter("amount", String.valueOf(jLongValue));
                    }
                    if (z) {
                        builderBuildUpon.appendQueryParameter(str, "true");
                    }
                    if (!StringsKt__StringsKt.isBlank(str2)) {
                        builderBuildUpon.appendQueryParameter("origin", str2);
                    }
                    if (stringExtra != null && stringExtra.length() != 0) {
                        Object[] objArr3 = new Object[1];
                        a(new char[]{22277, 54467, 27907, 35081, 19414, 36049, 25842, 28177}, 8 - TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), objArr3);
                        builderBuildUpon.appendQueryParameter(((String) objArr3[0]).intern(), stringExtra);
                    }
                    String string4 = builderBuildUpon.build().toString();
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    SessionTrackerb.onExtraCallbackWithResult(IAuthTabCallback(), getContext(), string4, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                }
                z = zBooleanValue;
            } else {
                z = zBooleanValue;
                str = "skipAd";
            }
            str2 = null;
            if (str2 == null) {
            }
            Intent intent42 = getIntent();
            Object[] objArr4 = new Object[1];
            a(new char[]{22277, 54467, 27907, 35081, 19414, 36049, 25842, 28177}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9, objArr4);
            stringExtra = intent42.getStringExtra(((String) objArr4[0]).intern());
            Object[] objArr22 = new Object[1];
            a(new char[]{44616, 40975, 25851, 33897, 31173, 62633, 46190, 57633, 25998, 3082, 46121, 21813, 51207, 57936, 1538, 40343}, 17 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr22);
            builderBuildUpon = Uri.parse(((String) objArr22[0]).intern()).buildUpon();
            if (onextracallbackwithresult instanceof onExtraCallbackWithResult.onExtraCallback) {
            }
            builderBuildUpon.appendQueryParameter("justClose", "true");
            builderBuildUpon.appendQueryParameter("textType", TransferTextType.FILL.getType());
            if (keyBoardVisiblePoint != null) {
            }
            if (jLongValue > 0) {
            }
            if (z) {
            }
            if (!StringsKt__StringsKt.isBlank(str2)) {
            }
            if (stringExtra != null) {
                Object[] objArr32 = new Object[1];
                a(new char[]{22277, 54467, 27907, 35081, 19414, 36049, 25842, 28177}, 8 - TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), objArr32);
                builderBuildUpon.appendQueryParameter(((String) objArr32[0]).intern(), stringExtra);
            }
            String string42 = builderBuildUpon.build().toString();
            Intrinsics.checkNotNullExpressionValue(string42, "");
            SessionTrackerb.onExtraCallbackWithResult(IAuthTabCallback(), getContext(), string42, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
        cls = Short[].class;
        cls2 = cls;
        bool = null;
        if (bool != null) {
        }
        boolean zBooleanValue2 = bool2.booleanValue();
        intent = getIntent();
        if (intent == null) {
        }
        str2 = null;
        if (str2 == null) {
        }
        Intent intent422 = getIntent();
        Object[] objArr42 = new Object[1];
        a(new char[]{22277, 54467, 27907, 35081, 19414, 36049, 25842, 28177}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9, objArr42);
        stringExtra = intent422.getStringExtra(((String) objArr42[0]).intern());
        Object[] objArr222 = new Object[1];
        a(new char[]{44616, 40975, 25851, 33897, 31173, 62633, 46190, 57633, 25998, 3082, 46121, 21813, 51207, 57936, 1538, 40343}, 17 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr222);
        builderBuildUpon = Uri.parse(((String) objArr222[0]).intern()).buildUpon();
        if (onextracallbackwithresult instanceof onExtraCallbackWithResult.onExtraCallback) {
        }
        builderBuildUpon.appendQueryParameter("justClose", "true");
        builderBuildUpon.appendQueryParameter("textType", TransferTextType.FILL.getType());
        if (keyBoardVisiblePoint != null) {
        }
        if (jLongValue > 0) {
        }
        if (z) {
        }
        if (!StringsKt__StringsKt.isBlank(str2)) {
        }
        if (stringExtra != null) {
        }
        String string422 = builderBuildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(string422, "");
        SessionTrackerb.onExtraCallbackWithResult(IAuthTabCallback(), getContext(), string422, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 59;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.isEngagementSignalsApiAvailable();
        overridePendingTransition(0, 0);
        int i4 = getInterfaceDescriptor + 35;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public static final /* synthetic */ void onExtraCallback(SchemeAccountChargeActivity schemeAccountChargeActivity, List list, onExtraCallbackWithResult onextracallbackwithresult, String str) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        onExtraCallbackWithResult(1232297336, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1232297335, new Object[]{schemeAccountChargeActivity, list, onextracallbackwithresult, str}, iOnNavigationEvent, iOnNavigationEvent2);
    }

    private final Object onWarmupCompleted(String str, String str2, access13800<? super KeyBoardVisiblePoint> access13800Var) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return onExtraCallbackWithResult(1721276908, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1721276908, new Object[]{this, str, str2, access13800Var}, iOnNavigationEvent, iOnNavigationEvent2);
    }

    private final Object onExtraCallbackWithResult(String str, String str2, access13800<? super KeyBoardVisiblePoint> access13800Var) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return onExtraCallbackWithResult(-825045830, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 825045832, new Object[]{this, str, str2, access13800Var}, iOnNavigationEvent, iOnNavigationEvent2);
    }

    @Override // viva.republica.toss.account.Hilt_SchemeAccountChargeActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getInterfaceDescriptor + 17;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.account.Hilt_SchemeAccountChargeActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = getInterfaceDescriptor + 27;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.account.Hilt_SchemeAccountChargeActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 1;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.account.Hilt_SchemeAccountChargeActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 17;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = IAuthTabCallback_Parcel + 65;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    static void onNavigationEvent() {
        IAuthTabCallbackStub = (char) 28351;
        onTransact = (char) 25208;
        asInterface = (char) 17467;
        asBinder = (char) 45698;
    }
}
