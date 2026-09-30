package o;

import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onAppOpenAdLoaded {
    private static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int onNavigationEvent = 1;
    private final int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final LinkedHashMap<Integer, String> onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 7;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public onAppOpenAdLoaded() {
        int i = 0;
        this(i, i, 3, null);
    }

    public onAppOpenAdLoaded(int i, int i2) {
        this.onExtraCallback = i;
        this.onExtraCallbackWithResult = i2;
        this.onWarmupCompleted = new LinkedHashMap<>();
        if (i > i2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i3 = asBinder + 123;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ onAppOpenAdLoaded(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 1) != 0) {
            int i4 = 2 % 2;
            i = 8082;
        }
        if ((i3 & 2) != 0) {
            int i5 = IAuthTabCallbackStub;
            int i6 = i5 + 39;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 5;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            i2 = 8091;
        }
        this(i, i2);
    }

    public final boolean onNavigationEvent(@NotNull String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            if (StringsKt.isBlank(str)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (this.onWarmupCompleted.values().contains(str)) {
                return true;
            }
            int size = this.onExtraCallback + this.onWarmupCompleted.size();
            if (size > this.onExtraCallbackWithResult) {
                return false;
            }
            this.onWarmupCompleted.put(Integer.valueOf(size), str);
            return true;
        }
    }

    public final String IAuthTabCallback(@NotNull String str) {
        String str2;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            onNavigationEvent(str);
            Set<Map.Entry<Integer, String>> setEntrySet = this.onWarmupCompleted.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
            for (Object obj : setEntrySet) {
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNull(entry);
                Object value = entry.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (Intrinsics.areEqual((String) value, str)) {
                    Object key = ((Map.Entry) obj).getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "");
                    str2 = "http://localhost:" + ((Number) key).intValue() + "/index.bundle?platform=android&dev=true&minify=false";
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return str2;
    }

    public final String onWarmupCompleted(@NotNull String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "");
        URI uriOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        if (uriOnExtraCallbackWithResult == null) {
            if (StringsKt.isBlank(str)) {
                throw new IllegalArgumentException("Portal service bundle request is blank");
            }
            return str;
        }
        int port = uriOnExtraCallbackWithResult.getPort();
        synchronized (this) {
            str2 = this.onWarmupCompleted.get(Integer.valueOf(port));
        }
        if (str2 != null) {
            return str2;
        }
        throw new IllegalStateException("No Portal service is registered for development bundle port " + port);
    }

    public final List<String> onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        URI uriOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        if (uriOnExtraCallbackWithResult == null) {
            throw new IllegalArgumentException("Portal development bundle request must be an HTTP URL");
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(str);
        int i4 = this.onExtraCallback;
        int i5 = this.onExtraCallbackWithResult;
        if (i4 <= i5) {
            while (true) {
                if (i4 != uriOnExtraCallbackWithResult.getPort()) {
                    String string = IAuthTabCallback(uriOnExtraCallbackWithResult, i4).toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    listCreateListBuilder.add(string);
                }
                if (i4 == i5) {
                    break;
                }
                int i6 = IAuthTabCallbackStub + 21;
                asBinder = i6 % 128;
                i4 = i6 % 2 != 0 ? i4 + 39 : i4 + 1;
            }
        }
        List<String> listBuild = CollectionsKt.build(listCreateListBuilder);
        int i7 = IAuthTabCallbackStub + 107;
        asBinder = i7 % 128;
        if (i7 % 2 == 0) {
            return listBuild;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult(@NotNull byte[] bArr, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = new String(bArr, 0, Math.min(bArr.length, 65536), Charsets.UTF_8);
        String strIAuthTabCallback = Regex.Companion.IAuthTabCallback(str);
        Regex regex = new Regex("global\\.__toss\\.services\\.push\\(\\s*[\"']" + strIAuthTabCallback + "[\"']\\s*\\)");
        Regex regex2 = new Regex("global\\.__granite\\.app\\s*=\\s*\\{\\s*name\\s*:\\s*[\"']" + strIAuthTabCallback + "[\"']");
        if ((!regex.onExtraCallback(str2)) && (!regex2.onExtraCallback(str2))) {
            int i2 = IAuthTabCallbackStub + 71;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = asBinder + 69;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private final URI onExtraCallbackWithResult(String str) {
        Object obj;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(new URI(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i2 = asBinder + 53;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            obj = null;
        }
        URI uri = (URI) obj;
        if (uri == null) {
            int i4 = IAuthTabCallbackStub + 53;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        if (!Intrinsics.areEqual(uri.getScheme(), "http")) {
            int i6 = asBinder + 69;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 40 / 0;
                if (!Intrinsics.areEqual(uri.getScheme(), "https")) {
                    return null;
                }
            } else if (!Intrinsics.areEqual(uri.getScheme(), "https")) {
                return null;
            }
        }
        if (uri.getHost() == null) {
            return null;
        }
        int i8 = IAuthTabCallbackStub + 43;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
        if (uri.getPort() < 0) {
            return null;
        }
        int i10 = IAuthTabCallbackStub;
        int i11 = i10 + 13;
        asBinder = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 67;
        asBinder = i13 % 128;
        int i14 = i13 % 2;
        return uri;
    }

    private final URI IAuthTabCallback(URI uri, int i) {
        int i2 = 2 % 2;
        URI uri2 = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), i, uri.getPath(), uri.getQuery(), uri.getFragment());
        int i3 = asBinder + 85;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 4 / 0;
        }
        return uri2;
    }

    static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}
