package o;

import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.TTFullScreenVideoActivity3;
import o.TTHistoryLandingPageActivity13;
import o.TTHistoryLandingPageActivity2;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.FileSystem;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTHistoryLandingPageActivity13 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onExtraCallback(TTHistoryLandingPageActivity2 tTHistoryLandingPageActivity2) {
        Intrinsics.checkNotNullParameter(tTHistoryLandingPageActivity2, "");
        return true;
    }

    public static /* synthetic */ TTHistoryActivity71 onWarmupCompleted(TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, FileSystem fileSystem, Function1 function1, int i, Object obj) throws IOException {
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: okio.internal.ZipFilesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(TTHistoryLandingPageActivity13.onExtraCallback((TTHistoryLandingPageActivity2) obj2));
                }
            };
        }
        return IAuthTabCallback(tTFullScreenVideoActivity3, fileSystem, function1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        r11.close();
        r7 = r7 - 20;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        if (r7 <= r9) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        r7 = o.TTCeilingLandingPageActivity5.onExtraCallback(r4.onExtraCallback(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (r7.onActivityLayout() != 117853008) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        r0 = r7.onActivityLayout();
        r12 = r7.onMinimized();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        if (r7.onActivityLayout() != 1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (r0 != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        r8 = o.TTCeilingLandingPageActivity5.onExtraCallback(r4.onExtraCallback(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        r0 = r8.onActivityLayout();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if (r0 != 101075792) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        r5 = onExtraCallback(r8, r5);
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        if (r8 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00be, code lost:
    
        throw new java.io.IOException("bad zip: expected " + onWarmupCompleted(101075792) + " but was " + onWarmupCompleted(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c0, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
    
        if (r8 != null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        r8.close();
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        o.setExecute.onNavigationEvent(r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cd, code lost:
    
        if (r9 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d0, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d8, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d9, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00db, code lost:
    
        if (r7 != null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dd, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e2, code lost:
    
        r8 = r5;
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e5, code lost:
    
        r8 = r5;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        r8 = r5;
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00eb, code lost:
    
        if (r7 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ed, code lost:
    
        r7.close();
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f4, code lost:
    
        o.setExecute.onNavigationEvent(r5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f7, code lost:
    
        if (r5 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f9, code lost:
    
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fb, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fc, code lost:
    
        r7 = new java.util.ArrayList();
        r8 = o.TTCeilingLandingPageActivity5.onExtraCallback(r4.onExtraCallback(r5.onNavigationEvent()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010d, code lost:
    
        r9 = r5.onWarmupCompleted();
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0117, code lost:
    
        r0 = onWarmupCompleted(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0125, code lost:
    
        if (r0.asBinder() < r5.onNavigationEvent()) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0131, code lost:
    
        if (r21.invoke(r0).booleanValue() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0133, code lost:
    
        r7.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0136, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0141, code lost:
    
        throw new java.io.IOException("bad zip: local file header offset >= central directory offset");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0142, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0144, code lost:
    
        if (r8 != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0146, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014b, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014e, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014f, code lost:
    
        if (r8 != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0151, code lost:
    
        r8.close();
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0157, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0158, code lost:
    
        o.setExecute.onNavigationEvent(r11, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015b, code lost:
    
        if (r11 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015d, code lost:
    
        r3 = new o.TTHistoryActivity71(r19, r20, onNavigationEvent(r7), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0166, code lost:
    
        if (r4 != null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0168, code lost:
    
        r4.close();
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x016d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x016e, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        r5 = onNavigationEvent(r11);
        r6 = r11.IAuthTabCallback(r5.onExtraCallback());
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fb A[Catch: all -> 0x01a5, TryCatch #4 {all -> 0x01a5, blocks: (B:3:0x0015, B:5:0x0023, B:6:0x002b, B:10:0x0049, B:12:0x0054, B:58:0x00fb, B:55:0x00f4, B:59:0x00fc, B:85:0x015d, B:89:0x016e, B:83:0x0158, B:90:0x016f, B:93:0x017d, B:94:0x0184, B:96:0x0186, B:97:0x0189, B:98:0x018a, B:99:0x01a4, B:52:0x00ed, B:7:0x0033, B:9:0x003c, B:80:0x0151, B:13:0x005c, B:15:0x0065, B:18:0x0076, B:39:0x00d0, B:36:0x00ca, B:40:0x00d1, B:41:0x00d8, B:42:0x00d9, B:60:0x010d, B:63:0x0117, B:65:0x0127, B:67:0x0133, B:68:0x0136, B:69:0x013a, B:70:0x0141, B:71:0x0142), top: B:117:0x0015, inners: #1, #3, #5, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0117 A[Catch: all -> 0x014d, TryCatch #10 {all -> 0x014d, blocks: (B:60:0x010d, B:63:0x0117, B:65:0x0127, B:67:0x0133, B:68:0x0136, B:69:0x013a, B:70:0x0141, B:71:0x0142), top: B:127:0x010d, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015d A[Catch: all -> 0x01a5, TRY_LEAVE, TryCatch #4 {all -> 0x01a5, blocks: (B:3:0x0015, B:5:0x0023, B:6:0x002b, B:10:0x0049, B:12:0x0054, B:58:0x00fb, B:55:0x00f4, B:59:0x00fc, B:85:0x015d, B:89:0x016e, B:83:0x0158, B:90:0x016f, B:93:0x017d, B:94:0x0184, B:96:0x0186, B:97:0x0189, B:98:0x018a, B:99:0x01a4, B:52:0x00ed, B:7:0x0033, B:9:0x003c, B:80:0x0151, B:13:0x005c, B:15:0x0065, B:18:0x0076, B:39:0x00d0, B:36:0x00ca, B:40:0x00d1, B:41:0x00d8, B:42:0x00d9, B:60:0x010d, B:63:0x0117, B:65:0x0127, B:67:0x0133, B:68:0x0136, B:69:0x013a, B:70:0x0141, B:71:0x0142), top: B:117:0x0015, inners: #1, #3, #5, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016e A[Catch: all -> 0x01a5, TRY_ENTER, TryCatch #4 {all -> 0x01a5, blocks: (B:3:0x0015, B:5:0x0023, B:6:0x002b, B:10:0x0049, B:12:0x0054, B:58:0x00fb, B:55:0x00f4, B:59:0x00fc, B:85:0x015d, B:89:0x016e, B:83:0x0158, B:90:0x016f, B:93:0x017d, B:94:0x0184, B:96:0x0186, B:97:0x0189, B:98:0x018a, B:99:0x01a4, B:52:0x00ed, B:7:0x0033, B:9:0x003c, B:80:0x0151, B:13:0x005c, B:15:0x0065, B:18:0x0076, B:39:0x00d0, B:36:0x00ca, B:40:0x00d1, B:41:0x00d8, B:42:0x00d9, B:60:0x010d, B:63:0x0117, B:65:0x0127, B:67:0x0133, B:68:0x0136, B:69:0x013a, B:70:0x0141, B:71:0x0142), top: B:117:0x0015, inners: #1, #3, #5, #6, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final TTHistoryActivity71 IAuthTabCallback(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull FileSystem fileSystem, @NotNull Function1<? super TTHistoryLandingPageActivity2, Boolean> function1) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(fileSystem, "");
        Intrinsics.checkNotNullParameter(function1, "");
        TTBaseVideoActivity3 tTBaseVideoActivity3OpenReadOnly = fileSystem.openReadOnly(tTFullScreenVideoActivity3);
        try {
            long jOnWarmupCompleted = tTBaseVideoActivity3OpenReadOnly.onWarmupCompleted();
            long j = jOnWarmupCompleted - 22;
            long j2 = 0;
            if (j < 0) {
                throw new IOException("not a zip: size=" + tTBaseVideoActivity3OpenReadOnly.onWarmupCompleted());
            }
            long jMax = Math.max(jOnWarmupCompleted - 65558, 0L);
            while (true) {
                TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(tTBaseVideoActivity3OpenReadOnly.onExtraCallback(j));
                try {
                    if (tTAppOpenAdTransActivityOnExtraCallback.onActivityLayout() == 101010256) {
                        break;
                    }
                    tTAppOpenAdTransActivityOnExtraCallback.close();
                    j--;
                    if (j < jMax) {
                        throw new IOException("not a zip: end of central directory signature not found");
                    }
                    j2 = 0;
                } catch (Throwable th) {
                    tTAppOpenAdTransActivityOnExtraCallback.close();
                    throw th;
                }
            }
        } finally {
        }
    }

    public static final class onExtraCallbackWithResult<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getFaultAddress.onExtraCallbackWithResult(((TTHistoryLandingPageActivity2) t).onWarmupCompleted(), ((TTHistoryLandingPageActivity2) t2).onWarmupCompleted());
        }
    }

    private static final Map<TTFullScreenVideoActivity3, TTHistoryLandingPageActivity2> onNavigationEvent(List<TTHistoryLandingPageActivity2> list) {
        TTFullScreenVideoActivity3 tTFullScreenVideoActivity3IAuthTabCallback = TTFullScreenVideoActivity3.onExtraCallback.IAuthTabCallback(TTFullScreenVideoActivity3.Companion, "/", false, 1, null);
        Map<TTFullScreenVideoActivity3, TTHistoryLandingPageActivity2> mapIAuthTabCallbackStubProxy = access8000.IAuthTabCallbackStubProxy(getWrite.IAuthTabCallback(tTFullScreenVideoActivity3IAuthTabCallback, new TTHistoryLandingPageActivity2(tTFullScreenVideoActivity3IAuthTabCallback, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        Iterator it = CollectionsKt___CollectionsKt.sortedWith(list, new onExtraCallbackWithResult()).iterator();
        while (it.hasNext()) {
            TTHistoryLandingPageActivity2 tTHistoryLandingPageActivity2 = (TTHistoryLandingPageActivity2) it.next();
            if (mapIAuthTabCallbackStubProxy.put(tTHistoryLandingPageActivity2.onWarmupCompleted(), tTHistoryLandingPageActivity2) == null) {
                while (true) {
                    TTFullScreenVideoActivity3 tTFullScreenVideoActivity3IAuthTabCallbackStub = tTHistoryLandingPageActivity2.onWarmupCompleted().IAuthTabCallbackStub();
                    if (tTFullScreenVideoActivity3IAuthTabCallbackStub == null) {
                        break;
                    }
                    TTHistoryLandingPageActivity2 tTHistoryLandingPageActivity22 = mapIAuthTabCallbackStubProxy.get(tTFullScreenVideoActivity3IAuthTabCallbackStub);
                    if (tTHistoryLandingPageActivity22 != null) {
                        tTHistoryLandingPageActivity22.onNavigationEvent().add(tTHistoryLandingPageActivity2.onWarmupCompleted());
                        break;
                    }
                    TTHistoryLandingPageActivity2 tTHistoryLandingPageActivity23 = new TTHistoryLandingPageActivity2(tTFullScreenVideoActivity3IAuthTabCallbackStub, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                    mapIAuthTabCallbackStubProxy.put(tTFullScreenVideoActivity3IAuthTabCallbackStub, tTHistoryLandingPageActivity23);
                    tTHistoryLandingPageActivity23.onNavigationEvent().add(tTHistoryLandingPageActivity2.onWarmupCompleted());
                    tTHistoryLandingPageActivity2 = tTHistoryLandingPageActivity23;
                    it = it;
                }
            }
        }
        return mapIAuthTabCallbackStubProxy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final TTHistoryLandingPageActivity2 onWarmupCompleted(@NotNull final TTAppOpenAdTransActivity tTAppOpenAdTransActivity) throws IOException {
        short s;
        long j;
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        int iOnActivityLayout = tTAppOpenAdTransActivity.onActivityLayout();
        if (iOnActivityLayout != 33639248) {
            throw new IOException("bad zip: expected " + onWarmupCompleted(33639248) + " but was " + onWarmupCompleted(iOnActivityLayout));
        }
        tTAppOpenAdTransActivity.IAuthTabCallbackDefault(4L);
        short sICustomTabsCallbackStubProxy = tTAppOpenAdTransActivity.ICustomTabsCallbackStubProxy();
        if ((sICustomTabsCallbackStubProxy & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + onWarmupCompleted(sICustomTabsCallbackStubProxy & 65535));
        }
        short sICustomTabsCallbackStubProxy2 = tTAppOpenAdTransActivity.ICustomTabsCallbackStubProxy();
        short sICustomTabsCallbackStubProxy3 = tTAppOpenAdTransActivity.ICustomTabsCallbackStubProxy();
        short sICustomTabsCallbackStubProxy4 = tTAppOpenAdTransActivity.ICustomTabsCallbackStubProxy();
        long jOnActivityLayout = tTAppOpenAdTransActivity.onActivityLayout();
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = tTAppOpenAdTransActivity.onActivityLayout() & 4294967295L;
        final Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = tTAppOpenAdTransActivity.onActivityLayout() & 4294967295L;
        short sICustomTabsCallbackStubProxy5 = tTAppOpenAdTransActivity.ICustomTabsCallbackStubProxy();
        short sICustomTabsCallbackStubProxy6 = tTAppOpenAdTransActivity.ICustomTabsCallbackStubProxy();
        short sICustomTabsCallbackStubProxy7 = tTAppOpenAdTransActivity.ICustomTabsCallbackStubProxy();
        tTAppOpenAdTransActivity.IAuthTabCallbackDefault(8L);
        final Ref.LongRef longRef3 = new Ref.LongRef();
        longRef3.element = tTAppOpenAdTransActivity.onActivityLayout() & 4294967295L;
        String strIAuthTabCallback = tTAppOpenAdTransActivity.IAuthTabCallback(sICustomTabsCallbackStubProxy5 & 65535);
        if (StringsKt__StringsKt.contains$default((CharSequence) strIAuthTabCallback, (char) 0, false, 2, (Object) null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        if (longRef2.element == 4294967295L) {
            j = 8;
            s = sICustomTabsCallbackStubProxy2;
        } else {
            s = sICustomTabsCallbackStubProxy2;
            j = 0;
        }
        if (longRef.element == 4294967295L) {
            j += 8;
        }
        if (longRef3.element == 4294967295L) {
            j += 8;
        }
        final long j2 = j;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        onNavigationEvent(tTAppOpenAdTransActivity, sICustomTabsCallbackStubProxy6 & 65535, new Function2() { // from class: okio.internal.ZipFilesKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TTHistoryLandingPageActivity13.onExtraCallback(booleanRef, j2, longRef2, tTAppOpenAdTransActivity, longRef, longRef3, objectRef, objectRef2, objectRef3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
        });
        if (j2 > 0 && !booleanRef.element) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        return new TTHistoryLandingPageActivity2(TTFullScreenVideoActivity3.onExtraCallback.IAuthTabCallback(TTFullScreenVideoActivity3.Companion, "/", false, 1, null).onWarmupCompleted(strIAuthTabCallback), StringsKt__StringsJVMKt.endsWith$default(strIAuthTabCallback, "/", false, 2, null), tTAppOpenAdTransActivity.IAuthTabCallback(sICustomTabsCallbackStubProxy7 & 65535), jOnActivityLayout & 4294967295L, longRef.element, longRef2.element, s & 65535, longRef3.element, sICustomTabsCallbackStubProxy4 & 65535, sICustomTabsCallbackStubProxy3 & 65535, (Long) objectRef.element, (Long) objectRef2.element, (Long) objectRef3.element, null, null, null, 57344, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(Ref.BooleanRef booleanRef, long j, Ref.LongRef longRef, final TTAppOpenAdTransActivity tTAppOpenAdTransActivity, Ref.LongRef longRef2, Ref.LongRef longRef3, final Ref.ObjectRef objectRef, final Ref.ObjectRef objectRef2, final Ref.ObjectRef objectRef3, int i, long j2) throws IOException {
        if (i != 1) {
            if (i == 10) {
                if (j2 < 4) {
                    throw new IOException("bad zip: NTFS extra too short");
                }
                tTAppOpenAdTransActivity.IAuthTabCallbackDefault(4L);
                onNavigationEvent(tTAppOpenAdTransActivity, (int) (j2 - 4), new Function2() { // from class: okio.internal.ZipFilesKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TTHistoryLandingPageActivity13.onExtraCallback(objectRef, tTAppOpenAdTransActivity, objectRef2, objectRef3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                    }
                });
            }
        } else {
            if (booleanRef.element) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            booleanRef.element = true;
            if (j2 < j) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            long jOnMinimized = longRef.element;
            if (jOnMinimized == 4294967295L) {
                jOnMinimized = tTAppOpenAdTransActivity.onMinimized();
            }
            longRef.element = jOnMinimized;
            longRef2.element = longRef2.element == 4294967295L ? tTAppOpenAdTransActivity.onMinimized() : 0L;
            longRef3.element = longRef3.element == 4294967295L ? tTAppOpenAdTransActivity.onMinimized() : 0L;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Long] */
    public static final Unit onExtraCallback(Ref.ObjectRef objectRef, TTAppOpenAdTransActivity tTAppOpenAdTransActivity, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, int i, long j) throws IOException {
        if (i == 1) {
            if (objectRef.element != 0) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
            }
            if (j != 24) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
            }
            objectRef.element = Long.valueOf(tTAppOpenAdTransActivity.onMinimized());
            objectRef2.element = Long.valueOf(tTAppOpenAdTransActivity.onMinimized());
            objectRef3.element = Long.valueOf(tTAppOpenAdTransActivity.onMinimized());
        }
        return Unit.INSTANCE;
    }

    private static final TTHistoryLandingPageActivity14 onNavigationEvent(TTAppOpenAdTransActivity tTAppOpenAdTransActivity) throws IOException {
        short sICustomTabsCallbackStubProxy = tTAppOpenAdTransActivity.ICustomTabsCallbackStubProxy();
        short sICustomTabsCallbackStubProxy2 = tTAppOpenAdTransActivity.ICustomTabsCallbackStubProxy();
        long jICustomTabsCallbackStubProxy = tTAppOpenAdTransActivity.ICustomTabsCallbackStubProxy() & 65535;
        if (jICustomTabsCallbackStubProxy != (tTAppOpenAdTransActivity.ICustomTabsCallbackStubProxy() & 65535) || (sICustomTabsCallbackStubProxy & 65535) != 0 || (sICustomTabsCallbackStubProxy2 & 65535) != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        tTAppOpenAdTransActivity.IAuthTabCallbackDefault(4L);
        return new TTHistoryLandingPageActivity14(jICustomTabsCallbackStubProxy, 4294967295L & tTAppOpenAdTransActivity.onActivityLayout(), tTAppOpenAdTransActivity.ICustomTabsCallbackStubProxy() & 65535);
    }

    private static final TTHistoryLandingPageActivity14 onExtraCallback(TTAppOpenAdTransActivity tTAppOpenAdTransActivity, TTHistoryLandingPageActivity14 tTHistoryLandingPageActivity14) throws IOException {
        tTAppOpenAdTransActivity.IAuthTabCallbackDefault(12L);
        int iOnActivityLayout = tTAppOpenAdTransActivity.onActivityLayout();
        int iOnActivityLayout2 = tTAppOpenAdTransActivity.onActivityLayout();
        long jOnMinimized = tTAppOpenAdTransActivity.onMinimized();
        if (jOnMinimized != tTAppOpenAdTransActivity.onMinimized() || iOnActivityLayout != 0 || iOnActivityLayout2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        tTAppOpenAdTransActivity.IAuthTabCallbackDefault(8L);
        return new TTHistoryLandingPageActivity14(jOnMinimized, tTAppOpenAdTransActivity.onMinimized(), tTHistoryLandingPageActivity14.onExtraCallback());
    }

    private static final void onNavigationEvent(TTAppOpenAdTransActivity tTAppOpenAdTransActivity, int i, Function2<? super Integer, ? super Long, Unit> function2) throws IOException {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iICustomTabsCallbackStubProxy = tTAppOpenAdTransActivity.ICustomTabsCallbackStubProxy() & 65535;
            long jICustomTabsCallbackStubProxy = tTAppOpenAdTransActivity.ICustomTabsCallbackStubProxy() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j2 = j - 4;
            if (j2 < jICustomTabsCallbackStubProxy) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            tTAppOpenAdTransActivity.IAuthTabCallbackStub(jICustomTabsCallbackStubProxy);
            long jICustomTabsCallbackDefault = tTAppOpenAdTransActivity.access100().ICustomTabsCallbackDefault();
            function2.invoke(Integer.valueOf(iICustomTabsCallbackStubProxy), Long.valueOf(jICustomTabsCallbackStubProxy));
            long jICustomTabsCallbackDefault2 = (tTAppOpenAdTransActivity.access100().ICustomTabsCallbackDefault() + jICustomTabsCallbackStubProxy) - jICustomTabsCallbackDefault;
            if (jICustomTabsCallbackDefault2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + iICustomTabsCallbackStubProxy);
            }
            if (jICustomTabsCallbackDefault2 > 0) {
                tTAppOpenAdTransActivity.access100().IAuthTabCallbackDefault(jICustomTabsCallbackDefault2);
            }
            j = j2 - jICustomTabsCallbackStubProxy;
        }
    }

    public static final void onExtraCallback(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity) throws IOException {
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        onNavigationEvent(tTAppOpenAdTransActivity, (TTHistoryLandingPageActivity2) null);
    }

    public static final TTHistoryLandingPageActivity2 onWarmupCompleted(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity, @NotNull TTHistoryLandingPageActivity2 tTHistoryLandingPageActivity2) throws IOException {
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        Intrinsics.checkNotNullParameter(tTHistoryLandingPageActivity2, "");
        TTHistoryLandingPageActivity2 tTHistoryLandingPageActivity2OnNavigationEvent = onNavigationEvent(tTAppOpenAdTransActivity, tTHistoryLandingPageActivity2);
        Intrinsics.checkNotNull(tTHistoryLandingPageActivity2OnNavigationEvent);
        return tTHistoryLandingPageActivity2OnNavigationEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final TTHistoryLandingPageActivity2 onNavigationEvent(final TTAppOpenAdTransActivity tTAppOpenAdTransActivity, TTHistoryLandingPageActivity2 tTHistoryLandingPageActivity2) throws IOException {
        int iOnActivityLayout = tTAppOpenAdTransActivity.onActivityLayout();
        if (iOnActivityLayout != 67324752) {
            throw new IOException("bad zip: expected " + onWarmupCompleted(67324752) + " but was " + onWarmupCompleted(iOnActivityLayout));
        }
        tTAppOpenAdTransActivity.IAuthTabCallbackDefault(2L);
        short sICustomTabsCallbackStubProxy = tTAppOpenAdTransActivity.ICustomTabsCallbackStubProxy();
        if ((sICustomTabsCallbackStubProxy & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + onWarmupCompleted(sICustomTabsCallbackStubProxy & 65535));
        }
        tTAppOpenAdTransActivity.IAuthTabCallbackDefault(18L);
        long jICustomTabsCallbackStubProxy = tTAppOpenAdTransActivity.ICustomTabsCallbackStubProxy();
        int iICustomTabsCallbackStubProxy = 65535 & tTAppOpenAdTransActivity.ICustomTabsCallbackStubProxy();
        tTAppOpenAdTransActivity.IAuthTabCallbackDefault(jICustomTabsCallbackStubProxy & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        if (tTHistoryLandingPageActivity2 == null) {
            tTAppOpenAdTransActivity.IAuthTabCallbackDefault(iICustomTabsCallbackStubProxy);
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        onNavigationEvent(tTAppOpenAdTransActivity, iICustomTabsCallbackStubProxy, new Function2() { // from class: okio.internal.ZipFilesKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TTHistoryLandingPageActivity13.IAuthTabCallback(tTAppOpenAdTransActivity, objectRef, objectRef2, objectRef3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
        });
        return tTHistoryLandingPageActivity2.onNavigationEvent((Integer) objectRef.element, (Integer) objectRef2.element, (Integer) objectRef3.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v6, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, java.lang.Integer] */
    public static final Unit IAuthTabCallback(TTAppOpenAdTransActivity tTAppOpenAdTransActivity, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, int i, long j) throws IOException {
        if (i == 21589) {
            if (j < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            byte bICustomTabsCallback = tTAppOpenAdTransActivity.ICustomTabsCallback();
            boolean z = (bICustomTabsCallback & 1) == 1;
            boolean z2 = (bICustomTabsCallback & 2) == 2;
            boolean z3 = (bICustomTabsCallback & 4) == 4;
            long j2 = z ? 5L : 1L;
            if (z2) {
                j2 += 4;
            }
            if (z3) {
                j2 += 4;
            }
            if (j < j2) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z) {
                objectRef.element = Integer.valueOf(tTAppOpenAdTransActivity.onActivityLayout());
            }
            if (z2) {
                objectRef2.element = Integer.valueOf(tTAppOpenAdTransActivity.onActivityLayout());
            }
            if (z3) {
                objectRef3.element = Integer.valueOf(tTAppOpenAdTransActivity.onActivityLayout());
            }
        }
        return Unit.INSTANCE;
    }

    public static final long IAuthTabCallback(long j) {
        return (j / 10000) - 11644473600000L;
    }

    public static final Long onNavigationEvent(int i, int i2) {
        if (i2 == -1) {
            return null;
        }
        return Long.valueOf(TTHistoryLandingPageActivity8.onWarmupCompleted(((i >> 9) & 127) + 1980, (i >> 5) & 15, i & 31, (i2 >> 11) & 31, (i2 >> 5) & 63, (i2 & 31) << 1));
    }

    private static final String onWarmupCompleted(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        String string = Integer.toString(i, CharsKt__CharJVMKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "");
        sb.append(string);
        return sb.toString();
    }
}
