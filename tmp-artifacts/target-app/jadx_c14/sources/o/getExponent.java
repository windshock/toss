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
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.gson.JsonObject;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsError;
import im.toss.rn.spec.base.ReactNativeContentOwner;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.onOutOfMemory;
import o.scrollToItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.ads.NativeAdsSdkShowHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getExponent implements ALCFaceQuality {
    public static final IAuthTabCallback Companion;
    private static final String IAuthTabCallback;
    private static final String IAuthTabCallbackDefault;
    private static char[] IAuthTabCallbackStub;
    private static long access100;
    private static long asBinder;
    private static final String asInterface;
    private static int getInterfaceDescriptor;
    private static final String onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static final String onTransact;
    private static final String onWarmupCompleted;
    private static final byte[] $$a = {34, -66, 77, 18};
    private static final int $$b = 51;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, short r8) {
        /*
            int r7 = r7 * 2
            int r7 = 97 - r7
            int r8 = r8 * 2
            int r0 = 1 - r8
            byte[] r1 = o.getExponent.$$a
            int r6 = r6 * 2
            int r6 = 3 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getExponent.$$c(int, short, short):java.lang.String");
    }

    static {
        getInterfaceDescriptor = 1;
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(KeyEvent.keyCodeFromString(""), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 18, (char) (700 - ImageFormat.getBitsPerPixel(0)), objArr);
        IAuthTabCallbackDefault = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(17 - TextUtils.lastIndexOf("", '0', 0, 0), 8 - TextUtils.indexOf("", ""), (char) Color.green(0), objArr2);
        onTransact = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a((ViewConfiguration.getFadingEdgeLength() >> 16) + 26, 14 - View.resolveSizeAndState(0, 0, 0), (char) (64002 - ExpandableListView.getPackedPositionType(0L)), objArr3);
        asInterface = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b(new char[]{36460, 51272, 520, 23560, 38609, 53467, 10932, 25964, 48974, 63786, 13093, 36347, 51180, 394, 22634, 37471}, TextUtils.getOffsetAfter("", 0) + 17957, objArr4);
        IAuthTabCallback = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        b(new char[]{36460, 56900, 11792, 32284, 52963, 7847, 28294, 49009, 3874, 24321, 45034, 65445, 20363}, 20520 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr5);
        onExtraCallbackWithResult = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(39 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 11, (char) (7345 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr6);
        onExtraCallback = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        b(new char[]{36464, 54548, 14508, 40021, 58362, 18261, 43527, 61883, 21839, 47317, 7265}, 23399 - (ViewConfiguration.getEdgeSlop() >> 16), objArr7);
        onWarmupCompleted = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a(TextUtils.indexOf("", "") + 51, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 9, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr8);
        onNavigationEvent = ((String) objArr8[0]).intern();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new IAuthTabCallback(defaultConstructorMarker);
        int i = IAuthTabCallback_Parcel + 95;
        getInterfaceDescriptor = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ NativeAdsManager IAuthTabCallback(AppCompatActivity appCompatActivity, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsManager nativeAdsManagerOnExtraCallback = onExtraCallback(appCompatActivity, z);
        int i4 = access000 + 51;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return nativeAdsManagerOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 43;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(str, str2);
        int i4 = IAuthTabCallbackStubProxy + 65;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return zIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str, Map map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 111;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(setonoutofmemeryerrorcallback, str, map);
        if (i3 == 0) {
            throw null;
        }
        int i4 = access000 + 59;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 99;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = access000 + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
            int i3 = 58 / 0;
        } else {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        int i4 = access000 + 61;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = IAuthTabCallbackStubProxy + 57;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = IAuthTabCallbackStubProxy + 17;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 51;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 == 0) {
            throw null;
        }
        int i6 = access000 + 113;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new NativeAdsSdkShowHandler$.ExternalSyntheticLambda1());
        int i2 = IAuthTabCallbackStubProxy + 39;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final boolean IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = access000 + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return filterCreatePageParams.onTransact(Uri.parse(str));
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        filterCreatePageParams.onTransact(Uri.parse(str));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final NativeAdsManager onExtraCallback(AppCompatActivity appCompatActivity, boolean z) throws Throwable {
        String strIntern;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            NativeAdsManager nativeAdsManagerOnTransact = ((NativeAdsManager.onWarmupCompleted) Response.onWarmupCompleted(appCompatActivity, NativeAdsManager.onWarmupCompleted.class)).onTransact();
            if (!(!z)) {
                Object[] objArr = new Object[1];
                b(new char[]{36404}, 12703 - TextUtils.getOffsetBefore("", 0), objArr);
                strIntern = ((String) objArr[0]).intern();
                int i3 = access000 + 35;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
            } else {
                Object[] objArr2 = new Object[1];
                a(59 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), Color.rgb(0, 0, 0) + 16777217, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 54676), objArr2);
                strIntern = ((String) objArr2[0]).intern();
            }
            NativeAdsManager.onWarmupCompleted(nativeAdsManagerOnTransact, appCompatActivity, strIntern, (Set) null, (ViewGroup) null, (addNewItem) null, (ViewPager2LinearLayoutManagerImpl) null, 60, (Object) null);
            return nativeAdsManagerOnTransact;
        }
        ((NativeAdsManager.onWarmupCompleted) Response.onWarmupCompleted(appCompatActivity, NativeAdsManager.onWarmupCompleted.class)).onTransact();
        throw null;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23, 19626 - MotionEvent.axisFromString(""), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (access100 ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 59 - (Process.myTid() >> 22), 6383 - (ViewConfiguration.getTouchSlop() >> 8), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i4 = $11 + 37;
                $10 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 101;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 59 - View.combineMeasuredStates(0, 0), 6383 - KeyEvent.normalizeMetaState(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i7 = 11 / 0;
            } else {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), (ViewConfiguration.getTouchSlop() >> 8) + 59, TextUtils.lastIndexOf("", '0', 0) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            int i8 = $10 + 91;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    static /* synthetic */ void onExtraCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 115;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 4) != 0) {
            map = null;
        }
        IAuthTabCallback(setonoutofmemeryerrorcallback, str, map);
        int i5 = access000 + 61;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str, Map<String, ? extends Object> map) {
        int i = 2 % 2;
        if (map != null) {
            int i2 = IAuthTabCallbackStubProxy + 123;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            ALCFaceBox.onExtraCallback(setonoutofmemeryerrorcallback, str, map.toString());
        } else {
            setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, str, (Function1) null, 2, (Object) null);
        }
        setonoutofmemeryerrorcallback.onNavigationEvent(str, map);
        int i4 = access000 + 5;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        AppCompatActivity appCompatActivity;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        AppCompatActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (activity instanceof AppCompatActivity) {
            int i2 = access000 + 11;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            appCompatActivity = activity;
        } else {
            appCompatActivity = null;
        }
        if (appCompatActivity == null) {
            return;
        }
        boolean z = r8lambdakrhaimf1bm5cgjbilhp45vln_xq instanceof ReactNativeContentOwner;
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        b(new char[]{36464, 54548, 14508, 40021, 58362, 18261, 43527, 61883, 21839, 47317, 7265}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23398, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 51, TextUtils.indexOf("", "", 0) + 9, (char) Color.green(0), objArr2);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr2[0]).intern(), "");
        Object[] objArr3 = new Object[1];
        b(new char[]{36465, 33667, 38319, 42953, 47589, 51976, 56632, 61234}, 3557 - Drawable.resolveOpacity(0, 0), objArr3);
        String strOnNavigationEvent3 = settext.onNavigationEvent(((String) objArr3[0]).intern(), "");
        if (strOnNavigationEvent.length() == 0) {
            int i4 = IAuthTabCallbackStubProxy + 7;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            NativeAdsManager nativeAdsManagerOnExtraCallbackWithResult = setMode.IAuthTabCallback.onExtraCallbackWithResult(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, new NativeAdsSdkShowHandler$.ExternalSyntheticLambda0(appCompatActivity, z));
            nativeAdsManagerOnExtraCallbackWithResult.IAuthTabCallbackDefault(strOnNavigationEvent2);
            if (!StringsKt.isBlank(strOnNavigationEvent3)) {
                nativeAdsManagerOnExtraCallbackWithResult.asInterface(strOnNavigationEvent3);
            }
            nativeAdsManagerOnExtraCallbackWithResult.onNavigationEvent(appCompatActivity, strOnNavigationEvent, new onExtraCallback(setonoutofmemeryerrorcallback, z));
        }
    }

    public static final class onExtraCallback implements setTrimPathOffset {
        final /* synthetic */ setOnOutOfMemeryErrorCallback onExtraCallback;
        final /* synthetic */ boolean onNavigationEvent;
        private static final byte[] $$a = {63, 67, 46, -88};
        private static final int $$b = 197;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onTransact = 0;
        private static int asInterface = 1;
        private static char[] IAuthTabCallback = {64991, 64981, 64979, 64963, 64983, 65065, 65069, 65066, 64978, 65013, 65068, 64960, 64982, 64976, 64961, 64984, 65018, 64966, 64993, 65067, 64990, 64987, 64988, 64998, 64989, 65064, 64980, 64977, 64986, 64992, 64999, 65008, 64967, 65010, 65014, 64964};
        private static char onWarmupCompleted = 51247;
        private static int onExtraCallbackWithResult = 478308995;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r6, int r7, int r8) {
            /*
                int r8 = r8 * 3
                int r8 = 3 - r8
                int r7 = r7 * 4
                int r0 = r7 + 1
                byte[] r1 = o.getExponent.onExtraCallback.$$a
                int r6 = r6 * 4
                int r6 = r6 + 105
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L17
                r6 = r7
                r3 = r8
                r4 = r2
                goto L2d
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L23:
                int r8 = r8 + 1
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2d:
                int r6 = r6 + r8
                r8 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getExponent.onExtraCallback.$$c(byte, int, int):java.lang.String");
        }

        onExtraCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, boolean z) {
            this.onExtraCallback = setonoutofmemeryerrorcallback;
            this.onNavigationEvent = z;
        }

        public void onExtraCallback(NativeAdsError nativeAdsError) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 79;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(nativeAdsError, "");
            Map mapIAuthTabCallback = IAuthTabCallback.IAuthTabCallback(getExponent.Companion, nativeAdsError);
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.onExtraCallback;
            Object[] objArr = new Object[1];
            a(new char[]{18, 28, '\"', 3, '\n', '\t', 24, 4, 16, 0, '\"', 18, 27, 23, 23, '\"'}, (byte) (112 - TextUtils.lastIndexOf("", '0', 0, 0)), 16 - ExpandableListView.getPackedPositionGroup(0L), objArr);
            getExponent.onExtraCallback(setonoutofmemeryerrorcallback, ((String) objArr[0]).intern(), mapIAuthTabCallback);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(this.onExtraCallback, nativeAdsError.onExtraCallback(), String.valueOf(nativeAdsError.onNavigationEvent()), (Map) null, 4, (Object) null);
            int i4 = asInterface + 125;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onExtraCallback(com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 51;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(interstitialAd, "");
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.onExtraCallback;
            Object[] objArr = new Object[1];
            b(7 - (ViewConfiguration.getFadingEdgeLength() >> 16), 13 - Color.green(0), new char[]{14, 4, 65503, 65535, 65500, '\t', '\n', 65535, 0, 14, 14, 4, '\b'}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 271, true, objArr);
            getExponent.onExtraCallback(setonoutofmemeryerrorcallback, ((String) objArr[0]).intern(), null, 4, null);
            int i4 = asInterface + 11;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public void onExtraCallbackWithResult(com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd, com.google.android.gms.ads.AdError adError) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 123;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(interstitialAd, "");
            Intrinsics.checkNotNullParameter(adError, "");
            Object[] objArr = new Object[1];
            b(TextUtils.lastIndexOf("", '0') + 4, KeyEvent.keyCodeFromString("") + 4, new char[]{65534, '\t', 65533, 65535}, AndroidCharacter.getMirror('0') + 224, true, objArr);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), Integer.valueOf(adError.getCode()));
            Object[] objArr2 = new Object[1];
            b(2 - TextUtils.indexOf("", "", 0, 0), 8 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{65532, 4, 65532, 65534, 65528, '\n', '\n'}, TextUtils.getTrimmedLength("") + 275, true, objArr2);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), adError.getMessage());
            Object[] objArr3 = new Object[1];
            b(4 - View.MeasureSpec.getSize(0), 6 - Color.red(0), new char[]{4, 65528, 0, 5, 65531, 6}, 275 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), false, objArr3);
            Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), adError.getDomain())});
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.onExtraCallback;
            Object[] objArr4 = new Object[1];
            a(new char[]{18, 28, '\"', 3, '\n', '\t', 24, 4, 16, 0, '\"', 18, 27, 23, 23, '\"'}, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 113), AndroidCharacter.getMirror('0') - ' ', objArr4);
            getExponent.onExtraCallback(setonoutofmemeryerrorcallback, ((String) objArr4[0]).intern(), mapOnWarmupCompleted);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(this.onExtraCallback, adError.getMessage(), String.valueOf(adError.getCode()), (Map) null, 4, (Object) null);
            int i4 = onTransact + 61;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void IAuthTabCallback(RewardedAd rewardedAd) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 71;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(rewardedAd, "");
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.onExtraCallback;
            Object[] objArr = new Object[1];
            b((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7, 12 - TextUtils.lastIndexOf("", '0', 0), new char[]{14, 4, 65503, 65535, 65500, '\t', '\n', 65535, 0, 14, 14, 4, '\b'}, 271 - KeyEvent.keyCodeFromString(""), true, objArr);
            getExponent.onExtraCallback(setonoutofmemeryerrorcallback, ((String) objArr[0]).intern(), null, 4, null);
            int i4 = onTransact + 15;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onWarmupCompleted(RewardedAd rewardedAd, com.google.android.gms.ads.AdError adError) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 3;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(rewardedAd, "");
            Intrinsics.checkNotNullParameter(adError, "");
            Object[] objArr = new Object[1];
            b(3 - View.resolveSize(0, 0), 4 - (Process.myTid() >> 22), new char[]{65534, '\t', 65533, 65535}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 272, true, objArr);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), Integer.valueOf(adError.getCode()));
            Object[] objArr2 = new Object[1];
            b(TextUtils.indexOf((CharSequence) "", '0', 0) + 3, 7 - TextUtils.getCapsMode("", 0, 0), new char[]{65532, 4, 65532, 65534, 65528, '\n', '\n'}, 275 - Drawable.resolveOpacity(0, 0), true, objArr2);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), adError.getMessage());
            Object[] objArr3 = new Object[1];
            b(Color.rgb(0, 0, 0) + 16777220, 6 - Color.argb(0, 0, 0, 0), new char[]{4, 65528, 0, 5, 65531, 6}, View.combineMeasuredStates(0, 0) + 275, false, objArr3);
            Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), adError.getDomain())});
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.onExtraCallback;
            Object[] objArr4 = new Object[1];
            a(new char[]{18, 28, '\"', 3, '\n', '\t', 24, 4, 16, 0, '\"', 18, 27, 23, 23, '\"'}, (byte) (113 - View.MeasureSpec.getMode(0)), (ViewConfiguration.getTouchSlop() >> 8) + 16, objArr4);
            getExponent.onExtraCallback(setonoutofmemeryerrorcallback, ((String) objArr4[0]).intern(), mapOnWarmupCompleted);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(this.onExtraCallback, adError.getMessage(), String.valueOf(adError.getCode()), (Map) null, 4, (Object) null);
            int i4 = asInterface + 1;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 40 / 0;
            }
        }

        public void onNavigationEvent(com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 99;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(interstitialAd, "");
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.onExtraCallback;
            Object[] objArr = new Object[1];
            a(new char[]{18, 28, '\"', 3, 14, 22, 2, 15, 17, 6, '\n', 29, 18, 28}, (byte) (59 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 15 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
            getExponent.onExtraCallback(setonoutofmemeryerrorcallback, ((String) objArr[0]).intern(), null, 4, null);
            int i4 = asInterface + 123;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onWarmupCompleted(RewardedAd rewardedAd) throws Throwable {
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback;
            String strIntern;
            int i;
            int i2 = 2 % 2;
            int i3 = onTransact + 45;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(rewardedAd, "");
                setonoutofmemeryerrorcallback = this.onExtraCallback;
                Object[] objArr = new Object[1];
                a(new char[]{18, 28, '\"', 3, 14, 22, 2, 15, 17, 6, '\n', 29, 18, 28}, (byte) (TextUtils.getCapsMode("", 1, 0) * 83), 107 / View.resolveSize(1, 0), objArr);
                strIntern = ((String) objArr[0]).intern();
                i = 5;
            } else {
                Intrinsics.checkNotNullParameter(rewardedAd, "");
                setonoutofmemeryerrorcallback = this.onExtraCallback;
                Object[] objArr2 = new Object[1];
                a(new char[]{18, 28, '\"', 3, 14, 22, 2, 15, 17, 6, '\n', 29, 18, 28}, (byte) (59 - TextUtils.getCapsMode("", 0, 0)), 14 - View.resolveSize(0, 0), objArr2);
                strIntern = ((String) objArr2[0]).intern();
                i = 4;
            }
            getExponent.onExtraCallback(setonoutofmemeryerrorcallback, strIntern, null, i, null);
        }

        public void onNavigationEvent(NativeAdsDto nativeAdsDto) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 9;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.onExtraCallback;
            Object[] objArr = new Object[1];
            a(new char[]{18, 28, '\"', 3, 14, 22, 2, 15, 17, 6, '\n', 29, 18, 28}, (byte) (59 - (ViewConfiguration.getPressedStateDuration() >> 16)), 13 - TextUtils.lastIndexOf("", '0', 0), objArr);
            Object obj = null;
            getExponent.onExtraCallback(setonoutofmemeryerrorcallback, ((String) objArr[0]).intern(), null, 4, null);
            int i4 = onTransact + 9;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x01d7  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01d8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(int r24, int r25, char[] r26, int r27, boolean r28, java.lang.Object[] r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 482
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getExponent.onExtraCallback.b(int, int, char[], int, boolean, java.lang.Object[]):void");
        }

        public void onNavigationEvent() throws Throwable {
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback;
            String strIntern;
            int i;
            int i2 = 2 % 2;
            int i3 = onTransact + 73;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                setonoutofmemeryerrorcallback = this.onExtraCallback;
                Object[] objArr = new Object[1];
                a(new char[]{18, 28, '\"', 3, 30, 1, 25, 16, 16, '\r', 13858}, (byte) (26 - TextUtils.indexOf((CharSequence) "", '8', 1, 0)), Color.alpha(0) * 21, objArr);
                strIntern = ((String) objArr[0]).intern();
                i = 3;
            } else {
                setonoutofmemeryerrorcallback = this.onExtraCallback;
                Object[] objArr2 = new Object[1];
                a(new char[]{18, 28, '\"', 3, 30, 1, 25, 16, 16, '\r', 13858}, (byte) (35 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), Color.alpha(0) + 11, objArr2);
                strIntern = ((String) objArr2[0]).intern();
                i = 4;
            }
            getExponent.onExtraCallback(setonoutofmemeryerrorcallback, strIntern, null, i, null);
            int i4 = asInterface + 17;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onExtraCallback() throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 17;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.onExtraCallback;
                Object[] objArr = new Object[1];
                a(new char[]{18, 28, '\"', 3, 27, 23, 23, '\"'}, (byte) (39 << ExpandableListView.getPackedPositionChild(0L)), (PointF.length(1.0f, 2.0f) > 1.0f ? 1 : (PointF.length(1.0f, 2.0f) == 1.0f ? 0 : -1)) * 31, objArr);
                getExponent.onExtraCallback(setonoutofmemeryerrorcallback, ((String) objArr[0]).intern(), null, 5, null);
                if (this.onNavigationEvent) {
                    return;
                }
            } else {
                setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback2 = this.onExtraCallback;
                Object[] objArr2 = new Object[1];
                a(new char[]{18, 28, '\"', 3, 27, 23, 23, '\"'}, (byte) (ExpandableListView.getPackedPositionChild(0L) + 55), 8 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                getExponent.onExtraCallback(setonoutofmemeryerrorcallback2, ((String) objArr2[0]).intern(), null, 4, null);
                if (this.onNavigationEvent) {
                    return;
                }
            }
            setOnOutOfMemeryErrorCallback.onExtraCallback(this.onExtraCallback, (Function1) null, 1, (Object) null);
            int i3 = asInterface + 13;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
        }

        public void onExtraCallbackWithResult(NativeAdsDto nativeAdsDto) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(nativeAdsDto, "");
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.onExtraCallback;
            Object[] objArr = new Object[1];
            a(new char[]{18, 28, '\"', 3, 27, 23, 23, '\"'}, (byte) (54 - View.getDefaultSize(0, 0)), ImageFormat.getBitsPerPixel(0) + 9, objArr);
            getExponent.onExtraCallback(setonoutofmemeryerrorcallback, ((String) objArr[0]).intern(), null, 4, null);
            if (!this.onNavigationEvent) {
                int i2 = asInterface + 17;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                setOnOutOfMemeryErrorCallback.onExtraCallback(this.onExtraCallback, (Function1) null, 1, (Object) null);
            }
            int i4 = onTransact + 1;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onExtraCallbackWithResult(scrollToItem.onWarmupCompleted onwarmupcompleted) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 119;
            onTransact = i2 % 128;
            Map mapOnWarmupCompleted = null;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
                onwarmupcompleted.IAuthTabCallback();
                mapOnWarmupCompleted.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            NativeAdsDto.Reward rewardIAuthTabCallback = onwarmupcompleted.IAuthTabCallback();
            if (rewardIAuthTabCallback != null) {
                int i3 = onTransact + 113;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = new Object[1];
                b(TextUtils.getCapsMode("", 0, 0) + 1, ImageFormat.getBitsPerPixel(0) + 5, new char[]{65525, 4, '\t', 0}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 282, false, objArr);
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), rewardIAuthTabCallback.IAuthTabCallback());
                Object[] objArr2 = new Object[1];
                a(new char[]{14, 26, 23, 16, 26, 30}, (byte) (Color.alpha(0) + 80), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6, objArr2);
                mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), Double.valueOf(rewardIAuthTabCallback.onWarmupCompleted()))});
            }
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.onExtraCallback;
            Object[] objArr3 = new Object[1];
            a(new char[]{18, 28, 29, 17, '\r', 15, ' ', '\n', '\f', 26, 16, 0, 24, 18, ' ', 11, 16, 2}, (byte) (102 - Color.blue(0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 17, objArr3);
            getExponent.onExtraCallback(setonoutofmemeryerrorcallback, ((String) objArr3[0]).intern(), mapOnWarmupCompleted);
        }

        public void onExtraCallbackWithResult(NativeAdsDto.Reward reward) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 121;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(reward, "");
            Object[] objArr = new Object[1];
            b(1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 5 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{65525, 4, '\t', 0}, (ViewConfiguration.getTapTimeout() >> 16) + 282, false, objArr);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), reward.IAuthTabCallback());
            Object[] objArr2 = new Object[1];
            a(new char[]{14, 26, 23, 16, 26, 30}, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 80), (Process.myTid() >> 22) + 6, objArr2);
            Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), Double.valueOf(reward.onWarmupCompleted()))});
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.onExtraCallback;
            Object[] objArr3 = new Object[1];
            a(new char[]{18, 28, 29, 17, '\r', 15, ' ', '\n', '\f', 26, 16, 0, 24, 18, ' ', 11, 16, 2}, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 103), TextUtils.lastIndexOf("", '0', 0) + 19, objArr3);
            getExponent.onExtraCallback(setonoutofmemeryerrorcallback, ((String) objArr3[0]).intern(), mapOnWarmupCompleted);
            int i4 = asInterface + 97;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void IAuthTabCallback(NativeAdsDto nativeAdsDto) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 55;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(nativeAdsDto, "");
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.onExtraCallback;
            Object[] objArr = new Object[1];
            b(7 - (ViewConfiguration.getTouchSlop() >> 8), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13, new char[]{14, 4, 65503, 65535, 65500, '\t', '\n', 65535, 0, 14, 14, 4, '\b'}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 270, true, objArr);
            getExponent.onExtraCallback(setonoutofmemeryerrorcallback, ((String) objArr[0]).intern(), null, 4, null);
            int i4 = asInterface + 91;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = IAuthTabCallback;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i4 = 0; i4 < length; i4++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 26 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getWindowTouchSlop() >> 8) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
            Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 27 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Process.getGidForName("") + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i5 = $11 + 5;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i7 = $10 + 125;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0, 0) + 24824), 74 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 8088 - Drawable.resolveOpacity(0, 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            try {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0')), TextUtils.getOffsetBefore("", 0) + 30, 19488 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                                int i12 = $10 + 1;
                                $11 = i12 % 128;
                                int i13 = i12 % 2;
                            } else {
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i16 = 0; i16 < i; i16++) {
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r27, int r28, char r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getExponent.a(int, int, char, java.lang.Object[]):void");
    }

    public static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] IAuthTabCallback = {27163, 27364, 27361, 27361, 27175, 27293, 27295, 27289, 27310, 27287, 27288, 27184, 27468, 27465, 27470, 27312, 27466, 27242, 27160, 27173, 27173, 27173, 27197, 27171, 27170, 27197};
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public static final /* synthetic */ Map IAuthTabCallback(IAuthTabCallback iAuthTabCallback, NativeAdsError nativeAdsError) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback.onExtraCallback(nativeAdsError);
            }
            iAuthTabCallback.onExtraCallback(nativeAdsError);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private final Map<String, Object> onExtraCallback(NativeAdsError nativeAdsError) throws Throwable {
            int i = 2 % 2;
            Map mapOnExtraCallback = access8100.onExtraCallback();
            Object[] objArr = new Object[1];
            a(new int[]{0, 4, 70, 0}, true, new byte[]{1, 1, 1, 0}, objArr);
            mapOnExtraCallback.put(((String) objArr[0]).intern(), Integer.valueOf(nativeAdsError.onNavigationEvent()));
            Object[] objArr2 = new Object[1];
            a(new int[]{4, 7, 109, 0}, true, new byte[]{0, 0, 0, 0, 0, 0, 0}, objArr2);
            mapOnExtraCallback.put(((String) objArr2[0]).intern(), nativeAdsError.onExtraCallback());
            Object[] objArr3 = new Object[1];
            a(new int[]{11, 6, 153, 0}, false, new byte[]{1, 1, 0, 0, 0, 1}, objArr3);
            mapOnExtraCallback.put(((String) objArr3[0]).intern(), nativeAdsError.onExtraCallbackWithResult());
            String strIAuthTabCallback = nativeAdsError.IAuthTabCallback();
            if (strIAuthTabCallback != null) {
                if (!(!StringsKt.isBlank(strIAuthTabCallback))) {
                    int i2 = onNavigationEvent + 57;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    strIAuthTabCallback = null;
                }
                if (strIAuthTabCallback != null) {
                    int i4 = onNavigationEvent + 125;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        Object[] objArr4 = new Object[1];
                        a(new int[]{17, 9, 0, 2}, true, new byte[]{1, 1, 0, 1, 0, 0, 0, 0, 1}, objArr4);
                        mapOnExtraCallback.put(((String) objArr4[0]).intern(), strIAuthTabCallback);
                    } else {
                        Object[] objArr5 = new Object[1];
                        a(new int[]{17, 9, 0, 2}, false, new byte[]{1, 1, 0, 1, 0, 0, 0, 0, 1}, objArr5);
                        mapOnExtraCallback.put(((String) objArr5[0]).intern(), strIAuthTabCallback);
                    }
                }
            }
            return access8100.onExtraCallbackWithResult(mapOnExtraCallback);
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr = IAuthTabCallback;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i7 = 0; i7 < length; i7++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 35283), 35 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i4];
            System.arraycopy(cArr, i3, cArr3, 0, i4);
            if (bArr != null) {
                char[] cArr4 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i8 = $11 + 89;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10934), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 65, 16717 - TextUtils.lastIndexOf("", '0', 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            int i10 = 15 / 0;
                        } else {
                            int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10936 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), MotionEvent.axisFromString("") + 66, KeyEvent.normalizeMetaState(0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        }
                    } else {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (-16777187) - Color.rgb(0, 0, 0), View.resolveSize(0, 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - View.MeasureSpec.getMode(0)), KeyEvent.keyCodeFromString("") + 70, MotionEvent.axisFromString("") + 12487, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                int i13 = $10 + 69;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                int i15 = $11 + 113;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    char[] cArr5 = new char[i4];
                    System.arraycopy(cArr3, 0, cArr5, 0, i4);
                    System.arraycopy(cArr5, 0, cArr3, i4 << i6, i6);
                    System.arraycopy(cArr5, i6, cArr3, 0, i4 - i6);
                } else {
                    char[] cArr6 = new char[i4];
                    System.arraycopy(cArr3, 0, cArr6, 0, i4);
                    int i16 = i4 - i6;
                    System.arraycopy(cArr6, 0, cArr3, i16, i6);
                    System.arraycopy(cArr6, i6, cArr3, 0, i16);
                }
            }
            if (!(!z)) {
                int i17 = $10 + 75;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                char[] cArr7 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i19 = $10 + 29;
                    $11 = i19 % 128;
                    if (i19 % 2 == 0) {
                        cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[i4 % trackGroupExternalSyntheticLambda0.onNavigationEvent];
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent / 0;
                    } else {
                        cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                    }
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                    int i20 = $11 + 71;
                    $10 = i20 % 128;
                    int i21 = i20 % 2;
                }
                cArr3 = cArr7;
            }
            if (i5 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackStub = new char[]{61190, 4050, 11926, 19813, 27736, 35634, 43986, 51931, 59827, 2170, 10078, 17962, 26311, 34269, 42168, 50035, 57931, 296, 60859, 3439, 11327, 20431, 28371, 35221, 43333, 51312, 6073, 63341, 54845, 46541, 38091, 29586, 21336, 12919, 4379, 61656, 57335, 48792, 40517, 32105, 61707, 4575, 12431, 21375, 29299, 38177, 46579, 54484, 63399, 5756, 14674, 60839, 3428, 11277, 20440, 28393, 35218, 43332, 51278, 60184, 14452};
        asBinder = 1997659264167775489L;
        access100 = 8696827085430328116L;
    }
}
