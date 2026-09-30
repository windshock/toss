package o;

import android.content.Context;
import android.os.Handler;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.ui.DefaultViewSpecProvider;
import com.alibaba.ariver.kernel.RVParams;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.material.button.MaterialButton;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.zxing.aztec.encoder.Encoder;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import o.ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2;
import o.ComposableSingletonsSnackbarHostKtExternalSyntheticLambda0;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda23;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ComposableSingletonsSnackbarHostKtExternalSyntheticLambda0 implements ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2, TextFieldSelectionStateExternalSyntheticLambda7 {
    public static final ImmutableList<Long> IAuthTabCallback;
    private static int ICustomTabsCallbackStubProxy;
    private static ComposableSingletonsSnackbarHostKtExternalSyntheticLambda0 asBinder;
    public static final ImmutableList<Long> asInterface;
    public static final ImmutableList<Long> onExtraCallback;
    public static final ImmutableList<Long> onExtraCallbackWithResult;
    private static int onMinimized;
    public static final ImmutableList<Long> onNavigationEvent;
    public static final ImmutableList<Long> onWarmupCompleted;
    private long IAuthTabCallbackDefault;
    private final Context IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private final ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2.IAuthTabCallback.onNavigationEvent IAuthTabCallback_Parcel;
    private long ICustomTabsCallback;
    private String access000;
    private final ImmutableMap<Integer, Long> access100;
    private boolean extraCallback;
    private long extraCallbackWithResult;
    private long getInterfaceDescriptor;
    private int onActivityLayout;
    private final ComposableSingletonsScaffoldKtExternalSyntheticLambda7 onActivityResized;
    private long onMessageChannelReady;
    private long onPostMessage;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda0 onTransact;
    private final boolean readTypedObject;
    private int writeTypedObject;
    private static final byte[] $$a = {106, -23, 12, Byte.MIN_VALUE};
    private static final int $$b = 170;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallbackDefault = 1;
    private static int onRelationshipValidationResult = 0;
    private static int ICustomTabsCallbackStub = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, byte b, short s) {
        int i3;
        int i4 = (i2 * 3) + 105;
        int i5 = s * 2;
        int i6 = 3 - (b * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i6;
            int i9 = 0;
            i4 += -i6;
            i6 = i8;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            int i10 = i6 + 1;
            int i11 = i3 + 1;
            i8 = i10;
            i6 = bArr[i10];
            i9 = i11;
            i4 += -i6;
            i6 = i8;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(ComposableSingletonsSnackbarHostKtExternalSyntheticLambda0 composableSingletonsSnackbarHostKtExternalSyntheticLambda0, int i2) {
        int i3 = 2 % 2;
        int i4 = onRelationshipValidationResult + 77;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        composableSingletonsSnackbarHostKtExternalSyntheticLambda0.onExtraCallbackWithResult(i2);
        int i6 = onRelationshipValidationResult + 49;
        ICustomTabsCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2
    public TextFieldSelectionStateExternalSyntheticLambda7 onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult;
        int i4 = i3 + 73;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i5 = i3 + 107;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public void onWarmupCompleted(TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12, boolean z) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStub + 89;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    static {
        ICustomTabsCallbackStubProxy = 0;
        onWarmupCompleted();
        asInterface = ImmutableList.of(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
        onWarmupCompleted = ImmutableList.of(1500000L, 980000L, 750000L, 520000L, 290000L);
        IAuthTabCallback = ImmutableList.of(2000000L, 1300000L, 1000000L, 860000L, 610000L);
        onExtraCallbackWithResult = ImmutableList.of(2500000L, 1700000L, 1200000L, 970000L, 680000L);
        onExtraCallback = ImmutableList.of(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
        onNavigationEvent = ImmutableList.of(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
        int i2 = ICustomTabsCallbackDefault + 19;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i2, int i3, char[] cArr, boolean z, int i4, Object[] objArr) throws Throwable {
        char c;
        int i5;
        Throwable cause;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        int i7 = $10 + 87;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (true) {
            c = '0';
            i5 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i9 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(onMinimized)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 35125), TextUtils.indexOf("", "") + 23, ExpandableListView.getPackedPositionChild(0L) + 10279, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 12844), (ViewConfiguration.getEdgeSlop() >> 16) + 55, 2168 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i10 = $11 + 9;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 4 % 2;
                }
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
            int i12 = $11 + 103;
            $10 = i12 % 128;
            int i13 = i12 % 2;
        }
        if (z) {
            int i14 = $11 + 49;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    char cResolveSize = (char) (View.resolveSize(0, 0) + 12843);
                    int jumpTapTimeout = 55 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int iIndexOf = 2166 - TextUtils.indexOf("", c, 0);
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveSize, jumpTapTimeout, iIndexOf, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                c = '0';
                i5 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public static final class IAuthTabCallback {
        private final Map<Integer, Long> IAuthTabCallback;
        private boolean onExtraCallback;
        private final Context onExtraCallbackWithResult;
        private TextFieldDecoratorModifierNodeExternalSyntheticLambda0 onNavigationEvent;
        private int onWarmupCompleted;

        public IAuthTabCallback(Context context) {
            this.onExtraCallbackWithResult = context == null ? null : context.getApplicationContext();
            this.onWarmupCompleted = 2000;
            this.onNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda0.onNavigationEvent;
            this.onExtraCallback = true;
            HashMap map = new HashMap(8);
            this.IAuthTabCallback = map;
            map.put(0, 1000000L);
            map.put(2, -9223372036854775807L);
            map.put(3, -9223372036854775807L);
            map.put(4, -9223372036854775807L);
            map.put(5, -9223372036854775807L);
            map.put(10, -9223372036854775807L);
            map.put(9, -9223372036854775807L);
            map.put(7, -9223372036854775807L);
        }

        public ComposableSingletonsSnackbarHostKtExternalSyntheticLambda0 onNavigationEvent() {
            return new ComposableSingletonsSnackbarHostKtExternalSyntheticLambda0(this.onExtraCallbackWithResult, this.IAuthTabCallback, this.onWarmupCompleted, this.onNavigationEvent, this.onExtraCallback);
        }
    }

    public static ComposableSingletonsSnackbarHostKtExternalSyntheticLambda0 onExtraCallbackWithResult(Context context) {
        ComposableSingletonsSnackbarHostKtExternalSyntheticLambda0 composableSingletonsSnackbarHostKtExternalSyntheticLambda0;
        synchronized (ComposableSingletonsSnackbarHostKtExternalSyntheticLambda0.class) {
            if (asBinder == null) {
                asBinder = new IAuthTabCallback(context).onNavigationEvent();
            }
            composableSingletonsSnackbarHostKtExternalSyntheticLambda0 = asBinder;
        }
        return composableSingletonsSnackbarHostKtExternalSyntheticLambda0;
    }

    private ComposableSingletonsSnackbarHostKtExternalSyntheticLambda0(@Nullable Context context, Map<Integer, Long> map, int i2, TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0, boolean z) {
        Context applicationContext;
        Object obj = null;
        if (context == null) {
            int i3 = ICustomTabsCallbackStub + 7;
            onRelationshipValidationResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
            int i6 = 2 % 2;
        }
        this.IAuthTabCallbackStub = applicationContext;
        this.access100 = ImmutableMap.copyOf(map);
        this.IAuthTabCallback_Parcel = new ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2.IAuthTabCallback.onNavigationEvent();
        this.onActivityResized = new ComposableSingletonsScaffoldKtExternalSyntheticLambda7(i2);
        this.onTransact = textFieldDecoratorModifierNodeExternalSyntheticLambda0;
        this.readTypedObject = z;
        if (context == null) {
            this.IAuthTabCallbackStubProxy = 0;
            this.IAuthTabCallbackDefault = 1000000L;
            return;
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda23 textFieldDecoratorModifierNodeExternalSyntheticLambda23OnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda23.onNavigationEvent(context);
        int iIAuthTabCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda23OnNavigationEvent.IAuthTabCallback();
        this.IAuthTabCallbackStubProxy = iIAuthTabCallback;
        this.IAuthTabCallbackDefault = onExtraCallback(iIAuthTabCallback);
        textFieldDecoratorModifierNodeExternalSyntheticLambda23OnNavigationEvent.onNavigationEvent(new TextFieldDecoratorModifierNodeExternalSyntheticLambda23.onExtraCallback() { // from class: androidx.media3.exoplayer.upstream.DefaultBandwidthMeter$$ExternalSyntheticLambda0
            @Override // o.TextFieldDecoratorModifierNodeExternalSyntheticLambda23.onExtraCallback
            public final void onNetworkTypeChanged(int i7) {
                ComposableSingletonsSnackbarHostKtExternalSyntheticLambda0.onExtraCallbackWithResult(this.f$0, i7);
            }
        }, RecordingInputConnectionExternalSyntheticLambda0.IAuthTabCallback());
        int i7 = onRelationshipValidationResult + 69;
        ICustomTabsCallbackStub = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2
    public long IAuthTabCallback() {
        long j;
        synchronized (this) {
            j = this.IAuthTabCallbackDefault;
        }
        return j;
    }

    @Override // o.ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2
    public void onWarmupCompleted(Handler handler, ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback) {
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult + 47;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallback_Parcel.onExtraCallbackWithResult(handler, iAuthTabCallback);
        int i5 = onRelationshipValidationResult + 5;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
    }

    @Override // o.ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2
    public void onExtraCallback(ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStub + 23;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallback_Parcel.IAuthTabCallback(iAuthTabCallback);
        int i5 = ICustomTabsCallbackStub + 17;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
    }

    public void IAuthTabCallback(TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12, boolean z) {
        synchronized (this) {
            if (onWarmupCompleted(textFieldSelectionStateExternalSyntheticLambda12, z)) {
                if (this.onActivityLayout == 0) {
                    this.ICustomTabsCallback = this.onTransact.IAuthTabCallback();
                }
                this.onActivityLayout++;
            }
        }
    }

    public void onExtraCallbackWithResult(TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12, boolean z, int i2) {
        synchronized (this) {
            if (onWarmupCompleted(textFieldSelectionStateExternalSyntheticLambda12, z)) {
                this.extraCallbackWithResult += i2;
            }
        }
    }

    public void onExtraCallbackWithResult(TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12, boolean z) {
        synchronized (this) {
            try {
                if (onWarmupCompleted(textFieldSelectionStateExternalSyntheticLambda12, z)) {
                    RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onActivityLayout > 0);
                    long jIAuthTabCallback = this.onTransact.IAuthTabCallback();
                    int i2 = (int) (jIAuthTabCallback - this.ICustomTabsCallback);
                    this.onMessageChannelReady += i2;
                    long j = this.onPostMessage;
                    long j2 = this.extraCallbackWithResult;
                    this.onPostMessage = j + j2;
                    if (i2 > 0) {
                        this.onActivityResized.onExtraCallback((int) Math.sqrt(j2), (j2 * 8000.0f) / i2);
                        if (this.onMessageChannelReady >= 2000 || this.onPostMessage >= 524288) {
                            this.IAuthTabCallbackDefault = (long) this.onActivityResized.onNavigationEvent(0.5f);
                        }
                        IAuthTabCallback(i2, this.extraCallbackWithResult, this.IAuthTabCallbackDefault);
                        this.ICustomTabsCallback = jIAuthTabCallback;
                        this.extraCallbackWithResult = 0L;
                    }
                    this.onActivityLayout--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void onExtraCallbackWithResult(int i2) {
        synchronized (this) {
            int i3 = this.IAuthTabCallbackStubProxy;
            if (i3 == 0 || this.readTypedObject) {
                if (this.extraCallback) {
                    i2 = this.writeTypedObject;
                }
                if (i3 != i2 || this.access000 == null) {
                    this.IAuthTabCallbackStubProxy = i2;
                    if (i2 != 1 && i2 != 0 && i2 != 8) {
                        if (this.access000 == null) {
                            this.access000 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(this.IAuthTabCallbackStub);
                        }
                        this.IAuthTabCallbackDefault = onExtraCallback(i2);
                        long jIAuthTabCallback = this.onTransact.IAuthTabCallback();
                        IAuthTabCallback(this.onActivityLayout > 0 ? (int) (jIAuthTabCallback - this.ICustomTabsCallback) : 0, this.extraCallbackWithResult, this.IAuthTabCallbackDefault);
                        this.ICustomTabsCallback = jIAuthTabCallback;
                        this.extraCallbackWithResult = 0L;
                        this.onPostMessage = 0L;
                        this.onMessageChannelReady = 0L;
                        this.onActivityResized.onNavigationEvent();
                    }
                }
            }
        }
    }

    private void IAuthTabCallback(int i2, long j, long j2) {
        int i3 = 2 % 2;
        if (i2 == 0 && j == 0) {
            int i4 = ICustomTabsCallbackStub;
            int i5 = i4 + 93;
            onRelationshipValidationResult = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            if (j2 == this.getInterfaceDescriptor) {
                int i6 = i4 + 51;
                onRelationshipValidationResult = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 46 / 0;
                    return;
                }
                return;
            }
        }
        this.getInterfaceDescriptor = j2;
        this.IAuthTabCallback_Parcel.onExtraCallbackWithResult(i2, j, j2);
        int i8 = ICustomTabsCallbackStub + 43;
        onRelationshipValidationResult = i8 % 128;
        int i9 = i8 % 2;
    }

    private long onExtraCallback(int i2) {
        int i3 = 2 % 2;
        int i4 = onRelationshipValidationResult + 33;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Long lValueOf = (Long) this.access100.get(Integer.valueOf(i2));
        if (lValueOf == null) {
            int i6 = ICustomTabsCallbackStub + 79;
            onRelationshipValidationResult = i6 % 128;
            int i7 = i6 % 2;
            lValueOf = (Long) this.access100.get(0);
        } else if (lValueOf.longValue() == -9223372036854775807L) {
            int i8 = ICustomTabsCallbackStub + 13;
            onRelationshipValidationResult = i8 % 128;
            if (i8 % 2 != 0) {
                Long.valueOf(IAuthTabCallback(this.access000, i2));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            lValueOf = Long.valueOf(IAuthTabCallback(this.access000, i2));
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }

    private static boolean onWarmupCompleted(TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12, boolean z) {
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult + 1;
        int i4 = i3 % 128;
        ICustomTabsCallbackStub = i4;
        int i5 = i3 % 2;
        if (!z) {
            return false;
        }
        int i6 = i4 + 29;
        onRelationshipValidationResult = i6 % 128;
        if (i6 % 2 != 0) {
            if (textFieldSelectionStateExternalSyntheticLambda12.onExtraCallback(17)) {
                return false;
            }
        } else if (textFieldSelectionStateExternalSyntheticLambda12.onExtraCallback(8)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r6
      0x0023: PHI (r6v3 int[]) = (r6v2 int[]), (r6v33 int[]) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long IAuthTabCallback(@Nullable String str, int i2) throws Throwable {
        int[] iArrOnWarmupCompleted;
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallbackStub + 5;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            iArrOnWarmupCompleted = onWarmupCompleted(Strings.nullToEmpty(str));
            if (i2 != 5) {
                int i5 = onRelationshipValidationResult;
                int i6 = i5 + 69;
                ICustomTabsCallbackStub = i6 % 128;
                if (i6 % 2 != 0 ? i2 == 3 : i2 == 5) {
                    return ((Long) onWarmupCompleted.get(iArrOnWarmupCompleted[1])).longValue();
                }
                if (i2 == 4) {
                    return ((Long) IAuthTabCallback.get(iArrOnWarmupCompleted[2])).longValue();
                }
                int i7 = i5 + 77;
                int i8 = i7 % 128;
                ICustomTabsCallbackStub = i8;
                int i9 = i7 % 2;
                if (i2 == 5) {
                    return ((Long) onExtraCallbackWithResult.get(iArrOnWarmupCompleted[3])).longValue();
                }
                if (i2 != 7) {
                    if (i2 == 9) {
                        return ((Long) onNavigationEvent.get(iArrOnWarmupCompleted[5])).longValue();
                    }
                    if (i2 == 10) {
                        return ((Long) onExtraCallback.get(iArrOnWarmupCompleted[4])).longValue();
                    }
                    int i10 = i8 + 57;
                    onRelationshipValidationResult = i10 % 128;
                    if (i10 % 2 == 0) {
                        return 1000000L;
                    }
                    throw null;
                }
            }
        } else {
            iArrOnWarmupCompleted = onWarmupCompleted(Strings.nullToEmpty(str));
            if (i2 != 2) {
            }
        }
        long jLongValue = ((Long) asInterface.get(iArrOnWarmupCompleted[0])).longValue();
        int i11 = ICustomTabsCallbackStub + 23;
        onRelationshipValidationResult = i11 % 128;
        int i12 = i11 % 2;
        return jLongValue;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:471:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x0bd7  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x0c0f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int[] onWarmupCompleted(String str) throws Throwable {
        char c = 2;
        int i2 = 2 % 2;
        int iHashCode = str.hashCode();
        if (iHashCode != 2091) {
            if (iHashCode != 2092) {
                if (iHashCode != 2102) {
                    if (iHashCode != 2103) {
                        if (iHashCode != 2111) {
                            if (iHashCode != 2112) {
                                if (iHashCode != 2135) {
                                    if (iHashCode != 2136) {
                                        switch (iHashCode) {
                                            case 2083:
                                                if (!str.equals("AD")) {
                                                    c = 65535;
                                                    break;
                                                } else {
                                                    c = 0;
                                                    break;
                                                }
                                            case 2084:
                                                if (str.equals("AE")) {
                                                    c = 1;
                                                    break;
                                                }
                                                break;
                                            case 2085:
                                                if (!str.equals("AF")) {
                                                }
                                                break;
                                            case 2086:
                                                if (str.equals("AG")) {
                                                    c = 3;
                                                    break;
                                                }
                                                break;
                                            default:
                                                switch (iHashCode) {
                                                    case 2088:
                                                        if (str.equals("AI")) {
                                                            c = 4;
                                                            break;
                                                        }
                                                        break;
                                                    case 2094:
                                                        if (str.equals("AO")) {
                                                            c = 7;
                                                            break;
                                                        }
                                                        break;
                                                    case 2105:
                                                        if (str.equals("AZ")) {
                                                            c = 15;
                                                            break;
                                                        }
                                                        break;
                                                    case 2114:
                                                        if (str.equals("BD")) {
                                                            c = 18;
                                                            break;
                                                        }
                                                        break;
                                                    case 2115:
                                                        if (str.equals("BE")) {
                                                            c = 19;
                                                            break;
                                                        }
                                                        break;
                                                    case 2116:
                                                        if (str.equals("BF")) {
                                                            c = 20;
                                                            break;
                                                        }
                                                        break;
                                                    case 2117:
                                                        if (str.equals("BG")) {
                                                            c = 21;
                                                            break;
                                                        }
                                                        break;
                                                    case 2118:
                                                        if (!(!str.equals("BH"))) {
                                                            c = 22;
                                                            break;
                                                        }
                                                        break;
                                                    case 2119:
                                                        if (str.equals("BI")) {
                                                            c = 23;
                                                            break;
                                                        }
                                                        break;
                                                    case 2120:
                                                        if (str.equals("BJ")) {
                                                            c = 24;
                                                            break;
                                                        }
                                                        break;
                                                    case 2133:
                                                        if (str.equals("BW")) {
                                                            c = '!';
                                                            break;
                                                        }
                                                        break;
                                                    case 2142:
                                                        if (str.equals("CA")) {
                                                            c = '$';
                                                            break;
                                                        }
                                                        break;
                                                    case 2145:
                                                        if (str.equals("CD")) {
                                                            c = '%';
                                                            break;
                                                        }
                                                        break;
                                                    case 2152:
                                                        if (str.equals("CK")) {
                                                            c = '*';
                                                            break;
                                                        }
                                                        break;
                                                    case 2153:
                                                        if (str.equals("CL")) {
                                                            c = '+';
                                                            break;
                                                        }
                                                        break;
                                                    case 2154:
                                                        if (str.equals("CM")) {
                                                            c = ',';
                                                            break;
                                                        }
                                                        break;
                                                    case 2155:
                                                        if (str.equals("CN")) {
                                                            c = '-';
                                                            break;
                                                        }
                                                        break;
                                                    case 2156:
                                                        if (str.equals("CO")) {
                                                            c = '.';
                                                            break;
                                                        }
                                                        break;
                                                    case 2159:
                                                        if (str.equals("CR")) {
                                                            c = '/';
                                                            break;
                                                        }
                                                        break;
                                                    case 2162:
                                                        if (str.equals("CU")) {
                                                            c = '0';
                                                            break;
                                                        }
                                                        break;
                                                    case 2163:
                                                        if (str.equals("CV")) {
                                                            c = '1';
                                                            break;
                                                        }
                                                        break;
                                                    case 2164:
                                                        if (str.equals("CW")) {
                                                            c = '2';
                                                            break;
                                                        }
                                                        break;
                                                    case 2165:
                                                        if (str.equals("CX")) {
                                                            c = '3';
                                                            break;
                                                        }
                                                        break;
                                                    case 2166:
                                                        if (str.equals("CY")) {
                                                            int i3 = ICustomTabsCallbackStub + 27;
                                                            onRelationshipValidationResult = i3 % 128;
                                                            if (i3 % 2 == 0) {
                                                                c = '4';
                                                                break;
                                                            } else {
                                                                c = 28;
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    case 2167:
                                                        if (str.equals("CZ")) {
                                                            int i4 = onRelationshipValidationResult + 91;
                                                            ICustomTabsCallbackStub = i4 % 128;
                                                            if (i4 % 2 != 0) {
                                                                c = '5';
                                                                break;
                                                            } else {
                                                                c = 16;
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    case 2177:
                                                        if (str.equals("DE")) {
                                                            c = '6';
                                                            break;
                                                        }
                                                        break;
                                                    case 2182:
                                                        if (str.equals("DJ")) {
                                                            c = '7';
                                                            break;
                                                        }
                                                        break;
                                                    case 2183:
                                                        if (str.equals("DK")) {
                                                            c = '8';
                                                            break;
                                                        }
                                                        break;
                                                    case 2185:
                                                        if (str.equals("DM")) {
                                                            c = '9';
                                                            break;
                                                        }
                                                        break;
                                                    case 2187:
                                                        if (str.equals("DO")) {
                                                            c = ':';
                                                            break;
                                                        }
                                                        break;
                                                    case 2198:
                                                        if (str.equals("DZ")) {
                                                            c = ';';
                                                            break;
                                                        }
                                                        break;
                                                    case 2206:
                                                        Object[] objArr = new Object[1];
                                                        a(3 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 3, new char[]{1, 65535}, false, 127 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
                                                        if (str.equals(((String) objArr[0]).intern())) {
                                                            c = '<';
                                                            break;
                                                        }
                                                        break;
                                                    case 2208:
                                                        if (str.equals("EE")) {
                                                            c = '=';
                                                            break;
                                                        }
                                                        break;
                                                    case 2210:
                                                        if (str.equals("EG")) {
                                                            c = '>';
                                                            break;
                                                        }
                                                        break;
                                                    case 2221:
                                                        if (str.equals("ER")) {
                                                            c = '?';
                                                            break;
                                                        }
                                                        break;
                                                    case 2222:
                                                        if (str.equals("ES")) {
                                                            c = '@';
                                                            break;
                                                        }
                                                        break;
                                                    case 2223:
                                                        if (str.equals("ET")) {
                                                            c = 'A';
                                                            break;
                                                        }
                                                        break;
                                                    case 2243:
                                                        if (str.equals("FI")) {
                                                            c = 'B';
                                                            break;
                                                        }
                                                        break;
                                                    case 2244:
                                                        if (str.equals("FJ")) {
                                                            c = 'C';
                                                            break;
                                                        }
                                                        break;
                                                    case 2245:
                                                        if (str.equals("FK")) {
                                                            c = 'D';
                                                            break;
                                                        }
                                                        break;
                                                    case 2247:
                                                        if (str.equals("FM")) {
                                                            c = 'E';
                                                            break;
                                                        }
                                                        break;
                                                    case 2249:
                                                        if (str.equals("FO")) {
                                                            c = 'F';
                                                            break;
                                                        }
                                                        break;
                                                    case 2252:
                                                        if (str.equals("FR")) {
                                                            c = 'G';
                                                            break;
                                                        }
                                                        break;
                                                    case 2266:
                                                        if (str.equals("GA")) {
                                                            c = 'H';
                                                            break;
                                                        }
                                                        break;
                                                    case 2267:
                                                        if (str.equals("GB")) {
                                                            c = 'I';
                                                            break;
                                                        }
                                                        break;
                                                    case 2269:
                                                        if (str.equals("GD")) {
                                                            c = 'J';
                                                            break;
                                                        }
                                                        break;
                                                    case 2270:
                                                        if (str.equals("GE")) {
                                                            c = 'K';
                                                            break;
                                                        }
                                                        break;
                                                    case 2271:
                                                        if (str.equals("GF")) {
                                                            c = 'L';
                                                            break;
                                                        }
                                                        break;
                                                    case 2272:
                                                        if (str.equals("GG")) {
                                                            c = 'M';
                                                            break;
                                                        }
                                                        break;
                                                    case 2273:
                                                        if (str.equals("GH")) {
                                                            c = 'N';
                                                            break;
                                                        }
                                                        break;
                                                    case 2274:
                                                        if (str.equals("GI")) {
                                                            c = 'O';
                                                            break;
                                                        }
                                                        break;
                                                    case 2277:
                                                        if (str.equals("GL")) {
                                                            c = 'P';
                                                            break;
                                                        }
                                                        break;
                                                    case 2278:
                                                        if (str.equals("GM")) {
                                                            c = 'Q';
                                                            break;
                                                        }
                                                        break;
                                                    case 2279:
                                                        if (str.equals("GN")) {
                                                            c = 'R';
                                                            break;
                                                        }
                                                        break;
                                                    case 2281:
                                                        if (str.equals("GP")) {
                                                            c = 'S';
                                                            break;
                                                        }
                                                        break;
                                                    case 2282:
                                                        if (str.equals("GQ")) {
                                                            c = 'T';
                                                            break;
                                                        }
                                                        break;
                                                    case 2283:
                                                        if (str.equals("GR")) {
                                                            c = 'U';
                                                            break;
                                                        }
                                                        break;
                                                    case 2285:
                                                        if (str.equals("GT")) {
                                                            c = 'V';
                                                            break;
                                                        }
                                                        break;
                                                    case 2286:
                                                        if (str.equals("GU")) {
                                                            c = 'W';
                                                            break;
                                                        }
                                                        break;
                                                    case 2288:
                                                        if (str.equals("GW")) {
                                                            c = 'X';
                                                            break;
                                                        }
                                                        break;
                                                    case 2290:
                                                        if (str.equals("GY")) {
                                                            c = 'Y';
                                                            break;
                                                        }
                                                        break;
                                                    case 2307:
                                                        if (str.equals("HK")) {
                                                            c = 'Z';
                                                            break;
                                                        }
                                                        break;
                                                    case 2314:
                                                        if (str.equals("HR")) {
                                                            c = '[';
                                                            break;
                                                        }
                                                        break;
                                                    case 2316:
                                                        if (str.equals("HT")) {
                                                            c = '\\';
                                                            break;
                                                        }
                                                        break;
                                                    case 2317:
                                                        if (str.equals("HU")) {
                                                            c = ']';
                                                            break;
                                                        }
                                                        break;
                                                    case 2331:
                                                        if (str.equals("ID")) {
                                                            c = '^';
                                                            break;
                                                        }
                                                        break;
                                                    case 2332:
                                                        if (str.equals("IE")) {
                                                            c = '_';
                                                            break;
                                                        }
                                                        break;
                                                    case 2339:
                                                        if (str.equals("IL")) {
                                                            c = '`';
                                                            break;
                                                        }
                                                        break;
                                                    case 2340:
                                                        if (str.equals("IM")) {
                                                            c = 'a';
                                                            break;
                                                        }
                                                        break;
                                                    case 2341:
                                                        if (str.equals("IN")) {
                                                            c = 'b';
                                                            break;
                                                        }
                                                        break;
                                                    case 2342:
                                                        if (str.equals("IO")) {
                                                            c = 'c';
                                                            break;
                                                        }
                                                        break;
                                                    case 2344:
                                                        if (str.equals("IQ")) {
                                                            int i5 = onRelationshipValidationResult + 41;
                                                            ICustomTabsCallbackStub = i5 % 128;
                                                            if (i5 % 2 != 0) {
                                                                c = 'd';
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    case 2345:
                                                        if (str.equals("IR")) {
                                                            c = 'e';
                                                            break;
                                                        }
                                                        break;
                                                    case 2346:
                                                        if (str.equals("IS")) {
                                                            c = 'f';
                                                            break;
                                                        }
                                                        break;
                                                    case 2347:
                                                        if (str.equals("IT")) {
                                                            c = 'g';
                                                            break;
                                                        }
                                                        break;
                                                    case 2363:
                                                        if (str.equals("JE")) {
                                                            c = 'h';
                                                            break;
                                                        }
                                                        break;
                                                    case 2371:
                                                        if (str.equals("JM")) {
                                                            c = 'i';
                                                            break;
                                                        }
                                                        break;
                                                    case 2373:
                                                        if (str.equals("JO")) {
                                                            c = 'j';
                                                            break;
                                                        }
                                                        break;
                                                    case 2374:
                                                        if (str.equals("JP")) {
                                                            c = 'k';
                                                            break;
                                                        }
                                                        break;
                                                    case 2394:
                                                        if (str.equals("KE")) {
                                                            c = 'l';
                                                            break;
                                                        }
                                                        break;
                                                    case 2396:
                                                        if (str.equals("KG")) {
                                                            c = 'm';
                                                            break;
                                                        }
                                                        break;
                                                    case 2397:
                                                        if (str.equals("KH")) {
                                                            c = 'n';
                                                            break;
                                                        }
                                                        break;
                                                    case 2398:
                                                        if (str.equals("KI")) {
                                                            c = 'o';
                                                            break;
                                                        }
                                                        break;
                                                    case 2402:
                                                        if (str.equals("KM")) {
                                                            c = 'p';
                                                            break;
                                                        }
                                                        break;
                                                    case 2403:
                                                        if (str.equals("KN")) {
                                                            c = 'q';
                                                            break;
                                                        }
                                                        break;
                                                    case 2407:
                                                        if (str.equals("KR")) {
                                                            c = 'r';
                                                            break;
                                                        }
                                                        break;
                                                    case 2412:
                                                        if (str.equals("KW")) {
                                                            c = 's';
                                                            break;
                                                        }
                                                        break;
                                                    case 2414:
                                                        if (str.equals("KY")) {
                                                            c = 't';
                                                            break;
                                                        }
                                                        break;
                                                    case 2415:
                                                        if (str.equals("KZ")) {
                                                            c = 'u';
                                                            break;
                                                        }
                                                        break;
                                                    case 2421:
                                                        if (str.equals("LA")) {
                                                            c = 'v';
                                                            break;
                                                        }
                                                        break;
                                                    case 2422:
                                                        if (str.equals("LB")) {
                                                            c = 'w';
                                                            break;
                                                        }
                                                        break;
                                                    case 2423:
                                                        if (str.equals("LC")) {
                                                            c = 'x';
                                                            break;
                                                        }
                                                        break;
                                                    case 2429:
                                                        if (str.equals("LI")) {
                                                            c = 'y';
                                                            break;
                                                        }
                                                        break;
                                                    case 2431:
                                                        if (str.equals("LK")) {
                                                            c = 'z';
                                                            break;
                                                        }
                                                        break;
                                                    case 2438:
                                                        if (str.equals("LR")) {
                                                            c = '{';
                                                            break;
                                                        }
                                                        break;
                                                    case 2439:
                                                        if (str.equals("LS")) {
                                                            c = '|';
                                                            break;
                                                        }
                                                        break;
                                                    case 2440:
                                                        if (str.equals("LT")) {
                                                            c = '}';
                                                            break;
                                                        }
                                                        break;
                                                    case 2441:
                                                        if (str.equals("LU")) {
                                                            c = '~';
                                                            break;
                                                        }
                                                        break;
                                                    case 2442:
                                                        if (str.equals("LV")) {
                                                            c = 127;
                                                            break;
                                                        }
                                                        break;
                                                    case 2445:
                                                        if (str.equals("LY")) {
                                                            c = 128;
                                                            break;
                                                        }
                                                        break;
                                                    case 2452:
                                                        if (str.equals("MA")) {
                                                            c = 129;
                                                            break;
                                                        }
                                                        break;
                                                    case 2454:
                                                        if (str.equals("MC")) {
                                                            c = 130;
                                                            break;
                                                        }
                                                        break;
                                                    case 2455:
                                                        if (str.equals("MD")) {
                                                            c = 131;
                                                            break;
                                                        }
                                                        break;
                                                    case 2456:
                                                        if (str.equals("ME")) {
                                                            c = 132;
                                                            break;
                                                        }
                                                        break;
                                                    case 2457:
                                                        if (str.equals("MF")) {
                                                            c = 133;
                                                            break;
                                                        }
                                                        break;
                                                    case 2458:
                                                        if (str.equals("MG")) {
                                                            c = 134;
                                                            break;
                                                        }
                                                        break;
                                                    case 2459:
                                                        if (str.equals("MH")) {
                                                            c = 135;
                                                            break;
                                                        }
                                                        break;
                                                    case 2462:
                                                        if (str.equals("MK")) {
                                                            c = 136;
                                                            break;
                                                        }
                                                        break;
                                                    case 2463:
                                                        if (str.equals("ML")) {
                                                            c = 137;
                                                            break;
                                                        }
                                                        break;
                                                    case 2464:
                                                        if (str.equals("MM")) {
                                                            c = 138;
                                                            break;
                                                        }
                                                        break;
                                                    case 2465:
                                                        if (str.equals("MN")) {
                                                            c = 139;
                                                            break;
                                                        }
                                                        break;
                                                    case 2466:
                                                        if (str.equals("MO")) {
                                                            c = 140;
                                                            break;
                                                        }
                                                        break;
                                                    case 2467:
                                                        if (str.equals("MP")) {
                                                            c = 141;
                                                            break;
                                                        }
                                                        break;
                                                    case 2468:
                                                        if (str.equals("MQ")) {
                                                            c = 142;
                                                            break;
                                                        }
                                                        break;
                                                    case 2469:
                                                        if (str.equals("MR")) {
                                                            c = 143;
                                                            break;
                                                        }
                                                        break;
                                                    case 2470:
                                                        if (str.equals("MS")) {
                                                            c = 144;
                                                            break;
                                                        }
                                                        break;
                                                    case 2471:
                                                        if (str.equals("MT")) {
                                                            c = 145;
                                                            break;
                                                        }
                                                        break;
                                                    case 2472:
                                                        if (str.equals("MU")) {
                                                            c = 146;
                                                            break;
                                                        }
                                                        break;
                                                    case 2473:
                                                        if (str.equals("MV")) {
                                                            c = 147;
                                                            break;
                                                        }
                                                        break;
                                                    case 2474:
                                                        if (str.equals("MW")) {
                                                            c = 148;
                                                            break;
                                                        }
                                                        break;
                                                    case 2475:
                                                        if (str.equals("MX")) {
                                                            c = 149;
                                                            break;
                                                        }
                                                        break;
                                                    case 2476:
                                                        if (str.equals("MY")) {
                                                            c = 150;
                                                            break;
                                                        }
                                                        break;
                                                    case 2477:
                                                        if (str.equals("MZ")) {
                                                            c = 151;
                                                            break;
                                                        }
                                                        break;
                                                    case 2483:
                                                        if (str.equals("NA")) {
                                                            c = 152;
                                                            break;
                                                        }
                                                        break;
                                                    case 2485:
                                                        if (str.equals("NC")) {
                                                            int i6 = ICustomTabsCallbackStub + 9;
                                                            onRelationshipValidationResult = i6 % 128;
                                                            int i7 = i6 % 2;
                                                            c = 153;
                                                            break;
                                                        }
                                                        break;
                                                    case 2487:
                                                        if (str.equals("NE")) {
                                                            c = 154;
                                                            break;
                                                        }
                                                        break;
                                                    case 2488:
                                                        if (str.equals("NF")) {
                                                            c = 155;
                                                            break;
                                                        }
                                                        break;
                                                    case 2489:
                                                        if (str.equals("NG")) {
                                                            c = 156;
                                                            break;
                                                        }
                                                        break;
                                                    case 2491:
                                                        if (str.equals("NI")) {
                                                            c = 157;
                                                            break;
                                                        }
                                                        break;
                                                    case 2494:
                                                        if (str.equals("NL")) {
                                                            c = 158;
                                                            break;
                                                        }
                                                        break;
                                                    case 2497:
                                                        if (str.equals("NO")) {
                                                            c = 159;
                                                            break;
                                                        }
                                                        break;
                                                    case 2498:
                                                        if (str.equals("NP")) {
                                                            c = 160;
                                                            break;
                                                        }
                                                        break;
                                                    case 2500:
                                                        if (str.equals("NR")) {
                                                            c = 161;
                                                            break;
                                                        }
                                                        break;
                                                    case 2503:
                                                        if (str.equals("NU")) {
                                                            c = 162;
                                                            break;
                                                        }
                                                        break;
                                                    case 2508:
                                                        if (str.equals("NZ")) {
                                                            c = 163;
                                                            break;
                                                        }
                                                        break;
                                                    case 2526:
                                                        if (str.equals("OM")) {
                                                            c = 164;
                                                            break;
                                                        }
                                                        break;
                                                    case 2545:
                                                        if (str.equals("PA")) {
                                                            c = 165;
                                                            break;
                                                        }
                                                        break;
                                                    case 2549:
                                                        if (str.equals("PE")) {
                                                            c = 166;
                                                            break;
                                                        }
                                                        break;
                                                    case 2550:
                                                        if (str.equals("PF")) {
                                                            c = 167;
                                                            break;
                                                        }
                                                        break;
                                                    case 2551:
                                                        if (str.equals("PG")) {
                                                            c = 168;
                                                            break;
                                                        }
                                                        break;
                                                    case 2552:
                                                        if (str.equals("PH")) {
                                                            c = 169;
                                                            break;
                                                        }
                                                        break;
                                                    case 2555:
                                                        if (str.equals("PK")) {
                                                            c = 170;
                                                            break;
                                                        }
                                                        break;
                                                    case 2556:
                                                        if (str.equals("PL")) {
                                                            c = 171;
                                                            break;
                                                        }
                                                        break;
                                                    case 2557:
                                                        if (str.equals("PM")) {
                                                            c = 172;
                                                            break;
                                                        }
                                                        break;
                                                    case 2562:
                                                        if (str.equals("PR")) {
                                                            c = 173;
                                                            break;
                                                        }
                                                        break;
                                                    case 2563:
                                                        if (str.equals("PS")) {
                                                            c = 174;
                                                            break;
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (str.equals("PT")) {
                                                            c = 175;
                                                            break;
                                                        }
                                                        break;
                                                    case 2567:
                                                        if (str.equals("PW")) {
                                                            c = 176;
                                                            break;
                                                        }
                                                        break;
                                                    case 2569:
                                                        if (str.equals("PY")) {
                                                            c = 177;
                                                            break;
                                                        }
                                                        break;
                                                    case 2576:
                                                        if (str.equals("QA")) {
                                                            c = 178;
                                                            break;
                                                        }
                                                        break;
                                                    case 2611:
                                                        if (str.equals("RE")) {
                                                            c = 179;
                                                            break;
                                                        }
                                                        break;
                                                    case 2621:
                                                        if (str.equals("RO")) {
                                                            c = 180;
                                                            break;
                                                        }
                                                        break;
                                                    case 2625:
                                                        if (str.equals("RS")) {
                                                            c = 181;
                                                            break;
                                                        }
                                                        break;
                                                    case 2627:
                                                        if (str.equals("RU")) {
                                                            c = 182;
                                                            break;
                                                        }
                                                        break;
                                                    case 2629:
                                                        if (str.equals("RW")) {
                                                            c = 183;
                                                            break;
                                                        }
                                                        break;
                                                    case 2638:
                                                        if (str.equals("SA")) {
                                                            c = 184;
                                                            break;
                                                        }
                                                        break;
                                                    case 2639:
                                                        if (str.equals("SB")) {
                                                            c = 185;
                                                            break;
                                                        }
                                                        break;
                                                    case 2640:
                                                        if (str.equals("SC")) {
                                                            c = 186;
                                                            break;
                                                        }
                                                        break;
                                                    case 2641:
                                                        if (str.equals("SD")) {
                                                            int i8 = onRelationshipValidationResult + 3;
                                                            ICustomTabsCallbackStub = i8 % 128;
                                                            int i9 = i8 % 2;
                                                            c = 187;
                                                            break;
                                                        }
                                                        break;
                                                    case 2642:
                                                        if (str.equals("SE")) {
                                                            c = 188;
                                                            break;
                                                        }
                                                        break;
                                                    case 2644:
                                                        if (str.equals("SG")) {
                                                            c = 189;
                                                            break;
                                                        }
                                                        break;
                                                    case 2645:
                                                        if (str.equals("SH")) {
                                                            c = 190;
                                                            break;
                                                        }
                                                        break;
                                                    case 2646:
                                                        if (str.equals("SI")) {
                                                            c = 191;
                                                            break;
                                                        }
                                                        break;
                                                    case 2647:
                                                        if (str.equals("SJ")) {
                                                            c = 192;
                                                            break;
                                                        }
                                                        break;
                                                    case 2648:
                                                        if (str.equals("SK")) {
                                                            c = 193;
                                                            break;
                                                        }
                                                        break;
                                                    case 2649:
                                                        if (str.equals("SL")) {
                                                            c = 194;
                                                            break;
                                                        }
                                                        break;
                                                    case 2650:
                                                        if (str.equals("SM")) {
                                                            c = 195;
                                                            break;
                                                        }
                                                        break;
                                                    case 2651:
                                                        if (str.equals("SN")) {
                                                            c = 196;
                                                            break;
                                                        }
                                                        break;
                                                    case 2652:
                                                        if (str.equals("SO")) {
                                                            c = 197;
                                                            break;
                                                        }
                                                        break;
                                                    case 2655:
                                                        if (str.equals("SR")) {
                                                            int i10 = onRelationshipValidationResult + 95;
                                                            ICustomTabsCallbackStub = i10 % 128;
                                                            int i11 = i10 % 2;
                                                            c = 198;
                                                            break;
                                                        }
                                                        break;
                                                    case 2656:
                                                        if (str.equals("SS")) {
                                                            c = 199;
                                                            break;
                                                        }
                                                        break;
                                                    case 2657:
                                                        if (str.equals("ST")) {
                                                            c = 200;
                                                            break;
                                                        }
                                                        break;
                                                    case 2659:
                                                        if (str.equals("SV")) {
                                                            c = 201;
                                                            break;
                                                        }
                                                        break;
                                                    case 2661:
                                                        if (str.equals("SX")) {
                                                            c = 202;
                                                            break;
                                                        }
                                                        break;
                                                    case 2662:
                                                        if (str.equals("SY")) {
                                                            c = 203;
                                                            break;
                                                        }
                                                        break;
                                                    case 2663:
                                                        if (str.equals("SZ")) {
                                                            c = 204;
                                                            break;
                                                        }
                                                        break;
                                                    case 2671:
                                                        if (str.equals("TC")) {
                                                            c = 205;
                                                            break;
                                                        }
                                                        break;
                                                    case 2672:
                                                        if (str.equals("TD")) {
                                                            c = 206;
                                                            break;
                                                        }
                                                        break;
                                                    case 2675:
                                                        if (str.equals("TG")) {
                                                            c = 207;
                                                            break;
                                                        }
                                                        break;
                                                    case 2676:
                                                        if (str.equals("TH")) {
                                                            c = 208;
                                                            break;
                                                        }
                                                        break;
                                                    case 2678:
                                                        if (str.equals("TJ")) {
                                                            c = 209;
                                                            break;
                                                        }
                                                        break;
                                                    case 2680:
                                                        if (str.equals("TL")) {
                                                            c = 210;
                                                            break;
                                                        }
                                                        break;
                                                    case 2681:
                                                        if (str.equals("TM")) {
                                                            c = 211;
                                                            break;
                                                        }
                                                        break;
                                                    case 2682:
                                                        if (str.equals("TN")) {
                                                            c = 212;
                                                            break;
                                                        }
                                                        break;
                                                    case 2683:
                                                        if (str.equals("TO")) {
                                                            c = 213;
                                                            break;
                                                        }
                                                        break;
                                                    case 2686:
                                                        if (str.equals("TR")) {
                                                            c = 214;
                                                            break;
                                                        }
                                                        break;
                                                    case 2688:
                                                        if (str.equals("TT")) {
                                                            c = 215;
                                                            break;
                                                        }
                                                        break;
                                                    case 2690:
                                                        if (str.equals("TV")) {
                                                            c = 216;
                                                            break;
                                                        }
                                                        break;
                                                    case 2691:
                                                        if (str.equals("TW")) {
                                                            c = 217;
                                                            break;
                                                        }
                                                        break;
                                                    case 2694:
                                                        if (str.equals("TZ")) {
                                                            c = 218;
                                                            break;
                                                        }
                                                        break;
                                                    case 2700:
                                                        if (str.equals("UA")) {
                                                            c = 219;
                                                            break;
                                                        }
                                                        break;
                                                    case 2706:
                                                        if (str.equals("UG")) {
                                                            c = 220;
                                                            break;
                                                        }
                                                        break;
                                                    case 2718:
                                                        if (str.equals("US")) {
                                                            c = 221;
                                                            break;
                                                        }
                                                        break;
                                                    case 2724:
                                                        if (str.equals("UY")) {
                                                            c = 222;
                                                            break;
                                                        }
                                                        break;
                                                    case 2725:
                                                        if (str.equals("UZ")) {
                                                            c = 223;
                                                            break;
                                                        }
                                                        break;
                                                    case 2731:
                                                        if (str.equals("VA")) {
                                                            c = 224;
                                                            break;
                                                        }
                                                        break;
                                                    case 2733:
                                                        if (str.equals("VC")) {
                                                            c = 225;
                                                            break;
                                                        }
                                                        break;
                                                    case 2735:
                                                        if (str.equals("VE")) {
                                                            c = 226;
                                                            break;
                                                        }
                                                        break;
                                                    case 2737:
                                                        if (str.equals("VG")) {
                                                            c = 227;
                                                            break;
                                                        }
                                                        break;
                                                    case 2739:
                                                        if (str.equals("VI")) {
                                                            c = 228;
                                                            break;
                                                        }
                                                        break;
                                                    case 2744:
                                                        if (str.equals("VN")) {
                                                            c = 229;
                                                            break;
                                                        }
                                                        break;
                                                    case 2751:
                                                        if (str.equals("VU")) {
                                                            c = 230;
                                                            break;
                                                        }
                                                        break;
                                                    case 2767:
                                                        if (str.equals("WF")) {
                                                            c = 231;
                                                            break;
                                                        }
                                                        break;
                                                    case 2780:
                                                        if (str.equals("WS")) {
                                                            c = 232;
                                                            break;
                                                        }
                                                        break;
                                                    case 2803:
                                                        if (str.equals("XK")) {
                                                            c = 233;
                                                            break;
                                                        }
                                                        break;
                                                    case 2828:
                                                        if (str.equals("YE")) {
                                                            c = 234;
                                                            break;
                                                        }
                                                        break;
                                                    case 2843:
                                                        if (str.equals("YT")) {
                                                            c = 235;
                                                            break;
                                                        }
                                                        break;
                                                    case 2855:
                                                        if (str.equals("ZA")) {
                                                            c = 236;
                                                            break;
                                                        }
                                                        break;
                                                    case 2867:
                                                        if (str.equals("ZM")) {
                                                            c = 237;
                                                            break;
                                                        }
                                                        break;
                                                    case 2877:
                                                        if (str.equals("ZW")) {
                                                            c = 238;
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        switch (iHashCode) {
                                                            case 2096:
                                                                if (str.equals("AQ")) {
                                                                    c = '\b';
                                                                    break;
                                                                }
                                                                break;
                                                            case 2097:
                                                                if (str.equals("AR")) {
                                                                    int i12 = ICustomTabsCallbackStub + 75;
                                                                    onRelationshipValidationResult = i12 % 128;
                                                                    if (i12 % 2 == 0) {
                                                                        c = '\t';
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                            case 2098:
                                                                if (str.equals("AS")) {
                                                                    c = '\n';
                                                                    break;
                                                                }
                                                                break;
                                                            case 2099:
                                                                if (str.equals("AT")) {
                                                                    c = 11;
                                                                    break;
                                                                }
                                                                break;
                                                            case 2100:
                                                                if (str.equals("AU")) {
                                                                    c = '\f';
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                switch (iHashCode) {
                                                                    case 2122:
                                                                        if (str.equals("BL")) {
                                                                            c = 25;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    case 2123:
                                                                        if (str.equals("BM")) {
                                                                            c = 26;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    case 2124:
                                                                        if (str.equals("BN")) {
                                                                            c = 27;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    case 2125:
                                                                        if (str.equals("BO")) {
                                                                        }
                                                                        break;
                                                                    default:
                                                                        switch (iHashCode) {
                                                                            case 2127:
                                                                                if (str.equals("BQ")) {
                                                                                    c = 29;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 2128:
                                                                                if (str.equals("BR")) {
                                                                                    int i13 = ICustomTabsCallbackStub + 119;
                                                                                    onRelationshipValidationResult = i13 % 128;
                                                                                    int i14 = i13 % 2;
                                                                                    c = 30;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 2129:
                                                                                if (str.equals("BS")) {
                                                                                    c = 31;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 2130:
                                                                                if (str.equals("BT")) {
                                                                                    c = ' ';
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                switch (iHashCode) {
                                                                                    case 2147:
                                                                                        if (str.equals("CF")) {
                                                                                            c = '&';
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    case 2148:
                                                                                        if (str.equals("CG")) {
                                                                                            c = '\'';
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    case 2149:
                                                                                        if (str.equals("CH")) {
                                                                                            c = '(';
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    case 2150:
                                                                                        if (str.equals("CI")) {
                                                                                            c = ')';
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                    } else if (str.equals("BZ")) {
                                        c = '#';
                                    }
                                } else if (str.equals("BY")) {
                                    c = '\"';
                                }
                            } else if (str.equals("BB")) {
                                int i15 = ICustomTabsCallbackStub + 119;
                                onRelationshipValidationResult = i15 % 128;
                                int i16 = i15 % 2;
                                c = 17;
                            }
                        } else if (str.equals("BA")) {
                        }
                    } else if (str.equals("AX")) {
                        c = 14;
                    }
                } else if (str.equals("AW")) {
                    int i17 = ICustomTabsCallbackStub + 33;
                    onRelationshipValidationResult = i17 % 128;
                    if (i17 % 2 == 0) {
                        c = '\r';
                    }
                }
            } else if (str.equals("AM")) {
                c = 6;
            }
        } else if (str.equals("AL")) {
            c = 5;
        }
        switch (c) {
            case 0:
            case 4:
            case 17:
            case 29:
            case '2':
            case '9':
            case 'q':
            case 't':
            case 202:
            case 225:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 2, 3, 4, 1};
            case 2:
            case 204:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 3:
            case ')':
                return new int[]{2, 4, 3, 4, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 6:
            case 165:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{3, 4, 4, 3, 2, 2};
            case '\b':
            case '?':
            case 162:
            case 186:
            case 190:
                return new int[]{4, 2, 2, 2, 2, 2};
            case '\t':
                return new int[]{2, 2, 2, 2, 1, 2};
            case '\n':
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
            case '=':
            case ']':
            case 'f':
            case 127:
            case 145:
            case 188:
                return new int[]{0, 0, 0, 0, 0, 2};
            case '\f':
                return new int[]{0, 3, 1, 1, 3, 0};
            case '\r':
                return new int[]{2, 2, 3, 4, 2, 2};
            case 14:
            case '3':
            case 'y':
            case 144:
            case 172:
            case 195:
            case 224:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case '7':
            case 128:
            case 194:
                return new int[]{4, 2, 3, 3, 2, 2};
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
            case 'j':
            case 214:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 2, 4, 2};
            case 19:
                return new int[]{0, 0, 1, 0, 1, 2};
            case 20:
            case 187:
            case 203:
            case 206:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 21:
            case 175:
            case 191:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 3, 1, 3, 4, 2};
            case 23:
            case 'T':
            case '\\':
            case 154:
            case 226:
            case 234:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 25:
            case 141:
            case 177:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{0, 2, 0, 0, 2, 2};
            case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                return new int[]{3, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 30:
                return new int[]{1, 1, 1, 1, 2, 4};
            case 31:
                return new int[]{3, 2, 1, 1, 2, 2};
            case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                return new int[]{3, 1, 2, 2, 3, 2};
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                return new int[]{3, 2, 1, 0, 2, 2};
            case '\"':
                return new int[]{1, 2, 3, 3, 2, 2};
            case '#':
            case '*':
                return new int[]{2, 2, 2, 1, 2, 2};
            case '$':
            case 219:
                return new int[]{0, 2, 1, 2, 3, 3};
            case '%':
            case 137:
                return new int[]{3, 3, 2, 2, 2, 2};
            case '&':
                return new int[]{4, 2, 4, 2, 2, 2};
            case '\'':
            case '>':
            case 134:
                return new int[]{3, 4, 3, 3, 2, 2};
            case '(':
                return new int[]{0, 1, 0, 0, 0, 2};
            case '+':
            case 208:
                return new int[]{0, 1, 2, 2, 2, 2};
            case ',':
            case 143:
                return new int[]{4, 3, 3, 4, 2, 2};
            case '-':
                return new int[]{2, 0, 1, 1, 3, 1};
            case '.':
                return new int[]{2, 3, 3, 2, 2, 2};
            case '/':
            case 157:
                return new int[]{2, 4, 4, 4, 2, 2};
            case '0':
            case 'o':
            case 161:
            case 210:
                return new int[]{4, 2, 4, 4, 2, 2};
            case '1':
                return new int[]{2, 3, 0, 1, 2, 2};
            case '4':
                return new int[]{1, 0, 1, 0, 0, 2};
            case '5':
                return new int[]{0, 0, 2, 0, 1, 2};
            case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                return new int[]{0, 1, 4, 2, 2, 1};
            case '8':
                return new int[]{0, 0, 2, 0, 0, 2};
            case ':':
            case '{':
                return new int[]{3, 4, 4, 4, 2, 2};
            case ';':
            case 209:
                return new int[]{3, 3, 4, 4, 2, 2};
            case '<':
                return new int[]{1, 3, 2, 1, 2, 2};
            case '@':
                return new int[]{0, 0, 0, 0, 1, 0};
            case 'A':
                return new int[]{4, 3, 4, 4, 4, 2};
            case 'B':
                return new int[]{0, 0, 0, 1, 0, 2};
            case 'C':
                return new int[]{3, 2, 2, 3, 2, 2};
            case 'D':
            case 155:
            case 192:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 'E':
                return new int[]{4, 2, 4, 0, 2, 2};
            case 'F':
                return new int[]{0, 2, 2, 0, 2, 2};
            case 'G':
                return new int[]{1, 1, 1, 1, 0, 2};
            case 'H':
                return new int[]{3, 4, 0, 0, 2, 2};
            case 'I':
                return new int[]{1, 1, 3, 2, 2, 2};
            case 'J':
                return new int[]{2, 2, 0, 0, 2, 2};
            case RVParams.WEBVIEW_FONT_SIZE_SMALLER /* 75 */:
                return new int[]{1, 1, 0, 2, 2, 2};
            case 'L':
                return new int[]{3, 2, 3, 3, 2, 2};
            case 'M':
                return new int[]{0, 2, 1, 1, 2, 2};
            case 'N':
                return new int[]{3, 3, 3, 2, 2, 2};
            case 'O':
            case 'a':
            case 'h':
                return new int[]{0, 2, 0, 1, 2, 2};
            case 'P':
            case 130:
                return new int[]{1, 2, 2, 0, 2, 2};
            case 'Q':
            case 199:
                return new int[]{4, 3, 2, 4, 2, 2};
            case 'R':
                return new int[]{3, 4, 4, 2, 2, 2};
            case 'S':
                return new int[]{2, 1, 1, 3, 2, 2};
            case 'U':
                return new int[]{1, 0, 0, 0, 1, 2};
            case 'V':
                return new int[]{2, 1, 2, 1, 2, 2};
            case 'W':
                return new int[]{2, 2, 4, 3, 3, 2};
            case 'X':
                return new int[]{4, 4, 1, 2, 2, 2};
            case 'Y':
                return new int[]{3, 1, 1, 3, 2, 2};
            case 'Z':
                return new int[]{0, 1, 0, 1, 1, 0};
            case '[':
            case 's':
                return new int[]{1, 0, 0, 0, 0, 2};
            case '^':
                return new int[]{3, 1, 3, 3, 2, 4};
            case '_':
                return new int[]{1, 1, 1, 1, 1, 2};
            case '`':
                return new int[]{1, 2, 2, 3, 4, 2};
            case 'b':
                return new int[]{1, 1, 3, 2, 2, 3};
            case 'c':
                return new int[]{3, 2, 2, 0, 2, 2};
            case 'd':
                return new int[]{3, 2, 3, 2, 2, 2};
            case 'e':
                return new int[]{4, 2, 3, 3, 4, 3};
            case 'g':
                return new int[]{0, 1, 1, 2, 1, 2};
            case 'i':
                return new int[]{2, 4, 3, 1, 2, 2};
            case 'k':
                return new int[]{0, 3, 2, 3, 4, 2};
            case 'l':
                return new int[]{3, 2, 1, 1, 1, 2};
            case 'm':
                return new int[]{2, 1, 1, 2, 2, 2};
            case 'n':
                return new int[]{1, 0, 4, 2, 2, 2};
            case 'p':
            case 230:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 'r':
                return new int[]{0, 2, 2, 4, 4, 4};
            case 'u':
                return new int[]{2, 1, 2, 2, 3, 2};
            case 'v':
                return new int[]{1, 2, 1, 3, 2, 2};
            case 'w':
                return new int[]{3, 1, 1, 2, 2, 2};
            case 'x':
                return new int[]{2, 2, 1, 1, 2, 2};
            case 'z':
            case 138:
                return new int[]{3, 2, 3, 3, 4, 2};
            case '|':
            case 168:
                return new int[]{4, 3, 3, 3, 2, 2};
            case '}':
                return new int[]{0, 1, 0, 1, 0, 2};
            case '~':
                return new int[]{4, 0, 3, 2, 1, 3};
            case 129:
                return new int[]{3, 3, 1, 1, 2, 2};
            case 131:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 132:
                return new int[]{2, 0, 0, 1, 3, 2};
            case 133:
                return new int[]{1, 2, 2, 3, 2, 2};
            case 135:
            case 211:
            case 216:
            case 231:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 136:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 139:
                return new int[]{2, 0, 2, 2, 2, 2};
            case 140:
                return new int[]{0, 2, 4, 4, 3, 1};
            case 142:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 146:
                return new int[]{3, 1, 0, 2, 2, 2};
            case 147:
                return new int[]{3, 2, 1, 3, 4, 2};
            case 148:
                return new int[]{3, 2, 2, 1, 2, 2};
            case 149:
                return new int[]{2, 4, 4, 4, 3, 2};
            case RVParams.WEBVIEW_FONT_SIZE_LARGER /* 150 */:
                return new int[]{1, 0, 4, 1, 1, 0};
            case 151:
            case 232:
                return new int[]{3, 1, 2, 2, 2, 2};
            case 152:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 153:
            case 235:
                return new int[]{2, 3, 3, 4, 2, 2};
            case 156:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 158:
                return new int[]{2, 1, 4, 3, 0, 4};
            case 159:
                return new int[]{0, 0, 3, 0, 0, 2};
            case 160:
                return new int[]{2, 2, 4, 3, 2, 2};
            case 163:
                return new int[]{0, 0, 1, 2, 4, 2};
            case 164:
                return new int[]{2, 3, 1, 2, 4, 2};
            case 166:
                return new int[]{1, 2, 4, 4, 3, 2};
            case 167:
                return new int[]{2, 2, 3, 1, 2, 2};
            case 169:
                return new int[]{2, 1, 2, 3, 2, 1};
            case 170:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 171:
                return new int[]{1, 0, 2, 2, 4, 4};
            case 173:
                return new int[]{2, 0, 2, 1, 2, 0};
            case 174:
                return new int[]{3, 4, 1, 3, 2, 2};
            case 176:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 178:
                return new int[]{1, 4, 4, 4, 4, 2};
            case 179:
                return new int[]{0, 3, 2, 3, 1, 2};
            case 180:
                return new int[]{0, 0, 1, 1, 3, 2};
            case 181:
                return new int[]{1, 0, 0, 1, 2, 2};
            case 182:
                return new int[]{1, 0, 0, 1, 3, 3};
            case 183:
                return new int[]{3, 3, 2, 0, 2, 2};
            case 184:
                return new int[]{3, 1, 1, 2, 2, 0};
            case 185:
            case 238:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 189:
                return new int[]{2, 3, 3, 3, 1, 1};
            case 193:
                return new int[]{0, 1, 1, 1, 2, 2};
            case 196:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 197:
                return new int[]{2, 2, 3, 4, 4, 2};
            case 198:
                return new int[]{2, 4, 4, 1, 2, 2};
            case RVParams.WEBVIEW_FONT_SIZE_LARGEST /* 200 */:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 201:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 205:
                return new int[]{3, 2, 1, 2, 2, 2};
            case 207:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 212:
                return new int[]{3, 1, 1, 1, 2, 2};
            case 213:
                return new int[]{3, 2, 4, 3, 2, 2};
            case 215:
                return new int[]{2, 4, 1, 0, 2, 2};
            case 217:
                return new int[]{0, 0, 0, 0, 0, 0};
            case 218:
                return new int[]{3, 4, 2, 1, 3, 2};
            case 220:
                return new int[]{3, 3, 2, 3, 4, 2};
            case 221:
                return new int[]{2, 2, 4, 1, 3, 1};
            case 222:
                return new int[]{2, 1, 1, 2, 1, 2};
            case 223:
                return new int[]{1, 2, 3, 4, 3, 2};
            case 227:
                return new int[]{2, 2, 1, 1, 2, 4};
            case 228:
                return new int[]{0, 2, 1, 2, 2, 2};
            case 229:
                return new int[]{0, 0, 1, 2, 2, 2};
            case 233:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 236:
                return new int[]{2, 4, 2, 1, 1, 2};
            case 237:
                return new int[]{4, 4, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    static void onWarmupCompleted() {
        onMinimized = 478308882;
    }
}
