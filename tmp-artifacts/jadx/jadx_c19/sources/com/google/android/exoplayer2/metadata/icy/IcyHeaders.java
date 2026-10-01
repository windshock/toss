package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class IcyHeaders implements Metadata.Entry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Parcelable.Creator<IcyHeaders> CREATOR;
    private static int IAuthTabCallback = 0;
    public static final String REQUEST_HEADER_ENABLE_METADATA_NAME = "Icy-MetaData";
    public static final String REQUEST_HEADER_ENABLE_METADATA_VALUE = "1";
    private static final String RESPONSE_HEADER_BITRATE = "icy-br";
    private static final String RESPONSE_HEADER_GENRE = "icy-genre";
    private static final String RESPONSE_HEADER_METADATA_INTERVAL = "icy-metaint";
    private static final String RESPONSE_HEADER_NAME = "icy-name";
    private static final String RESPONSE_HEADER_PUB = "icy-pub";
    private static final String RESPONSE_HEADER_URL = "icy-url";
    private static final String TAG = "IcyHeaders";
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static long onWarmupCompleted;
    public final int bitrate;
    public final String genre;
    public final boolean isPublic;
    public final int metadataInterval;
    public final String name;
    public final String url;

    public int describeContents() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return 0;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i4 = $11 + 79;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i6 = $10 + 69;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i8 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 45812), TextUtils.getOffsetBefore("", 0) + 84, TextUtils.indexOf((CharSequence) "", '0') + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14233 - AndroidCharacter.getMirror('0')), 19 - (KeyEvent.getMaxKeyCode() >> 16), 8808 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static IcyHeaders parse(Map<String, List<String>> map) throws Throwable {
        int i2;
        boolean z;
        List<String> list;
        String str;
        List<String> list2;
        String str2;
        List<String> list3;
        String str3;
        List<String> list4;
        boolean zEquals;
        List<String> list5;
        int i3;
        int i4;
        int i5 = 2 % 2;
        List<String> list6 = map.get(RESPONSE_HEADER_BITRATE);
        int i6 = -1;
        boolean z2 = true;
        if (list6 != null) {
            String str4 = list6.get(0);
            try {
                i4 = Integer.parseInt(str4) * 1000;
            } catch (NumberFormatException unused) {
                i4 = -1;
            }
            if (i4 > 0) {
                z = true;
                i2 = i4;
            } else {
                try {
                    Log.w(TAG, "Invalid bitrate: " + str4);
                    i4 = -1;
                } catch (NumberFormatException unused2) {
                    Log.w(TAG, "Invalid bitrate header: " + str4);
                    z = false;
                    i2 = i4;
                    list = map.get(RESPONSE_HEADER_GENRE);
                    if (list == null) {
                    }
                    list2 = map.get(RESPONSE_HEADER_NAME);
                    if (list2 == null) {
                    }
                    list3 = map.get(RESPONSE_HEADER_URL);
                    if (list3 == null) {
                    }
                    list4 = map.get(RESPONSE_HEADER_PUB);
                    if (list4 == null) {
                    }
                    list5 = map.get(RESPONSE_HEADER_METADATA_INTERVAL);
                    if (list5 != null) {
                    }
                    if (z) {
                    }
                }
                z = false;
                i2 = i4;
            }
        } else {
            i2 = -1;
            z = false;
        }
        list = map.get(RESPONSE_HEADER_GENRE);
        if (list == null) {
            str = list.get(0);
            z = true;
        } else {
            str = null;
        }
        list2 = map.get(RESPONSE_HEADER_NAME);
        if (list2 == null) {
            str2 = list2.get(0);
            z = true;
        } else {
            str2 = null;
        }
        list3 = map.get(RESPONSE_HEADER_URL);
        if (list3 == null) {
            str3 = list3.get(0);
            z = true;
        } else {
            str3 = null;
        }
        list4 = map.get(RESPONSE_HEADER_PUB);
        if (list4 == null) {
            int i7 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            String str5 = list4.get(0);
            Object[] objArr = new Object[1];
            a(new char[]{8923, 8938, 35378, 44980, 53299}, TextUtils.getOffsetBefore("", 0) + 1, objArr);
            zEquals = str5.equals(((String) objArr[0]).intern());
            z = true;
        } else {
            zEquals = false;
        }
        list5 = map.get(RESPONSE_HEADER_METADATA_INTERVAL);
        if (list5 != null) {
            int i9 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            String str6 = list5.get(0);
            try {
                i3 = Integer.parseInt(str6);
            } catch (NumberFormatException unused3) {
            }
            if (i3 > 0) {
                int i11 = onExtraCallbackWithResult + 3;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                i6 = i3;
                z = z2;
            } else {
                try {
                    Log.w(TAG, "Invalid metadata interval: " + str6);
                } catch (NumberFormatException unused4) {
                    i6 = i3;
                    Log.w(TAG, "Invalid metadata interval: " + str6);
                    z2 = z;
                    z = z2;
                    if (z) {
                    }
                }
                z2 = z;
                z = z2;
            }
        }
        if (z) {
            return new IcyHeaders(i2, str, str2, str3, zEquals, i6);
        }
        return null;
    }

    public IcyHeaders(int i2, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, int i3) {
        boolean z2;
        if (i3 == -1 || i3 > 0) {
            int i4 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            z2 = true;
        } else {
            int i7 = onNavigationEvent;
            int i8 = i7 + 79;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 13;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 % 2;
            }
            z2 = false;
        }
        Assertions.checkArgument(z2);
        this.bitrate = i2;
        this.genre = str;
        this.name = str2;
        this.url = str3;
        this.isPublic = z;
        this.metadataInterval = i3;
    }

    IcyHeaders(Parcel parcel) {
        this.bitrate = parcel.readInt();
        this.genre = parcel.readString();
        this.name = parcel.readString();
        this.url = parcel.readString();
        this.isPublic = Util.readBoolean(parcel);
        this.metadataInterval = parcel.readInt();
    }

    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        int i2 = 2 % 2;
        String str = this.name;
        Object obj = null;
        if (str != null) {
            int i3 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                builder.setStation(str);
            } else {
                builder.setStation(str);
                obj.hashCode();
                throw null;
            }
        }
        String str2 = this.genre;
        if (str2 != null) {
            builder.setGenre(str2);
            int i4 = onExtraCallbackWithResult + 61;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        int i3 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        if (this.bitrate != icyHeaders.bitrate || !Util.areEqual(this.genre, icyHeaders.genre) || !Util.areEqual(this.name, icyHeaders.name)) {
            return false;
        }
        int i5 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            Util.areEqual(this.url, icyHeaders.url);
            throw null;
        }
        if (!Util.areEqual(this.url, icyHeaders.url) || this.isPublic != icyHeaders.isPublic) {
            return false;
        }
        int i6 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return this.metadataInterval == icyHeaders.metadataInterval;
        }
        int i7 = icyHeaders.metadataInterval;
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i2 = 2 % 2;
        int i3 = this.bitrate;
        String str = this.genre;
        if (str != null) {
            int i4 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                iHashCode = str.hashCode();
                int i5 = 23 / 0;
            } else {
                iHashCode = str.hashCode();
            }
        } else {
            iHashCode = 0;
        }
        String str2 = this.name;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
        } else {
            int i6 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        }
        String str3 = this.url;
        return ((((((((((i3 + 527) * 31) + iHashCode) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.isPublic ? 1 : 0)) * 31) + this.metadataInterval;
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "IcyHeaders: name=\"" + this.name + "\", genre=\"" + this.genre + "\", bitrate=" + this.bitrate + ", metadataInterval=" + this.metadataInterval;
        int i3 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            parcel.writeInt(this.bitrate);
            parcel.writeString(this.genre);
            parcel.writeString(this.name);
            parcel.writeString(this.url);
            Util.writeBoolean(parcel, this.isPublic);
            parcel.writeInt(this.metadataInterval);
            return;
        }
        parcel.writeInt(this.bitrate);
        parcel.writeString(this.genre);
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        Util.writeBoolean(parcel, this.isPublic);
        parcel.writeInt(this.metadataInterval);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallback();
        CREATOR = new Parcelable.Creator<IcyHeaders>() { // from class: com.google.android.exoplayer2.metadata.icy.IcyHeaders.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public IcyHeaders createFromParcel(Parcel parcel) {
                return new IcyHeaders(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public IcyHeaders[] newArray(int i2) {
                return new IcyHeaders[i2];
            }
        };
        int i2 = onExtraCallback + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    static void onExtraCallback() {
        onWarmupCompleted = 2287820659195308221L;
    }
}
