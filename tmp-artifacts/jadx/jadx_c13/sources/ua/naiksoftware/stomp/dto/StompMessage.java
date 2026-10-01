package ua.naiksoftware.stomp.dto;

import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import java.io.StringReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class StompMessage {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static final Pattern PATTERN_HEADER;
    public static final String TERMINATE_MESSAGE_SYMBOL = "\u0000";
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static char[] onNavigationEvent = null;
    private static int onWarmupCompleted = 1;
    private final String mPayload;
    private final String mStompCommand;
    private final List<StompHeader> mStompHeaders;

    static {
        onWarmupCompleted();
        PATTERN_HEADER = Pattern.compile("([^:\\s]+)\\s*:\\s*([^:\\s]+)");
        int i = onExtraCallback + 107;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public StompMessage(String str, List<StompHeader> list, String str2) {
        this.mStompCommand = str;
        this.mStompHeaders = list;
        this.mPayload = str2;
    }

    public List<StompHeader> getStompHeaders() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.mStompHeaders;
        }
        throw null;
    }

    public String getPayload() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.mPayload;
        int i4 = i3 + 51;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public String getStompCommand() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 15;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.mStompCommand;
        int i5 = i2 + 107;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r1.hasNext() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        r2 = r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if ((!r2.getKey().equals(r6)) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        r6 = ua.naiksoftware.stomp.dto.StompMessage.onWarmupCompleted + 35;
        ua.naiksoftware.stomp.dto.StompMessage.IAuthTabCallback = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if ((r6 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r0 = 3 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        return r2.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return r2.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r2 = r2 + 9;
        ua.naiksoftware.stomp.dto.StompMessage.IAuthTabCallback = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String findHeader(String str) {
        List<StompHeader> list;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            list = this.mStompHeaders;
            int i4 = 92 / 0;
        } else {
            list = this.mStompHeaders;
        }
    }

    public String compile() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String strCompile = compile(false);
        int i4 = onWarmupCompleted + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return strCompile;
    }

    public String compile(boolean z) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.mStompCommand);
        sb.append('\n');
        Iterator<StompHeader> it = this.mStompHeaders.iterator();
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = IAuthTabCallback + 19;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                StompHeader next = it.next();
                sb.append(next.getKey());
                sb.append('Q');
                sb.append(next.getValue());
                sb.append((char) 22);
            } else {
                StompHeader next2 = it.next();
                sb.append(next2.getKey());
                sb.append(':');
                sb.append(next2.getValue());
                sb.append('\n');
            }
        }
        sb.append('\n');
        String str = this.mPayload;
        if (str != null) {
            int i5 = onWarmupCompleted + 29;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            sb.append(str);
            if (z) {
                sb.append("\n\n");
            }
        }
        sb.append("\u0000");
        return sb.toString();
    }

    public static StompMessage from(@Nullable String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String next = null;
        if (str == null || str.trim().isEmpty()) {
            Object[] objArr = new Object[1];
            a(new int[]{0, 7, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1}, objArr);
            return new StompMessage(((String) objArr[0]).intern(), null, str);
        }
        Scanner scanner = new Scanner(new StringReader(str));
        scanner.useDelimiter("\\n");
        String next2 = scanner.next();
        ArrayList arrayList = new ArrayList();
        while (true) {
            Pattern pattern = PATTERN_HEADER;
            if (!scanner.hasNext(pattern)) {
                break;
            }
            Matcher matcher = pattern.matcher(scanner.next());
            matcher.find();
            arrayList.add(new StompHeader(matcher.group(1), matcher.group(2)));
        }
        scanner.skip("\n\n");
        scanner.useDelimiter("\u0000");
        if (!(!scanner.hasNext())) {
            next = scanner.next();
            int i4 = onWarmupCompleted + 21;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return new StompMessage(next2, arrayList, next);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StompMessage{command='" + this.mStompCommand + "', headers=" + this.mStompHeaders + ", payload='" + this.mPayload + "'}";
        int i2 = IAuthTabCallback + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public StompMessage createMockData(List<StompHeader> list, String str) {
        int i = 2 % 2;
        StompMessage stompMessage = new StompMessage("MOCK", list, str);
        int i2 = onWarmupCompleted + 95;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return stompMessage;
        }
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onNavigationEvent;
        double d = 0.0d;
        if (cArr2 != null) {
            int i7 = $10 + 79;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 41;
                $11 = i9 % 128;
                if (i9 % i == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d ? 0 : -1))), 35 - View.MeasureSpec.makeMeasureSpec(0, 0), 14239 - View.combineMeasuredStates(0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i8 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getEdgeSlop() >> 16)), 35 - KeyEvent.getDeadChar(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8++;
                }
                int i10 = $11 + 57;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                i = 2;
                d = 0.0d;
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i12 = $11 + 3;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0)), 65 - ExpandableListView.getPackedPositionGroup(0L), 16718 - View.combineMeasuredStates(0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 29, 17656 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 49467), 71 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i16 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i16, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i16);
        }
        if (!(!z)) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i17 = $11 + 67;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i19 = $10 + 103;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onWarmupCompleted() {
        onNavigationEvent = new char[]{27236, 27167, 27138, 27138, 27136, 27165, 27164};
    }
}
