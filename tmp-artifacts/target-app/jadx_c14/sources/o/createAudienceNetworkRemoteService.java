package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.tmoney.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createAudienceNetworkRemoteService extends HashMap<String, Object> implements RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 {
    public static final Parcelable.Creator<createAudienceNetworkRemoteService> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static final class onExtraCallback implements Parcelable.Creator<createAudienceNetworkRemoteService> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createAudienceNetworkRemoteService createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(parcel);
            }
            onExtraCallbackWithResult(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createAudienceNetworkRemoteService[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 43;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            createAudienceNetworkRemoteService[] createaudiencenetworkremoteserviceArrOnNavigationEvent = onNavigationEvent(i);
            if (i4 != 0) {
                int i5 = 0 / 0;
            }
            return createaudiencenetworkremoteserviceArrOnNavigationEvent;
        }

        public final createAudienceNetworkRemoteService onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            createAudienceNetworkRemoteService createaudiencenetworkremoteservice = new createAudienceNetworkRemoteService();
            int i2 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return createaudiencenetworkremoteservice;
            }
            throw null;
        }

        public final createAudienceNetworkRemoteService[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 75;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            createAudienceNetworkRemoteService[] createaudiencenetworkremoteserviceArr = new createAudienceNetworkRemoteService[i];
            int i6 = i3 + 3;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return createaudiencenetworkremoteserviceArr;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 123;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~((~i4) | i7);
        int i9 = i2 | i8 | (~(i6 | i4));
        int i10 = (~(i4 | i2)) | (~(i7 | i4)) | (~(i7 | i2));
        int i11 = i2 + i6 + i3 + (1351532378 * i5) + (1237199896 * i);
        int i12 = i11 * i11;
        int i13 = ((-211156802) * i2) + 1314914304 + ((-491389116) * i6) + (2007367491 * i9) + (i10 * (-2007367491)) + ((-2007367491) * i8) + (1796210688 * i3) + ((-1818230784) * i5) + ((-914358272) * i) + ((-2051670016) * i12);
        int i14 = ((i2 * 406040238) - 634933780) + (i6 * 406038884) + (i9 * (-677)) + (i10 * 677) + (i8 * 677) + (i3 * 406039561) + (i5 * 1283666474) + (i * 1712827608) + (i12 * (-77201408));
        return i13 + ((i14 * i14) * 1831469056) != 1 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i2 % 128;
        return Integer.valueOf(i2 % 2 != 0 ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(1);
        int i5 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        createAudienceNetworkRemoteService createaudiencenetworkremoteservice = (createAudienceNetworkRemoteService) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            createaudiencenetworkremoteservice.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Set<Map.Entry<String, Object>> setOnExtraCallback = createaudiencenetworkremoteservice.onExtraCallback();
        int i3 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 95 / 0;
        }
        return setOnExtraCallback;
    }

    public Object IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.get(str);
            obj.hashCode();
            throw null;
        }
        Object obj2 = super.get(str);
        int i3 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return obj2;
        }
        throw null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        int i = 2 % 2;
        if (!(obj instanceof String)) {
            int i2 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        boolean zOnExtraCallback = onExtraCallback((String) obj);
        int i4 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if (obj instanceof String) {
            return IAuthTabCallback((String) obj);
        }
        int i5 = i3 + 53;
        int i6 = i5 % 128;
        onWarmupCompleted = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 125;
        onExtraCallbackWithResult = i8 % 128;
        Object obj2 = null;
        if (i8 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        int i = 2 % 2;
        if (obj instanceof String) {
            return onWarmupCompleted((String) obj, obj2);
        }
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 123;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 115;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return obj2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<String> keySet() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Set<String> setOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return setOnExtraCallbackWithResult;
    }

    public Set<Map.Entry<String, Object>> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Set<Map.Entry<String, Object>> setEntrySet = super.entrySet();
        int i4 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return setEntrySet;
    }

    public boolean onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zContainsKey = super.containsKey(str);
        int i4 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return zContainsKey;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Set<String> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return super.keySet();
        }
        super.keySet();
        throw null;
    }

    public boolean onExtraCallbackWithResult(String str, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zRemove = super.remove(str, obj);
        int i4 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return zRemove;
    }

    public int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int size = super.size();
        int i4 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    public Object onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objRemove = super.remove(str);
        int i4 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return objRemove;
    }

    public Object onWarmupCompleted(String str, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object orDefault = super.getOrDefault(str, obj);
        int i4 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return orDefault;
        }
        throw null;
    }

    public Collection<Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Collection<Object> collectionValues = super.values();
        int i4 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return collectionValues;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r5 = onWarmupCompleted((java.lang.String) r5);
        r1 = o.createAudienceNetworkRemoteService.onExtraCallbackWithResult + 123;
        o.createAudienceNetworkRemoteService.onWarmupCompleted = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if ((!(r5 instanceof java.lang.String)) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if ((r5 instanceof java.lang.String) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        return null;
     */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.createAudienceNetworkRemoteService.onWarmupCompleted
            int r1 = r1 + 87
            int r2 = r1 % 128
            o.createAudienceNetworkRemoteService.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1a
            boolean r1 = r5 instanceof java.lang.String
            r3 = 93
            int r3 = r3 / 0
            r1 = r1 ^ 1
            if (r1 == 0) goto L1f
            goto L1e
        L1a:
            boolean r1 = r5 instanceof java.lang.String
            if (r1 != 0) goto L1f
        L1e:
            return r2
        L1f:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r4.onWarmupCompleted(r5)
            int r1 = o.createAudienceNetworkRemoteService.onExtraCallbackWithResult
            int r1 = r1 + 123
            int r3 = r1 % 128
            o.createAudienceNetworkRemoteService.onWarmupCompleted = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L31
            return r5
        L31:
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createAudienceNetworkRemoteService.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.HashMap, java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (obj instanceof String) {
            return onExtraCallbackWithResult((String) obj, obj2);
        }
        int i5 = i3 + 7;
        onExtraCallbackWithResult = i5 % 128;
        return !(i5 % 2 != 0);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = onNavigationEvent();
        int i4 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iOnNavigationEvent;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Collection<Object> values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Collection<Object> collectionOnWarmupCompleted = onWarmupCompleted();
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        return collectionOnWarmupCompleted;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
        return ((Integer) onExtraCallbackWithResult(a.3.onWarmupCompleted(), -889675748, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted3, new Object[]{this}, 889675748)).intValue();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<String, Object>> entrySet() {
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
        return (Set) onExtraCallbackWithResult(a.3.onWarmupCompleted(), 43721660, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted3, new Object[]{this}, -43721659);
    }
}
