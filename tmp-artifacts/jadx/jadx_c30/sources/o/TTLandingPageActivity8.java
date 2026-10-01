package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import o.TTLandingPageActivity5;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTLandingPageActivity8 implements TTLandingPageActivity14 {
    private String IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private String IAuthTabCallbackStubProxy;
    private long IAuthTabCallback_Parcel;
    private long access000;
    private int asBinder;
    private int asInterface;
    private int extraCallbackWithResult;
    private String getInterfaceDescriptor;
    private int onExtraCallback;
    private long onExtraCallbackWithResult;
    private long onNavigationEvent;
    private long onTransact;
    private int onWarmupCompleted;
    private int readTypedObject;
    private onExtraCallbackWithResult ICustomTabsCallback = onExtraCallbackWithResult.UNKNOWN;
    private Set<onWarmupCompleted> access100 = Collections.EMPTY_SET;
    private final TTLandingPageActivity7 extraCallback = null;
    private final onNavigationEvent IAuthTabCallback = new onNavigationEvent();

    public enum onWarmupCompleted {
        SETUID(2048),
        SETGUI(1024),
        STICKY(512),
        USER_READ(256),
        USER_WRITE(128),
        USER_EXEC(64),
        GROUP_READ(32),
        GROUP_WRITE(16),
        GROUP_EXEC(8),
        WORLD_READ(4),
        WORLD_WRITE(2),
        WORLD_EXEC(1);

        private final int code;

        public static Set<onWarmupCompleted> find(int i) {
            HashSet hashSet = new HashSet();
            for (onWarmupCompleted onwarmupcompleted : values()) {
                int i2 = onwarmupcompleted.code;
                if ((i & i2) == i2) {
                    hashSet.add(onwarmupcompleted);
                }
            }
            if (hashSet.isEmpty()) {
                return Collections.EMPTY_SET;
            }
            return EnumSet.copyOf((Collection) hashSet);
        }

        onWarmupCompleted(int i) {
            this.code = i;
        }
    }

    static class onNavigationEvent {
        private int IAuthTabCallback;
        private int IAuthTabCallbackStub;
        private int onExtraCallback;
        private final byte[] onExtraCallbackWithResult = new byte[512];
        private TTLandingPageActivity5.onNavigationEvent onNavigationEvent;
        private int onWarmupCompleted;

        onNavigationEvent() {
        }

        static /* synthetic */ int onExtraCallback(onNavigationEvent onnavigationevent) {
            int i = onnavigationevent.IAuthTabCallback;
            onnavigationevent.IAuthTabCallback = i + 1;
            return i;
        }

        public int onExtraCallback(int i) {
            return this.onExtraCallbackWithResult[i];
        }

        public int onWarmupCompleted() {
            return this.onExtraCallback;
        }

        public int IAuthTabCallback() {
            return this.IAuthTabCallback;
        }

        public int onExtraCallbackWithResult() {
            return this.onWarmupCompleted;
        }

        public TTLandingPageActivity5.onNavigationEvent onExtraCallback() {
            return this.onNavigationEvent;
        }

        public int onNavigationEvent() {
            return this.IAuthTabCallbackStub;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UNKNOWN' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        public static final onExtraCallbackWithResult BLKDEV;
        public static final onExtraCallbackWithResult CHRDEV;
        public static final onExtraCallbackWithResult DIRECTORY;
        public static final onExtraCallbackWithResult FIFO;
        public static final onExtraCallbackWithResult FILE;
        private static short[] IAuthTabCallback;
        private static int IAuthTabCallbackStub;
        public static final onExtraCallbackWithResult LINK;
        public static final onExtraCallbackWithResult SOCKET;
        public static final onExtraCallbackWithResult UNKNOWN;
        public static final onExtraCallbackWithResult WHITEOUT;
        private static int onExtraCallback;
        private static byte[] onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final int code;
        private static final byte[] $$a = {ISO7816.INS_MSE, -66, 77, 18};
        private static final int $$b = 165;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asInterface = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int asBinder = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, int i, byte b2) {
            int i2;
            int i3 = 115 - (b2 * 2);
            byte[] bArr = $$a;
            int i4 = 1 - (i * 3);
            int i5 = b + 4;
            byte[] bArr2 = new byte[i4];
            if (bArr == null) {
                int i6 = i3;
                i2 = 0;
                i3 = i4;
                i3 += i6;
                i5++;
                bArr2[i2] = (byte) i3;
                i2++;
                if (i2 == i4) {
                    return new String(bArr2, 0);
                }
                i6 = bArr[i5];
                i3 += i6;
                i5++;
                bArr2[i2] = (byte) i3;
                i2++;
                if (i2 == i4) {
                }
            } else {
                i2 = 0;
                i5++;
                bArr2[i2] = (byte) i3;
                i2++;
                if (i2 == i4) {
                }
            }
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4;
            long j;
            int i5 = 2;
            int i6 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 43424), 42 - (KeyEvent.getMaxKeyCode() >> 16), 22439 - (ViewConfiguration.getPressedStateDuration() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                int i7 = -1;
                if (iIntValue == -1) {
                    int i8 = $10 + 103;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i4 == 0) {
                    j = -4629411779493505016L;
                } else {
                    byte[] bArr = onExtraCallbackWithResult;
                    if (bArr != null) {
                        int i10 = $11;
                        int i11 = i10 + 5;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i13 = i10 + 125;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        int i15 = 0;
                        while (i15 < length) {
                            int i16 = $11 + 95;
                            $10 = i16 % 128;
                            if (i16 % i5 != 0) {
                                Object[] objArr3 = {Integer.valueOf(bArr[i15])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b2 = (byte) i7;
                                    byte b3 = (byte) (b2 + 1);
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), View.MeasureSpec.getSize(0) + 55, (ViewConfiguration.getFadingEdgeLength() >> 16) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr2[i15] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            } else {
                                Object[] objArr4 = {Integer.valueOf(bArr[i15])};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback3 == null) {
                                    byte b4 = (byte) (-1);
                                    byte b5 = (byte) (b4 + 1);
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - ((byte) KeyEvent.getModifierMetaStateMask())), 55 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2167 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                                }
                                bArr2[i15] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                                i15++;
                            }
                            i5 = 2;
                            i7 = -1;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = onExtraCallbackWithResult;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getTapTimeout() >> 16) + 42, (KeyEvent.getMaxKeyCode() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ j)) + i4;
                    Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), 86 - ((Process.getThreadPriority(0) + 20) >> 6), Color.argb(0, 0, 0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onExtraCallbackWithResult;
                    if (bArr4 != null) {
                        int i17 = $10 + 77;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i19 = 0;
                        while (i19 < length2) {
                            int i20 = $10 + 119;
                            $11 = i20 % 128;
                            if (i20 % 2 == 0) {
                                bArr5[i19] = (byte) (bArr4[i19] - (-4629411779493505016L));
                                i19--;
                            } else {
                                bArr5[i19] = (byte) (bArr4[i19] ^ (-4629411779493505016L));
                                i19++;
                            }
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i21 = $11 + 49;
                        $10 = i21 % 128;
                        if (i21 % 2 != 0) {
                            throw null;
                        }
                        if (z) {
                            byte[] bArr6 = onExtraCallbackWithResult;
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

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 89;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 == 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = asInterface + 77;
            IAuthTabCallbackDefault = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i3 = asInterface + 99;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                return onextracallbackwithresultArr;
            }
            obj.hashCode();
            throw null;
        }

        static {
            IAuthTabCallbackStub = 1;
            onWarmupCompleted();
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult("WHITEOUT", 0, 14);
            WHITEOUT = onextracallbackwithresult;
            onExtraCallbackWithResult onextracallbackwithresult2 = new onExtraCallbackWithResult("SOCKET", 1, 12);
            SOCKET = onextracallbackwithresult2;
            onExtraCallbackWithResult onextracallbackwithresult3 = new onExtraCallbackWithResult("LINK", 2, 10);
            LINK = onextracallbackwithresult3;
            onExtraCallbackWithResult onextracallbackwithresult4 = new onExtraCallbackWithResult("FILE", 3, 8);
            FILE = onextracallbackwithresult4;
            onExtraCallbackWithResult onextracallbackwithresult5 = new onExtraCallbackWithResult("BLKDEV", 4, 6);
            BLKDEV = onextracallbackwithresult5;
            onExtraCallbackWithResult onextracallbackwithresult6 = new onExtraCallbackWithResult("DIRECTORY", 5, 4);
            DIRECTORY = onextracallbackwithresult6;
            onExtraCallbackWithResult onextracallbackwithresult7 = new onExtraCallbackWithResult("CHRDEV", 6, 2);
            CHRDEV = onextracallbackwithresult7;
            onExtraCallbackWithResult onextracallbackwithresult8 = new onExtraCallbackWithResult("FIFO", 7, 1);
            FIFO = onextracallbackwithresult8;
            Object[] objArr = new Object[1];
            a((short) (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 1328979501, (-234738481) - Drawable.resolveOpacity(0, 0), (-9) - Color.green(0), objArr);
            onExtraCallbackWithResult onextracallbackwithresult9 = new onExtraCallbackWithResult(((String) objArr[0]).intern(), 8, 15);
            UNKNOWN = onextracallbackwithresult9;
            $VALUES = new onExtraCallbackWithResult[]{onextracallbackwithresult, onextracallbackwithresult2, onextracallbackwithresult3, onextracallbackwithresult4, onextracallbackwithresult5, onextracallbackwithresult6, onextracallbackwithresult7, onextracallbackwithresult8, onextracallbackwithresult9};
            int i = asBinder + 35;
            IAuthTabCallbackStub = i % 128;
            int i2 = i % 2;
        }

        public static onExtraCallbackWithResult find(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackDefault + 71;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = UNKNOWN;
            for (onExtraCallbackWithResult onextracallbackwithresult2 : values()) {
                if (i == onextracallbackwithresult2.code) {
                    int i5 = asInterface + 107;
                    IAuthTabCallbackDefault = i5 % 128;
                    int i6 = i5 % 2;
                    onextracallbackwithresult = onextracallbackwithresult2;
                }
            }
            return onextracallbackwithresult;
        }

        private onExtraCallbackWithResult(String str, int i, int i2) {
            this.code = i2;
        }

        static void onWarmupCompleted() {
            onExtraCallback = 344898011;
            onWarmupCompleted = -1538795520;
            onNavigationEvent = -1447425138;
            onExtraCallbackWithResult = new byte[]{-9, -1, 0, 9, 11, -11, -15};
        }
    }

    static TTLandingPageActivity8 onWarmupCompleted(byte[] bArr) {
        TTLandingPageActivity8 tTLandingPageActivity8 = new TTLandingPageActivity8();
        onNavigationEvent onnavigationevent = tTLandingPageActivity8.IAuthTabCallback;
        onnavigationevent.onNavigationEvent = TTLandingPageActivity5.onNavigationEvent.find(TTLandingPageActivity61.onNavigationEvent(bArr, 0));
        onnavigationevent.IAuthTabCallbackStub = TTLandingPageActivity61.onNavigationEvent(bArr, 12);
        tTLandingPageActivity8.IAuthTabCallbackStub = onnavigationevent.onWarmupCompleted = TTLandingPageActivity61.onNavigationEvent(bArr, 20);
        int iOnExtraCallback = TTLandingPageActivity61.onExtraCallback(bArr, 32);
        tTLandingPageActivity8.IAuthTabCallback(onExtraCallbackWithResult.find((iOnExtraCallback >> 12) & 15));
        tTLandingPageActivity8.onNavigationEvent(iOnExtraCallback);
        tTLandingPageActivity8.asBinder = TTLandingPageActivity61.onExtraCallback(bArr, 34);
        tTLandingPageActivity8.IAuthTabCallback(TTLandingPageActivity61.onExtraCallbackWithResult(bArr, 40));
        tTLandingPageActivity8.onWarmupCompleted(new Date((TTLandingPageActivity61.onNavigationEvent(bArr, 48) * 1000) + (TTLandingPageActivity61.onNavigationEvent(bArr, 52) / 1000)));
        tTLandingPageActivity8.onExtraCallback(new Date((TTLandingPageActivity61.onNavigationEvent(bArr, 56) * 1000) + (TTLandingPageActivity61.onNavigationEvent(bArr, 60) / 1000)));
        tTLandingPageActivity8.onNavigationEvent = (TTLandingPageActivity61.onNavigationEvent(bArr, 64) * 1000) + (TTLandingPageActivity61.onNavigationEvent(bArr, 68) / 1000);
        tTLandingPageActivity8.onWarmupCompleted = TTLandingPageActivity61.onNavigationEvent(bArr, 140);
        tTLandingPageActivity8.IAuthTabCallback(TTLandingPageActivity61.onNavigationEvent(bArr, 144));
        tTLandingPageActivity8.onExtraCallback(TTLandingPageActivity61.onNavigationEvent(bArr, 148));
        onnavigationevent.onExtraCallback = TTLandingPageActivity61.onNavigationEvent(bArr, 160);
        onnavigationevent.IAuthTabCallback = 0;
        for (int i = 0; i < 512 && i < onnavigationevent.onExtraCallback; i++) {
            if (bArr[i + 164] == 0) {
                onNavigationEvent.onExtraCallback(onnavigationevent);
            }
        }
        System.arraycopy(bArr, 164, onnavigationevent.onExtraCallbackWithResult, 0, 512);
        tTLandingPageActivity8.readTypedObject = onnavigationevent.onNavigationEvent();
        return tTLandingPageActivity8;
    }

    public TTLandingPageActivity8() {
    }

    public TTLandingPageActivity8(String str, String str2) {
        onNavigationEvent(str);
        this.getInterfaceDescriptor = str2;
    }

    protected TTLandingPageActivity8(String str, String str2, int i, onExtraCallbackWithResult onextracallbackwithresult) {
        IAuthTabCallback(onextracallbackwithresult);
        onNavigationEvent(str);
        this.getInterfaceDescriptor = str2;
        this.IAuthTabCallbackStub = i;
        this.access000 = 0L;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        TTLandingPageActivity8 tTLandingPageActivity8 = (TTLandingPageActivity8) obj;
        if (this.IAuthTabCallbackStub != tTLandingPageActivity8.IAuthTabCallbackStub) {
            return false;
        }
        TTLandingPageActivity7 tTLandingPageActivity7 = this.extraCallback;
        return (tTLandingPageActivity7 != null || tTLandingPageActivity8.extraCallback == null) && (tTLandingPageActivity7 == null || tTLandingPageActivity7.equals(tTLandingPageActivity8.extraCallback));
    }

    long onExtraCallback() {
        return this.IAuthTabCallback_Parcel;
    }

    public int IAuthTabCallback() {
        return this.IAuthTabCallback.onWarmupCompleted();
    }

    public int onWarmupCompleted() {
        return this.IAuthTabCallback.IAuthTabCallback();
    }

    public TTLandingPageActivity5.onNavigationEvent onExtraCallbackWithResult() {
        return this.IAuthTabCallback.onExtraCallback();
    }

    public int onNavigationEvent() {
        return this.IAuthTabCallback.onExtraCallbackWithResult();
    }

    public String IAuthTabCallbackStub() {
        return this.IAuthTabCallbackDefault;
    }

    String asBinder() {
        return this.IAuthTabCallbackStubProxy;
    }

    public int hashCode() {
        return this.IAuthTabCallbackStub;
    }

    public boolean asInterface() {
        return this.ICustomTabsCallback == onExtraCallbackWithResult.DIRECTORY;
    }

    public boolean onExtraCallbackWithResult(int i) {
        return (this.IAuthTabCallback.onExtraCallback(i) & 1) == 0;
    }

    public void onWarmupCompleted(Date date) {
        this.onExtraCallbackWithResult = date.getTime();
    }

    public void onExtraCallback(int i) {
        this.onExtraCallback = i;
    }

    public void onExtraCallback(Date date) {
        this.onTransact = date.getTime();
    }

    public void onNavigationEvent(int i) {
        this.asInterface = i & 4095;
        this.access100 = onWarmupCompleted.find(i);
    }

    public final void onNavigationEvent(String str) {
        this.IAuthTabCallbackStubProxy = str;
        if (str != null) {
            if (asInterface() && !str.endsWith("/")) {
                str = str + "/";
            }
            if (str.startsWith("./")) {
                str = str.substring(2);
            }
        }
        this.IAuthTabCallbackDefault = str;
    }

    public void onNavigationEvent(long j) {
        this.access000 = j;
    }

    protected void onExtraCallback(String str) {
        this.getInterfaceDescriptor = str;
    }

    public void IAuthTabCallback(long j) {
        this.IAuthTabCallback_Parcel = j;
    }

    public void IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult) {
        this.ICustomTabsCallback = onextracallbackwithresult;
    }

    public void IAuthTabCallback(int i) {
        this.extraCallbackWithResult = i;
    }

    public String toString() {
        return IAuthTabCallbackStub();
    }
}
