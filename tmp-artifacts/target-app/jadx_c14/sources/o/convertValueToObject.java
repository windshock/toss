package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
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
import com.google.gson.JsonObject;
import im.toss.base.BaseActivity;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class convertValueToObject implements ALCFaceQuality {
    public static final onExtraCallbackWithResult Companion;
    private static final String IAuthTabCallback;
    private static char[] IAuthTabCallbackStub;
    private static int getInterfaceDescriptor;
    public static final int onExtraCallbackWithResult;
    private static int onTransact;
    private setOnOutOfMemeryErrorCallback onNavigationEvent;
    private static final byte[] $$a = {119, -27, 13, -93};
    private static final int $$b = 180;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 1;
    private long onWarmupCompleted = -1;
    private String asInterface = "";
    private String IAuthTabCallbackDefault = "";
    private String asBinder = "";
    private String onExtraCallback = "";

    private static String $$c(int i, short s, byte b) {
        byte[] bArr = $$a;
        int i2 = 3 - (b * 2);
        int i3 = s * 3;
        int i4 = (i * 4) + 105;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 = i3 + i4;
        }
        while (true) {
            i5++;
            i2++;
            bArr2[i5] = (byte) i4;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i4 += bArr[i2];
        }
    }

    static {
        getInterfaceDescriptor = 0;
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new int[]{0, 15, 28, 1}, true, new byte[]{1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0}, objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        Companion = new onExtraCallbackWithResult(null);
        onExtraCallbackWithResult = 8;
        int i = access000 + 55;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 27;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 27;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = IAuthTabCallback_Parcel + 31;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 69;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = access100 + 93;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = access100 + 107;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel + 59;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 != 0) {
            throw null;
        }
        int i6 = access100 + 125;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        BaseActivity baseActivity;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        BaseActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (activity instanceof BaseActivity) {
            int i2 = access100 + 105;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                baseActivity = activity;
                int i3 = 9 / 0;
            } else {
                baseActivity = activity;
            }
        } else {
            baseActivity = null;
        }
        BaseActivity baseActivity2 = baseActivity;
        if (baseActivity2 == null) {
            return;
        }
        Object[] objArr = new Object[1];
        a(new int[]{44, 8, 0, 5}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1}, objArr);
        Object[] objArr2 = {settext, ((String) objArr[0]).intern(), -1L};
        this.onWarmupCompleted = ((Long) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -616100104, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 616100108, objArr2)).longValue();
        String string = baseActivity2.getString(R.string.app_tossone_intro_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr3 = new Object[1];
        b((ViewConfiguration.getJumpTapTimeout() >> 16) + 3, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9, new char[]{'\t', 3, 65534, 65530, 1, '\t', 65534, 65513, 4, 7}, ExpandableListView.getPackedPositionChild(0L) + 150, true, objArr3);
        this.asInterface = settext.onNavigationEvent(((String) objArr3[0]).intern(), string);
        Object[] objArr4 = new Object[1];
        b(13 - MotionEvent.axisFromString(""), ((Process.getThreadPriority(0) + 20) >> 6) + 14, new char[]{'\r', 65534, 11, 6, '\f', 65513, 65530, 0, 65534, 65517, 2, '\r', 5, 65534}, View.resolveSize(0, 0) + 145, false, objArr4);
        this.IAuthTabCallbackDefault = settext.onNavigationEvent(((String) objArr4[0]).intern(), "");
        Object[] objArr5 = new Object[1];
        b(((Process.getThreadPriority(0) + 20) >> 6) + 11, 16 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{65533, 65507, 65535, 1, 65531, 65514, '\r', 7, '\f', 65535, 14, 6, '\f', 65519, '\b', '\t'}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 143, true, objArr5);
        this.asBinder = settext.onNavigationEvent(((String) objArr5[0]).intern(), "");
        Object[] objArr6 = new Object[1];
        b(11 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 17 - TextUtils.indexOf("", ""), new char[]{65535, 65511, 1, '\t', 6, 65531, 3, 65502, 14, 3, 18, 65535, 65535, 1, 65531, '\r', '\r'}, 144 - TextUtils.getCapsMode("", 0, 0), true, objArr6);
        this.onExtraCallback = settext.onNavigationEvent(((String) objArr6[0]).intern(), "");
        if (this.onWarmupCompleted < 0) {
            int i4 = IAuthTabCallback_Parcel + 61;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            String string2 = baseActivity2.getString(R.string.app_common_web_message_handlers___1cf8c19a12);
            Object[] objArr7 = new Object[1];
            b(TextUtils.indexOf((CharSequence) "", '0') + 13, 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{65524, 65535, 65532, 65527, 18, 5, 65528, 4, '\b', 65528, 6, 7, 65532, 1, '\t'}, 119 - TextUtils.getCapsMode("", 0, 0), false, objArr7);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, string2, ((String) objArr7[0]).intern(), (Map) null, 4, (Object) null);
            int i6 = access100 + 3;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
        }
        this.onNavigationEvent = setonoutofmemeryerrorcallback;
        Intent intentOnExtraCallback = resumeForClick.asBinder.onExtraCallback(baseActivity2, IAuthTabCallback());
        if (intentOnExtraCallback != null) {
            PageAnimStore.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, intentOnExtraCallback, 1000, (Bundle) null, 4, (Object) null);
            return;
        }
        Object[] objArr8 = {setonoutofmemeryerrorcallback, Boolean.FALSE};
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        ALCFaceBox.onWarmupCompleted(-2103726265, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr8, iIAuthTabCallback2, 2103726265);
    }

    private final String IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{15, 29, 152, 0}, true, new byte[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0}, objArr);
        Uri.Builder builderBuildUpon = Uri.parse(((String) objArr[0]).intern()).buildUpon();
        Object[] objArr2 = new Object[1];
        a(new int[]{44, 8, 0, 5}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1}, objArr2);
        builderBuildUpon.appendQueryParameter(((String) objArr2[0]).intern(), String.valueOf(this.onWarmupCompleted));
        Object[] objArr3 = new Object[1];
        b(2 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{'\t', 3, 65534, 65530, 1, '\t', 65534, 65513, 4, 7}, 149 - (ViewConfiguration.getJumpTapTimeout() >> 16), true, objArr3);
        builderBuildUpon.appendQueryParameter(((String) objArr3[0]).intern(), this.asInterface);
        Object[] objArr4 = new Object[1];
        b(TextUtils.lastIndexOf("", '0', 0, 0) + 15, 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{'\r', 65534, 11, 6, '\f', 65513, 65530, 0, 65534, 65517, 2, '\r', 5, 65534}, 145 - View.MeasureSpec.getMode(0), false, objArr4);
        builderBuildUpon.appendQueryParameter(((String) objArr4[0]).intern(), this.IAuthTabCallbackDefault);
        Object[] objArr5 = new Object[1];
        b(11 - View.MeasureSpec.makeMeasureSpec(0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 16, new char[]{65533, 65507, 65535, 1, 65531, 65514, '\r', 7, '\f', 65535, 14, 6, '\f', 65519, '\b', '\t'}, 144 - (ViewConfiguration.getScrollDefaultDelay() >> 16), true, objArr5);
        builderBuildUpon.appendQueryParameter(((String) objArr5[0]).intern(), this.asBinder);
        Object[] objArr6 = new Object[1];
        b((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11, View.resolveSize(0, 0) + 17, new char[]{65535, 65511, 1, '\t', 6, 65531, 3, 65502, 14, 3, 18, 65535, 65535, 1, 65531, '\r', '\r'}, 144 - View.MeasureSpec.makeMeasureSpec(0, 0), true, objArr6);
        builderBuildUpon.appendQueryParameter(((String) objArr6[0]).intern(), this.onExtraCallback);
        String string = builderBuildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = IAuthTabCallback_Parcel + 79;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x05b3, code lost:
    
        if (o.zzaj.onNavigationEvent().onActivityLayout() == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x05c1, code lost:
    
        if (o.zzaj.onNavigationEvent().onActivityLayout() == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x05c3, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x05c5, code lost:
    
        r2 = java.lang.Throwable.class.getSimpleName();
        r3 = new java.lang.StringBuilder();
        r3.append(r2);
        r5 = new java.lang.Object[1];
        a(new int[]{53, 17, 0, 7}, false, new byte[]{0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0}, r5);
        r3.append(((java.lang.String) r5[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x05f9, code lost:
    
        throw new java.lang.IllegalArgumentException(r3.toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v30, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r9v32, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r9v33, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r9v34, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r9v35, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Double] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallback(@org.jetbrains.annotations.NotNull o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r17, @org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull com.google.gson.JsonObject r19, @org.jetbrains.annotations.NotNull o.setOnOutOfMemeryErrorCallback r20, int r21, int r22, @org.jetbrains.annotations.Nullable android.os.Bundle r23, @org.jetbrains.annotations.Nullable android.net.Uri r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.convertValueToObject.onExtraCallback(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, java.lang.String, com.google.gson.JsonObject, o.setOnOutOfMemeryErrorCallback, int, int, android.os.Bundle, android.net.Uri):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r21, int r22, char[] r23, int r24, boolean r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.convertValueToObject.b(int, int, char[], int, boolean, java.lang.Object[]):void");
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = IAuthTabCallbackStub;
        if (cArr != null) {
            int i7 = $11 + 83;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i9 = 0; i9 < length; i9++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35331 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 35, 14238 - ImageFormat.getBitsPerPixel(0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
                    int i10 = $11 + 105;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 66 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        throw null;
                    }
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10936 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.getOffsetBefore("", 0) + 65, 16718 - KeyEvent.keyCodeFromString(""), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), Gravity.getAbsoluteGravity(0, 0) + 29, View.getDefaultSize(0, 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - KeyEvent.getDeadChar(0, 0)), 70 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Color.blue(0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i14 = $11 + 101;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 1, cArr5, 0, i4);
                System.arraycopy(cArr5, 0, cArr3, i4 >> i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 1, i4 * i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i15 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i15, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i15);
            }
        }
        if (z) {
            char[] cArr7 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i16 = $11 + 105;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 % trackGroupExternalSyntheticLambda0.onNavigationEvent) >> 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent % 1;
                } else {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
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

    static void onWarmupCompleted() {
        IAuthTabCallbackStub = new char[]{27262, 27183, 27178, 27181, 27155, 27174, 27169, 27170, 27175, 27172, 27195, 27170, 27179, 27169, 27196, 27341, 27462, 27461, 27463, 27469, 27306, 27302, 27469, 27466, 27314, 27323, 27471, 27320, 27319, 27461, 27463, 27463, 27303, 27273, 27266, 27296, 27461, 27463, 27463, 27461, 27469, 27468, 27460, 27458, 27257, 27175, 27174, 27156, 27160, 27179, 27171, 27199, 27224, 27254, 27198, 27169, 27198, 27197, 27170, 27178, 27148, 27146, 27168, 27143, 27145, 27168, 27199, 27140, 27143, 27194};
        onTransact = 478308867;
    }
}
