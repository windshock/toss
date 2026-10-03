package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.base.BaseActivity;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.BuildConfigApi;
import o.JsonWriterWriteObject;
import o.MediaViewApi;
import o.SetDetectableSize;
import o.deserializeIp;
import o.deserializeUriNullableCollection;
import o.getRKeyID;
import o.getVersionName;
import o.getVersionOverride;
import o.initMiniApp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getRKeyID {
    private static int IAuthTabCallback;
    private static int onExtraCallbackWithResult;
    public static final getRKeyID onWarmupCompleted;
    private static final byte[] $$a = {32, 13, -54, -47};
    private static final int $$b = 12;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    private static String $$c(byte b, int i, int i2) {
        int i3 = b * 4;
        int i4 = 105 - (i2 * 3);
        int i5 = i + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 = i5 + (-i3);
            i5 = i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            int i7 = i5 + 1;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            i4 += -bArr[i7];
            i5 = i7;
        }
    }

    static {
        onExtraCallbackWithResult = 0;
        onExtraCallback();
        onWarmupCompleted = new getRKeyID();
        int i = asInterface + 115;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ CharSequence IAuthTabCallback(getVersionOverride getversionoverride) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceIAuthTabCallbackDefault = IAuthTabCallbackDefault(getversionoverride);
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return charSequenceIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BaseActivity baseActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
            return (Unit) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 1389153016, iOnExtraCallbackWithResult, new Object[]{baseActivity, deserializeurinullablecollection}, -1389153015);
        }
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, str2, setDetectableSize);
        int i4 = onNavigationEvent + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 2035598079, iOnExtraCallbackWithResult, new Object[]{str, setDetectableSize}, -2035598062);
        int i4 = onNavigationEvent + 53;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getVersionOverride getversionoverride, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
            return (Unit) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 826866822, iOnExtraCallbackWithResult, new Object[]{getversionoverride, commonModule_setLeftEdgeTouchEnabled}, -826866804);
        }
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 826866822, iOnExtraCallbackWithResult2, new Object[]{getversionoverride, commonModule_setLeftEdgeTouchEnabled}, -826866804);
        int i3 = 71 / 0;
        return unit;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel(function1, obj);
        int i4 = onNavigationEvent + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ deserializeIp IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipOnMessageChannelReady = onMessageChannelReady(function1, obj);
        int i4 = onNavigationEvent + 109;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return deserializeipOnMessageChannelReady;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onPostMessage(function1, obj);
        int i4 = onNavigationEvent + 101;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        boolean zBooleanValue;
        getVersionOverride getversionoverride = (getVersionOverride) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {getversionoverride};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = zzgc.onExtraCallbackWithResult();
        if (i3 == 0) {
            zBooleanValue = ((Boolean) onWarmupCompleted(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, -174918943, iOnExtraCallbackWithResult, objArr2, 174918957)).booleanValue();
            int i4 = 21 / 0;
        } else {
            zBooleanValue = ((Boolean) onWarmupCompleted(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, -174918943, iOnExtraCallbackWithResult, objArr2, 174918957)).booleanValue();
        }
        int i5 = onNavigationEvent + 109;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ deserializeIp IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipOnMinimized = onMinimized(function1, obj);
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
        return deserializeipOnMinimized;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean interfaceDescriptor = getInterfaceDescriptor(function1, obj);
        int i4 = onExtraCallback + 73;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(interfaceDescriptor);
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 619365262, iOnExtraCallbackWithResult, new Object[]{function1, obj}, -619365246);
        int i4 = onNavigationEvent + 113;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallback(function1, obj);
        if (i3 != 0) {
            return null;
        }
        int i4 = 39 / 0;
        return null;
    }

    public static /* synthetic */ List asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        List listAccess000 = access000(function1, obj);
        int i4 = onExtraCallback + 103;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return listAccess000;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        JsonWriterWriteObject jsonWriterWriteObject = (JsonWriterWriteObject) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(jsonWriterWriteObject, zBooleanValue);
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ CharSequence onExtraCallback(getVersionOverride getversionoverride) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(getversionoverride);
        }
        onExtraCallbackWithResult(getversionoverride);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipOnActivityResized = onActivityResized(function1, obj);
        int i4 = onExtraCallback + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return deserializeipOnActivityResized;
    }

    public static /* synthetic */ Unit onExtraCallback(BaseActivity baseActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
            return (Unit) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -755762237, iOnExtraCallbackWithResult, new Object[]{baseActivity, deserializeurinullablecollection}, 755762241);
        }
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -755762237, iOnExtraCallbackWithResult2, new Object[]{baseActivity, deserializeurinullablecollection}, 755762241);
        int i3 = 31 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, MediaViewApi mediaViewApi, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 741321700, iOnExtraCallbackWithResult, new Object[]{str, mediaViewApi, setDetectableSize}, -741321697);
        int i4 = onNavigationEvent + 119;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ deserializeIp onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipWriteTypedObject = writeTypedObject(function1, obj);
        int i4 = onNavigationEvent + 53;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return deserializeipWriteTypedObject;
    }

    public static /* synthetic */ void onExtraCallback(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(baseActivity);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(KeyAgreeRecipientIdentifier keyAgreeRecipientIdentifier, getDummyAd getdummyad, String str, String str2, JsonWriterWriteObject jsonWriterWriteObject) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(keyAgreeRecipientIdentifier, getdummyad, str, str2, jsonWriterWriteObject);
        int i4 = onNavigationEvent + 43;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, MediaViewApi mediaViewApi, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(str, mediaViewApi, setDetectableSize);
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return unitAsBinder;
    }

    public static /* synthetic */ deserializeIp onExtraCallbackWithResult(int i, BaseActivity baseActivity, boolean z, String str, Boolean bool) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 11;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            onWarmupCompleted(i, baseActivity, z, str, bool);
            obj.hashCode();
            throw null;
        }
        deserializeIp deserializeipOnWarmupCompleted = onWarmupCompleted(i, baseActivity, z, str, bool);
        int i4 = onExtraCallback + 17;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return deserializeipOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ deserializeIp onExtraCallbackWithResult(BaseActivity baseActivity, Integer num, BuildConfigApi buildConfigApi) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(baseActivity, num, buildConfigApi);
            obj.hashCode();
            throw null;
        }
        deserializeIp deserializeipOnNavigationEvent = onNavigationEvent(baseActivity, num, buildConfigApi);
        int i3 = onExtraCallback + 65;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return deserializeipOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ deserializeIp onExtraCallbackWithResult(Integer num, BaseActivity baseActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipOnExtraCallback = onExtraCallback(num, baseActivity, bool);
        int i4 = onNavigationEvent + 65;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return deserializeipOnExtraCallback;
    }

    public static /* synthetic */ deserializeIp onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipExtraCallback = extraCallback(function1, obj);
        int i4 = onNavigationEvent + 15;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return deserializeipExtraCallback;
    }

    public static /* synthetic */ deserializeIp onExtraCallbackWithResult(boolean z, KeyAgreeRecipientIdentifier keyAgreeRecipientIdentifier, getDummyAd getdummyad, String str, int i, getVersionName getversionname) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 73;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        deserializeIp deserializeipOnExtraCallback = onExtraCallback(z, keyAgreeRecipientIdentifier, getdummyad, str, i, getversionname);
        int i5 = onExtraCallback + 1;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return deserializeipOnExtraCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(BaseActivity baseActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {baseActivity};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        if (i3 == 0) {
            onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -233226573, iOnExtraCallbackWithResult, objArr, 233226580);
            obj.hashCode();
            throw null;
        }
        onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -233226573, iOnExtraCallbackWithResult, objArr, 233226580);
        int i4 = onNavigationEvent + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(JsonWriterWriteObject jsonWriterWriteObject, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 1743186068, iOnExtraCallbackWithResult, new Object[]{jsonWriterWriteObject, dialogInterface}, -1743186063);
        int i4 = onNavigationEvent + 121;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(str, str2, setDetectableSize);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2, setDetectableSize);
        int i3 = onNavigationEvent + 43;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ List onNavigationEvent(InitSettingsBuilder initSettingsBuilder) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {initSettingsBuilder};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = zzgc.onExtraCallbackWithResult();
        if (i3 != 0) {
            throw null;
        }
        List list = (List) onWarmupCompleted(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, -762828704, iOnExtraCallbackWithResult, objArr, 762828716);
        int i4 = onNavigationEvent + 47;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(BaseActivity baseActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault(baseActivity, deserializeurinullablecollection);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(baseActivity, deserializeurinullablecollection);
        int i3 = onNavigationEvent + 119;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, BaseActivity baseActivity, String str, BuildConfigApi buildConfigApi) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(z, baseActivity, str, buildConfigApi);
        int i4 = onNavigationEvent + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(baseActivity);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onNavigationEvent(BaseActivity baseActivity, String str, MediaViewApi mediaViewApi, JsonWriterWriteObject jsonWriterWriteObject) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(baseActivity, str, mediaViewApi, jsonWriterWriteObject);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 39;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(JsonWriterWriteObject jsonWriterWriteObject, getTypedExportedConstants gettypedexportedconstants, String str, MediaViewApi mediaViewApi, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(jsonWriterWriteObject, gettypedexportedconstants, str, mediaViewApi, view);
        int i4 = onNavigationEvent + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        extraCallbackWithResult(function1, obj);
        int i4 = onExtraCallback + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = ~i5;
        int i10 = (~(i7 | i8 | i9)) | (~(i4 | i5));
        int i11 = ~(i7 | i9);
        int i12 = i4 | i11;
        int i13 = (~(i5 | i6)) | i11 | (~(i8 | i6));
        int i14 = i6 + i4 + i + (296844165 * i2) + (1729652556 * i3);
        int i15 = i14 * i14;
        int i16 = ((i6 * 599922083) - 580124672) + (599922083 * i4) + (2088888926 * i10) + ((-117189444) * i12) + ((-2088888926) * i13) + ((-1606156288) * i) + ((-279707648) * i2) + ((-265289728) * i3) + (2117271552 * i15);
        int i17 = (i6 * (-1181628991)) + 1322814002 + (i4 * (-1181628991)) + (i10 * (-118)) + (i12 * (-236)) + (i13 * 118) + (i * (-1181629109)) + (i2 * (-698251017)) + (i3 * 1773125444) + (i15 * 938541056);
        switch (i16 + (i17 * i17 * (-109772800))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                BaseActivity baseActivity = (BaseActivity) objArr[0];
                int i18 = 2 % 2;
                int i19 = onExtraCallback + 47;
                onNavigationEvent = i19 % 128;
                int i20 = i19 % 2;
                BaseActivity.IAuthTabCallback(baseActivity, (String) null, false, 3, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i21 = onNavigationEvent + 25;
                onExtraCallback = i21 % 128;
                int i22 = i21 % 2;
                return unit;
            case 2:
                int iIntValue = ((Number) objArr[1]).intValue();
                int i23 = 2 % 2;
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (KeyEvent.getMaxKeyCode() >> 16)), 22 - KeyEvent.keyCodeFromString(""), 24734 - (ViewConfiguration.getPressedStateDuration() >> 16), -842029757, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj = ((Field) objOnExtraCallback).get(null);
                try {
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-339320021);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 22 - View.resolveSize(0, 0), 24733 - Process.getGidForName(""), -628712005, false, "onTransact", new Class[0]);
                    }
                    writeRaw<BaseApiResponse<getVersionOverride>> writerawOnExtraCallback = ((CacheFlag) ((Method) objOnExtraCallback2).invoke(obj, null)).onExtraCallback(new onAdLoadInvoked(iIntValue));
                    MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
                    Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
                    writeRaw writerawIAuthTabCallback = writerawOnExtraCallback.IAuthTabCallback(new onWarmupCompleted(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
                    Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                    int i24 = onExtraCallback + 59;
                    onNavigationEvent = i24 % 128;
                    int i25 = i24 % 2;
                    return writerawIAuthTabCallback;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return onNavigationEvent(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                final String str = (String) objArr[0];
                final String str2 = (String) objArr[1];
                int i26 = 2 % 2;
                ConvertByteArrayToFloatArray.onExtraCallback(1562807L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda36
                    public final Object invoke(Object obj2) {
                        return getRKeyID.IAuthTabCallback(str, str2, (SetDetectableSize) obj2);
                    }
                }, 14, (Object) null);
                Unit unit2 = Unit.INSTANCE;
                int i27 = onExtraCallback + 27;
                onNavigationEvent = i27 % 128;
                int i28 = i27 % 2;
                return unit2;
            case 10:
                return asBinder(objArr);
            case 11:
                return IAuthTabCallbackDefault(objArr);
            case 12:
                return IAuthTabCallbackStub(objArr);
            case 13:
                return getInterfaceDescriptor(objArr);
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            case 15:
                return IAuthTabCallbackStubProxy(objArr);
            case 16:
                return access100(objArr);
            case 17:
                String str3 = (String) objArr[0];
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
                int i29 = 2 % 2;
                int i30 = onExtraCallback + 31;
                onNavigationEvent = i30 % 128;
                int i31 = i30 % 2;
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                setDetectableSize.onExtraCallback("bottomsheet_title", str3);
                Unit unit3 = Unit.INSTANCE;
                int i32 = onExtraCallback + 65;
                onNavigationEvent = i32 % 128;
                int i33 = i32 % 2;
                return unit3;
            case 18:
                return access000(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(BaseActivity baseActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(baseActivity, deserializeurinullablecollection);
        int i4 = onExtraCallback + 65;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, String str2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
            return (Unit) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -24476705, iOnExtraCallbackWithResult, new Object[]{str, str2}, 24476714);
        }
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, MediaViewApi mediaViewApi, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, mediaViewApi, setDetectableSize);
        int i4 = onNavigationEvent + 43;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ deserializeIp onWarmupCompleted(BaseActivity baseActivity, String str, MediaViewApi mediaViewApi) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipOnExtraCallbackWithResult = onExtraCallbackWithResult(baseActivity, str, mediaViewApi);
        int i4 = onNavigationEvent + 19;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return deserializeipOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onWarmupCompleted(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        asInterface(baseActivity);
        int i4 = onExtraCallback + 35;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(getTypedExportedConstants gettypedexportedconstants, String str, MediaViewApi mediaViewApi, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(gettypedexportedconstants, str, mediaViewApi, view);
        int i4 = onExtraCallback + 47;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallback implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();

        public final void onNavigationEvent(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        }

        public /* synthetic */ Object invoke(Object obj) {
            onNavigationEvent((initMiniApp.onWarmupCompleted) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class IAuthTabCallbackStub<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onNavigationEvent;

        public IAuthTabCallbackStub(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onNavigationEvent = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        public final deserializeIp<getVersionName> apply(writeRaw<BaseApiResponse<getVersionName>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onRetainCustomNonConfigurationInstance(new Function1<BaseApiResponse<getVersionName>, deserializeIp<? extends getVersionName>>() { // from class: o.getRKeyID.IAuthTabCallbackStub.2
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends getVersionName> invoke(BaseApiResponse<getVersionName> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = getVersionName.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onNavigationEvent;
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

    public static final class asInterface<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public asInterface(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.IAuthTabCallback = mapConverter2;
        }

        public final deserializeIp<MediaViewApi> apply(writeRaw<BaseApiResponse<MediaViewApi>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onRetainCustomNonConfigurationInstance(new Function1<BaseApiResponse<MediaViewApi>, deserializeIp<? extends MediaViewApi>>() { // from class: o.getRKeyID.asInterface.2
                /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends MediaViewApi> invoke(BaseApiResponse<MediaViewApi> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = MediaViewApi.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallbackWithResult;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.IAuthTabCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onExtraCallback<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public onExtraCallback(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        public final deserializeIp<BuildConfigApi> apply(writeRaw<BaseApiResponse<BuildConfigApi>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onRetainCustomNonConfigurationInstance(new Function1<BaseApiResponse<BuildConfigApi>, deserializeIp<? extends BuildConfigApi>>() { // from class: o.getRKeyID.onExtraCallback.3
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends BuildConfigApi> invoke(BaseApiResponse<BuildConfigApi> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = BuildConfigApi.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
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

    public static final class onExtraCallbackWithResult<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onNavigationEvent;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public onExtraCallbackWithResult(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.onNavigationEvent = mapConverter2;
        }

        public final deserializeIp<launchUrl> apply(writeRaw<BaseApiResponse<launchUrl>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onRetainCustomNonConfigurationInstance(new Function1<BaseApiResponse<launchUrl>, deserializeIp<? extends launchUrl>>() { // from class: o.getRKeyID.onExtraCallbackWithResult.3
                /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends launchUrl> invoke(BaseApiResponse<launchUrl> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = launchUrl.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onWarmupCompleted;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onNavigationEvent;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onNavigationEvent<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public onNavigationEvent(MapConverter mapConverter, MapConverter mapConverter2) {
            this.IAuthTabCallback = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        public final deserializeIp<InitSettingsBuilder> apply(writeRaw<BaseApiResponse<InitSettingsBuilder>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onRetainCustomNonConfigurationInstance(new Function1<BaseApiResponse<InitSettingsBuilder>, deserializeIp<? extends InitSettingsBuilder>>() { // from class: o.getRKeyID.onNavigationEvent.3
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends InitSettingsBuilder> invoke(BaseApiResponse<InitSettingsBuilder> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = InitSettingsBuilder.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.IAuthTabCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onWarmupCompleted;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onWarmupCompleted<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallbackWithResult;
        final /* synthetic */ MapConverter onNavigationEvent;

        public onWarmupCompleted(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.onNavigationEvent = mapConverter2;
        }

        public final deserializeIp<getVersionOverride> apply(writeRaw<BaseApiResponse<getVersionOverride>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onRetainCustomNonConfigurationInstance(new Function1<BaseApiResponse<getVersionOverride>, deserializeIp<? extends getVersionOverride>>() { // from class: o.getRKeyID.onWarmupCompleted.1
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends getVersionOverride> invoke(BaseApiResponse<getVersionOverride> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = getVersionOverride.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallbackWithResult;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onNavigationEvent;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    private getRKeyID() {
    }

    private static final List access000(Function1 function1, Object obj) {
        List list;
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            list = (List) function1.invoke(obj);
            int i3 = 30 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            list = (List) function1.invoke(obj);
        }
        int i4 = onExtraCallback + 27;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        InitSettingsBuilder initSettingsBuilder = (InitSettingsBuilder) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(initSettingsBuilder, "");
        List<getVersionOverride> listIAuthTabCallback = initSettingsBuilder.IAuthTabCallback();
        if (listIAuthTabCallback == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listIAuthTabCallback) {
            getVersionOverride getversionoverride = (getVersionOverride) obj;
            if (getversionoverride.onExtraCallback() && getversionoverride.getInterfaceDescriptor() == DefaultMediaViewVideoRendererApi.UNSUBSCRIBE) {
                int i4 = onNavigationEvent + 57;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(obj);
                int i6 = onExtraCallback + 41;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((getVersionOverride) it.next()).IAuthTabCallback()));
        }
        return arrayList2;
    }

    private static final boolean getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = onExtraCallback + 97;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    public final advance<getVersionOverride> IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        Object[] objArr = {this, Integer.valueOf(i)};
        writeRaw writeraw = (writeRaw) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -1299014411, zzgc.onExtraCallbackWithResult(), objArr, 1299014413);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
                return Boolean.valueOf(((Boolean) getRKeyID.onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -1779591834, iOnExtraCallbackWithResult, new Object[]{(getVersionOverride) obj}, 1779591849)).booleanValue());
            }
        };
        advance<getVersionOverride> advanceVarOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeLongCollection() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda3
            public final boolean test(Object obj) {
                Object[] objArr2 = {function1, obj};
                return ((Boolean) getRKeyID.onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 217275904, zzgc.onExtraCallbackWithResult(), objArr2, -217275894)).booleanValue();
            }
        });
        Intrinsics.checkNotNullExpressionValue(advanceVarOnExtraCallbackWithResult, "");
        int i3 = onNavigationEvent + 119;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return advanceVarOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        getVersionOverride getversionoverride = (getVersionOverride) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getversionoverride, "");
            return Boolean.valueOf(getversionoverride.onExtraCallback());
        }
        Intrinsics.checkNotNullParameter(getversionoverride, "");
        getversionoverride.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ writeRaw IAuthTabCallback(getRKeyID getrkeyid, BaseActivity baseActivity, getDummyAd getdummyad, int i, boolean z, String str, boolean z2, int i2, Object obj) throws Throwable {
        boolean z3;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 29;
        int i5 = i4 % 128;
        onExtraCallback = i5;
        boolean z4 = (i4 % 2 == 0 ? (i2 & 8) == 0 : (i2 & 58) == 0) ? z : true;
        String str2 = (i2 & 16) != 0 ? null : str;
        if ((i2 & 32) != 0) {
            int i6 = i5 + 21;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z3 = false;
        } else {
            z3 = z2;
        }
        writeRaw<BuildConfigApi> writerawOnExtraCallback = getrkeyid.onExtraCallback(baseActivity, getdummyad, i, z4, str2, z3);
        int i8 = onExtraCallback + 57;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            return writerawOnExtraCallback;
        }
        throw null;
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 17;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            BaseActivity.IAuthTabCallback(baseActivity, (String) null, true, 2, (Object) null);
        } else {
            BaseActivity.IAuthTabCallback(baseActivity, (String) null, false, 3, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallback + 3;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallbackDefault(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        baseActivity.bo_();
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
    }

    private static final deserializeIp extraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i4 = onExtraCallback + 51;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return deserializeip;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r9
      0x0027: PHI (r9v2 java.util.Map<java.lang.Integer, java.lang.String>) = (r9v1 java.util.Map<java.lang.Integer, java.lang.String>), (r9v7 java.util.Map<java.lang.Integer, java.lang.String>) binds: [B:8:0x0025, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final o.deserializeIp onExtraCallback(boolean r4, o.KeyAgreeRecipientIdentifier r5, o.getDummyAd r6, java.lang.String r7, int r8, o.getVersionName r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getRKeyID.onExtraCallback
            int r1 = r1 + 23
            int r2 = r1 % 128
            o.getRKeyID.onNavigationEvent = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L1e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            java.util.Map r9 = r9.onNavigationEvent()
            r1 = 98
            int r1 = r1 / 0
            if (r9 == 0) goto La2
            goto L27
        L1e:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            java.util.Map r9 = r9.onNavigationEvent()
            if (r9 == 0) goto La2
        L27:
            java.util.Set r9 = r9.entrySet()
            if (r9 == 0) goto La2
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L33:
            boolean r1 = r9.hasNext()
            r2 = 0
            if (r1 == 0) goto L6d
            int r1 = o.getRKeyID.onExtraCallback
            int r1 = r1 + 37
            int r3 = r1 % 128
            o.getRKeyID.onNavigationEvent = r3
            int r1 = r1 % 2
            if (r1 == 0) goto L5a
            java.lang.Object r2 = r9.next()
            r1 = r2
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getKey()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != r8) goto L33
            goto L6d
        L5a:
            java.lang.Object r4 = r9.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getKey()
            java.lang.Number r4 = (java.lang.Number) r4
            r4.intValue()
            r2.hashCode()
            throw r2
        L6d:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r2 == 0) goto La2
            java.lang.Object r8 = r2.getValue()
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto La2
            if (r4 == 0) goto L98
            int r4 = o.getRKeyID.onNavigationEvent
            int r4 = r4 + 39
            int r9 = r4 % 128
            o.getRKeyID.onExtraCallback = r9
            int r4 = r4 % r0
            if (r4 == 0) goto L91
            o.getRKeyID r4 = o.getRKeyID.onWarmupCompleted
            o.writeRaw r4 = r4.onExtraCallbackWithResult(r5, r6, r8, r7)
            r5 = 66
            int r5 = r5 / 0
            goto L97
        L91:
            o.getRKeyID r4 = o.getRKeyID.onWarmupCompleted
            o.writeRaw r4 = r4.onExtraCallbackWithResult(r5, r6, r8, r7)
        L97:
            return r4
        L98:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            o.writeRaw r4 = o.writeRaw.onExtraCallback(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            return r4
        La2:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            o.writeRaw r4 = o.writeRaw.onExtraCallback(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRKeyID.onExtraCallback(boolean, o.KeyAgreeRecipientIdentifier, o.getDummyAd, java.lang.String, int, o.getVersionName):o.deserializeIp");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r26, int r27, char[] r28, boolean r29, int r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRKeyID.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    private static final deserializeIp writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i4 = onExtraCallback + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return deserializeip;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final writeRaw<BuildConfigApi> onExtraCallback(@NotNull final BaseActivity baseActivity, @NotNull final getDummyAd getdummyad, final int i, final boolean z, @Nullable final String str, final boolean z2) throws Throwable {
        final KeyAgreeRecipientIdentifier keyAgreeRecipientIdentifier;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 1;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(baseActivity, "");
        Intrinsics.checkNotNullParameter(getdummyad, "");
        Object obj = null;
        if (!(baseActivity instanceof KeyAgreeRecipientIdentifier)) {
            keyAgreeRecipientIdentifier = null;
        } else {
            int i5 = onExtraCallback + 25;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            keyAgreeRecipientIdentifier = (KeyAgreeRecipientIdentifier) baseActivity;
        }
        if (keyAgreeRecipientIdentifier == null) {
            writeRaw<BuildConfigApi> writerawOnExtraCallback = writeRaw.onExtraCallback(new BuildConfigApi(false, null, null, 6, null));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallback, "");
            return writerawOnExtraCallback;
        }
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29425), 22 - ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf((CharSequence) "", '0', 0) + 24735, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj2 = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-339320021);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 29427), 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 24734 - (KeyEvent.getMaxKeyCode() >> 16), -628712005, false, "onTransact", new Class[0]);
            }
            writeRaw<BaseApiResponse<getVersionName>> writerawOnNavigationEvent = ((CacheFlag) ((Method) objOnExtraCallback2).invoke(obj2, null)).onNavigationEvent();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new IAuthTabCallbackStub(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda37
                public final Object invoke(Object obj3) {
                    return getRKeyID.onExtraCallback(baseActivity, (deserializeUriNullableCollection) obj3);
                }
            };
            writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda38
                public final void accept(Object obj3) {
                    getRKeyID.IAuthTabCallback(function1, obj3);
                }
            }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda39
                public final void run() {
                    getRKeyID.onNavigationEvent(baseActivity);
                }
            });
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda40
                public final Object invoke(Object obj3) {
                    return getRKeyID.onExtraCallbackWithResult(z, keyAgreeRecipientIdentifier, getdummyad, str, i, (getVersionName) obj3);
                }
            };
            writeRaw writerawOnExtraCallbackWithResult = writerawOnWarmupCompleted.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda41
                public final Object apply(Object obj3) {
                    return getRKeyID.onExtraCallbackWithResult(function12, obj3);
                }
            });
            final Function1 function13 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda42
                public final Object invoke(Object obj3) {
                    return getRKeyID.onExtraCallbackWithResult(i, baseActivity, z2, str, (Boolean) obj3);
                }
            };
            writeRaw<BuildConfigApi> writerawOnExtraCallbackWithResult2 = writerawOnExtraCallbackWithResult.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda43
                public final Object apply(Object obj3) {
                    return getRKeyID.onExtraCallback(function13, obj3);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult2, "");
            return writerawOnExtraCallbackWithResult2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onExtraCallback + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit asBinder(BaseActivity baseActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity.IAuthTabCallback(baseActivity, (String) null, false, 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void IAuthTabCallbackStub(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        baseActivity.bo_();
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
    }

    private static final void extraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onNavigationEvent + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final CharSequence onExtraCallbackWithResult(getVersionOverride getversionoverride) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getversionoverride, "");
        String strOnNavigationEvent = getversionoverride.onNavigationEvent();
        int i4 = onNavigationEvent + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    private static final Unit onExtraCallbackWithResult(String str, String str2, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("success", "Y");
        setDetectableSize.onExtraCallback("card_vendor_name", str);
        Object[] objArr = new Object[1];
        a((Process.myPid() >> 22) + 8, KeyEvent.keyCodeFromString("") + 7, new char[]{65530, 7, 7, 65530, 65531, 65530, 7, 7}, true, (ViewConfiguration.getTapTimeout() >> 16) + 218, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str2);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onWarmupCompleted(boolean r26, im.toss.base.BaseActivity r27, final java.lang.String r28, o.BuildConfigApi r29) {
        /*
            r7 = r27
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getRKeyID.onExtraCallback
            int r1 = r1 + 111
            int r2 = r1 % 128
            o.getRKeyID.onNavigationEvent = r2
            int r1 = r1 % r0
            if (r26 != 0) goto Laf
            int r2 = r2 + 89
            int r1 = r2 % 128
            o.getRKeyID.onExtraCallback = r1
            int r2 = r2 % r0
            r0 = 1
            if (r2 == 0) goto L25
            boolean r1 = r29.onWarmupCompleted()
            r2 = 12
            int r2 = r2 / 0
            if (r1 == 0) goto L2c
            goto L43
        L25:
            boolean r1 = r29.onWarmupCompleted()
            r1 = r1 ^ r0
            if (r1 == 0) goto L43
        L2c:
            viva.republica.toss.card.notification.CardNotificationFailedActivity$onExtraCallback r0 = viva.republica.toss.card.notification.CardNotificationFailedActivity.Companion
            kotlin.jvm.internal.Intrinsics.checkNotNull(r29)
            r4 = 0
            r5 = 8
            r6 = 0
            r1 = r27
            r2 = r29
            r3 = r28
            android.content.Intent r0 = viva.republica.toss.card.notification.CardNotificationFailedActivity.onExtraCallback.IAuthTabCallback(r0, r1, r2, r3, r4, r5, r6)
            r7.startActivity(r0)
            goto Laf
        L43:
            java.util.List r1 = r29.onNavigationEvent()
            if (r1 == 0) goto L5f
            r8 = r1
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda25 r14 = new viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda25
            r14.<init>()
            r15 = 31
            r16 = 0
            java.lang.String r1 = kotlin.collections.CollectionsKt.joinToString$default(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L60
        L5f:
            r1 = 0
        L60:
            r8 = 1010403(0xf6ae3, double:4.992054E-318)
            r10 = 0
            r11 = 0
            r12 = 0
            viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda26 r13 = new viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda26
            r2 = r28
            r13.<init>()
            r14 = 14
            r15 = 0
            o.ConvertByteArrayToFloatArray.onExtraCallback(r8, r10, r11, r12, r13, r14, r15)
            o.SubsamplingScaleImageViewTileLoadTask r16 = o.SubsamplingScaleImageViewTileLoadTask.onNavigationEvent
            kotlin.jvm.internal.StringCompanionObject r2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            int r2 = viva.republica.toss.R.string.card_notification_subscribe_toast
            java.lang.String r2 = r7.getString(r2)
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = java.lang.String.format(r2, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            o.getEnabledAmazonAdUnitIds$onExtraCallback r1 = o.getEnabledAmazonAdUnitIds.Companion
            o.getEnabledAmazonAdUnitIds$onWarmupCompleted r18 = r1.onNavigationEvent()
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 124(0x7c, float:1.74E-43)
            r25 = 0
            r17 = r0
            o.SubsamplingScaleImageViewTileLoadTask.onNavigationEvent(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            o.getRKeyID r0 = o.getRKeyID.onWarmupCompleted
            r0.IAuthTabCallback(r7)
        Laf:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRKeyID.onWarmupCompleted(boolean, im.toss.base.BaseActivity, java.lang.String, o.BuildConfigApi):kotlin.Unit");
    }

    private static final deserializeIp onWarmupCompleted(int i, final BaseActivity baseActivity, final boolean z, final String str, Boolean bool) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 119;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(bool, "");
        if (!bool.booleanValue()) {
            writeRaw writerawOnExtraCallback = writeRaw.onExtraCallback(new BuildConfigApi(false, null, null, 6, null));
            int i5 = onNavigationEvent + 101;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return writerawOnExtraCallback;
        }
        Object[] objArr = {onWarmupCompleted, true, CollectionsKt.listOf(Integer.valueOf(i))};
        writeRaw writeraw = (writeRaw) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 769137069, zzgc.onExtraCallbackWithResult(), objArr, -769137058);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda28
            public final Object invoke(Object obj) {
                return getRKeyID.onWarmupCompleted(baseActivity, (deserializeUriNullableCollection) obj);
            }
        };
        writeRaw writerawOnWarmupCompleted = writeraw.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda29
            public final void accept(Object obj) throws Throwable {
                getRKeyID.asBinder(function1, obj);
            }
        }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda30
            public final void run() {
                getRKeyID.onExtraCallback(baseActivity);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda31
            public final Object invoke(Object obj) {
                return getRKeyID.onNavigationEvent(z, baseActivity, str, (BuildConfigApi) obj);
            }
        };
        return writerawOnWarmupCompleted.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda32
            public final void accept(Object obj) {
                getRKeyID.onTransact(function12, obj);
            }
        });
    }

    private static final void ICustomTabsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onExtraCallback + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void asInterface(BaseActivity baseActivity) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        baseActivity.bo_();
        int i4 = onExtraCallback + 125;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final deserializeIp onMinimized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (deserializeIp) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final deserializeIp onExtraCallbackWithResult(BaseActivity baseActivity, String str, MediaViewApi mediaViewApi) {
        writeRaw<Boolean> writerawOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(mediaViewApi, "");
            writerawOnNavigationEvent = onWarmupCompleted.onNavigationEvent(baseActivity, mediaViewApi, str);
            int i3 = 60 / 0;
        } else {
            Intrinsics.checkNotNullParameter(mediaViewApi, "");
            writerawOnNavigationEvent = onWarmupCompleted.onNavigationEvent(baseActivity, mediaViewApi, str);
        }
        int i4 = onNavigationEvent + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return writerawOnNavigationEvent;
    }

    private static final deserializeIp onMessageChannelReady(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (deserializeIp) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i3 = 37 / 0;
        return deserializeip;
    }

    private static final Unit IAuthTabCallbackDefault(BaseActivity baseActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity.IAuthTabCallback(baseActivity, (String) null, false, 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 67;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onPostMessage(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onNavigationEvent + 109;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        baseActivity.bo_();
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 31;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static final deserializeIp onExtraCallback(Integer num, final BaseActivity baseActivity, Boolean bool) {
        int iIntValue;
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bool, "");
            bool.booleanValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(bool, "");
        if (!bool.booleanValue()) {
            return writeRaw.onExtraCallback(new BuildConfigApi(false, null, null, 7, null));
        }
        getRKeyID getrkeyid = onWarmupCompleted;
        if (num != null) {
            iIntValue = num.intValue();
            int i3 = onExtraCallback + 65;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        } else {
            iIntValue = 0;
        }
        writeRaw writeraw = (writeRaw) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 769137069, zzgc.onExtraCallbackWithResult(), new Object[]{getrkeyid, false, CollectionsKt.listOf(Integer.valueOf(iIntValue))}, -769137058);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return getRKeyID.onNavigationEvent(baseActivity, (deserializeUriNullableCollection) obj);
            }
        };
        writeRaw writerawOnWarmupCompleted = writeraw.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda5
            public final void accept(Object obj) {
                getRKeyID.IAuthTabCallbackStub(function1, obj);
            }
        }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda6
            public final void run() throws Throwable {
                getRKeyID.onExtraCallbackWithResult(baseActivity);
            }
        });
        int i5 = onExtraCallback + 59;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
        return writerawOnWarmupCompleted;
    }

    private static final deserializeIp onActivityResized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i3 = onExtraCallback + 107;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return deserializeip;
    }

    public final writeRaw<BuildConfigApi> IAuthTabCallback(@NotNull final BaseActivity baseActivity, @Nullable final Integer num, @Nullable final String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallback = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(baseActivity, "");
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29426), TextUtils.indexOf("", "", 0, 0) + 22, 24733 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -842029757, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj = ((Field) objOnExtraCallback).get(null);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-339320021);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29425), ((Process.getThreadPriority(0) + 20) >> 6) + 22, View.combineMeasuredStates(0, 0) + 24734, -628712005, false, "onTransact", new Class[0]);
                }
                throw null;
            }
            Intrinsics.checkNotNullParameter(baseActivity, "");
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29425 - TextUtils.lastIndexOf("", '0', 0, 0)), ExpandableListView.getPackedPositionType(0L) + 22, 24734 - (ViewConfiguration.getPressedStateDuration() >> 16), -842029757, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj2 = ((Field) objOnExtraCallback3).get(null);
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-339320021);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29427 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> 8) + 22, TextUtils.indexOf("", "") + 24734, -628712005, false, "onTransact", new Class[0]);
            }
            writeRaw<BaseApiResponse<MediaViewApi>> writerawOnWarmupCompleted = ((CacheFlag) ((Method) objOnExtraCallback4).invoke(obj2, null)).onWarmupCompleted(new InterstitialAdApi(num != null ? num.intValue() : 0, true));
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new asInterface(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda8
                public final Object invoke(Object obj3) {
                    return getRKeyID.IAuthTabCallback(baseActivity, (deserializeUriNullableCollection) obj3);
                }
            };
            writeRaw writerawOnWarmupCompleted2 = writerawIAuthTabCallback.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda9
                public final void accept(Object obj3) throws Throwable {
                    Object[] objArr = {function1, obj3};
                    getRKeyID.onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -49686947, zzgc.onExtraCallbackWithResult(), objArr, 49686955);
                }
            }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda10
                public final void run() {
                    getRKeyID.onWarmupCompleted(baseActivity);
                }
            });
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda11
                public final Object invoke(Object obj3) {
                    return getRKeyID.onWarmupCompleted(baseActivity, str, (MediaViewApi) obj3);
                }
            };
            writeRaw writerawOnExtraCallbackWithResult = writerawOnWarmupCompleted2.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda12
                public final Object apply(Object obj3) {
                    return getRKeyID.IAuthTabCallbackStubProxy(function12, obj3);
                }
            });
            final Function1 function13 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda13
                public final Object invoke(Object obj3) {
                    return getRKeyID.onExtraCallbackWithResult(num, baseActivity, (Boolean) obj3);
                }
            };
            writeRaw writerawOnExtraCallbackWithResult2 = writerawOnExtraCallbackWithResult.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda14
                public final Object apply(Object obj3) {
                    return getRKeyID.IAuthTabCallbackDefault(function13, obj3);
                }
            });
            final Function1 function14 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda15
                public final Object invoke(Object obj3) {
                    return getRKeyID.onExtraCallbackWithResult(baseActivity, num, (BuildConfigApi) obj3);
                }
            };
            writeRaw<BuildConfigApi> writerawOnExtraCallbackWithResult3 = writerawOnExtraCallbackWithResult2.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda16
                public final Object apply(Object obj3) {
                    Object[] objArr = {function14, obj3};
                    return (deserializeIp) getRKeyID.onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 2099293694, zzgc.onExtraCallbackWithResult(), objArr, -2099293694);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult3, "");
            int i3 = onNavigationEvent + 125;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return writerawOnExtraCallbackWithResult3;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final CharSequence IAuthTabCallbackDefault(getVersionOverride getversionoverride) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getversionoverride, "");
        String strOnNavigationEvent = getversionoverride.onNavigationEvent();
        int i4 = onNavigationEvent + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        getVersionOverride getversionoverride = (getVersionOverride) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        String strAsInterface = getversionoverride.asInterface();
        if (strAsInterface == null) {
            int i2 = onExtraCallback + 119;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            strAsInterface = "";
        }
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(strAsInterface);
        String strAsBinder = getversionoverride.asBinder();
        if (strAsBinder != null) {
            int i3 = onNavigationEvent + 111;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            str = strAsBinder;
        }
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa A[EDGE_INSN: B:44:0x00aa->B:24:0x00aa BREAK  A[LOOP:0: B:11:0x0072->B:47:0x0072], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0072 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final o.deserializeIp onNavigationEvent(im.toss.base.BaseActivity r16, java.lang.Integer r17, o.BuildConfigApi r18) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRKeyID.onNavigationEvent(im.toss.base.BaseActivity, java.lang.Integer, o.BuildConfigApi):o.deserializeIp");
    }

    private static final Unit onWarmupCompleted(String str, String str2, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("bottomsheet_title", str);
            setDetectableSize.onExtraCallback("button_text", str2);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("bottomsheet_title", str);
        setDetectableSize.onExtraCallback("button_text", str2);
        int i3 = 39 / 0;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void IAuthTabCallback(@org.jetbrains.annotations.NotNull im.toss.base.BaseActivity r20) {
        /*
            r19 = this;
            r1 = r20
            r10 = 2
            int r0 = r10 % r10
            int r0 = o.getRKeyID.onNavigationEvent
            int r0 = r0 + 61
            int r2 = r0 % 128
            o.getRKeyID.onExtraCallback = r2
            int r0 = r0 % r10
            java.lang.String r2 = ""
            if (r0 == 0) goto L24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            o.EncodedDataImplExternalSyntheticLambda0 r0 = o.EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(r20)
            boolean r0 = r0.onWarmupCompleted()
            r3 = 30
            int r3 = r3 / 0
            if (r0 != 0) goto L76
            goto L31
        L24:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            o.EncodedDataImplExternalSyntheticLambda0 r0 = o.EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(r20)
            boolean r0 = r0.onWarmupCompleted()
            if (r0 != 0) goto L76
        L31:
            int r0 = viva.republica.toss.R.string.card_notification_system_bottomsheet_title
            java.lang.String r3 = r1.getString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            int r0 = viva.republica.toss.R.string.card_notification_system_bottomsheet_cta
            java.lang.String r5 = r1.getString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            r11 = 1562805(0x17d8b5, double:7.721283E-318)
            r13 = 0
            r14 = 0
            r15 = 0
            viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda0 r0 = new viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda0
            r0.<init>()
            r17 = 14
            r18 = 0
            r16 = r0
            o.ConvertByteArrayToFloatArray.onExtraCallback(r11, r13, r14, r15, r16, r17, r18)
            int r0 = viva.republica.toss.R.string.card_notification_system_bottomsheet_description
            java.lang.String r4 = r1.getString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)
            viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda1 r6 = new viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda1
            r6.<init>()
            viva.republica.toss.main.more.push.SystemNotificationBottomSheetDialog r11 = new viva.republica.toss.main.more.push.SystemNotificationBottomSheetDialog
            java.lang.String r2 = "card_notification"
            r7 = 0
            r8 = 64
            r9 = 0
            r0 = r11
            r1 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.show()
        L76:
            int r0 = o.getRKeyID.onNavigationEvent
            int r0 = r0 + 79
            int r1 = r0 % 128
            o.getRKeyID.onExtraCallback = r1
            int r0 = r0 % r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRKeyID.IAuthTabCallback(im.toss.base.BaseActivity):void");
    }

    private final writeRaw<Boolean> onNavigationEvent(final BaseActivity baseActivity, final MediaViewApi mediaViewApi, final String str) {
        int i = 2 % 2;
        writeRaw<Boolean> writerawOnNavigationEvent = writeRaw.onNavigationEvent(new NetConverter() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda27
            public final void subscribe(JsonWriterWriteObject jsonWriterWriteObject) {
                getRKeyID.onNavigationEvent(baseActivity, str, mediaViewApi, jsonWriterWriteObject);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent, "");
        int i2 = onNavigationEvent + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return writerawOnNavigationEvent;
    }

    private static final Unit onNavigationEvent(String str, MediaViewApi mediaViewApi, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(7 - Process.getGidForName(""), 7 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{65530, 7, 7, 65530, 65531, 65530, 7, 7}, true, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 219, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("card_vendor_name", mediaViewApi.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        JsonWriterWriteObject jsonWriterWriteObject = (JsonWriterWriteObject) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!jsonWriterWriteObject.isDisposed()) {
            jsonWriterWriteObject.onNavigationEvent(Boolean.FALSE);
        }
        int i4 = onExtraCallback + 55;
        onNavigationEvent = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        MediaViewApi mediaViewApi = (MediaViewApi) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        a(KeyEvent.normalizeMetaState(0) + 8, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6, new char[]{65530, 7, 7, 65530, 65531, 65530, 7, 7}, true, 218 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
        setDetectableSize.onExtraCallback("card_vendor_name", mediaViewApi.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 53;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final void onExtraCallback(getTypedExportedConstants gettypedexportedconstants, final String str, final MediaViewApi mediaViewApi, View view) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1010655L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda33
            public final Object invoke(Object obj) {
                return getRKeyID.onExtraCallback(str, mediaViewApi, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        gettypedexportedconstants.dismiss();
        int i2 = onNavigationEvent + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit asBinder(String str, MediaViewApi mediaViewApi, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(8 - TextUtils.getTrimmedLength(""), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7, new char[]{65530, 7, 7, 65530, 65531, 65530, 7, 7}, true, 218 - View.getDefaultSize(0, 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("card_vendor_name", mediaViewApi.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 21;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onWarmupCompleted(JsonWriterWriteObject jsonWriterWriteObject, getTypedExportedConstants gettypedexportedconstants, final String str, final MediaViewApi mediaViewApi, View view) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1010657L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda23
            public final Object invoke(Object obj) {
                return getRKeyID.onExtraCallbackWithResult(str, mediaViewApi, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        jsonWriterWriteObject.onNavigationEvent(Boolean.TRUE);
        gettypedexportedconstants.dismiss();
        int i2 = onNavigationEvent + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void onExtraCallback(im.toss.base.BaseActivity r24, final java.lang.String r25, final o.MediaViewApi r26, final o.JsonWriterWriteObject r27) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRKeyID.onExtraCallback(im.toss.base.BaseActivity, java.lang.String, o.MediaViewApi, o.JsonWriterWriteObject):void");
    }

    private final writeRaw<Boolean> onExtraCallbackWithResult(final KeyAgreeRecipientIdentifier keyAgreeRecipientIdentifier, final getDummyAd getdummyad, final String str, final String str2) {
        int i = 2 % 2;
        writeRaw<Boolean> writerawOnNavigationEvent = writeRaw.onNavigationEvent(new NetConverter() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda24
            public final void subscribe(JsonWriterWriteObject jsonWriterWriteObject) {
                getRKeyID.onExtraCallback(keyAgreeRecipientIdentifier, getdummyad, str, str2, jsonWriterWriteObject);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent, "");
        int i2 = onNavigationEvent + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return writerawOnNavigationEvent;
        }
        throw null;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ String $referrer;
        final /* synthetic */ String $standardTermsCode;
        final /* synthetic */ getDummyAd $termsIntent;
        final /* synthetic */ KeyAgreeRecipientIdentifier $termsProvider;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(getDummyAd getdummyad, KeyAgreeRecipientIdentifier keyAgreeRecipientIdentifier, String str, String str2, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$termsIntent = getdummyad;
            this.$termsProvider = keyAgreeRecipientIdentifier;
            this.$standardTermsCode = str;
            this.$referrer = str2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new asBinder(this.$termsIntent, this.$termsProvider, this.$standardTermsCode, this.$referrer, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                getDummyAd getdummyad = this.$termsIntent;
                Object obj2 = this.$termsProvider;
                Context context = obj2 instanceof Context ? (Context) obj2 : null;
                if (context == null) {
                    return Unit.INSTANCE;
                }
                String str = this.$standardTermsCode;
                String str2 = this.$referrer;
                if (str2 == null) {
                    str2 = "";
                }
                this.label = 1;
                objOnExtraCallback = getDummyAd.onExtraCallback(getdummyad, context, str, str2, (String) null, 0L, (Map) null, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, this, 8388600, (Object) null);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = obj;
            }
            this.$termsProvider.ITrustedWebActivityCallbackStubProxy().onNavigationEvent((Intent) objOnExtraCallback);
            return Unit.INSTANCE;
        }
    }

    private static final Unit onWarmupCompleted(JsonWriterWriteObject jsonWriterWriteObject, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        jsonWriterWriteObject.onNavigationEvent(Boolean.valueOf(z));
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 79;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void onWarmupCompleted(KeyAgreeRecipientIdentifier keyAgreeRecipientIdentifier, getDummyAd getdummyad, String str, String str2, final JsonWriterWriteObject jsonWriterWriteObject) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonWriterWriteObject, "");
        keyAgreeRecipientIdentifier.onExtraCallback(new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationUtil$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                Object[] objArr = {jsonWriterWriteObject, Boolean.valueOf(((Boolean) obj).booleanValue())};
                return (Unit) getRKeyID.onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 554269464, zzgc.onExtraCallbackWithResult(), objArr, -554269451);
            }
        });
        maybeUpdateAnimatable.onNavigationEvent(findRes.onWarmupCompleted(putChannelInfo.onExtraCallback()), (CoroutineContext) null, (setRandomHost) null, new asBinder(getdummyad, keyAgreeRecipientIdentifier, str, str2, null), 3, (Object) null);
        int i2 = onNavigationEvent + 97;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final writeRaw<InitSettingsBuilder> onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 29426), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-339320021);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 29427), 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 24733, -628712005, false, "onTransact", new Class[0]);
            }
            writeRaw<BaseApiResponse<InitSettingsBuilder>> writerawIAuthTabCallback = ((CacheFlag) ((Method) objOnExtraCallback2).invoke(obj, null)).IAuthTabCallback();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw<InitSettingsBuilder> writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new onNavigationEvent(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
            int i2 = onNavigationEvent + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return writerawIAuthTabCallback2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final writeRaw<launchUrl> onNavigationEvent(@Nullable List<Integer> list) throws Throwable {
        int i = 2 % 2;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29425), Process.getGidForName("") + 23, View.MeasureSpec.getMode(0) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-339320021);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22, Process.getGidForName("") + 24735, -628712005, false, "onTransact", new Class[0]);
            }
            writeRaw<BaseApiResponse<launchUrl>> writerawOnExtraCallback = ((CacheFlag) ((Method) objOnExtraCallback2).invoke(obj, null)).onExtraCallback(new setVersionOverride(list));
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw<launchUrl> writerawIAuthTabCallback = writerawOnExtraCallback.IAuthTabCallback(new onExtraCallbackWithResult(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 38 / 0;
            }
            return writerawIAuthTabCallback;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        List list = (List) objArr[2];
        int i = 2 % 2;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (Process.myPid() >> 22)), TextUtils.getOffsetBefore("", 0) + 22, 24734 - (KeyEvent.getMaxKeyCode() >> 16), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        ArrayList arrayList = null;
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-339320021);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29426), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22, 24734 - (ViewConfiguration.getTouchSlop() >> 8), -628712005, false, "onTransact", new Class[0]);
            }
            CacheFlag cacheFlag = (CacheFlag) ((Method) objOnExtraCallback2).invoke(obj, null);
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                int i2 = onNavigationEvent + 61;
                while (true) {
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    if (!it.hasNext()) {
                        break;
                    }
                    arrayList.add(new isUnity(Integer.valueOf(((Number) it.next()).intValue()), Boolean.valueOf(zBooleanValue)));
                    i2 = onNavigationEvent + 85;
                }
            }
            writeRaw<BaseApiResponse<BuildConfigApi>> writerawIAuthTabCallback = cacheFlag.IAuthTabCallback(new BidderTokenProviderApi(arrayList));
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new onExtraCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
            return writerawIAuthTabCallback2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static /* synthetic */ boolean onWarmupCompleted(getVersionOverride getversionoverride) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -1779591834, iOnExtraCallbackWithResult, new Object[]{getversionoverride}, 1779591849)).booleanValue();
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -918277956, iOnExtraCallbackWithResult, new Object[]{str, str2, setDetectableSize}, 918277962);
    }

    public static /* synthetic */ boolean onNavigationEvent(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 217275904, iOnExtraCallbackWithResult, new Object[]{function1, obj}, -217275894)).booleanValue();
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) throws Throwable {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -49686947, iOnExtraCallbackWithResult, new Object[]{function1, obj}, 49686955);
    }

    public static /* synthetic */ deserializeIp access100(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (deserializeIp) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 2099293694, iOnExtraCallbackWithResult, new Object[]{function1, obj}, -2099293694);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(JsonWriterWriteObject jsonWriterWriteObject, boolean z) {
        Object[] objArr = {jsonWriterWriteObject, Boolean.valueOf(z)};
        return (Unit) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 554269464, zzgc.onExtraCallbackWithResult(), objArr, -554269451);
    }

    private final writeRaw<getVersionOverride> onWarmupCompleted(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        return (writeRaw) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -1299014411, zzgc.onExtraCallbackWithResult(), objArr, 1299014413);
    }

    private static final boolean onNavigationEvent(getVersionOverride getversionoverride) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -174918943, iOnExtraCallbackWithResult, new Object[]{getversionoverride}, 174918957)).booleanValue();
    }

    private static final List onExtraCallbackWithResult(InitSettingsBuilder initSettingsBuilder) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (List) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -762828704, iOnExtraCallbackWithResult, new Object[]{initSettingsBuilder}, 762828716);
    }

    private final writeRaw<BuildConfigApi> onExtraCallback(boolean z, List<Integer> list) {
        Object[] objArr = {this, Boolean.valueOf(z), list};
        return (writeRaw) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 769137069, zzgc.onExtraCallbackWithResult(), objArr, -769137058);
    }

    private static final Unit onNavigationEvent(String str, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 2035598079, iOnExtraCallbackWithResult, new Object[]{str, setDetectableSize}, -2035598062);
    }

    private static final Unit onExtraCallbackWithResult(String str, String str2) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -24476705, iOnExtraCallbackWithResult, new Object[]{str, str2}, 24476714);
    }

    private static final void onExtraCallback(JsonWriterWriteObject jsonWriterWriteObject, DialogInterface dialogInterface) throws Throwable {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 1743186068, iOnExtraCallbackWithResult, new Object[]{jsonWriterWriteObject, dialogInterface}, -1743186063);
    }

    private static final Unit IAuthTabCallback(String str, MediaViewApi mediaViewApi, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 741321700, iOnExtraCallbackWithResult, new Object[]{str, mediaViewApi, setDetectableSize}, -741321697);
    }

    private static final Unit onExtraCallbackWithResult(BaseActivity baseActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -755762237, iOnExtraCallbackWithResult, new Object[]{baseActivity, deserializeurinullablecollection}, 755762241);
    }

    private static final void readTypedObject(Function1 function1, Object obj) throws Throwable {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 619365262, iOnExtraCallbackWithResult, new Object[]{function1, obj}, -619365246);
    }

    private static final Unit IAuthTabCallbackStub(BaseActivity baseActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 1389153016, iOnExtraCallbackWithResult, new Object[]{baseActivity, deserializeurinullablecollection}, -1389153015);
    }

    private static final void onTransact(BaseActivity baseActivity) throws Throwable {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -233226573, iOnExtraCallbackWithResult, new Object[]{baseActivity}, 233226580);
    }

    private static final Unit onWarmupCompleted(getVersionOverride getversionoverride, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 826866822, iOnExtraCallbackWithResult, new Object[]{getversionoverride, commonModule_setLeftEdgeTouchEnabled}, -826866804);
    }

    static void onExtraCallback() {
        IAuthTabCallback = 478308934;
    }
}
