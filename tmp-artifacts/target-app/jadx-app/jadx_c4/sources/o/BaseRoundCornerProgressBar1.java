package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.security.Key;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.setProgressColor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BaseRoundCornerProgressBar1 extends setMax implements Parcelable {
    public static final onWarmupCompleted CREATOR = new onWarmupCompleted(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    static {
        int i = onExtraCallbackWithResult + 75;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 87 / 0;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 115;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 55;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public BaseRoundCornerProgressBar1() {
    }

    static final class onNavigationEvent {
        private static long IAuthTabCallback;
        private static int IAuthTabCallbackDefault;
        private static int IAuthTabCallbackStub;
        private static char asInterface;
        private static final BaseRoundCornerProgressBarOnProgressChangedListener onExtraCallback;
        public static final onNavigationEvent onExtraCallbackWithResult;
        private static final setupStyleable onNavigationEvent;
        private static Key onWarmupCompleted;
        private static final byte[] $$a = {68, 4, -12, -68};
        private static final int $$b = 114;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onTransact = 0;
        private static int getInterfaceDescriptor = 1;
        private static int asBinder = 0;

        private static String $$c(int i, short s, byte b) {
            int i2 = 4 - (s * 2);
            int i3 = b * 2;
            byte[] bArr = $$a;
            int i4 = i + 109;
            byte[] bArr2 = new byte[1 - i3];
            int i5 = 0 - i3;
            int i6 = -1;
            if (bArr == null) {
                i4 = i5 + (-i2);
                i2++;
                i6 = -1;
            }
            while (true) {
                int i7 = i6 + 1;
                bArr2[i7] = (byte) i4;
                if (i7 == i5) {
                    return new String(bArr2, 0);
                }
                int i8 = i2;
                i4 += -bArr[i2];
                i2 = i8 + 1;
                i6 = i7;
            }
        }

        private onNavigationEvent() {
        }

        public final void onExtraCallback(@NotNull Key key) {
            int i = 2 % 2;
            int i2 = onTransact + 107;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(key, "");
                onWarmupCompleted = key;
            } else {
                Intrinsics.checkNotNullParameter(key, "");
                onWarmupCompleted = key;
                int i3 = 28 / 0;
            }
        }

        public final Key onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onTransact + 85;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted;
            }
            throw null;
        }

        static {
            IAuthTabCallbackDefault = 1;
            IAuthTabCallback();
            onExtraCallbackWithResult = new onNavigationEvent();
            Object[] objArr = new Object[1];
            a((char) (3206 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 1831562622 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{41736, 7451, 41851}, new char[]{0, 0, 0, 0}, new char[]{32072, 11117, 34157, 28684}, objArr);
            KeyGenerator keyGenerator = KeyGenerator.getInstance(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(keyGenerator, "");
            keyGenerator.init(256);
            SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
            Intrinsics.checkNotNullExpressionValue(secretKeyGenerateKey, "");
            onWarmupCompleted = secretKeyGenerateKey;
            onNavigationEvent = new onWarmupCompleted();
            onExtraCallback = new IAuthTabCallback();
            int i = asBinder + 83;
            IAuthTabCallbackDefault = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class onWarmupCompleted implements setupStyleable {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            onWarmupCompleted() {
            }

            @Override // o.setupStyleable
            public byte[] a_(byte[] bArr) throws BaseRoundCornerProgressBarSavedState {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 77;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(bArr, "");
                byte[] bArrA_ = setProgressColor.onNavigationEvent.onExtraCallbackWithResult(setProgressColor.Companion, onNavigationEvent.onExtraCallbackWithResult.onExtraCallbackWithResult(), (IvParameterSpec) null, 2, (Object) null).a_(bArr);
                int i4 = onNavigationEvent + 63;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return bArrA_;
            }
        }

        public final setupStyleable onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onTransact + 23;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            int i4 = i2 % 2;
            setupStyleable setupstyleable = onNavigationEvent;
            int i5 = i3 + 5;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return setupstyleable;
        }

        public static final class IAuthTabCallback implements BaseRoundCornerProgressBarOnProgressChangedListener {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            IAuthTabCallback() {
            }

            @Override // o.BaseRoundCornerProgressBarOnProgressChangedListener
            public byte[] onExtraCallbackWithResult(byte[] bArr) throws onProgressChanged {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 55;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(bArr, "");
                byte[] bArrOnExtraCallbackWithResult = setProgressColor.onNavigationEvent.onNavigationEvent(setProgressColor.Companion, onNavigationEvent.onExtraCallbackWithResult.onExtraCallbackWithResult(), (IvParameterSpec) null, 2, (Object) null).onExtraCallbackWithResult(bArr);
                int i4 = IAuthTabCallback + 71;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 80 / 0;
                }
                return bArrOnExtraCallbackWithResult;
            }
        }

        public final BaseRoundCornerProgressBarOnProgressChangedListener onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onTransact + 93;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            int i4 = i2 % 2;
            BaseRoundCornerProgressBarOnProgressChangedListener baseRoundCornerProgressBarOnProgressChangedListener = onExtraCallback;
            int i5 = i3 + 17;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return baseRoundCornerProgressBarOnProgressChangedListener;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            int i5 = $11 + 19;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i7 = $11 + 55;
                $10 = i7 % 128;
                int i8 = i7 % i3;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 1;
                        byte b2 = (byte) (b - 1);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), (ViewConfiguration.getTouchSlop() >> 8) + 43, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1451, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49122), 44 - TextUtils.indexOf("", ""), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - Color.alpha(0)), AndroidCharacter.getMirror('0') + 2, 22939 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        i2 = 2;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0') + 30, TextUtils.indexOf((CharSequence) "", '0', 0) + 12578, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    } else {
                        i2 = 2;
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackStub ^ 7798559133331975163L))) ^ ((char) (asInterface ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    i3 = i2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }

        static void IAuthTabCallback() {
            IAuthTabCallback = 7798559133331975163L;
            IAuthTabCallbackStub = -440195855;
            asInterface = (char) 27643;
        }
    }

    @Override // o.setMax
    protected setupStyleable IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent.onExtraCallbackWithResult.onNavigationEvent();
            throw null;
        }
        setupStyleable setupstyleableOnNavigationEvent = onNavigationEvent.onExtraCallbackWithResult.onNavigationEvent();
        int i3 = onNavigationEvent + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return setupstyleableOnNavigationEvent;
    }

    @Override // o.setMax
    protected BaseRoundCornerProgressBarOnProgressChangedListener onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        BaseRoundCornerProgressBarOnProgressChangedListener baseRoundCornerProgressBarOnProgressChangedListenerOnWarmupCompleted = onNavigationEvent.onExtraCallbackWithResult.onWarmupCompleted();
        int i4 = IAuthTabCallback + 113;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return baseRoundCornerProgressBarOnProgressChangedListenerOnWarmupCompleted;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseRoundCornerProgressBar1(@NotNull CharSequence charSequence) throws BaseRoundCornerProgressBarSavedState {
        this();
        Intrinsics.checkNotNullParameter(charSequence, "");
        onExtraCallback(charSequence);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseRoundCornerProgressBar1(@NotNull byte[] bArr) throws BaseRoundCornerProgressBarSavedState {
        this();
        Intrinsics.checkNotNullParameter(bArr, "");
        onWarmupCompleted(bArr);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseRoundCornerProgressBar1(@NotNull Parcel parcel) {
        byte[] bArrOnNavigationEvent;
        this();
        Intrinsics.checkNotNullParameter(parcel, "");
        String string = parcel.readString();
        Key key = null;
        if (string != null) {
            bArrOnNavigationEvent = Page.onNavigationEvent(string, 0, 1, null);
        } else {
            int i = IAuthTabCallback + 83;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                int i2 = 4 % 4;
            } else {
                int i3 = 2 % 2;
            }
            bArrOnNavigationEvent = null;
        }
        onExtraCallback(bArrOnNavigationEvent);
        Serializable serializable = parcel.readSerializable();
        if (serializable instanceof Key) {
            int i4 = IAuthTabCallback + 45;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            key = (Key) serializable;
        }
        if (key != null) {
            onNavigationEvent.onExtraCallbackWithResult.onExtraCallback(key);
            int i6 = 2 % 2;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        byte[] bArrOnWarmupCompleted = onWarmupCompleted();
        String strOnExtraCallbackWithResult = null;
        if (bArrOnWarmupCompleted != null) {
            strOnExtraCallbackWithResult = Page.onExtraCallbackWithResult(bArrOnWarmupCompleted, 0, 1, null);
            int i5 = IAuthTabCallback + 81;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        parcel.writeString(strOnExtraCallbackWithResult);
        parcel.writeSerializable(onNavigationEvent.onExtraCallbackWithResult.onExtraCallbackWithResult());
    }

    public static final class onWarmupCompleted implements Parcelable.Creator<BaseRoundCornerProgressBar1> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BaseRoundCornerProgressBar1 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            BaseRoundCornerProgressBar1 baseRoundCornerProgressBar1OnExtraCallback = onExtraCallback(parcel);
            if (i3 == 0) {
                int i4 = 67 / 0;
            }
            int i5 = onExtraCallback + 21;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return baseRoundCornerProgressBar1OnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BaseRoundCornerProgressBar1[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 45;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return onWarmupCompleted(i);
            }
            onWarmupCompleted(i);
            throw null;
        }

        public BaseRoundCornerProgressBar1 onExtraCallback(@NotNull Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            BaseRoundCornerProgressBar1 baseRoundCornerProgressBar1 = new BaseRoundCornerProgressBar1(parcel);
            int i2 = onExtraCallbackWithResult + 57;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return baseRoundCornerProgressBar1;
            }
            throw null;
        }

        public BaseRoundCornerProgressBar1[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 11;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            BaseRoundCornerProgressBar1[] baseRoundCornerProgressBar1Arr = (BaseRoundCornerProgressBar1[]) Array.newInstance(Class.forName("o.BaseRoundCornerProgressBar1"), i);
            int i5 = onExtraCallbackWithResult + 39;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return baseRoundCornerProgressBar1Arr;
            }
            throw null;
        }
    }
}
