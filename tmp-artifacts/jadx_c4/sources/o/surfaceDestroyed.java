package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
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
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.skt.usp.UCPApiConstants;
import com.tmoney.LiveCheckConstants;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.core.webkit.bridge.AbsFetchContactsHandler$;
import im.toss.core.webkit.bridge.AbsFetchContactsHandler$invokeJsFuncDebug$2$;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.GeckoHubImp;
import o.setIconPaddingBottom;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class surfaceDestroyed implements ALCFaceResult {
    public static final onNavigationEvent Companion;
    private static int asBinder;
    private static int onExtraCallback;
    private static final List<String> onExtraCallbackWithResult;
    private static int[] onWarmupCompleted;
    private final boolean IAuthTabCallback;
    private static final byte[] $$a = {19, 50, -9, 119};
    private static final int $$b = 213;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int onNavigationEvent = 0;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, byte b) {
        int i2;
        int i3;
        int i4 = (b * 2) + 4;
        int i5 = (i * 2) + 1;
        int i6 = (s * 4) + 105;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            i3 = i4;
            i2 = 0;
            i4 += -i7;
            i3++;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i3];
            i4 += -i7;
            i3++;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i4 = i6;
            i3 = i4;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
            }
        }
    }

    public static /* synthetic */ JsonArray IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        JsonArray jsonArrayAsInterface = asInterface(function1, obj);
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return jsonArrayAsInterface;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(th);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(th);
        int i3 = IAuthTabCallbackDefault + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ JsonArray onExtraCallback(surfaceDestroyed surfacedestroyed, List list) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            int iIAuthTabCallback3 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            throw null;
        }
        int iIAuthTabCallback4 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback5 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback6 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        JsonArray jsonArray = (JsonArray) onNavigationEvent(901518680, -901518680, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{surfacedestroyed, list}, iIAuthTabCallback4, iIAuthTabCallback5, iIAuthTabCallback6);
        int i3 = onNavigationEvent + 13;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 80 / 0;
        }
        return jsonArray;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        long jLongValue = ((Number) objArr[0]).longValue();
        surfaceDestroyed surfacedestroyed = (surfaceDestroyed) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        List list = (List) objArr[4];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(jLongValue, surfacedestroyed, iIntValue, iIntValue2, list);
        int i4 = onNavigationEvent + 63;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ List onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder(function1, obj);
        }
        asBinder(function1, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, setDetectableSize);
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 93;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        onNavigationEvent(-1481334485, 1481334486, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{function1, obj}, iIAuthTabCallback, iIAuthTabCallback2, iIAuthTabCallback3);
        int i4 = IAuthTabCallbackDefault + 61;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i2;
        int i8 = ~i;
        int i9 = (~(i8 | i4)) | i7;
        int i10 = ~i4;
        int i11 = ~(i8 | i10 | i2);
        int i12 = (~(i4 | i7)) | i8 | (~(i10 | i2));
        int i13 = i2 + i + i5 + (325770565 * i6) + ((-1284996642) * i3);
        int i14 = i13 * i13;
        int i15 = ((789042555 * i2) - 1205338112) + ((-1364710777) * i) + (i9 * 1076876666) + (1076876666 * i11) + ((-1076876666) * i12) + ((-287834112) * i5) + ((-667418624) * i6) + ((-145752064) * i3) + (1116340224 * i14);
        int i16 = (i2 * (-1991011123)) + 595473426 + (i * (-1991009311)) + (i9 * (-906)) + (i11 * (-906)) + (i12 * 906) + (i5 * (-1991010217)) + (i6 * (-1223611789)) + (i3 * (-291900814)) + (i14 * (-1931083776));
        switch (i15 + (i16 * i16 * (-1558839296))) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
                int i17 = 2 % 2;
                int i18 = onNavigationEvent + 49;
                IAuthTabCallbackDefault = i18 % 128;
                int i19 = i18 % 2;
                Unit unitOnWarmupCompleted = onWarmupCompleted(zBooleanValue, setDetectableSize);
                int i20 = onNavigationEvent + 79;
                IAuthTabCallbackDefault = i20 % 128;
                int i21 = i20 % 2;
                return unitOnWarmupCompleted;
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return IAuthTabCallback(objArr);
            default:
                surfaceDestroyed surfacedestroyed = (surfaceDestroyed) objArr[0];
                List list = (List) objArr[1];
                int i22 = 2 % 2;
                Intrinsics.checkNotNullParameter(list, "");
                JsonArray jsonArray = new JsonArray();
                Iterator it = list.iterator();
                int i23 = IAuthTabCallbackDefault + 67;
                onNavigationEvent = i23 % 128;
                int i24 = i23 % 2;
                while (!(!it.hasNext())) {
                    int i25 = onNavigationEvent + 81;
                    IAuthTabCallbackDefault = i25 % 128;
                    int i26 = i25 % 2;
                    jsonArray.add(surfacedestroyed.onExtraCallbackWithResult((setIconPaddingBottom.onExtraCallback) it.next()));
                }
                return jsonArray;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        int iIntValue = ((Number) objArr[0]).intValue();
        setIconPaddingBottom.onExtraCallback onextracallback = (setIconPaddingBottom.onExtraCallback) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnWarmupCompleted = onWarmupCompleted(iIntValue, onextracallback);
        int i4 = onNavigationEvent + 113;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return charSequenceOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, int i2, long j, int i3, int i4, int i5, SetDetectableSize setDetectableSize) throws Throwable {
        int i6 = 2 % 2;
        int i7 = onNavigationEvent + 17;
        IAuthTabCallbackDefault = i7 % 128;
        int i8 = i7 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, i2, j, i3, i4, i5, setDetectableSize);
        int i9 = onNavigationEvent + 99;
        IAuthTabCallbackDefault = i9 % 128;
        int i10 = i9 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, int i2, surfaceDestroyed surfacedestroyed, setTopGuideBackgroundColor settopguidebackgroundcolor, WebViewContentOwner webViewContentOwner, String str, JsonArray jsonArray) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 13;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, i2, surfacedestroyed, settopguidebackgroundcolor, webViewContentOwner, str, jsonArray);
        int i6 = onNavigationEvent + 79;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 51 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        onNavigationEvent(-402436436, 402436438, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{function1, obj}, iIAuthTabCallback, iIAuthTabCallback2, iIAuthTabCallback3);
        int i4 = onNavigationEvent + 71;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ List onWarmupCompleted(surfaceDestroyed surfacedestroyed, List list) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        List list2 = (List) onNavigationEvent(-742323744, 742323750, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{surfacedestroyed, list}, iIAuthTabCallback, iIAuthTabCallback2, iIAuthTabCallback3);
        int i4 = onNavigationEvent + 19;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return list2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, int i2, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 81;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(i, i2, str, setDetectableSize);
        int i6 = onNavigationEvent + 15;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(str, setDetectableSize);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, setDetectableSize);
        int i3 = IAuthTabCallbackDefault + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(startRunning startrunning) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(startrunning);
        int i4 = onNavigationEvent + 83;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        if (i3 != 0) {
            int i4 = 2 / 0;
        }
        int i5 = onNavigationEvent + 63;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public abstract setIconImageResource onWarmupCompleted();

    @Override // o.drawTextBox
    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super.onExtraCallback();
        int i4 = IAuthTabCallbackDefault + 69;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    @Override // o.ALCFaceResult
    @Deprecated
    public /* bridge */ void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 43;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, bundle, uri);
        if (i5 != 0) {
            int i6 = 37 / 0;
        }
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    @Override // o.ALCFaceResult
    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 61;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        if (i5 == 0) {
            throw null;
        }
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return super.onNavigationEvent();
        }
        super.onNavigationEvent();
        throw null;
    }

    @Override // o.drawTextBox
    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super.onWarmupCompleted(str);
        int i4 = onNavigationEvent + 87;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public JsonObject onExtraCallbackWithResult(@NotNull setIconPaddingBottom.onExtraCallback onextracallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        JsonObject jsonObject = new JsonObject();
        Object[] objArr = new Object[1];
        b(View.MeasureSpec.makeMeasureSpec(0, 0) + 1, TextUtils.getOffsetAfter("", 0) + 4, new char[]{65533, 6, 65529, 5}, 289 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), false, objArr);
        jsonObject.addProperty(((String) objArr[0]).intern(), onextracallback.onWarmupCompleted());
        Object[] objArr2 = new Object[1];
        b(6 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - KeyEvent.getDeadChar(0, 0), new char[]{65509, '\f', 4, 65529, 65532, '\t', 7, 65535, 6, 5, 65532}, 289 - TextUtils.indexOf((CharSequence) "", '0'), false, objArr2);
        jsonObject.addProperty(((String) objArr2[0]).intern(), onextracallback.onExtraCallback());
        int i2 = onNavigationEvent + 5;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return jsonObject;
    }

    private static final Unit onNavigationEvent(int i, int i2, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new int[]{845751798, 1263831725, 2080734048, -1862310559}, 6 - Color.alpha(0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), Integer.valueOf(i));
        Object[] objArr2 = new Object[1];
        b(1 - View.combineMeasuredStates(0, 0), 3 - ImageFormat.getBitsPerPixel(0), new char[]{5, 65527, '\f', 65531}, View.MeasureSpec.makeMeasureSpec(0, 0) + 295, true, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), Integer.valueOf(i2));
        Object[] objArr3 = new Object[1];
        b(7 - (Process.myPid() >> 22), 8 - TextUtils.getTrimmedLength(""), new char[]{65534, 65532, 65533, 7, 7, 65532, 65534, 6}, 286 - Color.alpha(0), true, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 35;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    @Override // o.ALCFaceResult
    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        setText settext = new setText(jsonObject);
        String strOnExtraCallback = settext.onExtraCallback();
        if (strOnExtraCallback != null) {
            int i2 = onNavigationEvent + 77;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            FragmentActivity activity = webViewContentOwner.getActivity();
            if (activity != null) {
                Object[] objArr = new Object[1];
                a(new int[]{845751798, 1263831725, 2080734048, -1862310559}, TextUtils.indexOf((CharSequence) "", '0') + 7, objArr);
                int iOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), 0);
                Object[] objArr2 = new Object[1];
                b(1 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 4, new char[]{5, 65527, '\f', 65531}, 294 - Process.getGidForName(""), true, objArr2);
                int iOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr2[0]).intern(), 0);
                Object[] objArr3 = new Object[1];
                b((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4, 15 - KeyEvent.getDeadChar(0, 0), new char[]{'\t', '\t', 65532, '\t', '\n', 65532, '\t', '\r', 0, 65530, 65532, 65513, 65532, 65533, 65532}, 290 - (ViewConfiguration.getDoubleTapTimeout() >> 16), false, objArr3);
                String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr3[0]).intern(), "");
                Object[] objArr4 = new Object[1];
                a(new int[]{-625358315, 2014697848, 2034535983, 413069300, -2133567133, -794651405, -1129794487, -1308441671, -1840501248, -626089622, -1686254838, 1427595292}, TextUtils.getCapsMode("", 0, 0) + 22, objArr4);
                ConvertByteArrayToFloatArray.onWarmupCompleted(((String) objArr4[0]).intern(), false, null, null, null, new AbsFetchContactsHandler$.ExternalSyntheticLambda4(iOnNavigationEvent, iOnNavigationEvent2, strOnExtraCallback), 30, null);
                Object[] objArr5 = new Object[1];
                b((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31, new char[]{19, 20, 14, 24, 24, 14, 18, 23, '\n', 21, 65491, '\t', 14, 20, 23, '\t', 19, 6, 65528, 65529, 65512, 65510, 65529, 65523, 65524, 65512, 4, 65513, 65510, 65514, 65527, 65491}, 275 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), true, objArr5);
                if (ContextCompat.checkSelfPermission(activity, ((String) objArr5[0]).intern()) != 0) {
                    settopguidebackgroundcolor.IAuthTabCallback(strOnExtraCallback, (Function1<? super startRunning, Unit>) new AbsFetchContactsHandler$.ExternalSyntheticLambda5());
                    return;
                }
                int i4 = onNavigationEvent + 107;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    onNavigationEvent(activity, iOnNavigationEvent2, iOnNavigationEvent, settopguidebackgroundcolor, strOnExtraCallback, webViewContentOwner, strOnNavigationEvent, onWarmupCompleted());
                    return;
                }
                onNavigationEvent(activity, iOnNavigationEvent2, iOnNavigationEvent, settopguidebackgroundcolor, strOnExtraCallback, webViewContentOwner, strOnNavigationEvent, onWarmupCompleted());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i5 = onNavigationEvent + 109;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit onExtraCallbackWithResult(startRunning startrunning) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            Object[] objArr = {startrunning, getEmbedViewManager.onNavigationEvent(CollectionsKt.emptyList())};
            startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            Object[] objArr2 = new Object[1];
            a(new int[]{406020205, 890276307}, 5 % (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1)), objArr2);
            Object[] objArr3 = {startrunning, ((String) objArr2[0]).intern()};
            startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr3, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        } else {
            Intrinsics.checkNotNullParameter(startrunning, "");
            Object[] objArr4 = {startrunning, getEmbedViewManager.onNavigationEvent(CollectionsKt.emptyList())};
            startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr4, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            Object[] objArr5 = new Object[1];
            a(new int[]{406020205, 890276307}, 5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr5);
            Object[] objArr6 = {startrunning, ((String) objArr5[0]).intern()};
            startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr6, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackDefault + 103;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 40 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return null;
        }
        int i4 = 91 / 0;
        return null;
    }

    private static final Unit onExtraCallbackWithResult(int i, int i2, long j, int i3, int i4, int i5, SetDetectableSize setDetectableSize) throws Throwable {
        boolean z;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map<String, Object> mapOnExtraCallback = setDetectableSize.onExtraCallback();
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        Object[] objArr = new Object[1];
        b(8 - (ViewConfiguration.getPressedStateDuration() >> 16), 16 - View.getDefaultSize(0, 0), new char[]{20, 3, 1, 20, 14, 15, 3, 65472, 4, 5, 4, 1, 15, '\f', 65472, 19}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 280, true, objArr);
        sb.append(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        b(7 - View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.getMode(0) + 7, new char[]{4, 65532, '\n', '\n', 65528, 65534, 65532}, 290 - TextUtils.getCapsMode("", 0, 0), false, objArr2);
        mapOnExtraCallback.put(((String) objArr2[0]).intern(), sb.toString());
        Object[] objArr3 = new Object[1];
        b(Process.getGidForName("") + 12, 11 - ExpandableListView.getPackedPositionType(0L), new char[]{3, 6, 65528, 65531, 65532, 65531, 65526, '\n', 0, 17, 65532}, View.getDefaultSize(0, 0) + 290, false, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), Integer.valueOf(i));
        Object[] objArr4 = new Object[1];
        b(View.resolveSize(0, 0) + 15, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16, new char[]{65529, 65532, 65533, 65532, 65527, 14, 65529, 4, 1, 65532, 65527, 11, 1, 18, 65533, 4, 7}, Drawable.resolveOpacity(0, 0) + 289, false, objArr4);
        setDetectableSize.onExtraCallback(((String) objArr4[0]).intern(), Integer.valueOf(i2));
        Object[] objArr5 = new Object[1];
        b(KeyEvent.keyCodeFromString("") + 8, 12 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{65529, 65530, 2, '\n', '\b', 3, 4, 65528, '\b', 2, 65524}, 291 - ((byte) KeyEvent.getModifierMetaStateMask()), true, objArr5);
        setDetectableSize.onExtraCallback(((String) objArr5[0]).intern(), Long.valueOf(j));
        Object[] objArr6 = new Object[1];
        b(TextUtils.lastIndexOf("", '0', 0, 0) + 12, MotionEvent.axisFromString("") + 12, new char[]{5, 65526, 7, 65526, 2, '\b', 65524, '\b', 65534, 15, 65530}, 292 - View.resolveSize(0, 0), false, objArr6);
        setDetectableSize.onExtraCallback(((String) objArr6[0]).intern(), Integer.valueOf(i3));
        Object[] objArr7 = new Object[1];
        b(2 - MotionEvent.axisFromString(""), ImageFormat.getBitsPerPixel(0) + 14, new char[]{'\t', 65531, '\n', 6, 65527, '\b', 65527, 3, '\t', 65525, 5, 65532, 65532}, 291 - Color.argb(0, 0, 0, 0), false, objArr7);
        setDetectableSize.onExtraCallback(((String) objArr7[0]).intern(), Integer.valueOf(i4));
        Object[] objArr8 = new Object[1];
        b(7 - TextUtils.getTrimmedLength(""), 10 - View.resolveSize(0, 0), new char[]{65525, 0, 65523, 7, 65533, 14, 65529, '\b', 3, '\b'}, Color.alpha(0) + 293, false, objArr8);
        setDetectableSize.onExtraCallback(((String) objArr8[0]).intern(), Integer.valueOf(i5));
        if (i3 + i4 >= i5) {
            int i7 = onNavigationEvent + 47;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            int i9 = onNavigationEvent + 111;
            IAuthTabCallbackDefault = i9 % 128;
            int i10 = i9 % 2;
            z = false;
        }
        Object[] objArr9 = new Object[1];
        a(new int[]{-454534039, 1146646871, -897567110, -261262800}, (ViewConfiguration.getPressedStateDuration() >> 16) + 7, objArr9);
        setDetectableSize.onExtraCallback(((String) objArr9[0]).intern(), Boolean.valueOf(z));
        Unit unit = Unit.INSTANCE;
        int i11 = IAuthTabCallbackDefault + 35;
        onNavigationEvent = i11 % 128;
        if (i11 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 8063;
        private static int IAuthTabCallbackDefault = 1;
        private static char onExtraCallback = 7564;
        private static char onExtraCallbackWithResult = 63979;
        private static int onNavigationEvent = 0;
        private static char onWarmupCompleted = 39068;
        final /* synthetic */ String $functionName;
        final /* synthetic */ String $param1;
        final /* synthetic */ String $param2;
        final /* synthetic */ setTopGuideBackgroundColor $this_invokeJsFuncDebug;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, String str, String str2, String str3, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$this_invokeJsFuncDebug = settopguidebackgroundcolor;
            this.$functionName = str;
            this.$param1 = str2;
            this.$param2 = str3;
        }

        public static /* synthetic */ Unit onExtraCallback(String str, String str2, startRunning startrunning) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(str, str2, startrunning);
            if (i3 == 0) {
                int i4 = 13 / 0;
            }
            int i5 = IAuthTabCallbackDefault + 17;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return unitIAuthTabCallback;
        }

        public static /* synthetic */ Unit onNavigationEvent(String str, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(str, setDetectableSize);
            int i4 = onNavigationEvent + 113;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                return unitOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$this_invokeJsFuncDebug, this.$functionName, this.$param1, this.$param2, access13800Var);
            int i2 = onNavigationEvent + 69;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800<? super Unit>) obj2);
            int i4 = onNavigationEvent + 39;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            int i4 = $10 + 43;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 2;
            }
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i6 = 58224;
                int i7 = i3;
                while (i7 < 16) {
                    int i8 = $10 + 1;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                    int i11 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[1] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "", i3, i3);
                            int iCombineMeasuredStates = 10 - View.combineMeasuredStates(i3, i3);
                            int defaultSize = View.getDefaultSize(i3, i3) + 12434;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iCombineMeasuredStates, defaultSize, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 10 - TextUtils.getTrimmedLength(""), 12433 - TextUtils.lastIndexOf("", '0', 0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - Drawable.resolveOpacity(0, 0)), Drawable.resolveOpacity(0, 0) + 14, ((Process.getThreadPriority(0) + 20) >> 6) + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        private static final Unit IAuthTabCallback(String str, String str2, startRunning startrunning) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, str}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, str2}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 19;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static final Unit onExtraCallback(String str, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{55836, 27932, 49960, 55148, 11117, 60720, 8288, 45162}, View.resolveSize(0, 0) + 8, objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 49;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                setTopGuideBackgroundColor settopguidebackgroundcolor = this.$this_invokeJsFuncDebug;
                String str = this.$functionName;
                AbsFetchContactsHandler$invokeJsFuncDebug$2$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new AbsFetchContactsHandler$invokeJsFuncDebug$2$.ExternalSyntheticLambda0(this.$param1, this.$param2);
                this.label = 1;
                obj = settopguidebackgroundcolor.onExtraCallback(str, (Function1<? super startRunning, Unit>) externalSyntheticLambda0, (access13800<? super String>) this);
                if (obj == objOnWarmupCompleted) {
                    int i3 = IAuthTabCallbackDefault + 111;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(new char[]{55836, 27932, 49960, 55148, 41785, 46488, 7263, 41152, 7476, 5834, 11410, 22489, 61773, 10514, 30122, 20052, 14398, 53684, 61339, 43197, 29204, 57620, 59708, 34835, 37875, 18620, 37870, 15660, 9423, 29953, 30122, 20052, 5172, 4321, 51472, 1403, 51800, 64911, 45214, 39604, 36474, 3693, 5513, 13308, 64270, 26067, 6665, 41281}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 47, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onNavigationEvent + 105;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
            }
            Object[] objArr2 = new Object[1];
            a(new char[]{18933, 19523, 39895, 43509, 25688, 33306, 45214, 39604, 32830, 48699, 32355, 52916, 47119, 38843, 53263, 1879, 5748, 61638, 8320, 65531, 12529, 30289, 55836, 27932, 49960, 55148, 11117, 60720, 8288, 45162}, 30 - View.MeasureSpec.getSize(0), objArr2);
            ConvertByteArrayToFloatArray.onWarmupCompleted(((String) objArr2[0]).intern(), false, null, null, null, new AbsFetchContactsHandler$invokeJsFuncDebug$2$.ExternalSyntheticLambda1((String) obj), 30, null);
            return Unit.INSTANCE;
        }
    }

    private static final CharSequence onWarmupCompleted(int i, setIconPaddingBottom.onExtraCallback onextracallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 99;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        if (onextracallback.onExtraCallback().length() < 10) {
            String strOnExtraCallback = onextracallback.onExtraCallback();
            int i5 = onNavigationEvent + 69;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                return strOnExtraCallback;
            }
            throw null;
        }
        String strTake = StringsKt.take(onextracallback.onExtraCallback(), onextracallback.onExtraCallback().length() - i);
        Object[] objArr = new Object[1];
        a(new int[]{398146338, 738760978}, 1 - (Process.myPid() >> 22), objArr);
        return strTake + StringsKt.repeat(((String) objArr[0]).intern(), i);
    }

    private static final Unit onExtraCallbackWithResult(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new int[]{-309604525, 1751996003, -1124118426, 762312456, 1543208070, 866409187, 1156585518, -501677960, 1412957739, 279777280, -1506872467, 246410990}, 21 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 33;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            int i6 = $10 + 91;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - Color.argb(0, 0, 0, 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 24, TextUtils.getOffsetBefore("", 0) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 55, (ViewConfiguration.getJumpTapTimeout() >> 16) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            int i9 = $11 + 105;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i11 = $10 + 47;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.getDefaultSize(0, 0)), 55 - TextUtils.getOffsetBefore("", 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2166, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static final Unit onExtraCallbackWithResult(long j, surfaceDestroyed surfacedestroyed, int i, int i2, List list) throws Throwable {
        int i3;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 99;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iOnExtraCallbackWithResult = setIconPaddingBottom.Companion.onExtraCallbackWithResult();
        Intrinsics.checkNotNull(list);
        int size = list.size();
        List list2 = list;
        if (!(!(list2 instanceof Collection)) && list2.isEmpty()) {
            i3 = 0;
        } else {
            Iterator it = list2.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                if (!(!surfacedestroyed.onExtraCallbackWithResult(((setIconPaddingBottom.onExtraCallback) it.next()).onExtraCallback()))) {
                    int i8 = IAuthTabCallbackDefault + 55;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 != 0) {
                        i7 /= 0;
                        if (i7 < 0) {
                            CollectionsKt.throwCountOverflow();
                            int i9 = IAuthTabCallbackDefault + 93;
                            onNavigationEvent = i9 % 128;
                            int i10 = i9 % 2;
                        }
                    } else {
                        i7++;
                        if (i7 < 0) {
                            CollectionsKt.throwCountOverflow();
                            int i92 = IAuthTabCallbackDefault + 93;
                            onNavigationEvent = i92 % 128;
                            int i102 = i92 % 2;
                        }
                    }
                }
            }
            i3 = i7;
        }
        Object[] objArr = new Object[1];
        a(new int[]{-625358315, 2014697848, 2034535983, 413069300, -2133567133, -794651405, -1089124709, -1335531291, -1795715159, -717548079}, 18 - ExpandableListView.getPackedPositionChild(0L), objArr);
        ConvertByteArrayToFloatArray.onWarmupCompleted(((String) objArr[0]).intern(), false, null, null, null, new AbsFetchContactsHandler$.ExternalSyntheticLambda0(size, i3, jCurrentTimeMillis - j, i, i2, iOnExtraCallbackWithResult), 30, null);
        if (size != i3) {
            try {
                Result.Companion companion = kotlin.Result.Companion;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!surfacedestroyed.onExtraCallbackWithResult(((setIconPaddingBottom.onExtraCallback) obj).onExtraCallback())) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    int i11 = onNavigationEvent + 61;
                    IAuthTabCallbackDefault = i11 % 128;
                    int i12 = i11 % 2;
                    if (!surfacedestroyed.IAuthTabCallback(((setIconPaddingBottom.onExtraCallback) obj2).onExtraCallback())) {
                        arrayList2.add(obj2);
                    }
                }
                List listTake = CollectionsKt.take(arrayList2, 10);
                AbsFetchContactsHandler$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new AbsFetchContactsHandler$.ExternalSyntheticLambda1(6);
                Object[] objArr2 = new Object[1];
                b((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{0}, 229 - ExpandableListView.getPackedPositionType(0L), true, objArr2);
                String strJoinToString$default = CollectionsKt.joinToString$default(listTake, ((String) objArr2[0]).intern(), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, externalSyntheticLambda1, 30, (Object) null);
                if (strJoinToString$default.length() > 0) {
                    AbsFetchContactsHandler$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new AbsFetchContactsHandler$.ExternalSyntheticLambda2(strJoinToString$default);
                    Object[] objArr3 = new Object[1];
                    b(TextUtils.getOffsetBefore("", 0) + 30, 35 - View.resolveSize(0, 0), new char[]{5, 65526, 65532, 5, 6, 65535, 7, 65526, 65531, 0, 3, 65528, '\r', 5, 0, 65526, '\n', 11, 65530, 65528, 11, 5, 6, 65530, 65526, 65535, 65530, 11, 65532, 65533, '\t', 65532, 65529, 4, '\f'}, (Process.myPid() >> 22) + 290, true, objArr3);
                    ConvertByteArrayToFloatArray.onWarmupCompleted(((String) objArr3[0]).intern(), false, null, null, null, externalSyntheticLambda2, 30, null);
                }
                kotlin.Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            }
        }
        return Unit.INSTANCE;
    }

    private static final List asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        List list = (List) function1.invoke(obj);
        int i3 = IAuthTabCallbackDefault + 39;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return list;
    }

    private static final JsonArray asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (JsonArray) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        JsonArray jsonArray = (JsonArray) function1.invoke(obj);
        int i3 = 49 / 0;
        return jsonArray;
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onNavigationEvent + 3;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onWarmupCompleted;
        long j = 0;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) - 1), 72 - ((Process.getThreadPriority(0) + 20) >> 6), 8848 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    j = 0;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onWarmupCompleted;
        if (iArr5 != null) {
            int i7 = $11 + 27;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr5[i9]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(i5, i5), 71 - Process.getGidForName(""), 8848 - TextUtils.indexOf("", ""), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i9++;
                i5 = 0;
            }
            i2 = i5;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i10 = $11 + 27;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i12 = 0;
            while (i12 < 16) {
                int i13 = $11 + 79;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                    try {
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22251), 39 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i12 += 56;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - KeyEvent.normalizeMetaState(0)), (Process.myTid() >> 22) + 39, (-16766915) - Color.rgb(0, 0, 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i12++;
                }
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 4032), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 78, 7398 - Gravity.getAbsoluteGravity(0, 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final Unit onWarmupCompleted(boolean z, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        b(5 - View.MeasureSpec.makeMeasureSpec(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 7, new char[]{14, 65503, '\n', '\t', 0, 4}, (ViewConfiguration.getTouchSlop() >> 8) + 286, false, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), String.valueOf(z));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onNavigationEvent + 71;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit onExtraCallbackWithResult(int i, int i2, surfaceDestroyed surfacedestroyed, setTopGuideBackgroundColor settopguidebackgroundcolor, WebViewContentOwner webViewContentOwner, String str, JsonArray jsonArray) throws Throwable {
        boolean z;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 41;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0 ? i + i2 < setIconPaddingBottom.Companion.onExtraCallbackWithResult() : i + i2 < setIconPaddingBottom.Companion.onExtraCallbackWithResult()) {
            int i5 = onNavigationEvent + 59;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 % 4;
            }
            z = false;
        } else {
            z = true;
        }
        Object[] objArr = new Object[1];
        a(new int[]{-625358315, 2014697848, 2034535983, 413069300, -2133567133, -794651405, 1842099084, 364346681, 1943079485, 2138194413, 1015899057, 1309986814}, 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        ConvertByteArrayToFloatArray.onWarmupCompleted(((String) objArr[0]).intern(), false, null, null, null, new AbsFetchContactsHandler$.ExternalSyntheticLambda3(z), 30, null);
        surfacedestroyed.IAuthTabCallback(settopguidebackgroundcolor, webViewContentOwner, str, getEmbedViewManager.onNavigationEvent(jsonArray), String.valueOf(z));
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(Throwable th) throws Throwable {
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray;
        Object obj;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new int[]{1424698612, 454970080, -9442337, 1983038857, -1373982247, -1846913206, -1425734972, -1303357843, -1830904708, -1300788109}, 69 % TextUtils.getTrimmedLength(""), objArr);
            obj = objArr[0];
        } else {
            convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr2 = new Object[1];
            a(new int[]{1424698612, 454970080, -9442337, 1983038857, -1373982247, -1846913206, -1425734972, -1303357843, -1830904708, -1300788109}, 20 - TextUtils.getTrimmedLength(""), objArr2);
            obj = objArr2[0];
        }
        convertFloatArrayToByteArray.IAuthTabCallback(((String) obj).intern(), th);
        return Unit.INSTANCE;
    }

    public void onNavigationEvent(@NotNull FragmentActivity fragmentActivity, int i, int i2, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, @NotNull String str, @NotNull WebViewContentOwner webViewContentOwner, @NotNull String str2, @NotNull setIconImageResource seticonimageresource) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(seticonimageresource, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        setIconPaddingBottom seticonpaddingbottom = new setIconPaddingBottom(fragmentActivity, seticonimageresource);
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = seticonpaddingbottom.onWarmupCompleted().onWarmupCompleted().onExtraCallback(new AbsFetchContactsHandler$.ExternalSyntheticLambda7(new AbsFetchContactsHandler$.ExternalSyntheticLambda6(jCurrentTimeMillis, this, i, i2))).asInterface(new AbsFetchContactsHandler$.ExternalSyntheticLambda9(new AbsFetchContactsHandler$.ExternalSyntheticLambda8(this))).asInterface(new AbsFetchContactsHandler$.ExternalSyntheticLambda11(new AbsFetchContactsHandler$.ExternalSyntheticLambda10(this))).onNavigationEvent(clearTid.onExtraCallback()).onExtraCallbackWithResult(NetConverter3.onExtraCallback()).onExtraCallbackWithResult(new AbsFetchContactsHandler$.ExternalSyntheticLambda13(new AbsFetchContactsHandler$.ExternalSyntheticLambda12(i, i2, this, settopguidebackgroundcolor, webViewContentOwner, str)), new AbsFetchContactsHandler$.ExternalSyntheticLambda15(new AbsFetchContactsHandler$.ExternalSyntheticLambda14()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnExtraCallbackWithResult, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnExtraCallbackWithResult, webViewContentOwner);
        seticonpaddingbottom.IAuthTabCallback(i2, i);
        int i4 = onNavigationEvent + 7;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean IAuthTabCallback(String str) {
        int i = 2 % 2;
        List<String> list = onExtraCallbackWithResult;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i2 = onNavigationEvent + 125;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                if (StringsKt.startsWith$default(str, (String) it.next(), false, 3, (Object) null)) {
                    int i3 = onNavigationEvent + 59;
                    IAuthTabCallbackDefault = i3 % 128;
                    int i4 = i3 % 2;
                    return true;
                }
            } else if (StringsKt.startsWith$default(str, (String) it.next(), false, 2, (Object) null)) {
                int i32 = onNavigationEvent + 59;
                IAuthTabCallbackDefault = i32 % 128;
                int i42 = i32 % 2;
                return true;
            }
        }
        return false;
    }

    private static final Unit IAuthTabCallback(String str, SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(new int[]{2076333742, -1812098923, 1565867455, 512192694, -1848847508, 1831863509}, UCPApiConstants.ARAM_TIME_OUT << (Process.myTid() << 26), objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr2 = new Object[1];
            a(new int[]{2076333742, -1812098923, 1565867455, 512192694, -1848847508, 1831863509}, (Process.myTid() >> 22) + 12, objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), str);
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, WebViewContentOwner webViewContentOwner, String str, String str2, String str3) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.IAuthTabCallback) {
            Object[] objArr = new Object[1];
            b(((byte) KeyEvent.getModifierMetaStateMask()) + 12, 13 - TextUtils.indexOf("", "", 0), new char[]{11, 18, 65507, 16, 65511, 2, '\b', '\f', 19, 11, 6, 65495, 0}, 284 - Color.green(0), true, objArr);
            ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new int[]{-1657124953, -1834209676, -1516235112, -2006656705}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8, objArr2);
            ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a(new int[]{391546679, -277598768}, Drawable.resolveOpacity(0, 0) + 2, objArr3);
            ((String) objArr3[0]).intern();
            TextUtils.indexOf((CharSequence) "", '0', 0);
        }
        Object[] objArr4 = new Object[1];
        b(1 - TextUtils.lastIndexOf("", '0', 0, 0), 20 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{6, '\n', 65532, 65531, '\n', 65529, 65534, 65525, 65529, 5, 4, '\n', 65527, 65529, '\n', '\t', 65525, '\t', 65529, '\b', 65535}, 291 - (ViewConfiguration.getTouchSlop() >> 8), false, objArr4);
        ConvertByteArrayToFloatArray.onWarmupCompleted(((String) objArr4[0]).intern(), false, null, null, null, new AbsFetchContactsHandler$.ExternalSyntheticLambda16(str), 30, null);
        TossCoreWebView webView = webViewContentOwner.getWebView();
        if (webView != null) {
            int i3 = IAuthTabCallbackDefault + 39;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(webView);
                throw null;
            }
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(webView);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(settopguidebackgroundcolor, str, str2, str3, null), 3, (Object) null);
            }
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    static {
        asBinder = 1;
        IAuthTabCallback();
        Companion = new onNavigationEvent(null);
        Object[] objArr = new Object[1];
        a(new int[]{-423163518, 520360761}, TextUtils.lastIndexOf("", '0') + 3, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b((-16777213) - Color.rgb(0, 0, 0), 3 - (ViewConfiguration.getTouchSlop() >> 8), new char[]{65535, 2, 0}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 233, false, objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(3 - TextUtils.getCapsMode("", 0, 0), 4 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{65535, 2, 1}, Color.red(0) + 234, false, objArr3);
        String strIntern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b(TextUtils.getTrimmedLength("") + 1, 2 - TextUtils.indexOf((CharSequence) "", '0'), new char[]{1, 65534, 1}, Color.argb(0, 0, 0, 0) + 235, false, objArr4);
        String strIntern4 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        b(3 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getLongPressTimeout() >> 16) + 3, new char[]{65535, 3, 0}, 233 - ImageFormat.getBitsPerPixel(0), false, objArr5);
        String strIntern5 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(new int[]{-1301226295, -580656839}, 2 - Process.getGidForName(""), objArr6);
        String strIntern6 = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        b((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2, 3 - View.MeasureSpec.getSize(0), new char[]{65534, 2, 1}, 234 - TextUtils.indexOf((CharSequence) "", '0'), false, objArr7);
        String strIntern7 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a(new int[]{1375583977, -1149196837}, ExpandableListView.getPackedPositionType(0L) + 3, objArr8);
        String strIntern8 = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        b(TextUtils.indexOf("", "") + 1, 3 - (ViewConfiguration.getTouchSlop() >> 8), new char[]{65535, 65534, 3}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 235, false, objArr9);
        String strIntern9 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        b(2 - TextUtils.lastIndexOf("", '0', 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3, new char[]{65534, 3, 0}, Drawable.resolveOpacity(0, 0) + 235, false, objArr10);
        String strIntern10 = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        a(new int[]{-667876199, 1544338040}, 3 - View.combineMeasuredStates(0, 0), objArr11);
        String strIntern11 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        b(View.getDefaultSize(0, 0) + 3, 3 - TextUtils.getOffsetAfter("", 0), new char[]{1, 2, 65533}, 235 - ((byte) KeyEvent.getModifierMetaStateMask()), true, objArr12);
        String strIntern12 = ((String) objArr12[0]).intern();
        Object[] objArr13 = new Object[1];
        b(2 - View.combineMeasuredStates(0, 0), 3 - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{2, 65533, 2}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 237, true, objArr13);
        String strIntern13 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        a(new int[]{-1237638943, 1890187148}, 3 - (ViewConfiguration.getScrollBarSize() >> 8), objArr14);
        String strIntern14 = ((String) objArr14[0]).intern();
        Object[] objArr15 = new Object[1];
        a(new int[]{-697849740, -34383384}, 4 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr15);
        String strIntern15 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        b((ViewConfiguration.getScrollDefaultDelay() >> 16) + 2, 3 - View.MeasureSpec.getMode(0), new char[]{3, 0, 65533}, Color.argb(0, 0, 0, 0) + 236, false, objArr16);
        String strIntern16 = ((String) objArr16[0]).intern();
        Object[] objArr17 = new Object[1];
        a(new int[]{-715729428, -1978176694}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2, objArr17);
        String strIntern17 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        b(View.MeasureSpec.makeMeasureSpec(0, 0) + 2, View.combineMeasuredStates(0, 0) + 3, new char[]{5, 65534, 65534}, 236 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), true, objArr18);
        String strIntern18 = ((String) objArr18[0]).intern();
        Object[] objArr19 = new Object[1];
        a(new int[]{707901920, -2021761723}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3, objArr19);
        String strIntern19 = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        b((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2, Gravity.getAbsoluteGravity(0, 0) + 3, new char[]{4, 65535, 65535}, KeyEvent.normalizeMetaState(0) + 234, false, objArr20);
        String strIntern20 = ((String) objArr20[0]).intern();
        Object[] objArr21 = new Object[1];
        b(TextUtils.indexOf("", "", 0) + 2, ExpandableListView.getPackedPositionChild(0L) + 3, new char[]{65535, 2}, (ViewConfiguration.getLongPressTimeout() >> 16) + 235, false, objArr21);
        String strIntern21 = ((String) objArr21[0]).intern();
        Object[] objArr22 = new Object[1];
        a(new int[]{-1566647271, -566832155}, KeyEvent.normalizeMetaState(0) + 2, objArr22);
        String strIntern22 = ((String) objArr22[0]).intern();
        Object[] objArr23 = new Object[1];
        a(new int[]{-442280662, 1113871941}, (ViewConfiguration.getTouchSlop() >> 8) + 2, objArr23);
        String strIntern23 = ((String) objArr23[0]).intern();
        Object[] objArr24 = new Object[1];
        a(new int[]{-1004287283, 1455752105}, 2 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr24);
        onExtraCallbackWithResult = CollectionsKt.listOf(new String[]{strIntern, strIntern2, strIntern3, strIntern4, strIntern5, strIntern6, strIntern7, strIntern8, strIntern9, strIntern10, strIntern11, strIntern12, strIntern13, strIntern14, strIntern15, strIntern16, strIntern17, strIntern18, strIntern19, strIntern20, strIntern21, strIntern22, strIntern23, ((String) objArr24[0]).intern()});
        int i = onTransact + 47;
        asBinder = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private final boolean onExtraCallbackWithResult(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (str.length() > 0) {
                Object[] objArr = new Object[1];
                a(new int[]{2146743175, 1966053719}, 1 - ImageFormat.getBitsPerPixel(0), objArr);
                if (StringsKt.startsWith$default(str, ((String) objArr[0]).intern(), false, 2, (Object) null) && str.length() >= 10) {
                    int i3 = IAuthTabCallbackDefault + 15;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 != 0) {
                        TextUtils.isDigitsOnly(str);
                        throw null;
                    }
                    if (TextUtils.isDigitsOnly(str)) {
                        int i4 = onNavigationEvent + 1;
                        IAuthTabCallbackDefault = i4 % 128;
                        return i4 % 2 != 0;
                    }
                }
            }
            return false;
        }
        str.length();
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        surfaceDestroyed surfacedestroyed = (surfaceDestroyed) objArr[0];
        List list = (List) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int i2 = IAuthTabCallbackDefault + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (surfacedestroyed.onExtraCallbackWithResult(((setIconPaddingBottom.onExtraCallback) obj).onExtraCallback())) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(!hashSet.add(((setIconPaddingBottom.onExtraCallback) obj2).onExtraCallback()))) {
                arrayList2.add(obj2);
            }
        }
        int i4 = IAuthTabCallbackDefault + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return arrayList2;
    }

    public static /* synthetic */ Unit onExtraCallback(long j, surfaceDestroyed surfacedestroyed, int i, int i2, List list) {
        return (Unit) onNavigationEvent(-108533201, 108533204, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{Long.valueOf(j), surfacedestroyed, Integer.valueOf(i), Integer.valueOf(i2), list}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    public static /* synthetic */ CharSequence IAuthTabCallback(int i, setIconPaddingBottom.onExtraCallback onextracallback) {
        return (CharSequence) onNavigationEvent(-1170410673, 1170410678, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{Integer.valueOf(i), onextracallback}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(boolean z, SetDetectableSize setDetectableSize) {
        return (Unit) onNavigationEvent(2062858362, -2062858358, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{Boolean.valueOf(z), setDetectableSize}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        onNavigationEvent(-402436436, 402436438, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{function1, obj}, iIAuthTabCallback, iIAuthTabCallback2, iIAuthTabCallback3);
    }

    private static final List onExtraCallbackWithResult(surfaceDestroyed surfacedestroyed, List list) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (List) onNavigationEvent(-742323744, 742323750, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{surfacedestroyed, list}, iIAuthTabCallback, iIAuthTabCallback2, iIAuthTabCallback3);
    }

    private static final JsonArray onNavigationEvent(surfaceDestroyed surfacedestroyed, List list) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (JsonArray) onNavigationEvent(901518680, -901518680, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{surfacedestroyed, list}, iIAuthTabCallback, iIAuthTabCallback2, iIAuthTabCallback3);
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        onNavigationEvent(-1481334485, 1481334486, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{function1, obj}, iIAuthTabCallback, iIAuthTabCallback2, iIAuthTabCallback3);
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = new int[]{-838424058, -1039572667, -927739343, 320607646, 1144926738, 240689514, -1107517278, -1221049497, -1592885376, 1074339785, -936662729, -1362791980, -1481534559, 27767463, -1248995909, -2085817866, -89140743, -1432848411};
        onExtraCallback = 478309008;
    }
}
