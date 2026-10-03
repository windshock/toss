package o;

import android.content.Context;
import android.content.DialogInterface;
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
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.collect.Synchronized;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.UST_API_GetLastDebugError;
import o.castToByte;
import o.onOutOfMemory;
import o.shouldBeKeptAsChild;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.common.web.message.handlers.tossbank.TossBankRequestIdCardOcrV2Handler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_API_GetLastDebugError implements ALCFaceResult {
    public static final onExtraCallback Companion;
    private static final String IAuthTabCallback;
    private static long IAuthTabCallbackDefault;
    private static final String IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy;
    private static int asBinder;
    private static int getInterfaceDescriptor;
    private static final String onExtraCallback;
    private static final String onExtraCallbackWithResult;
    public static final int onNavigationEvent;
    private static char onTransact;
    private static final String onWarmupCompleted;
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.web.message.handlers.tossbank.TossBankRequestIdCardOcrV2Handler$$ExternalSyntheticLambda6
        public final Object invoke() {
            return UST_API_GetLastDebugError.IAuthTabCallback();
        }
    });
    private static final byte[] $$a = {8, -40, 43, -43};
    private static final int $$b = 68;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access000 = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access100 = 1;

    static final class onWarmupCompleted extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        boolean Z$1;
        boolean Z$2;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object[] objArr = {UST_API_GetLastDebugError.this, null, null, false, false, false, 0, this};
            return UST_API_GetLastDebugError.IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, 1684504958, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1684504957);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001e -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, short r8) {
        /*
            int r7 = 110 - r7
            int r8 = r8 + 4
            byte[] r0 = o.UST_API_GetLastDebugError.$$a
            int r6 = r6 * 4
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L1e
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L1e:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_API_GetLastDebugError.$$c(int, byte, short):java.lang.String");
    }

    static {
        IAuthTabCallbackStubProxy = 1;
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 242938132 - KeyEvent.keyCodeFromString(""), new char[]{46880, 23191, 44247, 43397, 63443, 31796, 64293, 27822, 40291, 26225, 1219, 48556, 61226, 9979, 49957, 25522, 40941, 38082, 3117, 14671, 19337, 48630, 4035, 42733, 59981, 25739, 56764, 35921, 4807, 33167, 47064, 16411, 30002}, new char[]{0, 0, 0, 0}, new char[]{5120, 31473, 7950, 35027}, objArr);
        IAuthTabCallbackStub = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((char) (41397 - (ViewConfiguration.getTouchSlop() >> 8)), 1909667859 - ((Process.getThreadPriority(0) + 20) >> 6), new char[]{61388, 61414, 26452, 40087, 6033, 31253, 2284, 33905, 3150, 18777, 2270, 25314, 33359, 16886, 8213, 50165, 54675, 42743, 31614}, new char[]{0, 0, 0, 0}, new char[]{5040, 54072, 46449, 18081}, objArr2);
        onExtraCallbackWithResult = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a((char) View.MeasureSpec.getSize(0), (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{33369, 7553, 11448, 60603, 44409, 36504, 30308, 20822}, new char[]{0, 0, 0, 0}, new char[]{63350, 29844, 56862, 35050}, objArr3);
        IAuthTabCallback = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a((char) (TextUtils.indexOf("", "") + 24954), Color.red(0) - 925140010, new char[]{10963, 50858, 14724, 60753, 4074, 60697, 57283, 14199, 9334, 50489, 407, 53197, 42539, 4233, 29715}, new char[]{0, 0, 0, 0}, new char[]{54863, 56187, 31432, 42593}, objArr4);
        onExtraCallback = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), ViewConfiguration.getEdgeSlop() >> 16, new char[]{62397, 15634, 52503, 10479, 25542, 62317, 11120, 10599, 17927, 38079, 61996, 10252}, new char[]{0, 0, 0, 0}, new char[]{49195, 62621, 52910, 52170}, objArr5);
        onWarmupCompleted = ((String) objArr5[0]).intern();
        Companion = new onExtraCallback(null);
        onNavigationEvent = 8;
        int i = access000 + 97;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i6);
        int i9 = (~(i4 | i3)) | i8;
        int i10 = (~(i3 | (~i6))) | (~((~i4) | i7)) | i8;
        int i11 = i7 | i4 | i6;
        int i12 = i4 + i6 + i2 + (1050315579 * i) + (2086215248 * i5);
        int i13 = i12 * i12;
        int i14 = (i4 * (-1156115713)) + 1671168000 + ((-1156115713) * i6) + ((-1856302338) * i9) + (i10 * 1856302338) + (1856302338 * i11) + (700186624 * i2) + ((-1303117824) * i) + (314572800 * i5) + (431423488 * i13);
        int i15 = ((i4 * (-961373039)) - 1316831794) + (i6 * (-961373039)) + (i9 * (-990)) + (i10 * 990) + (i11 * 990) + (i2 * (-961372049)) + (i * 755842709) + (i5 * (-1858722640)) + (i13 * (-2040987648));
        int i16 = i14 + (i15 * i15 * 1361641472);
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(Context context, WebViewContentOwner webViewContentOwner, UST_API_GetLastDebugError uST_API_GetLastDebugError, setTopGuideBackgroundColor settopguidebackgroundcolor, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = access100 + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(context, webViewContentOwner, uST_API_GetLastDebugError, settopguidebackgroundcolor, commonModule_setLeftEdgeTouchEnabled);
        int i4 = access100 + 113;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ readType IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 99;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        readType readtypeAsBinder = asBinder();
        int i3 = IAuthTabCallback_Parcel + 39;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return readtypeAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallback(UST_API_GetLastDebugError uST_API_GetLastDebugError, setTopGuideBackgroundColor settopguidebackgroundcolor, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access100 + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, new Object[]{uST_API_GetLastDebugError, settopguidebackgroundcolor, dialogInterface}, -278065545, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 278065547);
        int i4 = access100 + 97;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(UST_API_GetLastDebugError uST_API_GetLastDebugError, WebViewContentOwner webViewContentOwner, JsonObject jsonObject, setTopGuideBackgroundColor settopguidebackgroundcolor, Context context, shouldBeKeptAsChild shouldbekeptaschild) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(uST_API_GetLastDebugError, webViewContentOwner, jsonObject, settopguidebackgroundcolor, context, shouldbekeptaschild);
        int i4 = access100 + 107;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        int i2 = access100 + 45;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(str, str2);
        }
        IAuthTabCallback(str, str2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Context context, WebViewContentOwner webViewContentOwner, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(context, webViewContentOwner, dialogInterface);
        int i4 = IAuthTabCallback_Parcel + 3;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, obj);
        int i4 = IAuthTabCallback_Parcel + 13;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(DialogInterface dialogInterface) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 81;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {dialogInterface};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        if (i3 == 0) {
            unit = (Unit) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, objArr, -577075045, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 577075045);
            int i4 = 48 / 0;
        } else {
            unit = (Unit) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, objArr, -577075045, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 577075045);
        }
        int i5 = access100 + 113;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        return i2 % 2 == 0;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        UST_API_GetLastDebugError uST_API_GetLastDebugError = (UST_API_GetLastDebugError) objArr[0];
        WebViewContentOwner webViewContentOwner = (WebViewContentOwner) objArr[1];
        String str = (String) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[5]).booleanValue();
        int iIntValue = ((Number) objArr[6]).intValue();
        access13800<? super JsonObject> access13800Var = (access13800) objArr[7];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 37;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return uST_API_GetLastDebugError.onNavigationEvent(webViewContentOwner, str, zBooleanValue, zBooleanValue2, zBooleanValue3, iIntValue, access13800Var);
        }
        uST_API_GetLastDebugError.onNavigationEvent(webViewContentOwner, str, zBooleanValue, zBooleanValue2, zBooleanValue3, iIntValue, access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100 + 5;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = access100 + 21;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = access100 + 71;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        if (i5 != 0) {
            int i6 = 90 / 0;
        }
        int i7 = IAuthTabCallback_Parcel + 111;
        access100 = i7 % 128;
        int i8 = i7 % 2;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.drawTextBox*/.onWarmupCompleted(str);
            throw null;
        }
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i3 = access100 + 43;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        UST_API_GetLastDebugError uST_API_GetLastDebugError = (UST_API_GetLastDebugError) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        readType readtype = (readType) uST_API_GetLastDebugError.asInterface.getValue();
        int i4 = IAuthTabCallback_Parcel + 53;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return readtype;
    }

    private static final readType asBinder() {
        int i = 2 % 2;
        int i2 = access100 + 59;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        readType readtypeITrustedWebActivityServiceDefault = ((strangeCodeForJackson) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), strangeCodeForJackson.class)).ITrustedWebActivityServiceDefault();
        int i4 = access100 + 53;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return readtypeITrustedWebActivityServiceDefault;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new TossBankRequestIdCardOcrV2Handler$.ExternalSyntheticLambda5());
        int i2 = access100 + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final boolean IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 109;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zOnWarmupCompleted = filterCreatePageParams.onWarmupCompleted(Uri.parse(str));
        int i4 = IAuthTabCallback_Parcel + 57;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = access100 + 87;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
    }

    public void onExtraCallbackWithResult(@NotNull final WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull final JsonObject jsonObject, @NotNull final setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(webViewContentOwner, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
            webViewContentOwner.getContext();
            throw null;
        }
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        final Context context = webViewContentOwner.getContext();
        if (context == null) {
            return;
        }
        RxPermissions rxPermissionsOnExtraCallback = PageAnimStore.onExtraCallback(webViewContentOwner);
        Object[] objArr = new Object[1];
        b(View.MeasureSpec.getSize(0) + 18, Color.green(0) + 25, new char[]{16, 17, 11, 21, 21, 11, 15, 20, 7, 18, 65488, 6, 11, 17, 20, 6, 16, 3, 65507, 65524, 65511, 65519, 65507, 65509, 65488}, 248 - TextUtils.indexOf((CharSequence) "", '0'), true, objArr);
        getByteBuffer getbytebufferOnExtraCallbackWithResult = rxPermissionsOnExtraCallback.onExtraCallbackWithResult(new String[]{((String) objArr[0]).intern()});
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.common.web.message.handlers.tossbank.TossBankRequestIdCardOcrV2Handler$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return UST_API_GetLastDebugError.onExtraCallbackWithResult(this.f$0, webViewContentOwner, jsonObject, settopguidebackgroundcolor, context, (shouldBeKeptAsChild) obj);
            }
        };
        getbytebufferOnExtraCallbackWithResult.IAuthTabCallback(new deserializeFloat() { // from class: viva.republica.toss.common.web.message.handlers.tossbank.TossBankRequestIdCardOcrV2Handler$$ExternalSyntheticLambda1
            public final void accept(Object obj) {
                UST_API_GetLastDebugError.onNavigationEvent(function1, obj);
            }
        });
        int i3 = access100 + 95;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super JsonObject>, Object> {
        final /* synthetic */ boolean $includeFrameImage;
        final /* synthetic */ boolean $includeImageFrames;
        final /* synthetic */ boolean $includeMarkedFrameImage;
        final /* synthetic */ int $maxImageFrames;
        final /* synthetic */ String $rsaKey;
        int label;
        private static final byte[] $$a = {57, 22, -21, -92};
        private static final int $$b = 148;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onWarmupCompleted = 0;
        private static int onExtraCallbackWithResult = 1;
        private static long IAuthTabCallback = 7798559133331975163L;
        private static int onExtraCallback = -1776194565;
        private static char onNavigationEvent = 21851;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r7, byte r8, byte r9) {
            /*
                int r8 = r8 * 4
                int r8 = r8 + 1
                int r7 = r7 + 109
                int r9 = r9 * 4
                int r9 = 3 - r9
                byte[] r0 = o.UST_API_GetLastDebugError.onExtraCallbackWithResult.$$a
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r9
                r4 = r2
                goto L2a
            L14:
                r3 = r2
            L15:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                int r9 = r9 + 1
                if (r4 != r8) goto L24
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L24:
                r3 = r0[r9]
                r6 = r9
                r9 = r7
                r7 = r3
                r3 = r6
            L2a:
                int r7 = r7 + r9
                r9 = r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: o.UST_API_GetLastDebugError.onExtraCallbackWithResult.$$c(short, byte, byte):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(String str, boolean z, boolean z2, boolean z3, int i, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$rsaKey = str;
            this.$includeImageFrames = z;
            this.$includeMarkedFrameImage = z2;
            this.$includeFrameImage = z3;
            this.$maxImageFrames = i;
        }

        public static /* synthetic */ Unit onWarmupCompleted(Ref.ObjectRef objectRef, String str, boolean z, boolean z2, boolean z3, int i, castToByte casttobyte) throws Throwable {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(objectRef, str, z, z2, z3, i, casttobyte);
            if (i4 != 0) {
                int i5 = 62 / 0;
            }
            return unitIAuthTabCallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$rsaKey, this.$includeImageFrames, this.$includeMarkedFrameImage, this.$includeFrameImage, this.$maxImageFrames, access13800Var);
            int i2 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super JsonObject> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super JsonObject> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onextracallbackwithresultCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(unit);
            int i4 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i3 = $11 + 89;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 1;
                        byte b2 = (byte) (b - 1);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 43 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1451 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                        if (objOnExtraCallback2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 49124), 43 - MotionEvent.axisFromString(""), 1494 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23973 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 50 - TextUtils.indexOf("", ""), 22939 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 45848), 29 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 12577 - Color.blue(0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                                int i5 = $11 + 89;
                                $10 = i5 % 128;
                                int i6 = i5 % 2;
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
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            objArr[0] = new String(cArr6);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a((char) TextUtils.indexOf("", "", 0), View.getDefaultSize(0, 0) + 908784223, new char[]{22373, 35922, 26124, 39182, 24419, 13657, 55244, 32855, 43389, 40014, 41417, 12211, 54056, 46115, 52191, 62538, 5388, 11480, 45140, 12293, 56315, 14922, 37012, 52209, 7550, 875, 12812, 56463, 45413, 42171, 58534, 'd', 43706, 46013, 39648, 64871, 63874, 13683, 53653, 63024, 44262, 8928, 38484, 3206, 20468, 3362, 28136}, new char[]{0, 0, 0, 0}, new char[]{24538, 10994, 54070, 206}, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new JsonObject();
            final String str = this.$rsaKey;
            final boolean z = this.$includeImageFrames;
            final boolean z2 = this.$includeMarkedFrameImage;
            final boolean z3 = this.$includeFrameImage;
            final int i4 = this.$maxImageFrames;
            castToDate.onWarmupCompleted.onExtraCallback(new Function1() { // from class: viva.republica.toss.common.web.message.handlers.tossbank.TossBankRequestIdCardOcrV2Handler$consumeOcrPayload$2$$ExternalSyntheticLambda0
                public final Object invoke(Object obj2) {
                    return UST_API_GetLastDebugError.onExtraCallbackWithResult.onWarmupCompleted(objectRef, str, z, z2, z3, i4, (castToByte) obj2);
                }
            });
            Object obj2 = objectRef.element;
            int i5 = onExtraCallbackWithResult + 45;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return obj2;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0103  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static final kotlin.Unit IAuthTabCallback(kotlin.jvm.internal.Ref.ObjectRef r21, java.lang.String r22, boolean r23, boolean r24, boolean r25, int r26, o.castToByte r27) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 364
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.UST_API_GetLastDebugError.onExtraCallbackWithResult.IAuthTabCallback(kotlin.jvm.internal.Ref$ObjectRef, java.lang.String, boolean, boolean, boolean, int, o.castToByte):kotlin.Unit");
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ setTopGuideBackgroundColor $callbackProxy;
        final /* synthetic */ WebViewContentOwner $contentOwner;
        final /* synthetic */ JsonObject $data;
        final /* synthetic */ boolean $isSuccess;
        final /* synthetic */ Bundle $resultData;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ UST_API_GetLastDebugError this$0;
        private static final byte[] $$a = {75, -35, 114, 51};
        private static final int $$b = 62;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int onExtraCallback = 478308868;
        private static long onWarmupCompleted = 7798559133331975163L;
        private static int onExtraCallbackWithResult = -1776194565;
        private static char onNavigationEvent = 20379;

        private static String $$c(int i, short s, byte b) {
            int i2 = b * 2;
            int i3 = 110 - i;
            int i4 = (s * 3) + 4;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i2 + 1];
            int i5 = -1;
            if (bArr == null) {
                i3 = i2 + (-i4);
                i4++;
                i5 = -1;
            }
            while (true) {
                int i6 = i5 + 1;
                bArr2[i6] = (byte) i3;
                if (i6 == i2) {
                    return new String(bArr2, 0);
                }
                int i7 = i4;
                i3 += -bArr[i4];
                i4 = i7 + 1;
                i5 = i6;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(JsonObject jsonObject, boolean z, UST_API_GetLastDebugError uST_API_GetLastDebugError, WebViewContentOwner webViewContentOwner, setTopGuideBackgroundColor settopguidebackgroundcolor, Bundle bundle, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$data = jsonObject;
            this.$isSuccess = z;
            this.this$0 = uST_API_GetLastDebugError;
            this.$contentOwner = webViewContentOwner;
            this.$callbackProxy = settopguidebackgroundcolor;
            this.$resultData = bundle;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 105;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$data, this.$isSuccess, this.this$0, this.$contentOwner, this.$callbackProxy, this.$resultData, access13800Var);
            int i2 = IAuthTabCallbackStub + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 42 / 0;
            }
            int i5 = IAuthTabCallbackStub + 29;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        private static void b(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr3.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr3, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i3 = $10 + 73;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42, ExpandableListView.getPackedPositionType(0L) + 1451, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 1;
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 49123), 44 - View.combineMeasuredStates(0, 0), KeyEvent.keyCodeFromString("") + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - MotionEvent.axisFromString("")), 50 - TextUtils.getTrimmedLength(""), ImageFormat.getBitsPerPixel(0) + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45847 - MotionEvent.axisFromString("")), 29 - TextUtils.getCapsMode("", 0, 0), 12577 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    int i5 = $10 + 93;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0157  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r22, int r23, char[] r24, boolean r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 368
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.UST_API_GetLastDebugError.onNavigationEvent.a(int, int, char[], boolean, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x01e9  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x01ec  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x025d  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0261  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x029a  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x034f  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x063d  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x065d A[PHI: r0
          0x065d: PHI (r0v37 o.ConvertFloatArrayToByteArray) = (r0v36 o.ConvertFloatArrayToByteArray), (r0v65 o.ConvertFloatArrayToByteArray) binds: [B:76:0x065b, B:73:0x0650] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0661 A[PHI: r0
          0x0661: PHI (r0v64 o.ConvertFloatArrayToByteArray) = (r0v36 o.ConvertFloatArrayToByteArray), (r0v65 o.ConvertFloatArrayToByteArray) binds: [B:76:0x065b, B:73:0x0650] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 2610
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.UST_API_GetLastDebugError.onNavigationEvent.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 9;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), ((Process.getThreadPriority(0) + 20) >> 6) + 43, 1451 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 49123), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 43, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1493, 1533236389, false, $$c(b3, b4, (byte) (-b4)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24020 - AndroidCharacter.getMirror('0')), View.combineMeasuredStates(0, 0) + 50, TextUtils.getOffsetAfter("", 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 45848), View.resolveSizeAndState(0, 0, 0) + 29, 12577 - Color.red(0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallbackDefault ^ 7798559133331975163L)) ^ ((int) (asBinder ^ 7798559133331975163L))) ^ ((char) (onTransact ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $10 + 47;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i8 = $11 + 93;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r23, int r24, char[] r25, int r26, boolean r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_API_GetLastDebugError.b(int, int, char[], int, boolean, java.lang.Object[]):void");
    }

    private static final Unit onExtraCallback(Context context, WebViewContentOwner webViewContentOwner, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        Object[] objArr = new Object[1];
        a((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18154), 2129869101 + ExpandableListView.getPackedPositionType(0L), new char[]{22012, 10477, 31259, 3037, 37492, 8855, 60582, 16689, 29862, 10971, 18430, 28165, 63248, 28998, 36943, 64455, 541, 10420, 51124, 21615, 42442, 12714, 26801, 61548, 10825, 21946, 23171, 32255, 55134, 11616, 64980, 35590, 50864, 28912, 1907, 47361, 19172, 16134, 57405, 34115, 43137, 28603, 29123, 2516, 38638}, new char[]{0, 0, 0, 0}, new char[]{11679, 62265, 60030, 10566}, objArr);
        Intent intent = new Intent(((String) objArr[0]).intern());
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        b(TextUtils.getOffsetAfter("", 0) + 3, Color.green(0) + 8, new char[]{7, 5, 65498, 16, 1, 3, 11, 1}, 251 - (ViewConfiguration.getTouchSlop() >> 8), false, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(packageName);
        intent.setData(Uri.parse(sb.toString()));
        PageAnimStore.onWarmupCompleted(webViewContentOwner, intent, 5001, (Bundle) null, 4, (Object) null);
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 29;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 89 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        DialogInterface dialogInterface = (DialogInterface) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 7;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            dialogInterface.cancel();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.cancel();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        UST_API_GetLastDebugError uST_API_GetLastDebugError = (UST_API_GetLastDebugError) objArr[0];
        setTopGuideBackgroundColor settopguidebackgroundcolor = (setTopGuideBackgroundColor) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 43;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        uST_API_GetLastDebugError.onWarmupCompleted(settopguidebackgroundcolor);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 5;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(final Context context, final WebViewContentOwner webViewContentOwner, final UST_API_GetLastDebugError uST_API_GetLastDebugError, final setTopGuideBackgroundColor settopguidebackgroundcolor, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(context.getString(R.string.app_common_web_message_handlers_tossbank___5fe974728a));
        String string = context.getString(R.string.app_common_web_message_handlers_tossbank___2be27d6afb);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.tossbank.TossBankRequestIdCardOcrV2Handler$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return UST_API_GetLastDebugError.onNavigationEvent(context, webViewContentOwner, (DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string2 = context.getString(R.string.next_time);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string2, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.tossbank.TossBankRequestIdCardOcrV2Handler$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return UST_API_GetLastDebugError.onWarmupCompleted((DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(new Function1() { // from class: viva.republica.toss.common.web.message.handlers.tossbank.TossBankRequestIdCardOcrV2Handler$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return UST_API_GetLastDebugError.onExtraCallback(this.f$0, settopguidebackgroundcolor, (DialogInterface) obj);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = access100 + 59;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(final UST_API_GetLastDebugError uST_API_GetLastDebugError, final WebViewContentOwner webViewContentOwner, JsonObject jsonObject, final setTopGuideBackgroundColor settopguidebackgroundcolor, final Context context, shouldBeKeptAsChild shouldbekeptaschild) throws Throwable {
        int i = 2 % 2;
        if (!(!shouldbekeptaschild.onNavigationEvent)) {
            uST_API_GetLastDebugError.IAuthTabCallback(webViewContentOwner, jsonObject, settopguidebackgroundcolor);
            int i2 = access100 + 17;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
        } else if (!shouldbekeptaschild.onExtraCallbackWithResult) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.tossbank.TossBankRequestIdCardOcrV2Handler$$ExternalSyntheticLambda7
                public final Object invoke(Object obj) {
                    return UST_API_GetLastDebugError.IAuthTabCallback(context, webViewContentOwner, uST_API_GetLastDebugError, settopguidebackgroundcolor, (CommonModule_setLeftEdgeTouchEnabled) obj);
                }
            });
        } else {
            int i4 = IAuthTabCallback_Parcel + 37;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            onJsBridgeReady.onNavigationEvent(context, context.getString(R.string.app_common_web_message_handlers_tossbank___2eed444313), 0, 2, (Object) null);
            uST_API_GetLastDebugError.onWarmupCompleted(settopguidebackgroundcolor);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull im.toss.core.webkit.WebViewContentOwner r26, @org.jetbrains.annotations.NotNull java.lang.String r27, @org.jetbrains.annotations.NotNull com.google.gson.JsonObject r28, @org.jetbrains.annotations.NotNull o.setTopGuideBackgroundColor r29, int r30, int r31, @org.jetbrains.annotations.Nullable android.os.Bundle r32, @org.jetbrains.annotations.Nullable android.net.Uri r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_API_GetLastDebugError.onExtraCallbackWithResult(im.toss.core.webkit.WebViewContentOwner, java.lang.String, com.google.gson.JsonObject, o.setTopGuideBackgroundColor, int, int, android.os.Bundle, android.net.Uri):void");
    }

    private final void onWarmupCompleted(WebViewContentOwner webViewContentOwner, JsonObject jsonObject, boolean z, setTopGuideBackgroundColor settopguidebackgroundcolor, Bundle bundle) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(webViewContentOwner), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(jsonObject, z, this, webViewContentOwner, settopguidebackgroundcolor, bundle, null), 3, (Object) null);
        int i2 = IAuthTabCallback_Parcel + 105;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onNavigationEvent(im.toss.core.webkit.WebViewContentOwner r13, java.lang.String r14, boolean r15, boolean r16, boolean r17, int r18, o.access13800<? super com.google.gson.JsonObject> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_API_GetLastDebugError.onNavigationEvent(im.toss.core.webkit.WebViewContentOwner, java.lang.String, boolean, boolean, boolean, int, o.access13800):java.lang.Object");
    }

    private final Object onExtraCallback(String str, boolean z, boolean z2, boolean z3, int i, access13800<? super JsonObject> access13800Var) {
        int i2 = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onWarmupCompleted(), new onExtraCallbackWithResult(str, z, z2, z3, i, null), access13800Var);
        int i3 = IAuthTabCallback_Parcel + 81;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return objOnExtraCallback;
    }

    private final void IAuthTabCallback(WebViewContentOwner webViewContentOwner, JsonObject jsonObject, setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        int i = 2 % 2;
        Context context = webViewContentOwner.getContext();
        if (context == null) {
            return;
        }
        setText settext = new setText(jsonObject);
        try {
            Result.Companion companion = Result.Companion;
            JsonObject jsonObjectOnExtraCallbackWithResult = settext.onExtraCallbackWithResult();
            Object[] objArr = new Object[1];
            a((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 60848), 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{9022, 40220, 48964, 35582, 59931, 56774, 46282, 20978, 12147, 17285, 5503, 46087, 37671, 21490, 63045, 35657}, new char[]{0, 0, 0, 0}, new char[]{32025, 42983, 45246, 24813}, objArr);
            JsonElement jsonElement = jsonObjectOnExtraCallbackWithResult.get(((String) objArr[0]).intern());
            if (jsonElement != null) {
                fValueOf3 = Float.valueOf(jsonElement.getAsFloat());
            } else {
                int i2 = access100 + 79;
                IAuthTabCallback_Parcel = i2 % 128;
                int i3 = i2 % 2;
                fValueOf3 = null;
            }
            obj = Result.constructor-impl(fValueOf3);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        Float f = (Float) obj;
        try {
            Result.Companion companion3 = Result.Companion;
            JsonObject jsonObjectOnExtraCallbackWithResult2 = settext.onExtraCallbackWithResult();
            Object[] objArr2 = new Object[1];
            b(TextUtils.indexOf("", "", 0, 0) + 1, 12 - View.combineMeasuredStates(0, 0), new char[]{'\n', 2, 15, '\f', 0, 65520, 2, 0, 65534, 65507, 11, 6}, 253 - ExpandableListView.getPackedPositionChild(0L), true, objArr2);
            JsonElement jsonElement2 = jsonObjectOnExtraCallbackWithResult2.get(((String) objArr2[0]).intern());
            obj2 = Result.constructor-impl(jsonElement2 != null ? Float.valueOf(jsonElement2.getAsFloat()) : null);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
        }
        if (Result.onExtraCallback(obj2)) {
            obj2 = null;
        }
        Float f2 = (Float) obj2;
        Object[] objArr3 = new Object[1];
        a((char) (63176 - TextUtils.indexOf("", "", 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, new char[]{28196, 47701, 44422, 43832, 44515, 44819, 15351, 15903, 16974, 48593, 6062, 27740, 59736, 5556, 60342, 17046, 43247, 40815, 57867, 32884, 22075, 53648, 43845, 60226, 29700, 42770, 51142, 27326, 10573, 47479}, new char[]{0, 0, 0, 0}, new char[]{14008, 20509, 51419, 14326}, objArr3);
        boolean zBooleanValue = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr3[0]).intern(), false})).booleanValue();
        Object[] objArr4 = new Object[1];
        a((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), KeyEvent.keyCodeFromString(""), new char[]{51410, 43155, 33323, 63058, 7869, 61592, 15771, 56927, 59763, 36247, 22577, 30233, 38267, 16949, 20490, 19039, 52980, 52831, 64328, 27298, 19653, 59302, 39922, 4036, 63122, 14688, 19781, 3843, 51506, 10290, 40454, 62257, 37713, 23205}, new char[]{0, 0, 0, 0}, new char[]{25916, 47710, 20585, 11216}, objArr4);
        boolean zBooleanValue2 = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr4[0]).intern(), false})).booleanValue();
        Object[] objArr5 = new Object[1];
        b((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 11, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 37, new char[]{'\r', 6, 65529, 65509, 65533, 65532, '\r', 4, 65531, 16, 65533, '\n', 65533, 6, 65535, 1, 65533, '\n', 7, 65502, '\n', 7, 65502, 17, '\n', '\f', 6, '\r', 7, 65499, '\f', '\r', '\b', 6, 65505, 4, 65529}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 258, true, objArr5);
        boolean zBooleanValue3 = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr5[0]).intern(), false})).booleanValue();
        Object[] objArr6 = new Object[1];
        a((char) (40604 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), Drawable.resolveOpacity(0, 0), new char[]{62975, 51335, 19510, 48662, 59948, 59259, 3380, 63338, 42210, 52052, 44109, 35844, 33940, 18008, 57242, 37342, 61006, 4023, 11893, 30837, 20023, 19740, 37091, 23456, 63840, 7742, 8436, 13393, 56218, 54184, 53269, 12814, 1182, 25359, 40431, 2928, 25532, 14942, 23776, 55789, 7831, 59331}, new char[]{0, 0, 0, 0}, new char[]{53277, 59989, 40044, 30878}, objArr6);
        boolean zBooleanValue4 = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr6[0]).intern(), false})).booleanValue();
        Object[] objArr7 = new Object[1];
        b((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 5, Gravity.getAbsoluteGravity(0, 0) + 6, new char[]{'\r', 11, 65533, 65515, 11, 65529}, 259 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), false, objArr7);
        boolean zBooleanValue5 = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr7[0]).intern(), false})).booleanValue();
        Object[] objArr8 = new Object[1];
        b(TextUtils.getOffsetAfter("", 0) + 2, View.MeasureSpec.makeMeasureSpec(0, 0) + 3, new char[]{65528, '\f', 65534}, 264 - KeyEvent.keyCodeFromString(""), false, objArr8);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr8[0]).intern(), "");
        Object[] objArr9 = new Object[1];
        a((char) (44268 - TextUtils.indexOf((CharSequence) "", '0', 0)), Color.red(0), new char[]{57151, 7687}, new char[]{0, 0, 0, 0}, new char[]{14290, 58808, 60829, 19116}, objArr9);
        long jLongValue = ((Long) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -616100104, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 616100108, new Object[]{settext, ((String) objArr9[0]).intern(), -1L})).longValue();
        Object[] objArr10 = new Object[1];
        b(View.resolveSize(0, 0) + 4, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 28, new char[]{11, 11, 6, 5, '\n', 65535, 6, '\f', 3, 65531, 65514, 65535, 6, 14, 65503, 65532, 3, 7, 65513, 65532, '\b', '\f', 65532, '\n', 11, 65497, '\f'}, Color.rgb(0, 0, 0) + 16777476, false, objArr10);
        boolean zBooleanValue6 = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr10[0]).intern(), false})).booleanValue();
        Object[] objArr11 = new Object[1];
        b(28 - TextUtils.getCapsMode("", 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 30, new char[]{1, '\b', 16, 65505, 65534, 5, '\t', 65515, 65534, '\n', 14, 65534, '\f', '\r', 65499, 14, '\r', '\r', '\b', 7, 65501, 65534, 5, 65530, 18, 65516, 65534, 65532, '\f'}, TextUtils.indexOf((CharSequence) "", '0') + 259, false, objArr11);
        int iOnNavigationEvent = settext.onNavigationEvent(((String) objArr11[0]).intern(), 20);
        try {
            Result.Companion companion5 = Result.Companion;
            JsonObject jsonObjectOnExtraCallbackWithResult3 = settext.onExtraCallbackWithResult();
            Object[] objArr12 = new Object[1];
            b((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2, ((byte) KeyEvent.getModifierMetaStateMask()) + 12, new char[]{'\b', 3, 7, 65535, '\f', '\t', 65533, 65517, 65535, 19, 65503}, 258 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), true, objArr12);
            JsonElement jsonElement3 = jsonObjectOnExtraCallbackWithResult3.get(((String) objArr12[0]).intern());
            obj3 = Result.constructor-impl(jsonElement3 != null ? Float.valueOf(jsonElement3.getAsFloat()) : null);
        } catch (Throwable th3) {
            Result.Companion companion6 = Result.Companion;
            obj3 = Result.constructor-impl(ResultKt.createFailure(th3));
        }
        if (!(!Result.onExtraCallback(obj3))) {
            obj3 = null;
        }
        Float f3 = (Float) obj3;
        try {
            Result.Companion companion7 = Result.Companion;
            JsonObject jsonObjectOnExtraCallbackWithResult4 = settext.onExtraCallbackWithResult();
            Object[] objArr13 = new Object[1];
            a((char) ((-1) - TextUtils.lastIndexOf("", '0')), (-1116256915) - (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{2496, 2315, 4040, 1309, 51488, 1132, 3281, 37531, 61294, 44717, 59154}, new char[]{0, 0, 0, 0}, new char[]{27925, 30533, 50365, 31260}, objArr13);
            JsonElement jsonElement4 = jsonObjectOnExtraCallbackWithResult4.get(((String) objArr13[0]).intern());
            obj4 = Result.constructor-impl(jsonElement4 != null ? Long.valueOf(jsonElement4.getAsLong()) : null);
        } catch (Throwable th4) {
            Result.Companion companion8 = Result.Companion;
            obj4 = Result.constructor-impl(ResultKt.createFailure(th4));
        }
        if (Result.onExtraCallback(obj4)) {
            int i4 = IAuthTabCallback_Parcel + 79;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            obj4 = null;
        }
        Long l = (Long) obj4;
        Object[] objArr14 = new Object[1];
        a((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 54560), View.getDefaultSize(0, 0), new char[]{63363, 37298, 18393, 42171, 2593, 14719, 56748, 57862, 46180, 59612, 40678, 13408, 28083, 166, 37728, 48898}, new char[]{0, 0, 0, 0}, new char[]{60373, 21460, 8252, 54997}, objArr14);
        long jLongValue2 = ((Long) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -616100104, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 616100108, new Object[]{settext, ((String) objArr14[0]).intern(), 0L})).longValue();
        try {
            Result.Companion companion9 = Result.Companion;
            JsonObject jsonObjectOnExtraCallbackWithResult5 = settext.onExtraCallbackWithResult();
            Object[] objArr15 = new Object[1];
            b(6 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 16, new char[]{65505, 65516, 65520, 65520, '\f', 7, 11, 3, 1, '\f', 3, 2, 7, 4, '\f', '\r'}, 253 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), true, objArr15);
            JsonElement jsonElement5 = jsonObjectOnExtraCallbackWithResult5.get(((String) objArr15[0]).intern());
            if (jsonElement5 != null) {
                int i6 = access100 + 115;
                IAuthTabCallback_Parcel = i6 % 128;
                if (i6 % 2 != 0) {
                    Float.valueOf(jsonElement5.getAsFloat());
                    throw null;
                }
                fValueOf2 = Float.valueOf(jsonElement5.getAsFloat());
            } else {
                fValueOf2 = null;
            }
            obj5 = Result.constructor-impl(fValueOf2);
        } catch (Throwable th5) {
            Result.Companion companion10 = Result.Companion;
            obj5 = Result.constructor-impl(ResultKt.createFailure(th5));
        }
        Object obj8 = obj5;
        if (Result.onExtraCallback(obj8)) {
            obj8 = null;
        }
        Float f4 = (Float) obj8;
        try {
            Result.Companion companion11 = Result.Companion;
            JsonObject jsonObjectOnExtraCallbackWithResult6 = settext.onExtraCallbackWithResult();
            Object[] objArr16 = new Object[1];
            b(15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 19, new char[]{65521, 65517, 65504, 21, 6, 65506, 14, '\r', 5, '\b', 3, 4, '\r', 2, 4, '\f', '\b', '\r', 65521}, 252 - View.MeasureSpec.getMode(0), false, objArr16);
            JsonElement jsonElement6 = jsonObjectOnExtraCallbackWithResult6.get(((String) objArr16[0]).intern());
            if (jsonElement6 != null) {
                int i7 = IAuthTabCallback_Parcel + 63;
                access100 = i7 % 128;
                int i8 = i7 % 2;
                fValueOf = Float.valueOf(jsonElement6.getAsFloat());
            } else {
                fValueOf = null;
            }
            obj6 = Result.constructor-impl(fValueOf);
        } catch (Throwable th6) {
            Result.Companion companion12 = Result.Companion;
            obj6 = Result.constructor-impl(ResultKt.createFailure(th6));
        }
        if (Result.onExtraCallback(obj6)) {
            int i9 = access100 + 3;
            IAuthTabCallback_Parcel = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            obj6 = null;
        }
        Float f5 = (Float) obj6;
        try {
            Result.Companion companion13 = Result.Companion;
            JsonObject jsonObjectOnExtraCallbackWithResult7 = settext.onExtraCallbackWithResult();
            Object[] objArr17 = new Object[1];
            a((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), ViewConfiguration.getTouchSlop() >> 8, new char[]{32997, 4033, 38307, 12845, 31587, 56803, 27204, 16778, 37669, 10808, 62267, 39259, 22835, 6553, 51668, 40306, 54129, 59032, 61224, 14362}, new char[]{0, 0, 0, 0}, new char[]{5767, 28544, 11055, 30303}, objArr17);
            JsonElement jsonElement7 = jsonObjectOnExtraCallbackWithResult7.get(((String) objArr17[0]).intern());
            obj7 = Result.constructor-impl(jsonElement7 != null ? jsonElement7.toString() : null);
        } catch (Throwable th7) {
            Result.Companion companion14 = Result.Companion;
            obj7 = Result.constructor-impl(ResultKt.createFailure(th7));
        }
        if (Result.onExtraCallback(obj7)) {
            int i10 = access100 + 123;
            IAuthTabCallback_Parcel = i10 % 128;
            int i11 = i10 % 2;
            obj7 = null;
        }
        castToString.onWarmupCompleted(webViewContentOwner, readType.onWarmupCompleted((readType) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{this}, -941308642, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 941308645), context, false, false, f, f2, f4, f5, l, f3, Long.valueOf(jLongValue2), (HashMap) null, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, Boolean.valueOf(zBooleanValue5), strOnNavigationEvent, Long.valueOf(jLongValue), (String) null, zBooleanValue6, iOnNavigationEvent, (String) obj7, 263174, (Object) null), 800, settopguidebackgroundcolor);
    }

    private final void onWarmupCompleted(setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 41;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((char) (ExpandableListView.getPackedPositionType(0L) + 41397), 1909667859 - View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{61388, 61414, 26452, 40087, 6033, 31253, 2284, 33905, 3150, 18777, 2270, 25314, 33359, 16886, 8213, 50165, 54675, 42743, 31614}, new char[]{0, 0, 0, 0}, new char[]{5040, 54072, 46449, 18081}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((char) (TextUtils.getCapsMode("", 0, 0) + 41397), 1909667859 - Drawable.resolveOpacity(0, 0), new char[]{61388, 61414, 26452, 40087, 6033, 31253, 2284, 33905, 3150, 18777, 2270, 25314, 33359, 16886, 8213, 50165, 54675, 42743, 31614}, new char[]{0, 0, 0, 0}, new char[]{5040, 54072, 46449, 18081}, objArr2);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, strIntern, ((String) objArr2[0]).intern(), (Map) null, 4, (Object) null);
        int i4 = access100 + 13;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    public static final /* synthetic */ Object onExtraCallback(UST_API_GetLastDebugError uST_API_GetLastDebugError, WebViewContentOwner webViewContentOwner, String str, boolean z, boolean z2, boolean z3, int i, access13800 access13800Var) {
        Object[] objArr = {uST_API_GetLastDebugError, webViewContentOwner, str, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i), access13800Var};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, objArr, 1684504958, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1684504957);
    }

    private final readType IAuthTabCallbackStub() {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (readType) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, new Object[]{this}, -941308642, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 941308645);
    }

    private static final Unit onNavigationEvent(DialogInterface dialogInterface) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, new Object[]{dialogInterface}, -577075045, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 577075045);
    }

    private static final Unit onExtraCallbackWithResult(UST_API_GetLastDebugError uST_API_GetLastDebugError, setTopGuideBackgroundColor settopguidebackgroundcolor, DialogInterface dialogInterface) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, new Object[]{uST_API_GetLastDebugError, settopguidebackgroundcolor, dialogInterface}, -278065545, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 278065547);
    }

    static void onWarmupCompleted() {
        IAuthTabCallbackDefault = 7798559133331975163L;
        asBinder = -1776194565;
        onTransact = (char) 53150;
        getInterfaceDescriptor = 478309042;
    }
}
