package viva.republica.toss.account.register;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.sdk.openadsdk.wwx.lt;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.utils.RxUtils;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.ASN1Set;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.ConvertByteArrayToFloatArray;
import o.EncryptedContentInfoParser;
import o.IPostMessageServiceStubProxy;
import o.JsonReaderUnknownNumberParsing;
import o.PlayerErrorCode;
import o.RightClickGesturesKtonRightClickDown2;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import o.Type;
import o.TypeUtils2;
import o.UST_CMP_IssueCertificate_SendConf;
import o.access13800;
import o.access8100;
import o.deserializeFloat;
import o.deserializeFloatNullableCollection;
import o.deserializeUriNullableCollection;
import o.getCodeNameBytes;
import o.getIssuerAndSerialNumber;
import o.getObjectParser;
import o.getSignedData;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import o.zzaz;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.register.MultiAccountAgreementActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class MultiAccountAgreementActivity extends Hilt_MultiAccountAgreementActivity {
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallback_Parcel;
    public static final int asBinder;
    private static int writeTypedObject;
    private boolean asInterface;

    @Inject
    public Type mydataHelper;
    private static final byte[] $$a = {112, 44, -46, -27};
    private static final int $$b = 30;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallback = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int getInterfaceDescriptor = 1;
    private final Lazy access100 = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(getObjectParser.class), new asInterface(this), new IAuthTabCallbackStub(this), new onTransact(null, this));
    private TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onTransact = TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult.UNDEFINED;
    private final List<TabBarInfoQueryPointOnTabBarInfoQueryListener> IAuthTabCallbackStub = new ArrayList();
    private boolean access000 = true;
    private String IAuthTabCallbackDefault = "";

    static final class onExtraCallback extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiAccountAgreementActivity.IAuthTabCallback(-1757982452, 1757982455, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{MultiAccountAgreementActivity.this, null, false, null, this}, lt.40.onExtraCallbackWithResult());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, byte r6, short r7) {
        /*
            int r6 = r6 + 4
            int r5 = r5 * 3
            int r5 = r5 + 105
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r1 = viva.republica.toss.account.register.MultiAccountAgreementActivity.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r5
            r5 = r7
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            int r6 = r6 + 1
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            r4 = r1[r6]
            int r3 = r3 + 1
        L27:
            int r5 = r5 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.MultiAccountAgreementActivity.$$c(int, byte, short):java.lang.String");
    }

    static {
        writeTypedObject = 0;
        onNavigationEvent();
        Companion = new onNavigationEvent(null);
        asBinder = 8;
        int i = ICustomTabsCallback + 115;
        writeTypedObject = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ CharSequence IAuthTabCallback(TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 49;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnExtraCallback = onExtraCallback(tabBarInfoQueryPointOnTabBarInfoQueryListener);
        int i4 = IAuthTabCallbackStubProxy + 73;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return charSequenceOnExtraCallback;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        int i7 = ~i2;
        int i8 = ~((~i3) | i7);
        int i9 = i | i8 | (~(i2 | i3));
        int i10 = (~(i3 | i)) | (~(i7 | i3)) | (~(i7 | i));
        int i11 = i + i2 + i5 + (1351532378 * i6) + (1237199896 * i4);
        int i12 = i11 * i11;
        int i13 = ((-211156802) * i) + 1314914304 + ((-491389116) * i2) + (2007367491 * i9) + (i10 * (-2007367491)) + ((-2007367491) * i8) + (1796210688 * i5) + ((-1818230784) * i6) + ((-914358272) * i4) + ((-2051670016) * i12);
        int i14 = ((i * 406040238) - 634933780) + (i2 * 406038884) + (i9 * (-677)) + (i10 * 677) + (i8 * 677) + (i5 * 406039561) + (i6 * 1283666474) + (i4 * 1712827608) + (i12 * (-77201408));
        switch (i13 + (i14 * i14 * 1831469056)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onNavigationEvent(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                BaseActivity baseActivity = (MultiAccountAgreementActivity) objArr[0];
                int i15 = 2 % 2;
                int i16 = getInterfaceDescriptor + 109;
                IAuthTabCallbackStubProxy = i16 % 128;
                int i17 = i16 % 2;
                Intent intent = baseActivity.getIntent();
                Object[] objArr2 = new Object[1];
                a(7 - ((byte) KeyEvent.getModifierMetaStateMask()), 4 - ExpandableListView.getPackedPositionGroup(0L), new char[]{65530, 65531, 65530, 7, 7, 65530, 7, 7}, true, TextUtils.indexOf("", "", 0) + 235, objArr2);
                String stringExtra = intent.getStringExtra(((String) objArr2[0]).intern());
                int i18 = getInterfaceDescriptor + 37;
                IAuthTabCallbackStubProxy = i18 % 128;
                int i19 = i18 % 2;
                return stringExtra;
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return asBinder(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(MultiAccountAgreementActivity multiAccountAgreementActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
            return (Unit) IAuthTabCallback(-1785954168, 1785954170, iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{multiAccountAgreementActivity, setDetectableSize}, iOnExtraCallbackWithResult3);
        }
        int iOnExtraCallbackWithResult4 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = lt.40.onExtraCallbackWithResult();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        MultiAccountAgreementActivity multiAccountAgreementActivity = (MultiAccountAgreementActivity) objArr[0];
        List list = (List) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(multiAccountAgreementActivity, list, setDetectableSize);
        int i4 = getInterfaceDescriptor + 5;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final String onExtraCallbackWithResult(String str, Long l) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(l, "");
        int i4 = getInterfaceDescriptor + 49;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(MultiAccountAgreementActivity multiAccountAgreementActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(multiAccountAgreementActivity, dialogInterface);
        int i4 = IAuthTabCallbackStubProxy + 79;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        MultiAccountAgreementActivity multiAccountAgreementActivity = (MultiAccountAgreementActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(multiAccountAgreementActivity);
        int i4 = IAuthTabCallbackStubProxy + 53;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = IAuthTabCallback(function2, obj, obj2);
        int i4 = getInterfaceDescriptor + 33;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback;
    }

    public static /* synthetic */ CharSequence onWarmupCompleted(TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 21;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(tabBarInfoQueryPointOnTabBarInfoQueryListener);
            throw null;
        }
        CharSequence charSequenceOnExtraCallbackWithResult = onExtraCallbackWithResult(tabBarInfoQueryPointOnTabBarInfoQueryListener);
        int i3 = getInterfaceDescriptor + 35;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return charSequenceOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        MultiAccountAgreementActivity multiAccountAgreementActivity = (MultiAccountAgreementActivity) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(multiAccountAgreementActivity, commonModule_setLeftEdgeTouchEnabled);
        }
        onExtraCallback(multiAccountAgreementActivity, commonModule_setLeftEdgeTouchEnabled);
        throw null;
    }

    public static /* synthetic */ String onWarmupCompleted(String str, Long l) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str, l);
        int i4 = IAuthTabCallbackStubProxy + 75;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(MultiAccountAgreementActivity multiAccountAgreementActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(multiAccountAgreementActivity);
        int i4 = IAuthTabCallbackStubProxy + 19;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onWarmupCompleted(MultiAccountAgreementActivity multiAccountAgreementActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(multiAccountAgreementActivity, dialogInterface);
        int i4 = getInterfaceDescriptor + 13;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(MultiAccountAgreementActivity multiAccountAgreementActivity, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 121;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(multiAccountAgreementActivity, str);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(multiAccountAgreementActivity, str);
        int i3 = getInterfaceDescriptor + 23;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(MultiAccountAgreementActivity multiAccountAgreementActivity, List list, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(multiAccountAgreementActivity, list, setDetectableSize);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(multiAccountAgreementActivity, list, setDetectableSize);
        int i3 = getInterfaceDescriptor + 73;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(MultiAccountAgreementActivity multiAccountAgreementActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(multiAccountAgreementActivity, commonModule_setLeftEdgeTouchEnabled);
        int i4 = IAuthTabCallbackStubProxy + 7;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        IAuthTabCallback(1338702072, -1338702064, iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{function1, obj}, iOnExtraCallbackWithResult3);
        int i4 = IAuthTabCallbackStubProxy + 89;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 75;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 33;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return 1214885L;
    }

    public static final /* synthetic */ TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult IAuthTabCallback(MultiAccountAgreementActivity multiAccountAgreementActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 97;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult = multiAccountAgreementActivity.onTransact;
        int i5 = i3 + 89;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return onextracallbackwithresult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        MultiAccountAgreementActivity multiAccountAgreementActivity = (MultiAccountAgreementActivity) objArr[0];
        List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener> list = (List) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        TypeUtils2 typeUtils2 = (TypeUtils2) objArr[3];
        access13800<? super Unit> access13800Var = (access13800) objArr[4];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = multiAccountAgreementActivity.onExtraCallbackWithResult(list, zBooleanValue, typeUtils2, access13800Var);
        int i4 = IAuthTabCallbackStubProxy + 51;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ getObjectParser onExtraCallbackWithResult(MultiAccountAgreementActivity multiAccountAgreementActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 97;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        getObjectParser getobjectparserValidateRelationship = multiAccountAgreementActivity.validateRelationship();
        int i4 = IAuthTabCallbackStubProxy + 7;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return getobjectparserValidateRelationship;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(MultiAccountAgreementActivity multiAccountAgreementActivity, List list, boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        multiAccountAgreementActivity.IAuthTabCallback((List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener>) list, z);
        int i4 = getInterfaceDescriptor + 79;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ String onNavigationEvent(MultiAccountAgreementActivity multiAccountAgreementActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsServiceDefault = multiAccountAgreementActivity.ICustomTabsServiceDefault();
        int i4 = IAuthTabCallbackStubProxy + 111;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return strICustomTabsServiceDefault;
    }

    private final getObjectParser validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        getObjectParser getobjectparser = (getObjectParser) this.access100.getValue();
        int i4 = IAuthTabCallbackStubProxy + 37;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return getobjectparser;
    }

    public final Type IAuthTabCallback() {
        int i = 2 % 2;
        Type type = this.mydataHelper;
        if (type != null) {
            int i2 = IAuthTabCallbackStubProxy + 103;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return type;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = getInterfaceDescriptor + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final class onNavigationEvent {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 1;
        private static long onNavigationEvent = -1110604749699738240L;
        private static int onWarmupCompleted;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            int i3 = $10 + 53;
            $11 = i3 % 128;
            while (true) {
                int i4 = i3 % 2;
                if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                    objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
                    return;
                }
                int i5 = $10 + 55;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 45811), (ViewConfiguration.getTouchSlop() >> 8) + 84, 21234 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0, 0) + 14185), 20 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 8808 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                        i3 = $11 + 17;
                        $10 = i3 % 128;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }

        private onNavigationEvent() {
        }

        public static /* synthetic */ Intent onWarmupCompleted(onNavigationEvent onnavigationevent, Context context, List list, TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult, boolean z, boolean z2, String str, String str2, String str3, int i, Object obj) {
            boolean z3;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 73;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            if (i3 % 2 == 0 ? (i & 8) == 0 : (i & 12) == 0) {
                z3 = z;
            } else {
                int i5 = i4 + 115;
                onExtraCallbackWithResult = i5 % 128;
                z3 = i5 % 2 == 0;
            }
            return onnavigationevent.onExtraCallbackWithResult(context, list, onextracallbackwithresult, z3, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? "" : str, str2, str3);
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener> list, @NotNull TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult, boolean z, boolean z2, @NotNull String str, @Nullable String str2, @Nullable String str3) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) MultiAccountAgreementActivity.class);
            intent.putParcelableArrayListExtra("foundBankAccounts", new ArrayList<>(list));
            intent.putExtra("registerAccountMethod", (Serializable) onextracallbackwithresult);
            intent.putExtra("fromMydataConnect", z);
            intent.putExtra("showSMSGuide", z2);
            intent.putExtra("mainTitle", str);
            Object[] objArr = new Object[1];
            a(new char[]{60450, 30060, 60496, 7045, 19682, 5065, 37276, 22536, 22112, 23970, 56271, 5743}, ViewConfiguration.getWindowTouchSlop() >> 8, objArr);
            intent.putExtra(((String) objArr[0]).intern(), str2);
            intent.putExtra("serviceReferrer", str3);
            int i2 = onExtraCallbackWithResult + 117;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 83 / 0;
            }
            return intent;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        IAuthTabCallbackStubProxy = i2 % 128;
        boolean booleanExtra = i2 % 2 != 0 ? getIntent().getBooleanExtra("fromMydataConnect", true) : getIntent().getBooleanExtra("fromMydataConnect", false);
        int i3 = getInterfaceDescriptor + 9;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 27 / 0;
        }
        return booleanExtra;
    }

    public static final class IAuthTabCallbackStub implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public IAuthTabCallbackStub(ComponentActivity componentActivity) {
            this.onWarmupCompleted = componentActivity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            return this.onWarmupCompleted.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String updateVisuals() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = getIntent().getStringExtra("serviceReferrer");
        int i4 = getInterfaceDescriptor + 101;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return stringExtra;
        }
        throw null;
    }

    public static final class asInterface implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ ComponentActivity onNavigationEvent;

        public asInterface(ComponentActivity componentActivity) {
            this.onNavigationEvent = componentActivity;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            return this.onNavigationEvent.getViewModelStore();
        }
    }

    public static final class onTransact implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ ComponentActivity onExtraCallbackWithResult;
        final /* synthetic */ Function0 onNavigationEvent;

        public onTransact(Function0 function0, ComponentActivity componentActivity) {
            this.onNavigationEvent = function0;
            this.onExtraCallbackWithResult = componentActivity;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.onNavigationEvent;
            return (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) ? this.onExtraCallbackWithResult.getDefaultViewModelCreationExtras() : androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    private static final Unit onNavigationEvent(MultiAccountAgreementActivity multiAccountAgreementActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            multiAccountAgreementActivity.finish();
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        multiAccountAgreementActivity.finish();
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 99;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(MultiAccountAgreementActivity multiAccountAgreementActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(multiAccountAgreementActivity.getString(R.string.visitor_block_service_message));
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, im.toss.uikit.R.string.uikit_confirm, (TdsButtonV1View.asInterface) null, false, new MultiAccountAgreementActivity$.ExternalSyntheticLambda5(multiAccountAgreementActivity), 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 65;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(MultiAccountAgreementActivity multiAccountAgreementActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            multiAccountAgreementActivity.finish();
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        multiAccountAgreementActivity.finish();
        Unit unit2 = Unit.INSTANCE;
        int i3 = getInterfaceDescriptor + 41;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(final MultiAccountAgreementActivity multiAccountAgreementActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(multiAccountAgreementActivity.getString(R.string.teens_age_block_service_info_title));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(multiAccountAgreementActivity.getString(R.string.teens_age_block_service_info_message, PlayerErrorCode.onPostMessage()));
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, im.toss.uikit.R.string.uikit_confirm, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.account.register.MultiAccountAgreementActivity$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                return MultiAccountAgreementActivity.onExtraCallbackWithResult(this.f$0, (DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 13 / 0;
        }
        return unit;
    }

    public static final class onExtraCallbackWithResult<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getCodeNameBytes.IAuthTabCallback(((TabBarInfoQueryPointOnTabBarInfoQueryListener) t).asInterface(), ((TabBarInfoQueryPointOnTabBarInfoQueryListener) t2).asInterface());
        }
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            j = 0;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $11 + 27;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(IAuthTabCallback_Parcel)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 35126), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23, 10278 - ExpandableListView.getPackedPositionType(0L), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12843), TextUtils.indexOf("", "") + 55, View.MeasureSpec.getSize(0) + 2167, 1298711993, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i9 = $10 + 109;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            int i11 = $11 + 99;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 12843), (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 55, 2167 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1298711993, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                    j = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i13 = $11 + 65;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015d  */
    @Override // viva.republica.toss.account.register.Hilt_MultiAccountAgreementActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.MultiAccountAgreementActivity.onCreate(android.os.Bundle):void");
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("foundBankAccounts", new ArrayList<>(this.IAuthTabCallbackStub));
        bundle.putSerializable("registerAccountMethod", this.onTransact);
        bundle.putBoolean("showSMSGuide", this.access000);
        bundle.putString("mainTitle", this.IAuthTabCallbackDefault);
        int i2 = IAuthTabCallbackStubProxy + 101;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                int i3 = IAuthTabCallbackStubProxy + 103;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
                supportActionBar.onNavigationEvent(true);
                return;
            }
            return;
        }
        getSupportActionBar();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void IEngagementSignalsCallback() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            o.getObjectParser r1 = r8.validateRelationship()
            java.lang.String r2 = r8.IAuthTabCallbackDefault
            r3 = 0
            if (r2 == 0) goto L25
            int r4 = viva.republica.toss.account.register.MultiAccountAgreementActivity.IAuthTabCallbackStubProxy
            int r4 = r4 + 57
            int r5 = r4 % 128
            viva.republica.toss.account.register.MultiAccountAgreementActivity.getInterfaceDescriptor = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L1e
            int r4 = r2.length()
            if (r4 != 0) goto L53
            goto L25
        L1e:
            r2.length()
            r3.hashCode()
            throw r3
        L25:
            boolean r2 = r8.setEngagementSignalsCallback()
            if (r2 == 0) goto L4a
            int r2 = viva.republica.toss.account.register.MultiAccountAgreementActivity.IAuthTabCallbackStubProxy
            int r2 = r2 + 55
            int r4 = r2 % 128
            viva.republica.toss.account.register.MultiAccountAgreementActivity.getInterfaceDescriptor = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L40
            int r0 = viva.republica.toss.R.string.account_agreement_title_mydata_std_terms_v2
            java.lang.String r2 = r8.getString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            goto L53
        L40:
            int r0 = viva.republica.toss.R.string.account_agreement_title_mydata_std_terms_v2
            java.lang.String r0 = r8.getString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            throw r3
        L4a:
            int r0 = viva.republica.toss.R.string.account_agreement_title
            java.lang.String r2 = r8.getString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
        L53:
            r1.IAuthTabCallback(r2)
            viva.republica.toss.account.register.MultiAccountAgreementStdTermsV2Fragment$onExtraCallbackWithResult r0 = viva.republica.toss.account.register.MultiAccountAgreementStdTermsV2Fragment.Companion
            viva.republica.toss.account.register.MultiAccountAgreementStdTermsV2Fragment r3 = r0.onNavigationEvent()
            int r2 = viva.republica.toss.R.id.fragment_container
            java.lang.String r4 = "agreement_fragment"
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r8
            im.toss.base.BaseActivity.onNavigationEvent(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.MultiAccountAgreementActivity.IEngagementSignalsCallback():void");
    }

    private static final String IAuthTabCallback(Function2 function2, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            return (String) function2.invoke(obj, obj2);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r3
      0x0027: PHI (r3v3 android.widget.TextView) = (r3v2 android.widget.TextView), (r3v9 android.widget.TextView) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallbackWithResult(viva.republica.toss.account.register.MultiAccountAgreementActivity r3, java.lang.String r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.register.MultiAccountAgreementActivity.getInterfaceDescriptor
            int r1 = r1 + 79
            int r2 = r1 % 128
            viva.republica.toss.account.register.MultiAccountAgreementActivity.IAuthTabCallbackStubProxy = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            int r1 = viva.republica.toss.R.id.loading_text
            android.view.View r3 = r3.findViewById(r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1 = 93
            int r1 = r1 / 0
            if (r3 == 0) goto L36
            goto L27
        L1d:
            int r1 = viva.republica.toss.R.id.loading_text
            android.view.View r3 = r3.findViewById(r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L36
        L27:
            r3.setText(r4)
            int r3 = viva.republica.toss.account.register.MultiAccountAgreementActivity.getInterfaceDescriptor
            int r3 = r3 + 7
            int r4 = r3 % 128
            viva.republica.toss.account.register.MultiAccountAgreementActivity.IAuthTabCallbackStubProxy = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L36
            int r0 = r0 / r0
        L36:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.MultiAccountAgreementActivity.onExtraCallbackWithResult(viva.republica.toss.account.register.MultiAccountAgreementActivity, java.lang.String):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener> list) {
        int i = 2 % 2;
        View viewFindViewById = findViewById(R.id.loading);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        viewFindViewById.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                int i2 = IAuthTabCallbackStubProxy + 81;
                getInterfaceDescriptor = i2 % 128;
                int i3 = i2 % 2;
                while (it2.hasNext()) {
                    int i4 = IAuthTabCallbackStubProxy + 79;
                    getInterfaceDescriptor = i4 % 128;
                    int i5 = i4 % 2;
                    arrayList3.add(getString(R.string.app_account_register___94e77cc5a4, ((TabBarInfoQueryPointOnTabBarInfoQueryListener) it2.next()).IAuthTabCallbackStub().IAuthTabCallbackStubProxy()));
                }
                arrayList.addAll(arrayList3);
                int i6 = R.string.app_account_register___38703413d7;
                String string = getString(i6);
                Intrinsics.checkNotNullExpressionValue(string, "");
                arrayList.add(string);
                String string2 = getString(i6);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                arrayList.add(string2);
                String string3 = getString(R.string.app_account_register___50570da7a0);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                arrayList.add(string3);
                JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = JsonReaderUnknownNumberParsing.onWarmupCompleted(arrayList);
                JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted2 = JsonReaderUnknownNumberParsing.onWarmupCompleted(0L, 2000L, TimeUnit.MILLISECONDS);
                final Function2 function2 = new Function2() { // from class: viva.republica.toss.account.register.MultiAccountAgreementActivity$$ExternalSyntheticLambda8
                    public final Object invoke(Object obj2, Object obj3) {
                        return MultiAccountAgreementActivity.onWarmupCompleted((String) obj2, (Long) obj3);
                    }
                };
                JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback = jsonReaderUnknownNumberParsingOnWarmupCompleted.onExtraCallback(jsonReaderUnknownNumberParsingOnWarmupCompleted2, new deserializeFloatNullableCollection() { // from class: viva.republica.toss.account.register.MultiAccountAgreementActivity$$ExternalSyntheticLambda9
                    public final Object apply(Object obj2, Object obj3) {
                        Object[] objArr = {function2, obj2, obj3};
                        return (String) MultiAccountAgreementActivity.IAuthTabCallback(-608497339, 608497346, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), objArr, lt.40.onExtraCallbackWithResult());
                    }
                });
                Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnExtraCallback, "");
                JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted3 = jsonReaderUnknownNumberParsingOnExtraCallback.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
                Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted3, "");
                final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.register.MultiAccountAgreementActivity$$ExternalSyntheticLambda10
                    public final Object invoke(Object obj2) {
                        return MultiAccountAgreementActivity.onWarmupCompleted(this.f$0, (String) obj2);
                    }
                };
                deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = jsonReaderUnknownNumberParsingOnWarmupCompleted3.IAuthTabCallback(new deserializeFloat() { // from class: viva.republica.toss.account.register.MultiAccountAgreementActivity$$ExternalSyntheticLambda11
                    public final void accept(Object obj2) throws Throwable {
                        MultiAccountAgreementActivity.onWarmupCompleted(function1, obj2);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
                onNavigationEvent(deserializeurinullablecollectionIAuthTabCallback);
                ConvertByteArrayToFloatArray.onExtraCallback(1013027L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.register.MultiAccountAgreementActivity$$ExternalSyntheticLambda12
                    public final Object invoke(Object obj2) {
                        return MultiAccountAgreementActivity.IAuthTabCallback(this.f$0, (SetDetectableSize) obj2);
                    }
                }, 14, (Object) null);
                return;
            }
            Object next = it.next();
            if (hashSet.add(((TabBarInfoQueryPointOnTabBarInfoQueryListener) next).asInterface())) {
                int i7 = IAuthTabCallbackStubProxy + 107;
                getInterfaceDescriptor = i7 % 128;
                if (i7 % 2 == 0) {
                    arrayList2.add(next);
                    obj.hashCode();
                    throw null;
                }
                arrayList2.add(next);
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        MultiAccountAgreementActivity multiAccountAgreementActivity = (MultiAccountAgreementActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        String str = (String) IAuthTabCallback(-1251997863, 1251997867, iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{multiAccountAgreementActivity}, iOnExtraCallbackWithResult3);
        if (str != null && !StringsKt.isBlank(str)) {
            int i2 = IAuthTabCallbackStubProxy + 65;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getEdgeSlop() >> 16) + 8, 4 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{65530, 65531, 65530, 7, 7, 65530, 7, 7}, true, Color.argb(0, 0, 0, 0) + 235, objArr2);
            setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
        }
        String strUpdateVisuals = multiAccountAgreementActivity.updateVisuals();
        if (strUpdateVisuals != null) {
            int i4 = IAuthTabCallbackStubProxy + 15;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            if (!StringsKt.isBlank(strUpdateVisuals)) {
                setDetectableSize.onExtraCallback("service_referrer", strUpdateVisuals);
            }
        }
        setDetectableSize.onExtraCallback().put("execution_id", getIssuerAndSerialNumber.onNavigationEvent.onWarmupCompleted(UST_CMP_IssueCertificate_SendConf.BANK));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackStubProxy + 79;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final String ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return "";
        }
        int i3 = 57 / 0;
        return "";
    }

    private static final CharSequence onExtraCallback(TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tabBarInfoQueryPointOnTabBarInfoQueryListener, "");
            return tabBarInfoQueryPointOnTabBarInfoQueryListener.asInterface();
        }
        Intrinsics.checkNotNullParameter(tabBarInfoQueryPointOnTabBarInfoQueryListener, "");
        int i3 = 13 / 0;
        return tabBarInfoQueryPointOnTabBarInfoQueryListener.asInterface();
    }

    private static final Unit onNavigationEvent(MultiAccountAgreementActivity multiAccountAgreementActivity, List list, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(multiAccountAgreementActivity.getScreenParams());
        setDetectableSize.onExtraCallback("bank_code", CollectionsKt.joinToString$default(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new MultiAccountAgreementActivity$.ExternalSyntheticLambda6(), 30, (Object) null));
        setDetectableSize.onExtraCallback("skip_yn", zzaz.onExtraCallbackWithResult(!multiAccountAgreementActivity.access000));
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private final void IAuthTabCallback(List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener> list, boolean z) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1214887L, false, (String) null, (Map) null, new MultiAccountAgreementActivity$.ExternalSyntheticLambda0(this, list), 14, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(this, list, z, (access13800) null), 3, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 47;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallbackDefault(MultiAccountAgreementActivity multiAccountAgreementActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        multiAccountAgreementActivity.finish();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onExtraCallbackWithResult(java.util.List<? extends o.TabBarInfoQueryPointOnTabBarInfoQueryListener> r17, boolean r18, o.TypeUtils2 r19, o.access13800<? super kotlin.Unit> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.MultiAccountAgreementActivity.onExtraCallbackWithResult(java.util.List, boolean, o.TypeUtils2, o.access13800):java.lang.Object");
    }

    private static final CharSequence onExtraCallbackWithResult(TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tabBarInfoQueryPointOnTabBarInfoQueryListener, "");
        String strOnExtraCallbackWithResult = tabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult();
        int i4 = getInterfaceDescriptor + 93;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    private static final Unit IAuthTabCallback(MultiAccountAgreementActivity multiAccountAgreementActivity, List list, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        String str = (String) IAuthTabCallback(-1251997863, 1251997867, iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{multiAccountAgreementActivity}, iOnExtraCallbackWithResult3);
        String strUpdateVisuals = multiAccountAgreementActivity.updateVisuals();
        if (str != null) {
            int i4 = getInterfaceDescriptor + 99;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                StringsKt.isBlank(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!StringsKt.isBlank(str)) {
                Object[] objArr = new Object[1];
                a(8 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 3 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{65530, 65531, 65530, 7, 7, 65530, 7, 7}, true, 235 - (Process.myTid() >> 22), objArr);
                setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
            }
        }
        if (strUpdateVisuals != null && !StringsKt.isBlank(strUpdateVisuals)) {
            setDetectableSize.onExtraCallback("service_referrer", strUpdateVisuals);
        }
        setDetectableSize.onExtraCallback("account_ids", CollectionsKt.joinToString$default(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: viva.republica.toss.account.register.MultiAccountAgreementActivity$$ExternalSyntheticLambda4
            public final Object invoke(Object obj2) {
                return MultiAccountAgreementActivity.onWarmupCompleted((TabBarInfoQueryPointOnTabBarInfoQueryListener) obj2);
            }
        }, 30, (Object) null));
        return Unit.INSTANCE;
    }

    private final void onExtraCallback(final List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener> list) throws Throwable {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1363244L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.register.MultiAccountAgreementActivity$$ExternalSyntheticLambda13
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, list, (SetDetectableSize) obj};
                return (Unit) MultiAccountAgreementActivity.IAuthTabCallback(-689712267, 689712273, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), objArr, lt.40.onExtraCallbackWithResult());
            }
        }, 14, (Object) null);
        ASN1Set.onNavigationEvent.onExtraCallbackWithResult(this, (List) IAuthTabCallback(210026812, -210026807, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{this, this.IAuthTabCallbackStub, list}, lt.40.onExtraCallbackWithResult()), this.access000, false, getSignedData.DEFAULT, !setEngagementSignalsCallback(), new Function0() { // from class: viva.republica.toss.account.register.MultiAccountAgreementActivity$$ExternalSyntheticLambda14
            public final Object invoke() {
                Object[] objArr = {this.f$0};
                return (Unit) MultiAccountAgreementActivity.IAuthTabCallback(1740282363, -1740282362, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), objArr, lt.40.onExtraCallbackWithResult());
            }
        });
        int i2 = getInterfaceDescriptor + 25;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asInterface(MultiAccountAgreementActivity multiAccountAgreementActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            multiAccountAgreementActivity.setResult(-1);
            multiAccountAgreementActivity.finish();
            int i3 = 28 / 0;
            return Unit.INSTANCE;
        }
        multiAccountAgreementActivity.setResult(-1);
        multiAccountAgreementActivity.finish();
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        List list = (List) objArr[1];
        List list2 = (List) objArr[2];
        int i = 2 % 2;
        List list3 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
        for (Object obj : list3) {
            int i2 = IAuthTabCallbackStubProxy + 21;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            linkedHashMap.put(((TabBarInfoQueryPointOnTabBarInfoQueryListener) obj).onExtraCallbackWithResult(), obj);
        }
        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(linkedHashMap);
        List list4 = list2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(list4, 10)), 16));
        int i4 = getInterfaceDescriptor + 47;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        for (Object obj2 : list4) {
            int i6 = IAuthTabCallbackStubProxy + 3;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            linkedHashMap2.put(((TabBarInfoQueryPointOnTabBarInfoQueryListener) obj2).onExtraCallbackWithResult(), obj2);
        }
        mapOnWarmupCompleted.putAll(linkedHashMap2);
        return CollectionsKt.toList(mapOnWarmupCompleted.values());
    }

    public boolean bg_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        if (this.asInterface) {
            return true;
        }
        boolean zBg_ = super.bg_();
        int i4 = IAuthTabCallbackStubProxy + 99;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return zBg_;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (setEngagementSignalsCallback()) {
            linkedHashMap.put("funnel_type", "mydata_connect_accnts");
            linkedHashMap.putAll(IAuthTabCallback().IAuthTabCallback());
        } else {
            linkedHashMap.put("funnel_type", "connect_accnt");
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
            String str = (String) IAuthTabCallback(-1251997863, 1251997867, iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, iOnExtraCallbackWithResult3);
            String strUpdateVisuals = updateVisuals();
            if (str != null && !StringsKt.isBlank(str)) {
                Object[] objArr = new Object[1];
                a(9 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 5 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{65530, 65531, 65530, 7, 7, 65530, 7, 7}, true, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 235, objArr);
                linkedHashMap.put(((String) objArr[0]).intern(), str);
                int i2 = IAuthTabCallbackStubProxy + 29;
                getInterfaceDescriptor = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 5 / 2;
                }
            }
            if (strUpdateVisuals != null) {
                int i4 = getInterfaceDescriptor + 9;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 != 0) {
                    StringsKt.isBlank(strUpdateVisuals);
                    throw null;
                }
                if (!StringsKt.isBlank(strUpdateVisuals)) {
                    int i5 = getInterfaceDescriptor + 21;
                    IAuthTabCallbackStubProxy = i5 % 128;
                    if (i5 % 2 != 0) {
                        linkedHashMap.put("service_referrer", strUpdateVisuals);
                        throw null;
                    }
                    linkedHashMap.put("service_referrer", strUpdateVisuals);
                }
            }
            linkedHashMap.put("execution_id", getIssuerAndSerialNumber.onNavigationEvent.onWarmupCompleted(UST_CMP_IssueCertificate_SendConf.BANK));
            int i6 = getInterfaceDescriptor + 117;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
        }
        Object[] objArr2 = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 5, 3 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{65535, 65528, 7, 65532, 7}, false, Color.rgb(0, 0, 0) + 16777453, objArr2);
        linkedHashMap.put(((String) objArr2[0]).intern(), validateRelationship().asBinder().IAuthTabCallback());
        List<TabBarInfoQueryPointOnTabBarInfoQueryListener> list = this.IAuthTabCallbackStub;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i8 = getInterfaceDescriptor + 97;
            IAuthTabCallbackStubProxy = i8 % 128;
            if (i8 % 2 != 0) {
                arrayList.add(((TabBarInfoQueryPointOnTabBarInfoQueryListener) it.next()).asInterface());
                int i9 = 61 / 0;
            } else {
                arrayList.add(((TabBarInfoQueryPointOnTabBarInfoQueryListener) it.next()).asInterface());
            }
        }
        linkedHashMap.put("bank_code", CollectionsKt.joinToString$default(CollectionsKt.distinct(arrayList), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        return linkedHashMap;
    }

    public static /* synthetic */ Unit onExtraCallback(MultiAccountAgreementActivity multiAccountAgreementActivity) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(1740282363, -1740282362, iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{multiAccountAgreementActivity}, iOnExtraCallbackWithResult3);
    }

    public static /* synthetic */ Unit onNavigationEvent(MultiAccountAgreementActivity multiAccountAgreementActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-136268093, 136268093, iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{multiAccountAgreementActivity, commonModule_setLeftEdgeTouchEnabled}, iOnExtraCallbackWithResult3);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(MultiAccountAgreementActivity multiAccountAgreementActivity, List list, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-689712267, 689712273, iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{multiAccountAgreementActivity, list, setDetectableSize}, iOnExtraCallbackWithResult3);
    }

    public static /* synthetic */ String onWarmupCompleted(Function2 function2, Object obj, Object obj2) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        return (String) IAuthTabCallback(-608497339, 608497346, iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{function2, obj, obj2}, iOnExtraCallbackWithResult3);
    }

    public static final /* synthetic */ Object onWarmupCompleted(MultiAccountAgreementActivity multiAccountAgreementActivity, List list, boolean z, TypeUtils2 typeUtils2, access13800 access13800Var) {
        Object[] objArr = {multiAccountAgreementActivity, list, Boolean.valueOf(z), typeUtils2, access13800Var};
        return IAuthTabCallback(-1757982452, 1757982455, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), objArr, lt.40.onExtraCallbackWithResult());
    }

    private final String ICustomTabsServiceStub() {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        return (String) IAuthTabCallback(-1251997863, 1251997867, iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, iOnExtraCallbackWithResult3);
    }

    private final List<TabBarInfoQueryPointOnTabBarInfoQueryListener> onWarmupCompleted(List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener> list, List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener> list2) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        return (List) IAuthTabCallback(210026812, -210026807, iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this, list, list2}, iOnExtraCallbackWithResult3);
    }

    private static final void asBinder(Function1 function1, Object obj) throws Throwable {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        IAuthTabCallback(1338702072, -1338702064, iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{function1, obj}, iOnExtraCallbackWithResult3);
    }

    private static final Unit onExtraCallback(MultiAccountAgreementActivity multiAccountAgreementActivity, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-1785954168, 1785954170, iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{multiAccountAgreementActivity, setDetectableSize}, iOnExtraCallbackWithResult3);
    }

    @Override // viva.republica.toss.account.register.Hilt_MultiAccountAgreementActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.account.register.Hilt_MultiAccountAgreementActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 21;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.account.register.Hilt_MultiAccountAgreementActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = IAuthTabCallbackStubProxy + 47;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.account.register.Hilt_MultiAccountAgreementActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 103;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    static void onNavigationEvent() {
        IAuthTabCallback_Parcel = 478309033;
    }

    public static final class onWarmupCompleted implements Function1<getObjectParser.onWarmupCompleted, Unit> {
        public onWarmupCompleted() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onNavigationEvent(obj);
            return Unit.INSTANCE;
        }

        public final void onNavigationEvent(getObjectParser.onWarmupCompleted onwarmupcompleted) {
            getObjectParser.onWarmupCompleted onwarmupcompleted2 = onwarmupcompleted;
            MultiAccountAgreementActivity.onExtraCallbackWithResult(MultiAccountAgreementActivity.this, onwarmupcompleted2.onExtraCallbackWithResult(), onwarmupcompleted2.onWarmupCompleted());
        }
    }
}
