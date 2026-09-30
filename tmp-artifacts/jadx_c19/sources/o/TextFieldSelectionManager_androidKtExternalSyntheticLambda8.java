package o;

import android.graphics.Color;
import android.net.Uri;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.internal.ads.zzgsa;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o.AlertDialogKtExternalSyntheticLambda6;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.TextFieldSelectionManager_androidKtExternalSyntheticLambda4;
import o.TextFieldSelectionManager_androidKtExternalSyntheticLambda8;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldSelectionManager_androidKtExternalSyntheticLambda8 implements BottomDrawerStateCompanionExternalSyntheticLambda1, HlsPlaylistTracker.onExtraCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] ICustomTabsCallbackDefault = {27257, 27173, 27179, 27177};
    private static int ICustomTabsCallbackStub = 1;
    private static int onUnminimized;
    private final ComposableSingletonsScaffoldKtExternalSyntheticLambda0 IAuthTabCallback;
    private final SelectionRegistrarImplExternalSyntheticLambda0 IAuthTabCallbackStub;
    private final BottomNavigationKtExternalSyntheticLambda0$onExtraCallback IAuthTabCallback_Parcel;
    private int ICustomTabsCallback;
    private final boolean ICustomTabsCallbackStubProxy;
    private final TextFieldSelectionManager_androidKtExternalSyntheticLambda11 access000;
    private BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted access100;
    private final SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted asBinder;
    private final BackdropScaffoldKtExternalSyntheticLambda3 asInterface;
    private final HlsPlaylistTracker extraCallback;
    private final TextFieldSelectionStateExternalSyntheticLambda7 extraCallbackWithResult;
    private final ComposableSingletonsScaffoldKtExternalSyntheticLambda5 getInterfaceDescriptor;
    private int onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final long onMessageChannelReady;
    private BottomNavigationKtExternalSyntheticLambda8 onNavigationEvent;
    private BottomSheetScaffoldKtExternalSyntheticLambda11 onRelationshipValidationResult;
    private final TextFieldSelectionManagerKtExternalSyntheticLambda4 onTransact;
    private final ComposableSingletonsScaffoldKtExternalSyntheticLambda3 onWarmupCompleted;
    private final SelectionManagerExternalSyntheticLambda12 readTypedObject;
    private final int writeTypedObject;
    private final TextFieldSelectionManager_androidKtExternalSyntheticLambda4.onWarmupCompleted onMinimized = new onExtraCallbackWithResult();
    private final IdentityHashMap<BottomNavigationKtExternalSyntheticLambda5, Integer> onActivityResized = new IdentityHashMap<>();
    private final AlertDialogKtExternalSyntheticLambda2 onActivityLayout = new AlertDialogKtExternalSyntheticLambda2();
    private TextFieldSelectionManager_androidKtExternalSyntheticLambda4[] onPostMessage = new TextFieldSelectionManager_androidKtExternalSyntheticLambda4[0];
    private TextFieldSelectionManager_androidKtExternalSyntheticLambda4[] IAuthTabCallbackDefault = new TextFieldSelectionManager_androidKtExternalSyntheticLambda4[0];
    private int[][] IAuthTabCallbackStubProxy = new int[0][];

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i4;
        int i9 = ~(i8 | i5);
        int i10 = ~i5;
        int i11 = i9 | (~(i10 | i2));
        int i12 = ~(i10 | i4);
        int i13 = i11 | i12;
        int i14 = ~i2;
        int i15 = i12 | (~(i14 | i4));
        int i16 = (~(i5 | i8 | i14)) | (~(i14 | i10 | i4));
        int i17 = i2 + i4 + i3 + ((-1369571145) * i7) + ((-720088171) * i6);
        int i18 = i17 * i17;
        int i19 = (((-954023988) * i2) - 252706816) + ((-260227018) * i4) + ((-346898485) * i13) + (i15 * 346898485) + (346898485 * i16) + ((-607125504) * i3) + (565182464 * i7) + (1611661312 * i6) + ((-409206784) * i18);
        int i20 = ((i2 * (-1931095572)) - 2087550970) + (i4 * (-1931094842)) + (i13 * (-365)) + (i15 * 365) + (i16 * 365) + (i3 * (-1931095207)) + (i7 * (-789048161)) + (i6 * 356376013) + (i18 * 423362560);
        return i19 + ((i20 * i20) * (-1901854720)) != 1 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public long IAuthTabCallbackStub() {
        int i2 = 2 % 2;
        int i3 = onUnminimized + 23;
        int i4 = i3 % 128;
        ICustomTabsCallbackStub = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 11;
        onUnminimized = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 60 / 0;
        }
        return -9223372036854775807L;
    }

    static /* synthetic */ HlsPlaylistTracker IAuthTabCallback(TextFieldSelectionManager_androidKtExternalSyntheticLambda8 textFieldSelectionManager_androidKtExternalSyntheticLambda8) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStub + 33;
        int i4 = i3 % 128;
        onUnminimized = i4;
        int i5 = i3 % 2;
        HlsPlaylistTracker hlsPlaylistTracker = textFieldSelectionManager_androidKtExternalSyntheticLambda8.extraCallback;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 69;
        ICustomTabsCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 70 / 0;
        }
        return hlsPlaylistTracker;
    }

    static /* synthetic */ int onExtraCallback(TextFieldSelectionManager_androidKtExternalSyntheticLambda8 textFieldSelectionManager_androidKtExternalSyntheticLambda8) {
        int i2 = 2 % 2;
        int i3 = onUnminimized + 59;
        int i4 = i3 % 128;
        ICustomTabsCallbackStub = i4;
        int i5 = i3 % 2;
        int i6 = textFieldSelectionManager_androidKtExternalSyntheticLambda8.ICustomTabsCallback - 1;
        textFieldSelectionManager_androidKtExternalSyntheticLambda8.ICustomTabsCallback = i6;
        int i7 = i4 + 115;
        onUnminimized = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    static /* synthetic */ BottomSheetScaffoldKtExternalSyntheticLambda11 onExtraCallbackWithResult(TextFieldSelectionManager_androidKtExternalSyntheticLambda8 textFieldSelectionManager_androidKtExternalSyntheticLambda8, BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStub + 53;
        int i4 = i3 % 128;
        onUnminimized = i4;
        int i5 = i3 % 2;
        textFieldSelectionManager_androidKtExternalSyntheticLambda8.onRelationshipValidationResult = bottomSheetScaffoldKtExternalSyntheticLambda11;
        int i6 = i4 + 77;
        ICustomTabsCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            return bottomSheetScaffoldKtExternalSyntheticLambda11;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ TextFieldSelectionManager_androidKtExternalSyntheticLambda4[] onNavigationEvent(TextFieldSelectionManager_androidKtExternalSyntheticLambda8 textFieldSelectionManager_androidKtExternalSyntheticLambda8) {
        int i2 = 2 % 2;
        int i3 = onUnminimized + 79;
        int i4 = i3 % 128;
        ICustomTabsCallbackStub = i4;
        int i5 = i3 % 2;
        TextFieldSelectionManager_androidKtExternalSyntheticLambda4[] textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr = textFieldSelectionManager_androidKtExternalSyntheticLambda8.onPostMessage;
        int i6 = i4 + 53;
        onUnminimized = i6 % 128;
        if (i6 % 2 == 0) {
            return textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr;
        }
        throw null;
    }

    static /* synthetic */ BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted onWarmupCompleted(TextFieldSelectionManager_androidKtExternalSyntheticLambda8 textFieldSelectionManager_androidKtExternalSyntheticLambda8) {
        int i2 = 2 % 2;
        int i3 = onUnminimized + 23;
        int i4 = i3 % 128;
        ICustomTabsCallbackStub = i4;
        int i5 = i3 % 2;
        BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted = textFieldSelectionManager_androidKtExternalSyntheticLambda8.access100;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 97;
        onUnminimized = i6 % 128;
        int i7 = i6 % 2;
        return bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted;
    }

    public TextFieldSelectionManager_androidKtExternalSyntheticLambda8(TextFieldSelectionManager_androidKtExternalSyntheticLambda11 textFieldSelectionManager_androidKtExternalSyntheticLambda11, HlsPlaylistTracker hlsPlaylistTracker, TextFieldSelectionManagerKtExternalSyntheticLambda4 textFieldSelectionManagerKtExternalSyntheticLambda4, @Nullable TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7, @Nullable ComposableSingletonsScaffoldKtExternalSyntheticLambda0 composableSingletonsScaffoldKtExternalSyntheticLambda0, SelectionRegistrarImplExternalSyntheticLambda0 selectionRegistrarImplExternalSyntheticLambda0, SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted, ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5, BottomNavigationKtExternalSyntheticLambda0$onExtraCallback bottomNavigationKtExternalSyntheticLambda0$onExtraCallback, ComposableSingletonsScaffoldKtExternalSyntheticLambda3 composableSingletonsScaffoldKtExternalSyntheticLambda3, BackdropScaffoldKtExternalSyntheticLambda3 backdropScaffoldKtExternalSyntheticLambda3, boolean z, int i2, boolean z2, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12, long j) {
        this.access000 = textFieldSelectionManager_androidKtExternalSyntheticLambda11;
        this.extraCallback = hlsPlaylistTracker;
        this.onTransact = textFieldSelectionManagerKtExternalSyntheticLambda4;
        this.extraCallbackWithResult = textFieldSelectionStateExternalSyntheticLambda7;
        this.IAuthTabCallback = composableSingletonsScaffoldKtExternalSyntheticLambda0;
        this.IAuthTabCallbackStub = selectionRegistrarImplExternalSyntheticLambda0;
        this.asBinder = selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted;
        this.getInterfaceDescriptor = composableSingletonsScaffoldKtExternalSyntheticLambda5;
        this.IAuthTabCallback_Parcel = bottomNavigationKtExternalSyntheticLambda0$onExtraCallback;
        this.onWarmupCompleted = composableSingletonsScaffoldKtExternalSyntheticLambda3;
        this.asInterface = backdropScaffoldKtExternalSyntheticLambda3;
        this.onExtraCallbackWithResult = z;
        this.writeTypedObject = i2;
        this.ICustomTabsCallbackStubProxy = z2;
        this.readTypedObject = selectionManagerExternalSyntheticLambda12;
        this.onMessageChannelReady = j;
        this.onNavigationEvent = backdropScaffoldKtExternalSyntheticLambda3.onExtraCallback();
    }

    public void onTransact() {
        TextFieldSelectionManager_androidKtExternalSyntheticLambda4[] textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr;
        int length;
        int i2;
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallbackStub + 29;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            this.extraCallback.onNavigationEvent(this);
            textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr = this.onPostMessage;
            length = textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr.length;
            i2 = 1;
        } else {
            this.extraCallback.onNavigationEvent(this);
            textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr = this.onPostMessage;
            length = textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr.length;
            i2 = 0;
        }
        while (i2 < length) {
            int i5 = ICustomTabsCallbackStub + 65;
            onUnminimized = i5 % 128;
            int i6 = i5 % 2;
            textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr[i2].access000();
            i2++;
        }
        this.access100 = null;
    }

    public void onExtraCallback(BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted, long j) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onUnminimized + 95;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            this.access100 = bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted;
            this.extraCallback.onExtraCallback(this);
            onWarmupCompleted(j);
            int i4 = ICustomTabsCallbackStub + 97;
            onUnminimized = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 37 / 0;
                return;
            }
            return;
        }
        this.access100 = bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted;
        this.extraCallback.onExtraCallback(this);
        onWarmupCompleted(j);
        throw null;
    }

    public void onNavigationEvent() throws ParserException, IOException {
        TextFieldSelectionManager_androidKtExternalSyntheticLambda4[] textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr;
        int length;
        int i2;
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallbackStub + 67;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr = this.onPostMessage;
            length = textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr.length;
            i2 = 1;
        } else {
            textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr = this.onPostMessage;
            length = textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr.length;
            i2 = 0;
        }
        while (i2 < length) {
            int i5 = onUnminimized + 49;
            ICustomTabsCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr[i2].onTransact();
                i2 += 18;
            } else {
                textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr[i2].onTransact();
                i2++;
            }
        }
    }

    public BottomSheetScaffoldKtExternalSyntheticLambda11 ab_() {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStub + 63;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11 = (BottomSheetScaffoldKtExternalSyntheticLambda11) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onRelationshipValidationResult);
        int i5 = onUnminimized + 33;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return bottomSheetScaffoldKtExternalSyntheticLambda11;
        }
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = ICustomTabsCallbackDefault;
        long j = 0;
        if (cArr != null) {
            int i8 = $11;
            int i9 = i8 + 99;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i11 = i8 + 39;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i13])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - TextUtils.getTrimmedLength("")), ExpandableListView.getPackedPositionChild(j) + 36, TextUtils.getOffsetAfter("", 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i13] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i13++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i14 = $10 + 99;
                $11 = i14 % 128;
                if (i14 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                    int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 30, 17705 - AndroidCharacter.getMirror('0'), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i16 = $10 + 73;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        int i17 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10934), 65 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16718, -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i17] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        throw null;
                    }
                    int i18 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 10935), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 65, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16718, -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i18] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49515 - AndroidCharacter.getMirror('0')), Color.alpha(0) + 70, TextUtils.getCapsMode("", 0, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i19 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i19, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i19);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i20 = $10 + 47;
                $11 = i20 % 128;
                if (i20 % 2 == 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[4]);
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent >>> 1;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    public List<AndroidTextInputSession_androidKtplatformSpecificTextInputSession31ExternalSyntheticLambda0> onExtraCallbackWithResult(List<ColorsKtExternalSyntheticLambda0> list) {
        int[] iArr;
        BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11IAuthTabCallbackDefault;
        int iAsInterface;
        boolean z;
        TextFieldSelectionManager_androidKtExternalSyntheticLambda4 textFieldSelectionManager_androidKtExternalSyntheticLambda4;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStub + 71;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        AlertDialogKtExternalSyntheticLambda6 alertDialogKtExternalSyntheticLambda6 = (AlertDialogKtExternalSyntheticLambda6) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.extraCallback.IAuthTabCallback());
        boolean zIsEmpty = alertDialogKtExternalSyntheticLambda6.IAuthTabCallbackStub.isEmpty();
        int i5 = 0;
        if (zIsEmpty) {
            iArr = new int[0];
            bottomSheetScaffoldKtExternalSyntheticLambda11IAuthTabCallbackDefault = BottomSheetScaffoldKtExternalSyntheticLambda11.IAuthTabCallback;
            iAsInterface = 0;
        } else {
            int i6 = ICustomTabsCallbackStub + 33;
            onUnminimized = i6 % 128;
            if (i6 % 2 != 0) {
                textFieldSelectionManager_androidKtExternalSyntheticLambda4 = this.onPostMessage[0];
                iArr = this.IAuthTabCallbackStubProxy[0];
            } else {
                textFieldSelectionManager_androidKtExternalSyntheticLambda4 = this.onPostMessage[0];
                iArr = this.IAuthTabCallbackStubProxy[0];
            }
            bottomSheetScaffoldKtExternalSyntheticLambda11IAuthTabCallbackDefault = textFieldSelectionManager_androidKtExternalSyntheticLambda4.IAuthTabCallbackDefault();
            iAsInterface = textFieldSelectionManager_androidKtExternalSyntheticLambda4.asInterface();
        }
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        for (ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0 : list) {
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnExtraCallback = colorsKtExternalSyntheticLambda0.onExtraCallback();
            int iIAuthTabCallback = bottomSheetScaffoldKtExternalSyntheticLambda11IAuthTabCallbackDefault.IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnExtraCallback);
            if (iIAuthTabCallback == -1) {
                ?? r15 = !zIsEmpty;
                while (true) {
                    TextFieldSelectionManager_androidKtExternalSyntheticLambda4[] textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr = this.onPostMessage;
                    if (r15 >= textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr.length) {
                        z = zIsEmpty;
                        break;
                    }
                    int i7 = ICustomTabsCallbackStub + 41;
                    z = zIsEmpty;
                    onUnminimized = i7 % 128;
                    if (i7 % 2 != 0) {
                        textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr[r15].IAuthTabCallbackDefault().IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnExtraCallback);
                        throw null;
                    }
                    BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11IAuthTabCallbackDefault2 = textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr[r15].IAuthTabCallbackDefault();
                    int iIAuthTabCallback2 = bottomSheetScaffoldKtExternalSyntheticLambda11IAuthTabCallbackDefault2.IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnExtraCallback);
                    if (iIAuthTabCallback2 != -1) {
                        int i8 = bottomSheetScaffoldKtExternalSyntheticLambda11IAuthTabCallbackDefault2.onWarmupCompleted(iIAuthTabCallback2).onExtraCallback != 1 ? 2 : 1;
                        int[] iArr2 = this.IAuthTabCallbackStubProxy[r15];
                        for (int i9 = 0; i9 < colorsKtExternalSyntheticLambda0.access100(); i9++) {
                            arrayList.add(new AndroidTextInputSession_androidKtplatformSpecificTextInputSession31ExternalSyntheticLambda0(i8, iArr2[colorsKtExternalSyntheticLambda0.onWarmupCompleted(i9)]));
                        }
                    } else {
                        zIsEmpty = z;
                        r15++;
                    }
                }
            } else if (iIAuthTabCallback == iAsInterface) {
                for (int i10 = i5; i10 < colorsKtExternalSyntheticLambda0.access100(); i10++) {
                    arrayList.add(new AndroidTextInputSession_androidKtplatformSpecificTextInputSession31ExternalSyntheticLambda0(i5, iArr[colorsKtExternalSyntheticLambda0.onWarmupCompleted(i10)]));
                }
                int i11 = ICustomTabsCallbackStub + 59;
                onUnminimized = i11 % 128;
                int i12 = i11 % 2;
                z = zIsEmpty;
                z3 = true;
            } else {
                z = zIsEmpty;
                z2 = true;
            }
            zIsEmpty = z;
            i5 = 0;
        }
        if (z2 && !z3) {
            int i13 = iArr[0];
            int i14 = alertDialogKtExternalSyntheticLambda6.IAuthTabCallbackStub.get(i13).onWarmupCompleted.onExtraCallback;
            for (int i15 = 1; i15 < iArr.length; i15++) {
                int i16 = alertDialogKtExternalSyntheticLambda6.IAuthTabCallbackStub.get(iArr[i15]).onWarmupCompleted.onExtraCallback;
                if (i16 < i14) {
                    int i17 = ICustomTabsCallbackStub;
                    int i18 = i17 + 23;
                    onUnminimized = i18 % 128;
                    int i19 = i18 % 2;
                    i13 = iArr[i15];
                    int i20 = i17 + 105;
                    onUnminimized = i20 % 128;
                    int i21 = i20 % 2;
                    i14 = i16;
                }
            }
            arrayList.add(new AndroidTextInputSession_androidKtplatformSpecificTextInputSession31ExternalSyntheticLambda0(0, i13));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long IAuthTabCallback(ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr, boolean[] zArr, BottomNavigationKtExternalSyntheticLambda5[] bottomNavigationKtExternalSyntheticLambda5Arr, boolean[] zArr2, long j) {
        TextFieldSelectionManager_androidKtExternalSyntheticLambda4[] textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr;
        int i2;
        int i3;
        boolean z;
        BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda5;
        int i4 = 2;
        int i5 = 2 % 2;
        int[] iArr = new int[colorsKtExternalSyntheticLambda0Arr.length];
        int[] iArr2 = new int[colorsKtExternalSyntheticLambda0Arr.length];
        int i6 = 0;
        while (true) {
            Object obj = null;
            if (i6 >= colorsKtExternalSyntheticLambda0Arr.length) {
                this.onActivityResized.clear();
                int length = colorsKtExternalSyntheticLambda0Arr.length;
                BottomNavigationKtExternalSyntheticLambda5[] bottomNavigationKtExternalSyntheticLambda5Arr2 = new BottomNavigationKtExternalSyntheticLambda5[length];
                BottomNavigationKtExternalSyntheticLambda5[] bottomNavigationKtExternalSyntheticLambda5Arr3 = new BottomNavigationKtExternalSyntheticLambda5[colorsKtExternalSyntheticLambda0Arr.length];
                ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr2 = new ColorsKtExternalSyntheticLambda0[colorsKtExternalSyntheticLambda0Arr.length];
                TextFieldSelectionManager_androidKtExternalSyntheticLambda4[] textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr2 = new TextFieldSelectionManager_androidKtExternalSyntheticLambda4[this.onPostMessage.length];
                int i7 = 0;
                int i8 = 0;
                boolean z2 = false;
                while (i8 < this.onPostMessage.length) {
                    int i9 = 0;
                    while (i9 < colorsKtExternalSyntheticLambda0Arr.length) {
                        int i10 = onUnminimized + 89;
                        int i11 = i10 % 128;
                        ICustomTabsCallbackStub = i11;
                        if (i10 % 2 == 0) {
                            int i12 = iArr[i9];
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        if (iArr[i9] == i8) {
                            bottomNavigationKtExternalSyntheticLambda5 = bottomNavigationKtExternalSyntheticLambda5Arr[i9];
                        } else {
                            int i13 = i11 + 5;
                            onUnminimized = i13 % 128;
                            int i14 = i13 % i4;
                            bottomNavigationKtExternalSyntheticLambda5 = null;
                        }
                        bottomNavigationKtExternalSyntheticLambda5Arr3[i9] = bottomNavigationKtExternalSyntheticLambda5;
                        colorsKtExternalSyntheticLambda0Arr2[i9] = iArr2[i9] == i8 ? colorsKtExternalSyntheticLambda0Arr[i9] : null;
                        i9++;
                        obj = null;
                    }
                    TextFieldSelectionManager_androidKtExternalSyntheticLambda4 textFieldSelectionManager_androidKtExternalSyntheticLambda4 = this.onPostMessage[i8];
                    int i15 = i7;
                    int i16 = i8;
                    TextFieldSelectionManager_androidKtExternalSyntheticLambda4[] textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr3 = textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr2;
                    ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr3 = colorsKtExternalSyntheticLambda0Arr2;
                    boolean zOnNavigationEvent = textFieldSelectionManager_androidKtExternalSyntheticLambda4.onNavigationEvent(colorsKtExternalSyntheticLambda0Arr2, zArr, bottomNavigationKtExternalSyntheticLambda5Arr3, zArr2, j, z2);
                    boolean z3 = false;
                    for (int i17 = 0; i17 < colorsKtExternalSyntheticLambda0Arr.length; i17++) {
                        BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda52 = bottomNavigationKtExternalSyntheticLambda5Arr3[i17];
                        if (iArr2[i17] == i16) {
                            int i18 = ICustomTabsCallbackStub + 79;
                            onUnminimized = i18 % 128;
                            int i19 = i18 % 2;
                            bottomNavigationKtExternalSyntheticLambda5Arr2[i17] = bottomNavigationKtExternalSyntheticLambda52;
                            this.onActivityResized.put(bottomNavigationKtExternalSyntheticLambda52, Integer.valueOf(i16));
                            z3 = true;
                        } else if (iArr[i17] == i16) {
                            if (bottomNavigationKtExternalSyntheticLambda52 == null) {
                                int i20 = ICustomTabsCallbackStub + 125;
                                onUnminimized = i20 % 128;
                                boolean z4 = i20 % 2 == 0;
                                RecordingInputConnection_androidKt.onExtraCallbackWithResult(z4);
                            }
                        }
                    }
                    if (!z3) {
                        i2 = i15;
                        textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr = textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr3;
                    } else {
                        textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr = textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr3;
                        textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr[i15] = textFieldSelectionManager_androidKtExternalSyntheticLambda4;
                        i2 = i15 + 1;
                        if (i15 == 0) {
                            textFieldSelectionManager_androidKtExternalSyntheticLambda4.onWarmupCompleted(true);
                            if (!zOnNavigationEvent) {
                                TextFieldSelectionManager_androidKtExternalSyntheticLambda4[] textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr4 = this.IAuthTabCallbackDefault;
                                if (textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr4.length == 0 || textFieldSelectionManager_androidKtExternalSyntheticLambda4 != textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr4[0]) {
                                    this.onActivityLayout.IAuthTabCallback();
                                    z2 = true;
                                }
                            }
                            i4 = i3;
                            i7 = i2;
                            colorsKtExternalSyntheticLambda0Arr2 = colorsKtExternalSyntheticLambda0Arr3;
                            obj = null;
                            textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr2 = textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr;
                            i8 = i16 + 1;
                        } else {
                            if (i16 < this.onExtraCallback) {
                                int i21 = onUnminimized;
                                int i22 = i21 + 125;
                                ICustomTabsCallbackStub = i22 % 128;
                                int i23 = i22 % 2;
                                int i24 = i21 + 123;
                                ICustomTabsCallbackStub = i24 % 128;
                                i3 = 2;
                                int i25 = i24 % 2;
                                z = true;
                            } else {
                                i3 = 2;
                                z = false;
                            }
                            textFieldSelectionManager_androidKtExternalSyntheticLambda4.onWarmupCompleted(z);
                            i4 = i3;
                            i7 = i2;
                            colorsKtExternalSyntheticLambda0Arr2 = colorsKtExternalSyntheticLambda0Arr3;
                            obj = null;
                            textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr2 = textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr;
                            i8 = i16 + 1;
                        }
                    }
                    i3 = 2;
                    i4 = i3;
                    i7 = i2;
                    colorsKtExternalSyntheticLambda0Arr2 = colorsKtExternalSyntheticLambda0Arr3;
                    obj = null;
                    textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr2 = textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr;
                    i8 = i16 + 1;
                }
                System.arraycopy(bottomNavigationKtExternalSyntheticLambda5Arr2, 0, bottomNavigationKtExternalSyntheticLambda5Arr, 0, length);
                TextFieldSelectionManager_androidKtExternalSyntheticLambda4[] textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr5 = (TextFieldSelectionManager_androidKtExternalSyntheticLambda4[]) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr2, i7);
                this.IAuthTabCallbackDefault = textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr5;
                List<? extends BottomNavigationKtExternalSyntheticLambda8> listCopyOf = ImmutableList.copyOf(textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr5);
                this.onNavigationEvent = this.asInterface.onExtraCallbackWithResult(listCopyOf, Lists.transform(listCopyOf, new Function() { // from class: androidx.media3.exoplayer.hls.HlsMediaPeriod$$ExternalSyntheticLambda0
                    public final Object apply(Object obj3) {
                        return TextFieldSelectionManager_androidKtExternalSyntheticLambda8.onExtraCallback((TextFieldSelectionManager_androidKtExternalSyntheticLambda4) obj3);
                    }
                }));
                return j;
            }
            int i26 = ICustomTabsCallbackStub + 55;
            onUnminimized = i26 % 128;
            if (i26 % 2 != 0) {
                BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda53 = bottomNavigationKtExternalSyntheticLambda5Arr[i6];
                obj.hashCode();
                throw null;
            }
            BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda54 = bottomNavigationKtExternalSyntheticLambda5Arr[i6];
            iArr[i6] = bottomNavigationKtExternalSyntheticLambda54 == null ? -1 : this.onActivityResized.get(bottomNavigationKtExternalSyntheticLambda54).intValue();
            iArr2[i6] = -1;
            ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0 = colorsKtExternalSyntheticLambda0Arr[i6];
            if (colorsKtExternalSyntheticLambda0 != null) {
                int i27 = onUnminimized + 123;
                ICustomTabsCallbackStub = i27 % 128;
                int i28 = i27 % 2;
                CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnExtraCallback = colorsKtExternalSyntheticLambda0.onExtraCallback();
                int i29 = 0;
                while (true) {
                    TextFieldSelectionManager_androidKtExternalSyntheticLambda4[] textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr6 = this.onPostMessage;
                    if (i29 >= textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr6.length) {
                        break;
                    }
                    if (textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr6[i29].IAuthTabCallbackDefault().IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnExtraCallback) != -1) {
                        int i30 = ICustomTabsCallbackStub + 1;
                        onUnminimized = i30 % 128;
                        int i31 = i30 % 2;
                        iArr2[i6] = i29;
                        break;
                    }
                    i29++;
                }
            }
            i6++;
        }
    }

    public static /* synthetic */ List onExtraCallback(TextFieldSelectionManager_androidKtExternalSyntheticLambda4 textFieldSelectionManager_androidKtExternalSyntheticLambda4) {
        int i2 = 2 % 2;
        int i3 = onUnminimized + 79;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11IAuthTabCallbackDefault = textFieldSelectionManager_androidKtExternalSyntheticLambda4.IAuthTabCallbackDefault();
        if (i4 != 0) {
            return bottomSheetScaffoldKtExternalSyntheticLambda11IAuthTabCallbackDefault.onExtraCallbackWithResult();
        }
        bottomSheetScaffoldKtExternalSyntheticLambda11IAuthTabCallbackDefault.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallback(long j, boolean z) {
        int i2 = 2 % 2;
        int i3 = onUnminimized;
        int i4 = i3 + 21;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        TextFieldSelectionManager_androidKtExternalSyntheticLambda4[] textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr = this.IAuthTabCallbackDefault;
        int length = textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr.length;
        int i6 = i3 + 85;
        ICustomTabsCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        while (i8 < length) {
            int i9 = onUnminimized + 121;
            ICustomTabsCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr[i8].onExtraCallbackWithResult(j, z);
            i8++;
            int i11 = onUnminimized + 107;
            ICustomTabsCallbackStub = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    public void IAuthTabCallback(long j) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStub + 73;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent.IAuthTabCallback(j);
        if (i4 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r3 >= r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r4 = o.TextFieldSelectionManager_androidKtExternalSyntheticLambda8.ICustomTabsCallbackStub + 31;
        o.TextFieldSelectionManager_androidKtExternalSyntheticLambda8.onUnminimized = r4 % 128;
        r4 = r4 % 2;
        r7[r3].onNavigationEvent();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        r7 = o.TextFieldSelectionManager_androidKtExternalSyntheticLambda8.onUnminimized + 109;
        o.TextFieldSelectionManager_androidKtExternalSyntheticLambda8.ICustomTabsCallbackStub = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        return r6.onNavigationEvent.IAuthTabCallback(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r6.onRelationshipValidationResult == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r6.onRelationshipValidationResult == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r7 = r6.onPostMessage;
        r1 = r7.length;
        r3 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean IAuthTabCallback(PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1 platformSelectionBehaviors_androidKtExternalSyntheticLambda1) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStub + 89;
        onUnminimized = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 40 / 0;
        }
    }

    public boolean IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = onUnminimized + 27;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            this.onNavigationEvent.IAuthTabCallback();
            throw null;
        }
        boolean zIAuthTabCallback = this.onNavigationEvent.IAuthTabCallback();
        int i4 = ICustomTabsCallbackStub + 55;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    public long onExtraCallback() {
        int i2 = 2 % 2;
        int i3 = onUnminimized + 41;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long jOnExtraCallback = this.onNavigationEvent.onExtraCallback();
        int i5 = ICustomTabsCallbackStub + 55;
        onUnminimized = i5 % 128;
        if (i5 % 2 == 0) {
            return jOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long onWarmupCompleted() {
        long jOnWarmupCompleted;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStub + 103;
        onUnminimized = i3 % 128;
        if (i3 % 2 != 0) {
            jOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted();
            int i4 = 28 / 0;
        } else {
            jOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted();
        }
        int i5 = ICustomTabsCallbackStub + 87;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return jOnWarmupCompleted;
    }

    public long onExtraCallbackWithResult(long j) {
        int i2 = 2 % 2;
        int i3 = onUnminimized + 89;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        TextFieldSelectionManager_androidKtExternalSyntheticLambda4[] textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr = this.IAuthTabCallbackDefault;
        if (textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr.length > 0) {
            boolean zOnExtraCallback = textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr[0].onExtraCallback(j, false);
            int i5 = onUnminimized + 75;
            ICustomTabsCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 1;
            while (true) {
                TextFieldSelectionManager_androidKtExternalSyntheticLambda4[] textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr2 = this.IAuthTabCallbackDefault;
                if (i7 >= textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr2.length) {
                    break;
                }
                textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr2[i7].onExtraCallback(j, zOnExtraCallback);
                i7++;
            }
            if (zOnExtraCallback) {
                int i8 = onUnminimized + 59;
                ICustomTabsCallbackStub = i8 % 128;
                if (i8 % 2 == 0) {
                    this.onActivityLayout.IAuthTabCallback();
                    int i9 = 75 / 0;
                } else {
                    this.onActivityLayout.IAuthTabCallback();
                }
            }
        }
        int i10 = onUnminimized + 85;
        ICustomTabsCallbackStub = i10 % 128;
        int i11 = i10 % 2;
        return j;
    }

    public long onExtraCallback(long j, SelectionContainerKtExternalSyntheticLambda2 selectionContainerKtExternalSyntheticLambda2) {
        TextFieldSelectionManager_androidKtExternalSyntheticLambda4[] textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr;
        int length;
        int i2 = 2 % 2;
        int i3 = onUnminimized + 25;
        int i4 = i3 % 128;
        ICustomTabsCallbackStub = i4;
        if (i3 % 2 == 0) {
            textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr = this.IAuthTabCallbackDefault;
            length = textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr.length;
        } else {
            textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr = this.IAuthTabCallbackDefault;
            length = textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr.length;
        }
        int i5 = i4 + 9;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = onUnminimized + 85;
            ICustomTabsCallbackStub = i8 % 128;
            Object obj = null;
            if (i8 % 2 != 0) {
                TextFieldSelectionManager_androidKtExternalSyntheticLambda4 textFieldSelectionManager_androidKtExternalSyntheticLambda4 = textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr[i7];
                if (textFieldSelectionManager_androidKtExternalSyntheticLambda4.asBinder()) {
                    long jIAuthTabCallback = textFieldSelectionManager_androidKtExternalSyntheticLambda4.IAuthTabCallback(j, selectionContainerKtExternalSyntheticLambda2);
                    int i9 = onUnminimized + 57;
                    ICustomTabsCallbackStub = i9 % 128;
                    if (i9 % 2 != 0) {
                        return jIAuthTabCallback;
                    }
                    throw null;
                }
            } else {
                textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr[i7].asBinder();
                obj.hashCode();
                throw null;
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.onExtraCallback
    public void asBinder() {
        int i2 = 2 % 2;
        TextFieldSelectionManager_androidKtExternalSyntheticLambda4[] textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr = this.onPostMessage;
        int length = textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = onUnminimized + 107;
            ICustomTabsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr[i3].getInterfaceDescriptor();
            i3++;
            int i6 = ICustomTabsCallbackStub + 77;
            onUnminimized = i6 % 128;
            int i7 = i6 % 2;
        }
        this.access100.onWarmupCompleted(this);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.onExtraCallback
    public boolean onExtraCallback(Uri uri, ComposableSingletonsScaffoldKtExternalSyntheticLambda5$onNavigationEvent composableSingletonsScaffoldKtExternalSyntheticLambda5$onNavigationEvent, boolean z) {
        int i2 = 2 % 2;
        TextFieldSelectionManager_androidKtExternalSyntheticLambda4[] textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr = this.onPostMessage;
        int i3 = onUnminimized + 97;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 4 / 5;
        }
        boolean zOnExtraCallback = true;
        for (TextFieldSelectionManager_androidKtExternalSyntheticLambda4 textFieldSelectionManager_androidKtExternalSyntheticLambda4 : textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr) {
            int i5 = ICustomTabsCallbackStub + 107;
            onUnminimized = i5 % 128;
            int i6 = i5 % 2;
            zOnExtraCallback &= textFieldSelectionManager_androidKtExternalSyntheticLambda4.onExtraCallback(uri, composableSingletonsScaffoldKtExternalSyntheticLambda5$onNavigationEvent, z);
        }
        this.access100.onWarmupCompleted(this);
        int i7 = onUnminimized + 27;
        ICustomTabsCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        return zOnExtraCallback;
    }

    private void onWarmupCompleted(long j) throws Throwable {
        Map<String, BasicTextContextMenuProviderExternalSyntheticLambda0> mapOnNavigationEvent;
        int i2 = 2 % 2;
        AlertDialogKtExternalSyntheticLambda6 alertDialogKtExternalSyntheticLambda6 = (AlertDialogKtExternalSyntheticLambda6) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.extraCallback.IAuthTabCallback());
        if (this.ICustomTabsCallbackStubProxy) {
            int i3 = onUnminimized + 25;
            ICustomTabsCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                onNavigationEvent(alertDialogKtExternalSyntheticLambda6.asInterface);
                throw null;
            }
            mapOnNavigationEvent = onNavigationEvent(alertDialogKtExternalSyntheticLambda6.asInterface);
        } else {
            mapOnNavigationEvent = Collections.EMPTY_MAP;
        }
        Map<String, BasicTextContextMenuProviderExternalSyntheticLambda0> map = mapOnNavigationEvent;
        boolean zIsEmpty = alertDialogKtExternalSyntheticLambda6.IAuthTabCallbackStub.isEmpty();
        List<AlertDialogKtExternalSyntheticLambda6.IAuthTabCallback> list = alertDialogKtExternalSyntheticLambda6.onExtraCallback;
        List<AlertDialogKtExternalSyntheticLambda6.IAuthTabCallback> list2 = alertDialogKtExternalSyntheticLambda6.asBinder;
        this.ICustomTabsCallback = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!zIsEmpty) {
            onExtraCallback(alertDialogKtExternalSyntheticLambda6, j, arrayList, arrayList2, map);
        }
        IAuthTabCallback(j, list, arrayList, arrayList2, map);
        this.onExtraCallback = arrayList.size();
        onNavigationEvent(new Object[]{this, Long.valueOf(j), list2, arrayList, arrayList2, map}, -1263349360, zzgsa.onWarmupCompleted(), 1263349361, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
        this.onPostMessage = (TextFieldSelectionManager_androidKtExternalSyntheticLambda4[]) arrayList.toArray(new TextFieldSelectionManager_androidKtExternalSyntheticLambda4[0]);
        this.IAuthTabCallbackStubProxy = (int[][]) arrayList2.toArray(new int[0][]);
        this.ICustomTabsCallback = this.onPostMessage.length;
        for (int i4 = 0; i4 < this.onExtraCallback; i4++) {
            int i5 = onUnminimized + 83;
            ICustomTabsCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            this.onPostMessage[i4].onWarmupCompleted(true);
        }
        TextFieldSelectionManager_androidKtExternalSyntheticLambda4[] textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr = this.onPostMessage;
        int length = textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr.length;
        int i7 = 0;
        while (i7 < length) {
            int i8 = onUnminimized + 105;
            ICustomTabsCallbackStub = i8 % 128;
            if (i8 % 2 == 0) {
                textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr[i7].onNavigationEvent();
                i7 += 60;
            } else {
                textFieldSelectionManager_androidKtExternalSyntheticLambda4Arr[i7].onNavigationEvent();
                i7++;
            }
        }
        this.IAuthTabCallbackDefault = this.onPostMessage;
        int i9 = ICustomTabsCallbackStub + 41;
        onUnminimized = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 0 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onExtraCallback(AlertDialogKtExternalSyntheticLambda6 alertDialogKtExternalSyntheticLambda6, long j, List<TextFieldSelectionManager_androidKtExternalSyntheticLambda4> list, List<int[]> list2, Map<String, BasicTextContextMenuProviderExternalSyntheticLambda0> map) throws Throwable {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        int i3;
        int i4 = 2 % 2;
        boolean z = false;
        Object[] objArr3 = new Object[1];
        a(new int[]{0, 4, 0, 0}, true, new byte[]{0, 1, 0, 0}, objArr3);
        String strIntern = ((String) objArr3[0]).intern();
        int size = alertDialogKtExternalSyntheticLambda6.IAuthTabCallbackStub.size();
        int[] iArr = new int[size];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < alertDialogKtExternalSyntheticLambda6.IAuthTabCallbackStub.size(); i7++) {
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = alertDialogKtExternalSyntheticLambda6.IAuthTabCallbackStub.get(i7).onWarmupCompleted;
            if (basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback <= 0) {
                if (((String) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-143057283, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub, 2}, 143057290)) == null) {
                    int i8 = ICustomTabsCallbackStub + 31;
                    onUnminimized = i8 % 128;
                    int i9 = i8 % 2;
                    if (((String) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-143057283, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub, 1}, 143057290)) != null) {
                        int i10 = ICustomTabsCallbackStub + 35;
                        onUnminimized = i10 % 128;
                        int i11 = i10 % 2;
                        iArr[i7] = 1;
                        i6++;
                    } else {
                        iArr[i7] = -1;
                    }
                } else {
                    iArr[i7] = 2;
                    i5++;
                    int i12 = onUnminimized + 59;
                    ICustomTabsCallbackStub = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
        }
        if (i5 > 0) {
            i2 = i5;
            objArr2 = false;
            objArr = true;
        } else if (i6 < size) {
            int i14 = ICustomTabsCallbackStub + 7;
            onUnminimized = i14 % 128;
            i2 = i14 % 2 != 0 ? size >>> i6 : size - i6;
            objArr = false;
            objArr2 = true;
        } else {
            i2 = size;
            objArr = false;
            objArr2 = false;
        }
        Uri[] uriArr = new Uri[i2];
        BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr = new BasicTextContextMenuProviderKtExternalSyntheticLambda4[i2];
        int[] iArr2 = new int[i2];
        int i15 = 0;
        int i16 = 0;
        while (i15 < alertDialogKtExternalSyntheticLambda6.IAuthTabCallbackStub.size()) {
            if (objArr != false) {
                int i17 = ICustomTabsCallbackStub + 115;
                onUnminimized = i17 % 128;
                int i18 = i17 % 2;
                if (iArr[i15] == 2) {
                    if (objArr2 != false) {
                        int i19 = onUnminimized + 43;
                        ICustomTabsCallbackStub = i19 % 128;
                        if (i19 % 2 == 0) {
                            if (iArr[i15] != 0) {
                                AlertDialogKtExternalSyntheticLambda6.onExtraCallback onextracallback = alertDialogKtExternalSyntheticLambda6.IAuthTabCallbackStub.get(i15);
                                uriArr[i16] = onextracallback.onExtraCallback;
                                basicTextContextMenuProviderKtExternalSyntheticLambda4Arr[i16] = onextracallback.onWarmupCompleted;
                                iArr2[i16] = i15;
                                i16++;
                            }
                        } else if (iArr[i15] != 1) {
                        }
                    }
                }
            }
            i15++;
            z = false;
        }
        String str = basicTextContextMenuProviderKtExternalSyntheticLambda4Arr[z ? 1 : 0].IAuthTabCallbackStub;
        int iOnExtraCallbackWithResult = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(str, 2);
        int iOnExtraCallbackWithResult2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(str, 1);
        boolean z2 = (iOnExtraCallbackWithResult2 == 1 || (iOnExtraCallbackWithResult2 == 0 && !(alertDialogKtExternalSyntheticLambda6.onExtraCallback.isEmpty() ^ true))) && iOnExtraCallbackWithResult <= 1 && iOnExtraCallbackWithResult2 + iOnExtraCallbackWithResult > 0;
        if (objArr == true || iOnExtraCallbackWithResult2 <= 0) {
            i3 = 0;
        } else {
            int i20 = ICustomTabsCallbackStub + 95;
            onUnminimized = i20 % 128;
            i3 = i20 % 2 != 0 ? 0 : 1;
        }
        int i21 = i2;
        TextFieldSelectionManager_androidKtExternalSyntheticLambda4 textFieldSelectionManager_androidKtExternalSyntheticLambda4OnExtraCallback = onExtraCallback(strIntern, i3, uriArr, basicTextContextMenuProviderKtExternalSyntheticLambda4Arr, alertDialogKtExternalSyntheticLambda6.onNavigationEvent, alertDialogKtExternalSyntheticLambda6.onTransact, map, j);
        list.add(textFieldSelectionManager_androidKtExternalSyntheticLambda4OnExtraCallback);
        list2.add(iArr2);
        if (this.onExtraCallbackWithResult) {
            int i22 = ICustomTabsCallbackStub + 83;
            onUnminimized = i22 % 128;
            int i23 = i22 % 2;
            if (z2) {
                ArrayList arrayList = new ArrayList();
                if (iOnExtraCallbackWithResult > 0) {
                    int i24 = ICustomTabsCallbackStub + 17;
                    onUnminimized = i24 % 128;
                    int i25 = i24 % 2;
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr2 = new BasicTextContextMenuProviderKtExternalSyntheticLambda4[i21];
                    for (int i26 = 0; i26 < i21; i26++) {
                        basicTextContextMenuProviderKtExternalSyntheticLambda4Arr2[i26] = onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4Arr[i26]);
                    }
                    arrayList.add(new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1(strIntern, basicTextContextMenuProviderKtExternalSyntheticLambda4Arr2));
                    if (iOnExtraCallbackWithResult2 > 0 && (alertDialogKtExternalSyntheticLambda6.onNavigationEvent != null || alertDialogKtExternalSyntheticLambda6.onExtraCallback.isEmpty())) {
                        arrayList.add(new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1(strIntern + ":audio", new BasicTextContextMenuProviderKtExternalSyntheticLambda4[]{(BasicTextContextMenuProviderKtExternalSyntheticLambda4) onNavigationEvent(new Object[]{basicTextContextMenuProviderKtExternalSyntheticLambda4Arr[0], alertDialogKtExternalSyntheticLambda6.onNavigationEvent, false}, 1000794831, zzgsa.onWarmupCompleted(), -1000794831, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted())}));
                    }
                    List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> list3 = alertDialogKtExternalSyntheticLambda6.onTransact;
                    if (list3 != null) {
                        for (int i27 = 0; i27 < list3.size(); i27++) {
                            arrayList.add(new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1(strIntern + ":cc:" + i27, new BasicTextContextMenuProviderKtExternalSyntheticLambda4[]{this.access000.onWarmupCompleted(list3.get(i27))}));
                        }
                    }
                } else {
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr3 = new BasicTextContextMenuProviderKtExternalSyntheticLambda4[i21];
                    for (int i28 = 0; i28 < i21; i28++) {
                        basicTextContextMenuProviderKtExternalSyntheticLambda4Arr3[i28] = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) onNavigationEvent(new Object[]{basicTextContextMenuProviderKtExternalSyntheticLambda4Arr[i28], alertDialogKtExternalSyntheticLambda6.onNavigationEvent, true}, 1000794831, zzgsa.onWarmupCompleted(), -1000794831, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
                    }
                    arrayList.add(new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1(strIntern, basicTextContextMenuProviderKtExternalSyntheticLambda4Arr3));
                }
                CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1(strIntern + ":id3", new BasicTextContextMenuProviderKtExternalSyntheticLambda4[]{new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult("ID3").IAuthTabCallbackDefault("application/id3").onNavigationEvent()});
                arrayList.add(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1);
                textFieldSelectionManager_androidKtExternalSyntheticLambda4OnExtraCallback.onWarmupCompleted((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[]) arrayList.toArray(new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[0]), 0, arrayList.indexOf(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1));
            }
        }
    }

    private void IAuthTabCallback(long j, List<AlertDialogKtExternalSyntheticLambda6.IAuthTabCallback> list, List<TextFieldSelectionManager_androidKtExternalSyntheticLambda4> list2, List<int[]> list3, Map<String, BasicTextContextMenuProviderExternalSyntheticLambda0> map) {
        boolean z;
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < list.size(); i3++) {
            int i4 = ICustomTabsCallbackStub + 39;
            onUnminimized = i4 % 128;
            if (i4 % 2 != 0) {
                hashSet.add(list.get(i3).onWarmupCompleted);
                throw null;
            }
            String str = list.get(i3).onWarmupCompleted;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                int i5 = ICustomTabsCallbackStub + 49;
                onUnminimized = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 0;
                boolean z2 = true;
                while (i7 < list.size()) {
                    if (Objects.equals(str, list.get(i7).onWarmupCompleted)) {
                        AlertDialogKtExternalSyntheticLambda6.IAuthTabCallback iAuthTabCallback = list.get(i7);
                        arrayList3.add(Integer.valueOf(i7));
                        arrayList.add(iAuthTabCallback.onExtraCallback);
                        arrayList2.add(iAuthTabCallback.onExtraCallbackWithResult);
                        if (TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(iAuthTabCallback.onExtraCallbackWithResult.IAuthTabCallbackStub, 1) == 1) {
                            int i8 = ICustomTabsCallbackStub + 119;
                            onUnminimized = i8 % 128;
                            int i9 = i8 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 &= z;
                    }
                    i7++;
                    int i10 = onUnminimized + 123;
                    ICustomTabsCallbackStub = i10 % 128;
                    int i11 = i10 % 2;
                }
                String str2 = "audio:" + str;
                TextFieldSelectionManager_androidKtExternalSyntheticLambda4 textFieldSelectionManager_androidKtExternalSyntheticLambda4OnExtraCallback = onExtraCallback(str2, 1, (Uri[]) arrayList.toArray((Uri[]) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(new Uri[0])), (BasicTextContextMenuProviderKtExternalSyntheticLambda4[]) arrayList2.toArray(new BasicTextContextMenuProviderKtExternalSyntheticLambda4[0]), null, Collections.EMPTY_LIST, map, j);
                list3.add(Ints.toArray(arrayList3));
                list2.add(textFieldSelectionManager_androidKtExternalSyntheticLambda4OnExtraCallback);
                if (this.onExtraCallbackWithResult && z2) {
                    textFieldSelectionManager_androidKtExternalSyntheticLambda4OnExtraCallback.onWarmupCompleted(new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[]{new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1(str2, (BasicTextContextMenuProviderKtExternalSyntheticLambda4[]) arrayList2.toArray(new BasicTextContextMenuProviderKtExternalSyntheticLambda4[0]))}, 0, new int[0]);
                }
            }
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i2;
        HashSet hashSet;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List list;
        List list2;
        boolean z;
        int i3;
        List list3;
        int i4 = 0;
        TextFieldSelectionManager_androidKtExternalSyntheticLambda8 textFieldSelectionManager_androidKtExternalSyntheticLambda8 = (TextFieldSelectionManager_androidKtExternalSyntheticLambda8) objArr[0];
        boolean z2 = true;
        long jLongValue = ((Number) objArr[1]).longValue();
        int i5 = 2;
        List list4 = (List) objArr[2];
        List list5 = (List) objArr[3];
        List list6 = (List) objArr[4];
        Map<String, BasicTextContextMenuProviderExternalSyntheticLambda0> map = (Map) objArr[5];
        int i6 = 2 % 2;
        ArrayList arrayList4 = new ArrayList(list4.size());
        ArrayList arrayList5 = new ArrayList(list4.size());
        ArrayList arrayList6 = new ArrayList(list4.size());
        HashSet hashSet2 = new HashSet();
        int i7 = onUnminimized + 69;
        ICustomTabsCallbackStub = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 3 % 3;
        }
        int i9 = 0;
        while (i9 < list4.size()) {
            String str = ((AlertDialogKtExternalSyntheticLambda6.IAuthTabCallback) list4.get(i9)).onWarmupCompleted;
            if (hashSet2.add(str)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                int i10 = i4;
                while (i10 < list4.size()) {
                    if (Objects.equals(str, ((AlertDialogKtExternalSyntheticLambda6.IAuthTabCallback) list4.get(i10)).onWarmupCompleted)) {
                        int i11 = ICustomTabsCallbackStub + 37;
                        onUnminimized = i11 % 128;
                        if (i11 % i5 != 0) {
                            AlertDialogKtExternalSyntheticLambda6.IAuthTabCallback iAuthTabCallback = (AlertDialogKtExternalSyntheticLambda6.IAuthTabCallback) list4.get(i10);
                            arrayList6.add(Integer.valueOf(i10));
                            arrayList4.add(iAuthTabCallback.onExtraCallback);
                            arrayList5.add(iAuthTabCallback.onExtraCallbackWithResult);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        AlertDialogKtExternalSyntheticLambda6.IAuthTabCallback iAuthTabCallback2 = (AlertDialogKtExternalSyntheticLambda6.IAuthTabCallback) list4.get(i10);
                        arrayList6.add(Integer.valueOf(i10));
                        arrayList4.add(iAuthTabCallback2.onExtraCallback);
                        arrayList5.add(iAuthTabCallback2.onExtraCallbackWithResult);
                        int i12 = ICustomTabsCallbackStub + 51;
                        onUnminimized = i12 % 128;
                        if (i12 % i5 != 0) {
                            int i13 = 4 % 4;
                        }
                    }
                    i10++;
                    int i14 = ICustomTabsCallbackStub + 15;
                    onUnminimized = i14 % 128;
                    int i15 = i14 % i5;
                }
                String str2 = "subtitle:" + str;
                BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr = (BasicTextContextMenuProviderKtExternalSyntheticLambda4[]) arrayList5.toArray(new BasicTextContextMenuProviderKtExternalSyntheticLambda4[0]);
                i2 = i9;
                hashSet = hashSet2;
                arrayList = arrayList6;
                arrayList2 = arrayList5;
                arrayList3 = arrayList4;
                list = list6;
                list2 = list4;
                list3 = list5;
                TextFieldSelectionManager_androidKtExternalSyntheticLambda4 textFieldSelectionManager_androidKtExternalSyntheticLambda4OnExtraCallback = textFieldSelectionManager_androidKtExternalSyntheticLambda8.onExtraCallback(str2, 3, (Uri[]) arrayList4.toArray((Uri[]) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(new Uri[0])), basicTextContextMenuProviderKtExternalSyntheticLambda4Arr, null, ImmutableList.of(), map, jLongValue);
                list.add(Ints.toArray(arrayList));
                list3.add(textFieldSelectionManager_androidKtExternalSyntheticLambda4OnExtraCallback);
                int length = basicTextContextMenuProviderKtExternalSyntheticLambda4Arr.length;
                BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr2 = new BasicTextContextMenuProviderKtExternalSyntheticLambda4[length];
                for (int i16 = 0; i16 < length; i16++) {
                    basicTextContextMenuProviderKtExternalSyntheticLambda4Arr2[i16] = textFieldSelectionManager_androidKtExternalSyntheticLambda8.access000.onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4Arr[i16]);
                }
                CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1(str2, basicTextContextMenuProviderKtExternalSyntheticLambda4Arr2);
                z = true;
                i3 = 0;
                textFieldSelectionManager_androidKtExternalSyntheticLambda4OnExtraCallback.onWarmupCompleted(new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[]{coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1}, 0, new int[0]);
            } else {
                i2 = i9;
                hashSet = hashSet2;
                arrayList = arrayList6;
                arrayList2 = arrayList5;
                arrayList3 = arrayList4;
                list = list6;
                list2 = list4;
                z = z2;
                i3 = i4;
                list3 = list5;
            }
            list5 = list3;
            z2 = z;
            i4 = i3;
            list6 = list;
            arrayList6 = arrayList;
            hashSet2 = hashSet;
            arrayList4 = arrayList3;
            arrayList5 = arrayList2;
            list4 = list2;
            i5 = 2;
            i9 = i2 + 1;
        }
        return null;
    }

    private TextFieldSelectionManager_androidKtExternalSyntheticLambda4 onExtraCallback(String str, int i2, Uri[] uriArr, BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr, @Nullable BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> list, Map<String, BasicTextContextMenuProviderExternalSyntheticLambda0> map, long j) {
        int i3 = 2 % 2;
        TextFieldSelectionManager_androidKtExternalSyntheticLambda4 textFieldSelectionManager_androidKtExternalSyntheticLambda4 = new TextFieldSelectionManager_androidKtExternalSyntheticLambda4(str, i2, this.onMinimized, new TextFieldSelectionManager_androidKtExternalSyntheticLambda0(this.access000, this.extraCallback, uriArr, basicTextContextMenuProviderKtExternalSyntheticLambda4Arr, this.onTransact, this.extraCallbackWithResult, this.onActivityLayout, this.onMessageChannelReady, list, this.readTypedObject, this.IAuthTabCallback), map, this.onWarmupCompleted, j, basicTextContextMenuProviderKtExternalSyntheticLambda4, this.IAuthTabCallbackStub, this.asBinder, this.getInterfaceDescriptor, this.IAuthTabCallback_Parcel, this.writeTypedObject);
        int i4 = onUnminimized + 21;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return textFieldSelectionManager_androidKtExternalSyntheticLambda4;
    }

    private static Map<String, BasicTextContextMenuProviderExternalSyntheticLambda0> onNavigationEvent(List<BasicTextContextMenuProviderExternalSyntheticLambda0> list) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i3 = onUnminimized + 35;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 % 4;
        }
        int i5 = 0;
        while (i5 < arrayList.size()) {
            BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallback = list.get(i5);
            String str = basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallback.onWarmupCompleted;
            i5++;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                int i7 = onUnminimized + 109;
                ICustomTabsCallbackStub = i7 % 128;
                if (i7 % 2 != 0) {
                    BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0 = (BasicTextContextMenuProviderExternalSyntheticLambda0) arrayList.get(i6);
                    if (!TextUtils.equals(basicTextContextMenuProviderExternalSyntheticLambda0.onWarmupCompleted, str)) {
                        i6++;
                    } else {
                        basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallback = basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallback.onExtraCallback(basicTextContextMenuProviderExternalSyntheticLambda0);
                        arrayList.remove(i6);
                    }
                } else {
                    TextUtils.equals(((BasicTextContextMenuProviderExternalSyntheticLambda0) arrayList.get(i6)).onWarmupCompleted, str);
                    throw null;
                }
            }
            map.put(str, basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallback);
        }
        return map;
    }

    private static BasicTextContextMenuProviderKtExternalSyntheticLambda4 onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        int i2 = 2 % 2;
        Object[] objArr = {basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub, 2};
        String str = (String) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-143057283, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, 143057290);
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4.readTypedObject).IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.onMinimized).onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4.onActivityResized).onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4.asInterface).IAuthTabCallbackDefault(AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onNavigationEvent(str)).onExtraCallback(str).onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallbackDefault).onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult).extraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallbackStub).onActivityLayout(basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetchWithMultipleUrls).access100(basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback).onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4.writeTypedObject).onActivityResized(basicTextContextMenuProviderKtExternalSyntheticLambda4.newAuthTabSession).readTypedObject(basicTextContextMenuProviderKtExternalSyntheticLambda4.mayLaunchUrl).onNavigationEvent();
        int i3 = ICustomTabsCallbackStub + 45;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        return basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c A[PHI: r6
      0x004c: PHI (r6v7 com.google.common.collect.ImmutableList) = (r6v4 com.google.common.collect.ImmutableList), (r6v11 com.google.common.collect.ImmutableList) binds: [B:8:0x0030, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ImmutableList immutableListOf;
        String str;
        HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0;
        int i2;
        int i3;
        int i4;
        String str2;
        String str3;
        ImmutableList immutableList;
        int i5;
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) objArr[0];
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42 = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i6 = 2 % 2;
        int i7 = onUnminimized + 27;
        ICustomTabsCallbackStub = i7 % 128;
        int i8 = -1;
        if (i7 % 2 == 0) {
            immutableListOf = ImmutableList.of();
            int i9 = 27 / 0;
            if (basicTextContextMenuProviderKtExternalSyntheticLambda42 != null) {
                str = basicTextContextMenuProviderKtExternalSyntheticLambda42.IAuthTabCallbackStub;
                handwritingHandlerNodeExternalSyntheticLambda0 = basicTextContextMenuProviderKtExternalSyntheticLambda42.ICustomTabsCallbackDefault;
                i2 = basicTextContextMenuProviderKtExternalSyntheticLambda42.onNavigationEvent;
                i3 = basicTextContextMenuProviderKtExternalSyntheticLambda42.newAuthTabSession;
                i4 = basicTextContextMenuProviderKtExternalSyntheticLambda42.mayLaunchUrl;
                str2 = basicTextContextMenuProviderKtExternalSyntheticLambda42.onActivityLayout;
                str3 = basicTextContextMenuProviderKtExternalSyntheticLambda42.onMinimized;
                immutableList = basicTextContextMenuProviderKtExternalSyntheticLambda42.onActivityResized;
                int i10 = onUnminimized + 61;
                ICustomTabsCallbackStub = i10 % 128;
                int i11 = i10 % 2;
            } else {
                Object[] objArr2 = {basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub, 1};
                String str4 = (String) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-143057283, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr2, 143057290);
                HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda02 = basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallbackDefault;
                if (zBooleanValue) {
                    int i12 = ICustomTabsCallbackStub + 43;
                    onUnminimized = i12 % 128;
                    int i13 = i12 % 2;
                    i2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent;
                    int i14 = basicTextContextMenuProviderKtExternalSyntheticLambda4.newAuthTabSession;
                    int i15 = basicTextContextMenuProviderKtExternalSyntheticLambda4.mayLaunchUrl;
                    str2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.onActivityLayout;
                    str3 = basicTextContextMenuProviderKtExternalSyntheticLambda4.onMinimized;
                    i3 = i14;
                    str = str4;
                    handwritingHandlerNodeExternalSyntheticLambda0 = handwritingHandlerNodeExternalSyntheticLambda02;
                    immutableList = basicTextContextMenuProviderKtExternalSyntheticLambda4.onActivityResized;
                    i4 = i15;
                } else {
                    i3 = 0;
                    i4 = 0;
                    str = str4;
                    handwritingHandlerNodeExternalSyntheticLambda0 = handwritingHandlerNodeExternalSyntheticLambda02;
                    immutableList = immutableListOf;
                    str2 = null;
                    str3 = null;
                    i2 = -1;
                }
            }
        } else {
            immutableListOf = ImmutableList.of();
            if (basicTextContextMenuProviderKtExternalSyntheticLambda42 != null) {
            }
        }
        String strOnNavigationEvent = AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onNavigationEvent(str);
        if (zBooleanValue) {
            int i16 = onUnminimized + 69;
            ICustomTabsCallbackStub = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult;
                throw null;
            }
            i5 = basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult;
        } else {
            int i18 = onUnminimized + 59;
            ICustomTabsCallbackStub = i18 % 128;
            int i19 = i18 % 2;
            i5 = -1;
        }
        if (zBooleanValue) {
            int i20 = onUnminimized + 47;
            ICustomTabsCallbackStub = i20 % 128;
            int i21 = i20 % 2;
            i8 = basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallbackStub;
        }
        return new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4.readTypedObject).IAuthTabCallback(str3).onNavigationEvent(immutableList).onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4.asInterface).IAuthTabCallbackDefault(strOnNavigationEvent).onExtraCallback(str).onExtraCallbackWithResult(handwritingHandlerNodeExternalSyntheticLambda0).onNavigationEvent(i5).extraCallback(i8).onExtraCallback(i2).onActivityResized(i3).readTypedObject(i4).onWarmupCompleted(str2).onNavigationEvent();
    }

    private void onNavigationEvent(long j, List<AlertDialogKtExternalSyntheticLambda6.IAuthTabCallback> list, List<TextFieldSelectionManager_androidKtExternalSyntheticLambda4> list2, List<int[]> list3, Map<String, BasicTextContextMenuProviderExternalSyntheticLambda0> map) {
        Object[] objArr = {this, Long.valueOf(j), list, list2, list3, map};
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        onNavigationEvent(objArr, -1263349360, zzgsa.onWarmupCompleted(), 1263349361, iOnWarmupCompleted, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
    }

    class onExtraCallbackWithResult implements TextFieldSelectionManager_androidKtExternalSyntheticLambda4.onWarmupCompleted {
        private onExtraCallbackWithResult() {
        }

        @Override // o.TextFieldSelectionManager_androidKtExternalSyntheticLambda4.onWarmupCompleted
        public void onNavigationEvent() {
            if (TextFieldSelectionManager_androidKtExternalSyntheticLambda8.onExtraCallback(TextFieldSelectionManager_androidKtExternalSyntheticLambda8.this) > 0) {
                return;
            }
            int i2 = 0;
            for (TextFieldSelectionManager_androidKtExternalSyntheticLambda4 textFieldSelectionManager_androidKtExternalSyntheticLambda4 : TextFieldSelectionManager_androidKtExternalSyntheticLambda8.onNavigationEvent(TextFieldSelectionManager_androidKtExternalSyntheticLambda8.this)) {
                i2 += textFieldSelectionManager_androidKtExternalSyntheticLambda4.IAuthTabCallbackDefault().onExtraCallbackWithResult;
            }
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[] coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[i2];
            int i3 = 0;
            for (TextFieldSelectionManager_androidKtExternalSyntheticLambda4 textFieldSelectionManager_androidKtExternalSyntheticLambda42 : TextFieldSelectionManager_androidKtExternalSyntheticLambda8.onNavigationEvent(TextFieldSelectionManager_androidKtExternalSyntheticLambda8.this)) {
                int i4 = textFieldSelectionManager_androidKtExternalSyntheticLambda42.IAuthTabCallbackDefault().onExtraCallbackWithResult;
                int i5 = 0;
                while (i5 < i4) {
                    coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr[i3] = textFieldSelectionManager_androidKtExternalSyntheticLambda42.IAuthTabCallbackDefault().onWarmupCompleted(i5);
                    i5++;
                    i3++;
                }
            }
            TextFieldSelectionManager_androidKtExternalSyntheticLambda8.onExtraCallbackWithResult(TextFieldSelectionManager_androidKtExternalSyntheticLambda8.this, new BottomSheetScaffoldKtExternalSyntheticLambda11(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr));
            TextFieldSelectionManager_androidKtExternalSyntheticLambda8.onWarmupCompleted(TextFieldSelectionManager_androidKtExternalSyntheticLambda8.this).IAuthTabCallback(TextFieldSelectionManager_androidKtExternalSyntheticLambda8.this);
        }

        @Override // o.TextFieldSelectionManager_androidKtExternalSyntheticLambda4.onWarmupCompleted
        public void onExtraCallbackWithResult(Uri uri) {
            TextFieldSelectionManager_androidKtExternalSyntheticLambda8.IAuthTabCallback(TextFieldSelectionManager_androidKtExternalSyntheticLambda8.this).onExtraCallback(uri);
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda8$onExtraCallback
        public void onWarmupCompleted(TextFieldSelectionManager_androidKtExternalSyntheticLambda4 textFieldSelectionManager_androidKtExternalSyntheticLambda4) {
            TextFieldSelectionManager_androidKtExternalSyntheticLambda8.onWarmupCompleted(TextFieldSelectionManager_androidKtExternalSyntheticLambda8.this).onWarmupCompleted(TextFieldSelectionManager_androidKtExternalSyntheticLambda8.this);
        }
    }

    private static BasicTextContextMenuProviderKtExternalSyntheticLambda4 onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42, boolean z) {
        Object[] objArr = {basicTextContextMenuProviderKtExternalSyntheticLambda4, basicTextContextMenuProviderKtExternalSyntheticLambda42, Boolean.valueOf(z)};
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return (BasicTextContextMenuProviderKtExternalSyntheticLambda4) onNavigationEvent(objArr, 1000794831, zzgsa.onWarmupCompleted(), -1000794831, iOnWarmupCompleted, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
    }
}
