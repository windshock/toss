package o;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import androidx.collection.LruCache;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.core.workerservice.WorkerService$;
import im.toss.core.workerservice.WorkerService$Companion$$ExternalSyntheticLambda9;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AbstractServiceC0065onCallback;
import o.JsonWriterWriteObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.onCallback, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class AbstractServiceC0065onCallback extends Service {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final AppSetIdAndScope1 IAuthTabCallback = ea10.onExtraCallbackWithResult("WorkerService");
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    private handleEnterApp onExtraCallback;
    private setTid<Set<Integer>> onNavigationEvent;
    private final Set<Integer> onWarmupCompleted = new LinkedHashSet();

    public static /* synthetic */ deserializeIp IAuthTabCallback(AbstractServiceC0065onCallback abstractServiceC0065onCallback, Uri uri, int i, writeRaw writeraw) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 59;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallback(abstractServiceC0065onCallback, uri, i, writeraw);
        }
        onExtraCallback(abstractServiceC0065onCallback, uri, i, writeraw);
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(function1, obj);
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
    }

    public static /* synthetic */ Bundle IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Bundle bundleAccess100 = access100(function1, obj);
        int i4 = IAuthTabCallbackStub + 93;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return bundleAccess100;
    }

    public static /* synthetic */ Bundle onExtraCallback(int i, AbstractServiceC0065onCallback abstractServiceC0065onCallback, Bundle bundle, String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 81;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {Integer.valueOf(i), abstractServiceC0065onCallback, bundle, str};
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        Bundle bundle2 = (Bundle) onNavigationEvent(objArr, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -835650758, iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent2, 835650762);
        int i5 = IAuthTabCallbackStub + 63;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return bundle2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(ResultReceiver resultReceiver, int i, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 11;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(resultReceiver, i, bundle);
        int i5 = onExtraCallbackWithResult + 109;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(AbstractServiceC0065onCallback abstractServiceC0065onCallback, Set set) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(abstractServiceC0065onCallback, set);
        int i4 = IAuthTabCallbackStub + 9;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean onExtraCallback(Set set) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {set};
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent4 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        if (i3 != 0) {
            ((Boolean) onNavigationEvent(objArr, iOnNavigationEvent4, -1750672619, iOnNavigationEvent, iOnNavigationEvent3, iOnNavigationEvent2, 1750672621)).booleanValue();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) onNavigationEvent(objArr, iOnNavigationEvent4, -1750672619, iOnNavigationEvent, iOnNavigationEvent3, iOnNavigationEvent2, 1750672621)).booleanValue();
        int i4 = onExtraCallbackWithResult + 121;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(th);
        int i4 = IAuthTabCallbackStub + 17;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ deserializeIp onExtraCallbackWithResult(Function1 function1, writeRaw writeraw) {
        deserializeIp deserializeip;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            deserializeip = (deserializeIp) onNavigationEvent(new Object[]{function1, writeraw}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1606338091, iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent2, -1606338090);
            int i3 = 54 / 0;
        } else {
            int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            int iOnNavigationEvent4 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            deserializeip = (deserializeIp) onNavigationEvent(new Object[]{function1, writeraw}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1606338091, iOnNavigationEvent3, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent4, -1606338090);
        }
        int i4 = IAuthTabCallbackStub + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return deserializeip;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        asInterface(function1, obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AbstractServiceC0065onCallback abstractServiceC0065onCallback = (AbstractServiceC0065onCallback) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(abstractServiceC0065onCallback, iIntValue);
        int i4 = IAuthTabCallbackStub + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i6;
        int i9 = ~i3;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i2 | i3);
        int i12 = (~(i3 | i2)) | (~(i7 | i9)) | i8;
        int i13 = i6 + i2 + i5 + (62936680 * i4) + ((-2032430997) * i);
        int i14 = i13 * i13;
        int i15 = ((-476632153) * i6) + 797966336 + (1756943451 * i2) + (i10 * (-1030695846)) + ((-1030695846) * i11) + (1030695846 * i12) + ((-1507328000) * i5) + ((-264241152) * i4) + ((-222822400) * i) + (2040594432 * i14);
        int i16 = ((i6 * 1175661207) - 43826732) + (i2 * 1175659659) + (i10 * (-774)) + (i11 * (-774)) + (i12 * 774) + (i5 * 1175660433) + (i4 * 1188219112) + (i * (-816965221)) + (i14 * 1798373376);
        int i17 = i15 + (i16 * i16 * 914292736);
        if (i17 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i17 == 2) {
            return onExtraCallback(objArr);
        }
        if (i17 == 3) {
            return IAuthTabCallback(objArr);
        }
        if (i17 == 4) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i17 == 5) {
            return onNavigationEvent(objArr);
        }
        AbstractServiceC0065onCallback abstractServiceC0065onCallback = (AbstractServiceC0065onCallback) objArr[0];
        Intent intent = (Intent) objArr[1];
        int i18 = 2 % 2;
        int i19 = IAuthTabCallbackStub + 111;
        onExtraCallbackWithResult = i19 % 128;
        int i20 = i19 % 2;
        deserializeIp deserializeipOnExtraCallback = onExtraCallback(abstractServiceC0065onCallback, intent);
        int i21 = onExtraCallbackWithResult + 119;
        IAuthTabCallbackStub = i21 % 128;
        int i22 = i21 % 2;
        return deserializeipOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(ResultReceiver resultReceiver, int i, Throwable th) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 109;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(resultReceiver, i, th);
        if (i4 != 0) {
            int i5 = 74 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ boolean onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTransact = onTransact(function1, obj);
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        int i5 = onExtraCallbackWithResult + 39;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return zOnTransact;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel(function1, obj);
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        int i5 = IAuthTabCallbackStub + 113;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public abstract writeRaw<String> IAuthTabCallback(@NotNull Uri uri, @Nullable Bundle bundle);

    public static final /* synthetic */ AppSetIdAndScope1 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = IAuthTabCallback;
        int i5 = i3 + 7;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
        return appSetIdAndScope1;
    }

    /* renamed from: o.onCallback$onExtraCallback */
    public static final class onExtraCallback {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Unit IAuthTabCallback(JsonWriterWriteObject jsonWriterWriteObject, String str, long j, Long l) {
            Unit unit;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                unit = (Unit) onWarmupCompleted(-1335029931, 1335029932, new Object[]{jsonWriterWriteObject, str, Long.valueOf(j), l}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                int i3 = 97 / 0;
            } else {
                unit = (Unit) onWarmupCompleted(-1335029931, 1335029932, new Object[]{jsonWriterWriteObject, str, Long.valueOf(j), l}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            }
            int i4 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault(function1, obj);
            int i4 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        public static /* synthetic */ boolean IAuthTabCallback(Context context, String str, Long l) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnWarmupCompleted = onWarmupCompleted(context, str, l);
            int i4 = onExtraCallbackWithResult + 3;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return zOnWarmupCompleted;
        }

        public static /* synthetic */ String onExtraCallback(Bundle bundle) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String strIAuthTabCallback = IAuthTabCallback(bundle);
            int i4 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return strIAuthTabCallback;
            }
            throw null;
        }

        public static /* synthetic */ void onExtraCallback(Context context, Class cls, Uri uri, Bundle bundle, int i, long j, Handler handler, String str, JsonWriterWriteObject jsonWriterWriteObject) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Integer numValueOf = Integer.valueOf(i);
            Long lValueOf = Long.valueOf(j);
            if (i4 != 0) {
                int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                onWarmupCompleted(-2040469054, 2040469054, new Object[]{context, cls, uri, bundle, numValueOf, lValueOf, handler, str, jsonWriterWriteObject}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted);
                int i5 = 8 / 0;
            } else {
                int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                onWarmupCompleted(-2040469054, 2040469054, new Object[]{context, cls, uri, bundle, numValueOf, lValueOf, handler, str, jsonWriterWriteObject}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2);
            }
            int i6 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ boolean onExtraCallback(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                IAuthTabCallbackStub(function1, obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            boolean zIAuthTabCallbackStub = IAuthTabCallbackStub(function1, obj);
            int i3 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return zIAuthTabCallbackStub;
        }

        public static /* synthetic */ boolean onExtraCallbackWithResult(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                asBinder(function1, obj);
                throw null;
            }
            boolean zAsBinder = asBinder(function1, obj);
            int i3 = onExtraCallbackWithResult + 45;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return zAsBinder;
            }
            throw null;
        }

        public static /* synthetic */ boolean onExtraCallbackWithResult(JsonWriterWriteObject jsonWriterWriteObject, Long l) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnExtraCallback = onExtraCallback(jsonWriterWriteObject, l);
            int i4 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 72 / 0;
            }
            return zOnExtraCallback;
        }

        public static /* synthetic */ Unit onNavigationEvent(Throwable th) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                return (Unit) onWarmupCompleted(127761470, -127761467, new Object[]{th}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted);
            }
            int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            onWarmupCompleted(710263356, -710263354, new Object[]{function1, obj}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted);
            int i4 = onWarmupCompleted + 63;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
            int i7 = ~i;
            int i8 = ~((~i6) | i7);
            int i9 = ~i2;
            int i10 = ~(i9 | i);
            int i11 = ~(i7 | i2);
            int i12 = i8 | i10 | i11;
            int i13 = ~(i9 | i7 | i6);
            int i14 = (~(i6 | i7)) | i10 | i11;
            int i15 = i2 + i + i4 + (2052055731 * i5) + (1687666023 * i3);
            int i16 = i15 * i15;
            int i17 = (i2 * (-1966771951)) + 1000013824 + ((-1966771951) * i) + ((-617538080) * i12) + ((-926307120) * i13) + (308769040 * i14) + (2019426304 * i4) + (632946688 * i5) + ((-741212160) * i3) + (2121465856 * i16);
            int i18 = (i2 * 1533266457) + 1248777597 + (i * 1533266457) + (i12 * (-800)) + (i13 * (-1200)) + (i14 * 400) + (i4 * 1533266057) + (i5 * 706030027) + (i3 * 1023530015) + (i16 * (-2088042496));
            int i19 = i17 + (i18 * i18 * 1434255360);
            return i19 != 1 ? i19 != 2 ? i19 != 3 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
        }

        public static /* synthetic */ String onWarmupCompleted(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String strAsInterface = asInterface(function1, obj);
            int i4 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return strAsInterface;
        }

        private onExtraCallback() {
        }

        private final boolean onExtraCallbackWithResult(Context context, String str) {
            Object obj;
            Object next;
            int i = 2 % 2;
            Iterator<T> it = setRgbInputImage.onWarmupCompleted(context).iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
                String str2 = ((ActivityManager.RunningAppProcessInfo) next).processName;
                if (str2 != null) {
                    int i2 = onWarmupCompleted + 67;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        if (!StringsKt.endsWith$default(str2, str, false, 5, (Object) null)) {
                            break;
                        }
                    } else if (StringsKt.endsWith$default(str2, str, false, 2, (Object) null)) {
                        break;
                    }
                }
            }
            obj = next;
            if (obj == null) {
                return false;
            }
            int i3 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }

        /* renamed from: o.onCallback$onExtraCallback$onWarmupCompleted */
        public static final class onWarmupCompleted extends ResultReceiver {
            private static int IAuthTabCallbackStub = 1;
            private static int onExtraCallback;
            final /* synthetic */ JsonWriterWriteObject<Bundle> onWarmupCompleted;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onWarmupCompleted(Handler handler, JsonWriterWriteObject<Bundle> jsonWriterWriteObject) {
                super(handler);
                this.onWarmupCompleted = jsonWriterWriteObject;
            }

            public void IAuthTabCallback(int i, Bundle bundle) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallbackStub + 77;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                int i5 = i3 % 2;
                if (i != -1) {
                    this.onWarmupCompleted.onExtraCallback(new PendingIntent.CanceledException());
                    return;
                }
                int i6 = i4 + 77;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                JsonWriterWriteObject<Bundle> jsonWriterWriteObject = this.onWarmupCompleted;
                if (bundle == null) {
                    bundle = new Bundle();
                    int i8 = IAuthTabCallbackStub + 41;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                }
                jsonWriterWriteObject.onNavigationEvent(bundle);
                int i10 = IAuthTabCallbackStub + 89;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
            }
        }

        private static final boolean asBinder(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(obj, "");
            boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
            int i4 = onWarmupCompleted + 95;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return zBooleanValue;
        }

        private static final boolean onExtraCallback(JsonWriterWriteObject jsonWriterWriteObject, Long l) {
            boolean zIsDisposed;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(l, "");
                zIsDisposed = jsonWriterWriteObject.isDisposed();
            } else {
                Intrinsics.checkNotNullParameter(l, "");
                zIsDisposed = !jsonWriterWriteObject.isDisposed();
            }
            int i3 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return zIsDisposed;
        }

        private static final boolean IAuthTabCallbackStub(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(obj, "");
                return ((Boolean) function1.invoke(obj)).booleanValue();
            }
            Intrinsics.checkNotNullParameter(obj, "");
            ((Boolean) function1.invoke(obj)).booleanValue();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        private static final boolean onWarmupCompleted(Context context, String str, Long l) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(l, "");
            boolean zOnExtraCallbackWithResult = AbstractServiceC0065onCallback.Companion.onExtraCallbackWithResult(context, str);
            int i4 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 0;
            }
            return zOnExtraCallbackWithResult;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            Function1 function1 = (Function1) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(obj);
            int i4 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw null;
        }

        private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(obj);
            int i4 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            JsonWriterWriteObject jsonWriterWriteObject = (JsonWriterWriteObject) objArr[0];
            String str = (String) objArr[1];
            long jLongValue = ((Number) objArr[2]).longValue();
            int i = 2 % 2;
            jsonWriterWriteObject.onExtraCallback(new updateLoading(str + " is not alive in elapsedMillis:" + (System.currentTimeMillis() - jLongValue)));
            Unit unit = Unit.INSTANCE;
            int i2 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                AbstractServiceC0065onCallback.onExtraCallbackWithResult();
                return Unit.INSTANCE;
            }
            AbstractServiceC0065onCallback.onExtraCallbackWithResult();
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            final Context context = (Context) objArr[0];
            Class cls = (Class) objArr[1];
            Uri uri = (Uri) objArr[2];
            Bundle bundle = (Bundle) objArr[3];
            int iIntValue = ((Number) objArr[4]).intValue();
            long jLongValue = ((Number) objArr[5]).longValue();
            Handler handler = (Handler) objArr[6];
            final String str = (String) objArr[7];
            final JsonWriterWriteObject jsonWriterWriteObject = (JsonWriterWriteObject) objArr[8];
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(jsonWriterWriteObject, "");
            Intent intent = new Intent(context, (Class<?>) cls);
            intent.setData(uri);
            if (bundle != null) {
                int i2 = onExtraCallbackWithResult + 39;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                intent.putExtras(bundle);
            }
            intent.putExtra("__ResultType", iIntValue);
            AbstractServiceC0065onCallback.onExtraCallbackWithResult();
            intent.toString();
            intent.putExtra("__ResultReceiver", (Parcelable) new onWarmupCompleted(handler, jsonWriterWriteObject));
            try {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                context.startService(intent);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                getByteBuffer getbytebufferAsBinder = getByteBuffer.onNavigationEvent(5L, 2L, timeUnit).asBinder(jLongValue, timeUnit);
                final Function1 function1 = new Function1() { // from class: im.toss.core.workerservice.WorkerService$Companion$$ExternalSyntheticLambda3
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallback + 15;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        JsonWriterWriteObject jsonWriterWriteObject2 = jsonWriterWriteObject;
                        Long l = (Long) obj;
                        if (i6 == 0) {
                            return Boolean.valueOf(AbstractServiceC0065onCallback.onExtraCallback.onExtraCallbackWithResult(jsonWriterWriteObject2, l));
                        }
                        Boolean.valueOf(AbstractServiceC0065onCallback.onExtraCallback.onExtraCallbackWithResult(jsonWriterWriteObject2, l));
                        throw null;
                    }
                };
                getByteBuffer getbytebufferOnTransact = getbytebufferAsBinder.onTransact(new deserializeLongCollection() { // from class: im.toss.core.workerservice.WorkerService$Companion$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final boolean test(Object obj) {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallback + 27;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        Function1 function12 = function1;
                        if (i6 != 0) {
                            return AbstractServiceC0065onCallback.onExtraCallback.onExtraCallbackWithResult(function12, obj);
                        }
                        AbstractServiceC0065onCallback.onExtraCallback.onExtraCallbackWithResult(function12, obj);
                        throw null;
                    }
                });
                final Function1 function12 = new Function1() { // from class: im.toss.core.workerservice.WorkerService$Companion$$ExternalSyntheticLambda5
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallbackWithResult + 57;
                        onNavigationEvent = i5 % 128;
                        if (i5 % 2 == 0) {
                            Boolean.valueOf(AbstractServiceC0065onCallback.onExtraCallback.IAuthTabCallback(context, str, (Long) obj));
                            throw null;
                        }
                        Boolean boolValueOf = Boolean.valueOf(AbstractServiceC0065onCallback.onExtraCallback.IAuthTabCallback(context, str, (Long) obj));
                        int i6 = onNavigationEvent + 53;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 55 / 0;
                        }
                        return boolValueOf;
                    }
                };
                getByteBuffer getbytebufferOnNavigationEvent = getbytebufferOnTransact.onNavigationEvent(new deserializeLongCollection() { // from class: im.toss.core.workerservice.WorkerService$Companion$$ExternalSyntheticLambda6
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final boolean test(Object obj) {
                        int i4 = 2 % 2;
                        int i5 = onNavigationEvent + 107;
                        IAuthTabCallback = i5 % 128;
                        if (i5 % 2 != 0) {
                            AbstractServiceC0065onCallback.onExtraCallback.onExtraCallback(function12, obj);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        boolean zOnExtraCallback = AbstractServiceC0065onCallback.onExtraCallback.onExtraCallback(function12, obj);
                        int i6 = IAuthTabCallback + 71;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        return zOnExtraCallback;
                    }
                });
                final Function1 function13 = new Function1() { // from class: im.toss.core.workerservice.WorkerService$Companion$$ExternalSyntheticLambda7
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i4 = 2 % 2;
                        int i5 = IAuthTabCallback + 89;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        Unit unitIAuthTabCallback = AbstractServiceC0065onCallback.onExtraCallback.IAuthTabCallback(jsonWriterWriteObject, str, jCurrentTimeMillis, (Long) obj);
                        int i7 = onNavigationEvent + 53;
                        IAuthTabCallback = i7 % 128;
                        if (i7 % 2 == 0) {
                            return unitIAuthTabCallback;
                        }
                        throw null;
                    }
                };
                deserializeFloat deserializefloat = new deserializeFloat() { // from class: im.toss.core.workerservice.WorkerService$Companion$$ExternalSyntheticLambda8
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final void accept(Object obj) {
                        int i4 = 2 % 2;
                        int i5 = onWarmupCompleted + 33;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        AbstractServiceC0065onCallback.onExtraCallback.onNavigationEvent(function13, obj);
                        if (i6 != 0) {
                            int i7 = 69 / 0;
                        }
                    }
                };
                final WorkerService$Companion$$ExternalSyntheticLambda9 workerService$Companion$$ExternalSyntheticLambda9 = new WorkerService$Companion$$ExternalSyntheticLambda9();
                getbytebufferOnNavigationEvent.onExtraCallbackWithResult(deserializefloat, new deserializeFloat() { // from class: im.toss.core.workerservice.WorkerService$Companion$$ExternalSyntheticLambda10
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final void accept(Object obj) {
                        int i4 = 2 % 2;
                        int i5 = IAuthTabCallback + 111;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        AbstractServiceC0065onCallback.onExtraCallback.IAuthTabCallback(workerService$Companion$$ExternalSyntheticLambda9, obj);
                        if (i6 != 0) {
                            int i7 = 45 / 0;
                        }
                    }
                });
                int i4 = onWarmupCompleted + 25;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return null;
            } catch (Throwable th) {
                jsonWriterWriteObject.onExtraCallback(th);
                AbstractServiceC0065onCallback.onExtraCallbackWithResult();
                th.toString();
                return null;
            }
        }

        private static final String IAuthTabCallback(Bundle bundle) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(bundle, "");
            String strOnExtraCallbackWithResult = AbstractServiceC0065onCallback.Companion.onExtraCallbackWithResult(bundle);
            int i4 = onWarmupCompleted + 97;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 59 / 0;
            }
            return strOnExtraCallbackWithResult;
        }

        private static final String asInterface(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(obj, "");
            String str = (String) function1.invoke(obj);
            int i4 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            if (r7 == null) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        
            if (r7 == null) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        
            return "";
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        
            r2 = new java.io.File(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        
            r7 = kotlin.io.FilesKt.readText$default(r2, (java.nio.charset.Charset) null, 1, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
        
            r1 = o.AbstractServiceC0065onCallback.onExtraCallback.onWarmupCompleted + 63;
            o.AbstractServiceC0065onCallback.onExtraCallback.onExtraCallbackWithResult = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
        
            if ((r1 % 2) != 0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
        
            r0 = 5 % 3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
        
            r7 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
        
            r0 = kotlin.Result.Companion;
            kotlin.Result.constructor-impl(java.lang.Boolean.valueOf(r2.delete()));
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
        
            r1 = kotlin.Result.Companion;
            kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(r0));
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
        
            throw r7;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final String onExtraCallbackWithResult(Bundle bundle) {
            Integer numValueOf;
            String string;
            String text$default;
            int i = 2 % 2;
            if (bundle != null) {
                int i2 = onExtraCallbackWithResult + 81;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                numValueOf = Integer.valueOf(bundle.getInt("__ResultType"));
            } else {
                numValueOf = null;
            }
            if (bundle != null) {
                string = bundle.getString("__ResultData");
                int i4 = onWarmupCompleted + 57;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            } else {
                string = null;
            }
            if (numValueOf == null || numValueOf.intValue() != 2) {
                if (numValueOf == null || numValueOf.intValue() != 1) {
                    throw new IllegalArgumentException("unknown resultType:" + numValueOf);
                }
                if (string != null) {
                    return string;
                }
                int i6 = onExtraCallbackWithResult + 115;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    return "";
                }
                throw null;
            }
            int i7 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 37 / 0;
            }
            return text$default;
        }

        private static final void onNavigationEvent(Context context, Class cls, Uri uri, Bundle bundle, int i, long j, Handler handler, String str, JsonWriterWriteObject jsonWriterWriteObject) {
            Object[] objArr = {context, cls, uri, bundle, Integer.valueOf(i), Long.valueOf(j), handler, str, jsonWriterWriteObject};
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            onWarmupCompleted(-2040469054, 2040469054, objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted);
        }

        private static final Unit onExtraCallbackWithResult(JsonWriterWriteObject jsonWriterWriteObject, String str, long j, Long l) {
            Object[] objArr = {jsonWriterWriteObject, str, Long.valueOf(j), l};
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            return (Unit) onWarmupCompleted(-1335029931, 1335029932, objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted);
        }

        private static final void onTransact(Function1 function1, Object obj) {
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            onWarmupCompleted(710263356, -710263354, new Object[]{function1, obj}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted);
        }

        private static final Unit onWarmupCompleted(Throwable th) {
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            return (Unit) onWarmupCompleted(127761470, -127761467, new Object[]{th}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted);
        }
    }

    static {
        int i = onTransact + 23;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 85 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Set set = (Set) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(set, "");
            return Boolean.valueOf(set.isEmpty());
        }
        Intrinsics.checkNotNullParameter(set, "");
        set.isEmpty();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = onExtraCallbackWithResult + 69;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onExtraCallbackWithResult + 25;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
    }

    private static final void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStub + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 29;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onNavigationEvent(AbstractServiceC0065onCallback abstractServiceC0065onCallback, Set set) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        abstractServiceC0065onCallback.stopSelf();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 81;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public File onNavigationEvent(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        File file = new File(getCacheDir(), "/worker");
        int i2 = IAuthTabCallbackStub + 85;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return file;
        }
        throw null;
    }

    private static final Bundle access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Bundle bundle = (Bundle) function1.invoke(obj);
        int i4 = IAuthTabCallbackStub + 33;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return bundle;
        }
        throw null;
    }

    public writeRaw<Bundle> IAuthTabCallback(@NotNull Uri uri, int i, @NotNull writeRaw<String> writeraw) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(writeraw, "");
        Bundle bundle = new Bundle();
        bundle.putInt("__ResultType", i);
        writeRaw<Bundle> writerawOnWarmupCompleted = writeraw.onWarmupCompleted(new WorkerService$.ExternalSyntheticLambda9(new WorkerService$.ExternalSyntheticLambda8(i, this, bundle)));
        Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
        int i3 = IAuthTabCallbackStub + 25;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return writerawOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        AbstractServiceC0065onCallback abstractServiceC0065onCallback = (AbstractServiceC0065onCallback) objArr[1];
        Bundle bundle = (Bundle) objArr[2];
        String str = (String) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        LruCache lruCache = null;
        if (iIntValue == 1) {
            bundle.putString("__ResultData", str);
            int i2 = IAuthTabCallbackStub + 85;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return bundle;
            }
            lruCache.hashCode();
            throw null;
        }
        if (iIntValue != 2) {
            throw new IllegalArgumentException("illegal resultType:" + iIntValue);
        }
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        File fileOnNavigationEvent = abstractServiceC0065onCallback.onNavigationEvent(abstractServiceC0065onCallback);
        if (!fileOnNavigationEvent.exists()) {
            fileOnNavigationEvent.mkdirs();
        }
        File file = new File(fileOnNavigationEvent, string);
        FilesKt.writeText$default(file, str, (Charset) null, 2, (Object) null);
        LruCache lruCache2 = abstractServiceC0065onCallback.onExtraCallback;
        if (lruCache2 == null) {
            int i3 = onExtraCallbackWithResult + 73;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = 66 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        } else {
            lruCache = lruCache2;
        }
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "");
        lruCache.put(path, file);
        bundle.putString("__ResultData", file.getPath());
        return bundle;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AbstractServiceC0065onCallback abstractServiceC0065onCallback = (AbstractServiceC0065onCallback) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        synchronized (abstractServiceC0065onCallback) {
            abstractServiceC0065onCallback.onWarmupCompleted.remove(Integer.valueOf(iIntValue));
            setTid<Set<Integer>> settid = abstractServiceC0065onCallback.onNavigationEvent;
            if (settid != null) {
                settid.onExtraCallback(abstractServiceC0065onCallback.onWarmupCompleted);
            }
        }
        return null;
    }

    private static final deserializeIp onExtraCallback(AbstractServiceC0065onCallback abstractServiceC0065onCallback, Intent intent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Uri data = intent.getData();
        Intrinsics.checkNotNull(data);
        Bundle extras = intent.getExtras();
        if (i3 == 0) {
            return abstractServiceC0065onCallback.IAuthTabCallback(data, extras);
        }
        abstractServiceC0065onCallback.IAuthTabCallback(data, extras);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        writeRaw writeraw = (writeRaw) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(writeraw, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(writeraw);
        int i4 = onExtraCallbackWithResult + 31;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return deserializeip;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final deserializeIp onExtraCallback(AbstractServiceC0065onCallback abstractServiceC0065onCallback, Uri uri, int i, writeRaw writeraw) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 111;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(writeraw, "");
        writeRaw<Bundle> writerawIAuthTabCallback = abstractServiceC0065onCallback.IAuthTabCallback(uri, i, writeraw);
        int i5 = onExtraCallbackWithResult + 73;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return writerawIAuthTabCallback;
    }

    private static final void onWarmupCompleted(AbstractServiceC0065onCallback abstractServiceC0065onCallback, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 117;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {abstractServiceC0065onCallback, Integer.valueOf(i)};
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        if (i4 == 0) {
            onNavigationEvent(objArr, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -605015821, iOnNavigationEvent, iOnNavigationEvent3, iOnNavigationEvent2, 605015824);
            return;
        }
        onNavigationEvent(objArr, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -605015821, iOnNavigationEvent, iOnNavigationEvent3, iOnNavigationEvent2, 605015824);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 101;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallbackWithResult(ResultReceiver resultReceiver, int i, Bundle bundle) {
        int i2 = 2 % 2;
        if (resultReceiver != null) {
            int i3 = onExtraCallbackWithResult + 19;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                resultReceiver.onNavigationEvent(-1, bundle);
            } else {
                resultReceiver.onNavigationEvent(-1, bundle);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        Objects.toString(bundle);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 73;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(ResultReceiver resultReceiver, int i, Throwable th) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 75;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("__ResultError", th);
            Unit unit = Unit.INSTANCE;
            resultReceiver.onNavigationEvent(0, bundle);
        }
        Objects.toString(th);
        Unit unit2 = Unit.INSTANCE;
        int i5 = IAuthTabCallbackStub + 61;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unit2;
    }

    public static /* synthetic */ deserializeIp IAuthTabCallback(AbstractServiceC0065onCallback abstractServiceC0065onCallback, Intent intent) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (deserializeIp) onNavigationEvent(new Object[]{abstractServiceC0065onCallback, intent}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1690966921, iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent2, -1690966921);
    }

    public static /* synthetic */ void IAuthTabCallback(AbstractServiceC0065onCallback abstractServiceC0065onCallback, int i) {
        Object[] objArr = {abstractServiceC0065onCallback, Integer.valueOf(i)};
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        onNavigationEvent(objArr, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1964833629, iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent2, -1964833624);
    }

    private static final boolean IAuthTabCallback(Set set) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return ((Boolean) onNavigationEvent(new Object[]{set}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1750672619, iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent2, 1750672621)).booleanValue();
    }

    private final void onExtraCallbackWithResult(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        onNavigationEvent(objArr, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -605015821, iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent2, 605015824);
    }

    private static final deserializeIp onWarmupCompleted(Function1 function1, writeRaw writeraw) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (deserializeIp) onNavigationEvent(new Object[]{function1, writeraw}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1606338091, iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent2, -1606338090);
    }

    private static final Bundle IAuthTabCallback(int i, AbstractServiceC0065onCallback abstractServiceC0065onCallback, Bundle bundle, String str) {
        Object[] objArr = {Integer.valueOf(i), abstractServiceC0065onCallback, bundle, str};
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (Bundle) onNavigationEvent(objArr, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -835650758, iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent2, 835650762);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
