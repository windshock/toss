package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import im.toss.features.edoc.register.AptPasswordActivity$;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class formatToParts implements Parcelable, NativeKeyboardObserverSpec {
    private static int IAuthTabCallback = 0;
    public static final String TYPE_CASH = "CASH";
    public static final String TYPE_DUTCH = "DUTCH";
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private double amount;
    private NativeVibrationSpec banner;
    private String brand;
    private String category;
    private String categorySmall;
    private final toLocaleLowerCase content;
    private String description;
    private getSkeleonSymbol displayStatus;
    private String foreignValue;
    private boolean hidden;
    private boolean highlight;
    private String imageUrl;
    private boolean isAvailableDefaultClick;
    private boolean isConnected;
    private boolean isMultiSelection;
    private boolean isSelected;
    private boolean isSelfTransaction;
    private String itemId;
    private String itemParentId;
    private ArrayList<NativeVibrationSpec> links;
    private Integer lottieRepeatCount;
    private String lottieUrl;
    private String memo;
    private final String mergedId;
    private String methodType;
    private String originValue;
    private long paidAmount;
    private long phoneTransferSenderNo;
    private final long revisedAmount;
    private String scheme;
    private String searchKey;
    private long senderUserNo;
    private ArrayList<String> sourceIds;
    private getSkeleonSymbol status;
    private String summary;
    private String time;
    private String title;
    private getFormatWidth transactionType;
    private String type;
    private String useStore;
    private String useStoreClean;
    private String value;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<formatToParts> CREATOR = new onNavigationEvent();

    public static final class onNavigationEvent implements Parcelable.Creator<formatToParts> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final formatToParts[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 113;
            onNavigationEvent = i3 % 128;
            formatToParts[] formattopartsArr = new formatToParts[i];
            if (i3 % 2 == 0) {
                return formattopartsArr;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ formatToParts createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(parcel);
            }
            onExtraCallbackWithResult(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ formatToParts[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 17;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            formatToParts[] formattopartsArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = IAuthTabCallback + 79;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return formattopartsArrIAuthTabCallback;
        }

        public final formatToParts onExtraCallbackWithResult(Parcel parcel) {
            getSkeleonSymbol getskeleonsymbolValueOf;
            Integer num;
            boolean z;
            boolean z2;
            boolean z3;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = onNavigationEvent + 109;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                getskeleonsymbolValueOf = null;
            } else {
                getskeleonsymbolValueOf = getSkeleonSymbol.valueOf(parcel.readString());
            }
            double d = parcel.readDouble();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = IAuthTabCallback + 33;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                num = null;
            } else {
                Integer numValueOf = Integer.valueOf(parcel.readInt());
                int i6 = onNavigationEvent + 97;
                num = numValueOf;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 / 5;
                }
            }
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            long j3 = parcel.readLong();
            if (parcel.readInt() != 0) {
                int i8 = onNavigationEvent + 57;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                int i10 = onNavigationEvent + 67;
                z2 = z;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                z3 = false;
            } else {
                z2 = z;
                z3 = true;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string18 = parcel.readString();
            long j4 = parcel.readLong();
            int i12 = parcel.readInt();
            boolean z4 = z3;
            ArrayList arrayList = new ArrayList(i12);
            int i13 = 0;
            while (i13 != i12) {
                int i14 = i12;
                int i15 = onNavigationEvent + 45;
                String str = string5;
                IAuthTabCallback = i15 % 128;
                if (i15 % 2 == 0) {
                    arrayList.add(NativeVibrationSpec.CREATOR.createFromParcel(parcel));
                    i13 += 30;
                } else {
                    arrayList.add(NativeVibrationSpec.CREATOR.createFromParcel(parcel));
                    i13++;
                }
                string5 = str;
                i12 = i14;
            }
            return new formatToParts(string, string2, string3, getskeleonsymbolValueOf, d, j, j2, string4, string5, string6, string7, string8, num, string9, string10, string11, string12, string13, string14, string15, string16, string17, j3, z2, z4, arrayListCreateStringArrayList, string18, j4, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : getFormatWidth.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : NativeVibrationSpec.CREATOR.createFromParcel(parcel), parcel.readString(), getSkeleonSymbol.valueOf(parcel.readString()), parcel.readInt() != 0, (toLocaleLowerCase) parcel.readParcelable(formatToParts.class.getClassLoader()), parcel.readString());
        }
    }

    static {
        int i = onExtraCallback + 63;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public formatToParts() {
        this(null, null, null, null, 0.0d, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, false, false, null, null, 0L, null, null, null, null, false, null, null, null, false, null, null, -1, 127, null);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 71;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = ~(i7 | i8 | i4);
        int i10 = ~i4;
        int i11 = i9 | (~(i7 | i10 | i5));
        int i12 = (~(i4 | i8)) | i7 | (~(i10 | i5));
        int i13 = i2 + i5 + i + (1112421973 * i3) + ((-1897213938) * i6);
        int i14 = i13 * i13;
        int i15 = ((1216318437 * i2) - 781189120) + ((-1395624931) * i5) + (i11 * (-1305971684)) + ((-1305971684) * i8) + (1305971684 * i12) + ((-89653248) * i) + ((-1446510592) * i3) + (892338176 * i6) + ((-1657864192) * i14);
        int i16 = (i2 * 2010092721) + 1217064380 + (i5 * 2010090761) + (i11 * (-980)) + (i8 * (-980)) + (i12 * 980) + (i * 2010091741) + (i3 * (-1378896031)) + (i6 * 856652822) + (i14 * 563281920);
        switch (i15 + (i16 * i16 * (-1077346304))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return asBinder(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0168, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.sourceIds, r9.sourceIds) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x016a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0173, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.scheme, r9.scheme) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0175, code lost:
    
        r9 = o.formatToParts.onNavigationEvent + 51;
        o.formatToParts.IAuthTabCallback = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x017e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0186, code lost:
    
        if (r8.phoneTransferSenderNo == r9.phoneTransferSenderNo) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0188, code lost:
    
        r9 = o.formatToParts.IAuthTabCallback + 33;
        o.formatToParts.onNavigationEvent = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0191, code lost:
    
        if ((r9 % 2) == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r9 instanceof o.formatToParts) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0193, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0194, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x019d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.links, r9.links) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x019f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01a8, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.methodType, r9.methodType) != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01aa, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01af, code lost:
    
        if (r8.transactionType == r9.transactionType) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01b1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01ba, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.foreignValue, r9.foreignValue) != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01bc, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01c1, code lost:
    
        if (r8.hidden == r9.hidden) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01c3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01cc, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.banner, r9.banner) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01ce, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r9 = (o.formatToParts) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01d7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.searchKey, r9.searchKey) != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01d9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01de, code lost:
    
        if (r8.displayStatus == r9.displayStatus) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01e0, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01e5, code lost:
    
        if (r8.highlight == r9.highlight) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01e7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.itemId, r9.itemId) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01f0, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.content, r9.content) != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01f2, code lost:
    
        r9 = o.formatToParts.onNavigationEvent + 103;
        o.formatToParts.IAuthTabCallback = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01fb, code lost:
    
        if ((r9 % 2) != 0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01fd, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01fe, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0208, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r8.mergedId, r9.mergedId)) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x020a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x020b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r9 = o.formatToParts.onNavigationEvent + 119;
        o.formatToParts.IAuthTabCallback = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if ((r9 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.itemParentId, r9.itemParentId) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.type, r9.type) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r8.status == r9.status) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (java.lang.Double.compare(r8.amount, r9.amount) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        r9 = o.formatToParts.onNavigationEvent + 5;
        o.formatToParts.IAuthTabCallback = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (r8.paidAmount == r9.paidAmount) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        if (r8.revisedAmount == r9.revisedAmount) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0079, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.title, r9.title) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
    
        r9 = o.formatToParts.IAuthTabCallback + 71;
        o.formatToParts.onNavigationEvent = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.value, r9.value) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0098, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a1, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.originValue, r9.originValue) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ac, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.imageUrl, r9.imageUrl) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ae, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.lottieUrl, r9.lottieUrl) == true) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.lottieRepeatCount, r9.lottieRepeatCount) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cd, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.brand, r9.brand) != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:
    
        r9 = o.formatToParts.IAuthTabCallback + 5;
        o.formatToParts.onNavigationEvent = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d8, code lost:
    
        if ((r9 % 2) != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00da, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00db, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e4, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.category, r9.category) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e6, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ef, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.categorySmall, r9.categorySmall) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fa, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.useStore, r9.useStore) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fc, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0105, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.useStoreClean, r9.useStoreClean) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0107, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0110, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.summary, r9.summary) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0112, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.description, r9.description) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x011d, code lost:
    
        r9 = o.formatToParts.onNavigationEvent + 67;
        o.formatToParts.IAuthTabCallback = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0126, code lost:
    
        if ((r9 % 2) == 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0128, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0129, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0132, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.time, r9.time) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0134, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x013d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.memo, r9.memo) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x013f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0146, code lost:
    
        if (r8.senderUserNo == r9.senderUserNo) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0148, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x014d, code lost:
    
        if (r8.isConnected == r9.isConnected) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x014f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0154, code lost:
    
        if (r8.isSelfTransaction == r9.isSelfTransaction) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0156, code lost:
    
        r9 = o.formatToParts.onNavigationEvent + 117;
        o.formatToParts.IAuthTabCallback = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x015f, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.formatToParts.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i;
        int i2;
        int i3;
        int iHashCode3;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 97;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        int iHashCode4 = this.itemId.hashCode();
        int iHashCode5 = this.itemParentId.hashCode();
        int iHashCode6 = this.type.hashCode();
        getSkeleonSymbol getskeleonsymbol = this.status;
        if (getskeleonsymbol == null) {
            int i7 = IAuthTabCallback + 25;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            iHashCode = 0;
        } else {
            iHashCode = getskeleonsymbol.hashCode();
        }
        int iHashCode7 = Double.hashCode(this.amount);
        int iHashCode8 = Long.hashCode(this.paidAmount);
        int iHashCode9 = Long.hashCode(this.revisedAmount);
        int iHashCode10 = this.title.hashCode();
        int iHashCode11 = this.value.hashCode();
        int iHashCode12 = this.originValue.hashCode();
        int iHashCode13 = this.imageUrl.hashCode();
        int iHashCode14 = this.lottieUrl.hashCode();
        Integer num = this.lottieRepeatCount;
        if (num == null) {
            int i9 = IAuthTabCallback + 23;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = num.hashCode();
        }
        int iHashCode15 = this.brand.hashCode();
        int iHashCode16 = this.category.hashCode();
        int iHashCode17 = this.categorySmall.hashCode();
        int iHashCode18 = this.useStore.hashCode();
        int iHashCode19 = this.useStoreClean.hashCode();
        int iHashCode20 = this.summary.hashCode();
        int iHashCode21 = this.description.hashCode();
        int iHashCode22 = this.time.hashCode();
        int iHashCode23 = this.memo.hashCode();
        int iHashCode24 = Long.hashCode(this.senderUserNo);
        int iHashCode25 = Boolean.hashCode(this.isConnected);
        int iHashCode26 = Boolean.hashCode(this.isSelfTransaction);
        int iHashCode27 = this.sourceIds.hashCode();
        int iHashCode28 = this.scheme.hashCode();
        int iHashCode29 = Long.hashCode(this.phoneTransferSenderNo);
        int iHashCode30 = this.links.hashCode();
        int iHashCode31 = this.methodType.hashCode();
        getFormatWidth getformatwidth = this.transactionType;
        if (getformatwidth == null) {
            i = iHashCode29;
            i2 = 0;
        } else {
            int iHashCode32 = getformatwidth.hashCode();
            int i11 = onNavigationEvent + 13;
            i = iHashCode29;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            i2 = iHashCode32;
        }
        int iHashCode33 = this.foreignValue.hashCode();
        int iHashCode34 = Boolean.hashCode(this.hidden);
        NativeVibrationSpec nativeVibrationSpec = this.banner;
        if (nativeVibrationSpec == null) {
            int i13 = IAuthTabCallback + 103;
            i3 = i2;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            iHashCode3 = 0;
        } else {
            i3 = i2;
            iHashCode3 = nativeVibrationSpec.hashCode();
        }
        int iHashCode35 = this.searchKey.hashCode();
        int iHashCode36 = this.displayStatus.hashCode();
        int iHashCode37 = Boolean.hashCode(this.highlight);
        toLocaleLowerCase tolocalelowercase = this.content;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode2) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + i) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + i3) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode3) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + (tolocalelowercase != null ? tolocalelowercase.hashCode() : 0)) * 31) + this.mergedId.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Transaction(itemId=" + this.itemId + ", itemParentId=" + this.itemParentId + ", type=" + this.type + ", status=" + this.status + ", amount=" + this.amount + ", paidAmount=" + this.paidAmount + ", revisedAmount=" + this.revisedAmount + ", title=" + this.title + ", value=" + this.value + ", originValue=" + this.originValue + ", imageUrl=" + this.imageUrl + ", lottieUrl=" + this.lottieUrl + ", lottieRepeatCount=" + this.lottieRepeatCount + ", brand=" + this.brand + ", category=" + this.category + ", categorySmall=" + this.categorySmall + ", useStore=" + this.useStore + ", useStoreClean=" + this.useStoreClean + ", summary=" + this.summary + ", description=" + this.description + ", time=" + this.time + ", memo=" + this.memo + ", senderUserNo=" + this.senderUserNo + ", isConnected=" + this.isConnected + ", isSelfTransaction=" + this.isSelfTransaction + ", sourceIds=" + this.sourceIds + ", scheme=" + this.scheme + ", phoneTransferSenderNo=" + this.phoneTransferSenderNo + ", links=" + this.links + ", methodType=" + this.methodType + ", transactionType=" + this.transactionType + ", foreignValue=" + this.foreignValue + ", hidden=" + this.hidden + ", banner=" + this.banner + ", searchKey=" + this.searchKey + ", displayStatus=" + this.displayStatus + ", highlight=" + this.highlight + ", content=" + this.content + ", mergedId=" + this.mergedId + ")";
        int i2 = IAuthTabCallback + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 45 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 109;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.itemId);
        parcel.writeString(this.itemParentId);
        parcel.writeString(this.type);
        getSkeleonSymbol getskeleonsymbol = this.status;
        if (getskeleonsymbol == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(getskeleonsymbol.name());
        }
        parcel.writeDouble(this.amount);
        parcel.writeLong(this.paidAmount);
        parcel.writeLong(this.revisedAmount);
        parcel.writeString(this.title);
        parcel.writeString(this.value);
        parcel.writeString(this.originValue);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.lottieUrl);
        Integer num = this.lottieRepeatCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.brand);
        parcel.writeString(this.category);
        parcel.writeString(this.categorySmall);
        parcel.writeString(this.useStore);
        parcel.writeString(this.useStoreClean);
        parcel.writeString(this.summary);
        parcel.writeString(this.description);
        parcel.writeString(this.time);
        parcel.writeString(this.memo);
        parcel.writeLong(this.senderUserNo);
        parcel.writeInt(this.isConnected ? 1 : 0);
        parcel.writeInt(this.isSelfTransaction ? 1 : 0);
        parcel.writeStringList(this.sourceIds);
        parcel.writeString(this.scheme);
        parcel.writeLong(this.phoneTransferSenderNo);
        ArrayList<NativeVibrationSpec> arrayList = this.links;
        parcel.writeInt(arrayList.size());
        Iterator<NativeVibrationSpec> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.methodType);
        getFormatWidth getformatwidth = this.transactionType;
        if (getformatwidth == null) {
            parcel.writeInt(0);
            int i5 = onNavigationEvent + 75;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            parcel.writeInt(1);
            parcel.writeString(getformatwidth.name());
        }
        parcel.writeString(this.foreignValue);
        parcel.writeInt(this.hidden ? 1 : 0);
        NativeVibrationSpec nativeVibrationSpec = this.banner;
        if (nativeVibrationSpec == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nativeVibrationSpec.writeToParcel(parcel, i);
        }
        parcel.writeString(this.searchKey);
        parcel.writeString(this.displayStatus.name());
        parcel.writeInt(this.highlight ? 1 : 0);
        parcel.writeParcelable(this.content, i);
        parcel.writeString(this.mergedId);
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration $this_palette;

        public IAuthTabCallback(Configuration configuration) {
            this.$this_palette = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.$this_palette)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i4 = onExtraCallback + 67;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return getspecialfeatureoptinstatus;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i6 = onNavigationEvent + 85;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 10 / 0;
            }
            return getspecialfeatureoptinstatus2;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration $this_palette;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.$this_palette = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.$this_palette)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = IAuthTabCallback + 107;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.$this_palette);
            throw null;
        }
    }

    public formatToParts(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable getSkeleonSymbol getskeleonsymbol, double d, long j, long j2, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @Nullable Integer num, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, long j3, boolean z, boolean z2, @NotNull ArrayList<String> arrayList, @NotNull String str18, long j4, @NotNull ArrayList<NativeVibrationSpec> arrayList2, @NotNull String str19, @Nullable getFormatWidth getformatwidth, @NotNull String str20, boolean z3, @Nullable NativeVibrationSpec nativeVibrationSpec, @NotNull String str21, @NotNull getSkeleonSymbol getskeleonsymbol2, boolean z4, @Nullable toLocaleLowerCase tolocalelowercase, @NotNull String str22) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(getskeleonsymbol2, "");
        Intrinsics.checkNotNullParameter(str22, "");
        this.itemId = str;
        this.itemParentId = str2;
        this.type = str3;
        this.status = getskeleonsymbol;
        this.amount = d;
        this.paidAmount = j;
        this.revisedAmount = j2;
        this.title = str4;
        this.value = str5;
        this.originValue = str6;
        this.imageUrl = str7;
        this.lottieUrl = str8;
        this.lottieRepeatCount = num;
        this.brand = str9;
        this.category = str10;
        this.categorySmall = str11;
        this.useStore = str12;
        this.useStoreClean = str13;
        this.summary = str14;
        this.description = str15;
        this.time = str16;
        this.memo = str17;
        this.senderUserNo = j3;
        this.isConnected = z;
        this.isSelfTransaction = z2;
        this.sourceIds = arrayList;
        this.scheme = str18;
        this.phoneTransferSenderNo = j4;
        this.links = arrayList2;
        this.methodType = str19;
        this.transactionType = getformatwidth;
        this.foreignValue = str20;
        this.hidden = z3;
        this.banner = nativeVibrationSpec;
        this.searchKey = str21;
        this.displayStatus = getskeleonsymbol2;
        this.highlight = z4;
        this.content = tolocalelowercase;
        this.mergedId = str22;
        this.isAvailableDefaultClick = true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ formatToParts(String str, String str2, String str3, getSkeleonSymbol getskeleonsymbol, double d, long j, long j2, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, long j3, boolean z, boolean z2, ArrayList arrayList, String str18, long j4, ArrayList arrayList2, String str19, getFormatWidth getformatwidth, String str20, boolean z3, NativeVibrationSpec nativeVibrationSpec, String str21, getSkeleonSymbol getskeleonsymbol2, boolean z4, toLocaleLowerCase tolocalelowercase, String str22, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str23;
        long j5;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        String str35;
        ArrayList arrayList3;
        String str36;
        String str37;
        String str38;
        getFormatWidth getformatwidth2;
        int i3;
        boolean z5;
        String str39;
        String str40;
        String str41;
        String str42 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i4 = onNavigationEvent + 57;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            str23 = "";
        } else {
            str23 = str2;
        }
        String str43 = (i & 4) != 0 ? "" : str3;
        getSkeleonSymbol getskeleonsymbol3 = (i & 8) != 0 ? getSkeleonSymbol.NORMAL : getskeleonsymbol;
        double d2 = (i & 16) != 0 ? 0.0d : d;
        long j6 = (i & 32) != 0 ? 0L : j;
        if ((i & 64) != 0) {
            int i6 = 2 % 2;
            j5 = 0;
        } else {
            j5 = j2;
        }
        String str44 = (i & 128) != 0 ? "" : str4;
        String str45 = (i & 256) != 0 ? "" : str5;
        String str46 = (i & 512) != 0 ? "" : str6;
        String str47 = (i & 1024) != 0 ? "" : str7;
        str24 = "";
        String str48 = (i & 2048) != 0 ? str24 : str8;
        boolean z6 = false;
        Integer num2 = (i & 4096) != 0 ? 0 : num;
        if ((i & 8192) != 0) {
            int i7 = IAuthTabCallback + 39;
            str25 = str47;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            str26 = str24;
        } else {
            str25 = str47;
            str26 = str9;
        }
        String str49 = (i & 16384) != 0 ? str24 : str10;
        String str50 = (i & 32768) != 0 ? str24 : str11;
        if ((i & 65536) != 0) {
            str28 = str49;
            int i9 = IAuthTabCallback + 7;
            str27 = str26;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            str29 = str24;
        } else {
            str27 = str26;
            str28 = str49;
            str29 = str12;
        }
        if ((131072 & i) != 0) {
            int i11 = IAuthTabCallback + 89;
            str30 = str29;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            int i12 = 2 % 2;
            str31 = str24;
        } else {
            str30 = str29;
            str31 = str13;
        }
        if ((262144 & i) != 0) {
            int i13 = onNavigationEvent + 87;
            str32 = str31;
            IAuthTabCallback = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 30 / 0;
            }
            str33 = str24;
        } else {
            str32 = str31;
            str33 = str14;
        }
        String str51 = (524288 & i) != 0 ? str24 : str15;
        String str52 = (i & 1048576) != 0 ? str24 : str16;
        String str53 = (i & 2097152) != 0 ? str24 : str17;
        long j7 = (i & 4194304) != 0 ? 0L : j3;
        boolean z7 = true;
        boolean z8 = (i & 8388608) != 0 ? true : z;
        if ((i & 16777216) != 0) {
            str35 = str51;
            int i15 = onNavigationEvent + 19;
            str34 = str33;
            IAuthTabCallback = i15 % 128;
            if (i15 % 2 != 0) {
                z7 = false;
            }
        } else {
            str34 = str33;
            str35 = str51;
            z7 = z2;
        }
        ArrayList arrayList4 = (33554432 & i) != 0 ? new ArrayList() : arrayList;
        String str54 = (67108864 & i) != 0 ? str24 : str18;
        long j8 = (i & 134217728) != 0 ? 0L : j4;
        ArrayList arrayList5 = (i & 268435456) != 0 ? new ArrayList() : arrayList2;
        if ((i & 536870912) != 0) {
            str36 = str54;
            int i16 = onNavigationEvent + 59;
            arrayList3 = arrayList4;
            IAuthTabCallback = i16 % 128;
            if (i16 % 2 != 0) {
                throw null;
            }
            str37 = str24;
        } else {
            arrayList3 = arrayList4;
            str36 = str54;
            str37 = str19;
        }
        if ((1073741824 & i) != 0) {
            int i17 = onNavigationEvent + 93;
            str38 = str37;
            IAuthTabCallback = i17 % 128;
            if (i17 % 2 != 0) {
                getFormatWidth getformatwidth3 = getFormatWidth.NONE;
                throw null;
            }
            getformatwidth2 = getFormatWidth.NONE;
        } else {
            str38 = str37;
            getformatwidth2 = getformatwidth;
        }
        String str55 = (i & Integer.MIN_VALUE) != 0 ? str24 : str20;
        if ((i2 & 1) != 0) {
            i3 = 2;
            int i18 = 2 % 2;
            z5 = false;
        } else {
            i3 = 2;
            z5 = z3;
        }
        NativeVibrationSpec nativeVibrationSpec2 = (i2 & 2) != 0 ? null : nativeVibrationSpec;
        if ((i2 & 4) != 0) {
            int i19 = i3 % i3;
            str39 = str24;
        } else {
            str39 = str21;
        }
        getSkeleonSymbol getskeleonsymbol4 = (i2 & 8) != 0 ? getSkeleonSymbol.NORMAL : getskeleonsymbol2;
        if ((i2 & 16) != 0) {
            str41 = str39;
            int i20 = IAuthTabCallback + 121;
            str40 = str55;
            onNavigationEvent = i20 % 128;
            int i21 = i20 % 2;
        } else {
            str40 = str55;
            str41 = str39;
            z6 = z4;
        }
        this(str42, str23, str43, getskeleonsymbol3, d2, j6, j5, str44, str45, str46, str25, str48, num2, str27, str28, str50, str30, str32, str34, str35, str52, str53, j7, z8, z7, arrayList3, str36, j8, arrayList5, str38, getformatwidth2, str40, z5, nativeVibrationSpec2, str41, getskeleonsymbol4, z6, (i2 & 32) == 0 ? tolocalelowercase : null, (i2 & 64) == 0 ? str22 : "");
    }

    @Override // o.NativeKeyboardObserverSpec
    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.itemId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String writeTypedObject() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 119;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.itemParentId;
        int i5 = i2 + 57;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String mayLaunchUrl() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            str = this.type;
            int i4 = 47 / 0;
        } else {
            str = this.type;
        }
        int i5 = i3 + 95;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 99 / 0;
        }
        return str;
    }

    public final getSkeleonSymbol ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getSkeleonSymbol getskeleonsymbol = this.status;
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        return getskeleonsymbol;
    }

    public final double onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        double d = this.amount;
        int i5 = i2 + 71;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return d;
    }

    public final long onActivityResized() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.paidAmount;
        }
        int i3 = 50 / 0;
        return this.paidAmount;
    }

    public final long onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        long j = this.revisedAmount;
        if (i4 == 0) {
            int i5 = 2 / 0;
        }
        int i6 = i3 + 63;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 51 / 0;
        }
        return j;
    }

    public final String ICustomTabsService() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.title;
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        return str;
    }

    public final String isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.value;
        }
        throw null;
    }

    public final String onMinimized() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.originValue;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        formatToParts formattoparts = (formatToParts) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = formattoparts.imageUrl;
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String extraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.lottieUrl;
        int i5 = i3 + 107;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer readTypedObject() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.lottieRepeatCount;
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        return num;
    }

    public final String asInterface() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            str = this.brand;
            int i4 = 81 / 0;
        } else {
            str = this.brand;
        }
        int i5 = i3 + 47;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.category;
        int i5 = i2 + 95;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
        return str;
    }

    public final String extraCommand() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.useStore;
        int i5 = i3 + 47;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        formatToParts formattoparts = (formatToParts) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = formattoparts.description;
        if (i3 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onUnminimized() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.time;
        }
        throw null;
    }

    public final String extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.memo;
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        return str;
    }

    public final long ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 109;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.senderUserNo;
        int i4 = i2 + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return j;
    }

    public final boolean newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 7;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.isConnected;
        int i4 = i2 + 109;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final ArrayList<String> ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        ArrayList<String> arrayList = this.sourceIds;
        int i5 = i3 + 61;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    public final ArrayList<NativeVibrationSpec> ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.links;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        formatToParts formattoparts = (formatToParts) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = formattoparts.methodType;
        if (i4 == 0) {
            int i5 = 46 / 0;
        }
        int i6 = i3 + 1;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final getFormatWidth ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 21;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getFormatWidth getformatwidth = this.transactionType;
        int i4 = i2 + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return getformatwidth;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.foreignValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean access100() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 79;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.hidden;
        int i5 = i2 + 33;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final NativeVibrationSpec onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        NativeVibrationSpec nativeVibrationSpec = this.banner;
        int i5 = i2 + 7;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return nativeVibrationSpec;
    }

    public final String onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.searchKey;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.highlight;
        int i5 = i3 + 45;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final toLocaleLowerCase asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        toLocaleLowerCase tolocalelowercase = this.content;
        int i5 = i3 + 45;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return tolocalelowercase;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onActivityLayout() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.mergedId;
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        return str;
    }

    @Override // o.NativeKeyboardObserverSpec
    public long IAuthTabCallback() {
        int i = 2 % 2;
        long jHashCode = (this.type + ":" + this.itemParentId + ":" + onWarmupCompleted()).hashCode();
        int i2 = IAuthTabCallback + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return jHashCode;
        }
        throw null;
    }

    public final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        this.isMultiSelection = z;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 119;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean setEngagementSignalsCallback() {
        boolean z;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 3;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.isMultiSelection;
            int i4 = 20 / 0;
        } else {
            z = this.isMultiSelection;
        }
        int i5 = i2 + 101;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 113;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        this.isSelected = z;
        if (i4 == 0) {
            int i5 = 55 / 0;
        }
        int i6 = i2 + 1;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 16 / 0;
        }
    }

    public final boolean requestPostMessageChannel() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.isSelected;
        int i5 = i3 + 61;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        this.isAvailableDefaultClick = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 21;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean newSession() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 11;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isAvailableDefaultClick;
        int i5 = i2 + 63;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Object obj;
        formatToParts formattoparts = (formatToParts) objArr[0];
        Resources resources = (Resources) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(resources, "");
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(formattoparts.onExtraCallback(resources, true));
            int i2 = onNavigationEvent + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        CharSequence charSequenceOnExtraCallback = formattoparts.onExtraCallback(resources, false);
        if (!(!Result.onExtraCallback(obj))) {
            int i4 = onNavigationEvent + 19;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            obj = charSequenceOnExtraCallback;
        }
        return (CharSequence) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.text.Spanned] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.String] */
    private final CharSequence onExtraCallback(Resources resources, boolean z) {
        int i;
        String str;
        int i2 = 2 % 2;
        int length = -1;
        if (this.originValue.length() > 0) {
            str = this.originValue + " ";
            i = 0;
        } else {
            int i3 = IAuthTabCallback + 7;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            i = -1;
            str = "";
        }
        String str2 = str + this.value;
        ?? OnNavigationEvent = str2;
        if (this.foreignValue.length() > 0) {
            length = str2.length() + 1;
            OnNavigationEvent = str2 + " " + this.foreignValue;
        }
        if (z) {
            OnNavigationEvent = BrickModulesListExternalSyntheticLambda0.onNavigationEvent((String) OnNavigationEvent, false, 1, (Object) null);
        }
        SpannableString spannableString = new SpannableString(OnNavigationEvent);
        if (prefetch()) {
            spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            int i5 = IAuthTabCallback + 91;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        } else if (i >= 0) {
            spannableString.setSpan(new StrikethroughSpan(), i, this.originValue.length() + i, 33);
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            spannableString.setSpan(new ForegroundColorSpan(new getUrlokhttp(new onExtraCallbackWithResult(configuration)).onActivityLayout()), i, this.originValue.length() + i, 33);
        }
        if (length >= 0) {
            Configuration configuration2 = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            spannableString.setSpan(new ForegroundColorSpan(new getUrlokhttp(new IAuthTabCallback(configuration2)).onActivityLayout()), length, this.foreignValue.length() + length, 33);
        }
        int i7 = IAuthTabCallback + 35;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 41 / 0;
        }
        return spannableString;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        formatToParts formattoparts = (formatToParts) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (formattoparts.prefetch()) {
            int i2 = onNavigationEvent + 7;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                String string = context.getString(R.string.app_home_transaction_detail_title_content_description_canceled, formattoparts.value);
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
            int i3 = R.string.app_home_transaction_detail_title_content_description_canceled;
            Object[] objArr2 = new Object[0];
            objArr2[1] = formattoparts.value;
            String string2 = context.getString(i3, objArr2);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }
        if (formattoparts.originValue.length() <= 0) {
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
            String string3 = ((CharSequence) onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 308134300, new Object[]{formattoparts, resources}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, -308134296, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted())).toString();
            int i4 = onNavigationEvent + 15;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return string3;
        }
        int i6 = onNavigationEvent + 25;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            String string4 = context.getString(R.string.app_home_transaction_detail_title_content_description_has_origin_value, formattoparts.originValue, formattoparts.value);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            return string4;
        }
        int i7 = R.string.app_home_transaction_detail_title_content_description_has_origin_value;
        String str = formattoparts.originValue;
        String str2 = formattoparts.value;
        Object[] objArr3 = new Object[4];
        objArr3[0] = str;
        objArr3[1] = str2;
        String string5 = context.getString(i7, objArr3);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        return string5;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d A[PHI: r2 r4 r5 r7 r8 r9
      0x004d: PHI (r2v8 java.lang.String) = (r2v4 java.lang.String), (r2v9 java.lang.String) binds: [B:8:0x0037, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x004d: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:8:0x0037, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x004d: PHI (r5v3 double) = (r5v0 double), (r5v4 double) binds: [B:8:0x0037, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x004d: PHI (r7v3 java.lang.String) = (r7v0 java.lang.String), (r7v4 java.lang.String) binds: [B:8:0x0037, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x004d: PHI (r8v3 java.lang.String) = (r8v0 java.lang.String), (r8v4 java.lang.String) binds: [B:8:0x0037, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x004d: PHI (r9v3 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String) binds: [B:8:0x0037, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[PHI: r2 r4 r5 r7 r8 r9 r10
      0x0039: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v9 java.lang.String) binds: [B:8:0x0037, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0039: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:8:0x0037, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0039: PHI (r5v1 double) = (r5v0 double), (r5v4 double) binds: [B:8:0x0037, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0039: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v4 java.lang.String) binds: [B:8:0x0037, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0039: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v4 java.lang.String) binds: [B:8:0x0037, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0039: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String) binds: [B:8:0x0037, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0039: PHI (r10v1 o.toLocaleLowerCase) = (r10v0 o.toLocaleLowerCase), (r10v4 o.toLocaleLowerCase) binds: [B:8:0x0037, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onTransact(java.lang.Object[] r12) {
        /*
            r0 = 0
            r12 = r12[r0]
            o.formatToParts r12 = (o.formatToParts) r12
            r1 = 2
            int r2 = r1 % r1
            int r2 = o.formatToParts.onNavigationEvent
            int r2 = r2 + 125
            int r3 = r2 % 128
            o.formatToParts.IAuthTabCallback = r3
            int r2 = r2 % r1
            java.lang.String r3 = "|"
            if (r2 == 0) goto L29
            java.lang.String r2 = r12.brand
            java.lang.String r4 = r12.useStore
            double r5 = r12.amount
            java.lang.String r7 = r12.title
            java.lang.String r8 = r12.description
            java.lang.String r9 = r12.memo
            o.toLocaleLowerCase r10 = r12.content
            r11 = 82
            int r11 = r11 / r0
            if (r10 == 0) goto L4d
            goto L39
        L29:
            java.lang.String r2 = r12.brand
            java.lang.String r4 = r12.useStore
            double r5 = r12.amount
            java.lang.String r7 = r12.title
            java.lang.String r8 = r12.description
            java.lang.String r9 = r12.memo
            o.toLocaleLowerCase r10 = r12.content
            if (r10 == 0) goto L4d
        L39:
            java.lang.String r0 = r10.onWarmupCompleted()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            goto L4f
        L4d:
            java.lang.String r0 = ""
        L4f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            r10.append(r3)
            r10.append(r4)
            r10.append(r3)
            r10.append(r5)
            r10.append(r3)
            r10.append(r7)
            r10.append(r3)
            r10.append(r8)
            r10.append(r3)
            r10.append(r9)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            r12.searchKey = r0
            o.getSkeleonSymbol r0 = r12.status
            if (r0 != 0) goto L8d
            int r0 = o.formatToParts.IAuthTabCallback
            int r0 = r0 + 15
            int r2 = r0 % 128
            o.formatToParts.onNavigationEvent = r2
            int r0 = r0 % r1
            o.getSkeleonSymbol r0 = o.getSkeleonSymbol.NORMAL
        L8d:
            r12.displayStatus = r0
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.formatToParts.onTransact(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        formatToParts formattoparts = (formatToParts) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsNormal = formattoparts.displayStatus.isNormal();
        int i4 = IAuthTabCallback + 25;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zIsNormal);
        }
        throw null;
    }

    public final boolean prefetchWithMultipleUrls() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsExcluded = this.displayStatus.isExcluded();
        int i4 = IAuthTabCallback + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsExcluded;
        }
        throw null;
    }

    public final boolean prefetch() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsCanceled = this.displayStatus.isCanceled();
        int i4 = onNavigationEvent + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zIsCanceled;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        if (((Boolean) onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -584992246, new Object[]{this}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, 584992252, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted())).booleanValue() || prefetchWithMultipleUrls()) {
            return true;
        }
        int i4 = onNavigationEvent;
        int i5 = i4 + 29;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 115;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public final boolean newAuthTabSession() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zAreEqual = Intrinsics.areEqual(this.type, TYPE_DUTCH);
        int i4 = IAuthTabCallback + 113;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return zAreEqual;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Object next;
        String strOnExtraCallback;
        int i = 2 % 2;
        Iterator<T> it = ((formatToParts) objArr[0]).links.iterator();
        int i2 = onNavigationEvent + 95;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 5;
        }
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i4 = IAuthTabCallback + 55;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                next = it.next();
                int i5 = 1 / 0;
                if (((NativeVibrationSpec) next).asInterface() == showWithGravityAndOffset.DEFAULT) {
                    break;
                }
            } else {
                next = it.next();
                if (((NativeVibrationSpec) next).asInterface() == showWithGravityAndOffset.DEFAULT) {
                    break;
                }
            }
        }
        NativeVibrationSpec nativeVibrationSpec = (NativeVibrationSpec) next;
        if (nativeVibrationSpec != null && (strOnExtraCallback = nativeVibrationSpec.onExtraCallback()) != null) {
            int i6 = IAuthTabCallback + 83;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (StringsKt.contains$default(strOnExtraCallback, "reward", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final boolean validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (!newAuthTabSession()) {
            int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
            if (!((Boolean) onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1841005198, new Object[]{this}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, -1841005197, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted())).booleanValue()) {
                return true;
            }
        }
        int i4 = IAuthTabCallback + 91;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        formatToParts formattoparts = (formatToParts) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            formattoparts.newAuthTabSession();
            obj.hashCode();
            throw null;
        }
        if (!formattoparts.newAuthTabSession()) {
            int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
            if (((Boolean) onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -584992246, new Object[]{formattoparts}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, 584992252, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted())).booleanValue()) {
                int i3 = onNavigationEvent + 121;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                double d = formattoparts.amount;
                if (i4 == 0 ? d < 0.0d : d < 1.0d) {
                    return true;
                }
            }
        }
        int i5 = onNavigationEvent + 39;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final NativeVibrationSpec IAuthTabCallbackStub() {
        Object next;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.links.iterator();
            obj.hashCode();
            throw null;
        }
        Iterator<T> it = this.links.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            NativeVibrationSpec nativeVibrationSpec = (NativeVibrationSpec) next;
            if (nativeVibrationSpec.asInterface() == showWithGravityAndOffset.POSITIVE) {
                break;
            }
            int i3 = IAuthTabCallback + 91;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (nativeVibrationSpec.asInterface() == showWithGravityAndOffset.NEGATIVE) {
                break;
            }
        }
        NativeVibrationSpec nativeVibrationSpec2 = (NativeVibrationSpec) next;
        int i5 = onNavigationEvent + 71;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return nativeVibrationSpec2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    public final NativeVibrationSpec onTransact() {
        NativeVibrationSpec nativeVibrationSpec;
        ?? next;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Iterator it = this.links.iterator();
        while (!(!it.hasNext())) {
            int i4 = onNavigationEvent + 91;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                next = it.next();
                int i5 = 10 / 0;
                if (((NativeVibrationSpec) next).asInterface() == showWithGravityAndOffset.DEFAULT) {
                    nativeVibrationSpec = next;
                    break;
                }
            } else {
                next = it.next();
                if (((NativeVibrationSpec) next).asInterface() == showWithGravityAndOffset.DEFAULT) {
                    nativeVibrationSpec = next;
                    break;
                }
            }
        }
        nativeVibrationSpec = null;
        return nativeVibrationSpec;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return ((Integer) onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1327006875, new Object[]{this}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, 1327006878, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted())).intValue();
    }

    public final CharSequence onExtraCallback(@NotNull Resources resources) {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return (CharSequence) onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 308134300, new Object[]{this, resources}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, -308134296, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
    }

    public final String access000() {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return (String) onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1286342047, new Object[]{this}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, 1286342049, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
    }

    public final String IAuthTabCallback_Parcel() {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return (String) onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1318563469, new Object[]{this}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, 1318563469, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
    }

    public final String onPostMessage() {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return (String) onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1598685175, new Object[]{this}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, 1598685182, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
    }

    public final boolean postMessage() {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return ((Boolean) onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1844439562, new Object[]{this}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, -1844439557, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted())).booleanValue();
    }

    public final boolean requestPostMessageChannelWithExtras() {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return ((Boolean) onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -584992246, new Object[]{this}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, 584992252, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted())).booleanValue();
    }

    public final boolean receiveFile() {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return ((Boolean) onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1841005198, new Object[]{this}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, -1841005197, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted())).booleanValue();
    }

    public final String onNavigationEvent(@NotNull Context context) {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return (String) onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -884344756, new Object[]{this, context}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, 884344765, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
    }

    public final void updateVisuals() {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1450698653, new Object[]{this}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, -1450698645, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
    }
}
