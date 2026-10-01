package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.android.gms.internal.ads.zzgsa;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import o.AndroidMenu_androidKtExternalSyntheticLambda4;
import o.AppBarKtExternalSyntheticLambda9;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.SelectionManagerExternalSyntheticLambda2;
import o.SelectionManagerExternalSyntheticLambda5;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionManager_androidKtExternalSyntheticLambda0 extends AppBarKtExternalSyntheticLambda8 implements PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int extraCallback = 1;
    private static int[] extraCallbackWithResult = {-1757785994, -1556111407, 1804288108, 1166523637, 1592187485, 592327882, 786908929, -690739806, -833481720, -1089497543, 1414560372, -1678887050, -704705131, -1106193552, 1246605238, -272575314, 1390695352, 1114568493};
    private static int writeTypedObject;
    private int IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallbackStub;
    private final AppBarKtExternalSyntheticLambda1 IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private int ICustomTabsCallback;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 access000;
    private final SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult access100;
    private long asBinder;
    private boolean asInterface;
    private boolean getInterfaceDescriptor;
    private final SelectionManagerExternalSyntheticLambda2 onExtraCallback;
    private boolean onNavigationEvent;
    private final Context onTransact;
    private boolean onWarmupCompleted;
    private long readTypedObject;

    private static boolean IAuthTabCallback(String str) {
        int i2 = 2 % 2;
        int i3 = extraCallback;
        int i4 = i3 + 39;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 95;
        writeTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    private static boolean IEngagementSignalsCallback_Parcel() {
        int i2 = 2 % 2;
        int i3 = extraCallback;
        int i4 = i3 + 41;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 27;
        writeTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~i5;
        int i9 = ~i3;
        int i10 = (~(i8 | i9)) | i4;
        int i11 = i9 | i4;
        int i12 = (~((~i4) | i5)) | (~i11);
        int i13 = (~(i3 | i8 | i4)) | (~(i11 | i5));
        int i14 = i4 + i5 + i7 + (528639218 * i2) + ((-532493036) * i6);
        int i15 = i14 * i14;
        int i16 = ((i4 * 873666089) - 1460666368) + (873666089 * i5) + ((-875965520) * i10) + (437982760 * i12) + ((-437982760) * i13) + (435683328 * i7) + (1819279360 * i2) + ((-1621098496) * i6) + (586088448 * i15);
        int i17 = (i4 * (-1573143961)) + 2078511484 + (i5 * (-1573143961)) + (i10 * 1872) + (i12 * (-936)) + (i13 * 936) + (i7 * (-1573143025)) + (i2 * 123045422) + (i6 * (-1548035028)) + (i15 * 1845559296);
        int i18 = i16 + (i17 * i17 * 1848705024);
        return i18 != 1 ? i18 != 2 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4, androidx.media3.exoplayer.Renderer
    public PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0 IAuthTabCallbackDefault() {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 69;
        int i4 = i3 % 128;
        extraCallback = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 25;
        writeTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 66 / 0;
        }
        return this;
    }

    static /* synthetic */ void IAuthTabCallback(SelectionManager_androidKtExternalSyntheticLambda0 selectionManager_androidKtExternalSyntheticLambda0) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 125;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        selectionManager_androidKtExternalSyntheticLambda0.onActivityLayout();
        int i5 = extraCallback + 13;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean IAuthTabCallback(SelectionManager_androidKtExternalSyntheticLambda0 selectionManager_androidKtExternalSyntheticLambda0, boolean z) {
        int i2 = 2 % 2;
        int i3 = extraCallback + 55;
        int i4 = i3 % 128;
        writeTypedObject = i4;
        int i5 = i3 % 2;
        selectionManager_androidKtExternalSyntheticLambda0.IAuthTabCallback_Parcel = z;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 103;
        extraCallback = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    static /* synthetic */ Renderer.WakeupListener onExtraCallback(SelectionManager_androidKtExternalSyntheticLambda0 selectionManager_androidKtExternalSyntheticLambda0) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 5;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Renderer.WakeupListener wakeupListenerIEngagementSignalsCallback = selectionManager_androidKtExternalSyntheticLambda0.IEngagementSignalsCallback();
        int i5 = extraCallback + 91;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return wakeupListenerIEngagementSignalsCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Renderer.WakeupListener onExtraCallbackWithResult(SelectionManager_androidKtExternalSyntheticLambda0 selectionManager_androidKtExternalSyntheticLambda0) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 67;
        extraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return selectionManager_androidKtExternalSyntheticLambda0.IEngagementSignalsCallback();
        }
        selectionManager_androidKtExternalSyntheticLambda0.IEngagementSignalsCallback();
        throw null;
    }

    static /* synthetic */ AppBarKtExternalSyntheticLambda1 onNavigationEvent(SelectionManager_androidKtExternalSyntheticLambda0 selectionManager_androidKtExternalSyntheticLambda0) {
        int i2 = 2 % 2;
        int i3 = extraCallback;
        int i4 = i3 + 115;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        AppBarKtExternalSyntheticLambda1 appBarKtExternalSyntheticLambda1 = selectionManager_androidKtExternalSyntheticLambda0.IAuthTabCallbackStubProxy;
        int i6 = i3 + 121;
        writeTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return appBarKtExternalSyntheticLambda1;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        SelectionManager_androidKtExternalSyntheticLambda0 selectionManager_androidKtExternalSyntheticLambda0 = (SelectionManager_androidKtExternalSyntheticLambda0) objArr[0];
        int i2 = 2 % 2;
        int i3 = writeTypedObject;
        int i4 = i3 + 119;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult onextracallbackwithresult = selectionManager_androidKtExternalSyntheticLambda0.access100;
        int i6 = i3 + 67;
        extraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return onextracallbackwithresult;
        }
        throw null;
    }

    private static void a(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3;
        int length;
        int[] iArr2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = extraCallbackWithResult;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $10 + 7;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), ImageFormat.getBitsPerPixel(0) + 73, 8848 - TextUtils.getCapsMode("", 0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i8++;
                    int i9 = $11 + 71;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = extraCallbackWithResult;
        long j = 0;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i6] = Integer.valueOf(iArr5[i11]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 71, 8847 - ((byte) KeyEvent.getModifierMetaStateMask()), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i11++;
                i6 = 0;
                j = 0;
            }
            i3 = i6;
            iArr5 = iArr6;
        } else {
            i3 = 0;
        }
        System.arraycopy(iArr5, i3, iArr4, i3, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i3;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i12 = $11 + 43;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i14 = 0; i14 < 16; i14++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22251), (ViewConfiguration.getTapTimeout() >> 16) + 39, 10301 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 78, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr2, 0, i2);
        int i18 = $11 + 85;
        $10 = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public SelectionManager_androidKtExternalSyntheticLambda0(Context context, AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallback onextracallback, AppBarKtExternalSyntheticLambda6 appBarKtExternalSyntheticLambda6, boolean z, @Nullable Handler handler, @Nullable SelectionManagerExternalSyntheticLambda5 selectionManagerExternalSyntheticLambda5, SelectionManagerExternalSyntheticLambda2 selectionManagerExternalSyntheticLambda2) {
        AppBarKtExternalSyntheticLambda1 appBarKtExternalSyntheticLambda1;
        if (Build.VERSION.SDK_INT >= 35) {
            appBarKtExternalSyntheticLambda1 = new AppBarKtExternalSyntheticLambda1();
        } else {
            int i2 = writeTypedObject + 11;
            extraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            appBarKtExternalSyntheticLambda1 = null;
        }
        this(context, onextracallback, appBarKtExternalSyntheticLambda6, z, handler, selectionManagerExternalSyntheticLambda5, selectionManagerExternalSyntheticLambda2, appBarKtExternalSyntheticLambda1);
    }

    public SelectionManager_androidKtExternalSyntheticLambda0(Context context, AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallback onextracallback, AppBarKtExternalSyntheticLambda6 appBarKtExternalSyntheticLambda6, boolean z, @Nullable Handler handler, @Nullable SelectionManagerExternalSyntheticLambda5 selectionManagerExternalSyntheticLambda5, SelectionManagerExternalSyntheticLambda2 selectionManagerExternalSyntheticLambda2, @Nullable AppBarKtExternalSyntheticLambda1 appBarKtExternalSyntheticLambda1) {
        super(1, onextracallback, appBarKtExternalSyntheticLambda6, z, 44100.0f);
        this.onTransact = context.getApplicationContext();
        this.onExtraCallback = selectionManagerExternalSyntheticLambda2;
        this.IAuthTabCallbackStubProxy = appBarKtExternalSyntheticLambda1;
        this.ICustomTabsCallback = -1000;
        this.access100 = new SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult(handler, selectionManagerExternalSyntheticLambda5);
        this.readTypedObject = -9223372036854775807L;
        selectionManagerExternalSyntheticLambda2.onNavigationEvent(new IAuthTabCallback());
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public String extraCommand() {
        int i2 = 2 % 2;
        int i3 = writeTypedObject;
        int i4 = i3 + 53;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 35;
        extraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return "MediaCodecAudioRenderer";
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    @Override // o.AppBarKtExternalSyntheticLambda8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int onExtraCallback(AppBarKtExternalSyntheticLambda6 appBarKtExternalSyntheticLambda6, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) throws AppBarKtExternalSyntheticLambda9.onExtraCallback {
        boolean z;
        int i2;
        boolean z2;
        int i3 = 2 % 2;
        int i4 = 0;
        boolean z3 = true;
        if (!AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable)) {
            int i5 = writeTypedObject + 95;
            extraCallback = i5 % 128;
            return i5 % 2 == 0 ? RendererCapabilities.IAuthTabCallback(1) : RendererCapabilities.IAuthTabCallback(0);
        }
        if (basicTextContextMenuProviderKtExternalSyntheticLambda4.asBinder != 0) {
            int i6 = writeTypedObject + 23;
            extraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        boolean zOnNavigationEvent = AppBarKtExternalSyntheticLambda8.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4);
        int i8 = 4;
        int i9 = 8;
        if (zOnNavigationEvent) {
            if (z) {
                int i10 = extraCallback + 43;
                writeTypedObject = i10 % 128;
                int i11 = i10 % 2;
                if (AppBarKtExternalSyntheticLambda9.onWarmupCompleted() != null) {
                }
            }
            int iIAuthTabCallbackStub = IAuthTabCallbackStub(basicTextContextMenuProviderKtExternalSyntheticLambda4);
            if (this.onExtraCallback.onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
                return RendererCapabilities.onNavigationEvent(4, 8, 32, iIAuthTabCallbackStub);
            }
            i2 = iIAuthTabCallbackStub;
        } else {
            i2 = 0;
        }
        if ("audio/raw".equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable) && !this.onExtraCallback.onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
            return RendererCapabilities.IAuthTabCallback(1);
        }
        if (!this.onExtraCallback.onWarmupCompleted((BasicTextContextMenuProviderKtExternalSyntheticLambda4) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(144892520, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{2, Integer.valueOf(basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent), Integer.valueOf(basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetch)}, -144892508))) {
            int i12 = extraCallback + 97;
            writeTypedObject = i12 % 128;
            int i13 = i12 % 2;
            return RendererCapabilities.IAuthTabCallback(1);
        }
        List list = (List) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -995744095, 995744095, zzgsa.onWarmupCompleted(), new Object[]{appBarKtExternalSyntheticLambda6, basicTextContextMenuProviderKtExternalSyntheticLambda4, false, this.onExtraCallback}, zzgsa.onWarmupCompleted());
        if (!(!list.isEmpty())) {
            int i14 = extraCallback + 121;
            writeTypedObject = i14 % 128;
            int i15 = i14 % 2;
            return RendererCapabilities.IAuthTabCallback(1);
        }
        if (!zOnNavigationEvent) {
            return RendererCapabilities.IAuthTabCallback(2);
        }
        AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5 = (AppBarKtExternalSyntheticLambda5) list.get(0);
        boolean zOnExtraCallbackWithResult = appBarKtExternalSyntheticLambda5.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4);
        if (zOnExtraCallbackWithResult) {
            z2 = true;
            z3 = zOnExtraCallbackWithResult;
        } else {
            for (int i16 = 1; i16 < list.size(); i16++) {
                AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda52 = (AppBarKtExternalSyntheticLambda5) list.get(i16);
                if (appBarKtExternalSyntheticLambda52.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
                    int i17 = extraCallback + 19;
                    writeTypedObject = i17 % 128;
                    int i18 = i17 % 2;
                    z2 = false;
                    appBarKtExternalSyntheticLambda5 = appBarKtExternalSyntheticLambda52;
                    break;
                }
            }
            z2 = true;
            z3 = zOnExtraCallbackWithResult;
        }
        if (!z3) {
            int i19 = extraCallback + 117;
            writeTypedObject = i19 % 128;
            int i20 = i19 % 2;
            i8 = 3;
        }
        if (z3 && appBarKtExternalSyntheticLambda5.onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
            i9 = 16;
        }
        int i21 = appBarKtExternalSyntheticLambda5.IAuthTabCallback ? 64 : 0;
        if (z2) {
            int i22 = extraCallback + 29;
            writeTypedObject = i22 % 128;
            int i23 = i22 % 2;
            i4 = 128;
        }
        return RendererCapabilities.onExtraCallback(i8, i9, 32, i21, i4, i2);
    }

    private int IAuthTabCallbackStub(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        int i2;
        int i3 = 2 % 2;
        int i4 = writeTypedObject + 11;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        SelectionManagerExternalSyntheticLambda14 selectionManagerExternalSyntheticLambda14OnNavigationEvent = this.onExtraCallback.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4);
        if (selectionManagerExternalSyntheticLambda14OnNavigationEvent.onWarmupCompleted) {
            if (selectionManagerExternalSyntheticLambda14OnNavigationEvent.IAuthTabCallback) {
                int i6 = writeTypedObject + 125;
                extraCallback = i6 % 128;
                i2 = i6 % 2 == 0 ? 26441 : 1536;
            } else {
                i2 = 512;
            }
            if (!selectionManagerExternalSyntheticLambda14OnNavigationEvent.onExtraCallback) {
                return i2;
            }
            int i7 = extraCallback + 21;
            writeTypedObject = i7 % 128;
            int i8 = i7 % 2;
            return i2 | 2048;
        }
        int i9 = extraCallback + 79;
        int i10 = i9 % 128;
        writeTypedObject = i10;
        int i11 = i9 % 2;
        int i12 = i10 + 49;
        extraCallback = i12 % 128;
        int i13 = i12 % 2;
        return 0;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public List<AppBarKtExternalSyntheticLambda5> onExtraCallbackWithResult(AppBarKtExternalSyntheticLambda6 appBarKtExternalSyntheticLambda6, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, boolean z) throws AppBarKtExternalSyntheticLambda9.onExtraCallback {
        int i2 = 2 % 2;
        int i3 = extraCallback + 25;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {appBarKtExternalSyntheticLambda6, basicTextContextMenuProviderKtExternalSyntheticLambda4, Boolean.valueOf(z), this.onExtraCallback};
        List<AppBarKtExternalSyntheticLambda5> listOnExtraCallback = AppBarKtExternalSyntheticLambda9.onExtraCallback((List<AppBarKtExternalSyntheticLambda5>) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -995744095, 995744095, zzgsa.onWarmupCompleted(), objArr, zzgsa.onWarmupCompleted()), basicTextContextMenuProviderKtExternalSyntheticLambda4);
        int i5 = extraCallback + 95;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return listOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws AppBarKtExternalSyntheticLambda9.onExtraCallback {
        AppBarKtExternalSyntheticLambda6 appBarKtExternalSyntheticLambda6 = (AppBarKtExternalSyntheticLambda6) objArr[0];
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        SelectionManagerExternalSyntheticLambda2 selectionManagerExternalSyntheticLambda2 = (SelectionManagerExternalSyntheticLambda2) objArr[3];
        int i2 = 2 % 2;
        if (basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable == null) {
            int i3 = writeTypedObject + 113;
            extraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return ImmutableList.of();
            }
            ImmutableList.of();
            throw null;
        }
        if (selectionManagerExternalSyntheticLambda2.onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
            int i4 = writeTypedObject + 119;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5OnWarmupCompleted = AppBarKtExternalSyntheticLambda9.onWarmupCompleted();
            if (appBarKtExternalSyntheticLambda5OnWarmupCompleted != null) {
                ImmutableList immutableListOf = ImmutableList.of(appBarKtExternalSyntheticLambda5OnWarmupCompleted);
                int i6 = extraCallback + 91;
                writeTypedObject = i6 % 128;
                int i7 = i6 % 2;
                return immutableListOf;
            }
        }
        return AppBarKtExternalSyntheticLambda9.onExtraCallbackWithResult(appBarKtExternalSyntheticLambda6, basicTextContextMenuProviderKtExternalSyntheticLambda4, zBooleanValue, false);
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public boolean onExtraCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        int i2 = 2 % 2;
        if (aa_().onNavigationEvent != 0) {
            int i3 = writeTypedObject + 119;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            int iIAuthTabCallbackStub = IAuthTabCallbackStub(basicTextContextMenuProviderKtExternalSyntheticLambda4);
            if ((iIAuthTabCallbackStub & 512) != 0) {
                if (aa_().onNavigationEvent == 2 || (iIAuthTabCallbackStub & 1024) != 0) {
                    return true;
                }
                int i5 = writeTypedObject + 59;
                extraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = basicTextContextMenuProviderKtExternalSyntheticLambda4.access100;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (basicTextContextMenuProviderKtExternalSyntheticLambda4.access100 == 0 && basicTextContextMenuProviderKtExternalSyntheticLambda4.extraCallbackWithResult == 0) {
                    return true;
                }
            }
        }
        return this.onExtraCallback.onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4);
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public AndroidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted onNavigationEvent(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable MediaCrypto mediaCrypto, float f) throws Throwable {
        int i2 = 2 % 2;
        this.IAuthTabCallback = onWarmupCompleted(appBarKtExternalSyntheticLambda5, basicTextContextMenuProviderKtExternalSyntheticLambda4, access100());
        this.asInterface = IAuthTabCallback(appBarKtExternalSyntheticLambda5.IAuthTabCallbackStub);
        Object[] objArr = {appBarKtExternalSyntheticLambda5.IAuthTabCallbackStub};
        this.IAuthTabCallbackDefault = ((Boolean) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -1283449949, 1283449950, zzgsa.onWarmupCompleted(), objArr, zzgsa.onWarmupCompleted())).booleanValue();
        MediaFormat mediaFormatOnExtraCallback = onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4, appBarKtExternalSyntheticLambda5.onExtraCallback, this.IAuthTabCallback, f);
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42 = null;
        if ("audio/raw".equals(appBarKtExternalSyntheticLambda5.asBinder)) {
            int i3 = writeTypedObject + 3;
            extraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                "audio/raw".equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable);
                throw null;
            }
            if (!"audio/raw".equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable)) {
                int i4 = extraCallback + 89;
                writeTypedObject = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 1 / 0;
                }
                basicTextContextMenuProviderKtExternalSyntheticLambda42 = basicTextContextMenuProviderKtExternalSyntheticLambda4;
            }
        }
        this.IAuthTabCallbackStub = basicTextContextMenuProviderKtExternalSyntheticLambda42;
        return AndroidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted.IAuthTabCallback(appBarKtExternalSyntheticLambda5, mediaFormatOnExtraCallback, basicTextContextMenuProviderKtExternalSyntheticLambda4, mediaCrypto, this.IAuthTabCallbackStubProxy);
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public TextStringSimpleNodeExternalSyntheticLambda0 IAuthTabCallback(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42) {
        int i2;
        int i3 = 2 % 2;
        TextStringSimpleNodeExternalSyntheticLambda0 textStringSimpleNodeExternalSyntheticLambda0OnNavigationEvent = appBarKtExternalSyntheticLambda5.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4, basicTextContextMenuProviderKtExternalSyntheticLambda42);
        int i4 = textStringSimpleNodeExternalSyntheticLambda0OnNavigationEvent.onExtraCallback;
        if (onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda42)) {
            int i5 = writeTypedObject + 7;
            extraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            i4 |= 32768;
        }
        if (IAuthTabCallback(appBarKtExternalSyntheticLambda5, basicTextContextMenuProviderKtExternalSyntheticLambda42) > this.IAuthTabCallback) {
            i4 |= 64;
        }
        int i6 = i4;
        String str = appBarKtExternalSyntheticLambda5.IAuthTabCallbackStub;
        if (i6 != 0) {
            int i7 = writeTypedObject + 81;
            extraCallback = i7 % 128;
            int i8 = i7 % 2;
            i2 = 0;
        } else {
            i2 = textStringSimpleNodeExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback;
            int i9 = extraCallback + 9;
            writeTypedObject = i9 % 128;
            int i10 = i9 % 2;
        }
        TextStringSimpleNodeExternalSyntheticLambda0 textStringSimpleNodeExternalSyntheticLambda0 = new TextStringSimpleNodeExternalSyntheticLambda0(str, basicTextContextMenuProviderKtExternalSyntheticLambda4, basicTextContextMenuProviderKtExternalSyntheticLambda42, i2, i6);
        int i11 = writeTypedObject + 55;
        extraCallback = i11 % 128;
        if (i11 % 2 != 0) {
            return textStringSimpleNodeExternalSyntheticLambda0;
        }
        throw null;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public long onNavigationEvent(long j, long j2, boolean z) {
        float f;
        int i2 = 2 % 2;
        boolean z2 = this.readTypedObject != -9223372036854775807L;
        if (this.getInterfaceDescriptor) {
            long jOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted();
            if (!z2 || jOnWarmupCompleted == -9223372036854775807L) {
                return 10000L;
            }
            float fMin = Math.min(jOnWarmupCompleted, this.readTypedObject - j);
            if (onNavigationEvent() != null) {
                f = onNavigationEvent().onExtraCallbackWithResult;
                int i3 = extraCallback + 65;
                writeTypedObject = i3 % 128;
                int i4 = i3 % 2;
            } else {
                f = 1.0f;
            }
            return Math.max(10000L, ((long) ((fMin / f) / 2.0f)) - (TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(onExtraCallback().IAuthTabCallback()) - j2));
        }
        if (!z2) {
            int i5 = extraCallback + 15;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            if (!super.prefetch()) {
                int i7 = writeTypedObject + 57;
                extraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    return 10000L;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i8 = writeTypedObject + 5;
        extraCallback = i8 % 128;
        int i9 = i8 % 2;
        return 1000000L;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public float onExtraCallback(float f, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr) {
        int i2 = 2 % 2;
        int i3 = extraCallback + 25;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        int iMax = -1;
        for (BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42 : basicTextContextMenuProviderKtExternalSyntheticLambda4Arr) {
            int i5 = basicTextContextMenuProviderKtExternalSyntheticLambda42.prefetch;
            if (i5 != -1) {
                int i6 = writeTypedObject + 97;
                extraCallback = i6 % 128;
                int i7 = i6 % 2;
                iMax = Math.max(iMax, i5);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        float f2 = iMax * f;
        int i8 = writeTypedObject + 45;
        extraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 55 / 0;
        }
        return f2;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public void onExtraCallbackWithResult(String str, AndroidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted onwarmupcompleted, long j, long j2) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 103;
        extraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            this.access100.onExtraCallbackWithResult(str, j, j2);
        } else {
            this.access100.onExtraCallbackWithResult(str, j, j2);
            int i4 = 90 / 0;
        }
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public void onNavigationEvent(String str) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 87;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            this.access100.IAuthTabCallback(str);
            throw null;
        }
        this.access100.IAuthTabCallback(str);
        int i4 = writeTypedObject + 67;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public void onExtraCallbackWithResult(Exception exc) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 111;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.access100.onWarmupCompleted(exc);
        int i5 = writeTypedObject + 19;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public TextStringSimpleNodeExternalSyntheticLambda0 onNavigationEvent(AndroidSelectionHandles_androidKtExternalSyntheticLambda7 androidSelectionHandles_androidKtExternalSyntheticLambda7) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 83;
        extraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(androidSelectionHandles_androidKtExternalSyntheticLambda7.onWarmupCompleted);
            this.access000 = basicTextContextMenuProviderKtExternalSyntheticLambda4;
            TextStringSimpleNodeExternalSyntheticLambda0 textStringSimpleNodeExternalSyntheticLambda0OnNavigationEvent = super.onNavigationEvent(androidSelectionHandles_androidKtExternalSyntheticLambda7);
            this.access100.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4, textStringSimpleNodeExternalSyntheticLambda0OnNavigationEvent);
            int i4 = extraCallback + 119;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            return textStringSimpleNodeExternalSyntheticLambda0OnNavigationEvent;
        }
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42 = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(androidSelectionHandles_androidKtExternalSyntheticLambda7.onWarmupCompleted);
        this.access000 = basicTextContextMenuProviderKtExternalSyntheticLambda42;
        this.access100.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda42, super.onNavigationEvent(androidSelectionHandles_androidKtExternalSyntheticLambda7));
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.AndroidSelectionHandles_androidKtExternalSyntheticLambda4 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0126 A[Catch: onExtraCallback -> 0x013d, TryCatch #1 {onExtraCallback -> 0x013d, blocks: (B:36:0x00f8, B:38:0x00fe, B:43:0x0110, B:45:0x0118, B:52:0x0126, B:50:0x011e, B:53:0x0132, B:54:0x0137), top: B:61:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0132 A[Catch: onExtraCallback -> 0x013d, TryCatch #1 {onExtraCallback -> 0x013d, blocks: (B:36:0x00f8, B:38:0x00fe, B:43:0x0110, B:45:0x0118, B:52:0x0126, B:50:0x011e, B:53:0x0132, B:54:0x0137), top: B:61:0x00f8 }] */
    @Override // o.AppBarKtExternalSyntheticLambda8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable MediaFormat mediaFormat) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int iIAuthTabCallbackStub;
        int i2;
        int i3 = 2 % 2;
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42 = this.IAuthTabCallbackStub;
        int[] iArrIAuthTabCallback = null;
        if (basicTextContextMenuProviderKtExternalSyntheticLambda42 != null) {
            int i4 = writeTypedObject + 107;
            extraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            basicTextContextMenuProviderKtExternalSyntheticLambda4 = basicTextContextMenuProviderKtExternalSyntheticLambda42;
        } else if (prefetchWithMultipleUrls() != null) {
            if ("audio/raw".equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable)) {
                int i5 = extraCallback + 1;
                writeTypedObject = i5 % 128;
                int i6 = i5 % 2;
                iIAuthTabCallbackStub = basicTextContextMenuProviderKtExternalSyntheticLambda4.onUnminimized;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iIAuthTabCallbackStub = mediaFormat.getInteger("pcm-encoding");
                int i7 = writeTypedObject + 41;
                extraCallback = i7 % 128;
                int i8 = i7 % 2;
            } else {
                iIAuthTabCallbackStub = mediaFormat.containsKey("v-bits-per-sample") ? TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallbackStub(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            }
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().IAuthTabCallbackDefault("audio/raw").writeTypedObject(iIAuthTabCallbackStub).onTransact(basicTextContextMenuProviderKtExternalSyntheticLambda4.access100).asBinder(basicTextContextMenuProviderKtExternalSyntheticLambda4.extraCallbackWithResult).onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallbackDefault).IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStubProxy).onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4.readTypedObject).IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.onMinimized).onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4.onActivityResized).onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4.onActivityLayout).onActivityResized(basicTextContextMenuProviderKtExternalSyntheticLambda4.newAuthTabSession).readTypedObject(basicTextContextMenuProviderKtExternalSyntheticLambda4.mayLaunchUrl).onExtraCallback(mediaFormat.getInteger("channel-count")).extraCallbackWithResult(mediaFormat.getInteger("sample-rate")).onNavigationEvent();
            if (this.asInterface) {
                int i9 = writeTypedObject + 43;
                extraCallback = i9 % 128;
                int i10 = i9 % 2;
                if (basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.onNavigationEvent == 6 && (i2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent) < 6) {
                    int[] iArr = new int[i2];
                    for (int i11 = 0; i11 < basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent; i11++) {
                        iArr[i11] = i11;
                    }
                    iArrIAuthTabCallback = iArr;
                } else if (this.IAuthTabCallbackDefault) {
                    int i12 = writeTypedObject + 9;
                    extraCallback = i12 % 128;
                    int i13 = i12 % 2;
                    iArrIAuthTabCallback = ExposedDropdownMenu_androidKtExternalSyntheticLambda6.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.onNavigationEvent);
                }
                basicTextContextMenuProviderKtExternalSyntheticLambda4 = basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent;
            }
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                if (!access200()) {
                    this.onExtraCallback.onExtraCallback(0);
                } else {
                    int i14 = extraCallback + 49;
                    writeTypedObject = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = 19 / 0;
                        if (aa_().onNavigationEvent != 0) {
                            this.onExtraCallback.onExtraCallback(aa_().onNavigationEvent);
                        }
                    } else if (aa_().onNavigationEvent != 0) {
                    }
                }
            }
            this.onExtraCallback.onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4, 0, iArrIAuthTabCallback);
        } catch (SelectionManagerExternalSyntheticLambda2.onExtraCallback e) {
            throw onExtraCallbackWithResult(e, e.format, 5001);
        }
    }

    protected void newSessionWithExtras() {
        int i2 = 2 % 2;
        int i3 = extraCallback + 75;
        int i4 = i3 % 128;
        writeTypedObject = i4;
        int i5 = i3 % 2;
        this.onNavigationEvent = true;
        int i6 = i4 + 121;
        extraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 84 / 0;
        }
    }

    @Override // o.AppBarKtExternalSyntheticLambda8, o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onWarmupCompleted(boolean z, boolean z2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int i2 = 2 % 2;
        int i3 = extraCallback + 25;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            super.onWarmupCompleted(z, z2);
            this.access100.onNavigationEvent(((AppBarKtExternalSyntheticLambda8) this).onExtraCallbackWithResult);
            if (!(!aa_().onWarmupCompleted)) {
                this.onExtraCallback.onExtraCallbackWithResult();
            } else {
                this.onExtraCallback.IAuthTabCallback();
            }
            this.onExtraCallback.onExtraCallback(asBinder());
            this.onExtraCallback.onWarmupCompleted(onExtraCallback());
            int i4 = extraCallback + 111;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        super.onWarmupCompleted(z, z2);
        this.access100.onNavigationEvent(((AppBarKtExternalSyntheticLambda8) this).onExtraCallbackWithResult);
        boolean z3 = aa_().onWarmupCompleted;
        throw null;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8, o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onExtraCallbackWithResult(long j, boolean z) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int i2 = 2 % 2;
        int i3 = extraCallback + 19;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        super.onExtraCallbackWithResult(j, z);
        this.onExtraCallback.onNavigationEvent();
        this.asBinder = j;
        this.readTypedObject = -9223372036854775807L;
        this.IAuthTabCallback_Parcel = false;
        this.onNavigationEvent = true;
        int i5 = writeTypedObject + 49;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 78 / 0;
        }
    }

    @Override // o.AppBarKtExternalSyntheticLambda8, o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void ICustomTabsCallbackDefault() {
        int i2 = 2 % 2;
        int i3 = extraCallback + 115;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        super.ICustomTabsCallbackDefault();
        this.onExtraCallback.IAuthTabCallbackStub();
        this.getInterfaceDescriptor = true;
        int i5 = writeTypedObject + 91;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8, o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onUnminimized() {
        int i2 = 2 % 2;
        int i3 = extraCallback + 79;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        ITrustedWebActivityCallback();
        this.getInterfaceDescriptor = false;
        this.onExtraCallback.IAuthTabCallbackDefault();
        super.onUnminimized();
        int i5 = extraCallback + 3;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
    }

    @Override // o.AppBarKtExternalSyntheticLambda8, o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onMinimized() {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 13;
        extraCallback = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                this.onWarmupCompleted = true;
                this.access000 = null;
                this.readTypedObject = -9223372036854775807L;
                this.onExtraCallback.onNavigationEvent();
            } else {
                this.onWarmupCompleted = true;
                this.access000 = null;
                this.readTypedObject = -9223372036854775807L;
                this.onExtraCallback.onNavigationEvent();
            }
            try {
                super.onMinimized();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.onMinimized();
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    @Override // o.AppBarKtExternalSyntheticLambda8, o.TextAnnotatedStringNodeExternalSyntheticLambda4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onActivityResized() {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 81;
        extraCallback = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                this.IAuthTabCallback_Parcel = false;
                this.readTypedObject = -9223372036854775807L;
                super.onActivityResized();
                if (this.onWarmupCompleted) {
                    this.onWarmupCompleted = false;
                    this.onExtraCallback.access000();
                }
            } else {
                this.IAuthTabCallback_Parcel = false;
                this.readTypedObject = -9223372036854775807L;
                super.onActivityResized();
                if (this.onWarmupCompleted) {
                }
            }
            int i4 = writeTypedObject + 17;
            extraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            if (this.onWarmupCompleted) {
                this.onWarmupCompleted = false;
                this.onExtraCallback.access000();
                int i5 = extraCallback + 117;
                writeTypedObject = i5 % 128;
                int i6 = i5 % 2;
            }
            throw th;
        }
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onMessageChannelReady() {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 21;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            this.onExtraCallback.access100();
            if (Build.VERSION.SDK_INT < 122) {
                return;
            }
        } else {
            this.onExtraCallback.access100();
            if (Build.VERSION.SDK_INT < 35) {
                return;
            }
        }
        AppBarKtExternalSyntheticLambda1 appBarKtExternalSyntheticLambda1 = this.IAuthTabCallbackStubProxy;
        if (appBarKtExternalSyntheticLambda1 != null) {
            appBarKtExternalSyntheticLambda1.onExtraCallback();
            int i4 = writeTypedObject + 63;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // o.AppBarKtExternalSyntheticLambda8, androidx.media3.exoplayer.Renderer
    public boolean prefetch() {
        int i2 = 2 % 2;
        int i3 = extraCallback + 51;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            super.prefetch();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (super.prefetch()) {
            int i4 = extraCallback + 17;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            boolean zAsInterface = this.onExtraCallback.asInterface();
            if (i5 != 0) {
                int i6 = 11 / 0;
                if (zAsInterface) {
                    return true;
                }
            } else if (zAsInterface) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8, androidx.media3.exoplayer.Renderer
    public boolean newAuthTabSession() {
        int i2 = 2 % 2;
        int i3 = extraCallback + 37;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            this.onExtraCallback.asBinder();
            throw null;
        }
        if (this.onExtraCallback.asBinder() || super.newAuthTabSession()) {
            return true;
        }
        int i4 = extraCallback + 59;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return false;
    }

    @Override // o.PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0
    public long IAuthTabCallback() {
        int i2 = 2 % 2;
        if (getInterfaceDescriptor() == 2) {
            int i3 = extraCallback + 61;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            ITrustedWebActivityCallback();
            int i5 = extraCallback + 119;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
        }
        return this.asBinder;
    }

    @Override // o.PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0
    public boolean onExtraCallbackWithResult() {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 69;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.IAuthTabCallback_Parcel;
        this.IAuthTabCallback_Parcel = false;
        return z;
    }

    @Override // o.PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0
    public void IAuthTabCallback(AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1) {
        int i2 = 2 % 2;
        int i3 = extraCallback + 107;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallback.onNavigationEvent(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1);
        if (i4 != 0) {
            throw null;
        }
    }

    @Override // o.PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0
    public AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 119;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        SelectionManagerExternalSyntheticLambda2 selectionManagerExternalSyntheticLambda2 = this.onExtraCallback;
        if (i4 != 0) {
            return selectionManagerExternalSyntheticLambda2.onExtraCallback();
        }
        selectionManagerExternalSyntheticLambda2.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public void postMessage() {
        int i2 = 2 % 2;
        int i3 = extraCallback + 7;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        super.postMessage();
        this.onExtraCallback.onTransact();
        int i5 = extraCallback + 81;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.AndroidSelectionHandles_androidKtExternalSyntheticLambda4 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    @Override // o.AppBarKtExternalSyntheticLambda8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onWarmupCompleted(long j, long j2, @Nullable AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4, @Nullable ByteBuffer byteBuffer, int i2, int i3, int i4, long j3, boolean z, boolean z2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = writeTypedObject;
        int i9 = i8 + 17;
        extraCallback = i9 % 128;
        int i10 = i9 % 2;
        this.readTypedObject = -9223372036854775807L;
        if (this.IAuthTabCallbackStub != null) {
            int i11 = i8 + 113;
            extraCallback = i11 % 128;
            if (i11 % 2 != 0 ? (i3 & 2) != 0 : (i3 & 5) != 0) {
                ((AndroidMenu_androidKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(androidMenu_androidKtExternalSyntheticLambda4)).onWarmupCompleted(i2, false);
                return true;
            }
        }
        if (z) {
            if (androidMenu_androidKtExternalSyntheticLambda4 != null) {
                int i12 = extraCallback + 95;
                writeTypedObject = i12 % 128;
                int i13 = i12 % 2;
                androidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted(i2, false);
            }
            ((AppBarKtExternalSyntheticLambda8) this).onExtraCallbackWithResult.onTransact += i4;
            this.onExtraCallback.onTransact();
            return true;
        }
        try {
            if (!this.onExtraCallback.IAuthTabCallback(byteBuffer, j3, i4)) {
                this.readTypedObject = j3;
                return false;
            }
            if (androidMenu_androidKtExternalSyntheticLambda4 != null) {
                androidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted(i2, false);
            }
            ((AppBarKtExternalSyntheticLambda8) this).onExtraCallbackWithResult.IAuthTabCallbackDefault += i4;
            return true;
        } catch (SelectionManagerExternalSyntheticLambda2.IAuthTabCallbackStub e) {
            boolean z3 = e.isRecoverable;
            if (access200()) {
                int i14 = writeTypedObject + 31;
                extraCallback = i14 % 128;
                int i15 = i14 % 2;
                if (aa_().onNavigationEvent != 0) {
                    int i16 = writeTypedObject + 21;
                    extraCallback = i16 % 128;
                    i6 = i16 % 2 == 0 ? 4794 : 5003;
                } else {
                    i6 = 5002;
                }
            }
            throw onExtraCallback(e, basicTextContextMenuProviderKtExternalSyntheticLambda4, z3, i6);
        } catch (SelectionManagerExternalSyntheticLambda2.onWarmupCompleted e2) {
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42 = this.access000;
            boolean z4 = e2.isRecoverable;
            if (!access200() || aa_().onNavigationEvent == 0) {
                int i17 = extraCallback + 15;
                writeTypedObject = i17 % 128;
                int i18 = i17 % 2;
                i5 = 5001;
            } else {
                i5 = 5004;
            }
            throw onExtraCallback(e2, basicTextContextMenuProviderKtExternalSyntheticLambda42, z4, i5);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.AndroidSelectionHandles_androidKtExternalSyntheticLambda4 */
    @Override // o.AppBarKtExternalSyntheticLambda8
    public void newSession() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int i2 = 2 % 2;
        int i3 = extraCallback + 31;
        writeTypedObject = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                this.onExtraCallback.IAuthTabCallbackStubProxy();
                if (ICustomTabsServiceDefault() != -9223372036854775807L) {
                    this.readTypedObject = ICustomTabsServiceDefault();
                    int i4 = writeTypedObject + 37;
                    extraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
                return;
            }
            this.onExtraCallback.IAuthTabCallbackStubProxy();
            ICustomTabsServiceDefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (SelectionManagerExternalSyntheticLambda2.IAuthTabCallbackStub e) {
            throw onExtraCallback(e, e.format, e.isRecoverable, access200() ? 5003 : 5002);
        }
    }

    @Override // o.AppBarKtExternalSyntheticLambda8, o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void handleMessage(int i2, @Nullable Object obj) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int i3 = 2 % 2;
        if (i2 == 2) {
            this.onExtraCallback.onWarmupCompleted(((Float) RecordingInputConnection_androidKt.onExtraCallbackWithResult(obj)).floatValue());
            int i4 = writeTypedObject + 33;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        if (i2 == 3) {
            this.onExtraCallback.onWarmupCompleted((TextContextMenuHelperApi28ExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallbackWithResult((TextContextMenuHelperApi28ExternalSyntheticLambda5) obj));
            return;
        }
        int i6 = writeTypedObject + 79;
        int i7 = i6 % 128;
        extraCallback = i7;
        int i8 = i6 % 2;
        if (i2 == 6) {
            this.onExtraCallback.onExtraCallback((TextContextMenuModifierKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult((TextContextMenuModifierKtExternalSyntheticLambda0) obj));
            return;
        }
        if (i2 == 12) {
            onWarmupCompleted.onExtraCallback(this.onExtraCallback, obj);
            return;
        }
        int i9 = i7 + 71;
        writeTypedObject = i9 % 128;
        if (i9 % 2 == 0 ? i2 == 16 : i2 == 95) {
            this.ICustomTabsCallback = ((Integer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(obj)).intValue();
            IPostMessageServiceStub();
        } else if (i2 == 9) {
            this.onExtraCallback.onWarmupCompleted(((Boolean) RecordingInputConnection_androidKt.onExtraCallbackWithResult(obj)).booleanValue());
        } else if (i2 == 10) {
            asInterface(((Integer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(obj)).intValue());
        } else {
            super.handleMessage(i2, obj);
        }
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public void IAuthTabCallback(SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2) {
        ByteBuffer byteBuffer;
        int i2;
        int i3 = 2 % 2;
        int i4 = writeTypedObject + 95;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        if (Build.VERSION.SDK_INT >= 29) {
            int i6 = extraCallback + 9;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = selectionControllerExternalSyntheticLambda2.onExtraCallbackWithResult;
            if (basicTextContextMenuProviderKtExternalSyntheticLambda4 != null) {
                int i8 = writeTypedObject + 109;
                extraCallback = i8 % 128;
                int i9 = i8 % 2;
                if (Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, "audio/opus") && access200()) {
                    int i10 = extraCallback + 87;
                    writeTypedObject = i10 % 128;
                    if (i10 % 2 != 0) {
                        byteBuffer = (ByteBuffer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(selectionControllerExternalSyntheticLambda2.onNavigationEvent);
                        i2 = ((BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(selectionControllerExternalSyntheticLambda2.onExtraCallbackWithResult)).access100;
                        if (byteBuffer.remaining() != 2) {
                            return;
                        }
                    } else {
                        byteBuffer = (ByteBuffer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(selectionControllerExternalSyntheticLambda2.onNavigationEvent);
                        i2 = ((BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(selectionControllerExternalSyntheticLambda2.onExtraCallbackWithResult)).access100;
                        if (byteBuffer.remaining() != 8) {
                            return;
                        }
                    }
                    this.onExtraCallback.IAuthTabCallback(i2, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r3 = r12.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r5 >= r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r6 = o.SelectionManager_androidKtExternalSyntheticLambda0.writeTypedObject + 91;
        o.SelectionManager_androidKtExternalSyntheticLambda0.extraCallback = r6 % 128;
        r6 = r6 % 2;
        r6 = r12[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r10.onNavigationEvent(r11, r6).IAuthTabCallback == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        r7 = o.SelectionManager_androidKtExternalSyntheticLambda0.writeTypedObject + 1;
        o.SelectionManager_androidKtExternalSyntheticLambda0.extraCallback = r7 % 128;
        r7 = r7 % 2;
        r1 = java.lang.Math.max(r1, IAuthTabCallback(r10, r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r7 != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        r6 = 53 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r12.length == 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r12.length == 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r10 = o.SelectionManager_androidKtExternalSyntheticLambda0.extraCallback + 37;
        o.SelectionManager_androidKtExternalSyntheticLambda0.writeTypedObject = r10 % 128;
        r10 = r10 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected int onWarmupCompleted(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr) {
        int iIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = extraCallback + 119;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            iIAuthTabCallback = IAuthTabCallback(appBarKtExternalSyntheticLambda5, basicTextContextMenuProviderKtExternalSyntheticLambda4);
        } else {
            iIAuthTabCallback = IAuthTabCallback(appBarKtExternalSyntheticLambda5, basicTextContextMenuProviderKtExternalSyntheticLambda4);
        }
    }

    private int IAuthTabCallback(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 97;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        "OMX.google.raw.decoder".equals(appBarKtExternalSyntheticLambda5.IAuthTabCallbackStub);
        int i5 = basicTextContextMenuProviderKtExternalSyntheticLambda4.onPostMessage;
        int i6 = extraCallback + 119;
        writeTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 34 / 0;
        }
        return i5;
    }

    protected MediaFormat onExtraCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, String str, int i2, float f) throws Throwable {
        int i3 = 2 % 2;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent);
        mediaFormat.setInteger("sample-rate", basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetch);
        TextFieldDecoratorModifierNodeExternalSyntheticLambda22.onNavigationEvent(mediaFormat, (List<byte[]>) basicTextContextMenuProviderKtExternalSyntheticLambda4.onMessageChannelReady);
        TextFieldDecoratorModifierNodeExternalSyntheticLambda22.onWarmupCompleted(mediaFormat, "max-input-size", i2);
        int i4 = Build.VERSION.SDK_INT;
        Object[] objArr = new Object[1];
        a(new int[]{890337568, 1114498008, 1203771870, -1581452412}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8, objArr);
        mediaFormat.setInteger(((String) objArr[0]).intern(), 0);
        Object obj = null;
        if (f != -1.0f && !IEngagementSignalsCallback_Parcel()) {
            int i5 = writeTypedObject + 101;
            extraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                mediaFormat.setFloat("operating-rate", f);
            } else {
                mediaFormat.setFloat("operating-rate", f);
                obj.hashCode();
                throw null;
            }
        }
        if ("audio/ac4".equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable)) {
            Pair<Integer, Integer> pairIAuthTabCallback = TextFieldCoreModifierNodeExternalSyntheticLambda1.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4);
            if (pairIAuthTabCallback != null) {
                int i6 = extraCallback + 35;
                writeTypedObject = i6 % 128;
                if (i6 % 2 == 0) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda22.onWarmupCompleted(mediaFormat, "profile", ((Integer) pairIAuthTabCallback.first).intValue());
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda22.onWarmupCompleted(mediaFormat, "level", ((Integer) pairIAuthTabCallback.second).intValue());
                    int i7 = extraCallback + 85;
                    writeTypedObject = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda22.onWarmupCompleted(mediaFormat, "profile", ((Integer) pairIAuthTabCallback.first).intValue());
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda22.onWarmupCompleted(mediaFormat, "level", ((Integer) pairIAuthTabCallback.second).intValue());
                    obj.hashCode();
                    throw null;
                }
            }
            if (i4 <= 28) {
                int i9 = extraCallback + 9;
                writeTypedObject = i9 % 128;
                if (i9 % 2 != 0) {
                    mediaFormat.setInteger("ac4-is-sync", 0);
                } else {
                    mediaFormat.setInteger("ac4-is-sync", 1);
                }
            }
        }
        SelectionManagerExternalSyntheticLambda2 selectionManagerExternalSyntheticLambda2 = this.onExtraCallback;
        Object[] objArr2 = {4, Integer.valueOf(basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent), Integer.valueOf(basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetch)};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        if (selectionManagerExternalSyntheticLambda2.onExtraCallback((BasicTextContextMenuProviderKtExternalSyntheticLambda4) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(144892520, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr2, -144892508)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i4 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i4 >= 35) {
            int i10 = extraCallback + 53;
            writeTypedObject = i10 % 128;
            int i11 = i10 % 2;
            mediaFormat.setInteger("importance", Math.max(0, -this.ICustomTabsCallback));
        }
        return mediaFormat;
    }

    private void asInterface(int i2) {
        AppBarKtExternalSyntheticLambda1 appBarKtExternalSyntheticLambda1;
        int i3 = 2 % 2;
        int i4 = extraCallback + 21;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        this.onExtraCallback.onExtraCallbackWithResult(i2);
        if (Build.VERSION.SDK_INT >= 35 && (appBarKtExternalSyntheticLambda1 = this.IAuthTabCallbackStubProxy) != null) {
            int i6 = writeTypedObject + 41;
            extraCallback = i6 % 128;
            int i7 = i6 % 2;
            appBarKtExternalSyntheticLambda1.onExtraCallback(i2);
        }
        int i8 = writeTypedObject + 1;
        extraCallback = i8 % 128;
        int i9 = i8 % 2;
    }

    private void IPostMessageServiceStub() {
        int i2 = 2 % 2;
        AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4PrefetchWithMultipleUrls = prefetchWithMultipleUrls();
        if (androidMenu_androidKtExternalSyntheticLambda4PrefetchWithMultipleUrls != null) {
            int i3 = writeTypedObject + 55;
            extraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                if (Build.VERSION.SDK_INT < 86) {
                    return;
                }
            } else if (Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.ICustomTabsCallback));
            androidMenu_androidKtExternalSyntheticLambda4PrefetchWithMultipleUrls.onExtraCallbackWithResult(bundle);
            int i4 = extraCallback + 105;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private void ITrustedWebActivityCallback() {
        int i2 = 2 % 2;
        long jIAuthTabCallback = this.onExtraCallback.IAuthTabCallback(prefetch());
        if (jIAuthTabCallback != Long.MIN_VALUE) {
            int i3 = extraCallback + 25;
            int i4 = i3 % 128;
            writeTypedObject = i4;
            int i5 = i3 % 2;
            if (!this.onNavigationEvent) {
                int i6 = i4 + 89;
                extraCallback = i6 % 128;
                int i7 = i6 % 2;
                jIAuthTabCallback = Math.max(this.asBinder, jIAuthTabCallback);
                int i8 = writeTypedObject + 79;
                extraCallback = i8 % 128;
                int i9 = i8 % 2;
            }
            this.asBinder = jIAuthTabCallback;
            this.onNavigationEvent = false;
        }
        int i10 = extraCallback + 49;
        writeTypedObject = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String str = (String) objArr[0];
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 79;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (!str.equals("OMX.google.opus.decoder") && !str.equals("c2.android.opus.decoder") && !str.equals("OMX.google.vorbis.decoder")) {
            int i5 = extraCallback + 105;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            if (!str.equals("c2.android.vorbis.decoder")) {
                return false;
            }
        }
        return true;
    }

    static /* synthetic */ SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult onWarmupCompleted(SelectionManager_androidKtExternalSyntheticLambda0 selectionManager_androidKtExternalSyntheticLambda0) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        return (SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), iOnWarmupCompleted, -1316561217, 1316561219, zzgsa.onWarmupCompleted(), new Object[]{selectionManager_androidKtExternalSyntheticLambda0}, iOnWarmupCompleted2);
    }

    final class IAuthTabCallback implements SelectionManagerExternalSyntheticLambda2.onNavigationEvent {
        private IAuthTabCallback() {
        }

        @Override // o.SelectionManagerExternalSyntheticLambda2.onNavigationEvent
        public void onWarmupCompleted() {
            SelectionManager_androidKtExternalSyntheticLambda0.this.newSessionWithExtras();
        }

        @Override // o.SelectionManagerExternalSyntheticLambda2.onNavigationEvent
        public void onExtraCallbackWithResult() {
            SelectionManager_androidKtExternalSyntheticLambda0.IAuthTabCallback(SelectionManager_androidKtExternalSyntheticLambda0.this, true);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda2.onNavigationEvent
        public void onWarmupCompleted(long j) {
            Object[] objArr = {SelectionManager_androidKtExternalSyntheticLambda0.this};
            ((SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult) SelectionManager_androidKtExternalSyntheticLambda0.onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -1316561217, 1316561219, zzgsa.onWarmupCompleted(), objArr, zzgsa.onWarmupCompleted())).onNavigationEvent(j);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda2.onNavigationEvent
        public void onExtraCallback(int i2, long j, long j2) {
            Object[] objArr = {SelectionManager_androidKtExternalSyntheticLambda0.this};
            ((SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult) SelectionManager_androidKtExternalSyntheticLambda0.onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -1316561217, 1316561219, zzgsa.onWarmupCompleted(), objArr, zzgsa.onWarmupCompleted())).onExtraCallback(i2, j, j2);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda2.onNavigationEvent
        public void onNavigationEvent(boolean z) {
            Object[] objArr = {SelectionManager_androidKtExternalSyntheticLambda0.this};
            ((SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult) SelectionManager_androidKtExternalSyntheticLambda0.onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -1316561217, 1316561219, zzgsa.onWarmupCompleted(), objArr, zzgsa.onWarmupCompleted())).onExtraCallbackWithResult(z);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda2.onNavigationEvent
        public void onExtraCallback() {
            Renderer.WakeupListener wakeupListenerOnExtraCallbackWithResult = SelectionManager_androidKtExternalSyntheticLambda0.onExtraCallbackWithResult(SelectionManager_androidKtExternalSyntheticLambda0.this);
            if (wakeupListenerOnExtraCallbackWithResult != null) {
                wakeupListenerOnExtraCallbackWithResult.IAuthTabCallback();
            }
        }

        @Override // o.SelectionManagerExternalSyntheticLambda2.onNavigationEvent
        public void onNavigationEvent() {
            Renderer.WakeupListener wakeupListenerOnExtraCallback = SelectionManager_androidKtExternalSyntheticLambda0.onExtraCallback(SelectionManager_androidKtExternalSyntheticLambda0.this);
            if (wakeupListenerOnExtraCallback != null) {
                wakeupListenerOnExtraCallback.onExtraCallbackWithResult();
            }
        }

        @Override // o.SelectionManagerExternalSyntheticLambda2.onNavigationEvent
        public void onWarmupCompleted(Exception exc) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MediaCodecAudioRenderer", "Audio sink error", exc);
            Object[] objArr = {SelectionManager_androidKtExternalSyntheticLambda0.this};
            ((SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult) SelectionManager_androidKtExternalSyntheticLambda0.onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -1316561217, 1316561219, zzgsa.onWarmupCompleted(), objArr, zzgsa.onWarmupCompleted())).onExtraCallback(exc);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda2.onNavigationEvent
        public void IAuthTabCallback() {
            SelectionManager_androidKtExternalSyntheticLambda0.IAuthTabCallback(SelectionManager_androidKtExternalSyntheticLambda0.this);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda2.onNavigationEvent
        public void onNavigationEvent(SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback) {
            Object[] objArr = {SelectionManager_androidKtExternalSyntheticLambda0.this};
            ((SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult) SelectionManager_androidKtExternalSyntheticLambda0.onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -1316561217, 1316561219, zzgsa.onWarmupCompleted(), objArr, zzgsa.onWarmupCompleted())).onExtraCallback(iAuthTabCallback);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda2.onNavigationEvent
        public void IAuthTabCallback(SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback) {
            Object[] objArr = {SelectionManager_androidKtExternalSyntheticLambda0.this};
            ((SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult) SelectionManager_androidKtExternalSyntheticLambda0.onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -1316561217, 1316561219, zzgsa.onWarmupCompleted(), objArr, zzgsa.onWarmupCompleted())).onExtraCallbackWithResult(iAuthTabCallback);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda2.onNavigationEvent
        public void onWarmupCompleted(int i2) {
            if (Build.VERSION.SDK_INT >= 35 && SelectionManager_androidKtExternalSyntheticLambda0.onNavigationEvent(SelectionManager_androidKtExternalSyntheticLambda0.this) != null) {
                SelectionManager_androidKtExternalSyntheticLambda0.onNavigationEvent(SelectionManager_androidKtExternalSyntheticLambda0.this).onExtraCallback(i2);
            }
            Object[] objArr = {SelectionManager_androidKtExternalSyntheticLambda0.this};
            ((SelectionManagerExternalSyntheticLambda5.onExtraCallbackWithResult) SelectionManager_androidKtExternalSyntheticLambda0.onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -1316561217, 1316561219, zzgsa.onWarmupCompleted(), objArr, zzgsa.onWarmupCompleted())).onExtraCallbackWithResult(i2);
        }
    }

    private static boolean onExtraCallback(String str) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        return ((Boolean) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), iOnWarmupCompleted, -1283449949, 1283449950, zzgsa.onWarmupCompleted(), new Object[]{str}, iOnWarmupCompleted2)).booleanValue();
    }

    private static List<AppBarKtExternalSyntheticLambda5> onWarmupCompleted(AppBarKtExternalSyntheticLambda6 appBarKtExternalSyntheticLambda6, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, boolean z, SelectionManagerExternalSyntheticLambda2 selectionManagerExternalSyntheticLambda2) throws AppBarKtExternalSyntheticLambda9.onExtraCallback {
        Object[] objArr = {appBarKtExternalSyntheticLambda6, basicTextContextMenuProviderKtExternalSyntheticLambda4, Boolean.valueOf(z), selectionManagerExternalSyntheticLambda2};
        return (List) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -995744095, 995744095, zzgsa.onWarmupCompleted(), objArr, zzgsa.onWarmupCompleted());
    }

    static final class onWarmupCompleted {
        public static void onExtraCallback(SelectionManagerExternalSyntheticLambda2 selectionManagerExternalSyntheticLambda2, @Nullable Object obj) {
            selectionManagerExternalSyntheticLambda2.onExtraCallback((AudioDeviceInfo) obj);
        }
    }
}
