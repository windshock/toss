package viva.republica.toss.common.web.message.handlers;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceBox;
import o.ALCFaceQuality;
import o.ALCFaceValidation;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.PageAnimStore;
import o.SetDetectableSize;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.onOutOfMemory;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.setOnOutOfMemeryErrorCallback;
import o.setText;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.common.web.message.handlers.RequestOverlayPermissionHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RequestOverlayPermissionHandler implements ALCFaceQuality {
    public static final Companion Companion;
    private static char IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    private static int access100;
    private static short[] asBinder;
    private static byte[] asInterface;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;
    private static final byte[] $$a = {77, -64, 102, Byte.MIN_VALUE};
    private static final int $$b = 2;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access000 = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int getInterfaceDescriptor = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, byte r6, int r7) {
        /*
            int r5 = r5 + 4
            int r6 = r6 * 3
            int r6 = 115 - r6
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = viva.republica.toss.common.web.message.handlers.RequestOverlayPermissionHandler.$$a
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L14
            r3 = r2
            r2 = r5
            goto L2d
        L14:
            r4 = r6
            r6 = r5
            r5 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r0[r2] = r3
            int r6 = r6 + 1
            if (r2 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            return r5
        L27:
            r3 = r1[r6]
            r4 = r2
            r2 = r6
            r6 = r3
            r3 = r4
        L2d:
            int r6 = -r6
            int r5 = r5 + r6
            r6 = r2
            r2 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestOverlayPermissionHandler.$$c(byte, byte, int):java.lang.String");
    }

    static {
        access100 = 1;
        IAuthTabCallback();
        Companion = new Companion(null);
        int i = access000 + 69;
        access100 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(JsonObject jsonObject, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(jsonObject, setDetectableSize);
        }
        onExtraCallbackWithResult(jsonObject, setDetectableSize);
        throw null;
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 19;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 27;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        onOutOfMemory onoutofmemoryOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
            int i3 = 1 / 0;
        } else {
            onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        }
        int i4 = getInterfaceDescriptor + 27;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return onoutofmemoryOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 97;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 == 0) {
            throw null;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 125;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = IAuthTabCallbackDefault + 119;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        throw null;
    }

    public final boolean onNavigationEvent(@NotNull Context context) {
        boolean zCanDrawOverlays;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            zCanDrawOverlays = Settings.canDrawOverlays(context);
            int i3 = 48 / 0;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            zCanDrawOverlays = Settings.canDrawOverlays(context);
        }
        int i4 = IAuthTabCallbackDefault + 3;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return zCanDrawOverlays;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context == null) {
            return;
        }
        if (onNavigationEvent(context)) {
            int i2 = getInterfaceDescriptor + 43;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {setonoutofmemeryerrorcallback, Boolean.TRUE};
            ALCFaceBox.onWarmupCompleted(-2103726265, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 2103726265);
            return;
        }
        setText settext = new setText(jsonObject);
        Object[] objArr2 = new Object[1];
        a(new char[]{48504, 30605, 24889, 6374, 59244, 47310, 59317, 16089, 23823, 5708, 15277, 40699, 43017, 3572}, 14 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
        boolean zBooleanValue = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr2[0]).intern(), false})).booleanValue();
        Object[] objArr3 = new Object[1];
        b((byte) (View.MeasureSpec.getSize(0) - 64), (short) (120 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (-1052666664) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 16, 1147002743 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
        JsonObject jsonObjectOnExtraCallback = settext.onExtraCallback(((String) objArr3[0]).intern(), new JsonObject());
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder();
        Object[] objArr4 = new Object[1];
        a(new char[]{62765, 21664, 27605, 30665, 62209, 28888, 23825, 25689}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(packageName);
        Uri uri = Uri.parse(sb.toString());
        Object[] objArr5 = new Object[1];
        b((byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 59), (short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 59), (ViewConfiguration.getScrollBarSize() >> 8) - 1052666655, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 17, 1147002730 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr5);
        Intent intent = new Intent(((String) objArr5[0]).intern(), uri);
        intent.addFlags(1610612736);
        if (zBooleanValue) {
            onWarmupCompleted(context);
        }
        PageAnimStore.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, intent, 1209, (Bundle) null, 4, (Object) null);
        ConvertByteArrayToFloatArray.onExtraCallback(1488429L, false, (String) null, (Map) null, new RequestOverlayPermissionHandler$.ExternalSyntheticLambda0(jsonObjectOnExtraCallback), 14, (Object) null);
        int i4 = IAuthTabCallbackDefault + 7;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
    }

    private static final Unit onExtraCallbackWithResult(JsonObject jsonObject, SetDetectableSize setDetectableSize) {
        Map.Entry entry;
        Object obj;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Set setEntrySet = jsonObject.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
            setEntrySet.iterator();
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Set setEntrySet2 = jsonObject.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet2, "");
        Iterator it = setEntrySet2.iterator();
        while (it.hasNext()) {
            int i3 = getInterfaceDescriptor + 89;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                entry = (Map.Entry) it.next();
                try {
                    Result.Companion companion = Result.Companion;
                    obj = Result.constructor-impl(((JsonElement) entry.getValue()).getAsString());
                    int i4 = 6 / 0;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
            } else {
                entry = (Map.Entry) it.next();
                Result.Companion companion3 = Result.Companion;
                obj = Result.constructor-impl(((JsonElement) entry.getValue()).getAsString());
            }
            if (Result.onExtraCallback(obj)) {
                obj = null;
            }
            String str = (String) obj;
            if (str != null) {
                Object key = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "");
                setDetectableSize.onExtraCallback((String) key, str);
            }
        }
        Unit unit = Unit.INSTANCE;
        int i5 = getInterfaceDescriptor + 73;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private final void onWarmupCompleted(Context context) {
        int i = 2 % 2;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.overlay_guide_toast, (ViewGroup) null);
        Toast toast = new Toast(context);
        toast.setDuration(1);
        toast.setView(viewInflate);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        toast.setGravity(49, 0, varyMatches.onNavigationEvent(71, displayMetrics));
        toast.show();
        int i2 = IAuthTabCallbackDefault + 9;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        FragmentActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (activity != null && i == 1209) {
            int i4 = IAuthTabCallbackDefault + 93;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = {setonoutofmemeryerrorcallback, Boolean.valueOf(onNavigationEvent(activity))};
            int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback4 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            if (i5 == 0) {
                ALCFaceBox.onWarmupCompleted(-2103726265, iIAuthTabCallback, iIAuthTabCallback4, iIAuthTabCallback3, objArr, iIAuthTabCallback2, 2103726265);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ALCFaceBox.onWarmupCompleted(-2103726265, iIAuthTabCallback, iIAuthTabCallback4, iIAuthTabCallback3, objArr, iIAuthTabCallback2, 2103726265);
        }
        int i6 = IAuthTabCallbackDefault + 75;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 49;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = $10 + 95;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i8) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        int offsetAfter = 10 - TextUtils.getOffsetAfter("", i3);
                        int iRed = Color.red(i3) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), offsetAfter, iRed, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf((CharSequence) "", '0', 0) + 11, 12434 - View.getDefaultSize(0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 16014), TextUtils.indexOf((CharSequence) "", '0', 0) + 15, 19902 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void b(byte b, short s, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(IAuthTabCallbackStub)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 43424), 42 - KeyEvent.keyCodeFromString(""), 22439 - (ViewConfiguration.getScrollBarSize() >> 8), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            float f = 0.0f;
            if ((i5 ^ 1) != 1) {
                byte[] bArr = asInterface;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = 0;
                    while (i6 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) ($$b - 3);
                            byte b3 = (byte) (b2 + 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1))), Color.rgb(0, 0, 0) + 16777271, 2168 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i6] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i6++;
                        f = 0.0f;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = asInterface;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - ((byte) KeyEvent.getModifierMetaStateMask())), 42 - KeyEvent.normalizeMetaState(0), 22439 - Drawable.resolveOpacity(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (asBinder[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ (-4629411779493505016L))) + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onTransact), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 87 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 9567 - KeyEvent.getDeadChar(0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = asInterface;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i7 = 0; i7 < length2; i7++) {
                        bArr5[i7] = (byte) (bArr4[i7] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i8 = $10 + 47;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i10 = $10;
                    int i11 = i10 + 33;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    if (z) {
                        int i13 = i10 + 43;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        byte[] bArr6 = asInterface;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = asBinder;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = (char) 60549;
        onExtraCallback = (char) 41802;
        IAuthTabCallback = (char) 11600;
        onExtraCallbackWithResult = (char) 909;
        onNavigationEvent = -1694911712;
        IAuthTabCallbackStub = -1538795513;
        onTransact = 535165182;
        asInterface = new byte[]{-14, 71, 93, -80, 82, 82, -70, -55, 68, 42, 125, -12, 100, -10, 0, 122, 113, 11, 99, 103, -12, 30, 99, 112, 11, 109, -11, 102, 16, 124, -12, 121, 11, 98, 29, 54, 125, -12, 99, 7, 8, 57, -79, 10, Byte.MAX_VALUE, -13, 99, -10, 13, 120, -77, 64, 113, 112, 123, 12, 100, 11};
    }
}
