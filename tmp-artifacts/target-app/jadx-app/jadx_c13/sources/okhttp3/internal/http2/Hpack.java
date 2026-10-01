package okhttp3.internal.http2;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TTAppOpenAdTransActivity;
import o.TTBaseActivity;
import o.TTBaseLandingPageActivity;
import o.TTCeilingLandingPageActivity5;
import o.TTHistoryActivity42;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;
import ua.naiksoftware.stomp.dto.StompHeader;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Hpack {
    private static int IAuthTabCallback = 0;
    public static final Hpack INSTANCE;
    private static final Map<TTBaseLandingPageActivity, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;
    private static int onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static final byte[] $$a = {126, 1, 26, -71};
    private static final int $$b = 251;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, int i) {
        int i2;
        int i3;
        int i4 = (b * 2) + 4;
        int i5 = i + 109;
        int i6 = 1 - (s * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i4++;
            i5 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i4];
            i4++;
            i5 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    private Hpack() {
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Header[] headerArr = STATIC_HEADER_TABLE;
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        return headerArr;
    }

    static {
        IAuthTabCallback = 0;
        onExtraCallback();
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        Header header = new Header(Header.TARGET_AUTHORITY, _UrlKt.FRAGMENT_ENCODE_SET);
        TTBaseLandingPageActivity tTBaseLandingPageActivity = Header.TARGET_METHOD;
        Object[] objArr = new Object[1];
        a((char) (41604 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0)), (-1984603193) - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0'), new char[]{23072, 64979, 34021}, new char[]{0, 0, 0, 0}, new char[]{51226, 46427, 34185, 22178}, objArr);
        Header header2 = new Header(tTBaseLandingPageActivity, ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 59079), Drawable.resolveOpacity(0, 0), new char[]{17411, 14886, 11890, 48002}, new char[]{0, 0, 0, 0}, new char[]{47768, 35953, 50829, 3046}, objArr2);
        Header header3 = new Header(tTBaseLandingPageActivity, ((String) objArr2[0]).intern());
        TTBaseLandingPageActivity tTBaseLandingPageActivity2 = Header.TARGET_PATH;
        Header header4 = new Header(tTBaseLandingPageActivity2, "/");
        Header header5 = new Header(tTBaseLandingPageActivity2, "/index.html");
        TTBaseLandingPageActivity tTBaseLandingPageActivity3 = Header.TARGET_SCHEME;
        Header header6 = new Header(tTBaseLandingPageActivity3, "http");
        Header header7 = new Header(tTBaseLandingPageActivity3, "https");
        TTBaseLandingPageActivity tTBaseLandingPageActivity4 = Header.RESPONSE_STATUS;
        Header header8 = new Header(tTBaseLandingPageActivity4, "200");
        Header header9 = new Header(tTBaseLandingPageActivity4, "204");
        Header header10 = new Header(tTBaseLandingPageActivity4, "206");
        Header header11 = new Header(tTBaseLandingPageActivity4, "304");
        Header header12 = new Header(tTBaseLandingPageActivity4, "400");
        Header header13 = new Header(tTBaseLandingPageActivity4, "404");
        Header header14 = new Header(tTBaseLandingPageActivity4, "500");
        Header header15 = new Header("accept-charset", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header16 = new Header("accept-encoding", "gzip, deflate");
        Header header17 = new Header("accept-language", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header18 = new Header("accept-ranges", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header19 = new Header("accept", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header20 = new Header("access-control-allow-origin", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header21 = new Header("age", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header22 = new Header("allow", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header23 = new Header("authorization", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header24 = new Header("cache-control", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header25 = new Header("content-disposition", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header26 = new Header("content-encoding", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header27 = new Header("content-language", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header28 = new Header("content-length", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header29 = new Header("content-location", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header30 = new Header("content-range", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header31 = new Header(StompHeader.CONTENT_TYPE, _UrlKt.FRAGMENT_ENCODE_SET);
        Header header32 = new Header("cookie", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header33 = new Header("date", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header34 = new Header("etag", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header35 = new Header("expect", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header36 = new Header("expires", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header37 = new Header("from", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header38 = new Header("host", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header39 = new Header("if-match", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header40 = new Header("if-modified-since", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header41 = new Header("if-none-match", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header42 = new Header("if-range", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header43 = new Header("if-unmodified-since", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header44 = new Header("last-modified", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header45 = new Header("link", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header46 = new Header("location", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header47 = new Header("max-forwards", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header48 = new Header("proxy-authenticate", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header49 = new Header("proxy-authorization", _UrlKt.FRAGMENT_ENCODE_SET);
        Header header50 = new Header("range", _UrlKt.FRAGMENT_ENCODE_SET);
        Object[] objArr3 = new Object[1];
        a((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 290820529 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{9049, 16423, 9576, 1810, 57215, 9967, 45157}, new char[]{0, 0, 0, 0}, new char[]{45412, 21905, 55057, 26363}, objArr3);
        STATIC_HEADER_TABLE = new Header[]{header, header2, header3, header4, header5, header6, header7, header8, header9, header10, header11, header12, header13, header14, header15, header16, header17, header18, header19, header20, header21, header22, header23, header24, header25, header26, header27, header28, header29, header30, header31, header32, header33, header34, header35, header36, header37, header38, header39, header40, header41, header42, header43, header44, header45, header46, header47, header48, header49, header50, new Header(((String) objArr3[0]).intern(), _UrlKt.FRAGMENT_ENCODE_SET), new Header("refresh", _UrlKt.FRAGMENT_ENCODE_SET), new Header("retry-after", _UrlKt.FRAGMENT_ENCODE_SET), new Header("server", _UrlKt.FRAGMENT_ENCODE_SET), new Header("set-cookie", _UrlKt.FRAGMENT_ENCODE_SET), new Header("strict-transport-security", _UrlKt.FRAGMENT_ENCODE_SET), new Header("transfer-encoding", _UrlKt.FRAGMENT_ENCODE_SET), new Header("user-agent", _UrlKt.FRAGMENT_ENCODE_SET), new Header("vary", _UrlKt.FRAGMENT_ENCODE_SET), new Header("via", _UrlKt.FRAGMENT_ENCODE_SET), new Header("www-authenticate", _UrlKt.FRAGMENT_ENCODE_SET)};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
        int i = onWarmupCompleted + 69;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 87 / 0;
        }
    }

    public final Map<TTBaseLandingPageActivity, Integer> getNAME_TO_FIRST_INDEX() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Map<TTBaseLandingPageActivity, Integer> map = NAME_TO_FIRST_INDEX;
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        return map;
    }

    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final TTAppOpenAdTransActivity source;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Reader(@NotNull TTHistoryActivity42 tTHistoryActivity42, int i) {
            this(tTHistoryActivity42, i, 0, 4, null);
            Intrinsics.checkNotNullParameter(tTHistoryActivity42, "");
        }

        public Reader(@NotNull TTHistoryActivity42 tTHistoryActivity42, int i, int i2) {
            Intrinsics.checkNotNullParameter(tTHistoryActivity42, "");
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i2;
            this.headerList = new ArrayList();
            this.source = TTCeilingLandingPageActivity5.onExtraCallback(tTHistoryActivity42);
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = 7;
        }

        public /* synthetic */ Reader(TTHistoryActivity42 tTHistoryActivity42, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(tTHistoryActivity42, i, (i3 & 4) != 0 ? i : i2);
        }

        public final List<Header> getAndResetHeaderList() {
            List<Header> list = CollectionsKt___CollectionsKt.toList(this.headerList);
            this.headerList.clear();
            return list;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }

        private final void clearDynamicTable() {
            ArraysKt___ArraysJvmKt.fill$default(this.dynamicTable, (Object) null, 0, 0, 6, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    Intrinsics.checkNotNull(header);
                    int i4 = header.hpackSize;
                    i -= i4;
                    this.dynamicTableByteCount -= i4;
                    this.headerCount--;
                    i3++;
                }
                Header[] headerArr = this.dynamicTable;
                int i5 = i2 + 1;
                System.arraycopy(headerArr, i5, headerArr, i5 + i3, this.headerCount);
                this.nextHeaderIndex += i3;
            }
            return i3;
        }

        public final void readHeaders() throws IOException {
            while (!this.source.IAuthTabCallback_Parcel()) {
                int iAnd = _UtilCommonKt.and(this.source.ICustomTabsCallback(), 255);
                if (iAnd == 128) {
                    throw new IOException("index == 0");
                }
                if ((iAnd & 128) == 128) {
                    readIndexedHeader(readInt(iAnd, 127) - 1);
                } else if (iAnd == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((iAnd & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(iAnd, 63) - 1);
                } else if ((iAnd & 32) == 32) {
                    int i = readInt(iAnd, 31);
                    this.maxDynamicTableByteCount = i;
                    if (i < 0 || i > this.headerTableSizeSetting) {
                        throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    adjustDynamicTableByteCount();
                } else if (iAnd == 16 || iAnd == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(iAnd, 15) - 1);
                }
            }
        }

        private final void readIndexedHeader(int i) throws IOException {
            if (isStaticHeader(i)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i]);
                return;
            }
            int iDynamicTableIndex = dynamicTableIndex(i - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    List<Header> list = this.headerList;
                    Header header = headerArr[iDynamicTableIndex];
                    Intrinsics.checkNotNull(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private final int dynamicTableIndex(int i) {
            return this.nextHeaderIndex + 1 + i;
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i) throws IOException {
            this.headerList.add(new Header(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i) throws IOException {
            insertIntoDynamicTable(-1, new Header(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final TTBaseLandingPageActivity getName(int i) throws IOException {
            if (isStaticHeader(i)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i].name;
            }
            int iDynamicTableIndex = dynamicTableIndex(i - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    Header header = headerArr[iDynamicTableIndex];
                    Intrinsics.checkNotNull(header);
                    return header.name;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private final boolean isStaticHeader(int i) {
            return i >= 0 && i <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final void insertIntoDynamicTable(int i, Header header) {
            this.headerList.add(header);
            int i2 = header.hpackSize;
            if (i != -1) {
                Header header2 = this.dynamicTable[dynamicTableIndex(i)];
                Intrinsics.checkNotNull(header2);
                i2 -= header2.hpackSize;
            }
            int i3 = this.maxDynamicTableByteCount;
            if (i2 > i3) {
                clearDynamicTable();
                return;
            }
            int iEvictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i2) - i3);
            if (i == -1) {
                int i4 = this.headerCount;
                Header[] headerArr = this.dynamicTable;
                if (i4 + 1 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length << 1];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i5 = this.nextHeaderIndex;
                this.nextHeaderIndex = i5 - 1;
                this.dynamicTable[i5] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[i + dynamicTableIndex(i) + iEvictToRecoverBytes] = header;
            }
            this.dynamicTableByteCount += i2;
        }

        private final int readByte() throws IOException {
            return _UtilCommonKt.and(this.source.ICustomTabsCallback(), 255);
        }

        public final int readInt(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = readByte();
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }

        public final TTBaseLandingPageActivity readByteString() throws IOException {
            int i = readByte();
            boolean z = (i & 128) == 128;
            long j = readInt(i, 127);
            if (z) {
                TTBaseActivity tTBaseActivity = new TTBaseActivity();
                Huffman.INSTANCE.decode(this.source, j, tTBaseActivity);
                return tTBaseActivity.writeTypedObject();
            }
            return this.source.onNavigationEvent(j);
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 123;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 43;
                    int windowTouchSlop = 1451 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte b = $$a[1];
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumFlingVelocity, scrollBarFadeDuration, windowTouchSlop, 228868077, false, $$c(b2, b2, b), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 49123);
                    int packedPositionChild = 43 - ExpandableListView.getPackedPositionChild(0L);
                    int i6 = 1495 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte b3 = (byte) ($$a[1] - 1);
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(fadingEdgeLength, packedPositionChild, i6, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23973 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 50 - Drawable.resolveOpacity(0, 0), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET) + 45849), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 29, TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i7 = $10 + 89;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i9 = $11 + 15;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final TTBaseActivity out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(int i, @NotNull TTBaseActivity tTBaseActivity) {
            this(i, false, tTBaseActivity, 2, null);
            Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(@NotNull TTBaseActivity tTBaseActivity) {
            this(0, false, tTBaseActivity, 3, null);
            Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        }

        public Writer(int i, boolean z, @NotNull TTBaseActivity tTBaseActivity) {
            Intrinsics.checkNotNullParameter(tTBaseActivity, "");
            this.headerTableSizeSetting = i;
            this.useCompression = z;
            this.out = tTBaseActivity;
            this.smallestHeaderTableSizeSetting = IntCompanionObject.MAX_VALUE;
            this.maxDynamicTableByteCount = i;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = 7;
        }

        public /* synthetic */ Writer(int i, boolean z, TTBaseActivity tTBaseActivity, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? Hpack.SETTINGS_HEADER_TABLE_SIZE : i, (i2 & 2) != 0 ? true : z, tTBaseActivity);
        }

        private final void clearDynamicTable() {
            ArraysKt___ArraysJvmKt.fill$default(this.dynamicTable, (Object) null, 0, 0, 6, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    Intrinsics.checkNotNull(header);
                    i -= header.hpackSize;
                    int i4 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    Intrinsics.checkNotNull(header2);
                    this.dynamicTableByteCount = i4 - header2.hpackSize;
                    this.headerCount--;
                    i3++;
                }
                Header[] headerArr = this.dynamicTable;
                int i5 = i2 + 1;
                System.arraycopy(headerArr, i5, headerArr, i5 + i3, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i6 = this.nextHeaderIndex + 1;
                Arrays.fill(headerArr2, i6, i6 + i3, (Object) null);
                this.nextHeaderIndex += i3;
            }
            return i3;
        }

        private final void insertIntoDynamicTable(Header header) {
            int i = header.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount;
            Header[] headerArr = this.dynamicTable;
            if (i3 + 1 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length << 1];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            this.dynamicTable[i4] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void writeHeaders(@NotNull List<Header> list) throws IOException {
            int length;
            int length2;
            Intrinsics.checkNotNullParameter(list, "");
            if (this.emitDynamicTableSizeUpdate) {
                int i = this.smallestHeaderTableSizeSetting;
                if (i < this.maxDynamicTableByteCount) {
                    writeInt(i, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = IntCompanionObject.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Header header = list.get(i2);
                TTBaseLandingPageActivity tTBaseLandingPageActivityIAuthTabCallbackStubProxy = header.name.IAuthTabCallbackStubProxy();
                TTBaseLandingPageActivity tTBaseLandingPageActivity = header.value;
                Hpack hpack = Hpack.INSTANCE;
                Integer num = hpack.getNAME_TO_FIRST_INDEX().get(tTBaseLandingPageActivityIAuthTabCallbackStubProxy);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = -1;
                    } else if (Intrinsics.areEqual(hpack.getSTATIC_HEADER_TABLE()[iIntValue].value, tTBaseLandingPageActivity)) {
                        length = length2;
                    } else if (Intrinsics.areEqual(hpack.getSTATIC_HEADER_TABLE()[length2].value, tTBaseLandingPageActivity)) {
                        length = iIntValue + 2;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length == -1) {
                    int i3 = this.nextHeaderIndex + 1;
                    int length3 = this.dynamicTable.length;
                    while (true) {
                        if (i3 >= length3) {
                            break;
                        }
                        Header header2 = this.dynamicTable[i3];
                        Intrinsics.checkNotNull(header2);
                        if (Intrinsics.areEqual(header2.name, tTBaseLandingPageActivityIAuthTabCallbackStubProxy)) {
                            Header header3 = this.dynamicTable[i3];
                            Intrinsics.checkNotNull(header3);
                            if (Intrinsics.areEqual(header3.value, tTBaseLandingPageActivity)) {
                                length = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i3 - this.nextHeaderIndex);
                                break;
                            } else if (length2 == -1) {
                                length2 = (i3 - this.nextHeaderIndex) + Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length;
                            }
                        }
                        i3++;
                    }
                }
                if (length != -1) {
                    writeInt(length, 127, 128);
                } else if (length2 == -1) {
                    this.out.onExtraCallbackWithResult(64);
                    writeByteString(tTBaseLandingPageActivityIAuthTabCallbackStubProxy);
                    writeByteString(tTBaseLandingPageActivity);
                    insertIntoDynamicTable(header);
                } else if (tTBaseLandingPageActivityIAuthTabCallbackStubProxy.onNavigationEvent(Header.PSEUDO_PREFIX) && !Intrinsics.areEqual(Header.TARGET_AUTHORITY, tTBaseLandingPageActivityIAuthTabCallbackStubProxy)) {
                    writeInt(length2, 15, 0);
                    writeByteString(tTBaseLandingPageActivity);
                } else {
                    writeInt(length2, 63, 64);
                    writeByteString(tTBaseLandingPageActivity);
                    insertIntoDynamicTable(header);
                }
            }
        }

        public final void writeInt(int i, int i2, int i3) {
            if (i < i2) {
                this.out.onExtraCallbackWithResult(i | i3);
                return;
            }
            this.out.onExtraCallbackWithResult(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.out.onExtraCallbackWithResult(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.out.onExtraCallbackWithResult(i4);
        }

        public final void writeByteString(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) throws IOException {
            Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(tTBaseLandingPageActivity) < tTBaseLandingPageActivity.access100()) {
                    TTBaseActivity tTBaseActivity = new TTBaseActivity();
                    huffman.encode(tTBaseLandingPageActivity, tTBaseActivity);
                    TTBaseLandingPageActivity tTBaseLandingPageActivityWriteTypedObject = tTBaseActivity.writeTypedObject();
                    writeInt(tTBaseLandingPageActivityWriteTypedObject.access100(), 127, 128);
                    this.out.onExtraCallback(tTBaseLandingPageActivityWriteTypedObject);
                    return;
                }
            }
            writeInt(tTBaseLandingPageActivity.access100(), 127, 0);
            this.out.onExtraCallback(tTBaseLandingPageActivity);
        }

        public final void resizeHeaderTable(int i) {
            this.headerTableSizeSetting = i;
            int iMin = Math.min(i, 16384);
            int i2 = this.maxDynamicTableByteCount;
            if (i2 == iMin) {
                return;
            }
            if (iMin < i2) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            adjustDynamicTableByteCount();
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[PHI: r3
      0x0033: PHI (r3v4 byte) = (r3v3 byte), (r3v5 byte) binds: [B:10:0x0031, B:7:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TTBaseLandingPageActivity checkLowercase(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) throws IOException {
        byte bOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = asBinder + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        int iAccess100 = tTBaseLandingPageActivity.access100();
        for (int i4 = 0; i4 < iAccess100; i4++) {
            int i5 = IAuthTabCallbackStub + 43;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                bOnExtraCallbackWithResult = tTBaseLandingPageActivity.onExtraCallbackWithResult(i4);
                if (bOnExtraCallbackWithResult >= 0) {
                    int i6 = IAuthTabCallbackStub + 87;
                    asBinder = i6 % 128;
                    if (i6 % 2 == 0) {
                        if (bOnExtraCallbackWithResult < 3) {
                            throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + tTBaseLandingPageActivity.IAuthTabCallback_Parcel());
                        }
                    } else if (bOnExtraCallbackWithResult < 91) {
                        throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + tTBaseLandingPageActivity.IAuthTabCallback_Parcel());
                    }
                } else {
                    continue;
                }
            } else {
                bOnExtraCallbackWithResult = tTBaseLandingPageActivity.onExtraCallbackWithResult(i4);
                if (65 > bOnExtraCallbackWithResult) {
                    continue;
                }
            }
        }
        return tTBaseLandingPageActivity;
    }

    private final Map<TTBaseLandingPageActivity, Integer> nameToFirstIndex() {
        int i = 2 % 2;
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length, 1.0f);
        int length = headerArr.length;
        int i2 = asBinder + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (true) {
            Object obj = null;
            if (i4 >= length) {
                Map<TTBaseLandingPageActivity, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
                Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "");
                int i5 = asBinder + 1;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 == 0) {
                    return mapUnmodifiableMap;
                }
                obj.hashCode();
                throw null;
            }
            int i6 = IAuthTabCallbackStub + 125;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                Header[] headerArr2 = STATIC_HEADER_TABLE;
                if (!linkedHashMap.containsKey(headerArr2[i4].name)) {
                    linkedHashMap.put(headerArr2[i4].name, Integer.valueOf(i4));
                }
                i4++;
            } else {
                linkedHashMap.containsKey(STATIC_HEADER_TABLE[i4].name);
                throw null;
            }
        }
    }

    static void onExtraCallback() {
        onNavigationEvent = 7798559133331975163L;
        onExtraCallback = -1776194565;
        onExtraCallbackWithResult = (char) 3177;
    }
}
