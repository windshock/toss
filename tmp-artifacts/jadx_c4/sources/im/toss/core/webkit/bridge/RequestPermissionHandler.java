package im.toss.core.webkit.bridge;

import android.content.Intent;
import android.graphics.Color;
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
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.core.webkit.bridge.RequestPermissionHandler$;
import im.toss.extensions.RxPermissionsKt;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceBox;
import o.ALCFaceQuality;
import o.ALCFaceValidation;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.IconRoundCornerProgressBarSavedState;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.auth;
import o.deserializeUriNullableCollection;
import o.getByteBuffer;
import o.matches;
import o.onOutOfMemory;
import o.onPageShow;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.setMask;
import o.setOnOutOfMemeryErrorCallback;
import o.setText;
import o.shouldBeKeptAsChild;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RequestPermissionHandler implements ALCFaceQuality {
    private static final byte[] $$a = {34, -56, 26, -92};
    private static final int $$b = 70;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackStub = 1;
    private static char[] onNavigationEvent = {32542, 32540, 32750, 32748, 32538, 32749, 32539, 32736, 32543, 32536, 32541, 32718, 32744, 32761, 32740};
    private static int IAuthTabCallback = -1184333943;
    private static boolean onExtraCallback = true;
    private static boolean onExtraCallbackWithResult = true;
    private static int onWarmupCompleted = 478308873;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, int i2) {
        int i3;
        int i4;
        int i5 = 105 - (i2 * 4);
        int i6 = (s * 4) + 1;
        int i7 = i + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i6;
            i4 = 0;
            i5 += -i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            i7++;
            if (i4 == i6) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i7];
            i5 += -i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            i7++;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            i7++;
            if (i4 == i6) {
            }
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setonoutofmemeryerrorcallback, th);
        int i4 = IAuthTabCallbackStub + 15;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, shouldBeKeptAsChild shouldbekeptaschild) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setonoutofmemeryerrorcallback, shouldbekeptaschild);
        int i4 = IAuthTabCallbackStub + 57;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function1, obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, obj);
        int i4 = onTransact + 89;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.drawTextBox
    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super.onExtraCallback();
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        return onoutofmemoryOnExtraCallback;
    }

    @Override // o.ALCFaceQuality
    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 111;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = IAuthTabCallbackStub + 117;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            super.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
        int i3 = IAuthTabCallbackStub + 19;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 8 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super.onNavigationEvent();
        int i4 = IAuthTabCallbackStub + 35;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    @Override // o.drawTextBox
    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super.onWarmupCompleted(str);
        int i4 = onTransact + 71;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        throw null;
    }

    @Override // o.ALCFaceQuality
    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onTransact + 119;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = onTransact + 103;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.ALCFaceQuality
    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-121, -123, -120, -127, -127, -120, -113, -119, -124, -114, -127, -117, -125, -115, -117, -121, -123, -116, -117, -127, -124, -126, -118, -124, -119}, Color.green(0) + 127, objArr);
        if (!Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
            auth authVar = auth.onNavigationEvent;
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            b(19 - (ViewConfiguration.getTapTimeout() >> 16), 23 - Gravity.getAbsoluteGravity(0, 0), new char[]{'\b', '\b', 7, '\n', '\f', 65533, 65532, 65464, '\b', 65533, '\n', 5, 1, 11, 11, 1, 7, 6, 65490, '\r', 6, 11, '\r'}, 136 - Color.green(0), false, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(str);
            auth.IAuthTabCallback(-1588674344, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{authVar, new setMask(sb.toString()), null, 2, null}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1588674346, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
            return;
        }
        int i2 = IAuthTabCallbackStub + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onPageShow onpageshow = onPageShow.READ_CONTACTS;
        Object[] objArr3 = new Object[1];
        b((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3, TextUtils.getOffsetBefore("", 0) + 7, new char[]{65528, 65534, 65532, 4, 65532, '\n', '\n'}, TextUtils.indexOf((CharSequence) "", '0', 0) + 138, false, objArr3);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr3[0]).intern(), "");
        FragmentActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (activity != null) {
            Object[] objArr4 = {new RxPermissions(activity), activity, onpageshow, strOnNavigationEvent};
            deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = ((getByteBuffer) RxPermissionsKt.IAuthTabCallback(397690809, matches.onExtraCallback(), -397690804, matches.onExtraCallback(), matches.onExtraCallback(), objArr4, matches.onExtraCallback())).onExtraCallbackWithResult(new RequestPermissionHandler$.ExternalSyntheticLambda1(new RequestPermissionHandler$.ExternalSyntheticLambda0(setonoutofmemeryerrorcallback)), new RequestPermissionHandler$.ExternalSyntheticLambda3(new RequestPermissionHandler$.ExternalSyntheticLambda2(setonoutofmemeryerrorcallback)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnExtraCallbackWithResult, "");
            IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnExtraCallbackWithResult, r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
            int i4 = IAuthTabCallbackStub + 93;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStub + 91;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, shouldBeKeptAsChild shouldbekeptaschild) throws Throwable {
        Object obj;
        int i = 2 % 2;
        JsonObject jsonObject = new JsonObject();
        if (!shouldbekeptaschild.onNavigationEvent) {
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-127, -127, -124, -125, -125, -126, -127}, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
            jsonObject.addProperty(((String) objArr[0]).intern(), Boolean.FALSE);
            JsonObject jsonObject2 = new JsonObject();
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-124, -122, -123, -125}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a(null, null, new byte[]{-122, -124, -120, -121, -124, -122}, 127 - ExpandableListView.getPackedPositionGroup(0L), objArr3);
            jsonObject2.addProperty(strIntern, ((String) objArr3[0]).intern());
            Unit unit = Unit.INSTANCE;
            Object[] objArr4 = new Object[1];
            a(null, null, new byte[]{-119, -123, -119, -119, -124}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, objArr4);
            jsonObject.add(((String) objArr4[0]).intern(), jsonObject2);
            ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, (JsonElement) jsonObject);
            int i2 = IAuthTabCallbackStub + 107;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = IAuthTabCallbackStub + 45;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr5 = new Object[1];
                a(null, null, new byte[]{-127, -127, -124, -125, -125, -126, -127}, 55 >> (ViewConfiguration.getMaximumFlingVelocity() >>> 7), objArr5);
                obj = objArr5[0];
            } else {
                Object[] objArr6 = new Object[1];
                a(null, null, new byte[]{-127, -127, -124, -125, -125, -126, -127}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, objArr6);
                obj = objArr6[0];
            }
            jsonObject.addProperty(((String) obj).intern(), Boolean.TRUE);
            ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, (JsonElement) jsonObject);
        }
        return Unit.INSTANCE;
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
    }

    private static final Unit onExtraCallbackWithResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) throws Throwable {
        int i = 2 % 2;
        JsonObject jsonObject = new JsonObject();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-127, -127, -124, -125, -125, -126, -127}, 127 - TextUtils.indexOf("", "", 0), objArr);
        jsonObject.addProperty(((String) objArr[0]).intern(), Boolean.FALSE);
        JsonObject jsonObject2 = new JsonObject();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-124, -122, -123, -125}, (ViewConfiguration.getTapTimeout() >> 16) + 127, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9, new char[]{7, 65529, 6, 65528, 65529, '\b', 65527, 65533, 6, '\b'}, TextUtils.lastIndexOf("", '0', 0) + 141, true, objArr3);
        jsonObject2.addProperty(strIntern, ((String) objArr3[0]).intern());
        Unit unit = Unit.INSTANCE;
        Object[] objArr4 = new Object[1];
        a(null, null, new byte[]{-119, -123, -119, -119, -124}, 127 - KeyEvent.keyCodeFromString(""), objArr4);
        jsonObject.add(((String) objArr4[0]).intern(), jsonObject2);
        ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, (JsonElement) jsonObject);
        int i2 = IAuthTabCallbackStub + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        char c;
        int i4;
        long j;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            c = '0';
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 35124), 23 - Color.argb(0, 0, 0, 0), 10278 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 55 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 2168, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i7 = $10 + 5;
                $11 = i7 % 128;
                int i8 = i7 % 2;
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
            int i9 = $11 + 57;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i11 = $10 + 29;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i13 = $10 + 87;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[i2 % simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.MeasureSpec.getMode(0)), 55 - View.MeasureSpec.getMode(0), 2167 - View.resolveSizeAndState(0, 0, 0), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    j = 0;
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback4 == null) {
                        j = 0;
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (b5 + 1);
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 'g' - AndroidCharacter.getMirror(c), 2167 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    } else {
                        j = 0;
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                c = '0';
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onNavigationEvent;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 107;
                $10 = i6 % 128;
                int i7 = i6 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), Process.getGidForName("") + 78, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    i3 = 2;
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
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 75 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 16037 - View.MeasureSpec.getMode(0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onExtraCallbackWithResult) {
            int i8 = $11 + 125;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i10 = $10 + 3;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 63 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 12214 - (Process.myPid() >> 22), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i12 = $10 + 67;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 0) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i] % iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i13 = $11 + 35;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback << defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i] >> iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 63 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), ExpandableListView.getPackedPositionChild(0L) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 63, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr6);
    }
}
