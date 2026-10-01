package o;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.zzgsa;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.BackdropScaffoldStateCompanionExternalSyntheticLambda1;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.BottomNavigationKtExternalSyntheticLambda3;
import o.BottomNavigationKtExternalSyntheticLambda4;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;
import o.TextFieldSelectionStateExternalSyntheticLambda12;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BottomNavigationKtExternalSyntheticLambda4 implements BottomDrawerStateCompanionExternalSyntheticLambda1, DrawerStateExternalSyntheticLambda1, Loader.onExtraCallbackWithResult<IAuthTabCallback>, Loader.onWarmupCompleted, BottomNavigationKtExternalSyntheticLambda3.onWarmupCompleted {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Map<String, String> IAuthTabCallback;
    private static int ICustomTabsServiceDefault = 0;
    private static boolean ICustomTabsServiceStub = false;
    private static int ICustomTabsServiceStubProxy = 0;
    private static int ICustomTabsService_Parcel = 0;
    private static int access200 = 1;
    private static final BasicTextContextMenuProviderKtExternalSyntheticLambda4 onExtraCallbackWithResult;
    private static char[] validateRelationship = null;
    private static boolean warmup = false;
    private static int writeTypedList = 1;
    private final SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted IAuthTabCallbackDefault;
    private final long IAuthTabCallbackStub;
    private final Handler IAuthTabCallbackStubProxy;
    private long IAuthTabCallback_Parcel;
    private boolean ICustomTabsCallback;
    private boolean ICustomTabsCallbackDefault;
    private boolean ICustomTabsCallbackStub;
    private final Runnable ICustomTabsCallbackStubProxy;
    private long ICustomTabsCallback_Parcel;
    private boolean ICustomTabsService;
    private int access000;
    private final SelectionRegistrarImplExternalSyntheticLambda0 access100;
    private final String asBinder;
    private int asInterface;
    private boolean extraCallback;
    private ModalBottomSheetKtExternalSyntheticLambda11 extraCallbackWithResult;
    private boolean extraCommand;
    private int getInterfaceDescriptor;
    private boolean isEngagementSignalsApiAvailable;
    private final BottomNavigationKtExternalSyntheticLambda1 mayLaunchUrl;
    private onExtraCallback[] newAuthTabSession;
    private BottomNavigationKtExternalSyntheticLambda3[] newSession;
    private boolean newSessionWithExtras;
    private final androidx.media3.exoplayer.upstream.Loader onActivityLayout;
    private final TextFieldCoreModifierNodeExternalSyntheticLambda2 onActivityResized;
    private BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted onExtraCallback;
    private long onMessageChannelReady;
    private final onNavigationEvent onMinimized;
    private final ComposableSingletonsScaffoldKtExternalSyntheticLambda5 onPostMessage;
    private final BottomNavigationKtExternalSyntheticLambda0$onExtraCallback onRelationshipValidationResult;
    private final TextFieldSelectionStateExternalSyntheticLambda0 onTransact;
    private final Runnable onUnminimized;
    private final ComposableSingletonsScaffoldKtExternalSyntheticLambda3 onWarmupCompleted;
    private boolean postMessage;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda4 prefetch;
    private final int prefetchWithMultipleUrls;
    private boolean readTypedObject;
    private boolean receiveFile;
    private final long requestPostMessageChannel;
    private final BasicTextContextMenuProviderKtExternalSyntheticLambda4 requestPostMessageChannelWithExtras;
    private onWarmupCompleted setEngagementSignalsCallback;
    private final Uri updateVisuals;
    private boolean writeTypedObject;

    interface onNavigationEvent {
        void IAuthTabCallback(long j, ExposedDropdownMenu_androidKtExternalSyntheticLambda4 exposedDropdownMenu_androidKtExternalSyntheticLambda4, boolean z);
    }

    public static /* synthetic */ void onExtraCallback(BottomNavigationKtExternalSyntheticLambda4 bottomNavigationKtExternalSyntheticLambda4) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 17;
        access200 = i3 % 128;
        int i4 = i3 % 2;
        bottomNavigationKtExternalSyntheticLambda4.readTypedObject();
        if (i4 == 0) {
            int i5 = 19 / 0;
        }
        int i6 = ICustomTabsService_Parcel + 89;
        access200 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onNavigationEvent(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = i2 | i5 | i6;
        int i9 = (~((~i6) | i5)) | i2;
        int i10 = ~((~i2) | i5);
        int i11 = i2 + i5 + i4 + (1132004924 * i3) + ((-2047965933) * i7);
        int i12 = i11 * i11;
        int i13 = ((1650805025 * i2) - 289800192) + ((-1513965855) * i5) + ((-565098208) * i8) + (i9 * 565098208) + (565098208 * i10) + ((-2079064064) * i4) + (1823473664 * i3) + (830210048 * i7) + ((-1143341056) * i12);
        int i14 = ((i2 * (-767560105)) - 1188649921) + (i5 * (-767559017)) + (i8 * (-544)) + (i9 * 544) + (i10 * 544) + (i4 * (-767559561)) + (i3 * 1544553956) + (i7 * (-1468578859)) + (i12 * (-2108293120));
        int i15 = i13 + (i14 * i14 * (-2075787264));
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? i15 != 4 ? i15 != 5 ? onNavigationEvent(objArr) : IAuthTabCallbackStub(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    public void IAuthTabCallback(long j) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 125;
        access200 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 0 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        BottomNavigationKtExternalSyntheticLambda4 bottomNavigationKtExternalSyntheticLambda4 = (BottomNavigationKtExternalSyntheticLambda4) objArr[0];
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 93;
        access200 = i3 % 128;
        int i4 = i3 % 2;
        bottomNavigationKtExternalSyntheticLambda4.ICustomTabsCallback();
        int i5 = ICustomTabsService_Parcel + 119;
        access200 = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    static /* synthetic */ String IAuthTabCallbackStub(BottomNavigationKtExternalSyntheticLambda4 bottomNavigationKtExternalSyntheticLambda4) {
        int i2 = 2 % 2;
        int i3 = access200 + 91;
        int i4 = i3 % 128;
        ICustomTabsService_Parcel = i4;
        int i5 = i3 % 2;
        Object obj = null;
        String str = bottomNavigationKtExternalSyntheticLambda4.asBinder;
        if (i5 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 49;
        access200 = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ BasicTextContextMenuProviderKtExternalSyntheticLambda4 asBinder() {
        int i2 = 2 % 2;
        int i3 = access200;
        int i4 = i3 + 45;
        ICustomTabsService_Parcel = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = onExtraCallbackWithResult;
        int i5 = i3 + 29;
        ICustomTabsService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return basicTextContextMenuProviderKtExternalSyntheticLambda4;
        }
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ long asInterface(BottomNavigationKtExternalSyntheticLambda4 bottomNavigationKtExternalSyntheticLambda4) {
        int i2 = 2 % 2;
        int i3 = access200 + 105;
        ICustomTabsService_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return bottomNavigationKtExternalSyntheticLambda4.IAuthTabCallback_Parcel;
        }
        long j = bottomNavigationKtExternalSyntheticLambda4.IAuthTabCallback_Parcel;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Map asInterface() {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 119;
        int i4 = i3 % 128;
        access200 = i4;
        int i5 = i3 % 2;
        Map<String, String> map = IAuthTabCallback;
        int i6 = i4 + 3;
        ICustomTabsService_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return map;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        BottomNavigationKtExternalSyntheticLambda4 bottomNavigationKtExternalSyntheticLambda4 = (BottomNavigationKtExternalSyntheticLambda4) objArr[0];
        int i2 = 2 % 2;
        int i3 = access200;
        int i4 = i3 + 109;
        ICustomTabsService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        Handler handler = bottomNavigationKtExternalSyntheticLambda4.IAuthTabCallbackStubProxy;
        int i6 = i3 + 55;
        ICustomTabsService_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            return handler;
        }
        throw null;
    }

    static /* synthetic */ long onExtraCallbackWithResult(BottomNavigationKtExternalSyntheticLambda4 bottomNavigationKtExternalSyntheticLambda4) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel;
        int i4 = i3 + 29;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        long j = bottomNavigationKtExternalSyntheticLambda4.IAuthTabCallbackStub;
        int i6 = i3 + 115;
        access200 = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    static /* synthetic */ long onExtraCallbackWithResult(BottomNavigationKtExternalSyntheticLambda4 bottomNavigationKtExternalSyntheticLambda4, boolean z) {
        int i2 = 2 % 2;
        int i3 = access200 + 63;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        long jIAuthTabCallback = bottomNavigationKtExternalSyntheticLambda4.IAuthTabCallback(z);
        int i5 = ICustomTabsService_Parcel + 63;
        access200 = i5 % 128;
        if (i5 % 2 != 0) {
            return jIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        BottomNavigationKtExternalSyntheticLambda4 bottomNavigationKtExternalSyntheticLambda4 = (BottomNavigationKtExternalSyntheticLambda4) objArr[0];
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 17;
        int i4 = i3 % 128;
        access200 = i4;
        int i5 = i3 % 2;
        ModalBottomSheetKtExternalSyntheticLambda11 modalBottomSheetKtExternalSyntheticLambda11 = bottomNavigationKtExternalSyntheticLambda4.extraCallbackWithResult;
        int i6 = i4 + 125;
        ICustomTabsService_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return modalBottomSheetKtExternalSyntheticLambda11;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        BottomNavigationKtExternalSyntheticLambda4 bottomNavigationKtExternalSyntheticLambda4 = (BottomNavigationKtExternalSyntheticLambda4) objArr[0];
        ModalBottomSheetKtExternalSyntheticLambda11 modalBottomSheetKtExternalSyntheticLambda11 = (ModalBottomSheetKtExternalSyntheticLambda11) objArr[1];
        int i2 = 2 % 2;
        int i3 = access200 + 43;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        bottomNavigationKtExternalSyntheticLambda4.extraCallbackWithResult = modalBottomSheetKtExternalSyntheticLambda11;
        if (i4 != 0) {
            int i5 = 66 / 0;
        }
        return modalBottomSheetKtExternalSyntheticLambda11;
    }

    static /* synthetic */ Runnable onWarmupCompleted(BottomNavigationKtExternalSyntheticLambda4 bottomNavigationKtExternalSyntheticLambda4) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel;
        int i4 = i3 + 73;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        Runnable runnable = bottomNavigationKtExternalSyntheticLambda4.ICustomTabsCallbackStubProxy;
        if (i5 == 0) {
            int i6 = 35 / 0;
        }
        int i7 = i3 + 27;
        access200 = i7 % 128;
        int i8 = i7 % 2;
        return runnable;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.onExtraCallbackWithResult
    public /* synthetic */ Loader.IAuthTabCallback onExtraCallbackWithResult(Loader.onNavigationEvent onnavigationevent, long j, long j2, IOException iOException, int i2) {
        int i3 = 2 % 2;
        int i4 = access200 + 21;
        ICustomTabsService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        Loader.IAuthTabCallback IAuthTabCallback2 = IAuthTabCallback((IAuthTabCallback) onnavigationevent, j, j2, iOException, i2);
        int i6 = access200 + 101;
        ICustomTabsService_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return IAuthTabCallback2;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.onExtraCallbackWithResult
    public /* synthetic */ void onExtraCallbackWithResult(Loader.onNavigationEvent onnavigationevent, long j, long j2) {
        int i2 = 2 % 2;
        int i3 = access200 + 121;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent((IAuthTabCallback) onnavigationevent, j, j2);
        int i5 = ICustomTabsService_Parcel + 45;
        access200 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.onExtraCallbackWithResult
    public /* synthetic */ void onNavigationEvent(Loader.onNavigationEvent onnavigationevent, long j, long j2, boolean z) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 79;
        access200 = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult((IAuthTabCallback) onnavigationevent, j, j2, z);
        int i5 = access200 + 101;
        ICustomTabsService_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.onExtraCallbackWithResult
    public /* synthetic */ void onWarmupCompleted(Loader.onNavigationEvent onnavigationevent, long j, long j2, int i2) {
        int i3 = 2 % 2;
        int i4 = ICustomTabsService_Parcel + 41;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent((IAuthTabCallback) onnavigationevent, j, j2, i2);
        int i6 = ICustomTabsService_Parcel + 93;
        access200 = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        getInterfaceDescriptor();
        IAuthTabCallback = access100();
        onExtraCallbackWithResult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult("icy").IAuthTabCallbackDefault("application/x-icy").onNavigationEvent();
        int i2 = ICustomTabsServiceStubProxy + 59;
        writeTypedList = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = validateRelationship;
        if (cArr2 != null) {
            int i5 = $10 + 61;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 71;
                $10 = i8 % 128;
                int i9 = i8 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 77 - KeyEvent.keyCodeFromString(""), 20952 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    i3 = 2;
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
            Object[] objArr3 = {Integer.valueOf(ICustomTabsServiceDefault)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            char c = '0';
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 75 - ExpandableListView.getPackedPositionGroup(0L), 16037 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i10 = 1052772399;
            if (!(!warmup)) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i11 = $11 + 49;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback + 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >> i2] - iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i10);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), View.MeasureSpec.getSize(0) + 63, 12214 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i2] - iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), 63 - TextUtils.indexOf("", "", 0, 0), 12262 - AndroidCharacter.getMirror('0'), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                    i10 = 1052772399;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!ICustomTabsServiceStub) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i12 = $10 + 47;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", c, 0, 0) + 1), 63 - Drawable.resolveOpacity(0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                c = '0';
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

    public BottomNavigationKtExternalSyntheticLambda4(Uri uri, TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, BottomNavigationKtExternalSyntheticLambda1 bottomNavigationKtExternalSyntheticLambda1, SelectionRegistrarImplExternalSyntheticLambda0 selectionRegistrarImplExternalSyntheticLambda0, SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted, ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5, BottomNavigationKtExternalSyntheticLambda0$onExtraCallback bottomNavigationKtExternalSyntheticLambda0$onExtraCallback, onNavigationEvent onnavigationevent, ComposableSingletonsScaffoldKtExternalSyntheticLambda3 composableSingletonsScaffoldKtExternalSyntheticLambda3, @Nullable String str, int i2, int i3, @Nullable BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, long j, @Nullable ReleasableExecutor releasableExecutor) {
        androidx.media3.exoplayer.upstream.Loader loader;
        this.updateVisuals = uri;
        this.onTransact = textFieldSelectionStateExternalSyntheticLambda0;
        this.access100 = selectionRegistrarImplExternalSyntheticLambda0;
        this.IAuthTabCallbackDefault = selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted;
        this.onPostMessage = composableSingletonsScaffoldKtExternalSyntheticLambda5;
        this.onRelationshipValidationResult = bottomNavigationKtExternalSyntheticLambda0$onExtraCallback;
        this.onMinimized = onnavigationevent;
        this.onWarmupCompleted = composableSingletonsScaffoldKtExternalSyntheticLambda3;
        this.asBinder = str;
        this.IAuthTabCallbackStub = i2;
        this.prefetchWithMultipleUrls = i3;
        this.requestPostMessageChannelWithExtras = basicTextContextMenuProviderKtExternalSyntheticLambda4;
        if (releasableExecutor != null) {
            loader = new androidx.media3.exoplayer.upstream.Loader(releasableExecutor);
        } else {
            loader = new androidx.media3.exoplayer.upstream.Loader("ProgressiveMediaPeriod");
            int i4 = ICustomTabsService_Parcel + 111;
            access200 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.onActivityLayout = loader;
        this.mayLaunchUrl = bottomNavigationKtExternalSyntheticLambda1;
        this.requestPostMessageChannel = j;
        this.onActivityResized = new TextFieldCoreModifierNodeExternalSyntheticLambda2();
        this.onUnminimized = new Runnable() { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                BottomNavigationKtExternalSyntheticLambda4.onExtraCallback(this.f$0);
            }
        };
        this.ICustomTabsCallbackStubProxy = new Runnable() { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                BottomNavigationKtExternalSyntheticLambda4.onNavigationEvent(this.f$0);
            }
        };
        this.IAuthTabCallbackStubProxy = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult();
        this.newAuthTabSession = new onExtraCallback[0];
        this.newSession = new BottomNavigationKtExternalSyntheticLambda3[0];
        this.ICustomTabsCallback_Parcel = -9223372036854775807L;
        this.asInterface = 1;
        int i7 = access200 + 119;
        ICustomTabsService_Parcel = i7 % 128;
        int i8 = i7 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(BottomNavigationKtExternalSyntheticLambda4 bottomNavigationKtExternalSyntheticLambda4) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 103;
        access200 = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z = bottomNavigationKtExternalSyntheticLambda4.postMessage;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (bottomNavigationKtExternalSyntheticLambda4.postMessage) {
            return;
        }
        ((BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(bottomNavigationKtExternalSyntheticLambda4.onExtraCallback)).onWarmupCompleted(bottomNavigationKtExternalSyntheticLambda4);
        int i4 = ICustomTabsService_Parcel + 99;
        access200 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void IAuthTabCallback_Parcel() {
        int i2 = 2 % 2;
        int i3 = access200;
        int i4 = i3 + 5;
        ICustomTabsService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (!(!this.isEngagementSignalsApiAvailable)) {
            int i5 = i3 + 81;
            ICustomTabsService_Parcel = i5 % 128;
            int i6 = i5 % 2;
            for (BottomNavigationKtExternalSyntheticLambda3 bottomNavigationKtExternalSyntheticLambda3 : this.newSession) {
                bottomNavigationKtExternalSyntheticLambda3.IAuthTabCallback_Parcel();
            }
        }
        this.onActivityLayout.onWarmupCompleted(this);
        this.IAuthTabCallbackStubProxy.removeCallbacksAndMessages(null);
        this.onExtraCallback = null;
        this.postMessage = true;
        int i7 = ICustomTabsService_Parcel + 47;
        access200 = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.onWarmupCompleted
    public void IAuthTabCallbackStubProxy() {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 113;
        access200 = i3 % 128;
        int i4 = i3 % 2;
        for (BottomNavigationKtExternalSyntheticLambda3 bottomNavigationKtExternalSyntheticLambda3 : this.newSession) {
            bottomNavigationKtExternalSyntheticLambda3.getInterfaceDescriptor();
        }
        this.mayLaunchUrl.onNavigationEvent();
        int i5 = access200 + 111;
        ICustomTabsService_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
    }

    public void onExtraCallback(BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted, long j) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 49;
        access200 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.onExtraCallback = bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted;
            if (this.requestPostMessageChannelWithExtras != null) {
                onExtraCallbackWithResult(this.prefetchWithMultipleUrls, 3).onExtraCallbackWithResult(this.requestPostMessageChannelWithExtras);
                onExtraCallbackWithResult(new ExposedDropdownMenu_androidExternalSyntheticLambda1(new long[]{0}, new long[]{0}, -9223372036854775807L));
                onExtraCallbackWithResult();
                this.ICustomTabsCallback_Parcel = j;
                return;
            }
            this.onActivityResized.IAuthTabCallback();
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            onNavigationEvent(564577300, zzgsa.onWarmupCompleted(), new Object[]{this}, zzgsa.onWarmupCompleted(), -564577297, iOnWarmupCompleted, zzgsa.onWarmupCompleted());
            int i4 = access200 + 107;
            ICustomTabsService_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.onExtraCallback = bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNavigationEvent() throws ParserException, IOException {
        int i2 = 2 % 2;
        int i3 = access200 + 81;
        ICustomTabsService_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            onTransact();
            int i4 = 69 / 0;
            if (!(!this.ICustomTabsCallbackStub)) {
                if (!this.isEngagementSignalsApiAvailable) {
                    int i5 = ICustomTabsService_Parcel + 109;
                    access200 = i5 % 128;
                    int i6 = i5 % 2;
                    throw ParserException.onNavigationEvent("Loading finished before preparation is complete.", (Throwable) null);
                }
            }
        } else {
            onTransact();
            if (!(!this.ICustomTabsCallbackStub)) {
            }
        }
        int i7 = access200 + 29;
        ICustomTabsService_Parcel = i7 % 128;
        int i8 = i7 % 2;
    }

    public BottomSheetScaffoldKtExternalSyntheticLambda11 ab_() {
        int i2 = 2 % 2;
        int i3 = access200 + 81;
        ICustomTabsService_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            access000();
            BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11 = this.setEngagementSignalsCallback.onNavigationEvent;
            int i4 = ICustomTabsService_Parcel + 91;
            access200 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 9 / 0;
            }
            return bottomSheetScaffoldKtExternalSyntheticLambda11;
        }
        access000();
        BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda112 = this.setEngagementSignalsCallback.onNavigationEvent;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009d A[PHI: r12
      0x009d: PHI (r12v8 o.ColorsKtExternalSyntheticLambda0) = (r12v7 o.ColorsKtExternalSyntheticLambda0), (r12v17 o.ColorsKtExternalSyntheticLambda0) binds: [B:37:0x009b, B:34:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long IAuthTabCallback(ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr, boolean[] zArr, BottomNavigationKtExternalSyntheticLambda5[] bottomNavigationKtExternalSyntheticLambda5Arr, boolean[] zArr2, long j) {
        BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11;
        boolean[] zArr3;
        int i2;
        int i3;
        ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0;
        boolean z;
        long jOnExtraCallbackWithResult = j;
        int i4 = 2 % 2;
        int i5 = access200 + 79;
        ICustomTabsService_Parcel = i5 % 128;
        int i6 = 0;
        if (i5 % 2 != 0) {
            access000();
            onWarmupCompleted onwarmupcompleted = this.setEngagementSignalsCallback;
            bottomSheetScaffoldKtExternalSyntheticLambda11 = onwarmupcompleted.onNavigationEvent;
            zArr3 = onwarmupcompleted.onExtraCallbackWithResult;
            i2 = this.access000;
            i3 = 1;
        } else {
            access000();
            onWarmupCompleted onwarmupcompleted2 = this.setEngagementSignalsCallback;
            bottomSheetScaffoldKtExternalSyntheticLambda11 = onwarmupcompleted2.onNavigationEvent;
            zArr3 = onwarmupcompleted2.onExtraCallbackWithResult;
            i2 = this.access000;
            i3 = 0;
        }
        while (i3 < colorsKtExternalSyntheticLambda0Arr.length) {
            int i7 = access200 + 3;
            ICustomTabsService_Parcel = i7 % 128;
            int i8 = i7 % 2;
            BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda5 = bottomNavigationKtExternalSyntheticLambda5Arr[i3];
            if (bottomNavigationKtExternalSyntheticLambda5 != null && (colorsKtExternalSyntheticLambda0Arr[i3] == null || !zArr[i3])) {
                int i9 = ((onExtraCallbackWithResult) bottomNavigationKtExternalSyntheticLambda5).onWarmupCompleted;
                RecordingInputConnection_androidKt.onExtraCallbackWithResult(zArr3[i9]);
                this.access000--;
                zArr3[i9] = false;
                bottomNavigationKtExternalSyntheticLambda5Arr[i3] = null;
            }
            i3++;
        }
        boolean z2 = !this.receiveFile ? jOnExtraCallbackWithResult == 0 || this.writeTypedObject : i2 != 0;
        int i10 = access200 + 71;
        ICustomTabsService_Parcel = i10 % 128;
        int i11 = i10 % 2;
        for (int i12 = 0; i12 < colorsKtExternalSyntheticLambda0Arr.length; i12++) {
            if (bottomNavigationKtExternalSyntheticLambda5Arr[i12] == null) {
                int i13 = ICustomTabsService_Parcel + 65;
                access200 = i13 % 128;
                if (i13 % 2 == 0) {
                    colorsKtExternalSyntheticLambda0 = colorsKtExternalSyntheticLambda0Arr[i12];
                    int i14 = 19 / 0;
                    if (colorsKtExternalSyntheticLambda0 != null) {
                        RecordingInputConnection_androidKt.onExtraCallbackWithResult(colorsKtExternalSyntheticLambda0.access100() == 1);
                        if (colorsKtExternalSyntheticLambda0.onWarmupCompleted(0) == 0) {
                            int i15 = access200 + 23;
                            ICustomTabsService_Parcel = i15 % 128;
                            int i16 = i15 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        RecordingInputConnection_androidKt.onExtraCallbackWithResult(z);
                        int iIAuthTabCallback = bottomSheetScaffoldKtExternalSyntheticLambda11.IAuthTabCallback(colorsKtExternalSyntheticLambda0.onExtraCallback());
                        RecordingInputConnection_androidKt.onExtraCallbackWithResult(!zArr3[iIAuthTabCallback]);
                        this.access000++;
                        zArr3[iIAuthTabCallback] = true;
                        this.ICustomTabsService = colorsKtExternalSyntheticLambda0.IAuthTabCallback().extraCallback | this.ICustomTabsService;
                        bottomNavigationKtExternalSyntheticLambda5Arr[i12] = new onExtraCallbackWithResult(iIAuthTabCallback);
                        zArr2[i12] = true;
                        if (!z2) {
                            BottomNavigationKtExternalSyntheticLambda3 bottomNavigationKtExternalSyntheticLambda3 = this.newSession[iIAuthTabCallback];
                            if (bottomNavigationKtExternalSyntheticLambda3.onExtraCallbackWithResult() != 0) {
                                int i17 = ICustomTabsService_Parcel + 13;
                                access200 = i17 % 128;
                                z2 = i17 % 2 != 0 ? !bottomNavigationKtExternalSyntheticLambda3.onExtraCallbackWithResult(jOnExtraCallbackWithResult, true) : !bottomNavigationKtExternalSyntheticLambda3.onExtraCallbackWithResult(jOnExtraCallbackWithResult, true);
                            }
                        }
                    }
                } else {
                    colorsKtExternalSyntheticLambda0 = colorsKtExternalSyntheticLambda0Arr[i12];
                    if (colorsKtExternalSyntheticLambda0 != null) {
                    }
                }
            }
        }
        if (this.access000 == 0) {
            int i18 = access200 + 115;
            ICustomTabsService_Parcel = i18 % 128;
            int i19 = i18 % 2;
            this.extraCommand = false;
            this.ICustomTabsCallbackDefault = false;
            this.ICustomTabsService = false;
            if (this.onActivityLayout.onWarmupCompleted()) {
                BottomNavigationKtExternalSyntheticLambda3[] bottomNavigationKtExternalSyntheticLambda3Arr = this.newSession;
                int length = bottomNavigationKtExternalSyntheticLambda3Arr.length;
                while (i6 < length) {
                    bottomNavigationKtExternalSyntheticLambda3Arr[i6].onExtraCallback();
                    i6++;
                }
                this.onActivityLayout.onNavigationEvent();
            } else {
                this.ICustomTabsCallbackStub = false;
                BottomNavigationKtExternalSyntheticLambda3[] bottomNavigationKtExternalSyntheticLambda3Arr2 = this.newSession;
                int length2 = bottomNavigationKtExternalSyntheticLambda3Arr2.length;
                while (i6 < length2) {
                    bottomNavigationKtExternalSyntheticLambda3Arr2[i6].access000();
                    i6++;
                }
            }
        } else if (z2) {
            jOnExtraCallbackWithResult = onExtraCallbackWithResult(jOnExtraCallbackWithResult);
            while (i6 < bottomNavigationKtExternalSyntheticLambda5Arr.length) {
                int i20 = access200;
                int i21 = i20 + 73;
                ICustomTabsService_Parcel = i21 % 128;
                if (i21 % 2 != 0) {
                    BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda52 = bottomNavigationKtExternalSyntheticLambda5Arr[i6];
                    throw null;
                }
                if (bottomNavigationKtExternalSyntheticLambda5Arr[i6] != null) {
                    zArr2[i6] = true;
                }
                i6++;
                int i22 = i20 + 3;
                ICustomTabsService_Parcel = i22 % 128;
                int i23 = i22 % 2;
            }
        }
        this.receiveFile = true;
        return jOnExtraCallbackWithResult;
    }

    public void onExtraCallback(long j, boolean z) {
        int i2 = 2 % 2;
        Object obj = null;
        if (!this.writeTypedObject) {
            int i3 = access200 + 39;
            ICustomTabsService_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                access000();
                extraCallbackWithResult();
                throw null;
            }
            access000();
            if (!extraCallbackWithResult()) {
                boolean[] zArr = this.setEngagementSignalsCallback.onExtraCallbackWithResult;
                int length = this.newSession.length;
                for (int i4 = 0; i4 < length; i4++) {
                    this.newSession[i4].IAuthTabCallback(j, z, zArr[i4]);
                }
            }
        }
        int i5 = access200 + 59;
        ICustomTabsService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean IAuthTabCallback(PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1 platformSelectionBehaviors_androidKtExternalSyntheticLambda1) {
        int i2 = 2 % 2;
        if (this.ICustomTabsCallbackStub) {
            return false;
        }
        int i3 = ICustomTabsService_Parcel + 27;
        access200 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            if (this.onActivityLayout.onExtraCallback() || this.extraCommand) {
                return false;
            }
            int i4 = ICustomTabsService_Parcel + 49;
            int i5 = i4 % 128;
            access200 = i5;
            int i6 = i4 % 2;
            if (!this.isEngagementSignalsApiAvailable) {
                int i7 = i5 + 63;
                ICustomTabsService_Parcel = i7 % 128;
                if (i7 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (this.requestPostMessageChannelWithExtras != null) {
                    if (this.access000 == 0) {
                        return false;
                    }
                }
            }
            boolean zIAuthTabCallback = this.onActivityResized.IAuthTabCallback();
            if (this.onActivityLayout.onWarmupCompleted()) {
                return zIAuthTabCallback;
            }
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
            onNavigationEvent(564577300, zzgsa.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted2, -564577297, iOnWarmupCompleted, zzgsa.onWarmupCompleted());
            return true;
        }
        this.onActivityLayout.onExtraCallback();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r4.onActivityResized.onNavigationEvent() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r1 = o.BottomNavigationKtExternalSyntheticLambda4.access200 + 73;
        o.BottomNavigationKtExternalSyntheticLambda4.ICustomTabsService_Parcel = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r4.onActivityResized.onNavigationEvent() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean IAuthTabCallback() {
        int i2 = 2 % 2;
        if (this.onActivityLayout.onWarmupCompleted()) {
            int i3 = access200 + 109;
            ICustomTabsService_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 42 / 0;
            }
        }
        return false;
    }

    public long onExtraCallback() {
        int i2 = 2 % 2;
        int i3 = access200 + 37;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        long jOnWarmupCompleted = onWarmupCompleted();
        int i5 = access200 + 91;
        ICustomTabsService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return jOnWarmupCompleted;
        }
        throw null;
    }

    public long IAuthTabCallbackStub() {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel;
        int i4 = i3 + 23;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        if (!this.ICustomTabsService) {
            if (!this.ICustomTabsCallbackDefault) {
                return -9223372036854775807L;
            }
            if (!this.ICustomTabsCallbackStub && writeTypedObject() <= this.getInterfaceDescriptor) {
                return -9223372036854775807L;
            }
            this.ICustomTabsCallbackDefault = false;
            return this.onMessageChannelReady;
        }
        int i6 = i3 + 55;
        access200 = i6 % 128;
        int i7 = i6 % 2;
        this.ICustomTabsService = false;
        return this.onMessageChannelReady;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (extraCallbackWithResult() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        r1 = o.BottomNavigationKtExternalSyntheticLambda4.access200 + 47;
        o.BottomNavigationKtExternalSyntheticLambda4.ICustomTabsService_Parcel = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if ((r1 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        return r14.ICustomTabsCallback_Parcel;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r14.readTypedObject == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        r1 = o.BottomNavigationKtExternalSyntheticLambda4.ICustomTabsService_Parcel + 89;
        o.BottomNavigationKtExternalSyntheticLambda4.access200 = r1 % 128;
        r1 = r1 % 2;
        r1 = r14.newSession.length;
        r10 = 0;
        r8 = Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r10 >= r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        r11 = o.BottomNavigationKtExternalSyntheticLambda4.ICustomTabsService_Parcel + 5;
        o.BottomNavigationKtExternalSyntheticLambda4.access200 = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if ((r11 % 2) == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        r11 = r14.setEngagementSignalsCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r11.onWarmupCompleted[r10] == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        r12 = o.BottomNavigationKtExternalSyntheticLambda4.access200 + 9;
        o.BottomNavigationKtExternalSyntheticLambda4.ICustomTabsService_Parcel = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if ((r12 % 2) != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (r11.onExtraCallbackWithResult[r10] == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        if (r14.newSession[r10].IAuthTabCallbackDefault() != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        r11 = o.BottomNavigationKtExternalSyntheticLambda4.ICustomTabsService_Parcel + 87;
        o.BottomNavigationKtExternalSyntheticLambda4.access200 = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        if ((r11 % 2) == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        r8 = java.lang.Math.min(r8, r14.newSession[r10].onWarmupCompleted());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        java.lang.Math.min(r8, r14.newSession[r10].onWarmupCompleted());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
    
        r0 = r11.onExtraCallbackWithResult[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
    
        r0 = r14.setEngagementSignalsCallback.onWarmupCompleted[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00be, code lost:
    
        r8 = Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c1, code lost:
    
        if (r8 != Long.MAX_VALUE) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c3, code lost:
    
        r8 = IAuthTabCallback(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
    
        r1 = o.BottomNavigationKtExternalSyntheticLambda4.access200 + 95;
        o.BottomNavigationKtExternalSyntheticLambda4.ICustomTabsService_Parcel = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d6, code lost:
    
        return r14.onMessageChannelReady;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d7, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (extraCallbackWithResult() != true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long onWarmupCompleted() {
        int i2 = 2 % 2;
        access000();
        if (!this.ICustomTabsCallbackStub) {
            int i3 = access200;
            int i4 = i3 + 47;
            ICustomTabsService_Parcel = i4 % 128;
            int i5 = i4 % 2;
            if (this.access000 != 0) {
                int i6 = i3 + 43;
                ICustomTabsService_Parcel = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 80 / 0;
                }
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long onExtraCallbackWithResult(long j) {
        boolean z;
        int i2 = 2 % 2;
        access000();
        boolean[] zArr = this.setEngagementSignalsCallback.onWarmupCompleted;
        if (!this.prefetch.onNavigationEvent()) {
            j = 0;
        }
        int i3 = 0;
        this.ICustomTabsCallbackDefault = false;
        if (this.onMessageChannelReady == j) {
            int i4 = ICustomTabsService_Parcel + 49;
            access200 = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        this.onMessageChannelReady = j;
        if (!(!extraCallbackWithResult())) {
            this.ICustomTabsCallback_Parcel = j;
            return j;
        }
        if (this.asInterface == 7) {
            this.extraCommand = false;
            this.ICustomTabsCallback_Parcel = j;
            this.ICustomTabsCallbackStub = false;
            this.ICustomTabsService = false;
            if (this.onActivityLayout.onWarmupCompleted()) {
                int i6 = access200 + 3;
                ICustomTabsService_Parcel = i6 % 128;
                int i7 = i6 % 2;
                BottomNavigationKtExternalSyntheticLambda3[] bottomNavigationKtExternalSyntheticLambda3Arr = this.newSession;
                int length = bottomNavigationKtExternalSyntheticLambda3Arr.length;
                while (i3 < length) {
                    bottomNavigationKtExternalSyntheticLambda3Arr[i3].onExtraCallback();
                    i3++;
                }
                this.onActivityLayout.onNavigationEvent();
                return j;
            }
            this.onActivityLayout.onExtraCallbackWithResult();
            BottomNavigationKtExternalSyntheticLambda3[] bottomNavigationKtExternalSyntheticLambda3Arr2 = this.newSession;
            int length2 = bottomNavigationKtExternalSyntheticLambda3Arr2.length;
            while (i3 < length2) {
                bottomNavigationKtExternalSyntheticLambda3Arr2[i3].access000();
                i3++;
            }
        } else if (!this.ICustomTabsCallbackStub) {
            int i8 = ICustomTabsService_Parcel + 17;
            access200 = i8 % 128;
            int i9 = i8 % 2;
            if (this.onActivityLayout.onWarmupCompleted()) {
                if (!IAuthTabCallback(zArr, j, z)) {
                }
            }
        }
        int i10 = ICustomTabsService_Parcel + 39;
        access200 = i10 % 128;
        int i11 = i10 % 2;
        return j;
    }

    public long onExtraCallback(long j, SelectionContainerKtExternalSyntheticLambda2 selectionContainerKtExternalSyntheticLambda2) {
        int i2 = 2 % 2;
        access000();
        if (!this.prefetch.onNavigationEvent()) {
            int i3 = ICustomTabsService_Parcel + 39;
            access200 = i3 % 128;
            int i4 = i3 % 2;
            return 0L;
        }
        ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onnavigationeventOnExtraCallback = this.prefetch.onExtraCallback(j);
        long jOnExtraCallbackWithResult = selectionContainerKtExternalSyntheticLambda2.onExtraCallbackWithResult(j, onnavigationeventOnExtraCallback.IAuthTabCallback.onExtraCallbackWithResult, onnavigationeventOnExtraCallback.onWarmupCompleted.onExtraCallbackWithResult);
        int i5 = ICustomTabsService_Parcel + 81;
        access200 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return jOnExtraCallbackWithResult;
    }

    boolean onNavigationEvent(int i2) {
        int i3 = 2 % 2;
        int i4 = access200 + 105;
        ICustomTabsService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        if (!(!onActivityLayout())) {
            return false;
        }
        int i6 = ICustomTabsService_Parcel + 47;
        access200 = i6 % 128;
        if (i6 % 2 == 0) {
            this.newSession[i2].onExtraCallback(this.ICustomTabsCallbackStub);
            throw null;
        }
        if (!this.newSession[i2].onExtraCallback(this.ICustomTabsCallbackStub)) {
            return false;
        }
        int i7 = access200 + 79;
        int i8 = i7 % 128;
        ICustomTabsService_Parcel = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 71;
        access200 = i10 % 128;
        if (i10 % 2 != 0) {
            return true;
        }
        throw null;
    }

    void onExtraCallbackWithResult(int i2) throws IOException {
        int i3 = 2 % 2;
        int i4 = ICustomTabsService_Parcel + 101;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        this.newSession[i2].asInterface();
        onTransact();
        int i6 = ICustomTabsService_Parcel + 91;
        access200 = i6 % 128;
        int i7 = i6 % 2;
    }

    void onTransact() throws IOException {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 7;
        access200 = i3 % 128;
        int i4 = i3 % 2;
        androidx.media3.exoplayer.upstream.Loader loader = this.onActivityLayout;
        if (i4 != 0) {
            loader.IAuthTabCallback(this.onPostMessage.IAuthTabCallback(this.asInterface));
            return;
        }
        loader.IAuthTabCallback(this.onPostMessage.IAuthTabCallback(this.asInterface));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    int onExtraCallback(int i2, AndroidSelectionHandles_androidKtExternalSyntheticLambda7 androidSelectionHandles_androidKtExternalSyntheticLambda7, SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2, int i3) {
        int i4 = 2 % 2;
        int i5 = access200 + 111;
        ICustomTabsService_Parcel = i5 % 128;
        int i6 = i5 % 2;
        if (!onActivityLayout()) {
            onWarmupCompleted(i2);
            int iOnWarmupCompleted = this.newSession[i2].onWarmupCompleted(androidSelectionHandles_androidKtExternalSyntheticLambda7, selectionControllerExternalSyntheticLambda2, i3, this.ICustomTabsCallbackStub);
            if (iOnWarmupCompleted == -3) {
                int i7 = access200 + 53;
                ICustomTabsService_Parcel = i7 % 128;
                int i8 = i7 % 2;
                IAuthTabCallback(i2);
            }
            return iOnWarmupCompleted;
        }
        int i9 = access200 + 103;
        ICustomTabsService_Parcel = i9 % 128;
        int i10 = i9 % 2;
        return -3;
    }

    int onExtraCallbackWithResult(int i2, long j) {
        int i3 = 2 % 2;
        int i4 = ICustomTabsService_Parcel + 79;
        access200 = i4 % 128;
        if (i4 % 2 != 0) {
            if (onActivityLayout()) {
                return 0;
            }
            onWarmupCompleted(i2);
            BottomNavigationKtExternalSyntheticLambda3 bottomNavigationKtExternalSyntheticLambda3 = this.newSession[i2];
            int iOnExtraCallback = bottomNavigationKtExternalSyntheticLambda3.onExtraCallback(j, this.ICustomTabsCallbackStub);
            bottomNavigationKtExternalSyntheticLambda3.IAuthTabCallback(iOnExtraCallback);
            if (iOnExtraCallback == 0) {
                int i5 = access200 + 73;
                ICustomTabsService_Parcel = i5 % 128;
                int i6 = i5 % 2;
                IAuthTabCallback(i2);
            }
            return iOnExtraCallback;
        }
        onActivityLayout();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void onWarmupCompleted(int i2) {
        int i3 = 2 % 2;
        int i4 = ICustomTabsService_Parcel + 107;
        access200 = i4 % 128;
        if (i4 % 2 != 0) {
            access000();
            onWarmupCompleted onwarmupcompleted = this.setEngagementSignalsCallback;
            boolean[] zArr = onwarmupcompleted.onExtraCallback;
            if (!zArr[i2]) {
                BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback = onwarmupcompleted.onNavigationEvent.onWarmupCompleted(i2).IAuthTabCallback(0);
                this.onRelationshipValidationResult.onNavigationEvent(AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback.isEngagementSignalsApiAvailable), basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback, 0, (Object) null, this.onMessageChannelReady);
                zArr[i2] = true;
            }
            int i5 = ICustomTabsService_Parcel + 125;
            access200 = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        access000();
        boolean z = this.setEngagementSignalsCallback.onExtraCallback[i2];
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void IAuthTabCallback(int i2) {
        int i3 = 2 % 2;
        access000();
        if (this.extraCommand) {
            int i4 = access200 + 23;
            ICustomTabsService_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (!this.readTypedObject || this.setEngagementSignalsCallback.onWarmupCompleted[i2]) {
                if (!(!this.newSession[i2].onExtraCallback(false))) {
                    return;
                }
                this.ICustomTabsCallback_Parcel = 0L;
                this.extraCommand = false;
                this.ICustomTabsCallbackDefault = true;
                this.onMessageChannelReady = 0L;
                this.getInterfaceDescriptor = 0;
                for (BottomNavigationKtExternalSyntheticLambda3 bottomNavigationKtExternalSyntheticLambda3 : this.newSession) {
                    bottomNavigationKtExternalSyntheticLambda3.access000();
                }
                ((BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback)).onWarmupCompleted(this);
                int i5 = ICustomTabsService_Parcel + 33;
                access200 = i5 % 128;
                int i6 = i5 % 2;
            }
        }
    }

    private boolean onActivityLayout() {
        int i2 = 2 % 2;
        if (this.ICustomTabsCallbackDefault || extraCallbackWithResult()) {
            return true;
        }
        int i3 = access200;
        int i4 = i3 + 27;
        ICustomTabsService_Parcel = i4 % 128;
        boolean z = i4 % 2 != 0;
        int i5 = i3 + 107;
        ICustomTabsService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[PHI: r1
      0x0032: PHI (r1v10 o.TextFieldSelectionStateExternalSyntheticLambda6) = (r1v4 o.TextFieldSelectionStateExternalSyntheticLambda6), (r1v11 o.TextFieldSelectionStateExternalSyntheticLambda6) binds: [B:8:0x001f, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNavigationEvent(IAuthTabCallback iAuthTabCallback, long j, long j2, int i2) {
        TextFieldSelectionStateExternalSyntheticLambda6 textFieldSelectionStateExternalSyntheticLambda6;
        BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0;
        int i3 = 2 % 2;
        int i4 = ICustomTabsService_Parcel + 61;
        access200 = i4 % 128;
        if (i4 % 2 == 0) {
            textFieldSelectionStateExternalSyntheticLambda6 = iAuthTabCallback.onExtraCallbackWithResult;
            int i5 = 91 / 0;
            if (i2 == 0) {
                badgeKtExternalSyntheticLambda0 = new BadgeKtExternalSyntheticLambda0(iAuthTabCallback.asInterface, iAuthTabCallback.onExtraCallback, j);
            } else {
                badgeKtExternalSyntheticLambda0 = new BadgeKtExternalSyntheticLambda0(iAuthTabCallback.asInterface, iAuthTabCallback.onExtraCallback, textFieldSelectionStateExternalSyntheticLambda6.IAuthTabCallback(), textFieldSelectionStateExternalSyntheticLambda6.asBinder(), j, j2, textFieldSelectionStateExternalSyntheticLambda6.onNavigationEvent());
            }
        } else {
            textFieldSelectionStateExternalSyntheticLambda6 = iAuthTabCallback.onExtraCallbackWithResult;
            if (i2 == 0) {
            }
        }
        this.onRelationshipValidationResult.onExtraCallback(badgeKtExternalSyntheticLambda0, 1, -1, null, 0, null, iAuthTabCallback.access100, this.IAuthTabCallback_Parcel, i2);
        int i6 = access200 + 77;
        ICustomTabsService_Parcel = i6 % 128;
        int i7 = i6 % 2;
    }

    public void onNavigationEvent(IAuthTabCallback iAuthTabCallback, long j, long j2) {
        long j3;
        int i2 = 2 % 2;
        if (this.IAuthTabCallback_Parcel == -9223372036854775807L && this.prefetch != null) {
            int i3 = ICustomTabsService_Parcel + 49;
            access200 = i3 % 128;
            int i4 = i3 % 2;
            long jIAuthTabCallback = IAuthTabCallback(true);
            if (jIAuthTabCallback == Long.MIN_VALUE) {
                int i5 = access200 + 65;
                int i6 = i5 % 128;
                ICustomTabsService_Parcel = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 27;
                access200 = i8 % 128;
                int i9 = i8 % 2;
                j3 = 0;
            } else {
                j3 = 10000 + jIAuthTabCallback;
            }
            this.IAuthTabCallback_Parcel = j3;
            this.onMinimized.IAuthTabCallback(j3, this.prefetch, this.ICustomTabsCallback);
        }
        TextFieldSelectionStateExternalSyntheticLambda6 textFieldSelectionStateExternalSyntheticLambda6 = iAuthTabCallback.onExtraCallbackWithResult;
        BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0 = new BadgeKtExternalSyntheticLambda0(iAuthTabCallback.asInterface, iAuthTabCallback.onExtraCallback, textFieldSelectionStateExternalSyntheticLambda6.IAuthTabCallback(), textFieldSelectionStateExternalSyntheticLambda6.asBinder(), j, j2, textFieldSelectionStateExternalSyntheticLambda6.onNavigationEvent());
        long unused = iAuthTabCallback.asInterface;
        this.onRelationshipValidationResult.IAuthTabCallback(badgeKtExternalSyntheticLambda0, 1, -1, null, 0, null, iAuthTabCallback.access100, this.IAuthTabCallback_Parcel);
        this.ICustomTabsCallbackStub = true;
        ((BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback)).onWarmupCompleted(this);
    }

    public void onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback, long j, long j2, boolean z) {
        int i2 = 2 % 2;
        TextFieldSelectionStateExternalSyntheticLambda6 textFieldSelectionStateExternalSyntheticLambda6 = iAuthTabCallback.onExtraCallbackWithResult;
        BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0 = new BadgeKtExternalSyntheticLambda0(iAuthTabCallback.asInterface, iAuthTabCallback.onExtraCallback, textFieldSelectionStateExternalSyntheticLambda6.IAuthTabCallback(), textFieldSelectionStateExternalSyntheticLambda6.asBinder(), j, j2, textFieldSelectionStateExternalSyntheticLambda6.onNavigationEvent());
        long unused = iAuthTabCallback.asInterface;
        this.onRelationshipValidationResult.onNavigationEvent(badgeKtExternalSyntheticLambda0, 1, -1, null, 0, null, iAuthTabCallback.access100, this.IAuthTabCallback_Parcel);
        if (!z) {
            int i3 = access200 + 25;
            ICustomTabsService_Parcel = i3 % 128;
            int i4 = i3 % 2;
            BottomNavigationKtExternalSyntheticLambda3[] bottomNavigationKtExternalSyntheticLambda3Arr = this.newSession;
            int length = bottomNavigationKtExternalSyntheticLambda3Arr.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = ICustomTabsService_Parcel + 73;
                access200 = i6 % 128;
                if (i6 % 2 == 0) {
                    bottomNavigationKtExternalSyntheticLambda3Arr[i5].access000();
                    i5 += 24;
                } else {
                    bottomNavigationKtExternalSyntheticLambda3Arr[i5].access000();
                    i5++;
                }
                int i7 = access200 + 41;
                ICustomTabsService_Parcel = i7 % 128;
                int i8 = i7 % 2;
            }
            if (this.access000 > 0) {
                int i9 = ICustomTabsService_Parcel + 123;
                access200 = i9 % 128;
                if (i9 % 2 == 0) {
                    ((BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback)).onWarmupCompleted(this);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ((BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback)).onWarmupCompleted(this);
            }
        }
        int i10 = access200 + 87;
        ICustomTabsService_Parcel = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 17 / 0;
        }
    }

    public Loader.IAuthTabCallback IAuthTabCallback(IAuthTabCallback iAuthTabCallback, long j, long j2, IOException iOException, int i2) {
        boolean z;
        Loader.IAuthTabCallback iAuthTabCallbackOnExtraCallback;
        int i3 = 2 % 2;
        TextFieldSelectionStateExternalSyntheticLambda6 textFieldSelectionStateExternalSyntheticLambda6 = iAuthTabCallback.onExtraCallbackWithResult;
        BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0 = new BadgeKtExternalSyntheticLambda0(iAuthTabCallback.asInterface, iAuthTabCallback.onExtraCallback, textFieldSelectionStateExternalSyntheticLambda6.IAuthTabCallback(), textFieldSelectionStateExternalSyntheticLambda6.asBinder(), j, j2, textFieldSelectionStateExternalSyntheticLambda6.onNavigationEvent());
        long jOnWarmupCompleted = this.onPostMessage.onWarmupCompleted(new ComposableSingletonsScaffoldKtExternalSyntheticLambda5$onNavigationEvent(badgeKtExternalSyntheticLambda0, new BadgeKtExternalSyntheticLambda2(1, -1, null, 0, null, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(iAuthTabCallback.access100), TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(this.IAuthTabCallback_Parcel)), iOException, i2));
        if (jOnWarmupCompleted != -9223372036854775807L) {
            int iWriteTypedObject = writeTypedObject();
            if (iWriteTypedObject > this.getInterfaceDescriptor) {
                int i4 = access200 + 77;
                ICustomTabsService_Parcel = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            if (!((Boolean) onNavigationEvent(-728779384, zzgsa.onWarmupCompleted(), new Object[]{this, iAuthTabCallback, Integer.valueOf(iWriteTypedObject)}, zzgsa.onWarmupCompleted(), 728779385, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted())).booleanValue()) {
                iAuthTabCallbackOnExtraCallback = androidx.media3.exoplayer.upstream.Loader.IAuthTabCallback;
            } else {
                int i6 = ICustomTabsService_Parcel + 83;
                access200 = i6 % 128;
                if (i6 % 2 == 0) {
                    iAuthTabCallbackOnExtraCallback = androidx.media3.exoplayer.upstream.Loader.onExtraCallback(z, jOnWarmupCompleted);
                    int i7 = 85 / 0;
                } else {
                    iAuthTabCallbackOnExtraCallback = androidx.media3.exoplayer.upstream.Loader.onExtraCallback(z, jOnWarmupCompleted);
                }
            }
        } else {
            int i8 = ICustomTabsService_Parcel + 1;
            access200 = i8 % 128;
            if (i8 % 2 == 0) {
                Loader.IAuthTabCallback iAuthTabCallback2 = androidx.media3.exoplayer.upstream.Loader.onExtraCallbackWithResult;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iAuthTabCallbackOnExtraCallback = androidx.media3.exoplayer.upstream.Loader.onExtraCallbackWithResult;
        }
        boolean zOnExtraCallbackWithResult = iAuthTabCallbackOnExtraCallback.onExtraCallbackWithResult();
        this.onRelationshipValidationResult.IAuthTabCallback(badgeKtExternalSyntheticLambda0, 1, -1, null, 0, null, iAuthTabCallback.access100, this.IAuthTabCallback_Parcel, iOException, !zOnExtraCallbackWithResult);
        if (!zOnExtraCallbackWithResult) {
            long unused = iAuthTabCallback.asInterface;
        }
        return iAuthTabCallbackOnExtraCallback;
    }

    @Override // o.DrawerStateExternalSyntheticLambda1
    public ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onExtraCallbackWithResult(int i2, int i3) {
        int i4 = 2 % 2;
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnNavigationEvent = onNavigationEvent(new onExtraCallback(i2, false));
        int i5 = ICustomTabsService_Parcel + 113;
        access200 = i5 % 128;
        int i6 = i5 % 2;
        return exposedDropdownMenu_androidKtExternalSyntheticLambda5OnNavigationEvent;
    }

    @Override // o.DrawerStateExternalSyntheticLambda1
    public void onExtraCallbackWithResult() {
        int i2 = 2 % 2;
        int i3 = access200 + 25;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        this.newSessionWithExtras = true;
        this.IAuthTabCallbackStubProxy.post(this.onUnminimized);
        int i5 = ICustomTabsService_Parcel + 35;
        access200 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void onExtraCallback(BottomNavigationKtExternalSyntheticLambda4 bottomNavigationKtExternalSyntheticLambda4, ExposedDropdownMenu_androidKtExternalSyntheticLambda4 exposedDropdownMenu_androidKtExternalSyntheticLambda4) {
        int i2 = 2 % 2;
        int i3 = access200 + 57;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        bottomNavigationKtExternalSyntheticLambda4.onExtraCallbackWithResult(exposedDropdownMenu_androidKtExternalSyntheticLambda4);
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = access200 + 121;
        ICustomTabsService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.DrawerStateExternalSyntheticLambda1
    public void IAuthTabCallback(final ExposedDropdownMenu_androidKtExternalSyntheticLambda4 exposedDropdownMenu_androidKtExternalSyntheticLambda4) {
        int i2 = 2 % 2;
        this.IAuthTabCallbackStubProxy.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                BottomNavigationKtExternalSyntheticLambda4.onExtraCallback(this.f$0, exposedDropdownMenu_androidKtExternalSyntheticLambda4);
            }
        });
        int i3 = access200 + 31;
        ICustomTabsService_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 IAuthTabCallbackDefault() {
        int i2 = 2 % 2;
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnNavigationEvent = onNavigationEvent(new onExtraCallback(0, true));
        int i3 = access200 + 119;
        ICustomTabsService_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return exposedDropdownMenu_androidKtExternalSyntheticLambda5OnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.BottomNavigationKtExternalSyntheticLambda3.onWarmupCompleted
    public void IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        int i2 = 2 % 2;
        int i3 = access200 + 93;
        ICustomTabsService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Handler handler = this.IAuthTabCallbackStubProxy;
        if (i4 == 0) {
            handler.post(this.onUnminimized);
            return;
        }
        handler.post(this.onUnminimized);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(BottomNavigationKtExternalSyntheticLambda4 bottomNavigationKtExternalSyntheticLambda4) {
        int i2 = 2 % 2;
        int i3 = access200;
        int i4 = i3 + 61;
        ICustomTabsService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        bottomNavigationKtExternalSyntheticLambda4.extraCallback = true;
        int i6 = i3 + 65;
        ICustomTabsService_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 22 / 0;
        }
    }

    private void ICustomTabsCallback() {
        int i2 = 2 % 2;
        this.IAuthTabCallbackStubProxy.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BottomNavigationKtExternalSyntheticLambda4.IAuthTabCallback(this.f$0);
            }
        });
        int i3 = ICustomTabsService_Parcel + 93;
        access200 = i3 % 128;
        int i4 = i3 % 2;
    }

    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onNavigationEvent(onExtraCallback onextracallback) {
        int i2 = 2 % 2;
        int length = this.newSession.length;
        int i3 = ICustomTabsService_Parcel + 59;
        access200 = i3 % 128;
        int i4 = i3 % 2;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = access200 + 21;
            ICustomTabsService_Parcel = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                onextracallback.equals(this.newAuthTabSession[i5]);
                throw null;
            }
            if (onextracallback.equals(this.newAuthTabSession[i5])) {
                BottomNavigationKtExternalSyntheticLambda3 bottomNavigationKtExternalSyntheticLambda3 = this.newSession[i5];
                int i7 = ICustomTabsService_Parcel + 81;
                access200 = i7 % 128;
                if (i7 % 2 != 0) {
                    return bottomNavigationKtExternalSyntheticLambda3;
                }
                obj.hashCode();
                throw null;
            }
        }
        if (this.newSessionWithExtras) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("ProgressiveMediaPeriod", "Extractor added new track (id=" + onextracallback.onWarmupCompleted + ") after finishing tracks.");
            return new DrawerKtExternalSyntheticLambda6();
        }
        BottomNavigationKtExternalSyntheticLambda3 bottomNavigationKtExternalSyntheticLambda3OnNavigationEvent = BottomNavigationKtExternalSyntheticLambda3.onNavigationEvent(this.onWarmupCompleted, this.access100, this.IAuthTabCallbackDefault);
        bottomNavigationKtExternalSyntheticLambda3OnNavigationEvent.onNavigationEvent(this);
        int i8 = length + 1;
        onExtraCallback[] onextracallbackArr = (onExtraCallback[]) Arrays.copyOf(this.newAuthTabSession, i8);
        onextracallbackArr[length] = onextracallback;
        this.newAuthTabSession = (onExtraCallback[]) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(onextracallbackArr);
        BottomNavigationKtExternalSyntheticLambda3[] bottomNavigationKtExternalSyntheticLambda3Arr = (BottomNavigationKtExternalSyntheticLambda3[]) Arrays.copyOf(this.newSession, i8);
        bottomNavigationKtExternalSyntheticLambda3Arr[length] = bottomNavigationKtExternalSyntheticLambda3OnNavigationEvent;
        this.newSession = (BottomNavigationKtExternalSyntheticLambda3[]) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(bottomNavigationKtExternalSyntheticLambda3Arr);
        return bottomNavigationKtExternalSyntheticLambda3OnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onExtraCallbackWithResult(ExposedDropdownMenu_androidKtExternalSyntheticLambda4 exposedDropdownMenu_androidKtExternalSyntheticLambda4) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        this.prefetch = this.extraCallbackWithResult == null ? exposedDropdownMenu_androidKtExternalSyntheticLambda4 : new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(-9223372036854775807L);
        this.IAuthTabCallback_Parcel = exposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallback();
        if (!this.extraCallback) {
            int i4 = ICustomTabsService_Parcel + 19;
            access200 = i4 % 128;
            if (i4 % 2 == 0) {
                exposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallback();
                throw null;
            }
            z = exposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallback() == -9223372036854775807L;
        }
        this.ICustomTabsCallback = z;
        if (z) {
            int i5 = ICustomTabsService_Parcel + 79;
            access200 = i5 % 128;
            i2 = i5 % 2 == 0 ? 95 : 7;
        } else {
            i2 = 1;
        }
        this.asInterface = i2;
        if (!this.isEngagementSignalsApiAvailable) {
            readTypedObject();
        } else {
            this.onMinimized.IAuthTabCallback(this.IAuthTabCallback_Parcel, exposedDropdownMenu_androidKtExternalSyntheticLambda4, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void readTypedObject() {
        BottomNavigationKtExternalSyntheticLambda3[] bottomNavigationKtExternalSyntheticLambda3Arr;
        int length;
        boolean z;
        int i2 = 2 % 2;
        if (this.postMessage || this.isEngagementSignalsApiAvailable) {
            return;
        }
        int i3 = ICustomTabsService_Parcel;
        int i4 = i3 + 119;
        access200 = i4 % 128;
        int i5 = i4 % 2;
        if (!this.newSessionWithExtras || this.prefetch == null) {
            return;
        }
        int i6 = i3 + 125;
        access200 = i6 % 128;
        if (i6 % 2 == 0) {
            bottomNavigationKtExternalSyntheticLambda3Arr = this.newSession;
            length = bottomNavigationKtExternalSyntheticLambda3Arr.length;
        } else {
            bottomNavigationKtExternalSyntheticLambda3Arr = this.newSession;
            length = bottomNavigationKtExternalSyntheticLambda3Arr.length;
        }
        for (int i7 = 0; i7 < length; i7++) {
            if (bottomNavigationKtExternalSyntheticLambda3Arr[i7].IAuthTabCallbackStub() == null) {
                return;
            }
        }
        this.onActivityResized.onExtraCallbackWithResult();
        int length2 = this.newSession.length;
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[] coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[length2];
        boolean[] zArr = new boolean[length2];
        for (int i8 = 0; i8 < length2; i8++) {
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.newSession[i8].IAuthTabCallbackStub());
            String str = basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.isEngagementSignalsApiAvailable;
            boolean zAsBinder = AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str);
            boolean z2 = !(zAsBinder ^ true) || AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onTransact(str);
            zArr[i8] = z2;
            this.readTypedObject = z2 | this.readTypedObject;
            boolean zIAuthTabCallbackStub = AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.IAuthTabCallbackStub(str);
            if (this.requestPostMessageChannel != -9223372036854775807L) {
                int i9 = ICustomTabsService_Parcel + 49;
                access200 = i9 % 128;
                int i10 = i9 % 2;
                z = length2 == 1 && zIAuthTabCallbackStub;
            }
            this.writeTypedObject = z;
            ModalBottomSheetKtExternalSyntheticLambda11 modalBottomSheetKtExternalSyntheticLambda11 = this.extraCallbackWithResult;
            if (modalBottomSheetKtExternalSyntheticLambda11 != null) {
                if (zAsBinder || this.newAuthTabSession[i8].onExtraCallback) {
                    HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0 = basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.ICustomTabsCallbackDefault;
                    basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.onExtraCallback().onExtraCallbackWithResult(handwritingHandlerNodeExternalSyntheticLambda0 == null ? new HandwritingHandlerNodeExternalSyntheticLambda0(new HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback[]{modalBottomSheetKtExternalSyntheticLambda11}) : handwritingHandlerNodeExternalSyntheticLambda0.onWarmupCompleted(new HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback[]{modalBottomSheetKtExternalSyntheticLambda11})).onNavigationEvent();
                }
                if (zAsBinder) {
                    int i11 = access200 + 101;
                    ICustomTabsService_Parcel = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 47 / 0;
                        if (basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.onExtraCallbackWithResult == -1) {
                            int i13 = ICustomTabsService_Parcel + 5;
                            access200 = i13 % 128;
                            if (i13 % 2 == 0) {
                                int i14 = basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.ICustomTabsCallbackStub;
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            if (basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.ICustomTabsCallbackStub == -1 && modalBottomSheetKtExternalSyntheticLambda11.onWarmupCompleted != -1) {
                                basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.onExtraCallback().onNavigationEvent(modalBottomSheetKtExternalSyntheticLambda11.onWarmupCompleted).onNavigationEvent();
                            }
                        } else {
                            continue;
                        }
                    } else if (basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.onExtraCallbackWithResult != -1) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback = basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.IAuthTabCallback(this.access100.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent));
            coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr[i8] = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1(Integer.toString(i8), new BasicTextContextMenuProviderKtExternalSyntheticLambda4[]{basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback});
            this.ICustomTabsService = basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback.extraCallback | this.ICustomTabsService;
        }
        this.setEngagementSignalsCallback = new onWarmupCompleted(new BottomSheetScaffoldKtExternalSyntheticLambda11(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr), zArr);
        if (this.writeTypedObject && this.IAuthTabCallback_Parcel == -9223372036854775807L) {
            this.IAuthTabCallback_Parcel = this.requestPostMessageChannel;
            this.prefetch = new ExposedDropdownMenuBoxScopeExternalSyntheticLambda0(this.prefetch) { // from class: o.BottomNavigationKtExternalSyntheticLambda4.3
                @Override // o.ExposedDropdownMenuBoxScopeExternalSyntheticLambda0, o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
                public long onExtraCallback() {
                    return BottomNavigationKtExternalSyntheticLambda4.asInterface(BottomNavigationKtExternalSyntheticLambda4.this);
                }
            };
        }
        this.onMinimized.IAuthTabCallback(this.IAuthTabCallback_Parcel, this.prefetch, this.ICustomTabsCallback);
        this.isEngagementSignalsApiAvailable = true;
        ((BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback)).IAuthTabCallback(this);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        BottomNavigationKtExternalSyntheticLambda4 bottomNavigationKtExternalSyntheticLambda4 = (BottomNavigationKtExternalSyntheticLambda4) objArr[0];
        int i2 = 2 % 2;
        IAuthTabCallback iAuthTabCallback = bottomNavigationKtExternalSyntheticLambda4.new IAuthTabCallback(bottomNavigationKtExternalSyntheticLambda4.updateVisuals, bottomNavigationKtExternalSyntheticLambda4.onTransact, bottomNavigationKtExternalSyntheticLambda4.mayLaunchUrl, bottomNavigationKtExternalSyntheticLambda4, bottomNavigationKtExternalSyntheticLambda4.onActivityResized);
        if (bottomNavigationKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable) {
            int i3 = ICustomTabsService_Parcel + 69;
            access200 = i3 % 128;
            int i4 = i3 % 2;
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(bottomNavigationKtExternalSyntheticLambda4.extraCallbackWithResult());
            long j = bottomNavigationKtExternalSyntheticLambda4.IAuthTabCallback_Parcel;
            if (j != -9223372036854775807L) {
                int i5 = ICustomTabsService_Parcel + 97;
                access200 = i5 % 128;
                if (i5 % 2 == 0) {
                    long j2 = bottomNavigationKtExternalSyntheticLambda4.ICustomTabsCallback_Parcel;
                    throw null;
                }
                if (bottomNavigationKtExternalSyntheticLambda4.ICustomTabsCallback_Parcel > j) {
                    bottomNavigationKtExternalSyntheticLambda4.ICustomTabsCallbackStub = true;
                    bottomNavigationKtExternalSyntheticLambda4.ICustomTabsCallback_Parcel = -9223372036854775807L;
                    return null;
                }
            }
            iAuthTabCallback.onWarmupCompleted(((ExposedDropdownMenu_androidKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(bottomNavigationKtExternalSyntheticLambda4.prefetch)).onExtraCallback(bottomNavigationKtExternalSyntheticLambda4.ICustomTabsCallback_Parcel).IAuthTabCallback.onNavigationEvent, bottomNavigationKtExternalSyntheticLambda4.ICustomTabsCallback_Parcel);
            for (BottomNavigationKtExternalSyntheticLambda3 bottomNavigationKtExternalSyntheticLambda3 : bottomNavigationKtExternalSyntheticLambda4.newSession) {
                bottomNavigationKtExternalSyntheticLambda3.onExtraCallbackWithResult(bottomNavigationKtExternalSyntheticLambda4.ICustomTabsCallback_Parcel);
            }
            bottomNavigationKtExternalSyntheticLambda4.ICustomTabsCallback_Parcel = -9223372036854775807L;
        }
        bottomNavigationKtExternalSyntheticLambda4.getInterfaceDescriptor = bottomNavigationKtExternalSyntheticLambda4.writeTypedObject();
        bottomNavigationKtExternalSyntheticLambda4.onActivityLayout.onWarmupCompleted(iAuthTabCallback, bottomNavigationKtExternalSyntheticLambda4, bottomNavigationKtExternalSyntheticLambda4.onPostMessage.IAuthTabCallback(bottomNavigationKtExternalSyntheticLambda4.asInterface));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        BottomNavigationKtExternalSyntheticLambda4 bottomNavigationKtExternalSyntheticLambda4 = (BottomNavigationKtExternalSyntheticLambda4) objArr[0];
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 27;
        access200 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 28 / 0;
            if (!bottomNavigationKtExternalSyntheticLambda4.extraCallback) {
                ExposedDropdownMenu_androidKtExternalSyntheticLambda4 exposedDropdownMenu_androidKtExternalSyntheticLambda4 = bottomNavigationKtExternalSyntheticLambda4.prefetch;
                if (exposedDropdownMenu_androidKtExternalSyntheticLambda4 == null || exposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallback() == -9223372036854775807L) {
                    if (bottomNavigationKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable) {
                        int i5 = ICustomTabsService_Parcel + 35;
                        access200 = i5 % 128;
                        if (i5 % 2 == 0) {
                            bottomNavigationKtExternalSyntheticLambda4.onActivityLayout();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (!bottomNavigationKtExternalSyntheticLambda4.onActivityLayout()) {
                            bottomNavigationKtExternalSyntheticLambda4.extraCommand = true;
                            return false;
                        }
                    }
                    bottomNavigationKtExternalSyntheticLambda4.ICustomTabsCallbackDefault = bottomNavigationKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable;
                    bottomNavigationKtExternalSyntheticLambda4.onMessageChannelReady = 0L;
                    bottomNavigationKtExternalSyntheticLambda4.getInterfaceDescriptor = 0;
                    for (BottomNavigationKtExternalSyntheticLambda3 bottomNavigationKtExternalSyntheticLambda3 : bottomNavigationKtExternalSyntheticLambda4.newSession) {
                        bottomNavigationKtExternalSyntheticLambda3.access000();
                    }
                    iAuthTabCallback.onWarmupCompleted(0L, 0L);
                    return true;
                }
            }
        } else if (!bottomNavigationKtExternalSyntheticLambda4.extraCallback) {
        }
        bottomNavigationKtExternalSyntheticLambda4.getInterfaceDescriptor = iIntValue;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean IAuthTabCallback(boolean[] zArr, long j, boolean z) {
        int length;
        int i2;
        boolean zOnExtraCallbackWithResult;
        int i3 = 2 % 2;
        int i4 = access200 + 119;
        ICustomTabsService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            length = this.newSession.length;
            i2 = 1;
        } else {
            length = this.newSession.length;
            i2 = 0;
        }
        while (i2 < length) {
            BottomNavigationKtExternalSyntheticLambda3 bottomNavigationKtExternalSyntheticLambda3 = this.newSession[i2];
            if (bottomNavigationKtExternalSyntheticLambda3.onExtraCallbackWithResult() == 0) {
                int i5 = access200 + 109;
                ICustomTabsService_Parcel = i5 % 128;
                int i6 = i5 % 2;
                if (!z) {
                    if (this.writeTypedObject) {
                        zOnExtraCallbackWithResult = bottomNavigationKtExternalSyntheticLambda3.onExtraCallbackWithResult(bottomNavigationKtExternalSyntheticLambda3.IAuthTabCallback());
                    } else {
                        zOnExtraCallbackWithResult = bottomNavigationKtExternalSyntheticLambda3.onExtraCallbackWithResult(j, this.ICustomTabsCallbackStub);
                    }
                    if (!zOnExtraCallbackWithResult && (zArr[i2] || !this.readTypedObject)) {
                        return false;
                    }
                } else {
                    continue;
                }
            }
            i2++;
        }
        return true;
    }

    private int writeTypedObject() {
        BottomNavigationKtExternalSyntheticLambda3[] bottomNavigationKtExternalSyntheticLambda3Arr;
        int length;
        int i2;
        int i3 = 2 % 2;
        int i4 = ICustomTabsService_Parcel + 85;
        access200 = i4 % 128;
        if (i4 % 2 == 0) {
            bottomNavigationKtExternalSyntheticLambda3Arr = this.newSession;
            length = bottomNavigationKtExternalSyntheticLambda3Arr.length;
            i2 = 1;
        } else {
            bottomNavigationKtExternalSyntheticLambda3Arr = this.newSession;
            length = bottomNavigationKtExternalSyntheticLambda3Arr.length;
            i2 = 0;
        }
        int iAsBinder = i2;
        while (i2 < length) {
            int i5 = ICustomTabsService_Parcel + 67;
            access200 = i5 % 128;
            int i6 = i5 % 2;
            iAsBinder += bottomNavigationKtExternalSyntheticLambda3Arr[i2].asBinder();
            i2++;
        }
        int i7 = ICustomTabsService_Parcel + 97;
        access200 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 49 / 0;
        }
        return iAsBinder;
    }

    private long IAuthTabCallback(boolean z) {
        int i2 = 2 % 2;
        long jMax = Long.MIN_VALUE;
        for (int i3 = 0; i3 < this.newSession.length; i3++) {
            if (z || ((onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.setEngagementSignalsCallback)).onExtraCallbackWithResult[i3]) {
                jMax = Math.max(jMax, this.newSession[i3].onWarmupCompleted());
                int i4 = access200 + 67;
                ICustomTabsService_Parcel = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        int i6 = ICustomTabsService_Parcel + 123;
        access200 = i6 % 128;
        int i7 = i6 % 2;
        return jMax;
    }

    private boolean extraCallbackWithResult() {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 57;
        int i4 = i3 % 128;
        access200 = i4;
        int i5 = i3 % 2;
        if (this.ICustomTabsCallback_Parcel == -9223372036854775807L) {
            return false;
        }
        int i6 = i4 + 65;
        ICustomTabsService_Parcel = i6 % 128;
        return i6 % 2 == 0;
    }

    @EnsuresNonNull
    private void access000() {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService_Parcel + 117;
        access200 = i3 % 128;
        int i4 = i3 % 2;
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.isEngagementSignalsApiAvailable);
        int i5 = access200 + 39;
        ICustomTabsService_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
    }

    final class onExtraCallbackWithResult implements BottomNavigationKtExternalSyntheticLambda5 {
        private final int onWarmupCompleted;

        public onExtraCallbackWithResult(int i2) {
            this.onWarmupCompleted = i2;
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda5
        public boolean onWarmupCompleted() {
            return BottomNavigationKtExternalSyntheticLambda4.this.onNavigationEvent(this.onWarmupCompleted);
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda5
        public void onExtraCallbackWithResult() throws IOException {
            BottomNavigationKtExternalSyntheticLambda4.this.onExtraCallbackWithResult(this.onWarmupCompleted);
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda5
        public int onNavigationEvent(AndroidSelectionHandles_androidKtExternalSyntheticLambda7 androidSelectionHandles_androidKtExternalSyntheticLambda7, SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2, int i2) {
            return BottomNavigationKtExternalSyntheticLambda4.this.onExtraCallback(this.onWarmupCompleted, androidSelectionHandles_androidKtExternalSyntheticLambda7, selectionControllerExternalSyntheticLambda2, i2);
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda5
        public int onExtraCallbackWithResult(long j) {
            return BottomNavigationKtExternalSyntheticLambda4.this.onExtraCallbackWithResult(this.onWarmupCompleted, j);
        }
    }

    final class IAuthTabCallback implements Loader.onNavigationEvent, BackdropScaffoldStateCompanionExternalSyntheticLambda1.onWarmupCompleted {
        private final DrawerStateExternalSyntheticLambda1 IAuthTabCallback;
        private volatile boolean IAuthTabCallbackStub;
        private final Uri IAuthTabCallbackStubProxy;
        private boolean access000;
        private long access100;
        private final TextFieldCoreModifierNodeExternalSyntheticLambda2 asBinder;
        private final BottomNavigationKtExternalSyntheticLambda1 getInterfaceDescriptor;
        private final TextFieldSelectionStateExternalSyntheticLambda6 onExtraCallbackWithResult;
        private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onNavigationEvent;
        private final ExposedDropdownMenuDefaultsExternalSyntheticLambda3 onTransact = new ExposedDropdownMenuDefaultsExternalSyntheticLambda3();
        private boolean IAuthTabCallbackDefault = true;
        private final long asInterface = BadgeKtExternalSyntheticLambda0.onExtraCallback();
        private TextFieldSelectionStateExternalSyntheticLambda12 onExtraCallback = onWarmupCompleted(0);

        public IAuthTabCallback(Uri uri, TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, BottomNavigationKtExternalSyntheticLambda1 bottomNavigationKtExternalSyntheticLambda1, DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, TextFieldCoreModifierNodeExternalSyntheticLambda2 textFieldCoreModifierNodeExternalSyntheticLambda2) {
            this.IAuthTabCallbackStubProxy = uri;
            this.onExtraCallbackWithResult = new TextFieldSelectionStateExternalSyntheticLambda6(textFieldSelectionStateExternalSyntheticLambda0);
            this.getInterfaceDescriptor = bottomNavigationKtExternalSyntheticLambda1;
            this.IAuthTabCallback = drawerStateExternalSyntheticLambda1;
            this.asBinder = textFieldCoreModifierNodeExternalSyntheticLambda2;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.onNavigationEvent
        public void IAuthTabCallback() {
            this.IAuthTabCallbackStub = true;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.onNavigationEvent
        public void IAuthTabCallbackDefault() throws IOException {
            int iOnExtraCallbackWithResult = 0;
            while (iOnExtraCallbackWithResult == 0 && !this.IAuthTabCallbackStub) {
                try {
                    long j = this.onTransact.onWarmupCompleted;
                    TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12OnWarmupCompleted = onWarmupCompleted(j);
                    this.onExtraCallback = textFieldSelectionStateExternalSyntheticLambda12OnWarmupCompleted;
                    long jOnNavigationEvent = this.onExtraCallbackWithResult.onNavigationEvent(textFieldSelectionStateExternalSyntheticLambda12OnWarmupCompleted);
                    if (!this.IAuthTabCallbackStub) {
                        if (jOnNavigationEvent != -1) {
                            jOnNavigationEvent += j;
                            BottomNavigationKtExternalSyntheticLambda4.onNavigationEvent(503171094, zzgsa.onWarmupCompleted(), new Object[]{BottomNavigationKtExternalSyntheticLambda4.this}, zzgsa.onWarmupCompleted(), -503171089, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
                        }
                        long j2 = jOnNavigationEvent;
                        BasicTextContextMenuProviderKtExternalSyntheticLambda0 backdropScaffoldStateCompanionExternalSyntheticLambda1 = this.onExtraCallbackWithResult;
                        if (((ModalBottomSheetKtExternalSyntheticLambda11) BottomNavigationKtExternalSyntheticLambda4.onNavigationEvent(463221443, zzgsa.onWarmupCompleted(), new Object[]{BottomNavigationKtExternalSyntheticLambda4.this}, zzgsa.onWarmupCompleted(), -463221439, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted())) != null) {
                            if (((ModalBottomSheetKtExternalSyntheticLambda11) BottomNavigationKtExternalSyntheticLambda4.onNavigationEvent(463221443, zzgsa.onWarmupCompleted(), new Object[]{BottomNavigationKtExternalSyntheticLambda4.this}, zzgsa.onWarmupCompleted(), -463221439, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted())).onNavigationEvent != -1) {
                                backdropScaffoldStateCompanionExternalSyntheticLambda1 = new BackdropScaffoldStateCompanionExternalSyntheticLambda1(this.onExtraCallbackWithResult, ((ModalBottomSheetKtExternalSyntheticLambda11) BottomNavigationKtExternalSyntheticLambda4.onNavigationEvent(463221443, zzgsa.onWarmupCompleted(), new Object[]{BottomNavigationKtExternalSyntheticLambda4.this}, zzgsa.onWarmupCompleted(), -463221439, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted())).onNavigationEvent, this);
                                ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5IAuthTabCallbackDefault = BottomNavigationKtExternalSyntheticLambda4.this.IAuthTabCallbackDefault();
                                this.onNavigationEvent = exposedDropdownMenu_androidKtExternalSyntheticLambda5IAuthTabCallbackDefault;
                                exposedDropdownMenu_androidKtExternalSyntheticLambda5IAuthTabCallbackDefault.onExtraCallbackWithResult(BottomNavigationKtExternalSyntheticLambda4.asBinder());
                            }
                        }
                        long jIAuthTabCallback = j;
                        this.getInterfaceDescriptor.onWarmupCompleted(backdropScaffoldStateCompanionExternalSyntheticLambda1, this.IAuthTabCallbackStubProxy, this.onExtraCallbackWithResult.onExtraCallbackWithResult(), j, j2, this.IAuthTabCallback);
                        if (((ModalBottomSheetKtExternalSyntheticLambda11) BottomNavigationKtExternalSyntheticLambda4.onNavigationEvent(463221443, zzgsa.onWarmupCompleted(), new Object[]{BottomNavigationKtExternalSyntheticLambda4.this}, zzgsa.onWarmupCompleted(), -463221439, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted())) != null) {
                            this.getInterfaceDescriptor.onExtraCallback();
                        }
                        if (this.IAuthTabCallbackDefault) {
                            this.getInterfaceDescriptor.onWarmupCompleted(jIAuthTabCallback, this.access100);
                            this.IAuthTabCallbackDefault = false;
                        }
                        while (true) {
                            long j3 = jIAuthTabCallback;
                            while (iOnExtraCallbackWithResult == 0 && !this.IAuthTabCallbackStub) {
                                try {
                                    this.asBinder.onExtraCallback();
                                    iOnExtraCallbackWithResult = this.getInterfaceDescriptor.onExtraCallbackWithResult(this.onTransact);
                                    jIAuthTabCallback = this.getInterfaceDescriptor.IAuthTabCallback();
                                    if (jIAuthTabCallback > BottomNavigationKtExternalSyntheticLambda4.onExtraCallbackWithResult(BottomNavigationKtExternalSyntheticLambda4.this) + j3) {
                                        break;
                                    }
                                } catch (InterruptedException unused) {
                                    throw new InterruptedIOException();
                                }
                            }
                            this.asBinder.onExtraCallbackWithResult();
                            ((Handler) BottomNavigationKtExternalSyntheticLambda4.onNavigationEvent(-538009571, zzgsa.onWarmupCompleted(), new Object[]{BottomNavigationKtExternalSyntheticLambda4.this}, zzgsa.onWarmupCompleted(), 538009573, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted())).post(BottomNavigationKtExternalSyntheticLambda4.onWarmupCompleted(BottomNavigationKtExternalSyntheticLambda4.this));
                        }
                        if (iOnExtraCallbackWithResult == 1) {
                            iOnExtraCallbackWithResult = 0;
                        } else if (this.getInterfaceDescriptor.IAuthTabCallback() != -1) {
                            this.onTransact.onWarmupCompleted = this.getInterfaceDescriptor.IAuthTabCallback();
                        }
                        TextFieldSelectionStateExternalSyntheticLambda5.IAuthTabCallback(this.onExtraCallbackWithResult);
                    } else {
                        if (iOnExtraCallbackWithResult != 1 && this.getInterfaceDescriptor.IAuthTabCallback() != -1) {
                            this.onTransact.onWarmupCompleted = this.getInterfaceDescriptor.IAuthTabCallback();
                        }
                        TextFieldSelectionStateExternalSyntheticLambda5.IAuthTabCallback(this.onExtraCallbackWithResult);
                        return;
                    }
                } catch (Throwable th) {
                    if (iOnExtraCallbackWithResult != 1 && this.getInterfaceDescriptor.IAuthTabCallback() != -1) {
                        this.onTransact.onWarmupCompleted = this.getInterfaceDescriptor.IAuthTabCallback();
                    }
                    TextFieldSelectionStateExternalSyntheticLambda5.IAuthTabCallback(this.onExtraCallbackWithResult);
                    throw th;
                }
            }
        }

        @Override // o.BackdropScaffoldStateCompanionExternalSyntheticLambda1.onWarmupCompleted
        public void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
            long jMax;
            if (!this.access000) {
                jMax = this.access100;
            } else {
                jMax = Math.max(BottomNavigationKtExternalSyntheticLambda4.onExtraCallbackWithResult(BottomNavigationKtExternalSyntheticLambda4.this, true), this.access100);
            }
            int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent();
            ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5 = (ExposedDropdownMenu_androidKtExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent);
            exposedDropdownMenu_androidKtExternalSyntheticLambda5.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnNavigationEvent);
            exposedDropdownMenu_androidKtExternalSyntheticLambda5.onExtraCallback(jMax, 1, iOnNavigationEvent, 0, null);
            this.access000 = true;
        }

        private TextFieldSelectionStateExternalSyntheticLambda12 onWarmupCompleted(long j) {
            return new TextFieldSelectionStateExternalSyntheticLambda12.onExtraCallback().IAuthTabCallback(this.IAuthTabCallbackStubProxy).onExtraCallbackWithResult(j).onNavigationEvent(BottomNavigationKtExternalSyntheticLambda4.IAuthTabCallbackStub(BottomNavigationKtExternalSyntheticLambda4.this)).onExtraCallbackWithResult(6).onNavigationEvent(BottomNavigationKtExternalSyntheticLambda4.asInterface()).onExtraCallbackWithResult();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onWarmupCompleted(long j, long j2) {
            this.onTransact.onWarmupCompleted = j;
            this.access100 = j2;
            this.IAuthTabCallbackDefault = true;
            this.access000 = false;
        }
    }

    static final class onWarmupCompleted {
        public final boolean[] onExtraCallback;
        public final boolean[] onExtraCallbackWithResult;
        public final BottomSheetScaffoldKtExternalSyntheticLambda11 onNavigationEvent;
        public final boolean[] onWarmupCompleted;

        public onWarmupCompleted(BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11, boolean[] zArr) {
            this.onNavigationEvent = bottomSheetScaffoldKtExternalSyntheticLambda11;
            this.onWarmupCompleted = zArr;
            int i2 = bottomSheetScaffoldKtExternalSyntheticLambda11.onExtraCallbackWithResult;
            this.onExtraCallbackWithResult = new boolean[i2];
            this.onExtraCallback = new boolean[i2];
        }
    }

    static final class onExtraCallback {
        public final boolean onExtraCallback;
        public final int onWarmupCompleted;

        public onExtraCallback(int i2, boolean z) {
            this.onWarmupCompleted = i2;
            this.onExtraCallback = z;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || onExtraCallback.class != obj.getClass()) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            return this.onWarmupCompleted == onextracallback.onWarmupCompleted && this.onExtraCallback == onextracallback.onExtraCallback;
        }

        public int hashCode() {
            return (this.onWarmupCompleted * 31) + (this.onExtraCallback ? 1 : 0);
        }
    }

    private static Map<String, String> access100() throws Throwable {
        int i2 = 2 % 2;
        HashMap map = new HashMap();
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-127}, 127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
        map.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, ((String) objArr[0]).intern());
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        int i3 = ICustomTabsService_Parcel + 1;
        access200 = i3 % 128;
        if (i3 % 2 != 0) {
            return mapUnmodifiableMap;
        }
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Handler onTransact(BottomNavigationKtExternalSyntheticLambda4 bottomNavigationKtExternalSyntheticLambda4) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        return (Handler) onNavigationEvent(-538009571, zzgsa.onWarmupCompleted(), new Object[]{bottomNavigationKtExternalSyntheticLambda4}, iOnWarmupCompleted2, 538009573, iOnWarmupCompleted, zzgsa.onWarmupCompleted());
    }

    static /* synthetic */ void IAuthTabCallbackDefault(BottomNavigationKtExternalSyntheticLambda4 bottomNavigationKtExternalSyntheticLambda4) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        onNavigationEvent(503171094, zzgsa.onWarmupCompleted(), new Object[]{bottomNavigationKtExternalSyntheticLambda4}, iOnWarmupCompleted2, -503171089, iOnWarmupCompleted, zzgsa.onWarmupCompleted());
    }

    static /* synthetic */ ModalBottomSheetKtExternalSyntheticLambda11 asBinder(BottomNavigationKtExternalSyntheticLambda4 bottomNavigationKtExternalSyntheticLambda4) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        return (ModalBottomSheetKtExternalSyntheticLambda11) onNavigationEvent(463221443, zzgsa.onWarmupCompleted(), new Object[]{bottomNavigationKtExternalSyntheticLambda4}, iOnWarmupCompleted2, -463221439, iOnWarmupCompleted, zzgsa.onWarmupCompleted());
    }

    static /* synthetic */ ModalBottomSheetKtExternalSyntheticLambda11 IAuthTabCallback(BottomNavigationKtExternalSyntheticLambda4 bottomNavigationKtExternalSyntheticLambda4, ModalBottomSheetKtExternalSyntheticLambda11 modalBottomSheetKtExternalSyntheticLambda11) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        return (ModalBottomSheetKtExternalSyntheticLambda11) onNavigationEvent(1095343887, zzgsa.onWarmupCompleted(), new Object[]{bottomNavigationKtExternalSyntheticLambda4, modalBottomSheetKtExternalSyntheticLambda11}, iOnWarmupCompleted2, -1095343887, iOnWarmupCompleted, zzgsa.onWarmupCompleted());
    }

    private boolean IAuthTabCallback(IAuthTabCallback iAuthTabCallback, int i2) {
        Object[] objArr = {this, iAuthTabCallback, Integer.valueOf(i2)};
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return ((Boolean) onNavigationEvent(-728779384, zzgsa.onWarmupCompleted(), objArr, zzgsa.onWarmupCompleted(), 728779385, iOnWarmupCompleted, zzgsa.onWarmupCompleted())).booleanValue();
    }

    private void extraCallback() {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        onNavigationEvent(564577300, zzgsa.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted2, -564577297, iOnWarmupCompleted, zzgsa.onWarmupCompleted());
    }

    static void getInterfaceDescriptor() {
        validateRelationship = new char[]{32737};
        ICustomTabsServiceDefault = -1184333870;
        ICustomTabsServiceStub = true;
        warmup = true;
    }
}
