package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
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
import android.widget.ExpandableListView;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getRoleAuthority implements ALCFaceQuality {
    private static short[] onExtraCallback;
    private static final byte[] $$a = {0, Byte.MIN_VALUE, 34, -14, 68};
    private static final int $$b = 252;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onNavigationEvent = -1954730265;
    private static int onExtraCallbackWithResult = -1538795500;
    private static int onWarmupCompleted = 1613820423;
    private static byte[] IAuthTabCallback = {7, -16, 15, -12, 11, 13, 12, 11, 0, 77, -77, 11, 74, -92, 13, 9, 70, -76, -16, -1, 14, 15, -3, 91, -91, 7, -16, 15, -12, 11, 8, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, int r8, byte r9) {
        /*
            int r9 = r9 + 5
            byte[] r0 = o.getRoleAuthority.$$a
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r7 = r7 * 3
            int r7 = 115 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2a:
            int r7 = r7 + r9
            r9 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRoleAuthority.$$c(int, int, byte):java.lang.String");
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
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
        int i4 = asInterface + 111;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = asInterface + 49;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = asInterface + 79;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = asBinder + 7;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        int i5 = asInterface + 99;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = asBinder + 107;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = asBinder + 23;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static short[] onTransact;
        final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
        final /* synthetic */ Context $context;
        final /* synthetic */ JsonArray $fields;
        final /* synthetic */ JsonObject $result;
        int label;
        private static final byte[] $$a = {79, 9, 94, -7};
        private static final int $$b = 122;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asBinder = 0;
        private static int IAuthTabCallback_Parcel = 1;
        private static char[] onWarmupCompleted = {32532, 32536, 32539, 32534, 32531, 32743, 32540, 32757, 32528, 32529, 32521, 32763, 32755, 32758, 32761, 32754, 32709, 32751, 32752, 32740, 32530, 32543, 32541, 32710, 32527};
        private static int onNavigationEvent = -1184333952;
        private static boolean onExtraCallbackWithResult = true;
        private static boolean IAuthTabCallback = true;
        private static int onExtraCallback = -1634770117;
        private static int IAuthTabCallbackStub = -1538795438;
        private static int asInterface = 1183262389;
        private static byte[] IAuthTabCallbackDefault = {-94, -102, -110, 108, -93, 81, 92, -93, -96, -92, 42, -44, 54, -56, 43, -90, -75, 64, 68, 75, -75, 73, -79, -90, -52, 46, -46, 48, 60, -56, 63, -90, -126, 125, 126, -123, -118, 120, Byte.MIN_VALUE, -68, -15, 14, 4, -56, 53, -37, 14, 5, -4, -1, -6, 16, 1, -70, 0, 14, -10, 8, -16, 20, -5, -14, 5, -6, 9, -68, -26, 25, 19, -33, 34, -50, 7, 18, -21, -24, -19, 7, 22, -35, -107, 103, -105, -99, 100, -97, 97, 110, 33, -38, -106, 105, -112, 53, -101, -96, -104, -98, -101, 106, 103, 32, 101, -39, -111, 97, 107, 99, 97, 32, -101, -96, -102, -102, 96, 108, -111, 41, 101, -45, -103, 54, -42, 98, 105, -100};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r7, int r8, short r9) {
            /*
                byte[] r0 = o.getRoleAuthority.onNavigationEvent.$$a
                int r7 = r7 * 3
                int r7 = 1 - r7
                int r9 = r9 + 4
                int r8 = r8 * 3
                int r8 = r8 + 115
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r4 = r2
                r9 = r7
                goto L2b
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                int r9 = r9 + 1
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L2b:
                int r8 = -r8
                int r8 = r8 + r9
                r9 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getRoleAuthority.onNavigationEvent.$$c(byte, int, short):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(JsonArray jsonArray, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, JsonObject jsonObject, Context context, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$fields = jsonArray;
            this.$callbackProxy = setonoutofmemeryerrorcallback;
            this.$result = jsonObject;
            this.$context = context;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$fields, this.$callbackProxy, this.$result, this.$context, access13800Var);
            int i2 = IAuthTabCallback_Parcel + 119;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = asBinder + 7;
            IAuthTabCallback_Parcel = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallback(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = asBinder + 97;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = asBinder + 1;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = asBinder + 77;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x01fa  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x02a4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 1367
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getRoleAuthority.onNavigationEvent.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onWarmupCompleted;
            char c = '0';
            long j = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) - 1), 76 - TextUtils.lastIndexOf("", c, 0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i4++;
                        c = '0';
                        j = 0;
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
            try {
                Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.green(0) + 75, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                if (IAuthTabCallback) {
                    int i5 = $10 + 49;
                    $11 = i5 % 128;
                    if (i5 % 2 == 0) {
                        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                        i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
                    } else {
                        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                        i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
                    }
                    char[] cArr4 = new char[i2];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    int i6 = $10 + 35;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 2 / 3;
                    }
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 63, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (!onExtraCallbackWithResult) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                    char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i8 = $11 + 93;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback + defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] + iIntValue);
                        } else {
                            cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        }
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                int i9 = $10 + 75;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), View.MeasureSpec.getSize(0) + 63, KeyEvent.normalizeMetaState(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr6);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        private static void b(byte b, short s, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5 = 2;
            int i6 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(IAuthTabCallbackStub)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 43424), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42, 22440 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                boolean z = iIntValue == -1;
                if (z) {
                    byte[] bArr = IAuthTabCallbackDefault;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i7 = 0;
                        while (i7 < length) {
                            int i8 = $10 + 93;
                            $11 = i8 % 128;
                            if (i8 % i5 == 0) {
                                Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), MotionEvent.axisFromString("") + 56, KeyEvent.normalizeMetaState(0) + 2167, -299036574, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                                }
                                bArr2[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                                i7 %= 0;
                            } else {
                                Object[] objArr4 = {Integer.valueOf(bArr[i7])};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback3 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 12795), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 55, ((Process.getThreadPriority(0) + 20) >> 6) + 2167, -299036574, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                                }
                                bArr2[i7] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                                i7++;
                            }
                            i5 = 2;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = IAuthTabCallbackDefault;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 43424), 42 - Color.red(0), 22439 - Drawable.resolveOpacity(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L))));
                    } else {
                        iIntValue = (short) (((short) (onTransact[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    int i9 = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L)));
                    if (z) {
                        int i10 = $10 + 71;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i9 + i4;
                    Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(asInterface), sb};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), TextUtils.getOffsetAfter("", 0) + 86, (KeyEvent.getMaxKeyCode() >> 16) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = IAuthTabCallbackDefault;
                    if (bArr4 != null) {
                        int i12 = $11 + 113;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i14 = 0;
                        while (i14 < length2) {
                            int i15 = $10 + 27;
                            int i16 = i15 % 128;
                            $11 = i16;
                            if (i15 % 2 == 0) {
                                bArr5[i14] = (byte) (bArr4[i14] - 4629411779493505016L);
                                i14--;
                            } else {
                                bArr5[i14] = (byte) (bArr4[i14] ^ (-4629411779493505016L));
                                i14++;
                            }
                            int i17 = i16 + 85;
                            $10 = i17 % 128;
                            int i18 = i17 % 2;
                        }
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z2) {
                            byte[] bArr6 = IAuthTabCallbackDefault;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onTransact;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                String string = sb.toString();
                int i19 = $10 + 71;
                $11 = i19 % 128;
                if (i19 % 2 != 0) {
                    objArr[0] = string;
                } else {
                    int i20 = 21 / 0;
                    objArr[0] = string;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getEdgeSlop() >> 16), (byte) TextUtils.indexOf("", "", 0, 0), (-792393456) - Process.getGidForName(""), 998823511 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) - 21, objArr);
        JsonArray jsonArrayOnExtraCallbackWithResult = settext.onExtraCallbackWithResult(((String) objArr[0]).intern(), new JsonArray());
        JsonObject jsonObject2 = new JsonObject();
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (!jsonArrayOnExtraCallbackWithResult.isEmpty()) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new onNavigationEvent(jsonArrayOnExtraCallbackWithResult, setonoutofmemeryerrorcallback, jsonObject2, context, null), 2, (Object) null);
            return;
        }
        int i2 = asInterface + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        a((short) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.getCapsMode("", 0, 0) - 792393450, 998823511 - View.resolveSize(0, 0), AndroidCharacter.getMirror('0') - '2', objArr2);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, ((String) objArr2[0]).intern(), (String) null, (Map) null, 6, (Object) null);
        int i4 = asInterface + 57;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01bc A[PHI: r0
      0x01bc: PHI (r0v9 int) = (r0v8 int), (r0v44 int) binds: [B:48:0x01ba, B:45:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01be A[PHI: r0
      0x01be: PHI (r0v41 int) = (r0v8 int), (r0v44 int) binds: [B:48:0x01ba, B:45:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r26, byte r27, int r28, int r29, int r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRoleAuthority.a(short, byte, int, int, int, java.lang.Object[]):void");
    }
}
