package org.bouncycastle.asn1.cms;

import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
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
    private static long IAuthTabCallback = -6652604958752030911L;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    ASN1Primitive time;

    public Time(Date date) throws Throwable {
        ASN1Primitive dERGeneralizedTime;
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        Object[] objArr = new Object[1];
        a(new char[]{15443, 15402, 38459, 16296, 53775, 46923, 17258, 36852, 11562, 50167, 42498, 40213, 7795, 61638, 38087, 44104, 4028, 57761}, '1' - AndroidCharacter.getMirror('0'), objArr);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((String) objArr[0]).intern());
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String str = simpleDateFormat.format(date) + "Z";
        int i = Integer.parseInt(str.substring(0, 4));
        if (i < 1950 || i > 2049) {
            dERGeneralizedTime = new DERGeneralizedTime(str);
        } else {
            dERGeneralizedTime = new DERUTCTime(str.substring(2));
            int i2 = onNavigationEvent + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.time = dERGeneralizedTime;
        int i5 = onNavigationEvent + 1;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public Time(Date date, Locale locale) throws Throwable {
        ASN1Primitive dERGeneralizedTime;
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        Object[] objArr = new Object[1];
        a(new char[]{15443, 15402, 38459, 16296, 53775, 46923, 17258, 36852, 11562, 50167, 42498, 40213, 7795, 61638, 38087, 44104, 4028, 57761}, 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((String) objArr[0]).intern(), locale);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String str = simpleDateFormat.format(date) + "Z";
        int i = Integer.parseInt(str.substring(0, 4));
        if (i < 1950 || i > 2049) {
            dERGeneralizedTime = new DERGeneralizedTime(str);
            int i2 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            dERGeneralizedTime = new DERUTCTime(str.substring(2));
        }
        this.time = dERGeneralizedTime;
        int i5 = onNavigationEvent + 85;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    private Time(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1UTCTime) && !(aSN1Primitive instanceof ASN1GeneralizedTime)) {
            throw new IllegalArgumentException("unknown object passed to Time");
        }
        this.time = aSN1Primitive;
        int i = onNavigationEvent + 31;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r0 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        return new org.bouncycastle.asn1.cms.Time((org.bouncycastle.asn1.ASN1UTCTime) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if ((r3 instanceof org.bouncycastle.asn1.ASN1GeneralizedTime) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        return new org.bouncycastle.asn1.cms.Time((org.bouncycastle.asn1.ASN1GeneralizedTime) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        throw new java.lang.IllegalArgumentException("unknown object in factory: " + r3.getClass().getName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r0 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Time getInstance(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (obj == null || (obj instanceof Time)) {
            return (Time) obj;
        }
        int i5 = i3 + 69;
        onWarmupCompleted = i5 % 128;
        boolean z = obj instanceof ASN1UTCTime;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
    }

    public static Time getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Time time = getInstance(aSN1TaggedObject.getObject());
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        int i5 = onNavigationEvent + 101;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return time;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Date getDate() {
        int i = 2 % 2;
        try {
            ASN1Primitive aSN1Primitive = this.time;
            if (!(aSN1Primitive instanceof ASN1UTCTime)) {
                Date date = ((ASN1GeneralizedTime) aSN1Primitive).getDate();
                int i2 = onNavigationEvent + 3;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return date;
            }
            Date adjustedDate = ((ASN1UTCTime) aSN1Primitive).getAdjustedDate();
            int i4 = onNavigationEvent + 77;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return adjustedDate;
            }
            throw null;
        } catch (ParseException e) {
            throw new IllegalStateException("invalid date string: " + e.getMessage());
        }
    }

    public String getTime() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        ASN1Primitive aSN1Primitive = this.time;
        if (!(aSN1Primitive instanceof ASN1UTCTime)) {
            return ((ASN1GeneralizedTime) aSN1Primitive).getTime();
        }
        int i5 = i3 + 67;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        String adjustedTime = ((ASN1UTCTime) aSN1Primitive).getAdjustedTime();
        if (i6 != 0) {
            int i7 = 83 / 0;
        }
        return adjustedTime;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1Primitive aSN1Primitive;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            aSN1Primitive = this.time;
            int i4 = 21 / 0;
        } else {
            aSN1Primitive = this.time;
        }
        int i5 = i3 + 35;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return aSN1Primitive;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 15;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 45812), 85 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14185), ExpandableListView.getPackedPositionType(0L) + 19, TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $11 + 15;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }
}
