package o;

import android.content.Context;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.json.JsonObject;
import o.ComputeLandmarkConfidence;
import o.Deinitialize;
import o.wie2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class ComputeLandmarkConfidence<T extends Deinitialize> {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access000 = 0;
    private static int access100 = 0;
    private static int getInterfaceDescriptor = 1;
    private final int IAuthTabCallback;
    private final Set<File> IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final File asBinder;
    private final ExtractFeature asInterface;
    private final AppSetIdAndScope1 onExtraCallback;
    private final Comparator<File> onExtraCallbackWithResult;
    private final File onTransact;
    private final Lock onWarmupCompleted;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static final Comparator<File> onNavigationEvent = new Comparator() { // from class: im.toss.core.tracker.LogFileStore$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallback = ComputeLandmarkConfidence.IAuthTabCallback((File) obj, (File) obj2);
            int i4 = onExtraCallback + 67;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iIAuthTabCallback;
        }
    };

    public static /* synthetic */ int IAuthTabCallback(File file, File file2) {
        int i = 2 % 2;
        int i2 = access100 + 93;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(file, file2);
        }
        onNavigationEvent(file, file2);
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i6) | i);
        int i8 = ~i3;
        int i9 = i7 | (~(i8 | i));
        int i10 = ~i;
        int i11 = ~(i10 | i8);
        int i12 = ~(i10 | i6);
        int i13 = (~(i8 | i6)) | i11 | i12;
        int i14 = (~(i3 | i10)) | i12;
        int i15 = i6 + i + i4 + (1039959776 * i5) + ((-2046201414) * i2);
        int i16 = i15 * i15;
        int i17 = ((357140864 * i6) - 8388608) + ((-1785926397) * i) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i4) + ((-201326592) * i5) + ((-406847488) * i2) + (529399808 * i16);
        int i18 = ((i6 * 868240256) - 1765242424) + (i * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (i4 * 868239597) + (i5 * 817356128) + (i2 * 406493490) + (i16 * 645267456);
        int i19 = i17 + (i18 * i18 * 681705472);
        return i19 != 1 ? i19 != 2 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
    }

    public ComputeLandmarkConfidence(@NotNull Context context, @NotNull String str, int i, @NotNull Comparator<File> comparator, @NotNull File file, @Nullable ExtractFeature extractFeature) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        Intrinsics.checkNotNullParameter(file, "");
        this.IAuthTabCallbackStub = str;
        this.IAuthTabCallback = i;
        this.onExtraCallbackWithResult = comparator;
        this.asInterface = extractFeature;
        this.onTransact = new File(file, str);
        this.asBinder = new File(file, "quarantine");
        AppSetIdAndScope1 appSetIdAndScope1OnExtraCallbackWithResult = ea10.onExtraCallbackWithResult("LogFileStore");
        Intrinsics.checkNotNullExpressionValue(appSetIdAndScope1OnExtraCallbackWithResult, "");
        this.onExtraCallback = appSetIdAndScope1OnExtraCallbackWithResult;
        this.onWarmupCompleted = new ReentrantLock();
        this.IAuthTabCallbackDefault = new ConcurrentSkipListSet();
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 103;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackStub;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ComputeLandmarkConfidence(Context context, String str, int i, Comparator comparator, File file, ExtractFeature extractFeature, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Comparator comparator2;
        File fileOnExtraCallback;
        ExtractFeature extractFeature2;
        if ((i2 & 8) != 0) {
            int i3 = 2 % 2;
            comparator2 = onNavigationEvent;
        } else {
            comparator2 = comparator;
        }
        if ((i2 & 16) != 0) {
            int i4 = getInterfaceDescriptor + 67;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                onWarmupCompleted onwarmupcompleted = Companion;
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                onwarmupcompleted.onExtraCallback(applicationContext);
                throw null;
            }
            onWarmupCompleted onwarmupcompleted2 = Companion;
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
            fileOnExtraCallback = onwarmupcompleted2.onExtraCallback(applicationContext2);
        } else {
            fileOnExtraCallback = file;
        }
        if ((i2 & 32) != 0) {
            int i5 = getInterfaceDescriptor + 75;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            extractFeature2 = null;
        } else {
            extractFeature2 = extractFeature;
        }
        this(context, str, i, comparator2, fileOnExtraCallback, extractFeature2);
    }

    public static final class onWarmupCompleted {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final File onExtraCallback(@NotNull Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            File file = new File(context.getFilesDir(), "logstore");
            int i2 = onExtraCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return file;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = IAuthTabCallbackStubProxy + 89;
        access000 = i % 128;
        if (i % 2 != 0) {
            int i2 = 81 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r5 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r5 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int onNavigationEvent(File file, File file2) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 63;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        if (file == null) {
            int i5 = i2 + 85;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 74 / 0;
            }
        }
        if (file == null) {
            int i7 = access100 + 121;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            return 1;
        }
        if (file2 == null) {
            return -1;
        }
        String name = file.getName();
        String name2 = file2.getName();
        Intrinsics.checkNotNull(name2);
        return name.compareTo(name2);
    }

    public final boolean onExtraCallbackWithResult() {
        boolean zDelete;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        access100 = i2 % 128;
        try {
        } catch (Throwable unused) {
            this.onWarmupCompleted.unlock();
            zDelete = false;
        }
        if (i2 % 2 == 0) {
            this.onWarmupCompleted.lock();
            zDelete = this.onTransact.delete();
            this.onWarmupCompleted.unlock();
            int i3 = access100 + 101;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            return zDelete;
        }
        this.onWarmupCompleted.lock();
        this.onTransact.delete();
        this.onWarmupCompleted.unlock();
        throw null;
    }

    private final boolean onTransact() throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 19;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            if (!this.onTransact.isDirectory() || !this.onTransact.exists()) {
                if (this.onTransact.exists()) {
                    Objects.toString(this.onTransact);
                    this.onTransact.delete();
                }
                try {
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, "LogFileStore", "create storeDir:" + this.onTransact, null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                    Objects.toString(this.onTransact);
                    this.onTransact.mkdirs();
                    if (!this.onTransact.exists()) {
                        ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, "LogFileStore", "storeDir not exists after creation:" + this.onTransact, (Throwable) null, (Map) null, 12, (Object) null);
                        int i3 = getInterfaceDescriptor + 25;
                        access100 = i3 % 128;
                        int i4 = i3 % 2;
                    }
                    return this.onTransact.exists();
                } catch (Exception e) {
                    ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "LogFileStore", "failed to create storeDir:" + this.onTransact, e, (Map) null, 8, (Object) null);
                    return false;
                }
            }
            int i5 = getInterfaceDescriptor + 107;
            access100 = i5 % 128;
            return i5 % 2 == 0;
        }
        this.onTransact.isDirectory();
        throw null;
    }

    public final File onExtraCallbackWithResult(@NotNull Deinitialize deinitialize) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(deinitialize, "");
        File file = new File(this.onTransact, deinitialize.onWarmupCompleted());
        int i2 = getInterfaceDescriptor + 93;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return file;
    }

    public final void onNavigationEvent(@NotNull T t) {
        int i = 2 % 2;
        int i2 = access100 + 117;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(t, "");
            onTransact();
            throw null;
        }
        Intrinsics.checkNotNullParameter(t, "");
        if (onTransact()) {
            File fileOnExtraCallbackWithResult = onExtraCallbackWithResult(t);
            this.onWarmupCompleted.lock();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileOnExtraCallbackWithResult);
                try {
                    t.IAuthTabCallback(fileOutputStream);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
                    fileOnExtraCallbackWithResult.getName();
                    int i3 = access100 + 7;
                    getInterfaceDescriptor = i3 % 128;
                    int i4 = i3 % 2;
                } finally {
                    try {
                    } finally {
                        this.onWarmupCompleted.unlock();
                    }
                }
            } catch (Throwable unused) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(String.format("couldn't save unsent payload to disk (%s) ", Arrays.copyOf(new Object[]{fileOnExtraCallbackWithResult.getName()}, 1)), "");
            }
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        ComputeLandmarkConfidence computeLandmarkConfidence = (ComputeLandmarkConfidence) objArr[0];
        String[] strArr = (String[]) objArr[1];
        File file = (File) objArr[2];
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 71;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        if (strArr.length <= computeLandmarkConfidence.IAuthTabCallback) {
            int i5 = i2 + 13;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }
        int length = strArr.length / 2;
        AppSetIdAndScope1 appSetIdAndScope1 = computeLandmarkConfidence.onExtraCallback;
        String str = computeLandmarkConfidence.IAuthTabCallbackStub;
        int length2 = strArr.length;
        int i7 = 0;
        for (String str2 : strArr) {
            if (i7 >= length) {
                break;
            }
            File file2 = new File(file, str2);
            if (file2.isFile()) {
                int i8 = access100 + 79;
                getInterfaceDescriptor = i8 % 128;
                if (i8 % 2 == 0) {
                    computeLandmarkConfidence.IAuthTabCallbackDefault.contains(file2);
                    throw null;
                }
                if (!computeLandmarkConfidence.IAuthTabCallbackDefault.contains(file2)) {
                    computeLandmarkConfidence.IAuthTabCallback(clearFaultAdjacentMetadata.onExtraCallback(file2));
                    i7++;
                    int i9 = access100 + 107;
                    getInterfaceDescriptor = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
        }
        AppSetIdAndScope1 appSetIdAndScope12 = computeLandmarkConfidence.onExtraCallback;
        String str3 = computeLandmarkConfidence.IAuthTabCallbackStub;
        int length3 = strArr.length;
        if (i7 > 0) {
            auth.onNavigationEvent.onExtraCallback("TossTracker-Max-Store-Count-Limit", "purged " + i7 + " log files from " + computeLandmarkConfidence.IAuthTabCallbackStub, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("storeName", computeLandmarkConfidence.IAuthTabCallbackStub), getWrite.IAuthTabCallback("totalFileCount", Integer.valueOf(strArr.length)), getWrite.IAuthTabCallback("maxStoreCount", Integer.valueOf(computeLandmarkConfidence.IAuthTabCallback)), getWrite.IAuthTabCallback("purgedCount", Integer.valueOf(i7))}));
        }
        return Integer.valueOf(i7);
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 71;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        if (!onTransact()) {
            int i4 = getInterfaceDescriptor + 65;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return 0;
        }
        this.onWarmupCompleted.lock();
        try {
            if (this.onTransact.isDirectory()) {
                String[] list = this.onTransact.list();
                if (list == null) {
                    this.onWarmupCompleted.unlock();
                    return 0;
                }
                ArraysKt.sort(list);
                int iIntValue = ((Integer) onWarmupCompleted(1424315861, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[]{this, list, this.onTransact}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1424315859)).intValue();
                this.onWarmupCompleted.unlock();
                return iIntValue;
            }
        } catch (Exception unused) {
            int i6 = access100 + 15;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
        } catch (Throwable th) {
            this.onWarmupCompleted.unlock();
            throw th;
        }
        this.onWarmupCompleted.unlock();
        return 0;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 101;
        access100 = i2 % 128;
        int i3 = 1;
        try {
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.onWarmupCompleted.unlock();
            throw th;
        }
        if (i2 % 2 != 0) {
            this.onWarmupCompleted.lock();
            if (this.onTransact.isDirectory()) {
            }
            this.onWarmupCompleted.unlock();
            return i3;
        }
        this.onWarmupCompleted.lock();
        if (!this.onTransact.isDirectory()) {
            i3 = 0;
        }
        this.onWarmupCompleted.unlock();
        return i3;
        String[] list = this.onTransact.list();
        if (list == null) {
            list = new String[0];
        }
        int i4 = 0;
        for (String str : list) {
            if (new File(this.onTransact, str).isFile()) {
                int i5 = getInterfaceDescriptor + 77;
                access100 = i5 % 128;
                i4 = i5 % 2 != 0 ? 0 : i4 + 1;
            }
        }
        i3 = i4;
        this.onWarmupCompleted.unlock();
        return i3;
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private final int onExtraCallbackWithResult;
        private final List<List<File>> onNavigationEvent;
        private final int onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ onNavigationEvent onExtraCallback(onNavigationEvent onnavigationevent, List list, int i, int i2, int i3, Object obj) {
            int i4 = 2 % 2;
            if ((i3 & 1) != 0) {
                list = onnavigationevent.onNavigationEvent;
            }
            if ((i3 & 2) != 0) {
                int i5 = onExtraCallback + 7;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = onnavigationevent.onWarmupCompleted;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                i = onnavigationevent.onWarmupCompleted;
            }
            if ((i3 & 4) != 0) {
                i2 = onnavigationevent.onExtraCallbackWithResult;
            }
            onNavigationEvent onnavigationeventOnExtraCallback = onnavigationevent.onExtraCallback(list, i, i2);
            int i7 = IAuthTabCallback + 87;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 69 / 0;
            }
            return onnavigationeventOnExtraCallback;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 77;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i4 = IAuthTabCallback + 67;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!Intrinsics.areEqual(this.onNavigationEvent, onnavigationevent.onNavigationEvent)) {
                return false;
            }
            if (this.onWarmupCompleted == onnavigationevent.onWarmupCompleted) {
                return this.onExtraCallbackWithResult == onnavigationevent.onExtraCallbackWithResult;
            }
            int i6 = onExtraCallback + 41;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onExtraCallback = i2 % 128;
            int iHashCode = i2 % 2 == 0 ? (((this.onNavigationEvent.hashCode() % 62) + Integer.hashCode(this.onWarmupCompleted)) - 90) >> Integer.hashCode(this.onExtraCallbackWithResult) : (((this.onNavigationEvent.hashCode() * 31) + Integer.hashCode(this.onWarmupCompleted)) * 31) + Integer.hashCode(this.onExtraCallbackWithResult);
            int i3 = onExtraCallback + 23;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public final onNavigationEvent onExtraCallback(@NotNull List<? extends List<? extends File>> list, int i, int i2) {
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(list, "");
            onNavigationEvent onnavigationevent = new onNavigationEvent(list, i, i2);
            int i4 = onExtraCallback + 83;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "StoreSnapshot(flushBuckets=" + this.onNavigationEvent + ", storedFileCount=" + this.onWarmupCompleted + ", purgedCount=" + this.onExtraCallbackWithResult + ")";
            int i2 = IAuthTabCallback + 93;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 73 / 0;
            }
            return str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public onNavigationEvent(@NotNull List<? extends List<? extends File>> list, int i, int i2) {
            Intrinsics.checkNotNullParameter(list, "");
            this.onNavigationEvent = list;
            this.onWarmupCompleted = i;
            this.onExtraCallbackWithResult = i2;
        }

        public final List<List<File>> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            List<List<File>> list = this.onNavigationEvent;
            int i5 = i3 + 111;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 0;
            }
            return list;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ComputeLandmarkConfidence computeLandmarkConfidence = (ComputeLandmarkConfidence) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        int iIntValue = ((Number) objArr[3]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        Object obj = objArr[6];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStoreSnapshot");
        }
        int i5 = i3 + 5;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0 ? (iIntValue2 & 1) != 0 : (iIntValue2 & 1) != 0) {
            int i6 = i3 + 121;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            jLongValue = 102400;
        }
        if ((iIntValue2 & 2) != 0) {
            jLongValue2 = 10485760;
        }
        if ((iIntValue2 & 4) != 0) {
            int i7 = getInterfaceDescriptor + 125;
            access100 = i7 % 128;
            iIntValue = i7 % 2 != 0 ? 25751 : 500;
        }
        if ((iIntValue2 & 8) != 0) {
            zBooleanValue = false;
        }
        return computeLandmarkConfidence.onNavigationEvent(jLongValue, jLongValue2, iIntValue, zBooleanValue);
    }

    public final onNavigationEvent onNavigationEvent(long j, long j2, int i, boolean z) {
        int length;
        int iIntValue;
        boolean z2;
        int i2 = 2 % 2;
        this.onWarmupCompleted.lock();
        try {
            long j3 = j2 / j;
            ArrayList arrayList = new ArrayList();
            File file = this.onTransact;
            if (file.exists() && file.isDirectory()) {
                int i3 = access100 + 51;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
                String[] list = file.list();
                if (list == null) {
                    list = new String[0];
                }
                length = list.length;
                ArraysKt.sort(list);
                if (z) {
                    int i5 = getInterfaceDescriptor + 97;
                    access100 = i5 % 128;
                    if (i5 % 2 != 0) {
                        iIntValue = ((Integer) onWarmupCompleted(1424315861, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[]{this, list, file}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1424315859)).intValue();
                        int i6 = 63 / 0;
                    } else {
                        iIntValue = ((Integer) onWarmupCompleted(1424315861, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[]{this, list, file}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1424315859)).intValue();
                    }
                } else {
                    iIntValue = 0;
                }
                if (iIntValue > 0) {
                    list = file.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    ArraysKt.sort(list);
                }
                int iMin = Math.min(list.length, i);
                if (list.length > i) {
                    Integer.valueOf(list.length);
                    Integer.valueOf(i);
                }
                ArrayList arrayList2 = new ArrayList();
                long length2 = 0;
                for (int i7 = 0; i7 < iMin; i7++) {
                    File file2 = new File(file, list[i7]);
                    if (file2.isFile()) {
                        int i8 = getInterfaceDescriptor + 119;
                        access100 = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i9 = 48 / 0;
                            if (!this.IAuthTabCallbackDefault.contains(file2)) {
                                arrayList2.add(file2);
                                length2 += file2.length();
                            }
                        } else if (!this.IAuthTabCallbackDefault.contains(file2)) {
                            arrayList2.add(file2);
                            length2 += file2.length();
                        }
                    }
                    if (i7 == iMin - 1) {
                        int i10 = getInterfaceDescriptor + 5;
                        access100 = i10 % 128;
                        int i11 = i10 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((length2 >= j || z2) && !arrayList2.isEmpty()) {
                        this.IAuthTabCallbackDefault.addAll(arrayList2);
                        arrayList.add(arrayList2);
                        arrayList2 = new ArrayList();
                        length2 = 0;
                    }
                    if (arrayList.size() >= j3) {
                        break;
                    }
                }
            } else {
                length = 0;
                iIntValue = 0;
            }
            onNavigationEvent onnavigationevent = new onNavigationEvent(arrayList, length - iIntValue, iIntValue);
            this.onWarmupCompleted.unlock();
            ExtractFeature extractFeature = this.asInterface;
            if (extractFeature == null) {
                return onnavigationevent;
            }
            try {
                return (onNavigationEvent) onWarmupCompleted(-2127645951, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[]{this, onnavigationevent, extractFeature}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 2127645952);
            } catch (Exception e) {
                Iterator<T> it = onnavigationevent.onWarmupCompleted().iterator();
                while (it.hasNext()) {
                    int i12 = getInterfaceDescriptor + 41;
                    access100 = i12 % 128;
                    if (i12 % 2 != 0) {
                        onWarmupCompleted((List) it.next());
                        int i13 = 63 / 0;
                    } else {
                        onWarmupCompleted((List) it.next());
                    }
                }
                throw e;
            }
        } catch (Throwable th) {
            this.onWarmupCompleted.unlock();
            throw th;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Object obj;
        File file;
        File fileOnExtraCallback;
        ComputeLandmarkConfidence computeLandmarkConfidence = (ComputeLandmarkConfidence) objArr[0];
        onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[1];
        ExtractFeature extractFeature = (ExtractFeature) objArr[2];
        int i = 2 % 2;
        Pair<String, String> pairOnNavigationEvent = GetDetectingInterval.Companion.onNavigationEvent(computeLandmarkConfidence.IAuthTabCallbackStub);
        String str = (String) pairOnNavigationEvent.onExtraCallbackWithResult();
        String str2 = (String) pairOnNavigationEvent.IAuthTabCallback();
        ArrayList arrayList = new ArrayList();
        ArrayList<SetMaxDetectableCount> arrayList2 = new ArrayList();
        Iterator it = CollectionsKt.flatten(onnavigationevent.onWarmupCompleted()).iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            File file2 = (File) it.next();
            SetMaxDetectableCount setMaxDetectableCount = new SetMaxDetectableCount(file2, file2.length(), str, str2);
            if (!computeLandmarkConfidence.onNavigationEvent(extractFeature, setMaxDetectableCount)) {
                fileOnExtraCallback = null;
                file = file2;
            } else {
                int i2 = access100 + 47;
                getInterfaceDescriptor = i2 % 128;
                int i3 = i2 % 2;
                file = file2;
                fileOnExtraCallback = computeLandmarkConfidence.onExtraCallback(file);
            }
            if (fileOnExtraCallback != null) {
                arrayList.add(file);
                arrayList2.add(new SetMaxDetectableCount(fileOnExtraCallback, setMaxDetectableCount.onWarmupCompleted(), str, str2));
                int i4 = access100 + 9;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (arrayList.isEmpty()) {
            int i6 = access100 + 41;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 != 0) {
                return onnavigationevent;
            }
            throw null;
        }
        computeLandmarkConfidence.onWarmupCompleted(arrayList);
        for (SetMaxDetectableCount setMaxDetectableCount2 : arrayList2) {
            int i7 = access100 + 109;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
        }
        HashSet hashSet = CollectionsKt.toHashSet(arrayList);
        List<List<File>> listOnWarmupCompleted = onnavigationevent.onWarmupCompleted();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnWarmupCompleted, 10));
        Iterator<T> it2 = listOnWarmupCompleted.iterator();
        while (it2.hasNext()) {
            arrayList3.add(CollectionsKt.minus((List) it2.next(), hashSet));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (!((List) obj2).isEmpty()) {
                int i9 = getInterfaceDescriptor + 67;
                access100 = i9 % 128;
                if (i9 % 2 != 0) {
                    arrayList4.add(obj2);
                    obj.hashCode();
                    throw null;
                }
                arrayList4.add(obj2);
            }
        }
        return onNavigationEvent.onExtraCallback(onnavigationevent, arrayList4, 0, 0, 6, null);
    }

    private final File onExtraCallback(File file) {
        int i = 2 % 2;
        int i2 = access100 + 7;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (!onNavigationEvent()) {
                return null;
            }
            File file2 = new File(this.asBinder, file.getName());
            if (file.renameTo(file2)) {
                int i4 = getInterfaceDescriptor + 11;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                return file2;
            }
            file.getName();
            int i6 = getInterfaceDescriptor + 101;
            access100 = i6 % 128;
            if (i6 % 2 == 0) {
                return null;
            }
            throw null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            new Object[]{this.IAuthTabCallbackStub, file.getName(), e2};
            return null;
        }
    }

    private final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 125;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.asBinder.isDirectory() || this.asBinder.mkdirs() || this.asBinder.isDirectory()) {
                return true;
            }
            int i3 = access100 + 61;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        this.asBinder.isDirectory();
        throw null;
    }

    private final boolean onNavigationEvent(ExtractFeature extractFeature, SetMaxDetectableCount setMaxDetectableCount) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        try {
            boolean zIAuthTabCallback = extractFeature.IAuthTabCallback(setMaxDetectableCount);
            int i4 = getInterfaceDescriptor + 13;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                return zIAuthTabCallback;
            }
            throw null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            new Object[]{this.IAuthTabCallbackStub, setMaxDetectableCount.onExtraCallbackWithResult().getName(), e2};
            return false;
        }
    }

    public final void onWarmupCompleted(@Nullable Collection<? extends File> collection) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.lock();
        if (collection != null) {
            int i4 = access100 + 3;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            try {
                this.IAuthTabCallbackDefault.removeAll(collection);
            } finally {
                this.onWarmupCompleted.unlock();
            }
        }
    }

    public final void IAuthTabCallback(@Nullable Collection<? extends File> collection) {
        int i = 2 % 2;
        this.onWarmupCompleted.lock();
        if (collection != null) {
            try {
                this.IAuthTabCallbackDefault.removeAll(collection);
                Iterator<? extends File> it = collection.iterator();
                while (!(!it.hasNext())) {
                    int i2 = access100 + 27;
                    getInterfaceDescriptor = i2 % 128;
                    int i3 = i2 % 2;
                    File next = it.next();
                    next.getName();
                    if (!next.delete()) {
                        int i4 = getInterfaceDescriptor + 45;
                        access100 = i4 % 128;
                        int i5 = i4 % 2;
                        next.deleteOnExit();
                    }
                }
            } finally {
                this.onWarmupCompleted.unlock();
            }
        }
    }

    public final JsonObject onWarmupCompleted(@NotNull File file) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(file, "");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                wie2.IAuthTabCallback iAuthTabCallback = wie2.Default;
                iAuthTabCallback.onExtraCallback();
                JsonObject jsonObject = (JsonObject) PangleEncryptUtilsType4.onExtraCallback(iAuthTabCallback, JsonObject.Companion.serializer(), fileInputStream);
                CloseableKt.closeFinally(fileInputStream, (Throwable) null);
                return jsonObject;
            } finally {
            }
        } catch (Throwable th) {
            new Object[]{this.IAuthTabCallbackStub, file.getName(), th};
            int i2 = access100 + 51;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
    }

    public String toString() {
        int i = 2 % 2;
        String str = getClass().getSimpleName() + "(dir=" + this.IAuthTabCallbackStub + ")";
        int i2 = getInterfaceDescriptor + 125;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private final int onNavigationEvent(String[] strArr, File file) {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return ((Integer) onWarmupCompleted(1424315861, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[]{this, strArr, file}, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted3, -1424315859)).intValue();
    }

    public static /* synthetic */ onNavigationEvent onWarmupCompleted(ComputeLandmarkConfidence computeLandmarkConfidence, long j, long j2, int i, boolean z, int i2, Object obj) {
        return (onNavigationEvent) onWarmupCompleted(438504145, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[]{computeLandmarkConfidence, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), obj}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -438504145);
    }

    private final onNavigationEvent onExtraCallbackWithResult(onNavigationEvent onnavigationevent, ExtractFeature extractFeature) {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (onNavigationEvent) onWarmupCompleted(-2127645951, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[]{this, onnavigationevent, extractFeature}, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted3, 2127645952);
    }
}
