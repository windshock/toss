package viva.republica.toss.common.web.message.handlers;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceQuality;
import o.ALCFaceValidation;
import o.BaseRoundCornerProgressBarSavedState1;
import o.GriverCreateFragmentCallBack;
import o.GriverDecodeUrl;
import o.PageAnimStore;
import o.Response;
import o.UserChoiceBillingListener;
import o.access13800;
import o.createFragment4Url;
import o.fetchAppInfoListByIds;
import o.maybeUpdateAnimatable;
import o.onOutOfMemory;
import o.putChannelInfo;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.setOnOutOfMemeryErrorCallback;
import o.setText;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RequestSelfieHandler implements ALCFaceQuality {
    public static final Companion Companion;
    public static final String IAuthTabCallback;
    public static final String IAuthTabCallbackDefault;
    public static final String IAuthTabCallbackStub;
    private static char IAuthTabCallbackStubProxy;
    private static char[] access000;
    private static int access100;
    public static final String asInterface;
    public static final String onExtraCallback;
    public static final String onExtraCallbackWithResult;
    public static final int onNavigationEvent;
    private static final String onTransact;
    public static final String onWarmupCompleted;
    private static int writeTypedObject;
    private static final byte[] $$a = {120, 11, 65, 93};
    private static final int $$b = 217;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int readTypedObject = 0;
    private static int getInterfaceDescriptor = 0;
    private static int ICustomTabsCallback = 1;
    private String asBinder = "";
    private final Lazy IAuthTabCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.web.message.handlers.RequestSelfieHandler$$ExternalSyntheticLambda0
        public final Object invoke() {
            return RequestSelfieHandler.onWarmupCompleted();
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, short r8, short r9) {
        /*
            byte[] r0 = viva.republica.toss.common.web.message.handlers.RequestSelfieHandler.$$a
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r9 = r9 * 4
            int r9 = r9 + 4
            int r7 = r7 * 3
            int r7 = 105 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r5 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            r6 = r9
            r9 = r7
            r7 = r6
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r9 = r9 + 1
            int r7 = r7 + r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestSelfieHandler.$$c(int, short, short):java.lang.String");
    }

    static {
        writeTypedObject = 1;
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(19 - Process.getGidForName(""), 17 - TextUtils.getOffsetBefore("", 0), new char[]{15, 65535, '\r', 14, 65517, 65535, 6, 0, 3, 65535, 65506, 65531, '\b', 65534, 6, 65535, '\f', 65516, 65535, 11}, false, 131 - TextUtils.getOffsetAfter("", 0), objArr);
        onTransact = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14, 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{65529, 65530, 1, 65534, 65526, 65531, 20, 65529, 65526, 4, 1, 20, 0, 65529, '\b'}, true, 105 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
        IAuthTabCallbackStub = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(20 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 2 - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{'\b', 65529, 65528, 4, 65529, 6, 1, 65533, 7, 7, 65533, 3, 2, 19, 6, 65529, 65534, 65529, 65527}, false, 105 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr3);
        asInterface = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(15 - Color.red(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 13, new char[]{5, 5, 2, 5, 18, 1, 2, 18, 65526, 65524, 0, 65528, 5, 65524, 65528}, false, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 105, objArr4);
        IAuthTabCallbackDefault = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        b((byte) (Color.blue(0) + 38), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23, new char[]{27, 16, 16, 6, 27, '\"', 18, '-', 13818, 13818, 3, 2, 23, 6, 16, 21, 26, 21, 18, '-', 30, 21, 18, '0'}, objArr5);
        IAuthTabCallback = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        b((byte) (96 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 8 - TextUtils.getCapsMode("", 0, 0), new char[]{18, '-', 24, 18, 24, 30, 30, 2}, objArr6);
        onExtraCallback = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        b((byte) (TextUtils.indexOf((CharSequence) "", '0') + 25), 13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{27, 16, 16, 6, 27, '\"', 18, '-', 30, 21, 18, '0'}, objArr7);
        onWarmupCompleted = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        b((byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 19), 19 - TextUtils.getTrimmedLength(""), new char[]{'-', ' ', 2, 22, 18, 27, '+', 4, 23, 25, 24, 21, 24, '&', 24, 15, 2, 21, 13810}, objArr8);
        onExtraCallbackWithResult = ((String) objArr8[0]).intern();
        Companion = new Companion(null);
        onNavigationEvent = 8;
        int i = readTypedObject + 123;
        writeTypedObject = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ createFragment4Url onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 107;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        createFragment4Url createfragment4urlIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i4 = getInterfaceDescriptor + 29;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return createfragment4urlIAuthTabCallbackStub;
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    public static final /* synthetic */ Object IAuthTabCallback(RequestSelfieHandler requestSelfieHandler, byte[] bArr, String str, BaseRoundCornerProgressBarSavedState1.IAuthTabCallback iAuthTabCallback, boolean z, boolean z2, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 1;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = requestSelfieHandler.onExtraCallback(bArr, str, iAuthTabCallback, z, z2, access13800Var);
        int i4 = ICustomTabsCallback + 41;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallback;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 99;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = getInterfaceDescriptor + 63;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return onoutofmemoryOnExtraCallback;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = ICustomTabsCallback + 121;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 53;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        int i5 = ICustomTabsCallback + 19;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 7;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 == 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = ICustomTabsCallback + 7;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final createFragment4Url asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 95;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        createFragment4Url createfragment4url = (createFragment4Url) this.IAuthTabCallback_Parcel.getValue();
        int i3 = ICustomTabsCallback + 73;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return createfragment4url;
        }
        obj.hashCode();
        throw null;
    }

    private static final createFragment4Url IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 67;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        createFragment4Url createfragment4urlMediaSessionCompatToken = ((fetchAppInfoListByIds) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), fetchAppInfoListByIds.class)).MediaSessionCompatToken();
        int i4 = ICustomTabsCallback + 53;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return createfragment4urlMediaSessionCompatToken;
    }

    public void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) throws Throwable {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        if (i == 809) {
            int i4 = getInterfaceDescriptor + 49;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, jsonObject, setonoutofmemeryerrorcallback, i2, bundle);
        }
        int i6 = getInterfaceDescriptor + 13;
        ICustomTabsCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onExtraCallback(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r28, com.google.gson.JsonObject r29, o.setOnOutOfMemeryErrorCallback r30, int r31, android.os.Bundle r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestSelfieHandler.onExtraCallback(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, com.google.gson.JsonObject, o.setOnOutOfMemeryErrorCallback, int, android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r20, int r21, char[] r22, boolean r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestSelfieHandler.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    private final Object onExtraCallback(byte[] bArr, String str, BaseRoundCornerProgressBarSavedState1.IAuthTabCallback iAuthTabCallback, boolean z, boolean z2, access13800<? super JsonObject> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onWarmupCompleted(), new RequestSelfieHandler$processSelfiePayload$2(bArr, str, iAuthTabCallback, z, z2, null), access13800Var);
        int i2 = ICustomTabsCallback + 67;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        Intent intentOnWarmupCompleted;
        createFragment4Url createfragment4urlAsBinder;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        String str4;
        boolean z3;
        GriverCreateFragmentCallBack griverCreateFragmentCallBack;
        boolean z4;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 11;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context == null) {
            return;
        }
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        b((byte) (6 - Color.red(0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 9, new char[]{0, 6, '\f', '/', 19, '$', 0, ')', 13829}, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        b((byte) (View.combineMeasuredStates(0, 0) + 108), View.getDefaultSize(0, 0) + 9, new char[]{')', 29, '&', '\t', 27, '+', '%', 14, 13921}, objArr2);
        Object[] objArr3 = {settext, ((String) objArr2[0]).intern(), true};
        boolean zBooleanValue = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, objArr3)).booleanValue();
        Object[] objArr4 = new Object[1];
        a(View.resolveSize(0, 0) + 3, View.resolveSizeAndState(0, 0, 0) + 2, new char[]{65528, 65534, '\f'}, true, 138 - View.resolveSizeAndState(0, 0, 0), objArr4);
        this.asBinder = settext.onNavigationEvent(((String) objArr4[0]).intern(), "");
        Object[] objArr5 = new Object[1];
        b((byte) (ImageFormat.getBitsPerPixel(0) + 75), 16 - (ViewConfiguration.getScrollBarSize() >> 8), new char[]{2, 19, ')', ',', '(', 14, 0, 5, 29, 4, ')', '#', 30, '\'', 28, '*'}, objArr5);
        Object[] objArr6 = {settext, ((String) objArr5[0]).intern(), 20000L};
        long jLongValue = ((Long) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -616100104, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 616100108, objArr6)).longValue();
        Object[] objArr7 = new Object[1];
        a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14, 9 - TextUtils.getOffsetBefore("", 0), new char[]{3, 2, 65512, 65533, 1, 65529, 3, '\t', '\b', 1, 65533, 7, 7, 65533}, false, Process.getGidForName("") + 138, objArr7);
        Object[] objArr8 = {settext, ((String) objArr7[0]).intern(), 30000L};
        long jLongValue2 = ((Long) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -616100104, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 616100108, objArr8)).longValue();
        Object[] objArr9 = new Object[1];
        b((byte) (49 - ((byte) KeyEvent.getModifierMetaStateMask())), 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{18, 30, '%', 14, '!', '(', 28, '*', '$', '&', '+', 6, '\"', 11, 13856}, objArr9);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr9[0]).intern(), "");
        Object[] objArr10 = new Object[1];
        a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12, 13 - Gravity.getAbsoluteGravity(0, 0), new char[]{65527, 2, '\n', 65496, 11, '\n', '\n', 5, 4, 65514, 65531, 14, '\n'}, false, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 135, objArr10);
        String strOnNavigationEvent3 = settext.onNavigationEvent(((String) objArr10[0]).intern(), "");
        JsonObject jsonObjectOnExtraCallbackWithResult = settext.onExtraCallbackWithResult();
        Object[] objArr11 = new Object[1];
        b((byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 39), 12 - View.MeasureSpec.getSize(0), new char[]{1, 20, '\'', 28, 20, ',', 0, ')', '/', 5, 29, '\''}, objArr11);
        Object objFromJson = new Gson().fromJson(jsonObjectOnExtraCallbackWithResult.getAsJsonArray(((String) objArr11[0]).intern()), GriverDecodeUrl[].class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "");
        List list = ArraysKt.toList((Object[]) objFromJson);
        Object[] objArr12 = new Object[1];
        b((byte) (49 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 18 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{')', '%', 7, '$', 19, '%', 0, '\'', 20, 5, 11, '\'', 20, 3, 7, '\'', 23, 14, 13873}, objArr12);
        Object[] objArr13 = {settext, ((String) objArr12[0]).intern(), false};
        boolean zBooleanValue2 = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, objArr13)).booleanValue();
        Object[] objArr14 = new Object[1];
        a(27 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 23, new char[]{2, 5, '\t', 6, 65530, 65516, 5, 65530, 7, '\b', 2, '\r', 2, 65533, 65533, 65498, 65534, 65533, 14, 5, 65532, 7, 2, '\f', 0, 7}, true, View.MeasureSpec.getMode(0) + 132, objArr14);
        Object[] objArr15 = {settext, ((String) objArr14[0]).intern(), false};
        boolean zBooleanValue3 = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, objArr15)).booleanValue();
        Object[] objArr16 = new Object[1];
        b((byte) (77 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 25 - (ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{')', '/', 1, 18, 28, 14, '!', ' ', '/', 5, '\"', '.', 29, '\'', '(', 15, 0, 5, 29, 25, '0', '\r', 30, '!', 13878}, objArr16);
        Object[] objArr17 = {settext, ((String) objArr16[0]).intern(), false};
        boolean zBooleanValue4 = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, objArr17)).booleanValue();
        Object[] objArr18 = new Object[1];
        a(17 - Color.red(0), 12 - View.MeasureSpec.getMode(0), new char[]{65515, 11, 11, 65533, 65531, 65531, '\r', 65515, '\b', 1, 3, 11, 6, 65533, 65533, '\n', 65531}, true, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 132, objArr18);
        Object[] objArr19 = {settext, ((String) objArr18[0]).intern(), false};
        boolean zBooleanValue5 = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, objArr19)).booleanValue();
        if (zBooleanValue) {
            int i4 = getInterfaceDescriptor + 49;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 == 0) {
                createfragment4urlAsBinder = asBinder();
                str2 = "";
                str3 = "";
                z = false;
                z2 = true;
                str4 = null;
                z3 = true;
                griverCreateFragmentCallBack = null;
                z4 = true;
            } else {
                createfragment4urlAsBinder = asBinder();
                str2 = "";
                str3 = "";
                z = false;
                z2 = false;
                str4 = null;
                z3 = false;
                griverCreateFragmentCallBack = null;
                z4 = false;
            }
            intentOnWarmupCompleted = createFragment4Url.IAuthTabCallback(createfragment4urlAsBinder, context, strOnNavigationEvent, list, jLongValue, jLongValue2, strOnNavigationEvent2, strOnNavigationEvent3, zBooleanValue2, str2, str3, z, zBooleanValue3, z2, zBooleanValue4, str4, z3, griverCreateFragmentCallBack, zBooleanValue5, z4, (Map) null, (String) null, 1954816, (Object) null);
        } else {
            intentOnWarmupCompleted = createFragment4Url.onWarmupCompleted(asBinder(), context, list, jLongValue, jLongValue2, (String) null, (String) null, strOnNavigationEvent2, strOnNavigationEvent3, zBooleanValue2, "", strOnNavigationEvent, false, false, zBooleanValue3, zBooleanValue4, (GriverCreateFragmentCallBack) null, zBooleanValue5, (String) null, 167984, (Object) null);
        }
        PageAnimStore.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, intentOnWarmupCompleted, 809, (Bundle) null, 4, (Object) null);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r30, int r31, char[] r32, java.lang.Object[] r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestSelfieHandler.b(byte, int, char[], java.lang.Object[]):void");
    }

    static void IAuthTabCallback() {
        access100 = 478308916;
        access000 = new char[]{65016, 64999, 65020, 64968, 64976, 64981, 64978, 64983, 64992, 64975, 64964, 64963, 65012, 64971, 64995, 64991, 64961, 65008, 64915, 65013, 64993, 64966, 65018, 65014, 64997, 65021, 64970, 65004, 65022, 64980, 64969, 65023, 64982, 65009, 64987, 64967, 64960, 64988, 64998, 64972, 64986, 64990, 65011, 65019, 65015, 64973, 65010, 64965, 64989};
        IAuthTabCallbackStubProxy = (char) 51246;
    }
}
