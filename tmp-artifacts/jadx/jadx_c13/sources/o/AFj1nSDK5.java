package o;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.text.AndroidCharacter;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import im.toss.core.tracker.Referrer;
import im.toss.core.tracker.TossReferrerTemplate;
import im.toss.core.tracker.entry.CustomizableLog;
import im.toss.core.tracker.entry.TrackEvent;
import im.toss.core.tracker.entry.TrackLog;
import im.toss.core.tracker.entry.TrackState;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.AFj1nSDK5;
import o.handleRemoveKey;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1nSDK5 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static downloadZip IAuthTabCallback = null;
    private static final Regex IAuthTabCallbackDefault;
    private static char IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000;
    private static int access100;
    private static final Referrer asBinder;
    private static char asInterface;
    private static char getInterfaceDescriptor;
    private static downloadZip onExtraCallback;
    private static final AppSetIdAndScope1 onExtraCallbackWithResult;
    public static final AFj1nSDK5 onNavigationEvent;
    private static char onTransact;
    private static String onWarmupCompleted;

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Uri uri = (Uri) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(uri);
        int i4 = IAuthTabCallbackStubProxy + 35;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zOnWarmupCompleted);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = access100 + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(str);
        }
        IAuthTabCallback(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Uri onExtraCallbackWithResult(Uri uri, String str) {
        int i = 2 % 2;
        int i2 = access100 + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Uri uriOnExtraCallback = onExtraCallback(uri, str);
        int i4 = IAuthTabCallbackStubProxy + 111;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return uriOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~(i2 | i);
        int i11 = i9 | i10;
        int i12 = ~i2;
        int i13 = i9 | (~(i12 | i4)) | i10;
        int i14 = (~(i | i2 | i4)) | (~(i7 | i12 | i8));
        int i15 = i2 + i4 + i6 + (1322235619 * i3) + (440487356 * i5);
        int i16 = i15 * i15;
        int i17 = (((-1102165783) * i2) - 2100690944) + ((-281430247) * i4) + ((-820735536) * i11) + (i13 * 410367768) + (410367768 * i14) + ((-691798016) * i6) + ((-942931968) * i3) + ((-1410334720) * i5) + (1251606528 * i16);
        int i18 = (i2 * 157034417) + 1376579869 + (i4 * 157036385) + (i11 * (-1968)) + (i13 * 984) + (i14 * 984) + (i6 * 157035401) + (i3 * (-982187909)) + (i5 * (-1869533796)) + (i16 * (-899022848));
        switch (i17 + (i18 * i18 * (-511311872))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i19 = 2 % 2;
                int i20 = IAuthTabCallbackStubProxy + 35;
                access100 = i20 % 128;
                int i21 = i20 % 2;
                asBinder.onExtraCallback(zBooleanValue);
                onWarmupCompleted = null;
                onExtraCallback = null;
                IAuthTabCallback = null;
                int i22 = access100 + 61;
                IAuthTabCallbackStubProxy = i22 % 128;
                int i23 = i22 % 2;
                return null;
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(Uri uri) {
        int i = 2 % 2;
        int i2 = access100 + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsInterface = asInterface(uri);
        int i4 = access100 + 9;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return zAsInterface;
    }

    public static /* synthetic */ String onNavigationEvent(Uri uri) {
        int i = 2 % 2;
        int i2 = access100 + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(uri);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strIAuthTabCallback = IAuthTabCallback(uri);
        int i3 = IAuthTabCallbackStubProxy + 79;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return strIAuthTabCallback;
    }

    public static /* synthetic */ String onNavigationEvent(MatchResult matchResult) {
        int i = 2 % 2;
        int i2 = access100 + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(matchResult);
            throw null;
        }
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(matchResult);
        int i3 = access100 + 43;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return strOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Uri uri = (Uri) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + Imgproc.COLOR_YUV2RGB_YVYU;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Uri uriOnWarmupCompleted = onWarmupCompleted(uri, str);
        int i4 = access100 + 1;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return uriOnWarmupCompleted;
    }

    public static /* synthetic */ String onWarmupCompleted(String str, Uri uri) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 105;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(str, uri);
        int i4 = IAuthTabCallbackStubProxy + 119;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    public static /* synthetic */ boolean onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) onExtraCallbackWithResult(iOnExtraCallbackWithResult, -1669672394, handleRemoveKey.onExtraCallbackWithResult(), 1669672395, handleRemoveKey.onExtraCallbackWithResult(), new Object[]{str}, iOnExtraCallbackWithResult2)).booleanValue();
        int i4 = IAuthTabCallbackStubProxy + 113;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AFj1nSDK5() {
    }

    static {
        onExtraCallbackWithResult();
        onNavigationEvent = new AFj1nSDK5();
        onExtraCallbackWithResult = ea10.onExtraCallbackWithResult("TossReferrerHandler");
        IAuthTabCallbackDefault = new Regex("\\{(\\w+)\\}");
        asBinder = new Referrer((String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
        int i = access000 + 9;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public final boolean onExtraCallbackWithResult(@NotNull downloadZip downloadzip) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(downloadzip, "");
        if ((downloadzip instanceof TrackLog) || (downloadzip instanceof TrackEvent)) {
            return true;
        }
        int i2 = access100 + 103;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        if (downloadzip instanceof TrackState) {
            return true;
        }
        int i5 = i3 + 5;
        access100 = i5 % 128;
        boolean z = downloadzip instanceof CustomizableLog;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
            if (z) {
                return true;
            }
        } else if (z) {
            return true;
        }
        return false;
    }

    public final Referrer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            asBinder.onExtraCallbackWithResult();
            throw null;
        }
        Referrer referrer = asBinder;
        if (!referrer.onExtraCallbackWithResult()) {
            return null;
        }
        int i3 = access100 + 97;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return referrer;
    }

    public final Referrer onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100 + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Referrer referrerOnNavigationEvent = onNavigationEvent();
        if (referrerOnNavigationEvent == null) {
            return null;
        }
        int i4 = access100 + 119;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return Referrer.onNavigationEvent(referrerOnNavigationEvent, (String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, 127, (Object) null);
    }

    public final Referrer onWarmupCompleted(@NotNull downloadZip downloadzip) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(downloadzip, "");
        Referrer referrerOnExtraCallback = onExtraCallback();
        if (referrerOnExtraCallback == null) {
            referrerOnExtraCallback = new Referrer((String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
        }
        onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(downloadzip);
        if (onnavigationeventIAuthTabCallback != null) {
            int i2 = access100 + 39;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            referrerOnExtraCallback.onExtraCallback(onnavigationeventIAuthTabCallback.onNavigationEvent(), onnavigationeventIAuthTabCallback.onExtraCallbackWithResult());
        }
        onNavigationEvent(downloadzip, referrerOnExtraCallback);
        Object obj = null;
        if (!referrerOnExtraCallback.onExtraCallbackWithResult()) {
            return null;
        }
        int i4 = IAuthTabCallbackStubProxy;
        int i5 = i4 + 37;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 103;
        access100 = i6 % 128;
        if (i6 % 2 == 0) {
            return referrerOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String stringExtra;
        Intent intent = (Intent) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            Unit unit = null;
            if (intent != null && (stringExtra = intent.getStringExtra("toss_referrer")) != null) {
                int i4 = IAuthTabCallbackStubProxy + 111;
                access100 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 79 / 0;
                    if (stringExtra.length() > 0) {
                        int i6 = access100 + 97;
                        IAuthTabCallbackStubProxy = i6 % 128;
                        int i7 = i6 % 2;
                    }
                    stringExtra = null;
                } else if (stringExtra.length() > 0) {
                    int i62 = access100 + 97;
                    IAuthTabCallbackStubProxy = i62 % 128;
                    int i72 = i62 % 2;
                } else {
                    stringExtra = null;
                }
                if (stringExtra != null) {
                    onNavigationEvent.onNavigationEvent(new onNavigationEvent(stringExtra, null), intent);
                    unit = Unit.INSTANCE;
                }
            }
            return Result.m31constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.m31constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final Object onExtraCallback(@NotNull downloadZip downloadzip) {
        Unit unit;
        int i = 2 % 2;
        int i2 = access100 + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(downloadzip, "");
        try {
            Result.Companion companion = Result.Companion;
            AFj1nSDK5 aFj1nSDK5 = onNavigationEvent;
            onNavigationEvent onnavigationeventIAuthTabCallback = aFj1nSDK5.IAuthTabCallback(downloadzip);
            if (onnavigationeventIAuthTabCallback != null) {
                int i4 = access100 + 61;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                aFj1nSDK5.onNavigationEvent(onnavigationeventIAuthTabCallback, downloadzip);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            return Result.m31constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
            int i6 = IAuthTabCallbackStubProxy + 7;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            return objM31constructorimpl;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:3:0x0020, B:8:0x0032, B:10:0x003c, B:12:0x0045, B:17:0x004f, B:19:0x005d, B:27:0x00b8, B:32:0x00cc, B:38:0x010f, B:41:0x011a, B:44:0x0121, B:46:0x012f, B:48:0x014c, B:53:0x0159, B:55:0x015f, B:80:0x022f, B:56:0x0172, B:35:0x00ee, B:57:0x018d, B:59:0x0195, B:62:0x01bd, B:63:0x01d7, B:66:0x01e8, B:70:0x01f9, B:73:0x0202, B:76:0x020b, B:79:0x021b, B:21:0x0068, B:23:0x00a1, B:81:0x024e), top: B:86:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012f A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:3:0x0020, B:8:0x0032, B:10:0x003c, B:12:0x0045, B:17:0x004f, B:19:0x005d, B:27:0x00b8, B:32:0x00cc, B:38:0x010f, B:41:0x011a, B:44:0x0121, B:46:0x012f, B:48:0x014c, B:53:0x0159, B:55:0x015f, B:80:0x022f, B:56:0x0172, B:35:0x00ee, B:57:0x018d, B:59:0x0195, B:62:0x01bd, B:63:0x01d7, B:66:0x01e8, B:70:0x01f9, B:73:0x0202, B:76:0x020b, B:79:0x021b, B:21:0x0068, B:23:0x00a1, B:81:0x024e), top: B:86:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015f A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:3:0x0020, B:8:0x0032, B:10:0x003c, B:12:0x0045, B:17:0x004f, B:19:0x005d, B:27:0x00b8, B:32:0x00cc, B:38:0x010f, B:41:0x011a, B:44:0x0121, B:46:0x012f, B:48:0x014c, B:53:0x0159, B:55:0x015f, B:80:0x022f, B:56:0x0172, B:35:0x00ee, B:57:0x018d, B:59:0x0195, B:62:0x01bd, B:63:0x01d7, B:66:0x01e8, B:70:0x01f9, B:73:0x0202, B:76:0x020b, B:79:0x021b, B:21:0x0068, B:23:0x00a1, B:81:0x024e), top: B:86:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0172 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:3:0x0020, B:8:0x0032, B:10:0x003c, B:12:0x0045, B:17:0x004f, B:19:0x005d, B:27:0x00b8, B:32:0x00cc, B:38:0x010f, B:41:0x011a, B:44:0x0121, B:46:0x012f, B:48:0x014c, B:53:0x0159, B:55:0x015f, B:80:0x022f, B:56:0x0172, B:35:0x00ee, B:57:0x018d, B:59:0x0195, B:62:0x01bd, B:63:0x01d7, B:66:0x01e8, B:70:0x01f9, B:73:0x0202, B:76:0x020b, B:79:0x021b, B:21:0x0068, B:23:0x00a1, B:81:0x024e), top: B:86:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(@Nullable String str, boolean z, boolean z2) throws Throwable {
        String str2;
        String str3;
        String queryParameter;
        String host;
        String path;
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{27407, 60659, 50913, 46709, 18114, 32240, 44856, 40542, 1450, 38435}, (ViewConfiguration.getScrollBarSize() >> 8) + 10, objArr);
        String strIntern = ((String) objArr[0]).intern();
        try {
            Result.Companion companion = Result.Companion;
            String str4 = _UrlKt.FRAGMENT_ENCODE_SET;
            if (str == null) {
                int i2 = IAuthTabCallbackStubProxy + 7;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                str2 = _UrlKt.FRAGMENT_ENCODE_SET;
            } else {
                str2 = str;
            }
            final Uri uri = Uri.parse(str2);
            String host2 = uri.getHost();
            if (host2 != null) {
                String queryParameter2 = uri.getQueryParameter("toss_referrer");
                if (queryParameter2 != null) {
                    if (queryParameter2.length() <= 0) {
                        queryParameter2 = null;
                    }
                    if (queryParameter2 != null) {
                        onNavigationEvent.onNavigationEvent(new onNavigationEvent(queryParameter2, null), str);
                    }
                } else if (!z2) {
                    AFj1nSDK5 aFj1nSDK5 = onNavigationEvent;
                    Intrinsics.checkNotNull(uri);
                    if (aFj1nSDK5.IAuthTabCallbackStub(uri)) {
                        Set<String> queryParameterNames = uri.getQueryParameterNames();
                        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "");
                        String str5 = (String) ensureCausesIsMutable.onMessageChannelReady(ensureCausesIsMutable.access100(ensureCausesIsMutable.extraCallbackWithResult(ensureCausesIsMutable.access100(ensureCausesIsMutable.extraCallback(CollectionsKt___CollectionsKt.asSequence(queryParameterNames), new Function1() { // from class: im.toss.tracking.TossReferrerHandler$$ExternalSyntheticLambda0
                            private static int onExtraCallback = 1;
                            private static int onWarmupCompleted;

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i4 = 2 % 2;
                                int i5 = onWarmupCompleted + 85;
                                onExtraCallback = i5 % 128;
                                int i6 = i5 % 2;
                                Uri uri2 = uri;
                                String str6 = (String) obj;
                                if (i6 != 0) {
                                    return AFj1nSDK5.onExtraCallbackWithResult(uri2, str6);
                                }
                                AFj1nSDK5.onExtraCallbackWithResult(uri2, str6);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                        }), new Function1() { // from class: im.toss.tracking.TossReferrerHandler$$ExternalSyntheticLambda1
                            private static int onExtraCallbackWithResult = 1;
                            private static int onWarmupCompleted;

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i4 = 2 % 2;
                                int i5 = onWarmupCompleted + 3;
                                onExtraCallbackWithResult = i5 % 128;
                                int i6 = i5 % 2;
                                Object[] objArr2 = {(Uri) obj};
                                int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
                                int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
                                int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
                                int iOnExtraCallbackWithResult4 = handleRemoveKey.onExtraCallbackWithResult();
                                if (i6 != 0) {
                                    return Boolean.valueOf(((Boolean) AFj1nSDK5.onExtraCallbackWithResult(iOnExtraCallbackWithResult, 1973701619, iOnExtraCallbackWithResult3, -1973701614, iOnExtraCallbackWithResult4, objArr2, iOnExtraCallbackWithResult2)).booleanValue());
                                }
                                Boolean boolValueOf = Boolean.valueOf(((Boolean) AFj1nSDK5.onExtraCallbackWithResult(iOnExtraCallbackWithResult, 1973701619, iOnExtraCallbackWithResult3, -1973701614, iOnExtraCallbackWithResult4, objArr2, iOnExtraCallbackWithResult2)).booleanValue());
                                int i7 = 56 / 0;
                                return boolValueOf;
                            }
                        }), new Function1() { // from class: im.toss.tracking.TossReferrerHandler$$ExternalSyntheticLambda2
                            private static int onExtraCallback = 1;
                            private static int onWarmupCompleted;

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i4 = 2 % 2;
                                int i5 = onExtraCallback + 77;
                                onWarmupCompleted = i5 % 128;
                                Uri uri2 = (Uri) obj;
                                if (i5 % 2 == 0) {
                                    return AFj1nSDK5.onNavigationEvent(uri2);
                                }
                                AFj1nSDK5.onNavigationEvent(uri2);
                                throw null;
                            }
                        }), new Function1() { // from class: im.toss.tracking.TossReferrerHandler$$ExternalSyntheticLambda3
                            private static int onExtraCallback = 0;
                            private static int onNavigationEvent = 1;

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i4 = 2 % 2;
                                int i5 = onNavigationEvent + 71;
                                onExtraCallback = i5 % 128;
                                int i6 = i5 % 2;
                                Boolean boolValueOf = Boolean.valueOf(AFj1nSDK5.onWarmupCompleted((String) obj));
                                int i7 = onNavigationEvent + 25;
                                onExtraCallback = i7 % 128;
                                int i8 = i7 % 2;
                                return boolValueOf;
                            }
                        }));
                        if (str5 != null) {
                            onNavigationEvent.onNavigationEvent(new onNavigationEvent(str5, null), str);
                        } else if (z) {
                            int i4 = access100 + 81;
                            IAuthTabCallbackStubProxy = i4 % 128;
                            int i5 = i4 % 2;
                            if (Intrinsics.areEqual(host2, "lab")) {
                                int i6 = IAuthTabCallbackStubProxy + 21;
                                access100 = i6 % 128;
                                if (i6 % 2 != 0) {
                                    Object[] objArr2 = new Object[1];
                                    a(new char[]{35652, 23306, 46447, 12768}, 'I' / AndroidCharacter.getMirror('d'), objArr2);
                                    queryParameter = uri.getQueryParameter(((String) objArr2[0]).intern());
                                    if (queryParameter == null) {
                                        queryParameter = _UrlKt.FRAGMENT_ENCODE_SET;
                                    }
                                    Uri uri2 = Uri.parse(queryParameter);
                                    host = uri2.getHost();
                                    if (host == null) {
                                        host = _UrlKt.FRAGMENT_ENCODE_SET;
                                    }
                                    path = uri2.getPath();
                                    if (path == null) {
                                        path = _UrlKt.FRAGMENT_ENCODE_SET;
                                    }
                                    String strRemovePrefix = StringsKt__StringsKt.removePrefix(path, (CharSequence) "/");
                                    if (StringsKt__StringsKt.contains$default((CharSequence) host, (CharSequence) "tossbank", false, 2, (Object) null)) {
                                        Object[] objArr3 = new Object[1];
                                        a(new char[]{27407, 60659, 50913, 46709, 18114, 32240, 44856, 40542, 1450, 38435}, 10 - Color.blue(0), objArr3);
                                        if (!StringsKt__StringsKt.contains$default((CharSequence) host, (CharSequence) ((String) objArr3[0]).intern(), false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) host, (CharSequence) "tossinvest", false, 2, (Object) null)) {
                                            strIntern = _UrlKt.FRAGMENT_ENCODE_SET;
                                        }
                                    } else {
                                        strIntern = "bank";
                                    }
                                    if (strIntern.length() != 0) {
                                        str3 = "external_lab__" + strRemovePrefix;
                                    } else {
                                        str3 = "external_lab_" + strIntern + "__" + strRemovePrefix;
                                    }
                                } else {
                                    Object[] objArr4 = new Object[1];
                                    a(new char[]{35652, 23306, 46447, 12768}, '3' - AndroidCharacter.getMirror('0'), objArr4);
                                    queryParameter = uri.getQueryParameter(((String) objArr4[0]).intern());
                                    if (queryParameter == null) {
                                        queryParameter = _UrlKt.FRAGMENT_ENCODE_SET;
                                    }
                                    Uri uri22 = Uri.parse(queryParameter);
                                    host = uri22.getHost();
                                    if (host == null) {
                                    }
                                    path = uri22.getPath();
                                    if (path == null) {
                                    }
                                    String strRemovePrefix2 = StringsKt__StringsKt.removePrefix(path, (CharSequence) "/");
                                    if (StringsKt__StringsKt.contains$default((CharSequence) host, (CharSequence) "tossbank", false, 2, (Object) null)) {
                                    }
                                    if (strIntern.length() != 0) {
                                    }
                                }
                            } else if (Intrinsics.areEqual(host2, "web")) {
                                Object[] objArr5 = new Object[1];
                                a(new char[]{35652, 23306, 46447, 12768}, Color.blue(0) + 3, objArr5);
                                String queryParameter3 = uri.getQueryParameter(((String) objArr5[0]).intern());
                                if (queryParameter3 != null) {
                                    int i7 = IAuthTabCallbackStubProxy + 39;
                                    access100 = i7 % 128;
                                    int i8 = i7 % 2;
                                    str4 = queryParameter3;
                                }
                                str3 = "external_web__" + Uri.parse(str4).getHost();
                            } else {
                                if (Intrinsics.areEqual(host2, "mydata")) {
                                    int i9 = access100 + 115;
                                    IAuthTabCallbackStubProxy = i9 % 128;
                                    int i10 = i9 % 2;
                                    String path2 = uri.getPath();
                                    if (path2 != null) {
                                        int i11 = IAuthTabCallbackStubProxy + 39;
                                        access100 = i11 % 128;
                                        if (i11 % 2 != 0) {
                                            if (!StringsKt__StringsJVMKt.startsWith$default(path2, "/private-cert/consent-signed/", true, 4, null)) {
                                            }
                                        } else if (StringsKt__StringsJVMKt.startsWith$default(path2, "/private-cert/consent-signed/", false, 2, null)) {
                                        }
                                    }
                                }
                                String path3 = uri.getPath();
                                if (path3 != null) {
                                    int i12 = IAuthTabCallbackStubProxy + Imgproc.COLOR_YUV2RGBA_YVYU;
                                    access100 = i12 % 128;
                                    int i13 = i12 % 2;
                                    str4 = path3;
                                }
                                str3 = "external__" + host2 + str4;
                            }
                            onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), 2017067382, handleRemoveKey.onExtraCallbackWithResult(), -2017067376, handleRemoveKey.onExtraCallbackWithResult(), new Object[]{onNavigationEvent, str3}, handleRemoveKey.onExtraCallbackWithResult());
                        }
                    }
                }
            }
            return Result.m31constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
            int i14 = IAuthTabCallbackStubProxy + 93;
            access100 = i14 % 128;
            int i15 = i14 % 2;
            return objM31constructorimpl;
        }
    }

    private static final Uri onExtraCallback(Uri uri, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter == null) {
            queryParameter = _UrlKt.FRAGMENT_ENCODE_SET;
            int i4 = access100 + 53;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        return Uri.parse(queryParameter);
    }

    private static final boolean onWarmupCompleted(Uri uri) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsHierarchical = uri.isHierarchical();
        int i4 = IAuthTabCallbackStubProxy + 7;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return zIsHierarchical;
    }

    private static final String IAuthTabCallback(Uri uri) {
        int i = 2 % 2;
        int i2 = access100 + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String queryParameter = uri.getQueryParameter("toss_referrer");
        int i4 = access100 + 15;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return queryParameter;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            str.length();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() <= 0) {
            return false;
        }
        int i3 = IAuthTabCallbackStubProxy + 123;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $11 + 7;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (onTransact ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getInterfaceDescriptor);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cGreen = (char) Color.green(i3);
                        int iBlue = 10 - Color.blue(i3);
                        int i10 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12433;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cGreen, iBlue, i10, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (asInterface ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallbackStub)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), 10 - (ViewConfiguration.getPressedStateDuration() >> 16), 12434 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 16014), Color.green(0) + 14, 19901 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i11 = $11 + 35;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final Uri onWarmupCompleted(Uri uri, String str) {
        int i = 2 % 2;
        int i2 = access100 + 47;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter == null) {
            queryParameter = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        Uri uri2 = Uri.parse(queryParameter);
        int i4 = IAuthTabCallbackStubProxy + 5;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return uri2;
    }

    private static final boolean asInterface(Uri uri) {
        int i = 2 % 2;
        int i2 = access100 + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return uri.isHierarchical();
        }
        uri.isHierarchical();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final String onNavigationEvent(String str, Uri uri) {
        int i = 2 % 2;
        int i2 = access100 + 11;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String queryParameter = uri.getQueryParameter(str);
        int i4 = access100 + 67;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return queryParameter;
    }

    private static final boolean IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = access100 + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() <= 0) {
            return false;
        }
        int i4 = access100 + 47;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return true;
    }

    private final boolean IAuthTabCallbackStub(final Uri uri) {
        String queryParameter;
        final String str = "tag";
        int i = 2 % 2;
        if (uri.getQueryParameter("tag") == null) {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Intrinsics.checkNotNullExpressionValue(queryParameterNames, "");
            queryParameter = (String) ensureCausesIsMutable.onMessageChannelReady(ensureCausesIsMutable.access100(ensureCausesIsMutable.extraCallbackWithResult(ensureCausesIsMutable.access100(ensureCausesIsMutable.extraCallback(CollectionsKt___CollectionsKt.asSequence(queryParameterNames), new Function1() { // from class: im.toss.tracking.TossReferrerHandler$$ExternalSyntheticLambda4
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 31;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    Object[] objArr = {uri, (String) obj};
                    Uri uri2 = (Uri) AFj1nSDK5.onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), -1629162839, handleRemoveKey.onExtraCallbackWithResult(), 1629162839, handleRemoveKey.onExtraCallbackWithResult(), objArr, handleRemoveKey.onExtraCallbackWithResult());
                    int i5 = onExtraCallback + 63;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        return uri2;
                    }
                    throw null;
                }
            }), new Function1() { // from class: im.toss.tracking.TossReferrerHandler$$ExternalSyntheticLambda5
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 53;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    Boolean boolValueOf = Boolean.valueOf(AFj1nSDK5.onExtraCallbackWithResult((Uri) obj));
                    if (i4 != 0) {
                        int i5 = 62 / 0;
                    }
                    return boolValueOf;
                }
            }), new Function1() { // from class: im.toss.tracking.TossReferrerHandler$$ExternalSyntheticLambda6
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 5;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 != 0) {
                        AFj1nSDK5.onWarmupCompleted(str, (Uri) obj);
                        throw null;
                    }
                    String strOnWarmupCompleted = AFj1nSDK5.onWarmupCompleted(str, (Uri) obj);
                    int i4 = onNavigationEvent + 81;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        return strOnWarmupCompleted;
                    }
                    throw null;
                }
            }), new Function1() { // from class: im.toss.tracking.TossReferrerHandler$$ExternalSyntheticLambda7
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 1;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    boolean zOnExtraCallback = AFj1nSDK5.onExtraCallback((String) obj);
                    if (i4 != 0) {
                        return Boolean.valueOf(zOnExtraCallback);
                    }
                    Boolean.valueOf(zOnExtraCallback);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }));
            int i2 = IAuthTabCallbackStubProxy + 31;
            access100 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = access100 + 23;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            queryParameter = uri.getQueryParameter("tag");
            if (queryParameter == null || queryParameter.length() <= 0) {
                queryParameter = null;
            }
        }
        return Intrinsics.areEqual(queryParameter, "inbox");
    }

    public final Object onNavigationEvent(@NotNull downloadZip downloadzip) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + Imgproc.COLOR_YUV2RGBA_YVYU;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(downloadzip, "");
        try {
            Result.Companion companion = Result.Companion;
            GetFeatureExtension getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
            String strOnExtraCallbackWithResult = getFeatureExtension.onExtraCallbackWithResult(downloadzip);
            boolean zBooleanValue = ((Boolean) GetFeatureExtension.onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), 1045380358, new Object[]{getFeatureExtension, downloadzip}, -1045380351, OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
            boolean zBooleanValue2 = ((Boolean) GetFeatureExtension.onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), 1319548726, new Object[]{getFeatureExtension, downloadzip}, -1319548724, OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
            AFj1nSDK5 aFj1nSDK5 = onNavigationEvent;
            if (((Boolean) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), -859839560, handleRemoveKey.onExtraCallbackWithResult(), 859839562, handleRemoveKey.onExtraCallbackWithResult(), new Object[]{aFj1nSDK5, strOnExtraCallbackWithResult, Boolean.valueOf(zBooleanValue)}, handleRemoveKey.onExtraCallbackWithResult())).booleanValue()) {
                Referrer referrer = asBinder;
                aFj1nSDK5.onNavigationEvent(referrer);
                Objects.toString(onExtraCallback);
                Objects.toString(IAuthTabCallback);
                Objects.toString(downloadzip);
                Objects.toString(referrer);
                onExtraCallback = null;
                IAuthTabCallback = null;
            }
            if (strOnExtraCallbackWithResult != null) {
                onWarmupCompleted = strOnExtraCallbackWithResult;
                if (zBooleanValue2) {
                    int i4 = access100 + 93;
                    IAuthTabCallbackStubProxy = i4 % 128;
                    if (i4 % 2 == 0) {
                        IAuthTabCallback = downloadzip;
                        int i5 = 13 / 0;
                    } else {
                        IAuthTabCallback = downloadzip;
                    }
                }
                if (zBooleanValue) {
                    onExtraCallback = downloadzip;
                }
            }
            Object objM31constructorimpl = Result.m31constructorimpl(Unit.INSTANCE);
            int i6 = IAuthTabCallbackStubProxy + 55;
            access100 = i6 % 128;
            if (i6 % 2 == 0) {
                return objM31constructorimpl;
            }
            throw null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.m31constructorimpl(ResultKt.createFailure(th));
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            asBinder.IAuthTabCallback(str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        asBinder.IAuthTabCallback(str);
        int i3 = IAuthTabCallbackStubProxy + 7;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(downloadZip downloadzip, Referrer referrer) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 21;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            GetFeatureExtension getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
            Object[] objArr = {this, getFeatureExtension.onExtraCallbackWithResult(downloadzip), Boolean.valueOf(((Boolean) GetFeatureExtension.onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), 1045380358, new Object[]{getFeatureExtension, downloadzip}, -1045380351, OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue())};
            int i3 = 33 / 0;
            if (((Boolean) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), -859839560, handleRemoveKey.onExtraCallbackWithResult(), 859839562, handleRemoveKey.onExtraCallbackWithResult(), objArr, handleRemoveKey.onExtraCallbackWithResult())).booleanValue()) {
                onNavigationEvent(referrer);
            }
        } else {
            GetFeatureExtension getFeatureExtension2 = GetFeatureExtension.onWarmupCompleted;
            Object[] objArr2 = {this, getFeatureExtension2.onExtraCallbackWithResult(downloadzip), Boolean.valueOf(((Boolean) GetFeatureExtension.onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), 1045380358, new Object[]{getFeatureExtension2, downloadzip}, -1045380351, OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue())};
            if (!(!((Boolean) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), -859839560, handleRemoveKey.onExtraCallbackWithResult(), 859839562, handleRemoveKey.onExtraCallbackWithResult(), objArr2, handleRemoveKey.onExtraCallbackWithResult())).booleanValue())) {
            }
        }
        int i4 = access100 + 91;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if (r7 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r7 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str;
        String str2 = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 5;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        if (zBooleanValue && (str = onWarmupCompleted) != null && str2 != null) {
            int i5 = i2 + 25;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            boolean zAreEqual = Intrinsics.areEqual(str, str2);
            if (i6 != 0) {
                int i7 = 31 / 0;
            }
        }
        return false;
    }

    private final void onNavigationEvent(Referrer referrer) {
        int i = 2 % 2;
        int i2 = access100 + 23;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String str = onWarmupCompleted;
        if (i3 != 0) {
            referrer.onNavigationEvent(str, onExtraCallback, IAuthTabCallback);
        } else {
            referrer.onNavigationEvent(str, onExtraCallback, IAuthTabCallback);
            throw null;
        }
    }

    private final void onNavigationEvent(onNavigationEvent onnavigationevent, Object obj) {
        int i = 2 % 2;
        Referrer referrer = asBinder;
        referrer.onExtraCallback(onnavigationevent.onNavigationEvent(), onnavigationevent.onExtraCallbackWithResult());
        onWarmupCompleted = null;
        onExtraCallback = null;
        IAuthTabCallback = null;
        Objects.toString(obj);
        Objects.toString(referrer);
        int i2 = IAuthTabCallbackStubProxy + 13;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final String onExtraCallbackWithResult(MatchResult matchResult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(matchResult, "");
        } else {
            Intrinsics.checkNotNullParameter(matchResult, "");
        }
        String str = (String) CollectionsKt___CollectionsKt.getOrNull(matchResult.getGroupValues(), 1);
        int i3 = IAuthTabCallbackStubProxy + 47;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    private final onNavigationEvent IAuthTabCallback(downloadZip downloadzip) {
        String strIAuthTabCallback_Parcel;
        String string;
        int i = 2 % 2;
        if (downloadzip instanceof TrackLog) {
            int i2 = access100 + 107;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                String.valueOf(((TrackLog) downloadzip).getInterfaceDescriptor());
                throw null;
            }
            strIAuthTabCallback_Parcel = String.valueOf(((TrackLog) downloadzip).getInterfaceDescriptor());
        } else if (downloadzip instanceof TrackEvent) {
            strIAuthTabCallback_Parcel = ((TrackEvent) downloadzip).getInterfaceDescriptor();
        } else if (downloadzip instanceof TrackState) {
            strIAuthTabCallback_Parcel = ((TrackState) downloadzip).getInterfaceDescriptor();
        } else {
            if (!(downloadzip instanceof CustomizableLog)) {
                return null;
            }
            int i3 = IAuthTabCallbackStubProxy + 51;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            strIAuthTabCallback_Parcel = ((CustomizableLog) downloadzip).IAuthTabCallback_Parcel();
        }
        TossReferrerTemplate tossReferrerTemplate = (TossReferrerTemplate) GetFeatureExtension.onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), -932621748, new Object[]{GetFeatureExtension.onWarmupCompleted, strIAuthTabCallback_Parcel}, 932621754, OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0.onWarmupCompleted());
        if (tossReferrerTemplate == null) {
            return null;
        }
        if (!tossReferrerTemplate.IAuthTabCallback().isEmpty() && !CollectionsKt___CollectionsKt.contains(tossReferrerTemplate.IAuthTabCallback(), K_.onWarmupCompleted.onWarmupCompleted())) {
            int i5 = IAuthTabCallbackStubProxy + 125;
            access100 = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            str.hashCode();
            throw null;
        }
        Map mapOnNavigationEvent = downloadzip.onNavigationEvent();
        String strOnExtraCallbackWithResult = tossReferrerTemplate.onExtraCallbackWithResult();
        Iterator itIAuthTabCallback = ensureCausesIsMutable.extraCallbackWithResult(Regex.onExtraCallbackWithResult(IAuthTabCallbackDefault, strOnExtraCallbackWithResult, 0, 2, null), new Function1() { // from class: im.toss.tracking.TossReferrerHandler$$ExternalSyntheticLambda8
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 77;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                String strOnNavigationEvent = AFj1nSDK5.onNavigationEvent((MatchResult) obj);
                if (i8 != 0) {
                    int i9 = 4 / 0;
                }
                return strOnNavigationEvent;
            }
        }).IAuthTabCallback();
        String strReplace$default = strOnExtraCallbackWithResult;
        while (itIAuthTabCallback.hasNext()) {
            int i6 = IAuthTabCallbackStubProxy + 25;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            String str = (String) itIAuthTabCallback.next();
            Object obj = mapOnNavigationEvent.get(str);
            if (obj != null) {
                int i8 = access100 + 57;
                IAuthTabCallbackStubProxy = i8 % 128;
                int i9 = i8 % 2;
                string = obj.toString();
            } else {
                string = null;
            }
            if (string != null) {
                strReplace$default = StringsKt__StringsJVMKt.replace$default(strReplace$default, "{" + str + "}", string, false, 4, (Object) null);
            }
        }
        return new onNavigationEvent(strReplace$default, strReplace$default.length() > 0 ? strIAuthTabCallback_Parcel : null);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(AFj1nSDK5 aFj1nSDK5, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = access100;
        int i4 = i3 + 111;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 75;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        Object[] objArr = {aFj1nSDK5, Boolean.valueOf(z)};
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), 1048141282, handleRemoveKey.onExtraCallbackWithResult(), -1048141279, handleRemoveKey.onExtraCallbackWithResult(), objArr, handleRemoveKey.onExtraCallbackWithResult());
    }

    static final class onNavigationEvent {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 119;
                onNavigationEvent = i2 % 128;
                return i2 % 2 == 0;
            }
            if (obj instanceof onNavigationEvent) {
                onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
                if (Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback)) {
                    return !(Intrinsics.areEqual(this.onExtraCallbackWithResult, onnavigationevent.onExtraCallbackWithResult) ^ true);
                }
                int i3 = onNavigationEvent + 73;
                onWarmupCompleted = i3 % 128;
                return i3 % 2 == 0;
            }
            int i4 = onNavigationEvent;
            int i5 = i4 + 41;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 1;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 93 / 0;
            }
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.onExtraCallback.hashCode();
            String str = this.onExtraCallbackWithResult;
            if (str == null) {
                int i2 = onNavigationEvent;
                int i3 = i2 + 81;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 3;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            return (iHashCode2 * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "TossReferrerSource(tossReferrer=" + this.onExtraCallback + ", tossReferrerTemplateKey=" + this.onExtraCallbackWithResult + ")";
            int i2 = onWarmupCompleted + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onNavigationEvent(@NotNull String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallback = str;
            this.onExtraCallbackWithResult = str2;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 97;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallback;
            int i5 = i2 + 119;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 84 / 0;
            }
            return str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 113;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallbackWithResult;
            int i5 = i2 + 1;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    public static /* synthetic */ Uri IAuthTabCallback(Uri uri, String str) {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        return (Uri) onExtraCallbackWithResult(iOnExtraCallbackWithResult, -1629162839, handleRemoveKey.onExtraCallbackWithResult(), 1629162839, handleRemoveKey.onExtraCallbackWithResult(), new Object[]{uri, str}, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ boolean onExtraCallback(Uri uri) {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallbackWithResult(iOnExtraCallbackWithResult, 1973701619, handleRemoveKey.onExtraCallbackWithResult(), -1973701614, handleRemoveKey.onExtraCallbackWithResult(), new Object[]{uri}, iOnExtraCallbackWithResult2)).booleanValue();
    }

    private static final boolean onNavigationEvent(String str) {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallbackWithResult(iOnExtraCallbackWithResult, -1669672394, handleRemoveKey.onExtraCallbackWithResult(), 1669672395, handleRemoveKey.onExtraCallbackWithResult(), new Object[]{str}, iOnExtraCallbackWithResult2)).booleanValue();
    }

    private final boolean onNavigationEvent(String str, boolean z) {
        Object[] objArr = {this, str, Boolean.valueOf(z)};
        return ((Boolean) onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), -859839560, handleRemoveKey.onExtraCallbackWithResult(), 859839562, handleRemoveKey.onExtraCallbackWithResult(), objArr, handleRemoveKey.onExtraCallbackWithResult())).booleanValue();
    }

    public final Object IAuthTabCallback(@Nullable Intent intent) {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        return onExtraCallbackWithResult(iOnExtraCallbackWithResult, 507432461, handleRemoveKey.onExtraCallbackWithResult(), -507432457, handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this, intent}, iOnExtraCallbackWithResult2);
    }

    public final void onWarmupCompleted(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), 1048141282, handleRemoveKey.onExtraCallbackWithResult(), -1048141279, handleRemoveKey.onExtraCallbackWithResult(), objArr, handleRemoveKey.onExtraCallbackWithResult());
    }

    public final void onExtraCallbackWithResult(@NotNull String str) {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult, 2017067382, handleRemoveKey.onExtraCallbackWithResult(), -2017067376, handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this, str}, iOnExtraCallbackWithResult2);
    }

    static void onExtraCallbackWithResult() {
        asInterface = (char) 42383;
        IAuthTabCallbackStub = (char) 32284;
        onTransact = (char) 6828;
        getInterfaceDescriptor = (char) 29752;
    }
}
