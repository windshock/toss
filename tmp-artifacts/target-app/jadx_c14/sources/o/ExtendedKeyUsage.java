package o;

import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ExtendedKeyUsage implements ALCFaceQuality {
    private static final onNavigationEvent Companion;

    @Deprecated
    public static final String IAuthTabCallback;
    private static char[] IAuthTabCallbackDefault;
    private static long asInterface;

    @Deprecated
    public static final String onExtraCallback;

    @Deprecated
    public static final String onExtraCallbackWithResult;

    @Deprecated
    public static final String onNavigationEvent;
    private static int onTransact;

    @Deprecated
    public static final String onWarmupCompleted;
    private static final byte[] $$a = {119, -40, 16, 123};
    private static final int $$b = 238;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, byte r8) {
        /*
            int r7 = r7 + 4
            byte[] r0 = o.ExtendedKeyUsage.$$a
            int r8 = r8 * 4
            int r8 = r8 + 97
            int r6 = r6 * 4
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ExtendedKeyUsage.$$c(short, short, byte):java.lang.String");
    }

    static {
        onTransact = 1;
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a((-1) - Process.getGidForName(""), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23, (char) (43148 - (Process.myPid() >> 22)), objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(MotionEvent.axisFromString("") + 24, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
        onWarmupCompleted = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(45 - ExpandableListView.getPackedPositionGroup(0L), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 19, (char) ExpandableListView.getPackedPositionType(0L), objArr3);
        onExtraCallback = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(65 - (ViewConfiguration.getWindowTouchSlop() >> 8), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14, (char) (View.getDefaultSize(0, 0) + 65336), objArr4);
        onNavigationEvent = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(TextUtils.lastIndexOf("", '0') + 81, 16 - KeyEvent.normalizeMetaState(0), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr5);
        onExtraCallbackWithResult = ((String) objArr5[0]).intern();
        Companion = new onNavigationEvent(null);
        int i = asBinder + 41;
        onTransact = i % 128;
        if (i % 2 == 0) {
            int i2 = 83 / 0;
        }
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onExtraCallback();
        }
        super/*o.drawTextBox*/.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 47;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = IAuthTabCallbackStub + 85;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 16 / 0;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback_Parcel + 51;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 53;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = IAuthTabCallback_Parcel + 45;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel + 75;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
            r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context != null) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(setonoutofmemeryerrorcallback, jsonObject, context, (access13800) null), 3, (Object) null);
            return;
        }
        Object[] objArr = new Object[1];
        a(80 - (ViewConfiguration.getEdgeSlop() >> 16), 16 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0), objArr);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, (String) null, ((String) objArr[0]).intern(), (Map) null, 5, (Object) null);
        int i3 = IAuthTabCallback_Parcel + 105;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r29, int r30, char r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ExtendedKeyUsage.a(int, int, char, java.lang.Object[]):void");
    }

    static void onWarmupCompleted() {
        IAuthTabCallbackDefault = new char[]{17689, 62510, 10008, 22061, 33137, 12398, 25425, 37448, 52652, 31899, 44958, 57051, 2550, 47319, 60362, 9506, 21552, 34571, 13938, 24938, 36956, 49991, 29350, 60826, 23689, 36783, 65205, 10702, 39111, 52204, 15083, 25862, 54330, 1829, 30285, 41308, 4219, 17274, 36247, 64701, 12213, 40643, 51659, 14579, 27616, 60826, 23689, 36783, 65205, 10702, 39111, 52204, 15083, 25862, 54330, 1829, 30285, 41295, 4223, 17252, 36255, 64698, 12194, 40657, 51664, 4773, 41904, 28830, 411, 55016, 26623, 13508, 50637, 39470, 11019, 63497, 35199, 24177, 61269, 48196, 60821, 23682, 36788, 65213, 10713, 39128, 52221, 15076, 25872, 54313, 1830, 30291, 41285, 4210, 17261, 36254};
        asInterface = 6711005566333312198L;
    }
}
