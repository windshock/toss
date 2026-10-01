package org.bouncycastle.asn1.x509;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import okhttp3.internal.url._UrlKt;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERUTCTime;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class Time extends ASN1Object implements ASN1Choice {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static char[] onWarmupCompleted = {27186, 27319, 27319, 27319, 27309, 27267, 27286, 27306, 27288, 27270, 27284, 27299, 27326, 27325};
    ASN1Primitive time;

    public Time(Date date) throws Throwable {
        ASN1Primitive dERGeneralizedTime;
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        Object[] objArr = new Object[1];
        a(new int[]{0, 14, 128, 0}, false, new byte[]{1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, objArr);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((String) objArr[0]).intern());
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String str = simpleDateFormat.format(date) + "Z";
        int i = Integer.parseInt(str.substring(0, 4));
        if (i < 1950 || i > 2049) {
            dERGeneralizedTime = new DERGeneralizedTime(str);
            int i2 = IAuthTabCallback + 115;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
            }
            this.time = dERGeneralizedTime;
        }
        dERGeneralizedTime = new DERUTCTime(str.substring(2));
        int i3 = onExtraCallback + 111;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 2 % 2;
        this.time = dERGeneralizedTime;
    }

    public Time(Date date, Locale locale) throws Throwable {
        ASN1Primitive dERGeneralizedTime;
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        Object[] objArr = new Object[1];
        a(new int[]{0, 14, 128, 0}, false, new byte[]{1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, objArr);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((String) objArr[0]).intern(), locale);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String str = simpleDateFormat.format(date) + "Z";
        int i = Integer.parseInt(str.substring(0, 4));
        if (i < 1950 || i > 2049) {
            dERGeneralizedTime = new DERGeneralizedTime(str);
            int i2 = IAuthTabCallback + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        } else {
            dERGeneralizedTime = new DERUTCTime(str.substring(2));
        }
        int i4 = 2 % 2;
        this.time = dERGeneralizedTime;
        int i5 = onExtraCallback + 55;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public Time(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1UTCTime) && !(aSN1Primitive instanceof ASN1GeneralizedTime)) {
            throw new IllegalArgumentException("unknown object passed to Time");
        }
        this.time = aSN1Primitive;
        int i = IAuthTabCallback + 71;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Time getInstance(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (obj == null || (obj instanceof Time)) {
            return (Time) obj;
        }
        int i4 = i3 + 125;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if (!(obj instanceof ASN1UTCTime)) {
            if (obj instanceof ASN1GeneralizedTime) {
                return new Time((ASN1GeneralizedTime) obj);
            }
            throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
        }
        Time time = new Time((ASN1UTCTime) obj);
        int i6 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return time;
        }
        obj2.hashCode();
        throw null;
    }

    public static Time getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Time time = getInstance(aSN1TaggedObject.getObject());
        int i4 = IAuthTabCallback + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return time;
        }
        throw null;
    }

    public Date getDate() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        try {
            ASN1Primitive aSN1Primitive = this.time;
            if (!(!(aSN1Primitive instanceof ASN1UTCTime))) {
                return ((ASN1UTCTime) aSN1Primitive).getAdjustedDate();
            }
            Date date = ((ASN1GeneralizedTime) aSN1Primitive).getDate();
            int i4 = onExtraCallback + 107;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return date;
        } catch (ParseException e) {
            throw new IllegalStateException("invalid date string: " + e.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        return ((org.bouncycastle.asn1.ASN1GeneralizedTime) r1).getTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if ((r1 instanceof org.bouncycastle.asn1.ASN1UTCTime) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if ((r1 instanceof org.bouncycastle.asn1.ASN1UTCTime) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r2 = r2 + 83;
        org.bouncycastle.asn1.x509.Time.IAuthTabCallback = r2 % 128;
        r2 = r2 % 2;
        r1 = ((org.bouncycastle.asn1.ASN1UTCTime) r1).getAdjustedTime();
        r2 = org.bouncycastle.asn1.x509.Time.IAuthTabCallback + 17;
        org.bouncycastle.asn1.x509.Time.onExtraCallback = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getTime() {
        ASN1Primitive aSN1Primitive;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            aSN1Primitive = this.time;
            int i4 = 43 / 0;
        } else {
            aSN1Primitive = this.time;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.time;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String time = getTime();
        int i4 = IAuthTabCallback + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return time;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char[] cArr2;
        char c;
        int length;
        char[] cArr3;
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr4 = onWarmupCompleted;
        float f = 0.0f;
        if (cArr4 != null) {
            int i8 = $11 + 95;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = cArr4.length;
                cArr3 = new char[length];
                i = 1;
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
                i = 0;
            }
            while (i < length) {
                int i9 = $10 + 13;
                $11 = i9 % 128;
                if (i9 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr4[i])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 35283), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 34, ExpandableListView.getPackedPositionChild(0L) + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr4[i])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 35, View.MeasureSpec.getSize(0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i++;
                }
                i2 = 2;
            }
            cArr4 = cArr3;
        }
        char[] cArr5 = new char[i5];
        System.arraycopy(cArr4, i4, cArr5, 0, i5);
        if (bArr != null) {
            int i10 = $11 + 9;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr2 = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 1;
            } else {
                cArr2 = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 10935), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 65, 16718 - (ViewConfiguration.getLongPressTimeout() >> 16), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), Color.green(0) + 29, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i12] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr2[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 49467), Color.green(0) + 70, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                f = 0.0f;
            }
            cArr5 = cArr2;
        }
        if (i7 > 0) {
            char[] cArr6 = new char[i5];
            System.arraycopy(cArr5, 0, cArr6, 0, i5);
            int i13 = i5 - i7;
            System.arraycopy(cArr6, 0, cArr5, i13, i7);
            System.arraycopy(cArr6, i7, cArr5, 0, i13);
        }
        if (z) {
            int i14 = $11 + 1;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            int i15 = $11 + 97;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr5[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr5 = cArr;
        }
        if (i6 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr5);
    }
}
