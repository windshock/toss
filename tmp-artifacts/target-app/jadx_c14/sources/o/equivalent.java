package o;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.JsonObject;
import im.toss.core.tuba.TriggersResult;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AUTextView;
import o.adInfo;
import o.equivalent;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.TubaTriggerMessageHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class equivalent implements ALCFaceQuality {
    public static final IAuthTabCallback Companion;
    private static int onExtraCallbackWithResult;
    private static final wie2 onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {15, -12, 105, 108};
    private static final int $$b = 83;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, byte r8) {
        /*
            byte[] r0 = o.equivalent.$$a
            int r7 = r7 * 2
            int r1 = 1 - r7
            int r8 = r8 * 3
            int r8 = r8 + 105
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.equivalent.$$c(int, short, byte):java.lang.String");
    }

    public static /* synthetic */ boolean IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(str, str2);
        }
        onWarmupCompleted(str, str2);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(adinfo);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(adinfo);
        int i3 = IAuthTabCallback + 37;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = IAuthTabCallback + 53;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = IAuthTabCallback + 101;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = IAuthTabCallback + 23;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 == 0) {
            throw null;
        }
        int i6 = onExtraCallback + 3;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new TubaTriggerMessageHandler$.ExternalSyntheticLambda1());
        int i2 = IAuthTabCallback + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final boolean onWarmupCompleted(String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zOnWarmupCompleted = filterCreatePageParams.onWarmupCompleted(Uri.parse(str));
        int i4 = onExtraCallback + 123;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Object[] objArr = new Object[1];
        a(View.getDefaultSize(0, 0) + 17, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 8, new char[]{65531, 65532, 15, 65518, 5, 65533, 65535, 2, 65533, '\r', '\f', 65535, 1, 1, 3, '\f', 65518}, true, TextUtils.indexOf((CharSequence) "", '0', 0) + 279, objArr);
        if (Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
            int i2 = onExtraCallback + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            dispatchEvent dispatchevent = dispatchEvent.onNavigationEvent;
            Object[] objArr2 = new Object[1];
            a(4 - (Process.myTid() >> 22), (ViewConfiguration.getTapTimeout() >> 16) + 3, new char[]{65530, 7, 4, 65531}, false, TextUtils.getCapsMode("", 0, 0) + 279, objArr2);
            Object[] objArr3 = {setonoutofmemeryerrorcallback, Boolean.valueOf(dispatchevent.onWarmupCompleted(((String) objArr2[0]).intern()).onExtraCallbackWithResult())};
            int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            ALCFaceBox.onWarmupCompleted(-2103726265, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr3, iIAuthTabCallback2, 2103726265);
            int i4 = IAuthTabCallback + 57;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        Object[] objArr4 = new Object[1];
        a(15 - TextUtils.getOffsetBefore("", 0), 2 - (ViewConfiguration.getScrollBarSize() >> 8), new char[]{65533, 11, 11, '\n', 65533, 65535, 65535, 1, '\n', 65516, 65529, 65530, '\r', 65516, '\f'}, true, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 279, objArr4);
        if (!Intrinsics.areEqual(str, ((String) objArr4[0]).intern())) {
            return;
        }
        Object[] objArr5 = new Object[1];
        a(6 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 6 - Color.alpha(0), new char[]{'\b', 2, 65526, 7, 65526, 5}, true, 283 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr5);
        String string = jsonObject.getAsJsonObject(((String) objArr5[0]).intern()).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        wie2 wie2Var = onNavigationEvent;
        wie2Var.onExtraCallback();
        TriggersResult triggersResult = (TriggersResult) wie2Var.onExtraCallback(TriggersResult.Companion.serializer(), string);
        dispatchEvent dispatchevent2 = dispatchEvent.onNavigationEvent;
        Object[] objArr6 = new Object[1];
        a(Color.green(0) + 4, 3 - TextUtils.getOffsetBefore("", 0), new char[]{65530, 7, 4, 65531}, false, 279 - (Process.myPid() >> 22), objArr6);
        dispatchevent2.onWarmupCompleted(((String) objArr6[0]).intern()).IAuthTabCallback(triggersResult.onExtraCallback());
        setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    static {
        onExtraCallbackWithResult = 0;
        onWarmupCompleted();
        Companion = new IAuthTabCallback(null);
        onNavigationEvent = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.TubaTriggerMessageHandler$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return equivalent.onExtraCallbackWithResult((adInfo) obj);
            }
        }, 1, (Object) null);
        int i = onTransact + 21;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onNavigationEvent(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(adinfo, "");
            adinfo.IAuthTabCallbackDefault(false);
            adinfo.IAuthTabCallback(false);
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback3, 186882589, new Object[]{adinfo, false}, iOnExtraCallback2, iOnExtraCallback);
            adinfo.onExtraCallbackWithResult(false);
            adinfo.onNavigationEvent(true);
        } else {
            Intrinsics.checkNotNullParameter(adinfo, "");
            adinfo.IAuthTabCallbackDefault(true);
            adinfo.IAuthTabCallback(true);
            int iOnExtraCallback4 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback5 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback6 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback6, 186882589, new Object[]{adinfo, true}, iOnExtraCallback5, iOnExtraCallback4);
            adinfo.onExtraCallbackWithResult(true);
            adinfo.onNavigationEvent(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r21, int r22, char[] r23, boolean r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.equivalent.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = 478309017;
    }
}
