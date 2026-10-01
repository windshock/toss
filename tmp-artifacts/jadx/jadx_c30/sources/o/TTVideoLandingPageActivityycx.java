package o;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTVideoLandingPageActivityycx {
    private static final Map<dj4, Class<?>> onExtraCallbackWithResult = new ConcurrentHashMap();
    static final dj11[] onNavigationEvent;

    public static final class IAuthTabCallback implements TTVideoLandingPageLink2Activity7 {
        private final int onExtraCallback;
        public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback(0);
        public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback(1);
        public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback(2);

        private IAuthTabCallback(int i) {
            this.onExtraCallback = i;
        }

        @Override // o.TTVideoLandingPageLink2Activity7
        public dj11 onUnparseableExtraField(byte[] bArr, int i, int i2, boolean z, int i3) throws ZipException {
            int i4 = this.onExtraCallback;
            if (i4 == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bad extra field starting at ");
                sb.append(i);
                sb.append(".  Block length of ");
                sb.append(i3);
                sb.append(" bytes exceeds remaining data of ");
                sb.append(i2 - 4);
                sb.append(" bytes.");
                throw new ZipException(sb.toString());
            }
            if (i4 == 1) {
                return null;
            }
            if (i4 == 2) {
                TTVideoLandingPageLink2Activity6 tTVideoLandingPageLink2Activity6 = new TTVideoLandingPageLink2Activity6();
                if (z) {
                    tTVideoLandingPageLink2Activity6.onWarmupCompleted(bArr, i, i2);
                    return tTVideoLandingPageLink2Activity6;
                }
                tTVideoLandingPageLink2Activity6.onExtraCallback(bArr, i, i2);
                return tTVideoLandingPageLink2Activity6;
            }
            throw new ZipException("Unknown UnparseableExtraField key: " + this.onExtraCallback);
        }
    }

    static {
        onExtraCallbackWithResult((Class<?>) TTVideoLandingPageActivity6.class);
        onExtraCallbackWithResult((Class<?>) TTWebsiteActivity4.class);
        onExtraCallbackWithResult((Class<?>) TTWebsiteActivity131.class);
        onExtraCallbackWithResult((Class<?>) TTVideoLandingPageLink2Activity.class);
        onExtraCallbackWithResult((Class<?>) TTVideoLandingPageLink2Activity4.class);
        onExtraCallbackWithResult((Class<?>) TTVideoLandingPageLink2Activity3.class);
        onExtraCallbackWithResult((Class<?>) TTWebsiteActivity5.class);
        onExtraCallbackWithResult((Class<?>) TTWebsiteActivity.class);
        onExtraCallbackWithResult((Class<?>) TTWebsiteActivity1.class);
        onExtraCallbackWithResult((Class<?>) TTWebsiteActivity13.class);
        onExtraCallbackWithResult((Class<?>) TTWebsiteActivity11.class);
        onExtraCallbackWithResult((Class<?>) TTWebsiteActivity12.class);
        onExtraCallbackWithResult((Class<?>) TTWebsiteActivity10.class);
        onExtraCallbackWithResult((Class<?>) ResourceAlignmentExtraField.class);
        onNavigationEvent = new dj11[0];
    }

    public static dj11 IAuthTabCallback(dj4 dj4Var) throws IllegalAccessException, InstantiationException {
        dj11 dj11VarOnExtraCallbackWithResult = onExtraCallbackWithResult(dj4Var);
        if (dj11VarOnExtraCallbackWithResult != null) {
            return dj11VarOnExtraCallbackWithResult;
        }
        TTVideoLandingPageLink2Activity9 tTVideoLandingPageLink2Activity9 = new TTVideoLandingPageLink2Activity9();
        tTVideoLandingPageLink2Activity9.IAuthTabCallback(dj4Var);
        return tTVideoLandingPageLink2Activity9;
    }

    public static dj11 onExtraCallbackWithResult(dj4 dj4Var) throws IllegalAccessException, InstantiationException {
        Class<?> cls = onExtraCallbackWithResult.get(dj4Var);
        if (cls != null) {
            return (dj11) cls.newInstance();
        }
        return null;
    }

    public static dj11 onExtraCallbackWithResult(dj11 dj11Var, byte[] bArr, int i, int i2, boolean z) throws ZipException {
        try {
            if (z) {
                dj11Var.onWarmupCompleted(bArr, i, i2);
                return dj11Var;
            }
            dj11Var.onExtraCallback(bArr, i, i2);
            return dj11Var;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ((ZipException) new ZipException("Failed to parse corrupt ZIP extra field of type " + Integer.toHexString(dj11Var.onTransact().onNavigationEvent())).initCause(e));
        }
    }

    public static byte[] onNavigationEvent(dj11[] dj11VarArr) {
        byte[] bArrOnWarmupCompleted;
        int length = dj11VarArr.length;
        boolean z = length > 0 && (dj11VarArr[length + (-1)] instanceof TTVideoLandingPageLink2Activity6);
        int i = z ? length - 1 : length;
        int iOnNavigationEvent = i << 2;
        for (dj11 dj11Var : dj11VarArr) {
            iOnNavigationEvent += dj11Var.IAuthTabCallback().onNavigationEvent();
        }
        byte[] bArr = new byte[iOnNavigationEvent];
        int length2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            System.arraycopy(dj11VarArr[i2].onTransact().onExtraCallback(), 0, bArr, length2, 2);
            System.arraycopy(dj11VarArr[i2].IAuthTabCallback().onExtraCallback(), 0, bArr, length2 + 2, 2);
            length2 += 4;
            byte[] bArrOnWarmupCompleted2 = dj11VarArr[i2].onWarmupCompleted();
            if (bArrOnWarmupCompleted2 != null) {
                System.arraycopy(bArrOnWarmupCompleted2, 0, bArr, length2, bArrOnWarmupCompleted2.length);
                length2 += bArrOnWarmupCompleted2.length;
            }
        }
        if (z && (bArrOnWarmupCompleted = dj11VarArr[length - 1].onWarmupCompleted()) != null) {
            System.arraycopy(bArrOnWarmupCompleted, 0, bArr, length2, bArrOnWarmupCompleted.length);
        }
        return bArr;
    }

    public static byte[] onExtraCallbackWithResult(dj11[] dj11VarArr) {
        byte[] bArrOnExtraCallbackWithResult;
        int length = dj11VarArr.length;
        boolean z = length > 0 && (dj11VarArr[length + (-1)] instanceof TTVideoLandingPageLink2Activity6);
        int i = z ? length - 1 : length;
        int iOnNavigationEvent = i << 2;
        for (dj11 dj11Var : dj11VarArr) {
            iOnNavigationEvent += dj11Var.onExtraCallback().onNavigationEvent();
        }
        byte[] bArr = new byte[iOnNavigationEvent];
        int length2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            System.arraycopy(dj11VarArr[i2].onTransact().onExtraCallback(), 0, bArr, length2, 2);
            System.arraycopy(dj11VarArr[i2].onExtraCallback().onExtraCallback(), 0, bArr, length2 + 2, 2);
            length2 += 4;
            byte[] bArrOnExtraCallbackWithResult2 = dj11VarArr[i2].onExtraCallbackWithResult();
            if (bArrOnExtraCallbackWithResult2 != null) {
                System.arraycopy(bArrOnExtraCallbackWithResult2, 0, bArr, length2, bArrOnExtraCallbackWithResult2.length);
                length2 += bArrOnExtraCallbackWithResult2.length;
            }
        }
        if (z && (bArrOnExtraCallbackWithResult = dj11VarArr[length - 1].onExtraCallbackWithResult()) != null) {
            System.arraycopy(bArrOnExtraCallbackWithResult, 0, bArr, length2, bArrOnExtraCallbackWithResult.length);
        }
        return bArr;
    }

    public static dj11[] onNavigationEvent(byte[] bArr, boolean z, doInBackground doinbackground) throws ZipException {
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i > length - 4) {
                break;
            }
            dj4 dj4Var = new dj4(bArr, i);
            int iOnNavigationEvent = new dj4(bArr, i + 2).onNavigationEvent();
            int i2 = i + 4;
            if (i2 + iOnNavigationEvent > length) {
                dj11 dj11VarOnUnparseableExtraField = doinbackground.onUnparseableExtraField(bArr, i, length - i, z, iOnNavigationEvent);
                if (dj11VarOnUnparseableExtraField != null) {
                    arrayList.add(dj11VarOnUnparseableExtraField);
                }
            } else {
                try {
                    dj11 dj11VarCreateExtraField = doinbackground.createExtraField(dj4Var);
                    Objects.requireNonNull(dj11VarCreateExtraField, "createExtraField must not return null");
                    dj11 dj11Var = dj11VarCreateExtraField;
                    dj11 dj11VarFill = doinbackground.fill(dj11VarCreateExtraField, bArr, i2, iOnNavigationEvent, z);
                    Objects.requireNonNull(dj11VarFill, "fill must not return null");
                    arrayList.add(dj11VarFill);
                    i += iOnNavigationEvent + 4;
                } catch (IllegalAccessException | InstantiationException e) {
                    throw ((ZipException) new ZipException(e.getMessage()).initCause(e));
                }
            }
        }
        return (dj11[]) arrayList.toArray(onNavigationEvent);
    }

    public static void onExtraCallbackWithResult(Class<?> cls) {
        try {
            onExtraCallbackWithResult.put(((dj11) cls.newInstance()).onTransact(), cls);
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException(cls + " doesn't implement ZipExtraField");
        } catch (IllegalAccessException unused2) {
            throw new IllegalArgumentException(cls + "'s no-arg constructor is not public");
        } catch (InstantiationException unused3) {
            throw new IllegalArgumentException(cls + " is not a concrete class");
        }
    }
}
