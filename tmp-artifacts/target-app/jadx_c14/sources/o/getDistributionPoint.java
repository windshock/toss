package o;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzaq;
import im.toss.utils.RxUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.getDistributionPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getDistributionPoint {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallbackDefault = 9412191560674054L;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asInterface;
    private final boolean IAuthTabCallback;
    private final WebView IAuthTabCallbackStub;
    private deserializeUriNullableCollection asBinder;
    private final Context onExtraCallback;
    private final AtomicBoolean onExtraCallbackWithResult;
    private final HashMap<String, String> onNavigationEvent;
    private final getDigest onTransact;
    private final wasLastName onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(getDistributionPoint getdistributionpoint, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(getdistributionpoint, th);
        }
        onExtraCallback(getdistributionpoint, th);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        int i7 = ~i;
        int i8 = ~((~i2) | i7 | i3);
        int i9 = ~i3;
        int i10 = (~(i7 | i2)) | (~(i7 | i9)) | (~(i9 | i2));
        int i11 = (~(i9 | i)) | i2;
        int i12 = i + i2 + i6 + ((-946781377) * i4) + ((-59450693) * i5);
        int i13 = i12 * i12;
        int i14 = (((-143250568) * i) - 346488832) + (357422218 * i2) + (i8 * (-1897147255)) + ((-1897147255) * i10) + (1897147255 * i11) + ((-2040397824) * i6) + ((-1205993472) * i4) + ((-1651113984) * i5) + ((-884408320) * i13);
        int i15 = ((i * 358501064) - 1042343473) + (i2 * 358500518) + (i8 * (-273)) + (i10 * (-273)) + (i11 * 273) + (i6 * 358500791) + (i4 * (-249165559)) + (i5 * 1905372845) + (i13 * 573505536);
        int i16 = i14 + (i15 * i15 * (-553189376));
        if (i16 != 1) {
            return i16 != 2 ? IAuthTabCallback(objArr) : onExtraCallback(objArr);
        }
        getDistributionPoint getdistributionpoint = (getDistributionPoint) objArr[0];
        String str = (String) objArr[1];
        Map map = (Map) objArr[2];
        String str2 = (String) objArr[3];
        int i17 = 2 % 2;
        int i18 = IAuthTabCallback_Parcel + 65;
        asInterface = i18 % 128;
        int i19 = i18 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getdistributionpoint, str, map, str2);
        int i20 = asInterface + 21;
        IAuthTabCallback_Parcel = i20 % 128;
        int i21 = i20 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onExtraCallback(getDistributionPoint getdistributionpoint) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(getdistributionpoint);
        int i4 = asInterface + 115;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(getDistributionPoint getdistributionpoint) {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(getdistributionpoint);
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 101;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getDistributionPoint(@NotNull Context context, @NotNull WebView webView, @Nullable getDigest getdigest, @Nullable wasLastName waslastname) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(webView, "");
        this.onExtraCallback = context;
        this.IAuthTabCallbackStub = webView;
        this.onTransact = getdigest;
        this.onWarmupCompleted = waslastname;
        this.IAuthTabCallback = waslastname instanceof getReverse;
        this.onNavigationEvent = new HashMap<>();
        this.onExtraCallbackWithResult = new AtomicBoolean(true);
    }

    private static final void onNavigationEvent(getDistributionPoint getdistributionpoint) {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        getdistributionpoint.onWarmupCompleted();
        int i4 = IAuthTabCallback_Parcel + 15;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (!(!this.IAuthTabCallback)) {
            onExtraCallbackWithResult();
            int i4 = asInterface + 9;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback = DistributionPoint.onWarmupCompleted(this.onWarmupCompleted).IAuthTabCallback(new deserializeDecimalCollection() { // from class: viva.republica.toss.common.web.TossWebUrlLoader$$ExternalSyntheticLambda3
            public final void run() {
                getDistributionPoint.onExtraCallback(this.f$0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingIAuthTabCallback, "");
        onExtraCallbackWithResult(this, str, jsonReaderUnknownNumberParsingIAuthTabCallback, null, 4, null);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        final getDistributionPoint getdistributionpoint = (getDistributionPoint) objArr[0];
        String str = (String) objArr[1];
        Map<String, String> map = (Map) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (getdistributionpoint.IAuthTabCallback) {
            int i4 = asInterface + 125;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            getdistributionpoint.onExtraCallbackWithResult();
        }
        JsonReaderUnknownNumberParsing<String> jsonReaderUnknownNumberParsingIAuthTabCallback = DistributionPoint.onWarmupCompleted(getdistributionpoint.onWarmupCompleted).IAuthTabCallback(new deserializeDecimalCollection() { // from class: viva.republica.toss.common.web.TossWebUrlLoader$$ExternalSyntheticLambda2
            public final void run() {
                getDistributionPoint.onExtraCallbackWithResult(this.f$0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingIAuthTabCallback, "");
        getdistributionpoint.onExtraCallbackWithResult(str, jsonReaderUnknownNumberParsingIAuthTabCallback, map);
        return null;
    }

    private static final void IAuthTabCallback(getDistributionPoint getdistributionpoint) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getdistributionpoint.onWarmupCompleted();
        int i4 = IAuthTabCallback_Parcel + 101;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void onExtraCallbackWithResult(getDistributionPoint getdistributionpoint, String str, JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel;
        int i4 = i3 + 109;
        asInterface = i4 % 128;
        if (i4 % 2 == 0 ? (i & 4) != 0 : (i & 3) != 0) {
            int i5 = i3 + 1;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            map = null;
        }
        getdistributionpoint.onExtraCallbackWithResult(str, jsonReaderUnknownNumberParsing, map);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallbackDefault ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 49;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 19;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallbackDefault)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - TextUtils.lastIndexOf("", '0', 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 84, TextUtils.lastIndexOf("", '0') + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 14185), 19 - TextUtils.indexOf("", "", 0), 8808 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
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

    private final void onExtraCallbackWithResult(final String str, JsonReaderUnknownNumberParsing<String> jsonReaderUnknownNumberParsing, final Map<String, String> map) {
        int i = 2 % 2;
        zzbr.onWarmupCompleted(this.asBinder);
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsing.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        this.asBinder = setMessageBytes.onNavigationEvent(jsonReaderUnknownNumberParsingOnWarmupCompleted, new Function1() { // from class: viva.republica.toss.common.web.TossWebUrlLoader$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return getDistributionPoint.IAuthTabCallback(this.f$0, (Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: viva.republica.toss.common.web.TossWebUrlLoader$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, str, map, (String) obj};
                return (Unit) getDistributionPoint.onExtraCallback(267776837, -267776836, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), objArr, zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
            }
        }, 2, (Object) null);
        int i2 = IAuthTabCallback_Parcel + 63;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(getDistributionPoint getdistributionpoint, String str, Map map, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 89;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        if (str2.length() > 0) {
            getdistributionpoint.onNavigationEvent.put("Authorization", "tossauth " + str2);
            Uri uri = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            Object[] objArr = new Object[1];
            a(new char[]{50626, 50595, 54559, 34144, 11292, 36298, 35964, 32188, 34238, 17730, 52299, 48617, 17916}, KeyEvent.keyCodeFromString(""), objArr);
            str = filterCreatePageParams.onExtraCallback(uri, ((String) objArr[0]).intern(), str2);
        }
        if (map != null) {
            int i4 = IAuthTabCallback_Parcel + 89;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            if (!map.isEmpty()) {
                int i6 = asInterface + 47;
                IAuthTabCallback_Parcel = i6 % 128;
                if (i6 % 2 == 0) {
                    map.entrySet().iterator();
                    throw null;
                }
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    int i7 = IAuthTabCallback_Parcel + 13;
                    asInterface = i7 % 128;
                    if (i7 % 2 != 0) {
                        Map.Entry entry = (Map.Entry) it.next();
                        getdistributionpoint.onNavigationEvent.put(entry.getKey(), entry.getValue());
                        throw null;
                    }
                    Map.Entry entry2 = (Map.Entry) it.next();
                    getdistributionpoint.onNavigationEvent.put(entry2.getKey(), entry2.getValue());
                }
            }
        }
        getdistributionpoint.IAuthTabCallbackStub.loadUrl(str, getdistributionpoint.onNavigationEvent);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(getDistributionPoint getdistributionpoint, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        onExtraCallback(1972528413, -1972528411, iOnNavigationEvent, zzaq.onNavigationEvent(), new Object[]{getdistributionpoint}, zzaq.onNavigationEvent(), iOnNavigationEvent2);
        getParamImp.onWarmupCompleted(th, getdistributionpoint.onExtraCallback, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 119;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onExtraCallbackWithResult() {
        AtomicBoolean atomicBoolean;
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 17;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            atomicBoolean = this.onExtraCallbackWithResult;
            z = true;
        } else {
            atomicBoolean = this.onExtraCallbackWithResult;
            z = false;
        }
        atomicBoolean.set(z);
        int i3 = asInterface + 61;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.set(true);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getDistributionPoint getdistributionpoint = (getDistributionPoint) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 15;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        getDigest getdigest = getdistributionpoint.onTransact;
        if (getdigest != null) {
            int i5 = i2 + 91;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            getdigest.onNavigationEvent();
        }
        int i7 = IAuthTabCallback_Parcel + 123;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getDistributionPoint getdistributionpoint, String str, Map map, String str2) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (Unit) onExtraCallback(267776837, -267776836, iOnNavigationEvent, zzaq.onNavigationEvent(), new Object[]{getdistributionpoint, str, map, str2}, zzaq.onNavigationEvent(), iOnNavigationEvent2);
    }

    private final void IAuthTabCallback() throws Throwable {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        onExtraCallback(1972528413, -1972528411, iOnNavigationEvent, zzaq.onNavigationEvent(), new Object[]{this}, zzaq.onNavigationEvent(), iOnNavigationEvent2);
    }

    public final void onNavigationEvent(@NotNull String str, @Nullable Map<String, String> map) throws Throwable {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        onExtraCallback(1617904461, -1617904461, iOnNavigationEvent, zzaq.onNavigationEvent(), new Object[]{this, str, map}, zzaq.onNavigationEvent(), iOnNavigationEvent2);
    }
}
