package im.toss.tds.graphics.gl.blur;

import kotlin.enums.EnumEntries;
import o.access15300;
import o.parseDomain;
import o.setSupportsTlsExtensionsokhttp;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface RendererApi {
    public static final Companion Companion = Companion.IAuthTabCallback;

    void IAuthTabCallback();

    void IAuthTabCallback(int i, int i2, int i3, int i4);

    void IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    void IAuthTabCallback(@NotNull parseDomain parsedomain);

    void onExtraCallback();

    int onExtraCallbackWithResult();

    void onNavigationEvent();

    int onWarmupCompleted();

    void onWarmupCompleted(long j);

    void onWarmupCompleted(@NotNull setSupportsTlsExtensionsokhttp setsupportstlsextensionsokhttp, int i);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Api {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Api[] $VALUES;
        private static int IAuthTabCallback = 1;
        public static final Api None = new Api("None", 0);
        public static final Api OpenGL = new Api("OpenGL", 1);
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        private static final /* synthetic */ Api[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 113;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Api[] apiArr = {None, OpenGL};
            int i5 = i2 + 117;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return apiArr;
            }
            throw null;
        }

        public static EnumEntries<Api> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return $ENTRIES;
            }
            throw null;
        }

        public static Api valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Api api = (Api) Enum.valueOf(Api.class, str);
            int i4 = onWarmupCompleted + 95;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return api;
            }
            throw null;
        }

        public static Api[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Api[] apiArr = (Api[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 107;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return apiArr;
        }

        static {
            Api[] apiArr$values = $values();
            $VALUES = apiArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(apiArr$values);
            int i = onExtraCallback + 91;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        private Api(String str, int i) {
        }
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        static final /* synthetic */ Companion IAuthTabCallback = new Companion();
        private static final Api onExtraCallbackWithResult = Api.OpenGL;

        private Companion() {
        }

        static {
            int i = onWarmupCompleted + 63;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
