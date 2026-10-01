package o;

import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import net.sf.scuba.smartcards.BuildConfig;
import o.TTVideoLandingPageActivityycx;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TTWebsiteActivity2 extends ZipEntry implements TTLandingPageActivity14 {
    static final TTWebsiteActivity2[] onNavigationEvent = new TTWebsiteActivity2[0];
    private onWarmupCompleted IAuthTabCallback;
    private TTVideoLandingPageLink2Activity1 IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private long IAuthTabCallback_Parcel;
    private String access000;
    private int access100;
    private long asBinder;
    private dj11[] asInterface;
    private TTVideoLandingPageLink2Activity6 extraCallback;
    private onNavigationEvent getInterfaceDescriptor;
    private long onExtraCallback;
    private long onExtraCallbackWithResult;
    private boolean onTransact;
    private long onWarmupCompleted;
    private long writeTypedObject;

    public enum onNavigationEvent {
        NAME,
        NAME_WITH_EFS_FLAG,
        UNICODE_EXTRA_FIELD
    }

    public enum onWarmupCompleted {
        COMMENT,
        UNICODE_EXTRA_FIELD
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BEST_EFFORT' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class onExtraCallback implements doInBackground {
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        public static final onExtraCallback BEST_EFFORT;
        public static final onExtraCallback DRACONIC;
        public static final onExtraCallback ONLY_PARSEABLE_LENIENT;
        public static final onExtraCallback ONLY_PARSEABLE_STRICT;
        public static final onExtraCallback STRICT_FOR_KNOW_EXTRA_FIELDS;
        private final TTVideoLandingPageActivityycx.IAuthTabCallback onUnparseableData;

        public static onExtraCallback valueOf(String str) {
            return (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
        }

        public static onExtraCallback[] values() {
            return (onExtraCallback[]) $VALUES.clone();
        }

        static {
            TTVideoLandingPageActivityycx.IAuthTabCallback iAuthTabCallback = TTVideoLandingPageActivityycx.IAuthTabCallback.onWarmupCompleted;
            onExtraCallback onextracallback = new onExtraCallback("BEST_EFFORT", 0, iAuthTabCallback) { // from class: o.TTWebsiteActivity2.onExtraCallback.4
                @Override // o.TTWebsiteActivity2.onExtraCallback, o.doInBackground
                public dj11 fill(dj11 dj11Var, byte[] bArr, int i, int i2, boolean z) {
                    return onExtraCallback.fillAndMakeUnrecognizedOnError(dj11Var, bArr, i, i2, z);
                }
            };
            BEST_EFFORT = onextracallback;
            onExtraCallback onextracallback2 = new onExtraCallback("STRICT_FOR_KNOW_EXTRA_FIELDS", 1, iAuthTabCallback);
            STRICT_FOR_KNOW_EXTRA_FIELDS = onextracallback2;
            TTVideoLandingPageActivityycx.IAuthTabCallback iAuthTabCallback2 = TTVideoLandingPageActivityycx.IAuthTabCallback.onExtraCallbackWithResult;
            onExtraCallback onextracallback3 = new onExtraCallback("ONLY_PARSEABLE_LENIENT", 2, iAuthTabCallback2) { // from class: o.TTWebsiteActivity2.onExtraCallback.1
                @Override // o.TTWebsiteActivity2.onExtraCallback, o.doInBackground
                public dj11 fill(dj11 dj11Var, byte[] bArr, int i, int i2, boolean z) {
                    return onExtraCallback.fillAndMakeUnrecognizedOnError(dj11Var, bArr, i, i2, z);
                }
            };
            ONLY_PARSEABLE_LENIENT = onextracallback3;
            onExtraCallback onextracallback4 = new onExtraCallback("ONLY_PARSEABLE_STRICT", 3, iAuthTabCallback2);
            ONLY_PARSEABLE_STRICT = onextracallback4;
            onExtraCallback onextracallback5 = new onExtraCallback("DRACONIC", 4, TTVideoLandingPageActivityycx.IAuthTabCallback.onNavigationEvent);
            DRACONIC = onextracallback5;
            $VALUES = new onExtraCallback[]{onextracallback, onextracallback2, onextracallback3, onextracallback4, onextracallback5};
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static dj11 fillAndMakeUnrecognizedOnError(dj11 dj11Var, byte[] bArr, int i, int i2, boolean z) {
            try {
                return TTVideoLandingPageActivityycx.onExtraCallbackWithResult(dj11Var, bArr, i, i2, z);
            } catch (ZipException unused) {
                TTVideoLandingPageLink2Activity9 tTVideoLandingPageLink2Activity9 = new TTVideoLandingPageLink2Activity9();
                tTVideoLandingPageLink2Activity9.IAuthTabCallback(dj11Var.onTransact());
                if (z) {
                    tTVideoLandingPageLink2Activity9.onExtraCallback(Arrays.copyOfRange(bArr, i, i2 + i));
                } else {
                    tTVideoLandingPageLink2Activity9.onExtraCallbackWithResult(Arrays.copyOfRange(bArr, i, i2 + i));
                }
                return tTVideoLandingPageLink2Activity9;
            }
        }

        private onExtraCallback(String str, int i, TTVideoLandingPageActivityycx.IAuthTabCallback iAuthTabCallback) {
            this.onUnparseableData = iAuthTabCallback;
        }

        @Override // o.doInBackground
        public dj11 createExtraField(dj4 dj4Var) throws IllegalAccessException, ZipException, InstantiationException {
            return TTVideoLandingPageActivityycx.IAuthTabCallback(dj4Var);
        }

        @Override // o.doInBackground
        public dj11 fill(dj11 dj11Var, byte[] bArr, int i, int i2, boolean z) throws ZipException {
            return TTVideoLandingPageActivityycx.onExtraCallbackWithResult(dj11Var, bArr, i, i2, z);
        }

        @Override // o.TTVideoLandingPageLink2Activity7
        public dj11 onUnparseableExtraField(byte[] bArr, int i, int i2, boolean z, int i3) throws ZipException {
            return this.onUnparseableData.onUnparseableExtraField(bArr, i, i2, z, i3);
        }
    }

    private static boolean ty_(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        return PAGNativeAdLoadCallback.tE_(fileTime) && PAGNativeAdLoadCallback.tE_(fileTime2) && PAGNativeAdLoadCallback.tE_(fileTime3);
    }

    protected TTWebsiteActivity2() {
        this(BuildConfig.FLAVOR);
    }

    public TTWebsiteActivity2(String str) {
        super(str);
        this.access100 = -1;
        this.IAuthTabCallback_Parcel = -1L;
        this.IAuthTabCallbackStubProxy = 0;
        this.IAuthTabCallbackDefault = new TTVideoLandingPageLink2Activity1();
        this.asBinder = -1L;
        this.onExtraCallbackWithResult = -1L;
        this.getInterfaceDescriptor = onNavigationEvent.NAME;
        this.IAuthTabCallback = onWarmupCompleted.COMMENT;
        this.onTransact = false;
        this.writeTypedObject = -1L;
        onWarmupCompleted(str);
    }

    public void onWarmupCompleted(dj11 dj11Var) {
        if (dj11Var instanceof TTVideoLandingPageLink2Activity6) {
            this.extraCallback = (TTVideoLandingPageLink2Activity6) dj11Var;
        } else {
            if (onExtraCallbackWithResult(dj11Var.onTransact()) != null) {
                onExtraCallback(dj11Var.onTransact());
            }
            dj11[] dj11VarArr = this.asInterface;
            int length = dj11VarArr != null ? dj11VarArr.length + 1 : 1;
            dj11[] dj11VarArr2 = new dj11[length];
            this.asInterface = dj11VarArr2;
            dj11VarArr2[0] = dj11Var;
            if (dj11VarArr != null) {
                System.arraycopy(dj11VarArr, 0, dj11VarArr2, 1, length - 1);
            }
        }
        onTransact();
    }

    private void tw_(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        TTWebsiteActivity4 tTWebsiteActivity4 = new TTWebsiteActivity4();
        if (fileTime != null) {
            tTWebsiteActivity4.tv_(fileTime);
        }
        if (fileTime2 != null) {
            tTWebsiteActivity4.tt_(fileTime2);
        }
        if (fileTime3 != null) {
            tTWebsiteActivity4.tu_(fileTime3);
        }
        onExtraCallbackWithResult(tTWebsiteActivity4);
    }

    private void tx_(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        TTWebsiteActivity tTWebsiteActivity = new TTWebsiteActivity();
        if (fileTime != null) {
            tTWebsiteActivity.tn_(fileTime);
        }
        if (fileTime2 != null) {
            tTWebsiteActivity.tl_(fileTime2);
        }
        if (fileTime3 != null) {
            tTWebsiteActivity.tm_(fileTime3);
        }
        onExtraCallbackWithResult(tTWebsiteActivity);
    }

    @Override // java.util.zip.ZipEntry
    public Object clone() {
        TTWebsiteActivity2 tTWebsiteActivity2 = (TTWebsiteActivity2) super.clone();
        tTWebsiteActivity2.onExtraCallback(IAuthTabCallbackStub());
        tTWebsiteActivity2.onWarmupCompleted(onExtraCallbackWithResult());
        tTWebsiteActivity2.onNavigationEvent(getInterfaceDescriptor());
        return tTWebsiteActivity2;
    }

    private dj11[] onNavigationEvent(dj11[] dj11VarArr, int i) {
        return (dj11[]) Arrays.copyOf(dj11VarArr, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TTWebsiteActivity2 tTWebsiteActivity2 = (TTWebsiteActivity2) obj;
            if (!Objects.equals(getName(), tTWebsiteActivity2.getName())) {
                return false;
            }
            String comment = getComment();
            String comment2 = tTWebsiteActivity2.getComment();
            if (comment == null) {
                comment = BuildConfig.FLAVOR;
            }
            if (comment2 == null) {
                comment2 = BuildConfig.FLAVOR;
            }
            if (Objects.equals(getLastModifiedTime(), tTWebsiteActivity2.getLastModifiedTime()) && Objects.equals(getLastAccessTime(), tTWebsiteActivity2.getLastAccessTime()) && Objects.equals(getCreationTime(), tTWebsiteActivity2.getCreationTime()) && comment.equals(comment2) && IAuthTabCallbackStub() == tTWebsiteActivity2.IAuthTabCallbackStub() && asInterface() == tTWebsiteActivity2.asInterface() && onExtraCallbackWithResult() == tTWebsiteActivity2.onExtraCallbackWithResult() && getMethod() == tTWebsiteActivity2.getMethod() && getSize() == tTWebsiteActivity2.getSize() && getCrc() == tTWebsiteActivity2.getCrc() && getCompressedSize() == tTWebsiteActivity2.getCompressedSize() && Arrays.equals(onNavigationEvent(), tTWebsiteActivity2.onNavigationEvent()) && Arrays.equals(asBinder(), tTWebsiteActivity2.asBinder()) && this.asBinder == tTWebsiteActivity2.asBinder && this.onExtraCallbackWithResult == tTWebsiteActivity2.onExtraCallbackWithResult && this.IAuthTabCallbackDefault.equals(tTWebsiteActivity2.IAuthTabCallbackDefault)) {
                return true;
            }
        }
        return false;
    }

    private dj11[] getInterfaceDescriptor() {
        dj11[] dj11VarArr = this.asInterface;
        if (dj11VarArr == null) {
            return access100();
        }
        return this.extraCallback != null ? access000() : dj11VarArr;
    }

    public byte[] onNavigationEvent() {
        return TTVideoLandingPageActivityycx.onNavigationEvent(getInterfaceDescriptor());
    }

    public long onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public long IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public long onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public dj11 onExtraCallbackWithResult(dj4 dj4Var) {
        dj11[] dj11VarArr = this.asInterface;
        if (dj11VarArr == null) {
            return null;
        }
        for (dj11 dj11Var : dj11VarArr) {
            if (dj4Var.equals(dj11Var.onTransact())) {
                return dj11Var;
            }
        }
        return null;
    }

    public TTVideoLandingPageLink2Activity1 onExtraCallback() {
        return this.IAuthTabCallbackDefault;
    }

    public int IAuthTabCallbackStub() {
        return this.IAuthTabCallbackStub;
    }

    public byte[] asBinder() {
        byte[] extra = getExtra();
        return extra != null ? extra : showPrivacyActivity.onExtraCallback;
    }

    public long IAuthTabCallbackDefault() {
        return this.asBinder;
    }

    private dj11[] access000() {
        dj11[] dj11VarArr = this.asInterface;
        dj11[] dj11VarArrOnNavigationEvent = onNavigationEvent(dj11VarArr, dj11VarArr.length + 1);
        dj11VarArrOnNavigationEvent[this.asInterface.length] = this.extraCallback;
        return dj11VarArrOnNavigationEvent;
    }

    @Override // java.util.zip.ZipEntry
    public int getMethod() {
        return this.access100;
    }

    @Override // java.util.zip.ZipEntry
    public String getName() {
        String str = this.access000;
        return str == null ? super.getName() : str;
    }

    public int asInterface() {
        return this.IAuthTabCallbackStubProxy;
    }

    @Override // java.util.zip.ZipEntry
    public long getSize() {
        return this.IAuthTabCallback_Parcel;
    }

    @Override // java.util.zip.ZipEntry
    public long getTime() {
        if (this.onTransact) {
            return getLastModifiedTime().toMillis();
        }
        long j = this.writeTypedObject;
        return j != -1 ? j : super.getTime();
    }

    private dj11[] access100() {
        TTVideoLandingPageLink2Activity6 tTVideoLandingPageLink2Activity6 = this.extraCallback;
        return tTVideoLandingPageLink2Activity6 == null ? TTVideoLandingPageActivityycx.onNavigationEvent : new dj11[]{tTVideoLandingPageLink2Activity6};
    }

    @Override // java.util.zip.ZipEntry
    public int hashCode() {
        return getName().hashCode();
    }

    private void onExtraCallbackWithResult(dj11 dj11Var) {
        if (dj11Var instanceof TTVideoLandingPageLink2Activity6) {
            this.extraCallback = (TTVideoLandingPageLink2Activity6) dj11Var;
            return;
        }
        if (this.asInterface == null) {
            this.asInterface = new dj11[]{dj11Var};
            return;
        }
        if (onExtraCallbackWithResult(dj11Var.onTransact()) != null) {
            onExtraCallback(dj11Var.onTransact());
        }
        dj11[] dj11VarArr = this.asInterface;
        dj11[] dj11VarArrOnNavigationEvent = onNavigationEvent(dj11VarArr, dj11VarArr.length + 1);
        dj11VarArrOnNavigationEvent[dj11VarArrOnNavigationEvent.length - 1] = dj11Var;
        this.asInterface = dj11VarArrOnNavigationEvent;
    }

    private void onExtraCallback(dj4 dj4Var) {
        if (this.asInterface != null) {
            ArrayList arrayList = new ArrayList();
            for (dj11 dj11Var : this.asInterface) {
                if (!dj4Var.equals(dj11Var.onTransact())) {
                    arrayList.add(dj11Var);
                }
            }
            if (this.asInterface.length == arrayList.size()) {
                return;
            }
            this.asInterface = (dj11[]) arrayList.toArray(TTVideoLandingPageActivityycx.onNavigationEvent);
        }
    }

    private void tz_(FileTime fileTime) {
        super.setLastModifiedTime(fileTime);
        this.writeTypedObject = fileTime.toMillis();
        this.onTransact = true;
    }

    @Override // java.util.zip.ZipEntry
    public boolean isDirectory() {
        return getName().endsWith("/");
    }

    private void onExtraCallback(dj11[] dj11VarArr, boolean z) {
        dj11 dj11VarOnExtraCallbackWithResult;
        byte[] bArrOnWarmupCompleted;
        if (this.asInterface == null) {
            onNavigationEvent(dj11VarArr);
            return;
        }
        for (dj11 dj11Var : dj11VarArr) {
            if (dj11Var instanceof TTVideoLandingPageLink2Activity6) {
                dj11VarOnExtraCallbackWithResult = this.extraCallback;
            } else {
                dj11VarOnExtraCallbackWithResult = onExtraCallbackWithResult(dj11Var.onTransact());
            }
            if (dj11VarOnExtraCallbackWithResult == null) {
                onExtraCallbackWithResult(dj11Var);
            } else {
                if (z) {
                    bArrOnWarmupCompleted = dj11Var.onExtraCallbackWithResult();
                } else {
                    bArrOnWarmupCompleted = dj11Var.onWarmupCompleted();
                }
                if (z) {
                    try {
                        dj11VarOnExtraCallbackWithResult.onWarmupCompleted(bArrOnWarmupCompleted, 0, bArrOnWarmupCompleted.length);
                    } catch (ZipException unused) {
                        TTVideoLandingPageLink2Activity9 tTVideoLandingPageLink2Activity9 = new TTVideoLandingPageLink2Activity9();
                        tTVideoLandingPageLink2Activity9.IAuthTabCallback(dj11VarOnExtraCallbackWithResult.onTransact());
                        if (z) {
                            tTVideoLandingPageLink2Activity9.onExtraCallback(bArrOnWarmupCompleted);
                            tTVideoLandingPageLink2Activity9.onExtraCallbackWithResult(dj11VarOnExtraCallbackWithResult.onWarmupCompleted());
                        } else {
                            tTVideoLandingPageLink2Activity9.onExtraCallback(dj11VarOnExtraCallbackWithResult.onExtraCallbackWithResult());
                            tTVideoLandingPageLink2Activity9.onExtraCallbackWithResult(bArrOnWarmupCompleted);
                        }
                        onExtraCallback(dj11VarOnExtraCallbackWithResult.onTransact());
                        onExtraCallbackWithResult(tTVideoLandingPageLink2Activity9);
                    }
                } else {
                    dj11VarOnExtraCallbackWithResult.onExtraCallback(bArrOnWarmupCompleted, 0, bArrOnWarmupCompleted.length);
                }
            }
        }
        onTransact();
    }

    private boolean IAuthTabCallback_Parcel() {
        if (getLastAccessTime() == null && getCreationTime() == null) {
            return this.onTransact;
        }
        return true;
    }

    @Override // java.util.zip.ZipEntry
    public ZipEntry setCreationTime(FileTime fileTime) {
        super.setCreationTime(fileTime);
        IAuthTabCallbackStubProxy();
        return this;
    }

    protected void onExtraCallback(long j) {
        this.onExtraCallbackWithResult = j;
    }

    public void onWarmupCompleted(long j) {
        this.onWarmupCompleted = j;
    }

    protected void onTransact() {
        super.setExtra(TTVideoLandingPageActivityycx.onExtraCallbackWithResult(getInterfaceDescriptor()));
        extraCallbackWithResult();
    }

    @Override // java.util.zip.ZipEntry
    public void setExtra(byte[] bArr) throws RuntimeException {
        try {
            onExtraCallback(TTVideoLandingPageActivityycx.onNavigationEvent(bArr, true, onExtraCallback.BEST_EFFORT), true);
        } catch (ZipException e) {
            throw new IllegalArgumentException("Error parsing extra fields for entry: " + getName() + " - " + e.getMessage(), e);
        }
    }

    public void onNavigationEvent(dj11[] dj11VarArr) {
        this.extraCallback = null;
        ArrayList arrayList = new ArrayList();
        if (dj11VarArr != null) {
            for (dj11 dj11Var : dj11VarArr) {
                if (dj11Var instanceof TTVideoLandingPageLink2Activity6) {
                    this.extraCallback = (TTVideoLandingPageLink2Activity6) dj11Var;
                } else {
                    arrayList.add(dj11Var);
                }
            }
        }
        this.asInterface = (dj11[]) arrayList.toArray(TTVideoLandingPageActivityycx.onNavigationEvent);
        onTransact();
    }

    private void IAuthTabCallbackStubProxy() {
        dj4 dj4Var = TTWebsiteActivity4.onWarmupCompleted;
        if (onExtraCallbackWithResult(dj4Var) != null) {
            onExtraCallback(dj4Var);
        }
        dj4 dj4Var2 = TTWebsiteActivity.onNavigationEvent;
        if (onExtraCallbackWithResult(dj4Var2) != null) {
            onExtraCallback(dj4Var2);
        }
        if (IAuthTabCallback_Parcel()) {
            FileTime lastModifiedTime = getLastModifiedTime();
            FileTime lastAccessTime = getLastAccessTime();
            FileTime creationTime = getCreationTime();
            if (ty_(lastModifiedTime, lastAccessTime, creationTime)) {
                tw_(lastModifiedTime, lastAccessTime, creationTime);
            }
            tx_(lastModifiedTime, lastAccessTime, creationTime);
        }
        onTransact();
    }

    public void onExtraCallback(int i) {
        this.IAuthTabCallbackStub = i;
    }

    @Override // java.util.zip.ZipEntry
    public ZipEntry setLastAccessTime(FileTime fileTime) {
        super.setLastAccessTime(fileTime);
        IAuthTabCallbackStubProxy();
        return this;
    }

    @Override // java.util.zip.ZipEntry
    public ZipEntry setLastModifiedTime(FileTime fileTime) {
        tz_(fileTime);
        IAuthTabCallbackStubProxy();
        return this;
    }

    @Override // java.util.zip.ZipEntry
    public void setMethod(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("ZIP compression method can not be negative: " + i);
        }
        this.access100 = i;
    }

    protected void onWarmupCompleted(String str) {
        if (str != null && asInterface() == 0 && !str.contains("/")) {
            str = str.replace('\\', '/');
        }
        this.access000 = str;
    }

    @Override // java.util.zip.ZipEntry
    public void setSize(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Invalid entry size");
        }
        this.IAuthTabCallback_Parcel = j;
    }

    @Override // java.util.zip.ZipEntry
    public void setTime(long j) {
        if (dj5.IAuthTabCallback(j)) {
            super.setTime(j);
            this.writeTypedObject = j;
            this.onTransact = false;
            IAuthTabCallbackStubProxy();
            return;
        }
        setLastModifiedTime(FileTime.fromMillis(j));
    }

    private void extraCallbackWithResult() {
        writeTypedObject();
        readTypedObject();
    }

    private void writeTypedObject() {
        FileTime fileTimeTr_;
        FileTime fileTimeTq_;
        FileTime fileTimeTs_;
        dj11 dj11VarOnExtraCallbackWithResult = onExtraCallbackWithResult(TTWebsiteActivity4.onWarmupCompleted);
        if (dj11VarOnExtraCallbackWithResult instanceof TTWebsiteActivity4) {
            TTWebsiteActivity4 tTWebsiteActivity4 = (TTWebsiteActivity4) dj11VarOnExtraCallbackWithResult;
            if (tTWebsiteActivity4.IAuthTabCallback_Parcel() && (fileTimeTs_ = tTWebsiteActivity4.ts_()) != null) {
                tz_(fileTimeTs_);
            }
            if (tTWebsiteActivity4.getInterfaceDescriptor() && (fileTimeTq_ = tTWebsiteActivity4.tq_()) != null) {
                super.setLastAccessTime(fileTimeTq_);
            }
            if (!tTWebsiteActivity4.IAuthTabCallbackStubProxy() || (fileTimeTr_ = tTWebsiteActivity4.tr_()) == null) {
                return;
            }
            super.setCreationTime(fileTimeTr_);
        }
    }

    private void readTypedObject() {
        dj11 dj11VarOnExtraCallbackWithResult = onExtraCallbackWithResult(TTWebsiteActivity.onNavigationEvent);
        if (dj11VarOnExtraCallbackWithResult instanceof TTWebsiteActivity) {
            TTWebsiteActivity tTWebsiteActivity = (TTWebsiteActivity) dj11VarOnExtraCallbackWithResult;
            FileTime fileTimeTk_ = tTWebsiteActivity.tk_();
            if (fileTimeTk_ != null) {
                tz_(fileTimeTk_);
            }
            FileTime fileTimeTi_ = tTWebsiteActivity.ti_();
            if (fileTimeTi_ != null) {
                super.setLastAccessTime(fileTimeTi_);
            }
            FileTime fileTimeTj_ = tTWebsiteActivity.tj_();
            if (fileTimeTj_ != null) {
                super.setCreationTime(fileTimeTj_);
            }
        }
    }
}
