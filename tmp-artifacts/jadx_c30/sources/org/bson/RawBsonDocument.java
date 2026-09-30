package org.bson;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.dv15;
import o.dv17;
import o.getButtonTextForNewStyleBar;
import o.jc2;
import o.jc5;
import o.ltycx1;
import o.okzb1;
import o.pmi10;
import o.pmi5;
import o.setBackupVideoView;
import o.setDownloadButtonData;
import o.sya21;
import o.t_;
import org.bson.codecs.RawBsonDocumentCodec;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RawBsonDocument extends getButtonTextForNewStyleBar {
    private static final long serialVersionUID = 1;
    private final byte[] bytes;
    private final int length;
    private final int offset;
    private static final byte[] $$a = {2, 77, 55, -86};
    private static final int $$b = 38;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private static char[] onExtraCallbackWithResult = {60863, 44154, 28219};
    private static long onNavigationEvent = -8656798929014838241L;

    private static String $$c(int i, short s, int i2) {
        int i3 = (s * 4) + 4;
        int i4 = i2 * 3;
        int i5 = 97 - (i * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i5 += i6;
            i3++;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i5 += bArr[i3];
            i3++;
        }
    }

    @Override // o.getButtonTextForNewStyleBar
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            clone();
            throw null;
        }
        getButtonTextForNewStyleBar getbuttontextfornewstylebarClone = clone();
        int i3 = onWarmupCompleted + 95;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return getbuttontextfornewstylebarClone;
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public /* synthetic */ jc2 get(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return get(obj);
        }
        get(obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public /* synthetic */ jc2 put(String str, jc2 jc2Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        jc2 jc2VarPut = put(str, jc2Var);
        int i4 = IAuthTabCallback + 109;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return jc2VarPut;
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public /* synthetic */ jc2 remove(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        jc2 jc2VarRemove = remove(obj);
        int i4 = onWarmupCompleted + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return jc2VarRemove;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public RawBsonDocument(byte[] bArr) {
        this((byte[]) pmi10.onExtraCallbackWithResult("bytes", bArr), 0, bArr.length);
    }

    public RawBsonDocument(byte[] bArr, int i, int i2) {
        boolean z;
        boolean z2;
        pmi10.onExtraCallbackWithResult("bytes", bArr);
        boolean z3 = true;
        pmi10.onExtraCallbackWithResult("offset >= 0", i >= 0);
        if (i < bArr.length) {
            z = true;
        } else {
            int i3 = IAuthTabCallback + 113;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
            z = false;
        }
        pmi10.onExtraCallbackWithResult("offset < bytes.length", z);
        if (i2 <= bArr.length - i) {
            z2 = true;
        } else {
            int i5 = 2 % 2;
            z2 = false;
        }
        pmi10.onExtraCallbackWithResult("length <= bytes.length - offset", z2);
        if (i2 >= 5) {
            int i6 = IAuthTabCallback + 43;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else {
            z3 = false;
        }
        pmi10.onExtraCallbackWithResult("length >= 5", z3);
        this.bytes = bArr;
        this.offset = i;
        this.length = i2;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - View.combineMeasuredStates(0, 0)), 18 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 46134), ((Process.getThreadPriority(0) + 20) >> 6) + 31, 20219 - ImageFormat.getBitsPerPixel(0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 49123), (ViewConfiguration.getEdgeSlop() >> 16) + 44, KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i5 = $11 + 73;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 49123), 44 - Color.red(0), ExpandableListView.getPackedPositionChild(0L) + 1495, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i7 = $10 + 5;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 5 / 2;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }

    public okzb1 onExtraCallbackWithResult() {
        int i = 2 % 2;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.bytes, this.offset, this.length);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        jc5 jc5Var = new jc5(byteBufferWrap);
        int i2 = onWarmupCompleted + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return jc5Var;
        }
        throw null;
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public void clear() {
        int i = 2 % 2;
        throw new UnsupportedOperationException("RawBsonDocument instances are immutable");
    }

    @Override // o.getButtonTextForNewStyleBar
    /* renamed from: onExtraCallbackWithResult */
    public jc2 put(String str, jc2 jc2Var) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("RawBsonDocument instances are immutable");
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public void putAll(Map<? extends String, ? extends jc2> map) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("RawBsonDocument instances are immutable");
    }

    @Override // o.getButtonTextForNewStyleBar
    /* renamed from: onNavigationEvent */
    public jc2 remove(Object obj) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("RawBsonDocument instances are immutable");
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public boolean isEmpty() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        setDownloadButtonData setdownloadbuttondataOnExtraCallback = onExtraCallback();
        try {
            setdownloadbuttondataOnExtraCallback.warmup();
            if (setdownloadbuttondataOnExtraCallback.ICustomTabsCallbackStub() == t_.END_OF_DOCUMENT) {
                setdownloadbuttondataOnExtraCallback.extraCommand();
                setdownloadbuttondataOnExtraCallback.close();
                return true;
            }
            setdownloadbuttondataOnExtraCallback.close();
            int i4 = IAuthTabCallback + 83;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        } catch (Throwable th) {
            setdownloadbuttondataOnExtraCallback.close();
            throw th;
        }
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public int size() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        setDownloadButtonData setdownloadbuttondataOnExtraCallback = onExtraCallback();
        try {
            setdownloadbuttondataOnExtraCallback.warmup();
            int i4 = 0;
            while (setdownloadbuttondataOnExtraCallback.ICustomTabsCallbackStub() != t_.END_OF_DOCUMENT) {
                int i5 = onWarmupCompleted + 65;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                i4++;
                setdownloadbuttondataOnExtraCallback.requestPostMessageChannelWithExtras();
                setdownloadbuttondataOnExtraCallback.ICustomTabsService_Parcel();
            }
            setdownloadbuttondataOnExtraCallback.extraCommand();
            setdownloadbuttondataOnExtraCallback.close();
            int i7 = onWarmupCompleted + 97;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return i4;
        } catch (Throwable th) {
            setdownloadbuttondataOnExtraCallback.close();
            throw th;
        }
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public Set<Map.Entry<String, jc2>> entrySet() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getButtonTextForNewStyleBar getbuttontextfornewstylebarAsInterface = asInterface();
        if (i3 == 0) {
            return getbuttontextfornewstylebarAsInterface.entrySet();
        }
        getbuttontextfornewstylebarAsInterface.entrySet();
        throw null;
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public Collection<jc2> values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getButtonTextForNewStyleBar getbuttontextfornewstylebarAsInterface = asInterface();
        if (i3 != 0) {
            return getbuttontextfornewstylebarAsInterface.values();
        }
        getbuttontextfornewstylebarAsInterface.values();
        throw null;
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public Set<String> keySet() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getButtonTextForNewStyleBar getbuttontextfornewstylebarAsInterface = asInterface();
        if (i3 == 0) {
            return getbuttontextfornewstylebarAsInterface.keySet();
        }
        getbuttontextfornewstylebarAsInterface.keySet();
        throw null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public boolean containsKey(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = org.bson.RawBsonDocument.IAuthTabCallback
            int r1 = r1 + 107
            int r2 = r1 % 128
            org.bson.RawBsonDocument.onWarmupCompleted = r2
            int r1 = r1 % r0
            if (r4 == 0) goto L5e
            int r2 = r2 + 119
            int r1 = r2 % 128
            org.bson.RawBsonDocument.IAuthTabCallback = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L4e
            o.setDownloadButtonData r0 = r3.onExtraCallback()
            r0.warmup()     // Catch: java.lang.Throwable -> L4c
        L1e:
            o.t_ r1 = r0.ICustomTabsCallbackStub()     // Catch: java.lang.Throwable -> L4c
            o.t_ r2 = o.t_.END_OF_DOCUMENT     // Catch: java.lang.Throwable -> L4c
            if (r1 == r2) goto L44
            int r1 = org.bson.RawBsonDocument.IAuthTabCallback
            int r1 = r1 + 81
            int r2 = r1 % 128
            org.bson.RawBsonDocument.onWarmupCompleted = r2
            int r1 = r1 % 2
            java.lang.String r1 = r0.requestPostMessageChannelWithExtras()     // Catch: java.lang.Throwable -> L4c
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L4c
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L40
            r0.ICustomTabsService_Parcel()     // Catch: java.lang.Throwable -> L4c
            goto L1e
        L40:
            r0.close()
            return r2
        L44:
            r0.extraCommand()     // Catch: java.lang.Throwable -> L4c
            r0.close()
            r4 = 0
            return r4
        L4c:
            r4 = move-exception
            goto L5a
        L4e:
            o.setDownloadButtonData r0 = r3.onExtraCallback()
            r0.warmup()     // Catch: java.lang.Throwable -> L4c
            r4 = 0
            r4.hashCode()     // Catch: java.lang.Throwable -> L4c
            throw r4     // Catch: java.lang.Throwable -> L4c
        L5a:
            r0.close()
            throw r4
        L5e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "key can not be null"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bson.RawBsonDocument.containsKey(java.lang.Object):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public boolean containsValue(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = org.bson.RawBsonDocument.onWarmupCompleted
            int r1 = r1 + 115
            int r2 = r1 % 128
            org.bson.RawBsonDocument.IAuthTabCallback = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L45
            o.setDownloadButtonData r0 = r3.onExtraCallback()
            r0.warmup()     // Catch: java.lang.Throwable -> L43
        L15:
            o.t_ r1 = r0.ICustomTabsCallbackStub()     // Catch: java.lang.Throwable -> L43
            o.t_ r2 = o.t_.END_OF_DOCUMENT     // Catch: java.lang.Throwable -> L43
            if (r1 == r2) goto L3b
            int r1 = org.bson.RawBsonDocument.IAuthTabCallback
            int r1 = r1 + 15
            int r2 = r1 % 128
            org.bson.RawBsonDocument.onWarmupCompleted = r2
            int r1 = r1 % 2
            r0.IEngagementSignalsCallback()     // Catch: java.lang.Throwable -> L43
            byte[] r1 = r3.bytes     // Catch: java.lang.Throwable -> L43
            o.jc2 r1 = org.bson.RawBsonValueHelper.onExtraCallback(r1, r0)     // Catch: java.lang.Throwable -> L43
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L15
            r0.close()
            r4 = 1
            return r4
        L3b:
            r0.extraCommand()     // Catch: java.lang.Throwable -> L43
            r0.close()
            r4 = 0
            return r4
        L43:
            r4 = move-exception
            goto L4e
        L45:
            o.setDownloadButtonData r0 = r3.onExtraCallback()
            r0.warmup()     // Catch: java.lang.Throwable -> L43
            r4 = 0
            throw r4     // Catch: java.lang.Throwable -> L43
        L4e:
            r0.close()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bson.RawBsonDocument.containsValue(java.lang.Object):boolean");
    }

    @Override // o.getButtonTextForNewStyleBar
    /* renamed from: onExtraCallbackWithResult */
    public jc2 get(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(View.getDefaultSize(0, 0), 4 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), objArr);
        pmi10.onExtraCallbackWithResult(((String) objArr[0]).intern(), obj);
        setDownloadButtonData setdownloadbuttondataOnExtraCallback = onExtraCallback();
        try {
            setdownloadbuttondataOnExtraCallback.warmup();
            while (setdownloadbuttondataOnExtraCallback.ICustomTabsCallbackStub() != t_.END_OF_DOCUMENT) {
                if (setdownloadbuttondataOnExtraCallback.requestPostMessageChannelWithExtras().equals(obj)) {
                    jc2 jc2VarOnExtraCallback = RawBsonValueHelper.onExtraCallback(this.bytes, setdownloadbuttondataOnExtraCallback);
                    setdownloadbuttondataOnExtraCallback.close();
                    int i4 = IAuthTabCallback + 59;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return jc2VarOnExtraCallback;
                }
                setdownloadbuttondataOnExtraCallback.ICustomTabsService_Parcel();
                int i6 = IAuthTabCallback + 39;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 / 4;
                }
            }
            setdownloadbuttondataOnExtraCallback.extraCommand();
            setdownloadbuttondataOnExtraCallback.close();
            return null;
        } catch (Throwable th) {
            setdownloadbuttondataOnExtraCallback.close();
            throw th;
        }
    }

    @Override // o.getButtonTextForNewStyleBar
    public String onWarmupCompleted() {
        int i = 2 % 2;
        String strIAuthTabCallback = IAuthTabCallback(new ltycx1());
        int i2 = IAuthTabCallback + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return strIAuthTabCallback;
        }
        throw null;
    }

    @Override // o.getButtonTextForNewStyleBar
    public String IAuthTabCallback(ltycx1 ltycx1Var) {
        int i = 2 % 2;
        StringWriter stringWriter = new StringWriter();
        new RawBsonDocumentCodec().onWarmupCompleted(new setBackupVideoView(stringWriter, ltycx1Var), this, dv15.onExtraCallback().IAuthTabCallback());
        String string = stringWriter.toString();
        int i2 = onWarmupCompleted + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public boolean equals(Object obj) {
        boolean zEquals;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            zEquals = asInterface().equals(obj);
            int i3 = 1 / 0;
        } else {
            zEquals = asInterface().equals(obj);
        }
        int i4 = IAuthTabCallback + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zEquals;
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = asInterface().hashCode();
        int i4 = IAuthTabCallback + 61;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    @Override // o.getButtonTextForNewStyleBar
    /* renamed from: onNavigationEvent */
    public getButtonTextForNewStyleBar clone() {
        int i = 2 % 2;
        RawBsonDocument rawBsonDocument = new RawBsonDocument((byte[]) this.bytes.clone(), this.offset, this.length);
        int i2 = onWarmupCompleted + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return rawBsonDocument;
    }

    private setDownloadButtonData onExtraCallback() {
        int i = 2 % 2;
        setDownloadButtonData setdownloadbuttondata = new setDownloadButtonData(new sya21(onExtraCallbackWithResult()));
        int i2 = IAuthTabCallback + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return setdownloadbuttondata;
    }

    private getButtonTextForNewStyleBar asInterface() {
        int i = 2 % 2;
        setDownloadButtonData setdownloadbuttondataOnExtraCallback = onExtraCallback();
        try {
            getButtonTextForNewStyleBar getbuttontextfornewstylebarOnNavigationEvent = new pmi5().onNavigationEvent(setdownloadbuttondataOnExtraCallback, dv17.onExtraCallback().onExtraCallbackWithResult());
            setdownloadbuttondataOnExtraCallback.close();
            int i2 = onWarmupCompleted + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return getbuttontextfornewstylebarOnNavigationEvent;
        } catch (Throwable th) {
            setdownloadbuttondataOnExtraCallback.close();
            throw th;
        }
    }

    private Object writeReplace() {
        int i = 2 % 2;
        SerializationProxy serializationProxy = new SerializationProxy(this.bytes, this.offset, this.length);
        int i2 = IAuthTabCallback + 1;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
        return serializationProxy;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        int i = 2 % 2;
        throw new InvalidObjectException("Proxy required");
    }

    static class SerializationProxy implements Serializable {
        private static final long serialVersionUID = 1;
        private final byte[] bytes;

        SerializationProxy(byte[] bArr, int i, int i2) {
            if (bArr.length == i2) {
                this.bytes = bArr;
                return;
            }
            byte[] bArr2 = new byte[i2];
            this.bytes = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, i2);
        }

        private Object readResolve() {
            return new RawBsonDocument(this.bytes);
        }
    }
}
