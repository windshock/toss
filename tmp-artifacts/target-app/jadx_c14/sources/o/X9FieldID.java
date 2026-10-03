package o;

import android.content.Context;
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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgsa;
import com.google.gson.JsonObject;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.pedometer.PedometerEnabledHandler$;
import viva.republica.toss.pedometer.PedometerService;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class X9FieldID implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static final String IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int access100 = 1;
    private static int asBinder;
    private static char asInterface;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char[] onTransact;
    private static char onWarmupCompleted;

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new char[]{46361, 41006, 61045, 44214, 2069, 3463, 47340, 47313, 3930, 22735, 27368, 8931, 57976, 33284, 37678, 29268, 15805, 45657, 41675, 7886, 48162, 51351, 31056, 47768}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22, objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        Companion = new onNavigationEvent(null);
        int i = asBinder + 91;
        access100 = i % 128;
        if (i % 2 == 0) {
            int i2 = 6 / 0;
        }
    }

    public static /* synthetic */ boolean IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 83;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(str, str2);
        }
        onNavigationEvent(str, str2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 49;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 == 0) {
            throw null;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStub + 11;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = IAuthTabCallbackDefault + 39;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = IAuthTabCallbackDefault + 71;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 105;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = IAuthTabCallbackDefault + 27;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new PedometerEnabledHandler$.ExternalSyntheticLambda0());
        int i2 = IAuthTabCallbackStub + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final boolean onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return filterCreatePageParams.IAuthTabCallback(Uri.parse(str));
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        filterCreatePageParams.IAuthTabCallback(Uri.parse(str));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Object[] objArr = new Object[1];
        a(new char[]{27369, 36487, 46440, 10856, 37678, 29268, 60984, 59047, 49781, 53601, 10223, 44670, 50850, 42852, 5818, 58575, 48162, 51351, 40244, 61608}, 19 - View.combineMeasuredStates(0, 0), objArr);
        if (Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
            setText settext = new setText(jsonObject);
            Object[] objArr2 = new Object[1];
            a(new char[]{28427, 47530, 5818, 58575, 48162, 51351, 40244, 61608}, 7 - TextUtils.getOffsetAfter("", 0), objArr2);
            Object[] objArr3 = {settext, ((String) objArr2[0]).intern(), false};
            if (!(!((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, objArr3)).booleanValue())) {
                onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback);
                return;
            } else {
                onExtraCallbackWithResult(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback);
                return;
            }
        }
        Object[] objArr4 = new Object[1];
        b((byte) (View.getDefaultSize(0, 0) + 93), KeyEvent.getDeadChar(0, 0) + 18, new char[]{15, 2, '\t', 1, 5, '\r', 1, '\f', '\t', 15, 14, 6, 4, '\n', 4, 15, 1, 5}, objArr4);
        if (!Intrinsics.areEqual(str, ((String) objArr4[0]).intern())) {
            return;
        }
        int i4 = IAuthTabCallbackStub + 31;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr5 = {setonoutofmemeryerrorcallback, Boolean.valueOf(GuardedAsyncTask.IAuthTabCallback.IAuthTabCallbackDefault())};
        ALCFaceBox.onWarmupCompleted(-2103726265, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr5, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 2103726265);
    }

    private final getPackageType onNavigationEvent(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        int i = 2 % 2;
        getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, null), 3, (Object) null);
        int i2 = IAuthTabCallbackStub + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return getpackagetypeOnNavigationEvent;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 5;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $11 + 19;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i10 = (c3 + i8) ^ ((c3 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int iMyTid = (Process.myTid() >> 22) + 10;
                        int iMyTid2 = 12434 - (Process.myTid() >> 22);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionType, iMyTid, iMyTid2, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i12 = i9;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 10 - Color.argb(0, 0, 0, 0), TextUtils.getCapsMode("", 0, 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9 = i12 + 1;
                    cArr3 = cArr4;
                    i3 = 0;
                    c = 1;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 13 - TextUtils.indexOf((CharSequence) "", '0'), 19901 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static short[] asInterface;
        final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
        final /* synthetic */ r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ $contentOwner;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        int I$5;
        int I$6;
        int I$7;
        int I$8;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        private static final byte[] $$a = {41, -64, -63, -4};
        private static final int $$b = 192;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onTransact = 0;
        private static int IAuthTabCallback_Parcel = 1;
        private static char[] onExtraCallbackWithResult = {32482, 32277, 32278, 32259, 32269, 32262, 32256, 32501, 32268, 32273, 32272, 32270, 32490, 32315, 32263, 32493, 32313, 32486, 32497, 32267, 32265, 32492, 32276, 32279, 32480, 32489, 32487, 32483, 32275, 32502, 32449, 32453, 32505, 32496, 32491};
        private static int onNavigationEvent = -1184334158;
        private static boolean onExtraCallback = true;
        private static boolean IAuthTabCallback = true;
        private static int onWarmupCompleted = -521470262;
        private static int IAuthTabCallbackDefault = -1538795476;
        private static int asBinder = 603568538;
        private static byte[] IAuthTabCallbackStub = {76, -65, -76, 64, -74, -67, 94, -96, 87, -66, -80, -76, -39, -41, 32, 43, -55, 13, -1, -39, 32, -48, 38, 44, -38, -35, 43, 51, -5, 44, -88, 91, 80, -92, 82, 89, -70, 68, 16, -3, 84, 80, 31, -4, 91, 24, -1, 92, -96, 94, -87, -81, 90, -82, 68, 75, -71, 73, 67, -70, 65, -65, -80, -1, 4, 72, -73, 78, -21, 69, 126, 70, 64, 69, -76, -71, -2, -69, 7, 79, -65, -75, -67, -65, -2, 69, 126, 68, 68, -66, -78, 79, -9, -69, 13, 71, -24, 8, -68, -73, 66, 8, 7, -10, 6, 14, -3, 5, 8, 79, -93, 8, -11, 3, -1, 90, -87, 9, 13, -11, 29, -13, -8, 3, -6, 67, -74, -5, 0, -3, 2, 15, -3, 92, -65, -11, 90, -78, -15, -9, 13, 6, -11, 8, 8, 8, 8, 8};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r6, byte r7, int r8) {
            /*
                int r7 = r7 * 2
                int r0 = 1 - r7
                byte[] r1 = o.X9FieldID.onWarmupCompleted.$$a
                int r6 = r6 * 2
                int r6 = 4 - r6
                int r8 = r8 * 3
                int r8 = r8 + 115
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L18
                r3 = r7
                r4 = r2
                goto L2b
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r8
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L26:
                r3 = r1[r6]
                r5 = r3
                r3 = r8
                r8 = r5
            L2b:
                int r8 = -r8
                int r6 = r6 + 1
                int r8 = r8 + r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.X9FieldID.onWarmupCompleted.$$c(byte, byte, int):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$contentOwner = r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
            this.$callbackProxy = setonoutofmemeryerrorcallback;
        }

        public static /* synthetic */ Unit onWarmupCompleted(Context context, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Exception {
            int i = 2 % 2;
            int i2 = onTransact + 53;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(context, setonoutofmemeryerrorcallback);
            int i4 = IAuthTabCallback_Parcel + 21;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit onWarmupCompleted(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 105;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(setonoutofmemeryerrorcallback);
            int i4 = onTransact + 13;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onTransact + 39;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 94 / 0;
            return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$contentOwner, this.$callbackProxy, access13800Var);
            int i2 = onTransact + 105;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 53;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback_Parcel + 75;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 40 / 0;
            }
            return objIAuthTabCallback;
        }

        private static final Unit onExtraCallback(Context context, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Exception {
            PedometerService.onExtraCallbackWithResult onextracallbackwithresult;
            String strIntern;
            String str;
            boolean z;
            int i;
            int i2 = 2 % 2;
            int i3 = onTransact + 113;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
            if (!guardedAsyncTask.IAuthTabCallbackDefault(context)) {
                Object[] objArr = new Object[1];
                b((byte) ((ViewConfiguration.getScrollBarSize() >> 8) - 67), (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-1152198338) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) - 23, 2017566396 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
                String strIntern2 = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                b((byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 68), (short) View.MeasureSpec.makeMeasureSpec(0, 0), (-1152198338) - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) - 22, Drawable.resolveOpacity(0, 0) + 2017566396, objArr2);
                setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern2, ((String) objArr2[0]).intern(), (Map) null, 4, (Object) null);
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr3 = new Object[1];
                b((byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 45), (short) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (-1152198326) - Color.red(0), Color.argb(0, 0, 0, 0) - 17, Drawable.resolveOpacity(0, 0) + 2017566423, objArr3);
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), Boolean.valueOf(guardedAsyncTask.IAuthTabCallbackStub(context)));
                Object[] objArr4 = new Object[1];
                a(null, null, new byte[]{-125, -126, -126, -121, -108, -109, -113, -123, -121, -126, -110, -111, -121, -124, -122, -118, -125, -119, -118, -112, -113, -118, -114}, TextUtils.getCapsMode("", 0, 0) + 127, objArr4);
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), Boolean.valueOf(((Boolean) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), -2096237238, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{guardedAsyncTask}, 2096237241)).booleanValue()));
                Object[] objArr5 = new Object[1];
                a(null, null, new byte[]{-125, -126, -116, -117, -118, -119, -120, -119, -124, -107, -122, -118, -104, -107, -105, -107, -122, -124, -106, -121, -126, -122, -126, -123, -124, -125, -126, -127, -113, -107}, KeyEvent.getDeadChar(0, 0) + 127, objArr5);
                Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), Boolean.valueOf(guardedAsyncTask.asInterface(context)))});
                Object[] objArr6 = new Object[1];
                a(null, null, new byte[]{-121, -126, -116, -125, -119, -118, -115, -125, -126, -116, -117, -118, -119, -120, -121, -126, -122, -126, -123, -124, -125, -126, -127}, View.MeasureSpec.getSize(0) + 127, objArr6);
                String strIntern3 = ((String) objArr6[0]).intern();
                Object[] objArr7 = new Object[1];
                b((byte) ((ViewConfiguration.getTapTimeout() >> 16) + 89), (short) (ViewConfiguration.getScrollDefaultDelay() >> 16), Color.rgb(0, 0, 0) - 1135421092, TextUtils.getOffsetBefore("", 0) - 10, 2017566398 - Gravity.getAbsoluteGravity(0, 0), objArr7);
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, strIntern3, ((String) objArr7[0]).intern(), mapOnWarmupCompleted, (String) null, false, (String) null, 56, (Object) null);
            } else {
                int i5 = IAuthTabCallback_Parcel + 69;
                onTransact = i5 % 128;
                if (i5 % 2 != 0) {
                    onextracallbackwithresult = PedometerService.Companion;
                    Object[] objArr8 = new Object[1];
                    a(null, null, new byte[]{-121, -126, -116, -125, -119, -118, -115, -125, -126, -116, -117, -118, -119, -120, -121, -126, -122, -126, -123, -124, -125, -126, -127}, 90 / Gravity.getAbsoluteGravity(1, 0), objArr8);
                    strIntern = ((String) objArr8[0]).intern();
                    str = null;
                    z = true;
                    i = 9;
                } else {
                    onextracallbackwithresult = PedometerService.Companion;
                    Object[] objArr9 = new Object[1];
                    a(null, null, new byte[]{-121, -126, -116, -125, -119, -118, -115, -125, -126, -116, -117, -118, -119, -120, -121, -126, -122, -126, -123, -124, -125, -126, -127}, Gravity.getAbsoluteGravity(0, 0) + 127, objArr9);
                    strIntern = ((String) objArr9[0]).intern();
                    str = null;
                    z = false;
                    i = 12;
                }
                PedometerService.onExtraCallbackWithResult.onWarmupCompleted(onextracallbackwithresult, context, strIntern, str, z, i, null);
                setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
            }
            return Unit.INSTANCE;
        }

        private static final Unit onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 63;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-98, -120, -102, -106, -120, -98, -99, -106, -100, -102, -101, -101, -102, -112, -103, -120, -127}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-98, -120, -102, -106, -120, -98, -99, -106, -100, -102, -101, -101, -102, -112, -103, -120, -127}, TextUtils.indexOf((CharSequence) "", '0', 0) + 128, objArr2);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern, ((String) objArr2[0]).intern(), (Map) null, 4, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i4 = onTransact + 67;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 81 / 0;
            }
            return unit;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:101:0x0300  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x030d  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x03c6  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0185 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x025c  */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v27 */
        /* JADX WARN: Type inference failed for: r2v33 */
        /* JADX WARN: Type inference failed for: r2v36 */
        /* JADX WARN: Type inference failed for: r2v37 */
        /* JADX WARN: Type inference failed for: r2v38 */
        /* JADX WARN: Type inference failed for: r2v39 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v63 */
        /* JADX WARN: Type inference failed for: r2v64 */
        /* JADX WARN: Type inference failed for: r2v65 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x02a3 -> B:15:0x00b2). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 1142
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.X9FieldID.onWarmupCompleted.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onExtraCallbackWithResult;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i3 = $10 + 65;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                for (int i5 = 0; i5 < length; i5++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), 77 - TextUtils.indexOf("", "", 0, 0), 20952 - KeyEvent.getDeadChar(0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
            Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 75 - (ViewConfiguration.getEdgeSlop() >> 16), 16793253 + Color.rgb(0, 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i6 = 1052772399;
            if (IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), TextUtils.getTrimmedLength("") + 63, 12214 - Color.argb(0, 0, 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i6 = 1052772399;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onExtraCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i7 = $11 + 49;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> 1) >>> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), 63 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 12214 - (Process.myTid() >> 22), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    obj = null;
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 63 - View.getDefaultSize(0, 0), ImageFormat.getBitsPerPixel(0) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    obj = null;
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                int i8 = $10 + 53;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            }
            objArr[0] = new String(cArr6);
        }

        private static void b(byte b, short s, int i, int i2, int i3, Object[] objArr) throws Throwable {
            long j;
            boolean z;
            int i4 = 2;
            int i5 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(IAuthTabCallbackDefault)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43425 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 42 - TextUtils.getCapsMode("", 0, 0), (Process.myTid() >> 22) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                int i6 = iIntValue == -1 ? 1 : 0;
                if (i6 == 0) {
                    j = -4629411779493505016L;
                } else {
                    byte[] bArr = IAuthTabCallbackStub;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i7 = 0;
                        while (i7 < length) {
                            int i8 = $10 + 123;
                            $11 = i8 % 128;
                            int i9 = i8 % i4;
                            Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 12843), Color.alpha(0) + 55, 2167 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i7++;
                            i4 = 2;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i10 = $11 + 35;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        byte[] bArr3 = IAuthTabCallbackStub;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 43424), 42 - (ViewConfiguration.getJumpTapTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackDefault ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (asInterface[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackDefault ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ j)) + i6;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(asBinder), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 86, 9567 - (Process.myPid() >> 22), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = IAuthTabCallbackStub;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i12 = $11 + 83;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        for (int i14 = 0; i14 < length2; i14++) {
                            bArr5[i14] = (byte) (bArr4[i14] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        z = true;
                    } else {
                        int i15 = $10 + 17;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z) {
                            byte[] bArr6 = IAuthTabCallbackStub;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = asInterface;
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
    }

    private final void onExtraCallbackWithResult(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
            if (context == null) {
                return;
            }
            GuardedAsyncTask.IAuthTabCallback.onWarmupCompleted(context);
            setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
            int i3 = IAuthTabCallbackDefault + 65;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    private static void b(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onTransact;
        long j = -1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 9;
                $10 = i6 % 128;
                if (i6 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 26 - (ViewConfiguration.getFadingEdgeLength() >> 16), 23140 - (SystemClock.currentThreadTimeMillis() > j ? 1 : (SystemClock.currentThreadTimeMillis() == j ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 26 - Gravity.getAbsoluteGravity(0, 0), 23139 - View.MeasureSpec.getMode(0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5++;
                }
                i3 = 2;
                j = -1;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(asInterface)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 26, 23138 - TextUtils.lastIndexOf("", '0', 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
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
                    int i7 = $10 + 109;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                } else {
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24825 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 75 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i9 = $11 + 17;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        try {
                            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback5 == null) {
                                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), TextUtils.getOffsetAfter("", 0) + 30, (KeyEvent.getMaxKeyCode() >> 16) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                        int i12 = $11 + 15;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                    } else {
                        int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i16];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            int i19 = $10 + 39;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = (char) 21288;
        onExtraCallback = (char) 55878;
        onWarmupCompleted = (char) 52301;
        onNavigationEvent = (char) 46768;
        onTransact = new char[]{64990, 64983, 65014, 64960, 64979, 64995, 64989, 64977, 64978, 64988, 64961, 64967, 64991, 64982, 64986, 64976};
        asInterface = (char) 51245;
    }
}
