package o;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Display;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alibaba.ariver.app.ui.DefaultViewSpecProvider;
import com.alibaba.ariver.kernel.RVParams;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.material.button.MaterialButton;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.zxing.aztec.encoder.Encoder;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import o.AndroidMenu_androidKtExternalSyntheticLambda4;
import o.AppBarKtExternalSyntheticLambda9;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
import o.DrawerKtExternalSyntheticLambda1;
import o.DrawerKtExternalSyntheticLambda10;
import o.DrawerKtExternalSyntheticLambda14;
import o.DrawerKtExternalSyntheticLambda15;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class DraggableAnchorsNodeExternalSyntheticLambda0 extends AppBarKtExternalSyntheticLambda8 implements DrawerKtExternalSyntheticLambda10.IAuthTabCallback {
    private static final int[] IAuthTabCallback;
    private static int ICustomTabsServiceDefault;
    private static int access200;
    private static boolean onExtraCallback;
    private static boolean onNavigationEvent;
    private final ComposableSingletonsTabRowKtExternalSyntheticLambda1 IAuthTabCallbackDefault;
    private IAuthTabCallback IAuthTabCallbackStub;
    private CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private Surface ICustomTabsCallback;
    private boolean ICustomTabsCallbackDefault;
    private int ICustomTabsCallbackStub;
    private final long ICustomTabsCallbackStubProxy;
    private boolean ICustomTabsCallback_Parcel;
    private final boolean ICustomTabsService;
    private final DrawerKtExternalSyntheticLambda12 ICustomTabsServiceStub;
    private final Context access000;
    private int access100;
    private boolean asBinder;
    private int asInterface;
    private final boolean extraCallback;
    private int extraCallbackWithResult;
    private long extraCommand;
    private boolean getInterfaceDescriptor;
    private TextFieldDecoratorModifierNodeExternalSyntheticLambda25 isEngagementSignalsApiAvailable;
    private DismissStateCompanionExternalSyntheticLambda0 mayLaunchUrl;
    private int newAuthTabSession;
    private CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 newSession;
    private long newSessionWithExtras;
    private DrawerKtExternalSyntheticLambda0 onActivityLayout;
    private final DrawerKtExternalSyntheticLambda15.IAuthTabCallback onActivityResized;
    private boolean onMessageChannelReady;
    private final boolean onMinimized;
    private boolean onPostMessage;
    private final int onRelationshipValidationResult;
    private int onTransact;
    private long onUnminimized;
    onExtraCallback onWarmupCompleted;
    private SelectionContainerKtExternalSyntheticLambda3 postMessage;
    private int prefetch;
    private List<Object> prefetchWithMultipleUrls;
    private long readTypedObject;
    private int receiveFile;
    private boolean requestPostMessageChannel;
    private int requestPostMessageChannelWithExtras;
    private long setEngagementSignalsCallback;
    private final DrawerKtExternalSyntheticLambda10.onNavigationEvent updateVisuals;
    private final DrawerKtExternalSyntheticLambda10 validateRelationship;
    private DrawerKtExternalSyntheticLambda14 warmup;
    private final PriorityQueue<Long> writeTypedObject;
    private static final byte[] $$a = {117, -24, -14, 98};
    private static final int $$b = 25;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsService_Parcel = 0;
    private static int writeTypedList = 1;
    private static int ICustomTabsServiceStubProxy = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, short s, int i3) {
        int i4;
        int i5;
        int i6 = 105 - (i2 * 4);
        int i7 = (s * 4) + 1;
        byte[] bArr = $$a;
        int i8 = (i3 * 2) + 4;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i9 = i7;
            int i10 = i8;
            i5 = 0;
            int i11 = i8 + i9;
            i4 = i5;
            i8 = i10 + 1;
            i6 = i11;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i6;
            if (i5 == i7) {
                return new String(bArr2, 0);
            }
            i9 = bArr[i8];
            int i12 = i8;
            i8 = i6;
            i10 = i12;
            int i112 = i8 + i9;
            i4 = i5;
            i8 = i10 + 1;
            i6 = i112;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i6;
            if (i5 == i7) {
            }
        } else {
            i4 = 0;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i6;
            if (i5 == i7) {
            }
        }
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i6;
        int i9 = ~i2;
        int i10 = ~(i8 | i9);
        int i11 = (~((~i5) | i9)) | i10;
        int i12 = i6 | i2;
        int i13 = (~(i5 | i9)) | i10;
        int i14 = i6 + i2 + i3 + (1258674323 * i7) + ((-126594725) * i4);
        int i15 = i14 * i14;
        int i16 = ((-1449289074) * i6) + 1954676736 + ((-212912869) * i2) + (i11 * (-1236376205)) + (i12 * (-1236376205)) + ((-1236376205) * i13) + (1609302016 * i3) + (881065984 * i7) + ((-991690752) * i4) + ((-541982720) * i15);
        int i17 = ((i6 * (-1656160718)) - 817430035) + (i2 * (-1656161339)) + (i11 * 621) + (i12 * 621) + (i13 * 621) + (i3 * (-1656160097)) + (i7 * (-2121497779)) + (i4 * 1378977669) + (i15 * (-275906560));
        switch (i16 + (i17 * i17 * (-372375552))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    protected boolean IAuthTabCallback(long j, long j2) {
        int i2 = 2 % 2;
        int i3 = writeTypedList;
        int i4 = i3 + 23;
        ICustomTabsService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (j < -30000 && j2 > 100000) {
            return true;
        }
        int i5 = i3 + 103;
        ICustomTabsService_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    protected boolean IPostMessageServiceStub() {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 43;
        int i4 = i3 % 128;
        ICustomTabsService_Parcel = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 67;
        writeTypedList = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }

    protected boolean onExtraCallback(long j, long j2, boolean z) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 105;
        int i4 = i3 % 128;
        writeTypedList = i4;
        int i5 = i3 % 2;
        if (j >= -30000) {
            return false;
        }
        int i6 = i4 + 101;
        ICustomTabsService_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r4 = r3 + 117;
        o.DraggableAnchorsNodeExternalSyntheticLambda0.ICustomTabsService_Parcel = r4 % 128;
        r4 = r4 % 2;
        r3 = r3 + 69;
        o.DraggableAnchorsNodeExternalSyntheticLambda0.ICustomTabsService_Parcel = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r7 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r7 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean onWarmupCompleted(long j, long j2, boolean z) {
        int i2 = 2 % 2;
        if (j < -500000) {
            int i3 = writeTypedList;
            int i4 = i3 + 85;
            ICustomTabsService_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 85 / 0;
            }
        }
        return false;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public boolean validateRelationship() {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 73;
        int i4 = i3 % 128;
        ICustomTabsService_Parcel = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 85;
        writeTypedList = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }

    static /* synthetic */ void IAuthTabCallback(DraggableAnchorsNodeExternalSyntheticLambda0 draggableAnchorsNodeExternalSyntheticLambda0) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 53;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
        draggableAnchorsNodeExternalSyntheticLambda0.notifyNotificationWithChannel();
        if (i4 == 0) {
            int i5 = 79 / 0;
        }
    }

    static /* synthetic */ void IAuthTabCallback(DraggableAnchorsNodeExternalSyntheticLambda0 draggableAnchorsNodeExternalSyntheticLambda0, AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4, int i2, long j, long j2) {
        int i3 = 2 % 2;
        int i4 = writeTypedList + 121;
        ICustomTabsService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {draggableAnchorsNodeExternalSyntheticLambda0, androidMenu_androidKtExternalSyntheticLambda4, Integer.valueOf(i2), Long.valueOf(j), Long.valueOf(j2)};
        int iOnExtraCallback = getKekid.onExtraCallback();
        onExtraCallback(objArr, 1076587485, getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, -1076587482, getKekid.onExtraCallback());
        int i6 = writeTypedList + 19;
        ICustomTabsService_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void IAuthTabCallback(DraggableAnchorsNodeExternalSyntheticLambda0 draggableAnchorsNodeExternalSyntheticLambda0, AndroidSelectionHandles_androidKtExternalSyntheticLambda4 androidSelectionHandles_androidKtExternalSyntheticLambda4) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 49;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
        draggableAnchorsNodeExternalSyntheticLambda0.IAuthTabCallback(androidSelectionHandles_androidKtExternalSyntheticLambda4);
        int i5 = writeTypedList + 65;
        ICustomTabsService_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ void onExtraCallback(DraggableAnchorsNodeExternalSyntheticLambda0 draggableAnchorsNodeExternalSyntheticLambda0) {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 33;
        ICustomTabsService_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            int iOnExtraCallback = getKekid.onExtraCallback();
            onExtraCallback(new Object[]{draggableAnchorsNodeExternalSyntheticLambda0}, 712298389, getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, -712298383, getKekid.onExtraCallback());
            throw null;
        }
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        onExtraCallback(new Object[]{draggableAnchorsNodeExternalSyntheticLambda0}, 712298389, getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback2, -712298383, getKekid.onExtraCallback());
        int i4 = writeTypedList + 73;
        ICustomTabsService_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ Surface onExtraCallbackWithResult(DraggableAnchorsNodeExternalSyntheticLambda0 draggableAnchorsNodeExternalSyntheticLambda0) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel;
        int i4 = i3 + 41;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        Surface surface = draggableAnchorsNodeExternalSyntheticLambda0.ICustomTabsCallback;
        int i6 = i3 + 43;
        writeTypedList = i6 % 128;
        int i7 = i6 % 2;
        return surface;
    }

    static /* synthetic */ Renderer.WakeupListener onNavigationEvent(DraggableAnchorsNodeExternalSyntheticLambda0 draggableAnchorsNodeExternalSyntheticLambda0) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 65;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
        Renderer.WakeupListener wakeupListenerIEngagementSignalsCallback = draggableAnchorsNodeExternalSyntheticLambda0.IEngagementSignalsCallback();
        int i5 = ICustomTabsService_Parcel + 97;
        writeTypedList = i5 % 128;
        int i6 = i5 % 2;
        return wakeupListenerIEngagementSignalsCallback;
    }

    static /* synthetic */ AndroidSelectionHandles_androidKtExternalSyntheticLambda4 onNavigationEvent(DraggableAnchorsNodeExternalSyntheticLambda0 draggableAnchorsNodeExternalSyntheticLambda0, Throwable th, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i2) {
        int i3 = 2 % 2;
        int i4 = writeTypedList + 89;
        ICustomTabsService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        AndroidSelectionHandles_androidKtExternalSyntheticLambda4 androidSelectionHandles_androidKtExternalSyntheticLambda4OnExtraCallbackWithResult = draggableAnchorsNodeExternalSyntheticLambda0.onExtraCallbackWithResult(th, basicTextContextMenuProviderKtExternalSyntheticLambda4, i2);
        int i6 = writeTypedList + 33;
        ICustomTabsService_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return androidSelectionHandles_androidKtExternalSyntheticLambda4OnExtraCallbackWithResult;
    }

    static /* synthetic */ void onNavigationEvent(DraggableAnchorsNodeExternalSyntheticLambda0 draggableAnchorsNodeExternalSyntheticLambda0, AndroidSelectionHandles_androidKtExternalSyntheticLambda4 androidSelectionHandles_androidKtExternalSyntheticLambda4) {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 35;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        draggableAnchorsNodeExternalSyntheticLambda0.IAuthTabCallback(androidSelectionHandles_androidKtExternalSyntheticLambda4);
        int i5 = ICustomTabsService_Parcel + 67;
        writeTypedList = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ AndroidMenu_androidKtExternalSyntheticLambda4 onWarmupCompleted(DraggableAnchorsNodeExternalSyntheticLambda0 draggableAnchorsNodeExternalSyntheticLambda0) {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 23;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4PrefetchWithMultipleUrls = draggableAnchorsNodeExternalSyntheticLambda0.prefetchWithMultipleUrls();
        int i5 = ICustomTabsService_Parcel + 55;
        writeTypedList = i5 % 128;
        int i6 = i5 % 2;
        return androidMenu_androidKtExternalSyntheticLambda4PrefetchWithMultipleUrls;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i2, int i3, char[] cArr, boolean z, int i4, Object[] objArr) throws Throwable {
        int i5;
        Throwable cause;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        int i7 = $10 + 63;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (true) {
            i5 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            int i9 = $11 + 79;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i11 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i11]), Integer.valueOf(ICustomTabsServiceDefault)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 35125), TextUtils.lastIndexOf("", '0') + 24, 10277 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i11] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12843), View.resolveSizeAndState(0, 0, 0) + 55, 2167 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i12 = $11 + 23;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 55, 2167 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i5 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static {
        access200 = 0;
        IEngagementSignalsCallback_Parcel();
        IAuthTabCallback = new int[]{1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
        int i2 = ICustomTabsServiceStubProxy + 81;
        access200 = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class onNavigationEvent {
        private boolean IAuthTabCallbackDefault;
        private boolean IAuthTabCallbackStub;
        private boolean IAuthTabCallbackStubProxy;
        private DrawerKtExternalSyntheticLambda14 IAuthTabCallback_Parcel;
        private int access000;
        private Handler asBinder;
        private long onExtraCallback;
        private boolean onExtraCallbackWithResult;
        private AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallback onNavigationEvent;
        private DrawerKtExternalSyntheticLambda15 onTransact;
        private final Context onWarmupCompleted;
        private AppBarKtExternalSyntheticLambda6 getInterfaceDescriptor = AppBarKtExternalSyntheticLambda6.onExtraCallback;
        private float IAuthTabCallback = 30.0f;
        private long asInterface = -9223372036854775807L;

        public onNavigationEvent(Context context) {
            this.onWarmupCompleted = context;
            this.onNavigationEvent = AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallback.onWarmupCompleted(context);
        }

        public onNavigationEvent onNavigationEvent(AppBarKtExternalSyntheticLambda6 appBarKtExternalSyntheticLambda6) {
            this.getInterfaceDescriptor = appBarKtExternalSyntheticLambda6;
            return this;
        }

        public onNavigationEvent onExtraCallback(AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallback onextracallback) {
            this.onNavigationEvent = onextracallback;
            return this;
        }

        public onNavigationEvent onExtraCallback(long j) {
            this.onExtraCallback = j;
            return this;
        }

        public onNavigationEvent onExtraCallback(boolean z) {
            this.IAuthTabCallbackStub = z;
            return this;
        }

        public onNavigationEvent onExtraCallback(@Nullable Handler handler) {
            this.asBinder = handler;
            return this;
        }

        public onNavigationEvent onWarmupCompleted(@Nullable DrawerKtExternalSyntheticLambda15 drawerKtExternalSyntheticLambda15) {
            this.onTransact = drawerKtExternalSyntheticLambda15;
            return this;
        }

        public onNavigationEvent IAuthTabCallback(int i2) {
            this.access000 = i2;
            return this;
        }

        public onNavigationEvent onNavigationEvent(boolean z) {
            this.IAuthTabCallbackStubProxy = z;
            return this;
        }

        public onNavigationEvent onExtraCallbackWithResult(long j) {
            this.asInterface = j;
            return this;
        }

        public onNavigationEvent onWarmupCompleted(boolean z) {
            this.IAuthTabCallbackDefault = z;
            return this;
        }

        public DraggableAnchorsNodeExternalSyntheticLambda0 onExtraCallbackWithResult() {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onExtraCallbackWithResult);
            Handler handler = this.asBinder;
            RecordingInputConnection_androidKt.onExtraCallbackWithResult((handler == null && this.onTransact == null) || !(handler == null || this.onTransact == null));
            this.onExtraCallbackWithResult = true;
            return new DraggableAnchorsNodeExternalSyntheticLambda0(this);
        }
    }

    protected DraggableAnchorsNodeExternalSyntheticLambda0(onNavigationEvent onnavigationevent) {
        boolean z;
        ComposableSingletonsTabRowKtExternalSyntheticLambda1 composableSingletonsTabRowKtExternalSyntheticLambda1;
        super(2, onnavigationevent.onNavigationEvent, onnavigationevent.getInterfaceDescriptor, onnavigationevent.IAuthTabCallbackStub, onnavigationevent.IAuthTabCallback);
        Context applicationContext = onnavigationevent.onWarmupCompleted.getApplicationContext();
        this.access000 = applicationContext;
        this.onRelationshipValidationResult = onnavigationevent.access000;
        this.warmup = onnavigationevent.IAuthTabCallback_Parcel;
        this.onActivityResized = new DrawerKtExternalSyntheticLambda15.IAuthTabCallback(onnavigationevent.asBinder, onnavigationevent.onTransact);
        if (this.warmup == null) {
            z = true;
        } else {
            int i2 = ICustomTabsService_Parcel + 45;
            writeTypedList = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            z = false;
        }
        this.ICustomTabsService = z;
        this.validateRelationship = new DrawerKtExternalSyntheticLambda10(applicationContext, this, onnavigationevent.onExtraCallback);
        this.updateVisuals = new DrawerKtExternalSyntheticLambda10.onNavigationEvent();
        this.extraCallback = IPostMessageService_Parcel();
        this.isEngagementSignalsApiAvailable = TextFieldDecoratorModifierNodeExternalSyntheticLambda25.onExtraCallbackWithResult;
        this.prefetch = 1;
        this.asInterface = 0;
        this.IAuthTabCallbackStubProxy = CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0.onExtraCallbackWithResult;
        this.requestPostMessageChannelWithExtras = 0;
        this.newSession = null;
        this.newAuthTabSession = -1000;
        this.newSessionWithExtras = -9223372036854775807L;
        this.extraCommand = -9223372036854775807L;
        if (onnavigationevent.IAuthTabCallbackStubProxy) {
            composableSingletonsTabRowKtExternalSyntheticLambda1 = new ComposableSingletonsTabRowKtExternalSyntheticLambda1();
            int i4 = ICustomTabsService_Parcel + 89;
            writeTypedList = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } else {
            int i7 = writeTypedList + 123;
            ICustomTabsService_Parcel = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            composableSingletonsTabRowKtExternalSyntheticLambda1 = null;
        }
        this.IAuthTabCallbackDefault = composableSingletonsTabRowKtExternalSyntheticLambda1;
        this.writeTypedObject = new PriorityQueue<>();
        if (onnavigationevent.asInterface != -9223372036854775807L) {
            this.ICustomTabsCallbackStubProxy = -onnavigationevent.asInterface;
            this.ICustomTabsServiceStub = new DrawerKtExternalSyntheticLambda12(1.0f);
            int i10 = ICustomTabsService_Parcel + 117;
            writeTypedList = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 % 2;
            }
        } else {
            this.ICustomTabsCallbackStubProxy = -9223372036854775807L;
            this.ICustomTabsServiceStub = null;
        }
        this.onMinimized = onnavigationevent.IAuthTabCallbackDefault;
        this.postMessage = null;
    }

    @Override // o.DrawerKtExternalSyntheticLambda10.IAuthTabCallback
    public boolean onNavigationEvent(long j, long j2) {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 51;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(j, j2);
        if (i4 != 0) {
            int i5 = 45 / 0;
        }
        return zIAuthTabCallback;
    }

    @Override // o.DrawerKtExternalSyntheticLambda10.IAuthTabCallback
    public boolean IAuthTabCallback(long j, long j2, boolean z) {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 57;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnExtraCallback = onExtraCallback(j, j2, z);
        if (i4 != 0) {
            int i5 = 44 / 0;
        }
        int i6 = ICustomTabsService_Parcel + 65;
        writeTypedList = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 43 / 0;
        }
        return zOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // o.DrawerKtExternalSyntheticLambda10.IAuthTabCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onWarmupCompleted(long j, long j2, long j3, boolean z, boolean z2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        long j4;
        int i2 = 2 % 2;
        int i3 = writeTypedList;
        int i4 = i3 + 7;
        ICustomTabsService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
            if (this.warmup != null) {
                if (this.ICustomTabsService) {
                    int i6 = i3 + 83;
                    ICustomTabsService_Parcel = i6 % 128;
                    long jNewSessionWithExtras = i6 % 2 != 0 ? j2 / newSessionWithExtras() : j2 - newSessionWithExtras();
                    int i7 = ICustomTabsService_Parcel + 119;
                    writeTypedList = i7 % 128;
                    int i8 = i7 % 2;
                    j4 = jNewSessionWithExtras;
                } else {
                    j4 = j2;
                }
            }
        } else if (this.warmup != null) {
        }
        if (!onWarmupCompleted(j, j3, z) || !IAuthTabCallback(j4, z2)) {
            return false;
        }
        int i9 = ICustomTabsService_Parcel + 47;
        writeTypedList = i9 % 128;
        int i10 = i9 % 2;
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public String extraCommand() {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 115;
        int i4 = i3 % 128;
        writeTypedList = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 115;
        ICustomTabsService_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return "MediaCodecVideoRenderer";
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public int onExtraCallback(AppBarKtExternalSyntheticLambda6 appBarKtExternalSyntheticLambda6, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) throws AppBarKtExternalSyntheticLambda9.onExtraCallback {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 81;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(this.access000, appBarKtExternalSyntheticLambda6, basicTextContextMenuProviderKtExternalSyntheticLambda4);
        int i5 = ICustomTabsService_Parcel + 113;
        writeTypedList = i5 % 128;
        if (i5 % 2 != 0) {
            return iOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static int onExtraCallbackWithResult(Context context, AppBarKtExternalSyntheticLambda6 appBarKtExternalSyntheticLambda6, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) throws AppBarKtExternalSyntheticLambda9.onExtraCallback {
        boolean z;
        int i2 = 2 % 2;
        int i3 = 0;
        if (!AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onTransact(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable)) {
            return RendererCapabilities.IAuthTabCallback(0);
        }
        boolean z2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallback_Parcel != null;
        List<AppBarKtExternalSyntheticLambda5> listOnExtraCallbackWithResult = onExtraCallbackWithResult(context, appBarKtExternalSyntheticLambda6, basicTextContextMenuProviderKtExternalSyntheticLambda4, z2, false);
        if (z2 && listOnExtraCallbackWithResult.isEmpty()) {
            int i4 = writeTypedList + 35;
            ICustomTabsService_Parcel = i4 % 128;
            listOnExtraCallbackWithResult = i4 % 2 != 0 ? onExtraCallbackWithResult(context, appBarKtExternalSyntheticLambda6, basicTextContextMenuProviderKtExternalSyntheticLambda4, true, false) : onExtraCallbackWithResult(context, appBarKtExternalSyntheticLambda6, basicTextContextMenuProviderKtExternalSyntheticLambda4, false, false);
        }
        if (listOnExtraCallbackWithResult.isEmpty()) {
            return RendererCapabilities.IAuthTabCallback(1);
        }
        if (!(!AppBarKtExternalSyntheticLambda8.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4))) {
            AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5 = listOnExtraCallbackWithResult.get(0);
            boolean zOnExtraCallbackWithResult = appBarKtExternalSyntheticLambda5.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4);
            if (zOnExtraCallbackWithResult) {
                z = true;
            } else {
                for (int i5 = 1; i5 < listOnExtraCallbackWithResult.size(); i5++) {
                    AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda52 = listOnExtraCallbackWithResult.get(i5);
                    if (appBarKtExternalSyntheticLambda52.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
                        int i6 = writeTypedList + 47;
                        ICustomTabsService_Parcel = i6 % 128;
                        int i7 = i6 % 2;
                        zOnExtraCallbackWithResult = true;
                        z = false;
                        appBarKtExternalSyntheticLambda5 = appBarKtExternalSyntheticLambda52;
                        break;
                    }
                }
                z = true;
            }
            int i8 = !(zOnExtraCallbackWithResult ^ true) ? 4 : 3;
            int i9 = appBarKtExternalSyntheticLambda5.onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4) ? 16 : 8;
            int i10 = appBarKtExternalSyntheticLambda5.IAuthTabCallback ? 64 : 0;
            int i11 = z ? 128 : 0;
            if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable) && !onExtraCallbackWithResult.onNavigationEvent(context)) {
                i11 = 256;
            }
            if (zOnExtraCallbackWithResult) {
                List<AppBarKtExternalSyntheticLambda5> listOnExtraCallbackWithResult2 = onExtraCallbackWithResult(context, appBarKtExternalSyntheticLambda6, basicTextContextMenuProviderKtExternalSyntheticLambda4, z2, true);
                if (!listOnExtraCallbackWithResult2.isEmpty()) {
                    int i12 = ICustomTabsService_Parcel + 119;
                    writeTypedList = i12 % 128;
                    int i13 = i12 % 2;
                    AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda53 = AppBarKtExternalSyntheticLambda9.onExtraCallback(listOnExtraCallbackWithResult2, basicTextContextMenuProviderKtExternalSyntheticLambda4).get(0);
                    if (appBarKtExternalSyntheticLambda53.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
                        int i14 = writeTypedList + 19;
                        ICustomTabsService_Parcel = i14 % 128;
                        if (i14 % 2 == 0 ? appBarKtExternalSyntheticLambda53.onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4) : appBarKtExternalSyntheticLambda53.onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
                            i3 = 32;
                        }
                    }
                }
            }
            return RendererCapabilities.onWarmupCompleted(i8, i9, i3, i10, i11);
        }
        int i15 = ICustomTabsService_Parcel + 3;
        writeTypedList = i15 % 128;
        int i16 = i15 % 2;
        return RendererCapabilities.IAuthTabCallback(2);
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public List<AppBarKtExternalSyntheticLambda5> onExtraCallbackWithResult(AppBarKtExternalSyntheticLambda6 appBarKtExternalSyntheticLambda6, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, boolean z) throws AppBarKtExternalSyntheticLambda9.onExtraCallback {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 65;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        List<AppBarKtExternalSyntheticLambda5> listOnExtraCallback = AppBarKtExternalSyntheticLambda9.onExtraCallback(onExtraCallbackWithResult(this.access000, appBarKtExternalSyntheticLambda6, basicTextContextMenuProviderKtExternalSyntheticLambda4, z, this.requestPostMessageChannel), basicTextContextMenuProviderKtExternalSyntheticLambda4);
        int i5 = ICustomTabsService_Parcel + 103;
        writeTypedList = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
        return listOnExtraCallback;
    }

    private static List<AppBarKtExternalSyntheticLambda5> onExtraCallbackWithResult(Context context, AppBarKtExternalSyntheticLambda6 appBarKtExternalSyntheticLambda6, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, boolean z, boolean z2) throws AppBarKtExternalSyntheticLambda9.onExtraCallback {
        int i2 = 2 % 2;
        String str = basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable;
        Object obj = null;
        if (str == null) {
            ImmutableList immutableListOf = ImmutableList.of();
            int i3 = writeTypedList + 23;
            ICustomTabsService_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                return immutableListOf;
            }
            obj.hashCode();
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !onExtraCallbackWithResult.onNavigationEvent(context)) {
            int i4 = writeTypedList + 123;
            ICustomTabsService_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                AppBarKtExternalSyntheticLambda9.onNavigationEvent(appBarKtExternalSyntheticLambda6, basicTextContextMenuProviderKtExternalSyntheticLambda4, z, z2).isEmpty();
                throw null;
            }
            List<AppBarKtExternalSyntheticLambda5> listOnNavigationEvent = AppBarKtExternalSyntheticLambda9.onNavigationEvent(appBarKtExternalSyntheticLambda6, basicTextContextMenuProviderKtExternalSyntheticLambda4, z, z2);
            if (!listOnNavigationEvent.isEmpty()) {
                return listOnNavigationEvent;
            }
        }
        return AppBarKtExternalSyntheticLambda9.onExtraCallbackWithResult(appBarKtExternalSyntheticLambda6, basicTextContextMenuProviderKtExternalSyntheticLambda4, z, z2);
    }

    static final class onExtraCallbackWithResult {
        public static boolean onNavigationEvent(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i2 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i2 == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    @Override // o.AppBarKtExternalSyntheticLambda8, o.TextAnnotatedStringNodeExternalSyntheticLambda4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onWarmupCompleted(boolean z, boolean z2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        boolean z3;
        int i2 = 2 % 2;
        int i3 = writeTypedList + 67;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        super.onWarmupCompleted(z, z2);
        boolean z4 = aa_().onWarmupCompleted;
        Object obj = null;
        if (z4) {
            int i5 = writeTypedList + 45;
            ICustomTabsService_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            z3 = this.requestPostMessageChannelWithExtras != 0;
        }
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(z3);
        if (this.requestPostMessageChannel != z4) {
            int i6 = ICustomTabsService_Parcel + 61;
            writeTypedList = i6 % 128;
            if (i6 % 2 == 0) {
                this.requestPostMessageChannel = z4;
                onSessionEnded();
                int i7 = 73 / 0;
            } else {
                this.requestPostMessageChannel = z4;
                onSessionEnded();
            }
        }
        this.onActivityResized.onExtraCallbackWithResult(((AppBarKtExternalSyntheticLambda8) this).onExtraCallbackWithResult);
        if (!this.onMessageChannelReady) {
            int i8 = ICustomTabsService_Parcel + 93;
            writeTypedList = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            if (this.prefetchWithMultipleUrls != null && this.warmup == null) {
                DrawerKtExternalSyntheticLambda1 drawerKtExternalSyntheticLambda1OnExtraCallback = onExtraCallback(this.access000, this.validateRelationship);
                drawerKtExternalSyntheticLambda1OnExtraCallback.onWarmupCompleted(1);
                this.warmup = drawerKtExternalSyntheticLambda1OnExtraCallback.onNavigationEvent(0);
            }
            this.onMessageChannelReady = true;
            int i9 = ICustomTabsService_Parcel + 37;
            writeTypedList = i9 % 128;
            int i10 = i9 % 2;
        }
        if (this.warmup == null) {
            this.validateRelationship.onExtraCallback(onExtraCallback());
            this.validateRelationship.IAuthTabCallback(!z2 ? 1 : 0);
            return;
        }
        int i11 = ICustomTabsService_Parcel + 93;
        writeTypedList = i11 % 128;
        if (i11 % 2 == 0) {
            IPostMessageServiceStubProxy();
            this.ICustomTabsCallbackStub = !z2 ? 1 : 0;
            requestPostMessageChannelWithExtras();
        } else {
            IPostMessageServiceStubProxy();
            this.ICustomTabsCallbackStub = !z2 ? 1 : 0;
            requestPostMessageChannelWithExtras();
        }
    }

    @RequiresNonNull
    private void IPostMessageServiceStubProxy() {
        int i2 = 2 % 2;
        this.warmup.onNavigationEvent(new DrawerKtExternalSyntheticLambda14.onExtraCallback() { // from class: o.DraggableAnchorsNodeExternalSyntheticLambda0.1
            @Override // o.DrawerKtExternalSyntheticLambda14.onExtraCallback
            public void IAuthTabCallback(CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0) {
            }

            @Override // o.DrawerKtExternalSyntheticLambda14.onExtraCallback
            public void onExtraCallback() {
                Renderer.WakeupListener wakeupListenerOnNavigationEvent = DraggableAnchorsNodeExternalSyntheticLambda0.onNavigationEvent(DraggableAnchorsNodeExternalSyntheticLambda0.this);
                if (wakeupListenerOnNavigationEvent != null) {
                    wakeupListenerOnNavigationEvent.IAuthTabCallback();
                }
            }

            @Override // o.DrawerKtExternalSyntheticLambda14.onExtraCallback
            public void onNavigationEvent() {
                if (DraggableAnchorsNodeExternalSyntheticLambda0.onExtraCallbackWithResult(DraggableAnchorsNodeExternalSyntheticLambda0.this) != null) {
                    DraggableAnchorsNodeExternalSyntheticLambda0.onExtraCallback(DraggableAnchorsNodeExternalSyntheticLambda0.this);
                }
            }

            @Override // o.DrawerKtExternalSyntheticLambda14.onExtraCallback
            public void onWarmupCompleted() {
                if (DraggableAnchorsNodeExternalSyntheticLambda0.onExtraCallbackWithResult(DraggableAnchorsNodeExternalSyntheticLambda0.this) != null) {
                    DraggableAnchorsNodeExternalSyntheticLambda0.this.IAuthTabCallback(0, 1);
                }
            }

            @Override // o.DrawerKtExternalSyntheticLambda14.onExtraCallback
            public void onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda14.onNavigationEvent onnavigationevent) {
                DraggableAnchorsNodeExternalSyntheticLambda0 draggableAnchorsNodeExternalSyntheticLambda0 = DraggableAnchorsNodeExternalSyntheticLambda0.this;
                DraggableAnchorsNodeExternalSyntheticLambda0.onNavigationEvent(draggableAnchorsNodeExternalSyntheticLambda0, DraggableAnchorsNodeExternalSyntheticLambda0.onNavigationEvent(draggableAnchorsNodeExternalSyntheticLambda0, onnavigationevent, onnavigationevent.format, 7001));
            }
        }, MoreExecutors.directExecutor());
        DrawerKtExternalSyntheticLambda0 drawerKtExternalSyntheticLambda0 = this.onActivityLayout;
        if (drawerKtExternalSyntheticLambda0 != null) {
            this.warmup.onNavigationEvent(drawerKtExternalSyntheticLambda0);
        }
        if (this.ICustomTabsCallback != null && !this.isEngagementSignalsApiAvailable.equals(TextFieldDecoratorModifierNodeExternalSyntheticLambda25.onExtraCallbackWithResult)) {
            this.warmup.IAuthTabCallback(this.ICustomTabsCallback, this.isEngagementSignalsApiAvailable);
        }
        this.warmup.onExtraCallbackWithResult(this.asInterface);
        this.warmup.onWarmupCompleted(ICustomTabsService_Parcel());
        List<Object> list = this.prefetchWithMultipleUrls;
        if (list != null) {
            this.warmup.IAuthTabCallback(list);
            int i3 = ICustomTabsService_Parcel + 97;
            writeTypedList = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = writeTypedList + 97;
        ICustomTabsService_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    protected DrawerKtExternalSyntheticLambda1 onExtraCallback(Context context, DrawerKtExternalSyntheticLambda10 drawerKtExternalSyntheticLambda10) {
        int i2 = 2 % 2;
        DrawerKtExternalSyntheticLambda1 drawerKtExternalSyntheticLambda1OnExtraCallbackWithResult = new DrawerKtExternalSyntheticLambda1.onExtraCallbackWithResult(context, drawerKtExternalSyntheticLambda10).onWarmupCompleted(true).onNavigationEvent(onExtraCallback()).onExtraCallbackWithResult();
        int i3 = writeTypedList + 9;
        ICustomTabsService_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return drawerKtExternalSyntheticLambda1OnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[PHI: r2
      0x0026: PHI (r2v5 int) = (r2v4 int), (r2v6 int) binds: [B:10:0x0024, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.media3.exoplayer.Renderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ICustomTabsCallback_Parcel() {
        int i2;
        int i3 = 2 % 2;
        int i4 = writeTypedList + 37;
        int i5 = i4 % 128;
        ICustomTabsService_Parcel = i5;
        int i6 = i4 % 2;
        DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda14 = this.warmup;
        if (drawerKtExternalSyntheticLambda14 == null) {
            this.validateRelationship.onWarmupCompleted();
            int i7 = writeTypedList + 111;
            ICustomTabsService_Parcel = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i8 = i5 + 65;
        int i9 = i8 % 128;
        writeTypedList = i9;
        if (i8 % 2 == 0) {
            i2 = this.ICustomTabsCallbackStub;
            int i10 = 21 / 0;
            if (i2 != 0) {
                int i11 = i9 + 17;
                ICustomTabsService_Parcel = i11 % 128;
                if (i11 % 2 == 0 ? i2 != 1 : i2 != 1) {
                    drawerKtExternalSyntheticLambda14.onExtraCallbackWithResult();
                    return;
                }
            }
        } else {
            i2 = this.ICustomTabsCallbackStub;
            if (i2 != 0) {
            }
        }
        this.ICustomTabsCallbackStub = 0;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8, o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr, long j, long j2, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int i2 = 2 % 2;
        super.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4Arr, j, j2, onextracallbackwithresult);
        int iOnExtraCallback = getKekid.onExtraCallback();
        onExtraCallback(new Object[]{this, onextracallbackwithresult}, -1906607922, getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, 1906607929, getKekid.onExtraCallback());
        DrawerKtExternalSyntheticLambda12 drawerKtExternalSyntheticLambda12 = this.ICustomTabsServiceStub;
        if (drawerKtExternalSyntheticLambda12 != null) {
            drawerKtExternalSyntheticLambda12.onExtraCallbackWithResult();
            int i3 = writeTypedList + 25;
            ICustomTabsService_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 % 5;
            }
        }
        int i5 = ICustomTabsService_Parcel + 37;
        writeTypedList = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r2.onExtraCallback() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10ExtraCallbackWithResult;
        DraggableAnchorsNodeExternalSyntheticLambda0 draggableAnchorsNodeExternalSyntheticLambda0 = (DraggableAnchorsNodeExternalSyntheticLambda0) objArr[0];
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = (BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult) objArr[1];
        int i2 = 2 % 2;
        int i3 = writeTypedList + 117;
        ICustomTabsService_Parcel = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10ExtraCallbackWithResult = draggableAnchorsNodeExternalSyntheticLambda0.extraCallbackWithResult();
            int i4 = 77 / 0;
        } else {
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10ExtraCallbackWithResult2 = draggableAnchorsNodeExternalSyntheticLambda0.extraCallbackWithResult();
            if (!coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10ExtraCallbackWithResult2.onExtraCallback()) {
                coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10ExtraCallbackWithResult = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10ExtraCallbackWithResult2;
                draggableAnchorsNodeExternalSyntheticLambda0.extraCommand = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10ExtraCallbackWithResult.onExtraCallbackWithResult(((BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallbackwithresult)).onExtraCallback, new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback()).onNavigationEvent();
                return null;
            }
            draggableAnchorsNodeExternalSyntheticLambda0.extraCommand = -9223372036854775807L;
            int i5 = ICustomTabsService_Parcel + 5;
            writeTypedList = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 o.DrawerKtExternalSyntheticLambda14) = (r1v4 o.DrawerKtExternalSyntheticLambda14), (r1v6 o.DrawerKtExternalSyntheticLambda14) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.AppBarKtExternalSyntheticLambda8, o.TextAnnotatedStringNodeExternalSyntheticLambda4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(long j, boolean z) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda14;
        int i2 = 2 % 2;
        int i3 = writeTypedList + 27;
        ICustomTabsService_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            drawerKtExternalSyntheticLambda14 = this.warmup;
            int i4 = 44 / 0;
            if (drawerKtExternalSyntheticLambda14 != null) {
                if (!z) {
                    drawerKtExternalSyntheticLambda14.onNavigationEvent(true);
                }
            }
        } else {
            drawerKtExternalSyntheticLambda14 = this.warmup;
            if (drawerKtExternalSyntheticLambda14 != null) {
            }
        }
        super.onExtraCallbackWithResult(j, z);
        if (this.warmup == null) {
            this.validateRelationship.IAuthTabCallback();
        }
        DrawerKtExternalSyntheticLambda12 drawerKtExternalSyntheticLambda12 = this.ICustomTabsServiceStub;
        if (drawerKtExternalSyntheticLambda12 != null) {
            drawerKtExternalSyntheticLambda12.onExtraCallbackWithResult();
        }
        if (z) {
            int i5 = writeTypedList + 97;
            ICustomTabsService_Parcel = i5 % 128;
            int i6 = i5 % 2;
            DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda142 = this.warmup;
            if (drawerKtExternalSyntheticLambda142 != null) {
                drawerKtExternalSyntheticLambda142.IAuthTabCallback(false);
            } else {
                this.validateRelationship.onExtraCallback(false);
                int i7 = ICustomTabsService_Parcel + 89;
                writeTypedList = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        int iOnExtraCallback = getKekid.onExtraCallback();
        onExtraCallback(new Object[]{this}, 45720326, getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, -45720322, getKekid.onExtraCallback());
        this.IAuthTabCallback_Parcel = 0;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8, androidx.media3.exoplayer.Renderer
    public boolean prefetch() {
        int i2 = 2 % 2;
        if (!super.prefetch()) {
            return false;
        }
        int i3 = writeTypedList + 61;
        ICustomTabsService_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda14 = this.warmup;
        if (drawerKtExternalSyntheticLambda14 != null && !drawerKtExternalSyntheticLambda14.onWarmupCompleted()) {
            return false;
        }
        int i4 = writeTypedList + 79;
        ICustomTabsService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r5.requestPostMessageChannel != true) goto L17;
     */
    @Override // o.AppBarKtExternalSyntheticLambda8, androidx.media3.exoplayer.Renderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean newAuthTabSession() {
        int i2 = 2 % 2;
        boolean zNewAuthTabSession = super.newAuthTabSession();
        DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda14 = this.warmup;
        if (drawerKtExternalSyntheticLambda14 != null) {
            int i3 = writeTypedList + 59;
            ICustomTabsService_Parcel = i3 % 128;
            int i4 = i3 % 2;
            boolean zOnExtraCallback = drawerKtExternalSyntheticLambda14.onExtraCallback(zNewAuthTabSession);
            int i5 = ICustomTabsService_Parcel + 95;
            writeTypedList = i5 % 128;
            int i6 = i5 % 2;
            return zOnExtraCallback;
        }
        if (zNewAuthTabSession) {
            if (prefetchWithMultipleUrls() != null) {
                int i7 = writeTypedList + 121;
                ICustomTabsService_Parcel = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
            }
            return true;
        }
        return this.validateRelationship.onWarmupCompleted(zNewAuthTabSession);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        r5.validateRelationship.onExtraCallbackWithResult();
        r1 = o.DraggableAnchorsNodeExternalSyntheticLambda0.writeTypedList + 1;
        o.DraggableAnchorsNodeExternalSyntheticLambda0.ICustomTabsService_Parcel = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        if ((r1 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        r0 = 47 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        r2 = o.DraggableAnchorsNodeExternalSyntheticLambda0.writeTypedList + 55;
        o.DraggableAnchorsNodeExternalSyntheticLambda0.ICustomTabsService_Parcel = r2 % 128;
        r2 = r2 % 2;
        r1.onTransact();
     */
    @Override // o.AppBarKtExternalSyntheticLambda8, o.TextAnnotatedStringNodeExternalSyntheticLambda4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ICustomTabsCallbackDefault() {
        DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda14;
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 103;
        writeTypedList = i3 % 128;
        if (i3 % 2 == 0) {
            super.ICustomTabsCallbackDefault();
            this.extraCallbackWithResult = 0;
            this.readTypedObject = onExtraCallback().IAuthTabCallback();
            this.setEngagementSignalsCallback = 1L;
            this.receiveFile = 0;
            drawerKtExternalSyntheticLambda14 = this.warmup;
        } else {
            super.ICustomTabsCallbackDefault();
            this.extraCallbackWithResult = 0;
            this.readTypedObject = onExtraCallback().IAuthTabCallback();
            this.setEngagementSignalsCallback = 0L;
            this.receiveFile = 0;
            drawerKtExternalSyntheticLambda14 = this.warmup;
        }
    }

    @Override // o.AppBarKtExternalSyntheticLambda8, o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onUnminimized() {
        int i2 = 2 % 2;
        ITrustedWebActivityCallbackDefault();
        ITrustedWebActivityService();
        DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda14 = this.warmup;
        if (drawerKtExternalSyntheticLambda14 != null) {
            drawerKtExternalSyntheticLambda14.asBinder();
            int i3 = ICustomTabsService_Parcel + 9;
            writeTypedList = i3 % 128;
            int i4 = i3 % 2;
        } else {
            this.validateRelationship.onExtraCallback();
        }
        DrawerKtExternalSyntheticLambda12 drawerKtExternalSyntheticLambda12 = this.ICustomTabsServiceStub;
        if (drawerKtExternalSyntheticLambda12 != null) {
            int i5 = ICustomTabsService_Parcel + 121;
            writeTypedList = i5 % 128;
            if (i5 % 2 == 0) {
                drawerKtExternalSyntheticLambda12.onExtraCallbackWithResult();
                throw null;
            }
            drawerKtExternalSyntheticLambda12.onExtraCallbackWithResult();
        }
        super.onUnminimized();
    }

    @Override // o.AppBarKtExternalSyntheticLambda8, o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onMinimized() {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 99;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        this.newSession = null;
        this.extraCommand = -9223372036854775807L;
        int iOnExtraCallback = getKekid.onExtraCallback();
        onExtraCallback(new Object[]{this}, 45720326, getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, -45720322, getKekid.onExtraCallback());
        this.onPostMessage = false;
        this.onWarmupCompleted = null;
        this.ICustomTabsCallbackDefault = true;
        try {
            super.onMinimized();
            this.onActivityResized.onExtraCallback(((AppBarKtExternalSyntheticLambda8) this).onExtraCallbackWithResult);
            this.onActivityResized.onWarmupCompleted(CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0.onExtraCallbackWithResult);
            int i5 = writeTypedList + 67;
            ICustomTabsService_Parcel = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            this.onActivityResized.onExtraCallback(((AppBarKtExternalSyntheticLambda8) this).onExtraCallbackWithResult);
            this.onActivityResized.onWarmupCompleted(CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0.onExtraCallbackWithResult);
            throw th;
        }
    }

    @Override // o.AppBarKtExternalSyntheticLambda8, o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onActivityResized() {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 45;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        try {
            super.onActivityResized();
            this.onMessageChannelReady = false;
            this.newSessionWithExtras = -9223372036854775807L;
            getSmallIconBitmap();
            int i5 = ICustomTabsService_Parcel + 109;
            writeTypedList = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            this.onMessageChannelReady = false;
            this.newSessionWithExtras = -9223372036854775807L;
            getSmallIconBitmap();
            throw th;
        }
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onMessageChannelReady() {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 1;
        ICustomTabsService_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            super.onMessageChannelReady();
            throw null;
        }
        super.onMessageChannelReady();
        DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda14 = this.warmup;
        if (drawerKtExternalSyntheticLambda14 != null) {
            int i4 = ICustomTabsService_Parcel;
            int i5 = i4 + 15;
            writeTypedList = i5 % 128;
            int i6 = i5 % 2;
            if (!this.ICustomTabsService) {
                return;
            }
            int i7 = i4 + 91;
            writeTypedList = i7 % 128;
            int i8 = i7 % 2;
            drawerKtExternalSyntheticLambda14.IAuthTabCallbackDefault();
            int i9 = writeTypedList + 29;
            ICustomTabsService_Parcel = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    @Override // o.AppBarKtExternalSyntheticLambda8, o.TextAnnotatedStringNodeExternalSyntheticLambda4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handleMessage(int i2, @Nullable Object obj) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        boolean z;
        int i3 = 2 % 2;
        if (i2 == 1) {
            onExtraCallback(new Object[]{this, obj}, -1772576522, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 1772576522, getKekid.onExtraCallback());
            return;
        }
        Object obj2 = null;
        if (i2 == 7) {
            DrawerKtExternalSyntheticLambda0 drawerKtExternalSyntheticLambda0 = (DrawerKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(obj);
            this.onActivityLayout = drawerKtExternalSyntheticLambda0;
            DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda14 = this.warmup;
            if (drawerKtExternalSyntheticLambda14 != null) {
                int i4 = writeTypedList + 27;
                ICustomTabsService_Parcel = i4 % 128;
                if (i4 % 2 == 0) {
                    drawerKtExternalSyntheticLambda14.onNavigationEvent(drawerKtExternalSyntheticLambda0);
                    return;
                } else {
                    drawerKtExternalSyntheticLambda14.onNavigationEvent(drawerKtExternalSyntheticLambda0);
                    obj2.hashCode();
                    throw null;
                }
            }
            return;
        }
        if (i2 == 10) {
            int iIntValue = ((Integer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(obj)).intValue();
            if (this.requestPostMessageChannelWithExtras != iIntValue) {
                this.requestPostMessageChannelWithExtras = iIntValue;
                if (this.requestPostMessageChannel) {
                    onSessionEnded();
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 4) {
            this.prefetch = ((Integer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(obj)).intValue();
            AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4PrefetchWithMultipleUrls = prefetchWithMultipleUrls();
            if (androidMenu_androidKtExternalSyntheticLambda4PrefetchWithMultipleUrls != null) {
                androidMenu_androidKtExternalSyntheticLambda4PrefetchWithMultipleUrls.onExtraCallback(this.prefetch);
                return;
            }
            return;
        }
        int i5 = ICustomTabsService_Parcel;
        int i6 = i5 + 29;
        writeTypedList = i6 % 128;
        if (i6 % 2 != 0 ? i2 == 5 : i2 == 2) {
            int iIntValue2 = ((Integer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(obj)).intValue();
            this.asInterface = iIntValue2;
            DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda142 = this.warmup;
            if (drawerKtExternalSyntheticLambda142 != null) {
                drawerKtExternalSyntheticLambda142.onExtraCallbackWithResult(iIntValue2);
                return;
            } else {
                this.validateRelationship.onExtraCallback(iIntValue2);
                return;
            }
        }
        int i7 = i5 + 61;
        int i8 = i7 % 128;
        writeTypedList = i8;
        if (i7 % 2 != 0 ? i2 == 13 : i2 == 35) {
            onExtraCallback((List<Object>) RecordingInputConnection_androidKt.onExtraCallbackWithResult(obj));
            return;
        }
        if (i2 == 14) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda25 textFieldDecoratorModifierNodeExternalSyntheticLambda25 = (TextFieldDecoratorModifierNodeExternalSyntheticLambda25) RecordingInputConnection_androidKt.onExtraCallbackWithResult(obj);
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda25.onExtraCallbackWithResult() == 0 || textFieldDecoratorModifierNodeExternalSyntheticLambda25.onExtraCallback() == 0) {
                return;
            }
            this.isEngagementSignalsApiAvailable = textFieldDecoratorModifierNodeExternalSyntheticLambda25;
            DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda143 = this.warmup;
            if (drawerKtExternalSyntheticLambda143 != null) {
                int i9 = writeTypedList + 41;
                ICustomTabsService_Parcel = i9 % 128;
                int i10 = i9 % 2;
                drawerKtExternalSyntheticLambda143.IAuthTabCallback((Surface) RecordingInputConnection_androidKt.onWarmupCompleted(this.ICustomTabsCallback), textFieldDecoratorModifierNodeExternalSyntheticLambda25);
                return;
            }
            return;
        }
        int i11 = i8 + 61;
        ICustomTabsService_Parcel = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 60 / 0;
            switch (i2) {
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    this.newAuthTabSession = ((Integer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(obj)).intValue();
                    onExtraCallback(new Object[]{this}, -1639081309, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 1639081314, getKekid.onExtraCallback());
                    return;
                case 17:
                    Surface surface = this.ICustomTabsCallback;
                    onExtraCallback(new Object[]{this, null}, -1772576522, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 1772576522, getKekid.onExtraCallback());
                    ((DraggableAnchorsNodeExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(obj)).handleMessage(1, surface);
                    return;
                case 18:
                    SelectionContainerKtExternalSyntheticLambda3 selectionContainerKtExternalSyntheticLambda3 = this.postMessage;
                    if (selectionContainerKtExternalSyntheticLambda3 == null || !selectionContainerKtExternalSyntheticLambda3.IAuthTabCallbackStub) {
                        z = false;
                    } else {
                        int i13 = ICustomTabsService_Parcel + 85;
                        writeTypedList = i13 % 128;
                        int i14 = i13 % 2;
                        z = true;
                    }
                    SelectionContainerKtExternalSyntheticLambda3 selectionContainerKtExternalSyntheticLambda32 = (SelectionContainerKtExternalSyntheticLambda3) obj;
                    this.postMessage = selectionContainerKtExternalSyntheticLambda32;
                    if (z != (selectionContainerKtExternalSyntheticLambda32 != null && selectionContainerKtExternalSyntheticLambda32.IAuthTabCallbackStub)) {
                        int i15 = writeTypedList + 13;
                        ICustomTabsService_Parcel = i15 % 128;
                        int i16 = i15 % 2;
                        IEngagementSignalsCallbackStubProxy();
                        return;
                    }
                    return;
                default:
                    super.handleMessage(i2, obj);
                    return;
            }
        }
        switch (i2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        Surface surface;
        DraggableAnchorsNodeExternalSyntheticLambda0 draggableAnchorsNodeExternalSyntheticLambda0 = (DraggableAnchorsNodeExternalSyntheticLambda0) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = writeTypedList;
        int i4 = i3 + 81;
        ICustomTabsService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
            if (obj instanceof Surface) {
                int i6 = i3 + 17;
                ICustomTabsService_Parcel = i6 % 128;
                int i7 = i6 % 2;
                surface = (Surface) obj;
            } else {
                surface = null;
            }
        } else if (obj instanceof Surface) {
        }
        if (draggableAnchorsNodeExternalSyntheticLambda0.ICustomTabsCallback == surface) {
            if (surface != null) {
                draggableAnchorsNodeExternalSyntheticLambda0.areNotificationsEnabled();
                draggableAnchorsNodeExternalSyntheticLambda0.ITrustedWebActivityCallback_Parcel();
            }
            return null;
        }
        draggableAnchorsNodeExternalSyntheticLambda0.ICustomTabsCallback = surface;
        if (draggableAnchorsNodeExternalSyntheticLambda0.warmup == null) {
            int i8 = ICustomTabsService_Parcel + 91;
            writeTypedList = i8 % 128;
            if (i8 % 2 == 0) {
                draggableAnchorsNodeExternalSyntheticLambda0.validateRelationship.onExtraCallbackWithResult(surface);
                int i9 = 16 / 0;
            } else {
                draggableAnchorsNodeExternalSyntheticLambda0.validateRelationship.onExtraCallbackWithResult(surface);
            }
        }
        draggableAnchorsNodeExternalSyntheticLambda0.onPostMessage = false;
        int interfaceDescriptor = draggableAnchorsNodeExternalSyntheticLambda0.getInterfaceDescriptor();
        AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4PrefetchWithMultipleUrls = draggableAnchorsNodeExternalSyntheticLambda0.prefetchWithMultipleUrls();
        if (androidMenu_androidKtExternalSyntheticLambda4PrefetchWithMultipleUrls != null && draggableAnchorsNodeExternalSyntheticLambda0.warmup == null) {
            int i10 = ICustomTabsService_Parcel + 1;
            writeTypedList = i10 % 128;
            if (i10 % 2 == 0) {
                draggableAnchorsNodeExternalSyntheticLambda0.onExtraCallback((AppBarKtExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallbackWithResult(draggableAnchorsNodeExternalSyntheticLambda0.requestPostMessageChannel()));
                throw null;
            }
            AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5 = (AppBarKtExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallbackWithResult(draggableAnchorsNodeExternalSyntheticLambda0.requestPostMessageChannel());
            if (draggableAnchorsNodeExternalSyntheticLambda0.onExtraCallback(appBarKtExternalSyntheticLambda5) && (!draggableAnchorsNodeExternalSyntheticLambda0.getInterfaceDescriptor)) {
                draggableAnchorsNodeExternalSyntheticLambda0.IAuthTabCallback(androidMenu_androidKtExternalSyntheticLambda4PrefetchWithMultipleUrls, (Surface) onExtraCallback(new Object[]{draggableAnchorsNodeExternalSyntheticLambda0, appBarKtExternalSyntheticLambda5}, -1908657735, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 1908657737, getKekid.onExtraCallback()));
            } else {
                draggableAnchorsNodeExternalSyntheticLambda0.onSessionEnded();
                draggableAnchorsNodeExternalSyntheticLambda0.ICustomTabsServiceStubProxy();
            }
        }
        if (surface != null) {
            draggableAnchorsNodeExternalSyntheticLambda0.areNotificationsEnabled();
        } else {
            draggableAnchorsNodeExternalSyntheticLambda0.newSession = null;
            DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda14 = draggableAnchorsNodeExternalSyntheticLambda0.warmup;
            if (drawerKtExternalSyntheticLambda14 != null) {
                drawerKtExternalSyntheticLambda14.onNavigationEvent();
                int i11 = ICustomTabsService_Parcel + 15;
                writeTypedList = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 4 / 4;
                }
            }
        }
        if (interfaceDescriptor == 2) {
            int i13 = writeTypedList + 61;
            ICustomTabsService_Parcel = i13 % 128;
            int i14 = i13 % 2;
            DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda142 = draggableAnchorsNodeExternalSyntheticLambda0.warmup;
            if (drawerKtExternalSyntheticLambda142 != null) {
                drawerKtExternalSyntheticLambda142.IAuthTabCallback(true);
            } else {
                draggableAnchorsNodeExternalSyntheticLambda0.validateRelationship.onExtraCallback(true);
            }
        }
        onExtraCallback(new Object[]{draggableAnchorsNodeExternalSyntheticLambda0}, 45720326, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), -45720322, getKekid.onExtraCallback());
        return null;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public boolean onExtraCallbackWithResult(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5) {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 109;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnExtraCallback = onExtraCallback(appBarKtExternalSyntheticLambda5);
        int i5 = ICustomTabsService_Parcel + 25;
        writeTypedList = i5 % 128;
        if (i5 % 2 != 0) {
            return zOnExtraCallback;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042 A[PHI: r1 r3 r4
      0x0042: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v10 java.lang.String) binds: [B:8:0x003c, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r3v2 o.DraggableAnchorsNodeExternalSyntheticLambda0$IAuthTabCallback) = 
      (r3v1 o.DraggableAnchorsNodeExternalSyntheticLambda0$IAuthTabCallback)
      (r3v6 o.DraggableAnchorsNodeExternalSyntheticLambda0$IAuthTabCallback)
     binds: [B:8:0x003c, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r4v1 boolean) = (r4v0 boolean), (r4v4 boolean) binds: [B:8:0x003c, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[PHI: r1 r3 r4
      0x003e: PHI (r1v9 java.lang.String) = (r1v4 java.lang.String), (r1v10 java.lang.String) binds: [B:8:0x003c, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r3v4 o.DraggableAnchorsNodeExternalSyntheticLambda0$IAuthTabCallback) = 
      (r3v1 o.DraggableAnchorsNodeExternalSyntheticLambda0$IAuthTabCallback)
      (r3v6 o.DraggableAnchorsNodeExternalSyntheticLambda0$IAuthTabCallback)
     binds: [B:8:0x003c, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r4v3 boolean) = (r4v0 boolean), (r4v4 boolean) binds: [B:8:0x003c, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.AppBarKtExternalSyntheticLambda8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AndroidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted onNavigationEvent(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable MediaCrypto mediaCrypto, float f) throws Throwable {
        String str;
        IAuthTabCallback iAuthTabCallbackOnNavigationEvent;
        boolean z;
        int i2;
        String str2;
        boolean z2;
        int i3 = 2 % 2;
        int i4 = writeTypedList + 117;
        ICustomTabsService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            str = appBarKtExternalSyntheticLambda5.onExtraCallback;
            iAuthTabCallbackOnNavigationEvent = onNavigationEvent(appBarKtExternalSyntheticLambda5, basicTextContextMenuProviderKtExternalSyntheticLambda4, access100());
            this.IAuthTabCallbackStub = iAuthTabCallbackOnNavigationEvent;
            z = this.extraCallback;
            int i5 = 94 / 0;
            if (this.requestPostMessageChannel) {
                int i6 = writeTypedList + 91;
                ICustomTabsService_Parcel = i6 % 128;
                int i7 = i6 % 2;
                i2 = this.requestPostMessageChannelWithExtras;
                str2 = str;
                z2 = z;
            } else {
                i2 = 0;
                z2 = z;
                str2 = str;
            }
        } else {
            str = appBarKtExternalSyntheticLambda5.onExtraCallback;
            iAuthTabCallbackOnNavigationEvent = onNavigationEvent(appBarKtExternalSyntheticLambda5, basicTextContextMenuProviderKtExternalSyntheticLambda4, access100());
            this.IAuthTabCallbackStub = iAuthTabCallbackOnNavigationEvent;
            z = this.extraCallback;
            if (!this.requestPostMessageChannel) {
            }
        }
        MediaFormat mediaFormatOnWarmupCompleted = onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4, str2, iAuthTabCallbackOnNavigationEvent, f, z2, i2);
        Surface surface = (Surface) onExtraCallback(new Object[]{this, appBarKtExternalSyntheticLambda5}, -1908657735, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 1908657737, getKekid.onExtraCallback());
        onWarmupCompleted(mediaFormatOnWarmupCompleted);
        return AndroidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted.onExtraCallback(appBarKtExternalSyntheticLambda5, mediaFormatOnWarmupCompleted, basicTextContextMenuProviderKtExternalSyntheticLambda4, surface, mediaCrypto);
    }

    private void onWarmupCompleted(MediaFormat mediaFormat) {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 115;
        ICustomTabsService_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.warmup == null || TextFieldDecoratorModifierNodeExternalSyntheticLambda6.asInterface(this.access000)) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
        int i4 = writeTypedList + 11;
        ICustomTabsService_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    @Override // o.AppBarKtExternalSyntheticLambda8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextStringSimpleNodeExternalSyntheticLambda0 IAuthTabCallback(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 105;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
        TextStringSimpleNodeExternalSyntheticLambda0 textStringSimpleNodeExternalSyntheticLambda0OnNavigationEvent = appBarKtExternalSyntheticLambda5.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4, basicTextContextMenuProviderKtExternalSyntheticLambda42);
        int i5 = textStringSimpleNodeExternalSyntheticLambda0OnNavigationEvent.onExtraCallback;
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackStub);
        int i6 = 0;
        if (basicTextContextMenuProviderKtExternalSyntheticLambda42.prefetchWithMultipleUrls <= iAuthTabCallback.onWarmupCompleted) {
            int i7 = writeTypedList + 47;
            ICustomTabsService_Parcel = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 36 / 0;
                if (basicTextContextMenuProviderKtExternalSyntheticLambda42.ICustomTabsCallback > iAuthTabCallback.IAuthTabCallback) {
                    i5 |= 256;
                }
            } else if (basicTextContextMenuProviderKtExternalSyntheticLambda42.ICustomTabsCallback > iAuthTabCallback.IAuthTabCallback) {
            }
        }
        if (onWarmupCompleted(appBarKtExternalSyntheticLambda5, basicTextContextMenuProviderKtExternalSyntheticLambda42) > iAuthTabCallback.onExtraCallback) {
            i5 |= 64;
            int i9 = writeTypedList + 55;
            ICustomTabsService_Parcel = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = i5;
        String str = appBarKtExternalSyntheticLambda5.IAuthTabCallbackStub;
        if (i11 != 0) {
            int i12 = ICustomTabsService_Parcel + 3;
            writeTypedList = i12 % 128;
            int i13 = i12 % 2;
        } else {
            i6 = textStringSimpleNodeExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback;
        }
        return new TextStringSimpleNodeExternalSyntheticLambda0(str, basicTextContextMenuProviderKtExternalSyntheticLambda4, basicTextContextMenuProviderKtExternalSyntheticLambda42, i6, i11);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.AndroidSelectionHandles_androidKtExternalSyntheticLambda4 */
    @Override // o.AppBarKtExternalSyntheticLambda8, androidx.media3.exoplayer.Renderer
    public void onExtraCallbackWithResult(long j, long j2) throws MediaCryptoException, AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 103;
        int i4 = i3 % 128;
        writeTypedList = i4;
        if (i3 % 2 != 0) {
            DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda14 = this.warmup;
            if (drawerKtExternalSyntheticLambda14 != null) {
                int i5 = i4 + 99;
                ICustomTabsService_Parcel = i5 % 128;
                int i6 = i5 % 2;
                try {
                    drawerKtExternalSyntheticLambda14.onWarmupCompleted(j, j2);
                    int i7 = writeTypedList + 33;
                    ICustomTabsService_Parcel = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 5 / 5;
                    }
                } catch (DrawerKtExternalSyntheticLambda14.onNavigationEvent e) {
                    throw onExtraCallbackWithResult(e, e.format, 7001);
                }
            }
            super.onExtraCallbackWithResult(j, j2);
            int i9 = ICustomTabsService_Parcel + 7;
            writeTypedList = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 25 / 0;
                return;
            }
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public void IEngagementSignalsCallbackDefault() {
        int i2 = 2 % 2;
        super.IEngagementSignalsCallbackDefault();
        this.writeTypedObject.clear();
        this.onTransact = 0;
        this.access100 = 0;
        this.ICustomTabsCallbackDefault = false;
        ComposableSingletonsTabRowKtExternalSyntheticLambda1 composableSingletonsTabRowKtExternalSyntheticLambda1 = this.IAuthTabCallbackDefault;
        if (composableSingletonsTabRowKtExternalSyntheticLambda1 != null) {
            int i3 = ICustomTabsService_Parcel + 115;
            writeTypedList = i3 % 128;
            int i4 = i3 % 2;
            composableSingletonsTabRowKtExternalSyntheticLambda1.onNavigationEvent();
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i5 = ICustomTabsService_Parcel + 41;
        writeTypedList = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
    }

    @Override // o.AppBarKtExternalSyntheticLambda8, androidx.media3.exoplayer.Renderer
    public void onExtraCallback(float f, float f2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 73;
        ICustomTabsService_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            super.onExtraCallback(f, f2);
            DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda14 = this.warmup;
            if (drawerKtExternalSyntheticLambda14 != null) {
                drawerKtExternalSyntheticLambda14.onWarmupCompleted(f);
            } else {
                this.validateRelationship.onExtraCallbackWithResult(f);
            }
            DrawerKtExternalSyntheticLambda12 drawerKtExternalSyntheticLambda12 = this.ICustomTabsServiceStub;
            if (drawerKtExternalSyntheticLambda12 != null) {
                drawerKtExternalSyntheticLambda12.onWarmupCompleted(f);
                int i4 = ICustomTabsService_Parcel + 121;
                writeTypedList = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            return;
        }
        super.onExtraCallback(f, f2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012d, code lost:
    
        if (r11.asInterface == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0132, code lost:
    
        if (r11.asInterface == false) goto L79;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int onExtraCallbackWithResult(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        char c;
        int iIntValue;
        int i2 = 2 % 2;
        int i3 = basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetchWithMultipleUrls;
        int i4 = basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback;
        if (i3 != -1 && i4 != -1) {
            String str = (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable);
            if ("video/dolby-vision".equals(str)) {
                int i5 = ICustomTabsService_Parcel + 69;
                writeTypedList = i5 % 128;
                if (i5 % 2 == 0) {
                    AppBarKtExternalSyntheticLambda9.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4);
                    throw null;
                }
                Pair<Integer, Integer> pairOnNavigationEvent = AppBarKtExternalSyntheticLambda9.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4);
                if (pairOnNavigationEvent != null) {
                    int i6 = ICustomTabsService_Parcel + 45;
                    writeTypedList = i6 % 128;
                    if (i6 % 2 != 0 ? (iIntValue = ((Integer) pairOnNavigationEvent.first).intValue()) == 512 : (iIntValue = ((Integer) pairOnNavigationEvent.first).intValue()) == 8144) {
                        int i7 = ICustomTabsService_Parcel + 117;
                        writeTypedList = i7 % 128;
                        int i8 = i7 % 2;
                        str = "video/avc";
                    } else if (iIntValue != 1 && iIntValue != 2) {
                        int i9 = writeTypedList + 27;
                        ICustomTabsService_Parcel = i9 % 128;
                        str = (i9 % 2 == 0 ? iIntValue != 1024 : iIntValue != 11599) ? "video/hevc" : "video/av01";
                    }
                }
            }
            switch (str.hashCode()) {
                case -1664118616:
                    if (!str.equals("video/3gpp")) {
                        c = 65535;
                        break;
                    } else {
                        int i10 = writeTypedList + 57;
                        ICustomTabsService_Parcel = i10 % 128;
                        int i11 = i10 % 2;
                        c = 0;
                        break;
                    }
                case -1662735862:
                    if (str.equals("video/av01")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1187890754:
                    if (!(!str.equals("video/mp4v-es"))) {
                        int i12 = ICustomTabsService_Parcel + 67;
                        writeTypedList = i12 % 128;
                        int i13 = i12 % 2;
                        c = 3;
                        break;
                    }
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 3:
                case 5:
                    return onExtraCallback(i3 * i4, 2);
                case 2:
                    return Math.max(2097152, onExtraCallback(i3 * i4, 2));
                case 4:
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2)) {
                        if ("Amazon".equals(Build.MANUFACTURER)) {
                            if (!"KFSOWI".equals(str2)) {
                                if ("AFTS".equals(str2)) {
                                    int i14 = ICustomTabsService_Parcel + 53;
                                    writeTypedList = i14 % 128;
                                    if (i14 % 2 != 0) {
                                        break;
                                    } else {
                                        int i15 = 92 / 0;
                                        break;
                                    }
                                }
                            }
                        }
                        return onExtraCallback((TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(i3, 16) * TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(i4, 16)) << 8, 2);
                    }
                    return -1;
                case 6:
                    return onExtraCallback(i3 * i4, 4);
                default:
                    int i16 = ICustomTabsService_Parcel + 55;
                    writeTypedList = i16 % 128;
                    int i17 = i16 % 2;
                    break;
            }
        }
        return -1;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public float onExtraCallback(float f, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr) {
        int length;
        int i2;
        float f2;
        AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5RequestPostMessageChannel;
        int i3 = 2 % 2;
        int i4 = ICustomTabsService_Parcel + 103;
        writeTypedList = i4 % 128;
        if (i4 % 2 == 0) {
            length = basicTextContextMenuProviderKtExternalSyntheticLambda4Arr.length;
            i2 = 1;
        } else {
            length = basicTextContextMenuProviderKtExternalSyntheticLambda4Arr.length;
            i2 = 0;
        }
        float fMax = -1.0f;
        while (i2 < length) {
            float f3 = basicTextContextMenuProviderKtExternalSyntheticLambda4Arr[i2].writeTypedObject;
            if (f3 != -1.0f) {
                fMax = Math.max(fMax, f3);
            }
            i2++;
            int i5 = writeTypedList + 15;
            ICustomTabsService_Parcel = i5 % 128;
            int i6 = i5 % 2;
        }
        if (fMax == -1.0f) {
            f2 = -1.0f;
        } else {
            f2 = fMax * f;
            int i7 = writeTypedList + 47;
            ICustomTabsService_Parcel = i7 % 128;
            int i8 = i7 % 2;
        }
        if (this.postMessage == null || (appBarKtExternalSyntheticLambda5RequestPostMessageChannel = requestPostMessageChannel()) == null) {
            return f2;
        }
        float fOnNavigationEvent = appBarKtExternalSyntheticLambda5RequestPostMessageChannel.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetchWithMultipleUrls, basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback);
        if (f2 == -1.0f) {
            return fOnNavigationEvent;
        }
        int i9 = writeTypedList + 85;
        ICustomTabsService_Parcel = i9 % 128;
        int i10 = i9 % 2;
        return Math.max(f2, fOnNavigationEvent);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.AndroidSelectionHandles_androidKtExternalSyntheticLambda4 */
    @Override // o.AppBarKtExternalSyntheticLambda8
    public boolean IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 63;
        int i4 = i3 % 128;
        ICustomTabsService_Parcel = i4;
        int i5 = i3 % 2;
        if (this.warmup != null) {
            int i6 = i4 + 85;
            writeTypedList = i6 % 128;
            int i7 = i6 % 2;
            if (!r1.onExtraCallback()) {
                try {
                    boolean zOnWarmupCompleted = this.warmup.onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4);
                    int i8 = ICustomTabsService_Parcel + 61;
                    writeTypedList = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 23 / 0;
                    }
                    return zOnWarmupCompleted;
                } catch (DrawerKtExternalSyntheticLambda14.onNavigationEvent e) {
                    throw onExtraCallbackWithResult(e, basicTextContextMenuProviderKtExternalSyntheticLambda4, 7000);
                }
            }
        }
        return true;
    }

    public void onExtraCallback(List<Object> list) {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 107;
        ICustomTabsService_Parcel = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            list.equals(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda4.onWarmupCompleted);
            throw null;
        }
        if (!list.equals(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda4.onWarmupCompleted)) {
            this.prefetchWithMultipleUrls = list;
            DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda14 = this.warmup;
            if (drawerKtExternalSyntheticLambda14 != null) {
                drawerKtExternalSyntheticLambda14.IAuthTabCallback(list);
                int i4 = ICustomTabsService_Parcel + 53;
                writeTypedList = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            return;
        }
        int i6 = writeTypedList;
        int i7 = i6 + 111;
        ICustomTabsService_Parcel = i7 % 128;
        if (i7 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda142 = this.warmup;
        if (drawerKtExternalSyntheticLambda142 != null) {
            int i8 = i6 + 65;
            ICustomTabsService_Parcel = i8 % 128;
            int i9 = i8 % 2;
            if (drawerKtExternalSyntheticLambda142.onExtraCallback()) {
                this.warmup.IAuthTabCallbackStub();
            }
        }
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public void onExtraCallbackWithResult(String str, AndroidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted onwarmupcompleted, long j, long j2) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 105;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
        this.onActivityResized.onNavigationEvent(str, j, j2);
        this.getInterfaceDescriptor = onExtraCallbackWithResult(str);
        this.asBinder = ((AppBarKtExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallbackWithResult(requestPostMessageChannel())).onExtraCallback();
        int iOnExtraCallback = getKekid.onExtraCallback();
        onExtraCallback(new Object[]{this}, 45720326, getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, -45720322, getKekid.onExtraCallback());
        int i5 = writeTypedList + 111;
        ICustomTabsService_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public void onNavigationEvent(String str) {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 33;
        ICustomTabsService_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            this.onActivityResized.onWarmupCompleted(str);
            throw null;
        }
        this.onActivityResized.onWarmupCompleted(str);
        int i4 = ICustomTabsService_Parcel + 93;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public void onExtraCallbackWithResult(Exception exc) {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 73;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MediaCodecVideoRenderer", "Video codec error", exc);
        this.onActivityResized.onExtraCallback(exc);
        int i5 = ICustomTabsService_Parcel + 93;
        writeTypedList = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public final boolean IPostMessageServiceDefault() {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 75;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5RequestPostMessageChannel = requestPostMessageChannel();
        if (this.warmup != null) {
            int i5 = writeTypedList + 47;
            int i6 = i5 % 128;
            ICustomTabsService_Parcel = i6;
            int i7 = i5 % 2;
            if (appBarKtExternalSyntheticLambda5RequestPostMessageChannel != null) {
                int i8 = i6 + 53;
                writeTypedList = i8 % 128;
                int i9 = i8 % 2;
                if (appBarKtExternalSyntheticLambda5RequestPostMessageChannel.IAuthTabCallbackStub.equals("c2.mtk.avc.decoder")) {
                    return true;
                }
                int i10 = ICustomTabsService_Parcel + 17;
                writeTypedList = i10 % 128;
                int i11 = i10 % 2;
                if (appBarKtExternalSyntheticLambda5RequestPostMessageChannel.IAuthTabCallbackStub.equals("c2.mtk.hevc.decoder")) {
                    return true;
                }
            }
        }
        return super.IPostMessageServiceDefault();
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public final boolean IEngagementSignalsCallbackStub() {
        int i2 = 2 % 2;
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4ReceiveFile = receiveFile();
        SelectionContainerKtExternalSyntheticLambda3 selectionContainerKtExternalSyntheticLambda3 = this.postMessage;
        if (selectionContainerKtExternalSyntheticLambda3 == null) {
            int i3 = writeTypedList + 59;
            ICustomTabsService_Parcel = i3 % 128;
            int i4 = i3 % 2;
            return super.IEngagementSignalsCallbackStub();
        }
        if (selectionContainerKtExternalSyntheticLambda3.onExtraCallbackWithResult) {
            int i5 = writeTypedList + 85;
            ICustomTabsService_Parcel = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (!this.ICustomTabsCallbackDefault && (!this.requestPostMessageChannel) && ((basicTextContextMenuProviderKtExternalSyntheticLambda4ReceiveFile == null || basicTextContextMenuProviderKtExternalSyntheticLambda4ReceiveFile.onRelationshipValidationResult <= 0) && !writeTypedList() && ICustomTabsServiceDefault() == -9223372036854775807L)) {
                int i6 = writeTypedList;
                int i7 = i6 + 1;
                ICustomTabsService_Parcel = i7 % 128;
                int i8 = i7 % 2;
                int i9 = i6 + 15;
                ICustomTabsService_Parcel = i9 % 128;
                if (i9 % 2 == 0) {
                    return false;
                }
                obj.hashCode();
                throw null;
            }
        }
        return true;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public TextStringSimpleNodeExternalSyntheticLambda0 onNavigationEvent(AndroidSelectionHandles_androidKtExternalSyntheticLambda7 androidSelectionHandles_androidKtExternalSyntheticLambda7) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 29;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        TextStringSimpleNodeExternalSyntheticLambda0 textStringSimpleNodeExternalSyntheticLambda0OnNavigationEvent = super.onNavigationEvent(androidSelectionHandles_androidKtExternalSyntheticLambda7);
        this.onActivityResized.onExtraCallback((BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(androidSelectionHandles_androidKtExternalSyntheticLambda7.onWarmupCompleted), textStringSimpleNodeExternalSyntheticLambda0OnNavigationEvent);
        DrawerKtExternalSyntheticLambda12 drawerKtExternalSyntheticLambda12 = this.ICustomTabsServiceStub;
        if (drawerKtExternalSyntheticLambda12 != null) {
            int i5 = ICustomTabsService_Parcel + 61;
            writeTypedList = i5 % 128;
            int i6 = i5 % 2;
            drawerKtExternalSyntheticLambda12.onExtraCallbackWithResult();
            if (i6 == 0) {
                int i7 = 76 / 0;
            }
        }
        return textStringSimpleNodeExternalSyntheticLambda0OnNavigationEvent;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public void onExtraCallback(SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        ByteBuffer byteBuffer;
        int i2 = 2 % 2;
        int i3 = writeTypedList + 19;
        int i4 = i3 % 128;
        ICustomTabsService_Parcel = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            if (this.IAuthTabCallbackDefault != null) {
                int i5 = i4 + 119;
                writeTypedList = i5 % 128;
                if (i5 % 2 != 0) {
                    if (((AppBarKtExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallbackWithResult(requestPostMessageChannel())).asBinder.equals("video/av01") && (byteBuffer = selectionControllerExternalSyntheticLambda2.onExtraCallback) != null) {
                        int i6 = ICustomTabsService_Parcel + 43;
                        writeTypedList = i6 % 128;
                        if (i6 % 2 != 0) {
                            this.IAuthTabCallbackDefault.onWarmupCompleted(byteBuffer);
                        } else {
                            this.IAuthTabCallbackDefault.onWarmupCompleted(byteBuffer);
                            throw null;
                        }
                    }
                } else {
                    ((AppBarKtExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallbackWithResult(requestPostMessageChannel())).asBinder.equals("video/av01");
                    throw null;
                }
            }
            this.access100 = 0;
            int iOnWarmupCompleted = onWarmupCompleted(selectionControllerExternalSyntheticLambda2);
            if ((Build.VERSION.SDK_INT < 34 || (iOnWarmupCompleted & 32) == 0) && !this.requestPostMessageChannel) {
                this.onTransact++;
                int i7 = writeTypedList + 17;
                ICustomTabsService_Parcel = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 3 % 4;
                    return;
                }
                return;
            }
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public int onWarmupCompleted(SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2) {
        int i2 = 2 % 2;
        if (Build.VERSION.SDK_INT < 34) {
            return 0;
        }
        int i3 = ICustomTabsService_Parcel + 31;
        int i4 = i3 % 128;
        writeTypedList = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (!this.onMinimized) {
            int i5 = i4 + 7;
            ICustomTabsService_Parcel = i5 % 128;
            int i6 = i5 % 2;
            SelectionContainerKtExternalSyntheticLambda3 selectionContainerKtExternalSyntheticLambda3 = this.postMessage;
            if ((selectionContainerKtExternalSyntheticLambda3 == null || !selectionContainerKtExternalSyntheticLambda3.onTransact) && !this.requestPostMessageChannel) {
                return 0;
            }
        }
        if (!IAuthTabCallbackDefault(selectionControllerExternalSyntheticLambda2) || onTransact(selectionControllerExternalSyntheticLambda2)) {
            return 0;
        }
        int i7 = ICustomTabsService_Parcel + 25;
        int i8 = i7 % 128;
        writeTypedList = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 77;
        ICustomTabsService_Parcel = i10 % 128;
        int i11 = i10 % 2;
        return 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    @Override // o.AppBarKtExternalSyntheticLambda8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onExtraCallbackWithResult(SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2) {
        boolean z;
        ByteBuffer byteBuffer;
        int i2 = 2 % 2;
        boolean z2 = false;
        if (onTransact(selectionControllerExternalSyntheticLambda2)) {
            return false;
        }
        boolean zIAuthTabCallbackDefault = IAuthTabCallbackDefault(selectionControllerExternalSyntheticLambda2);
        DrawerKtExternalSyntheticLambda12 drawerKtExternalSyntheticLambda12 = this.ICustomTabsServiceStub;
        if (drawerKtExternalSyntheticLambda12 != null) {
            long jIAuthTabCallback = drawerKtExternalSyntheticLambda12.IAuthTabCallback(selectionControllerExternalSyntheticLambda2.onWarmupCompleted);
            z = jIAuthTabCallback != -9223372036854775807L && jIAuthTabCallback < this.ICustomTabsCallbackStubProxy;
        }
        if ((!zIAuthTabCallbackDefault && !z) || selectionControllerExternalSyntheticLambda2.onExtraCallback()) {
            return false;
        }
        Object obj = null;
        if (!selectionControllerExternalSyntheticLambda2.IAuthTabCallbackStub()) {
            if (this.IAuthTabCallbackDefault != null && ((AppBarKtExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallbackWithResult(requestPostMessageChannel())).asBinder.equals("video/av01") && (byteBuffer = selectionControllerExternalSyntheticLambda2.onExtraCallback) != null) {
                boolean z3 = zIAuthTabCallbackDefault || this.access100 <= 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                byteBufferAsReadOnlyBuffer.flip();
                int iOnWarmupCompleted = this.IAuthTabCallbackDefault.onWarmupCompleted(byteBufferAsReadOnlyBuffer, z3);
                if (iOnWarmupCompleted == 0) {
                    selectionControllerExternalSyntheticLambda2.onNavigationEvent();
                } else if (iOnWarmupCompleted != byteBufferAsReadOnlyBuffer.limit() && ((IAuthTabCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackStub)).onExtraCallback + iOnWarmupCompleted < byteBufferAsReadOnlyBuffer.capacity() && !selectionControllerExternalSyntheticLambda2.onTransact()) {
                    int i3 = writeTypedList + 9;
                    ICustomTabsService_Parcel = i3 % 128;
                    if (i3 % 2 != 0) {
                        ((ByteBuffer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(selectionControllerExternalSyntheticLambda2.onExtraCallback)).position(iOnWarmupCompleted);
                        obj.hashCode();
                        throw null;
                    }
                    ((ByteBuffer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(selectionControllerExternalSyntheticLambda2.onExtraCallback)).position(iOnWarmupCompleted);
                }
            }
            if (z2) {
                int i4 = ICustomTabsService_Parcel + 103;
                int i5 = i4 % 128;
                writeTypedList = i5;
                int i6 = i4 % 2;
                if (zIAuthTabCallbackDefault) {
                    int i7 = i5 + 117;
                    ICustomTabsService_Parcel = i7 % 128;
                    int i8 = i7 % 2;
                    ((AppBarKtExternalSyntheticLambda8) this).onExtraCallbackWithResult.IAuthTabCallbackStub++;
                    return z2;
                }
                this.writeTypedObject.add(Long.valueOf(selectionControllerExternalSyntheticLambda2.onWarmupCompleted));
                this.access100++;
            }
            return z2;
        }
        int i9 = ICustomTabsService_Parcel + 95;
        writeTypedList = i9 % 128;
        if (i9 % 2 == 0) {
            selectionControllerExternalSyntheticLambda2.onNavigationEvent();
            throw null;
        }
        selectionControllerExternalSyntheticLambda2.onNavigationEvent();
        z2 = true;
        if (z2) {
        }
        return z2;
    }

    private boolean onTransact(SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2) {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 91;
        ICustomTabsService_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            if (!(!extraCallback()) || selectionControllerExternalSyntheticLambda2.asBinder()) {
                return true;
            }
            if (this.extraCommand != -9223372036854775807L) {
                return this.extraCommand - (selectionControllerExternalSyntheticLambda2.onWarmupCompleted - updateVisuals()) <= 100000;
            }
            int i4 = writeTypedList + 47;
            ICustomTabsService_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        extraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private boolean IAuthTabCallbackDefault(SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 31;
        writeTypedList = i3 % 128;
        if (i3 % 2 == 0) {
            long j = selectionControllerExternalSyntheticLambda2.onWarmupCompleted;
            IAuthTabCallbackStub();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (selectionControllerExternalSyntheticLambda2.onWarmupCompleted < IAuthTabCallbackStub()) {
            return true;
        }
        int i4 = writeTypedList + 69;
        ICustomTabsService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    @Override // o.AppBarKtExternalSyntheticLambda8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z;
        int i2 = 2 % 2;
        AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4PrefetchWithMultipleUrls = prefetchWithMultipleUrls();
        if (androidMenu_androidKtExternalSyntheticLambda4PrefetchWithMultipleUrls != null) {
            androidMenu_androidKtExternalSyntheticLambda4PrefetchWithMultipleUrls.onExtraCallback(this.prefetch);
        }
        if (!(!this.requestPostMessageChannel)) {
            int i3 = ICustomTabsService_Parcel + 77;
            writeTypedList = i3 % 128;
            int i4 = i3 % 2;
            integer = basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetchWithMultipleUrls;
            integer2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback;
        } else if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left")) {
            int i5 = writeTypedList + 71;
            ICustomTabsService_Parcel = i5 % 128;
            int i6 = i5 % 2;
            if (mediaFormat.containsKey("crop-bottom")) {
                int i7 = writeTypedList + 49;
                ICustomTabsService_Parcel = i7 % 128;
                if (i7 % 2 != 0) {
                    mediaFormat.containsKey("crop-top");
                    throw null;
                }
                if (mediaFormat.containsKey("crop-top")) {
                    z = true;
                }
                if (z) {
                }
                if (!z) {
                }
                int i8 = ICustomTabsService_Parcel + 47;
                writeTypedList = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            z = false;
            if (z) {
                integer = mediaFormat.getInteger("width");
            } else {
                int i10 = ICustomTabsService_Parcel + 73;
                writeTypedList = i10 % 128;
                int i11 = i10 % 2;
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            }
            integer2 = !z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            int i82 = ICustomTabsService_Parcel + 47;
            writeTypedList = i82 % 128;
            int i92 = i82 % 2;
        }
        float f = basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback_Parcel;
        int i12 = basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsService;
        if (i12 == 90 || i12 == 270) {
            f = 1.0f / f;
            int i13 = integer2;
            integer2 = integer;
            integer = i13;
        }
        this.IAuthTabCallbackStubProxy = new CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0(integer, integer2, f);
        DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda14 = this.warmup;
        if (drawerKtExternalSyntheticLambda14 != null) {
            int i14 = writeTypedList + 63;
            ICustomTabsService_Parcel = i14 % 128;
            int i15 = i14 % 2;
            if (this.ICustomTabsCallback_Parcel) {
                onExtraCallback(drawerKtExternalSyntheticLambda14, 1, basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallback().onActivityLayout(integer).access100(integer2).onNavigationEvent(f).onNavigationEvent(), this.ICustomTabsCallbackStub);
                this.ICustomTabsCallbackStub = 2;
            } else {
                this.validateRelationship.onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.writeTypedObject);
            }
        }
        this.ICustomTabsCallback_Parcel = false;
    }

    protected void onExtraCallback(DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda14, int i2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i3) {
        int i4 = 2 % 2;
        int i5 = ICustomTabsService_Parcel;
        int i6 = i5 + 29;
        writeTypedList = i6 % 128;
        if (i6 % 2 != 0) {
            ImmutableList immutableListOf = this.prefetchWithMultipleUrls;
            if (immutableListOf == null) {
                int i7 = i5 + 21;
                writeTypedList = i7 % 128;
                int i8 = i7 % 2;
                immutableListOf = ImmutableList.of();
                int i9 = writeTypedList + 41;
                ICustomTabsService_Parcel = i9 % 128;
                int i10 = i9 % 2;
            }
            drawerKtExternalSyntheticLambda14.IAuthTabCallback(i2, basicTextContextMenuProviderKtExternalSyntheticLambda4, warmup(), i3, immutableListOf);
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public void IAuthTabCallback(SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 41;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
        if (this.asBinder) {
            ByteBuffer byteBuffer = (ByteBuffer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(selectionControllerExternalSyntheticLambda2.onNavigationEvent);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60) {
                    int i5 = writeTypedList;
                    int i6 = i5 + 97;
                    ICustomTabsService_Parcel = i6 % 128;
                    if (i6 % 2 != 0) {
                        if (s2 != 0) {
                            return;
                        }
                    } else if (s2 != 1) {
                        return;
                    }
                    if (b2 == 4) {
                        if (b3 != 0) {
                            int i7 = i5 + 113;
                            ICustomTabsService_Parcel = i7 % 128;
                            int i8 = i7 % 2;
                            if (b3 != 1) {
                                return;
                            }
                        }
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        onExtraCallback((AndroidMenu_androidKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(prefetchWithMultipleUrls()), bArr);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r33 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r34 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        IAuthTabCallback(r26, r28, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        return r7.IAuthTabCallback(r31, new o.DraggableAnchorsNodeExternalSyntheticLambda0.AnonymousClass2(r21));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r1 = r21.validateRelationship.IAuthTabCallback(r31, r22, r24, warmup(), r33, r34, r21.updateVisuals);
        r7 = r21.ICustomTabsServiceStub;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (r7 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (r1 == 5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        if (r1 == 4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        r11 = o.DraggableAnchorsNodeExternalSyntheticLambda0.ICustomTabsService_Parcel + 89;
        o.DraggableAnchorsNodeExternalSyntheticLambda0.writeTypedList = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if ((r11 % 2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        r7.onExtraCallback(r31, r21.updateVisuals.onExtraCallbackWithResult());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        r7.onExtraCallback(r31, r21.updateVisuals.onExtraCallbackWithResult());
        r10.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
    
        if (r1 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        if (r1 == 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        if (r1 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r1 == 3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        if (r1 == 4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        if (r1 != 5) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        throw new java.lang.IllegalStateException(java.lang.String.valueOf(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b6, code lost:
    
        IAuthTabCallback(r26, r28, r12);
        asBinder(r21.updateVisuals.onExtraCallbackWithResult());
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c5, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c6, code lost:
    
        onNavigationEvent(r26, r28, r12);
        asBinder(r21.updateVisuals.onExtraCallbackWithResult());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d5, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d6, code lost:
    
        onWarmupCompleted((o.AndroidMenu_androidKtExternalSyntheticLambda4) o.RecordingInputConnection_androidKt.onWarmupCompleted(r26), r28, r12, r35);
        r1 = o.DraggableAnchorsNodeExternalSyntheticLambda0.writeTypedList + 125;
        o.DraggableAnchorsNodeExternalSyntheticLambda0.ICustomTabsService_Parcel = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:
    
        if ((r1 % 2) != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f6, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f9, code lost:
    
        r0 = onExtraCallback().onNavigationEvent();
        onNavigationEvent(r12, r0, r35);
        r0 = new java.lang.Object[]{r21, r26, java.lang.Integer.valueOf(r28), java.lang.Long.valueOf(r12), java.lang.Long.valueOf(r0)};
        r1 = o.getKekid.onExtraCallback();
        onExtraCallback(r0, 1076587485, o.getKekid.onExtraCallback(), o.getKekid.onExtraCallback(), r1, -1076587482, o.getKekid.onExtraCallback());
        asBinder(r21.updateVisuals.onExtraCallbackWithResult());
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r1 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        r8 = r7;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        r12 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r1 != null) goto L6;
     */
    @Override // o.AppBarKtExternalSyntheticLambda8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onWarmupCompleted(long j, long j2, @Nullable final AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4, @Nullable ByteBuffer byteBuffer, final int i2, int i3, int i4, long j3, boolean z, boolean z2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        long jUpdateVisuals;
        DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda14;
        int i5 = 2 % 2;
        int i6 = ICustomTabsService_Parcel + 121;
        writeTypedList = i6 % 128;
        if (i6 % 2 == 0) {
            jUpdateVisuals = j3 % updateVisuals();
            onTransact(j3);
            drawerKtExternalSyntheticLambda14 = this.warmup;
        } else {
            jUpdateVisuals = j3 - updateVisuals();
            onTransact(j3);
            drawerKtExternalSyntheticLambda14 = this.warmup;
        }
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public void newSession() {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 55;
        int i4 = i3 % 128;
        writeTypedList = i4;
        if (i3 % 2 != 0) {
            DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda14 = this.warmup;
            if (drawerKtExternalSyntheticLambda14 != null) {
                int i5 = i4 + 77;
                ICustomTabsService_Parcel = i5 % 128;
                int i6 = i5 % 2;
                drawerKtExternalSyntheticLambda14.asInterface();
                return;
            }
            return;
        }
        throw null;
    }

    protected long newSessionWithExtras() {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel;
        int i4 = i3 + 85;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        long j = -this.newSessionWithExtras;
        int i6 = i3 + 105;
        writeTypedList = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 33 / 0;
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onWarmupCompleted(AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4, int i2, long j, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        int i3 = 2 % 2;
        long jOnNavigationEvent = this.updateVisuals.onNavigationEvent();
        long jOnExtraCallbackWithResult = this.updateVisuals.onExtraCallbackWithResult();
        if (IPostMessageServiceStub()) {
            int i4 = ICustomTabsService_Parcel;
            int i5 = i4 + 101;
            writeTypedList = i5 % 128;
            int i6 = i5 % 2;
            if (jOnNavigationEvent != this.onUnminimized) {
                onNavigationEvent(j, jOnNavigationEvent, basicTextContextMenuProviderKtExternalSyntheticLambda4);
                onExtraCallback(androidMenu_androidKtExternalSyntheticLambda4, i2, j, jOnNavigationEvent);
            } else {
                int i7 = i4 + 17;
                writeTypedList = i7 % 128;
                if (i7 % 2 == 0) {
                    IAuthTabCallback(androidMenu_androidKtExternalSyntheticLambda4, i2, j);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                IAuthTabCallback(androidMenu_androidKtExternalSyntheticLambda4, i2, j);
            }
        }
        asBinder(jOnExtraCallbackWithResult);
        this.onUnminimized = jOnNavigationEvent;
    }

    private void onNavigationEvent(long j, long j2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        int i2 = 2 % 2;
        DrawerKtExternalSyntheticLambda0 drawerKtExternalSyntheticLambda0 = this.onActivityLayout;
        if (drawerKtExternalSyntheticLambda0 != null) {
            int i3 = ICustomTabsService_Parcel + 115;
            writeTypedList = i3 % 128;
            if (i3 % 2 == 0) {
                drawerKtExternalSyntheticLambda0.onVideoFrameAboutToBeRendered(j, j2, basicTextContextMenuProviderKtExternalSyntheticLambda4, ICustomTabsServiceStub());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            drawerKtExternalSyntheticLambda0.onVideoFrameAboutToBeRendered(j, j2, basicTextContextMenuProviderKtExternalSyntheticLambda4, ICustomTabsServiceStub());
            int i4 = ICustomTabsService_Parcel + 97;
            writeTypedList = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    protected void onNavigationEvent(long j) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 63;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult(j);
        onExtraCallback(new Object[]{this, this.IAuthTabCallbackStubProxy}, -1679734823, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 1679734824, getKekid.onExtraCallback());
        ((AppBarKtExternalSyntheticLambda8) this).onExtraCallbackWithResult.IAuthTabCallbackDefault++;
        ITrustedWebActivityCallback();
        onWarmupCompleted(j);
        int i5 = writeTypedList + 29;
        ICustomTabsService_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    private void notifyNotificationWithChannel() {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 121;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
        onVerticalScrollEvent();
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = ICustomTabsService_Parcel + 25;
        writeTypedList = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public void onWarmupCompleted(long j) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 79;
        writeTypedList = i3 % 128;
        if (i3 % 2 != 0) {
            super.onWarmupCompleted(j);
            if (!this.requestPostMessageChannel) {
                this.onTransact--;
            }
            int i4 = writeTypedList + 19;
            ICustomTabsService_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        super.onWarmupCompleted(j);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public void postMessage() {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 1;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        super.postMessage();
        DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda14 = this.warmup;
        if (drawerKtExternalSyntheticLambda14 != null) {
            int i5 = writeTypedList + 1;
            ICustomTabsService_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                drawerKtExternalSyntheticLambda14.asInterface();
                throw null;
            }
            drawerKtExternalSyntheticLambda14.asInterface();
            if (this.newSessionWithExtras == -9223372036854775807L) {
                this.newSessionWithExtras = warmup();
            }
            this.warmup.onNavigationEvent(newSessionWithExtras());
        } else {
            this.validateRelationship.IAuthTabCallback(2);
            int i6 = ICustomTabsService_Parcel + 107;
            writeTypedList = i6 % 128;
            int i7 = i6 % 2;
        }
        this.ICustomTabsCallback_Parcel = true;
        int iOnExtraCallback = getKekid.onExtraCallback();
        onExtraCallback(new Object[]{this}, 45720326, getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, -45720322, getKekid.onExtraCallback());
    }

    protected void IAuthTabCallback(AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4, int i2, long j) {
        TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1;
        int i3;
        int i4 = 2 % 2;
        int i5 = ICustomTabsService_Parcel + 75;
        writeTypedList = i5 % 128;
        if (i5 % 2 == 0) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onExtraCallback("skipVideoBuffer");
            androidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted(i2, false);
            TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onWarmupCompleted();
            textStringSimpleNodeExternalSyntheticLambda1 = ((AppBarKtExternalSyntheticLambda8) this).onExtraCallbackWithResult;
            i3 = textStringSimpleNodeExternalSyntheticLambda1.onTransact >>> 1;
        } else {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onExtraCallback("skipVideoBuffer");
            androidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted(i2, false);
            TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onWarmupCompleted();
            textStringSimpleNodeExternalSyntheticLambda1 = ((AppBarKtExternalSyntheticLambda8) this).onExtraCallbackWithResult;
            i3 = textStringSimpleNodeExternalSyntheticLambda1.onTransact + 1;
        }
        textStringSimpleNodeExternalSyntheticLambda1.onTransact = i3;
    }

    protected void onNavigationEvent(AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4, int i2, long j) {
        int i3 = 2 % 2;
        int i4 = ICustomTabsService_Parcel + 111;
        writeTypedList = i4 % 128;
        int i5 = i4 % 2;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onExtraCallback("dropVideoBuffer");
        androidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted(i2, false);
        TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onWarmupCompleted();
        IAuthTabCallback(0, 1);
        int i6 = ICustomTabsService_Parcel + 73;
        writeTypedList = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    protected boolean IAuthTabCallback(long j, boolean z) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 19;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
        int iOnExtraCallback = onExtraCallback(j);
        if (iOnExtraCallback != 0) {
            if (z) {
                TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1 = ((AppBarKtExternalSyntheticLambda8) this).onExtraCallbackWithResult;
                int i5 = textStringSimpleNodeExternalSyntheticLambda1.IAuthTabCallbackStub + iOnExtraCallback;
                textStringSimpleNodeExternalSyntheticLambda1.IAuthTabCallbackStub = i5;
                textStringSimpleNodeExternalSyntheticLambda1.onTransact += this.onTransact;
                textStringSimpleNodeExternalSyntheticLambda1.IAuthTabCallbackStub = i5 + this.writeTypedObject.size();
            } else {
                ((AppBarKtExternalSyntheticLambda8) this).onExtraCallbackWithResult.onExtraCallback++;
                IAuthTabCallback(iOnExtraCallback + this.writeTypedObject.size(), this.onTransact);
            }
            setEngagementSignalsCallback();
            DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda14 = this.warmup;
            if (drawerKtExternalSyntheticLambda14 != null) {
                drawerKtExternalSyntheticLambda14.onNavigationEvent(false);
            }
            return true;
        }
        int i6 = ICustomTabsService_Parcel + 113;
        writeTypedList = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    protected void IAuthTabCallback(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = writeTypedList + 113;
        ICustomTabsService_Parcel = i5 % 128;
        int i6 = i5 % 2;
        TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1 = ((AppBarKtExternalSyntheticLambda8) this).onExtraCallbackWithResult;
        textStringSimpleNodeExternalSyntheticLambda1.onWarmupCompleted += i2;
        int i7 = i2 + i3;
        textStringSimpleNodeExternalSyntheticLambda1.onNavigationEvent += i7;
        this.extraCallbackWithResult += i7;
        int i8 = this.IAuthTabCallback_Parcel + i7;
        this.IAuthTabCallback_Parcel = i8;
        textStringSimpleNodeExternalSyntheticLambda1.asBinder = Math.max(i8, textStringSimpleNodeExternalSyntheticLambda1.asBinder);
        int i9 = this.onRelationshipValidationResult;
        if (i9 > 0) {
            int i10 = ICustomTabsService_Parcel + 123;
            writeTypedList = i10 % 128;
            if (i10 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.extraCallbackWithResult >= i9) {
                ITrustedWebActivityCallbackDefault();
                int i11 = ICustomTabsService_Parcel + 103;
                writeTypedList = i11 % 128;
                int i12 = i11 % 2;
            }
        }
    }

    private void onTransact(long j) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 87;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        while (true) {
            Long lPeek = this.writeTypedObject.peek();
            if (lPeek == null || lPeek.longValue() >= j) {
                break;
            }
            int i5 = writeTypedList + 43;
            ICustomTabsService_Parcel = i5 % 128;
            int i6 = i5 % 2;
            i4++;
            this.writeTypedObject.poll();
        }
        IAuthTabCallback(i4, 0);
    }

    protected void asBinder(long j) {
        int i2;
        int i3 = 2 % 2;
        int i4 = ICustomTabsService_Parcel + 53;
        writeTypedList = i4 % 128;
        if (i4 % 2 == 0) {
            ((AppBarKtExternalSyntheticLambda8) this).onExtraCallbackWithResult.onExtraCallbackWithResult(j);
            this.setEngagementSignalsCallback = j | this.setEngagementSignalsCallback;
            i2 = this.receiveFile % 1;
        } else {
            ((AppBarKtExternalSyntheticLambda8) this).onExtraCallbackWithResult.onExtraCallbackWithResult(j);
            this.setEngagementSignalsCallback += j;
            i2 = this.receiveFile + 1;
        }
        this.receiveFile = i2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        DraggableAnchorsNodeExternalSyntheticLambda0 draggableAnchorsNodeExternalSyntheticLambda0 = (DraggableAnchorsNodeExternalSyntheticLambda0) objArr[0];
        AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4 = (AndroidMenu_androidKtExternalSyntheticLambda4) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        long jLongValue = ((Number) objArr[3]).longValue();
        long jLongValue2 = ((Number) objArr[4]).longValue();
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 79;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
        draggableAnchorsNodeExternalSyntheticLambda0.onExtraCallback(androidMenu_androidKtExternalSyntheticLambda4, iIntValue, jLongValue, jLongValue2);
        if (i4 == 0) {
            int i5 = 25 / 0;
        }
        int i6 = writeTypedList + 87;
        ICustomTabsService_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onExtraCallback(AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4, int i2, long j, long j2) {
        int i3 = 2 % 2;
        int i4 = ICustomTabsService_Parcel + 37;
        writeTypedList = i4 % 128;
        if (i4 % 2 == 0) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onExtraCallback("releaseOutputBuffer");
            androidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted(i2, j2);
            TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onWarmupCompleted();
            TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1 = ((AppBarKtExternalSyntheticLambda8) this).onExtraCallbackWithResult;
            textStringSimpleNodeExternalSyntheticLambda1.IAuthTabCallbackDefault = textStringSimpleNodeExternalSyntheticLambda1.IAuthTabCallbackDefault;
            this.IAuthTabCallback_Parcel = 0;
            if (this.warmup == null) {
                onExtraCallback(new Object[]{this, this.IAuthTabCallbackStubProxy}, -1679734823, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), 1679734824, getKekid.onExtraCallback());
                ITrustedWebActivityCallback();
            }
        } else {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onExtraCallback("releaseOutputBuffer");
            androidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted(i2, j2);
            TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onWarmupCompleted();
            ((AppBarKtExternalSyntheticLambda8) this).onExtraCallbackWithResult.IAuthTabCallbackDefault++;
            this.IAuthTabCallback_Parcel = 0;
            if (this.warmup == null) {
            }
        }
        int i5 = writeTypedList + 21;
        ICustomTabsService_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean onExtraCallback(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel;
        int i4 = i3 + 87;
        writeTypedList = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            if (this.warmup == null) {
                int i5 = i3 + 11;
                writeTypedList = i5 % 128;
                int i6 = i5 % 2;
                Surface surface = this.ICustomTabsCallback;
                if (surface != null) {
                    int i7 = i3 + 57;
                    writeTypedList = i7 % 128;
                    if (i7 % 2 == 0) {
                        surface.isValid();
                        obj.hashCode();
                        throw null;
                    }
                    if (!surface.isValid()) {
                        if (!IAuthTabCallback(appBarKtExternalSyntheticLambda5)) {
                            int i8 = ICustomTabsService_Parcel + 41;
                            writeTypedList = i8 % 128;
                            if (i8 % 2 == 0) {
                                onNavigationEvent(appBarKtExternalSyntheticLambda5);
                                throw null;
                            }
                            if (!onNavigationEvent(appBarKtExternalSyntheticLambda5)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        DraggableAnchorsNodeExternalSyntheticLambda0 draggableAnchorsNodeExternalSyntheticLambda0 = (DraggableAnchorsNodeExternalSyntheticLambda0) objArr[0];
        AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5 = (AppBarKtExternalSyntheticLambda5) objArr[1];
        int i2 = 2 % 2;
        DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda14 = draggableAnchorsNodeExternalSyntheticLambda0.warmup;
        if (drawerKtExternalSyntheticLambda14 != null) {
            int i3 = writeTypedList + 29;
            ICustomTabsService_Parcel = i3 % 128;
            int i4 = i3 % 2;
            return drawerKtExternalSyntheticLambda14.IAuthTabCallback();
        }
        Surface surface = draggableAnchorsNodeExternalSyntheticLambda0.ICustomTabsCallback;
        Object obj = null;
        if (surface != null) {
            int i5 = ICustomTabsService_Parcel + 115;
            writeTypedList = i5 % 128;
            if (i5 % 2 != 0) {
                return surface;
            }
            obj.hashCode();
            throw null;
        }
        if (draggableAnchorsNodeExternalSyntheticLambda0.IAuthTabCallback(appBarKtExternalSyntheticLambda5)) {
            return null;
        }
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(draggableAnchorsNodeExternalSyntheticLambda0.onNavigationEvent(appBarKtExternalSyntheticLambda5));
        DismissStateCompanionExternalSyntheticLambda0 dismissStateCompanionExternalSyntheticLambda0 = draggableAnchorsNodeExternalSyntheticLambda0.mayLaunchUrl;
        if (dismissStateCompanionExternalSyntheticLambda0 != null && dismissStateCompanionExternalSyntheticLambda0.onNavigationEvent != appBarKtExternalSyntheticLambda5.asInterface) {
            draggableAnchorsNodeExternalSyntheticLambda0.getSmallIconBitmap();
        }
        if (draggableAnchorsNodeExternalSyntheticLambda0.mayLaunchUrl == null) {
            int i6 = writeTypedList + 125;
            ICustomTabsService_Parcel = i6 % 128;
            int i7 = i6 % 2;
            draggableAnchorsNodeExternalSyntheticLambda0.mayLaunchUrl = DismissStateCompanionExternalSyntheticLambda0.onWarmupCompleted(draggableAnchorsNodeExternalSyntheticLambda0.access000, appBarKtExternalSyntheticLambda5.asInterface);
        }
        return draggableAnchorsNodeExternalSyntheticLambda0.mayLaunchUrl;
    }

    protected boolean IAuthTabCallback(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 41;
        writeTypedList = i3 % 128;
        if (i3 % 2 == 0) {
            if (Build.VERSION.SDK_INT < 16) {
                return false;
            }
        } else if (Build.VERSION.SDK_INT < 35) {
            return false;
        }
        if (!appBarKtExternalSyntheticLambda5.onExtraCallbackWithResult) {
            return false;
        }
        int i4 = writeTypedList + 11;
        int i5 = i4 % 128;
        ICustomTabsService_Parcel = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 87;
        writeTypedList = i7 % 128;
        if (i7 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected boolean onNavigationEvent(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5) {
        int i2 = 2 % 2;
        Object obj = null;
        if (!this.requestPostMessageChannel) {
            int i3 = writeTypedList + 47;
            ICustomTabsService_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                onExtraCallbackWithResult(appBarKtExternalSyntheticLambda5.IAuthTabCallbackStub);
                throw null;
            }
            if (!onExtraCallbackWithResult(appBarKtExternalSyntheticLambda5.IAuthTabCallbackStub) && (!appBarKtExternalSyntheticLambda5.asInterface || DismissStateCompanionExternalSyntheticLambda0.onExtraCallback(this.access000))) {
                return true;
            }
        }
        int i4 = writeTypedList + 123;
        ICustomTabsService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    private void getSmallIconBitmap() {
        int i2 = 2 % 2;
        int i3 = writeTypedList;
        int i4 = i3 + 25;
        ICustomTabsService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        DismissStateCompanionExternalSyntheticLambda0 dismissStateCompanionExternalSyntheticLambda0 = this.mayLaunchUrl;
        if (dismissStateCompanionExternalSyntheticLambda0 != null) {
            int i6 = i3 + 61;
            ICustomTabsService_Parcel = i6 % 128;
            int i7 = i6 % 2;
            dismissStateCompanionExternalSyntheticLambda0.release();
            this.mayLaunchUrl = null;
            int i8 = writeTypedList + 97;
            ICustomTabsService_Parcel = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = writeTypedList + 77;
        ICustomTabsService_Parcel = i10 % 128;
        int i11 = i10 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        DraggableAnchorsNodeExternalSyntheticLambda0 draggableAnchorsNodeExternalSyntheticLambda0 = (DraggableAnchorsNodeExternalSyntheticLambda0) objArr[0];
        int i2 = 2 % 2;
        if (!draggableAnchorsNodeExternalSyntheticLambda0.requestPostMessageChannel) {
            return null;
        }
        int i3 = writeTypedList + 71;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = Build.VERSION.SDK_INT;
        AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4PrefetchWithMultipleUrls = draggableAnchorsNodeExternalSyntheticLambda0.prefetchWithMultipleUrls();
        if (androidMenu_androidKtExternalSyntheticLambda4PrefetchWithMultipleUrls == null) {
            return null;
        }
        draggableAnchorsNodeExternalSyntheticLambda0.onWarmupCompleted = draggableAnchorsNodeExternalSyntheticLambda0.new onExtraCallback(androidMenu_androidKtExternalSyntheticLambda4PrefetchWithMultipleUrls);
        if (i5 < 33) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("tunnel-peek", 1);
        androidMenu_androidKtExternalSyntheticLambda4PrefetchWithMultipleUrls.onExtraCallbackWithResult(bundle);
        int i6 = writeTypedList + 59;
        ICustomTabsService_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        DraggableAnchorsNodeExternalSyntheticLambda0 draggableAnchorsNodeExternalSyntheticLambda0 = (DraggableAnchorsNodeExternalSyntheticLambda0) objArr[0];
        int i2 = 2 % 2;
        AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4PrefetchWithMultipleUrls = draggableAnchorsNodeExternalSyntheticLambda0.prefetchWithMultipleUrls();
        if (androidMenu_androidKtExternalSyntheticLambda4PrefetchWithMultipleUrls != null) {
            int i3 = ICustomTabsService_Parcel + 87;
            writeTypedList = i3 % 128;
            int i4 = i3 % 2;
            if (Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -draggableAnchorsNodeExternalSyntheticLambda0.newAuthTabSession));
                androidMenu_androidKtExternalSyntheticLambda4PrefetchWithMultipleUrls.onExtraCallbackWithResult(bundle);
            }
        }
        int i5 = writeTypedList + 103;
        ICustomTabsService_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private void ITrustedWebActivityCallback() {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 123;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        if ((!this.validateRelationship.onNavigationEvent()) || this.ICustomTabsCallback == null) {
            return;
        }
        onExtraCallback(new Object[]{this}, 712298389, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), -712298383, getKekid.onExtraCallback());
        int i5 = writeTypedList + 53;
        ICustomTabsService_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        DraggableAnchorsNodeExternalSyntheticLambda0 draggableAnchorsNodeExternalSyntheticLambda0 = (DraggableAnchorsNodeExternalSyntheticLambda0) objArr[0];
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 37;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
        draggableAnchorsNodeExternalSyntheticLambda0.onActivityResized.IAuthTabCallback(draggableAnchorsNodeExternalSyntheticLambda0.ICustomTabsCallback);
        draggableAnchorsNodeExternalSyntheticLambda0.onPostMessage = true;
        int i5 = ICustomTabsService_Parcel + 31;
        writeTypedList = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private void ITrustedWebActivityCallback_Parcel() {
        int i2 = 2 % 2;
        Surface surface = this.ICustomTabsCallback;
        if (surface != null && this.onPostMessage) {
            int i3 = ICustomTabsService_Parcel + 49;
            writeTypedList = i3 % 128;
            int i4 = i3 % 2;
            this.onActivityResized.IAuthTabCallback(surface);
        }
        int i5 = ICustomTabsService_Parcel + 9;
        writeTypedList = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        DraggableAnchorsNodeExternalSyntheticLambda0 draggableAnchorsNodeExternalSyntheticLambda0 = (DraggableAnchorsNodeExternalSyntheticLambda0) objArr[0];
        CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 = (CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0) objArr[1];
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 65;
        writeTypedList = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 56 / 0;
            if (!cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0.equals(CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0.onExtraCallbackWithResult)) {
                if (!cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0.equals(draggableAnchorsNodeExternalSyntheticLambda0.newSession)) {
                    int i5 = ICustomTabsService_Parcel + 33;
                    writeTypedList = i5 % 128;
                    int i6 = i5 % 2;
                    draggableAnchorsNodeExternalSyntheticLambda0.newSession = cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0;
                    draggableAnchorsNodeExternalSyntheticLambda0.onActivityResized.onWarmupCompleted(cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0);
                }
            }
        } else if (!cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0.equals(CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0.onExtraCallbackWithResult)) {
        }
        int i7 = writeTypedList + 101;
        ICustomTabsService_Parcel = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private void areNotificationsEnabled() {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel;
        int i4 = i3 + 77;
        writeTypedList = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 = this.newSession;
            if (cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 != null) {
                int i5 = i3 + 97;
                writeTypedList = i5 % 128;
                if (i5 % 2 == 0) {
                    this.onActivityResized.onWarmupCompleted(cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0);
                    obj.hashCode();
                    throw null;
                }
                this.onActivityResized.onWarmupCompleted(cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0);
                int i6 = ICustomTabsService_Parcel + 89;
                writeTypedList = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            return;
        }
        throw null;
    }

    private void ITrustedWebActivityCallbackDefault() {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 57;
        int i4 = i3 % 128;
        writeTypedList = i4;
        int i5 = i3 % 2;
        if (this.extraCallbackWithResult > 0) {
            int i6 = i4 + 93;
            ICustomTabsService_Parcel = i6 % 128;
            int i7 = i6 % 2;
            long jIAuthTabCallback = onExtraCallback().IAuthTabCallback();
            this.onActivityResized.onNavigationEvent(this.extraCallbackWithResult, jIAuthTabCallback - this.readTypedObject);
            this.extraCallbackWithResult = 0;
            this.readTypedObject = jIAuthTabCallback;
            int i8 = ICustomTabsService_Parcel + 9;
            writeTypedList = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    private void ITrustedWebActivityService() {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 47;
        int i4 = i3 % 128;
        writeTypedList = i4;
        int i5 = i3 % 2;
        int i6 = this.receiveFile;
        if (i6 != 0) {
            int i7 = i4 + 41;
            ICustomTabsService_Parcel = i7 % 128;
            int i8 = i7 % 2;
            this.onActivityResized.onExtraCallback(this.setEngagementSignalsCallback, i6);
            this.setEngagementSignalsCallback = 0L;
            this.receiveFile = 0;
        }
    }

    private static void onExtraCallback(AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4, byte[] bArr) {
        int i2 = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        androidMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(bundle);
        int i3 = ICustomTabsService_Parcel + 123;
        writeTypedList = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private void IAuthTabCallback(AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4, @Nullable Surface surface) {
        int i2 = 2 % 2;
        int i3 = Build.VERSION.SDK_INT;
        if (surface == null) {
            if (i3 < 35) {
                throw new IllegalStateException();
            }
            IAuthTabCallback(androidMenu_androidKtExternalSyntheticLambda4);
            return;
        }
        int i4 = writeTypedList + 9;
        ICustomTabsService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            onExtraCallback(androidMenu_androidKtExternalSyntheticLambda4, surface);
            int i5 = 39 / 0;
        } else {
            onExtraCallback(androidMenu_androidKtExternalSyntheticLambda4, surface);
        }
        int i6 = writeTypedList + 45;
        ICustomTabsService_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 7 / 0;
        }
    }

    protected void onExtraCallback(AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4, Surface surface) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 25;
        writeTypedList = i3 % 128;
        int i4 = i3 % 2;
        androidMenu_androidKtExternalSyntheticLambda4.onExtraCallback(surface);
        int i5 = writeTypedList + 65;
        ICustomTabsService_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
    }

    protected void IAuthTabCallback(AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4) {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 91;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        androidMenu_androidKtExternalSyntheticLambda4.IAuthTabCallback();
        int i5 = writeTypedList + 35;
        ICustomTabsService_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0067 A[PHI: r1
      0x0067: PHI (r1v12 android.util.Pair<java.lang.Integer, java.lang.Integer>) = 
      (r1v11 android.util.Pair<java.lang.Integer, java.lang.Integer>)
      (r1v16 android.util.Pair<java.lang.Integer, java.lang.Integer>)
     binds: [B:10:0x0065, B:7:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected MediaFormat onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, String str, IAuthTabCallback iAuthTabCallback, float f, boolean z, int i2) throws Throwable {
        Pair<Integer, Integer> pairOnNavigationEvent;
        int i3 = 2 % 2;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetchWithMultipleUrls);
        mediaFormat.setInteger("height", basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback);
        TextFieldDecoratorModifierNodeExternalSyntheticLambda22.onNavigationEvent(mediaFormat, (List<byte[]>) basicTextContextMenuProviderKtExternalSyntheticLambda4.onMessageChannelReady);
        TextFieldDecoratorModifierNodeExternalSyntheticLambda22.onExtraCallback(mediaFormat, "frame-rate", basicTextContextMenuProviderKtExternalSyntheticLambda4.writeTypedObject);
        TextFieldDecoratorModifierNodeExternalSyntheticLambda22.onWarmupCompleted(mediaFormat, "rotation-degrees", basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsService);
        TextFieldDecoratorModifierNodeExternalSyntheticLambda22.onNavigationEvent(mediaFormat, basicTextContextMenuProviderKtExternalSyntheticLambda4.onTransact);
        if (!(!"video/dolby-vision".equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable))) {
            int i4 = ICustomTabsService_Parcel + 61;
            writeTypedList = i4 % 128;
            if (i4 % 2 == 0) {
                pairOnNavigationEvent = AppBarKtExternalSyntheticLambda9.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4);
                int i5 = 46 / 0;
                if (pairOnNavigationEvent != null) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda22.onWarmupCompleted(mediaFormat, "profile", ((Integer) pairOnNavigationEvent.first).intValue());
                }
            } else {
                pairOnNavigationEvent = AppBarKtExternalSyntheticLambda9.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4);
                if (pairOnNavigationEvent != null) {
                }
            }
        }
        mediaFormat.setInteger("max-width", iAuthTabCallback.onWarmupCompleted);
        mediaFormat.setInteger("max-height", iAuthTabCallback.IAuthTabCallback);
        TextFieldDecoratorModifierNodeExternalSyntheticLambda22.onWarmupCompleted(mediaFormat, "max-input-size", iAuthTabCallback.onExtraCallback);
        int i6 = Build.VERSION.SDK_INT;
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0') + 9, Process.getGidForName("") + 3, new char[]{2, 0, '\t', 4, 65529, 2, 65535, 65529}, true, 280 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
        mediaFormat.setInteger(((String) objArr[0]).intern(), 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i2 != 0) {
            int i7 = writeTypedList + 81;
            ICustomTabsService_Parcel = i7 % 128;
            int i8 = i7 % 2;
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i2);
        }
        if (i6 >= 35) {
            int i9 = writeTypedList + 115;
            ICustomTabsService_Parcel = i9 % 128;
            int i10 = i9 % 2;
            mediaFormat.setInteger("importance", Math.max(0, -this.newAuthTabSession));
        }
        return mediaFormat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        r0 = onExtraCallbackWithResult(r17, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r0 == (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        r1 = o.DraggableAnchorsNodeExternalSyntheticLambda0.ICustomTabsService_Parcel + 33;
        o.DraggableAnchorsNodeExternalSyntheticLambda0.writeTypedList = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if ((r1 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        r1 = r8 - 1.5f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r8 = java.lang.Math.min((int) r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        r1 = r8 * 1.5f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        return new o.DraggableAnchorsNodeExternalSyntheticLambda0.IAuthTabCallback(r4, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        r9 = r19.length;
        r10 = o.DraggableAnchorsNodeExternalSyntheticLambda0.writeTypedList + 55;
        o.DraggableAnchorsNodeExternalSyntheticLambda0.ICustomTabsService_Parcel = r10 % 128;
        r10 = r10 % 2;
        r11 = 0;
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r11 >= r9) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        r13 = r19[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (r18.onTransact == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        r14 = o.DraggableAnchorsNodeExternalSyntheticLambda0.writeTypedList + 53;
        o.DraggableAnchorsNodeExternalSyntheticLambda0.ICustomTabsService_Parcel = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        if (r13.onTransact != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        r13 = r13.onExtraCallback().onExtraCallback(r18.onTransact).onNavigationEvent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (r17.onNavigationEvent(r18, r13).IAuthTabCallback == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        r14 = o.DraggableAnchorsNodeExternalSyntheticLambda0.ICustomTabsService_Parcel + 119;
        o.DraggableAnchorsNodeExternalSyntheticLambda0.writeTypedList = r14 % 128;
        r14 = r14 % 2;
        r14 = r13.prefetchWithMultipleUrls;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        if (r14 == (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
    
        if (r13.ICustomTabsCallback == (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        r12 = r12 | r15;
        r4 = java.lang.Math.max(r4, r14);
        r7 = java.lang.Math.max(r7, r13.ICustomTabsCallback);
        r8 = java.lang.Math.max(r8, onWarmupCompleted(r17, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
    
        if (r12 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b8, code lost:
    
        o.TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + r4 + "x" + r7);
        r2 = IAuthTabCallback(r17, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
    
        if (r2 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00dc, code lost:
    
        r4 = java.lang.Math.max(r4, r2.x);
        r7 = java.lang.Math.max(r7, r2.y);
        r8 = java.lang.Math.max(r8, onExtraCallbackWithResult(r17, r18.onExtraCallback().onActivityLayout(r4).access100(r7).onNavigationEvent()));
        o.TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + r4 + "x" + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011f, code lost:
    
        return new o.DraggableAnchorsNodeExternalSyntheticLambda0.IAuthTabCallback(r4, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r19.length == 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r19.length == 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (r8 == (-1)) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected IAuthTabCallback onNavigationEvent(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr) {
        int iMax;
        int iMax2;
        int iOnWarmupCompleted;
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 17;
        writeTypedList = i3 % 128;
        if (i3 % 2 == 0) {
            iMax = basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetchWithMultipleUrls;
            iMax2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback;
            iOnWarmupCompleted = onWarmupCompleted(appBarKtExternalSyntheticLambda5, basicTextContextMenuProviderKtExternalSyntheticLambda4);
        } else {
            iMax = basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetchWithMultipleUrls;
            iMax2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback;
            iOnWarmupCompleted = onWarmupCompleted(appBarKtExternalSyntheticLambda5, basicTextContextMenuProviderKtExternalSyntheticLambda4);
        }
    }

    @Override // o.AppBarKtExternalSyntheticLambda8
    public AppBarKtExternalSyntheticLambda10 onWarmupCompleted(Throwable th, @Nullable AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5) {
        int i2 = 2 % 2;
        DividerKtExternalSyntheticLambda0 dividerKtExternalSyntheticLambda0 = new DividerKtExternalSyntheticLambda0(th, appBarKtExternalSyntheticLambda5, this.ICustomTabsCallback);
        int i3 = writeTypedList + 1;
        ICustomTabsService_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return dividerKtExternalSyntheticLambda0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Point IAuthTabCallback(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = writeTypedList + 3;
        ICustomTabsService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            int i5 = basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback;
            int i6 = basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetchWithMultipleUrls;
            obj.hashCode();
            throw null;
        }
        int i7 = basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback;
        int i8 = basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetchWithMultipleUrls;
        int i9 = 0;
        boolean z2 = i7 > i8;
        int i10 = z2 ^ true ? i8 : i7;
        if (z2) {
            i7 = i8;
        }
        float f = i7 / i10;
        int[] iArr = IAuthTabCallback;
        int length = iArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = iArr[i11];
            int i13 = (int) (i12 * f);
            if (i12 <= i10 || i13 <= i7) {
                return null;
            }
            int i14 = ICustomTabsService_Parcel;
            int i15 = i14 + 117;
            writeTypedList = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 94 / i9;
                if (z2) {
                    int i17 = i14 + 105;
                    writeTypedList = i17 % 128;
                    int i18 = i17 % 2;
                    i2 = i13;
                } else {
                    i2 = i12;
                }
            } else if (z2) {
            }
            if (!z2) {
                int i19 = writeTypedList + 19;
                ICustomTabsService_Parcel = i19 % 128;
                int i20 = i19 % 2;
                i12 = i13;
            }
            Point pointOnExtraCallbackWithResult = appBarKtExternalSyntheticLambda5.onExtraCallbackWithResult(i2, i12);
            float f2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.writeTypedObject;
            if (pointOnExtraCallbackWithResult != null) {
                int i21 = ICustomTabsService_Parcel + 31;
                writeTypedList = i21 % 128;
                if (i21 % 2 == 0) {
                    appBarKtExternalSyntheticLambda5.onExtraCallback(pointOnExtraCallbackWithResult.x, pointOnExtraCallbackWithResult.y, f2);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                z = z2;
                if (appBarKtExternalSyntheticLambda5.onExtraCallback(pointOnExtraCallbackWithResult.x, pointOnExtraCallbackWithResult.y, f2)) {
                    return pointOnExtraCallbackWithResult;
                }
            } else {
                z = z2;
            }
            i11++;
            int i22 = writeTypedList + 33;
            ICustomTabsService_Parcel = i22 % 128;
            int i23 = i22 % 2;
            z2 = z;
            i9 = 0;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r3 >= r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r0 = r0 + ((byte[]) r6.onMessageChannelReady.get(r3)).length;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        return r6.onPostMessage + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        r5 = onExtraCallbackWithResult(r5, r6);
        r6 = o.DraggableAnchorsNodeExternalSyntheticLambda0.writeTypedList + 61;
        o.DraggableAnchorsNodeExternalSyntheticLambda0.ICustomTabsService_Parcel = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r6.onPostMessage != (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r6.onPostMessage != (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r5 = r6.onMessageChannelReady.size();
        r0 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static int onWarmupCompleted(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 79;
        writeTypedList = i3 % 128;
        int i4 = 0;
        if (i3 % 2 == 0) {
            int i5 = 74 / 0;
        }
    }

    private static boolean IPostMessageService_Parcel() {
        int i2 = 2 % 2;
        int i3 = writeTypedList + 107;
        ICustomTabsService_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return "NVIDIA".equals(Build.MANUFACTURER);
        }
        int i4 = 9 / 0;
        return "NVIDIA".equals(Build.MANUFACTURER);
    }

    protected boolean onExtraCallbackWithResult(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (DraggableAnchorsNodeExternalSyntheticLambda0.class) {
            if (!onExtraCallback) {
                onNavigationEvent = ITrustedWebActivityCallbackStub();
                onExtraCallback = true;
            }
        }
        return onNavigationEvent;
    }

    protected static final class IAuthTabCallback {
        public final int IAuthTabCallback;
        public final int onExtraCallback;
        public final int onWarmupCompleted;

        public IAuthTabCallback(int i2, int i3, int i4) {
            this.onWarmupCompleted = i2;
            this.IAuthTabCallback = i3;
            this.onExtraCallback = i4;
        }
    }

    private static int onExtraCallback(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = writeTypedList + 93;
        int i6 = i5 % 128;
        ICustomTabsService_Parcel = i6;
        int i7 = i5 % 2;
        int i8 = (i2 * 3) / (i3 << 1);
        int i9 = i6 + 125;
        writeTypedList = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 13 / 0;
        }
        return i8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:137:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ITrustedWebActivityCallbackStub() {
        boolean z;
        boolean z2;
        char c = 2;
        int i2 = 2 % 2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 <= 28) {
            String str = Build.DEVICE;
            switch (str.hashCode()) {
                case -1339091551:
                    if (!str.equals("dangal")) {
                        z2 = -1;
                        break;
                    } else {
                        z2 = false;
                        break;
                    }
                case -1220081023:
                    if (str.equals("dangalFHD")) {
                        z2 = true;
                        break;
                    }
                    break;
                case -1220066608:
                    if (str.equals("dangalUHD")) {
                        z2 = 2;
                        break;
                    }
                    break;
                case -1012436106:
                    if (str.equals("oneday")) {
                        z2 = 3;
                        break;
                    }
                    break;
                case -760312546:
                    if (str.equals("aquaman")) {
                        int i4 = ICustomTabsService_Parcel + 29;
                        writeTypedList = i4 % 128;
                        int i5 = i4 % 2;
                        z2 = 4;
                        break;
                    }
                    break;
                case -64886864:
                    if (str.equals("magnolia")) {
                        z2 = 5;
                        break;
                    }
                    break;
                case 3415681:
                    if (str.equals("once")) {
                        z2 = 6;
                        break;
                    }
                    break;
                case 825323514:
                    if (str.equals("machuca")) {
                        z2 = 7;
                        break;
                    }
                    break;
            }
            switch (z2) {
            }
            return true;
        }
        if (i3 <= 27 && "HWEML".equals(Build.DEVICE)) {
            return true;
        }
        String str2 = Build.MODEL;
        switch (str2.hashCode()) {
            case -349662828:
                if (!str2.equals("AFTJMST12")) {
                    z = -1;
                    break;
                } else {
                    z = false;
                    break;
                }
            case -321033677:
                if (str2.equals("AFTKMST12")) {
                    z = true;
                    break;
                }
                break;
            case 2006354:
                if (str2.equals("AFTA")) {
                    z = 2;
                    break;
                }
                break;
            case 2006367:
                if (str2.equals("AFTN")) {
                    z = 3;
                    break;
                }
                break;
            case 2006371:
                if (str2.equals("AFTR")) {
                    z = 4;
                    break;
                }
                break;
            case 1785421873:
                if (!(!str2.equals("AFTEU011"))) {
                    z = 5;
                    break;
                }
                break;
            case 1785421876:
                if (str2.equals("AFTEU014")) {
                    z = 6;
                    break;
                }
                break;
            case 1798172390:
                if (str2.equals("AFTSO001")) {
                    z = 7;
                    break;
                }
                break;
            case 2119412532:
                if (str2.equals("AFTEUFF014")) {
                    z = 8;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
                break;
            default:
                if (i3 <= 26) {
                    String str3 = Build.DEVICE;
                    switch (str3.hashCode()) {
                        case -2144781245:
                            if (!str3.equals("GIONEE_SWW1609")) {
                                c = 65535;
                                break;
                            } else {
                                int i6 = ICustomTabsService_Parcel + 37;
                                writeTypedList = i6 % 128;
                                int i7 = i6 % 2;
                                c = 0;
                                break;
                            }
                        case -2144781185:
                            if (str3.equals("GIONEE_SWW1627")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -2144781160:
                            if (!str3.equals("GIONEE_SWW1631")) {
                            }
                            break;
                        case -2097309513:
                            if (str3.equals("K50a40")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -2022874474:
                            if (str3.equals("CP8676_I02")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -1978993182:
                            if (str3.equals("NX541J")) {
                                c = 5;
                                break;
                            }
                            break;
                        case -1978990237:
                            if (str3.equals("NX573J")) {
                                c = 6;
                                break;
                            }
                            break;
                        case -1936688988:
                            if (str3.equals("PGN528")) {
                                c = 7;
                                break;
                            }
                            break;
                        case -1936688066:
                            if (str3.equals("PGN610")) {
                                int i8 = writeTypedList + 83;
                                ICustomTabsService_Parcel = i8 % 128;
                                if (i8 % 2 == 0) {
                                    c = '\b';
                                    break;
                                } else {
                                    c = '[';
                                    break;
                                }
                            }
                            break;
                        case -1936688065:
                            if (str3.equals("PGN611")) {
                                c = '\t';
                                break;
                            }
                            break;
                        case -1931988508:
                            if (str3.equals("AquaPowerM")) {
                                c = '\n';
                                break;
                            }
                            break;
                        case -1885099851:
                            if (str3.equals("RAIJIN")) {
                                c = 11;
                                break;
                            }
                            break;
                        case -1696512866:
                            if (str3.equals("XT1663")) {
                                c = '\f';
                                break;
                            }
                            break;
                        case -1680025915:
                            if (str3.equals("ComioS1")) {
                                c = '\r';
                                break;
                            }
                            break;
                        case -1615810839:
                            if (str3.equals("Phantom6")) {
                                c = 14;
                                break;
                            }
                            break;
                        case -1600724499:
                            if (str3.equals("pacificrim")) {
                                c = 15;
                                break;
                            }
                            break;
                        case -1554255044:
                            if (str3.equals("vernee_M5")) {
                                c = 16;
                                break;
                            }
                            break;
                        case -1481772737:
                            if (str3.equals("panell_dl")) {
                                c = 17;
                                break;
                            }
                            break;
                        case -1481772730:
                            if (str3.equals("panell_ds")) {
                                c = 18;
                                break;
                            }
                            break;
                        case -1481772729:
                            if (str3.equals("panell_dt")) {
                                c = 19;
                                break;
                            }
                            break;
                        case -1320080169:
                            if (str3.equals("GiONEE_GBL7319")) {
                                c = 20;
                                break;
                            }
                            break;
                        case -1217592143:
                            if (str3.equals("BRAVIA_ATV2")) {
                                c = 21;
                                break;
                            }
                            break;
                        case -1180384755:
                            if (str3.equals("iris60")) {
                                c = 22;
                                break;
                            }
                            break;
                        case -1139198265:
                            if (str3.equals("Slate_Pro")) {
                                c = 23;
                                break;
                            }
                            break;
                        case -1052835013:
                            if (str3.equals("namath")) {
                                c = 24;
                                break;
                            }
                            break;
                        case -993250464:
                            if (str3.equals("A10-70F")) {
                                int i9 = writeTypedList + 9;
                                ICustomTabsService_Parcel = i9 % 128;
                                int i10 = i9 % 2;
                                c = 25;
                                break;
                            }
                            break;
                        case -993250458:
                            if (str3.equals("A10-70L")) {
                                c = 26;
                                break;
                            }
                            break;
                        case -965403638:
                            if (str3.equals("s905x018")) {
                                c = 27;
                                break;
                            }
                            break;
                        case -958336948:
                            if (str3.equals("ELUGA_Ray_X")) {
                                c = 28;
                                break;
                            }
                            break;
                        case -879245230:
                            if (str3.equals("tcl_eu")) {
                                c = 29;
                                break;
                            }
                            break;
                        case -842500323:
                            if (str3.equals("nicklaus_f")) {
                                c = 30;
                                break;
                            }
                            break;
                        case -821392978:
                            if (str3.equals("A7000-a")) {
                                c = 31;
                                break;
                            }
                            break;
                        case -797483286:
                            if (str3.equals("SVP-DTV15")) {
                                c = ' ';
                                break;
                            }
                            break;
                        case -794946968:
                            if (str3.equals("watson")) {
                                c = '!';
                                break;
                            }
                            break;
                        case -788334647:
                            if (str3.equals("whyred")) {
                                c = '\"';
                                break;
                            }
                            break;
                        case -782144577:
                            if (str3.equals("OnePlus5T")) {
                                c = '#';
                                break;
                            }
                            break;
                        case -575125681:
                            if (str3.equals("GiONEE_CBL7513")) {
                                c = '$';
                                break;
                            }
                            break;
                        case -521118391:
                            if (str3.equals("GIONEE_GBL7360")) {
                                c = '%';
                                break;
                            }
                            break;
                        case -430914369:
                            if (str3.equals("Pixi4-7_3G")) {
                                c = '&';
                                break;
                            }
                            break;
                        case -290434366:
                            if (str3.equals("taido_row")) {
                                c = '\'';
                                break;
                            }
                            break;
                        case -282781963:
                            if (str3.equals("BLACK-1X")) {
                                c = '(';
                                break;
                            }
                            break;
                        case -277133239:
                            if (str3.equals("Z12_PRO")) {
                                c = ')';
                                break;
                            }
                            break;
                        case -173639913:
                            if (str3.equals("ELUGA_A3_Pro")) {
                                c = '*';
                                break;
                            }
                            break;
                        case -56598463:
                            if (str3.equals("woods_fn")) {
                                c = '+';
                                break;
                            }
                            break;
                        case 2126:
                            if (str3.equals("C1")) {
                                c = ',';
                                break;
                            }
                            break;
                        case 2564:
                            if (str3.equals("Q5")) {
                                c = '-';
                                break;
                            }
                            break;
                        case 2715:
                            if (str3.equals("V1")) {
                                c = '.';
                                break;
                            }
                            break;
                        case 2719:
                            if (str3.equals("V5")) {
                                c = '/';
                                break;
                            }
                            break;
                        case 3091:
                            if (str3.equals("b5")) {
                                c = '0';
                                break;
                            }
                            break;
                        case 3483:
                            if (str3.equals("mh")) {
                                c = '1';
                                break;
                            }
                            break;
                        case 73405:
                            if (!(!str3.equals("JGZ"))) {
                                int i11 = writeTypedList + 109;
                                ICustomTabsService_Parcel = i11 % 128;
                                if (i11 % 2 == 0) {
                                    c = '2';
                                    break;
                                } else {
                                    c = 'x';
                                    break;
                                }
                            }
                            break;
                        case 75537:
                            if (str3.equals("M04")) {
                                int i12 = ICustomTabsService_Parcel + 37;
                                writeTypedList = i12 % 128;
                                int i13 = i12 % 2;
                                c = '3';
                                break;
                            }
                            break;
                        case 75739:
                            if (str3.equals("M5c")) {
                                c = '4';
                                break;
                            }
                            break;
                        case 76779:
                            if (!(!str3.equals("MX6"))) {
                                c = '5';
                                break;
                            }
                            break;
                        case 78669:
                            if (str3.equals("P85")) {
                                c = '6';
                                break;
                            }
                            break;
                        case 79305:
                            if (str3.equals("PLE")) {
                                c = '7';
                                break;
                            }
                            break;
                        case 80618:
                            if (str3.equals("QX1")) {
                                c = '8';
                                break;
                            }
                            break;
                        case 88274:
                            if (str3.equals("Z80")) {
                                c = '9';
                                break;
                            }
                            break;
                        case 98846:
                            if (str3.equals("cv1")) {
                                c = ':';
                                break;
                            }
                            break;
                        case 98848:
                            if (str3.equals("cv3")) {
                                c = ';';
                                break;
                            }
                            break;
                        case 99329:
                            if (str3.equals("deb")) {
                                c = '<';
                                break;
                            }
                            break;
                        case 101481:
                            if (str3.equals("flo")) {
                                c = '=';
                                break;
                            }
                            break;
                        case 1513190:
                            if (str3.equals("1601")) {
                                c = '>';
                                break;
                            }
                            break;
                        case 1514184:
                            if (str3.equals("1713")) {
                                c = '?';
                                break;
                            }
                            break;
                        case 1514185:
                            if (str3.equals("1714")) {
                                int i14 = writeTypedList + 61;
                                ICustomTabsService_Parcel = i14 % 128;
                                if (i14 % 2 == 0) {
                                    c = '@';
                                    break;
                                } else {
                                    c = 'f';
                                    break;
                                }
                            }
                            break;
                        case 2133089:
                            if (str3.equals("F01H")) {
                                c = 'A';
                                break;
                            }
                            break;
                        case 2133091:
                            if (str3.equals("F01J")) {
                                c = 'B';
                                break;
                            }
                            break;
                        case 2133120:
                            if (str3.equals("F02H")) {
                                c = 'C';
                                break;
                            }
                            break;
                        case 2133151:
                            if (str3.equals("F03H")) {
                                c = 'D';
                                break;
                            }
                            break;
                        case 2133182:
                            if (str3.equals("F04H")) {
                                c = 'E';
                                break;
                            }
                            break;
                        case 2133184:
                            if (str3.equals("F04J")) {
                                c = 'F';
                                break;
                            }
                            break;
                        case 2436959:
                            if (str3.equals("P681")) {
                                c = 'G';
                                break;
                            }
                            break;
                        case 2463773:
                            if (str3.equals("Q350")) {
                                c = 'H';
                                break;
                            }
                            break;
                        case 2464648:
                            if (str3.equals("Q427")) {
                                c = 'I';
                                break;
                            }
                            break;
                        case 2689555:
                            if (str3.equals("XE2X")) {
                                c = 'J';
                                break;
                            }
                            break;
                        case 3154429:
                            if (str3.equals("fugu")) {
                                c = 'K';
                                break;
                            }
                            break;
                        case 3284551:
                            if (str3.equals("kate")) {
                                c = 'L';
                                break;
                            }
                            break;
                        case 3351335:
                            if (str3.equals("mido")) {
                                c = 'M';
                                break;
                            }
                            break;
                        case 3386211:
                            if (str3.equals("p212")) {
                                c = 'N';
                                break;
                            }
                            break;
                        case 41325051:
                            if (str3.equals("MEIZU_M5")) {
                                c = 'O';
                                break;
                            }
                            break;
                        case 51349633:
                            if (str3.equals("601LV")) {
                                c = 'P';
                                break;
                            }
                            break;
                        case 51350594:
                            if (str3.equals("602LV")) {
                                c = 'Q';
                                break;
                            }
                            break;
                        case 55178625:
                            if (str3.equals("Aura_Note_2")) {
                                c = 'R';
                                break;
                            }
                            break;
                        case 61542055:
                            if (str3.equals("A1601")) {
                                c = 'S';
                                break;
                            }
                            break;
                        case 65355429:
                            if (str3.equals("E5643")) {
                                c = 'T';
                                break;
                            }
                            break;
                        case 66214468:
                            if (str3.equals("F3111")) {
                                c = 'U';
                                break;
                            }
                            break;
                        case 66214470:
                            if (str3.equals("F3113")) {
                                c = 'V';
                                break;
                            }
                            break;
                        case 66214473:
                            if (str3.equals("F3116")) {
                                c = 'W';
                                break;
                            }
                            break;
                        case 66215429:
                            if (str3.equals("F3211")) {
                                int i15 = ICustomTabsService_Parcel + 15;
                                writeTypedList = i15 % 128;
                                int i16 = i15 % 2;
                                c = 'X';
                                break;
                            }
                            break;
                        case 66215431:
                            if (str3.equals("F3213")) {
                                c = 'Y';
                                break;
                            }
                            break;
                        case 66215433:
                            if (str3.equals("F3215")) {
                                c = 'Z';
                                break;
                            }
                            break;
                        case 66216390:
                            if (str3.equals("F3311")) {
                            }
                            break;
                        case 76402249:
                            if (str3.equals("PRO7S")) {
                                c = '\\';
                                break;
                            }
                            break;
                        case 76404105:
                            if (str3.equals("Q4260")) {
                                c = ']';
                                break;
                            }
                            break;
                        case 76404911:
                            if (str3.equals("Q4310")) {
                                c = '^';
                                break;
                            }
                            break;
                        case 80963634:
                            if (str3.equals("V23GB")) {
                                c = '_';
                                break;
                            }
                            break;
                        case 82882791:
                            if (str3.equals("X3_HK")) {
                                c = '`';
                                break;
                            }
                            break;
                        case 98715550:
                            if (str3.equals("i9031")) {
                                c = 'a';
                                break;
                            }
                            break;
                        case 101370885:
                            if (str3.equals("l5460")) {
                                c = 'b';
                                break;
                            }
                            break;
                        case 102844228:
                            if (str3.equals("le_x6")) {
                                c = 'c';
                                break;
                            }
                            break;
                        case 165221241:
                            if (str3.equals("A2016a40")) {
                                c = 'd';
                                break;
                            }
                            break;
                        case 182191441:
                            if (str3.equals("CPY83_I00")) {
                                c = 'e';
                                break;
                            }
                            break;
                        case 245388979:
                            if (str3.equals("marino_f")) {
                            }
                            break;
                        case 287431619:
                            if (str3.equals("griffin")) {
                                c = 'g';
                                break;
                            }
                            break;
                        case 307593612:
                            if (str3.equals("A7010a48")) {
                                c = 'h';
                                break;
                            }
                            break;
                        case 308517133:
                            if (str3.equals("A7020a48")) {
                                c = 'i';
                                break;
                            }
                            break;
                        case 316215098:
                            if (str3.equals("TB3-730F")) {
                                c = 'j';
                                break;
                            }
                            break;
                        case 316215116:
                            if (str3.equals("TB3-730X")) {
                                c = 'k';
                                break;
                            }
                            break;
                        case 316246811:
                            if (str3.equals("TB3-850F")) {
                                c = 'l';
                                break;
                            }
                            break;
                        case 316246818:
                            if (str3.equals("TB3-850M")) {
                                c = 'm';
                                break;
                            }
                            break;
                        case 407160593:
                            if (str3.equals("Pixi5-10_4G")) {
                                c = 'n';
                                break;
                            }
                            break;
                        case 507412548:
                            if (str3.equals("QM16XE_U")) {
                                c = 'o';
                                break;
                            }
                            break;
                        case 793982701:
                            if (str3.equals("GIONEE_WBL5708")) {
                                c = 'p';
                                break;
                            }
                            break;
                        case 794038622:
                            if (str3.equals("GIONEE_WBL7365")) {
                                int i17 = writeTypedList + 41;
                                ICustomTabsService_Parcel = i17 % 128;
                                int i18 = i17 % 2;
                                c = 'q';
                                break;
                            }
                            break;
                        case 794040393:
                            if (str3.equals("GIONEE_WBL7519")) {
                                c = 'r';
                                break;
                            }
                            break;
                        case 835649806:
                            if (str3.equals("manning")) {
                                c = 's';
                                break;
                            }
                            break;
                        case 917340916:
                            if (str3.equals("A7000plus")) {
                                c = 't';
                                break;
                            }
                            break;
                        case 958008161:
                            if (str3.equals("j2xlteins")) {
                                c = 'u';
                                break;
                            }
                            break;
                        case 1060579533:
                            if (str3.equals("panell_d")) {
                                c = 'v';
                                break;
                            }
                            break;
                        case 1150207623:
                            if (str3.equals("LS-5017")) {
                                c = 'w';
                                break;
                            }
                            break;
                        case 1176899427:
                            if (str3.equals("itel_S41")) {
                            }
                            break;
                        case 1280332038:
                            if (str3.equals("hwALE-H")) {
                                c = 'y';
                                break;
                            }
                            break;
                        case 1306947716:
                            if (str3.equals("EverStar_S")) {
                                c = 'z';
                                break;
                            }
                            break;
                        case 1349174697:
                            if (str3.equals("htc_e56ml_dtul")) {
                                int i19 = ICustomTabsService_Parcel + 67;
                                writeTypedList = i19 % 128;
                                int i20 = i19 % 2;
                                c = '{';
                                break;
                            }
                            break;
                        case 1522194893:
                            if (str3.equals("woods_f")) {
                                c = '|';
                                break;
                            }
                            break;
                        case 1691543273:
                            if (str3.equals("CPH1609")) {
                                c = '}';
                                break;
                            }
                            break;
                        case 1691544261:
                            if (str3.equals("CPH1715")) {
                                c = '~';
                                break;
                            }
                            break;
                        case 1709443163:
                            if (str3.equals("iball8735_9806")) {
                                c = 127;
                                break;
                            }
                            break;
                        case 1865889110:
                            if (str3.equals("santoni")) {
                                c = 128;
                                break;
                            }
                            break;
                        case 1906253259:
                            if (str3.equals("PB2-670M")) {
                                c = 129;
                                break;
                            }
                            break;
                        case 1977196784:
                            if (str3.equals("Infinix-X572")) {
                                c = 130;
                                break;
                            }
                            break;
                        case 2006372676:
                            if (str3.equals("BRAVIA_ATV3_4K")) {
                                c = 131;
                                break;
                            }
                            break;
                        case 2019281702:
                            if (str3.equals("DM-01K")) {
                                c = 132;
                                break;
                            }
                            break;
                        case 2029784656:
                            if (str3.equals("HWBLN-H")) {
                                c = 133;
                                break;
                            }
                            break;
                        case 2030379515:
                            if (str3.equals("HWCAM-H")) {
                                c = 134;
                                break;
                            }
                            break;
                        case 2033393791:
                            if (str3.equals("ASUS_X00AD_2")) {
                                c = 135;
                                break;
                            }
                            break;
                        case 2047190025:
                            if (str3.equals("ELUGA_Note")) {
                                c = 136;
                                break;
                            }
                            break;
                        case 2047252157:
                            if (str3.equals("ELUGA_Prim")) {
                                c = 137;
                                break;
                            }
                            break;
                        case 2048319463:
                            if (str3.equals("HWVNS-H")) {
                                c = 138;
                                break;
                            }
                            break;
                        case 2048855701:
                            if (str3.equals("HWWAS-H")) {
                                c = 139;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        default:
                            if (str2.equals("JSN-L21")) {
                            }
                            break;
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                        case 14:
                        case 15:
                        case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                        case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case ',':
                        case '-':
                        case '.':
                        case '/':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                        case '7':
                        case '8':
                        case '9':
                        case ':':
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                        case '?':
                        case '@':
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case RVParams.WEBVIEW_FONT_SIZE_SMALLER /* 75 */:
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '[':
                        case '\\':
                        case ']':
                        case '^':
                        case '_':
                        case '`':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                        case '{':
                        case '|':
                        case '}':
                        case '~':
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                        case 131:
                        case 132:
                        case 133:
                        case 134:
                        case 135:
                        case 136:
                        case 137:
                        case 138:
                        case 139:
                            return true;
                    }
                }
                break;
        }
        return true;
    }

    private Surface onWarmupCompleted(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        return (Surface) onExtraCallback(new Object[]{this, appBarKtExternalSyntheticLambda5}, -1908657735, getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, 1908657737, getKekid.onExtraCallback());
    }

    private void onWarmupCompleted(CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        onExtraCallback(new Object[]{this, cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0}, -1679734823, getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, 1679734824, getKekid.onExtraCallback());
    }

    private void cancelNotification() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        onExtraCallback(new Object[]{this}, 45720326, getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, -45720322, getKekid.onExtraCallback());
    }

    @RequiresNonNull
    private void ITrustedWebActivityCallbackStubProxy() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        onExtraCallback(new Object[]{this}, 712298389, getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, -712298383, getKekid.onExtraCallback());
    }

    private void onExtraCallbackWithResult(AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4, int i2, long j, long j2) {
        Object[] objArr = {this, androidMenu_androidKtExternalSyntheticLambda4, Integer.valueOf(i2), Long.valueOf(j), Long.valueOf(j2)};
        int iOnExtraCallback = getKekid.onExtraCallback();
        onExtraCallback(objArr, 1076587485, getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, -1076587482, getKekid.onExtraCallback());
    }

    private void onNavigationEvent(@Nullable Object obj) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int iOnExtraCallback = getKekid.onExtraCallback();
        onExtraCallback(new Object[]{this, obj}, -1772576522, getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, 1772576522, getKekid.onExtraCallback());
    }

    private void ITrustedWebActivityServiceDefault() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        onExtraCallback(new Object[]{this}, -1639081309, getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, 1639081314, getKekid.onExtraCallback());
    }

    private void onExtraCallbackWithResult(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        onExtraCallback(new Object[]{this, onextracallbackwithresult}, -1906607922, getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, 1906607929, getKekid.onExtraCallback());
    }

    static void IEngagementSignalsCallback_Parcel() {
        ICustomTabsServiceDefault = 478308992;
    }

    final class onExtraCallback implements AndroidMenu_androidKtExternalSyntheticLambda4.IAuthTabCallback, Handler.Callback {
        private final Handler onWarmupCompleted;

        public onExtraCallback(AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4) {
            Handler handlerIAuthTabCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(this);
            this.onWarmupCompleted = handlerIAuthTabCallback;
            androidMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(this, handlerIAuthTabCallback);
        }

        @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4.IAuthTabCallback
        public void IAuthTabCallback(AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4, long j, long j2) {
            if (Build.VERSION.SDK_INT < 30) {
                this.onWarmupCompleted.sendMessageAtFrontOfQueue(Message.obtain(this.onWarmupCompleted, 0, (int) (j >> 32), (int) j));
            } else {
                onExtraCallbackWithResult(j);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(message.arg1, message.arg2));
            return true;
        }

        private void onExtraCallbackWithResult(long j) {
            DraggableAnchorsNodeExternalSyntheticLambda0 draggableAnchorsNodeExternalSyntheticLambda0 = DraggableAnchorsNodeExternalSyntheticLambda0.this;
            if (this != draggableAnchorsNodeExternalSyntheticLambda0.onWarmupCompleted || DraggableAnchorsNodeExternalSyntheticLambda0.onWarmupCompleted(draggableAnchorsNodeExternalSyntheticLambda0) == null) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                DraggableAnchorsNodeExternalSyntheticLambda0.IAuthTabCallback(DraggableAnchorsNodeExternalSyntheticLambda0.this);
                return;
            }
            try {
                DraggableAnchorsNodeExternalSyntheticLambda0.this.onNavigationEvent(j);
            } catch (AndroidSelectionHandles_androidKtExternalSyntheticLambda4 e) {
                DraggableAnchorsNodeExternalSyntheticLambda0.IAuthTabCallback(DraggableAnchorsNodeExternalSyntheticLambda0.this, e);
            }
        }
    }
}
