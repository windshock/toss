package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.datasource.cache.ReusableBufferedOutputStream;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1 {
    private final HashMap<String, TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0> IAuthTabCallback;
    private onWarmupCompleted IAuthTabCallbackStub;
    private final SparseBooleanArray onExtraCallback;
    private final SparseBooleanArray onExtraCallbackWithResult;
    private onWarmupCompleted onNavigationEvent;
    private final SparseArray<String> onWarmupCompleted;

    interface onWarmupCompleted {
        void IAuthTabCallback(HashMap<String, TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0> map) throws IOException;

        boolean IAuthTabCallback() throws IOException;

        void onExtraCallback(long j);

        void onExtraCallback(HashMap<String, TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0> map) throws IOException;

        void onExtraCallbackWithResult() throws IOException;

        void onNavigationEvent(TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0, boolean z);

        void onWarmupCompleted(HashMap<String, TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0> map, SparseArray<String> sparseArray) throws IOException;

        void onWarmupCompleted(TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0);
    }

    public static boolean IAuthTabCallback(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    static class onNavigationEvent implements onWarmupCompleted {
        private final RecordingInputConnection IAuthTabCallback;
        private final SecretKeySpec asBinder;
        private final Cipher onExtraCallback;
        private boolean onExtraCallbackWithResult;
        private final boolean onNavigationEvent;
        private final SecureRandom onTransact;
        private ReusableBufferedOutputStream onWarmupCompleted;
        private static final byte[] $$a = {101, 74, 115, 66};
        private static final int $$b = OggPageHeader.MAX_SEGMENT_COUNT;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int asInterface = 478308877;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, short s, byte b2) {
            int i2;
            int i3 = (b * 2) + 105;
            byte[] bArr = $$a;
            int i4 = b2 + 4;
            int i5 = s * 2;
            byte[] bArr2 = new byte[1 - i5];
            int i6 = 0 - i5;
            if (bArr == null) {
                int i7 = i6;
                i2 = 0;
                i3 += i7;
                bArr2[i2] = (byte) i3;
                if (i2 == i6) {
                    return new String(bArr2, 0);
                }
                i4++;
                i2++;
                i7 = bArr[i4];
                i3 += i7;
                bArr2[i2] = (byte) i3;
                if (i2 == i6) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i3;
                if (i2 == i6) {
                }
            }
        }

        @Override // o.TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onWarmupCompleted
        public void onExtraCallback(long j) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackDefault + 19;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x016f  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0170  */
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
            while (true) {
                i5 = 2083011369;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                    break;
                }
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(asInterface)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 35125), 23 - (ViewConfiguration.getTouchSlop() >> 8), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 56 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2166, 1298711993, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
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
                    int i8 = $10 + 79;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 12843), 55 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollBarSize() >> 8) + 2167, 1298711993, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i10 = $11 + 41;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    i5 = 2083011369;
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        public onNavigationEvent(File file, @Nullable byte[] bArr, boolean z) throws NoSuchPaddingException, NoSuchAlgorithmException {
            boolean z2;
            Cipher cipher;
            SecretKeySpec secretKeySpec;
            if (bArr == null && z) {
                int i2 = IAuthTabCallbackDefault + 105;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                z2 = false;
            } else {
                z2 = true;
            }
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(z2);
            SecureRandom secureRandom = null;
            if (bArr != null) {
                int i4 = IAuthTabCallbackStub + 7;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                RecordingInputConnection_androidKt.onNavigationEvent(bArr.length == 16);
                try {
                    Object[] objArr = new Object[1];
                    a((ViewConfiguration.getPressedStateDuration() >> 16) + 20, 5 - TextUtils.indexOf((CharSequence) "", '0'), new char[]{65533, 0, 0, 5, '\n', 3, 65533, 1, 15, 65515, 65535, 65534, 65535, 65515, '\f', 7, 65535, 15, 65521, '\f'}, false, 103 - TextUtils.lastIndexOf("", '0', 0, 0), objArr);
                    cipher = Cipher.getInstance(((String) objArr[0]).intern());
                    Object[] objArr2 = new Object[1];
                    a(3 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{65529, 11, 65533}, true, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 108, objArr2);
                    secretKeySpec = new SecretKeySpec(bArr, ((String) objArr2[0]).intern());
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                    throw new IllegalStateException(e);
                }
            } else {
                RecordingInputConnection_androidKt.onNavigationEvent(!z);
                int i6 = IAuthTabCallbackStub + 15;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
                cipher = null;
                secretKeySpec = null;
            }
            this.onNavigationEvent = z;
            this.onExtraCallback = cipher;
            this.asBinder = secretKeySpec;
            if (z) {
                secureRandom = new SecureRandom();
                int i9 = IAuthTabCallbackStub + 91;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
                int i11 = 2 % 2;
            }
            this.onTransact = secureRandom;
            this.IAuthTabCallback = new RecordingInputConnection(file);
            int i12 = IAuthTabCallbackDefault + 71;
            IAuthTabCallbackStub = i12 % 128;
            int i13 = i12 % 2;
        }

        @Override // o.TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onWarmupCompleted
        public boolean IAuthTabCallback() {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStub + 39;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            boolean zOnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted();
            int i5 = IAuthTabCallbackDefault + 109;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 50 / 0;
            }
            return zOnWarmupCompleted;
        }

        @Override // o.TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onWarmupCompleted
        public void onExtraCallbackWithResult() {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStub + 65;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            this.IAuthTabCallback.onExtraCallback();
            int i5 = IAuthTabCallbackDefault + 29;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // o.TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onWarmupCompleted
        public void onWarmupCompleted(HashMap<String, TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0> map, SparseArray<String> sparseArray) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackDefault + 47;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onExtraCallbackWithResult);
            if (!onExtraCallbackWithResult(map, sparseArray)) {
                int i5 = IAuthTabCallbackStub + 87;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 != 0) {
                    map.clear();
                    sparseArray.clear();
                    this.IAuthTabCallback.onExtraCallback();
                } else {
                    map.clear();
                    sparseArray.clear();
                    this.IAuthTabCallback.onExtraCallback();
                    int i6 = 30 / 0;
                }
            }
        }

        @Override // o.TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onWarmupCompleted
        public void onExtraCallback(HashMap<String, TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0> map) throws Throwable {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStub + 111;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted(map);
            this.onExtraCallbackWithResult = false;
            int i5 = IAuthTabCallbackDefault + 25;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onWarmupCompleted
        public void IAuthTabCallback(HashMap<String, TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0> map) throws Throwable {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackDefault + 27;
            int i4 = i3 % 128;
            IAuthTabCallbackStub = i4;
            int i5 = i3 % 2;
            if (this.onExtraCallbackWithResult) {
                onExtraCallback(map);
                return;
            }
            int i6 = i4 + 107;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // o.TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onWarmupCompleted
        public void onWarmupCompleted(TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackDefault;
            int i4 = i3 + 89;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            this.onExtraCallbackWithResult = true;
            int i6 = i3 + 67;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onWarmupCompleted
        public void onNavigationEvent(TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0, boolean z) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackDefault;
            int i4 = i3 + 15;
            IAuthTabCallbackStub = i4 % 128;
            this.onExtraCallbackWithResult = i4 % 2 == 0;
            int i5 = i3 + 11;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00ee, code lost:
        
            if (r3 != false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00f1, code lost:
        
            if (r3 != false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f3, code lost:
        
            o.TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00f6, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private boolean onExtraCallbackWithResult(HashMap<String, TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0> map, SparseArray<String> sparseArray) throws Throwable {
            BufferedInputStream bufferedInputStream;
            DataInputStream dataInputStream;
            int i2 = 2 % 2;
            DataInputStream dataInputStream2 = null;
            if (!this.IAuthTabCallback.onWarmupCompleted()) {
                int i3 = IAuthTabCallbackStub + 85;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 != 0) {
                    return true;
                }
                dataInputStream2.hashCode();
                throw null;
            }
            try {
                bufferedInputStream = new BufferedInputStream(this.IAuthTabCallback.onExtraCallbackWithResult());
                dataInputStream = new DataInputStream(bufferedInputStream);
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                int i4 = dataInputStream.readInt();
                if (i4 < 0 || i4 > 2) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(dataInputStream);
                    return false;
                }
                if ((dataInputStream.readInt() & 1) != 0) {
                    if (this.onExtraCallback == null) {
                        int i5 = IAuthTabCallbackDefault + 27;
                        IAuthTabCallbackStub = i5 % 128;
                        int i6 = i5 % 2;
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(dataInputStream);
                        return false;
                    }
                    byte[] bArr = new byte[16];
                    dataInputStream.readFully(bArr);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                    try {
                        Cipher cipher = this.onExtraCallback;
                        Object objOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this.asBinder}, -1084655742);
                        Object obj = objOnNavigationEvent;
                        cipher.init(2, (Key) objOnNavigationEvent, ivParameterSpec);
                        DataInputStream dataInputStream3 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.onExtraCallback));
                        int i7 = IAuthTabCallbackStub + 51;
                        IAuthTabCallbackDefault = i7 % 128;
                        int i8 = i7 % 2;
                        dataInputStream = dataInputStream3;
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                        throw new IllegalStateException(e);
                    }
                } else if (this.onNavigationEvent) {
                    this.onExtraCallbackWithResult = true;
                }
                int i9 = dataInputStream.readInt();
                int iOnExtraCallback = 0;
                for (int i10 = 0; i10 < i9; i10++) {
                    TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnExtraCallbackWithResult = onExtraCallbackWithResult(i4, dataInputStream);
                    map.put(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnExtraCallbackWithResult.onExtraCallbackWithResult, textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnExtraCallbackWithResult);
                    sparseArray.put(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnExtraCallbackWithResult.onNavigationEvent, textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnExtraCallbackWithResult.onExtraCallbackWithResult);
                    iOnExtraCallback += onExtraCallback(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnExtraCallbackWithResult, i4);
                }
                int i11 = dataInputStream.readInt();
                boolean z = dataInputStream.read() == -1;
                if (i11 == iOnExtraCallback) {
                    int i12 = IAuthTabCallbackStub + 23;
                    IAuthTabCallbackDefault = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 25 / 0;
                    }
                }
                TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(dataInputStream);
                return false;
            } catch (IOException unused2) {
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    int i14 = IAuthTabCallbackStub + 65;
                    IAuthTabCallbackDefault = i14 % 128;
                    int i15 = i14 % 2;
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(dataInputStream2);
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(dataInputStream2);
                }
                throw th;
            }
        }

        private void onWarmupCompleted(HashMap<String, TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0> map) throws Throwable {
            int iOnExtraCallback;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackDefault + 5;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            Closeable closeable = null;
            try {
                OutputStream outputStreamOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent();
                ReusableBufferedOutputStream reusableBufferedOutputStream = this.onWarmupCompleted;
                if (reusableBufferedOutputStream == null) {
                    this.onWarmupCompleted = new ReusableBufferedOutputStream(outputStreamOnNavigationEvent);
                } else {
                    reusableBufferedOutputStream.onExtraCallbackWithResult(outputStreamOnNavigationEvent);
                }
                ReusableBufferedOutputStream reusableBufferedOutputStream2 = this.onWarmupCompleted;
                DataOutputStream dataOutputStream = new DataOutputStream(reusableBufferedOutputStream2);
                try {
                    dataOutputStream.writeInt(2);
                    dataOutputStream.writeInt(this.onNavigationEvent ? 1 : 0);
                    if (this.onNavigationEvent) {
                        byte[] bArr = new byte[16];
                        Object[] objArr = {this.onTransact};
                        Object objOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -1084655742);
                        Object obj = objOnNavigationEvent;
                        ((SecureRandom) objOnNavigationEvent).nextBytes(bArr);
                        dataOutputStream.write(bArr);
                        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                        try {
                            Object[] objArr2 = {this.onExtraCallback};
                            Object objOnNavigationEvent2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr2, -1084655742);
                            Object obj2 = objOnNavigationEvent2;
                            Object[] objArr3 = {this.asBinder};
                            Object objOnNavigationEvent3 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr3, -1084655742);
                            Object obj3 = objOnNavigationEvent3;
                            ((Cipher) objOnNavigationEvent2).init(1, (Key) objOnNavigationEvent3, ivParameterSpec);
                            dataOutputStream.flush();
                            dataOutputStream = new DataOutputStream(new CipherOutputStream(reusableBufferedOutputStream2, this.onExtraCallback));
                        } catch (InvalidAlgorithmParameterException e) {
                            e = e;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream.writeInt(map.size());
                    Iterator<TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0> it = map.values().iterator();
                    int i5 = 0;
                    while (!(!it.hasNext())) {
                        int i6 = IAuthTabCallbackDefault + 23;
                        IAuthTabCallbackStub = i6 % 128;
                        if (i6 % 2 != 0) {
                            TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 next = it.next();
                            onNavigationEvent(next, dataOutputStream);
                            iOnExtraCallback = onExtraCallback(next, 4);
                        } else {
                            TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 next2 = it.next();
                            onNavigationEvent(next2, dataOutputStream);
                            iOnExtraCallback = onExtraCallback(next2, 2);
                        }
                        i5 += iOnExtraCallback;
                    }
                    dataOutputStream.writeInt(i5);
                    this.IAuthTabCallback.onWarmupCompleted(dataOutputStream);
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted((Closeable) null);
                    int i7 = IAuthTabCallbackStub + 101;
                    IAuthTabCallbackDefault = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Throwable th) {
                    th = th;
                    closeable = dataOutputStream;
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(closeable);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003b A[PHI: r1
          0x003b: PHI (r1v11 int) = (r1v6 int), (r1v15 int) binds: [B:8:0x0028, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[PHI: r1
          0x002a: PHI (r1v7 int) = (r1v6 int), (r1v15 int) binds: [B:8:0x0028, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private int onExtraCallback(TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0, int i2) {
            int iHashCode;
            int i3;
            int iHashCode2;
            int i4 = 2 % 2;
            int i5 = IAuthTabCallbackDefault + 19;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                iHashCode = (textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onNavigationEvent << 25) >> textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onExtraCallbackWithResult.hashCode();
                if (i2 < 4) {
                    long jIAuthTabCallback = TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2.IAuthTabCallback(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.IAuthTabCallback());
                    i3 = iHashCode * 31;
                    iHashCode2 = (int) (jIAuthTabCallback ^ (jIAuthTabCallback >>> 32));
                } else {
                    i3 = iHashCode * 31;
                    iHashCode2 = textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.IAuthTabCallback().hashCode();
                }
            } else {
                iHashCode = (textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onNavigationEvent * 31) + textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onExtraCallbackWithResult.hashCode();
                if (i2 < 2) {
                }
            }
            int i6 = i3 + iHashCode2;
            int i7 = IAuthTabCallbackDefault + 65;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0037 A[PHI: r1 r2
          0x0037: PHI (r1v8 int) = (r1v4 int), (r1v9 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
          0x0037: PHI (r2v4 java.lang.String) = (r2v1 java.lang.String), (r2v5 java.lang.String) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1 r2
          0x0024: PHI (r1v5 int) = (r1v4 int), (r1v9 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
          0x0024: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v5 java.lang.String) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 onExtraCallbackWithResult(int i2, DataInputStream dataInputStream) throws IOException {
            int i3;
            String utf;
            TextFieldSelectionStateKtExternalSyntheticLambda0 textFieldSelectionStateKtExternalSyntheticLambda0OnNavigationEvent;
            int i4 = 2 % 2;
            int i5 = IAuthTabCallbackStub + 97;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                i3 = dataInputStream.readInt();
                utf = dataInputStream.readUTF();
                if (i2 >= 4) {
                    textFieldSelectionStateKtExternalSyntheticLambda0OnNavigationEvent = TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onNavigationEvent(dataInputStream);
                } else {
                    long j = dataInputStream.readLong();
                    TextFieldSelectionState_androidKtExternalSyntheticLambda1 textFieldSelectionState_androidKtExternalSyntheticLambda1 = new TextFieldSelectionState_androidKtExternalSyntheticLambda1();
                    TextFieldSelectionState_androidKtExternalSyntheticLambda1.onNavigationEvent(textFieldSelectionState_androidKtExternalSyntheticLambda1, j);
                    textFieldSelectionStateKtExternalSyntheticLambda0OnNavigationEvent = TextFieldSelectionStateKtExternalSyntheticLambda0.onExtraCallbackWithResult.onNavigationEvent(textFieldSelectionState_androidKtExternalSyntheticLambda1);
                }
            } else {
                i3 = dataInputStream.readInt();
                utf = dataInputStream.readUTF();
                if (i2 < 2) {
                }
            }
            TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 = new TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0(i3, utf, textFieldSelectionStateKtExternalSyntheticLambda0OnNavigationEvent);
            int i6 = IAuthTabCallbackDefault + 75;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 55 / 0;
            }
            return textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0;
        }

        private void onNavigationEvent(TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0, DataOutputStream dataOutputStream) throws IOException {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackDefault + 49;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                dataOutputStream.writeInt(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onNavigationEvent);
                dataOutputStream.writeUTF(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onExtraCallbackWithResult);
                TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onExtraCallback(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.IAuthTabCallback(), dataOutputStream);
                int i4 = 48 / 0;
            } else {
                dataOutputStream.writeInt(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onNavigationEvent);
                dataOutputStream.writeUTF(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onExtraCallbackWithResult);
                TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onExtraCallback(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.IAuthTabCallback(), dataOutputStream);
            }
            int i5 = IAuthTabCallbackStub + 79;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1(@Nullable TextLayoutStateExternalSyntheticLambda0 textLayoutStateExternalSyntheticLambda0, @Nullable File file, @Nullable byte[] bArr, boolean z, boolean z2) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult((textLayoutStateExternalSyntheticLambda0 == null && file == null) ? false : true);
        this.IAuthTabCallback = new HashMap<>();
        this.onWarmupCompleted = new SparseArray<>();
        this.onExtraCallbackWithResult = new SparseBooleanArray();
        this.onExtraCallback = new SparseBooleanArray();
        onExtraCallback onextracallback = textLayoutStateExternalSyntheticLambda0 != null ? new onExtraCallback(textLayoutStateExternalSyntheticLambda0) : null;
        onNavigationEvent onnavigationevent = file != null ? new onNavigationEvent(new File(file, "cached_content_index.exi"), bArr, z) : null;
        if (onextracallback == null || (onnavigationevent != null && z2)) {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            this.IAuthTabCallbackStub = (onWarmupCompleted) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{onnavigationevent}, -1084655742);
            this.onNavigationEvent = onextracallback;
            return;
        }
        this.IAuthTabCallbackStub = onextracallback;
        this.onNavigationEvent = onnavigationevent;
    }

    public void onExtraCallback(long j) throws IOException {
        onWarmupCompleted onwarmupcompleted;
        this.IAuthTabCallbackStub.onExtraCallback(j);
        onWarmupCompleted onwarmupcompleted2 = this.onNavigationEvent;
        if (onwarmupcompleted2 != null) {
            onwarmupcompleted2.onExtraCallback(j);
        }
        if (!this.IAuthTabCallbackStub.IAuthTabCallback() && (onwarmupcompleted = this.onNavigationEvent) != null && onwarmupcompleted.IAuthTabCallback()) {
            this.onNavigationEvent.onWarmupCompleted(this.IAuthTabCallback, this.onWarmupCompleted);
            this.IAuthTabCallbackStub.onExtraCallback(this.IAuthTabCallback);
        } else {
            this.IAuthTabCallbackStub.onWarmupCompleted(this.IAuthTabCallback, this.onWarmupCompleted);
        }
        onWarmupCompleted onwarmupcompleted3 = this.onNavigationEvent;
        if (onwarmupcompleted3 != null) {
            onwarmupcompleted3.onExtraCallbackWithResult();
            this.onNavigationEvent = null;
        }
    }

    public void IAuthTabCallback() throws IOException {
        this.IAuthTabCallbackStub.IAuthTabCallback(this.IAuthTabCallback);
        int size = this.onExtraCallbackWithResult.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.onWarmupCompleted.remove(this.onExtraCallbackWithResult.keyAt(i2));
        }
        this.onExtraCallbackWithResult.clear();
        this.onExtraCallback.clear();
    }

    static final class onExtraCallback implements onWarmupCompleted {
        private static int IAuthTabCallbackDefault;
        private static int IAuthTabCallbackStub;
        private static int access000;
        private static int asBinder;
        private static short[] asInterface;
        private static byte[] onTransact;
        private static final String[] onWarmupCompleted;
        private final TextLayoutStateExternalSyntheticLambda0 IAuthTabCallback;
        private final SparseArray<TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0> onExtraCallback = new SparseArray<>();
        private String onExtraCallbackWithResult;
        private String onNavigationEvent;
        private static final byte[] $$a = {1, Byte.MIN_VALUE, 109, Byte.MIN_VALUE};
        private static final int $$b = 6;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getInterfaceDescriptor = 0;
        private static int IAuthTabCallback_Parcel = 1;
        private static int access100 = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(int i2, byte b, short s) {
            int i3;
            int i4;
            int i5 = 4 - (b * 4);
            int i6 = (i2 * 2) + 115;
            int i7 = s * 3;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i7 + 1];
            if (bArr == null) {
                int i8 = i5;
                int i9 = 0;
                i5 += -i6;
                i4 = i8 + 1;
                i3 = i9;
                bArr2[i3] = (byte) i5;
                if (i3 == i7) {
                    return new String(bArr2, 0);
                }
                int i10 = i3 + 1;
                i8 = i4;
                i6 = bArr[i4];
                i9 = i10;
                i5 += -i6;
                i4 = i8 + 1;
                i3 = i9;
                bArr2[i3] = (byte) i5;
                if (i3 == i7) {
                }
            } else {
                i3 = 0;
                i5 = i6;
                i4 = i5;
                bArr2[i3] = (byte) i5;
                if (i3 == i7) {
                }
            }
        }

        private static void a(short s, byte b, int i2, int i3, int i4, Object[] objArr) throws Throwable {
            long j;
            int i5;
            boolean z;
            int i6;
            int i7 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(IAuthTabCallbackDefault)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 43424), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42, 22439 - View.resolveSize(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                int i8 = iIntValue == -1 ? 1 : 0;
                char c = '0';
                if (i8 == 0) {
                    j = -4629411779493505016L;
                } else {
                    byte[] bArr = onTransact;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i9 = 0;
                        while (i9 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) ($$a[0] - 1);
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.lastIndexOf("", c, 0, 0)), 55 - TextUtils.indexOf("", ""), 2167 - View.combineMeasuredStates(0, 0), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i9++;
                            c = '0';
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i10 = $11 + 13;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        byte[] bArr3 = onTransact;
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(asBinder)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 43425), MotionEvent.axisFromString("") + 43, 22439 - TextUtils.getCapsMode("", 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackDefault ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (asInterface[i2 + ((int) (asBinder ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackDefault ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i2 + iIntValue) - 2) + ((int) (asBinder ^ j)) + i8;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(IAuthTabCallbackStub), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 87, TextUtils.indexOf((CharSequence) "", '0') + 9568, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onTransact;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i12 = 0;
                        while (i12 < length2) {
                            int i13 = $10 + 85;
                            int i14 = i13 % 128;
                            $11 = i14;
                            if (i13 % 2 == 0) {
                                bArr5[i12] = (byte) (bArr4[i12] - (-4629411779493505016L));
                                i12 >>= 1;
                            } else {
                                bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                                i12++;
                            }
                            int i15 = i14 + 63;
                            $10 = i15 % 128;
                            int i16 = i15 % 2;
                        }
                        i5 = 2;
                        bArr4 = bArr5;
                    } else {
                        i5 = 2;
                    }
                    if (bArr4 != null) {
                        int i17 = $10 + 55;
                        $11 = i17 % 128;
                        int i18 = i17 % i5;
                        z = true;
                    } else {
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i19 = $10;
                        int i20 = i19 + 19;
                        $11 = i20 % 128;
                        int i21 = i20 % 2;
                        if (z) {
                            int i22 = i19 + 63;
                            $11 = i22 % 128;
                            if (i22 % 2 == 0) {
                                byte[] bArr6 = onTransact;
                                int i23 = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = 0;
                                i6 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback / (((byte) (((byte) (bArr6[i23] - 4629411779493505016L)) >> s)) ^ b);
                            } else {
                                byte[] bArr7 = onTransact;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                i6 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b);
                            }
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) i6;
                        } else {
                            short[] sArr = asInterface;
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

        static {
            access000 = 1;
            onNavigationEvent();
            Object[] objArr = new Object[1];
            a((short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (byte) View.resolveSize(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 420296358, (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 27160068, (-94) - KeyEvent.normalizeMetaState(0), objArr);
            onWarmupCompleted = new String[]{TtmlNode.ATTR_ID, ((String) objArr[0]).intern(), TtmlNode.TAG_METADATA};
            int i2 = access100 + 67;
            access000 = i2 % 128;
            int i3 = i2 % 2;
        }

        public onExtraCallback(TextLayoutStateExternalSyntheticLambda0 textLayoutStateExternalSyntheticLambda0) {
            this.IAuthTabCallback = textLayoutStateExternalSyntheticLambda0;
        }

        @Override // o.TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onWarmupCompleted
        public void onExtraCallback(long j) {
            int i2 = 2 % 2;
            int i3 = getInterfaceDescriptor + 5;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                String hexString = Long.toHexString(j);
                this.onNavigationEvent = hexString;
                this.onExtraCallbackWithResult = onExtraCallbackWithResult(hexString);
                int i4 = 16 / 0;
            } else {
                String hexString2 = Long.toHexString(j);
                this.onNavigationEvent = hexString2;
                this.onExtraCallbackWithResult = onExtraCallbackWithResult(hexString2);
            }
            int i5 = getInterfaceDescriptor + 109;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 46 / 0;
            }
        }

        @Override // o.TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onWarmupCompleted
        public boolean IAuthTabCallback() throws DatabaseIOException {
            int i2 = 2 % 2;
            int i3 = getInterfaceDescriptor + 69;
            IAuthTabCallback_Parcel = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    if (TextFieldMagnifierNodeImpl28ExternalSyntheticLambda0.onExtraCallbackWithResult(this.IAuthTabCallback.getReadableDatabase(), 1, (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent)) == -1) {
                        return false;
                    }
                } else if (TextFieldMagnifierNodeImpl28ExternalSyntheticLambda0.onExtraCallbackWithResult(this.IAuthTabCallback.getReadableDatabase(), 1, (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent)) == -1) {
                    return false;
                }
                int i4 = getInterfaceDescriptor;
                int i5 = i4 + 79;
                IAuthTabCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 41;
                IAuthTabCallback_Parcel = i7 % 128;
                int i8 = i7 % 2;
                return true;
            } catch (SQLException e) {
                throw new DatabaseIOException(e);
            }
        }

        @Override // o.TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onWarmupCompleted
        public void onExtraCallbackWithResult() throws DatabaseIOException {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback_Parcel + 101;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback(this.IAuthTabCallback, (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent));
            int i5 = IAuthTabCallback_Parcel + 83;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 45 / 0;
            }
        }

        @Override // o.TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onWarmupCompleted
        public void onWarmupCompleted(HashMap<String, TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0> map, SparseArray<String> sparseArray) throws IOException {
            boolean z;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback_Parcel + 53;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            if (this.onExtraCallback.size() == 0) {
                int i5 = IAuthTabCallback_Parcel + 123;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(z);
            try {
                if (TextFieldMagnifierNodeImpl28ExternalSyntheticLambda0.onExtraCallbackWithResult(this.IAuthTabCallback.getReadableDatabase(), 1, (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent)) != 1) {
                    SQLiteDatabase writableDatabase = this.IAuthTabCallback.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        onExtraCallbackWithResult(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                Cursor cursorOnWarmupCompleted = onWarmupCompleted();
                while (cursorOnWarmupCompleted.moveToNext()) {
                    try {
                        TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 = new TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0(cursorOnWarmupCompleted.getInt(0), (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(cursorOnWarmupCompleted.getString(1)), TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onNavigationEvent(new DataInputStream(new ByteArrayInputStream(cursorOnWarmupCompleted.getBlob(2)))));
                        map.put(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onExtraCallbackWithResult, textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0);
                        sparseArray.put(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onNavigationEvent, textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onExtraCallbackWithResult);
                    } finally {
                    }
                }
                cursorOnWarmupCompleted.close();
            } catch (SQLiteException e) {
                map.clear();
                sparseArray.clear();
                throw new DatabaseIOException(e);
            }
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [android.database.sqlite.SQLiteDatabase, int] */
        @Override // o.TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onWarmupCompleted
        public void onExtraCallback(HashMap<String, TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0> map) throws IOException {
            int i2 = 2 % 2;
            int i3 = getInterfaceDescriptor + 71;
            IAuthTabCallback_Parcel = i3 % 128;
            ?? r1 = i3 % 2;
            try {
                try {
                    if (r1 != 0) {
                        SQLiteDatabase writableDatabase = this.IAuthTabCallback.getWritableDatabase();
                        writableDatabase.beginTransactionNonExclusive();
                        onExtraCallbackWithResult(writableDatabase);
                        Iterator<TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0> it = map.values().iterator();
                        while (it.hasNext()) {
                            onExtraCallbackWithResult(writableDatabase, it.next());
                            int i4 = IAuthTabCallback_Parcel + 87;
                            getInterfaceDescriptor = i4 % 128;
                            int i5 = i4 % 2;
                        }
                        writableDatabase.setTransactionSuccessful();
                        this.onExtraCallback.clear();
                        writableDatabase.endTransaction();
                        return;
                    }
                    SQLiteDatabase writableDatabase2 = this.IAuthTabCallback.getWritableDatabase();
                    writableDatabase2.beginTransactionNonExclusive();
                    onExtraCallbackWithResult(writableDatabase2);
                    map.values().iterator();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                } catch (Throwable th) {
                    r1.endTransaction();
                    throw th;
                }
            } catch (SQLException e) {
                throw new DatabaseIOException(e);
            }
        }

        @Override // o.TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onWarmupCompleted
        public void IAuthTabCallback(HashMap<String, TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0> map) throws IOException {
            int i2 = 2 % 2;
            int i3 = getInterfaceDescriptor + 83;
            IAuthTabCallback_Parcel = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                if (this.onExtraCallback.size() != 0) {
                    try {
                        SQLiteDatabase writableDatabase = this.IAuthTabCallback.getWritableDatabase();
                        writableDatabase.beginTransactionNonExclusive();
                        int i4 = 0;
                        while (i4 < this.onExtraCallback.size()) {
                            try {
                                TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0ValueAt = this.onExtraCallback.valueAt(i4);
                                if (textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0ValueAt == null) {
                                    IAuthTabCallback(writableDatabase, this.onExtraCallback.keyAt(i4));
                                } else {
                                    onExtraCallbackWithResult(writableDatabase, textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0ValueAt);
                                    int i5 = getInterfaceDescriptor + 49;
                                    IAuthTabCallback_Parcel = i5 % 128;
                                    if (i5 % 2 == 0) {
                                        int i6 = 3 / 4;
                                    }
                                }
                                i4++;
                                int i7 = getInterfaceDescriptor + 9;
                                IAuthTabCallback_Parcel = i7 % 128;
                                int i8 = i7 % 2;
                            } finally {
                                writableDatabase.endTransaction();
                            }
                        }
                        writableDatabase.setTransactionSuccessful();
                        this.onExtraCallback.clear();
                        return;
                    } catch (SQLException e) {
                        throw new DatabaseIOException(e);
                    }
                }
                int i9 = getInterfaceDescriptor + 69;
                IAuthTabCallback_Parcel = i9 % 128;
                if (i9 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.onExtraCallback.size();
            throw null;
        }

        @Override // o.TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onWarmupCompleted
        public void onWarmupCompleted(TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback_Parcel + 45;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            this.onExtraCallback.put(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onNavigationEvent, textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0);
            int i5 = getInterfaceDescriptor + 101;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onWarmupCompleted
        public void onNavigationEvent(TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0, boolean z) {
            int i2 = 2 % 2;
            if (!z) {
                this.onExtraCallback.put(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onNavigationEvent, null);
                int i3 = getInterfaceDescriptor + 43;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            int i5 = IAuthTabCallback_Parcel + 65;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            this.onExtraCallback.delete(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onNavigationEvent);
        }

        private Cursor onWarmupCompleted() {
            int i2 = 2 % 2;
            int i3 = getInterfaceDescriptor + 11;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            Cursor cursorQuery = this.IAuthTabCallback.getReadableDatabase().query((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult), onWarmupCompleted, null, null, null, null, null);
            int i5 = getInterfaceDescriptor + 49;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            return cursorQuery;
        }

        private void onExtraCallbackWithResult(SQLiteDatabase sQLiteDatabase) throws DatabaseIOException, SQLException {
            int i2 = 2 % 2;
            TextFieldMagnifierNodeImpl28ExternalSyntheticLambda0.IAuthTabCallback(sQLiteDatabase, 1, (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent), 1);
            onExtraCallback(sQLiteDatabase, (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.onExtraCallbackWithResult + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
            int i3 = getInterfaceDescriptor + 75;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 31 / 0;
            }
        }

        private void IAuthTabCallback(SQLiteDatabase sQLiteDatabase, int i2) {
            int i3 = 2 % 2;
            int i4 = getInterfaceDescriptor + 125;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            sQLiteDatabase.delete((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult), "id = ?", new String[]{Integer.toString(i2)});
            int i6 = IAuthTabCallback_Parcel + 67;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
        }

        private void onExtraCallbackWithResult(SQLiteDatabase sQLiteDatabase, TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0) throws Throwable {
            int i2 = 2 % 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onExtraCallback(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.IAuthTabCallback(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put(TtmlNode.ATTR_ID, Integer.valueOf(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onNavigationEvent));
            Object[] objArr = new Object[1];
            a((short) ExpandableListView.getPackedPositionType(0L), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-420296357) + TextUtils.getTrimmedLength(""), (-27160068) - ExpandableListView.getPackedPositionType(0L), Color.rgb(0, 0, 0) + 16777122, objArr);
            contentValues.put(((String) objArr[0]).intern(), textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onExtraCallbackWithResult);
            contentValues.put(TtmlNode.TAG_METADATA, byteArray);
            sQLiteDatabase.replaceOrThrow((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult), null, contentValues);
            int i3 = IAuthTabCallback_Parcel + 125;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
        }

        private static void IAuthTabCallback(TextLayoutStateExternalSyntheticLambda0 textLayoutStateExternalSyntheticLambda0, String str) throws DatabaseIOException {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback_Parcel + 65;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            try {
                String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
                SQLiteDatabase writableDatabase = textLayoutStateExternalSyntheticLambda0.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    TextFieldMagnifierNodeImpl28ExternalSyntheticLambda0.onExtraCallback(writableDatabase, 1, str);
                    onExtraCallback(writableDatabase, strOnExtraCallbackWithResult);
                    writableDatabase.setTransactionSuccessful();
                    int i5 = getInterfaceDescriptor + 119;
                    IAuthTabCallback_Parcel = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 64 / 0;
                    }
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e) {
                throw new DatabaseIOException(e);
            }
        }

        private static void onExtraCallback(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
            int i2 = 2 % 2;
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
            int i3 = IAuthTabCallback_Parcel + 9;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
        }

        private static String onExtraCallbackWithResult(String str) {
            int i2 = 2 % 2;
            String str2 = "ExoPlayerCacheIndex" + str;
            int i3 = IAuthTabCallback_Parcel + 5;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                return str2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void onNavigationEvent() {
            asBinder = -1119162707;
            IAuthTabCallbackDefault = -1538795415;
            IAuthTabCallbackStub = -1512458649;
            onTransact = new byte[]{28, -14, 8};
        }
    }

    public TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 onNavigationEvent(String str) {
        TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 = this.IAuthTabCallback.get(str);
        return textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 == null ? IAuthTabCallbackStub(str) : textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0;
    }

    public TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 onWarmupCompleted(String str) {
        return this.IAuthTabCallback.get(str);
    }

    public Collection<TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0> onExtraCallback() {
        return Collections.unmodifiableCollection(this.IAuthTabCallback.values());
    }

    public int onExtraCallbackWithResult(String str) {
        return onNavigationEvent(str).onNavigationEvent;
    }

    public String IAuthTabCallback(int i2) {
        return this.onWarmupCompleted.get(i2);
    }

    public void IAuthTabCallbackDefault(String str) {
        TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 = this.IAuthTabCallback.get(str);
        if (textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 != null && textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onExtraCallbackWithResult() && textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onWarmupCompleted()) {
            this.IAuthTabCallback.remove(str);
            int i2 = textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onNavigationEvent;
            boolean z = this.onExtraCallback.get(i2);
            this.IAuthTabCallbackStub.onNavigationEvent(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0, z);
            if (z) {
                this.onWarmupCompleted.remove(i2);
                this.onExtraCallback.delete(i2);
            } else {
                this.onWarmupCompleted.put(i2, null);
                this.onExtraCallbackWithResult.put(i2, true);
            }
        }
    }

    public void onExtraCallbackWithResult() {
        UnmodifiableIterator it = ImmutableSet.copyOf(this.IAuthTabCallback.keySet()).iterator();
        while (it.hasNext()) {
            IAuthTabCallbackDefault((String) it.next());
        }
    }

    public void onExtraCallback(String str, TextFieldSelectionState_androidKtExternalSyntheticLambda1 textFieldSelectionState_androidKtExternalSyntheticLambda1) {
        TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnNavigationEvent = onNavigationEvent(str);
        if (textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnNavigationEvent.onExtraCallbackWithResult(textFieldSelectionState_androidKtExternalSyntheticLambda1)) {
            this.IAuthTabCallbackStub.onWarmupCompleted(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnNavigationEvent);
        }
    }

    public TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2 onExtraCallback(String str) {
        TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnWarmupCompleted = onWarmupCompleted(str);
        return textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnWarmupCompleted != null ? textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback() : TextFieldSelectionStateKtExternalSyntheticLambda0.onExtraCallbackWithResult;
    }

    private TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 IAuthTabCallbackStub(String str) {
        int iOnWarmupCompleted = onWarmupCompleted(this.onWarmupCompleted);
        TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 = new TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0(iOnWarmupCompleted, str);
        this.IAuthTabCallback.put(str, textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0);
        this.onWarmupCompleted.put(iOnWarmupCompleted, str);
        this.onExtraCallback.put(iOnWarmupCompleted, true);
        this.IAuthTabCallbackStub.onWarmupCompleted(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0);
        return textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0;
    }

    static int onWarmupCompleted(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i2 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i2 < size && i2 == sparseArray.keyAt(i2)) {
            i2++;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TextFieldSelectionStateKtExternalSyntheticLambda0 onNavigationEvent(DataInputStream dataInputStream) throws IOException {
        int i2 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < i2; i3++) {
            String utf = dataInputStream.readUTF();
            int i4 = dataInputStream.readInt();
            if (i4 < 0) {
                throw new IOException("Invalid value size: " + i4);
            }
            int iMin = Math.min(i4, 10485760);
            byte[] bArrCopyOf = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted;
            int i5 = 0;
            while (i5 != i4) {
                int i6 = i5 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                dataInputStream.readFully(bArrCopyOf, i5, iMin);
                iMin = Math.min(i4 - i6, 10485760);
                i5 = i6;
            }
            map.put(utf, bArrCopyOf);
        }
        return new TextFieldSelectionStateKtExternalSyntheticLambda0(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onExtraCallback(TextFieldSelectionStateKtExternalSyntheticLambda0 textFieldSelectionStateKtExternalSyntheticLambda0, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setIAuthTabCallback = textFieldSelectionStateKtExternalSyntheticLambda0.IAuthTabCallback();
        dataOutputStream.writeInt(setIAuthTabCallback.size());
        for (Map.Entry<String, byte[]> entry : setIAuthTabCallback) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }
}
