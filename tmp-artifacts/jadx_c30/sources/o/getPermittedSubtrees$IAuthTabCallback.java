package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class getPermittedSubtrees$IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static short[] onNavigationEvent;
    final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
    final /* synthetic */ String $key;
    int label;
    private static final byte[] $$a = {2, 77, 55, -86};
    private static final int $$b = 144;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult = 1808736311;
    private static int onExtraCallback = -1538795427;
    private static int onWarmupCompleted = 1906421047;
    private static byte[] IAuthTabCallback = {ISO7816.INS_WRITE_RECORD, -84, ISO7816.INS_PUT_DATA, -86, -108, -37, -110, ISO7816.INS_LOAD_KEY_FILE, -63, 24, 93, -87, ISO7816.INS_GET_RESPONSE, -105, 12, -98, ISOFileInfo.FCI_EXT, -97, -111, -98, -51, ISO7816.INS_PUT_DATA, 7, ISO7816.INS_UPDATE_RECORD, 80, -88, ISO7816.INS_LOAD_KEY_FILE, -50, -58, ISO7816.INS_LOAD_KEY_FILE, 7, -98, ISOFileInfo.FCI_EXT, -99, -99, -57, -61, -88, 0, ISO7816.INS_UPDATE_RECORD, 86, -112, 9, 105, -59, ISO7816.INS_GET_RESPONSE, -109};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, byte b2) {
        int i;
        int i2;
        int i3 = s * 4;
        int i4 = (b * 2) + 4;
        byte[] bArr = $$a;
        int i5 = 115 - (b2 * 4);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i6;
            i2 = i4;
            i = 0;
            i4 += -i7;
            i2++;
            bArr2[i] = (byte) i4;
            if (i == i6) {
                return new String(bArr2, 0);
            }
            i++;
            i7 = bArr[i2];
            i4 += -i7;
            i2++;
            bArr2[i] = (byte) i4;
            if (i == i6) {
            }
        } else {
            i = 0;
            i2 = i4;
            i4 = i5;
            bArr2[i] = (byte) i4;
            if (i == i6) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    getPermittedSubtrees$IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str, access13800<? super getPermittedSubtrees$IAuthTabCallback> access13800Var) {
        super(2, access13800Var);
        this.$callbackProxy = setonoutofmemeryerrorcallback;
        this.$key = str;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        getPermittedSubtrees$IAuthTabCallback getpermittedsubtrees_iauthtabcallback = new getPermittedSubtrees$IAuthTabCallback(this.$callbackProxy, this.$key, access13800Var);
        int i2 = onTransact + 77;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return getpermittedsubtrees_iauthtabcallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj3 = null;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 == 0) {
            onNavigationEvent(findresandmsg, access13800Var);
            throw null;
        }
        Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
        int i3 = IAuthTabCallbackDefault + 69;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return objOnNavigationEvent;
        }
        obj3.hashCode();
        throw null;
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = IAuthTabCallbackDefault + 79;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super JsonElement>, Object> {
        private static short[] onExtraCallback;
        final /* synthetic */ String $key;
        int label;
        private static final byte[] $$a = {102, 12, ISOFileInfo.FCP_BYTE, 84};
        private static final int $$b = 110;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asBinder = 0;
        private static int onTransact = 1;
        private static int IAuthTabCallback = -45136440;
        private static int onWarmupCompleted = -1538795494;
        private static int onExtraCallbackWithResult = 1926284845;
        private static byte[] onNavigationEvent = {45, 59, 43, 37, 60, 35, 57, ISO7816.INS_INCREASE, 121, -18, ISO7816.INS_PSO, 49, 40, ISOFileInfo.ENV_TEMP_EF, 47, -8, ISO7816.INS_VERIFY, ISO7816.INS_MSE, 47, 62, 59, 120, 61, -31, 41, 57, 63, 39, 57, 120, 47, -8, 46, 46, 56, ISO7816.INS_DECREASE_STAMPED, 41, 113, 61, -41, 33, ISOFileInfo.LCS_BYTE, -22, 38, 49, ISO7816.INS_CHANGE_CHV, 8};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, int i, short s2) {
            int i2;
            byte[] bArr = $$a;
            int i3 = 115 - (s * 3);
            int i4 = (s2 * 3) + 4;
            int i5 = i * 2;
            byte[] bArr2 = new byte[i5 + 1];
            if (bArr == null) {
                int i6 = i5;
                i3 = i4;
                i2 = 0;
                i4++;
                i3 += -i6;
                bArr2[i2] = (byte) i3;
                if (i2 == i5) {
                    return new String(bArr2, 0);
                }
                i2++;
                i6 = bArr[i4];
                i4++;
                i3 += -i6;
                bArr2[i2] = (byte) i3;
                if (i2 == i5) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i3;
                if (i2 == i5) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(String str, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$key = str;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super JsonElement> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = asBinder + 5;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 17 / 0;
            }
            int i5 = asBinder + 29;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$key, access13800Var);
            int i2 = onTransact + 25;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = asBinder + 35;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = asBinder + 77;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            JsonElement jsonElementIAuthTabCallback;
            int i = 2 % 2;
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a((short) ((-46) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (byte) View.resolveSize(0, 0), Color.argb(0, 0, 0, 0) - 1493736896, 694739518 - Gravity.getAbsoluteGravity(0, 0), 29 - (KeyEvent.getMaxKeyCode() >> 16), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i2 = onTransact + 61;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i3 != 0) {
                jsonElementIAuthTabCallback = onResponse.onWarmupCompleted.IAuthTabCallback(this.$key);
                int i4 = 71 / 0;
                if (jsonElementIAuthTabCallback == null) {
                    jsonElementIAuthTabCallback = JsonNull.INSTANCE;
                }
            } else {
                jsonElementIAuthTabCallback = onResponse.onWarmupCompleted.IAuthTabCallback(this.$key);
                if (jsonElementIAuthTabCallback == null) {
                }
            }
            int i5 = asBinder + 11;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 49 / 0;
            }
            return jsonElementIAuthTabCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0090 A[PHI: r4
          0x0090: PHI (r4v9 byte[] A[IMMUTABLE_TYPE]) = (r4v8 byte[]), (r4v22 byte[]) binds: [B:20:0x008e, B:17:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x016e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5;
            boolean z;
            byte[] bArr;
            int i6 = 2;
            int i7 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - Drawable.resolveOpacity(0, 0)), 42 - View.resolveSize(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i8 = $10 + 35;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if ((i4 ^ 1) == 0) {
                    int i10 = $11 + 21;
                    $10 = i10 % 128;
                    char c = '0';
                    if (i10 % 2 != 0) {
                        bArr = onNavigationEvent;
                        int i11 = 36 / 0;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            int i12 = 0;
                            while (i12 < length) {
                                int i13 = $11 + 5;
                                $10 = i13 % 128;
                                int i14 = i13 % i6;
                                Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 12843), TextUtils.indexOf(BuildConfig.FLAVOR, c, 0, 0) + 56, 2166 - ImageFormat.getBitsPerPixel(0), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr2[i12] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                                i12++;
                                i6 = 2;
                                c = '0';
                            }
                            bArr = bArr2;
                        }
                        if (bArr == null) {
                            byte[] bArr3 = onNavigationEvent;
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43472 - AndroidCharacter.getMirror('0')), 41 - ImageFormat.getBitsPerPixel(0), 22439 - View.resolveSize(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                        } else {
                            iIntValue = (short) (((short) (onExtraCallback[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                        }
                    } else {
                        bArr = onNavigationEvent;
                        if (bArr != null) {
                        }
                        if (bArr == null) {
                        }
                    }
                }
                if (iIntValue > 0) {
                    int i15 = $11 + 33;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))) + i4;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 86, MotionEvent.axisFromString(BuildConfig.FLAVOR) + 9568, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onNavigationEvent;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i17 = 0; i17 < length2; i17++) {
                            bArr5[i17] = (byte) (bArr4[i17] ^ (-4629411779493505016L));
                        }
                        int i18 = $10 + 33;
                        $11 = i18 % 128;
                        i5 = 2;
                        int i19 = i18 % 2;
                        bArr4 = bArr5;
                    } else {
                        i5 = 2;
                    }
                    if (bArr4 != null) {
                        int i20 = $10 + 17;
                        $11 = i20 % 128;
                        int i21 = i20 % i5;
                        z = true;
                    } else {
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z) {
                            byte[] bArr6 = onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onExtraCallback;
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

    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        try {
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$key, null);
                this.label = 1;
                obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallbackwithresult, this);
                if (obj == objOnWarmupCompleted) {
                    int i3 = IAuthTabCallbackDefault + 37;
                    onTransact = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a((short) (75 - (ViewConfiguration.getTouchSlop() >> 8)), (byte) (24 - ExpandableListView.getPackedPositionType(0L)), 813107137 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), 706317092 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), (Process.myTid() >> 22) - 86, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i5 = onTransact + 51;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.$callbackProxy;
            int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            ALCFaceBox.onWarmupCompleted(291820722, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{setonoutofmemeryerrorcallback, (JsonElement) obj}, iIAuthTabCallback2, -291820715);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            setOnOutOfMemeryErrorCallback.onNavigationEvent(this.$callbackProxy, th.getClass().getName(), (String) null, (Map) null, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4 = 2;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 43424), 42 - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr = IAuthTabCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = $10 + 3;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 125;
                        $10 = i9 % 128;
                        if (i9 % i4 != 0) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - ExpandableListView.getPackedPositionGroup(0L)), 56 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 2167 - (ViewConfiguration.getJumpTapTimeout() >> 16), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                                i8 /= 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            try {
                                Object[] objArr4 = {Integer.valueOf(bArr[i8])};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback3 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 12844), View.getDefaultSize(0, 0) + 55, (ViewConfiguration.getTapTimeout() >> 16) + 2167, -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                                }
                                bArr2[i8] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                                i8++;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        i4 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = IAuthTabCallback;
                    try {
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0)), 42 - View.MeasureSpec.makeMeasureSpec(0, 0), 22439 - (ViewConfiguration.getPressedStateDuration() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i10 = $10 + 119;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))) + (!(z2 ^ true) ? 1 : 0);
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 86 - (ViewConfiguration.getEdgeSlop() >> 16), 9567 - View.MeasureSpec.makeMeasureSpec(0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = IAuthTabCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i13 = $11 + 19;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }
}
