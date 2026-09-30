package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.securities.core.router.spec.TossSecRoute;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q4ExternalSyntheticLambda9 {
    private static final Regex IAuthTabCallback;
    private static char[] IAuthTabCallbackDefault;
    private static boolean IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy;
    private static boolean IAuthTabCallback_Parcel;
    private static int access000;
    private static final Regex asBinder;
    private static int asInterface;
    private static final Regex onExtraCallback;
    public static final q4ExternalSyntheticLambda9 onExtraCallbackWithResult;
    private static final Regex onNavigationEvent;
    private static final Set<String> onTransact;
    private static final Regex onWarmupCompleted;
    private static final byte[] $$a = {1, Byte.MIN_VALUE, 109, Byte.MIN_VALUE};
    private static final int $$b = 103;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 0;
    private static int extraCallbackWithResult = 1;
    private static int access100 = 0;

    private static String $$c(int i, byte b, int i2) {
        int i3 = 4 - (i2 * 2);
        byte[] bArr = $$a;
        int i4 = b * 4;
        int i5 = 105 - (i * 2);
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i5 += i4;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i5;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = bArr[i3];
            i3++;
            i5 += i7;
        }
    }

    private q4ExternalSyntheticLambda9() {
    }

    public final String onWarmupCompleted(@Nullable String str) throws Throwable {
        int i = 2 % 2;
        String strOnExtraCallback = onExtraCallback(str);
        if (strOnExtraCallback == null) {
            int i2 = extraCallbackWithResult + 123;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            strOnExtraCallback = "";
        }
        if (StringsKt.isBlank(strOnExtraCallback)) {
            Object[] objArr = new Object[1];
            b(Color.red(0) + 5, TextUtils.indexOf("", "", 0, 0) + 7, new char[]{65535, 65534, 65531, 65534, 5, 65534, 7}, 276 - (ViewConfiguration.getScrollDefaultDelay() >> 16), true, objArr);
            return ((String) objArr[0]).intern();
        }
        if (Intrinsics.areEqual(strOnExtraCallback, "tossinvest.com")) {
            return "tossinvest";
        }
        Object obj = null;
        if (StringsKt.endsWith$default(strOnExtraCallback, ".tossinvest.com", false, 2, (Object) null)) {
            return "tossinvest";
        }
        int i4 = extraCallbackWithResult + 87;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.areEqual(strOnExtraCallback, "toss.im");
            obj.hashCode();
            throw null;
        }
        if (Intrinsics.areEqual(strOnExtraCallback, "toss.im")) {
            return "toss";
        }
        Object[] objArr2 = new Object[1];
        b((ViewConfiguration.getEdgeSlop() >> 16) + 1, KeyEvent.getDeadChar(0, 0) + 8, new char[]{14, 65487, 21, 16, 20, 20, 65487, '\n'}, 258 - TextUtils.indexOf((CharSequence) "", '0'), false, objArr2);
        if (StringsKt.endsWith$default(strOnExtraCallback, ((String) objArr2[0]).intern(), false, 2, (Object) null)) {
            return "toss";
        }
        Object[] objArr3 = new Object[1];
        b(6 - (ViewConfiguration.getTapTimeout() >> 16), Color.red(0) + 7, new char[]{'\b', '\f', '\f', 65479, 65531, 19, '\r'}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 267, false, objArr3);
        if (Intrinsics.areEqual(strOnExtraCallback, ((String) objArr3[0]).intern())) {
            return "toss";
        }
        a(null, null, new byte[]{-112, -113, -114, -117, -117, -124, -119, -114}, 126 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new Object[1]);
        if (!(!StringsKt.endsWith$default(strOnExtraCallback, ((String) r3[0]).intern(), false, 2, (Object) null))) {
            return "toss";
        }
        if (!(!Intrinsics.areEqual(strOnExtraCallback, "tossbank.com"))) {
            return "tossbank";
        }
        int i5 = getInterfaceDescriptor + 107;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            if (!(!StringsKt.endsWith$default(strOnExtraCallback, ".tossbank.com", false, 2, (Object) null))) {
                return "tossbank";
            }
        } else if (StringsKt.endsWith$default(strOnExtraCallback, ".tossbank.com", false, 2, (Object) null)) {
            return "tossbank";
        }
        int i6 = getInterfaceDescriptor + 123;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return "external";
    }

    public static /* synthetic */ String onExtraCallback(q4ExternalSyntheticLambda9 q4externalsyntheticlambda9, String str, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 99;
        int i5 = i4 % 128;
        extraCallbackWithResult = i5;
        if (i4 % 2 != 0 ? (i2 & 2) != 0 : (i2 & 5) != 0) {
            int i6 = i5 + 45;
            getInterfaceDescriptor = i6 % 128;
            i = i6 % 2 != 0 ? 5 : 4;
        }
        return q4externalsyntheticlambda9.onNavigationEvent(str, i);
    }

    public final String onNavigationEvent(@Nullable String str, int i) throws Throwable {
        String strJoinToString$default;
        int i2 = 2 % 2;
        List listSplit$default = StringsKt.split$default(onNavigationEvent(str), new char[]{'/'}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (!(!it.hasNext())) {
            int i3 = extraCallbackWithResult + 99;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            Object next = it.next();
            if (!StringsKt.isBlank((String) next)) {
                arrayList.add(next);
            }
        }
        List listTake = CollectionsKt.take(arrayList, RangesKt.coerceAtLeast(i, 1));
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        Iterator it2 = listTake.iterator();
        while (it2.hasNext()) {
            arrayList2.add(onExtraCallbackWithResult.IAuthTabCallback((String) it2.next()));
        }
        if (arrayList2.isEmpty()) {
            int i5 = extraCallbackWithResult + 23;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            b(5 - View.MeasureSpec.makeMeasureSpec(0, 0), Color.green(0) + 7, new char[]{65535, 65534, 65531, 65534, 5, 65534, 7}, TextUtils.lastIndexOf("", '0') + 277, true, objArr);
            strJoinToString$default = ((String) objArr[0]).intern();
        } else {
            strJoinToString$default = CollectionsKt.joinToString$default(arrayList2, TossSecRoute.Main.PATH, TossSecRoute.Main.PATH, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 60, (Object) null);
        }
        String strTake = StringsKt.take(strJoinToString$default, 96);
        int i7 = extraCallbackWithResult + 37;
        getInterfaceDescriptor = i7 % 128;
        int i8 = i7 % 2;
        return strTake;
    }

    public static /* synthetic */ String onNavigationEvent(q4ExternalSyntheticLambda9 q4externalsyntheticlambda9, String str, int i, int i2, Object obj) throws Throwable {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 27;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        if ((i2 & 2) != 0) {
            i = 48;
        }
        String strOnWarmupCompleted = q4externalsyntheticlambda9.onWarmupCompleted(str, i);
        int i6 = getInterfaceDescriptor + 125;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return strOnWarmupCompleted;
    }

    public final String onWarmupCompleted(@Nullable String str, int i) throws Throwable {
        int i2 = 2 % 2;
        if (str == null) {
            int i3 = getInterfaceDescriptor + 75;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            str = "";
        }
        String lowerCase = onExtraCallback.replace(str, "$1_$2").toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String strTrim = StringsKt.trim(onNavigationEvent.replace(lowerCase, "_"), new char[]{'_'});
        if (StringsKt.isBlank(strTrim)) {
            int i5 = getInterfaceDescriptor + 51;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                Object[] objArr = new Object[1];
                b((ViewConfiguration.getPressedStateDuration() / 53) + 2, 4 >>> TextUtils.lastIndexOf("", (char) 17), new char[]{65535, 65534, 65531, 65534, 5, 65534, 7}, 27737 << (ViewConfiguration.getMinimumFlingVelocity() << 51), true, objArr);
                strTrim = ((String) objArr[0]).intern();
            } else {
                Object[] objArr2 = new Object[1];
                b((ViewConfiguration.getPressedStateDuration() >> 16) + 5, TextUtils.lastIndexOf("", '0') + 8, new char[]{65535, 65534, 65531, 65534, 5, 65534, 7}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 276, true, objArr2);
                strTrim = ((String) objArr2[0]).intern();
            }
        }
        return StringsKt.take(strTrim, RangesKt.coerceAtLeast(i, 1));
    }

    private final String onExtraCallback(String str) {
        Object obj;
        String host;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 3;
        extraCallbackWithResult = i2 % 128;
        String lowerCase = null;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (i2 % 2 == 0) {
            Result.Companion companion2 = Result.Companion;
            lowerCase.hashCode();
            throw null;
        }
        Result.Companion companion3 = Result.Companion;
        String string = str != null ? StringsKt.trim(str).toString() : null;
        if (string == null) {
            int i3 = getInterfaceDescriptor + 39;
            extraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            string = "";
        }
        if (!StringsKt.startsWith$default(string, "http://", false, 2, (Object) null)) {
            int i4 = extraCallbackWithResult + 37;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-115, -115, -116, -117, -126, -119, -119, -125}, 126 - MotionEvent.axisFromString(""), objArr);
            if (StringsKt.startsWith$default(string, ((String) objArr[0]).intern(), false, 2, (Object) null)) {
                host = new URI(string).getHost();
                obj = Result.constructor-impl(host);
            } else {
                host = null;
                obj = Result.constructor-impl(host);
            }
        } else {
            host = new URI(string).getHost();
            obj = Result.constructor-impl(host);
        }
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 != null) {
            lowerCase = str2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            int i6 = getInterfaceDescriptor + 75;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = getInterfaceDescriptor + 73;
        extraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return lowerCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String onNavigationEvent(String str) {
        Object obj;
        String path;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 93;
        getInterfaceDescriptor = i2 % 128;
        Object obj2 = null;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            Object obj3 = Result.constructor-impl(ResultKt.createFailure(th));
            int i3 = getInterfaceDescriptor + 89;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            obj = obj3;
        }
        if (i2 % 2 != 0) {
            Result.Companion companion2 = Result.Companion;
            obj2.hashCode();
            throw null;
        }
        Result.Companion companion3 = Result.Companion;
        String string = str != null ? StringsKt.trim(str).toString() : null;
        if (string == null) {
            int i5 = getInterfaceDescriptor + 61;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            string = "";
        }
        if (!StringsKt.isBlank(string)) {
            if (StringsKt.startsWith$default(string, "http://", false, 2, (Object) null)) {
                path = new URI(string).getPath();
                if (path == null) {
                }
                obj = Result.constructor-impl(path);
            } else {
                int i7 = extraCallbackWithResult + 35;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-115, -115, -116, -117, -126, -119, -119, -125}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, objArr);
                if (StringsKt.startsWith$default(string, ((String) objArr[0]).intern(), false, 2, (Object) null)) {
                    path = new URI(string).getPath();
                    if (path == null) {
                    }
                    obj = Result.constructor-impl(path);
                } else {
                    path = StringsKt.substringBefore$default(string, '?', (String) null, 2, (Object) null);
                    obj = Result.constructor-impl(path);
                }
            }
            return (String) (Result.onExtraCallback(obj) ? "" : obj);
        }
        path = "";
        obj = Result.constructor-impl(path);
        return (String) (Result.onExtraCallback(obj) ? "" : obj);
    }

    private final String IAuthTabCallback(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 79;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(this, str, 0, 2, null);
        if (onWarmupCompleted.onExtraCallbackWithResult(str)) {
            int i4 = getInterfaceDescriptor + 91;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return "{id}";
        }
        if (asBinder.onExtraCallbackWithResult(str)) {
            int i6 = getInterfaceDescriptor + 107;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return "{id}";
        }
        if (str.length() > 24) {
            int i8 = getInterfaceDescriptor + 117;
            extraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                return "{id}";
            }
            throw null;
        }
        if (onTransact.contains(strOnNavigationEvent)) {
            return strOnNavigationEvent;
        }
        if (IAuthTabCallback.onExtraCallbackWithResult(str)) {
            int i9 = getInterfaceDescriptor + 91;
            extraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            return "{route}";
        }
        int i11 = extraCallbackWithResult + 107;
        getInterfaceDescriptor = i11 % 128;
        if (i11 % 2 == 0) {
            return "{id}";
        }
        throw null;
    }

    static {
        access000 = 1;
        onExtraCallback();
        onExtraCallbackWithResult = new q4ExternalSyntheticLambda9();
        onExtraCallback = new Regex("([a-z0-9])([A-Z])");
        onNavigationEvent = new Regex("[^a-z0-9_]+");
        onWarmupCompleted = new Regex("^[0-9]+$");
        IAuthTabCallback = new Regex("^[a-z][a-z_-]*$");
        asBinder = new Regex("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$");
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-126, -126, -127}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-122, -123, -124, -125}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-120, -121, -127, -123}, 127 - TextUtils.getTrimmedLength(""), objArr3);
        String strIntern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b(TextUtils.getCapsMode("", 0, 0) + 8, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9, new char[]{65533, '\b', 65533, 6, '\t', 65527, 65529, 7, 7, 65529}, (Process.myTid() >> 22) + 272, true, objArr4);
        String strIntern4 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        b(6 - TextUtils.lastIndexOf("", '0'), MotionEvent.axisFromString("") + 8, new char[]{5, 65527, 5, 5, 65531, 1, 0}, 274 - Color.argb(0, 0, 0, 0), false, objArr5);
        String strIntern5 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(null, null, new byte[]{-120, -122, -118, -124, -119}, 127 - Color.argb(0, 0, 0, 0), objArr6);
        String strIntern6 = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        b(2 - (ViewConfiguration.getDoubleTapTimeout() >> 16), ImageFormat.getBitsPerPixel(0) + 3, new char[]{'\"', 65502}, 248 - TextUtils.indexOf("", "", 0, 0), false, objArr7);
        onTransact = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"account", "accounts", "api", strIntern, "auth", "authorize", "bridge", "calendar", "detail", "details", "discovery", "domestic", strIntern2, "login", "logout", strIntern3, "market", "markets", "oauth", "oauth2", "order", "orders", "overview", "overseas", "quote", "quotes", "realtime", "search", strIntern4, strIntern5, "sessions", "stock", "stocks", strIntern6, "topic", "topics", "trade", "trading", "user", "users", "v1", ((String) objArr7[0]).intern(), "watchlist", "web", "widget", "ws", "asset", "asset_dashboard", "comment", "comments", "community", "dashboard", "feed", "warm_up"});
        int i = access100 + 107;
        access000 = i % 128;
        if (i % 2 == 0) {
            int i2 = 28 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4;
        long j;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            j = 0;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(IAuthTabCallbackStubProxy)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 35124), 23 - KeyEvent.getDeadChar(0, 0), 10278 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 12843);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 56;
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2167;
                    byte b = (byte) ($$a[0] - 1);
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(keyRepeatDelay, iIndexOf, iNormalizeMetaState, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i > 0) {
            int i7 = $11 + 85;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i9 = $10 + 5;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) ($$a[0] - 1);
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(j) + 12844), 54 - TextUtils.lastIndexOf("", '0'), Gravity.getAbsoluteGravity(0, 0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
                j = 0;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallbackDefault;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 91;
                $10 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 77 - TextUtils.indexOf("", ""), 20952 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(asInterface)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 75, 16037 - KeyEvent.getDeadChar(0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            long j = 0;
            if (IAuthTabCallback_Parcel) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 63, 12215 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    j = 0;
                }
                String str = new String(cArr4);
                int i7 = $11 + 61;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
                objArr[0] = str;
                return;
            }
            if (!IAuthTabCallbackStub) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i8 = $10 + 59;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i10 = $10 + 43;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i12 = $10 + 61;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 63 - TextUtils.getOffsetAfter("", 0), ExpandableListView.getPackedPositionChild(0L) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onExtraCallback() {
        IAuthTabCallbackDefault = new char[]{32385, 32434, 32442, 32435, 32445, 32389, 32441, 32444, 32438, 32447, 32439, 32616, 32627, 32636, 32384, 32424};
        asInterface = -1184334046;
        IAuthTabCallbackStub = true;
        IAuthTabCallback_Parcel = true;
        IAuthTabCallbackStubProxy = 478309005;
    }
}
