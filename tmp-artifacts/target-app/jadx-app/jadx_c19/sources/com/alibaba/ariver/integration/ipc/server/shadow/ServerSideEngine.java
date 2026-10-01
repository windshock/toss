package com.alibaba.ariver.integration.ipc.server.shadow;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.BaseEngineImpl;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.Worker;
import com.alibaba.ariver.engine.api.bridge.NativeBridge;
import com.alibaba.ariver.engine.api.bridge.model.CreateParams;
import com.alibaba.ariver.engine.api.bridge.model.EngineSetupCallback;
import com.alibaba.ariver.kernel.api.node.Node;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ServerSideEngine extends BaseEngineImpl {
    private static short[] IAuthTabCallback;
    private static final byte[] $$a = {46, -35, 45, 111};
    private static final int $$b = 3;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int asBinder = 1;
    private static int onExtraCallback = 101609227;
    private static int onNavigationEvent = -1538795461;
    private static int onExtraCallbackWithResult = -1832070513;
    private static byte[] onWarmupCompleted = {-58};

    private static String $$c(int i2, short s, byte b) {
        int i3 = (b * 3) + 4;
        int i4 = 115 - (i2 * 3);
        byte[] bArr = $$a;
        int i5 = s * 3;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i4 = i6 + i3;
            i3++;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i4;
            if (i8 == i6) {
                return new String(bArr2, 0);
            }
            int i9 = i3;
            i4 += bArr[i3];
            i3 = i9 + 1;
            i7 = i8;
        }
    }

    public Render createRender(Activity activity, Node node, CreateParams createParams) {
        int i2 = 2 % 2;
        int i3 = asInterface + 25;
        int i4 = i3 % 128;
        asBinder = i4;
        if (i3 % 2 == 0) {
            int i5 = 29 / 0;
        }
        int i6 = i4 + 59;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public Worker createWorker(Context context, Node node, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 13;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 123;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public boolean isReady() {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 99;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 27;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 31 / 0;
        }
        return true;
    }

    public void setup(Bundle bundle, Bundle bundle2, EngineSetupCallback engineSetupCallback) {
        int i2 = 2 % 2;
        int i3 = asBinder + 1;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public ServerSideEngine(App app) {
        super(app.getAppId(), app);
    }

    @Override // com.alibaba.ariver.engine.BaseEngineImpl
    public String getEngineType() {
        int i2 = 2 % 2;
        int i3 = asBinder + 57;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 103;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return "SERVER";
    }

    @Override // com.alibaba.ariver.engine.BaseEngineImpl
    public NativeBridge createNativeBridge() {
        int i2 = 2 % 2;
        ServerSideBridge serverSideBridge = new ServerSideBridge(getNode());
        int i3 = asBinder + 103;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return serverSideBridge;
    }

    public String getInstanceId() throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 19;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        a((short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (byte) View.MeasureSpec.getMode(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1572227324, (-915081816) - TextUtils.lastIndexOf("", '0'), (-52) - Gravity.getAbsoluteGravity(0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = asInterface + 117;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }

    private static void a(short s, byte b, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        int i5;
        long j;
        boolean z;
        int i6 = 2;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getPressedStateDuration() >> 16)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 41, 22439 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                i5 = 1;
            } else {
                int i8 = $10 + 35;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                i5 = 0;
            }
            int i10 = 3;
            if (i5 != 0) {
                byte[] bArr = onWarmupCompleted;
                long j2 = 0;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        int i12 = $10 + 87;
                        $11 = i12 % 128;
                        int i13 = i12 % i6;
                        Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char c = (char) ((SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1)) + 12842);
                            int iNormalizeMetaState = 55 - KeyEvent.normalizeMetaState(0);
                            int iKeyCodeFromString = 2167 - KeyEvent.keyCodeFromString("");
                            byte b2 = (byte) ($$b - i10);
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c, iNormalizeMetaState, iKeyCodeFromString, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i11++;
                        i6 = 2;
                        i10 = 3;
                        j2 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onWarmupCompleted;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43425 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 42 - Color.green(0), 22439 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (IAuthTabCallback[i2 + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i2 + iIntValue) - 2) + ((int) (onExtraCallback ^ j)) + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), ImageFormat.getBitsPerPixel(0) + 87, 9567 - (Process.myTid() >> 22), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onWarmupCompleted;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr5[i14] = (byte) (bArr4[i14] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i15 = $11 + 47;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i17 = $11 + 55;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    if (z) {
                        byte[] bArr6 = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
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
